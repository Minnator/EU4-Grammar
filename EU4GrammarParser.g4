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
    | cb_type*
    | center_of_trade*
    | church_aspect*
    | colonial_region*
    | common_country*
    | country_color*
    | country_tags*
    | culture_group*
    | custom_country_color*
    | custom_idea_category*
    | decree*
    | defender_of_faith*
    | diplomatic_action*
    ;

//blocks
block: LPAR (statement | if_statement)* RPAR ;
statement: (effect | block) ;
trigger_block: TRIGGER LE trigger* RPAR;
potential_block: POTENTIAL LE trigger* RPAR;
effect_block: EFFECT LE effect* RPAR;
removed_effect_block: REMOVED_EFFECT LE effect* RPAR;
modifier_block: MODIFIER LE modifier* RPAR;
chance_block: CHANCE LE factor* chance_modifier* RPAR;
ai_will_do_block: AI_WILL_DO LE factor chance_modifier* RPAR;
allow: ALLOW LE trigger* RPAR;
name_block: (NAME | NAMES) LE ((NAME EQUALS STRING) | trigger_block)+ RPAR;
color_block: COLOR LE INT+ INT+ INT+ RPAR;
provinces_block: PROVINCES LE (INT+)* RPAR;
file_block: FILE EQUALS STRING;
size_block: SIZE LE X EQUALS INT Y EQUALS INT RPAR;
allow_block: ALLOW LE trigger* RPAR;

//ai stuff
factor: FACTOR EQUALS (INT | FLOAT);                                          
chance_modifier: MODIFIER LE (factor | trigger)* RPAR;

//base tokens
value: YES | NO | TAG | SCOPE | FLOAT | STRING | IDENTIFIER | INT;
amount: AMOUNT EQUALS INT;
name: NAME EQUALS STRING;
date: DATE_KEY EQUALS DATE;
bool: YES | NO;
months: MONTHS EQUALS INT;

//if & else & conditions
limit: LIMIT LE trigger* RPAR;
eLSE: ELSE LE effect* RPAR;
else_if: ELSE_IF LE limit effect* RPAR;
if_statement: IF LE limit effect* RPAR (eLSE | else_if)*; 
while: WHILE LE limit effect* RPAR;

//scope
scope: (SCOPE | TAG) LE (effect | trigger | scope | limit)* RPAR;

//effects & modifier
scriptedEffect: IDENTIFIER EQUALS ((LPAR statement* RPAR) | YES);
modifier: IDENTIFIER EQUALS (YES | NO | TAG | SCOPE | FLOAT | STRING | IDENTIFIER | INT);
skill_scaled_modifier: SKILL_SACLED_MOD LE trigger_block modifier_block RPAR;
effect
    : (IDENTIFIER EQUALS (YES | NO | TAG | SCOPE | FLOAT | STRING | IDENTIFIER | INT)) 
    | scriptedEffect 
    | if_statement 
    | scope
    | custom_tooltip
    | add_modifier
    | while
    | multiply_variable
    | subtrackt_variable
    | change_variable
    | set_variable
    | divide_variable
    | export_to_variable
    | hidden_effect
    | reverse_remove_opinion
    | remove_opinion
    | add_opinion
    | reverse_add_opinion
    | country_event
    ;      

