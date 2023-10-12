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
trigger_block: TRIGGER LPAR trigger* RPAR;
potential_block: POTENTIAL LPAR trigger* RPAR;
effect_block: EFFECT LPAR effect* RPAR;
removed_effect_block: REMOVED_EFFECT LPAR effect* RPAR;
modifier_block: MODIFIER LPAR modifier* RPAR;
chance_block: CHANCE LPAR factor* chance_modifier* RPAR;
ai_will_do_block: AI_WILL_DO LPAR factor chance_modifier* RPAR;
allow: ALLOW LPAR trigger* RPAR;
name_block: (NAME | NAMES) LPAR ((NAME STRING) | trigger_block)+ RPAR;
color_block: COLOR LPAR INT+ INT+ INT+ RPAR;
provinces_block: PROVINCES LPAR (INT+)* RPAR;
file_block: FILE STRING;
size_block: SIZE LPAR X INT Y INT RPAR;
allow_block: ALLOW LPAR trigger* RPAR;

//ai stuff
factor: FACTOR (INT | FLOAT);                                          
chance_modifier: MODIFIER LPAR (factor | trigger)* RPAR;

//base tokens
value: YES | NO | TAG | SCOPE | FLOAT | STRING | IDENTIFIER | INT;
amount: AMOUNT INT;
name: NAME STRING;
date: DATE_KEY DATE;
bool: YES | NO;
months: MONTHS INT;

//if & else & conditions
limit: LIMIT LPAR trigger* RPAR;
eLSE: ELSE LPAR effect* RPAR;
else_if: ELSE_IF LPAR limit effect* RPAR;
if_statement: IF LPAR limit effect* RPAR (eLSE | else_if)*; 
while: WHILE LPAR limit effect* RPAR;

//scope
scope: (SCOPE | TAG) LPAR (effect | trigger | scope | limit)* RPAR;

//effects & modifier
scriptedEffect: IDENTIFIER ((LPAR effect* RPAR) | YES);
modifier: IDENTIFIER (YES | NO | TAG | SCOPE | FLOAT | STRING | IDENTIFIER | INT);
skill_scaled_modifier: SKILL_SACLED_MOD LPAR trigger_block modifier_block RPAR;
effect
    : IDENTIFIER (YES | NO | TAG | SCOPE | FLOAT | STRING | IDENTIFIER | INT) 
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
reverse_remove_opinion: REVERSE_REMOVE_OPINION LPAR WHO (SCOPE | TAG) MODIFIER IDENTIFIER RPAR;
remove_opinion: REMOVE_OPINION LPAR WHO (SCOPE | TAG) MODIFIER IDENTIFIER RPAR;
add_opinion: ADD_OPINION LPAR WHO (SCOPE | TAG) MODIFIER IDENTIFIER RPAR;
reverse_add_opinion: REVERSE_ADD_OPINION LPAR WHO (SCOPE | TAG) MODIFIER IDENTIFIER RPAR;
hidden_effect: HIDDEN_EFFECT LPAR effect* RPAR;
add_modifier: (ADD_COUNTRY_MOD | ADD_PROVINCE_MOD) LPAR NAME (IDENTIFIER | STRING) DURATION INT RPAR;
multiply_variable: MULTIPLY_VARIABLE LPAR  IDENTIFIER IDENTIFIER (( IDENTIFIER IDENTIFIER) | ( IDENTIFIER (FLOAT | INT))) RPAR;
subtrackt_variable: SUBTRACKT_VARIABLE LPAR  IDENTIFIER IDENTIFIER (( IDENTIFIER IDENTIFIER) | ( IDENTIFIER (FLOAT | INT))) RPAR;
change_variable: CHANGE_VARIABLE LPAR  IDENTIFIER IDENTIFIER (( IDENTIFIER IDENTIFIER) | ( IDENTIFIER (FLOAT | INT))) RPAR;
set_variable: SET_VARIABLE LPAR  IDENTIFIER IDENTIFIER (( IDENTIFIER IDENTIFIER) | ( IDENTIFIER (FLOAT | INT))) RPAR;
divide_variable: DIVIDE_VARIABLE LPAR  IDENTIFIER IDENTIFIER (( IDENTIFIER IDENTIFIER) | ( IDENTIFIER (FLOAT | INT))) RPAR;
export_to_variable: EXPORT_TO_VARIABLE LPAR  IDENTIFIER IDENTIFIER  IDENTIFIER IDENTIFIER (WHO (TAG | SCOPE))? RPAR;
country_event: COUNTRY_EVENT LPAR ID IDENTIFIER DOT (IDENTIFIER | INT) (DAYS INT)? RPAR;

