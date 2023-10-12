lexer grammar EU4Grammar;
@charset { "windows-1252"; }
//Unique strings
AND: 'AND';
OR: 'OR';
YES: 'yes' | 'YES';
NO: 'no' | 'NO';
NOT: 'NOT' | 'not';

//EU4 Types
MPOWER: 'ADM' | 'MIL' | 'DIP' | 'adm' | 'dip' | 'mil';

//not sure if not only '[A-Z0-9]{3}' would be enough for a TAG to be recognized
TAG: [A-Z][A-Z0-9][A-Z0-9]; 

INT: ('-' | '+')? [0-9]+;
STRING: '"'(~('"')|(' '|'\\n'|'\\t'|'\\"'|'\\'))*'"'; //Still need to to the $Y$! amd [Root.GetName] stuff
FLOAT: ('-' | '+')?[0-9]+ '.' [0-9]+;

// Date stuff
DATE: [1-9]+'.'[0-9]+'.'[0-9]+;
MONTHS: 'months';

//Symbols
LPAR: '{';
RPAR: '}';
LE: '='[ \\s\n]*'{';
EQUALS: '=';
PLUS: '+';
MINUS: '-';

//Comment and whitespace
WHITESPACE: [ \t\r\n]+ -> skip;
SINGLE_LINE_COMMENT: '#' ~[\r\n]* -> skip;

//Condition
IF: 'if';
ELSE: 'else';
ELSE_IF: 'else_if';
LIMIT: 'limit';
WHILE: 'while';

//Other Keywords
SKILL_SACLED_MOD: 'skill_scaled_modifier';
POTENTIAL: 'potential';
TRIGGER: 'trigger';
EFFECT: 'effect';
ALLOW: 'allow';
CALC_TRUE_IF: 'calc_true_if';
AMOUNT: 'amount';
DATE_KEY: 'date';
NAME: 'name';
NAMES: 'names';
COST: 'cost';
TIME: 'time';
IS_TIRGGERED_ONLY: 'is_triggered_only';
PREREQUISITES: 'prerequisites';
PREREQUISITES_SELF: 'prerequisites_self';
NO_OPINION_HIT: 'no_opinion_hit';
COLOR: 'color';

//Variables
CHECK_VARIABLE: 'check_variable';
SUBTRACKT_VARIABLE: 'subtract_variable';
CHANGE_VARIABLE: 'change_variable';
SET_VARIABLE: 'set_variable';
DIVIDE_VARIABLE: 'divide_variable';
MULTIPLY_VARIABLE: 'multiply_variable';
EXPORT_TO_VARIABLE: 'export_to_variable';
WHICH: 'which';
VALUE: 'value';
WHO: 'who';

//Block keywords
RULER_ALLOW: 'ruler_allow';
HEIR_ALLOW: 'heir_allow';
CONSORT_ALLOW: 'consort_allow';
WAR_PRIORITY: 'war_priority';
ON_BUILT: 'on_built';
ON_DESTORYED: 'on_destroyed';
ON_CONSTRUCTION_STARTED: 'on_construction_started';
ON_CONSTRUCTION_CANCELED: 'on_construction_canceled';
ON_OBSOLETE: 'on_obsolete';
KEEP_TRIGGER: 'keep_trigger';
BUILD_TRIGGER: 'build_trigger';
TRADE_SHARE: 'trade_share';
PRIVATEER_POWER: 'privateer_power';
SHARE: 'share';
HIDDEN_EFFECT: 'hidden_effect';
HAS_OPINION_MODIFIER: 'has_opinion_modifier';
REMOVE_OPINION: 'remove_opinion';
REVERSE_REMOVE_OPINION: 'reverse_remove_opinion';
ADD_OPINION: 'add_opinion';
REVERSE_ADD_OPINION: 'reverse_add_opinion';

//Tooltips
TOOLTIP: 'tooltip';
CUSTOM_TOOLTIP: 'custom_tooltip';
DESC: 'desc';
CUSTOM_TRIGGER_TOOLTIP: 'custom_trigger_tooltip';

//Trigger
TRIGGER_NAME
    : 'is_core'
    | 'has_government_mechanic'
    | 'culture_group'
    | 'has_government_attribute'
    | 'has_country_flag'
    | 'is_emperor_of_china'
    | 'has_country_modifier'
    | 'controlled_by'
    | 'development_discounting_tribal'
    ;

//Modifier
MODIFIER_NAME
    : 'tolerance_heretic' 
    ;

//Special effect names

//Effects
EFFECT_NAME
    : 'add_core'
    ;

