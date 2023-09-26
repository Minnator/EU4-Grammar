parser grammar EU4GrammarParser;
options 
    { 
        tokenVocab = EU4Grammar; 
    }


block: LPAR (statement | ifStatement)* RPAR ;                                   //{ <statement> | <ifStatement> }
simpleBlock: LPAR statement* RPAR;                                              // { <statement> }
statement: (effect | block) ;                                                   //<effect> | <if>
limit: LIMIT EQUALS LPAR trigger RPAR;                                          //limit = { <trigger> }
eLSE: ELSE LPAR EQUALS effect* RPAR;                                            //else = { <effect> }
elseIf: ELSE_IF LPAR EQUALS limit effect* RPAR;                                 //else_if = { <limit> <effect> }
ifStatement: IF EQUALS LPAR limit RPAR (eLSE | elseIf)*;                        //if = { <limit> }
scriptedEffect: IDENTIFIER EQUALS (simpleBlock | YES);                          //<IDENTIFIER> = <simpleblock> | YES
effect: (EFFECT_NAME EQUALS VALUE) | scriptedEffect | ifStatement;              //(<EFFECT> | <scriptedEffect> | <ifStatement>)
modifier: MODIFIER_NAME EQUALS VALUE;                                           //<modifier_name> = <value>
// NOT AND OR not sure how to do that yet
scriptedTrigger: IDENTIFIER EQUALS LPAR trigger* RPAR;                          //<IDENTIFIER> = { <triggers> }
trigger: (TRIGGER_NAME EQUALS VALUE) | scriptedTrigger | customTriggerTooltip;  //<trigger> | <scriptedTrigger>
factor: FACTOR EQUALS (INT | FLOAT);                                            //factor = <int> | <float>
chanceMod: MODIFIER EQUALS LPAR factor trigger* RPAR;                           //modifier = { <factor> <trigger> }
chance: CHANCE EQUALS LPAR factor chanceMod* RPAR;                              //chance = { <factor> <ChanceMod> }

//Tooltips
tooltip: TOOLTIP EQUALS STRING;                                                 //tooltip = <string>
customTooltip: CUSTOM_TOOLTIP EQUALS STRING;                                    //custom_tooltip = <string>
customTriggerTooltip: CUSTOM_TRIGGER_TOOLTIP EQUALS LPAR tooltip trigger* RPAR; //custom_trigger_tooltip = { <tooltip> <trigger> }
desc: DESC EQUALS STRING;                                                       //desc = <string>

//file: advisor* EOF ;
//advisor: IDENTIFIER EQUALS block ;