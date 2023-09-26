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
TAG: [A-Z0-9][A-Z0-9][A-Z0-9]; 

BOOL: YES | NO;
INT: [0-9]+;
STRING: '"'(~('"')|(' '|'\\n'|'\\t'|'\\"'|'\\'))*'"'; //Still need to to the $Y$! amd [Root.GetName] stuff
FLOAT: [0-9]+ '.' [0-9]+;



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
MODIFIER: 'modifier';
CHANCE: 'chance';
AI_WILL_DO: 'ai_will_do';
FACTOR: 'factor';
TOOLTIP: 'tooltip';
CUSTOM_TOOLTIP: 'custom_tooltip';
DESC: 'desc';
CUSTOM_TRIGGER_TOOLTIP: 'custom_trigger_tooltip';
POTENTIAL: 'potential';
AI_WEIGHT: 'ai_weight';
TRIGGER: 'trigger';
EFFECT: 'effect';

//Trigger
TRIGGER_NAME
    : 'is_core'
    ;

//Modifier
MODIFIER_NAME
    : 'monarch_power' 
    ;

//Effects
EFFECT_NAME
    : 'add_core'
    ;

//Trigger Keywords
AI: 'ai';

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
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