//special effects:
reverse_remove_opinion: REVERSE_REMOVE_OPINION LE WHO EQUALS (SCOPE | TAG) MODIFIER EQUALS IDENTIFIER RPAR;
remove_opinion: REMOVE_OPINION LE WHO EQUALS (SCOPE | TAG) MODIFIER EQUALS IDENTIFIER RPAR;
add_opinion: ADD_OPINION LE WHO EQUALS (SCOPE | TAG) MODIFIER EQUALS IDENTIFIER RPAR;
reverse_add_opinion: REVERSE_ADD_OPINION LE WHO EQUALS (SCOPE | TAG) MODIFIER EQUALS IDENTIFIER RPAR;
hidden_effect: HIDDEN_EFFECT LE effect* RPAR;
add_modifier: (ADD_COUNTRY_MOD | ADD_PROVINCE_MOD) LE NAME EQUALS (IDENTIFIER | STRING) DURATION EQUALS INT RPAR;
multiply_variable: MULTIPLY_VARIABLE LE WHICH EQUALS IDENTIFIER ((WHICH EQUALS IDENTIFIER) | (VALUE EQUALS (FLOAT | INT))) RPAR;
subtrackt_variable: SUBTRACKT_VARIABLE LE WHICH EQUALS IDENTIFIER ((WHICH EQUALS IDENTIFIER) | (VALUE EQUALS (FLOAT | INT))) RPAR;
change_variable: CHANGE_VARIABLE LE WHICH EQUALS IDENTIFIER ((WHICH EQUALS IDENTIFIER) | (VALUE EQUALS (FLOAT | INT))) RPAR;
set_variable: SET_VARIABLE LE WHICH EQUALS IDENTIFIER ((WHICH EQUALS IDENTIFIER) | (VALUE EQUALS (FLOAT | INT))) RPAR;
divide_variable: DIVIDE_VARIABLE LE WHICH EQUALS IDENTIFIER ((WHICH EQUALS IDENTIFIER) | (VALUE EQUALS (FLOAT | INT))) RPAR;
export_to_variable: EXPORT_TO_VARIABLE LE WHICH EQUALS IDENTIFIER VALUE EQUALS IDENTIFIER (WHO EQUALS (TAG | SCOPE))? RPAR;
country_event: COUNTRY_EVENT LE ID EQUALS IDENTIFIER DOT (IDENTIFIER | INT) (DAYS EQUALS INT)? RPAR;

//triggers
mana_trigger: MPOWER EQUALS INT;
religion_trigger: RELIGION EQUALS (IDENTIFIER | SCOPE);
trigger
    : (IDENTIFIER EQUALS (YES | NO | TAG | SCOPE | FLOAT | STRING | IDENTIFIER | INT)) 
    | scripted_trigger 
    | custom_trigger_tooltip
    | calc_true_if
    | trigger_sub_block
    | ai_trigger
    | mana_trigger
    | trade_share
    | privateer_power
    | if_statement
    | check_variable
    | has_opinion_modifier
    | religion_trigger
    | num_of_owned_provinces_with
    | has_global_modifier_value
    | is_in_war
    | has_opinion
    | region_trigger
    ;     

//complex triggers
num_of_owned_provinces_with: NUM_OF_OWNED_PROVINCES_WITH LE ((VALUE EQUALS INT) | trigger)+ RPAR;
has_opinion_modifier: HAS_OPINION_MODIFIER LE ((WHO EQUALS (TAG | SCOPE)) | (VALUE EQUALS INT) | (MODIFIER EQUALS IDENTIFIER))* RPAR;
calc_true_if: CALC_TRUE_IF LE (amount | trigger)* RPAR;        
check_variable: CHECK_VARIABLE LE WHICH EQUALS IDENTIFIER ((WHICH EQUALS IDENTIFIER) | (VALUE EQUALS (FLOAT | INT))) RPAR;
trade_share: TRADE_SHARE LE COUNTRY EQUALS (TAG | SCOPE) SHARE EQUALS INT RPAR;  
privateer_power: PRIVATEER_POWER LE COUNTRY EQUALS (TAG | SCOPE) SHARE EQUALS INT RPAR; 
scripted_trigger: IDENTIFIER LE trigger* RPAR;   
prerequisites: PREREQUISITES LE trigger* RPAR;   
prerequisites_self: PREREQUISITES_SELF LE trigger* RPAR;   
ai_trigger: AI EQUALS (YES | NO);
is_triggered_only: IS_TIRGGERED_ONLY EQUALS (YES | NO);
region_trigger: REGION EQUALS IDENTIFIER;
has_global_modifier_value: Has_GLOBAL_MODIFIER_VALUE LE WHICH EQUALS IDENTIFIER VALUE EQUALS INT RPAR;
is_in_war: IS_IN_WAR LE is_in_war_options* RPAR;
is_in_war_options: (ATTACKER_LEADER EQUALS (SCOPE | IDENTIFIER)) | (DEFENDER_LEADER EQUALS (SCOPE | IDENTIFIER)) | (CASUS_BELLI EQUALS IDENTIFIER) | (DEFENDERS EQUALS TAG) | (ATTACKERS EQUALS TAG) | (PARTICIPANTS EQUALS TAG) | (WAR_SCORE EQUALS INT) | (START_DATE EQUALS DATE) | (DURATION EQUALS INT) | (WAR_GOAL_PROVINCE EQUALS INT);
has_opinion: HAS_OPINION LE ((WHO EQUALS (TAG | SCOPE)) | (VALUE EQUALS INT) | (MODIFIER EQUALS IDENTIFIER))* RPAR;

