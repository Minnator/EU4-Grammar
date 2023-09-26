parser grammar EU4GrammarParser;
options 
    { 
        tokenVocab = EU4Grammar; 
    }


block: LPAR (statement | ifStatement)* RPAR ;                                   //{ <statement> | <ifStatement> }
simpleBlock: LPAR statement* RPAR;                                              // { <statement> }
statement: (effect | block) ;                                                   //<effect> | <if>
value: TAG | INT | FLOAT | STRING |BOOL;
limit: LIMIT EQUALS LPAR trigger* RPAR;                                          //limit = { <trigger> }
else: ELSE EQUALS LPAR effect* RPAR;                                            //else = { <effect> }
elseIf: ELSE_IF LPAR EQUALS limit effect* RPAR;                                 //else_if = { <limit> <effect> }
ifStatement: IF EQUALS LPAR limit effect* RPAR (eLSE | elseIf)*;                        //if = { <limit> }
scriptedEffect: IDENTIFIER EQUALS (simpleBlock | YES);                          //<IDENTIFIER> = <simpleblock> | YES
effect: (EFFECT_NAME EQUALS value) | scriptedEffect | ifStatement;              //(<EFFECT> | <scriptedEffect> | <ifStatement>)
modifier: MODIFIER_NAME EQUALS value;                                           //<modifier_name> = <value>
// NOT AND OR not sure how to do that yet
scriptedTrigger: IDENTIFIER EQUALS LPAR trigger* RPAR;                          //<IDENTIFIER> = { <triggers> }
factor: FACTOR EQUALS (INT | FLOAT);                                            //factor = <int> | <float>
chanceMod: MODIFIER EQUALS LPAR factor trigger* RPAR;                           //modifier = { <factor> <trigger> }
chance: CHANCE EQUALS LPAR factor chanceMod* RPAR;                              //chance = { <factor> <ChanceMod> }

// Triggers
trigger: simpleTrigger | booleanTrigger;                                        // <trigger> | <boolean>
simpleTrigger: (TRIGGER_NAME EQUALS value) | scriptedTrigger | customTriggerTooltip;  //<trigger> | <scriptedTrigger>

// -- Booleans
booleanTrigger: orBlock | andBlock | notBlock;                                  //OR | AND | NOT
orBlock: OR EQUALS LPAR trigger* RPAR;                                          //OR = { <triggers> }
andBlock: AND EQUALS LPAR trigger* RPAR;                                        //AND = { <triggers> }
notBlock: NOT EQUALS LPAR trigger* RPAR;                                        //NOT = { <triggers> }

//Tooltips
tooltip: TOOLTIP EQUALS STRING;                                                 //tooltip = <string>
customTooltip: CUSTOM_TOOLTIP EQUALS STRING;                                    //custom_tooltip = <string>
customTriggerTooltip: CUSTOM_TRIGGER_TOOLTIP EQUALS LPAR tooltip trigger* RPAR; //custom_trigger_tooltip = { <tooltip> <trigger> }
desc: DESC EQUALS STRING;                                                       //desc = <string>

//file: advisor* EOF ;
//advisor: IDENTIFIER EQUALS block ;
