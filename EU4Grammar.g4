lexer grammar EU4Grammar;

//Unique strings
AND: 'AND';
OR: 'OR';
YES: 'yes' | 'YES';
NO: 'no' | 'NO';
NOT: 'NOT' | 'not';

//EU4 Types
MPOWER: 'ADM' | 'MIL' | 'DIP';

//not sure if not only '[A-Z0-9]{3}' would be enough for a TAG to be recognized
TAG: [A-Z][A-Z0-9][A-Z0-9]; 

INT: ('-' | '+')? [0-9]+;
STRING: '"'(~('"')|(' '|'\\n'|'\\t'|'\\"'|'\\'))*'"'; //Still need to to the $Y$! amd [Root.GetName] stuff
FLOAT: ('-' | '+')?[0-9]+ '.' [0-9]+;
DATE: [1-9]+'.'[0-9]+'.'[0-9]+;

//Symbols
LPAR: '{';
RPAR: '}';
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
COST: 'cost';
TIME: 'time';

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
    : 'prestige' 
    | 'reform_progress_growth' 
    | 'governing_capacity_modifier' 
    | 'global_tax_modifier' 
    | 'republican_tradition' 
    | 'meritocracy' 
    | 'development_cost' 
    | 'tolerance_heretic' 
    ;

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

//Advisor specific keywords
MONARCH_POWER: 'monarch_power';

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
IDENTIFIER: [a-zA-Z0-9_]+;
STRING_TOOLTIP: [a-zA-Z0-9_$]+;
