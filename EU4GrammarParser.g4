parser grammar EU4GrammarParser;
options 
    { 
        tokenVocab = EU4Grammar; 
    }

file
    : advisor*
    | age*
    | ai_personality*
    | ancestor_personality*
    | bookmark*
    | building*
    ;

//blocks
block: LPAR (statement | if_statement)* RPAR ;
statement: (effect | block) ;
trigger_block: TRIGGER EQUALS LPAR trigger* RPAR;
effect_block: EFFECT EQUALS LPAR effect* RPAR;
modifier_block: MODIFIER EQUALS LPAR modifier* RPAR;
chance_block: CHANCE EQUALS LPAR factor* chance_modifier* RPAR;
ai_will_do_block: AI_WILL_DO EQUALS LPAR factor chance_modifier* RPAR;
allow: ALLOW EQUALS LPAR trigger* RPAR;


//base tokens
value: YES | NO | TAG | SCOPE | FLOAT | STRING | IDENTIFIER | INT;
amount: AMOUNT EQUALS INT;
name: NAME EQUALS STRING;
date: DATE_KEY EQUALS DATE;
bool: YES | NO;

//if & else & conditions
limit: LIMIT EQUALS LPAR trigger* RPAR;
eLSE: ELSE EQUALS LPAR effect* RPAR;
else_if: ELSE_IF EQUALS LPAR limit effect* RPAR;
if_statement: IF EQUALS LPAR limit effect* RPAR (eLSE | else_if)*;

//effects & modifier
scriptedEffect: IDENTIFIER EQUALS ((LPAR statement* RPAR) | YES);
modifier: (MODIFIER_NAME | IDENTIFIER) EQUALS (YES | NO | TAG | SCOPE | FLOAT | STRING | IDENTIFIER | INT);
skill_scaled_modifier: SKILL_SACLED_MOD EQUALS LPAR trigger_block modifier_block RPAR;
effect
    : ((EFFECT_NAME | IDENTIFIER) EQUALS (YES | NO | TAG | SCOPE | FLOAT | STRING | IDENTIFIER | INT)) 
    | scriptedEffect 
    | if_statement 
    | scope
    | custom_tooltip
    | add_modifier
    ;      

//special effects:
add_modifier: (ADD_COUNTRY_MOD | ADD_PROVINCE_MOD) EQUALS LPAR NAME EQUALS (IDENTIFIER | STRING) DURATION EQUALS INT RPAR;

//ai stuff
factor: FACTOR EQUALS (INT | FLOAT);                                          
chance_modifier: MODIFIER EQUALS LPAR (factor | trigger)* RPAR;

//triggers
mana_trigger: MPOWER EQUALS INT;
trigger
    : ((TRIGGER_NAME | IDENTIFIER) EQUALS (YES | NO | TAG | SCOPE | FLOAT | STRING | IDENTIFIER | INT)) 
    | scripted_trigger 
    | custom_trigger_tooltip
    | calc_true_if
    | trigger_sub_block
    | ai_trigger
    | mana_trigger
    ;     

//complex triggers
calc_true_if: CALC_TRUE_IF EQUALS LPAR (amount | trigger)* RPAR;                                 
scripted_trigger: IDENTIFIER EQUALS LPAR trigger* RPAR;   
ai_trigger: AI EQUALS (YES | NO);
trigger_sub_block
    : ( 
    OR
    | AND
    | NOT
    | SCOPE
    ) EQUALS LPAR trigger* RPAR
    ;   

//scope
scope: SCOPE EQUALS LPAR (effect | trigger | scope )* RPAR;

//tooltips
tooltip: TOOLTIP EQUALS (STRING_TOOLTIP | IDENTIFIER);
custom_tooltip: CUSTOM_TOOLTIP EQUALS (STRING_TOOLTIP | IDENTIFIER);
custom_trigger_tooltip: CUSTOM_TRIGGER_TOOLTIP EQUALS LPAR tooltip* trigger* RPAR;
desc: DESC EQUALS (STRING_TOOLTIP | IDENTIFIER | STRING);