//triggers
mana_trigger: MPOWER INT;
religion_trigger: RELIGION (IDENTIFIER | SCOPE);
trigger
    : (IDENTIFIER (YES | NO | TAG | SCOPE | FLOAT | STRING | IDENTIFIER | INT)) 
    | ( OR | AND | NOT | SCOPE | TAG ) LPAR trigger* RPAR
    | scripted_trigger 
    | custom_trigger_tooltip
    | calc_true_if
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
num_of_owned_provinces_with: NUM_OF_OWNED_PROVINCES_WITH LPAR (( IDENTIFIER INT) | trigger)+ RPAR;
has_opinion_modifier: HAS_OPINION_MODIFIER LPAR ((WHO (TAG | SCOPE)) | ( IDENTIFIER INT) | (MODIFIER IDENTIFIER))* RPAR;
calc_true_if: CALC_TRUE_IF LPAR (amount | trigger)* RPAR;        
check_variable: CHECK_VARIABLE LPAR  IDENTIFIER IDENTIFIER (( IDENTIFIER IDENTIFIER) | ( IDENTIFIER (FLOAT | INT))) RPAR;
trade_share: TRADE_SHARE LPAR COUNTRY (TAG | SCOPE) SHARE INT RPAR;  
privateer_power: PRIVATEER_POWER LPAR COUNTRY (TAG | SCOPE) SHARE INT RPAR; 
scripted_trigger: IDENTIFIER LPAR trigger* RPAR;   
prerequisites: PREREQUISITES LPAR trigger* RPAR;   
prerequisites_self: PREREQUISITES_SELF LPAR trigger* RPAR;   
ai_trigger: AI (YES | NO);
is_triggered_only: IS_TIRGGERED_ONLY (YES | NO);
region_trigger: REGION IDENTIFIER;
has_global_modifier_value: Has_GLOBAL_MODIFIER_VALUE LPAR  IDENTIFIER IDENTIFIER  IDENTIFIER INT RPAR;
is_in_war: IS_IN_WAR LPAR is_in_war_options* RPAR;
is_in_war_options: (ATTACKER_LEADER (SCOPE | IDENTIFIER)) | (DEFENDER_LEADER (SCOPE | IDENTIFIER)) | (CASUS_BELLI IDENTIFIER) | (DEFENDERS TAG) | (ATTACKERS TAG) | (PARTICIPANTS TAG) | (WAR_SCORE INT) | (START_DATE DATE) | (DURATION INT) | (WAR_GOAL_PROVINCE INT);
has_opinion: HAS_OPINION LPAR ((WHO (TAG | SCOPE)) | ( IDENTIFIER INT) | (MODIFIER IDENTIFIER))* RPAR;

//Diplomatic Action (Overwriting)
pre_effect: PRE_EFFECT LPAR effect* RPAR;
conditional_block: CONDITIONAL LPAR (potential_block | allow_block | tooltip | pre_effect)* RPAR;
diplomatic_action: IDENTIFIER LPAR (conditional_block | effect_block | pre_effect)* RPAR;

//Defender of faith
//dof_defines: (LEVEL INT) | (RANGE_FROM INT) | (RANGE_TO INT);
defender_of_faith: IDENTIFIER LPAR (IDENTIFIER INT)+ (modifier_block | ai_will_do_block | (SAME_FAITH_MODIFIER LPAR modifier* RPAR))+ RPAR;

//Decrees
decree_blocks: (potential_block | trigger_block | modifier_block | effect_block | removed_effect_block | ai_will_do_block);
decree: IDENTIFIER LPAR ((IDENTIFIER INT) | (DURATION INT))+ decree_blocks+ RPAR;

//Custom Ideas
custom_idea_category: IDENTIFIER LPAR CATEGORY MPOWER custom_idea+ RPAR;
custom_idea_level: LEVEL_COST INT;
enabled_block: ENABLED LPAR trigger* RPAR;
custom_idea: IDENTIFIER LPAR (modifier | enabled_block | custom_idea_level | (DEFAULT INT) | chance_block | (MAX_LEVEL INT))* RPAR; 

//Custom country colors for the custom nation designer
flag_color: FLAG_COLOR LPAR INT+ INT+ INT+ RPAR;
texture_block: TEXTURE LPAR file_block size_block NOOFFRAMES INT COLOR INT RPAR;
custom_country_color: NUM_SYMBOLS INT color_block* flag_color* TEXTURES LPAR texture_block* RPAR;

