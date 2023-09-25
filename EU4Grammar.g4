grammar EU4Grammar;

keyword: 'example_keyword';

BOOL: 'yes' | 'no';
INT: [0-9]+;
STRING: '"'(~('"')|(' '|'\\n'|'\\t'|'\\"'|'\\'))*'"';
FLOAT: [0-9]+ '.' [0-9]+;
//Identifier
ID: [a-zA-Z_][a-zA-Z0-9_]*;
//Conditions
IF: 'if';
ELSE: 'else';
ELSE_IF: 'else_if';
//Calculation symbols
PLUS: '+';
MINUS: '-';
//Comment and whitespace
WHITESPACE: [ \t\r\n]+ -> skip;
SINGLE_LINE_COMMENT: '#' ~[\r\n]* -> skip;

//Modifier
MODIFIER: MODIFIER_INT | MODIFIER_FLOAT | MODIFIER_STRING;
MODIFIER_INT: MODIFIER_INT_NAME '=' INT;
MODIFIER_FLOAT: MODIFIER_FLOAT_NAME '=' FLOAT;
MODIFIER_STRING: MODIFIER_STRING_NAME '=' STRING;

MODIFIER_INT_NAME: 'free_leader_pool' ;
MODIFIER_FLOAT_NAME: 'governing_capacity_modifier' | 'global_tax_modifier';
MODIFIER_STRING_NAME: 'PLACEHOLDER';

//Effects
EFFECT: EFFECT_INT | EFFECT_FLOAT | EFFECT_STRING | EFFECT_BOOL;

EFFECT_INT: EFFECT_INT_NAME '=' INT;
EFFECT_FLOAT: EFFECT_FLOAT_NAME '=' FLOAT;
EFFECT_STRING: EFFECT_STRING_NAME '=' STRING;
EFFECT_BOOL: EFFECT_BOOL_NAME '=' BOOL;

EFFECT_INT_NAME: 'add_adm_power';
EFFECT_FLOAT_NAME: 'add_years_of_income';
EFFECT_STRING_NAME: 'exile_ruler_as';
EFFECT_BOOL_NAME: 'restore_country_name';
