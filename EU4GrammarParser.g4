parser grammar EU4GrammarParser;
options 
    { 
        tokenVocab = EU4Grammar; 
    }

// Uncategorized Mess :trollface:
block: LPAR (statement | ifStatement)* RPAR ;                                   //{ <statement> | <ifStatement> }
simpleBlock: LPAR statement* RPAR;                                              // { <statement> }
statement: (effect | block) ;                                                   //<effect> | <if>
value: TAG | INT | FLOAT | STRING | BOOL | IDENTIFIER;
limit: LIMIT EQUALS LPAR trigger* RPAR;                                          //limit = { <trigger> }
eLSE: ELSE EQUALS LPAR effect* RPAR;                                            //else = { <effect> }
elseIf: ELSE_IF LPAR EQUALS limit effect* RPAR;                                 //else_if = { <limit> <effect> }
ifStatement: IF EQUALS LPAR limit effect* RPAR (eLSE | elseIf)*;                        //if = { <limit> }
scriptedEffect: IDENTIFIER EQUALS (simpleBlock | YES);                          //<IDENTIFIER> = <simpleblock> | YES
effect: (EFFECT_NAME EQUALS value) | scriptedEffect | ifStatement;              //(<EFFECT> | <scriptedEffect> | <ifStatement>)
modifier: MODIFIER_NAME EQUALS value;                                           //<modifier_name> = <value>
// NOT AND OR not sure how to do that yet
scriptedTrigger: IDENTIFIER EQUALS LPAR trigger* RPAR;                          //<IDENTIFIER> = { <triggers> }
factor: FACTOR EQUALS (INT | FLOAT);                                            //factor = <int> | <float>
chanceMod: MODIFIER EQUALS LPAR factor trigger* RPAR;                           //modifier = { <factor> <trigger> }
chance: CHANCE EQUALS LPAR factor chanceMod* RPAR;                           //chance = { <factor> <ChanceMod> }

// Triggers
trigger: simpleTrigger | booleanTrigger;
simpleTrigger: (TRIGGER_NAME EQUALS value) | scriptedTrigger | customTriggerTooltip;  //<trigger> | <scriptedTrigger>

// -- Booleans
booleanTrigger: orBlock | andBlock | notBlock;
orBlock: OR EQUALS LPAR trigger* RPAR;
andBlock: AND EQUALS LPAR trigger* RPAR;
notBlock: NOT EQUALS LPAR trigger* RPAR;

//Tooltips
tooltip: TOOLTIP EQUALS STRING;                                                 //tooltip = <string>
customTooltip: CUSTOM_TOOLTIP EQUALS STRING;                                    //custom_tooltip = <string>
customTriggerTooltip: CUSTOM_TRIGGER_TOOLTIP EQUALS LPAR tooltip trigger* RPAR; //custom_trigger_tooltip = { <tooltip> <trigger> }
desc: DESC EQUALS STRING;                                                       //desc = <string>

// Trigger and Effect blocks
triggerBlock: TRIGGER EQUALS LPAR trigger* RPAR;
effectBlock: EFFECT EQUALS LPAR effect* RPAR;

// Missions
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
missionBlock: IDENTIFIER EQUALS LPAR (icon_mission | position_mission | completedBy_mission | requiredMissions_mission | provincesToHighlight_mission | triggerBlock | effectBlock | aiWeight_mission)* RPAR;
icon_mission: ICON EQUALS IDENTIFIER;
position_mission: POSITION EQUALS INT;
completedBy_mission: COMPLETED_BY EQUALS STRING;
requiredMissions_mission: REQUIRED_MISSIONS EQUALS LPAR IDENTIFIER* RPAR;
provincesToHighlight_mission: PROVINCES_TO_HIGHLIGHT EQUALS LPAR trigger* RPAR;
aiWeight_mission: AI_WEIGHT EQUALS LPAR factor RPAR;

//file: advisor* EOF ;
//advisor: IDENTIFIER EQUALS block ;