//Cultures
culture_modifier_block: (COUNTRY | PROVINCE) LPAR modifier* RPAR;
culture_names: (MALE_NAMES | FEMALE_NAMES | DYNASTY_NAMES) LPAR (IDENTIFIER | STRING)* RPAR;
culture_group: IDENTIFIER LPAR ((GRAPHICAL_CULTURE IDENTIFIER) | culture_modifier_block | culture | culture_names)+ RPAR;
culture: IDENTIFIER LPAR ((PRIMARY TAG) | culture_modifier_block | culture_names)* RPAR;

//Country Tag
country_tags: TAG STRING;

//Country Colors
country_color: TAG LPAR ((COLOR1 | COLOR2 | COLOR3) LPAR INT+ INT+ INT+ RPAR)+ RPAR;

//Common//countries
common_countires_block: (HISTORICAL_IDEA_GROUPS | HISTORICAL_UNITS | LEADER_NAMES | SHIP_NAMES | ARMY_NAMES | FLEET_NAMES) LPAR (IDENTIFIER | STRING)* RPAR;
monarch_names: MONARCH_NAMES LPAR (STRING INT)* RPAR;
common_country:((GRAPHICAL_CULTURE IDENTIFIER) | color_block | common_countires_block | monarch_names | (REVOLUTIONARY_COLORS LPAR INT+ INT+ INT+ RPAR))+ ;

//Colonial Regions
trade_goods_block: TRADE_GOODS LPAR (IDENTIFIER INT)+ RPAR;
culture_block: CULTURE LPAR (IDENTIFIER INT)+ RPAR;
religion_block: RELIGION LPAR (IDENTIFIER INT)+ RPAR;
col_simple_attr: (TAX_INCOME INT) | (NATIVE_SIZE INT) | (NATIVE_FEROCITY INT) | (NATIVE_HOSTILENESS INT);
col_region_attr: (provinces_block | trade_goods_block | culture_block | religion_block);
colonial_region: IDENTIFIER LPAR (color_block | col_simple_attr+ | col_region_attr | name_block)+ RPAR;

//tooltips
tooltip: TOOLTIP (STRING_TOOLTIP | IDENTIFIER);
custom_tooltip: CUSTOM_TOOLTIP (STRING_TOOLTIP | IDENTIFIER);
custom_trigger_tooltip: CUSTOM_TRIGGER_TOOLTIP LPAR tooltip* trigger* RPAR;
desc: DESC (STRING_TOOLTIP | IDENTIFIER | STRING);

//ClientStates
client_state: IDENTIFIER LPAR ( name_block | region_trigger)+ RPAR;

//Church Aspects
is_blessing: IS_BLESSING (YES | NO);
sprite: SPRITE STRING;
church_aspect: IDENTIFIER LPAR (is_blessing | trigger_block | sprite | monarch_power_advisor | cost | effect_block | modifier_block | potential_block)* ai_will_do_block? RPAR;

//Center of trades
cot_type: IDENTIFIER (COASTAL | INLAND);
cot_optionals: cot_type | (IDENTIFIER INT);
province_modifier: PROVINCE_MODIFIER LPAR modifier* RPAR;
global_modifier: GLOBAL_MODIFIER LPAR modifier* RPAR;
state_modifier: STATE_MODIFIER LPAR modifier* RPAR;
center_of_trade: IDENTIFIER LPAR  (cot_optionals | province_modifier | state_modifier | global_modifier)+ RPAR;

//cb type
league: LEAGUE (YES | NO);
call_empire_members: CALL_EMPIRE_MEMBERS (YES | NO);
ai_peace_desire: AI_PEACE_DESIRE INT;
support_rebels: SUPPORT_REBELS (YES | NO);
coalition: COALITION (YES | NO);
independence: INDEPENDENCE (YES | NO);
exclusive: EXCLUSIVE (YES | NO);
holy_war: HOLY_WAR (YES | NO);
attacker_disabled_po: ATTACKER_DISABLED_PO LPAR IDENTIFIER* RPAR;
is_valid_for_subject: IS_VALID_FOR_SUBJECT (YES | NO);
war_goal: WAR_GOAL IDENTIFIER;
no_opinion_hit: NO_OPINION_HIT (YES | NO);
cb_optionals: (call_empire_members | attacker_disabled_po | holy_war | is_triggered_only | months | no_opinion_hit | war_goal | prerequisites | prerequisites_self);
cb_type: IDENTIFIER LPAR league? support_rebels? ai_peace_desire? is_valid_for_subject? exclusive? independence? coalition?  cb_optionals*  RPAR;