trigger_sub_block
    : ( 
    OR
    | AND
    | NOT
    | SCOPE
    | TAG
    ) LE trigger* RPAR
    ;   

//Diplomatic Action (Overwriting)
pre_effect: PRE_EFFECT LE effect* RPAR;
conditional_block: CONDITIONAL LE (potential_block | allow_block | tooltip | pre_effect)* RPAR;
diplomatic_action: IDENTIFIER LE (conditional_block | effect_block | pre_effect)* RPAR;

//Defender of faith
dof_defines: (LEVEL EQUALS INT) | (RANGE_FROM EQUALS INT) | (RANGE_TO EQUALS INT);
defender_of_faith: IDENTIFIER LE dof_defines+ (modifier_block | ai_will_do_block | (SAME_FAITH_MODIFIER LE modifier* RPAR))+ RPAR;

//Decrees
decree_blocks: (potential_block | trigger_block | modifier_block | effect_block | removed_effect_block | ai_will_do_block);
decree: IDENTIFIER LE ((COST EQUALS INT) | (DURATION EQUALS INT))+ decree_blocks+ RPAR;

//Custom Ideas
custom_idea_category: IDENTIFIER LE CATEGORY EQUALS MPOWER custom_idea+ RPAR;
custom_idea_level: LEVEL_COST EQUALS INT;
enabled_block: ENABLED LE trigger* RPAR;
custom_idea: IDENTIFIER LE (modifier | enabled_block | custom_idea_level | (DEFAULT EQUALS INT) | chance_block | (MAX_LEVEL EQUALS INT))* RPAR; 

//Custom country colors for the custom nation designer
flag_color: FLAG_COLOR LE INT+ INT+ INT+ RPAR;
texture_block: TEXTURE LE file_block size_block NOOFFRAMES EQUALS INT COLOR EQUALS INT RPAR;
custom_country_color: NUM_SYMBOLS EQUALS INT color_block* flag_color* TEXTURES LE texture_block* RPAR;

//Cultures
culture_modifier_block: (COUNTRY | PROVINCE) LE modifier* RPAR;
culture_names: (MALE_NAMES | FEMALE_NAMES | DYNASTY_NAMES) LE (IDENTIFIER | STRING)* RPAR;
culture_group: IDENTIFIER LE ((GRAPHICAL_CULTURE EQUALS IDENTIFIER) | culture_modifier_block | culture | culture_names)+ RPAR;
culture: IDENTIFIER LE ((PRIMARY EQUALS TAG) | culture_modifier_block | culture_names)* RPAR;

//Country Tag
country_tags: TAG EQUALS STRING;

//Country Colors
country_color: TAG LE ((COLOR1 | COLOR2 | COLOR3) LE INT+ INT+ INT+ RPAR)+ RPAR;

//Common//countries
common_countires_block: (HISTORICAL_IDEA_GROUPS | HISTORICAL_UNITS | LEADER_NAMES | SHIP_NAMES | ARMY_NAMES | FLEET_NAMES) LE (IDENTIFIER | STRING)* RPAR;
monarch_names: MONARCH_NAMES LE (STRING EQUALS INT)* RPAR;
common_country:((GRAPHICAL_CULTURE EQUALS IDENTIFIER) | color_block | common_countires_block | monarch_names | (REVOLUTIONARY_COLORS LE INT+ INT+ INT+ RPAR))+ ;