//Scopes
SCOPE
    : 'ROOT'
    | 'root'
    | 'prev'
    | 'PREV'
    | 'FROM'
    | 'from'
    | 'owner'
    | 'all_owned_province'
    | 'any_owned_province'
    | 'exclude_from_progress'
    | 'any_active_trade_node'
    | 'any_tribal_land'
    | 'every_country'
    | 'every_owned_province'
    | 'every_known_country'
    ;

//Special modifiers:
ADD_PROVINCE_MOD: 'add_province_modifier';
ADD_COUNTRY_MOD: 'add_country_modifier';
DURATION: 'duration';

//AI Keywords
AI: 'ai';
MODIFIER: 'modifier';
CHANCE: 'chance';
AI_WILL_DO: 'ai_will_do';
FACTOR: 'factor';
AI_WEIGHT: 'ai_weight';
AI_PICK_ANCESTOR: 'ai_pick_ancestor';
AI_PEACE_DESIRE: 'ai_peace_desire'; 

//Cultures
MALE_NAMES: 'male_names';
FEMALE_NAMES: 'female_names';
DYNASTY_NAMES: 'dynasty_names';
PRIMARY: 'primary';

//Country Colors
COLOR1: 'color1';
COLOR2: 'color2';
COLOR3: 'color3';

//Common//countries
GRAPHICAL_CULTURE: 'graphical_culture';
REVOLUTIONARY_COLORS: 'revolutionary_colors';
HISTORICAL_IDEA_GROUPS: 'historical_idea_groups';
HISTORICAL_UNITS: 'historical_units';
MONARCH_NAMES: 'monarch_names';
LEADER_NAMES: 'leader_names';
SHIP_NAMES: 'ship_names';
ARMY_NAMES: 'army_names';
FLEET_NAMES: 'fleet_names';

//Colonial Regions
TAX_INCOME: 'tax_income';
NATIVE_SIZE: 'native_size';
NATIVE_FEROCITY: 'native_ferocity';
NATIVE_HOSTILENESS: 'native_hostileness';
TRADE_GOODS: 'trade_goods';
CULTURE: 'culture';
RELIGION: 'religion';
PROVINCES: 'provinces';


//Client States
REGION: 'region';

//Church Aspects
IS_BLESSING: 'is_blessing';
SPRITE: 'sprite';
MONARCH_POWER: 'monarch_power';

//trade center specific
LEVEL: 'level';
DEVELOPMENT: 'development';
INLAND: 'inland';
COASTAL: 'coastal';
TYPE: 'type';
PROVINCE_MODIFIER: 'province_modifiers';
STATE_MODIFIER: 'state_modifiers';
GLOBAL_MODIFIER: 'global_modifiers';

//cb types specific
WAR_GOAL: 'war_goal';
IS_VALID_FOR_SUBJECT: 'valid_for_subject';
ATTACKER_DISABLED_PO: 'attacker_disabled_po';
HOLY_WAR: 'holy_war';
EXCLUSIVE: 'exclusive';
INDEPENDENCE: 'independence';
COALITION: 'coalition';
SUPPORT_REBELS: 'support_rebels';
CALL_EMPIRE_MEMBERS: 'call_empire_members';
LEAGUE: 'league';

//Building specific keywords
ALLOWED_IN_GOLD_PROVINCES: 'allow_in_gold_provinces';
INFLUENCING_FORT: 'influencing_fort';
ONMAP: 'onmap';
MAKE_OBSOLETE: 'make_obsolete';
MANUFACTORY: 'manufactory';
BONUS_MANUFACTORY: 'bonus_manufactory';
BONUS_MODIFIER: 'bonus_modifier';
SHOW_SEPERATE: 'show_separate';

//Bookmark specific keywords
BOOKMARK: 'bookmark';
DEFAULT: 'default';
CENTER: 'center';
EASY_COUNTRY: 'easy_country';
COUNTRY: 'country';
PROVINCE: 'province';

//Age specific keywords
START: 'start';
CAN_START: 'can_start';
OBJECTIVES: 'objectives';
ABILITIES: 'abilities';
RELIGIOUS_CONFLICTS: 'religious_conflicts';
PAPACY: 'papacy';

//Missions Specific Keywords
SLOT: 'slot';
GENERIC: 'generic';
HAS_COUNTRY_SHIELD: 'has_country_shield';
POTENTIAL_ON_LOAD: 'potential_on_load';
ICON: 'icon';
POSITION: 'position';
COMPLETED_BY: 'completed_by';
REQUIRED_MISSIONS: 'required_missions';
PROVINCES_TO_HIGHLIGHT: 'provinces_to_highlight';

//Identifier
IDENTIFIER: [a-zA-Z0-9_]+ '-' [a-zA-Z0-9_]+;
STRING_TOOLTIP: [a-zA-Z0-9_$]+;
