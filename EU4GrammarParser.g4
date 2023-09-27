parser grammar EU4GrammarParser;
options 
    { 
        tokenVocab = EU4Grammar; 
    }

// Uncategorized Mess :trollface:
//blocks
file
    : advisor*
    | age*
    ;
block: LPAR (statement | if_statement)* RPAR ;
statement: (effect | block) ;
trigger_block: TRIGGER EQUALS LPAR trigger* RPAR;
effect_block: EFFECT EQUALS LPAR effect* RPAR;
modifier_block: MODIFIER EQUALS LPAR modifier* RPAR;
chance_block: CHANCE EQUALS LPAR factor chance_modifier* RPAR;
ai_will_do_block: AI_WILL_DO EQUALS LPAR factor chance_modifier* RPAR;
allow: ALLOW EQUALS LPAR trigger* RPAR;

//base tokens
value: YES | NO | TAG | SCOPE | FLOAT | STRING | IDENTIFIER | INT;

//if & else & conditions
limit: LIMIT EQUALS LPAR trigger* RPAR;
eLSE: ELSE EQUALS LPAR effect* RPAR;
else_if: ELSE_IF LPAR EQUALS limit effect* RPAR;
if_statement: IF EQUALS LPAR limit effect* RPAR (eLSE | else_if)*;

//effects & modifier
scriptedEffect: IDENTIFIER EQUALS ((LPAR statement* RPAR) | YES);
effect: (EFFECT_NAME EQUALS (YES | NO | TAG | SCOPE | FLOAT | STRING | IDENTIFIER | INT)) | scriptedEffect | if_statement | scope;      
modifier: (MODIFIER_NAME | IDENTIFIER) EQUALS (YES | NO | TAG | SCOPE | FLOAT | STRING | IDENTIFIER | INT);
skill_scaled_modifier: SKILL_SACLED_MOD EQUALS LPAR trigger_block modifier_block RPAR;

//ai stuff
factor: FACTOR EQUALS (INT | FLOAT);                                          
chance_modifier: MODIFIER EQUALS LPAR factor trigger* RPAR;

//triggers
trigger
    : or_block 
    | and_block 
    | not_block
    | ((TRIGGER_NAME | IDENTIFIER) EQUALS (YES | NO | TAG | SCOPE | FLOAT | STRING | IDENTIFIER | INT)) 
    | scripted_trigger 
    | custom_trigger_tooltip
    | scope
    ;                                      
scripted_trigger: IDENTIFIER EQUALS LPAR trigger* RPAR;      

//scope
scope: SCOPE EQUALS LPAR (effect | trigger | scope )* RPAR;


//complex triggers
or_block: OR EQUALS LPAR trigger* RPAR;
and_block: AND EQUALS LPAR trigger* RPAR;
not_block: NOT EQUALS LPAR trigger* RPAR;

//tooltips
tooltip: TOOLTIP EQUALS STRING_TOOLTIP;
custom_tooltip: CUSTOM_TOOLTIP EQUALS STRING_TOOLTIP;
custom_trigger_tooltip: CUSTOM_TRIGGER_TOOLTIP EQUALS LPAR tooltip* trigger* RPAR;
desc: DESC EQUALS STRING_TOOLTIP;

//ages
start: START EQUALS INT;
can_start_block: CAN_START EQUALS LPAR trigger* RPAR;
objective: IDENTIFIER EQUALS LPAR allow custom_trigger_tooltip* RPAR; 
objectives_block: OBJECTIVES EQUALS LPAR objective* RPAR;
ability: IDENTIFIER EQUALS LPAR effect_block ai_will_do_block RPAR;
ability_block: ABILITIES LPAR ability* RPAR;
age: IDENTIFIER EQUALS LPAR start can_start_block ((RELIGIOUS_CONFLICTS EQUALS (YES | NO))|(PAPACY EQUALS FLOAT))* objectives_block ability_block;

//advisors
advisor: IDENTIFIER EQUALS LPAR monarch_power_advisor (modifier | skill_scaled_modifier)* chance_block ai_will_do_block RPAR;
monarch_power_advisor: MONARCH_POWER EQUALS MPOWER;

// Missions by @Sol_InvictusXLII
// Note: this is a parser
// With missions, that can have a bunch of optional terms without a specific order, capturing duplicate terms is should be done while traversing the tree
// Ex, if the mission has 2 <trigger> blocks, it is grammatically valid but syntactically invalid :)

// -- Mission Series
missionSeries: IDENTIFIER EQUALS LPAR (slot_missionSeries | generic_missionSeries | ai_missionSeries | hasCountryShield_missionSeries | potentialOnLoad_missionSeries | potential_missionSeries | missionBlock)* RPAR;
slot_missionSeries: SLOT EQUALS INT;
generic_missionSeries: GENERIC EQUALS (YES | NO);
ai_missionSeries: AI EQUALS (YES | NO);
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