//Building | manufactory
buildings_trigger: (BUILD_TRIGGER | KEEP_TRIGGER) EQUALS LPAR trigger* RPAR;
buildings_effect: (ON_BUILT | ON_CONSTRUCTION_CANCELED | ON_CONSTRUCTION_STARTED | ON_DESTORYED | ON_OBSOLETE) EQUALS LPAR effect* RPAR;
manufactory_defines: (MANUFACTORY | BONUS_MANUFACTORY) EQUALS LPAR IDENTIFIER+ RPAR;
bonus_modifier: BONUS_MODIFIER EQUALS value;
cost: COST EQUALS INT;
time: TIME EQUALS INT;
onmap: ONMAP EQUALS bool;
show_seperate: SHOW_SEPERATE EQUALS bool;
building_attribute: (cost | time| onmap | show_seperate | influencing_fort | allowed_in_gold_province | make_obsolete);
allowed_in_gold_province: ALLOWED_IN_GOLD_PROVINCES EQUALS bool;
make_obsolete: MAKE_OBSOLETE EQUALS IDENTIFIER;
influencing_fort: INFLUENCING_FORT EQUALS bool;
building: IDENTIFIER EQUALS LPAR (manufactory_defines | building_attribute | buildings_effect | buildings_trigger | bonus_modifier | modifier_block | ai_will_do_block )* RPAR;

//Bookmark
bookmark: BOOKMARK EQUALS LPAR name desc date (CENTER EQUALS INT)* (DEFAULT EQUALS bool*) (COUNTRY EQUALS TAG)* (EASY_COUNTRY EQUALS TAG)* RPAR;

//Ancestor personalities
ancestor_personality: IDENTIFIER EQUALS LPAR ((RULER_ALLOW EQUALS LPAR allow* chance_block RPAR) | (HEIR_ALLOW EQUALS LPAR allow* chance_block RPAR) | (CONSORT_ALLOW EQUALS LPAR allow* chance_block RPAR) | allow | chance_block | war_priority | ai_pick_ancestor | modifier)*  RPAR;
war_priority: WAR_PRIORITY EQUALS LPAR chance_modifier RPAR;
ai_pick_ancestor: AI_PICK_ANCESTOR EQUALS LPAR factor chance_modifier RPAR;

//ai personality
ai_personality: IDENTIFIER EQUALS LPAR chance_block ICON EQUALS INT RPAR;

//ages
start: START EQUALS INT;
can_start_block: CAN_START EQUALS LPAR trigger* RPAR;
objective: IDENTIFIER EQUALS LPAR (allow | trigger)* RPAR; 
objectives_block: OBJECTIVES EQUALS LPAR objective* RPAR;
ability: IDENTIFIER EQUALS LPAR (allow | effect_block | modifier_block)* ai_will_do_block RPAR;
ability_block: ABILITIES EQUALS LPAR ability* RPAR;
age: IDENTIFIER EQUALS LPAR start can_start_block ((RELIGIOUS_CONFLICTS EQUALS (YES | NO))|(PAPACY EQUALS FLOAT))* objectives_block ability_block;

//advisors
advisor: IDENTIFIER EQUALS LPAR monarch_power_advisor (modifier | skill_scaled_modifier)* chance_block ai_will_do_block RPAR;
monarch_power_advisor: MONARCH_POWER EQUALS MPOWER;

// Missions by @Sol_InvictusXLII
// Note: this is a parser
// With missions, that can have a bunch of optional terms without a specific order, capturing duplicate terms is should be done while traversing the tree
// Ex, if the mission has 2 <trigger> blocks, it is grammatically valid but syntactically invalid :)

// -- Mission Series
missionSeries: IDENTIFIER EQUALS LPAR (slot_missionSeries | generic_missionSeries | ai_trigger | hasCountryShield_missionSeries | potentialOnLoad_missionSeries | potential_missionSeries | missionBlock)* RPAR;
slot_missionSeries: SLOT EQUALS INT;
generic_missionSeries: GENERIC EQUALS (YES | NO);
hasCountryShield_missionSeries: HAS_COUNTRY_SHIELD EQUALS (YES | NO);
potentialOnLoad_missionSeries: POTENTIAL_ON_LOAD EQUALS LPAR trigger* RPAR;
potential_missionSeries: POTENTIAL EQUALS LPAR trigger* RPAR;

// -- Mission Block
missionBlock: IDENTIFIER EQUALS LPAR (icon_mission | position_mission | completedBy_mission | requiredMissions_mission | provincesToHighlight_mission | trigger_block | effect_block | aiWeight_mission)* RPAR;
icon_mission: ICON EQUALS IDENTIFIER;
position_mission: POSITION EQUALS INT;
completedBy_mission: COMPLETED_BY EQUALS STRING;
requiredMissions_mission: REQUIRED_MISSIONS EQUALS LPAR IDENTIFIER* RPAR;
provincesToHighlight_mission: PROVINCES_TO_HIGHLIGHT EQUALS LPAR trigger* RPAR;
aiWeight_mission: AI_WEIGHT EQUALS LPAR factor RPAR;
