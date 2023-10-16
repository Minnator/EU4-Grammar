// Generated from f:/EU4 Grammar/EU4GrammarParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class EU4GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, YES=3, NO=4, NOT=5, MPOWER=6, TAG=7, INT=8, STRING=9, FLOAT=10, 
		DATE=11, MONTHS=12, DAYS=13, LPAR=14, RPAR=15, PLUS=16, MINUS=17, COMMA=18, 
		DOT=19, WHITESPACE=20, SINGLE_LINE_COMMENT=21, IF=22, ELSE=23, ELSE_IF=24, 
		LIMIT=25, WHILE=26, SKILL_SACLED_MOD=27, POTENTIAL=28, TRIGGER=29, EFFECT=30, 
		ALLOW=31, CALC_TRUE_IF=32, AMOUNT=33, DATE_KEY=34, NAME=35, NAMES=36, 
		TIME=37, IS_TIRGGERED_ONLY=38, PREREQUISITES=39, PREREQUISITES_SELF=40, 
		NO_OPINION_HIT=41, COLOR=42, CHECK_VARIABLE=43, SUBTRACKT_VARIABLE=44, 
		CHANGE_VARIABLE=45, SET_VARIABLE=46, DIVIDE_VARIABLE=47, MULTIPLY_VARIABLE=48, 
		EXPORT_TO_VARIABLE=49, WHO=50, RULER_ALLOW=51, HEIR_ALLOW=52, CONSORT_ALLOW=53, 
		WAR_PRIORITY=54, ON_BUILT=55, ON_DESTORYED=56, ON_CONSTRUCTION_STARTED=57, 
		ON_CONSTRUCTION_CANCELED=58, ON_OBSOLETE=59, KEEP_TRIGGER=60, BUILD_TRIGGER=61, 
		TRADE_SHARE=62, PRIVATEER_POWER=63, SHARE=64, HIDDEN_EFFECT=65, HAS_OPINION_MODIFIER=66, 
		REMOVE_OPINION=67, REVERSE_REMOVE_OPINION=68, ADD_OPINION=69, REVERSE_ADD_OPINION=70, 
		REMOVED_EFFECT=71, SAME_FAITH_MODIFIER=72, TOOLTIP=73, CUSTOM_TOOLTIP=74, 
		DESC=75, CUSTOM_TRIGGER_TOOLTIP=76, NUM_OF_OWNED_PROVINCES_WITH=77, Has_GLOBAL_MODIFIER_VALUE=78, 
		IS_IN_WAR=79, HAS_OPINION=80, COUNTRY_EVENT=81, ID=82, SCOPE=83, ADD_PROVINCE_MOD=84, 
		ADD_COUNTRY_MOD=85, DURATION=86, AI=87, MODIFIER=88, CHANCE=89, AI_WILL_DO=90, 
		FACTOR=91, AI_WEIGHT=92, AI_PICK_ANCESTOR=93, AI_PEACE_DESIRE=94, ATTACKER_LEADER=95, 
		DEFENDER_LEADER=96, CASUS_BELLI=97, DEFENDERS=98, ATTACKERS=99, PARTICIPANTS=100, 
		WAR_SCORE=101, START_DATE=102, WAR_GOAL_PROVINCE=103, CONDITIONAL=104, 
		PRE_EFFECT=105, RANGE_TO=106, RANGE_FROM=107, CATEGORY=108, LEVEL_COST=109, 
		ENABLED=110, MAX_LEVEL=111, NUM_SYMBOLS=112, FLAG_COLOR=113, TEXTURES=114, 
		TEXTURE=115, FILE=116, SIZE=117, NOOFFRAMES=118, X=119, Y=120, MALE_NAMES=121, 
		FEMALE_NAMES=122, DYNASTY_NAMES=123, PRIMARY=124, COLOR1=125, COLOR2=126, 
		COLOR3=127, GRAPHICAL_CULTURE=128, REVOLUTIONARY_COLORS=129, HISTORICAL_IDEA_GROUPS=130, 
		HISTORICAL_UNITS=131, MONARCH_NAMES=132, LEADER_NAMES=133, SHIP_NAMES=134, 
		ARMY_NAMES=135, FLEET_NAMES=136, TAX_INCOME=137, NATIVE_SIZE=138, NATIVE_FEROCITY=139, 
		NATIVE_HOSTILENESS=140, TRADE_GOODS=141, CULTURE=142, RELIGION=143, PROVINCES=144, 
		REGION=145, IS_BLESSING=146, SPRITE=147, MONARCH_POWER=148, INLAND=149, 
		COASTAL=150, PROVINCE_MODIFIER=151, STATE_MODIFIER=152, GLOBAL_MODIFIER=153, 
		WAR_GOAL=154, IS_VALID_FOR_SUBJECT=155, ATTACKER_DISABLED_PO=156, HOLY_WAR=157, 
		EXCLUSIVE=158, INDEPENDENCE=159, COALITION=160, SUPPORT_REBELS=161, CALL_EMPIRE_MEMBERS=162, 
		LEAGUE=163, ALLOWED_IN_GOLD_PROVINCES=164, INFLUENCING_FORT=165, ONMAP=166, 
		MAKE_OBSOLETE=167, MANUFACTORY=168, BONUS_MANUFACTORY=169, BONUS_MODIFIER=170, 
		SHOW_SEPERATE=171, BOOKMARK=172, DEFAULT=173, CENTER=174, EASY_COUNTRY=175, 
		COUNTRY=176, PROVINCE=177, START=178, CAN_START=179, OBJECTIVES=180, ABILITIES=181, 
		RELIGIOUS_CONFLICTS=182, PAPACY=183, SLOT=184, GENERIC=185, HAS_COUNTRY_SHIELD=186, 
		POTENTIAL_ON_LOAD=187, ICON=188, POSITION=189, COMPLETED_BY=190, REQUIRED_MISSIONS=191, 
		PROVINCES_TO_HIGHLIGHT=192, IDENTIFIER=193, STRING_TOOLTIP=194, EQUALS_SKIP=195;
	public static final int
		RULE_file = 0, RULE_block = 1, RULE_statement = 2, RULE_trigger_block = 3, 
		RULE_potential_block = 4, RULE_effect_block = 5, RULE_removed_effect_block = 6, 
		RULE_modifier_block = 7, RULE_chance_block = 8, RULE_ai_will_do_block = 9, 
		RULE_allow = 10, RULE_name_block = 11, RULE_color_block = 12, RULE_provinces_block = 13, 
		RULE_file_block = 14, RULE_size_block = 15, RULE_allow_block = 16, RULE_factor = 17, 
		RULE_chance_modifier = 18, RULE_value = 19, RULE_amount = 20, RULE_name = 21, 
		RULE_date = 22, RULE_bool = 23, RULE_months = 24, RULE_limit = 25, RULE_eLSE = 26, 
		RULE_else_if = 27, RULE_if_statement = 28, RULE_while = 29, RULE_scope = 30, 
		RULE_scriptedEffect = 31, RULE_modifier = 32, RULE_skill_scaled_modifier = 33, 
		RULE_effect = 34, RULE_reverse_remove_opinion = 35, RULE_remove_opinion = 36, 
		RULE_add_opinion = 37, RULE_reverse_add_opinion = 38, RULE_hidden_effect = 39, 
		RULE_add_modifier = 40, RULE_multiply_variable = 41, RULE_subtrackt_variable = 42, 
		RULE_change_variable = 43, RULE_set_variable = 44, RULE_divide_variable = 45, 
		RULE_export_to_variable = 46, RULE_country_event = 47, RULE_mana_trigger = 48, 
		RULE_religion_trigger = 49, RULE_trigger = 50, RULE_num_of_owned_provinces_with = 51, 
		RULE_has_opinion_modifier = 52, RULE_calc_true_if = 53, RULE_check_variable = 54, 
		RULE_trade_share = 55, RULE_privateer_power = 56, RULE_scripted_trigger = 57, 
		RULE_prerequisites = 58, RULE_prerequisites_self = 59, RULE_ai_trigger = 60, 
		RULE_is_triggered_only = 61, RULE_region_trigger = 62, RULE_has_global_modifier_value = 63, 
		RULE_is_in_war = 64, RULE_is_in_war_options = 65, RULE_has_opinion = 66, 
		RULE_pre_effect = 67, RULE_conditional_block = 68, RULE_diplomatic_action = 69, 
		RULE_defender_of_faith = 70, RULE_decree_blocks = 71, RULE_decree = 72, 
		RULE_custom_idea_category = 73, RULE_custom_idea_level = 74, RULE_enabled_block = 75, 
		RULE_custom_idea = 76, RULE_flag_color = 77, RULE_texture_block = 78, 
		RULE_custom_country_color = 79, RULE_culture_modifier_block = 80, RULE_culture_names = 81, 
		RULE_culture_group = 82, RULE_culture = 83, RULE_country_tags = 84, RULE_country_color = 85, 
		RULE_common_countires_block = 86, RULE_monarch_names = 87, RULE_common_country = 88, 
		RULE_trade_goods_block = 89, RULE_culture_block = 90, RULE_religion_block = 91, 
		RULE_col_simple_attr = 92, RULE_col_region_attr = 93, RULE_colonial_region = 94, 
		RULE_tooltip = 95, RULE_custom_tooltip = 96, RULE_custom_trigger_tooltip = 97, 
		RULE_desc = 98, RULE_client_state = 99, RULE_is_blessing = 100, RULE_sprite = 101, 
		RULE_church_aspect = 102, RULE_cot_type = 103, RULE_cot_optionals = 104, 
		RULE_province_modifier = 105, RULE_global_modifier = 106, RULE_state_modifier = 107, 
		RULE_center_of_trade = 108, RULE_league = 109, RULE_call_empire_members = 110, 
		RULE_ai_peace_desire = 111, RULE_support_rebels = 112, RULE_coalition = 113, 
		RULE_independence = 114, RULE_exclusive = 115, RULE_holy_war = 116, RULE_attacker_disabled_po = 117, 
		RULE_is_valid_for_subject = 118, RULE_war_goal = 119, RULE_no_opinion_hit = 120, 
		RULE_cb_optionals = 121, RULE_cb_type = 122, RULE_buildings_trigger = 123, 
		RULE_buildings_effect = 124, RULE_manufactory_defines = 125, RULE_bonus_modifier = 126, 
		RULE_cost = 127, RULE_time = 128, RULE_onmap = 129, RULE_show_seperate = 130, 
		RULE_building_attribute = 131, RULE_allowed_in_gold_province = 132, RULE_make_obsolete = 133, 
		RULE_influencing_fort = 134, RULE_building = 135, RULE_bookmark = 136, 
		RULE_ancestor_personality = 137, RULE_war_priority = 138, RULE_ai_pick_ancestor = 139, 
		RULE_ai_personality = 140, RULE_start = 141, RULE_can_start_block = 142, 
		RULE_objective = 143, RULE_objectives_block = 144, RULE_ability = 145, 
		RULE_ability_block = 146, RULE_age = 147, RULE_advisor = 148, RULE_monarch_power_advisor = 149, 
		RULE_missionSeries = 150, RULE_slot_missionSeries = 151, RULE_generic_missionSeries = 152, 
		RULE_hasCountryShield_missionSeries = 153, RULE_potentialOnLoad_missionSeries = 154, 
		RULE_potential_missionSeries = 155, RULE_missionBlock = 156, RULE_icon_mission = 157, 
		RULE_position_mission = 158, RULE_completedBy_mission = 159, RULE_requiredMissions_mission = 160, 
		RULE_provincesToHighlight_mission = 161, RULE_aiWeight_mission = 162;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "block", "statement", "trigger_block", "potential_block", "effect_block", 
			"removed_effect_block", "modifier_block", "chance_block", "ai_will_do_block", 
			"allow", "name_block", "color_block", "provinces_block", "file_block", 
			"size_block", "allow_block", "factor", "chance_modifier", "value", "amount", 
			"name", "date", "bool", "months", "limit", "eLSE", "else_if", "if_statement", 
			"while", "scope", "scriptedEffect", "modifier", "skill_scaled_modifier", 
			"effect", "reverse_remove_opinion", "remove_opinion", "add_opinion", 
			"reverse_add_opinion", "hidden_effect", "add_modifier", "multiply_variable", 
			"subtrackt_variable", "change_variable", "set_variable", "divide_variable", 
			"export_to_variable", "country_event", "mana_trigger", "religion_trigger", 
			"trigger", "num_of_owned_provinces_with", "has_opinion_modifier", "calc_true_if", 
			"check_variable", "trade_share", "privateer_power", "scripted_trigger", 
			"prerequisites", "prerequisites_self", "ai_trigger", "is_triggered_only", 
			"region_trigger", "has_global_modifier_value", "is_in_war", "is_in_war_options", 
			"has_opinion", "pre_effect", "conditional_block", "diplomatic_action", 
			"defender_of_faith", "decree_blocks", "decree", "custom_idea_category", 
			"custom_idea_level", "enabled_block", "custom_idea", "flag_color", "texture_block", 
			"custom_country_color", "culture_modifier_block", "culture_names", "culture_group", 
			"culture", "country_tags", "country_color", "common_countires_block", 
			"monarch_names", "common_country", "trade_goods_block", "culture_block", 
			"religion_block", "col_simple_attr", "col_region_attr", "colonial_region", 
			"tooltip", "custom_tooltip", "custom_trigger_tooltip", "desc", "client_state", 
			"is_blessing", "sprite", "church_aspect", "cot_type", "cot_optionals", 
			"province_modifier", "global_modifier", "state_modifier", "center_of_trade", 
			"league", "call_empire_members", "ai_peace_desire", "support_rebels", 
			"coalition", "independence", "exclusive", "holy_war", "attacker_disabled_po", 
			"is_valid_for_subject", "war_goal", "no_opinion_hit", "cb_optionals", 
			"cb_type", "buildings_trigger", "buildings_effect", "manufactory_defines", 
			"bonus_modifier", "cost", "time", "onmap", "show_seperate", "building_attribute", 
			"allowed_in_gold_province", "make_obsolete", "influencing_fort", "building", 
			"bookmark", "ancestor_personality", "war_priority", "ai_pick_ancestor", 
			"ai_personality", "start", "can_start_block", "objective", "objectives_block", 
			"ability", "ability_block", "age", "advisor", "monarch_power_advisor", 
			"missionSeries", "slot_missionSeries", "generic_missionSeries", "hasCountryShield_missionSeries", 
			"potentialOnLoad_missionSeries", "potential_missionSeries", "missionBlock", 
			"icon_mission", "position_mission", "completedBy_mission", "requiredMissions_mission", 
			"provincesToHighlight_mission", "aiWeight_mission"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'AND'", "'OR'", null, null, null, null, null, null, null, null, 
			null, "'months'", "'days'", "'{'", "'}'", "'+'", "'-'", "','", "'.'", 
			null, null, "'if'", "'else'", "'else_if'", "'limit'", "'while'", "'skill_scaled_modifier'", 
			"'potential'", "'trigger'", "'effect'", "'allow'", "'calc_true_if'", 
			"'amount'", "'date'", "'name'", "'names'", "'time'", "'is_triggered_only'", 
			"'prerequisites'", "'prerequisites_self'", "'no_opinion_hit'", "'color'", 
			"'check_variable'", "'subtract_variable'", "'change_variable'", "'set_variable'", 
			"'divide_variable'", "'multiply_variable'", "'export_to_variable'", "'who'", 
			"'ruler_allow'", "'heir_allow'", "'consort_allow'", "'war_priority'", 
			"'on_built'", "'on_destroyed'", "'on_construction_started'", "'on_construction_canceled'", 
			"'on_obsolete'", "'keep_trigger'", "'build_trigger'", "'trade_share'", 
			"'privateer_power'", "'share'", "'hidden_effect'", "'has_opinion_modifier'", 
			"'remove_opinion'", "'reverse_remove_opinion'", "'add_opinion'", "'reverse_add_opinion'", 
			"'removed_effect'", "'same_faith_modifier'", "'tooltip'", "'custom_tooltip'", 
			"'desc'", "'custom_trigger_tooltip'", "'num_of_owned_provinces_with'", 
			"'has_global_modifier_value'", "'is_in_war'", "'has_opinion'", "'country_event'", 
			"'id'", null, "'add_province_modifier'", "'add_country_modifier'", "'duration'", 
			"'ai'", "'modifier'", "'chance'", "'ai_will_do'", "'factor'", "'ai_weight'", 
			"'ai_pick_ancestor'", "'ai_peace_desire'", "'attacker_leader'", "'defender_leader'", 
			"'casus_belli'", "'defenders'", "'attackers'", "'participants'", "'war_score'", 
			"'start_date'", "'war_goal_province'", "'condition'", "'pre_effect'", 
			"'range_to'", "'range_from'", "'category'", null, "'enabled'", "'max_level'", 
			"'num_symbols'", "'flag_color'", "'textures'", "'texture'", "'file'", 
			"'size'", "'noOfFrames'", "'x'", "'y'", "'male_names'", "'female_names'", 
			"'dynasty_names'", "'primary'", "'color1'", "'color2'", "'color3'", "'graphical_culture'", 
			"'revolutionary_colors'", "'historical_idea_groups'", "'historical_units'", 
			"'monarch_names'", "'leader_names'", "'ship_names'", "'army_names'", 
			"'fleet_names'", "'tax_income'", "'native_size'", "'native_ferocity'", 
			"'native_hostileness'", "'trade_goods'", "'culture'", "'religion'", "'provinces'", 
			"'region'", "'is_blessing'", "'sprite'", "'monarch_power'", "'inland'", 
			"'coastal'", "'province_modifiers'", "'state_modifiers'", "'global_modifiers'", 
			"'war_goal'", "'valid_for_subject'", "'attacker_disabled_po'", "'holy_war'", 
			"'exclusive'", "'independence'", "'coalition'", "'support_rebels'", "'call_empire_members'", 
			"'league'", "'allow_in_gold_provinces'", "'influencing_fort'", "'onmap'", 
			"'make_obsolete'", "'manufactory'", "'bonus_manufactory'", "'bonus_modifier'", 
			"'show_separate'", "'bookmark'", "'default'", "'center'", "'easy_country'", 
			"'country'", "'province'", "'start'", "'can_start'", "'objectives'", 
			"'abilities'", "'religious_conflicts'", "'papacy'", "'slot'", "'generic'", 
			"'has_country_shield'", "'potential_on_load'", "'icon'", "'position'", 
			"'completed_by'", "'required_missions'", "'provinces_to_highlight'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "YES", "NO", "NOT", "MPOWER", "TAG", "INT", "STRING", 
			"FLOAT", "DATE", "MONTHS", "DAYS", "LPAR", "RPAR", "PLUS", "MINUS", "COMMA", 
			"DOT", "WHITESPACE", "SINGLE_LINE_COMMENT", "IF", "ELSE", "ELSE_IF", 
			"LIMIT", "WHILE", "SKILL_SACLED_MOD", "POTENTIAL", "TRIGGER", "EFFECT", 
			"ALLOW", "CALC_TRUE_IF", "AMOUNT", "DATE_KEY", "NAME", "NAMES", "TIME", 
			"IS_TIRGGERED_ONLY", "PREREQUISITES", "PREREQUISITES_SELF", "NO_OPINION_HIT", 
			"COLOR", "CHECK_VARIABLE", "SUBTRACKT_VARIABLE", "CHANGE_VARIABLE", "SET_VARIABLE", 
			"DIVIDE_VARIABLE", "MULTIPLY_VARIABLE", "EXPORT_TO_VARIABLE", "WHO", 
			"RULER_ALLOW", "HEIR_ALLOW", "CONSORT_ALLOW", "WAR_PRIORITY", "ON_BUILT", 
			"ON_DESTORYED", "ON_CONSTRUCTION_STARTED", "ON_CONSTRUCTION_CANCELED", 
			"ON_OBSOLETE", "KEEP_TRIGGER", "BUILD_TRIGGER", "TRADE_SHARE", "PRIVATEER_POWER", 
			"SHARE", "HIDDEN_EFFECT", "HAS_OPINION_MODIFIER", "REMOVE_OPINION", "REVERSE_REMOVE_OPINION", 
			"ADD_OPINION", "REVERSE_ADD_OPINION", "REMOVED_EFFECT", "SAME_FAITH_MODIFIER", 
			"TOOLTIP", "CUSTOM_TOOLTIP", "DESC", "CUSTOM_TRIGGER_TOOLTIP", "NUM_OF_OWNED_PROVINCES_WITH", 
			"Has_GLOBAL_MODIFIER_VALUE", "IS_IN_WAR", "HAS_OPINION", "COUNTRY_EVENT", 
			"ID", "SCOPE", "ADD_PROVINCE_MOD", "ADD_COUNTRY_MOD", "DURATION", "AI", 
			"MODIFIER", "CHANCE", "AI_WILL_DO", "FACTOR", "AI_WEIGHT", "AI_PICK_ANCESTOR", 
			"AI_PEACE_DESIRE", "ATTACKER_LEADER", "DEFENDER_LEADER", "CASUS_BELLI", 
			"DEFENDERS", "ATTACKERS", "PARTICIPANTS", "WAR_SCORE", "START_DATE", 
			"WAR_GOAL_PROVINCE", "CONDITIONAL", "PRE_EFFECT", "RANGE_TO", "RANGE_FROM", 
			"CATEGORY", "LEVEL_COST", "ENABLED", "MAX_LEVEL", "NUM_SYMBOLS", "FLAG_COLOR", 
			"TEXTURES", "TEXTURE", "FILE", "SIZE", "NOOFFRAMES", "X", "Y", "MALE_NAMES", 
			"FEMALE_NAMES", "DYNASTY_NAMES", "PRIMARY", "COLOR1", "COLOR2", "COLOR3", 
			"GRAPHICAL_CULTURE", "REVOLUTIONARY_COLORS", "HISTORICAL_IDEA_GROUPS", 
			"HISTORICAL_UNITS", "MONARCH_NAMES", "LEADER_NAMES", "SHIP_NAMES", "ARMY_NAMES", 
			"FLEET_NAMES", "TAX_INCOME", "NATIVE_SIZE", "NATIVE_FEROCITY", "NATIVE_HOSTILENESS", 
			"TRADE_GOODS", "CULTURE", "RELIGION", "PROVINCES", "REGION", "IS_BLESSING", 
			"SPRITE", "MONARCH_POWER", "INLAND", "COASTAL", "PROVINCE_MODIFIER", 
			"STATE_MODIFIER", "GLOBAL_MODIFIER", "WAR_GOAL", "IS_VALID_FOR_SUBJECT", 
			"ATTACKER_DISABLED_PO", "HOLY_WAR", "EXCLUSIVE", "INDEPENDENCE", "COALITION", 
			"SUPPORT_REBELS", "CALL_EMPIRE_MEMBERS", "LEAGUE", "ALLOWED_IN_GOLD_PROVINCES", 
			"INFLUENCING_FORT", "ONMAP", "MAKE_OBSOLETE", "MANUFACTORY", "BONUS_MANUFACTORY", 
			"BONUS_MODIFIER", "SHOW_SEPERATE", "BOOKMARK", "DEFAULT", "CENTER", "EASY_COUNTRY", 
			"COUNTRY", "PROVINCE", "START", "CAN_START", "OBJECTIVES", "ABILITIES", 
			"RELIGIOUS_CONFLICTS", "PAPACY", "SLOT", "GENERIC", "HAS_COUNTRY_SHIELD", 
			"POTENTIAL_ON_LOAD", "ICON", "POSITION", "COMPLETED_BY", "REQUIRED_MISSIONS", 
			"PROVINCES_TO_HIGHLIGHT", "IDENTIFIER", "STRING_TOOLTIP", "EQUALS_SKIP"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "EU4GrammarParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EU4GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public List<AdvisorContext> advisor() {
			return getRuleContexts(AdvisorContext.class);
		}
		public AdvisorContext advisor(int i) {
			return getRuleContext(AdvisorContext.class,i);
		}
		public List<AgeContext> age() {
			return getRuleContexts(AgeContext.class);
		}
		public AgeContext age(int i) {
			return getRuleContext(AgeContext.class,i);
		}
		public List<Ai_personalityContext> ai_personality() {
			return getRuleContexts(Ai_personalityContext.class);
		}
		public Ai_personalityContext ai_personality(int i) {
			return getRuleContext(Ai_personalityContext.class,i);
		}
		public List<Ancestor_personalityContext> ancestor_personality() {
			return getRuleContexts(Ancestor_personalityContext.class);
		}
		public Ancestor_personalityContext ancestor_personality(int i) {
			return getRuleContext(Ancestor_personalityContext.class,i);
		}
		public List<BookmarkContext> bookmark() {
			return getRuleContexts(BookmarkContext.class);
		}
		public BookmarkContext bookmark(int i) {
			return getRuleContext(BookmarkContext.class,i);
		}
		public List<BuildingContext> building() {
			return getRuleContexts(BuildingContext.class);
		}
		public BuildingContext building(int i) {
			return getRuleContext(BuildingContext.class,i);
		}
		public List<Cb_typeContext> cb_type() {
			return getRuleContexts(Cb_typeContext.class);
		}
		public Cb_typeContext cb_type(int i) {
			return getRuleContext(Cb_typeContext.class,i);
		}
		public List<Center_of_tradeContext> center_of_trade() {
			return getRuleContexts(Center_of_tradeContext.class);
		}
		public Center_of_tradeContext center_of_trade(int i) {
			return getRuleContext(Center_of_tradeContext.class,i);
		}
		public List<Church_aspectContext> church_aspect() {
			return getRuleContexts(Church_aspectContext.class);
		}
		public Church_aspectContext church_aspect(int i) {
			return getRuleContext(Church_aspectContext.class,i);
		}
		public List<Colonial_regionContext> colonial_region() {
			return getRuleContexts(Colonial_regionContext.class);
		}
		public Colonial_regionContext colonial_region(int i) {
			return getRuleContext(Colonial_regionContext.class,i);
		}
		public List<Common_countryContext> common_country() {
			return getRuleContexts(Common_countryContext.class);
		}
		public Common_countryContext common_country(int i) {
			return getRuleContext(Common_countryContext.class,i);
		}
		public List<Country_colorContext> country_color() {
			return getRuleContexts(Country_colorContext.class);
		}
		public Country_colorContext country_color(int i) {
			return getRuleContext(Country_colorContext.class,i);
		}
		public List<Country_tagsContext> country_tags() {
			return getRuleContexts(Country_tagsContext.class);
		}
		public Country_tagsContext country_tags(int i) {
			return getRuleContext(Country_tagsContext.class,i);
		}
		public List<Culture_groupContext> culture_group() {
			return getRuleContexts(Culture_groupContext.class);
		}
		public Culture_groupContext culture_group(int i) {
			return getRuleContext(Culture_groupContext.class,i);
		}
		public List<Custom_country_colorContext> custom_country_color() {
			return getRuleContexts(Custom_country_colorContext.class);
		}
		public Custom_country_colorContext custom_country_color(int i) {
			return getRuleContext(Custom_country_colorContext.class,i);
		}
		public List<Custom_idea_categoryContext> custom_idea_category() {
			return getRuleContexts(Custom_idea_categoryContext.class);
		}
		public Custom_idea_categoryContext custom_idea_category(int i) {
			return getRuleContext(Custom_idea_categoryContext.class,i);
		}
		public List<DecreeContext> decree() {
			return getRuleContexts(DecreeContext.class);
		}
		public DecreeContext decree(int i) {
			return getRuleContext(DecreeContext.class,i);
		}
		public List<Defender_of_faithContext> defender_of_faith() {
			return getRuleContexts(Defender_of_faithContext.class);
		}
		public Defender_of_faithContext defender_of_faith(int i) {
			return getRuleContext(Defender_of_faithContext.class,i);
		}
		public List<Diplomatic_actionContext> diplomatic_action() {
			return getRuleContexts(Diplomatic_actionContext.class);
		}
		public Diplomatic_actionContext diplomatic_action(int i) {
			return getRuleContext(Diplomatic_actionContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(326);
					advisor();
					}
					}
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(332);
					age();
					}
					}
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(338);
					ai_personality();
					}
					}
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(344);
					ancestor_personality();
					}
					}
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BOOKMARK) {
					{
					{
					setState(350);
					bookmark();
					}
					}
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(356);
					building();
					}
					}
					setState(361);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(362);
					cb_type();
					}
					}
					setState(367);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(368);
					center_of_trade();
					}
					}
					setState(373);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(374);
					church_aspect();
					}
					}
					setState(379);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(380);
					colonial_region();
					}
					}
					setState(385);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLOR || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 511L) != 0)) {
					{
					{
					setState(386);
					common_country();
					}
					}
					setState(391);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG) {
					{
					{
					setState(392);
					country_color();
					}
					}
					setState(397);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG) {
					{
					{
					setState(398);
					country_tags();
					}
					}
					setState(403);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(404);
					culture_group();
					}
					}
					setState(409);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NUM_SYMBOLS) {
					{
					{
					setState(410);
					custom_country_color();
					}
					}
					setState(415);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(416);
					custom_idea_category();
					}
					}
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(422);
					decree();
					}
					}
					setState(427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(428);
					defender_of_faith();
					}
					}
					setState(433);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(434);
					diplomatic_action();
					}
					}
					setState(439);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<If_statementContext> if_statement() {
			return getRuleContexts(If_statementContext.class);
		}
		public If_statementContext if_statement(int i) {
			return getRuleContext(If_statementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(LPAR);
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1108307792117888L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1901117L) != 0) || _la==IDENTIFIER) {
				{
				setState(445);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(443);
					statement();
					}
					break;
				case 2:
					{
					setState(444);
					if_statement();
					}
					break;
				}
				}
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(450);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public EffectContext effect() {
			return getRuleContext(EffectContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG:
			case IF:
			case WHILE:
			case SUBTRACKT_VARIABLE:
			case CHANGE_VARIABLE:
			case SET_VARIABLE:
			case DIVIDE_VARIABLE:
			case MULTIPLY_VARIABLE:
			case EXPORT_TO_VARIABLE:
			case HIDDEN_EFFECT:
			case REMOVE_OPINION:
			case REVERSE_REMOVE_OPINION:
			case ADD_OPINION:
			case REVERSE_ADD_OPINION:
			case CUSTOM_TOOLTIP:
			case COUNTRY_EVENT:
			case SCOPE:
			case ADD_PROVINCE_MOD:
			case ADD_COUNTRY_MOD:
			case IDENTIFIER:
				{
				setState(452);
				effect();
				}
				break;
			case LPAR:
				{
				setState(453);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Trigger_blockContext extends ParserRuleContext {
		public TerminalNode TRIGGER() { return getToken(EU4GrammarParser.TRIGGER, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TriggerContext> trigger() {
			return getRuleContexts(TriggerContext.class);
		}
		public TriggerContext trigger(int i) {
			return getRuleContext(TriggerContext.class,i);
		}
		public Trigger_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterTrigger_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitTrigger_block(this);
		}
	}

	public final Trigger_blockContext trigger_block() throws RecognitionException {
		Trigger_blockContext _localctx = new Trigger_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_trigger_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(TRIGGER);
			setState(457);
			match(LPAR);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611677218035203866L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 2259969L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 1125899906842629L) != 0)) {
				{
				{
				setState(458);
				trigger();
				}
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(464);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Potential_blockContext extends ParserRuleContext {
		public TerminalNode POTENTIAL() { return getToken(EU4GrammarParser.POTENTIAL, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TriggerContext> trigger() {
			return getRuleContexts(TriggerContext.class);
		}
		public TriggerContext trigger(int i) {
			return getRuleContext(TriggerContext.class,i);
		}
		public Potential_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potential_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterPotential_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitPotential_block(this);
		}
	}

	public final Potential_blockContext potential_block() throws RecognitionException {
		Potential_blockContext _localctx = new Potential_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_potential_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(POTENTIAL);
			setState(467);
			match(LPAR);
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611677218035203866L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 2259969L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 1125899906842629L) != 0)) {
				{
				{
				setState(468);
				trigger();
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(474);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Effect_blockContext extends ParserRuleContext {
		public TerminalNode EFFECT() { return getToken(EU4GrammarParser.EFFECT, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<EffectContext> effect() {
			return getRuleContexts(EffectContext.class);
		}
		public EffectContext effect(int i) {
			return getRuleContext(EffectContext.class,i);
		}
		public Effect_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effect_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterEffect_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitEffect_block(this);
		}
	}

	public final Effect_blockContext effect_block() throws RecognitionException {
		Effect_blockContext _localctx = new Effect_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_effect_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(EFFECT);
			setState(477);
			match(LPAR);
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1108307792101504L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1901117L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(478);
				effect();
				}
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(484);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Removed_effect_blockContext extends ParserRuleContext {
		public TerminalNode REMOVED_EFFECT() { return getToken(EU4GrammarParser.REMOVED_EFFECT, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<EffectContext> effect() {
			return getRuleContexts(EffectContext.class);
		}
		public EffectContext effect(int i) {
			return getRuleContext(EffectContext.class,i);
		}
		public Removed_effect_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_removed_effect_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterRemoved_effect_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitRemoved_effect_block(this);
		}
	}

	public final Removed_effect_blockContext removed_effect_block() throws RecognitionException {
		Removed_effect_blockContext _localctx = new Removed_effect_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_removed_effect_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(REMOVED_EFFECT);
			setState(487);
			match(LPAR);
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1108307792101504L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1901117L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(488);
				effect();
				}
				}
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(494);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Modifier_blockContext extends ParserRuleContext {
		public TerminalNode MODIFIER() { return getToken(EU4GrammarParser.MODIFIER, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public Modifier_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterModifier_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitModifier_block(this);
		}
	}

	public final Modifier_blockContext modifier_block() throws RecognitionException {
		Modifier_blockContext _localctx = new Modifier_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_modifier_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(MODIFIER);
			setState(497);
			match(LPAR);
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(498);
				modifier();
				}
				}
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(504);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Chance_blockContext extends ParserRuleContext {
		public TerminalNode CHANCE() { return getToken(EU4GrammarParser.CHANCE, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<Chance_modifierContext> chance_modifier() {
			return getRuleContexts(Chance_modifierContext.class);
		}
		public Chance_modifierContext chance_modifier(int i) {
			return getRuleContext(Chance_modifierContext.class,i);
		}
		public Chance_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chance_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterChance_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitChance_block(this);
		}
	}

	public final Chance_blockContext chance_block() throws RecognitionException {
		Chance_blockContext _localctx = new Chance_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_chance_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(CHANCE);
			setState(507);
			match(LPAR);
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FACTOR) {
				{
				{
				setState(508);
				factor();
				}
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(514);
				chance_modifier();
				}
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(520);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ai_will_do_blockContext extends ParserRuleContext {
		public TerminalNode AI_WILL_DO() { return getToken(EU4GrammarParser.AI_WILL_DO, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<Chance_modifierContext> chance_modifier() {
			return getRuleContexts(Chance_modifierContext.class);
		}
		public Chance_modifierContext chance_modifier(int i) {
			return getRuleContext(Chance_modifierContext.class,i);
		}
		public Ai_will_do_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ai_will_do_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterAi_will_do_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitAi_will_do_block(this);
		}
	}

	public final Ai_will_do_blockContext ai_will_do_block() throws RecognitionException {
		Ai_will_do_blockContext _localctx = new Ai_will_do_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ai_will_do_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(AI_WILL_DO);
			setState(523);
			match(LPAR);
			setState(524);
			factor();
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(525);
				chance_modifier();
				}
				}
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(531);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AllowContext extends ParserRuleContext {
		public TerminalNode ALLOW() { return getToken(EU4GrammarParser.ALLOW, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TriggerContext> trigger() {
			return getRuleContexts(TriggerContext.class);
		}
		public TriggerContext trigger(int i) {
			return getRuleContext(TriggerContext.class,i);
		}
		public AllowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterAllow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitAllow(this);
		}
	}

	public final AllowContext allow() throws RecognitionException {
		AllowContext _localctx = new AllowContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_allow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(ALLOW);
			setState(534);
			match(LPAR);
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611677218035203866L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 2259969L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 1125899906842629L) != 0)) {
				{
				{
				setState(535);
				trigger();
				}
				}
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(541);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Name_blockContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TerminalNode> NAME() { return getTokens(EU4GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(EU4GrammarParser.NAME, i);
		}
		public TerminalNode NAMES() { return getToken(EU4GrammarParser.NAMES, 0); }
		public List<Trigger_blockContext> trigger_block() {
			return getRuleContexts(Trigger_blockContext.class);
		}
		public Trigger_blockContext trigger_block(int i) {
			return getRuleContext(Trigger_blockContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(EU4GrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(EU4GrammarParser.STRING, i);
		}
		public Name_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterName_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitName_block(this);
		}
	}

	public final Name_blockContext name_block() throws RecognitionException {
		Name_blockContext _localctx = new Name_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_name_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==NAMES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(544);
			match(LPAR);
			setState(548); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(548);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NAME:
					{
					{
					setState(545);
					match(NAME);
					setState(546);
					match(STRING);
					}
					}
					break;
				case TRIGGER:
					{
					setState(547);
					trigger_block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(550); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TRIGGER || _la==NAME );
			setState(552);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Color_blockContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(EU4GrammarParser.COLOR, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public Color_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterColor_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitColor_block(this);
		}
	}

	public final Color_blockContext color_block() throws RecognitionException {
		Color_blockContext _localctx = new Color_blockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_color_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(COLOR);
			setState(555);
			match(LPAR);
			setState(557); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(556);
					match(INT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(559); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(562); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(561);
					match(INT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(564); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(567); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(566);
				match(INT);
				}
				}
				setState(569); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT );
			setState(571);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Provinces_blockContext extends ParserRuleContext {
		public TerminalNode PROVINCES() { return getToken(EU4GrammarParser.PROVINCES, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public Provinces_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_provinces_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterProvinces_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitProvinces_block(this);
		}
	}

	public final Provinces_blockContext provinces_block() throws RecognitionException {
		Provinces_blockContext _localctx = new Provinces_blockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_provinces_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(PROVINCES);
			setState(574);
			match(LPAR);
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(576); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(575);
						match(INT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(578); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(585);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class File_blockContext extends ParserRuleContext {
		public TerminalNode FILE() { return getToken(EU4GrammarParser.FILE, 0); }
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public File_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterFile_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitFile_block(this);
		}
	}

	public final File_blockContext file_block() throws RecognitionException {
		File_blockContext _localctx = new File_blockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_file_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(FILE);
			setState(588);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Size_blockContext extends ParserRuleContext {
		public TerminalNode SIZE() { return getToken(EU4GrammarParser.SIZE, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode X() { return getToken(EU4GrammarParser.X, 0); }
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public TerminalNode Y() { return getToken(EU4GrammarParser.Y, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public Size_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterSize_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitSize_block(this);
		}
	}

	public final Size_blockContext size_block() throws RecognitionException {
		Size_blockContext _localctx = new Size_blockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_size_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(SIZE);
			setState(591);
			match(LPAR);
			setState(592);
			match(X);
			setState(593);
			match(INT);
			setState(594);
			match(Y);
			setState(595);
			match(INT);
			setState(596);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Allow_blockContext extends ParserRuleContext {
		public TerminalNode ALLOW() { return getToken(EU4GrammarParser.ALLOW, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TriggerContext> trigger() {
			return getRuleContexts(TriggerContext.class);
		}
		public TriggerContext trigger(int i) {
			return getRuleContext(TriggerContext.class,i);
		}
		public Allow_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allow_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterAllow_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitAllow_block(this);
		}
	}

	public final Allow_blockContext allow_block() throws RecognitionException {
		Allow_blockContext _localctx = new Allow_blockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_allow_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(ALLOW);
			setState(599);
			match(LPAR);
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611677218035203866L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 2259969L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 1125899906842629L) != 0)) {
				{
				{
				setState(600);
				trigger();
				}
				}
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(606);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode FACTOR() { return getToken(EU4GrammarParser.FACTOR, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(EU4GrammarParser.FLOAT, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(FACTOR);
			setState(609);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Chance_modifierContext extends ParserRuleContext {
		public TerminalNode MODIFIER() { return getToken(EU4GrammarParser.MODIFIER, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TriggerContext> trigger() {
			return getRuleContexts(TriggerContext.class);
		}
		public TriggerContext trigger(int i) {
			return getRuleContext(TriggerContext.class,i);
		}
		public Chance_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chance_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterChance_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitChance_modifier(this);
		}
	}

	public final Chance_modifierContext chance_modifier() throws RecognitionException {
		Chance_modifierContext _localctx = new Chance_modifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_chance_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(MODIFIER);
			setState(612);
			match(LPAR);
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611677218035203866L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 35814401L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 1125899906842629L) != 0)) {
				{
				setState(615);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FACTOR:
					{
					setState(613);
					factor();
					}
					break;
				case AND:
				case OR:
				case NOT:
				case MPOWER:
				case TAG:
				case IF:
				case CALC_TRUE_IF:
				case CHECK_VARIABLE:
				case TRADE_SHARE:
				case PRIVATEER_POWER:
				case HAS_OPINION_MODIFIER:
				case CUSTOM_TRIGGER_TOOLTIP:
				case NUM_OF_OWNED_PROVINCES_WITH:
				case Has_GLOBAL_MODIFIER_VALUE:
				case IS_IN_WAR:
				case HAS_OPINION:
				case SCOPE:
				case AI:
				case RELIGION:
				case REGION:
				case IDENTIFIER:
					{
					setState(614);
					trigger();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(620);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public TerminalNode SCOPE() { return getToken(EU4GrammarParser.SCOPE, 0); }
		public TerminalNode FLOAT() { return getToken(EU4GrammarParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1944L) != 0) || _la==SCOPE || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AmountContext extends ParserRuleContext {
		public TerminalNode AMOUNT() { return getToken(EU4GrammarParser.AMOUNT, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public AmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_amount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterAmount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitAmount(this);
		}
	}

	public final AmountContext amount() throws RecognitionException {
		AmountContext _localctx = new AmountContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_amount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(AMOUNT);
			setState(625);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(EU4GrammarParser.NAME, 0); }
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(NAME);
			setState(628);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DateContext extends ParserRuleContext {
		public TerminalNode DATE_KEY() { return getToken(EU4GrammarParser.DATE_KEY, 0); }
		public TerminalNode DATE() { return getToken(EU4GrammarParser.DATE, 0); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitDate(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			match(DATE_KEY);
			setState(631);
			match(DATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ParserRuleContext {
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			_la = _input.LA(1);
			if ( !(_la==YES || _la==NO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MonthsContext extends ParserRuleContext {
		public TerminalNode MONTHS() { return getToken(EU4GrammarParser.MONTHS, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public MonthsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_months; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterMonths(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitMonths(this);
		}
	}

	public final MonthsContext months() throws RecognitionException {
		MonthsContext _localctx = new MonthsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_months);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(MONTHS);
			setState(636);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LimitContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(EU4GrammarParser.LIMIT, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TriggerContext> trigger() {
			return getRuleContexts(TriggerContext.class);
		}
		public TriggerContext trigger(int i) {
			return getRuleContext(TriggerContext.class,i);
		}
		public LimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterLimit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitLimit(this);
		}
	}

	public final LimitContext limit() throws RecognitionException {
		LimitContext _localctx = new LimitContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_limit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(LIMIT);
			setState(639);
			match(LPAR);
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611677218035203866L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 2259969L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 1125899906842629L) != 0)) {
				{
				{
				setState(640);
				trigger();
				}
				}
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(646);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ELSEContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(EU4GrammarParser.ELSE, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<EffectContext> effect() {
			return getRuleContexts(EffectContext.class);
		}
		public EffectContext effect(int i) {
			return getRuleContext(EffectContext.class,i);
		}
		public ELSEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eLSE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterELSE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitELSE(this);
		}
	}

	public final ELSEContext eLSE() throws RecognitionException {
		ELSEContext _localctx = new ELSEContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_eLSE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(ELSE);
			setState(649);
			match(LPAR);
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1108307792101504L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1901117L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(650);
				effect();
				}
				}
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(656);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_ifContext extends ParserRuleContext {
		public TerminalNode ELSE_IF() { return getToken(EU4GrammarParser.ELSE_IF, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public LimitContext limit() {
			return getRuleContext(LimitContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<EffectContext> effect() {
			return getRuleContexts(EffectContext.class);
		}
		public EffectContext effect(int i) {
			return getRuleContext(EffectContext.class,i);
		}
		public Else_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterElse_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitElse_if(this);
		}
	}

	public final Else_ifContext else_if() throws RecognitionException {
		Else_ifContext _localctx = new Else_ifContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_else_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(ELSE_IF);
			setState(659);
			match(LPAR);
			setState(660);
			limit();
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1108307792101504L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1901117L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(661);
				effect();
				}
				}
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(667);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(EU4GrammarParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public LimitContext limit() {
			return getRuleContext(LimitContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<EffectContext> effect() {
			return getRuleContexts(EffectContext.class);
		}
		public EffectContext effect(int i) {
			return getRuleContext(EffectContext.class,i);
		}
		public List<ELSEContext> eLSE() {
			return getRuleContexts(ELSEContext.class);
		}
		public ELSEContext eLSE(int i) {
			return getRuleContext(ELSEContext.class,i);
		}
		public List<Else_ifContext> else_if() {
			return getRuleContexts(Else_ifContext.class);
		}
		public Else_ifContext else_if(int i) {
			return getRuleContext(Else_ifContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(IF);
			setState(670);
			match(LPAR);
			setState(671);
			limit();
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1108307792101504L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1901117L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(672);
				effect();
				}
				}
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(678);
			match(RPAR);
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE || _la==ELSE_IF) {
				{
				setState(681);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(679);
					eLSE();
					}
					break;
				case ELSE_IF:
					{
					setState(680);
					else_if();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(EU4GrammarParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public LimitContext limit() {
			return getRuleContext(LimitContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<EffectContext> effect() {
			return getRuleContexts(EffectContext.class);
		}
		public EffectContext effect(int i) {
			return getRuleContext(EffectContext.class,i);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitWhile(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(WHILE);
			setState(687);
			match(LPAR);
			setState(688);
			limit();
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1108307792101504L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1901117L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(689);
				effect();
				}
				}
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(695);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScopeContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode SCOPE() { return getToken(EU4GrammarParser.SCOPE, 0); }
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public List<EffectContext> effect() {
			return getRuleContexts(EffectContext.class);
		}
		public EffectContext effect(int i) {
			return getRuleContext(EffectContext.class,i);
		}
		public List<TriggerContext> trigger() {
			return getRuleContexts(TriggerContext.class);
		}
		public TriggerContext trigger(int i) {
			return getRuleContext(TriggerContext.class,i);
		}
		public List<ScopeContext> scope() {
			return getRuleContexts(ScopeContext.class);
		}
		public ScopeContext scope(int i) {
			return getRuleContext(ScopeContext.class,i);
		}
		public List<LimitContext> limit() {
			return getRuleContexts(LimitContext.class);
		}
		public LimitContext limit(int i) {
			return getRuleContext(LimitContext.class,i);
		}
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitScope(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			_la = _input.LA(1);
			if ( !(_la==TAG || _la==SCOPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(698);
			match(LPAR);
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4610568910213742362L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 6158911L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 1125899906842629L) != 0)) {
				{
				setState(703);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(699);
					effect();
					}
					break;
				case 2:
					{
					setState(700);
					trigger();
					}
					break;
				case 3:
					{
					setState(701);
					scope();
					}
					break;
				case 4:
					{
					setState(702);
					limit();
					}
					break;
				}
				}
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(708);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptedEffectContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<EffectContext> effect() {
			return getRuleContexts(EffectContext.class);
		}
		public EffectContext effect(int i) {
			return getRuleContext(EffectContext.class,i);
		}
		public ScriptedEffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptedEffect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterScriptedEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitScriptedEffect(this);
		}
	}

	public final ScriptedEffectContext scriptedEffect() throws RecognitionException {
		ScriptedEffectContext _localctx = new ScriptedEffectContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_scriptedEffect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(IDENTIFIER);
			setState(720);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				{
				setState(711);
				match(LPAR);
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1108307792101504L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1901117L) != 0) || _la==IDENTIFIER) {
					{
					{
					setState(712);
					effect();
					}
					}
					setState(717);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(718);
				match(RPAR);
				}
				}
				break;
			case YES:
				{
				setState(719);
				match(YES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModifierContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public TerminalNode SCOPE() { return getToken(EU4GrammarParser.SCOPE, 0); }
		public TerminalNode FLOAT() { return getToken(EU4GrammarParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(IDENTIFIER);
			setState(723);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1944L) != 0) || _la==SCOPE || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Skill_scaled_modifierContext extends ParserRuleContext {
		public TerminalNode SKILL_SACLED_MOD() { return getToken(EU4GrammarParser.SKILL_SACLED_MOD, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public Trigger_blockContext trigger_block() {
			return getRuleContext(Trigger_blockContext.class,0);
		}
		public Modifier_blockContext modifier_block() {
			return getRuleContext(Modifier_blockContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public Skill_scaled_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skill_scaled_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterSkill_scaled_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitSkill_scaled_modifier(this);
		}
	}

	public final Skill_scaled_modifierContext skill_scaled_modifier() throws RecognitionException {
		Skill_scaled_modifierContext _localctx = new Skill_scaled_modifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_skill_scaled_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			match(SKILL_SACLED_MOD);
			setState(726);
			match(LPAR);
			setState(727);
			trigger_block();
			setState(728);
			modifier_block();
			setState(729);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EffectContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public TerminalNode SCOPE() { return getToken(EU4GrammarParser.SCOPE, 0); }
		public TerminalNode FLOAT() { return getToken(EU4GrammarParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public ScriptedEffectContext scriptedEffect() {
			return getRuleContext(ScriptedEffectContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public Custom_tooltipContext custom_tooltip() {
			return getRuleContext(Custom_tooltipContext.class,0);
		}
		public Add_modifierContext add_modifier() {
			return getRuleContext(Add_modifierContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public Multiply_variableContext multiply_variable() {
			return getRuleContext(Multiply_variableContext.class,0);
		}
		public Subtrackt_variableContext subtrackt_variable() {
			return getRuleContext(Subtrackt_variableContext.class,0);
		}
		public Change_variableContext change_variable() {
			return getRuleContext(Change_variableContext.class,0);
		}
		public Set_variableContext set_variable() {
			return getRuleContext(Set_variableContext.class,0);
		}
		public Divide_variableContext divide_variable() {
			return getRuleContext(Divide_variableContext.class,0);
		}
		public Export_to_variableContext export_to_variable() {
			return getRuleContext(Export_to_variableContext.class,0);
		}
		public Hidden_effectContext hidden_effect() {
			return getRuleContext(Hidden_effectContext.class,0);
		}
		public Reverse_remove_opinionContext reverse_remove_opinion() {
			return getRuleContext(Reverse_remove_opinionContext.class,0);
		}
		public Remove_opinionContext remove_opinion() {
			return getRuleContext(Remove_opinionContext.class,0);
		}
		public Add_opinionContext add_opinion() {
			return getRuleContext(Add_opinionContext.class,0);
		}
		public Reverse_add_opinionContext reverse_add_opinion() {
			return getRuleContext(Reverse_add_opinionContext.class,0);
		}
		public Country_eventContext country_event() {
			return getRuleContext(Country_eventContext.class,0);
		}
		public EffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitEffect(this);
		}
	}

	public final EffectContext effect() throws RecognitionException {
		EffectContext _localctx = new EffectContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_effect);
		int _la;
		try {
			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				match(IDENTIFIER);
				setState(732);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1944L) != 0) || _la==SCOPE || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(733);
				scriptedEffect();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(734);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(735);
				scope();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(736);
				custom_tooltip();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(737);
				add_modifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(738);
				while_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(739);
				multiply_variable();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(740);
				subtrackt_variable();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(741);
				change_variable();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(742);
				set_variable();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(743);
				divide_variable();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(744);
				export_to_variable();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(745);
				hidden_effect();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(746);
				reverse_remove_opinion();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(747);
				remove_opinion();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(748);
				add_opinion();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(749);
				reverse_add_opinion();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(750);
				country_event();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Reverse_remove_opinionContext extends ParserRuleContext {
		public TerminalNode REVERSE_REMOVE_OPINION() { return getToken(EU4GrammarParser.REVERSE_REMOVE_OPINION, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode WHO() { return getToken(EU4GrammarParser.WHO, 0); }
		public TerminalNode MODIFIER() { return getToken(EU4GrammarParser.MODIFIER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode SCOPE() { return getToken(EU4GrammarParser.SCOPE, 0); }
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public Reverse_remove_opinionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reverse_remove_opinion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterReverse_remove_opinion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitReverse_remove_opinion(this);
		}
	}

	public final Reverse_remove_opinionContext reverse_remove_opinion() throws RecognitionException {
		Reverse_remove_opinionContext _localctx = new Reverse_remove_opinionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_reverse_remove_opinion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(REVERSE_REMOVE_OPINION);
			setState(754);
			match(LPAR);
			setState(755);
			match(WHO);
			setState(756);
			_la = _input.LA(1);
			if ( !(_la==TAG || _la==SCOPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(757);
			match(MODIFIER);
			setState(758);
			match(IDENTIFIER);
			setState(759);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Remove_opinionContext extends ParserRuleContext {
		public TerminalNode REMOVE_OPINION() { return getToken(EU4GrammarParser.REMOVE_OPINION, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode WHO() { return getToken(EU4GrammarParser.WHO, 0); }
		public TerminalNode MODIFIER() { return getToken(EU4GrammarParser.MODIFIER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode SCOPE() { return getToken(EU4GrammarParser.SCOPE, 0); }
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public Remove_opinionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remove_opinion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterRemove_opinion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitRemove_opinion(this);
		}
	}

	public final Remove_opinionContext remove_opinion() throws RecognitionException {
		Remove_opinionContext _localctx = new Remove_opinionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_remove_opinion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			match(REMOVE_OPINION);
			setState(762);
			match(LPAR);
			setState(763);
			match(WHO);
			setState(764);
			_la = _input.LA(1);
			if ( !(_la==TAG || _la==SCOPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(765);
			match(MODIFIER);
			setState(766);
			match(IDENTIFIER);
			setState(767);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Add_opinionContext extends ParserRuleContext {
		public TerminalNode ADD_OPINION() { return getToken(EU4GrammarParser.ADD_OPINION, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode WHO() { return getToken(EU4GrammarParser.WHO, 0); }
		public TerminalNode MODIFIER() { return getToken(EU4GrammarParser.MODIFIER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode SCOPE() { return getToken(EU4GrammarParser.SCOPE, 0); }
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public Add_opinionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_opinion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterAdd_opinion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitAdd_opinion(this);
		}
	}

	public final Add_opinionContext add_opinion() throws RecognitionException {
		Add_opinionContext _localctx = new Add_opinionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_add_opinion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(ADD_OPINION);
			setState(770);
			match(LPAR);
			setState(771);
			match(WHO);
			setState(772);
			_la = _input.LA(1);
			if ( !(_la==TAG || _la==SCOPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(773);
			match(MODIFIER);
			setState(774);
			match(IDENTIFIER);
			setState(775);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Reverse_add_opinionContext extends ParserRuleContext {
		public TerminalNode REVERSE_ADD_OPINION() { return getToken(EU4GrammarParser.REVERSE_ADD_OPINION, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode WHO() { return getToken(EU4GrammarParser.WHO, 0); }
		public TerminalNode MODIFIER() { return getToken(EU4GrammarParser.MODIFIER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode SCOPE() { return getToken(EU4GrammarParser.SCOPE, 0); }
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public Reverse_add_opinionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reverse_add_opinion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterReverse_add_opinion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitReverse_add_opinion(this);
		}
	}

	public final Reverse_add_opinionContext reverse_add_opinion() throws RecognitionException {
		Reverse_add_opinionContext _localctx = new Reverse_add_opinionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_reverse_add_opinion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(REVERSE_ADD_OPINION);
			setState(778);
			match(LPAR);
			setState(779);
			match(WHO);
			setState(780);
			_la = _input.LA(1);
			if ( !(_la==TAG || _la==SCOPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(781);
			match(MODIFIER);
			setState(782);
			match(IDENTIFIER);
			setState(783);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Hidden_effectContext extends ParserRuleContext {
		public TerminalNode HIDDEN_EFFECT() { return getToken(EU4GrammarParser.HIDDEN_EFFECT, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<EffectContext> effect() {
			return getRuleContexts(EffectContext.class);
		}
		public EffectContext effect(int i) {
			return getRuleContext(EffectContext.class,i);
		}
		public Hidden_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hidden_effect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterHidden_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitHidden_effect(this);
		}
	}

	public final Hidden_effectContext hidden_effect() throws RecognitionException {
		Hidden_effectContext _localctx = new Hidden_effectContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_hidden_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(HIDDEN_EFFECT);
			setState(786);
			match(LPAR);
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1108307792101504L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1901117L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(787);
				effect();
				}
				}
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(793);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Add_modifierContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode NAME() { return getToken(EU4GrammarParser.NAME, 0); }
		public TerminalNode DURATION() { return getToken(EU4GrammarParser.DURATION, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode ADD_COUNTRY_MOD() { return getToken(EU4GrammarParser.ADD_COUNTRY_MOD, 0); }
		public TerminalNode ADD_PROVINCE_MOD() { return getToken(EU4GrammarParser.ADD_PROVINCE_MOD, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public Add_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterAdd_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitAdd_modifier(this);
		}
	}

	public final Add_modifierContext add_modifier() throws RecognitionException {
		Add_modifierContext _localctx = new Add_modifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_add_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			_la = _input.LA(1);
			if ( !(_la==ADD_PROVINCE_MOD || _la==ADD_COUNTRY_MOD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(796);
			match(LPAR);
			setState(797);
			match(NAME);
			setState(798);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(799);
			match(DURATION);
			setState(800);
			match(INT);
			setState(801);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Multiply_variableContext extends ParserRuleContext {
		public TerminalNode MULTIPLY_VARIABLE() { return getToken(EU4GrammarParser.MULTIPLY_VARIABLE, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode FLOAT() { return getToken(EU4GrammarParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public Multiply_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterMultiply_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitMultiply_variable(this);
		}
	}

	public final Multiply_variableContext multiply_variable() throws RecognitionException {
		Multiply_variableContext _localctx = new Multiply_variableContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_multiply_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(MULTIPLY_VARIABLE);
			setState(804);
			match(LPAR);
			setState(805);
			match(IDENTIFIER);
			setState(806);
			match(IDENTIFIER);
			setState(811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				{
				setState(807);
				match(IDENTIFIER);
				setState(808);
				match(IDENTIFIER);
				}
				}
				break;
			case 2:
				{
				{
				setState(809);
				match(IDENTIFIER);
				setState(810);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			}
			setState(813);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Subtrackt_variableContext extends ParserRuleContext {
		public TerminalNode SUBTRACKT_VARIABLE() { return getToken(EU4GrammarParser.SUBTRACKT_VARIABLE, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode FLOAT() { return getToken(EU4GrammarParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public Subtrackt_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtrackt_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterSubtrackt_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitSubtrackt_variable(this);
		}
	}

	public final Subtrackt_variableContext subtrackt_variable() throws RecognitionException {
		Subtrackt_variableContext _localctx = new Subtrackt_variableContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_subtrackt_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			match(SUBTRACKT_VARIABLE);
			setState(816);
			match(LPAR);
			setState(817);
			match(IDENTIFIER);
			setState(818);
			match(IDENTIFIER);
			setState(823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				{
				setState(819);
				match(IDENTIFIER);
				setState(820);
				match(IDENTIFIER);
				}
				}
				break;
			case 2:
				{
				{
				setState(821);
				match(IDENTIFIER);
				setState(822);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			}
			setState(825);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Change_variableContext extends ParserRuleContext {
		public TerminalNode CHANGE_VARIABLE() { return getToken(EU4GrammarParser.CHANGE_VARIABLE, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode FLOAT() { return getToken(EU4GrammarParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public Change_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_change_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterChange_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitChange_variable(this);
		}
	}

	public final Change_variableContext change_variable() throws RecognitionException {
		Change_variableContext _localctx = new Change_variableContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_change_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			match(CHANGE_VARIABLE);
			setState(828);
			match(LPAR);
			setState(829);
			match(IDENTIFIER);
			setState(830);
			match(IDENTIFIER);
			setState(835);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				{
				setState(831);
				match(IDENTIFIER);
				setState(832);
				match(IDENTIFIER);
				}
				}
				break;
			case 2:
				{
				{
				setState(833);
				match(IDENTIFIER);
				setState(834);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			}
			setState(837);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Set_variableContext extends ParserRuleContext {
		public TerminalNode SET_VARIABLE() { return getToken(EU4GrammarParser.SET_VARIABLE, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode FLOAT() { return getToken(EU4GrammarParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public Set_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterSet_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitSet_variable(this);
		}
	}

	public final Set_variableContext set_variable() throws RecognitionException {
		Set_variableContext _localctx = new Set_variableContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_set_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			match(SET_VARIABLE);
			setState(840);
			match(LPAR);
			setState(841);
			match(IDENTIFIER);
			setState(842);
			match(IDENTIFIER);
			setState(847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				{
				setState(843);
				match(IDENTIFIER);
				setState(844);
				match(IDENTIFIER);
				}
				}
				break;
			case 2:
				{
				{
				setState(845);
				match(IDENTIFIER);
				setState(846);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			}
			setState(849);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Divide_variableContext extends ParserRuleContext {
		public TerminalNode DIVIDE_VARIABLE() { return getToken(EU4GrammarParser.DIVIDE_VARIABLE, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode FLOAT() { return getToken(EU4GrammarParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public Divide_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divide_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterDivide_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitDivide_variable(this);
		}
	}

	public final Divide_variableContext divide_variable() throws RecognitionException {
		Divide_variableContext _localctx = new Divide_variableContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_divide_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			match(DIVIDE_VARIABLE);
			setState(852);
			match(LPAR);
			setState(853);
			match(IDENTIFIER);
			setState(854);
			match(IDENTIFIER);
			setState(859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				{
				setState(855);
				match(IDENTIFIER);
				setState(856);
				match(IDENTIFIER);
				}
				}
				break;
			case 2:
				{
				{
				setState(857);
				match(IDENTIFIER);
				setState(858);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			}
			setState(861);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Export_to_variableContext extends ParserRuleContext {
		public TerminalNode EXPORT_TO_VARIABLE() { return getToken(EU4GrammarParser.EXPORT_TO_VARIABLE, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode WHO() { return getToken(EU4GrammarParser.WHO, 0); }
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public TerminalNode SCOPE() { return getToken(EU4GrammarParser.SCOPE, 0); }
		public Export_to_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export_to_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterExport_to_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitExport_to_variable(this);
		}
	}

	public final Export_to_variableContext export_to_variable() throws RecognitionException {
		Export_to_variableContext _localctx = new Export_to_variableContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_export_to_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			match(EXPORT_TO_VARIABLE);
			setState(864);
			match(LPAR);
			setState(865);
			match(IDENTIFIER);
			setState(866);
			match(IDENTIFIER);
			setState(867);
			match(IDENTIFIER);
			setState(868);
			match(IDENTIFIER);
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHO) {
				{
				setState(869);
				match(WHO);
				setState(870);
				_la = _input.LA(1);
				if ( !(_la==TAG || _la==SCOPE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(873);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Country_eventContext extends ParserRuleContext {
		public TerminalNode COUNTRY_EVENT() { return getToken(EU4GrammarParser.COUNTRY_EVENT, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode ID() { return getToken(EU4GrammarParser.ID, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(EU4GrammarParser.DOT, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public TerminalNode DAYS() { return getToken(EU4GrammarParser.DAYS, 0); }
		public Country_eventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_country_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCountry_event(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCountry_event(this);
		}
	}

	public final Country_eventContext country_event() throws RecognitionException {
		Country_eventContext _localctx = new Country_eventContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_country_event);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			match(COUNTRY_EVENT);
			setState(876);
			match(LPAR);
			setState(877);
			match(ID);
			setState(878);
			match(IDENTIFIER);
			setState(879);
			match(DOT);
			setState(880);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DAYS) {
				{
				setState(881);
				match(DAYS);
				setState(882);
				match(INT);
				}
			}

			setState(885);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mana_triggerContext extends ParserRuleContext {
		public TerminalNode MPOWER() { return getToken(EU4GrammarParser.MPOWER, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public Mana_triggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mana_trigger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterMana_trigger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitMana_trigger(this);
		}
	}

	public final Mana_triggerContext mana_trigger() throws RecognitionException {
		Mana_triggerContext _localctx = new Mana_triggerContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_mana_trigger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			match(MPOWER);
			setState(888);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Religion_triggerContext extends ParserRuleContext {
		public TerminalNode RELIGION() { return getToken(EU4GrammarParser.RELIGION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode SCOPE() { return getToken(EU4GrammarParser.SCOPE, 0); }
		public Religion_triggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_religion_trigger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterReligion_trigger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitReligion_trigger(this);
		}
	}

	public final Religion_triggerContext religion_trigger() throws RecognitionException {
		Religion_triggerContext _localctx = new Religion_triggerContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_religion_trigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			match(RELIGION);
			setState(891);
			_la = _input.LA(1);
			if ( !(_la==SCOPE || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TriggerContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public TerminalNode SCOPE() { return getToken(EU4GrammarParser.SCOPE, 0); }
		public TerminalNode FLOAT() { return getToken(EU4GrammarParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode OR() { return getToken(EU4GrammarParser.OR, 0); }
		public TerminalNode AND() { return getToken(EU4GrammarParser.AND, 0); }
		public TerminalNode NOT() { return getToken(EU4GrammarParser.NOT, 0); }
		public List<TriggerContext> trigger() {
			return getRuleContexts(TriggerContext.class);
		}
		public TriggerContext trigger(int i) {
			return getRuleContext(TriggerContext.class,i);
		}
		public Scripted_triggerContext scripted_trigger() {
			return getRuleContext(Scripted_triggerContext.class,0);
		}
		public Custom_trigger_tooltipContext custom_trigger_tooltip() {
			return getRuleContext(Custom_trigger_tooltipContext.class,0);
		}
		public Calc_true_ifContext calc_true_if() {
			return getRuleContext(Calc_true_ifContext.class,0);
		}
		public Ai_triggerContext ai_trigger() {
			return getRuleContext(Ai_triggerContext.class,0);
		}
		public Mana_triggerContext mana_trigger() {
			return getRuleContext(Mana_triggerContext.class,0);
		}
		public Trade_shareContext trade_share() {
			return getRuleContext(Trade_shareContext.class,0);
		}
		public Privateer_powerContext privateer_power() {
			return getRuleContext(Privateer_powerContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Check_variableContext check_variable() {
			return getRuleContext(Check_variableContext.class,0);
		}
		public Has_opinion_modifierContext has_opinion_modifier() {
			return getRuleContext(Has_opinion_modifierContext.class,0);
		}
		public Religion_triggerContext religion_trigger() {
			return getRuleContext(Religion_triggerContext.class,0);
		}
		public Num_of_owned_provinces_withContext num_of_owned_provinces_with() {
			return getRuleContext(Num_of_owned_provinces_withContext.class,0);
		}
		public Has_global_modifier_valueContext has_global_modifier_value() {
			return getRuleContext(Has_global_modifier_valueContext.class,0);
		}
		public Is_in_warContext is_in_war() {
			return getRuleContext(Is_in_warContext.class,0);
		}
		public Has_opinionContext has_opinion() {
			return getRuleContext(Has_opinionContext.class,0);
		}
		public Region_triggerContext region_trigger() {
			return getRuleContext(Region_triggerContext.class,0);
		}
		public TriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterTrigger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitTrigger(this);
		}
	}

	public final TriggerContext trigger() throws RecognitionException {
		TriggerContext _localctx = new TriggerContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_trigger);
		int _la;
		try {
			setState(920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(893);
				match(IDENTIFIER);
				setState(894);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1944L) != 0) || _la==SCOPE || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(895);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 166L) != 0) || _la==SCOPE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(896);
				match(LPAR);
				setState(900);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611677218035203866L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 2259969L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 1125899906842629L) != 0)) {
					{
					{
					setState(897);
					trigger();
					}
					}
					setState(902);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(903);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(904);
				scripted_trigger();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(905);
				custom_trigger_tooltip();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(906);
				calc_true_if();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(907);
				ai_trigger();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(908);
				mana_trigger();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(909);
				trade_share();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(910);
				privateer_power();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(911);
				if_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(912);
				check_variable();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(913);
				has_opinion_modifier();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(914);
				religion_trigger();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(915);
				num_of_owned_provinces_with();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(916);
				has_global_modifier_value();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(917);
				is_in_war();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(918);
				has_opinion();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(919);
				region_trigger();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Num_of_owned_provinces_withContext extends ParserRuleContext {
		public TerminalNode NUM_OF_OWNED_PROVINCES_WITH() { return getToken(EU4GrammarParser.NUM_OF_OWNED_PROVINCES_WITH, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TriggerContext> trigger() {
			return getRuleContexts(TriggerContext.class);
		}
		public TriggerContext trigger(int i) {
			return getRuleContext(TriggerContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public Num_of_owned_provinces_withContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_of_owned_provinces_with; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterNum_of_owned_provinces_with(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitNum_of_owned_provinces_with(this);
		}
	}

	public final Num_of_owned_provinces_withContext num_of_owned_provinces_with() throws RecognitionException {
		Num_of_owned_provinces_withContext _localctx = new Num_of_owned_provinces_withContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_num_of_owned_provinces_with);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			match(NUM_OF_OWNED_PROVINCES_WITH);
			setState(923);
			match(LPAR);
			setState(927); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(927);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					{
					setState(924);
					match(IDENTIFIER);
					setState(925);
					match(INT);
					}
					}
					break;
				case 2:
					{
					setState(926);
					trigger();
					}
					break;
				}
				}
				setState(929); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -4611677218035203866L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 2259969L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 1125899906842629L) != 0) );
			setState(931);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Has_opinion_modifierContext extends ParserRuleContext {
		public TerminalNode HAS_OPINION_MODIFIER() { return getToken(EU4GrammarParser.HAS_OPINION_MODIFIER, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TerminalNode> WHO() { return getTokens(EU4GrammarParser.WHO); }
		public TerminalNode WHO(int i) {
			return getToken(EU4GrammarParser.WHO, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public List<TerminalNode> MODIFIER() { return getTokens(EU4GrammarParser.MODIFIER); }
		public TerminalNode MODIFIER(int i) {
			return getToken(EU4GrammarParser.MODIFIER, i);
		}
		public List<TerminalNode> TAG() { return getTokens(EU4GrammarParser.TAG); }
		public TerminalNode TAG(int i) {
			return getToken(EU4GrammarParser.TAG, i);
		}
		public List<TerminalNode> SCOPE() { return getTokens(EU4GrammarParser.SCOPE); }
		public TerminalNode SCOPE(int i) {
			return getToken(EU4GrammarParser.SCOPE, i);
		}
		public Has_opinion_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_has_opinion_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterHas_opinion_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitHas_opinion_modifier(this);
		}
	}

	public final Has_opinion_modifierContext has_opinion_modifier() throws RecognitionException {
		Has_opinion_modifierContext _localctx = new Has_opinion_modifierContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_has_opinion_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			match(HAS_OPINION_MODIFIER);
			setState(934);
			match(LPAR);
			setState(943);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHO || _la==MODIFIER || _la==IDENTIFIER) {
				{
				setState(941);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WHO:
					{
					{
					setState(935);
					match(WHO);
					setState(936);
					_la = _input.LA(1);
					if ( !(_la==TAG || _la==SCOPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				case IDENTIFIER:
					{
					{
					setState(937);
					match(IDENTIFIER);
					setState(938);
					match(INT);
					}
					}
					break;
				case MODIFIER:
					{
					{
					setState(939);
					match(MODIFIER);
					setState(940);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(945);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(946);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Calc_true_ifContext extends ParserRuleContext {
		public TerminalNode CALC_TRUE_IF() { return getToken(EU4GrammarParser.CALC_TRUE_IF, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<AmountContext> amount() {
			return getRuleContexts(AmountContext.class);
		}
		public AmountContext amount(int i) {
			return getRuleContext(AmountContext.class,i);
		}
		public List<TriggerContext> trigger() {
			return getRuleContexts(TriggerContext.class);
		}
		public TriggerContext trigger(int i) {
			return getRuleContext(TriggerContext.class,i);
		}
		public Calc_true_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc_true_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCalc_true_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCalc_true_if(this);
		}
	}

	public final Calc_true_ifContext calc_true_if() throws RecognitionException {
		Calc_true_ifContext _localctx = new Calc_true_ifContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_calc_true_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			match(CALC_TRUE_IF);
			setState(949);
			match(LPAR);
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611677209445269274L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 2259969L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 1125899906842629L) != 0)) {
				{
				setState(952);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AMOUNT:
					{
					setState(950);
					amount();
					}
					break;
				case AND:
				case OR:
				case NOT:
				case MPOWER:
				case TAG:
				case IF:
				case CALC_TRUE_IF:
				case CHECK_VARIABLE:
				case TRADE_SHARE:
				case PRIVATEER_POWER:
				case HAS_OPINION_MODIFIER:
				case CUSTOM_TRIGGER_TOOLTIP:
				case NUM_OF_OWNED_PROVINCES_WITH:
				case Has_GLOBAL_MODIFIER_VALUE:
				case IS_IN_WAR:
				case HAS_OPINION:
				case SCOPE:
				case AI:
				case RELIGION:
				case REGION:
				case IDENTIFIER:
					{
					setState(951);
					trigger();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(957);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Check_variableContext extends ParserRuleContext {
		public TerminalNode CHECK_VARIABLE() { return getToken(EU4GrammarParser.CHECK_VARIABLE, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode FLOAT() { return getToken(EU4GrammarParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public Check_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCheck_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCheck_variable(this);
		}
	}

	public final Check_variableContext check_variable() throws RecognitionException {
		Check_variableContext _localctx = new Check_variableContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_check_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			match(CHECK_VARIABLE);
			setState(960);
			match(LPAR);
			setState(961);
			match(IDENTIFIER);
			setState(962);
			match(IDENTIFIER);
			setState(967);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				{
				setState(963);
				match(IDENTIFIER);
				setState(964);
				match(IDENTIFIER);
				}
				}
				break;
			case 2:
				{
				{
				setState(965);
				match(IDENTIFIER);
				setState(966);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			}
			setState(969);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Trade_shareContext extends ParserRuleContext {
		public TerminalNode TRADE_SHARE() { return getToken(EU4GrammarParser.TRADE_SHARE, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode COUNTRY() { return getToken(EU4GrammarParser.COUNTRY, 0); }
		public TerminalNode SHARE() { return getToken(EU4GrammarParser.SHARE, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public TerminalNode SCOPE() { return getToken(EU4GrammarParser.SCOPE, 0); }
		public Trade_shareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trade_share; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterTrade_share(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitTrade_share(this);
		}
	}

	public final Trade_shareContext trade_share() throws RecognitionException {
		Trade_shareContext _localctx = new Trade_shareContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_trade_share);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			match(TRADE_SHARE);
			setState(972);
			match(LPAR);
			setState(973);
			match(COUNTRY);
			setState(974);
			_la = _input.LA(1);
			if ( !(_la==TAG || _la==SCOPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(975);
			match(SHARE);
			setState(976);
			match(INT);
			setState(977);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Privateer_powerContext extends ParserRuleContext {
		public TerminalNode PRIVATEER_POWER() { return getToken(EU4GrammarParser.PRIVATEER_POWER, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode COUNTRY() { return getToken(EU4GrammarParser.COUNTRY, 0); }
		public TerminalNode SHARE() { return getToken(EU4GrammarParser.SHARE, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public TerminalNode SCOPE() { return getToken(EU4GrammarParser.SCOPE, 0); }
		public Privateer_powerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateer_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterPrivateer_power(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitPrivateer_power(this);
		}
	}

	public final Privateer_powerContext privateer_power() throws RecognitionException {
		Privateer_powerContext _localctx = new Privateer_powerContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_privateer_power);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			match(PRIVATEER_POWER);
			setState(980);
			match(LPAR);
			setState(981);
			match(COUNTRY);
			setState(982);
			_la = _input.LA(1);
			if ( !(_la==TAG || _la==SCOPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(983);
			match(SHARE);
			setState(984);
			match(INT);
			setState(985);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Scripted_triggerContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TriggerContext> trigger() {
			return getRuleContexts(TriggerContext.class);
		}
		public TriggerContext trigger(int i) {
			return getRuleContext(TriggerContext.class,i);
		}
		public Scripted_triggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scripted_trigger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterScripted_trigger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitScripted_trigger(this);
		}
	}

	public final Scripted_triggerContext scripted_trigger() throws RecognitionException {
		Scripted_triggerContext _localctx = new Scripted_triggerContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_scripted_trigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			match(IDENTIFIER);
			setState(988);
			match(LPAR);
			setState(992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611677218035203866L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 2259969L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 1125899906842629L) != 0)) {
				{
				{
				setState(989);
				trigger();
				}
				}
				setState(994);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(995);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrerequisitesContext extends ParserRuleContext {
		public TerminalNode PREREQUISITES() { return getToken(EU4GrammarParser.PREREQUISITES, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TriggerContext> trigger() {
			return getRuleContexts(TriggerContext.class);
		}
		public TriggerContext trigger(int i) {
			return getRuleContext(TriggerContext.class,i);
		}
		public PrerequisitesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prerequisites; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterPrerequisites(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitPrerequisites(this);
		}
	}

	public final PrerequisitesContext prerequisites() throws RecognitionException {
		PrerequisitesContext _localctx = new PrerequisitesContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_prerequisites);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			match(PREREQUISITES);
			setState(998);
			match(LPAR);
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611677218035203866L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 2259969L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 1125899906842629L) != 0)) {
				{
				{
				setState(999);
				trigger();
				}
				}
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1005);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Prerequisites_selfContext extends ParserRuleContext {
		public TerminalNode PREREQUISITES_SELF() { return getToken(EU4GrammarParser.PREREQUISITES_SELF, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TriggerContext> trigger() {
			return getRuleContexts(TriggerContext.class);
		}
		public TriggerContext trigger(int i) {
			return getRuleContext(TriggerContext.class,i);
		}
		public Prerequisites_selfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prerequisites_self; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterPrerequisites_self(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitPrerequisites_self(this);
		}
	}

	public final Prerequisites_selfContext prerequisites_self() throws RecognitionException {
		Prerequisites_selfContext _localctx = new Prerequisites_selfContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_prerequisites_self);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			match(PREREQUISITES_SELF);
			setState(1008);
			match(LPAR);
			setState(1012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611677218035203866L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 2259969L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 1125899906842629L) != 0)) {
				{
				{
				setState(1009);
				trigger();
				}
				}
				setState(1014);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1015);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ai_triggerContext extends ParserRuleContext {
		public TerminalNode AI() { return getToken(EU4GrammarParser.AI, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public Ai_triggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ai_trigger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterAi_trigger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitAi_trigger(this);
		}
	}

	public final Ai_triggerContext ai_trigger() throws RecognitionException {
		Ai_triggerContext _localctx = new Ai_triggerContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_ai_trigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			match(AI);
			setState(1018);
			_la = _input.LA(1);
			if ( !(_la==YES || _la==NO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Is_triggered_onlyContext extends ParserRuleContext {
		public TerminalNode IS_TIRGGERED_ONLY() { return getToken(EU4GrammarParser.IS_TIRGGERED_ONLY, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public Is_triggered_onlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_triggered_only; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterIs_triggered_only(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitIs_triggered_only(this);
		}
	}

	public final Is_triggered_onlyContext is_triggered_only() throws RecognitionException {
		Is_triggered_onlyContext _localctx = new Is_triggered_onlyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_is_triggered_only);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			match(IS_TIRGGERED_ONLY);
			setState(1021);
			_la = _input.LA(1);
			if ( !(_la==YES || _la==NO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Region_triggerContext extends ParserRuleContext {
		public TerminalNode REGION() { return getToken(EU4GrammarParser.REGION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public Region_triggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_region_trigger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterRegion_trigger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitRegion_trigger(this);
		}
	}

	public final Region_triggerContext region_trigger() throws RecognitionException {
		Region_triggerContext _localctx = new Region_triggerContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_region_trigger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			match(REGION);
			setState(1024);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Has_global_modifier_valueContext extends ParserRuleContext {
		public TerminalNode Has_GLOBAL_MODIFIER_VALUE() { return getToken(EU4GrammarParser.Has_GLOBAL_MODIFIER_VALUE, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public Has_global_modifier_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_has_global_modifier_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterHas_global_modifier_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitHas_global_modifier_value(this);
		}
	}

	public final Has_global_modifier_valueContext has_global_modifier_value() throws RecognitionException {
		Has_global_modifier_valueContext _localctx = new Has_global_modifier_valueContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_has_global_modifier_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			match(Has_GLOBAL_MODIFIER_VALUE);
			setState(1027);
			match(LPAR);
			setState(1028);
			match(IDENTIFIER);
			setState(1029);
			match(IDENTIFIER);
			setState(1030);
			match(IDENTIFIER);
			setState(1031);
			match(INT);
			setState(1032);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Is_in_warContext extends ParserRuleContext {
		public TerminalNode IS_IN_WAR() { return getToken(EU4GrammarParser.IS_IN_WAR, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<Is_in_war_optionsContext> is_in_war_options() {
			return getRuleContexts(Is_in_war_optionsContext.class);
		}
		public Is_in_war_optionsContext is_in_war_options(int i) {
			return getRuleContext(Is_in_war_optionsContext.class,i);
		}
		public Is_in_warContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_in_war; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterIs_in_war(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitIs_in_war(this);
		}
	}

	public final Is_in_warContext is_in_war() throws RecognitionException {
		Is_in_warContext _localctx = new Is_in_warContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_is_in_war);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
			match(IS_IN_WAR);
			setState(1035);
			match(LPAR);
			setState(1039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 261633L) != 0)) {
				{
				{
				setState(1036);
				is_in_war_options();
				}
				}
				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1042);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Is_in_war_optionsContext extends ParserRuleContext {
		public TerminalNode ATTACKER_LEADER() { return getToken(EU4GrammarParser.ATTACKER_LEADER, 0); }
		public TerminalNode SCOPE() { return getToken(EU4GrammarParser.SCOPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode DEFENDER_LEADER() { return getToken(EU4GrammarParser.DEFENDER_LEADER, 0); }
		public TerminalNode CASUS_BELLI() { return getToken(EU4GrammarParser.CASUS_BELLI, 0); }
		public TerminalNode DEFENDERS() { return getToken(EU4GrammarParser.DEFENDERS, 0); }
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public TerminalNode ATTACKERS() { return getToken(EU4GrammarParser.ATTACKERS, 0); }
		public TerminalNode PARTICIPANTS() { return getToken(EU4GrammarParser.PARTICIPANTS, 0); }
		public TerminalNode WAR_SCORE() { return getToken(EU4GrammarParser.WAR_SCORE, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public TerminalNode START_DATE() { return getToken(EU4GrammarParser.START_DATE, 0); }
		public TerminalNode DATE() { return getToken(EU4GrammarParser.DATE, 0); }
		public TerminalNode DURATION() { return getToken(EU4GrammarParser.DURATION, 0); }
		public TerminalNode WAR_GOAL_PROVINCE() { return getToken(EU4GrammarParser.WAR_GOAL_PROVINCE, 0); }
		public Is_in_war_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_in_war_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterIs_in_war_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitIs_in_war_options(this);
		}
	}

	public final Is_in_war_optionsContext is_in_war_options() throws RecognitionException {
		Is_in_war_optionsContext _localctx = new Is_in_war_optionsContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_is_in_war_options);
		int _la;
		try {
			setState(1064);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATTACKER_LEADER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1044);
				match(ATTACKER_LEADER);
				setState(1045);
				_la = _input.LA(1);
				if ( !(_la==SCOPE || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case DEFENDER_LEADER:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1046);
				match(DEFENDER_LEADER);
				setState(1047);
				_la = _input.LA(1);
				if ( !(_la==SCOPE || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case CASUS_BELLI:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1048);
				match(CASUS_BELLI);
				setState(1049);
				match(IDENTIFIER);
				}
				}
				break;
			case DEFENDERS:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1050);
				match(DEFENDERS);
				setState(1051);
				match(TAG);
				}
				}
				break;
			case ATTACKERS:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1052);
				match(ATTACKERS);
				setState(1053);
				match(TAG);
				}
				}
				break;
			case PARTICIPANTS:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1054);
				match(PARTICIPANTS);
				setState(1055);
				match(TAG);
				}
				}
				break;
			case WAR_SCORE:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(1056);
				match(WAR_SCORE);
				setState(1057);
				match(INT);
				}
				}
				break;
			case START_DATE:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(1058);
				match(START_DATE);
				setState(1059);
				match(DATE);
				}
				}
				break;
			case DURATION:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(1060);
				match(DURATION);
				setState(1061);
				match(INT);
				}
				}
				break;
			case WAR_GOAL_PROVINCE:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(1062);
				match(WAR_GOAL_PROVINCE);
				setState(1063);
				match(INT);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Has_opinionContext extends ParserRuleContext {
		public TerminalNode HAS_OPINION() { return getToken(EU4GrammarParser.HAS_OPINION, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TerminalNode> WHO() { return getTokens(EU4GrammarParser.WHO); }
		public TerminalNode WHO(int i) {
			return getToken(EU4GrammarParser.WHO, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public List<TerminalNode> MODIFIER() { return getTokens(EU4GrammarParser.MODIFIER); }
		public TerminalNode MODIFIER(int i) {
			return getToken(EU4GrammarParser.MODIFIER, i);
		}
		public List<TerminalNode> TAG() { return getTokens(EU4GrammarParser.TAG); }
		public TerminalNode TAG(int i) {
			return getToken(EU4GrammarParser.TAG, i);
		}
		public List<TerminalNode> SCOPE() { return getTokens(EU4GrammarParser.SCOPE); }
		public TerminalNode SCOPE(int i) {
			return getToken(EU4GrammarParser.SCOPE, i);
		}
		public Has_opinionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_has_opinion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterHas_opinion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitHas_opinion(this);
		}
	}

	public final Has_opinionContext has_opinion() throws RecognitionException {
		Has_opinionContext _localctx = new Has_opinionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_has_opinion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			match(HAS_OPINION);
			setState(1067);
			match(LPAR);
			setState(1076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHO || _la==MODIFIER || _la==IDENTIFIER) {
				{
				setState(1074);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WHO:
					{
					{
					setState(1068);
					match(WHO);
					setState(1069);
					_la = _input.LA(1);
					if ( !(_la==TAG || _la==SCOPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				case IDENTIFIER:
					{
					{
					setState(1070);
					match(IDENTIFIER);
					setState(1071);
					match(INT);
					}
					}
					break;
				case MODIFIER:
					{
					{
					setState(1072);
					match(MODIFIER);
					setState(1073);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1078);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1079);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pre_effectContext extends ParserRuleContext {
		public TerminalNode PRE_EFFECT() { return getToken(EU4GrammarParser.PRE_EFFECT, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<EffectContext> effect() {
			return getRuleContexts(EffectContext.class);
		}
		public EffectContext effect(int i) {
			return getRuleContext(EffectContext.class,i);
		}
		public Pre_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_effect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterPre_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitPre_effect(this);
		}
	}

	public final Pre_effectContext pre_effect() throws RecognitionException {
		Pre_effectContext _localctx = new Pre_effectContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_pre_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			match(PRE_EFFECT);
			setState(1082);
			match(LPAR);
			setState(1086);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1108307792101504L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1901117L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(1083);
				effect();
				}
				}
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1089);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Conditional_blockContext extends ParserRuleContext {
		public TerminalNode CONDITIONAL() { return getToken(EU4GrammarParser.CONDITIONAL, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<Potential_blockContext> potential_block() {
			return getRuleContexts(Potential_blockContext.class);
		}
		public Potential_blockContext potential_block(int i) {
			return getRuleContext(Potential_blockContext.class,i);
		}
		public List<Allow_blockContext> allow_block() {
			return getRuleContexts(Allow_blockContext.class);
		}
		public Allow_blockContext allow_block(int i) {
			return getRuleContext(Allow_blockContext.class,i);
		}
		public List<TooltipContext> tooltip() {
			return getRuleContexts(TooltipContext.class);
		}
		public TooltipContext tooltip(int i) {
			return getRuleContext(TooltipContext.class,i);
		}
		public List<Pre_effectContext> pre_effect() {
			return getRuleContexts(Pre_effectContext.class);
		}
		public Pre_effectContext pre_effect(int i) {
			return getRuleContext(Pre_effectContext.class,i);
		}
		public Conditional_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterConditional_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitConditional_block(this);
		}
	}

	public final Conditional_blockContext conditional_block() throws RecognitionException {
		Conditional_blockContext _localctx = new Conditional_blockContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_conditional_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			match(CONDITIONAL);
			setState(1092);
			match(LPAR);
			setState(1099);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POTENTIAL || _la==ALLOW || _la==TOOLTIP || _la==PRE_EFFECT) {
				{
				setState(1097);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case POTENTIAL:
					{
					setState(1093);
					potential_block();
					}
					break;
				case ALLOW:
					{
					setState(1094);
					allow_block();
					}
					break;
				case TOOLTIP:
					{
					setState(1095);
					tooltip();
					}
					break;
				case PRE_EFFECT:
					{
					setState(1096);
					pre_effect();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1102);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Diplomatic_actionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<Conditional_blockContext> conditional_block() {
			return getRuleContexts(Conditional_blockContext.class);
		}
		public Conditional_blockContext conditional_block(int i) {
			return getRuleContext(Conditional_blockContext.class,i);
		}
		public List<Effect_blockContext> effect_block() {
			return getRuleContexts(Effect_blockContext.class);
		}
		public Effect_blockContext effect_block(int i) {
			return getRuleContext(Effect_blockContext.class,i);
		}
		public List<Pre_effectContext> pre_effect() {
			return getRuleContexts(Pre_effectContext.class);
		}
		public Pre_effectContext pre_effect(int i) {
			return getRuleContext(Pre_effectContext.class,i);
		}
		public Diplomatic_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diplomatic_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterDiplomatic_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitDiplomatic_action(this);
		}
	}

	public final Diplomatic_actionContext diplomatic_action() throws RecognitionException {
		Diplomatic_actionContext _localctx = new Diplomatic_actionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_diplomatic_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			match(IDENTIFIER);
			setState(1105);
			match(LPAR);
			setState(1111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EFFECT || _la==CONDITIONAL || _la==PRE_EFFECT) {
				{
				setState(1109);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONDITIONAL:
					{
					setState(1106);
					conditional_block();
					}
					break;
				case EFFECT:
					{
					setState(1107);
					effect_block();
					}
					break;
				case PRE_EFFECT:
					{
					setState(1108);
					pre_effect();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1114);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Defender_of_faithContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public List<TerminalNode> LPAR() { return getTokens(EU4GrammarParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(EU4GrammarParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(EU4GrammarParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(EU4GrammarParser.RPAR, i);
		}
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public List<Modifier_blockContext> modifier_block() {
			return getRuleContexts(Modifier_blockContext.class);
		}
		public Modifier_blockContext modifier_block(int i) {
			return getRuleContext(Modifier_blockContext.class,i);
		}
		public List<Ai_will_do_blockContext> ai_will_do_block() {
			return getRuleContexts(Ai_will_do_blockContext.class);
		}
		public Ai_will_do_blockContext ai_will_do_block(int i) {
			return getRuleContext(Ai_will_do_blockContext.class,i);
		}
		public List<TerminalNode> SAME_FAITH_MODIFIER() { return getTokens(EU4GrammarParser.SAME_FAITH_MODIFIER); }
		public TerminalNode SAME_FAITH_MODIFIER(int i) {
			return getToken(EU4GrammarParser.SAME_FAITH_MODIFIER, i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public Defender_of_faithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defender_of_faith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterDefender_of_faith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitDefender_of_faith(this);
		}
	}

	public final Defender_of_faithContext defender_of_faith() throws RecognitionException {
		Defender_of_faithContext _localctx = new Defender_of_faithContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_defender_of_faith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			match(IDENTIFIER);
			setState(1117);
			match(LPAR);
			setState(1120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1118);
				match(IDENTIFIER);
				setState(1119);
				match(INT);
				}
				}
				setState(1122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(1135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODIFIER:
					{
					setState(1124);
					modifier_block();
					}
					break;
				case AI_WILL_DO:
					{
					setState(1125);
					ai_will_do_block();
					}
					break;
				case SAME_FAITH_MODIFIER:
					{
					{
					setState(1126);
					match(SAME_FAITH_MODIFIER);
					setState(1127);
					match(LPAR);
					setState(1131);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==IDENTIFIER) {
						{
						{
						setState(1128);
						modifier();
						}
						}
						setState(1133);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1134);
					match(RPAR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 327681L) != 0) );
			setState(1139);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Decree_blocksContext extends ParserRuleContext {
		public Potential_blockContext potential_block() {
			return getRuleContext(Potential_blockContext.class,0);
		}
		public Trigger_blockContext trigger_block() {
			return getRuleContext(Trigger_blockContext.class,0);
		}
		public Modifier_blockContext modifier_block() {
			return getRuleContext(Modifier_blockContext.class,0);
		}
		public Effect_blockContext effect_block() {
			return getRuleContext(Effect_blockContext.class,0);
		}
		public Removed_effect_blockContext removed_effect_block() {
			return getRuleContext(Removed_effect_blockContext.class,0);
		}
		public Ai_will_do_blockContext ai_will_do_block() {
			return getRuleContext(Ai_will_do_blockContext.class,0);
		}
		public Decree_blocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decree_blocks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterDecree_blocks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitDecree_blocks(this);
		}
	}

	public final Decree_blocksContext decree_blocks() throws RecognitionException {
		Decree_blocksContext _localctx = new Decree_blocksContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_decree_blocks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POTENTIAL:
				{
				setState(1141);
				potential_block();
				}
				break;
			case TRIGGER:
				{
				setState(1142);
				trigger_block();
				}
				break;
			case MODIFIER:
				{
				setState(1143);
				modifier_block();
				}
				break;
			case EFFECT:
				{
				setState(1144);
				effect_block();
				}
				break;
			case REMOVED_EFFECT:
				{
				setState(1145);
				removed_effect_block();
				}
				break;
			case AI_WILL_DO:
				{
				setState(1146);
				ai_will_do_block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecreeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<Decree_blocksContext> decree_blocks() {
			return getRuleContexts(Decree_blocksContext.class);
		}
		public Decree_blocksContext decree_blocks(int i) {
			return getRuleContext(Decree_blocksContext.class,i);
		}
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public List<TerminalNode> DURATION() { return getTokens(EU4GrammarParser.DURATION); }
		public TerminalNode DURATION(int i) {
			return getToken(EU4GrammarParser.DURATION, i);
		}
		public DecreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterDecree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitDecree(this);
		}
	}

	public final DecreeContext decree() throws RecognitionException {
		DecreeContext _localctx = new DecreeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_decree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1149);
			match(IDENTIFIER);
			setState(1150);
			match(LPAR);
			setState(1155); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1155);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					{
					setState(1151);
					match(IDENTIFIER);
					setState(1152);
					match(INT);
					}
					}
					break;
				case DURATION:
					{
					{
					setState(1153);
					match(DURATION);
					setState(1154);
					match(INT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DURATION || _la==IDENTIFIER );
			setState(1160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1159);
				decree_blocks();
				}
				}
				setState(1162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & 5764616319127257095L) != 0) );
			setState(1164);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Custom_idea_categoryContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode CATEGORY() { return getToken(EU4GrammarParser.CATEGORY, 0); }
		public TerminalNode MPOWER() { return getToken(EU4GrammarParser.MPOWER, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<Custom_ideaContext> custom_idea() {
			return getRuleContexts(Custom_ideaContext.class);
		}
		public Custom_ideaContext custom_idea(int i) {
			return getRuleContext(Custom_ideaContext.class,i);
		}
		public Custom_idea_categoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_custom_idea_category; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCustom_idea_category(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCustom_idea_category(this);
		}
	}

	public final Custom_idea_categoryContext custom_idea_category() throws RecognitionException {
		Custom_idea_categoryContext _localctx = new Custom_idea_categoryContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_custom_idea_category);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
			match(IDENTIFIER);
			setState(1167);
			match(LPAR);
			setState(1168);
			match(CATEGORY);
			setState(1169);
			match(MPOWER);
			setState(1171); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1170);
				custom_idea();
				}
				}
				setState(1173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(1175);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Custom_idea_levelContext extends ParserRuleContext {
		public TerminalNode LEVEL_COST() { return getToken(EU4GrammarParser.LEVEL_COST, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public Custom_idea_levelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_custom_idea_level; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCustom_idea_level(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCustom_idea_level(this);
		}
	}

	public final Custom_idea_levelContext custom_idea_level() throws RecognitionException {
		Custom_idea_levelContext _localctx = new Custom_idea_levelContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_custom_idea_level);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1177);
			match(LEVEL_COST);
			setState(1178);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Enabled_blockContext extends ParserRuleContext {
		public TerminalNode ENABLED() { return getToken(EU4GrammarParser.ENABLED, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TriggerContext> trigger() {
			return getRuleContexts(TriggerContext.class);
		}
		public TriggerContext trigger(int i) {
			return getRuleContext(TriggerContext.class,i);
		}
		public Enabled_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enabled_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterEnabled_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitEnabled_block(this);
		}
	}

	public final Enabled_blockContext enabled_block() throws RecognitionException {
		Enabled_blockContext _localctx = new Enabled_blockContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_enabled_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			match(ENABLED);
			setState(1181);
			match(LPAR);
			setState(1185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611677218035203866L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 2259969L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 1125899906842629L) != 0)) {
				{
				{
				setState(1182);
				trigger();
				}
				}
				setState(1187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1188);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Custom_ideaContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public List<Enabled_blockContext> enabled_block() {
			return getRuleContexts(Enabled_blockContext.class);
		}
		public Enabled_blockContext enabled_block(int i) {
			return getRuleContext(Enabled_blockContext.class,i);
		}
		public List<Custom_idea_levelContext> custom_idea_level() {
			return getRuleContexts(Custom_idea_levelContext.class);
		}
		public Custom_idea_levelContext custom_idea_level(int i) {
			return getRuleContext(Custom_idea_levelContext.class,i);
		}
		public List<Chance_blockContext> chance_block() {
			return getRuleContexts(Chance_blockContext.class);
		}
		public Chance_blockContext chance_block(int i) {
			return getRuleContext(Chance_blockContext.class,i);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(EU4GrammarParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(EU4GrammarParser.DEFAULT, i);
		}
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public List<TerminalNode> MAX_LEVEL() { return getTokens(EU4GrammarParser.MAX_LEVEL); }
		public TerminalNode MAX_LEVEL(int i) {
			return getToken(EU4GrammarParser.MAX_LEVEL, i);
		}
		public Custom_ideaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_custom_idea; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCustom_idea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCustom_idea(this);
		}
	}

	public final Custom_ideaContext custom_idea() throws RecognitionException {
		Custom_ideaContext _localctx = new Custom_ideaContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_custom_idea);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			match(IDENTIFIER);
			setState(1191);
			match(LPAR);
			setState(1202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 7340033L) != 0) || _la==DEFAULT || _la==IDENTIFIER) {
				{
				setState(1200);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(1192);
					modifier();
					}
					break;
				case ENABLED:
					{
					setState(1193);
					enabled_block();
					}
					break;
				case LEVEL_COST:
					{
					setState(1194);
					custom_idea_level();
					}
					break;
				case DEFAULT:
					{
					{
					setState(1195);
					match(DEFAULT);
					setState(1196);
					match(INT);
					}
					}
					break;
				case CHANCE:
					{
					setState(1197);
					chance_block();
					}
					break;
				case MAX_LEVEL:
					{
					{
					setState(1198);
					match(MAX_LEVEL);
					setState(1199);
					match(INT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1205);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Flag_colorContext extends ParserRuleContext {
		public TerminalNode FLAG_COLOR() { return getToken(EU4GrammarParser.FLAG_COLOR, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public Flag_colorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flag_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterFlag_color(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitFlag_color(this);
		}
	}

	public final Flag_colorContext flag_color() throws RecognitionException {
		Flag_colorContext _localctx = new Flag_colorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_flag_color);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			match(FLAG_COLOR);
			setState(1208);
			match(LPAR);
			setState(1210); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1209);
					match(INT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1212); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1215); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1214);
					match(INT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1217); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1220); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1219);
				match(INT);
				}
				}
				setState(1222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT );
			setState(1224);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Texture_blockContext extends ParserRuleContext {
		public TerminalNode TEXTURE() { return getToken(EU4GrammarParser.TEXTURE, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public File_blockContext file_block() {
			return getRuleContext(File_blockContext.class,0);
		}
		public Size_blockContext size_block() {
			return getRuleContext(Size_blockContext.class,0);
		}
		public TerminalNode NOOFFRAMES() { return getToken(EU4GrammarParser.NOOFFRAMES, 0); }
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public TerminalNode COLOR() { return getToken(EU4GrammarParser.COLOR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public Texture_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texture_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterTexture_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitTexture_block(this);
		}
	}

	public final Texture_blockContext texture_block() throws RecognitionException {
		Texture_blockContext _localctx = new Texture_blockContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_texture_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			match(TEXTURE);
			setState(1227);
			match(LPAR);
			setState(1228);
			file_block();
			setState(1229);
			size_block();
			setState(1230);
			match(NOOFFRAMES);
			setState(1231);
			match(INT);
			setState(1232);
			match(COLOR);
			setState(1233);
			match(INT);
			setState(1234);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Custom_country_colorContext extends ParserRuleContext {
		public TerminalNode NUM_SYMBOLS() { return getToken(EU4GrammarParser.NUM_SYMBOLS, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public TerminalNode TEXTURES() { return getToken(EU4GrammarParser.TEXTURES, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<Color_blockContext> color_block() {
			return getRuleContexts(Color_blockContext.class);
		}
		public Color_blockContext color_block(int i) {
			return getRuleContext(Color_blockContext.class,i);
		}
		public List<Flag_colorContext> flag_color() {
			return getRuleContexts(Flag_colorContext.class);
		}
		public Flag_colorContext flag_color(int i) {
			return getRuleContext(Flag_colorContext.class,i);
		}
		public List<Texture_blockContext> texture_block() {
			return getRuleContexts(Texture_blockContext.class);
		}
		public Texture_blockContext texture_block(int i) {
			return getRuleContext(Texture_blockContext.class,i);
		}
		public Custom_country_colorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_custom_country_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCustom_country_color(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCustom_country_color(this);
		}
	}

	public final Custom_country_colorContext custom_country_color() throws RecognitionException {
		Custom_country_colorContext _localctx = new Custom_country_colorContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_custom_country_color);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236);
			match(NUM_SYMBOLS);
			setState(1237);
			match(INT);
			setState(1241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLOR) {
				{
				{
				setState(1238);
				color_block();
				}
				}
				setState(1243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FLAG_COLOR) {
				{
				{
				setState(1244);
				flag_color();
				}
				}
				setState(1249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1250);
			match(TEXTURES);
			setState(1251);
			match(LPAR);
			setState(1255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXTURE) {
				{
				{
				setState(1252);
				texture_block();
				}
				}
				setState(1257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1258);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Culture_modifier_blockContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode COUNTRY() { return getToken(EU4GrammarParser.COUNTRY, 0); }
		public TerminalNode PROVINCE() { return getToken(EU4GrammarParser.PROVINCE, 0); }
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public Culture_modifier_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_culture_modifier_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCulture_modifier_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCulture_modifier_block(this);
		}
	}

	public final Culture_modifier_blockContext culture_modifier_block() throws RecognitionException {
		Culture_modifier_blockContext _localctx = new Culture_modifier_blockContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_culture_modifier_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
			_la = _input.LA(1);
			if ( !(_la==COUNTRY || _la==PROVINCE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1261);
			match(LPAR);
			setState(1265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1262);
				modifier();
				}
				}
				setState(1267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1268);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Culture_namesContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode MALE_NAMES() { return getToken(EU4GrammarParser.MALE_NAMES, 0); }
		public TerminalNode FEMALE_NAMES() { return getToken(EU4GrammarParser.FEMALE_NAMES, 0); }
		public TerminalNode DYNASTY_NAMES() { return getToken(EU4GrammarParser.DYNASTY_NAMES, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public List<TerminalNode> STRING() { return getTokens(EU4GrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(EU4GrammarParser.STRING, i);
		}
		public Culture_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_culture_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCulture_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCulture_names(this);
		}
	}

	public final Culture_namesContext culture_names() throws RecognitionException {
		Culture_namesContext _localctx = new Culture_namesContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_culture_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			_la = _input.LA(1);
			if ( !(((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1271);
			match(LPAR);
			setState(1275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING || _la==IDENTIFIER) {
				{
				{
				setState(1272);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1278);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Culture_groupContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<Culture_modifier_blockContext> culture_modifier_block() {
			return getRuleContexts(Culture_modifier_blockContext.class);
		}
		public Culture_modifier_blockContext culture_modifier_block(int i) {
			return getRuleContext(Culture_modifier_blockContext.class,i);
		}
		public List<CultureContext> culture() {
			return getRuleContexts(CultureContext.class);
		}
		public CultureContext culture(int i) {
			return getRuleContext(CultureContext.class,i);
		}
		public List<Culture_namesContext> culture_names() {
			return getRuleContexts(Culture_namesContext.class);
		}
		public Culture_namesContext culture_names(int i) {
			return getRuleContext(Culture_namesContext.class,i);
		}
		public List<TerminalNode> GRAPHICAL_CULTURE() { return getTokens(EU4GrammarParser.GRAPHICAL_CULTURE); }
		public TerminalNode GRAPHICAL_CULTURE(int i) {
			return getToken(EU4GrammarParser.GRAPHICAL_CULTURE, i);
		}
		public Culture_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_culture_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCulture_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCulture_group(this);
		}
	}

	public final Culture_groupContext culture_group() throws RecognitionException {
		Culture_groupContext _localctx = new Culture_groupContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_culture_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1280);
			match(IDENTIFIER);
			setState(1281);
			match(LPAR);
			setState(1287); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1287);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GRAPHICAL_CULTURE:
					{
					{
					setState(1282);
					match(GRAPHICAL_CULTURE);
					setState(1283);
					match(IDENTIFIER);
					}
					}
					break;
				case COUNTRY:
				case PROVINCE:
					{
					setState(1284);
					culture_modifier_block();
					}
					break;
				case IDENTIFIER:
					{
					setState(1285);
					culture();
					}
					break;
				case MALE_NAMES:
				case FEMALE_NAMES:
				case DYNASTY_NAMES:
					{
					setState(1286);
					culture_names();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1289); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & 108086391056892039L) != 0) || _la==IDENTIFIER );
			setState(1291);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CultureContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<Culture_modifier_blockContext> culture_modifier_block() {
			return getRuleContexts(Culture_modifier_blockContext.class);
		}
		public Culture_modifier_blockContext culture_modifier_block(int i) {
			return getRuleContext(Culture_modifier_blockContext.class,i);
		}
		public List<Culture_namesContext> culture_names() {
			return getRuleContexts(Culture_namesContext.class);
		}
		public Culture_namesContext culture_names(int i) {
			return getRuleContext(Culture_namesContext.class,i);
		}
		public List<TerminalNode> PRIMARY() { return getTokens(EU4GrammarParser.PRIMARY); }
		public TerminalNode PRIMARY(int i) {
			return getToken(EU4GrammarParser.PRIMARY, i);
		}
		public List<TerminalNode> TAG() { return getTokens(EU4GrammarParser.TAG); }
		public TerminalNode TAG(int i) {
			return getToken(EU4GrammarParser.TAG, i);
		}
		public CultureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_culture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCulture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCulture(this);
		}
	}

	public final CultureContext culture() throws RecognitionException {
		CultureContext _localctx = new CultureContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_culture);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
			match(IDENTIFIER);
			setState(1294);
			match(LPAR);
			setState(1301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & 108086391056891919L) != 0)) {
				{
				setState(1299);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRIMARY:
					{
					{
					setState(1295);
					match(PRIMARY);
					setState(1296);
					match(TAG);
					}
					}
					break;
				case COUNTRY:
				case PROVINCE:
					{
					setState(1297);
					culture_modifier_block();
					}
					break;
				case MALE_NAMES:
				case FEMALE_NAMES:
				case DYNASTY_NAMES:
					{
					setState(1298);
					culture_names();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1304);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Country_tagsContext extends ParserRuleContext {
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public Country_tagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_country_tags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCountry_tags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCountry_tags(this);
		}
	}

	public final Country_tagsContext country_tags() throws RecognitionException {
		Country_tagsContext _localctx = new Country_tagsContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_country_tags);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			match(TAG);
			setState(1307);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Country_colorContext extends ParserRuleContext {
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public List<TerminalNode> LPAR() { return getTokens(EU4GrammarParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(EU4GrammarParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(EU4GrammarParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(EU4GrammarParser.RPAR, i);
		}
		public List<TerminalNode> COLOR1() { return getTokens(EU4GrammarParser.COLOR1); }
		public TerminalNode COLOR1(int i) {
			return getToken(EU4GrammarParser.COLOR1, i);
		}
		public List<TerminalNode> COLOR2() { return getTokens(EU4GrammarParser.COLOR2); }
		public TerminalNode COLOR2(int i) {
			return getToken(EU4GrammarParser.COLOR2, i);
		}
		public List<TerminalNode> COLOR3() { return getTokens(EU4GrammarParser.COLOR3); }
		public TerminalNode COLOR3(int i) {
			return getToken(EU4GrammarParser.COLOR3, i);
		}
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public Country_colorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_country_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCountry_color(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCountry_color(this);
		}
	}

	public final Country_colorContext country_color() throws RecognitionException {
		Country_colorContext _localctx = new Country_colorContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_country_color);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1309);
			match(TAG);
			setState(1310);
			match(LPAR);
			setState(1329); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1311);
				_la = _input.LA(1);
				if ( !(((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1312);
				match(LPAR);
				setState(1314); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1313);
						match(INT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1316); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1319); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1318);
						match(INT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1321); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1324); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1323);
					match(INT);
					}
					}
					setState(1326); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(1328);
				match(RPAR);
				}
				}
				setState(1331); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & 7L) != 0) );
			setState(1333);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Common_countires_blockContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode HISTORICAL_IDEA_GROUPS() { return getToken(EU4GrammarParser.HISTORICAL_IDEA_GROUPS, 0); }
		public TerminalNode HISTORICAL_UNITS() { return getToken(EU4GrammarParser.HISTORICAL_UNITS, 0); }
		public TerminalNode LEADER_NAMES() { return getToken(EU4GrammarParser.LEADER_NAMES, 0); }
		public TerminalNode SHIP_NAMES() { return getToken(EU4GrammarParser.SHIP_NAMES, 0); }
		public TerminalNode ARMY_NAMES() { return getToken(EU4GrammarParser.ARMY_NAMES, 0); }
		public TerminalNode FLEET_NAMES() { return getToken(EU4GrammarParser.FLEET_NAMES, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public List<TerminalNode> STRING() { return getTokens(EU4GrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(EU4GrammarParser.STRING, i);
		}
		public Common_countires_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_countires_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCommon_countires_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCommon_countires_block(this);
		}
	}

	public final Common_countires_blockContext common_countires_block() throws RecognitionException {
		Common_countires_blockContext _localctx = new Common_countires_blockContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_common_countires_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
			_la = _input.LA(1);
			if ( !(((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & 123L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1336);
			match(LPAR);
			setState(1340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING || _la==IDENTIFIER) {
				{
				{
				setState(1337);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1343);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Monarch_namesContext extends ParserRuleContext {
		public TerminalNode MONARCH_NAMES() { return getToken(EU4GrammarParser.MONARCH_NAMES, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TerminalNode> STRING() { return getTokens(EU4GrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(EU4GrammarParser.STRING, i);
		}
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public Monarch_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monarch_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterMonarch_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitMonarch_names(this);
		}
	}

	public final Monarch_namesContext monarch_names() throws RecognitionException {
		Monarch_namesContext _localctx = new Monarch_namesContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_monarch_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1345);
			match(MONARCH_NAMES);
			setState(1346);
			match(LPAR);
			setState(1351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(1347);
				match(STRING);
				setState(1348);
				match(INT);
				}
				}
				setState(1353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1354);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Common_countryContext extends ParserRuleContext {
		public List<Color_blockContext> color_block() {
			return getRuleContexts(Color_blockContext.class);
		}
		public Color_blockContext color_block(int i) {
			return getRuleContext(Color_blockContext.class,i);
		}
		public List<Common_countires_blockContext> common_countires_block() {
			return getRuleContexts(Common_countires_blockContext.class);
		}
		public Common_countires_blockContext common_countires_block(int i) {
			return getRuleContext(Common_countires_blockContext.class,i);
		}
		public List<Monarch_namesContext> monarch_names() {
			return getRuleContexts(Monarch_namesContext.class);
		}
		public Monarch_namesContext monarch_names(int i) {
			return getRuleContext(Monarch_namesContext.class,i);
		}
		public List<TerminalNode> GRAPHICAL_CULTURE() { return getTokens(EU4GrammarParser.GRAPHICAL_CULTURE); }
		public TerminalNode GRAPHICAL_CULTURE(int i) {
			return getToken(EU4GrammarParser.GRAPHICAL_CULTURE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public List<TerminalNode> REVOLUTIONARY_COLORS() { return getTokens(EU4GrammarParser.REVOLUTIONARY_COLORS); }
		public TerminalNode REVOLUTIONARY_COLORS(int i) {
			return getToken(EU4GrammarParser.REVOLUTIONARY_COLORS, i);
		}
		public List<TerminalNode> LPAR() { return getTokens(EU4GrammarParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(EU4GrammarParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(EU4GrammarParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(EU4GrammarParser.RPAR, i);
		}
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public Common_countryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_country; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCommon_country(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCommon_country(this);
		}
	}

	public final Common_countryContext common_country() throws RecognitionException {
		Common_countryContext _localctx = new Common_countryContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_common_country);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1379); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1379);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case GRAPHICAL_CULTURE:
						{
						{
						setState(1356);
						match(GRAPHICAL_CULTURE);
						setState(1357);
						match(IDENTIFIER);
						}
						}
						break;
					case COLOR:
						{
						setState(1358);
						color_block();
						}
						break;
					case HISTORICAL_IDEA_GROUPS:
					case HISTORICAL_UNITS:
					case LEADER_NAMES:
					case SHIP_NAMES:
					case ARMY_NAMES:
					case FLEET_NAMES:
						{
						setState(1359);
						common_countires_block();
						}
						break;
					case MONARCH_NAMES:
						{
						setState(1360);
						monarch_names();
						}
						break;
					case REVOLUTIONARY_COLORS:
						{
						{
						setState(1361);
						match(REVOLUTIONARY_COLORS);
						setState(1362);
						match(LPAR);
						setState(1364); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(1363);
								match(INT);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(1366); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(1369); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(1368);
								match(INT);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(1371); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(1374); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1373);
							match(INT);
							}
							}
							setState(1376); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==INT );
						setState(1378);
						match(RPAR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1381); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Trade_goods_blockContext extends ParserRuleContext {
		public TerminalNode TRADE_GOODS() { return getToken(EU4GrammarParser.TRADE_GOODS, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public Trade_goods_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trade_goods_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterTrade_goods_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitTrade_goods_block(this);
		}
	}

	public final Trade_goods_blockContext trade_goods_block() throws RecognitionException {
		Trade_goods_blockContext _localctx = new Trade_goods_blockContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_trade_goods_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1383);
			match(TRADE_GOODS);
			setState(1384);
			match(LPAR);
			setState(1387); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1385);
				match(IDENTIFIER);
				setState(1386);
				match(INT);
				}
				}
				setState(1389); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(1391);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Culture_blockContext extends ParserRuleContext {
		public TerminalNode CULTURE() { return getToken(EU4GrammarParser.CULTURE, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public Culture_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_culture_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCulture_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCulture_block(this);
		}
	}

	public final Culture_blockContext culture_block() throws RecognitionException {
		Culture_blockContext _localctx = new Culture_blockContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_culture_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1393);
			match(CULTURE);
			setState(1394);
			match(LPAR);
			setState(1397); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1395);
				match(IDENTIFIER);
				setState(1396);
				match(INT);
				}
				}
				setState(1399); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(1401);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Religion_blockContext extends ParserRuleContext {
		public TerminalNode RELIGION() { return getToken(EU4GrammarParser.RELIGION, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public Religion_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_religion_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterReligion_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitReligion_block(this);
		}
	}

	public final Religion_blockContext religion_block() throws RecognitionException {
		Religion_blockContext _localctx = new Religion_blockContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_religion_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1403);
			match(RELIGION);
			setState(1404);
			match(LPAR);
			setState(1407); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1405);
				match(IDENTIFIER);
				setState(1406);
				match(INT);
				}
				}
				setState(1409); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(1411);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Col_simple_attrContext extends ParserRuleContext {
		public TerminalNode TAX_INCOME() { return getToken(EU4GrammarParser.TAX_INCOME, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public TerminalNode NATIVE_SIZE() { return getToken(EU4GrammarParser.NATIVE_SIZE, 0); }
		public TerminalNode NATIVE_FEROCITY() { return getToken(EU4GrammarParser.NATIVE_FEROCITY, 0); }
		public TerminalNode NATIVE_HOSTILENESS() { return getToken(EU4GrammarParser.NATIVE_HOSTILENESS, 0); }
		public Col_simple_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_simple_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCol_simple_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCol_simple_attr(this);
		}
	}

	public final Col_simple_attrContext col_simple_attr() throws RecognitionException {
		Col_simple_attrContext _localctx = new Col_simple_attrContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_col_simple_attr);
		try {
			setState(1421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAX_INCOME:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1413);
				match(TAX_INCOME);
				setState(1414);
				match(INT);
				}
				}
				break;
			case NATIVE_SIZE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1415);
				match(NATIVE_SIZE);
				setState(1416);
				match(INT);
				}
				}
				break;
			case NATIVE_FEROCITY:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1417);
				match(NATIVE_FEROCITY);
				setState(1418);
				match(INT);
				}
				}
				break;
			case NATIVE_HOSTILENESS:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1419);
				match(NATIVE_HOSTILENESS);
				setState(1420);
				match(INT);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Col_region_attrContext extends ParserRuleContext {
		public Provinces_blockContext provinces_block() {
			return getRuleContext(Provinces_blockContext.class,0);
		}
		public Trade_goods_blockContext trade_goods_block() {
			return getRuleContext(Trade_goods_blockContext.class,0);
		}
		public Culture_blockContext culture_block() {
			return getRuleContext(Culture_blockContext.class,0);
		}
		public Religion_blockContext religion_block() {
			return getRuleContext(Religion_blockContext.class,0);
		}
		public Col_region_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_region_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCol_region_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCol_region_attr(this);
		}
	}

	public final Col_region_attrContext col_region_attr() throws RecognitionException {
		Col_region_attrContext _localctx = new Col_region_attrContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_col_region_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROVINCES:
				{
				setState(1423);
				provinces_block();
				}
				break;
			case TRADE_GOODS:
				{
				setState(1424);
				trade_goods_block();
				}
				break;
			case CULTURE:
				{
				setState(1425);
				culture_block();
				}
				break;
			case RELIGION:
				{
				setState(1426);
				religion_block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Colonial_regionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<Color_blockContext> color_block() {
			return getRuleContexts(Color_blockContext.class);
		}
		public Color_blockContext color_block(int i) {
			return getRuleContext(Color_blockContext.class,i);
		}
		public List<Col_region_attrContext> col_region_attr() {
			return getRuleContexts(Col_region_attrContext.class);
		}
		public Col_region_attrContext col_region_attr(int i) {
			return getRuleContext(Col_region_attrContext.class,i);
		}
		public List<Name_blockContext> name_block() {
			return getRuleContexts(Name_blockContext.class);
		}
		public Name_blockContext name_block(int i) {
			return getRuleContext(Name_blockContext.class,i);
		}
		public List<Col_simple_attrContext> col_simple_attr() {
			return getRuleContexts(Col_simple_attrContext.class);
		}
		public Col_simple_attrContext col_simple_attr(int i) {
			return getRuleContext(Col_simple_attrContext.class,i);
		}
		public Colonial_regionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colonial_region; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterColonial_region(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitColonial_region(this);
		}
	}

	public final Colonial_regionContext colonial_region() throws RecognitionException {
		Colonial_regionContext _localctx = new Colonial_regionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_colonial_region);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
			match(IDENTIFIER);
			setState(1430);
			match(LPAR);
			setState(1439); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1439);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COLOR:
					{
					setState(1431);
					color_block();
					}
					break;
				case TAX_INCOME:
				case NATIVE_SIZE:
				case NATIVE_FEROCITY:
				case NATIVE_HOSTILENESS:
					{
					setState(1433); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(1432);
							col_simple_attr();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1435); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case TRADE_GOODS:
				case CULTURE:
				case RELIGION:
				case PROVINCES:
					{
					setState(1437);
					col_region_attr();
					}
					break;
				case NAME:
				case NAMES:
					{
					setState(1438);
					name_block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1441); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4501125726208L) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 255L) != 0) );
			setState(1443);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TooltipContext extends ParserRuleContext {
		public TerminalNode TOOLTIP() { return getToken(EU4GrammarParser.TOOLTIP, 0); }
		public TerminalNode STRING_TOOLTIP() { return getToken(EU4GrammarParser.STRING_TOOLTIP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TooltipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tooltip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterTooltip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitTooltip(this);
		}
	}

	public final TooltipContext tooltip() throws RecognitionException {
		TooltipContext _localctx = new TooltipContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_tooltip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1445);
			match(TOOLTIP);
			setState(1446);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_TOOLTIP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Custom_tooltipContext extends ParserRuleContext {
		public TerminalNode CUSTOM_TOOLTIP() { return getToken(EU4GrammarParser.CUSTOM_TOOLTIP, 0); }
		public TerminalNode STRING_TOOLTIP() { return getToken(EU4GrammarParser.STRING_TOOLTIP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public Custom_tooltipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_custom_tooltip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCustom_tooltip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCustom_tooltip(this);
		}
	}

	public final Custom_tooltipContext custom_tooltip() throws RecognitionException {
		Custom_tooltipContext _localctx = new Custom_tooltipContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_custom_tooltip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1448);
			match(CUSTOM_TOOLTIP);
			setState(1449);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_TOOLTIP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Custom_trigger_tooltipContext extends ParserRuleContext {
		public TerminalNode CUSTOM_TRIGGER_TOOLTIP() { return getToken(EU4GrammarParser.CUSTOM_TRIGGER_TOOLTIP, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TooltipContext> tooltip() {
			return getRuleContexts(TooltipContext.class);
		}
		public TooltipContext tooltip(int i) {
			return getRuleContext(TooltipContext.class,i);
		}
		public List<TriggerContext> trigger() {
			return getRuleContexts(TriggerContext.class);
		}
		public TriggerContext trigger(int i) {
			return getRuleContext(TriggerContext.class,i);
		}
		public Custom_trigger_tooltipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_custom_trigger_tooltip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCustom_trigger_tooltip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCustom_trigger_tooltip(this);
		}
	}

	public final Custom_trigger_tooltipContext custom_trigger_tooltip() throws RecognitionException {
		Custom_trigger_tooltipContext _localctx = new Custom_trigger_tooltipContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_custom_trigger_tooltip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1451);
			match(CUSTOM_TRIGGER_TOOLTIP);
			setState(1452);
			match(LPAR);
			setState(1456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOOLTIP) {
				{
				{
				setState(1453);
				tooltip();
				}
				}
				setState(1458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611677218035203866L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 2259969L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 1125899906842629L) != 0)) {
				{
				{
				setState(1459);
				trigger();
				}
				}
				setState(1464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1465);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DescContext extends ParserRuleContext {
		public TerminalNode DESC() { return getToken(EU4GrammarParser.DESC, 0); }
		public TerminalNode STRING_TOOLTIP() { return getToken(EU4GrammarParser.STRING_TOOLTIP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public DescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterDesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitDesc(this);
		}
	}

	public final DescContext desc() throws RecognitionException {
		DescContext _localctx = new DescContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_desc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1467);
			match(DESC);
			setState(1468);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENTIFIER || _la==STRING_TOOLTIP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Client_stateContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<Name_blockContext> name_block() {
			return getRuleContexts(Name_blockContext.class);
		}
		public Name_blockContext name_block(int i) {
			return getRuleContext(Name_blockContext.class,i);
		}
		public List<Region_triggerContext> region_trigger() {
			return getRuleContexts(Region_triggerContext.class);
		}
		public Region_triggerContext region_trigger(int i) {
			return getRuleContext(Region_triggerContext.class,i);
		}
		public Client_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_client_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterClient_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitClient_state(this);
		}
	}

	public final Client_stateContext client_state() throws RecognitionException {
		Client_stateContext _localctx = new Client_stateContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_client_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1470);
			match(IDENTIFIER);
			setState(1471);
			match(LPAR);
			setState(1474); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1474);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NAME:
				case NAMES:
					{
					setState(1472);
					name_block();
					}
					break;
				case REGION:
					{
					setState(1473);
					region_trigger();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1476); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME || _la==NAMES || _la==REGION );
			setState(1478);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Is_blessingContext extends ParserRuleContext {
		public TerminalNode IS_BLESSING() { return getToken(EU4GrammarParser.IS_BLESSING, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public Is_blessingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_blessing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterIs_blessing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitIs_blessing(this);
		}
	}

	public final Is_blessingContext is_blessing() throws RecognitionException {
		Is_blessingContext _localctx = new Is_blessingContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_is_blessing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			match(IS_BLESSING);
			setState(1481);
			_la = _input.LA(1);
			if ( !(_la==YES || _la==NO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SpriteContext extends ParserRuleContext {
		public TerminalNode SPRITE() { return getToken(EU4GrammarParser.SPRITE, 0); }
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public SpriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sprite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterSprite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitSprite(this);
		}
	}

	public final SpriteContext sprite() throws RecognitionException {
		SpriteContext _localctx = new SpriteContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_sprite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1483);
			match(SPRITE);
			setState(1484);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Church_aspectContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<Is_blessingContext> is_blessing() {
			return getRuleContexts(Is_blessingContext.class);
		}
		public Is_blessingContext is_blessing(int i) {
			return getRuleContext(Is_blessingContext.class,i);
		}
		public List<Trigger_blockContext> trigger_block() {
			return getRuleContexts(Trigger_blockContext.class);
		}
		public Trigger_blockContext trigger_block(int i) {
			return getRuleContext(Trigger_blockContext.class,i);
		}
		public List<SpriteContext> sprite() {
			return getRuleContexts(SpriteContext.class);
		}
		public SpriteContext sprite(int i) {
			return getRuleContext(SpriteContext.class,i);
		}
		public List<Monarch_power_advisorContext> monarch_power_advisor() {
			return getRuleContexts(Monarch_power_advisorContext.class);
		}
		public Monarch_power_advisorContext monarch_power_advisor(int i) {
			return getRuleContext(Monarch_power_advisorContext.class,i);
		}
		public List<CostContext> cost() {
			return getRuleContexts(CostContext.class);
		}
		public CostContext cost(int i) {
			return getRuleContext(CostContext.class,i);
		}
		public List<Effect_blockContext> effect_block() {
			return getRuleContexts(Effect_blockContext.class);
		}
		public Effect_blockContext effect_block(int i) {
			return getRuleContext(Effect_blockContext.class,i);
		}
		public List<Modifier_blockContext> modifier_block() {
			return getRuleContexts(Modifier_blockContext.class);
		}
		public Modifier_blockContext modifier_block(int i) {
			return getRuleContext(Modifier_blockContext.class,i);
		}
		public List<Potential_blockContext> potential_block() {
			return getRuleContexts(Potential_blockContext.class);
		}
		public Potential_blockContext potential_block(int i) {
			return getRuleContext(Potential_blockContext.class,i);
		}
		public Ai_will_do_blockContext ai_will_do_block() {
			return getRuleContext(Ai_will_do_blockContext.class,0);
		}
		public Church_aspectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_church_aspect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterChurch_aspect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitChurch_aspect(this);
		}
	}

	public final Church_aspectContext church_aspect() throws RecognitionException {
		Church_aspectContext _localctx = new Church_aspectContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_church_aspect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
			match(IDENTIFIER);
			setState(1487);
			match(LPAR);
			setState(1498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & 1152921504606846983L) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & 140737488355335L) != 0)) {
				{
				setState(1496);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IS_BLESSING:
					{
					setState(1488);
					is_blessing();
					}
					break;
				case TRIGGER:
					{
					setState(1489);
					trigger_block();
					}
					break;
				case SPRITE:
					{
					setState(1490);
					sprite();
					}
					break;
				case MONARCH_POWER:
					{
					setState(1491);
					monarch_power_advisor();
					}
					break;
				case IDENTIFIER:
					{
					setState(1492);
					cost();
					}
					break;
				case EFFECT:
					{
					setState(1493);
					effect_block();
					}
					break;
				case MODIFIER:
					{
					setState(1494);
					modifier_block();
					}
					break;
				case POTENTIAL:
					{
					setState(1495);
					potential_block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1500);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AI_WILL_DO) {
				{
				setState(1501);
				ai_will_do_block();
				}
			}

			setState(1504);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cot_typeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode COASTAL() { return getToken(EU4GrammarParser.COASTAL, 0); }
		public TerminalNode INLAND() { return getToken(EU4GrammarParser.INLAND, 0); }
		public Cot_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cot_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCot_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCot_type(this);
		}
	}

	public final Cot_typeContext cot_type() throws RecognitionException {
		Cot_typeContext _localctx = new Cot_typeContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_cot_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1506);
			match(IDENTIFIER);
			setState(1507);
			_la = _input.LA(1);
			if ( !(_la==INLAND || _la==COASTAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cot_optionalsContext extends ParserRuleContext {
		public Cot_typeContext cot_type() {
			return getRuleContext(Cot_typeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public Cot_optionalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cot_optionals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCot_optionals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCot_optionals(this);
		}
	}

	public final Cot_optionalsContext cot_optionals() throws RecognitionException {
		Cot_optionalsContext _localctx = new Cot_optionalsContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_cot_optionals);
		try {
			setState(1512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1509);
				cot_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1510);
				match(IDENTIFIER);
				setState(1511);
				match(INT);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Province_modifierContext extends ParserRuleContext {
		public TerminalNode PROVINCE_MODIFIER() { return getToken(EU4GrammarParser.PROVINCE_MODIFIER, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public Province_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_province_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterProvince_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitProvince_modifier(this);
		}
	}

	public final Province_modifierContext province_modifier() throws RecognitionException {
		Province_modifierContext _localctx = new Province_modifierContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_province_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1514);
			match(PROVINCE_MODIFIER);
			setState(1515);
			match(LPAR);
			setState(1519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1516);
				modifier();
				}
				}
				setState(1521);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1522);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Global_modifierContext extends ParserRuleContext {
		public TerminalNode GLOBAL_MODIFIER() { return getToken(EU4GrammarParser.GLOBAL_MODIFIER, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public Global_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterGlobal_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitGlobal_modifier(this);
		}
	}

	public final Global_modifierContext global_modifier() throws RecognitionException {
		Global_modifierContext _localctx = new Global_modifierContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_global_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1524);
			match(GLOBAL_MODIFIER);
			setState(1525);
			match(LPAR);
			setState(1529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1526);
				modifier();
				}
				}
				setState(1531);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1532);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class State_modifierContext extends ParserRuleContext {
		public TerminalNode STATE_MODIFIER() { return getToken(EU4GrammarParser.STATE_MODIFIER, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public State_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterState_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitState_modifier(this);
		}
	}

	public final State_modifierContext state_modifier() throws RecognitionException {
		State_modifierContext _localctx = new State_modifierContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_state_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1534);
			match(STATE_MODIFIER);
			setState(1535);
			match(LPAR);
			setState(1539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1536);
				modifier();
				}
				}
				setState(1541);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1542);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Center_of_tradeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<Cot_optionalsContext> cot_optionals() {
			return getRuleContexts(Cot_optionalsContext.class);
		}
		public Cot_optionalsContext cot_optionals(int i) {
			return getRuleContext(Cot_optionalsContext.class,i);
		}
		public List<Province_modifierContext> province_modifier() {
			return getRuleContexts(Province_modifierContext.class);
		}
		public Province_modifierContext province_modifier(int i) {
			return getRuleContext(Province_modifierContext.class,i);
		}
		public List<State_modifierContext> state_modifier() {
			return getRuleContexts(State_modifierContext.class);
		}
		public State_modifierContext state_modifier(int i) {
			return getRuleContext(State_modifierContext.class,i);
		}
		public List<Global_modifierContext> global_modifier() {
			return getRuleContexts(Global_modifierContext.class);
		}
		public Global_modifierContext global_modifier(int i) {
			return getRuleContext(Global_modifierContext.class,i);
		}
		public Center_of_tradeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_center_of_trade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCenter_of_trade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCenter_of_trade(this);
		}
	}

	public final Center_of_tradeContext center_of_trade() throws RecognitionException {
		Center_of_tradeContext _localctx = new Center_of_tradeContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_center_of_trade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1544);
			match(IDENTIFIER);
			setState(1545);
			match(LPAR);
			setState(1550); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1550);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(1546);
					cot_optionals();
					}
					break;
				case PROVINCE_MODIFIER:
					{
					setState(1547);
					province_modifier();
					}
					break;
				case STATE_MODIFIER:
					{
					setState(1548);
					state_modifier();
					}
					break;
				case GLOBAL_MODIFIER:
					{
					setState(1549);
					global_modifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1552); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 151)) & ~0x3f) == 0 && ((1L << (_la - 151)) & 4398046511111L) != 0) );
			setState(1554);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LeagueContext extends ParserRuleContext {
		public TerminalNode LEAGUE() { return getToken(EU4GrammarParser.LEAGUE, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public LeagueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_league; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterLeague(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitLeague(this);
		}
	}

	public final LeagueContext league() throws RecognitionException {
		LeagueContext _localctx = new LeagueContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_league);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1556);
			match(LEAGUE);
			setState(1557);
			_la = _input.LA(1);
			if ( !(_la==YES || _la==NO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Call_empire_membersContext extends ParserRuleContext {
		public TerminalNode CALL_EMPIRE_MEMBERS() { return getToken(EU4GrammarParser.CALL_EMPIRE_MEMBERS, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public Call_empire_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_empire_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCall_empire_members(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCall_empire_members(this);
		}
	}

	public final Call_empire_membersContext call_empire_members() throws RecognitionException {
		Call_empire_membersContext _localctx = new Call_empire_membersContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_call_empire_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1559);
			match(CALL_EMPIRE_MEMBERS);
			setState(1560);
			_la = _input.LA(1);
			if ( !(_la==YES || _la==NO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ai_peace_desireContext extends ParserRuleContext {
		public TerminalNode AI_PEACE_DESIRE() { return getToken(EU4GrammarParser.AI_PEACE_DESIRE, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public Ai_peace_desireContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ai_peace_desire; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterAi_peace_desire(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitAi_peace_desire(this);
		}
	}

	public final Ai_peace_desireContext ai_peace_desire() throws RecognitionException {
		Ai_peace_desireContext _localctx = new Ai_peace_desireContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_ai_peace_desire);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1562);
			match(AI_PEACE_DESIRE);
			setState(1563);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Support_rebelsContext extends ParserRuleContext {
		public TerminalNode SUPPORT_REBELS() { return getToken(EU4GrammarParser.SUPPORT_REBELS, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public Support_rebelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_support_rebels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterSupport_rebels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitSupport_rebels(this);
		}
	}

	public final Support_rebelsContext support_rebels() throws RecognitionException {
		Support_rebelsContext _localctx = new Support_rebelsContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_support_rebels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			match(SUPPORT_REBELS);
			setState(1566);
			_la = _input.LA(1);
			if ( !(_la==YES || _la==NO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CoalitionContext extends ParserRuleContext {
		public TerminalNode COALITION() { return getToken(EU4GrammarParser.COALITION, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public CoalitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coalition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCoalition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCoalition(this);
		}
	}

	public final CoalitionContext coalition() throws RecognitionException {
		CoalitionContext _localctx = new CoalitionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_coalition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1568);
			match(COALITION);
			setState(1569);
			_la = _input.LA(1);
			if ( !(_la==YES || _la==NO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndependenceContext extends ParserRuleContext {
		public TerminalNode INDEPENDENCE() { return getToken(EU4GrammarParser.INDEPENDENCE, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public IndependenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_independence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterIndependence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitIndependence(this);
		}
	}

	public final IndependenceContext independence() throws RecognitionException {
		IndependenceContext _localctx = new IndependenceContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_independence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1571);
			match(INDEPENDENCE);
			setState(1572);
			_la = _input.LA(1);
			if ( !(_la==YES || _la==NO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExclusiveContext extends ParserRuleContext {
		public TerminalNode EXCLUSIVE() { return getToken(EU4GrammarParser.EXCLUSIVE, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public ExclusiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterExclusive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitExclusive(this);
		}
	}

	public final ExclusiveContext exclusive() throws RecognitionException {
		ExclusiveContext _localctx = new ExclusiveContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_exclusive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
			match(EXCLUSIVE);
			setState(1575);
			_la = _input.LA(1);
			if ( !(_la==YES || _la==NO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Holy_warContext extends ParserRuleContext {
		public TerminalNode HOLY_WAR() { return getToken(EU4GrammarParser.HOLY_WAR, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public Holy_warContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_holy_war; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterHoly_war(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitHoly_war(this);
		}
	}

	public final Holy_warContext holy_war() throws RecognitionException {
		Holy_warContext _localctx = new Holy_warContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_holy_war);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1577);
			match(HOLY_WAR);
			setState(1578);
			_la = _input.LA(1);
			if ( !(_la==YES || _la==NO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Attacker_disabled_poContext extends ParserRuleContext {
		public TerminalNode ATTACKER_DISABLED_PO() { return getToken(EU4GrammarParser.ATTACKER_DISABLED_PO, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public Attacker_disabled_poContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attacker_disabled_po; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterAttacker_disabled_po(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitAttacker_disabled_po(this);
		}
	}

	public final Attacker_disabled_poContext attacker_disabled_po() throws RecognitionException {
		Attacker_disabled_poContext _localctx = new Attacker_disabled_poContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_attacker_disabled_po);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			match(ATTACKER_DISABLED_PO);
			setState(1581);
			match(LPAR);
			setState(1585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1582);
				match(IDENTIFIER);
				}
				}
				setState(1587);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1588);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Is_valid_for_subjectContext extends ParserRuleContext {
		public TerminalNode IS_VALID_FOR_SUBJECT() { return getToken(EU4GrammarParser.IS_VALID_FOR_SUBJECT, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public Is_valid_for_subjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_valid_for_subject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterIs_valid_for_subject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitIs_valid_for_subject(this);
		}
	}

	public final Is_valid_for_subjectContext is_valid_for_subject() throws RecognitionException {
		Is_valid_for_subjectContext _localctx = new Is_valid_for_subjectContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_is_valid_for_subject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1590);
			match(IS_VALID_FOR_SUBJECT);
			setState(1591);
			_la = _input.LA(1);
			if ( !(_la==YES || _la==NO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class War_goalContext extends ParserRuleContext {
		public TerminalNode WAR_GOAL() { return getToken(EU4GrammarParser.WAR_GOAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public War_goalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_war_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterWar_goal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitWar_goal(this);
		}
	}

	public final War_goalContext war_goal() throws RecognitionException {
		War_goalContext _localctx = new War_goalContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_war_goal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1593);
			match(WAR_GOAL);
			setState(1594);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class No_opinion_hitContext extends ParserRuleContext {
		public TerminalNode NO_OPINION_HIT() { return getToken(EU4GrammarParser.NO_OPINION_HIT, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public No_opinion_hitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_opinion_hit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterNo_opinion_hit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitNo_opinion_hit(this);
		}
	}

	public final No_opinion_hitContext no_opinion_hit() throws RecognitionException {
		No_opinion_hitContext _localctx = new No_opinion_hitContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_no_opinion_hit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1596);
			match(NO_OPINION_HIT);
			setState(1597);
			_la = _input.LA(1);
			if ( !(_la==YES || _la==NO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cb_optionalsContext extends ParserRuleContext {
		public Call_empire_membersContext call_empire_members() {
			return getRuleContext(Call_empire_membersContext.class,0);
		}
		public Attacker_disabled_poContext attacker_disabled_po() {
			return getRuleContext(Attacker_disabled_poContext.class,0);
		}
		public Holy_warContext holy_war() {
			return getRuleContext(Holy_warContext.class,0);
		}
		public Is_triggered_onlyContext is_triggered_only() {
			return getRuleContext(Is_triggered_onlyContext.class,0);
		}
		public MonthsContext months() {
			return getRuleContext(MonthsContext.class,0);
		}
		public No_opinion_hitContext no_opinion_hit() {
			return getRuleContext(No_opinion_hitContext.class,0);
		}
		public War_goalContext war_goal() {
			return getRuleContext(War_goalContext.class,0);
		}
		public PrerequisitesContext prerequisites() {
			return getRuleContext(PrerequisitesContext.class,0);
		}
		public Prerequisites_selfContext prerequisites_self() {
			return getRuleContext(Prerequisites_selfContext.class,0);
		}
		public Cb_optionalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cb_optionals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCb_optionals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCb_optionals(this);
		}
	}

	public final Cb_optionalsContext cb_optionals() throws RecognitionException {
		Cb_optionalsContext _localctx = new Cb_optionalsContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_cb_optionals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1608);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL_EMPIRE_MEMBERS:
				{
				setState(1599);
				call_empire_members();
				}
				break;
			case ATTACKER_DISABLED_PO:
				{
				setState(1600);
				attacker_disabled_po();
				}
				break;
			case HOLY_WAR:
				{
				setState(1601);
				holy_war();
				}
				break;
			case IS_TIRGGERED_ONLY:
				{
				setState(1602);
				is_triggered_only();
				}
				break;
			case MONTHS:
				{
				setState(1603);
				months();
				}
				break;
			case NO_OPINION_HIT:
				{
				setState(1604);
				no_opinion_hit();
				}
				break;
			case WAR_GOAL:
				{
				setState(1605);
				war_goal();
				}
				break;
			case PREREQUISITES:
				{
				setState(1606);
				prerequisites();
				}
				break;
			case PREREQUISITES_SELF:
				{
				setState(1607);
				prerequisites_self();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cb_typeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public LeagueContext league() {
			return getRuleContext(LeagueContext.class,0);
		}
		public Support_rebelsContext support_rebels() {
			return getRuleContext(Support_rebelsContext.class,0);
		}
		public Ai_peace_desireContext ai_peace_desire() {
			return getRuleContext(Ai_peace_desireContext.class,0);
		}
		public Is_valid_for_subjectContext is_valid_for_subject() {
			return getRuleContext(Is_valid_for_subjectContext.class,0);
		}
		public ExclusiveContext exclusive() {
			return getRuleContext(ExclusiveContext.class,0);
		}
		public IndependenceContext independence() {
			return getRuleContext(IndependenceContext.class,0);
		}
		public CoalitionContext coalition() {
			return getRuleContext(CoalitionContext.class,0);
		}
		public List<Cb_optionalsContext> cb_optionals() {
			return getRuleContexts(Cb_optionalsContext.class);
		}
		public Cb_optionalsContext cb_optionals(int i) {
			return getRuleContext(Cb_optionalsContext.class,i);
		}
		public Cb_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cb_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCb_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCb_type(this);
		}
	}

	public final Cb_typeContext cb_type() throws RecognitionException {
		Cb_typeContext _localctx = new Cb_typeContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_cb_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1610);
			match(IDENTIFIER);
			setState(1611);
			match(LPAR);
			setState(1613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEAGUE) {
				{
				setState(1612);
				league();
				}
			}

			setState(1616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUPPORT_REBELS) {
				{
				setState(1615);
				support_rebels();
				}
			}

			setState(1619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AI_PEACE_DESIRE) {
				{
				setState(1618);
				ai_peace_desire();
				}
			}

			setState(1622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS_VALID_FOR_SUBJECT) {
				{
				setState(1621);
				is_valid_for_subject();
				}
			}

			setState(1625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLUSIVE) {
				{
				setState(1624);
				exclusive();
				}
			}

			setState(1628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDEPENDENCE) {
				{
				setState(1627);
				independence();
				}
			}

			setState(1631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COALITION) {
				{
				setState(1630);
				coalition();
				}
			}

			setState(1636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4123168608256L) != 0) || ((((_la - 154)) & ~0x3f) == 0 && ((1L << (_la - 154)) & 269L) != 0)) {
				{
				{
				setState(1633);
				cb_optionals();
				}
				}
				setState(1638);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1639);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Buildings_triggerContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode BUILD_TRIGGER() { return getToken(EU4GrammarParser.BUILD_TRIGGER, 0); }
		public TerminalNode KEEP_TRIGGER() { return getToken(EU4GrammarParser.KEEP_TRIGGER, 0); }
		public List<TriggerContext> trigger() {
			return getRuleContexts(TriggerContext.class);
		}
		public TriggerContext trigger(int i) {
			return getRuleContext(TriggerContext.class,i);
		}
		public Buildings_triggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildings_trigger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterBuildings_trigger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitBuildings_trigger(this);
		}
	}

	public final Buildings_triggerContext buildings_trigger() throws RecognitionException {
		Buildings_triggerContext _localctx = new Buildings_triggerContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_buildings_trigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1641);
			_la = _input.LA(1);
			if ( !(_la==KEEP_TRIGGER || _la==BUILD_TRIGGER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1642);
			match(LPAR);
			setState(1646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611677218035203866L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 2259969L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 1125899906842629L) != 0)) {
				{
				{
				setState(1643);
				trigger();
				}
				}
				setState(1648);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1649);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Buildings_effectContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode ON_BUILT() { return getToken(EU4GrammarParser.ON_BUILT, 0); }
		public TerminalNode ON_CONSTRUCTION_CANCELED() { return getToken(EU4GrammarParser.ON_CONSTRUCTION_CANCELED, 0); }
		public TerminalNode ON_CONSTRUCTION_STARTED() { return getToken(EU4GrammarParser.ON_CONSTRUCTION_STARTED, 0); }
		public TerminalNode ON_DESTORYED() { return getToken(EU4GrammarParser.ON_DESTORYED, 0); }
		public TerminalNode ON_OBSOLETE() { return getToken(EU4GrammarParser.ON_OBSOLETE, 0); }
		public List<EffectContext> effect() {
			return getRuleContexts(EffectContext.class);
		}
		public EffectContext effect(int i) {
			return getRuleContext(EffectContext.class,i);
		}
		public Buildings_effectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildings_effect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterBuildings_effect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitBuildings_effect(this);
		}
	}

	public final Buildings_effectContext buildings_effect() throws RecognitionException {
		Buildings_effectContext _localctx = new Buildings_effectContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_buildings_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1651);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1116892707587883008L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1652);
			match(LPAR);
			setState(1656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1108307792101504L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1901117L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(1653);
				effect();
				}
				}
				setState(1658);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1659);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Manufactory_definesContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode MANUFACTORY() { return getToken(EU4GrammarParser.MANUFACTORY, 0); }
		public TerminalNode BONUS_MANUFACTORY() { return getToken(EU4GrammarParser.BONUS_MANUFACTORY, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public Manufactory_definesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_manufactory_defines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterManufactory_defines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitManufactory_defines(this);
		}
	}

	public final Manufactory_definesContext manufactory_defines() throws RecognitionException {
		Manufactory_definesContext _localctx = new Manufactory_definesContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_manufactory_defines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1661);
			_la = _input.LA(1);
			if ( !(_la==MANUFACTORY || _la==BONUS_MANUFACTORY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1662);
			match(LPAR);
			setState(1664); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1663);
				match(IDENTIFIER);
				}
				}
				setState(1666); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(1668);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bonus_modifierContext extends ParserRuleContext {
		public TerminalNode BONUS_MODIFIER() { return getToken(EU4GrammarParser.BONUS_MODIFIER, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Bonus_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bonus_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterBonus_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitBonus_modifier(this);
		}
	}

	public final Bonus_modifierContext bonus_modifier() throws RecognitionException {
		Bonus_modifierContext _localctx = new Bonus_modifierContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_bonus_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1670);
			match(BONUS_MODIFIER);
			setState(1671);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CostContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public CostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cost; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCost(this);
		}
	}

	public final CostContext cost() throws RecognitionException {
		CostContext _localctx = new CostContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_cost);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673);
			match(IDENTIFIER);
			setState(1674);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimeContext extends ParserRuleContext {
		public TerminalNode TIME() { return getToken(EU4GrammarParser.TIME, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitTime(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1676);
			match(TIME);
			setState(1677);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OnmapContext extends ParserRuleContext {
		public TerminalNode ONMAP() { return getToken(EU4GrammarParser.ONMAP, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public OnmapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onmap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterOnmap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitOnmap(this);
		}
	}

	public final OnmapContext onmap() throws RecognitionException {
		OnmapContext _localctx = new OnmapContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_onmap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1679);
			match(ONMAP);
			setState(1680);
			_la = _input.LA(1);
			if ( !(_la==YES || _la==NO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Show_seperateContext extends ParserRuleContext {
		public TerminalNode SHOW_SEPERATE() { return getToken(EU4GrammarParser.SHOW_SEPERATE, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public Show_seperateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_seperate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterShow_seperate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitShow_seperate(this);
		}
	}

	public final Show_seperateContext show_seperate() throws RecognitionException {
		Show_seperateContext _localctx = new Show_seperateContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_show_seperate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1682);
			match(SHOW_SEPERATE);
			setState(1683);
			_la = _input.LA(1);
			if ( !(_la==YES || _la==NO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Building_attributeContext extends ParserRuleContext {
		public CostContext cost() {
			return getRuleContext(CostContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public OnmapContext onmap() {
			return getRuleContext(OnmapContext.class,0);
		}
		public Show_seperateContext show_seperate() {
			return getRuleContext(Show_seperateContext.class,0);
		}
		public Influencing_fortContext influencing_fort() {
			return getRuleContext(Influencing_fortContext.class,0);
		}
		public Allowed_in_gold_provinceContext allowed_in_gold_province() {
			return getRuleContext(Allowed_in_gold_provinceContext.class,0);
		}
		public Make_obsoleteContext make_obsolete() {
			return getRuleContext(Make_obsoleteContext.class,0);
		}
		public Building_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_building_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterBuilding_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitBuilding_attribute(this);
		}
	}

	public final Building_attributeContext building_attribute() throws RecognitionException {
		Building_attributeContext _localctx = new Building_attributeContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_building_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1692);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(1685);
				cost();
				}
				break;
			case TIME:
				{
				setState(1686);
				time();
				}
				break;
			case ONMAP:
				{
				setState(1687);
				onmap();
				}
				break;
			case SHOW_SEPERATE:
				{
				setState(1688);
				show_seperate();
				}
				break;
			case INFLUENCING_FORT:
				{
				setState(1689);
				influencing_fort();
				}
				break;
			case ALLOWED_IN_GOLD_PROVINCES:
				{
				setState(1690);
				allowed_in_gold_province();
				}
				break;
			case MAKE_OBSOLETE:
				{
				setState(1691);
				make_obsolete();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Allowed_in_gold_provinceContext extends ParserRuleContext {
		public TerminalNode ALLOWED_IN_GOLD_PROVINCES() { return getToken(EU4GrammarParser.ALLOWED_IN_GOLD_PROVINCES, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public Allowed_in_gold_provinceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allowed_in_gold_province; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterAllowed_in_gold_province(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitAllowed_in_gold_province(this);
		}
	}

	public final Allowed_in_gold_provinceContext allowed_in_gold_province() throws RecognitionException {
		Allowed_in_gold_provinceContext _localctx = new Allowed_in_gold_provinceContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_allowed_in_gold_province);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
			match(ALLOWED_IN_GOLD_PROVINCES);
			setState(1695);
			_la = _input.LA(1);
			if ( !(_la==YES || _la==NO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Make_obsoleteContext extends ParserRuleContext {
		public TerminalNode MAKE_OBSOLETE() { return getToken(EU4GrammarParser.MAKE_OBSOLETE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public Make_obsoleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_make_obsolete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterMake_obsolete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitMake_obsolete(this);
		}
	}

	public final Make_obsoleteContext make_obsolete() throws RecognitionException {
		Make_obsoleteContext _localctx = new Make_obsoleteContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_make_obsolete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1697);
			match(MAKE_OBSOLETE);
			setState(1698);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Influencing_fortContext extends ParserRuleContext {
		public TerminalNode INFLUENCING_FORT() { return getToken(EU4GrammarParser.INFLUENCING_FORT, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public Influencing_fortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_influencing_fort; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterInfluencing_fort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitInfluencing_fort(this);
		}
	}

	public final Influencing_fortContext influencing_fort() throws RecognitionException {
		Influencing_fortContext _localctx = new Influencing_fortContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_influencing_fort);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1700);
			match(INFLUENCING_FORT);
			setState(1701);
			_la = _input.LA(1);
			if ( !(_la==YES || _la==NO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BuildingContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<Manufactory_definesContext> manufactory_defines() {
			return getRuleContexts(Manufactory_definesContext.class);
		}
		public Manufactory_definesContext manufactory_defines(int i) {
			return getRuleContext(Manufactory_definesContext.class,i);
		}
		public List<Building_attributeContext> building_attribute() {
			return getRuleContexts(Building_attributeContext.class);
		}
		public Building_attributeContext building_attribute(int i) {
			return getRuleContext(Building_attributeContext.class,i);
		}
		public List<Buildings_effectContext> buildings_effect() {
			return getRuleContexts(Buildings_effectContext.class);
		}
		public Buildings_effectContext buildings_effect(int i) {
			return getRuleContext(Buildings_effectContext.class,i);
		}
		public List<Buildings_triggerContext> buildings_trigger() {
			return getRuleContexts(Buildings_triggerContext.class);
		}
		public Buildings_triggerContext buildings_trigger(int i) {
			return getRuleContext(Buildings_triggerContext.class,i);
		}
		public List<Bonus_modifierContext> bonus_modifier() {
			return getRuleContexts(Bonus_modifierContext.class);
		}
		public Bonus_modifierContext bonus_modifier(int i) {
			return getRuleContext(Bonus_modifierContext.class,i);
		}
		public List<Modifier_blockContext> modifier_block() {
			return getRuleContexts(Modifier_blockContext.class);
		}
		public Modifier_blockContext modifier_block(int i) {
			return getRuleContext(Modifier_blockContext.class,i);
		}
		public List<Ai_will_do_blockContext> ai_will_do_block() {
			return getRuleContexts(Ai_will_do_blockContext.class);
		}
		public Ai_will_do_blockContext ai_will_do_block(int i) {
			return getRuleContext(Ai_will_do_blockContext.class,i);
		}
		public BuildingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_building; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterBuilding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitBuilding(this);
		}
	}

	public final BuildingContext building() throws RecognitionException {
		BuildingContext _localctx = new BuildingContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_building);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1703);
			match(IDENTIFIER);
			setState(1704);
			match(LPAR);
			setState(1714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 11258999101718529L) != 0) || ((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & 536871167L) != 0)) {
				{
				setState(1712);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MANUFACTORY:
				case BONUS_MANUFACTORY:
					{
					setState(1705);
					manufactory_defines();
					}
					break;
				case TIME:
				case ALLOWED_IN_GOLD_PROVINCES:
				case INFLUENCING_FORT:
				case ONMAP:
				case MAKE_OBSOLETE:
				case SHOW_SEPERATE:
				case IDENTIFIER:
					{
					setState(1706);
					building_attribute();
					}
					break;
				case ON_BUILT:
				case ON_DESTORYED:
				case ON_CONSTRUCTION_STARTED:
				case ON_CONSTRUCTION_CANCELED:
				case ON_OBSOLETE:
					{
					setState(1707);
					buildings_effect();
					}
					break;
				case KEEP_TRIGGER:
				case BUILD_TRIGGER:
					{
					setState(1708);
					buildings_trigger();
					}
					break;
				case BONUS_MODIFIER:
					{
					setState(1709);
					bonus_modifier();
					}
					break;
				case MODIFIER:
					{
					setState(1710);
					modifier_block();
					}
					break;
				case AI_WILL_DO:
					{
					setState(1711);
					ai_will_do_block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1716);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1717);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BookmarkContext extends ParserRuleContext {
		public TerminalNode BOOKMARK() { return getToken(EU4GrammarParser.BOOKMARK, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DescContext desc() {
			return getRuleContext(DescContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode DEFAULT() { return getToken(EU4GrammarParser.DEFAULT, 0); }
		public List<TerminalNode> CENTER() { return getTokens(EU4GrammarParser.CENTER); }
		public TerminalNode CENTER(int i) {
			return getToken(EU4GrammarParser.CENTER, i);
		}
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public List<TerminalNode> COUNTRY() { return getTokens(EU4GrammarParser.COUNTRY); }
		public TerminalNode COUNTRY(int i) {
			return getToken(EU4GrammarParser.COUNTRY, i);
		}
		public List<TerminalNode> TAG() { return getTokens(EU4GrammarParser.TAG); }
		public TerminalNode TAG(int i) {
			return getToken(EU4GrammarParser.TAG, i);
		}
		public List<TerminalNode> EASY_COUNTRY() { return getTokens(EU4GrammarParser.EASY_COUNTRY); }
		public TerminalNode EASY_COUNTRY(int i) {
			return getToken(EU4GrammarParser.EASY_COUNTRY, i);
		}
		public List<TerminalNode> YES() { return getTokens(EU4GrammarParser.YES); }
		public TerminalNode YES(int i) {
			return getToken(EU4GrammarParser.YES, i);
		}
		public List<TerminalNode> NO() { return getTokens(EU4GrammarParser.NO); }
		public TerminalNode NO(int i) {
			return getToken(EU4GrammarParser.NO, i);
		}
		public BookmarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bookmark; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterBookmark(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitBookmark(this);
		}
	}

	public final BookmarkContext bookmark() throws RecognitionException {
		BookmarkContext _localctx = new BookmarkContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_bookmark);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1719);
			match(BOOKMARK);
			setState(1720);
			match(LPAR);
			setState(1721);
			name();
			setState(1722);
			desc();
			setState(1723);
			date();
			setState(1728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CENTER) {
				{
				{
				setState(1724);
				match(CENTER);
				setState(1725);
				match(INT);
				}
				}
				setState(1730);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(1731);
			match(DEFAULT);
			setState(1735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==YES || _la==NO) {
				{
				{
				setState(1732);
				_la = _input.LA(1);
				if ( !(_la==YES || _la==NO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1737);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(1742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COUNTRY) {
				{
				{
				setState(1738);
				match(COUNTRY);
				setState(1739);
				match(TAG);
				}
				}
				setState(1744);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EASY_COUNTRY) {
				{
				{
				setState(1745);
				match(EASY_COUNTRY);
				setState(1746);
				match(TAG);
				}
				}
				setState(1751);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1752);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ancestor_personalityContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public List<TerminalNode> LPAR() { return getTokens(EU4GrammarParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(EU4GrammarParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(EU4GrammarParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(EU4GrammarParser.RPAR, i);
		}
		public List<AllowContext> allow() {
			return getRuleContexts(AllowContext.class);
		}
		public AllowContext allow(int i) {
			return getRuleContext(AllowContext.class,i);
		}
		public List<Chance_blockContext> chance_block() {
			return getRuleContexts(Chance_blockContext.class);
		}
		public Chance_blockContext chance_block(int i) {
			return getRuleContext(Chance_blockContext.class,i);
		}
		public List<War_priorityContext> war_priority() {
			return getRuleContexts(War_priorityContext.class);
		}
		public War_priorityContext war_priority(int i) {
			return getRuleContext(War_priorityContext.class,i);
		}
		public List<Ai_pick_ancestorContext> ai_pick_ancestor() {
			return getRuleContexts(Ai_pick_ancestorContext.class);
		}
		public Ai_pick_ancestorContext ai_pick_ancestor(int i) {
			return getRuleContext(Ai_pick_ancestorContext.class,i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public List<TerminalNode> RULER_ALLOW() { return getTokens(EU4GrammarParser.RULER_ALLOW); }
		public TerminalNode RULER_ALLOW(int i) {
			return getToken(EU4GrammarParser.RULER_ALLOW, i);
		}
		public List<TerminalNode> HEIR_ALLOW() { return getTokens(EU4GrammarParser.HEIR_ALLOW); }
		public TerminalNode HEIR_ALLOW(int i) {
			return getToken(EU4GrammarParser.HEIR_ALLOW, i);
		}
		public List<TerminalNode> CONSORT_ALLOW() { return getTokens(EU4GrammarParser.CONSORT_ALLOW); }
		public TerminalNode CONSORT_ALLOW(int i) {
			return getToken(EU4GrammarParser.CONSORT_ALLOW, i);
		}
		public Ancestor_personalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ancestor_personality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterAncestor_personality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitAncestor_personality(this);
		}
	}

	public final Ancestor_personalityContext ancestor_personality() throws RecognitionException {
		Ancestor_personalityContext _localctx = new Ancestor_personalityContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_ancestor_personality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1754);
			match(IDENTIFIER);
			setState(1755);
			match(LPAR);
			setState(1796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & 4899916394594828289L) != 0) || _la==IDENTIFIER) {
				{
				setState(1794);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RULER_ALLOW:
					{
					{
					setState(1756);
					match(RULER_ALLOW);
					setState(1757);
					match(LPAR);
					setState(1761);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ALLOW) {
						{
						{
						setState(1758);
						allow();
						}
						}
						setState(1763);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1764);
					chance_block();
					setState(1765);
					match(RPAR);
					}
					}
					break;
				case HEIR_ALLOW:
					{
					{
					setState(1767);
					match(HEIR_ALLOW);
					setState(1768);
					match(LPAR);
					setState(1772);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ALLOW) {
						{
						{
						setState(1769);
						allow();
						}
						}
						setState(1774);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1775);
					chance_block();
					setState(1776);
					match(RPAR);
					}
					}
					break;
				case CONSORT_ALLOW:
					{
					{
					setState(1778);
					match(CONSORT_ALLOW);
					setState(1779);
					match(LPAR);
					setState(1783);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ALLOW) {
						{
						{
						setState(1780);
						allow();
						}
						}
						setState(1785);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1786);
					chance_block();
					setState(1787);
					match(RPAR);
					}
					}
					break;
				case ALLOW:
					{
					setState(1789);
					allow();
					}
					break;
				case CHANCE:
					{
					setState(1790);
					chance_block();
					}
					break;
				case WAR_PRIORITY:
					{
					setState(1791);
					war_priority();
					}
					break;
				case AI_PICK_ANCESTOR:
					{
					setState(1792);
					ai_pick_ancestor();
					}
					break;
				case IDENTIFIER:
					{
					setState(1793);
					modifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1798);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1799);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class War_priorityContext extends ParserRuleContext {
		public TerminalNode WAR_PRIORITY() { return getToken(EU4GrammarParser.WAR_PRIORITY, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public Chance_modifierContext chance_modifier() {
			return getRuleContext(Chance_modifierContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public War_priorityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_war_priority; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterWar_priority(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitWar_priority(this);
		}
	}

	public final War_priorityContext war_priority() throws RecognitionException {
		War_priorityContext _localctx = new War_priorityContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_war_priority);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1801);
			match(WAR_PRIORITY);
			setState(1802);
			match(LPAR);
			setState(1803);
			chance_modifier();
			setState(1804);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ai_pick_ancestorContext extends ParserRuleContext {
		public TerminalNode AI_PICK_ANCESTOR() { return getToken(EU4GrammarParser.AI_PICK_ANCESTOR, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Chance_modifierContext chance_modifier() {
			return getRuleContext(Chance_modifierContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public Ai_pick_ancestorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ai_pick_ancestor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterAi_pick_ancestor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitAi_pick_ancestor(this);
		}
	}

	public final Ai_pick_ancestorContext ai_pick_ancestor() throws RecognitionException {
		Ai_pick_ancestorContext _localctx = new Ai_pick_ancestorContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_ai_pick_ancestor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			match(AI_PICK_ANCESTOR);
			setState(1807);
			match(LPAR);
			setState(1808);
			factor();
			setState(1809);
			chance_modifier();
			setState(1810);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ai_personalityContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public Chance_blockContext chance_block() {
			return getRuleContext(Chance_blockContext.class,0);
		}
		public TerminalNode ICON() { return getToken(EU4GrammarParser.ICON, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public Ai_personalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ai_personality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterAi_personality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitAi_personality(this);
		}
	}

	public final Ai_personalityContext ai_personality() throws RecognitionException {
		Ai_personalityContext _localctx = new Ai_personalityContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_ai_personality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1812);
			match(IDENTIFIER);
			setState(1813);
			match(LPAR);
			setState(1814);
			chance_block();
			setState(1815);
			match(ICON);
			setState(1816);
			match(INT);
			setState(1817);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(EU4GrammarParser.START, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1819);
			match(START);
			setState(1820);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Can_start_blockContext extends ParserRuleContext {
		public TerminalNode CAN_START() { return getToken(EU4GrammarParser.CAN_START, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TriggerContext> trigger() {
			return getRuleContexts(TriggerContext.class);
		}
		public TriggerContext trigger(int i) {
			return getRuleContext(TriggerContext.class,i);
		}
		public Can_start_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_can_start_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCan_start_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCan_start_block(this);
		}
	}

	public final Can_start_blockContext can_start_block() throws RecognitionException {
		Can_start_blockContext _localctx = new Can_start_blockContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_can_start_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1822);
			match(CAN_START);
			setState(1823);
			match(LPAR);
			setState(1827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611677218035203866L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 2259969L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 1125899906842629L) != 0)) {
				{
				{
				setState(1824);
				trigger();
				}
				}
				setState(1829);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1830);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectiveContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<AllowContext> allow() {
			return getRuleContexts(AllowContext.class);
		}
		public AllowContext allow(int i) {
			return getRuleContext(AllowContext.class,i);
		}
		public List<TriggerContext> trigger() {
			return getRuleContexts(TriggerContext.class);
		}
		public TriggerContext trigger(int i) {
			return getRuleContext(TriggerContext.class,i);
		}
		public ObjectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterObjective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitObjective(this);
		}
	}

	public final ObjectiveContext objective() throws RecognitionException {
		ObjectiveContext _localctx = new ObjectiveContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_objective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1832);
			match(IDENTIFIER);
			setState(1833);
			match(LPAR);
			setState(1838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611677215887720218L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 2259969L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 1125899906842629L) != 0)) {
				{
				setState(1836);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALLOW:
					{
					setState(1834);
					allow();
					}
					break;
				case AND:
				case OR:
				case NOT:
				case MPOWER:
				case TAG:
				case IF:
				case CALC_TRUE_IF:
				case CHECK_VARIABLE:
				case TRADE_SHARE:
				case PRIVATEER_POWER:
				case HAS_OPINION_MODIFIER:
				case CUSTOM_TRIGGER_TOOLTIP:
				case NUM_OF_OWNED_PROVINCES_WITH:
				case Has_GLOBAL_MODIFIER_VALUE:
				case IS_IN_WAR:
				case HAS_OPINION:
				case SCOPE:
				case AI:
				case RELIGION:
				case REGION:
				case IDENTIFIER:
					{
					setState(1835);
					trigger();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1840);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1841);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Objectives_blockContext extends ParserRuleContext {
		public TerminalNode OBJECTIVES() { return getToken(EU4GrammarParser.OBJECTIVES, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<ObjectiveContext> objective() {
			return getRuleContexts(ObjectiveContext.class);
		}
		public ObjectiveContext objective(int i) {
			return getRuleContext(ObjectiveContext.class,i);
		}
		public Objectives_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectives_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterObjectives_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitObjectives_block(this);
		}
	}

	public final Objectives_blockContext objectives_block() throws RecognitionException {
		Objectives_blockContext _localctx = new Objectives_blockContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_objectives_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1843);
			match(OBJECTIVES);
			setState(1844);
			match(LPAR);
			setState(1848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1845);
				objective();
				}
				}
				setState(1850);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1851);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AbilityContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public Ai_will_do_blockContext ai_will_do_block() {
			return getRuleContext(Ai_will_do_blockContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<AllowContext> allow() {
			return getRuleContexts(AllowContext.class);
		}
		public AllowContext allow(int i) {
			return getRuleContext(AllowContext.class,i);
		}
		public List<Effect_blockContext> effect_block() {
			return getRuleContexts(Effect_blockContext.class);
		}
		public Effect_blockContext effect_block(int i) {
			return getRuleContext(Effect_blockContext.class,i);
		}
		public List<Modifier_blockContext> modifier_block() {
			return getRuleContexts(Modifier_blockContext.class);
		}
		public Modifier_blockContext modifier_block(int i) {
			return getRuleContext(Modifier_blockContext.class,i);
		}
		public AbilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterAbility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitAbility(this);
		}
	}

	public final AbilityContext ability() throws RecognitionException {
		AbilityContext _localctx = new AbilityContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_ability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1853);
			match(IDENTIFIER);
			setState(1854);
			match(LPAR);
			setState(1860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 288230376151711747L) != 0)) {
				{
				setState(1858);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALLOW:
					{
					setState(1855);
					allow();
					}
					break;
				case EFFECT:
					{
					setState(1856);
					effect_block();
					}
					break;
				case MODIFIER:
					{
					setState(1857);
					modifier_block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1862);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1863);
			ai_will_do_block();
			setState(1864);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ability_blockContext extends ParserRuleContext {
		public TerminalNode ABILITIES() { return getToken(EU4GrammarParser.ABILITIES, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<AbilityContext> ability() {
			return getRuleContexts(AbilityContext.class);
		}
		public AbilityContext ability(int i) {
			return getRuleContext(AbilityContext.class,i);
		}
		public Ability_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ability_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterAbility_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitAbility_block(this);
		}
	}

	public final Ability_blockContext ability_block() throws RecognitionException {
		Ability_blockContext _localctx = new Ability_blockContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_ability_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1866);
			match(ABILITIES);
			setState(1867);
			match(LPAR);
			setState(1871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1868);
				ability();
				}
				}
				setState(1873);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1874);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AgeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public Can_start_blockContext can_start_block() {
			return getRuleContext(Can_start_blockContext.class,0);
		}
		public Objectives_blockContext objectives_block() {
			return getRuleContext(Objectives_blockContext.class,0);
		}
		public Ability_blockContext ability_block() {
			return getRuleContext(Ability_blockContext.class,0);
		}
		public List<TerminalNode> RELIGIOUS_CONFLICTS() { return getTokens(EU4GrammarParser.RELIGIOUS_CONFLICTS); }
		public TerminalNode RELIGIOUS_CONFLICTS(int i) {
			return getToken(EU4GrammarParser.RELIGIOUS_CONFLICTS, i);
		}
		public List<TerminalNode> PAPACY() { return getTokens(EU4GrammarParser.PAPACY); }
		public TerminalNode PAPACY(int i) {
			return getToken(EU4GrammarParser.PAPACY, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(EU4GrammarParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(EU4GrammarParser.FLOAT, i);
		}
		public List<TerminalNode> YES() { return getTokens(EU4GrammarParser.YES); }
		public TerminalNode YES(int i) {
			return getToken(EU4GrammarParser.YES, i);
		}
		public List<TerminalNode> NO() { return getTokens(EU4GrammarParser.NO); }
		public TerminalNode NO(int i) {
			return getToken(EU4GrammarParser.NO, i);
		}
		public AgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_age; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterAge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitAge(this);
		}
	}

	public final AgeContext age() throws RecognitionException {
		AgeContext _localctx = new AgeContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_age);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1876);
			match(IDENTIFIER);
			setState(1877);
			match(LPAR);
			setState(1878);
			start();
			setState(1879);
			can_start_block();
			setState(1886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RELIGIOUS_CONFLICTS || _la==PAPACY) {
				{
				setState(1884);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RELIGIOUS_CONFLICTS:
					{
					{
					setState(1880);
					match(RELIGIOUS_CONFLICTS);
					setState(1881);
					_la = _input.LA(1);
					if ( !(_la==YES || _la==NO) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				case PAPACY:
					{
					{
					setState(1882);
					match(PAPACY);
					setState(1883);
					match(FLOAT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1888);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1889);
			objectives_block();
			setState(1890);
			ability_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdvisorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public Monarch_power_advisorContext monarch_power_advisor() {
			return getRuleContext(Monarch_power_advisorContext.class,0);
		}
		public Chance_blockContext chance_block() {
			return getRuleContext(Chance_blockContext.class,0);
		}
		public Ai_will_do_blockContext ai_will_do_block() {
			return getRuleContext(Ai_will_do_blockContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public List<Skill_scaled_modifierContext> skill_scaled_modifier() {
			return getRuleContexts(Skill_scaled_modifierContext.class);
		}
		public Skill_scaled_modifierContext skill_scaled_modifier(int i) {
			return getRuleContext(Skill_scaled_modifierContext.class,i);
		}
		public AdvisorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_advisor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterAdvisor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitAdvisor(this);
		}
	}

	public final AdvisorContext advisor() throws RecognitionException {
		AdvisorContext _localctx = new AdvisorContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_advisor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1892);
			match(IDENTIFIER);
			setState(1893);
			match(LPAR);
			setState(1894);
			monarch_power_advisor();
			setState(1899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SKILL_SACLED_MOD || _la==IDENTIFIER) {
				{
				setState(1897);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(1895);
					modifier();
					}
					break;
				case SKILL_SACLED_MOD:
					{
					setState(1896);
					skill_scaled_modifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1901);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1902);
			chance_block();
			setState(1903);
			ai_will_do_block();
			setState(1904);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Monarch_power_advisorContext extends ParserRuleContext {
		public TerminalNode MONARCH_POWER() { return getToken(EU4GrammarParser.MONARCH_POWER, 0); }
		public TerminalNode MPOWER() { return getToken(EU4GrammarParser.MPOWER, 0); }
		public Monarch_power_advisorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monarch_power_advisor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterMonarch_power_advisor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitMonarch_power_advisor(this);
		}
	}

	public final Monarch_power_advisorContext monarch_power_advisor() throws RecognitionException {
		Monarch_power_advisorContext _localctx = new Monarch_power_advisorContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_monarch_power_advisor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1906);
			match(MONARCH_POWER);
			setState(1907);
			match(MPOWER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MissionSeriesContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<Slot_missionSeriesContext> slot_missionSeries() {
			return getRuleContexts(Slot_missionSeriesContext.class);
		}
		public Slot_missionSeriesContext slot_missionSeries(int i) {
			return getRuleContext(Slot_missionSeriesContext.class,i);
		}
		public List<Generic_missionSeriesContext> generic_missionSeries() {
			return getRuleContexts(Generic_missionSeriesContext.class);
		}
		public Generic_missionSeriesContext generic_missionSeries(int i) {
			return getRuleContext(Generic_missionSeriesContext.class,i);
		}
		public List<Ai_triggerContext> ai_trigger() {
			return getRuleContexts(Ai_triggerContext.class);
		}
		public Ai_triggerContext ai_trigger(int i) {
			return getRuleContext(Ai_triggerContext.class,i);
		}
		public List<HasCountryShield_missionSeriesContext> hasCountryShield_missionSeries() {
			return getRuleContexts(HasCountryShield_missionSeriesContext.class);
		}
		public HasCountryShield_missionSeriesContext hasCountryShield_missionSeries(int i) {
			return getRuleContext(HasCountryShield_missionSeriesContext.class,i);
		}
		public List<PotentialOnLoad_missionSeriesContext> potentialOnLoad_missionSeries() {
			return getRuleContexts(PotentialOnLoad_missionSeriesContext.class);
		}
		public PotentialOnLoad_missionSeriesContext potentialOnLoad_missionSeries(int i) {
			return getRuleContext(PotentialOnLoad_missionSeriesContext.class,i);
		}
		public List<Potential_missionSeriesContext> potential_missionSeries() {
			return getRuleContexts(Potential_missionSeriesContext.class);
		}
		public Potential_missionSeriesContext potential_missionSeries(int i) {
			return getRuleContext(Potential_missionSeriesContext.class,i);
		}
		public List<MissionBlockContext> missionBlock() {
			return getRuleContexts(MissionBlockContext.class);
		}
		public MissionBlockContext missionBlock(int i) {
			return getRuleContext(MissionBlockContext.class,i);
		}
		public MissionSeriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missionSeries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterMissionSeries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitMissionSeries(this);
		}
	}

	public final MissionSeriesContext missionSeries() throws RecognitionException {
		MissionSeriesContext _localctx = new MissionSeriesContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1909);
			match(IDENTIFIER);
			setState(1910);
			match(LPAR);
			setState(1920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POTENTIAL || _la==AI || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & 527L) != 0)) {
				{
				setState(1918);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SLOT:
					{
					setState(1911);
					slot_missionSeries();
					}
					break;
				case GENERIC:
					{
					setState(1912);
					generic_missionSeries();
					}
					break;
				case AI:
					{
					setState(1913);
					ai_trigger();
					}
					break;
				case HAS_COUNTRY_SHIELD:
					{
					setState(1914);
					hasCountryShield_missionSeries();
					}
					break;
				case POTENTIAL_ON_LOAD:
					{
					setState(1915);
					potentialOnLoad_missionSeries();
					}
					break;
				case POTENTIAL:
					{
					setState(1916);
					potential_missionSeries();
					}
					break;
				case IDENTIFIER:
					{
					setState(1917);
					missionBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1922);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1923);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Slot_missionSeriesContext extends ParserRuleContext {
		public TerminalNode SLOT() { return getToken(EU4GrammarParser.SLOT, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public Slot_missionSeriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slot_missionSeries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterSlot_missionSeries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitSlot_missionSeries(this);
		}
	}

	public final Slot_missionSeriesContext slot_missionSeries() throws RecognitionException {
		Slot_missionSeriesContext _localctx = new Slot_missionSeriesContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_slot_missionSeries);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1925);
			match(SLOT);
			setState(1926);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Generic_missionSeriesContext extends ParserRuleContext {
		public TerminalNode GENERIC() { return getToken(EU4GrammarParser.GENERIC, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public Generic_missionSeriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_missionSeries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterGeneric_missionSeries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitGeneric_missionSeries(this);
		}
	}

	public final Generic_missionSeriesContext generic_missionSeries() throws RecognitionException {
		Generic_missionSeriesContext _localctx = new Generic_missionSeriesContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_generic_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1928);
			match(GENERIC);
			setState(1929);
			_la = _input.LA(1);
			if ( !(_la==YES || _la==NO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HasCountryShield_missionSeriesContext extends ParserRuleContext {
		public TerminalNode HAS_COUNTRY_SHIELD() { return getToken(EU4GrammarParser.HAS_COUNTRY_SHIELD, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public HasCountryShield_missionSeriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hasCountryShield_missionSeries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterHasCountryShield_missionSeries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitHasCountryShield_missionSeries(this);
		}
	}

	public final HasCountryShield_missionSeriesContext hasCountryShield_missionSeries() throws RecognitionException {
		HasCountryShield_missionSeriesContext _localctx = new HasCountryShield_missionSeriesContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_hasCountryShield_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1931);
			match(HAS_COUNTRY_SHIELD);
			setState(1932);
			_la = _input.LA(1);
			if ( !(_la==YES || _la==NO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PotentialOnLoad_missionSeriesContext extends ParserRuleContext {
		public TerminalNode POTENTIAL_ON_LOAD() { return getToken(EU4GrammarParser.POTENTIAL_ON_LOAD, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TriggerContext> trigger() {
			return getRuleContexts(TriggerContext.class);
		}
		public TriggerContext trigger(int i) {
			return getRuleContext(TriggerContext.class,i);
		}
		public PotentialOnLoad_missionSeriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potentialOnLoad_missionSeries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterPotentialOnLoad_missionSeries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitPotentialOnLoad_missionSeries(this);
		}
	}

	public final PotentialOnLoad_missionSeriesContext potentialOnLoad_missionSeries() throws RecognitionException {
		PotentialOnLoad_missionSeriesContext _localctx = new PotentialOnLoad_missionSeriesContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_potentialOnLoad_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1934);
			match(POTENTIAL_ON_LOAD);
			setState(1935);
			match(LPAR);
			setState(1939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611677218035203866L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 2259969L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 1125899906842629L) != 0)) {
				{
				{
				setState(1936);
				trigger();
				}
				}
				setState(1941);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1942);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Potential_missionSeriesContext extends ParserRuleContext {
		public TerminalNode POTENTIAL() { return getToken(EU4GrammarParser.POTENTIAL, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TriggerContext> trigger() {
			return getRuleContexts(TriggerContext.class);
		}
		public TriggerContext trigger(int i) {
			return getRuleContext(TriggerContext.class,i);
		}
		public Potential_missionSeriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potential_missionSeries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterPotential_missionSeries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitPotential_missionSeries(this);
		}
	}

	public final Potential_missionSeriesContext potential_missionSeries() throws RecognitionException {
		Potential_missionSeriesContext _localctx = new Potential_missionSeriesContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_potential_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1944);
			match(POTENTIAL);
			setState(1945);
			match(LPAR);
			setState(1949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611677218035203866L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 2259969L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 1125899906842629L) != 0)) {
				{
				{
				setState(1946);
				trigger();
				}
				}
				setState(1951);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1952);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MissionBlockContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<Icon_missionContext> icon_mission() {
			return getRuleContexts(Icon_missionContext.class);
		}
		public Icon_missionContext icon_mission(int i) {
			return getRuleContext(Icon_missionContext.class,i);
		}
		public List<Position_missionContext> position_mission() {
			return getRuleContexts(Position_missionContext.class);
		}
		public Position_missionContext position_mission(int i) {
			return getRuleContext(Position_missionContext.class,i);
		}
		public List<CompletedBy_missionContext> completedBy_mission() {
			return getRuleContexts(CompletedBy_missionContext.class);
		}
		public CompletedBy_missionContext completedBy_mission(int i) {
			return getRuleContext(CompletedBy_missionContext.class,i);
		}
		public List<RequiredMissions_missionContext> requiredMissions_mission() {
			return getRuleContexts(RequiredMissions_missionContext.class);
		}
		public RequiredMissions_missionContext requiredMissions_mission(int i) {
			return getRuleContext(RequiredMissions_missionContext.class,i);
		}
		public List<ProvincesToHighlight_missionContext> provincesToHighlight_mission() {
			return getRuleContexts(ProvincesToHighlight_missionContext.class);
		}
		public ProvincesToHighlight_missionContext provincesToHighlight_mission(int i) {
			return getRuleContext(ProvincesToHighlight_missionContext.class,i);
		}
		public List<Trigger_blockContext> trigger_block() {
			return getRuleContexts(Trigger_blockContext.class);
		}
		public Trigger_blockContext trigger_block(int i) {
			return getRuleContext(Trigger_blockContext.class,i);
		}
		public List<Effect_blockContext> effect_block() {
			return getRuleContexts(Effect_blockContext.class);
		}
		public Effect_blockContext effect_block(int i) {
			return getRuleContext(Effect_blockContext.class,i);
		}
		public List<AiWeight_missionContext> aiWeight_mission() {
			return getRuleContexts(AiWeight_missionContext.class);
		}
		public AiWeight_missionContext aiWeight_mission(int i) {
			return getRuleContext(AiWeight_missionContext.class,i);
		}
		public MissionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterMissionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitMissionBlock(this);
		}
	}

	public final MissionBlockContext missionBlock() throws RecognitionException {
		MissionBlockContext _localctx = new MissionBlockContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_missionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1954);
			match(IDENTIFIER);
			setState(1955);
			match(LPAR);
			setState(1966);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & -9223372036854775805L) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & 31L) != 0)) {
				{
				setState(1964);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ICON:
					{
					setState(1956);
					icon_mission();
					}
					break;
				case POSITION:
					{
					setState(1957);
					position_mission();
					}
					break;
				case COMPLETED_BY:
					{
					setState(1958);
					completedBy_mission();
					}
					break;
				case REQUIRED_MISSIONS:
					{
					setState(1959);
					requiredMissions_mission();
					}
					break;
				case PROVINCES_TO_HIGHLIGHT:
					{
					setState(1960);
					provincesToHighlight_mission();
					}
					break;
				case TRIGGER:
					{
					setState(1961);
					trigger_block();
					}
					break;
				case EFFECT:
					{
					setState(1962);
					effect_block();
					}
					break;
				case AI_WEIGHT:
					{
					setState(1963);
					aiWeight_mission();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1968);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1969);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Icon_missionContext extends ParserRuleContext {
		public TerminalNode ICON() { return getToken(EU4GrammarParser.ICON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public Icon_missionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_icon_mission; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterIcon_mission(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitIcon_mission(this);
		}
	}

	public final Icon_missionContext icon_mission() throws RecognitionException {
		Icon_missionContext _localctx = new Icon_missionContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_icon_mission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1971);
			match(ICON);
			setState(1972);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Position_missionContext extends ParserRuleContext {
		public TerminalNode POSITION() { return getToken(EU4GrammarParser.POSITION, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public Position_missionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_position_mission; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterPosition_mission(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitPosition_mission(this);
		}
	}

	public final Position_missionContext position_mission() throws RecognitionException {
		Position_missionContext _localctx = new Position_missionContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_position_mission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1974);
			match(POSITION);
			setState(1975);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompletedBy_missionContext extends ParserRuleContext {
		public TerminalNode COMPLETED_BY() { return getToken(EU4GrammarParser.COMPLETED_BY, 0); }
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public CompletedBy_missionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_completedBy_mission; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterCompletedBy_mission(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitCompletedBy_mission(this);
		}
	}

	public final CompletedBy_missionContext completedBy_mission() throws RecognitionException {
		CompletedBy_missionContext _localctx = new CompletedBy_missionContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_completedBy_mission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1977);
			match(COMPLETED_BY);
			setState(1978);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequiredMissions_missionContext extends ParserRuleContext {
		public TerminalNode REQUIRED_MISSIONS() { return getToken(EU4GrammarParser.REQUIRED_MISSIONS, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public RequiredMissions_missionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requiredMissions_mission; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterRequiredMissions_mission(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitRequiredMissions_mission(this);
		}
	}

	public final RequiredMissions_missionContext requiredMissions_mission() throws RecognitionException {
		RequiredMissions_missionContext _localctx = new RequiredMissions_missionContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_requiredMissions_mission);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1980);
			match(REQUIRED_MISSIONS);
			setState(1981);
			match(LPAR);
			setState(1985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1982);
				match(IDENTIFIER);
				}
				}
				setState(1987);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1988);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProvincesToHighlight_missionContext extends ParserRuleContext {
		public TerminalNode PROVINCES_TO_HIGHLIGHT() { return getToken(EU4GrammarParser.PROVINCES_TO_HIGHLIGHT, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TriggerContext> trigger() {
			return getRuleContexts(TriggerContext.class);
		}
		public TriggerContext trigger(int i) {
			return getRuleContext(TriggerContext.class,i);
		}
		public ProvincesToHighlight_missionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_provincesToHighlight_mission; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterProvincesToHighlight_mission(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitProvincesToHighlight_mission(this);
		}
	}

	public final ProvincesToHighlight_missionContext provincesToHighlight_mission() throws RecognitionException {
		ProvincesToHighlight_missionContext _localctx = new ProvincesToHighlight_missionContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_provincesToHighlight_mission);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1990);
			match(PROVINCES_TO_HIGHLIGHT);
			setState(1991);
			match(LPAR);
			setState(1995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611677218035203866L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 2259969L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 1125899906842629L) != 0)) {
				{
				{
				setState(1992);
				trigger();
				}
				}
				setState(1997);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1998);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AiWeight_missionContext extends ParserRuleContext {
		public TerminalNode AI_WEIGHT() { return getToken(EU4GrammarParser.AI_WEIGHT, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public AiWeight_missionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aiWeight_mission; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).enterAiWeight_mission(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EU4GrammarParserListener ) ((EU4GrammarParserListener)listener).exitAiWeight_mission(this);
		}
	}

	public final AiWeight_missionContext aiWeight_mission() throws RecognitionException {
		AiWeight_missionContext _localctx = new AiWeight_missionContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_aiWeight_mission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2000);
			match(AI_WEIGHT);
			setState(2001);
			match(LPAR);
			setState(2002);
			factor();
			setState(2003);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00c3\u07d6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
		"\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
		"\u008f\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007"+
		"\u0092\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007"+
		"\u0095\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007"+
		"\u0098\u0002\u0099\u0007\u0099\u0002\u009a\u0007\u009a\u0002\u009b\u0007"+
		"\u009b\u0002\u009c\u0007\u009c\u0002\u009d\u0007\u009d\u0002\u009e\u0007"+
		"\u009e\u0002\u009f\u0007\u009f\u0002\u00a0\u0007\u00a0\u0002\u00a1\u0007"+
		"\u00a1\u0002\u00a2\u0007\u00a2\u0001\u0000\u0005\u0000\u0148\b\u0000\n"+
		"\u0000\f\u0000\u014b\t\u0000\u0001\u0000\u0005\u0000\u014e\b\u0000\n\u0000"+
		"\f\u0000\u0151\t\u0000\u0001\u0000\u0005\u0000\u0154\b\u0000\n\u0000\f"+
		"\u0000\u0157\t\u0000\u0001\u0000\u0005\u0000\u015a\b\u0000\n\u0000\f\u0000"+
		"\u015d\t\u0000\u0001\u0000\u0005\u0000\u0160\b\u0000\n\u0000\f\u0000\u0163"+
		"\t\u0000\u0001\u0000\u0005\u0000\u0166\b\u0000\n\u0000\f\u0000\u0169\t"+
		"\u0000\u0001\u0000\u0005\u0000\u016c\b\u0000\n\u0000\f\u0000\u016f\t\u0000"+
		"\u0001\u0000\u0005\u0000\u0172\b\u0000\n\u0000\f\u0000\u0175\t\u0000\u0001"+
		"\u0000\u0005\u0000\u0178\b\u0000\n\u0000\f\u0000\u017b\t\u0000\u0001\u0000"+
		"\u0005\u0000\u017e\b\u0000\n\u0000\f\u0000\u0181\t\u0000\u0001\u0000\u0005"+
		"\u0000\u0184\b\u0000\n\u0000\f\u0000\u0187\t\u0000\u0001\u0000\u0005\u0000"+
		"\u018a\b\u0000\n\u0000\f\u0000\u018d\t\u0000\u0001\u0000\u0005\u0000\u0190"+
		"\b\u0000\n\u0000\f\u0000\u0193\t\u0000\u0001\u0000\u0005\u0000\u0196\b"+
		"\u0000\n\u0000\f\u0000\u0199\t\u0000\u0001\u0000\u0005\u0000\u019c\b\u0000"+
		"\n\u0000\f\u0000\u019f\t\u0000\u0001\u0000\u0005\u0000\u01a2\b\u0000\n"+
		"\u0000\f\u0000\u01a5\t\u0000\u0001\u0000\u0005\u0000\u01a8\b\u0000\n\u0000"+
		"\f\u0000\u01ab\t\u0000\u0001\u0000\u0005\u0000\u01ae\b\u0000\n\u0000\f"+
		"\u0000\u01b1\t\u0000\u0001\u0000\u0005\u0000\u01b4\b\u0000\n\u0000\f\u0000"+
		"\u01b7\t\u0000\u0003\u0000\u01b9\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001\u01be\b\u0001\n\u0001\f\u0001\u01c1\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002\u01c7\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u01cc\b\u0003\n\u0003\f\u0003\u01cf"+
		"\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u01d6\b\u0004\n\u0004\f\u0004\u01d9\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u01e0\b\u0005\n\u0005"+
		"\f\u0005\u01e3\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u01ea\b\u0006\n\u0006\f\u0006\u01ed\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u01f4"+
		"\b\u0007\n\u0007\f\u0007\u01f7\t\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u01fe\b\b\n\b\f\b\u0201\t\b\u0001\b\u0005\b\u0204"+
		"\b\b\n\b\f\b\u0207\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0005\t\u020f\b\t\n\t\f\t\u0212\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u0219\b\n\n\n\f\n\u021c\t\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u0225\b\u000b\u000b"+
		"\u000b\f\u000b\u0226\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0004"+
		"\f\u022e\b\f\u000b\f\f\f\u022f\u0001\f\u0004\f\u0233\b\f\u000b\f\f\f\u0234"+
		"\u0001\f\u0004\f\u0238\b\f\u000b\f\f\f\u0239\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0004\r\u0241\b\r\u000b\r\f\r\u0242\u0005\r\u0245\b\r\n\r\f"+
		"\r\u0248\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u025a"+
		"\b\u0010\n\u0010\f\u0010\u025d\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u0268\b\u0012\n\u0012\f\u0012\u026b\t\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u0282\b\u0019\n\u0019\f\u0019\u0285\t\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u028c\b\u001a\n\u001a\f\u001a\u028f\t\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0297\b\u001b\n"+
		"\u001b\f\u001b\u029a\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u02a2\b\u001c\n\u001c\f\u001c"+
		"\u02a5\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u02aa\b"+
		"\u001c\n\u001c\f\u001c\u02ad\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0005\u001d\u02b3\b\u001d\n\u001d\f\u001d\u02b6\t\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0005\u001e\u02c0\b\u001e\n\u001e\f\u001e\u02c3\t\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f"+
		"\u02ca\b\u001f\n\u001f\f\u001f\u02cd\t\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u02d1\b\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!"+
		"\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u02f0\b\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0005\'\u0315\b\'\n\'\f\'\u0318\t\'\u0001\'\u0001\'"+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u032c\b)\u0001)\u0001"+
		")\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0338"+
		"\b*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0003+\u0344\b+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0003,\u0350\b,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0003-\u035c\b-\u0001-\u0001-\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u0368\b.\u0001.\u0001"+
		".\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u0374"+
		"\b/\u0001/\u0001/\u00010\u00010\u00010\u00011\u00011\u00011\u00012\u0001"+
		"2\u00012\u00012\u00012\u00052\u0383\b2\n2\f2\u0386\t2\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00032\u0399\b2\u00013\u00013\u00013\u0001"+
		"3\u00013\u00043\u03a0\b3\u000b3\f3\u03a1\u00013\u00013\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00054\u03ae\b4\n4\f4\u03b1\t4\u0001"+
		"4\u00014\u00015\u00015\u00015\u00015\u00055\u03b9\b5\n5\f5\u03bc\t5\u0001"+
		"5\u00015\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0003"+
		"6\u03c8\b6\u00016\u00016\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"9\u00019\u00019\u00059\u03df\b9\n9\f9\u03e2\t9\u00019\u00019\u0001:\u0001"+
		":\u0001:\u0005:\u03e9\b:\n:\f:\u03ec\t:\u0001:\u0001:\u0001;\u0001;\u0001"+
		";\u0005;\u03f3\b;\n;\f;\u03f6\t;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001"+
		"=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0005@\u040e\b@\n@\f@\u0411"+
		"\t@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0003A\u0429\bA\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0005B\u0433\bB\nB\fB\u0436\tB\u0001B\u0001B\u0001C\u0001"+
		"C\u0001C\u0005C\u043d\bC\nC\fC\u0440\tC\u0001C\u0001C\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0005D\u044a\bD\nD\fD\u044d\tD\u0001D\u0001D\u0001"+
		"E\u0001E\u0001E\u0001E\u0001E\u0005E\u0456\bE\nE\fE\u0459\tE\u0001E\u0001"+
		"E\u0001F\u0001F\u0001F\u0001F\u0004F\u0461\bF\u000bF\fF\u0462\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0005F\u046a\bF\nF\fF\u046d\tF\u0001F\u0004F\u0470"+
		"\bF\u000bF\fF\u0471\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0003G\u047c\bG\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0004H\u0484"+
		"\bH\u000bH\fH\u0485\u0001H\u0004H\u0489\bH\u000bH\fH\u048a\u0001H\u0001"+
		"H\u0001I\u0001I\u0001I\u0001I\u0001I\u0004I\u0494\bI\u000bI\fI\u0495\u0001"+
		"I\u0001I\u0001J\u0001J\u0001J\u0001K\u0001K\u0001K\u0005K\u04a0\bK\nK"+
		"\fK\u04a3\tK\u0001K\u0001K\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001"+
		"L\u0001L\u0001L\u0001L\u0005L\u04b1\bL\nL\fL\u04b4\tL\u0001L\u0001L\u0001"+
		"M\u0001M\u0001M\u0004M\u04bb\bM\u000bM\fM\u04bc\u0001M\u0004M\u04c0\b"+
		"M\u000bM\fM\u04c1\u0001M\u0004M\u04c5\bM\u000bM\fM\u04c6\u0001M\u0001"+
		"M\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001O\u0001O\u0001O\u0005O\u04d8\bO\nO\fO\u04db\tO\u0001O\u0005O\u04de"+
		"\bO\nO\fO\u04e1\tO\u0001O\u0001O\u0001O\u0005O\u04e6\bO\nO\fO\u04e9\t"+
		"O\u0001O\u0001O\u0001P\u0001P\u0001P\u0005P\u04f0\bP\nP\fP\u04f3\tP\u0001"+
		"P\u0001P\u0001Q\u0001Q\u0001Q\u0005Q\u04fa\bQ\nQ\fQ\u04fd\tQ\u0001Q\u0001"+
		"Q\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0004R\u0508\bR\u000b"+
		"R\fR\u0509\u0001R\u0001R\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0005"+
		"S\u0514\bS\nS\fS\u0517\tS\u0001S\u0001S\u0001T\u0001T\u0001T\u0001U\u0001"+
		"U\u0001U\u0001U\u0001U\u0004U\u0523\bU\u000bU\fU\u0524\u0001U\u0004U\u0528"+
		"\bU\u000bU\fU\u0529\u0001U\u0004U\u052d\bU\u000bU\fU\u052e\u0001U\u0004"+
		"U\u0532\bU\u000bU\fU\u0533\u0001U\u0001U\u0001V\u0001V\u0001V\u0005V\u053b"+
		"\bV\nV\fV\u053e\tV\u0001V\u0001V\u0001W\u0001W\u0001W\u0001W\u0005W\u0546"+
		"\bW\nW\fW\u0549\tW\u0001W\u0001W\u0001X\u0001X\u0001X\u0001X\u0001X\u0001"+
		"X\u0001X\u0001X\u0004X\u0555\bX\u000bX\fX\u0556\u0001X\u0004X\u055a\b"+
		"X\u000bX\fX\u055b\u0001X\u0004X\u055f\bX\u000bX\fX\u0560\u0001X\u0004"+
		"X\u0564\bX\u000bX\fX\u0565\u0001Y\u0001Y\u0001Y\u0001Y\u0004Y\u056c\b"+
		"Y\u000bY\fY\u056d\u0001Y\u0001Y\u0001Z\u0001Z\u0001Z\u0001Z\u0004Z\u0576"+
		"\bZ\u000bZ\fZ\u0577\u0001Z\u0001Z\u0001[\u0001[\u0001[\u0001[\u0004[\u0580"+
		"\b[\u000b[\f[\u0581\u0001[\u0001[\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0003\\\u058e\b\\\u0001]\u0001]\u0001]\u0001"+
		"]\u0003]\u0594\b]\u0001^\u0001^\u0001^\u0001^\u0004^\u059a\b^\u000b^\f"+
		"^\u059b\u0001^\u0001^\u0004^\u05a0\b^\u000b^\f^\u05a1\u0001^\u0001^\u0001"+
		"_\u0001_\u0001_\u0001`\u0001`\u0001`\u0001a\u0001a\u0001a\u0005a\u05af"+
		"\ba\na\fa\u05b2\ta\u0001a\u0005a\u05b5\ba\na\fa\u05b8\ta\u0001a\u0001"+
		"a\u0001b\u0001b\u0001b\u0001c\u0001c\u0001c\u0001c\u0004c\u05c3\bc\u000b"+
		"c\fc\u05c4\u0001c\u0001c\u0001d\u0001d\u0001d\u0001e\u0001e\u0001e\u0001"+
		"f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0001f\u0005"+
		"f\u05d9\bf\nf\ff\u05dc\tf\u0001f\u0003f\u05df\bf\u0001f\u0001f\u0001g"+
		"\u0001g\u0001g\u0001h\u0001h\u0001h\u0003h\u05e9\bh\u0001i\u0001i\u0001"+
		"i\u0005i\u05ee\bi\ni\fi\u05f1\ti\u0001i\u0001i\u0001j\u0001j\u0001j\u0005"+
		"j\u05f8\bj\nj\fj\u05fb\tj\u0001j\u0001j\u0001k\u0001k\u0001k\u0005k\u0602"+
		"\bk\nk\fk\u0605\tk\u0001k\u0001k\u0001l\u0001l\u0001l\u0001l\u0001l\u0001"+
		"l\u0004l\u060f\bl\u000bl\fl\u0610\u0001l\u0001l\u0001m\u0001m\u0001m\u0001"+
		"n\u0001n\u0001n\u0001o\u0001o\u0001o\u0001p\u0001p\u0001p\u0001q\u0001"+
		"q\u0001q\u0001r\u0001r\u0001r\u0001s\u0001s\u0001s\u0001t\u0001t\u0001"+
		"t\u0001u\u0001u\u0001u\u0005u\u0630\bu\nu\fu\u0633\tu\u0001u\u0001u\u0001"+
		"v\u0001v\u0001v\u0001w\u0001w\u0001w\u0001x\u0001x\u0001x\u0001y\u0001"+
		"y\u0001y\u0001y\u0001y\u0001y\u0001y\u0001y\u0001y\u0003y\u0649\by\u0001"+
		"z\u0001z\u0001z\u0003z\u064e\bz\u0001z\u0003z\u0651\bz\u0001z\u0003z\u0654"+
		"\bz\u0001z\u0003z\u0657\bz\u0001z\u0003z\u065a\bz\u0001z\u0003z\u065d"+
		"\bz\u0001z\u0003z\u0660\bz\u0001z\u0005z\u0663\bz\nz\fz\u0666\tz\u0001"+
		"z\u0001z\u0001{\u0001{\u0001{\u0005{\u066d\b{\n{\f{\u0670\t{\u0001{\u0001"+
		"{\u0001|\u0001|\u0001|\u0005|\u0677\b|\n|\f|\u067a\t|\u0001|\u0001|\u0001"+
		"}\u0001}\u0001}\u0004}\u0681\b}\u000b}\f}\u0682\u0001}\u0001}\u0001~\u0001"+
		"~\u0001~\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u0080\u0001\u0080\u0001"+
		"\u0080\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0082\u0001\u0082\u0001"+
		"\u0082\u0001\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0001"+
		"\u0083\u0001\u0083\u0003\u0083\u069d\b\u0083\u0001\u0084\u0001\u0084\u0001"+
		"\u0084\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0086\u0001\u0086\u0001"+
		"\u0086\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001"+
		"\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0005\u0087\u06b1\b\u0087\n"+
		"\u0087\f\u0087\u06b4\t\u0087\u0001\u0087\u0001\u0087\u0001\u0088\u0001"+
		"\u0088\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0088\u0005"+
		"\u0088\u06bf\b\u0088\n\u0088\f\u0088\u06c2\t\u0088\u0001\u0088\u0001\u0088"+
		"\u0005\u0088\u06c6\b\u0088\n\u0088\f\u0088\u06c9\t\u0088\u0001\u0088\u0001"+
		"\u0088\u0005\u0088\u06cd\b\u0088\n\u0088\f\u0088\u06d0\t\u0088\u0001\u0088"+
		"\u0001\u0088\u0005\u0088\u06d4\b\u0088\n\u0088\f\u0088\u06d7\t\u0088\u0001"+
		"\u0088\u0001\u0088\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0005\u0089\u06e0\b\u0089\n\u0089\f\u0089\u06e3\t\u0089\u0001\u0089"+
		"\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0005\u0089"+
		"\u06eb\b\u0089\n\u0089\f\u0089\u06ee\t\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0005\u0089\u06f6\b\u0089\n"+
		"\u0089\f\u0089\u06f9\t\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0005\u0089\u0703"+
		"\b\u0089\n\u0089\f\u0089\u0706\t\u0089\u0001\u0089\u0001\u0089\u0001\u008a"+
		"\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008b\u0001\u008b"+
		"\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008c\u0001\u008c"+
		"\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008d"+
		"\u0001\u008d\u0001\u008d\u0001\u008e\u0001\u008e\u0001\u008e\u0005\u008e"+
		"\u0722\b\u008e\n\u008e\f\u008e\u0725\t\u008e\u0001\u008e\u0001\u008e\u0001"+
		"\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0005\u008f\u072d\b\u008f\n"+
		"\u008f\f\u008f\u0730\t\u008f\u0001\u008f\u0001\u008f\u0001\u0090\u0001"+
		"\u0090\u0001\u0090\u0005\u0090\u0737\b\u0090\n\u0090\f\u0090\u073a\t\u0090"+
		"\u0001\u0090\u0001\u0090\u0001\u0091\u0001\u0091\u0001\u0091\u0001\u0091"+
		"\u0001\u0091\u0005\u0091\u0743\b\u0091\n\u0091\f\u0091\u0746\t\u0091\u0001"+
		"\u0091\u0001\u0091\u0001\u0091\u0001\u0092\u0001\u0092\u0001\u0092\u0005"+
		"\u0092\u074e\b\u0092\n\u0092\f\u0092\u0751\t\u0092\u0001\u0092\u0001\u0092"+
		"\u0001\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0001\u0093"+
		"\u0001\u0093\u0001\u0093\u0005\u0093\u075d\b\u0093\n\u0093\f\u0093\u0760"+
		"\t\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0001\u0094\u0001\u0094\u0001"+
		"\u0094\u0001\u0094\u0001\u0094\u0005\u0094\u076a\b\u0094\n\u0094\f\u0094"+
		"\u076d\t\u0094\u0001\u0094\u0001\u0094\u0001\u0094\u0001\u0094\u0001\u0095"+
		"\u0001\u0095\u0001\u0095\u0001\u0096\u0001\u0096\u0001\u0096\u0001\u0096"+
		"\u0001\u0096\u0001\u0096\u0001\u0096\u0001\u0096\u0001\u0096\u0005\u0096"+
		"\u077f\b\u0096\n\u0096\f\u0096\u0782\t\u0096\u0001\u0096\u0001\u0096\u0001"+
		"\u0097\u0001\u0097\u0001\u0097\u0001\u0098\u0001\u0098\u0001\u0098\u0001"+
		"\u0099\u0001\u0099\u0001\u0099\u0001\u009a\u0001\u009a\u0001\u009a\u0005"+
		"\u009a\u0792\b\u009a\n\u009a\f\u009a\u0795\t\u009a\u0001\u009a\u0001\u009a"+
		"\u0001\u009b\u0001\u009b\u0001\u009b\u0005\u009b\u079c\b\u009b\n\u009b"+
		"\f\u009b\u079f\t\u009b\u0001\u009b\u0001\u009b\u0001\u009c\u0001\u009c"+
		"\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009c"+
		"\u0001\u009c\u0001\u009c\u0005\u009c\u07ad\b\u009c\n\u009c\f\u009c\u07b0"+
		"\t\u009c\u0001\u009c\u0001\u009c\u0001\u009d\u0001\u009d\u0001\u009d\u0001"+
		"\u009e\u0001\u009e\u0001\u009e\u0001\u009f\u0001\u009f\u0001\u009f\u0001"+
		"\u00a0\u0001\u00a0\u0001\u00a0\u0005\u00a0\u07c0\b\u00a0\n\u00a0\f\u00a0"+
		"\u07c3\t\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a1\u0001\u00a1\u0001\u00a1"+
		"\u0005\u00a1\u07ca\b\u00a1\n\u00a1\f\u00a1\u07cd\t\u00a1\u0001\u00a1\u0001"+
		"\u00a1\u0001\u00a2\u0001\u00a2\u0001\u00a2\u0001\u00a2\u0001\u00a2\u0001"+
		"\u00a2\u0000\u0000\u00a3\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120"+
		"\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138"+
		"\u013a\u013c\u013e\u0140\u0142\u0144\u0000\u0014\u0001\u0000#$\u0002\u0000"+
		"\b\b\n\n\u0004\u0000\u0003\u0004\u0007\nSS\u00c1\u00c1\u0001\u0000\u0003"+
		"\u0004\u0002\u0000\u0007\u0007SS\u0001\u0000TU\u0002\u0000\t\t\u00c1\u00c1"+
		"\u0002\u0000\b\b\u00c1\u00c1\u0002\u0000SS\u00c1\u00c1\u0004\u0000\u0001"+
		"\u0002\u0005\u0005\u0007\u0007SS\u0001\u0000\u00b0\u00b1\u0001\u0000y"+
		"{\u0001\u0000}\u007f\u0002\u0000\u0082\u0083\u0085\u0088\u0001\u0000\u00c1"+
		"\u00c2\u0002\u0000\t\t\u00c1\u00c2\u0001\u0000\u0095\u0096\u0001\u0000"+
		"<=\u0001\u00007;\u0001\u0000\u00a8\u00a9\u086a\u0000\u01b8\u0001\u0000"+
		"\u0000\u0000\u0002\u01ba\u0001\u0000\u0000\u0000\u0004\u01c6\u0001\u0000"+
		"\u0000\u0000\u0006\u01c8\u0001\u0000\u0000\u0000\b\u01d2\u0001\u0000\u0000"+
		"\u0000\n\u01dc\u0001\u0000\u0000\u0000\f\u01e6\u0001\u0000\u0000\u0000"+
		"\u000e\u01f0\u0001\u0000\u0000\u0000\u0010\u01fa\u0001\u0000\u0000\u0000"+
		"\u0012\u020a\u0001\u0000\u0000\u0000\u0014\u0215\u0001\u0000\u0000\u0000"+
		"\u0016\u021f\u0001\u0000\u0000\u0000\u0018\u022a\u0001\u0000\u0000\u0000"+
		"\u001a\u023d\u0001\u0000\u0000\u0000\u001c\u024b\u0001\u0000\u0000\u0000"+
		"\u001e\u024e\u0001\u0000\u0000\u0000 \u0256\u0001\u0000\u0000\u0000\""+
		"\u0260\u0001\u0000\u0000\u0000$\u0263\u0001\u0000\u0000\u0000&\u026e\u0001"+
		"\u0000\u0000\u0000(\u0270\u0001\u0000\u0000\u0000*\u0273\u0001\u0000\u0000"+
		"\u0000,\u0276\u0001\u0000\u0000\u0000.\u0279\u0001\u0000\u0000\u00000"+
		"\u027b\u0001\u0000\u0000\u00002\u027e\u0001\u0000\u0000\u00004\u0288\u0001"+
		"\u0000\u0000\u00006\u0292\u0001\u0000\u0000\u00008\u029d\u0001\u0000\u0000"+
		"\u0000:\u02ae\u0001\u0000\u0000\u0000<\u02b9\u0001\u0000\u0000\u0000>"+
		"\u02c6\u0001\u0000\u0000\u0000@\u02d2\u0001\u0000\u0000\u0000B\u02d5\u0001"+
		"\u0000\u0000\u0000D\u02ef\u0001\u0000\u0000\u0000F\u02f1\u0001\u0000\u0000"+
		"\u0000H\u02f9\u0001\u0000\u0000\u0000J\u0301\u0001\u0000\u0000\u0000L"+
		"\u0309\u0001\u0000\u0000\u0000N\u0311\u0001\u0000\u0000\u0000P\u031b\u0001"+
		"\u0000\u0000\u0000R\u0323\u0001\u0000\u0000\u0000T\u032f\u0001\u0000\u0000"+
		"\u0000V\u033b\u0001\u0000\u0000\u0000X\u0347\u0001\u0000\u0000\u0000Z"+
		"\u0353\u0001\u0000\u0000\u0000\\\u035f\u0001\u0000\u0000\u0000^\u036b"+
		"\u0001\u0000\u0000\u0000`\u0377\u0001\u0000\u0000\u0000b\u037a\u0001\u0000"+
		"\u0000\u0000d\u0398\u0001\u0000\u0000\u0000f\u039a\u0001\u0000\u0000\u0000"+
		"h\u03a5\u0001\u0000\u0000\u0000j\u03b4\u0001\u0000\u0000\u0000l\u03bf"+
		"\u0001\u0000\u0000\u0000n\u03cb\u0001\u0000\u0000\u0000p\u03d3\u0001\u0000"+
		"\u0000\u0000r\u03db\u0001\u0000\u0000\u0000t\u03e5\u0001\u0000\u0000\u0000"+
		"v\u03ef\u0001\u0000\u0000\u0000x\u03f9\u0001\u0000\u0000\u0000z\u03fc"+
		"\u0001\u0000\u0000\u0000|\u03ff\u0001\u0000\u0000\u0000~\u0402\u0001\u0000"+
		"\u0000\u0000\u0080\u040a\u0001\u0000\u0000\u0000\u0082\u0428\u0001\u0000"+
		"\u0000\u0000\u0084\u042a\u0001\u0000\u0000\u0000\u0086\u0439\u0001\u0000"+
		"\u0000\u0000\u0088\u0443\u0001\u0000\u0000\u0000\u008a\u0450\u0001\u0000"+
		"\u0000\u0000\u008c\u045c\u0001\u0000\u0000\u0000\u008e\u047b\u0001\u0000"+
		"\u0000\u0000\u0090\u047d\u0001\u0000\u0000\u0000\u0092\u048e\u0001\u0000"+
		"\u0000\u0000\u0094\u0499\u0001\u0000\u0000\u0000\u0096\u049c\u0001\u0000"+
		"\u0000\u0000\u0098\u04a6\u0001\u0000\u0000\u0000\u009a\u04b7\u0001\u0000"+
		"\u0000\u0000\u009c\u04ca\u0001\u0000\u0000\u0000\u009e\u04d4\u0001\u0000"+
		"\u0000\u0000\u00a0\u04ec\u0001\u0000\u0000\u0000\u00a2\u04f6\u0001\u0000"+
		"\u0000\u0000\u00a4\u0500\u0001\u0000\u0000\u0000\u00a6\u050d\u0001\u0000"+
		"\u0000\u0000\u00a8\u051a\u0001\u0000\u0000\u0000\u00aa\u051d\u0001\u0000"+
		"\u0000\u0000\u00ac\u0537\u0001\u0000\u0000\u0000\u00ae\u0541\u0001\u0000"+
		"\u0000\u0000\u00b0\u0563\u0001\u0000\u0000\u0000\u00b2\u0567\u0001\u0000"+
		"\u0000\u0000\u00b4\u0571\u0001\u0000\u0000\u0000\u00b6\u057b\u0001\u0000"+
		"\u0000\u0000\u00b8\u058d\u0001\u0000\u0000\u0000\u00ba\u0593\u0001\u0000"+
		"\u0000\u0000\u00bc\u0595\u0001\u0000\u0000\u0000\u00be\u05a5\u0001\u0000"+
		"\u0000\u0000\u00c0\u05a8\u0001\u0000\u0000\u0000\u00c2\u05ab\u0001\u0000"+
		"\u0000\u0000\u00c4\u05bb\u0001\u0000\u0000\u0000\u00c6\u05be\u0001\u0000"+
		"\u0000\u0000\u00c8\u05c8\u0001\u0000\u0000\u0000\u00ca\u05cb\u0001\u0000"+
		"\u0000\u0000\u00cc\u05ce\u0001\u0000\u0000\u0000\u00ce\u05e2\u0001\u0000"+
		"\u0000\u0000\u00d0\u05e8\u0001\u0000\u0000\u0000\u00d2\u05ea\u0001\u0000"+
		"\u0000\u0000\u00d4\u05f4\u0001\u0000\u0000\u0000\u00d6\u05fe\u0001\u0000"+
		"\u0000\u0000\u00d8\u0608\u0001\u0000\u0000\u0000\u00da\u0614\u0001\u0000"+
		"\u0000\u0000\u00dc\u0617\u0001\u0000\u0000\u0000\u00de\u061a\u0001\u0000"+
		"\u0000\u0000\u00e0\u061d\u0001\u0000\u0000\u0000\u00e2\u0620\u0001\u0000"+
		"\u0000\u0000\u00e4\u0623\u0001\u0000\u0000\u0000\u00e6\u0626\u0001\u0000"+
		"\u0000\u0000\u00e8\u0629\u0001\u0000\u0000\u0000\u00ea\u062c\u0001\u0000"+
		"\u0000\u0000\u00ec\u0636\u0001\u0000\u0000\u0000\u00ee\u0639\u0001\u0000"+
		"\u0000\u0000\u00f0\u063c\u0001\u0000\u0000\u0000\u00f2\u0648\u0001\u0000"+
		"\u0000\u0000\u00f4\u064a\u0001\u0000\u0000\u0000\u00f6\u0669\u0001\u0000"+
		"\u0000\u0000\u00f8\u0673\u0001\u0000\u0000\u0000\u00fa\u067d\u0001\u0000"+
		"\u0000\u0000\u00fc\u0686\u0001\u0000\u0000\u0000\u00fe\u0689\u0001\u0000"+
		"\u0000\u0000\u0100\u068c\u0001\u0000\u0000\u0000\u0102\u068f\u0001\u0000"+
		"\u0000\u0000\u0104\u0692\u0001\u0000\u0000\u0000\u0106\u069c\u0001\u0000"+
		"\u0000\u0000\u0108\u069e\u0001\u0000\u0000\u0000\u010a\u06a1\u0001\u0000"+
		"\u0000\u0000\u010c\u06a4\u0001\u0000\u0000\u0000\u010e\u06a7\u0001\u0000"+
		"\u0000\u0000\u0110\u06b7\u0001\u0000\u0000\u0000\u0112\u06da\u0001\u0000"+
		"\u0000\u0000\u0114\u0709\u0001\u0000\u0000\u0000\u0116\u070e\u0001\u0000"+
		"\u0000\u0000\u0118\u0714\u0001\u0000\u0000\u0000\u011a\u071b\u0001\u0000"+
		"\u0000\u0000\u011c\u071e\u0001\u0000\u0000\u0000\u011e\u0728\u0001\u0000"+
		"\u0000\u0000\u0120\u0733\u0001\u0000\u0000\u0000\u0122\u073d\u0001\u0000"+
		"\u0000\u0000\u0124\u074a\u0001\u0000\u0000\u0000\u0126\u0754\u0001\u0000"+
		"\u0000\u0000\u0128\u0764\u0001\u0000\u0000\u0000\u012a\u0772\u0001\u0000"+
		"\u0000\u0000\u012c\u0775\u0001\u0000\u0000\u0000\u012e\u0785\u0001\u0000"+
		"\u0000\u0000\u0130\u0788\u0001\u0000\u0000\u0000\u0132\u078b\u0001\u0000"+
		"\u0000\u0000\u0134\u078e\u0001\u0000\u0000\u0000\u0136\u0798\u0001\u0000"+
		"\u0000\u0000\u0138\u07a2\u0001\u0000\u0000\u0000\u013a\u07b3\u0001\u0000"+
		"\u0000\u0000\u013c\u07b6\u0001\u0000\u0000\u0000\u013e\u07b9\u0001\u0000"+
		"\u0000\u0000\u0140\u07bc\u0001\u0000\u0000\u0000\u0142\u07c6\u0001\u0000"+
		"\u0000\u0000\u0144\u07d0\u0001\u0000\u0000\u0000\u0146\u0148\u0003\u0128"+
		"\u0094\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0148\u014b\u0001\u0000"+
		"\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000"+
		"\u0000\u0000\u014a\u01b9\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000"+
		"\u0000\u0000\u014c\u014e\u0003\u0126\u0093\u0000\u014d\u014c\u0001\u0000"+
		"\u0000\u0000\u014e\u0151\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000"+
		"\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u01b9\u0001\u0000"+
		"\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0152\u0154\u0003\u0118"+
		"\u008c\u0000\u0153\u0152\u0001\u0000\u0000\u0000\u0154\u0157\u0001\u0000"+
		"\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000"+
		"\u0000\u0000\u0156\u01b9\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000"+
		"\u0000\u0000\u0158\u015a\u0003\u0112\u0089\u0000\u0159\u0158\u0001\u0000"+
		"\u0000\u0000\u015a\u015d\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000"+
		"\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u01b9\u0001\u0000"+
		"\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u0160\u0003\u0110"+
		"\u0088\u0000\u015f\u015e\u0001\u0000\u0000\u0000\u0160\u0163\u0001\u0000"+
		"\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000"+
		"\u0000\u0000\u0162\u01b9\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000"+
		"\u0000\u0000\u0164\u0166\u0003\u010e\u0087\u0000\u0165\u0164\u0001\u0000"+
		"\u0000\u0000\u0166\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000"+
		"\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u01b9\u0001\u0000"+
		"\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u016a\u016c\u0003\u00f4"+
		"z\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016c\u016f\u0001\u0000\u0000"+
		"\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000"+
		"\u0000\u016e\u01b9\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000"+
		"\u0000\u0170\u0172\u0003\u00d8l\u0000\u0171\u0170\u0001\u0000\u0000\u0000"+
		"\u0172\u0175\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000"+
		"\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u01b9\u0001\u0000\u0000\u0000"+
		"\u0175\u0173\u0001\u0000\u0000\u0000\u0176\u0178\u0003\u00ccf\u0000\u0177"+
		"\u0176\u0001\u0000\u0000\u0000\u0178\u017b\u0001\u0000\u0000\u0000\u0179"+
		"\u0177\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a"+
		"\u01b9\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017c"+
		"\u017e\u0003\u00bc^\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017e\u0181"+
		"\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u0180"+
		"\u0001\u0000\u0000\u0000\u0180\u01b9\u0001\u0000\u0000\u0000\u0181\u017f"+
		"\u0001\u0000\u0000\u0000\u0182\u0184\u0003\u00b0X\u0000\u0183\u0182\u0001"+
		"\u0000\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185\u0183\u0001"+
		"\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u01b9\u0001"+
		"\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u018a\u0003"+
		"\u00aaU\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u018a\u018d\u0001\u0000"+
		"\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000"+
		"\u0000\u0000\u018c\u01b9\u0001\u0000\u0000\u0000\u018d\u018b\u0001\u0000"+
		"\u0000\u0000\u018e\u0190\u0003\u00a8T\u0000\u018f\u018e\u0001\u0000\u0000"+
		"\u0000\u0190\u0193\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000"+
		"\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u01b9\u0001\u0000\u0000"+
		"\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0194\u0196\u0003\u00a4R\u0000"+
		"\u0195\u0194\u0001\u0000\u0000\u0000\u0196\u0199\u0001\u0000\u0000\u0000"+
		"\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000"+
		"\u0198\u01b9\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000"+
		"\u019a\u019c\u0003\u009eO\u0000\u019b\u019a\u0001\u0000\u0000\u0000\u019c"+
		"\u019f\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019d"+
		"\u019e\u0001\u0000\u0000\u0000\u019e\u01b9\u0001\u0000\u0000\u0000\u019f"+
		"\u019d\u0001\u0000\u0000\u0000\u01a0\u01a2\u0003\u0092I\u0000\u01a1\u01a0"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a5\u0001\u0000\u0000\u0000\u01a3\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01b9"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a6\u01a8"+
		"\u0003\u0090H\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a8\u01ab\u0001"+
		"\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001"+
		"\u0000\u0000\u0000\u01aa\u01b9\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001"+
		"\u0000\u0000\u0000\u01ac\u01ae\u0003\u008cF\u0000\u01ad\u01ac\u0001\u0000"+
		"\u0000\u0000\u01ae\u01b1\u0001\u0000\u0000\u0000\u01af\u01ad\u0001\u0000"+
		"\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b9\u0001\u0000"+
		"\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b2\u01b4\u0003\u008a"+
		"E\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b9\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000"+
		"\u0000\u01b8\u0149\u0001\u0000\u0000\u0000\u01b8\u014f\u0001\u0000\u0000"+
		"\u0000\u01b8\u0155\u0001\u0000\u0000\u0000\u01b8\u015b\u0001\u0000\u0000"+
		"\u0000\u01b8\u0161\u0001\u0000\u0000\u0000\u01b8\u0167\u0001\u0000\u0000"+
		"\u0000\u01b8\u016d\u0001\u0000\u0000\u0000\u01b8\u0173\u0001\u0000\u0000"+
		"\u0000\u01b8\u0179\u0001\u0000\u0000\u0000\u01b8\u017f\u0001\u0000\u0000"+
		"\u0000\u01b8\u0185\u0001\u0000\u0000\u0000\u01b8\u018b\u0001\u0000\u0000"+
		"\u0000\u01b8\u0191\u0001\u0000\u0000\u0000\u01b8\u0197\u0001\u0000\u0000"+
		"\u0000\u01b8\u019d\u0001\u0000\u0000\u0000\u01b8\u01a3\u0001\u0000\u0000"+
		"\u0000\u01b8\u01a9\u0001\u0000\u0000\u0000\u01b8\u01af\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b5\u0001\u0000\u0000\u0000\u01b9\u0001\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bf\u0005\u000e\u0000\u0000\u01bb\u01be\u0003\u0004\u0002"+
		"\u0000\u01bc\u01be\u00038\u001c\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000"+
		"\u01bd\u01bc\u0001\u0000\u0000\u0000\u01be\u01c1\u0001\u0000\u0000\u0000"+
		"\u01bf\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c0\u01c2\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c3\u0005\u000f\u0000\u0000\u01c3\u0003\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c7\u0003D\"\u0000\u01c5\u01c7\u0003\u0002\u0001\u0000\u01c6"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000\u01c7"+
		"\u0005\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005\u001d\u0000\u0000\u01c9"+
		"\u01cd\u0005\u000e\u0000\u0000\u01ca\u01cc\u0003d2\u0000\u01cb\u01ca\u0001"+
		"\u0000\u0000\u0000\u01cc\u01cf\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001"+
		"\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01d0\u0001"+
		"\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01d0\u01d1\u0005"+
		"\u000f\u0000\u0000\u01d1\u0007\u0001\u0000\u0000\u0000\u01d2\u01d3\u0005"+
		"\u001c\u0000\u0000\u01d3\u01d7\u0005\u000e\u0000\u0000\u01d4\u01d6\u0003"+
		"d2\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d9\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000"+
		"\u0000\u01d8\u01da\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000"+
		"\u0000\u01da\u01db\u0005\u000f\u0000\u0000\u01db\t\u0001\u0000\u0000\u0000"+
		"\u01dc\u01dd\u0005\u001e\u0000\u0000\u01dd\u01e1\u0005\u000e\u0000\u0000"+
		"\u01de\u01e0\u0003D\"\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e1"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e4\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005\u000f\u0000\u0000\u01e5"+
		"\u000b\u0001\u0000\u0000\u0000\u01e6\u01e7\u0005G\u0000\u0000\u01e7\u01eb"+
		"\u0005\u000e\u0000\u0000\u01e8\u01ea\u0003D\"\u0000\u01e9\u01e8\u0001"+
		"\u0000\u0000\u0000\u01ea\u01ed\u0001\u0000\u0000\u0000\u01eb\u01e9\u0001"+
		"\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ee\u0001"+
		"\u0000\u0000\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ee\u01ef\u0005"+
		"\u000f\u0000\u0000\u01ef\r\u0001\u0000\u0000\u0000\u01f0\u01f1\u0005X"+
		"\u0000\u0000\u01f1\u01f5\u0005\u000e\u0000\u0000\u01f2\u01f4\u0003@ \u0000"+
		"\u01f3\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f7\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000"+
		"\u01f6\u01f8\u0001\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000"+
		"\u01f8\u01f9\u0005\u000f\u0000\u0000\u01f9\u000f\u0001\u0000\u0000\u0000"+
		"\u01fa\u01fb\u0005Y\u0000\u0000\u01fb\u01ff\u0005\u000e\u0000\u0000\u01fc"+
		"\u01fe\u0003\"\u0011\u0000\u01fd\u01fc\u0001\u0000\u0000\u0000\u01fe\u0201"+
		"\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u01ff\u0200"+
		"\u0001\u0000\u0000\u0000\u0200\u0205\u0001\u0000\u0000\u0000\u0201\u01ff"+
		"\u0001\u0000\u0000\u0000\u0202\u0204\u0003$\u0012\u0000\u0203\u0202\u0001"+
		"\u0000\u0000\u0000\u0204\u0207\u0001\u0000\u0000\u0000\u0205\u0203\u0001"+
		"\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0208\u0001"+
		"\u0000\u0000\u0000\u0207\u0205\u0001\u0000\u0000\u0000\u0208\u0209\u0005"+
		"\u000f\u0000\u0000\u0209\u0011\u0001\u0000\u0000\u0000\u020a\u020b\u0005"+
		"Z\u0000\u0000\u020b\u020c\u0005\u000e\u0000\u0000\u020c\u0210\u0003\""+
		"\u0011\u0000\u020d\u020f\u0003$\u0012\u0000\u020e\u020d\u0001\u0000\u0000"+
		"\u0000\u020f\u0212\u0001\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000"+
		"\u0000\u0210\u0211\u0001\u0000\u0000\u0000\u0211\u0213\u0001\u0000\u0000"+
		"\u0000\u0212\u0210\u0001\u0000\u0000\u0000\u0213\u0214\u0005\u000f\u0000"+
		"\u0000\u0214\u0013\u0001\u0000\u0000\u0000\u0215\u0216\u0005\u001f\u0000"+
		"\u0000\u0216\u021a\u0005\u000e\u0000\u0000\u0217\u0219\u0003d2\u0000\u0218"+
		"\u0217\u0001\u0000\u0000\u0000\u0219\u021c\u0001\u0000\u0000\u0000\u021a"+
		"\u0218\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b"+
		"\u021d\u0001\u0000\u0000\u0000\u021c\u021a\u0001\u0000\u0000\u0000\u021d"+
		"\u021e\u0005\u000f\u0000\u0000\u021e\u0015\u0001\u0000\u0000\u0000\u021f"+
		"\u0220\u0007\u0000\u0000\u0000\u0220\u0224\u0005\u000e\u0000\u0000\u0221"+
		"\u0222\u0005#\u0000\u0000\u0222\u0225\u0005\t\u0000\u0000\u0223\u0225"+
		"\u0003\u0006\u0003\u0000\u0224\u0221\u0001\u0000\u0000\u0000\u0224\u0223"+
		"\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000\u0226\u0224"+
		"\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0227\u0228"+
		"\u0001\u0000\u0000\u0000\u0228\u0229\u0005\u000f\u0000\u0000\u0229\u0017"+
		"\u0001\u0000\u0000\u0000\u022a\u022b\u0005*\u0000\u0000\u022b\u022d\u0005"+
		"\u000e\u0000\u0000\u022c\u022e\u0005\b\u0000\u0000\u022d\u022c\u0001\u0000"+
		"\u0000\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u022d\u0001\u0000"+
		"\u0000\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u0230\u0232\u0001\u0000"+
		"\u0000\u0000\u0231\u0233\u0005\b\u0000\u0000\u0232\u0231\u0001\u0000\u0000"+
		"\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234\u0232\u0001\u0000\u0000"+
		"\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235\u0237\u0001\u0000\u0000"+
		"\u0000\u0236\u0238\u0005\b\u0000\u0000\u0237\u0236\u0001\u0000\u0000\u0000"+
		"\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u0237\u0001\u0000\u0000\u0000"+
		"\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000"+
		"\u023b\u023c\u0005\u000f\u0000\u0000\u023c\u0019\u0001\u0000\u0000\u0000"+
		"\u023d\u023e\u0005\u0090\u0000\u0000\u023e\u0246\u0005\u000e\u0000\u0000"+
		"\u023f\u0241\u0005\b\u0000\u0000\u0240\u023f\u0001\u0000\u0000\u0000\u0241"+
		"\u0242\u0001\u0000\u0000\u0000\u0242\u0240\u0001\u0000\u0000\u0000\u0242"+
		"\u0243\u0001\u0000\u0000\u0000\u0243\u0245\u0001\u0000\u0000\u0000\u0244"+
		"\u0240\u0001\u0000\u0000\u0000\u0245\u0248\u0001\u0000\u0000\u0000\u0246"+
		"\u0244\u0001\u0000\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000\u0247"+
		"\u0249\u0001\u0000\u0000\u0000\u0248\u0246\u0001\u0000\u0000\u0000\u0249"+
		"\u024a\u0005\u000f\u0000\u0000\u024a\u001b\u0001\u0000\u0000\u0000\u024b"+
		"\u024c\u0005t\u0000\u0000\u024c\u024d\u0005\t\u0000\u0000\u024d\u001d"+
		"\u0001\u0000\u0000\u0000\u024e\u024f\u0005u\u0000\u0000\u024f\u0250\u0005"+
		"\u000e\u0000\u0000\u0250\u0251\u0005w\u0000\u0000\u0251\u0252\u0005\b"+
		"\u0000\u0000\u0252\u0253\u0005x\u0000\u0000\u0253\u0254\u0005\b\u0000"+
		"\u0000\u0254\u0255\u0005\u000f\u0000\u0000\u0255\u001f\u0001\u0000\u0000"+
		"\u0000\u0256\u0257\u0005\u001f\u0000\u0000\u0257\u025b\u0005\u000e\u0000"+
		"\u0000\u0258\u025a\u0003d2\u0000\u0259\u0258\u0001\u0000\u0000\u0000\u025a"+
		"\u025d\u0001\u0000\u0000\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025b"+
		"\u025c\u0001\u0000\u0000\u0000\u025c\u025e\u0001\u0000\u0000\u0000\u025d"+
		"\u025b\u0001\u0000\u0000\u0000\u025e\u025f\u0005\u000f\u0000\u0000\u025f"+
		"!\u0001\u0000\u0000\u0000\u0260\u0261\u0005[\u0000\u0000\u0261\u0262\u0007"+
		"\u0001\u0000\u0000\u0262#\u0001\u0000\u0000\u0000\u0263\u0264\u0005X\u0000"+
		"\u0000\u0264\u0269\u0005\u000e\u0000\u0000\u0265\u0268\u0003\"\u0011\u0000"+
		"\u0266\u0268\u0003d2\u0000\u0267\u0265\u0001\u0000\u0000\u0000\u0267\u0266"+
		"\u0001\u0000\u0000\u0000\u0268\u026b\u0001\u0000\u0000\u0000\u0269\u0267"+
		"\u0001\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000\u0000\u026a\u026c"+
		"\u0001\u0000\u0000\u0000\u026b\u0269\u0001\u0000\u0000\u0000\u026c\u026d"+
		"\u0005\u000f\u0000\u0000\u026d%\u0001\u0000\u0000\u0000\u026e\u026f\u0007"+
		"\u0002\u0000\u0000\u026f\'\u0001\u0000\u0000\u0000\u0270\u0271\u0005!"+
		"\u0000\u0000\u0271\u0272\u0005\b\u0000\u0000\u0272)\u0001\u0000\u0000"+
		"\u0000\u0273\u0274\u0005#\u0000\u0000\u0274\u0275\u0005\t\u0000\u0000"+
		"\u0275+\u0001\u0000\u0000\u0000\u0276\u0277\u0005\"\u0000\u0000\u0277"+
		"\u0278\u0005\u000b\u0000\u0000\u0278-\u0001\u0000\u0000\u0000\u0279\u027a"+
		"\u0007\u0003\u0000\u0000\u027a/\u0001\u0000\u0000\u0000\u027b\u027c\u0005"+
		"\f\u0000\u0000\u027c\u027d\u0005\b\u0000\u0000\u027d1\u0001\u0000\u0000"+
		"\u0000\u027e\u027f\u0005\u0019\u0000\u0000\u027f\u0283\u0005\u000e\u0000"+
		"\u0000\u0280\u0282\u0003d2\u0000\u0281\u0280\u0001\u0000\u0000\u0000\u0282"+
		"\u0285\u0001\u0000\u0000\u0000\u0283\u0281\u0001\u0000\u0000\u0000\u0283"+
		"\u0284\u0001\u0000\u0000\u0000\u0284\u0286\u0001\u0000\u0000\u0000\u0285"+
		"\u0283\u0001\u0000\u0000\u0000\u0286\u0287\u0005\u000f\u0000\u0000\u0287"+
		"3\u0001\u0000\u0000\u0000\u0288\u0289\u0005\u0017\u0000\u0000\u0289\u028d"+
		"\u0005\u000e\u0000\u0000\u028a\u028c\u0003D\"\u0000\u028b\u028a\u0001"+
		"\u0000\u0000\u0000\u028c\u028f\u0001\u0000\u0000\u0000\u028d\u028b\u0001"+
		"\u0000\u0000\u0000\u028d\u028e\u0001\u0000\u0000\u0000\u028e\u0290\u0001"+
		"\u0000\u0000\u0000\u028f\u028d\u0001\u0000\u0000\u0000\u0290\u0291\u0005"+
		"\u000f\u0000\u0000\u02915\u0001\u0000\u0000\u0000\u0292\u0293\u0005\u0018"+
		"\u0000\u0000\u0293\u0294\u0005\u000e\u0000\u0000\u0294\u0298\u00032\u0019"+
		"\u0000\u0295\u0297\u0003D\"\u0000\u0296\u0295\u0001\u0000\u0000\u0000"+
		"\u0297\u029a\u0001\u0000\u0000\u0000\u0298\u0296\u0001\u0000\u0000\u0000"+
		"\u0298\u0299\u0001\u0000\u0000\u0000\u0299\u029b\u0001\u0000\u0000\u0000"+
		"\u029a\u0298\u0001\u0000\u0000\u0000\u029b\u029c\u0005\u000f\u0000\u0000"+
		"\u029c7\u0001\u0000\u0000\u0000\u029d\u029e\u0005\u0016\u0000\u0000\u029e"+
		"\u029f\u0005\u000e\u0000\u0000\u029f\u02a3\u00032\u0019\u0000\u02a0\u02a2"+
		"\u0003D\"\u0000\u02a1\u02a0\u0001\u0000\u0000\u0000\u02a2\u02a5\u0001"+
		"\u0000\u0000\u0000\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a3\u02a4\u0001"+
		"\u0000\u0000\u0000\u02a4\u02a6\u0001\u0000\u0000\u0000\u02a5\u02a3\u0001"+
		"\u0000\u0000\u0000\u02a6\u02ab\u0005\u000f\u0000\u0000\u02a7\u02aa\u0003"+
		"4\u001a\u0000\u02a8\u02aa\u00036\u001b\u0000\u02a9\u02a7\u0001\u0000\u0000"+
		"\u0000\u02a9\u02a8\u0001\u0000\u0000\u0000\u02aa\u02ad\u0001\u0000\u0000"+
		"\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000"+
		"\u0000\u02ac9\u0001\u0000\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000"+
		"\u02ae\u02af\u0005\u001a\u0000\u0000\u02af\u02b0\u0005\u000e\u0000\u0000"+
		"\u02b0\u02b4\u00032\u0019\u0000\u02b1\u02b3\u0003D\"\u0000\u02b2\u02b1"+
		"\u0001\u0000\u0000\u0000\u02b3\u02b6\u0001\u0000\u0000\u0000\u02b4\u02b2"+
		"\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b7"+
		"\u0001\u0000\u0000\u0000\u02b6\u02b4\u0001\u0000\u0000\u0000\u02b7\u02b8"+
		"\u0005\u000f\u0000\u0000\u02b8;\u0001\u0000\u0000\u0000\u02b9\u02ba\u0007"+
		"\u0004\u0000\u0000\u02ba\u02c1\u0005\u000e\u0000\u0000\u02bb\u02c0\u0003"+
		"D\"\u0000\u02bc\u02c0\u0003d2\u0000\u02bd\u02c0\u0003<\u001e\u0000\u02be"+
		"\u02c0\u00032\u0019\u0000\u02bf\u02bb\u0001\u0000\u0000\u0000\u02bf\u02bc"+
		"\u0001\u0000\u0000\u0000\u02bf\u02bd\u0001\u0000\u0000\u0000\u02bf\u02be"+
		"\u0001\u0000\u0000\u0000\u02c0\u02c3\u0001\u0000\u0000\u0000\u02c1\u02bf"+
		"\u0001\u0000\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2\u02c4"+
		"\u0001\u0000\u0000\u0000\u02c3\u02c1\u0001\u0000\u0000\u0000\u02c4\u02c5"+
		"\u0005\u000f\u0000\u0000\u02c5=\u0001\u0000\u0000\u0000\u02c6\u02d0\u0005"+
		"\u00c1\u0000\u0000\u02c7\u02cb\u0005\u000e\u0000\u0000\u02c8\u02ca\u0003"+
		"D\"\u0000\u02c9\u02c8\u0001\u0000\u0000\u0000\u02ca\u02cd\u0001\u0000"+
		"\u0000\u0000\u02cb\u02c9\u0001\u0000\u0000\u0000\u02cb\u02cc\u0001\u0000"+
		"\u0000\u0000\u02cc\u02ce\u0001\u0000\u0000\u0000\u02cd\u02cb\u0001\u0000"+
		"\u0000\u0000\u02ce\u02d1\u0005\u000f\u0000\u0000\u02cf\u02d1\u0005\u0003"+
		"\u0000\u0000\u02d0\u02c7\u0001\u0000\u0000\u0000\u02d0\u02cf\u0001\u0000"+
		"\u0000\u0000\u02d1?\u0001\u0000\u0000\u0000\u02d2\u02d3\u0005\u00c1\u0000"+
		"\u0000\u02d3\u02d4\u0007\u0002\u0000\u0000\u02d4A\u0001\u0000\u0000\u0000"+
		"\u02d5\u02d6\u0005\u001b\u0000\u0000\u02d6\u02d7\u0005\u000e\u0000\u0000"+
		"\u02d7\u02d8\u0003\u0006\u0003\u0000\u02d8\u02d9\u0003\u000e\u0007\u0000"+
		"\u02d9\u02da\u0005\u000f\u0000\u0000\u02daC\u0001\u0000\u0000\u0000\u02db"+
		"\u02dc\u0005\u00c1\u0000\u0000\u02dc\u02f0\u0007\u0002\u0000\u0000\u02dd"+
		"\u02f0\u0003>\u001f\u0000\u02de\u02f0\u00038\u001c\u0000\u02df\u02f0\u0003"+
		"<\u001e\u0000\u02e0\u02f0\u0003\u00c0`\u0000\u02e1\u02f0\u0003P(\u0000"+
		"\u02e2\u02f0\u0003:\u001d\u0000\u02e3\u02f0\u0003R)\u0000\u02e4\u02f0"+
		"\u0003T*\u0000\u02e5\u02f0\u0003V+\u0000\u02e6\u02f0\u0003X,\u0000\u02e7"+
		"\u02f0\u0003Z-\u0000\u02e8\u02f0\u0003\\.\u0000\u02e9\u02f0\u0003N\'\u0000"+
		"\u02ea\u02f0\u0003F#\u0000\u02eb\u02f0\u0003H$\u0000\u02ec\u02f0\u0003"+
		"J%\u0000\u02ed\u02f0\u0003L&\u0000\u02ee\u02f0\u0003^/\u0000\u02ef\u02db"+
		"\u0001\u0000\u0000\u0000\u02ef\u02dd\u0001\u0000\u0000\u0000\u02ef\u02de"+
		"\u0001\u0000\u0000\u0000\u02ef\u02df\u0001\u0000\u0000\u0000\u02ef\u02e0"+
		"\u0001\u0000\u0000\u0000\u02ef\u02e1\u0001\u0000\u0000\u0000\u02ef\u02e2"+
		"\u0001\u0000\u0000\u0000\u02ef\u02e3\u0001\u0000\u0000\u0000\u02ef\u02e4"+
		"\u0001\u0000\u0000\u0000\u02ef\u02e5\u0001\u0000\u0000\u0000\u02ef\u02e6"+
		"\u0001\u0000\u0000\u0000\u02ef\u02e7\u0001\u0000\u0000\u0000\u02ef\u02e8"+
		"\u0001\u0000\u0000\u0000\u02ef\u02e9\u0001\u0000\u0000\u0000\u02ef\u02ea"+
		"\u0001\u0000\u0000\u0000\u02ef\u02eb\u0001\u0000\u0000\u0000\u02ef\u02ec"+
		"\u0001\u0000\u0000\u0000\u02ef\u02ed\u0001\u0000\u0000\u0000\u02ef\u02ee"+
		"\u0001\u0000\u0000\u0000\u02f0E\u0001\u0000\u0000\u0000\u02f1\u02f2\u0005"+
		"D\u0000\u0000\u02f2\u02f3\u0005\u000e\u0000\u0000\u02f3\u02f4\u00052\u0000"+
		"\u0000\u02f4\u02f5\u0007\u0004\u0000\u0000\u02f5\u02f6\u0005X\u0000\u0000"+
		"\u02f6\u02f7\u0005\u00c1\u0000\u0000\u02f7\u02f8\u0005\u000f\u0000\u0000"+
		"\u02f8G\u0001\u0000\u0000\u0000\u02f9\u02fa\u0005C\u0000\u0000\u02fa\u02fb"+
		"\u0005\u000e\u0000\u0000\u02fb\u02fc\u00052\u0000\u0000\u02fc\u02fd\u0007"+
		"\u0004\u0000\u0000\u02fd\u02fe\u0005X\u0000\u0000\u02fe\u02ff\u0005\u00c1"+
		"\u0000\u0000\u02ff\u0300\u0005\u000f\u0000\u0000\u0300I\u0001\u0000\u0000"+
		"\u0000\u0301\u0302\u0005E\u0000\u0000\u0302\u0303\u0005\u000e\u0000\u0000"+
		"\u0303\u0304\u00052\u0000\u0000\u0304\u0305\u0007\u0004\u0000\u0000\u0305"+
		"\u0306\u0005X\u0000\u0000\u0306\u0307\u0005\u00c1\u0000\u0000\u0307\u0308"+
		"\u0005\u000f\u0000\u0000\u0308K\u0001\u0000\u0000\u0000\u0309\u030a\u0005"+
		"F\u0000\u0000\u030a\u030b\u0005\u000e\u0000\u0000\u030b\u030c\u00052\u0000"+
		"\u0000\u030c\u030d\u0007\u0004\u0000\u0000\u030d\u030e\u0005X\u0000\u0000"+
		"\u030e\u030f\u0005\u00c1\u0000\u0000\u030f\u0310\u0005\u000f\u0000\u0000"+
		"\u0310M\u0001\u0000\u0000\u0000\u0311\u0312\u0005A\u0000\u0000\u0312\u0316"+
		"\u0005\u000e\u0000\u0000\u0313\u0315\u0003D\"\u0000\u0314\u0313\u0001"+
		"\u0000\u0000\u0000\u0315\u0318\u0001\u0000\u0000\u0000\u0316\u0314\u0001"+
		"\u0000\u0000\u0000\u0316\u0317\u0001\u0000\u0000\u0000\u0317\u0319\u0001"+
		"\u0000\u0000\u0000\u0318\u0316\u0001\u0000\u0000\u0000\u0319\u031a\u0005"+
		"\u000f\u0000\u0000\u031aO\u0001\u0000\u0000\u0000\u031b\u031c\u0007\u0005"+
		"\u0000\u0000\u031c\u031d\u0005\u000e\u0000\u0000\u031d\u031e\u0005#\u0000"+
		"\u0000\u031e\u031f\u0007\u0006\u0000\u0000\u031f\u0320\u0005V\u0000\u0000"+
		"\u0320\u0321\u0005\b\u0000\u0000\u0321\u0322\u0005\u000f\u0000\u0000\u0322"+
		"Q\u0001\u0000\u0000\u0000\u0323\u0324\u00050\u0000\u0000\u0324\u0325\u0005"+
		"\u000e\u0000\u0000\u0325\u0326\u0005\u00c1\u0000\u0000\u0326\u032b\u0005"+
		"\u00c1\u0000\u0000\u0327\u0328\u0005\u00c1\u0000\u0000\u0328\u032c\u0005"+
		"\u00c1\u0000\u0000\u0329\u032a\u0005\u00c1\u0000\u0000\u032a\u032c\u0007"+
		"\u0001\u0000\u0000\u032b\u0327\u0001\u0000\u0000\u0000\u032b\u0329\u0001"+
		"\u0000\u0000\u0000\u032c\u032d\u0001\u0000\u0000\u0000\u032d\u032e\u0005"+
		"\u000f\u0000\u0000\u032eS\u0001\u0000\u0000\u0000\u032f\u0330\u0005,\u0000"+
		"\u0000\u0330\u0331\u0005\u000e\u0000\u0000\u0331\u0332\u0005\u00c1\u0000"+
		"\u0000\u0332\u0337\u0005\u00c1\u0000\u0000\u0333\u0334\u0005\u00c1\u0000"+
		"\u0000\u0334\u0338\u0005\u00c1\u0000\u0000\u0335\u0336\u0005\u00c1\u0000"+
		"\u0000\u0336\u0338\u0007\u0001\u0000\u0000\u0337\u0333\u0001\u0000\u0000"+
		"\u0000\u0337\u0335\u0001\u0000\u0000\u0000\u0338\u0339\u0001\u0000\u0000"+
		"\u0000\u0339\u033a\u0005\u000f\u0000\u0000\u033aU\u0001\u0000\u0000\u0000"+
		"\u033b\u033c\u0005-\u0000\u0000\u033c\u033d\u0005\u000e\u0000\u0000\u033d"+
		"\u033e\u0005\u00c1\u0000\u0000\u033e\u0343\u0005\u00c1\u0000\u0000\u033f"+
		"\u0340\u0005\u00c1\u0000\u0000\u0340\u0344\u0005\u00c1\u0000\u0000\u0341"+
		"\u0342\u0005\u00c1\u0000\u0000\u0342\u0344\u0007\u0001\u0000\u0000\u0343"+
		"\u033f\u0001\u0000\u0000\u0000\u0343\u0341\u0001\u0000\u0000\u0000\u0344"+
		"\u0345\u0001\u0000\u0000\u0000\u0345\u0346\u0005\u000f\u0000\u0000\u0346"+
		"W\u0001\u0000\u0000\u0000\u0347\u0348\u0005.\u0000\u0000\u0348\u0349\u0005"+
		"\u000e\u0000\u0000\u0349\u034a\u0005\u00c1\u0000\u0000\u034a\u034f\u0005"+
		"\u00c1\u0000\u0000\u034b\u034c\u0005\u00c1\u0000\u0000\u034c\u0350\u0005"+
		"\u00c1\u0000\u0000\u034d\u034e\u0005\u00c1\u0000\u0000\u034e\u0350\u0007"+
		"\u0001\u0000\u0000\u034f\u034b\u0001\u0000\u0000\u0000\u034f\u034d\u0001"+
		"\u0000\u0000\u0000\u0350\u0351\u0001\u0000\u0000\u0000\u0351\u0352\u0005"+
		"\u000f\u0000\u0000\u0352Y\u0001\u0000\u0000\u0000\u0353\u0354\u0005/\u0000"+
		"\u0000\u0354\u0355\u0005\u000e\u0000\u0000\u0355\u0356\u0005\u00c1\u0000"+
		"\u0000\u0356\u035b\u0005\u00c1\u0000\u0000\u0357\u0358\u0005\u00c1\u0000"+
		"\u0000\u0358\u035c\u0005\u00c1\u0000\u0000\u0359\u035a\u0005\u00c1\u0000"+
		"\u0000\u035a\u035c\u0007\u0001\u0000\u0000\u035b\u0357\u0001\u0000\u0000"+
		"\u0000\u035b\u0359\u0001\u0000\u0000\u0000\u035c\u035d\u0001\u0000\u0000"+
		"\u0000\u035d\u035e\u0005\u000f\u0000\u0000\u035e[\u0001\u0000\u0000\u0000"+
		"\u035f\u0360\u00051\u0000\u0000\u0360\u0361\u0005\u000e\u0000\u0000\u0361"+
		"\u0362\u0005\u00c1\u0000\u0000\u0362\u0363\u0005\u00c1\u0000\u0000\u0363"+
		"\u0364\u0005\u00c1\u0000\u0000\u0364\u0367\u0005\u00c1\u0000\u0000\u0365"+
		"\u0366\u00052\u0000\u0000\u0366\u0368\u0007\u0004\u0000\u0000\u0367\u0365"+
		"\u0001\u0000\u0000\u0000\u0367\u0368\u0001\u0000\u0000\u0000\u0368\u0369"+
		"\u0001\u0000\u0000\u0000\u0369\u036a\u0005\u000f\u0000\u0000\u036a]\u0001"+
		"\u0000\u0000\u0000\u036b\u036c\u0005Q\u0000\u0000\u036c\u036d\u0005\u000e"+
		"\u0000\u0000\u036d\u036e\u0005R\u0000\u0000\u036e\u036f\u0005\u00c1\u0000"+
		"\u0000\u036f\u0370\u0005\u0013\u0000\u0000\u0370\u0373\u0007\u0007\u0000"+
		"\u0000\u0371\u0372\u0005\r\u0000\u0000\u0372\u0374\u0005\b\u0000\u0000"+
		"\u0373\u0371\u0001\u0000\u0000\u0000\u0373\u0374\u0001\u0000\u0000\u0000"+
		"\u0374\u0375\u0001\u0000\u0000\u0000\u0375\u0376\u0005\u000f\u0000\u0000"+
		"\u0376_\u0001\u0000\u0000\u0000\u0377\u0378\u0005\u0006\u0000\u0000\u0378"+
		"\u0379\u0005\b\u0000\u0000\u0379a\u0001\u0000\u0000\u0000\u037a\u037b"+
		"\u0005\u008f\u0000\u0000\u037b\u037c\u0007\b\u0000\u0000\u037cc\u0001"+
		"\u0000\u0000\u0000\u037d\u037e\u0005\u00c1\u0000\u0000\u037e\u0399\u0007"+
		"\u0002\u0000\u0000\u037f\u0380\u0007\t\u0000\u0000\u0380\u0384\u0005\u000e"+
		"\u0000\u0000\u0381\u0383\u0003d2\u0000\u0382\u0381\u0001\u0000\u0000\u0000"+
		"\u0383\u0386\u0001\u0000\u0000\u0000\u0384\u0382\u0001\u0000\u0000\u0000"+
		"\u0384\u0385\u0001\u0000\u0000\u0000\u0385\u0387\u0001\u0000\u0000\u0000"+
		"\u0386\u0384\u0001\u0000\u0000\u0000\u0387\u0399\u0005\u000f\u0000\u0000"+
		"\u0388\u0399\u0003r9\u0000\u0389\u0399\u0003\u00c2a\u0000\u038a\u0399"+
		"\u0003j5\u0000\u038b\u0399\u0003x<\u0000\u038c\u0399\u0003`0\u0000\u038d"+
		"\u0399\u0003n7\u0000\u038e\u0399\u0003p8\u0000\u038f\u0399\u00038\u001c"+
		"\u0000\u0390\u0399\u0003l6\u0000\u0391\u0399\u0003h4\u0000\u0392\u0399"+
		"\u0003b1\u0000\u0393\u0399\u0003f3\u0000\u0394\u0399\u0003~?\u0000\u0395"+
		"\u0399\u0003\u0080@\u0000\u0396\u0399\u0003\u0084B\u0000\u0397\u0399\u0003"+
		"|>\u0000\u0398\u037d\u0001\u0000\u0000\u0000\u0398\u037f\u0001\u0000\u0000"+
		"\u0000\u0398\u0388\u0001\u0000\u0000\u0000\u0398\u0389\u0001\u0000\u0000"+
		"\u0000\u0398\u038a\u0001\u0000\u0000\u0000\u0398\u038b\u0001\u0000\u0000"+
		"\u0000\u0398\u038c\u0001\u0000\u0000\u0000\u0398\u038d\u0001\u0000\u0000"+
		"\u0000\u0398\u038e\u0001\u0000\u0000\u0000\u0398\u038f\u0001\u0000\u0000"+
		"\u0000\u0398\u0390\u0001\u0000\u0000\u0000\u0398\u0391\u0001\u0000\u0000"+
		"\u0000\u0398\u0392\u0001\u0000\u0000\u0000\u0398\u0393\u0001\u0000\u0000"+
		"\u0000\u0398\u0394\u0001\u0000\u0000\u0000\u0398\u0395\u0001\u0000\u0000"+
		"\u0000\u0398\u0396\u0001\u0000\u0000\u0000\u0398\u0397\u0001\u0000\u0000"+
		"\u0000\u0399e\u0001\u0000\u0000\u0000\u039a\u039b\u0005M\u0000\u0000\u039b"+
		"\u039f\u0005\u000e\u0000\u0000\u039c\u039d\u0005\u00c1\u0000\u0000\u039d"+
		"\u03a0\u0005\b\u0000\u0000\u039e\u03a0\u0003d2\u0000\u039f\u039c\u0001"+
		"\u0000\u0000\u0000\u039f\u039e\u0001\u0000\u0000\u0000\u03a0\u03a1\u0001"+
		"\u0000\u0000\u0000\u03a1\u039f\u0001\u0000\u0000\u0000\u03a1\u03a2\u0001"+
		"\u0000\u0000\u0000\u03a2\u03a3\u0001\u0000\u0000\u0000\u03a3\u03a4\u0005"+
		"\u000f\u0000\u0000\u03a4g\u0001\u0000\u0000\u0000\u03a5\u03a6\u0005B\u0000"+
		"\u0000\u03a6\u03af\u0005\u000e\u0000\u0000\u03a7\u03a8\u00052\u0000\u0000"+
		"\u03a8\u03ae\u0007\u0004\u0000\u0000\u03a9\u03aa\u0005\u00c1\u0000\u0000"+
		"\u03aa\u03ae\u0005\b\u0000\u0000\u03ab\u03ac\u0005X\u0000\u0000\u03ac"+
		"\u03ae\u0005\u00c1\u0000\u0000\u03ad\u03a7\u0001\u0000\u0000\u0000\u03ad"+
		"\u03a9\u0001\u0000\u0000\u0000\u03ad\u03ab\u0001\u0000\u0000\u0000\u03ae"+
		"\u03b1\u0001\u0000\u0000\u0000\u03af\u03ad\u0001\u0000\u0000\u0000\u03af"+
		"\u03b0\u0001\u0000\u0000\u0000\u03b0\u03b2\u0001\u0000\u0000\u0000\u03b1"+
		"\u03af\u0001\u0000\u0000\u0000\u03b2\u03b3\u0005\u000f\u0000\u0000\u03b3"+
		"i\u0001\u0000\u0000\u0000\u03b4\u03b5\u0005 \u0000\u0000\u03b5\u03ba\u0005"+
		"\u000e\u0000\u0000\u03b6\u03b9\u0003(\u0014\u0000\u03b7\u03b9\u0003d2"+
		"\u0000\u03b8\u03b6\u0001\u0000\u0000\u0000\u03b8\u03b7\u0001\u0000\u0000"+
		"\u0000\u03b9\u03bc\u0001\u0000\u0000\u0000\u03ba\u03b8\u0001\u0000\u0000"+
		"\u0000\u03ba\u03bb\u0001\u0000\u0000\u0000\u03bb\u03bd\u0001\u0000\u0000"+
		"\u0000\u03bc\u03ba\u0001\u0000\u0000\u0000\u03bd\u03be\u0005\u000f\u0000"+
		"\u0000\u03bek\u0001\u0000\u0000\u0000\u03bf\u03c0\u0005+\u0000\u0000\u03c0"+
		"\u03c1\u0005\u000e\u0000\u0000\u03c1\u03c2\u0005\u00c1\u0000\u0000\u03c2"+
		"\u03c7\u0005\u00c1\u0000\u0000\u03c3\u03c4\u0005\u00c1\u0000\u0000\u03c4"+
		"\u03c8\u0005\u00c1\u0000\u0000\u03c5\u03c6\u0005\u00c1\u0000\u0000\u03c6"+
		"\u03c8\u0007\u0001\u0000\u0000\u03c7\u03c3\u0001\u0000\u0000\u0000\u03c7"+
		"\u03c5\u0001\u0000\u0000\u0000\u03c8\u03c9\u0001\u0000\u0000\u0000\u03c9"+
		"\u03ca\u0005\u000f\u0000\u0000\u03cam\u0001\u0000\u0000\u0000\u03cb\u03cc"+
		"\u0005>\u0000\u0000\u03cc\u03cd\u0005\u000e\u0000\u0000\u03cd\u03ce\u0005"+
		"\u00b0\u0000\u0000\u03ce\u03cf\u0007\u0004\u0000\u0000\u03cf\u03d0\u0005"+
		"@\u0000\u0000\u03d0\u03d1\u0005\b\u0000\u0000\u03d1\u03d2\u0005\u000f"+
		"\u0000\u0000\u03d2o\u0001\u0000\u0000\u0000\u03d3\u03d4\u0005?\u0000\u0000"+
		"\u03d4\u03d5\u0005\u000e\u0000\u0000\u03d5\u03d6\u0005\u00b0\u0000\u0000"+
		"\u03d6\u03d7\u0007\u0004\u0000\u0000\u03d7\u03d8\u0005@\u0000\u0000\u03d8"+
		"\u03d9\u0005\b\u0000\u0000\u03d9\u03da\u0005\u000f\u0000\u0000\u03daq"+
		"\u0001\u0000\u0000\u0000\u03db\u03dc\u0005\u00c1\u0000\u0000\u03dc\u03e0"+
		"\u0005\u000e\u0000\u0000\u03dd\u03df\u0003d2\u0000\u03de\u03dd\u0001\u0000"+
		"\u0000\u0000\u03df\u03e2\u0001\u0000\u0000\u0000\u03e0\u03de\u0001\u0000"+
		"\u0000\u0000\u03e0\u03e1\u0001\u0000\u0000\u0000\u03e1\u03e3\u0001\u0000"+
		"\u0000\u0000\u03e2\u03e0\u0001\u0000\u0000\u0000\u03e3\u03e4\u0005\u000f"+
		"\u0000\u0000\u03e4s\u0001\u0000\u0000\u0000\u03e5\u03e6\u0005\'\u0000"+
		"\u0000\u03e6\u03ea\u0005\u000e\u0000\u0000\u03e7\u03e9\u0003d2\u0000\u03e8"+
		"\u03e7\u0001\u0000\u0000\u0000\u03e9\u03ec\u0001\u0000\u0000\u0000\u03ea"+
		"\u03e8\u0001\u0000\u0000\u0000\u03ea\u03eb\u0001\u0000\u0000\u0000\u03eb"+
		"\u03ed\u0001\u0000\u0000\u0000\u03ec\u03ea\u0001\u0000\u0000\u0000\u03ed"+
		"\u03ee\u0005\u000f\u0000\u0000\u03eeu\u0001\u0000\u0000\u0000\u03ef\u03f0"+
		"\u0005(\u0000\u0000\u03f0\u03f4\u0005\u000e\u0000\u0000\u03f1\u03f3\u0003"+
		"d2\u0000\u03f2\u03f1\u0001\u0000\u0000\u0000\u03f3\u03f6\u0001\u0000\u0000"+
		"\u0000\u03f4\u03f2\u0001\u0000\u0000\u0000\u03f4\u03f5\u0001\u0000\u0000"+
		"\u0000\u03f5\u03f7\u0001\u0000\u0000\u0000\u03f6\u03f4\u0001\u0000\u0000"+
		"\u0000\u03f7\u03f8\u0005\u000f\u0000\u0000\u03f8w\u0001\u0000\u0000\u0000"+
		"\u03f9\u03fa\u0005W\u0000\u0000\u03fa\u03fb\u0007\u0003\u0000\u0000\u03fb"+
		"y\u0001\u0000\u0000\u0000\u03fc\u03fd\u0005&\u0000\u0000\u03fd\u03fe\u0007"+
		"\u0003\u0000\u0000\u03fe{\u0001\u0000\u0000\u0000\u03ff\u0400\u0005\u0091"+
		"\u0000\u0000\u0400\u0401\u0005\u00c1\u0000\u0000\u0401}\u0001\u0000\u0000"+
		"\u0000\u0402\u0403\u0005N\u0000\u0000\u0403\u0404\u0005\u000e\u0000\u0000"+
		"\u0404\u0405\u0005\u00c1\u0000\u0000\u0405\u0406\u0005\u00c1\u0000\u0000"+
		"\u0406\u0407\u0005\u00c1\u0000\u0000\u0407\u0408\u0005\b\u0000\u0000\u0408"+
		"\u0409\u0005\u000f\u0000\u0000\u0409\u007f\u0001\u0000\u0000\u0000\u040a"+
		"\u040b\u0005O\u0000\u0000\u040b\u040f\u0005\u000e\u0000\u0000\u040c\u040e"+
		"\u0003\u0082A\u0000\u040d\u040c\u0001\u0000\u0000\u0000\u040e\u0411\u0001"+
		"\u0000\u0000\u0000\u040f\u040d\u0001\u0000\u0000\u0000\u040f\u0410\u0001"+
		"\u0000\u0000\u0000\u0410\u0412\u0001\u0000\u0000\u0000\u0411\u040f\u0001"+
		"\u0000\u0000\u0000\u0412\u0413\u0005\u000f\u0000\u0000\u0413\u0081\u0001"+
		"\u0000\u0000\u0000\u0414\u0415\u0005_\u0000\u0000\u0415\u0429\u0007\b"+
		"\u0000\u0000\u0416\u0417\u0005`\u0000\u0000\u0417\u0429\u0007\b\u0000"+
		"\u0000\u0418\u0419\u0005a\u0000\u0000\u0419\u0429\u0005\u00c1\u0000\u0000"+
		"\u041a\u041b\u0005b\u0000\u0000\u041b\u0429\u0005\u0007\u0000\u0000\u041c"+
		"\u041d\u0005c\u0000\u0000\u041d\u0429\u0005\u0007\u0000\u0000\u041e\u041f"+
		"\u0005d\u0000\u0000\u041f\u0429\u0005\u0007\u0000\u0000\u0420\u0421\u0005"+
		"e\u0000\u0000\u0421\u0429\u0005\b\u0000\u0000\u0422\u0423\u0005f\u0000"+
		"\u0000\u0423\u0429\u0005\u000b\u0000\u0000\u0424\u0425\u0005V\u0000\u0000"+
		"\u0425\u0429\u0005\b\u0000\u0000\u0426\u0427\u0005g\u0000\u0000\u0427"+
		"\u0429\u0005\b\u0000\u0000\u0428\u0414\u0001\u0000\u0000\u0000\u0428\u0416"+
		"\u0001\u0000\u0000\u0000\u0428\u0418\u0001\u0000\u0000\u0000\u0428\u041a"+
		"\u0001\u0000\u0000\u0000\u0428\u041c\u0001\u0000\u0000\u0000\u0428\u041e"+
		"\u0001\u0000\u0000\u0000\u0428\u0420\u0001\u0000\u0000\u0000\u0428\u0422"+
		"\u0001\u0000\u0000\u0000\u0428\u0424\u0001\u0000\u0000\u0000\u0428\u0426"+
		"\u0001\u0000\u0000\u0000\u0429\u0083\u0001\u0000\u0000\u0000\u042a\u042b"+
		"\u0005P\u0000\u0000\u042b\u0434\u0005\u000e\u0000\u0000\u042c\u042d\u0005"+
		"2\u0000\u0000\u042d\u0433\u0007\u0004\u0000\u0000\u042e\u042f\u0005\u00c1"+
		"\u0000\u0000\u042f\u0433\u0005\b\u0000\u0000\u0430\u0431\u0005X\u0000"+
		"\u0000\u0431\u0433\u0005\u00c1\u0000\u0000\u0432\u042c\u0001\u0000\u0000"+
		"\u0000\u0432\u042e\u0001\u0000\u0000\u0000\u0432\u0430\u0001\u0000\u0000"+
		"\u0000\u0433\u0436\u0001\u0000\u0000\u0000\u0434\u0432\u0001\u0000\u0000"+
		"\u0000\u0434\u0435\u0001\u0000\u0000\u0000\u0435\u0437\u0001\u0000\u0000"+
		"\u0000\u0436\u0434\u0001\u0000\u0000\u0000\u0437\u0438\u0005\u000f\u0000"+
		"\u0000\u0438\u0085\u0001\u0000\u0000\u0000\u0439\u043a\u0005i\u0000\u0000"+
		"\u043a\u043e\u0005\u000e\u0000\u0000\u043b\u043d\u0003D\"\u0000\u043c"+
		"\u043b\u0001\u0000\u0000\u0000\u043d\u0440\u0001\u0000\u0000\u0000\u043e"+
		"\u043c\u0001\u0000\u0000\u0000\u043e\u043f\u0001\u0000\u0000\u0000\u043f"+
		"\u0441\u0001\u0000\u0000\u0000\u0440\u043e\u0001\u0000\u0000\u0000\u0441"+
		"\u0442\u0005\u000f\u0000\u0000\u0442\u0087\u0001\u0000\u0000\u0000\u0443"+
		"\u0444\u0005h\u0000\u0000\u0444\u044b\u0005\u000e\u0000\u0000\u0445\u044a"+
		"\u0003\b\u0004\u0000\u0446\u044a\u0003 \u0010\u0000\u0447\u044a\u0003"+
		"\u00be_\u0000\u0448\u044a\u0003\u0086C\u0000\u0449\u0445\u0001\u0000\u0000"+
		"\u0000\u0449\u0446\u0001\u0000\u0000\u0000\u0449\u0447\u0001\u0000\u0000"+
		"\u0000\u0449\u0448\u0001\u0000\u0000\u0000\u044a\u044d\u0001\u0000\u0000"+
		"\u0000\u044b\u0449\u0001\u0000\u0000\u0000\u044b\u044c\u0001\u0000\u0000"+
		"\u0000\u044c\u044e\u0001\u0000\u0000\u0000\u044d\u044b\u0001\u0000\u0000"+
		"\u0000\u044e\u044f\u0005\u000f\u0000\u0000\u044f\u0089\u0001\u0000\u0000"+
		"\u0000\u0450\u0451\u0005\u00c1\u0000\u0000\u0451\u0457\u0005\u000e\u0000"+
		"\u0000\u0452\u0456\u0003\u0088D\u0000\u0453\u0456\u0003\n\u0005\u0000"+
		"\u0454\u0456\u0003\u0086C\u0000\u0455\u0452\u0001\u0000\u0000\u0000\u0455"+
		"\u0453\u0001\u0000\u0000\u0000\u0455\u0454\u0001\u0000\u0000\u0000\u0456"+
		"\u0459\u0001\u0000\u0000\u0000\u0457\u0455\u0001\u0000\u0000\u0000\u0457"+
		"\u0458\u0001\u0000\u0000\u0000\u0458\u045a\u0001\u0000\u0000\u0000\u0459"+
		"\u0457\u0001\u0000\u0000\u0000\u045a\u045b\u0005\u000f\u0000\u0000\u045b"+
		"\u008b\u0001\u0000\u0000\u0000\u045c\u045d\u0005\u00c1\u0000\u0000\u045d"+
		"\u0460\u0005\u000e\u0000\u0000\u045e\u045f\u0005\u00c1\u0000\u0000\u045f"+
		"\u0461\u0005\b\u0000\u0000\u0460\u045e\u0001\u0000\u0000\u0000\u0461\u0462"+
		"\u0001\u0000\u0000\u0000\u0462\u0460\u0001\u0000\u0000\u0000\u0462\u0463"+
		"\u0001\u0000\u0000\u0000\u0463\u046f\u0001\u0000\u0000\u0000\u0464\u0470"+
		"\u0003\u000e\u0007\u0000\u0465\u0470\u0003\u0012\t\u0000\u0466\u0467\u0005"+
		"H\u0000\u0000\u0467\u046b\u0005\u000e\u0000\u0000\u0468\u046a\u0003@ "+
		"\u0000\u0469\u0468\u0001\u0000\u0000\u0000\u046a\u046d\u0001\u0000\u0000"+
		"\u0000\u046b\u0469\u0001\u0000\u0000\u0000\u046b\u046c\u0001\u0000\u0000"+
		"\u0000\u046c\u046e\u0001\u0000\u0000\u0000\u046d\u046b\u0001\u0000\u0000"+
		"\u0000\u046e\u0470\u0005\u000f\u0000\u0000\u046f\u0464\u0001\u0000\u0000"+
		"\u0000\u046f\u0465\u0001\u0000\u0000\u0000\u046f\u0466\u0001\u0000\u0000"+
		"\u0000\u0470\u0471\u0001\u0000\u0000\u0000\u0471\u046f\u0001\u0000\u0000"+
		"\u0000\u0471\u0472\u0001\u0000\u0000\u0000\u0472\u0473\u0001\u0000\u0000"+
		"\u0000\u0473\u0474\u0005\u000f\u0000\u0000\u0474\u008d\u0001\u0000\u0000"+
		"\u0000\u0475\u047c\u0003\b\u0004\u0000\u0476\u047c\u0003\u0006\u0003\u0000"+
		"\u0477\u047c\u0003\u000e\u0007\u0000\u0478\u047c\u0003\n\u0005\u0000\u0479"+
		"\u047c\u0003\f\u0006\u0000\u047a\u047c\u0003\u0012\t\u0000\u047b\u0475"+
		"\u0001\u0000\u0000\u0000\u047b\u0476\u0001\u0000\u0000\u0000\u047b\u0477"+
		"\u0001\u0000\u0000\u0000\u047b\u0478\u0001\u0000\u0000\u0000\u047b\u0479"+
		"\u0001\u0000\u0000\u0000\u047b\u047a\u0001\u0000\u0000\u0000\u047c\u008f"+
		"\u0001\u0000\u0000\u0000\u047d\u047e\u0005\u00c1\u0000\u0000\u047e\u0483"+
		"\u0005\u000e\u0000\u0000\u047f\u0480\u0005\u00c1\u0000\u0000\u0480\u0484"+
		"\u0005\b\u0000\u0000\u0481\u0482\u0005V\u0000\u0000\u0482\u0484\u0005"+
		"\b\u0000\u0000\u0483\u047f\u0001\u0000\u0000\u0000\u0483\u0481\u0001\u0000"+
		"\u0000\u0000\u0484\u0485\u0001\u0000\u0000\u0000\u0485\u0483\u0001\u0000"+
		"\u0000\u0000\u0485\u0486\u0001\u0000\u0000\u0000\u0486\u0488\u0001\u0000"+
		"\u0000\u0000\u0487\u0489\u0003\u008eG\u0000\u0488\u0487\u0001\u0000\u0000"+
		"\u0000\u0489\u048a\u0001\u0000\u0000\u0000\u048a\u0488\u0001\u0000\u0000"+
		"\u0000\u048a\u048b\u0001\u0000\u0000\u0000\u048b\u048c\u0001\u0000\u0000"+
		"\u0000\u048c\u048d\u0005\u000f\u0000\u0000\u048d\u0091\u0001\u0000\u0000"+
		"\u0000\u048e\u048f\u0005\u00c1\u0000\u0000\u048f\u0490\u0005\u000e\u0000"+
		"\u0000\u0490\u0491\u0005l\u0000\u0000\u0491\u0493\u0005\u0006\u0000\u0000"+
		"\u0492\u0494\u0003\u0098L\u0000\u0493\u0492\u0001\u0000\u0000\u0000\u0494"+
		"\u0495\u0001\u0000\u0000\u0000\u0495\u0493\u0001\u0000\u0000\u0000\u0495"+
		"\u0496\u0001\u0000\u0000\u0000\u0496\u0497\u0001\u0000\u0000\u0000\u0497"+
		"\u0498\u0005\u000f\u0000\u0000\u0498\u0093\u0001\u0000\u0000\u0000\u0499"+
		"\u049a\u0005m\u0000\u0000\u049a\u049b\u0005\b\u0000\u0000\u049b\u0095"+
		"\u0001\u0000\u0000\u0000\u049c\u049d\u0005n\u0000\u0000\u049d\u04a1\u0005"+
		"\u000e\u0000\u0000\u049e\u04a0\u0003d2\u0000\u049f\u049e\u0001\u0000\u0000"+
		"\u0000\u04a0\u04a3\u0001\u0000\u0000\u0000\u04a1\u049f\u0001\u0000\u0000"+
		"\u0000\u04a1\u04a2\u0001\u0000\u0000\u0000\u04a2\u04a4\u0001\u0000\u0000"+
		"\u0000\u04a3\u04a1\u0001\u0000\u0000\u0000\u04a4\u04a5\u0005\u000f\u0000"+
		"\u0000\u04a5\u0097\u0001\u0000\u0000\u0000\u04a6\u04a7\u0005\u00c1\u0000"+
		"\u0000\u04a7\u04b2\u0005\u000e\u0000\u0000\u04a8\u04b1\u0003@ \u0000\u04a9"+
		"\u04b1\u0003\u0096K\u0000\u04aa\u04b1\u0003\u0094J\u0000\u04ab\u04ac\u0005"+
		"\u00ad\u0000\u0000\u04ac\u04b1\u0005\b\u0000\u0000\u04ad\u04b1\u0003\u0010"+
		"\b\u0000\u04ae\u04af\u0005o\u0000\u0000\u04af\u04b1\u0005\b\u0000\u0000"+
		"\u04b0\u04a8\u0001\u0000\u0000\u0000\u04b0\u04a9\u0001\u0000\u0000\u0000"+
		"\u04b0\u04aa\u0001\u0000\u0000\u0000\u04b0\u04ab\u0001\u0000\u0000\u0000"+
		"\u04b0\u04ad\u0001\u0000\u0000\u0000\u04b0\u04ae\u0001\u0000\u0000\u0000"+
		"\u04b1\u04b4\u0001\u0000\u0000\u0000\u04b2\u04b0\u0001\u0000\u0000\u0000"+
		"\u04b2\u04b3\u0001\u0000\u0000\u0000\u04b3\u04b5\u0001\u0000\u0000\u0000"+
		"\u04b4\u04b2\u0001\u0000\u0000\u0000\u04b5\u04b6\u0005\u000f\u0000\u0000"+
		"\u04b6\u0099\u0001\u0000\u0000\u0000\u04b7\u04b8\u0005q\u0000\u0000\u04b8"+
		"\u04ba\u0005\u000e\u0000\u0000\u04b9\u04bb\u0005\b\u0000\u0000\u04ba\u04b9"+
		"\u0001\u0000\u0000\u0000\u04bb\u04bc\u0001\u0000\u0000\u0000\u04bc\u04ba"+
		"\u0001\u0000\u0000\u0000\u04bc\u04bd\u0001\u0000\u0000\u0000\u04bd\u04bf"+
		"\u0001\u0000\u0000\u0000\u04be\u04c0\u0005\b\u0000\u0000\u04bf\u04be\u0001"+
		"\u0000\u0000\u0000\u04c0\u04c1\u0001\u0000\u0000\u0000\u04c1\u04bf\u0001"+
		"\u0000\u0000\u0000\u04c1\u04c2\u0001\u0000\u0000\u0000\u04c2\u04c4\u0001"+
		"\u0000\u0000\u0000\u04c3\u04c5\u0005\b\u0000\u0000\u04c4\u04c3\u0001\u0000"+
		"\u0000\u0000\u04c5\u04c6\u0001\u0000\u0000\u0000\u04c6\u04c4\u0001\u0000"+
		"\u0000\u0000\u04c6\u04c7\u0001\u0000\u0000\u0000\u04c7\u04c8\u0001\u0000"+
		"\u0000\u0000\u04c8\u04c9\u0005\u000f\u0000\u0000\u04c9\u009b\u0001\u0000"+
		"\u0000\u0000\u04ca\u04cb\u0005s\u0000\u0000\u04cb\u04cc\u0005\u000e\u0000"+
		"\u0000\u04cc\u04cd\u0003\u001c\u000e\u0000\u04cd\u04ce\u0003\u001e\u000f"+
		"\u0000\u04ce\u04cf\u0005v\u0000\u0000\u04cf\u04d0\u0005\b\u0000\u0000"+
		"\u04d0\u04d1\u0005*\u0000\u0000\u04d1\u04d2\u0005\b\u0000\u0000\u04d2"+
		"\u04d3\u0005\u000f\u0000\u0000\u04d3\u009d\u0001\u0000\u0000\u0000\u04d4"+
		"\u04d5\u0005p\u0000\u0000\u04d5\u04d9\u0005\b\u0000\u0000\u04d6\u04d8"+
		"\u0003\u0018\f\u0000\u04d7\u04d6\u0001\u0000\u0000\u0000\u04d8\u04db\u0001"+
		"\u0000\u0000\u0000\u04d9\u04d7\u0001\u0000\u0000\u0000\u04d9\u04da\u0001"+
		"\u0000\u0000\u0000\u04da\u04df\u0001\u0000\u0000\u0000\u04db\u04d9\u0001"+
		"\u0000\u0000\u0000\u04dc\u04de\u0003\u009aM\u0000\u04dd\u04dc\u0001\u0000"+
		"\u0000\u0000\u04de\u04e1\u0001\u0000\u0000\u0000\u04df\u04dd\u0001\u0000"+
		"\u0000\u0000\u04df\u04e0\u0001\u0000\u0000\u0000\u04e0\u04e2\u0001\u0000"+
		"\u0000\u0000\u04e1\u04df\u0001\u0000\u0000\u0000\u04e2\u04e3\u0005r\u0000"+
		"\u0000\u04e3\u04e7\u0005\u000e\u0000\u0000\u04e4\u04e6\u0003\u009cN\u0000"+
		"\u04e5\u04e4\u0001\u0000\u0000\u0000\u04e6\u04e9\u0001\u0000\u0000\u0000"+
		"\u04e7\u04e5\u0001\u0000\u0000\u0000\u04e7\u04e8\u0001\u0000\u0000\u0000"+
		"\u04e8\u04ea\u0001\u0000\u0000\u0000\u04e9\u04e7\u0001\u0000\u0000\u0000"+
		"\u04ea\u04eb\u0005\u000f\u0000\u0000\u04eb\u009f\u0001\u0000\u0000\u0000"+
		"\u04ec\u04ed\u0007\n\u0000\u0000\u04ed\u04f1\u0005\u000e\u0000\u0000\u04ee"+
		"\u04f0\u0003@ \u0000\u04ef\u04ee\u0001\u0000\u0000\u0000\u04f0\u04f3\u0001"+
		"\u0000\u0000\u0000\u04f1\u04ef\u0001\u0000\u0000\u0000\u04f1\u04f2\u0001"+
		"\u0000\u0000\u0000\u04f2\u04f4\u0001\u0000\u0000\u0000\u04f3\u04f1\u0001"+
		"\u0000\u0000\u0000\u04f4\u04f5\u0005\u000f\u0000\u0000\u04f5\u00a1\u0001"+
		"\u0000\u0000\u0000\u04f6\u04f7\u0007\u000b\u0000\u0000\u04f7\u04fb\u0005"+
		"\u000e\u0000\u0000\u04f8\u04fa\u0007\u0006\u0000\u0000\u04f9\u04f8\u0001"+
		"\u0000\u0000\u0000\u04fa\u04fd\u0001\u0000\u0000\u0000\u04fb\u04f9\u0001"+
		"\u0000\u0000\u0000\u04fb\u04fc\u0001\u0000\u0000\u0000\u04fc\u04fe\u0001"+
		"\u0000\u0000\u0000\u04fd\u04fb\u0001\u0000\u0000\u0000\u04fe\u04ff\u0005"+
		"\u000f\u0000\u0000\u04ff\u00a3\u0001\u0000\u0000\u0000\u0500\u0501\u0005"+
		"\u00c1\u0000\u0000\u0501\u0507\u0005\u000e\u0000\u0000\u0502\u0503\u0005"+
		"\u0080\u0000\u0000\u0503\u0508\u0005\u00c1\u0000\u0000\u0504\u0508\u0003"+
		"\u00a0P\u0000\u0505\u0508\u0003\u00a6S\u0000\u0506\u0508\u0003\u00a2Q"+
		"\u0000\u0507\u0502\u0001\u0000\u0000\u0000\u0507\u0504\u0001\u0000\u0000"+
		"\u0000\u0507\u0505\u0001\u0000\u0000\u0000\u0507\u0506\u0001\u0000\u0000"+
		"\u0000\u0508\u0509\u0001\u0000\u0000\u0000\u0509\u0507\u0001\u0000\u0000"+
		"\u0000\u0509\u050a\u0001\u0000\u0000\u0000\u050a\u050b\u0001\u0000\u0000"+
		"\u0000\u050b\u050c\u0005\u000f\u0000\u0000\u050c\u00a5\u0001\u0000\u0000"+
		"\u0000\u050d\u050e\u0005\u00c1\u0000\u0000\u050e\u0515\u0005\u000e\u0000"+
		"\u0000\u050f\u0510\u0005|\u0000\u0000\u0510\u0514\u0005\u0007\u0000\u0000"+
		"\u0511\u0514\u0003\u00a0P\u0000\u0512\u0514\u0003\u00a2Q\u0000\u0513\u050f"+
		"\u0001\u0000\u0000\u0000\u0513\u0511\u0001\u0000\u0000\u0000\u0513\u0512"+
		"\u0001\u0000\u0000\u0000\u0514\u0517\u0001\u0000\u0000\u0000\u0515\u0513"+
		"\u0001\u0000\u0000\u0000\u0515\u0516\u0001\u0000\u0000\u0000\u0516\u0518"+
		"\u0001\u0000\u0000\u0000\u0517\u0515\u0001\u0000\u0000\u0000\u0518\u0519"+
		"\u0005\u000f\u0000\u0000\u0519\u00a7\u0001\u0000\u0000\u0000\u051a\u051b"+
		"\u0005\u0007\u0000\u0000\u051b\u051c\u0005\t\u0000\u0000\u051c\u00a9\u0001"+
		"\u0000\u0000\u0000\u051d\u051e\u0005\u0007\u0000\u0000\u051e\u0531\u0005"+
		"\u000e\u0000\u0000\u051f\u0520\u0007\f\u0000\u0000\u0520\u0522\u0005\u000e"+
		"\u0000\u0000\u0521\u0523\u0005\b\u0000\u0000\u0522\u0521\u0001\u0000\u0000"+
		"\u0000\u0523\u0524\u0001\u0000\u0000\u0000\u0524\u0522\u0001\u0000\u0000"+
		"\u0000\u0524\u0525\u0001\u0000\u0000\u0000\u0525\u0527\u0001\u0000\u0000"+
		"\u0000\u0526\u0528\u0005\b\u0000\u0000\u0527\u0526\u0001\u0000\u0000\u0000"+
		"\u0528\u0529\u0001\u0000\u0000\u0000\u0529\u0527\u0001\u0000\u0000\u0000"+
		"\u0529\u052a\u0001\u0000\u0000\u0000\u052a\u052c\u0001\u0000\u0000\u0000"+
		"\u052b\u052d\u0005\b\u0000\u0000\u052c\u052b\u0001\u0000\u0000\u0000\u052d"+
		"\u052e\u0001\u0000\u0000\u0000\u052e\u052c\u0001\u0000\u0000\u0000\u052e"+
		"\u052f\u0001\u0000\u0000\u0000\u052f\u0530\u0001\u0000\u0000\u0000\u0530"+
		"\u0532\u0005\u000f\u0000\u0000\u0531\u051f\u0001\u0000\u0000\u0000\u0532"+
		"\u0533\u0001\u0000\u0000\u0000\u0533\u0531\u0001\u0000\u0000\u0000\u0533"+
		"\u0534\u0001\u0000\u0000\u0000\u0534\u0535\u0001\u0000\u0000\u0000\u0535"+
		"\u0536\u0005\u000f\u0000\u0000\u0536\u00ab\u0001\u0000\u0000\u0000\u0537"+
		"\u0538\u0007\r\u0000\u0000\u0538\u053c\u0005\u000e\u0000\u0000\u0539\u053b"+
		"\u0007\u0006\u0000\u0000\u053a\u0539\u0001\u0000\u0000\u0000\u053b\u053e"+
		"\u0001\u0000\u0000\u0000\u053c\u053a\u0001\u0000\u0000\u0000\u053c\u053d"+
		"\u0001\u0000\u0000\u0000\u053d\u053f\u0001\u0000\u0000\u0000\u053e\u053c"+
		"\u0001\u0000\u0000\u0000\u053f\u0540\u0005\u000f\u0000\u0000\u0540\u00ad"+
		"\u0001\u0000\u0000\u0000\u0541\u0542\u0005\u0084\u0000\u0000\u0542\u0547"+
		"\u0005\u000e\u0000\u0000\u0543\u0544\u0005\t\u0000\u0000\u0544\u0546\u0005"+
		"\b\u0000\u0000\u0545\u0543\u0001\u0000\u0000\u0000\u0546\u0549\u0001\u0000"+
		"\u0000\u0000\u0547\u0545\u0001\u0000\u0000\u0000\u0547\u0548\u0001\u0000"+
		"\u0000\u0000\u0548\u054a\u0001\u0000\u0000\u0000\u0549\u0547\u0001\u0000"+
		"\u0000\u0000\u054a\u054b\u0005\u000f\u0000\u0000\u054b\u00af\u0001\u0000"+
		"\u0000\u0000\u054c\u054d\u0005\u0080\u0000\u0000\u054d\u0564\u0005\u00c1"+
		"\u0000\u0000\u054e\u0564\u0003\u0018\f\u0000\u054f\u0564\u0003\u00acV"+
		"\u0000\u0550\u0564\u0003\u00aeW\u0000\u0551\u0552\u0005\u0081\u0000\u0000"+
		"\u0552\u0554\u0005\u000e\u0000\u0000\u0553\u0555\u0005\b\u0000\u0000\u0554"+
		"\u0553\u0001\u0000\u0000\u0000\u0555\u0556\u0001\u0000\u0000\u0000\u0556"+
		"\u0554\u0001\u0000\u0000\u0000\u0556\u0557\u0001\u0000\u0000\u0000\u0557"+
		"\u0559\u0001\u0000\u0000\u0000\u0558\u055a\u0005\b\u0000\u0000\u0559\u0558"+
		"\u0001\u0000\u0000\u0000\u055a\u055b\u0001\u0000\u0000\u0000\u055b\u0559"+
		"\u0001\u0000\u0000\u0000\u055b\u055c\u0001\u0000\u0000\u0000\u055c\u055e"+
		"\u0001\u0000\u0000\u0000\u055d\u055f\u0005\b\u0000\u0000\u055e\u055d\u0001"+
		"\u0000\u0000\u0000\u055f\u0560\u0001\u0000\u0000\u0000\u0560\u055e\u0001"+
		"\u0000\u0000\u0000\u0560\u0561\u0001\u0000\u0000\u0000\u0561\u0562\u0001"+
		"\u0000\u0000\u0000\u0562\u0564\u0005\u000f\u0000\u0000\u0563\u054c\u0001"+
		"\u0000\u0000\u0000\u0563\u054e\u0001\u0000\u0000\u0000\u0563\u054f\u0001"+
		"\u0000\u0000\u0000\u0563\u0550\u0001\u0000\u0000\u0000\u0563\u0551\u0001"+
		"\u0000\u0000\u0000\u0564\u0565\u0001\u0000\u0000\u0000\u0565\u0563\u0001"+
		"\u0000\u0000\u0000\u0565\u0566\u0001\u0000\u0000\u0000\u0566\u00b1\u0001"+
		"\u0000\u0000\u0000\u0567\u0568\u0005\u008d\u0000\u0000\u0568\u056b\u0005"+
		"\u000e\u0000\u0000\u0569\u056a\u0005\u00c1\u0000\u0000\u056a\u056c\u0005"+
		"\b\u0000\u0000\u056b\u0569\u0001\u0000\u0000\u0000\u056c\u056d\u0001\u0000"+
		"\u0000\u0000\u056d\u056b\u0001\u0000\u0000\u0000\u056d\u056e\u0001\u0000"+
		"\u0000\u0000\u056e\u056f\u0001\u0000\u0000\u0000\u056f\u0570\u0005\u000f"+
		"\u0000\u0000\u0570\u00b3\u0001\u0000\u0000\u0000\u0571\u0572\u0005\u008e"+
		"\u0000\u0000\u0572\u0575\u0005\u000e\u0000\u0000\u0573\u0574\u0005\u00c1"+
		"\u0000\u0000\u0574\u0576\u0005\b\u0000\u0000\u0575\u0573\u0001\u0000\u0000"+
		"\u0000\u0576\u0577\u0001\u0000\u0000\u0000\u0577\u0575\u0001\u0000\u0000"+
		"\u0000\u0577\u0578\u0001\u0000\u0000\u0000\u0578\u0579\u0001\u0000\u0000"+
		"\u0000\u0579\u057a\u0005\u000f\u0000\u0000\u057a\u00b5\u0001\u0000\u0000"+
		"\u0000\u057b\u057c\u0005\u008f\u0000\u0000\u057c\u057f\u0005\u000e\u0000"+
		"\u0000\u057d\u057e\u0005\u00c1\u0000\u0000\u057e\u0580\u0005\b\u0000\u0000"+
		"\u057f\u057d\u0001\u0000\u0000\u0000\u0580\u0581\u0001\u0000\u0000\u0000"+
		"\u0581\u057f\u0001\u0000\u0000\u0000\u0581\u0582\u0001\u0000\u0000\u0000"+
		"\u0582\u0583\u0001\u0000\u0000\u0000\u0583\u0584\u0005\u000f\u0000\u0000"+
		"\u0584\u00b7\u0001\u0000\u0000\u0000\u0585\u0586\u0005\u0089\u0000\u0000"+
		"\u0586\u058e\u0005\b\u0000\u0000\u0587\u0588\u0005\u008a\u0000\u0000\u0588"+
		"\u058e\u0005\b\u0000\u0000\u0589\u058a\u0005\u008b\u0000\u0000\u058a\u058e"+
		"\u0005\b\u0000\u0000\u058b\u058c\u0005\u008c\u0000\u0000\u058c\u058e\u0005"+
		"\b\u0000\u0000\u058d\u0585\u0001\u0000\u0000\u0000\u058d\u0587\u0001\u0000"+
		"\u0000\u0000\u058d\u0589\u0001\u0000\u0000\u0000\u058d\u058b\u0001\u0000"+
		"\u0000\u0000\u058e\u00b9\u0001\u0000\u0000\u0000\u058f\u0594\u0003\u001a"+
		"\r\u0000\u0590\u0594\u0003\u00b2Y\u0000\u0591\u0594\u0003\u00b4Z\u0000"+
		"\u0592\u0594\u0003\u00b6[\u0000\u0593\u058f\u0001\u0000\u0000\u0000\u0593"+
		"\u0590\u0001\u0000\u0000\u0000\u0593\u0591\u0001\u0000\u0000\u0000\u0593"+
		"\u0592\u0001\u0000\u0000\u0000\u0594\u00bb\u0001\u0000\u0000\u0000\u0595"+
		"\u0596\u0005\u00c1\u0000\u0000\u0596\u059f\u0005\u000e\u0000\u0000\u0597"+
		"\u05a0\u0003\u0018\f\u0000\u0598\u059a\u0003\u00b8\\\u0000\u0599\u0598"+
		"\u0001\u0000\u0000\u0000\u059a\u059b\u0001\u0000\u0000\u0000\u059b\u0599"+
		"\u0001\u0000\u0000\u0000\u059b\u059c\u0001\u0000\u0000\u0000\u059c\u05a0"+
		"\u0001\u0000\u0000\u0000\u059d\u05a0\u0003\u00ba]\u0000\u059e\u05a0\u0003"+
		"\u0016\u000b\u0000\u059f\u0597\u0001\u0000\u0000\u0000\u059f\u0599\u0001"+
		"\u0000\u0000\u0000\u059f\u059d\u0001\u0000\u0000\u0000\u059f\u059e\u0001"+
		"\u0000\u0000\u0000\u05a0\u05a1\u0001\u0000\u0000\u0000\u05a1\u059f\u0001"+
		"\u0000\u0000\u0000\u05a1\u05a2\u0001\u0000\u0000\u0000\u05a2\u05a3\u0001"+
		"\u0000\u0000\u0000\u05a3\u05a4\u0005\u000f\u0000\u0000\u05a4\u00bd\u0001"+
		"\u0000\u0000\u0000\u05a5\u05a6\u0005I\u0000\u0000\u05a6\u05a7\u0007\u000e"+
		"\u0000\u0000\u05a7\u00bf\u0001\u0000\u0000\u0000\u05a8\u05a9\u0005J\u0000"+
		"\u0000\u05a9\u05aa\u0007\u000e\u0000\u0000\u05aa\u00c1\u0001\u0000\u0000"+
		"\u0000\u05ab\u05ac\u0005L\u0000\u0000\u05ac\u05b0\u0005\u000e\u0000\u0000"+
		"\u05ad\u05af\u0003\u00be_\u0000\u05ae\u05ad\u0001\u0000\u0000\u0000\u05af"+
		"\u05b2\u0001\u0000\u0000\u0000\u05b0\u05ae\u0001\u0000\u0000\u0000\u05b0"+
		"\u05b1\u0001\u0000\u0000\u0000\u05b1\u05b6\u0001\u0000\u0000\u0000\u05b2"+
		"\u05b0\u0001\u0000\u0000\u0000\u05b3\u05b5\u0003d2\u0000\u05b4\u05b3\u0001"+
		"\u0000\u0000\u0000\u05b5\u05b8\u0001\u0000\u0000\u0000\u05b6\u05b4\u0001"+
		"\u0000\u0000\u0000\u05b6\u05b7\u0001\u0000\u0000\u0000\u05b7\u05b9\u0001"+
		"\u0000\u0000\u0000\u05b8\u05b6\u0001\u0000\u0000\u0000\u05b9\u05ba\u0005"+
		"\u000f\u0000\u0000\u05ba\u00c3\u0001\u0000\u0000\u0000\u05bb\u05bc\u0005"+
		"K\u0000\u0000\u05bc\u05bd\u0007\u000f\u0000\u0000\u05bd\u00c5\u0001\u0000"+
		"\u0000\u0000\u05be\u05bf\u0005\u00c1\u0000\u0000\u05bf\u05c2\u0005\u000e"+
		"\u0000\u0000\u05c0\u05c3\u0003\u0016\u000b\u0000\u05c1\u05c3\u0003|>\u0000"+
		"\u05c2\u05c0\u0001\u0000\u0000\u0000\u05c2\u05c1\u0001\u0000\u0000\u0000"+
		"\u05c3\u05c4\u0001\u0000\u0000\u0000\u05c4\u05c2\u0001\u0000\u0000\u0000"+
		"\u05c4\u05c5\u0001\u0000\u0000\u0000\u05c5\u05c6\u0001\u0000\u0000\u0000"+
		"\u05c6\u05c7\u0005\u000f\u0000\u0000\u05c7\u00c7\u0001\u0000\u0000\u0000"+
		"\u05c8\u05c9\u0005\u0092\u0000\u0000\u05c9\u05ca\u0007\u0003\u0000\u0000"+
		"\u05ca\u00c9\u0001\u0000\u0000\u0000\u05cb\u05cc\u0005\u0093\u0000\u0000"+
		"\u05cc\u05cd\u0005\t\u0000\u0000\u05cd\u00cb\u0001\u0000\u0000\u0000\u05ce"+
		"\u05cf\u0005\u00c1\u0000\u0000\u05cf\u05da\u0005\u000e\u0000\u0000\u05d0"+
		"\u05d9\u0003\u00c8d\u0000\u05d1\u05d9\u0003\u0006\u0003\u0000\u05d2\u05d9"+
		"\u0003\u00cae\u0000\u05d3\u05d9\u0003\u012a\u0095\u0000\u05d4\u05d9\u0003"+
		"\u00fe\u007f\u0000\u05d5\u05d9\u0003\n\u0005\u0000\u05d6\u05d9\u0003\u000e"+
		"\u0007\u0000\u05d7\u05d9\u0003\b\u0004\u0000\u05d8\u05d0\u0001\u0000\u0000"+
		"\u0000\u05d8\u05d1\u0001\u0000\u0000\u0000\u05d8\u05d2\u0001\u0000\u0000"+
		"\u0000\u05d8\u05d3\u0001\u0000\u0000\u0000\u05d8\u05d4\u0001\u0000\u0000"+
		"\u0000\u05d8\u05d5\u0001\u0000\u0000\u0000\u05d8\u05d6\u0001\u0000\u0000"+
		"\u0000\u05d8\u05d7\u0001\u0000\u0000\u0000\u05d9\u05dc\u0001\u0000\u0000"+
		"\u0000\u05da\u05d8\u0001\u0000\u0000\u0000\u05da\u05db\u0001\u0000\u0000"+
		"\u0000\u05db\u05de\u0001\u0000\u0000\u0000\u05dc\u05da\u0001\u0000\u0000"+
		"\u0000\u05dd\u05df\u0003\u0012\t\u0000\u05de\u05dd\u0001\u0000\u0000\u0000"+
		"\u05de\u05df\u0001\u0000\u0000\u0000\u05df\u05e0\u0001\u0000\u0000\u0000"+
		"\u05e0\u05e1\u0005\u000f\u0000\u0000\u05e1\u00cd\u0001\u0000\u0000\u0000"+
		"\u05e2\u05e3\u0005\u00c1\u0000\u0000\u05e3\u05e4\u0007\u0010\u0000\u0000"+
		"\u05e4\u00cf\u0001\u0000\u0000\u0000\u05e5\u05e9\u0003\u00ceg\u0000\u05e6"+
		"\u05e7\u0005\u00c1\u0000\u0000\u05e7\u05e9\u0005\b\u0000\u0000\u05e8\u05e5"+
		"\u0001\u0000\u0000\u0000\u05e8\u05e6\u0001\u0000\u0000\u0000\u05e9\u00d1"+
		"\u0001\u0000\u0000\u0000\u05ea\u05eb\u0005\u0097\u0000\u0000\u05eb\u05ef"+
		"\u0005\u000e\u0000\u0000\u05ec\u05ee\u0003@ \u0000\u05ed\u05ec\u0001\u0000"+
		"\u0000\u0000\u05ee\u05f1\u0001\u0000\u0000\u0000\u05ef\u05ed\u0001\u0000"+
		"\u0000\u0000\u05ef\u05f0\u0001\u0000\u0000\u0000\u05f0\u05f2\u0001\u0000"+
		"\u0000\u0000\u05f1\u05ef\u0001\u0000\u0000\u0000\u05f2\u05f3\u0005\u000f"+
		"\u0000\u0000\u05f3\u00d3\u0001\u0000\u0000\u0000\u05f4\u05f5\u0005\u0099"+
		"\u0000\u0000\u05f5\u05f9\u0005\u000e\u0000\u0000\u05f6\u05f8\u0003@ \u0000"+
		"\u05f7\u05f6\u0001\u0000\u0000\u0000\u05f8\u05fb\u0001\u0000\u0000\u0000"+
		"\u05f9\u05f7\u0001\u0000\u0000\u0000\u05f9\u05fa\u0001\u0000\u0000\u0000"+
		"\u05fa\u05fc\u0001\u0000\u0000\u0000\u05fb\u05f9\u0001\u0000\u0000\u0000"+
		"\u05fc\u05fd\u0005\u000f\u0000\u0000\u05fd\u00d5\u0001\u0000\u0000\u0000"+
		"\u05fe\u05ff\u0005\u0098\u0000\u0000\u05ff\u0603\u0005\u000e\u0000\u0000"+
		"\u0600\u0602\u0003@ \u0000\u0601\u0600\u0001\u0000\u0000\u0000\u0602\u0605"+
		"\u0001\u0000\u0000\u0000\u0603\u0601\u0001\u0000\u0000\u0000\u0603\u0604"+
		"\u0001\u0000\u0000\u0000\u0604\u0606\u0001\u0000\u0000\u0000\u0605\u0603"+
		"\u0001\u0000\u0000\u0000\u0606\u0607\u0005\u000f\u0000\u0000\u0607\u00d7"+
		"\u0001\u0000\u0000\u0000\u0608\u0609\u0005\u00c1\u0000\u0000\u0609\u060e"+
		"\u0005\u000e\u0000\u0000\u060a\u060f\u0003\u00d0h\u0000\u060b\u060f\u0003"+
		"\u00d2i\u0000\u060c\u060f\u0003\u00d6k\u0000\u060d\u060f\u0003\u00d4j"+
		"\u0000\u060e\u060a\u0001\u0000\u0000\u0000\u060e\u060b\u0001\u0000\u0000"+
		"\u0000\u060e\u060c\u0001\u0000\u0000\u0000\u060e\u060d\u0001\u0000\u0000"+
		"\u0000\u060f\u0610\u0001\u0000\u0000\u0000\u0610\u060e\u0001\u0000\u0000"+
		"\u0000\u0610\u0611\u0001\u0000\u0000\u0000\u0611\u0612\u0001\u0000\u0000"+
		"\u0000\u0612\u0613\u0005\u000f\u0000\u0000\u0613\u00d9\u0001\u0000\u0000"+
		"\u0000\u0614\u0615\u0005\u00a3\u0000\u0000\u0615\u0616\u0007\u0003\u0000"+
		"\u0000\u0616\u00db\u0001\u0000\u0000\u0000\u0617\u0618\u0005\u00a2\u0000"+
		"\u0000\u0618\u0619\u0007\u0003\u0000\u0000\u0619\u00dd\u0001\u0000\u0000"+
		"\u0000\u061a\u061b\u0005^\u0000\u0000\u061b\u061c\u0005\b\u0000\u0000"+
		"\u061c\u00df\u0001\u0000\u0000\u0000\u061d\u061e\u0005\u00a1\u0000\u0000"+
		"\u061e\u061f\u0007\u0003\u0000\u0000\u061f\u00e1\u0001\u0000\u0000\u0000"+
		"\u0620\u0621\u0005\u00a0\u0000\u0000\u0621\u0622\u0007\u0003\u0000\u0000"+
		"\u0622\u00e3\u0001\u0000\u0000\u0000\u0623\u0624\u0005\u009f\u0000\u0000"+
		"\u0624\u0625\u0007\u0003\u0000\u0000\u0625\u00e5\u0001\u0000\u0000\u0000"+
		"\u0626\u0627\u0005\u009e\u0000\u0000\u0627\u0628\u0007\u0003\u0000\u0000"+
		"\u0628\u00e7\u0001\u0000\u0000\u0000\u0629\u062a\u0005\u009d\u0000\u0000"+
		"\u062a\u062b\u0007\u0003\u0000\u0000\u062b\u00e9\u0001\u0000\u0000\u0000"+
		"\u062c\u062d\u0005\u009c\u0000\u0000\u062d\u0631\u0005\u000e\u0000\u0000"+
		"\u062e\u0630\u0005\u00c1\u0000\u0000\u062f\u062e\u0001\u0000\u0000\u0000"+
		"\u0630\u0633\u0001\u0000\u0000\u0000\u0631\u062f\u0001\u0000\u0000\u0000"+
		"\u0631\u0632\u0001\u0000\u0000\u0000\u0632\u0634\u0001\u0000\u0000\u0000"+
		"\u0633\u0631\u0001\u0000\u0000\u0000\u0634\u0635\u0005\u000f\u0000\u0000"+
		"\u0635\u00eb\u0001\u0000\u0000\u0000\u0636\u0637\u0005\u009b\u0000\u0000"+
		"\u0637\u0638\u0007\u0003\u0000\u0000\u0638\u00ed\u0001\u0000\u0000\u0000"+
		"\u0639\u063a\u0005\u009a\u0000\u0000\u063a\u063b\u0005\u00c1\u0000\u0000"+
		"\u063b\u00ef\u0001\u0000\u0000\u0000\u063c\u063d\u0005)\u0000\u0000\u063d"+
		"\u063e\u0007\u0003\u0000\u0000\u063e\u00f1\u0001\u0000\u0000\u0000\u063f"+
		"\u0649\u0003\u00dcn\u0000\u0640\u0649\u0003\u00eau\u0000\u0641\u0649\u0003"+
		"\u00e8t\u0000\u0642\u0649\u0003z=\u0000\u0643\u0649\u00030\u0018\u0000"+
		"\u0644\u0649\u0003\u00f0x\u0000\u0645\u0649\u0003\u00eew\u0000\u0646\u0649"+
		"\u0003t:\u0000\u0647\u0649\u0003v;\u0000\u0648\u063f\u0001\u0000\u0000"+
		"\u0000\u0648\u0640\u0001\u0000\u0000\u0000\u0648\u0641\u0001\u0000\u0000"+
		"\u0000\u0648\u0642\u0001\u0000\u0000\u0000\u0648\u0643\u0001\u0000\u0000"+
		"\u0000\u0648\u0644\u0001\u0000\u0000\u0000\u0648\u0645\u0001\u0000\u0000"+
		"\u0000\u0648\u0646\u0001\u0000\u0000\u0000\u0648\u0647\u0001\u0000\u0000"+
		"\u0000\u0649\u00f3\u0001\u0000\u0000\u0000\u064a\u064b\u0005\u00c1\u0000"+
		"\u0000\u064b\u064d\u0005\u000e\u0000\u0000\u064c\u064e\u0003\u00dam\u0000"+
		"\u064d\u064c\u0001\u0000\u0000\u0000\u064d\u064e\u0001\u0000\u0000\u0000"+
		"\u064e\u0650\u0001\u0000\u0000\u0000\u064f\u0651\u0003\u00e0p\u0000\u0650"+
		"\u064f\u0001\u0000\u0000\u0000\u0650\u0651\u0001\u0000\u0000\u0000\u0651"+
		"\u0653\u0001\u0000\u0000\u0000\u0652\u0654\u0003\u00deo\u0000\u0653\u0652"+
		"\u0001\u0000\u0000\u0000\u0653\u0654\u0001\u0000\u0000\u0000\u0654\u0656"+
		"\u0001\u0000\u0000\u0000\u0655\u0657\u0003\u00ecv\u0000\u0656\u0655\u0001"+
		"\u0000\u0000\u0000\u0656\u0657\u0001\u0000\u0000\u0000\u0657\u0659\u0001"+
		"\u0000\u0000\u0000\u0658\u065a\u0003\u00e6s\u0000\u0659\u0658\u0001\u0000"+
		"\u0000\u0000\u0659\u065a\u0001\u0000\u0000\u0000\u065a\u065c\u0001\u0000"+
		"\u0000\u0000\u065b\u065d\u0003\u00e4r\u0000\u065c\u065b\u0001\u0000\u0000"+
		"\u0000\u065c\u065d\u0001\u0000\u0000\u0000\u065d\u065f\u0001\u0000\u0000"+
		"\u0000\u065e\u0660\u0003\u00e2q\u0000\u065f\u065e\u0001\u0000\u0000\u0000"+
		"\u065f\u0660\u0001\u0000\u0000\u0000\u0660\u0664\u0001\u0000\u0000\u0000"+
		"\u0661\u0663\u0003\u00f2y\u0000\u0662\u0661\u0001\u0000\u0000\u0000\u0663"+
		"\u0666\u0001\u0000\u0000\u0000\u0664\u0662\u0001\u0000\u0000\u0000\u0664"+
		"\u0665\u0001\u0000\u0000\u0000\u0665\u0667\u0001\u0000\u0000\u0000\u0666"+
		"\u0664\u0001\u0000\u0000\u0000\u0667\u0668\u0005\u000f\u0000\u0000\u0668"+
		"\u00f5\u0001\u0000\u0000\u0000\u0669\u066a\u0007\u0011\u0000\u0000\u066a"+
		"\u066e\u0005\u000e\u0000\u0000\u066b\u066d\u0003d2\u0000\u066c\u066b\u0001"+
		"\u0000\u0000\u0000\u066d\u0670\u0001\u0000\u0000\u0000\u066e\u066c\u0001"+
		"\u0000\u0000\u0000\u066e\u066f\u0001\u0000\u0000\u0000\u066f\u0671\u0001"+
		"\u0000\u0000\u0000\u0670\u066e\u0001\u0000\u0000\u0000\u0671\u0672\u0005"+
		"\u000f\u0000\u0000\u0672\u00f7\u0001\u0000\u0000\u0000\u0673\u0674\u0007"+
		"\u0012\u0000\u0000\u0674\u0678\u0005\u000e\u0000\u0000\u0675\u0677\u0003"+
		"D\"\u0000\u0676\u0675\u0001\u0000\u0000\u0000\u0677\u067a\u0001\u0000"+
		"\u0000\u0000\u0678\u0676\u0001\u0000\u0000\u0000\u0678\u0679\u0001\u0000"+
		"\u0000\u0000\u0679\u067b\u0001\u0000\u0000\u0000\u067a\u0678\u0001\u0000"+
		"\u0000\u0000\u067b\u067c\u0005\u000f\u0000\u0000\u067c\u00f9\u0001\u0000"+
		"\u0000\u0000\u067d\u067e\u0007\u0013\u0000\u0000\u067e\u0680\u0005\u000e"+
		"\u0000\u0000\u067f\u0681\u0005\u00c1\u0000\u0000\u0680\u067f\u0001\u0000"+
		"\u0000\u0000\u0681\u0682\u0001\u0000\u0000\u0000\u0682\u0680\u0001\u0000"+
		"\u0000\u0000\u0682\u0683\u0001\u0000\u0000\u0000\u0683\u0684\u0001\u0000"+
		"\u0000\u0000\u0684\u0685\u0005\u000f\u0000\u0000\u0685\u00fb\u0001\u0000"+
		"\u0000\u0000\u0686\u0687\u0005\u00aa\u0000\u0000\u0687\u0688\u0003&\u0013"+
		"\u0000\u0688\u00fd\u0001\u0000\u0000\u0000\u0689\u068a\u0005\u00c1\u0000"+
		"\u0000\u068a\u068b\u0005\b\u0000\u0000\u068b\u00ff\u0001\u0000\u0000\u0000"+
		"\u068c\u068d\u0005%\u0000\u0000\u068d\u068e\u0005\b\u0000\u0000\u068e"+
		"\u0101\u0001\u0000\u0000\u0000\u068f\u0690\u0005\u00a6\u0000\u0000\u0690"+
		"\u0691\u0007\u0003\u0000\u0000\u0691\u0103\u0001\u0000\u0000\u0000\u0692"+
		"\u0693\u0005\u00ab\u0000\u0000\u0693\u0694\u0007\u0003\u0000\u0000\u0694"+
		"\u0105\u0001\u0000\u0000\u0000\u0695\u069d\u0003\u00fe\u007f\u0000\u0696"+
		"\u069d\u0003\u0100\u0080\u0000\u0697\u069d\u0003\u0102\u0081\u0000\u0698"+
		"\u069d\u0003\u0104\u0082\u0000\u0699\u069d\u0003\u010c\u0086\u0000\u069a"+
		"\u069d\u0003\u0108\u0084\u0000\u069b\u069d\u0003\u010a\u0085\u0000\u069c"+
		"\u0695\u0001\u0000\u0000\u0000\u069c\u0696\u0001\u0000\u0000\u0000\u069c"+
		"\u0697\u0001\u0000\u0000\u0000\u069c\u0698\u0001\u0000\u0000\u0000\u069c"+
		"\u0699\u0001\u0000\u0000\u0000\u069c\u069a\u0001\u0000\u0000\u0000\u069c"+
		"\u069b\u0001\u0000\u0000\u0000\u069d\u0107\u0001\u0000\u0000\u0000\u069e"+
		"\u069f\u0005\u00a4\u0000\u0000\u069f\u06a0\u0007\u0003\u0000\u0000\u06a0"+
		"\u0109\u0001\u0000\u0000\u0000\u06a1\u06a2\u0005\u00a7\u0000\u0000\u06a2"+
		"\u06a3\u0005\u00c1\u0000\u0000\u06a3\u010b\u0001\u0000\u0000\u0000\u06a4"+
		"\u06a5\u0005\u00a5\u0000\u0000\u06a5\u06a6\u0007\u0003\u0000\u0000\u06a6"+
		"\u010d\u0001\u0000\u0000\u0000\u06a7\u06a8\u0005\u00c1\u0000\u0000\u06a8"+
		"\u06b2\u0005\u000e\u0000\u0000\u06a9\u06b1\u0003\u00fa}\u0000\u06aa\u06b1"+
		"\u0003\u0106\u0083\u0000\u06ab\u06b1\u0003\u00f8|\u0000\u06ac\u06b1\u0003"+
		"\u00f6{\u0000\u06ad\u06b1\u0003\u00fc~\u0000\u06ae\u06b1\u0003\u000e\u0007"+
		"\u0000\u06af\u06b1\u0003\u0012\t\u0000\u06b0\u06a9\u0001\u0000\u0000\u0000"+
		"\u06b0\u06aa\u0001\u0000\u0000\u0000\u06b0\u06ab\u0001\u0000\u0000\u0000"+
		"\u06b0\u06ac\u0001\u0000\u0000\u0000\u06b0\u06ad\u0001\u0000\u0000\u0000"+
		"\u06b0\u06ae\u0001\u0000\u0000\u0000\u06b0\u06af\u0001\u0000\u0000\u0000"+
		"\u06b1\u06b4\u0001\u0000\u0000\u0000\u06b2\u06b0\u0001\u0000\u0000\u0000"+
		"\u06b2\u06b3\u0001\u0000\u0000\u0000\u06b3\u06b5\u0001\u0000\u0000\u0000"+
		"\u06b4\u06b2\u0001\u0000\u0000\u0000\u06b5\u06b6\u0005\u000f\u0000\u0000"+
		"\u06b6\u010f\u0001\u0000\u0000\u0000\u06b7\u06b8\u0005\u00ac\u0000\u0000"+
		"\u06b8\u06b9\u0005\u000e\u0000\u0000\u06b9\u06ba\u0003*\u0015\u0000\u06ba"+
		"\u06bb\u0003\u00c4b\u0000\u06bb\u06c0\u0003,\u0016\u0000\u06bc\u06bd\u0005"+
		"\u00ae\u0000\u0000\u06bd\u06bf\u0005\b\u0000\u0000\u06be\u06bc\u0001\u0000"+
		"\u0000\u0000\u06bf\u06c2\u0001\u0000\u0000\u0000\u06c0\u06be\u0001\u0000"+
		"\u0000\u0000\u06c0\u06c1\u0001\u0000\u0000\u0000\u06c1\u06c3\u0001\u0000"+
		"\u0000\u0000\u06c2\u06c0\u0001\u0000\u0000\u0000\u06c3\u06c7\u0005\u00ad"+
		"\u0000\u0000\u06c4\u06c6\u0007\u0003\u0000\u0000\u06c5\u06c4\u0001\u0000"+
		"\u0000\u0000\u06c6\u06c9\u0001\u0000\u0000\u0000\u06c7\u06c5\u0001\u0000"+
		"\u0000\u0000\u06c7\u06c8\u0001\u0000\u0000\u0000\u06c8\u06ce\u0001\u0000"+
		"\u0000\u0000\u06c9\u06c7\u0001\u0000\u0000\u0000\u06ca\u06cb\u0005\u00b0"+
		"\u0000\u0000\u06cb\u06cd\u0005\u0007\u0000\u0000\u06cc\u06ca\u0001\u0000"+
		"\u0000\u0000\u06cd\u06d0\u0001\u0000\u0000\u0000\u06ce\u06cc\u0001\u0000"+
		"\u0000\u0000\u06ce\u06cf\u0001\u0000\u0000\u0000\u06cf\u06d5\u0001\u0000"+
		"\u0000\u0000\u06d0\u06ce\u0001\u0000\u0000\u0000\u06d1\u06d2\u0005\u00af"+
		"\u0000\u0000\u06d2\u06d4\u0005\u0007\u0000\u0000\u06d3\u06d1\u0001\u0000"+
		"\u0000\u0000\u06d4\u06d7\u0001\u0000\u0000\u0000\u06d5\u06d3\u0001\u0000"+
		"\u0000\u0000\u06d5\u06d6\u0001\u0000\u0000\u0000\u06d6\u06d8\u0001\u0000"+
		"\u0000\u0000\u06d7\u06d5\u0001\u0000\u0000\u0000\u06d8\u06d9\u0005\u000f"+
		"\u0000\u0000\u06d9\u0111\u0001\u0000\u0000\u0000\u06da\u06db\u0005\u00c1"+
		"\u0000\u0000\u06db\u0704\u0005\u000e\u0000\u0000\u06dc\u06dd\u00053\u0000"+
		"\u0000\u06dd\u06e1\u0005\u000e\u0000\u0000\u06de\u06e0\u0003\u0014\n\u0000"+
		"\u06df\u06de\u0001\u0000\u0000\u0000\u06e0\u06e3\u0001\u0000\u0000\u0000"+
		"\u06e1\u06df\u0001\u0000\u0000\u0000\u06e1\u06e2\u0001\u0000\u0000\u0000"+
		"\u06e2\u06e4\u0001\u0000\u0000\u0000\u06e3\u06e1\u0001\u0000\u0000\u0000"+
		"\u06e4\u06e5\u0003\u0010\b\u0000\u06e5\u06e6\u0005\u000f\u0000\u0000\u06e6"+
		"\u0703\u0001\u0000\u0000\u0000\u06e7\u06e8\u00054\u0000\u0000\u06e8\u06ec"+
		"\u0005\u000e\u0000\u0000\u06e9\u06eb\u0003\u0014\n\u0000\u06ea\u06e9\u0001"+
		"\u0000\u0000\u0000\u06eb\u06ee\u0001\u0000\u0000\u0000\u06ec\u06ea\u0001"+
		"\u0000\u0000\u0000\u06ec\u06ed\u0001\u0000\u0000\u0000\u06ed\u06ef\u0001"+
		"\u0000\u0000\u0000\u06ee\u06ec\u0001\u0000\u0000\u0000\u06ef\u06f0\u0003"+
		"\u0010\b\u0000\u06f0\u06f1\u0005\u000f\u0000\u0000\u06f1\u0703\u0001\u0000"+
		"\u0000\u0000\u06f2\u06f3\u00055\u0000\u0000\u06f3\u06f7\u0005\u000e\u0000"+
		"\u0000\u06f4\u06f6\u0003\u0014\n\u0000\u06f5\u06f4\u0001\u0000\u0000\u0000"+
		"\u06f6\u06f9\u0001\u0000\u0000\u0000\u06f7\u06f5\u0001\u0000\u0000\u0000"+
		"\u06f7\u06f8\u0001\u0000\u0000\u0000\u06f8\u06fa\u0001\u0000\u0000\u0000"+
		"\u06f9\u06f7\u0001\u0000\u0000\u0000\u06fa\u06fb\u0003\u0010\b\u0000\u06fb"+
		"\u06fc\u0005\u000f\u0000\u0000\u06fc\u0703\u0001\u0000\u0000\u0000\u06fd"+
		"\u0703\u0003\u0014\n\u0000\u06fe\u0703\u0003\u0010\b\u0000\u06ff\u0703"+
		"\u0003\u0114\u008a\u0000\u0700\u0703\u0003\u0116\u008b\u0000\u0701\u0703"+
		"\u0003@ \u0000\u0702\u06dc\u0001\u0000\u0000\u0000\u0702\u06e7\u0001\u0000"+
		"\u0000\u0000\u0702\u06f2\u0001\u0000\u0000\u0000\u0702\u06fd\u0001\u0000"+
		"\u0000\u0000\u0702\u06fe\u0001\u0000\u0000\u0000\u0702\u06ff\u0001\u0000"+
		"\u0000\u0000\u0702\u0700\u0001\u0000\u0000\u0000\u0702\u0701\u0001\u0000"+
		"\u0000\u0000\u0703\u0706\u0001\u0000\u0000\u0000\u0704\u0702\u0001\u0000"+
		"\u0000\u0000\u0704\u0705\u0001\u0000\u0000\u0000\u0705\u0707\u0001\u0000"+
		"\u0000\u0000\u0706\u0704\u0001\u0000\u0000\u0000\u0707\u0708\u0005\u000f"+
		"\u0000\u0000\u0708\u0113\u0001\u0000\u0000\u0000\u0709\u070a\u00056\u0000"+
		"\u0000\u070a\u070b\u0005\u000e\u0000\u0000\u070b\u070c\u0003$\u0012\u0000"+
		"\u070c\u070d\u0005\u000f\u0000\u0000\u070d\u0115\u0001\u0000\u0000\u0000"+
		"\u070e\u070f\u0005]\u0000\u0000\u070f\u0710\u0005\u000e\u0000\u0000\u0710"+
		"\u0711\u0003\"\u0011\u0000\u0711\u0712\u0003$\u0012\u0000\u0712\u0713"+
		"\u0005\u000f\u0000\u0000\u0713\u0117\u0001\u0000\u0000\u0000\u0714\u0715"+
		"\u0005\u00c1\u0000\u0000\u0715\u0716\u0005\u000e\u0000\u0000\u0716\u0717"+
		"\u0003\u0010\b\u0000\u0717\u0718\u0005\u00bc\u0000\u0000\u0718\u0719\u0005"+
		"\b\u0000\u0000\u0719\u071a\u0005\u000f\u0000\u0000\u071a\u0119\u0001\u0000"+
		"\u0000\u0000\u071b\u071c\u0005\u00b2\u0000\u0000\u071c\u071d\u0005\b\u0000"+
		"\u0000\u071d\u011b\u0001\u0000\u0000\u0000\u071e\u071f\u0005\u00b3\u0000"+
		"\u0000\u071f\u0723\u0005\u000e\u0000\u0000\u0720\u0722\u0003d2\u0000\u0721"+
		"\u0720\u0001\u0000\u0000\u0000\u0722\u0725\u0001\u0000\u0000\u0000\u0723"+
		"\u0721\u0001\u0000\u0000\u0000\u0723\u0724\u0001\u0000\u0000\u0000\u0724"+
		"\u0726\u0001\u0000\u0000\u0000\u0725\u0723\u0001\u0000\u0000\u0000\u0726"+
		"\u0727\u0005\u000f\u0000\u0000\u0727\u011d\u0001\u0000\u0000\u0000\u0728"+
		"\u0729\u0005\u00c1\u0000\u0000\u0729\u072e\u0005\u000e\u0000\u0000\u072a"+
		"\u072d\u0003\u0014\n\u0000\u072b\u072d\u0003d2\u0000\u072c\u072a\u0001"+
		"\u0000\u0000\u0000\u072c\u072b\u0001\u0000\u0000\u0000\u072d\u0730\u0001"+
		"\u0000\u0000\u0000\u072e\u072c\u0001\u0000\u0000\u0000\u072e\u072f\u0001"+
		"\u0000\u0000\u0000\u072f\u0731\u0001\u0000\u0000\u0000\u0730\u072e\u0001"+
		"\u0000\u0000\u0000\u0731\u0732\u0005\u000f\u0000\u0000\u0732\u011f\u0001"+
		"\u0000\u0000\u0000\u0733\u0734\u0005\u00b4\u0000\u0000\u0734\u0738\u0005"+
		"\u000e\u0000\u0000\u0735\u0737\u0003\u011e\u008f\u0000\u0736\u0735\u0001"+
		"\u0000\u0000\u0000\u0737\u073a\u0001\u0000\u0000\u0000\u0738\u0736\u0001"+
		"\u0000\u0000\u0000\u0738\u0739\u0001\u0000\u0000\u0000\u0739\u073b\u0001"+
		"\u0000\u0000\u0000\u073a\u0738\u0001\u0000\u0000\u0000\u073b\u073c\u0005"+
		"\u000f\u0000\u0000\u073c\u0121\u0001\u0000\u0000\u0000\u073d\u073e\u0005"+
		"\u00c1\u0000\u0000\u073e\u0744\u0005\u000e\u0000\u0000\u073f\u0743\u0003"+
		"\u0014\n\u0000\u0740\u0743\u0003\n\u0005\u0000\u0741\u0743\u0003\u000e"+
		"\u0007\u0000\u0742\u073f\u0001\u0000\u0000\u0000\u0742\u0740\u0001\u0000"+
		"\u0000\u0000\u0742\u0741\u0001\u0000\u0000\u0000\u0743\u0746\u0001\u0000"+
		"\u0000\u0000\u0744\u0742\u0001\u0000\u0000\u0000\u0744\u0745\u0001\u0000"+
		"\u0000\u0000\u0745\u0747\u0001\u0000\u0000\u0000\u0746\u0744\u0001\u0000"+
		"\u0000\u0000\u0747\u0748\u0003\u0012\t\u0000\u0748\u0749\u0005\u000f\u0000"+
		"\u0000\u0749\u0123\u0001\u0000\u0000\u0000\u074a\u074b\u0005\u00b5\u0000"+
		"\u0000\u074b\u074f\u0005\u000e\u0000\u0000\u074c\u074e\u0003\u0122\u0091"+
		"\u0000\u074d\u074c\u0001\u0000\u0000\u0000\u074e\u0751\u0001\u0000\u0000"+
		"\u0000\u074f\u074d\u0001\u0000\u0000\u0000\u074f\u0750\u0001\u0000\u0000"+
		"\u0000\u0750\u0752\u0001\u0000\u0000\u0000\u0751\u074f\u0001\u0000\u0000"+
		"\u0000\u0752\u0753\u0005\u000f\u0000\u0000\u0753\u0125\u0001\u0000\u0000"+
		"\u0000\u0754\u0755\u0005\u00c1\u0000\u0000\u0755\u0756\u0005\u000e\u0000"+
		"\u0000\u0756\u0757\u0003\u011a\u008d\u0000\u0757\u075e\u0003\u011c\u008e"+
		"\u0000\u0758\u0759\u0005\u00b6\u0000\u0000\u0759\u075d\u0007\u0003\u0000"+
		"\u0000\u075a\u075b\u0005\u00b7\u0000\u0000\u075b\u075d\u0005\n\u0000\u0000"+
		"\u075c\u0758\u0001\u0000\u0000\u0000\u075c\u075a\u0001\u0000\u0000\u0000"+
		"\u075d\u0760\u0001\u0000\u0000\u0000\u075e\u075c\u0001\u0000\u0000\u0000"+
		"\u075e\u075f\u0001\u0000\u0000\u0000\u075f\u0761\u0001\u0000\u0000\u0000"+
		"\u0760\u075e\u0001\u0000\u0000\u0000\u0761\u0762\u0003\u0120\u0090\u0000"+
		"\u0762\u0763\u0003\u0124\u0092\u0000\u0763\u0127\u0001\u0000\u0000\u0000"+
		"\u0764\u0765\u0005\u00c1\u0000\u0000\u0765\u0766\u0005\u000e\u0000\u0000"+
		"\u0766\u076b\u0003\u012a\u0095\u0000\u0767\u076a\u0003@ \u0000\u0768\u076a"+
		"\u0003B!\u0000\u0769\u0767\u0001\u0000\u0000\u0000\u0769\u0768\u0001\u0000"+
		"\u0000\u0000\u076a\u076d\u0001\u0000\u0000\u0000\u076b\u0769\u0001\u0000"+
		"\u0000\u0000\u076b\u076c\u0001\u0000\u0000\u0000\u076c\u076e\u0001\u0000"+
		"\u0000\u0000\u076d\u076b\u0001\u0000\u0000\u0000\u076e\u076f\u0003\u0010"+
		"\b\u0000\u076f\u0770\u0003\u0012\t\u0000\u0770\u0771\u0005\u000f\u0000"+
		"\u0000\u0771\u0129\u0001\u0000\u0000\u0000\u0772\u0773\u0005\u0094\u0000"+
		"\u0000\u0773\u0774\u0005\u0006\u0000\u0000\u0774\u012b\u0001\u0000\u0000"+
		"\u0000\u0775\u0776\u0005\u00c1\u0000\u0000\u0776\u0780\u0005\u000e\u0000"+
		"\u0000\u0777\u077f\u0003\u012e\u0097\u0000\u0778\u077f\u0003\u0130\u0098"+
		"\u0000\u0779\u077f\u0003x<\u0000\u077a\u077f\u0003\u0132\u0099\u0000\u077b"+
		"\u077f\u0003\u0134\u009a\u0000\u077c\u077f\u0003\u0136\u009b\u0000\u077d"+
		"\u077f\u0003\u0138\u009c\u0000\u077e\u0777\u0001\u0000\u0000\u0000\u077e"+
		"\u0778\u0001\u0000\u0000\u0000\u077e\u0779\u0001\u0000\u0000\u0000\u077e"+
		"\u077a\u0001\u0000\u0000\u0000\u077e\u077b\u0001\u0000\u0000\u0000\u077e"+
		"\u077c\u0001\u0000\u0000\u0000\u077e\u077d\u0001\u0000\u0000\u0000\u077f"+
		"\u0782\u0001\u0000\u0000\u0000\u0780\u077e\u0001\u0000\u0000\u0000\u0780"+
		"\u0781\u0001\u0000\u0000\u0000\u0781\u0783\u0001\u0000\u0000\u0000\u0782"+
		"\u0780\u0001\u0000\u0000\u0000\u0783\u0784\u0005\u000f\u0000\u0000\u0784"+
		"\u012d\u0001\u0000\u0000\u0000\u0785\u0786\u0005\u00b8\u0000\u0000\u0786"+
		"\u0787\u0005\b\u0000\u0000\u0787\u012f\u0001\u0000\u0000\u0000\u0788\u0789"+
		"\u0005\u00b9\u0000\u0000\u0789\u078a\u0007\u0003\u0000\u0000\u078a\u0131"+
		"\u0001\u0000\u0000\u0000\u078b\u078c\u0005\u00ba\u0000\u0000\u078c\u078d"+
		"\u0007\u0003\u0000\u0000\u078d\u0133\u0001\u0000\u0000\u0000\u078e\u078f"+
		"\u0005\u00bb\u0000\u0000\u078f\u0793\u0005\u000e\u0000\u0000\u0790\u0792"+
		"\u0003d2\u0000\u0791\u0790\u0001\u0000\u0000\u0000\u0792\u0795\u0001\u0000"+
		"\u0000\u0000\u0793\u0791\u0001\u0000\u0000\u0000\u0793\u0794\u0001\u0000"+
		"\u0000\u0000\u0794\u0796\u0001\u0000\u0000\u0000\u0795\u0793\u0001\u0000"+
		"\u0000\u0000\u0796\u0797\u0005\u000f\u0000\u0000\u0797\u0135\u0001\u0000"+
		"\u0000\u0000\u0798\u0799\u0005\u001c\u0000\u0000\u0799\u079d\u0005\u000e"+
		"\u0000\u0000\u079a\u079c\u0003d2\u0000\u079b\u079a\u0001\u0000\u0000\u0000"+
		"\u079c\u079f\u0001\u0000\u0000\u0000\u079d\u079b\u0001\u0000\u0000\u0000"+
		"\u079d\u079e\u0001\u0000\u0000\u0000\u079e\u07a0\u0001\u0000\u0000\u0000"+
		"\u079f\u079d\u0001\u0000\u0000\u0000\u07a0\u07a1\u0005\u000f\u0000\u0000"+
		"\u07a1\u0137\u0001\u0000\u0000\u0000\u07a2\u07a3\u0005\u00c1\u0000\u0000"+
		"\u07a3\u07ae\u0005\u000e\u0000\u0000\u07a4\u07ad\u0003\u013a\u009d\u0000"+
		"\u07a5\u07ad\u0003\u013c\u009e\u0000\u07a6\u07ad\u0003\u013e\u009f\u0000"+
		"\u07a7\u07ad\u0003\u0140\u00a0\u0000\u07a8\u07ad\u0003\u0142\u00a1\u0000"+
		"\u07a9\u07ad\u0003\u0006\u0003\u0000\u07aa\u07ad\u0003\n\u0005\u0000\u07ab"+
		"\u07ad\u0003\u0144\u00a2\u0000\u07ac\u07a4\u0001\u0000\u0000\u0000\u07ac"+
		"\u07a5\u0001\u0000\u0000\u0000\u07ac\u07a6\u0001\u0000\u0000\u0000\u07ac"+
		"\u07a7\u0001\u0000\u0000\u0000\u07ac\u07a8\u0001\u0000\u0000\u0000\u07ac"+
		"\u07a9\u0001\u0000\u0000\u0000\u07ac\u07aa\u0001\u0000\u0000\u0000\u07ac"+
		"\u07ab\u0001\u0000\u0000\u0000\u07ad\u07b0\u0001\u0000\u0000\u0000\u07ae"+
		"\u07ac\u0001\u0000\u0000\u0000\u07ae\u07af\u0001\u0000\u0000\u0000\u07af"+
		"\u07b1\u0001\u0000\u0000\u0000\u07b0\u07ae\u0001\u0000\u0000\u0000\u07b1"+
		"\u07b2\u0005\u000f\u0000\u0000\u07b2\u0139\u0001\u0000\u0000\u0000\u07b3"+
		"\u07b4\u0005\u00bc\u0000\u0000\u07b4\u07b5\u0005\u00c1\u0000\u0000\u07b5"+
		"\u013b\u0001\u0000\u0000\u0000\u07b6\u07b7\u0005\u00bd\u0000\u0000\u07b7"+
		"\u07b8\u0005\b\u0000\u0000\u07b8\u013d\u0001\u0000\u0000\u0000\u07b9\u07ba"+
		"\u0005\u00be\u0000\u0000\u07ba\u07bb\u0005\t\u0000\u0000\u07bb\u013f\u0001"+
		"\u0000\u0000\u0000\u07bc\u07bd\u0005\u00bf\u0000\u0000\u07bd\u07c1\u0005"+
		"\u000e\u0000\u0000\u07be\u07c0\u0005\u00c1\u0000\u0000\u07bf\u07be\u0001"+
		"\u0000\u0000\u0000\u07c0\u07c3\u0001\u0000\u0000\u0000\u07c1\u07bf\u0001"+
		"\u0000\u0000\u0000\u07c1\u07c2\u0001\u0000\u0000\u0000\u07c2\u07c4\u0001"+
		"\u0000\u0000\u0000\u07c3\u07c1\u0001\u0000\u0000\u0000\u07c4\u07c5\u0005"+
		"\u000f\u0000\u0000\u07c5\u0141\u0001\u0000\u0000\u0000\u07c6\u07c7\u0005"+
		"\u00c0\u0000\u0000\u07c7\u07cb\u0005\u000e\u0000\u0000\u07c8\u07ca\u0003"+
		"d2\u0000\u07c9\u07c8\u0001\u0000\u0000\u0000\u07ca\u07cd\u0001\u0000\u0000"+
		"\u0000\u07cb\u07c9\u0001\u0000\u0000\u0000\u07cb\u07cc\u0001\u0000\u0000"+
		"\u0000\u07cc\u07ce\u0001\u0000\u0000\u0000\u07cd\u07cb\u0001\u0000\u0000"+
		"\u0000\u07ce\u07cf\u0005\u000f\u0000\u0000\u07cf\u0143\u0001\u0000\u0000"+
		"\u0000\u07d0\u07d1\u0005\\\u0000\u0000\u07d1\u07d2\u0005\u000e\u0000\u0000"+
		"\u07d2\u07d3\u0003\"\u0011\u0000\u07d3\u07d4\u0005\u000f\u0000\u0000\u07d4"+
		"\u0145\u0001\u0000\u0000\u0000\u00b7\u0149\u014f\u0155\u015b\u0161\u0167"+
		"\u016d\u0173\u0179\u017f\u0185\u018b\u0191\u0197\u019d\u01a3\u01a9\u01af"+
		"\u01b5\u01b8\u01bd\u01bf\u01c6\u01cd\u01d7\u01e1\u01eb\u01f5\u01ff\u0205"+
		"\u0210\u021a\u0224\u0226\u022f\u0234\u0239\u0242\u0246\u025b\u0267\u0269"+
		"\u0283\u028d\u0298\u02a3\u02a9\u02ab\u02b4\u02bf\u02c1\u02cb\u02d0\u02ef"+
		"\u0316\u032b\u0337\u0343\u034f\u035b\u0367\u0373\u0384\u0398\u039f\u03a1"+
		"\u03ad\u03af\u03b8\u03ba\u03c7\u03e0\u03ea\u03f4\u040f\u0428\u0432\u0434"+
		"\u043e\u0449\u044b\u0455\u0457\u0462\u046b\u046f\u0471\u047b\u0483\u0485"+
		"\u048a\u0495\u04a1\u04b0\u04b2\u04bc\u04c1\u04c6\u04d9\u04df\u04e7\u04f1"+
		"\u04fb\u0507\u0509\u0513\u0515\u0524\u0529\u052e\u0533\u053c\u0547\u0556"+
		"\u055b\u0560\u0563\u0565\u056d\u0577\u0581\u058d\u0593\u059b\u059f\u05a1"+
		"\u05b0\u05b6\u05c2\u05c4\u05d8\u05da\u05de\u05e8\u05ef\u05f9\u0603\u060e"+
		"\u0610\u0631\u0648\u064d\u0650\u0653\u0656\u0659\u065c\u065f\u0664\u066e"+
		"\u0678\u0682\u069c\u06b0\u06b2\u06c0\u06c7\u06ce\u06d5\u06e1\u06ec\u06f7"+
		"\u0702\u0704\u0723\u072c\u072e\u0738\u0742\u0744\u074f\u075c\u075e\u0769"+
		"\u076b\u077e\u0780\u0793\u079d\u07ac\u07ae\u07c1\u07cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}