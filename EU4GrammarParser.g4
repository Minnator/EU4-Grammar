parser grammar EU4GrammarParser;
options 
    { 
        tokenVocab = EU4Grammar; 
    }

// Uncategorized Mess :trollface:
//blocks
file
    : advisor
    ;
block: LPAR (statement | ifStatement)* RPAR ;    
simpleBlock: LPAR statement* RPAR;      
statement: (effect | block) ;
triggerBlock: TRIGGER EQUALS LPAR trigger* RPAR;
effectBlock: EFFECT EQUALS LPAR effect* RPAR;
modifierBlock: MODIFIER EQUALS LPAR modifier* RPAR;
chanceBlock: CHANCE EQUALS LPAR factor chanceMod* RPAR;
aiWillDoBlock: AI_WILL_DO EQUALS LPAR factor chanceMod* RPAR;

//base tokens
value: TAG | INT | FLOAT | SCOPE | YES | NO | IDENTIFIER | STRING;

//if & else & conditions
limit: LIMIT EQUALS LPAR trigger* RPAR;                                        
eLSE: ELSE EQUALS LPAR effect* RPAR;                                           
elseIf: ELSE_IF LPAR EQUALS limit effect* RPAR;                               
ifStatement: IF EQUALS LPAR limit effect* RPAR (eLSE | elseIf)*; 

//effects & modifier
scriptedEffect: IDENTIFIER EQUALS (simpleBlock | YES);                         
effect: (EFFECT_NAME EQUALS (TAG | INT | FLOAT | SCOPE | YES | NO | IDENTIFIER | STRING)) | scriptedEffect | ifStatement | scope;      
modifier: MODIFIER_NAME EQUALS (TAG | INT | FLOAT | SCOPE | YES | NO | IDENTIFIER | STRING);
skill_scaled_modifier: SKILL_SACLED_MOD EQUALS LPAR triggerBlock modifierBlock RPAR;

//ai stuff
factor: FACTOR EQUALS (INT | FLOAT);                                          
chanceMod: MODIFIER EQUALS LPAR factor trigger* RPAR;

//triggers
trigger
    : orBlock 
    | andBlock 
    | notBlock
    | (TRIGGER_NAME EQUALS (TAG | INT | FLOAT | SCOPE | YES | NO | IDENTIFIER | STRING)) 
    | scriptedTrigger 
    | customTriggerTooltip
    | scope
    ;                                      
scriptedTrigger: IDENTIFIER EQUALS LPAR trigger* RPAR;      

//scope
scope: SCOPE EQUALS LPAR (effect | trigger | scope )* RPAR;


//complex triggers
orBlock: OR EQUALS LPAR trigger* RPAR;
andBlock: AND EQUALS LPAR trigger* RPAR;
notBlock: NOT EQUALS LPAR trigger* RPAR;

//tooltips
tooltip: TOOLTIP EQUALS STRING;
customTooltip: CUSTOM_TOOLTIP EQUALS STRING;
customTriggerTooltip: CUSTOM_TRIGGER_TOOLTIP EQUALS LPAR tooltip* trigger* RPAR;
desc: DESC EQUALS STRING;

//advisors
advisor: IDENTIFIER EQUALS LPAR monarch_power_advisor (modifier | skill_scaled_modifier)* chanceBlock aiWillDoBlock RPAR;
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
missionBlock: IDENTIFIER EQUALS LPAR (icon_mission | position_mission | completedBy_mission | requiredMissions_mission | provincesToHighlight_mission | triggerBlock | effectBlock | aiWeight_mission)* RPAR;
icon_mission: ICON EQUALS IDENTIFIER;
position_mission: POSITION EQUALS INT;
completedBy_mission: COMPLETED_BY EQUALS STRING;
requiredMissions_mission: REQUIRED_MISSIONS EQUALS LPAR IDENTIFIER* RPAR;
provincesToHighlight_mission: PROVINCES_TO_HIGHLIGHT EQUALS LPAR trigger* RPAR;
aiWeight_mission: AI_WEIGHT EQUALS LPAR factor RPAR;