//Colonial Regions
trade_goods_block: TRADE_GOODS LE (IDENTIFIER EQUALS INT)+ RPAR;
culture_block: CULTURE LE (IDENTIFIER EQUALS INT)+ RPAR;
religion_block: RELIGION LE (IDENTIFIER EQUALS INT)+ RPAR;
col_simple_attr: (TAX_INCOME EQUALS INT) | (NATIVE_SIZE EQUALS INT) | (NATIVE_FEROCITY EQUALS INT) | (NATIVE_HOSTILENESS EQUALS INT);
col_region_attr: (provinces_block | trade_goods_block | culture_block | religion_block);
colonial_region: IDENTIFIER LE (color_block | col_simple_attr+ | col_region_attr | name_block)+ RPAR;

//tooltips
tooltip: TOOLTIP EQUALS (STRING_TOOLTIP | IDENTIFIER);
custom_tooltip: CUSTOM_TOOLTIP EQUALS (STRING_TOOLTIP | IDENTIFIER);
custom_trigger_tooltip: CUSTOM_TRIGGER_TOOLTIP LE tooltip* trigger* RPAR;
desc: DESC EQUALS (STRING_TOOLTIP | IDENTIFIER | STRING);

//ClientStates
client_state: IDENTIFIER LE ( name_block | region_trigger)+ RPAR;

//Church Aspects
is_blessing: IS_BLESSING EQUALS (YES | NO);
sprite: SPRITE EQUALS STRING;
church_aspect: IDENTIFIER LE (is_blessing | trigger_block | sprite | monarch_power_advisor | cost | effect_block | modifier_block | potential_block)* ai_will_do_block? RPAR;

//Center of trades
level: LEVEL EQUALS INT;
development: DEVELOPMENT EQUALS INT;
cot_type: TYPE EQUALS (COASTAL | INLAND);
cot_optionals: (development | cost | cot_type);
province_modifier: PROVINCE_MODIFIER LE modifier* RPAR;
global_modifier: GLOBAL_MODIFIER LE modifier* RPAR;
state_modifier: STATE_MODIFIER LE modifier* RPAR;
center_of_trade: IDENTIFIER LE level cot_optionals+ province_modifier? state_modifier? global_modifier? RPAR;

//cb type
league: LEAGUE EQUALS (YES | NO);
call_empire_members: CALL_EMPIRE_MEMBERS EQUALS (YES | NO);
ai_peace_desire: AI_PEACE_DESIRE EQUALS INT;
support_rebels: SUPPORT_REBELS EQUALS (YES | NO);
coalition: COALITION EQUALS (YES | NO);
independence: INDEPENDENCE EQUALS (YES | NO);
exclusive: EXCLUSIVE EQUALS (YES | NO);
holy_war: HOLY_WAR EQUALS (YES | NO);
attacker_disabled_po: ATTACKER_DISABLED_PO LE IDENTIFIER* RPAR;
is_valid_for_subject: IS_VALID_FOR_SUBJECT EQUALS (YES | NO);
war_goal: WAR_GOAL EQUALS IDENTIFIER;
no_opinion_hit: NO_OPINION_HIT EQUALS (YES | NO);
cb_optionals: (call_empire_members | attacker_disabled_po | holy_war | is_triggered_only | months | no_opinion_hit | war_goal | prerequisites | prerequisites_self);
cb_type: IDENTIFIER LE league? support_rebels? ai_peace_desire? is_valid_for_subject? exclusive? independence? coalition?  cb_optionals*  RPAR;