//Building | manufactory
buildings_trigger: (BUILD_TRIGGER | KEEP_TRIGGER) LPAR trigger* RPAR;
buildings_effect: (ON_BUILT | ON_CONSTRUCTION_CANCELED | ON_CONSTRUCTION_STARTED | ON_DESTORYED | ON_OBSOLETE) LPAR effect* RPAR;
manufactory_defines: (MANUFACTORY | BONUS_MANUFACTORY) LPAR IDENTIFIER+ RPAR;
bonus_modifier: BONUS_MODIFIER value;
cost: IDENTIFIER INT;
time: TIME INT;
onmap: ONMAP (YES | NO);
show_seperate: SHOW_SEPERATE (YES | NO);
building_attribute: (cost | time| onmap | show_seperate | influencing_fort | allowed_in_gold_province | make_obsolete);
allowed_in_gold_province: ALLOWED_IN_GOLD_PROVINCES (YES | NO);
make_obsolete: MAKE_OBSOLETE IDENTIFIER;
influencing_fort: INFLUENCING_FORT (YES | NO);
building: IDENTIFIER LPAR (manufactory_defines | building_attribute | buildings_effect | buildings_trigger | bonus_modifier | modifier_block | ai_will_do_block )* RPAR;

//Bookmark
bookmark: BOOKMARK LPAR name desc date (CENTER INT)* (DEFAULT (YES | NO)*) (COUNTRY TAG)* (EASY_COUNTRY TAG)* RPAR;

//Ancestor personalities
ancestor_personality: IDENTIFIER LPAR ((RULER_ALLOW LPAR allow* chance_block RPAR) | (HEIR_ALLOW LPAR allow* chance_block RPAR) | (CONSORT_ALLOW LPAR allow* chance_block RPAR) | allow | chance_block | war_priority | ai_pick_ancestor | modifier)*  RPAR;
war_priority: WAR_PRIORITY LPAR chance_modifier RPAR;
ai_pick_ancestor: AI_PICK_ANCESTOR LPAR factor chance_modifier RPAR;

//ai personality
ai_personality: IDENTIFIER LPAR chance_block ICON INT RPAR;

//ages
start: START INT;
can_start_block: CAN_START LPAR trigger* RPAR;
objective: IDENTIFIER LPAR (allow | trigger)* RPAR; 
objectives_block: OBJECTIVES LPAR objective* RPAR;
ability: IDENTIFIER LPAR (allow | effect_block | modifier_block)* ai_will_do_block RPAR;
ability_block: ABILITIES LPAR ability* RPAR;
age: IDENTIFIER LPAR start can_start_block ((RELIGIOUS_CONFLICTS (YES | NO))|(PAPACY FLOAT))* objectives_block ability_block;

//advisors
advisor: IDENTIFIER LPAR monarch_power_advisor (modifier | skill_scaled_modifier)* chance_block ai_will_do_block RPAR;
monarch_power_advisor: MONARCH_POWER MPOWER;

// Missions by @Sol_InvictusXLII
// Note: this is a parser
// With missions, that can have a bunch of optional terms without a specific order, capturing duplicate terms is should be done while traversing the tree
// Ex, if the mission has 2 <trigger> blocks, it is grammatically valid but syntactically invalid :)

// -- Mission Series
missionSeries: IDENTIFIER LPAR (slot_missionSeries | generic_missionSeries | ai_trigger | hasCountryShield_missionSeries | potentialOnLoad_missionSeries | potential_missionSeries | missionBlock)* RPAR;
slot_missionSeries: SLOT INT;
generic_missionSeries: GENERIC (YES | NO);
hasCountryShield_missionSeries: HAS_COUNTRY_SHIELD (YES | NO);
potentialOnLoad_missionSeries: POTENTIAL_ON_LOAD LPAR trigger* RPAR;
potential_missionSeries: POTENTIAL LPAR trigger* RPAR;

// -- Mission Block
missionBlock: IDENTIFIER LPAR (icon_mission | position_mission | completedBy_mission | requiredMissions_mission | provincesToHighlight_mission | trigger_block | effect_block | aiWeight_mission)* RPAR;
icon_mission: ICON IDENTIFIER;
position_mission: POSITION INT;
completedBy_mission: COMPLETED_BY STRING;
requiredMissions_mission: REQUIRED_MISSIONS LPAR IDENTIFIER* RPAR;
provincesToHighlight_mission: PROVINCES_TO_HIGHLIGHT LPAR trigger* RPAR;
aiWeight_mission: AI_WEIGHT LPAR factor RPAR;