//Building | manufactory
buildings_trigger: (BUILD_TRIGGER | KEEP_TRIGGER) LE trigger* RPAR;
buildings_effect: (ON_BUILT | ON_CONSTRUCTION_CANCELED | ON_CONSTRUCTION_STARTED | ON_DESTORYED | ON_OBSOLETE) LE effect* RPAR;
manufactory_defines: (MANUFACTORY | BONUS_MANUFACTORY) LE IDENTIFIER+ RPAR;
bonus_modifier: BONUS_MODIFIER EQUALS value;
cost: COST EQUALS INT;
time: TIME EQUALS INT;
onmap: ONMAP EQUALS (YES | NO);
show_seperate: SHOW_SEPERATE EQUALS (YES | NO);
building_attribute: (cost | time| onmap | show_seperate | influencing_fort | allowed_in_gold_province | make_obsolete);
allowed_in_gold_province: ALLOWED_IN_GOLD_PROVINCES EQUALS (YES | NO);
make_obsolete: MAKE_OBSOLETE EQUALS IDENTIFIER;
influencing_fort: INFLUENCING_FORT EQUALS (YES | NO);
building: IDENTIFIER LE (manufactory_defines | building_attribute | buildings_effect | buildings_trigger | bonus_modifier | modifier_block | ai_will_do_block )* RPAR;

//Bookmark
bookmark: BOOKMARK LE name desc date (CENTER EQUALS INT)* (DEFAULT EQUALS (YES | NO)*) (COUNTRY EQUALS TAG)* (EASY_COUNTRY EQUALS TAG)* RPAR;

//Ancestor personalities
ancestor_personality: IDENTIFIER LE ((RULER_ALLOW LE allow* chance_block RPAR) | (HEIR_ALLOW LE allow* chance_block RPAR) | (CONSORT_ALLOW LE allow* chance_block RPAR) | allow | chance_block | war_priority | ai_pick_ancestor | modifier)*  RPAR;
war_priority: WAR_PRIORITY LE chance_modifier RPAR;
ai_pick_ancestor: AI_PICK_ANCESTOR LE factor chance_modifier RPAR;

//ai personality
ai_personality: IDENTIFIER LE chance_block ICON EQUALS INT RPAR;

//ages
start: START EQUALS INT;
can_start_block: CAN_START LE trigger* RPAR;
objective: IDENTIFIER LE (allow | trigger)* RPAR; 
objectives_block: OBJECTIVES LE objective* RPAR;
ability: IDENTIFIER LE (allow | effect_block | modifier_block)* ai_will_do_block RPAR;
ability_block: ABILITIES LE ability* RPAR;
age: IDENTIFIER LE start can_start_block ((RELIGIOUS_CONFLICTS EQUALS (YES | NO))|(PAPACY EQUALS FLOAT))* objectives_block ability_block;

//advisors
advisor: IDENTIFIER LE monarch_power_advisor (modifier | skill_scaled_modifier)* chance_block ai_will_do_block RPAR;
monarch_power_advisor: MONARCH_POWER EQUALS MPOWER;

// Missions by @Sol_InvictusXLII
// Note: this is a parser
// With missions, that can have a bunch of optional terms without a specific order, capturing duplicate terms is should be done while traversing the tree
// Ex, if the mission has 2 <trigger> blocks, it is grammatically valid but syntactically invalid :)

// -- Mission Series
missionSeries: IDENTIFIER LE (slot_missionSeries | generic_missionSeries | ai_trigger | hasCountryShield_missionSeries | potentialOnLoad_missionSeries | potential_missionSeries | missionBlock)* RPAR;
slot_missionSeries: SLOT EQUALS INT;
generic_missionSeries: GENERIC EQUALS (YES | NO);
hasCountryShield_missionSeries: HAS_COUNTRY_SHIELD EQUALS (YES | NO);
potentialOnLoad_missionSeries: POTENTIAL_ON_LOAD LE trigger* RPAR;
potential_missionSeries: POTENTIAL LE trigger* RPAR;

// -- Mission Block
missionBlock: IDENTIFIER LE (icon_mission | position_mission | completedBy_mission | requiredMissions_mission | provincesToHighlight_mission | trigger_block | effect_block | aiWeight_mission)* RPAR;
icon_mission: ICON EQUALS IDENTIFIER;
position_mission: POSITION EQUALS INT;
completedBy_mission: COMPLETED_BY EQUALS STRING;
requiredMissions_mission: REQUIRED_MISSIONS LE IDENTIFIER* RPAR;
provincesToHighlight_mission: PROVINCES_TO_HIGHLIGHT LE trigger* RPAR;
aiWeight_mission: AI_WEIGHT LE factor RPAR;
