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
		DATE=11, MONTHS=12, DAYS=13, LPAR=14, RPAR=15, LE=16, EQUALS=17, PLUS=18, 
		MINUS=19, COMMA=20, DOT=21, WHITESPACE=22, SINGLE_LINE_COMMENT=23, EQUALS_SKIP=24, 
		IF=25, ELSE=26, ELSE_IF=27, LIMIT=28, WHILE=29, SKILL_SACLED_MOD=30, POTENTIAL=31, 
		TRIGGER=32, EFFECT=33, ALLOW=34, CALC_TRUE_IF=35, AMOUNT=36, DATE_KEY=37, 
		NAME=38, NAMES=39, COST=40, TIME=41, IS_TIRGGERED_ONLY=42, PREREQUISITES=43, 
		PREREQUISITES_SELF=44, NO_OPINION_HIT=45, COLOR=46, CHECK_VARIABLE=47, 
		SUBTRACKT_VARIABLE=48, CHANGE_VARIABLE=49, SET_VARIABLE=50, DIVIDE_VARIABLE=51, 
		MULTIPLY_VARIABLE=52, EXPORT_TO_VARIABLE=53, WHICH=54, VALUE=55, WHO=56, 
		RULER_ALLOW=57, HEIR_ALLOW=58, CONSORT_ALLOW=59, WAR_PRIORITY=60, ON_BUILT=61, 
		ON_DESTORYED=62, ON_CONSTRUCTION_STARTED=63, ON_CONSTRUCTION_CANCELED=64, 
		ON_OBSOLETE=65, KEEP_TRIGGER=66, BUILD_TRIGGER=67, TRADE_SHARE=68, PRIVATEER_POWER=69, 
		SHARE=70, HIDDEN_EFFECT=71, HAS_OPINION_MODIFIER=72, REMOVE_OPINION=73, 
		REVERSE_REMOVE_OPINION=74, ADD_OPINION=75, REVERSE_ADD_OPINION=76, REMOVED_EFFECT=77, 
		SAME_FAITH_MODIFIER=78, TOOLTIP=79, CUSTOM_TOOLTIP=80, DESC=81, CUSTOM_TRIGGER_TOOLTIP=82, 
		NUM_OF_OWNED_PROVINCES_WITH=83, Has_GLOBAL_MODIFIER_VALUE=84, IS_IN_WAR=85, 
		HAS_OPINION=86, COUNTRY_EVENT=87, ID=88, SCOPE=89, ADD_PROVINCE_MOD=90, 
		ADD_COUNTRY_MOD=91, DURATION=92, AI=93, MODIFIER=94, CHANCE=95, AI_WILL_DO=96, 
		FACTOR=97, AI_WEIGHT=98, AI_PICK_ANCESTOR=99, AI_PEACE_DESIRE=100, ATTACKER_LEADER=101, 
		DEFENDER_LEADER=102, CASUS_BELLI=103, DEFENDERS=104, ATTACKERS=105, PARTICIPANTS=106, 
		WAR_SCORE=107, START_DATE=108, WAR_GOAL_PROVINCE=109, CONDITIONAL=110, 
		PRE_EFFECT=111, RANGE_TO=112, RANGE_FROM=113, CATEGORY=114, LEVEL_COST=115, 
		ENABLED=116, MAX_LEVEL=117, NUM_SYMBOLS=118, FLAG_COLOR=119, TEXTURES=120, 
		TEXTURE=121, FILE=122, SIZE=123, NOOFFRAMES=124, X=125, Y=126, MALE_NAMES=127, 
		FEMALE_NAMES=128, DYNASTY_NAMES=129, PRIMARY=130, COLOR1=131, COLOR2=132, 
		COLOR3=133, GRAPHICAL_CULTURE=134, REVOLUTIONARY_COLORS=135, HISTORICAL_IDEA_GROUPS=136, 
		HISTORICAL_UNITS=137, MONARCH_NAMES=138, LEADER_NAMES=139, SHIP_NAMES=140, 
		ARMY_NAMES=141, FLEET_NAMES=142, TAX_INCOME=143, NATIVE_SIZE=144, NATIVE_FEROCITY=145, 
		NATIVE_HOSTILENESS=146, TRADE_GOODS=147, CULTURE=148, RELIGION=149, PROVINCES=150, 
		REGION=151, IS_BLESSING=152, SPRITE=153, MONARCH_POWER=154, LEVEL=155, 
		DEVELOPMENT=156, INLAND=157, COASTAL=158, TYPE=159, PROVINCE_MODIFIER=160, 
		STATE_MODIFIER=161, GLOBAL_MODIFIER=162, WAR_GOAL=163, IS_VALID_FOR_SUBJECT=164, 
		ATTACKER_DISABLED_PO=165, HOLY_WAR=166, EXCLUSIVE=167, INDEPENDENCE=168, 
		COALITION=169, SUPPORT_REBELS=170, CALL_EMPIRE_MEMBERS=171, LEAGUE=172, 
		ALLOWED_IN_GOLD_PROVINCES=173, INFLUENCING_FORT=174, ONMAP=175, MAKE_OBSOLETE=176, 
		MANUFACTORY=177, BONUS_MANUFACTORY=178, BONUS_MODIFIER=179, SHOW_SEPERATE=180, 
		BOOKMARK=181, DEFAULT=182, CENTER=183, EASY_COUNTRY=184, COUNTRY=185, 
		PROVINCE=186, START=187, CAN_START=188, OBJECTIVES=189, ABILITIES=190, 
		RELIGIOUS_CONFLICTS=191, PAPACY=192, SLOT=193, GENERIC=194, HAS_COUNTRY_SHIELD=195, 
		POTENTIAL_ON_LOAD=196, ICON=197, POSITION=198, COMPLETED_BY=199, REQUIRED_MISSIONS=200, 
		PROVINCES_TO_HIGHLIGHT=201, IDENTIFIER=202, STRING_TOOLTIP=203;
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
		RULE_trigger_sub_block = 67, RULE_pre_effect = 68, RULE_conditional_block = 69, 
		RULE_diplomatic_action = 70, RULE_dof_defines = 71, RULE_defender_of_faith = 72, 
		RULE_decree_blocks = 73, RULE_decree = 74, RULE_custom_idea_category = 75, 
		RULE_custom_idea_level = 76, RULE_enabled_block = 77, RULE_custom_idea = 78, 
		RULE_flag_color = 79, RULE_texture_block = 80, RULE_custom_country_color = 81, 
		RULE_culture_modifier_block = 82, RULE_culture_names = 83, RULE_culture_group = 84, 
		RULE_culture = 85, RULE_country_tags = 86, RULE_country_color = 87, RULE_common_countires_block = 88, 
		RULE_monarch_names = 89, RULE_common_country = 90, RULE_trade_goods_block = 91, 
		RULE_culture_block = 92, RULE_religion_block = 93, RULE_col_simple_attr = 94, 
		RULE_col_region_attr = 95, RULE_colonial_region = 96, RULE_tooltip = 97, 
		RULE_custom_tooltip = 98, RULE_custom_trigger_tooltip = 99, RULE_desc = 100, 
		RULE_client_state = 101, RULE_is_blessing = 102, RULE_sprite = 103, RULE_church_aspect = 104, 
		RULE_level = 105, RULE_development = 106, RULE_cot_type = 107, RULE_cot_optionals = 108, 
		RULE_province_modifier = 109, RULE_global_modifier = 110, RULE_state_modifier = 111, 
		RULE_center_of_trade = 112, RULE_league = 113, RULE_call_empire_members = 114, 
		RULE_ai_peace_desire = 115, RULE_support_rebels = 116, RULE_coalition = 117, 
		RULE_independence = 118, RULE_exclusive = 119, RULE_holy_war = 120, RULE_attacker_disabled_po = 121, 
		RULE_is_valid_for_subject = 122, RULE_war_goal = 123, RULE_no_opinion_hit = 124, 
		RULE_cb_optionals = 125, RULE_cb_type = 126, RULE_buildings_trigger = 127, 
		RULE_buildings_effect = 128, RULE_manufactory_defines = 129, RULE_bonus_modifier = 130, 
		RULE_cost = 131, RULE_time = 132, RULE_onmap = 133, RULE_show_seperate = 134, 
		RULE_building_attribute = 135, RULE_allowed_in_gold_province = 136, RULE_make_obsolete = 137, 
		RULE_influencing_fort = 138, RULE_building = 139, RULE_bookmark = 140, 
		RULE_ancestor_personality = 141, RULE_war_priority = 142, RULE_ai_pick_ancestor = 143, 
		RULE_ai_personality = 144, RULE_start = 145, RULE_can_start_block = 146, 
		RULE_objective = 147, RULE_objectives_block = 148, RULE_ability = 149, 
		RULE_ability_block = 150, RULE_age = 151, RULE_advisor = 152, RULE_monarch_power_advisor = 153, 
		RULE_missionSeries = 154, RULE_slot_missionSeries = 155, RULE_generic_missionSeries = 156, 
		RULE_hasCountryShield_missionSeries = 157, RULE_potentialOnLoad_missionSeries = 158, 
		RULE_potential_missionSeries = 159, RULE_missionBlock = 160, RULE_icon_mission = 161, 
		RULE_position_mission = 162, RULE_completedBy_mission = 163, RULE_requiredMissions_mission = 164, 
		RULE_provincesToHighlight_mission = 165, RULE_aiWeight_mission = 166;
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
			"has_opinion", "trigger_sub_block", "pre_effect", "conditional_block", 
			"diplomatic_action", "dof_defines", "defender_of_faith", "decree_blocks", 
			"decree", "custom_idea_category", "custom_idea_level", "enabled_block", 
			"custom_idea", "flag_color", "texture_block", "custom_country_color", 
			"culture_modifier_block", "culture_names", "culture_group", "culture", 
			"country_tags", "country_color", "common_countires_block", "monarch_names", 
			"common_country", "trade_goods_block", "culture_block", "religion_block", 
			"col_simple_attr", "col_region_attr", "colonial_region", "tooltip", "custom_tooltip", 
			"custom_trigger_tooltip", "desc", "client_state", "is_blessing", "sprite", 
			"church_aspect", "level", "development", "cot_type", "cot_optionals", 
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
			null, "'months'", "'days'", "'{'", "'}'", null, "'='", "'+'", "'-'", 
			"','", "'.'", null, null, null, "'if'", "'else'", "'else_if'", "'limit'", 
			"'while'", "'skill_scaled_modifier'", "'potential'", "'trigger'", "'effect'", 
			"'allow'", "'calc_true_if'", "'amount'", "'date'", "'name'", "'names'", 
			"'cost'", "'time'", "'is_triggered_only'", "'prerequisites'", "'prerequisites_self'", 
			"'no_opinion_hit'", "'color'", "'check_variable'", "'subtract_variable'", 
			"'change_variable'", "'set_variable'", "'divide_variable'", "'multiply_variable'", 
			"'export_to_variable'", "'which'", "'value'", "'who'", "'ruler_allow'", 
			"'heir_allow'", "'consort_allow'", "'war_priority'", "'on_built'", "'on_destroyed'", 
			"'on_construction_started'", "'on_construction_canceled'", "'on_obsolete'", 
			"'keep_trigger'", "'build_trigger'", "'trade_share'", "'privateer_power'", 
			"'share'", "'hidden_effect'", "'has_opinion_modifier'", "'remove_opinion'", 
			"'reverse_remove_opinion'", "'add_opinion'", "'reverse_add_opinion'", 
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
			"'region'", "'is_blessing'", "'sprite'", "'monarch_power'", "'level'", 
			"'development'", "'inland'", "'coastal'", "'type'", "'province_modifiers'", 
			"'state_modifiers'", "'global_modifiers'", "'war_goal'", "'valid_for_subject'", 
			"'attacker_disabled_po'", "'holy_war'", "'exclusive'", "'independence'", 
			"'coalition'", "'support_rebels'", "'call_empire_members'", "'league'", 
			"'allow_in_gold_provinces'", "'influencing_fort'", "'onmap'", "'make_obsolete'", 
			"'manufactory'", "'bonus_manufactory'", "'bonus_modifier'", "'show_separate'", 
			"'bookmark'", "'default'", "'center'", "'easy_country'", "'country'", 
			"'province'", "'start'", "'can_start'", "'objectives'", "'abilities'", 
			"'religious_conflicts'", "'papacy'", "'slot'", "'generic'", "'has_country_shield'", 
			"'potential_on_load'", "'icon'", "'position'", "'completed_by'", "'required_missions'", 
			"'provinces_to_highlight'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "YES", "NO", "NOT", "MPOWER", "TAG", "INT", "STRING", 
			"FLOAT", "DATE", "MONTHS", "DAYS", "LPAR", "RPAR", "LE", "EQUALS", "PLUS", 
			"MINUS", "COMMA", "DOT", "WHITESPACE", "SINGLE_LINE_COMMENT", "EQUALS_SKIP", 
			"IF", "ELSE", "ELSE_IF", "LIMIT", "WHILE", "SKILL_SACLED_MOD", "POTENTIAL", 
			"TRIGGER", "EFFECT", "ALLOW", "CALC_TRUE_IF", "AMOUNT", "DATE_KEY", "NAME", 
			"NAMES", "COST", "TIME", "IS_TIRGGERED_ONLY", "PREREQUISITES", "PREREQUISITES_SELF", 
			"NO_OPINION_HIT", "COLOR", "CHECK_VARIABLE", "SUBTRACKT_VARIABLE", "CHANGE_VARIABLE", 
			"SET_VARIABLE", "DIVIDE_VARIABLE", "MULTIPLY_VARIABLE", "EXPORT_TO_VARIABLE", 
			"WHICH", "VALUE", "WHO", "RULER_ALLOW", "HEIR_ALLOW", "CONSORT_ALLOW", 
			"WAR_PRIORITY", "ON_BUILT", "ON_DESTORYED", "ON_CONSTRUCTION_STARTED", 
			"ON_CONSTRUCTION_CANCELED", "ON_OBSOLETE", "KEEP_TRIGGER", "BUILD_TRIGGER", 
			"TRADE_SHARE", "PRIVATEER_POWER", "SHARE", "HIDDEN_EFFECT", "HAS_OPINION_MODIFIER", 
			"REMOVE_OPINION", "REVERSE_REMOVE_OPINION", "ADD_OPINION", "REVERSE_ADD_OPINION", 
			"REMOVED_EFFECT", "SAME_FAITH_MODIFIER", "TOOLTIP", "CUSTOM_TOOLTIP", 
			"DESC", "CUSTOM_TRIGGER_TOOLTIP", "NUM_OF_OWNED_PROVINCES_WITH", "Has_GLOBAL_MODIFIER_VALUE", 
			"IS_IN_WAR", "HAS_OPINION", "COUNTRY_EVENT", "ID", "SCOPE", "ADD_PROVINCE_MOD", 
			"ADD_COUNTRY_MOD", "DURATION", "AI", "MODIFIER", "CHANCE", "AI_WILL_DO", 
			"FACTOR", "AI_WEIGHT", "AI_PICK_ANCESTOR", "AI_PEACE_DESIRE", "ATTACKER_LEADER", 
			"DEFENDER_LEADER", "CASUS_BELLI", "DEFENDERS", "ATTACKERS", "PARTICIPANTS", 
			"WAR_SCORE", "START_DATE", "WAR_GOAL_PROVINCE", "CONDITIONAL", "PRE_EFFECT", 
			"RANGE_TO", "RANGE_FROM", "CATEGORY", "LEVEL_COST", "ENABLED", "MAX_LEVEL", 
			"NUM_SYMBOLS", "FLAG_COLOR", "TEXTURES", "TEXTURE", "FILE", "SIZE", "NOOFFRAMES", 
			"X", "Y", "MALE_NAMES", "FEMALE_NAMES", "DYNASTY_NAMES", "PRIMARY", "COLOR1", 
			"COLOR2", "COLOR3", "GRAPHICAL_CULTURE", "REVOLUTIONARY_COLORS", "HISTORICAL_IDEA_GROUPS", 
			"HISTORICAL_UNITS", "MONARCH_NAMES", "LEADER_NAMES", "SHIP_NAMES", "ARMY_NAMES", 
			"FLEET_NAMES", "TAX_INCOME", "NATIVE_SIZE", "NATIVE_FEROCITY", "NATIVE_HOSTILENESS", 
			"TRADE_GOODS", "CULTURE", "RELIGION", "PROVINCES", "REGION", "IS_BLESSING", 
			"SPRITE", "MONARCH_POWER", "LEVEL", "DEVELOPMENT", "INLAND", "COASTAL", 
			"TYPE", "PROVINCE_MODIFIER", "STATE_MODIFIER", "GLOBAL_MODIFIER", "WAR_GOAL", 
			"IS_VALID_FOR_SUBJECT", "ATTACKER_DISABLED_PO", "HOLY_WAR", "EXCLUSIVE", 
			"INDEPENDENCE", "COALITION", "SUPPORT_REBELS", "CALL_EMPIRE_MEMBERS", 
			"LEAGUE", "ALLOWED_IN_GOLD_PROVINCES", "INFLUENCING_FORT", "ONMAP", "MAKE_OBSOLETE", 
			"MANUFACTORY", "BONUS_MANUFACTORY", "BONUS_MODIFIER", "SHOW_SEPERATE", 
			"BOOKMARK", "DEFAULT", "CENTER", "EASY_COUNTRY", "COUNTRY", "PROVINCE", 
			"START", "CAN_START", "OBJECTIVES", "ABILITIES", "RELIGIOUS_CONFLICTS", 
			"PAPACY", "SLOT", "GENERIC", "HAS_COUNTRY_SHIELD", "POTENTIAL_ON_LOAD", 
			"ICON", "POSITION", "COMPLETED_BY", "REQUIRED_MISSIONS", "PROVINCES_TO_HIGHLIGHT", 
			"IDENTIFIER", "STRING_TOOLTIP"
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
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(334);
					advisor();
					}
					}
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(340);
					age();
					}
					}
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(346);
					ai_personality();
					}
					}
					setState(351);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(352);
					ancestor_personality();
					}
					}
					setState(357);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BOOKMARK) {
					{
					{
					setState(358);
					bookmark();
					}
					}
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(364);
					building();
					}
					}
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(370);
					cb_type();
					}
					}
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(376);
					center_of_trade();
					}
					}
					setState(381);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(382);
					church_aspect();
					}
					}
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(388);
					colonial_region();
					}
					}
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLOR || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & 511L) != 0)) {
					{
					{
					setState(394);
					common_country();
					}
					}
					setState(399);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG) {
					{
					{
					setState(400);
					country_color();
					}
					}
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG) {
					{
					{
					setState(406);
					country_tags();
					}
					}
					setState(411);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(412);
					culture_group();
					}
					}
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NUM_SYMBOLS) {
					{
					{
					setState(418);
					custom_country_color();
					}
					}
					setState(423);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(424);
					custom_idea_category();
					}
					}
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(430);
					decree();
					}
					}
					setState(435);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(436);
					defender_of_faith();
					}
					}
					setState(441);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(442);
					diplomatic_action();
					}
					}
					setState(447);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(LPAR);
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17732924103213184L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1901117L) != 0) || _la==IDENTIFIER) {
				{
				setState(453);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(451);
					statement();
					}
					break;
				case 2:
					{
					setState(452);
					if_statement();
					}
					break;
				}
				}
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(458);
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
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
				setState(460);
				effect();
				}
				break;
			case LPAR:
				{
				setState(461);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Trigger_blockContext trigger_block() throws RecognitionException {
		Trigger_blockContext _localctx = new Trigger_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_trigger_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(TRIGGER);
			setState(465);
			match(LE);
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140771881648358L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 36159507L) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 9007199254740997L) != 0)) {
				{
				{
				setState(466);
				trigger();
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(472);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Potential_blockContext potential_block() throws RecognitionException {
		Potential_blockContext _localctx = new Potential_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_potential_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(POTENTIAL);
			setState(475);
			match(LE);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140771881648358L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 36159507L) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 9007199254740997L) != 0)) {
				{
				{
				setState(476);
				trigger();
				}
				}
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(482);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Effect_blockContext effect_block() throws RecognitionException {
		Effect_blockContext _localctx = new Effect_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_effect_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(EFFECT);
			setState(485);
			match(LE);
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17732924103196800L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1901117L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(486);
				effect();
				}
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(492);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Removed_effect_blockContext removed_effect_block() throws RecognitionException {
		Removed_effect_blockContext _localctx = new Removed_effect_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_removed_effect_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(REMOVED_EFFECT);
			setState(495);
			match(LE);
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17732924103196800L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1901117L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(496);
				effect();
				}
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(502);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Modifier_blockContext modifier_block() throws RecognitionException {
		Modifier_blockContext _localctx = new Modifier_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_modifier_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(MODIFIER);
			setState(505);
			match(LE);
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(506);
				modifier();
				}
				}
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(512);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Chance_blockContext chance_block() throws RecognitionException {
		Chance_blockContext _localctx = new Chance_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_chance_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(CHANCE);
			setState(515);
			match(LE);
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FACTOR) {
				{
				{
				setState(516);
				factor();
				}
				}
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(522);
				chance_modifier();
				}
				}
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(528);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Ai_will_do_blockContext ai_will_do_block() throws RecognitionException {
		Ai_will_do_blockContext _localctx = new Ai_will_do_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ai_will_do_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(AI_WILL_DO);
			setState(531);
			match(LE);
			setState(532);
			factor();
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(533);
				chance_modifier();
				}
				}
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(539);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final AllowContext allow() throws RecognitionException {
		AllowContext _localctx = new AllowContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_allow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(ALLOW);
			setState(542);
			match(LE);
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140771881648358L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 36159507L) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 9007199254740997L) != 0)) {
				{
				{
				setState(543);
				trigger();
				}
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(549);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
		public List<TerminalNode> STRING() { return getTokens(EU4GrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(EU4GrammarParser.STRING, i);
		}
		public Name_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_block; }
	}

	public final Name_blockContext name_block() throws RecognitionException {
		Name_blockContext _localctx = new Name_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_name_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==NAMES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(552);
			match(LE);
			setState(557); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(557);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NAME:
					{
					{
					setState(553);
					match(NAME);
					setState(554);
					match(EQUALS);
					setState(555);
					match(STRING);
					}
					}
					break;
				case TRIGGER:
					{
					setState(556);
					trigger_block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(559); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TRIGGER || _la==NAME );
			setState(561);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public Color_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color_block; }
	}

	public final Color_blockContext color_block() throws RecognitionException {
		Color_blockContext _localctx = new Color_blockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_color_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(COLOR);
			setState(564);
			match(LE);
			setState(566); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(565);
					match(INT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(568); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(571); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(570);
					match(INT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(573); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(576); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(575);
				match(INT);
				}
				}
				setState(578); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT );
			setState(580);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public Provinces_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_provinces_block; }
	}

	public final Provinces_blockContext provinces_block() throws RecognitionException {
		Provinces_blockContext _localctx = new Provinces_blockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_provinces_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(PROVINCES);
			setState(583);
			match(LE);
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(585); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(584);
						match(INT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(587); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(594);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public File_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_block; }
	}

	public final File_blockContext file_block() throws RecognitionException {
		File_blockContext _localctx = new File_blockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_file_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(FILE);
			setState(597);
			match(EQUALS);
			setState(598);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public TerminalNode X() { return getToken(EU4GrammarParser.X, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
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
	}

	public final Size_blockContext size_block() throws RecognitionException {
		Size_blockContext _localctx = new Size_blockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_size_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(SIZE);
			setState(601);
			match(LE);
			setState(602);
			match(X);
			setState(603);
			match(EQUALS);
			setState(604);
			match(INT);
			setState(605);
			match(Y);
			setState(606);
			match(EQUALS);
			setState(607);
			match(INT);
			setState(608);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Allow_blockContext allow_block() throws RecognitionException {
		Allow_blockContext _localctx = new Allow_blockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_allow_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(ALLOW);
			setState(611);
			match(LE);
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140771881648358L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 36159507L) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 9007199254740997L) != 0)) {
				{
				{
				setState(612);
				trigger();
				}
				}
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(618);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(EU4GrammarParser.FLOAT, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			match(FACTOR);
			setState(621);
			match(EQUALS);
			setState(622);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Chance_modifierContext chance_modifier() throws RecognitionException {
		Chance_modifierContext _localctx = new Chance_modifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_chance_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(MODIFIER);
			setState(625);
			match(LE);
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140771881648358L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 573030419L) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 9007199254740997L) != 0)) {
				{
				setState(628);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FACTOR:
					{
					setState(626);
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
					setState(627);
					trigger();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(633);
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
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public AmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_amount; }
	}

	public final AmountContext amount() throws RecognitionException {
		AmountContext _localctx = new AmountContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_amount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(AMOUNT);
			setState(638);
			match(EQUALS);
			setState(639);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(NAME);
			setState(642);
			match(EQUALS);
			setState(643);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode DATE() { return getToken(EU4GrammarParser.DATE, 0); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(DATE_KEY);
			setState(646);
			match(EQUALS);
			setState(647);
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
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public MonthsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_months; }
	}

	public final MonthsContext months() throws RecognitionException {
		MonthsContext _localctx = new MonthsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_months);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			match(MONTHS);
			setState(652);
			match(EQUALS);
			setState(653);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final LimitContext limit() throws RecognitionException {
		LimitContext _localctx = new LimitContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_limit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(LIMIT);
			setState(656);
			match(LE);
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140771881648358L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 36159507L) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 9007199254740997L) != 0)) {
				{
				{
				setState(657);
				trigger();
				}
				}
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(663);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final ELSEContext eLSE() throws RecognitionException {
		ELSEContext _localctx = new ELSEContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_eLSE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(ELSE);
			setState(666);
			match(LE);
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17732924103196800L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1901117L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(667);
				effect();
				}
				}
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(673);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Else_ifContext else_if() throws RecognitionException {
		Else_ifContext _localctx = new Else_ifContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_else_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(ELSE_IF);
			setState(676);
			match(LE);
			setState(677);
			limit();
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17732924103196800L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1901117L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(678);
				effect();
				}
				}
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(684);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(IF);
			setState(687);
			match(LE);
			setState(688);
			limit();
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17732924103196800L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1901117L) != 0) || _la==IDENTIFIER) {
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
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE || _la==ELSE_IF) {
				{
				setState(698);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(696);
					eLSE();
					}
					break;
				case ELSE_IF:
					{
					setState(697);
					else_if();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(702);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(WHILE);
			setState(704);
			match(LE);
			setState(705);
			limit();
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17732924103196800L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1901117L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(706);
				effect();
				}
				}
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(712);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			_la = _input.LA(1);
			if ( !(_la==TAG || _la==SCOPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(715);
			match(LE);
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17873696219726054L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 49271291L) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 9007199254740997L) != 0)) {
				{
				setState(720);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(716);
					effect();
					}
					break;
				case 2:
					{
					setState(717);
					trigger();
					}
					break;
				case 3:
					{
					setState(718);
					scope();
					}
					break;
				case 4:
					{
					setState(719);
					limit();
					}
					break;
				}
				}
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(725);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ScriptedEffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptedEffect; }
	}

	public final ScriptedEffectContext scriptedEffect() throws RecognitionException {
		ScriptedEffectContext _localctx = new ScriptedEffectContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_scriptedEffect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(IDENTIFIER);
			setState(728);
			match(EQUALS);
			setState(738);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				{
				setState(729);
				match(LPAR);
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17732924103213184L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1901117L) != 0) || _la==IDENTIFIER) {
					{
					{
					setState(730);
					statement();
					}
					}
					setState(735);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(736);
				match(RPAR);
				}
				}
				break;
			case YES:
				{
				setState(737);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(IDENTIFIER);
			setState(741);
			match(EQUALS);
			setState(742);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Skill_scaled_modifierContext skill_scaled_modifier() throws RecognitionException {
		Skill_scaled_modifierContext _localctx = new Skill_scaled_modifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_skill_scaled_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(SKILL_SACLED_MOD);
			setState(745);
			match(LE);
			setState(746);
			trigger_block();
			setState(747);
			modifier_block();
			setState(748);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final EffectContext effect() throws RecognitionException {
		EffectContext _localctx = new EffectContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_effect);
		int _la;
		try {
			setState(771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(750);
				match(IDENTIFIER);
				setState(751);
				match(EQUALS);
				setState(752);
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
				setState(753);
				scriptedEffect();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(754);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(755);
				scope();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(756);
				custom_tooltip();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(757);
				add_modifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(758);
				while_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(759);
				multiply_variable();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(760);
				subtrackt_variable();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(761);
				change_variable();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(762);
				set_variable();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(763);
				divide_variable();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(764);
				export_to_variable();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(765);
				hidden_effect();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(766);
				reverse_remove_opinion();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(767);
				remove_opinion();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(768);
				add_opinion();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(769);
				reverse_add_opinion();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(770);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public TerminalNode WHO() { return getToken(EU4GrammarParser.WHO, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
		public TerminalNode MODIFIER() { return getToken(EU4GrammarParser.MODIFIER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode SCOPE() { return getToken(EU4GrammarParser.SCOPE, 0); }
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public Reverse_remove_opinionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reverse_remove_opinion; }
	}

	public final Reverse_remove_opinionContext reverse_remove_opinion() throws RecognitionException {
		Reverse_remove_opinionContext _localctx = new Reverse_remove_opinionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_reverse_remove_opinion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(REVERSE_REMOVE_OPINION);
			setState(774);
			match(LE);
			setState(775);
			match(WHO);
			setState(776);
			match(EQUALS);
			setState(777);
			_la = _input.LA(1);
			if ( !(_la==TAG || _la==SCOPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(778);
			match(MODIFIER);
			setState(779);
			match(EQUALS);
			setState(780);
			match(IDENTIFIER);
			setState(781);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public TerminalNode WHO() { return getToken(EU4GrammarParser.WHO, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
		public TerminalNode MODIFIER() { return getToken(EU4GrammarParser.MODIFIER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode SCOPE() { return getToken(EU4GrammarParser.SCOPE, 0); }
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public Remove_opinionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remove_opinion; }
	}

	public final Remove_opinionContext remove_opinion() throws RecognitionException {
		Remove_opinionContext _localctx = new Remove_opinionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_remove_opinion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(REMOVE_OPINION);
			setState(784);
			match(LE);
			setState(785);
			match(WHO);
			setState(786);
			match(EQUALS);
			setState(787);
			_la = _input.LA(1);
			if ( !(_la==TAG || _la==SCOPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(788);
			match(MODIFIER);
			setState(789);
			match(EQUALS);
			setState(790);
			match(IDENTIFIER);
			setState(791);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public TerminalNode WHO() { return getToken(EU4GrammarParser.WHO, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
		public TerminalNode MODIFIER() { return getToken(EU4GrammarParser.MODIFIER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode SCOPE() { return getToken(EU4GrammarParser.SCOPE, 0); }
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public Add_opinionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_opinion; }
	}

	public final Add_opinionContext add_opinion() throws RecognitionException {
		Add_opinionContext _localctx = new Add_opinionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_add_opinion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(ADD_OPINION);
			setState(794);
			match(LE);
			setState(795);
			match(WHO);
			setState(796);
			match(EQUALS);
			setState(797);
			_la = _input.LA(1);
			if ( !(_la==TAG || _la==SCOPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(798);
			match(MODIFIER);
			setState(799);
			match(EQUALS);
			setState(800);
			match(IDENTIFIER);
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
	public static class Reverse_add_opinionContext extends ParserRuleContext {
		public TerminalNode REVERSE_ADD_OPINION() { return getToken(EU4GrammarParser.REVERSE_ADD_OPINION, 0); }
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public TerminalNode WHO() { return getToken(EU4GrammarParser.WHO, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
		public TerminalNode MODIFIER() { return getToken(EU4GrammarParser.MODIFIER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode SCOPE() { return getToken(EU4GrammarParser.SCOPE, 0); }
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public Reverse_add_opinionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reverse_add_opinion; }
	}

	public final Reverse_add_opinionContext reverse_add_opinion() throws RecognitionException {
		Reverse_add_opinionContext _localctx = new Reverse_add_opinionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_reverse_add_opinion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(REVERSE_ADD_OPINION);
			setState(804);
			match(LE);
			setState(805);
			match(WHO);
			setState(806);
			match(EQUALS);
			setState(807);
			_la = _input.LA(1);
			if ( !(_la==TAG || _la==SCOPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(808);
			match(MODIFIER);
			setState(809);
			match(EQUALS);
			setState(810);
			match(IDENTIFIER);
			setState(811);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Hidden_effectContext hidden_effect() throws RecognitionException {
		Hidden_effectContext _localctx = new Hidden_effectContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_hidden_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(HIDDEN_EFFECT);
			setState(814);
			match(LE);
			setState(818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17732924103196800L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1901117L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(815);
				effect();
				}
				}
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(821);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public TerminalNode NAME() { return getToken(EU4GrammarParser.NAME, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
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
	}

	public final Add_modifierContext add_modifier() throws RecognitionException {
		Add_modifierContext _localctx = new Add_modifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_add_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			_la = _input.LA(1);
			if ( !(_la==ADD_PROVINCE_MOD || _la==ADD_COUNTRY_MOD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(824);
			match(LE);
			setState(825);
			match(NAME);
			setState(826);
			match(EQUALS);
			setState(827);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(828);
			match(DURATION);
			setState(829);
			match(EQUALS);
			setState(830);
			match(INT);
			setState(831);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public List<TerminalNode> WHICH() { return getTokens(EU4GrammarParser.WHICH); }
		public TerminalNode WHICH(int i) {
			return getToken(EU4GrammarParser.WHICH, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode VALUE() { return getToken(EU4GrammarParser.VALUE, 0); }
		public TerminalNode FLOAT() { return getToken(EU4GrammarParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public Multiply_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply_variable; }
	}

	public final Multiply_variableContext multiply_variable() throws RecognitionException {
		Multiply_variableContext _localctx = new Multiply_variableContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_multiply_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			match(MULTIPLY_VARIABLE);
			setState(834);
			match(LE);
			setState(835);
			match(WHICH);
			setState(836);
			match(EQUALS);
			setState(837);
			match(IDENTIFIER);
			setState(844);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHICH:
				{
				{
				setState(838);
				match(WHICH);
				setState(839);
				match(EQUALS);
				setState(840);
				match(IDENTIFIER);
				}
				}
				break;
			case VALUE:
				{
				{
				setState(841);
				match(VALUE);
				setState(842);
				match(EQUALS);
				setState(843);
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
			default:
				throw new NoViableAltException(this);
			}
			setState(846);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public List<TerminalNode> WHICH() { return getTokens(EU4GrammarParser.WHICH); }
		public TerminalNode WHICH(int i) {
			return getToken(EU4GrammarParser.WHICH, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode VALUE() { return getToken(EU4GrammarParser.VALUE, 0); }
		public TerminalNode FLOAT() { return getToken(EU4GrammarParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public Subtrackt_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtrackt_variable; }
	}

	public final Subtrackt_variableContext subtrackt_variable() throws RecognitionException {
		Subtrackt_variableContext _localctx = new Subtrackt_variableContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_subtrackt_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			match(SUBTRACKT_VARIABLE);
			setState(849);
			match(LE);
			setState(850);
			match(WHICH);
			setState(851);
			match(EQUALS);
			setState(852);
			match(IDENTIFIER);
			setState(859);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHICH:
				{
				{
				setState(853);
				match(WHICH);
				setState(854);
				match(EQUALS);
				setState(855);
				match(IDENTIFIER);
				}
				}
				break;
			case VALUE:
				{
				{
				setState(856);
				match(VALUE);
				setState(857);
				match(EQUALS);
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
			default:
				throw new NoViableAltException(this);
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
	public static class Change_variableContext extends ParserRuleContext {
		public TerminalNode CHANGE_VARIABLE() { return getToken(EU4GrammarParser.CHANGE_VARIABLE, 0); }
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public List<TerminalNode> WHICH() { return getTokens(EU4GrammarParser.WHICH); }
		public TerminalNode WHICH(int i) {
			return getToken(EU4GrammarParser.WHICH, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode VALUE() { return getToken(EU4GrammarParser.VALUE, 0); }
		public TerminalNode FLOAT() { return getToken(EU4GrammarParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public Change_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_change_variable; }
	}

	public final Change_variableContext change_variable() throws RecognitionException {
		Change_variableContext _localctx = new Change_variableContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_change_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			match(CHANGE_VARIABLE);
			setState(864);
			match(LE);
			setState(865);
			match(WHICH);
			setState(866);
			match(EQUALS);
			setState(867);
			match(IDENTIFIER);
			setState(874);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHICH:
				{
				{
				setState(868);
				match(WHICH);
				setState(869);
				match(EQUALS);
				setState(870);
				match(IDENTIFIER);
				}
				}
				break;
			case VALUE:
				{
				{
				setState(871);
				match(VALUE);
				setState(872);
				match(EQUALS);
				setState(873);
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
			default:
				throw new NoViableAltException(this);
			}
			setState(876);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public List<TerminalNode> WHICH() { return getTokens(EU4GrammarParser.WHICH); }
		public TerminalNode WHICH(int i) {
			return getToken(EU4GrammarParser.WHICH, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode VALUE() { return getToken(EU4GrammarParser.VALUE, 0); }
		public TerminalNode FLOAT() { return getToken(EU4GrammarParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public Set_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_variable; }
	}

	public final Set_variableContext set_variable() throws RecognitionException {
		Set_variableContext _localctx = new Set_variableContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_set_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(SET_VARIABLE);
			setState(879);
			match(LE);
			setState(880);
			match(WHICH);
			setState(881);
			match(EQUALS);
			setState(882);
			match(IDENTIFIER);
			setState(889);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHICH:
				{
				{
				setState(883);
				match(WHICH);
				setState(884);
				match(EQUALS);
				setState(885);
				match(IDENTIFIER);
				}
				}
				break;
			case VALUE:
				{
				{
				setState(886);
				match(VALUE);
				setState(887);
				match(EQUALS);
				setState(888);
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
			default:
				throw new NoViableAltException(this);
			}
			setState(891);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public List<TerminalNode> WHICH() { return getTokens(EU4GrammarParser.WHICH); }
		public TerminalNode WHICH(int i) {
			return getToken(EU4GrammarParser.WHICH, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode VALUE() { return getToken(EU4GrammarParser.VALUE, 0); }
		public TerminalNode FLOAT() { return getToken(EU4GrammarParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public Divide_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divide_variable; }
	}

	public final Divide_variableContext divide_variable() throws RecognitionException {
		Divide_variableContext _localctx = new Divide_variableContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_divide_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			match(DIVIDE_VARIABLE);
			setState(894);
			match(LE);
			setState(895);
			match(WHICH);
			setState(896);
			match(EQUALS);
			setState(897);
			match(IDENTIFIER);
			setState(904);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHICH:
				{
				{
				setState(898);
				match(WHICH);
				setState(899);
				match(EQUALS);
				setState(900);
				match(IDENTIFIER);
				}
				}
				break;
			case VALUE:
				{
				{
				setState(901);
				match(VALUE);
				setState(902);
				match(EQUALS);
				setState(903);
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
			default:
				throw new NoViableAltException(this);
			}
			setState(906);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public TerminalNode WHICH() { return getToken(EU4GrammarParser.WHICH, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public TerminalNode VALUE() { return getToken(EU4GrammarParser.VALUE, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode WHO() { return getToken(EU4GrammarParser.WHO, 0); }
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public TerminalNode SCOPE() { return getToken(EU4GrammarParser.SCOPE, 0); }
		public Export_to_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export_to_variable; }
	}

	public final Export_to_variableContext export_to_variable() throws RecognitionException {
		Export_to_variableContext _localctx = new Export_to_variableContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_export_to_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			match(EXPORT_TO_VARIABLE);
			setState(909);
			match(LE);
			setState(910);
			match(WHICH);
			setState(911);
			match(EQUALS);
			setState(912);
			match(IDENTIFIER);
			setState(913);
			match(VALUE);
			setState(914);
			match(EQUALS);
			setState(915);
			match(IDENTIFIER);
			setState(919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHO) {
				{
				setState(916);
				match(WHO);
				setState(917);
				match(EQUALS);
				setState(918);
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

			setState(921);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public TerminalNode ID() { return getToken(EU4GrammarParser.ID, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
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
	}

	public final Country_eventContext country_event() throws RecognitionException {
		Country_eventContext _localctx = new Country_eventContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_country_event);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			match(COUNTRY_EVENT);
			setState(924);
			match(LE);
			setState(925);
			match(ID);
			setState(926);
			match(EQUALS);
			setState(927);
			match(IDENTIFIER);
			setState(928);
			match(DOT);
			setState(929);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DAYS) {
				{
				setState(930);
				match(DAYS);
				setState(931);
				match(EQUALS);
				setState(932);
				match(INT);
				}
			}

			setState(935);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public Mana_triggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mana_trigger; }
	}

	public final Mana_triggerContext mana_trigger() throws RecognitionException {
		Mana_triggerContext _localctx = new Mana_triggerContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_mana_trigger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			match(MPOWER);
			setState(938);
			match(EQUALS);
			setState(939);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode SCOPE() { return getToken(EU4GrammarParser.SCOPE, 0); }
		public Religion_triggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_religion_trigger; }
	}

	public final Religion_triggerContext religion_trigger() throws RecognitionException {
		Religion_triggerContext _localctx = new Religion_triggerContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_religion_trigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			match(RELIGION);
			setState(942);
			match(EQUALS);
			setState(943);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public TerminalNode SCOPE() { return getToken(EU4GrammarParser.SCOPE, 0); }
		public TerminalNode FLOAT() { return getToken(EU4GrammarParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public Scripted_triggerContext scripted_trigger() {
			return getRuleContext(Scripted_triggerContext.class,0);
		}
		public Custom_trigger_tooltipContext custom_trigger_tooltip() {
			return getRuleContext(Custom_trigger_tooltipContext.class,0);
		}
		public Calc_true_ifContext calc_true_if() {
			return getRuleContext(Calc_true_ifContext.class,0);
		}
		public Trigger_sub_blockContext trigger_sub_block() {
			return getRuleContext(Trigger_sub_blockContext.class,0);
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
	}

	public final TriggerContext trigger() throws RecognitionException {
		TriggerContext _localctx = new TriggerContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_trigger);
		int _la;
		try {
			setState(965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(945);
				match(IDENTIFIER);
				setState(946);
				match(EQUALS);
				setState(947);
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
				setState(948);
				scripted_trigger();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(949);
				custom_trigger_tooltip();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(950);
				calc_true_if();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(951);
				trigger_sub_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(952);
				ai_trigger();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(953);
				mana_trigger();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(954);
				trade_share();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(955);
				privateer_power();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(956);
				if_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(957);
				check_variable();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(958);
				has_opinion_modifier();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(959);
				religion_trigger();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(960);
				num_of_owned_provinces_with();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(961);
				has_global_modifier_value();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(962);
				is_in_war();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(963);
				has_opinion();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(964);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TriggerContext> trigger() {
			return getRuleContexts(TriggerContext.class);
		}
		public TriggerContext trigger(int i) {
			return getRuleContext(TriggerContext.class,i);
		}
		public List<TerminalNode> VALUE() { return getTokens(EU4GrammarParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(EU4GrammarParser.VALUE, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public Num_of_owned_provinces_withContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_of_owned_provinces_with; }
	}

	public final Num_of_owned_provinces_withContext num_of_owned_provinces_with() throws RecognitionException {
		Num_of_owned_provinces_withContext _localctx = new Num_of_owned_provinces_withContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_num_of_owned_provinces_with);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			match(NUM_OF_OWNED_PROVINCES_WITH);
			setState(968);
			match(LE);
			setState(973); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(973);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VALUE:
					{
					{
					setState(969);
					match(VALUE);
					setState(970);
					match(EQUALS);
					setState(971);
					match(INT);
					}
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
					setState(972);
					trigger();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(975); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 36169568900612326L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 36159507L) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 9007199254740997L) != 0) );
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
	public static class Has_opinion_modifierContext extends ParserRuleContext {
		public TerminalNode HAS_OPINION_MODIFIER() { return getToken(EU4GrammarParser.HAS_OPINION_MODIFIER, 0); }
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TerminalNode> WHO() { return getTokens(EU4GrammarParser.WHO); }
		public TerminalNode WHO(int i) {
			return getToken(EU4GrammarParser.WHO, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
		public List<TerminalNode> VALUE() { return getTokens(EU4GrammarParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(EU4GrammarParser.VALUE, i);
		}
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public List<TerminalNode> MODIFIER() { return getTokens(EU4GrammarParser.MODIFIER); }
		public TerminalNode MODIFIER(int i) {
			return getToken(EU4GrammarParser.MODIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
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
	}

	public final Has_opinion_modifierContext has_opinion_modifier() throws RecognitionException {
		Has_opinion_modifierContext _localctx = new Has_opinion_modifierContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_has_opinion_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			match(HAS_OPINION_MODIFIER);
			setState(980);
			match(LE);
			setState(992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 549755813891L) != 0)) {
				{
				setState(990);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WHO:
					{
					{
					setState(981);
					match(WHO);
					setState(982);
					match(EQUALS);
					setState(983);
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
				case VALUE:
					{
					{
					setState(984);
					match(VALUE);
					setState(985);
					match(EQUALS);
					setState(986);
					match(INT);
					}
					}
					break;
				case MODIFIER:
					{
					{
					setState(987);
					match(MODIFIER);
					setState(988);
					match(EQUALS);
					setState(989);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
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
	public static class Calc_true_ifContext extends ParserRuleContext {
		public TerminalNode CALC_TRUE_IF() { return getToken(EU4GrammarParser.CALC_TRUE_IF, 0); }
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Calc_true_ifContext calc_true_if() throws RecognitionException {
		Calc_true_ifContext _localctx = new Calc_true_ifContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_calc_true_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			match(CALC_TRUE_IF);
			setState(998);
			match(LE);
			setState(1003);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140840601125094L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 36159507L) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 9007199254740997L) != 0)) {
				{
				setState(1001);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AMOUNT:
					{
					setState(999);
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
					setState(1000);
					trigger();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1006);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public List<TerminalNode> WHICH() { return getTokens(EU4GrammarParser.WHICH); }
		public TerminalNode WHICH(int i) {
			return getToken(EU4GrammarParser.WHICH, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode VALUE() { return getToken(EU4GrammarParser.VALUE, 0); }
		public TerminalNode FLOAT() { return getToken(EU4GrammarParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public Check_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check_variable; }
	}

	public final Check_variableContext check_variable() throws RecognitionException {
		Check_variableContext _localctx = new Check_variableContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_check_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			match(CHECK_VARIABLE);
			setState(1009);
			match(LE);
			setState(1010);
			match(WHICH);
			setState(1011);
			match(EQUALS);
			setState(1012);
			match(IDENTIFIER);
			setState(1019);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHICH:
				{
				{
				setState(1013);
				match(WHICH);
				setState(1014);
				match(EQUALS);
				setState(1015);
				match(IDENTIFIER);
				}
				}
				break;
			case VALUE:
				{
				{
				setState(1016);
				match(VALUE);
				setState(1017);
				match(EQUALS);
				setState(1018);
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
			default:
				throw new NoViableAltException(this);
			}
			setState(1021);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public TerminalNode COUNTRY() { return getToken(EU4GrammarParser.COUNTRY, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
		public TerminalNode SHARE() { return getToken(EU4GrammarParser.SHARE, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public TerminalNode SCOPE() { return getToken(EU4GrammarParser.SCOPE, 0); }
		public Trade_shareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trade_share; }
	}

	public final Trade_shareContext trade_share() throws RecognitionException {
		Trade_shareContext _localctx = new Trade_shareContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_trade_share);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			match(TRADE_SHARE);
			setState(1024);
			match(LE);
			setState(1025);
			match(COUNTRY);
			setState(1026);
			match(EQUALS);
			setState(1027);
			_la = _input.LA(1);
			if ( !(_la==TAG || _la==SCOPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1028);
			match(SHARE);
			setState(1029);
			match(EQUALS);
			setState(1030);
			match(INT);
			setState(1031);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public TerminalNode COUNTRY() { return getToken(EU4GrammarParser.COUNTRY, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
		public TerminalNode SHARE() { return getToken(EU4GrammarParser.SHARE, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public TerminalNode SCOPE() { return getToken(EU4GrammarParser.SCOPE, 0); }
		public Privateer_powerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateer_power; }
	}

	public final Privateer_powerContext privateer_power() throws RecognitionException {
		Privateer_powerContext _localctx = new Privateer_powerContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_privateer_power);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			match(PRIVATEER_POWER);
			setState(1034);
			match(LE);
			setState(1035);
			match(COUNTRY);
			setState(1036);
			match(EQUALS);
			setState(1037);
			_la = _input.LA(1);
			if ( !(_la==TAG || _la==SCOPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1038);
			match(SHARE);
			setState(1039);
			match(EQUALS);
			setState(1040);
			match(INT);
			setState(1041);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Scripted_triggerContext scripted_trigger() throws RecognitionException {
		Scripted_triggerContext _localctx = new Scripted_triggerContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_scripted_trigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			match(IDENTIFIER);
			setState(1044);
			match(LE);
			setState(1048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140771881648358L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 36159507L) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 9007199254740997L) != 0)) {
				{
				{
				setState(1045);
				trigger();
				}
				}
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1051);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final PrerequisitesContext prerequisites() throws RecognitionException {
		PrerequisitesContext _localctx = new PrerequisitesContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_prerequisites);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			match(PREREQUISITES);
			setState(1054);
			match(LE);
			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140771881648358L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 36159507L) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 9007199254740997L) != 0)) {
				{
				{
				setState(1055);
				trigger();
				}
				}
				setState(1060);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1061);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Prerequisites_selfContext prerequisites_self() throws RecognitionException {
		Prerequisites_selfContext _localctx = new Prerequisites_selfContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_prerequisites_self);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1063);
			match(PREREQUISITES_SELF);
			setState(1064);
			match(LE);
			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140771881648358L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 36159507L) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 9007199254740997L) != 0)) {
				{
				{
				setState(1065);
				trigger();
				}
				}
				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1071);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public Ai_triggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ai_trigger; }
	}

	public final Ai_triggerContext ai_trigger() throws RecognitionException {
		Ai_triggerContext _localctx = new Ai_triggerContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_ai_trigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			match(AI);
			setState(1074);
			match(EQUALS);
			setState(1075);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public Is_triggered_onlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_triggered_only; }
	}

	public final Is_triggered_onlyContext is_triggered_only() throws RecognitionException {
		Is_triggered_onlyContext _localctx = new Is_triggered_onlyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_is_triggered_only);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			match(IS_TIRGGERED_ONLY);
			setState(1078);
			match(EQUALS);
			setState(1079);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public Region_triggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_region_trigger; }
	}

	public final Region_triggerContext region_trigger() throws RecognitionException {
		Region_triggerContext _localctx = new Region_triggerContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_region_trigger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			match(REGION);
			setState(1082);
			match(EQUALS);
			setState(1083);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public TerminalNode WHICH() { return getToken(EU4GrammarParser.WHICH, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode VALUE() { return getToken(EU4GrammarParser.VALUE, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public Has_global_modifier_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_has_global_modifier_value; }
	}

	public final Has_global_modifier_valueContext has_global_modifier_value() throws RecognitionException {
		Has_global_modifier_valueContext _localctx = new Has_global_modifier_valueContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_has_global_modifier_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			match(Has_GLOBAL_MODIFIER_VALUE);
			setState(1086);
			match(LE);
			setState(1087);
			match(WHICH);
			setState(1088);
			match(EQUALS);
			setState(1089);
			match(IDENTIFIER);
			setState(1090);
			match(VALUE);
			setState(1091);
			match(EQUALS);
			setState(1092);
			match(INT);
			setState(1093);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Is_in_warContext is_in_war() throws RecognitionException {
		Is_in_warContext _localctx = new Is_in_warContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_is_in_war);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			match(IS_IN_WAR);
			setState(1096);
			match(LE);
			setState(1100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 261633L) != 0)) {
				{
				{
				setState(1097);
				is_in_war_options();
				}
				}
				setState(1102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1103);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final Is_in_war_optionsContext is_in_war_options() throws RecognitionException {
		Is_in_war_optionsContext _localctx = new Is_in_war_optionsContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_is_in_war_options);
		int _la;
		try {
			setState(1135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATTACKER_LEADER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1105);
				match(ATTACKER_LEADER);
				setState(1106);
				match(EQUALS);
				setState(1107);
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
				setState(1108);
				match(DEFENDER_LEADER);
				setState(1109);
				match(EQUALS);
				setState(1110);
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
				setState(1111);
				match(CASUS_BELLI);
				setState(1112);
				match(EQUALS);
				setState(1113);
				match(IDENTIFIER);
				}
				}
				break;
			case DEFENDERS:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1114);
				match(DEFENDERS);
				setState(1115);
				match(EQUALS);
				setState(1116);
				match(TAG);
				}
				}
				break;
			case ATTACKERS:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1117);
				match(ATTACKERS);
				setState(1118);
				match(EQUALS);
				setState(1119);
				match(TAG);
				}
				}
				break;
			case PARTICIPANTS:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1120);
				match(PARTICIPANTS);
				setState(1121);
				match(EQUALS);
				setState(1122);
				match(TAG);
				}
				}
				break;
			case WAR_SCORE:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(1123);
				match(WAR_SCORE);
				setState(1124);
				match(EQUALS);
				setState(1125);
				match(INT);
				}
				}
				break;
			case START_DATE:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(1126);
				match(START_DATE);
				setState(1127);
				match(EQUALS);
				setState(1128);
				match(DATE);
				}
				}
				break;
			case DURATION:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(1129);
				match(DURATION);
				setState(1130);
				match(EQUALS);
				setState(1131);
				match(INT);
				}
				}
				break;
			case WAR_GOAL_PROVINCE:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(1132);
				match(WAR_GOAL_PROVINCE);
				setState(1133);
				match(EQUALS);
				setState(1134);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TerminalNode> WHO() { return getTokens(EU4GrammarParser.WHO); }
		public TerminalNode WHO(int i) {
			return getToken(EU4GrammarParser.WHO, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
		public List<TerminalNode> VALUE() { return getTokens(EU4GrammarParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(EU4GrammarParser.VALUE, i);
		}
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public List<TerminalNode> MODIFIER() { return getTokens(EU4GrammarParser.MODIFIER); }
		public TerminalNode MODIFIER(int i) {
			return getToken(EU4GrammarParser.MODIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
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
	}

	public final Has_opinionContext has_opinion() throws RecognitionException {
		Has_opinionContext _localctx = new Has_opinionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_has_opinion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			match(HAS_OPINION);
			setState(1138);
			match(LE);
			setState(1150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 549755813891L) != 0)) {
				{
				setState(1148);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WHO:
					{
					{
					setState(1139);
					match(WHO);
					setState(1140);
					match(EQUALS);
					setState(1141);
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
				case VALUE:
					{
					{
					setState(1142);
					match(VALUE);
					setState(1143);
					match(EQUALS);
					setState(1144);
					match(INT);
					}
					}
					break;
				case MODIFIER:
					{
					{
					setState(1145);
					match(MODIFIER);
					setState(1146);
					match(EQUALS);
					setState(1147);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1153);
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
	public static class Trigger_sub_blockContext extends ParserRuleContext {
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode OR() { return getToken(EU4GrammarParser.OR, 0); }
		public TerminalNode AND() { return getToken(EU4GrammarParser.AND, 0); }
		public TerminalNode NOT() { return getToken(EU4GrammarParser.NOT, 0); }
		public TerminalNode SCOPE() { return getToken(EU4GrammarParser.SCOPE, 0); }
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public List<TriggerContext> trigger() {
			return getRuleContexts(TriggerContext.class);
		}
		public TriggerContext trigger(int i) {
			return getRuleContext(TriggerContext.class,i);
		}
		public Trigger_sub_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_sub_block; }
	}

	public final Trigger_sub_blockContext trigger_sub_block() throws RecognitionException {
		Trigger_sub_blockContext _localctx = new Trigger_sub_blockContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_trigger_sub_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 166L) != 0) || _la==SCOPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1156);
			match(LE);
			setState(1160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140771881648358L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 36159507L) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 9007199254740997L) != 0)) {
				{
				{
				setState(1157);
				trigger();
				}
				}
				setState(1162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1163);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Pre_effectContext pre_effect() throws RecognitionException {
		Pre_effectContext _localctx = new Pre_effectContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_pre_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			match(PRE_EFFECT);
			setState(1166);
			match(LE);
			setState(1170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17732924103196800L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1901117L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(1167);
				effect();
				}
				}
				setState(1172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1173);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Conditional_blockContext conditional_block() throws RecognitionException {
		Conditional_blockContext _localctx = new Conditional_blockContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_conditional_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175);
			match(CONDITIONAL);
			setState(1176);
			match(LE);
			setState(1183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POTENTIAL || _la==ALLOW || _la==TOOLTIP || _la==PRE_EFFECT) {
				{
				setState(1181);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case POTENTIAL:
					{
					setState(1177);
					potential_block();
					}
					break;
				case ALLOW:
					{
					setState(1178);
					allow_block();
					}
					break;
				case TOOLTIP:
					{
					setState(1179);
					tooltip();
					}
					break;
				case PRE_EFFECT:
					{
					setState(1180);
					pre_effect();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1186);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Diplomatic_actionContext diplomatic_action() throws RecognitionException {
		Diplomatic_actionContext _localctx = new Diplomatic_actionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_diplomatic_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			match(IDENTIFIER);
			setState(1189);
			match(LE);
			setState(1195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EFFECT || _la==CONDITIONAL || _la==PRE_EFFECT) {
				{
				setState(1193);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONDITIONAL:
					{
					setState(1190);
					conditional_block();
					}
					break;
				case EFFECT:
					{
					setState(1191);
					effect_block();
					}
					break;
				case PRE_EFFECT:
					{
					setState(1192);
					pre_effect();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1198);
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
	public static class Dof_definesContext extends ParserRuleContext {
		public TerminalNode LEVEL() { return getToken(EU4GrammarParser.LEVEL, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public TerminalNode RANGE_FROM() { return getToken(EU4GrammarParser.RANGE_FROM, 0); }
		public TerminalNode RANGE_TO() { return getToken(EU4GrammarParser.RANGE_TO, 0); }
		public Dof_definesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dof_defines; }
	}

	public final Dof_definesContext dof_defines() throws RecognitionException {
		Dof_definesContext _localctx = new Dof_definesContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_dof_defines);
		try {
			setState(1209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEVEL:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1200);
				match(LEVEL);
				setState(1201);
				match(EQUALS);
				setState(1202);
				match(INT);
				}
				}
				break;
			case RANGE_FROM:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1203);
				match(RANGE_FROM);
				setState(1204);
				match(EQUALS);
				setState(1205);
				match(INT);
				}
				}
				break;
			case RANGE_TO:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1206);
				match(RANGE_TO);
				setState(1207);
				match(EQUALS);
				setState(1208);
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
	public static class Defender_of_faithContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public List<TerminalNode> LE() { return getTokens(EU4GrammarParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(EU4GrammarParser.LE, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(EU4GrammarParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(EU4GrammarParser.RPAR, i);
		}
		public List<Dof_definesContext> dof_defines() {
			return getRuleContexts(Dof_definesContext.class);
		}
		public Dof_definesContext dof_defines(int i) {
			return getRuleContext(Dof_definesContext.class,i);
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
	}

	public final Defender_of_faithContext defender_of_faith() throws RecognitionException {
		Defender_of_faithContext _localctx = new Defender_of_faithContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_defender_of_faith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			match(IDENTIFIER);
			setState(1212);
			match(LE);
			setState(1214); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1213);
				dof_defines();
				}
				}
				setState(1216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & 8796093022211L) != 0) );
			setState(1229); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1229);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODIFIER:
					{
					setState(1218);
					modifier_block();
					}
					break;
				case AI_WILL_DO:
					{
					setState(1219);
					ai_will_do_block();
					}
					break;
				case SAME_FAITH_MODIFIER:
					{
					{
					setState(1220);
					match(SAME_FAITH_MODIFIER);
					setState(1221);
					match(LE);
					setState(1225);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==IDENTIFIER) {
						{
						{
						setState(1222);
						modifier();
						}
						}
						setState(1227);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1228);
					match(RPAR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1231); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 327681L) != 0) );
			setState(1233);
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
	}

	public final Decree_blocksContext decree_blocks() throws RecognitionException {
		Decree_blocksContext _localctx = new Decree_blocksContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_decree_blocks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POTENTIAL:
				{
				setState(1235);
				potential_block();
				}
				break;
			case TRIGGER:
				{
				setState(1236);
				trigger_block();
				}
				break;
			case MODIFIER:
				{
				setState(1237);
				modifier_block();
				}
				break;
			case EFFECT:
				{
				setState(1238);
				effect_block();
				}
				break;
			case REMOVED_EFFECT:
				{
				setState(1239);
				removed_effect_block();
				}
				break;
			case AI_WILL_DO:
				{
				setState(1240);
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
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<Decree_blocksContext> decree_blocks() {
			return getRuleContexts(Decree_blocksContext.class);
		}
		public Decree_blocksContext decree_blocks(int i) {
			return getRuleContext(Decree_blocksContext.class,i);
		}
		public List<TerminalNode> COST() { return getTokens(EU4GrammarParser.COST); }
		public TerminalNode COST(int i) {
			return getToken(EU4GrammarParser.COST, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
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
	}

	public final DecreeContext decree() throws RecognitionException {
		DecreeContext _localctx = new DecreeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_decree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			match(IDENTIFIER);
			setState(1244);
			match(LE);
			setState(1251); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1251);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COST:
					{
					{
					setState(1245);
					match(COST);
					setState(1246);
					match(EQUALS);
					setState(1247);
					match(INT);
					}
					}
					break;
				case DURATION:
					{
					{
					setState(1248);
					match(DURATION);
					setState(1249);
					match(EQUALS);
					setState(1250);
					match(INT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COST || _la==DURATION );
			setState(1256); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1255);
				decree_blocks();
				}
				}
				setState(1258); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 15032385536L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 655361L) != 0) );
			setState(1260);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public TerminalNode CATEGORY() { return getToken(EU4GrammarParser.CATEGORY, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final Custom_idea_categoryContext custom_idea_category() throws RecognitionException {
		Custom_idea_categoryContext _localctx = new Custom_idea_categoryContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_custom_idea_category);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262);
			match(IDENTIFIER);
			setState(1263);
			match(LE);
			setState(1264);
			match(CATEGORY);
			setState(1265);
			match(EQUALS);
			setState(1266);
			match(MPOWER);
			setState(1268); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1267);
				custom_idea();
				}
				}
				setState(1270); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(1272);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public Custom_idea_levelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_custom_idea_level; }
	}

	public final Custom_idea_levelContext custom_idea_level() throws RecognitionException {
		Custom_idea_levelContext _localctx = new Custom_idea_levelContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_custom_idea_level);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
			match(LEVEL_COST);
			setState(1275);
			match(EQUALS);
			setState(1276);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Enabled_blockContext enabled_block() throws RecognitionException {
		Enabled_blockContext _localctx = new Enabled_blockContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_enabled_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1278);
			match(ENABLED);
			setState(1279);
			match(LE);
			setState(1283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140771881648358L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 36159507L) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 9007199254740997L) != 0)) {
				{
				{
				setState(1280);
				trigger();
				}
				}
				setState(1285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1286);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
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
	}

	public final Custom_ideaContext custom_idea() throws RecognitionException {
		Custom_ideaContext _localctx = new Custom_ideaContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_custom_idea);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			match(IDENTIFIER);
			setState(1289);
			match(LE);
			setState(1302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 7340033L) != 0) || _la==DEFAULT || _la==IDENTIFIER) {
				{
				setState(1300);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(1290);
					modifier();
					}
					break;
				case ENABLED:
					{
					setState(1291);
					enabled_block();
					}
					break;
				case LEVEL_COST:
					{
					setState(1292);
					custom_idea_level();
					}
					break;
				case DEFAULT:
					{
					{
					setState(1293);
					match(DEFAULT);
					setState(1294);
					match(EQUALS);
					setState(1295);
					match(INT);
					}
					}
					break;
				case CHANCE:
					{
					setState(1296);
					chance_block();
					}
					break;
				case MAX_LEVEL:
					{
					{
					setState(1297);
					match(MAX_LEVEL);
					setState(1298);
					match(EQUALS);
					setState(1299);
					match(INT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1305);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public Flag_colorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flag_color; }
	}

	public final Flag_colorContext flag_color() throws RecognitionException {
		Flag_colorContext _localctx = new Flag_colorContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_flag_color);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1307);
			match(FLAG_COLOR);
			setState(1308);
			match(LE);
			setState(1310); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1309);
					match(INT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1312); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1315); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1314);
					match(INT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1317); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1320); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1319);
				match(INT);
				}
				}
				setState(1322); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT );
			setState(1324);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public File_blockContext file_block() {
			return getRuleContext(File_blockContext.class,0);
		}
		public Size_blockContext size_block() {
			return getRuleContext(Size_blockContext.class,0);
		}
		public TerminalNode NOOFFRAMES() { return getToken(EU4GrammarParser.NOOFFRAMES, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
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
	}

	public final Texture_blockContext texture_block() throws RecognitionException {
		Texture_blockContext _localctx = new Texture_blockContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_texture_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			match(TEXTURE);
			setState(1327);
			match(LE);
			setState(1328);
			file_block();
			setState(1329);
			size_block();
			setState(1330);
			match(NOOFFRAMES);
			setState(1331);
			match(EQUALS);
			setState(1332);
			match(INT);
			setState(1333);
			match(COLOR);
			setState(1334);
			match(EQUALS);
			setState(1335);
			match(INT);
			setState(1336);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public TerminalNode TEXTURES() { return getToken(EU4GrammarParser.TEXTURES, 0); }
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Custom_country_colorContext custom_country_color() throws RecognitionException {
		Custom_country_colorContext _localctx = new Custom_country_colorContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_custom_country_color);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1338);
			match(NUM_SYMBOLS);
			setState(1339);
			match(EQUALS);
			setState(1340);
			match(INT);
			setState(1344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLOR) {
				{
				{
				setState(1341);
				color_block();
				}
				}
				setState(1346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FLAG_COLOR) {
				{
				{
				setState(1347);
				flag_color();
				}
				}
				setState(1352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1353);
			match(TEXTURES);
			setState(1354);
			match(LE);
			setState(1358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXTURE) {
				{
				{
				setState(1355);
				texture_block();
				}
				}
				setState(1360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1361);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Culture_modifier_blockContext culture_modifier_block() throws RecognitionException {
		Culture_modifier_blockContext _localctx = new Culture_modifier_blockContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_culture_modifier_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			_la = _input.LA(1);
			if ( !(_la==COUNTRY || _la==PROVINCE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1364);
			match(LE);
			setState(1368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1365);
				modifier();
				}
				}
				setState(1370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1371);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Culture_namesContext culture_names() throws RecognitionException {
		Culture_namesContext _localctx = new Culture_namesContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_culture_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1373);
			_la = _input.LA(1);
			if ( !(((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1374);
			match(LE);
			setState(1378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING || _la==IDENTIFIER) {
				{
				{
				setState(1375);
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
				setState(1380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1381);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
		public Culture_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_culture_group; }
	}

	public final Culture_groupContext culture_group() throws RecognitionException {
		Culture_groupContext _localctx = new Culture_groupContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_culture_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1383);
			match(IDENTIFIER);
			setState(1384);
			match(LE);
			setState(1391); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1391);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GRAPHICAL_CULTURE:
					{
					{
					setState(1385);
					match(GRAPHICAL_CULTURE);
					setState(1386);
					match(EQUALS);
					setState(1387);
					match(IDENTIFIER);
					}
					}
					break;
				case COUNTRY:
				case PROVINCE:
					{
					setState(1388);
					culture_modifier_block();
					}
					break;
				case IDENTIFIER:
					{
					setState(1389);
					culture();
					}
					break;
				case MALE_NAMES:
				case FEMALE_NAMES:
				case DYNASTY_NAMES:
					{
					setState(1390);
					culture_names();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1393); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & 864691128455135367L) != 0) || _la==IDENTIFIER );
			setState(1395);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
		public List<TerminalNode> TAG() { return getTokens(EU4GrammarParser.TAG); }
		public TerminalNode TAG(int i) {
			return getToken(EU4GrammarParser.TAG, i);
		}
		public CultureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_culture; }
	}

	public final CultureContext culture() throws RecognitionException {
		CultureContext _localctx = new CultureContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_culture);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1397);
			match(IDENTIFIER);
			setState(1398);
			match(LE);
			setState(1406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & 864691128455135247L) != 0)) {
				{
				setState(1404);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRIMARY:
					{
					{
					setState(1399);
					match(PRIMARY);
					setState(1400);
					match(EQUALS);
					setState(1401);
					match(TAG);
					}
					}
					break;
				case COUNTRY:
				case PROVINCE:
					{
					setState(1402);
					culture_modifier_block();
					}
					break;
				case MALE_NAMES:
				case FEMALE_NAMES:
				case DYNASTY_NAMES:
					{
					setState(1403);
					culture_names();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1409);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public Country_tagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_country_tags; }
	}

	public final Country_tagsContext country_tags() throws RecognitionException {
		Country_tagsContext _localctx = new Country_tagsContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_country_tags);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1411);
			match(TAG);
			setState(1412);
			match(EQUALS);
			setState(1413);
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
		public List<TerminalNode> LE() { return getTokens(EU4GrammarParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(EU4GrammarParser.LE, i);
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
	}

	public final Country_colorContext country_color() throws RecognitionException {
		Country_colorContext _localctx = new Country_colorContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_country_color);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1415);
			match(TAG);
			setState(1416);
			match(LE);
			setState(1435); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1417);
				_la = _input.LA(1);
				if ( !(((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1418);
				match(LE);
				setState(1420); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1419);
						match(INT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1422); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1425); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1424);
						match(INT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1427); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1430); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1429);
					match(INT);
					}
					}
					setState(1432); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(1434);
				match(RPAR);
				}
				}
				setState(1437); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & 7L) != 0) );
			setState(1439);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Common_countires_blockContext common_countires_block() throws RecognitionException {
		Common_countires_blockContext _localctx = new Common_countires_blockContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_common_countires_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			_la = _input.LA(1);
			if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & 123L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1442);
			match(LE);
			setState(1446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING || _la==IDENTIFIER) {
				{
				{
				setState(1443);
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
				setState(1448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1449);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TerminalNode> STRING() { return getTokens(EU4GrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(EU4GrammarParser.STRING, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public Monarch_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monarch_names; }
	}

	public final Monarch_namesContext monarch_names() throws RecognitionException {
		Monarch_namesContext _localctx = new Monarch_namesContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_monarch_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1451);
			match(MONARCH_NAMES);
			setState(1452);
			match(LE);
			setState(1458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(1453);
				match(STRING);
				setState(1454);
				match(EQUALS);
				setState(1455);
				match(INT);
				}
				}
				setState(1460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1461);
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
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public List<TerminalNode> REVOLUTIONARY_COLORS() { return getTokens(EU4GrammarParser.REVOLUTIONARY_COLORS); }
		public TerminalNode REVOLUTIONARY_COLORS(int i) {
			return getToken(EU4GrammarParser.REVOLUTIONARY_COLORS, i);
		}
		public List<TerminalNode> LE() { return getTokens(EU4GrammarParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(EU4GrammarParser.LE, i);
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
	}

	public final Common_countryContext common_country() throws RecognitionException {
		Common_countryContext _localctx = new Common_countryContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_common_country);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1487); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1487);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case GRAPHICAL_CULTURE:
						{
						{
						setState(1463);
						match(GRAPHICAL_CULTURE);
						setState(1464);
						match(EQUALS);
						setState(1465);
						match(IDENTIFIER);
						}
						}
						break;
					case COLOR:
						{
						setState(1466);
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
						setState(1467);
						common_countires_block();
						}
						break;
					case MONARCH_NAMES:
						{
						setState(1468);
						monarch_names();
						}
						break;
					case REVOLUTIONARY_COLORS:
						{
						{
						setState(1469);
						match(REVOLUTIONARY_COLORS);
						setState(1470);
						match(LE);
						setState(1472); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(1471);
								match(INT);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(1474); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(1477); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(1476);
								match(INT);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(1479); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(1482); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1481);
							match(INT);
							}
							}
							setState(1484); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==INT );
						setState(1486);
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
				setState(1489); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public Trade_goods_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trade_goods_block; }
	}

	public final Trade_goods_blockContext trade_goods_block() throws RecognitionException {
		Trade_goods_blockContext _localctx = new Trade_goods_blockContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_trade_goods_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1491);
			match(TRADE_GOODS);
			setState(1492);
			match(LE);
			setState(1496); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1493);
				match(IDENTIFIER);
				setState(1494);
				match(EQUALS);
				setState(1495);
				match(INT);
				}
				}
				setState(1498); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(1500);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public Culture_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_culture_block; }
	}

	public final Culture_blockContext culture_block() throws RecognitionException {
		Culture_blockContext _localctx = new Culture_blockContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_culture_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1502);
			match(CULTURE);
			setState(1503);
			match(LE);
			setState(1507); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1504);
				match(IDENTIFIER);
				setState(1505);
				match(EQUALS);
				setState(1506);
				match(INT);
				}
				}
				setState(1509); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(1511);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
		public List<TerminalNode> INT() { return getTokens(EU4GrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EU4GrammarParser.INT, i);
		}
		public Religion_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_religion_block; }
	}

	public final Religion_blockContext religion_block() throws RecognitionException {
		Religion_blockContext _localctx = new Religion_blockContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_religion_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1513);
			match(RELIGION);
			setState(1514);
			match(LE);
			setState(1518); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1515);
				match(IDENTIFIER);
				setState(1516);
				match(EQUALS);
				setState(1517);
				match(INT);
				}
				}
				setState(1520); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
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
	public static class Col_simple_attrContext extends ParserRuleContext {
		public TerminalNode TAX_INCOME() { return getToken(EU4GrammarParser.TAX_INCOME, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public TerminalNode NATIVE_SIZE() { return getToken(EU4GrammarParser.NATIVE_SIZE, 0); }
		public TerminalNode NATIVE_FEROCITY() { return getToken(EU4GrammarParser.NATIVE_FEROCITY, 0); }
		public TerminalNode NATIVE_HOSTILENESS() { return getToken(EU4GrammarParser.NATIVE_HOSTILENESS, 0); }
		public Col_simple_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_simple_attr; }
	}

	public final Col_simple_attrContext col_simple_attr() throws RecognitionException {
		Col_simple_attrContext _localctx = new Col_simple_attrContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_col_simple_attr);
		try {
			setState(1536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAX_INCOME:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1524);
				match(TAX_INCOME);
				setState(1525);
				match(EQUALS);
				setState(1526);
				match(INT);
				}
				}
				break;
			case NATIVE_SIZE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1527);
				match(NATIVE_SIZE);
				setState(1528);
				match(EQUALS);
				setState(1529);
				match(INT);
				}
				}
				break;
			case NATIVE_FEROCITY:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1530);
				match(NATIVE_FEROCITY);
				setState(1531);
				match(EQUALS);
				setState(1532);
				match(INT);
				}
				}
				break;
			case NATIVE_HOSTILENESS:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1533);
				match(NATIVE_HOSTILENESS);
				setState(1534);
				match(EQUALS);
				setState(1535);
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
	}

	public final Col_region_attrContext col_region_attr() throws RecognitionException {
		Col_region_attrContext _localctx = new Col_region_attrContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_col_region_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROVINCES:
				{
				setState(1538);
				provinces_block();
				}
				break;
			case TRADE_GOODS:
				{
				setState(1539);
				trade_goods_block();
				}
				break;
			case CULTURE:
				{
				setState(1540);
				culture_block();
				}
				break;
			case RELIGION:
				{
				setState(1541);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Colonial_regionContext colonial_region() throws RecognitionException {
		Colonial_regionContext _localctx = new Colonial_regionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_colonial_region);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1544);
			match(IDENTIFIER);
			setState(1545);
			match(LE);
			setState(1554); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1554);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COLOR:
					{
					setState(1546);
					color_block();
					}
					break;
				case TAX_INCOME:
				case NATIVE_SIZE:
				case NATIVE_FEROCITY:
				case NATIVE_HOSTILENESS:
					{
					setState(1548); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(1547);
							col_simple_attr();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1550); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case TRADE_GOODS:
				case CULTURE:
				case RELIGION:
				case PROVINCES:
					{
					setState(1552);
					col_region_attr();
					}
					break;
				case NAME:
				case NAMES:
					{
					setState(1553);
					name_block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1556); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 71193377898496L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 255L) != 0) );
			setState(1558);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode STRING_TOOLTIP() { return getToken(EU4GrammarParser.STRING_TOOLTIP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TooltipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tooltip; }
	}

	public final TooltipContext tooltip() throws RecognitionException {
		TooltipContext _localctx = new TooltipContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_tooltip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1560);
			match(TOOLTIP);
			setState(1561);
			match(EQUALS);
			setState(1562);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode STRING_TOOLTIP() { return getToken(EU4GrammarParser.STRING_TOOLTIP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public Custom_tooltipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_custom_tooltip; }
	}

	public final Custom_tooltipContext custom_tooltip() throws RecognitionException {
		Custom_tooltipContext _localctx = new Custom_tooltipContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_custom_tooltip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1564);
			match(CUSTOM_TOOLTIP);
			setState(1565);
			match(EQUALS);
			setState(1566);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Custom_trigger_tooltipContext custom_trigger_tooltip() throws RecognitionException {
		Custom_trigger_tooltipContext _localctx = new Custom_trigger_tooltipContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_custom_trigger_tooltip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1568);
			match(CUSTOM_TRIGGER_TOOLTIP);
			setState(1569);
			match(LE);
			setState(1573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOOLTIP) {
				{
				{
				setState(1570);
				tooltip();
				}
				}
				setState(1575);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140771881648358L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 36159507L) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 9007199254740997L) != 0)) {
				{
				{
				setState(1576);
				trigger();
				}
				}
				setState(1581);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1582);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode STRING_TOOLTIP() { return getToken(EU4GrammarParser.STRING_TOOLTIP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public DescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desc; }
	}

	public final DescContext desc() throws RecognitionException {
		DescContext _localctx = new DescContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_desc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
			match(DESC);
			setState(1585);
			match(EQUALS);
			setState(1586);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Client_stateContext client_state() throws RecognitionException {
		Client_stateContext _localctx = new Client_stateContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_client_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1588);
			match(IDENTIFIER);
			setState(1589);
			match(LE);
			setState(1592); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1592);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NAME:
				case NAMES:
					{
					setState(1590);
					name_block();
					}
					break;
				case REGION:
					{
					setState(1591);
					region_trigger();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1594); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME || _la==NAMES || _la==REGION );
			setState(1596);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public Is_blessingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_blessing; }
	}

	public final Is_blessingContext is_blessing() throws RecognitionException {
		Is_blessingContext _localctx = new Is_blessingContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_is_blessing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1598);
			match(IS_BLESSING);
			setState(1599);
			match(EQUALS);
			setState(1600);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public SpriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sprite; }
	}

	public final SpriteContext sprite() throws RecognitionException {
		SpriteContext _localctx = new SpriteContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_sprite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1602);
			match(SPRITE);
			setState(1603);
			match(EQUALS);
			setState(1604);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Church_aspectContext church_aspect() throws RecognitionException {
		Church_aspectContext _localctx = new Church_aspectContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_church_aspect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1606);
			match(IDENTIFIER);
			setState(1607);
			match(LE);
			setState(1618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1114544013312L) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 2017612633061982209L) != 0)) {
				{
				setState(1616);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IS_BLESSING:
					{
					setState(1608);
					is_blessing();
					}
					break;
				case TRIGGER:
					{
					setState(1609);
					trigger_block();
					}
					break;
				case SPRITE:
					{
					setState(1610);
					sprite();
					}
					break;
				case MONARCH_POWER:
					{
					setState(1611);
					monarch_power_advisor();
					}
					break;
				case COST:
					{
					setState(1612);
					cost();
					}
					break;
				case EFFECT:
					{
					setState(1613);
					effect_block();
					}
					break;
				case MODIFIER:
					{
					setState(1614);
					modifier_block();
					}
					break;
				case POTENTIAL:
					{
					setState(1615);
					potential_block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AI_WILL_DO) {
				{
				setState(1621);
				ai_will_do_block();
				}
			}

			setState(1624);
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
	public static class LevelContext extends ParserRuleContext {
		public TerminalNode LEVEL() { return getToken(EU4GrammarParser.LEVEL, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public LevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level; }
	}

	public final LevelContext level() throws RecognitionException {
		LevelContext _localctx = new LevelContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_level);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1626);
			match(LEVEL);
			setState(1627);
			match(EQUALS);
			setState(1628);
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
	public static class DevelopmentContext extends ParserRuleContext {
		public TerminalNode DEVELOPMENT() { return getToken(EU4GrammarParser.DEVELOPMENT, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public DevelopmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_development; }
	}

	public final DevelopmentContext development() throws RecognitionException {
		DevelopmentContext _localctx = new DevelopmentContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_development);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1630);
			match(DEVELOPMENT);
			setState(1631);
			match(EQUALS);
			setState(1632);
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
	public static class Cot_typeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(EU4GrammarParser.TYPE, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode COASTAL() { return getToken(EU4GrammarParser.COASTAL, 0); }
		public TerminalNode INLAND() { return getToken(EU4GrammarParser.INLAND, 0); }
		public Cot_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cot_type; }
	}

	public final Cot_typeContext cot_type() throws RecognitionException {
		Cot_typeContext _localctx = new Cot_typeContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_cot_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1634);
			match(TYPE);
			setState(1635);
			match(EQUALS);
			setState(1636);
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
		public DevelopmentContext development() {
			return getRuleContext(DevelopmentContext.class,0);
		}
		public CostContext cost() {
			return getRuleContext(CostContext.class,0);
		}
		public Cot_typeContext cot_type() {
			return getRuleContext(Cot_typeContext.class,0);
		}
		public Cot_optionalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cot_optionals; }
	}

	public final Cot_optionalsContext cot_optionals() throws RecognitionException {
		Cot_optionalsContext _localctx = new Cot_optionalsContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_cot_optionals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1641);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEVELOPMENT:
				{
				setState(1638);
				development();
				}
				break;
			case COST:
				{
				setState(1639);
				cost();
				}
				break;
			case TYPE:
				{
				setState(1640);
				cot_type();
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
	public static class Province_modifierContext extends ParserRuleContext {
		public TerminalNode PROVINCE_MODIFIER() { return getToken(EU4GrammarParser.PROVINCE_MODIFIER, 0); }
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Province_modifierContext province_modifier() throws RecognitionException {
		Province_modifierContext _localctx = new Province_modifierContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_province_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1643);
			match(PROVINCE_MODIFIER);
			setState(1644);
			match(LE);
			setState(1648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1645);
				modifier();
				}
				}
				setState(1650);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1651);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Global_modifierContext global_modifier() throws RecognitionException {
		Global_modifierContext _localctx = new Global_modifierContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_global_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1653);
			match(GLOBAL_MODIFIER);
			setState(1654);
			match(LE);
			setState(1658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1655);
				modifier();
				}
				}
				setState(1660);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1661);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final State_modifierContext state_modifier() throws RecognitionException {
		State_modifierContext _localctx = new State_modifierContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_state_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1663);
			match(STATE_MODIFIER);
			setState(1664);
			match(LE);
			setState(1668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1665);
				modifier();
				}
				}
				setState(1670);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1671);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public LevelContext level() {
			return getRuleContext(LevelContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<Cot_optionalsContext> cot_optionals() {
			return getRuleContexts(Cot_optionalsContext.class);
		}
		public Cot_optionalsContext cot_optionals(int i) {
			return getRuleContext(Cot_optionalsContext.class,i);
		}
		public Province_modifierContext province_modifier() {
			return getRuleContext(Province_modifierContext.class,0);
		}
		public State_modifierContext state_modifier() {
			return getRuleContext(State_modifierContext.class,0);
		}
		public Global_modifierContext global_modifier() {
			return getRuleContext(Global_modifierContext.class,0);
		}
		public Center_of_tradeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_center_of_trade; }
	}

	public final Center_of_tradeContext center_of_trade() throws RecognitionException {
		Center_of_tradeContext _localctx = new Center_of_tradeContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_center_of_trade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673);
			match(IDENTIFIER);
			setState(1674);
			match(LE);
			setState(1675);
			level();
			setState(1677); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1676);
				cot_optionals();
				}
				}
				setState(1679); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COST || _la==DEVELOPMENT || _la==TYPE );
			setState(1682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROVINCE_MODIFIER) {
				{
				setState(1681);
				province_modifier();
				}
			}

			setState(1685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATE_MODIFIER) {
				{
				setState(1684);
				state_modifier();
				}
			}

			setState(1688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBAL_MODIFIER) {
				{
				setState(1687);
				global_modifier();
				}
			}

			setState(1690);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public LeagueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_league; }
	}

	public final LeagueContext league() throws RecognitionException {
		LeagueContext _localctx = new LeagueContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_league);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1692);
			match(LEAGUE);
			setState(1693);
			match(EQUALS);
			setState(1694);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public Call_empire_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_empire_members; }
	}

	public final Call_empire_membersContext call_empire_members() throws RecognitionException {
		Call_empire_membersContext _localctx = new Call_empire_membersContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_call_empire_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1696);
			match(CALL_EMPIRE_MEMBERS);
			setState(1697);
			match(EQUALS);
			setState(1698);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public Ai_peace_desireContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ai_peace_desire; }
	}

	public final Ai_peace_desireContext ai_peace_desire() throws RecognitionException {
		Ai_peace_desireContext _localctx = new Ai_peace_desireContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_ai_peace_desire);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1700);
			match(AI_PEACE_DESIRE);
			setState(1701);
			match(EQUALS);
			setState(1702);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public Support_rebelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_support_rebels; }
	}

	public final Support_rebelsContext support_rebels() throws RecognitionException {
		Support_rebelsContext _localctx = new Support_rebelsContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_support_rebels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
			match(SUPPORT_REBELS);
			setState(1705);
			match(EQUALS);
			setState(1706);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public CoalitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coalition; }
	}

	public final CoalitionContext coalition() throws RecognitionException {
		CoalitionContext _localctx = new CoalitionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_coalition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1708);
			match(COALITION);
			setState(1709);
			match(EQUALS);
			setState(1710);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public IndependenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_independence; }
	}

	public final IndependenceContext independence() throws RecognitionException {
		IndependenceContext _localctx = new IndependenceContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_independence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
			match(INDEPENDENCE);
			setState(1713);
			match(EQUALS);
			setState(1714);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public ExclusiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive; }
	}

	public final ExclusiveContext exclusive() throws RecognitionException {
		ExclusiveContext _localctx = new ExclusiveContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_exclusive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1716);
			match(EXCLUSIVE);
			setState(1717);
			match(EQUALS);
			setState(1718);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public Holy_warContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_holy_war; }
	}

	public final Holy_warContext holy_war() throws RecognitionException {
		Holy_warContext _localctx = new Holy_warContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_holy_war);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1720);
			match(HOLY_WAR);
			setState(1721);
			match(EQUALS);
			setState(1722);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public Attacker_disabled_poContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attacker_disabled_po; }
	}

	public final Attacker_disabled_poContext attacker_disabled_po() throws RecognitionException {
		Attacker_disabled_poContext _localctx = new Attacker_disabled_poContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_attacker_disabled_po);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1724);
			match(ATTACKER_DISABLED_PO);
			setState(1725);
			match(LE);
			setState(1729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1726);
				match(IDENTIFIER);
				}
				}
				setState(1731);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1732);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public Is_valid_for_subjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_valid_for_subject; }
	}

	public final Is_valid_for_subjectContext is_valid_for_subject() throws RecognitionException {
		Is_valid_for_subjectContext _localctx = new Is_valid_for_subjectContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_is_valid_for_subject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1734);
			match(IS_VALID_FOR_SUBJECT);
			setState(1735);
			match(EQUALS);
			setState(1736);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public War_goalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_war_goal; }
	}

	public final War_goalContext war_goal() throws RecognitionException {
		War_goalContext _localctx = new War_goalContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_war_goal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1738);
			match(WAR_GOAL);
			setState(1739);
			match(EQUALS);
			setState(1740);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public No_opinion_hitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_opinion_hit; }
	}

	public final No_opinion_hitContext no_opinion_hit() throws RecognitionException {
		No_opinion_hitContext _localctx = new No_opinion_hitContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_no_opinion_hit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1742);
			match(NO_OPINION_HIT);
			setState(1743);
			match(EQUALS);
			setState(1744);
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
	}

	public final Cb_optionalsContext cb_optionals() throws RecognitionException {
		Cb_optionalsContext _localctx = new Cb_optionalsContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_cb_optionals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL_EMPIRE_MEMBERS:
				{
				setState(1746);
				call_empire_members();
				}
				break;
			case ATTACKER_DISABLED_PO:
				{
				setState(1747);
				attacker_disabled_po();
				}
				break;
			case HOLY_WAR:
				{
				setState(1748);
				holy_war();
				}
				break;
			case IS_TIRGGERED_ONLY:
				{
				setState(1749);
				is_triggered_only();
				}
				break;
			case MONTHS:
				{
				setState(1750);
				months();
				}
				break;
			case NO_OPINION_HIT:
				{
				setState(1751);
				no_opinion_hit();
				}
				break;
			case WAR_GOAL:
				{
				setState(1752);
				war_goal();
				}
				break;
			case PREREQUISITES:
				{
				setState(1753);
				prerequisites();
				}
				break;
			case PREREQUISITES_SELF:
				{
				setState(1754);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Cb_typeContext cb_type() throws RecognitionException {
		Cb_typeContext _localctx = new Cb_typeContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_cb_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1757);
			match(IDENTIFIER);
			setState(1758);
			match(LE);
			setState(1760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEAGUE) {
				{
				setState(1759);
				league();
				}
			}

			setState(1763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUPPORT_REBELS) {
				{
				setState(1762);
				support_rebels();
				}
			}

			setState(1766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AI_PEACE_DESIRE) {
				{
				setState(1765);
				ai_peace_desire();
				}
			}

			setState(1769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS_VALID_FOR_SUBJECT) {
				{
				setState(1768);
				is_valid_for_subject();
				}
			}

			setState(1772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLUSIVE) {
				{
				setState(1771);
				exclusive();
				}
			}

			setState(1775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDEPENDENCE) {
				{
				setState(1774);
				independence();
				}
			}

			setState(1778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COALITION) {
				{
				setState(1777);
				coalition();
				}
			}

			setState(1783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65970697670656L) != 0) || ((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & 269L) != 0)) {
				{
				{
				setState(1780);
				cb_optionals();
				}
				}
				setState(1785);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1786);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Buildings_triggerContext buildings_trigger() throws RecognitionException {
		Buildings_triggerContext _localctx = new Buildings_triggerContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_buildings_trigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1788);
			_la = _input.LA(1);
			if ( !(_la==KEEP_TRIGGER || _la==BUILD_TRIGGER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1789);
			match(LE);
			setState(1793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140771881648358L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 36159507L) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 9007199254740997L) != 0)) {
				{
				{
				setState(1790);
				trigger();
				}
				}
				setState(1795);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1796);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Buildings_effectContext buildings_effect() throws RecognitionException {
		Buildings_effectContext _localctx = new Buildings_effectContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_buildings_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1798);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & 31L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1799);
			match(LE);
			setState(1803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17732924103196800L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 1901117L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(1800);
				effect();
				}
				}
				setState(1805);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1806);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Manufactory_definesContext manufactory_defines() throws RecognitionException {
		Manufactory_definesContext _localctx = new Manufactory_definesContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_manufactory_defines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1808);
			_la = _input.LA(1);
			if ( !(_la==MANUFACTORY || _la==BONUS_MANUFACTORY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1809);
			match(LE);
			setState(1811); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1810);
				match(IDENTIFIER);
				}
				}
				setState(1813); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(1815);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Bonus_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bonus_modifier; }
	}

	public final Bonus_modifierContext bonus_modifier() throws RecognitionException {
		Bonus_modifierContext _localctx = new Bonus_modifierContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_bonus_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1817);
			match(BONUS_MODIFIER);
			setState(1818);
			match(EQUALS);
			setState(1819);
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
		public TerminalNode COST() { return getToken(EU4GrammarParser.COST, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public CostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cost; }
	}

	public final CostContext cost() throws RecognitionException {
		CostContext _localctx = new CostContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_cost);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1821);
			match(COST);
			setState(1822);
			match(EQUALS);
			setState(1823);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1825);
			match(TIME);
			setState(1826);
			match(EQUALS);
			setState(1827);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public OnmapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onmap; }
	}

	public final OnmapContext onmap() throws RecognitionException {
		OnmapContext _localctx = new OnmapContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_onmap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1829);
			match(ONMAP);
			setState(1830);
			match(EQUALS);
			setState(1831);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public Show_seperateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_seperate; }
	}

	public final Show_seperateContext show_seperate() throws RecognitionException {
		Show_seperateContext _localctx = new Show_seperateContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_show_seperate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1833);
			match(SHOW_SEPERATE);
			setState(1834);
			match(EQUALS);
			setState(1835);
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
	}

	public final Building_attributeContext building_attribute() throws RecognitionException {
		Building_attributeContext _localctx = new Building_attributeContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_building_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1844);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COST:
				{
				setState(1837);
				cost();
				}
				break;
			case TIME:
				{
				setState(1838);
				time();
				}
				break;
			case ONMAP:
				{
				setState(1839);
				onmap();
				}
				break;
			case SHOW_SEPERATE:
				{
				setState(1840);
				show_seperate();
				}
				break;
			case INFLUENCING_FORT:
				{
				setState(1841);
				influencing_fort();
				}
				break;
			case ALLOWED_IN_GOLD_PROVINCES:
				{
				setState(1842);
				allowed_in_gold_province();
				}
				break;
			case MAKE_OBSOLETE:
				{
				setState(1843);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public Allowed_in_gold_provinceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allowed_in_gold_province; }
	}

	public final Allowed_in_gold_provinceContext allowed_in_gold_province() throws RecognitionException {
		Allowed_in_gold_provinceContext _localctx = new Allowed_in_gold_provinceContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_allowed_in_gold_province);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1846);
			match(ALLOWED_IN_GOLD_PROVINCES);
			setState(1847);
			match(EQUALS);
			setState(1848);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public Make_obsoleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_make_obsolete; }
	}

	public final Make_obsoleteContext make_obsolete() throws RecognitionException {
		Make_obsoleteContext _localctx = new Make_obsoleteContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_make_obsolete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1850);
			match(MAKE_OBSOLETE);
			setState(1851);
			match(EQUALS);
			setState(1852);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public Influencing_fortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_influencing_fort; }
	}

	public final Influencing_fortContext influencing_fort() throws RecognitionException {
		Influencing_fortContext _localctx = new Influencing_fortContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_influencing_fort);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1854);
			match(INFLUENCING_FORT);
			setState(1855);
			match(EQUALS);
			setState(1856);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final BuildingContext building() throws RecognitionException {
		BuildingContext _localctx = new BuildingContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_building);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1858);
			match(IDENTIFIER);
			setState(1859);
			match(LE);
			setState(1869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & 90071992813748227L) != 0) || ((((_la - 173)) & ~0x3f) == 0 && ((1L << (_la - 173)) & 255L) != 0)) {
				{
				setState(1867);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MANUFACTORY:
				case BONUS_MANUFACTORY:
					{
					setState(1860);
					manufactory_defines();
					}
					break;
				case COST:
				case TIME:
				case ALLOWED_IN_GOLD_PROVINCES:
				case INFLUENCING_FORT:
				case ONMAP:
				case MAKE_OBSOLETE:
				case SHOW_SEPERATE:
					{
					setState(1861);
					building_attribute();
					}
					break;
				case ON_BUILT:
				case ON_DESTORYED:
				case ON_CONSTRUCTION_STARTED:
				case ON_CONSTRUCTION_CANCELED:
				case ON_OBSOLETE:
					{
					setState(1862);
					buildings_effect();
					}
					break;
				case KEEP_TRIGGER:
				case BUILD_TRIGGER:
					{
					setState(1863);
					buildings_trigger();
					}
					break;
				case BONUS_MODIFIER:
					{
					setState(1864);
					bonus_modifier();
					}
					break;
				case MODIFIER:
					{
					setState(1865);
					modifier_block();
					}
					break;
				case AI_WILL_DO:
					{
					setState(1866);
					ai_will_do_block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1871);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1872);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
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
	}

	public final BookmarkContext bookmark() throws RecognitionException {
		BookmarkContext _localctx = new BookmarkContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_bookmark);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1874);
			match(BOOKMARK);
			setState(1875);
			match(LE);
			setState(1876);
			name();
			setState(1877);
			desc();
			setState(1878);
			date();
			setState(1884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CENTER) {
				{
				{
				setState(1879);
				match(CENTER);
				setState(1880);
				match(EQUALS);
				setState(1881);
				match(INT);
				}
				}
				setState(1886);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(1887);
			match(DEFAULT);
			setState(1888);
			match(EQUALS);
			setState(1892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==YES || _la==NO) {
				{
				{
				setState(1889);
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
				setState(1894);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(1900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COUNTRY) {
				{
				{
				setState(1895);
				match(COUNTRY);
				setState(1896);
				match(EQUALS);
				setState(1897);
				match(TAG);
				}
				}
				setState(1902);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EASY_COUNTRY) {
				{
				{
				setState(1903);
				match(EASY_COUNTRY);
				setState(1904);
				match(EQUALS);
				setState(1905);
				match(TAG);
				}
				}
				setState(1910);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1911);
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
		public List<TerminalNode> LE() { return getTokens(EU4GrammarParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(EU4GrammarParser.LE, i);
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
	}

	public final Ancestor_personalityContext ancestor_personality() throws RecognitionException {
		Ancestor_personalityContext _localctx = new Ancestor_personalityContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_ancestor_personality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1913);
			match(IDENTIFIER);
			setState(1914);
			match(LE);
			setState(1955);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2161727838317707264L) != 0) || _la==CHANCE || _la==AI_PICK_ANCESTOR || _la==IDENTIFIER) {
				{
				setState(1953);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RULER_ALLOW:
					{
					{
					setState(1915);
					match(RULER_ALLOW);
					setState(1916);
					match(LE);
					setState(1920);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ALLOW) {
						{
						{
						setState(1917);
						allow();
						}
						}
						setState(1922);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1923);
					chance_block();
					setState(1924);
					match(RPAR);
					}
					}
					break;
				case HEIR_ALLOW:
					{
					{
					setState(1926);
					match(HEIR_ALLOW);
					setState(1927);
					match(LE);
					setState(1931);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ALLOW) {
						{
						{
						setState(1928);
						allow();
						}
						}
						setState(1933);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1934);
					chance_block();
					setState(1935);
					match(RPAR);
					}
					}
					break;
				case CONSORT_ALLOW:
					{
					{
					setState(1937);
					match(CONSORT_ALLOW);
					setState(1938);
					match(LE);
					setState(1942);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ALLOW) {
						{
						{
						setState(1939);
						allow();
						}
						}
						setState(1944);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1945);
					chance_block();
					setState(1946);
					match(RPAR);
					}
					}
					break;
				case ALLOW:
					{
					setState(1948);
					allow();
					}
					break;
				case CHANCE:
					{
					setState(1949);
					chance_block();
					}
					break;
				case WAR_PRIORITY:
					{
					setState(1950);
					war_priority();
					}
					break;
				case AI_PICK_ANCESTOR:
					{
					setState(1951);
					ai_pick_ancestor();
					}
					break;
				case IDENTIFIER:
					{
					setState(1952);
					modifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1957);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1958);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public Chance_modifierContext chance_modifier() {
			return getRuleContext(Chance_modifierContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public War_priorityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_war_priority; }
	}

	public final War_priorityContext war_priority() throws RecognitionException {
		War_priorityContext _localctx = new War_priorityContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_war_priority);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1960);
			match(WAR_PRIORITY);
			setState(1961);
			match(LE);
			setState(1962);
			chance_modifier();
			setState(1963);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Ai_pick_ancestorContext ai_pick_ancestor() throws RecognitionException {
		Ai_pick_ancestorContext _localctx = new Ai_pick_ancestorContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_ai_pick_ancestor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1965);
			match(AI_PICK_ANCESTOR);
			setState(1966);
			match(LE);
			setState(1967);
			factor();
			setState(1968);
			chance_modifier();
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
	public static class Ai_personalityContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public Chance_blockContext chance_block() {
			return getRuleContext(Chance_blockContext.class,0);
		}
		public TerminalNode ICON() { return getToken(EU4GrammarParser.ICON, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public Ai_personalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ai_personality; }
	}

	public final Ai_personalityContext ai_personality() throws RecognitionException {
		Ai_personalityContext _localctx = new Ai_personalityContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_ai_personality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1971);
			match(IDENTIFIER);
			setState(1972);
			match(LE);
			setState(1973);
			chance_block();
			setState(1974);
			match(ICON);
			setState(1975);
			match(EQUALS);
			setState(1976);
			match(INT);
			setState(1977);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1979);
			match(START);
			setState(1980);
			match(EQUALS);
			setState(1981);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Can_start_blockContext can_start_block() throws RecognitionException {
		Can_start_blockContext _localctx = new Can_start_blockContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_can_start_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1983);
			match(CAN_START);
			setState(1984);
			match(LE);
			setState(1988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140771881648358L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 36159507L) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 9007199254740997L) != 0)) {
				{
				{
				setState(1985);
				trigger();
				}
				}
				setState(1990);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1991);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final ObjectiveContext objective() throws RecognitionException {
		ObjectiveContext _localctx = new ObjectiveContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_objective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1993);
			match(IDENTIFIER);
			setState(1994);
			match(LE);
			setState(1999);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140789061517542L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 36159507L) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 9007199254740997L) != 0)) {
				{
				setState(1997);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALLOW:
					{
					setState(1995);
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
					setState(1996);
					trigger();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2001);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2002);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Objectives_blockContext objectives_block() throws RecognitionException {
		Objectives_blockContext _localctx = new Objectives_blockContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_objectives_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2004);
			match(OBJECTIVES);
			setState(2005);
			match(LE);
			setState(2009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(2006);
				objective();
				}
				}
				setState(2011);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2012);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final AbilityContext ability() throws RecognitionException {
		AbilityContext _localctx = new AbilityContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_ability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2014);
			match(IDENTIFIER);
			setState(2015);
			match(LE);
			setState(2021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & 2305843009213693955L) != 0)) {
				{
				setState(2019);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALLOW:
					{
					setState(2016);
					allow();
					}
					break;
				case EFFECT:
					{
					setState(2017);
					effect_block();
					}
					break;
				case MODIFIER:
					{
					setState(2018);
					modifier_block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2023);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2024);
			ai_will_do_block();
			setState(2025);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Ability_blockContext ability_block() throws RecognitionException {
		Ability_blockContext _localctx = new Ability_blockContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_ability_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2027);
			match(ABILITIES);
			setState(2028);
			match(LE);
			setState(2032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(2029);
				ability();
				}
				}
				setState(2034);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2035);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
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
	}

	public final AgeContext age() throws RecognitionException {
		AgeContext _localctx = new AgeContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_age);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2037);
			match(IDENTIFIER);
			setState(2038);
			match(LE);
			setState(2039);
			start();
			setState(2040);
			can_start_block();
			setState(2049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RELIGIOUS_CONFLICTS || _la==PAPACY) {
				{
				setState(2047);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RELIGIOUS_CONFLICTS:
					{
					{
					setState(2041);
					match(RELIGIOUS_CONFLICTS);
					setState(2042);
					match(EQUALS);
					setState(2043);
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
					setState(2044);
					match(PAPACY);
					setState(2045);
					match(EQUALS);
					setState(2046);
					match(FLOAT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2051);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2052);
			objectives_block();
			setState(2053);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final AdvisorContext advisor() throws RecognitionException {
		AdvisorContext _localctx = new AdvisorContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_advisor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2055);
			match(IDENTIFIER);
			setState(2056);
			match(LE);
			setState(2057);
			monarch_power_advisor();
			setState(2062);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SKILL_SACLED_MOD || _la==IDENTIFIER) {
				{
				setState(2060);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(2058);
					modifier();
					}
					break;
				case SKILL_SACLED_MOD:
					{
					setState(2059);
					skill_scaled_modifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2064);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2065);
			chance_block();
			setState(2066);
			ai_will_do_block();
			setState(2067);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode MPOWER() { return getToken(EU4GrammarParser.MPOWER, 0); }
		public Monarch_power_advisorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monarch_power_advisor; }
	}

	public final Monarch_power_advisorContext monarch_power_advisor() throws RecognitionException {
		Monarch_power_advisorContext _localctx = new Monarch_power_advisorContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_monarch_power_advisor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2069);
			match(MONARCH_POWER);
			setState(2070);
			match(EQUALS);
			setState(2071);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final MissionSeriesContext missionSeries() throws RecognitionException {
		MissionSeriesContext _localctx = new MissionSeriesContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2073);
			match(IDENTIFIER);
			setState(2074);
			match(LE);
			setState(2084);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POTENTIAL || _la==AI || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & 527L) != 0)) {
				{
				setState(2082);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SLOT:
					{
					setState(2075);
					slot_missionSeries();
					}
					break;
				case GENERIC:
					{
					setState(2076);
					generic_missionSeries();
					}
					break;
				case AI:
					{
					setState(2077);
					ai_trigger();
					}
					break;
				case HAS_COUNTRY_SHIELD:
					{
					setState(2078);
					hasCountryShield_missionSeries();
					}
					break;
				case POTENTIAL_ON_LOAD:
					{
					setState(2079);
					potentialOnLoad_missionSeries();
					}
					break;
				case POTENTIAL:
					{
					setState(2080);
					potential_missionSeries();
					}
					break;
				case IDENTIFIER:
					{
					setState(2081);
					missionBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2086);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2087);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public Slot_missionSeriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slot_missionSeries; }
	}

	public final Slot_missionSeriesContext slot_missionSeries() throws RecognitionException {
		Slot_missionSeriesContext _localctx = new Slot_missionSeriesContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_slot_missionSeries);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2089);
			match(SLOT);
			setState(2090);
			match(EQUALS);
			setState(2091);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public Generic_missionSeriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_missionSeries; }
	}

	public final Generic_missionSeriesContext generic_missionSeries() throws RecognitionException {
		Generic_missionSeriesContext _localctx = new Generic_missionSeriesContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_generic_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2093);
			match(GENERIC);
			setState(2094);
			match(EQUALS);
			setState(2095);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public HasCountryShield_missionSeriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hasCountryShield_missionSeries; }
	}

	public final HasCountryShield_missionSeriesContext hasCountryShield_missionSeries() throws RecognitionException {
		HasCountryShield_missionSeriesContext _localctx = new HasCountryShield_missionSeriesContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_hasCountryShield_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2097);
			match(HAS_COUNTRY_SHIELD);
			setState(2098);
			match(EQUALS);
			setState(2099);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final PotentialOnLoad_missionSeriesContext potentialOnLoad_missionSeries() throws RecognitionException {
		PotentialOnLoad_missionSeriesContext _localctx = new PotentialOnLoad_missionSeriesContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_potentialOnLoad_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2101);
			match(POTENTIAL_ON_LOAD);
			setState(2102);
			match(LE);
			setState(2106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140771881648358L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 36159507L) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 9007199254740997L) != 0)) {
				{
				{
				setState(2103);
				trigger();
				}
				}
				setState(2108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2109);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final Potential_missionSeriesContext potential_missionSeries() throws RecognitionException {
		Potential_missionSeriesContext _localctx = new Potential_missionSeriesContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_potential_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2111);
			match(POTENTIAL);
			setState(2112);
			match(LE);
			setState(2116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140771881648358L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 36159507L) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 9007199254740997L) != 0)) {
				{
				{
				setState(2113);
				trigger();
				}
				}
				setState(2118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2119);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final MissionBlockContext missionBlock() throws RecognitionException {
		MissionBlockContext _localctx = new MissionBlockContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_missionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2121);
			match(IDENTIFIER);
			setState(2122);
			match(LE);
			setState(2133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TRIGGER || _la==EFFECT || _la==AI_WEIGHT || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & 31L) != 0)) {
				{
				setState(2131);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ICON:
					{
					setState(2123);
					icon_mission();
					}
					break;
				case POSITION:
					{
					setState(2124);
					position_mission();
					}
					break;
				case COMPLETED_BY:
					{
					setState(2125);
					completedBy_mission();
					}
					break;
				case REQUIRED_MISSIONS:
					{
					setState(2126);
					requiredMissions_mission();
					}
					break;
				case PROVINCES_TO_HIGHLIGHT:
					{
					setState(2127);
					provincesToHighlight_mission();
					}
					break;
				case TRIGGER:
					{
					setState(2128);
					trigger_block();
					}
					break;
				case EFFECT:
					{
					setState(2129);
					effect_block();
					}
					break;
				case AI_WEIGHT:
					{
					setState(2130);
					aiWeight_mission();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2136);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public Icon_missionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_icon_mission; }
	}

	public final Icon_missionContext icon_mission() throws RecognitionException {
		Icon_missionContext _localctx = new Icon_missionContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_icon_mission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2138);
			match(ICON);
			setState(2139);
			match(EQUALS);
			setState(2140);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public Position_missionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_position_mission; }
	}

	public final Position_missionContext position_mission() throws RecognitionException {
		Position_missionContext _localctx = new Position_missionContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_position_mission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2142);
			match(POSITION);
			setState(2143);
			match(EQUALS);
			setState(2144);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public CompletedBy_missionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_completedBy_mission; }
	}

	public final CompletedBy_missionContext completedBy_mission() throws RecognitionException {
		CompletedBy_missionContext _localctx = new CompletedBy_missionContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_completedBy_mission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2146);
			match(COMPLETED_BY);
			setState(2147);
			match(EQUALS);
			setState(2148);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EU4GrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EU4GrammarParser.IDENTIFIER, i);
		}
		public RequiredMissions_missionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requiredMissions_mission; }
	}

	public final RequiredMissions_missionContext requiredMissions_mission() throws RecognitionException {
		RequiredMissions_missionContext _localctx = new RequiredMissions_missionContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_requiredMissions_mission);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2150);
			match(REQUIRED_MISSIONS);
			setState(2151);
			match(LE);
			setState(2155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(2152);
				match(IDENTIFIER);
				}
				}
				setState(2157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2158);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
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
	}

	public final ProvincesToHighlight_missionContext provincesToHighlight_mission() throws RecognitionException {
		ProvincesToHighlight_missionContext _localctx = new ProvincesToHighlight_missionContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_provincesToHighlight_mission);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2160);
			match(PROVINCES_TO_HIGHLIGHT);
			setState(2161);
			match(LE);
			setState(2165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140771881648358L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 36159507L) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 9007199254740997L) != 0)) {
				{
				{
				setState(2162);
				trigger();
				}
				}
				setState(2167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2168);
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
		public TerminalNode LE() { return getToken(EU4GrammarParser.LE, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public AiWeight_missionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aiWeight_mission; }
	}

	public final AiWeight_missionContext aiWeight_mission() throws RecognitionException {
		AiWeight_missionContext _localctx = new AiWeight_missionContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_aiWeight_mission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2170);
			match(AI_WEIGHT);
			setState(2171);
			match(LE);
			setState(2172);
			factor();
			setState(2173);
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
		"\u0004\u0001\u00cb\u0880\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\u00a1\u0002\u00a2\u0007\u00a2\u0002\u00a3\u0007\u00a3\u0002\u00a4\u0007"+
		"\u00a4\u0002\u00a5\u0007\u00a5\u0002\u00a6\u0007\u00a6\u0001\u0000\u0005"+
		"\u0000\u0150\b\u0000\n\u0000\f\u0000\u0153\t\u0000\u0001\u0000\u0005\u0000"+
		"\u0156\b\u0000\n\u0000\f\u0000\u0159\t\u0000\u0001\u0000\u0005\u0000\u015c"+
		"\b\u0000\n\u0000\f\u0000\u015f\t\u0000\u0001\u0000\u0005\u0000\u0162\b"+
		"\u0000\n\u0000\f\u0000\u0165\t\u0000\u0001\u0000\u0005\u0000\u0168\b\u0000"+
		"\n\u0000\f\u0000\u016b\t\u0000\u0001\u0000\u0005\u0000\u016e\b\u0000\n"+
		"\u0000\f\u0000\u0171\t\u0000\u0001\u0000\u0005\u0000\u0174\b\u0000\n\u0000"+
		"\f\u0000\u0177\t\u0000\u0001\u0000\u0005\u0000\u017a\b\u0000\n\u0000\f"+
		"\u0000\u017d\t\u0000\u0001\u0000\u0005\u0000\u0180\b\u0000\n\u0000\f\u0000"+
		"\u0183\t\u0000\u0001\u0000\u0005\u0000\u0186\b\u0000\n\u0000\f\u0000\u0189"+
		"\t\u0000\u0001\u0000\u0005\u0000\u018c\b\u0000\n\u0000\f\u0000\u018f\t"+
		"\u0000\u0001\u0000\u0005\u0000\u0192\b\u0000\n\u0000\f\u0000\u0195\t\u0000"+
		"\u0001\u0000\u0005\u0000\u0198\b\u0000\n\u0000\f\u0000\u019b\t\u0000\u0001"+
		"\u0000\u0005\u0000\u019e\b\u0000\n\u0000\f\u0000\u01a1\t\u0000\u0001\u0000"+
		"\u0005\u0000\u01a4\b\u0000\n\u0000\f\u0000\u01a7\t\u0000\u0001\u0000\u0005"+
		"\u0000\u01aa\b\u0000\n\u0000\f\u0000\u01ad\t\u0000\u0001\u0000\u0005\u0000"+
		"\u01b0\b\u0000\n\u0000\f\u0000\u01b3\t\u0000\u0001\u0000\u0005\u0000\u01b6"+
		"\b\u0000\n\u0000\f\u0000\u01b9\t\u0000\u0001\u0000\u0005\u0000\u01bc\b"+
		"\u0000\n\u0000\f\u0000\u01bf\t\u0000\u0003\u0000\u01c1\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u01c6\b\u0001\n\u0001\f\u0001\u01c9"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002\u01cf"+
		"\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u01d4\b\u0003"+
		"\n\u0003\f\u0003\u01d7\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004\u01de\b\u0004\n\u0004\f\u0004\u01e1\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u01e8\b\u0005\n\u0005\f\u0005\u01eb\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u01f2\b\u0006\n\u0006\f\u0006"+
		"\u01f5\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u01fc\b\u0007\n\u0007\f\u0007\u01ff\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u0206\b\b\n\b\f\b\u0209\t\b\u0001"+
		"\b\u0005\b\u020c\b\b\n\b\f\b\u020f\t\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0005\t\u0217\b\t\n\t\f\t\u021a\t\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u0221\b\n\n\n\f\n\u0224\t\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0004\u000b\u022e\b\u000b\u000b\u000b\f\u000b\u022f\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0004\f\u0237\b\f\u000b\f\f\f\u0238\u0001"+
		"\f\u0004\f\u023c\b\f\u000b\f\f\f\u023d\u0001\f\u0004\f\u0241\b\f\u000b"+
		"\f\f\f\u0242\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0004\r\u024a\b\r"+
		"\u000b\r\f\r\u024b\u0005\r\u024e\b\r\n\r\f\r\u0251\t\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u0266\b\u0010\n\u0010\f\u0010\u0269\t\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u0275\b\u0012\n\u0012\f\u0012\u0278\t\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u0293\b\u0019\n\u0019\f\u0019\u0296\t\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u029d"+
		"\b\u001a\n\u001a\f\u001a\u02a0\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u02a8\b\u001b\n\u001b"+
		"\f\u001b\u02ab\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u02b3\b\u001c\n\u001c\f\u001c\u02b6"+
		"\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u02bb\b\u001c"+
		"\n\u001c\f\u001c\u02be\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u02c4\b\u001d\n\u001d\f\u001d\u02c7\t\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0005\u001e\u02d1\b\u001e\n\u001e\f\u001e\u02d4\t\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005"+
		"\u001f\u02dc\b\u001f\n\u001f\f\u001f\u02df\t\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u02e3\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0304\b\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0005\'\u0331\b\'\n\'\f\'\u0334\t\'\u0001\'\u0001\'"+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u034d\b)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u035c\b*\u0001*\u0001"+
		"*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0003+\u036b\b+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u037a\b,\u0001,\u0001"+
		",\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0003-\u0389\b-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u0398\b.\u0001.\u0001"+
		".\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0003/\u03a6\b/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00011\u0001"+
		"1\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00032\u03c6\b2\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00043\u03ce\b3\u000b3\f3\u03cf\u00013\u00013\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00054\u03df\b4\n4"+
		"\f4\u03e2\t4\u00014\u00014\u00015\u00015\u00015\u00015\u00055\u03ea\b"+
		"5\n5\f5\u03ed\t5\u00015\u00015\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00036\u03fc\b6\u00016\u00016\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"9\u00019\u00019\u00059\u0417\b9\n9\f9\u041a\t9\u00019\u00019\u0001:\u0001"+
		":\u0001:\u0005:\u0421\b:\n:\f:\u0424\t:\u0001:\u0001:\u0001;\u0001;\u0001"+
		";\u0005;\u042b\b;\n;\f;\u042e\t;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001"+
		"<\u0001=\u0001=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001@\u0001"+
		"@\u0001@\u0005@\u044b\b@\n@\f@\u044e\t@\u0001@\u0001@\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0003A\u0470\bA\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0005B\u047d\bB\nB\fB\u0480\tB\u0001B\u0001B\u0001C\u0001C\u0001C\u0005"+
		"C\u0487\bC\nC\fC\u048a\tC\u0001C\u0001C\u0001D\u0001D\u0001D\u0005D\u0491"+
		"\bD\nD\fD\u0494\tD\u0001D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001E\u0001"+
		"E\u0005E\u049e\bE\nE\fE\u04a1\tE\u0001E\u0001E\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0005F\u04aa\bF\nF\fF\u04ad\tF\u0001F\u0001F\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u04ba\bG\u0001H\u0001"+
		"H\u0001H\u0004H\u04bf\bH\u000bH\fH\u04c0\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0005H\u04c8\bH\nH\fH\u04cb\tH\u0001H\u0004H\u04ce\bH\u000bH\fH\u04cf"+
		"\u0001H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0003I\u04da"+
		"\bI\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0004J\u04e4"+
		"\bJ\u000bJ\fJ\u04e5\u0001J\u0004J\u04e9\bJ\u000bJ\fJ\u04ea\u0001J\u0001"+
		"J\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0004K\u04f5\bK\u000bK\fK"+
		"\u04f6\u0001K\u0001K\u0001L\u0001L\u0001L\u0001L\u0001M\u0001M\u0001M"+
		"\u0005M\u0502\bM\nM\fM\u0505\tM\u0001M\u0001M\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0005N\u0515"+
		"\bN\nN\fN\u0518\tN\u0001N\u0001N\u0001O\u0001O\u0001O\u0004O\u051f\bO"+
		"\u000bO\fO\u0520\u0001O\u0004O\u0524\bO\u000bO\fO\u0525\u0001O\u0004O"+
		"\u0529\bO\u000bO\fO\u052a\u0001O\u0001O\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0005Q\u053f\bQ\nQ\fQ\u0542\tQ\u0001Q\u0005Q\u0545\bQ\nQ\fQ\u0548"+
		"\tQ\u0001Q\u0001Q\u0001Q\u0005Q\u054d\bQ\nQ\fQ\u0550\tQ\u0001Q\u0001Q"+
		"\u0001R\u0001R\u0001R\u0005R\u0557\bR\nR\fR\u055a\tR\u0001R\u0001R\u0001"+
		"S\u0001S\u0001S\u0005S\u0561\bS\nS\fS\u0564\tS\u0001S\u0001S\u0001T\u0001"+
		"T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0004T\u0570\bT\u000bT\fT"+
		"\u0571\u0001T\u0001T\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U"+
		"\u0005U\u057d\bU\nU\fU\u0580\tU\u0001U\u0001U\u0001V\u0001V\u0001V\u0001"+
		"V\u0001W\u0001W\u0001W\u0001W\u0001W\u0004W\u058d\bW\u000bW\fW\u058e\u0001"+
		"W\u0004W\u0592\bW\u000bW\fW\u0593\u0001W\u0004W\u0597\bW\u000bW\fW\u0598"+
		"\u0001W\u0004W\u059c\bW\u000bW\fW\u059d\u0001W\u0001W\u0001X\u0001X\u0001"+
		"X\u0005X\u05a5\bX\nX\fX\u05a8\tX\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0001"+
		"Y\u0001Y\u0005Y\u05b1\bY\nY\fY\u05b4\tY\u0001Y\u0001Y\u0001Z\u0001Z\u0001"+
		"Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0004Z\u05c1\bZ\u000bZ\fZ"+
		"\u05c2\u0001Z\u0004Z\u05c6\bZ\u000bZ\fZ\u05c7\u0001Z\u0004Z\u05cb\bZ\u000b"+
		"Z\fZ\u05cc\u0001Z\u0004Z\u05d0\bZ\u000bZ\fZ\u05d1\u0001[\u0001[\u0001"+
		"[\u0001[\u0001[\u0004[\u05d9\b[\u000b[\f[\u05da\u0001[\u0001[\u0001\\"+
		"\u0001\\\u0001\\\u0001\\\u0001\\\u0004\\\u05e4\b\\\u000b\\\f\\\u05e5\u0001"+
		"\\\u0001\\\u0001]\u0001]\u0001]\u0001]\u0001]\u0004]\u05ef\b]\u000b]\f"+
		"]\u05f0\u0001]\u0001]\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001"+
		"^\u0001^\u0001^\u0001^\u0001^\u0001^\u0003^\u0601\b^\u0001_\u0001_\u0001"+
		"_\u0001_\u0003_\u0607\b_\u0001`\u0001`\u0001`\u0001`\u0004`\u060d\b`\u000b"+
		"`\f`\u060e\u0001`\u0001`\u0004`\u0613\b`\u000b`\f`\u0614\u0001`\u0001"+
		"`\u0001a\u0001a\u0001a\u0001a\u0001b\u0001b\u0001b\u0001b\u0001c\u0001"+
		"c\u0001c\u0005c\u0624\bc\nc\fc\u0627\tc\u0001c\u0005c\u062a\bc\nc\fc\u062d"+
		"\tc\u0001c\u0001c\u0001d\u0001d\u0001d\u0001d\u0001e\u0001e\u0001e\u0001"+
		"e\u0004e\u0639\be\u000be\fe\u063a\u0001e\u0001e\u0001f\u0001f\u0001f\u0001"+
		"f\u0001g\u0001g\u0001g\u0001g\u0001h\u0001h\u0001h\u0001h\u0001h\u0001"+
		"h\u0001h\u0001h\u0001h\u0001h\u0005h\u0651\bh\nh\fh\u0654\th\u0001h\u0003"+
		"h\u0657\bh\u0001h\u0001h\u0001i\u0001i\u0001i\u0001i\u0001j\u0001j\u0001"+
		"j\u0001j\u0001k\u0001k\u0001k\u0001k\u0001l\u0001l\u0001l\u0003l\u066a"+
		"\bl\u0001m\u0001m\u0001m\u0005m\u066f\bm\nm\fm\u0672\tm\u0001m\u0001m"+
		"\u0001n\u0001n\u0001n\u0005n\u0679\bn\nn\fn\u067c\tn\u0001n\u0001n\u0001"+
		"o\u0001o\u0001o\u0005o\u0683\bo\no\fo\u0686\to\u0001o\u0001o\u0001p\u0001"+
		"p\u0001p\u0001p\u0004p\u068e\bp\u000bp\fp\u068f\u0001p\u0003p\u0693\b"+
		"p\u0001p\u0003p\u0696\bp\u0001p\u0003p\u0699\bp\u0001p\u0001p\u0001q\u0001"+
		"q\u0001q\u0001q\u0001r\u0001r\u0001r\u0001r\u0001s\u0001s\u0001s\u0001"+
		"s\u0001t\u0001t\u0001t\u0001t\u0001u\u0001u\u0001u\u0001u\u0001v\u0001"+
		"v\u0001v\u0001v\u0001w\u0001w\u0001w\u0001w\u0001x\u0001x\u0001x\u0001"+
		"x\u0001y\u0001y\u0001y\u0005y\u06c0\by\ny\fy\u06c3\ty\u0001y\u0001y\u0001"+
		"z\u0001z\u0001z\u0001z\u0001{\u0001{\u0001{\u0001{\u0001|\u0001|\u0001"+
		"|\u0001|\u0001}\u0001}\u0001}\u0001}\u0001}\u0001}\u0001}\u0001}\u0001"+
		"}\u0003}\u06dc\b}\u0001~\u0001~\u0001~\u0003~\u06e1\b~\u0001~\u0003~\u06e4"+
		"\b~\u0001~\u0003~\u06e7\b~\u0001~\u0003~\u06ea\b~\u0001~\u0003~\u06ed"+
		"\b~\u0001~\u0003~\u06f0\b~\u0001~\u0003~\u06f3\b~\u0001~\u0005~\u06f6"+
		"\b~\n~\f~\u06f9\t~\u0001~\u0001~\u0001\u007f\u0001\u007f\u0001\u007f\u0005"+
		"\u007f\u0700\b\u007f\n\u007f\f\u007f\u0703\t\u007f\u0001\u007f\u0001\u007f"+
		"\u0001\u0080\u0001\u0080\u0001\u0080\u0005\u0080\u070a\b\u0080\n\u0080"+
		"\f\u0080\u070d\t\u0080\u0001\u0080\u0001\u0080\u0001\u0081\u0001\u0081"+
		"\u0001\u0081\u0004\u0081\u0714\b\u0081\u000b\u0081\f\u0081\u0715\u0001"+
		"\u0081\u0001\u0081\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0001"+
		"\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0001\u0084\u0001\u0084\u0001"+
		"\u0084\u0001\u0084\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001"+
		"\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0087\u0001\u0087\u0001"+
		"\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0003\u0087\u0735"+
		"\b\u0087\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u008a\u0001\u008a\u0001\u008a\u0001"+
		"\u008a\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001"+
		"\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0005\u008b\u074c\b\u008b\n"+
		"\u008b\f\u008b\u074f\t\u008b\u0001\u008b\u0001\u008b\u0001\u008c\u0001"+
		"\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001"+
		"\u008c\u0005\u008c\u075b\b\u008c\n\u008c\f\u008c\u075e\t\u008c\u0001\u008c"+
		"\u0001\u008c\u0001\u008c\u0005\u008c\u0763\b\u008c\n\u008c\f\u008c\u0766"+
		"\t\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0005\u008c\u076b\b\u008c"+
		"\n\u008c\f\u008c\u076e\t\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0005"+
		"\u008c\u0773\b\u008c\n\u008c\f\u008c\u0776\t\u008c\u0001\u008c\u0001\u008c"+
		"\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0005\u008d"+
		"\u077f\b\u008d\n\u008d\f\u008d\u0782\t\u008d\u0001\u008d\u0001\u008d\u0001"+
		"\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0005\u008d\u078a\b\u008d\n"+
		"\u008d\f\u008d\u078d\t\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001"+
		"\u008d\u0001\u008d\u0001\u008d\u0005\u008d\u0795\b\u008d\n\u008d\f\u008d"+
		"\u0798\t\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d"+
		"\u0001\u008d\u0001\u008d\u0001\u008d\u0005\u008d\u07a2\b\u008d\n\u008d"+
		"\f\u008d\u07a5\t\u008d\u0001\u008d\u0001\u008d\u0001\u008e\u0001\u008e"+
		"\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008f\u0001\u008f\u0001\u008f"+
		"\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u0090\u0001\u0090\u0001\u0090"+
		"\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0091"+
		"\u0001\u0091\u0001\u0091\u0001\u0091\u0001\u0092\u0001\u0092\u0001\u0092"+
		"\u0005\u0092\u07c3\b\u0092\n\u0092\f\u0092\u07c6\t\u0092\u0001\u0092\u0001"+
		"\u0092\u0001\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0005\u0093\u07ce"+
		"\b\u0093\n\u0093\f\u0093\u07d1\t\u0093\u0001\u0093\u0001\u0093\u0001\u0094"+
		"\u0001\u0094\u0001\u0094\u0005\u0094\u07d8\b\u0094\n\u0094\f\u0094\u07db"+
		"\t\u0094\u0001\u0094\u0001\u0094\u0001\u0095\u0001\u0095\u0001\u0095\u0001"+
		"\u0095\u0001\u0095\u0005\u0095\u07e4\b\u0095\n\u0095\f\u0095\u07e7\t\u0095"+
		"\u0001\u0095\u0001\u0095\u0001\u0095\u0001\u0096\u0001\u0096\u0001\u0096"+
		"\u0005\u0096\u07ef\b\u0096\n\u0096\f\u0096\u07f2\t\u0096\u0001\u0096\u0001"+
		"\u0096\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0097\u0001"+
		"\u0097\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0097\u0005\u0097\u0800"+
		"\b\u0097\n\u0097\f\u0097\u0803\t\u0097\u0001\u0097\u0001\u0097\u0001\u0097"+
		"\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0098\u0005\u0098"+
		"\u080d\b\u0098\n\u0098\f\u0098\u0810\t\u0098\u0001\u0098\u0001\u0098\u0001"+
		"\u0098\u0001\u0098\u0001\u0099\u0001\u0099\u0001\u0099\u0001\u0099\u0001"+
		"\u009a\u0001\u009a\u0001\u009a\u0001\u009a\u0001\u009a\u0001\u009a\u0001"+
		"\u009a\u0001\u009a\u0001\u009a\u0005\u009a\u0823\b\u009a\n\u009a\f\u009a"+
		"\u0826\t\u009a\u0001\u009a\u0001\u009a\u0001\u009b\u0001\u009b\u0001\u009b"+
		"\u0001\u009b\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009d"+
		"\u0001\u009d\u0001\u009d\u0001\u009d\u0001\u009e\u0001\u009e\u0001\u009e"+
		"\u0005\u009e\u0839\b\u009e\n\u009e\f\u009e\u083c\t\u009e\u0001\u009e\u0001"+
		"\u009e\u0001\u009f\u0001\u009f\u0001\u009f\u0005\u009f\u0843\b\u009f\n"+
		"\u009f\f\u009f\u0846\t\u009f\u0001\u009f\u0001\u009f\u0001\u00a0\u0001"+
		"\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a0\u0001"+
		"\u00a0\u0001\u00a0\u0001\u00a0\u0005\u00a0\u0854\b\u00a0\n\u00a0\f\u00a0"+
		"\u0857\t\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a1\u0001\u00a1\u0001\u00a1"+
		"\u0001\u00a1\u0001\u00a2\u0001\u00a2\u0001\u00a2\u0001\u00a2\u0001\u00a3"+
		"\u0001\u00a3\u0001\u00a3\u0001\u00a3\u0001\u00a4\u0001\u00a4\u0001\u00a4"+
		"\u0005\u00a4\u086a\b\u00a4\n\u00a4\f\u00a4\u086d\t\u00a4\u0001\u00a4\u0001"+
		"\u00a4\u0001\u00a5\u0001\u00a5\u0001\u00a5\u0005\u00a5\u0874\b\u00a5\n"+
		"\u00a5\f\u00a5\u0877\t\u00a5\u0001\u00a5\u0001\u00a5\u0001\u00a6\u0001"+
		"\u00a6\u0001\u00a6\u0001\u00a6\u0001\u00a6\u0001\u00a6\u0000\u0000\u00a7"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112"+
		"\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a"+
		"\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142"+
		"\u0144\u0146\u0148\u014a\u014c\u0000\u0014\u0001\u0000&\'\u0002\u0000"+
		"\b\b\n\n\u0004\u0000\u0003\u0004\u0007\nYY\u00ca\u00ca\u0001\u0000\u0003"+
		"\u0004\u0002\u0000\u0007\u0007YY\u0001\u0000Z[\u0002\u0000\t\t\u00ca\u00ca"+
		"\u0002\u0000\b\b\u00ca\u00ca\u0002\u0000YY\u00ca\u00ca\u0004\u0000\u0001"+
		"\u0002\u0005\u0005\u0007\u0007YY\u0001\u0000\u00b9\u00ba\u0001\u0000\u007f"+
		"\u0081\u0001\u0000\u0083\u0085\u0002\u0000\u0088\u0089\u008b\u008e\u0001"+
		"\u0000\u00ca\u00cb\u0002\u0000\t\t\u00ca\u00cb\u0001\u0000\u009d\u009e"+
		"\u0001\u0000BC\u0001\u0000=A\u0001\u0000\u00b1\u00b2\u0913\u0000\u01c0"+
		"\u0001\u0000\u0000\u0000\u0002\u01c2\u0001\u0000\u0000\u0000\u0004\u01ce"+
		"\u0001\u0000\u0000\u0000\u0006\u01d0\u0001\u0000\u0000\u0000\b\u01da\u0001"+
		"\u0000\u0000\u0000\n\u01e4\u0001\u0000\u0000\u0000\f\u01ee\u0001\u0000"+
		"\u0000\u0000\u000e\u01f8\u0001\u0000\u0000\u0000\u0010\u0202\u0001\u0000"+
		"\u0000\u0000\u0012\u0212\u0001\u0000\u0000\u0000\u0014\u021d\u0001\u0000"+
		"\u0000\u0000\u0016\u0227\u0001\u0000\u0000\u0000\u0018\u0233\u0001\u0000"+
		"\u0000\u0000\u001a\u0246\u0001\u0000\u0000\u0000\u001c\u0254\u0001\u0000"+
		"\u0000\u0000\u001e\u0258\u0001\u0000\u0000\u0000 \u0262\u0001\u0000\u0000"+
		"\u0000\"\u026c\u0001\u0000\u0000\u0000$\u0270\u0001\u0000\u0000\u0000"+
		"&\u027b\u0001\u0000\u0000\u0000(\u027d\u0001\u0000\u0000\u0000*\u0281"+
		"\u0001\u0000\u0000\u0000,\u0285\u0001\u0000\u0000\u0000.\u0289\u0001\u0000"+
		"\u0000\u00000\u028b\u0001\u0000\u0000\u00002\u028f\u0001\u0000\u0000\u0000"+
		"4\u0299\u0001\u0000\u0000\u00006\u02a3\u0001\u0000\u0000\u00008\u02ae"+
		"\u0001\u0000\u0000\u0000:\u02bf\u0001\u0000\u0000\u0000<\u02ca\u0001\u0000"+
		"\u0000\u0000>\u02d7\u0001\u0000\u0000\u0000@\u02e4\u0001\u0000\u0000\u0000"+
		"B\u02e8\u0001\u0000\u0000\u0000D\u0303\u0001\u0000\u0000\u0000F\u0305"+
		"\u0001\u0000\u0000\u0000H\u030f\u0001\u0000\u0000\u0000J\u0319\u0001\u0000"+
		"\u0000\u0000L\u0323\u0001\u0000\u0000\u0000N\u032d\u0001\u0000\u0000\u0000"+
		"P\u0337\u0001\u0000\u0000\u0000R\u0341\u0001\u0000\u0000\u0000T\u0350"+
		"\u0001\u0000\u0000\u0000V\u035f\u0001\u0000\u0000\u0000X\u036e\u0001\u0000"+
		"\u0000\u0000Z\u037d\u0001\u0000\u0000\u0000\\\u038c\u0001\u0000\u0000"+
		"\u0000^\u039b\u0001\u0000\u0000\u0000`\u03a9\u0001\u0000\u0000\u0000b"+
		"\u03ad\u0001\u0000\u0000\u0000d\u03c5\u0001\u0000\u0000\u0000f\u03c7\u0001"+
		"\u0000\u0000\u0000h\u03d3\u0001\u0000\u0000\u0000j\u03e5\u0001\u0000\u0000"+
		"\u0000l\u03f0\u0001\u0000\u0000\u0000n\u03ff\u0001\u0000\u0000\u0000p"+
		"\u0409\u0001\u0000\u0000\u0000r\u0413\u0001\u0000\u0000\u0000t\u041d\u0001"+
		"\u0000\u0000\u0000v\u0427\u0001\u0000\u0000\u0000x\u0431\u0001\u0000\u0000"+
		"\u0000z\u0435\u0001\u0000\u0000\u0000|\u0439\u0001\u0000\u0000\u0000~"+
		"\u043d\u0001\u0000\u0000\u0000\u0080\u0447\u0001\u0000\u0000\u0000\u0082"+
		"\u046f\u0001\u0000\u0000\u0000\u0084\u0471\u0001\u0000\u0000\u0000\u0086"+
		"\u0483\u0001\u0000\u0000\u0000\u0088\u048d\u0001\u0000\u0000\u0000\u008a"+
		"\u0497\u0001\u0000\u0000\u0000\u008c\u04a4\u0001\u0000\u0000\u0000\u008e"+
		"\u04b9\u0001\u0000\u0000\u0000\u0090\u04bb\u0001\u0000\u0000\u0000\u0092"+
		"\u04d9\u0001\u0000\u0000\u0000\u0094\u04db\u0001\u0000\u0000\u0000\u0096"+
		"\u04ee\u0001\u0000\u0000\u0000\u0098\u04fa\u0001\u0000\u0000\u0000\u009a"+
		"\u04fe\u0001\u0000\u0000\u0000\u009c\u0508\u0001\u0000\u0000\u0000\u009e"+
		"\u051b\u0001\u0000\u0000\u0000\u00a0\u052e\u0001\u0000\u0000\u0000\u00a2"+
		"\u053a\u0001\u0000\u0000\u0000\u00a4\u0553\u0001\u0000\u0000\u0000\u00a6"+
		"\u055d\u0001\u0000\u0000\u0000\u00a8\u0567\u0001\u0000\u0000\u0000\u00aa"+
		"\u0575\u0001\u0000\u0000\u0000\u00ac\u0583\u0001\u0000\u0000\u0000\u00ae"+
		"\u0587\u0001\u0000\u0000\u0000\u00b0\u05a1\u0001\u0000\u0000\u0000\u00b2"+
		"\u05ab\u0001\u0000\u0000\u0000\u00b4\u05cf\u0001\u0000\u0000\u0000\u00b6"+
		"\u05d3\u0001\u0000\u0000\u0000\u00b8\u05de\u0001\u0000\u0000\u0000\u00ba"+
		"\u05e9\u0001\u0000\u0000\u0000\u00bc\u0600\u0001\u0000\u0000\u0000\u00be"+
		"\u0606\u0001\u0000\u0000\u0000\u00c0\u0608\u0001\u0000\u0000\u0000\u00c2"+
		"\u0618\u0001\u0000\u0000\u0000\u00c4\u061c\u0001\u0000\u0000\u0000\u00c6"+
		"\u0620\u0001\u0000\u0000\u0000\u00c8\u0630\u0001\u0000\u0000\u0000\u00ca"+
		"\u0634\u0001\u0000\u0000\u0000\u00cc\u063e\u0001\u0000\u0000\u0000\u00ce"+
		"\u0642\u0001\u0000\u0000\u0000\u00d0\u0646\u0001\u0000\u0000\u0000\u00d2"+
		"\u065a\u0001\u0000\u0000\u0000\u00d4\u065e\u0001\u0000\u0000\u0000\u00d6"+
		"\u0662\u0001\u0000\u0000\u0000\u00d8\u0669\u0001\u0000\u0000\u0000\u00da"+
		"\u066b\u0001\u0000\u0000\u0000\u00dc\u0675\u0001\u0000\u0000\u0000\u00de"+
		"\u067f\u0001\u0000\u0000\u0000\u00e0\u0689\u0001\u0000\u0000\u0000\u00e2"+
		"\u069c\u0001\u0000\u0000\u0000\u00e4\u06a0\u0001\u0000\u0000\u0000\u00e6"+
		"\u06a4\u0001\u0000\u0000\u0000\u00e8\u06a8\u0001\u0000\u0000\u0000\u00ea"+
		"\u06ac\u0001\u0000\u0000\u0000\u00ec\u06b0\u0001\u0000\u0000\u0000\u00ee"+
		"\u06b4\u0001\u0000\u0000\u0000\u00f0\u06b8\u0001\u0000\u0000\u0000\u00f2"+
		"\u06bc\u0001\u0000\u0000\u0000\u00f4\u06c6\u0001\u0000\u0000\u0000\u00f6"+
		"\u06ca\u0001\u0000\u0000\u0000\u00f8\u06ce\u0001\u0000\u0000\u0000\u00fa"+
		"\u06db\u0001\u0000\u0000\u0000\u00fc\u06dd\u0001\u0000\u0000\u0000\u00fe"+
		"\u06fc\u0001\u0000\u0000\u0000\u0100\u0706\u0001\u0000\u0000\u0000\u0102"+
		"\u0710\u0001\u0000\u0000\u0000\u0104\u0719\u0001\u0000\u0000\u0000\u0106"+
		"\u071d\u0001\u0000\u0000\u0000\u0108\u0721\u0001\u0000\u0000\u0000\u010a"+
		"\u0725\u0001\u0000\u0000\u0000\u010c\u0729\u0001\u0000\u0000\u0000\u010e"+
		"\u0734\u0001\u0000\u0000\u0000\u0110\u0736\u0001\u0000\u0000\u0000\u0112"+
		"\u073a\u0001\u0000\u0000\u0000\u0114\u073e\u0001\u0000\u0000\u0000\u0116"+
		"\u0742\u0001\u0000\u0000\u0000\u0118\u0752\u0001\u0000\u0000\u0000\u011a"+
		"\u0779\u0001\u0000\u0000\u0000\u011c\u07a8\u0001\u0000\u0000\u0000\u011e"+
		"\u07ad\u0001\u0000\u0000\u0000\u0120\u07b3\u0001\u0000\u0000\u0000\u0122"+
		"\u07bb\u0001\u0000\u0000\u0000\u0124\u07bf\u0001\u0000\u0000\u0000\u0126"+
		"\u07c9\u0001\u0000\u0000\u0000\u0128\u07d4\u0001\u0000\u0000\u0000\u012a"+
		"\u07de\u0001\u0000\u0000\u0000\u012c\u07eb\u0001\u0000\u0000\u0000\u012e"+
		"\u07f5\u0001\u0000\u0000\u0000\u0130\u0807\u0001\u0000\u0000\u0000\u0132"+
		"\u0815\u0001\u0000\u0000\u0000\u0134\u0819\u0001\u0000\u0000\u0000\u0136"+
		"\u0829\u0001\u0000\u0000\u0000\u0138\u082d\u0001\u0000\u0000\u0000\u013a"+
		"\u0831\u0001\u0000\u0000\u0000\u013c\u0835\u0001\u0000\u0000\u0000\u013e"+
		"\u083f\u0001\u0000\u0000\u0000\u0140\u0849\u0001\u0000\u0000\u0000\u0142"+
		"\u085a\u0001\u0000\u0000\u0000\u0144\u085e\u0001\u0000\u0000\u0000\u0146"+
		"\u0862\u0001\u0000\u0000\u0000\u0148\u0866\u0001\u0000\u0000\u0000\u014a"+
		"\u0870\u0001\u0000\u0000\u0000\u014c\u087a\u0001\u0000\u0000\u0000\u014e"+
		"\u0150\u0003\u0130\u0098\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u0150"+
		"\u0153\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151"+
		"\u0152\u0001\u0000\u0000\u0000\u0152\u01c1\u0001\u0000\u0000\u0000\u0153"+
		"\u0151\u0001\u0000\u0000\u0000\u0154\u0156\u0003\u012e\u0097\u0000\u0155"+
		"\u0154\u0001\u0000\u0000\u0000\u0156\u0159\u0001\u0000\u0000\u0000\u0157"+
		"\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158"+
		"\u01c1\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u015a"+
		"\u015c\u0003\u0120\u0090\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015c"+
		"\u015f\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d"+
		"\u015e\u0001\u0000\u0000\u0000\u015e\u01c1\u0001\u0000\u0000\u0000\u015f"+
		"\u015d\u0001\u0000\u0000\u0000\u0160\u0162\u0003\u011a\u008d\u0000\u0161"+
		"\u0160\u0001\u0000\u0000\u0000\u0162\u0165\u0001\u0000\u0000\u0000\u0163"+
		"\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164"+
		"\u01c1\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0166"+
		"\u0168\u0003\u0118\u008c\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0168"+
		"\u016b\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169"+
		"\u016a\u0001\u0000\u0000\u0000\u016a\u01c1\u0001\u0000\u0000\u0000\u016b"+
		"\u0169\u0001\u0000\u0000\u0000\u016c\u016e\u0003\u0116\u008b\u0000\u016d"+
		"\u016c\u0001\u0000\u0000\u0000\u016e\u0171\u0001\u0000\u0000\u0000\u016f"+
		"\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170"+
		"\u01c1\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172"+
		"\u0174\u0003\u00fc~\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0174\u0177"+
		"\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176"+
		"\u0001\u0000\u0000\u0000\u0176\u01c1\u0001\u0000\u0000\u0000\u0177\u0175"+
		"\u0001\u0000\u0000\u0000\u0178\u017a\u0003\u00e0p\u0000\u0179\u0178\u0001"+
		"\u0000\u0000\u0000\u017a\u017d\u0001\u0000\u0000\u0000\u017b\u0179\u0001"+
		"\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u01c1\u0001"+
		"\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017e\u0180\u0003"+
		"\u00d0h\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u0180\u0183\u0001\u0000"+
		"\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000"+
		"\u0000\u0000\u0182\u01c1\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000"+
		"\u0000\u0000\u0184\u0186\u0003\u00c0`\u0000\u0185\u0184\u0001\u0000\u0000"+
		"\u0000\u0186\u0189\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000"+
		"\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u01c1\u0001\u0000\u0000"+
		"\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u018a\u018c\u0003\u00b4Z\u0000"+
		"\u018b\u018a\u0001\u0000\u0000\u0000\u018c\u018f\u0001\u0000\u0000\u0000"+
		"\u018d\u018b\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000"+
		"\u018e\u01c1\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000"+
		"\u0190\u0192\u0003\u00aeW\u0000\u0191\u0190\u0001\u0000\u0000\u0000\u0192"+
		"\u0195\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0193"+
		"\u0194\u0001\u0000\u0000\u0000\u0194\u01c1\u0001\u0000\u0000\u0000\u0195"+
		"\u0193\u0001\u0000\u0000\u0000\u0196\u0198\u0003\u00acV\u0000\u0197\u0196"+
		"\u0001\u0000\u0000\u0000\u0198\u019b\u0001\u0000\u0000\u0000\u0199\u0197"+
		"\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u01c1"+
		"\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u019e"+
		"\u0003\u00a8T\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019e\u01a1\u0001"+
		"\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a0\u01c1\u0001\u0000\u0000\u0000\u01a1\u019f\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a4\u0003\u00a2Q\u0000\u01a3\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a7\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01c1\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a8\u01aa\u0003\u0096"+
		"K\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ad\u0001\u0000\u0000"+
		"\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000"+
		"\u0000\u01ac\u01c1\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000"+
		"\u0000\u01ae\u01b0\u0003\u0094J\u0000\u01af\u01ae\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b3\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000"+
		"\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01c1\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b4\u01b6\u0003\u0090H\u0000\u01b5"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b9\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8"+
		"\u01c1\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01ba"+
		"\u01bc\u0003\u008cF\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bf"+
		"\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd\u01be"+
		"\u0001\u0000\u0000\u0000\u01be\u01c1\u0001\u0000\u0000\u0000\u01bf\u01bd"+
		"\u0001\u0000\u0000\u0000\u01c0\u0151\u0001\u0000\u0000\u0000\u01c0\u0157"+
		"\u0001\u0000\u0000\u0000\u01c0\u015d\u0001\u0000\u0000\u0000\u01c0\u0163"+
		"\u0001\u0000\u0000\u0000\u01c0\u0169\u0001\u0000\u0000\u0000\u01c0\u016f"+
		"\u0001\u0000\u0000\u0000\u01c0\u0175\u0001\u0000\u0000\u0000\u01c0\u017b"+
		"\u0001\u0000\u0000\u0000\u01c0\u0181\u0001\u0000\u0000\u0000\u01c0\u0187"+
		"\u0001\u0000\u0000\u0000\u01c0\u018d\u0001\u0000\u0000\u0000\u01c0\u0193"+
		"\u0001\u0000\u0000\u0000\u01c0\u0199\u0001\u0000\u0000\u0000\u01c0\u019f"+
		"\u0001\u0000\u0000\u0000\u01c0\u01a5\u0001\u0000\u0000\u0000\u01c0\u01ab"+
		"\u0001\u0000\u0000\u0000\u01c0\u01b1\u0001\u0000\u0000\u0000\u01c0\u01b7"+
		"\u0001\u0000\u0000\u0000\u01c0\u01bd\u0001\u0000\u0000\u0000\u01c1\u0001"+
		"\u0001\u0000\u0000\u0000\u01c2\u01c7\u0005\u000e\u0000\u0000\u01c3\u01c6"+
		"\u0003\u0004\u0002\u0000\u01c4\u01c6\u00038\u001c\u0000\u01c5\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c9\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001"+
		"\u0000\u0000\u0000\u01c8\u01ca\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001"+
		"\u0000\u0000\u0000\u01ca\u01cb\u0005\u000f\u0000\u0000\u01cb\u0003\u0001"+
		"\u0000\u0000\u0000\u01cc\u01cf\u0003D\"\u0000\u01cd\u01cf\u0003\u0002"+
		"\u0001\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cd\u0001\u0000"+
		"\u0000\u0000\u01cf\u0005\u0001\u0000\u0000\u0000\u01d0\u01d1\u0005 \u0000"+
		"\u0000\u01d1\u01d5\u0005\u0010\u0000\u0000\u01d2\u01d4\u0003d2\u0000\u01d3"+
		"\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d7\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d8\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d8"+
		"\u01d9\u0005\u000f\u0000\u0000\u01d9\u0007\u0001\u0000\u0000\u0000\u01da"+
		"\u01db\u0005\u001f\u0000\u0000\u01db\u01df\u0005\u0010\u0000\u0000\u01dc"+
		"\u01de\u0003d2\u0000\u01dd\u01dc\u0001\u0000\u0000\u0000\u01de\u01e1\u0001"+
		"\u0000\u0000\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01df\u01e0\u0001"+
		"\u0000\u0000\u0000\u01e0\u01e2\u0001\u0000\u0000\u0000\u01e1\u01df\u0001"+
		"\u0000\u0000\u0000\u01e2\u01e3\u0005\u000f\u0000\u0000\u01e3\t\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e5\u0005!\u0000\u0000\u01e5\u01e9\u0005\u0010\u0000"+
		"\u0000\u01e6\u01e8\u0003D\"\u0000\u01e7\u01e6\u0001\u0000\u0000\u0000"+
		"\u01e8\u01eb\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000"+
		"\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea\u01ec\u0001\u0000\u0000\u0000"+
		"\u01eb\u01e9\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005\u000f\u0000\u0000"+
		"\u01ed\u000b\u0001\u0000\u0000\u0000\u01ee\u01ef\u0005M\u0000\u0000\u01ef"+
		"\u01f3\u0005\u0010\u0000\u0000\u01f0\u01f2\u0003D\"\u0000\u01f1\u01f0"+
		"\u0001\u0000\u0000\u0000\u01f2\u01f5\u0001\u0000\u0000\u0000\u01f3\u01f1"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f6"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f6\u01f7"+
		"\u0005\u000f\u0000\u0000\u01f7\r\u0001\u0000\u0000\u0000\u01f8\u01f9\u0005"+
		"^\u0000\u0000\u01f9\u01fd\u0005\u0010\u0000\u0000\u01fa\u01fc\u0003@ "+
		"\u0000\u01fb\u01fa\u0001\u0000\u0000\u0000\u01fc\u01ff\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000"+
		"\u0000\u01fe\u0200\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000"+
		"\u0000\u0200\u0201\u0005\u000f\u0000\u0000\u0201\u000f\u0001\u0000\u0000"+
		"\u0000\u0202\u0203\u0005_\u0000\u0000\u0203\u0207\u0005\u0010\u0000\u0000"+
		"\u0204\u0206\u0003\"\u0011\u0000\u0205\u0204\u0001\u0000\u0000\u0000\u0206"+
		"\u0209\u0001\u0000\u0000\u0000\u0207\u0205\u0001\u0000\u0000\u0000\u0207"+
		"\u0208\u0001\u0000\u0000\u0000\u0208\u020d\u0001\u0000\u0000\u0000\u0209"+
		"\u0207\u0001\u0000\u0000\u0000\u020a\u020c\u0003$\u0012\u0000\u020b\u020a"+
		"\u0001\u0000\u0000\u0000\u020c\u020f\u0001\u0000\u0000\u0000\u020d\u020b"+
		"\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e\u0210"+
		"\u0001\u0000\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u0210\u0211"+
		"\u0005\u000f\u0000\u0000\u0211\u0011\u0001\u0000\u0000\u0000\u0212\u0213"+
		"\u0005`\u0000\u0000\u0213\u0214\u0005\u0010\u0000\u0000\u0214\u0218\u0003"+
		"\"\u0011\u0000\u0215\u0217\u0003$\u0012\u0000\u0216\u0215\u0001\u0000"+
		"\u0000\u0000\u0217\u021a\u0001\u0000\u0000\u0000\u0218\u0216\u0001\u0000"+
		"\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u021b\u0001\u0000"+
		"\u0000\u0000\u021a\u0218\u0001\u0000\u0000\u0000\u021b\u021c\u0005\u000f"+
		"\u0000\u0000\u021c\u0013\u0001\u0000\u0000\u0000\u021d\u021e\u0005\"\u0000"+
		"\u0000\u021e\u0222\u0005\u0010\u0000\u0000\u021f\u0221\u0003d2\u0000\u0220"+
		"\u021f\u0001\u0000\u0000\u0000\u0221\u0224\u0001\u0000\u0000\u0000\u0222"+
		"\u0220\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000\u0000\u0223"+
		"\u0225\u0001\u0000\u0000\u0000\u0224\u0222\u0001\u0000\u0000\u0000\u0225"+
		"\u0226\u0005\u000f\u0000\u0000\u0226\u0015\u0001\u0000\u0000\u0000\u0227"+
		"\u0228\u0007\u0000\u0000\u0000\u0228\u022d\u0005\u0010\u0000\u0000\u0229"+
		"\u022a\u0005&\u0000\u0000\u022a\u022b\u0005\u0011\u0000\u0000\u022b\u022e"+
		"\u0005\t\u0000\u0000\u022c\u022e\u0003\u0006\u0003\u0000\u022d\u0229\u0001"+
		"\u0000\u0000\u0000\u022d\u022c\u0001\u0000\u0000\u0000\u022e\u022f\u0001"+
		"\u0000\u0000\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u022f\u0230\u0001"+
		"\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231\u0232\u0005"+
		"\u000f\u0000\u0000\u0232\u0017\u0001\u0000\u0000\u0000\u0233\u0234\u0005"+
		".\u0000\u0000\u0234\u0236\u0005\u0010\u0000\u0000\u0235\u0237\u0005\b"+
		"\u0000\u0000\u0236\u0235\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000"+
		"\u0000\u0000\u0238\u0236\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000"+
		"\u0000\u0000\u0239\u023b\u0001\u0000\u0000\u0000\u023a\u023c\u0005\b\u0000"+
		"\u0000\u023b\u023a\u0001\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000"+
		"\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000"+
		"\u0000\u023e\u0240\u0001\u0000\u0000\u0000\u023f\u0241\u0005\b\u0000\u0000"+
		"\u0240\u023f\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000\u0000\u0000"+
		"\u0242\u0240\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000"+
		"\u0243\u0244\u0001\u0000\u0000\u0000\u0244\u0245\u0005\u000f\u0000\u0000"+
		"\u0245\u0019\u0001\u0000\u0000\u0000\u0246\u0247\u0005\u0096\u0000\u0000"+
		"\u0247\u024f\u0005\u0010\u0000\u0000\u0248\u024a\u0005\b\u0000\u0000\u0249"+
		"\u0248\u0001\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b"+
		"\u0249\u0001\u0000\u0000\u0000\u024b\u024c\u0001\u0000\u0000\u0000\u024c"+
		"\u024e\u0001\u0000\u0000\u0000\u024d\u0249\u0001\u0000\u0000\u0000\u024e"+
		"\u0251\u0001\u0000\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u024f"+
		"\u0250\u0001\u0000\u0000\u0000\u0250\u0252\u0001\u0000\u0000\u0000\u0251"+
		"\u024f\u0001\u0000\u0000\u0000\u0252\u0253\u0005\u000f\u0000\u0000\u0253"+
		"\u001b\u0001\u0000\u0000\u0000\u0254\u0255\u0005z\u0000\u0000\u0255\u0256"+
		"\u0005\u0011\u0000\u0000\u0256\u0257\u0005\t\u0000\u0000\u0257\u001d\u0001"+
		"\u0000\u0000\u0000\u0258\u0259\u0005{\u0000\u0000\u0259\u025a\u0005\u0010"+
		"\u0000\u0000\u025a\u025b\u0005}\u0000\u0000\u025b\u025c\u0005\u0011\u0000"+
		"\u0000\u025c\u025d\u0005\b\u0000\u0000\u025d\u025e\u0005~\u0000\u0000"+
		"\u025e\u025f\u0005\u0011\u0000\u0000\u025f\u0260\u0005\b\u0000\u0000\u0260"+
		"\u0261\u0005\u000f\u0000\u0000\u0261\u001f\u0001\u0000\u0000\u0000\u0262"+
		"\u0263\u0005\"\u0000\u0000\u0263\u0267\u0005\u0010\u0000\u0000\u0264\u0266"+
		"\u0003d2\u0000\u0265\u0264\u0001\u0000\u0000\u0000\u0266\u0269\u0001\u0000"+
		"\u0000\u0000\u0267\u0265\u0001\u0000\u0000\u0000\u0267\u0268\u0001\u0000"+
		"\u0000\u0000\u0268\u026a\u0001\u0000\u0000\u0000\u0269\u0267\u0001\u0000"+
		"\u0000\u0000\u026a\u026b\u0005\u000f\u0000\u0000\u026b!\u0001\u0000\u0000"+
		"\u0000\u026c\u026d\u0005a\u0000\u0000\u026d\u026e\u0005\u0011\u0000\u0000"+
		"\u026e\u026f\u0007\u0001\u0000\u0000\u026f#\u0001\u0000\u0000\u0000\u0270"+
		"\u0271\u0005^\u0000\u0000\u0271\u0276\u0005\u0010\u0000\u0000\u0272\u0275"+
		"\u0003\"\u0011\u0000\u0273\u0275\u0003d2\u0000\u0274\u0272\u0001\u0000"+
		"\u0000\u0000\u0274\u0273\u0001\u0000\u0000\u0000\u0275\u0278\u0001\u0000"+
		"\u0000\u0000\u0276\u0274\u0001\u0000\u0000\u0000\u0276\u0277\u0001\u0000"+
		"\u0000\u0000\u0277\u0279\u0001\u0000\u0000\u0000\u0278\u0276\u0001\u0000"+
		"\u0000\u0000\u0279\u027a\u0005\u000f\u0000\u0000\u027a%\u0001\u0000\u0000"+
		"\u0000\u027b\u027c\u0007\u0002\u0000\u0000\u027c\'\u0001\u0000\u0000\u0000"+
		"\u027d\u027e\u0005$\u0000\u0000\u027e\u027f\u0005\u0011\u0000\u0000\u027f"+
		"\u0280\u0005\b\u0000\u0000\u0280)\u0001\u0000\u0000\u0000\u0281\u0282"+
		"\u0005&\u0000\u0000\u0282\u0283\u0005\u0011\u0000\u0000\u0283\u0284\u0005"+
		"\t\u0000\u0000\u0284+\u0001\u0000\u0000\u0000\u0285\u0286\u0005%\u0000"+
		"\u0000\u0286\u0287\u0005\u0011\u0000\u0000\u0287\u0288\u0005\u000b\u0000"+
		"\u0000\u0288-\u0001\u0000\u0000\u0000\u0289\u028a\u0007\u0003\u0000\u0000"+
		"\u028a/\u0001\u0000\u0000\u0000\u028b\u028c\u0005\f\u0000\u0000\u028c"+
		"\u028d\u0005\u0011\u0000\u0000\u028d\u028e\u0005\b\u0000\u0000\u028e1"+
		"\u0001\u0000\u0000\u0000\u028f\u0290\u0005\u001c\u0000\u0000\u0290\u0294"+
		"\u0005\u0010\u0000\u0000\u0291\u0293\u0003d2\u0000\u0292\u0291\u0001\u0000"+
		"\u0000\u0000\u0293\u0296\u0001\u0000\u0000\u0000\u0294\u0292\u0001\u0000"+
		"\u0000\u0000\u0294\u0295\u0001\u0000\u0000\u0000\u0295\u0297\u0001\u0000"+
		"\u0000\u0000\u0296\u0294\u0001\u0000\u0000\u0000\u0297\u0298\u0005\u000f"+
		"\u0000\u0000\u02983\u0001\u0000\u0000\u0000\u0299\u029a\u0005\u001a\u0000"+
		"\u0000\u029a\u029e\u0005\u0010\u0000\u0000\u029b\u029d\u0003D\"\u0000"+
		"\u029c\u029b\u0001\u0000\u0000\u0000\u029d\u02a0\u0001\u0000\u0000\u0000"+
		"\u029e\u029c\u0001\u0000\u0000\u0000\u029e\u029f\u0001\u0000\u0000\u0000"+
		"\u029f\u02a1\u0001\u0000\u0000\u0000\u02a0\u029e\u0001\u0000\u0000\u0000"+
		"\u02a1\u02a2\u0005\u000f\u0000\u0000\u02a25\u0001\u0000\u0000\u0000\u02a3"+
		"\u02a4\u0005\u001b\u0000\u0000\u02a4\u02a5\u0005\u0010\u0000\u0000\u02a5"+
		"\u02a9\u00032\u0019\u0000\u02a6\u02a8\u0003D\"\u0000\u02a7\u02a6\u0001"+
		"\u0000\u0000\u0000\u02a8\u02ab\u0001\u0000\u0000\u0000\u02a9\u02a7\u0001"+
		"\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000\u02aa\u02ac\u0001"+
		"\u0000\u0000\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ac\u02ad\u0005"+
		"\u000f\u0000\u0000\u02ad7\u0001\u0000\u0000\u0000\u02ae\u02af\u0005\u0019"+
		"\u0000\u0000\u02af\u02b0\u0005\u0010\u0000\u0000\u02b0\u02b4\u00032\u0019"+
		"\u0000\u02b1\u02b3\u0003D\"\u0000\u02b2\u02b1\u0001\u0000\u0000\u0000"+
		"\u02b3\u02b6\u0001\u0000\u0000\u0000\u02b4\u02b2\u0001\u0000\u0000\u0000"+
		"\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b7\u0001\u0000\u0000\u0000"+
		"\u02b6\u02b4\u0001\u0000\u0000\u0000\u02b7\u02bc\u0005\u000f\u0000\u0000"+
		"\u02b8\u02bb\u00034\u001a\u0000\u02b9\u02bb\u00036\u001b\u0000\u02ba\u02b8"+
		"\u0001\u0000\u0000\u0000\u02ba\u02b9\u0001\u0000\u0000\u0000\u02bb\u02be"+
		"\u0001\u0000\u0000\u0000\u02bc\u02ba\u0001\u0000\u0000\u0000\u02bc\u02bd"+
		"\u0001\u0000\u0000\u0000\u02bd9\u0001\u0000\u0000\u0000\u02be\u02bc\u0001"+
		"\u0000\u0000\u0000\u02bf\u02c0\u0005\u001d\u0000\u0000\u02c0\u02c1\u0005"+
		"\u0010\u0000\u0000\u02c1\u02c5\u00032\u0019\u0000\u02c2\u02c4\u0003D\""+
		"\u0000\u02c3\u02c2\u0001\u0000\u0000\u0000\u02c4\u02c7\u0001\u0000\u0000"+
		"\u0000\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c5\u02c6\u0001\u0000\u0000"+
		"\u0000\u02c6\u02c8\u0001\u0000\u0000\u0000\u02c7\u02c5\u0001\u0000\u0000"+
		"\u0000\u02c8\u02c9\u0005\u000f\u0000\u0000\u02c9;\u0001\u0000\u0000\u0000"+
		"\u02ca\u02cb\u0007\u0004\u0000\u0000\u02cb\u02d2\u0005\u0010\u0000\u0000"+
		"\u02cc\u02d1\u0003D\"\u0000\u02cd\u02d1\u0003d2\u0000\u02ce\u02d1\u0003"+
		"<\u001e\u0000\u02cf\u02d1\u00032\u0019\u0000\u02d0\u02cc\u0001\u0000\u0000"+
		"\u0000\u02d0\u02cd\u0001\u0000\u0000\u0000\u02d0\u02ce\u0001\u0000\u0000"+
		"\u0000\u02d0\u02cf\u0001\u0000\u0000\u0000\u02d1\u02d4\u0001\u0000\u0000"+
		"\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000"+
		"\u0000\u02d3\u02d5\u0001\u0000\u0000\u0000\u02d4\u02d2\u0001\u0000\u0000"+
		"\u0000\u02d5\u02d6\u0005\u000f\u0000\u0000\u02d6=\u0001\u0000\u0000\u0000"+
		"\u02d7\u02d8\u0005\u00ca\u0000\u0000\u02d8\u02e2\u0005\u0011\u0000\u0000"+
		"\u02d9\u02dd\u0005\u000e\u0000\u0000\u02da\u02dc\u0003\u0004\u0002\u0000"+
		"\u02db\u02da\u0001\u0000\u0000\u0000\u02dc\u02df\u0001\u0000\u0000\u0000"+
		"\u02dd\u02db\u0001\u0000\u0000\u0000\u02dd\u02de\u0001\u0000\u0000\u0000"+
		"\u02de\u02e0\u0001\u0000\u0000\u0000\u02df\u02dd\u0001\u0000\u0000\u0000"+
		"\u02e0\u02e3\u0005\u000f\u0000\u0000\u02e1\u02e3\u0005\u0003\u0000\u0000"+
		"\u02e2\u02d9\u0001\u0000\u0000\u0000\u02e2\u02e1\u0001\u0000\u0000\u0000"+
		"\u02e3?\u0001\u0000\u0000\u0000\u02e4\u02e5\u0005\u00ca\u0000\u0000\u02e5"+
		"\u02e6\u0005\u0011\u0000\u0000\u02e6\u02e7\u0007\u0002\u0000\u0000\u02e7"+
		"A\u0001\u0000\u0000\u0000\u02e8\u02e9\u0005\u001e\u0000\u0000\u02e9\u02ea"+
		"\u0005\u0010\u0000\u0000\u02ea\u02eb\u0003\u0006\u0003\u0000\u02eb\u02ec"+
		"\u0003\u000e\u0007\u0000\u02ec\u02ed\u0005\u000f\u0000\u0000\u02edC\u0001"+
		"\u0000\u0000\u0000\u02ee\u02ef\u0005\u00ca\u0000\u0000\u02ef\u02f0\u0005"+
		"\u0011\u0000\u0000\u02f0\u0304\u0007\u0002\u0000\u0000\u02f1\u0304\u0003"+
		">\u001f\u0000\u02f2\u0304\u00038\u001c\u0000\u02f3\u0304\u0003<\u001e"+
		"\u0000\u02f4\u0304\u0003\u00c4b\u0000\u02f5\u0304\u0003P(\u0000\u02f6"+
		"\u0304\u0003:\u001d\u0000\u02f7\u0304\u0003R)\u0000\u02f8\u0304\u0003"+
		"T*\u0000\u02f9\u0304\u0003V+\u0000\u02fa\u0304\u0003X,\u0000\u02fb\u0304"+
		"\u0003Z-\u0000\u02fc\u0304\u0003\\.\u0000\u02fd\u0304\u0003N\'\u0000\u02fe"+
		"\u0304\u0003F#\u0000\u02ff\u0304\u0003H$\u0000\u0300\u0304\u0003J%\u0000"+
		"\u0301\u0304\u0003L&\u0000\u0302\u0304\u0003^/\u0000\u0303\u02ee\u0001"+
		"\u0000\u0000\u0000\u0303\u02f1\u0001\u0000\u0000\u0000\u0303\u02f2\u0001"+
		"\u0000\u0000\u0000\u0303\u02f3\u0001\u0000\u0000\u0000\u0303\u02f4\u0001"+
		"\u0000\u0000\u0000\u0303\u02f5\u0001\u0000\u0000\u0000\u0303\u02f6\u0001"+
		"\u0000\u0000\u0000\u0303\u02f7\u0001\u0000\u0000\u0000\u0303\u02f8\u0001"+
		"\u0000\u0000\u0000\u0303\u02f9\u0001\u0000\u0000\u0000\u0303\u02fa\u0001"+
		"\u0000\u0000\u0000\u0303\u02fb\u0001\u0000\u0000\u0000\u0303\u02fc\u0001"+
		"\u0000\u0000\u0000\u0303\u02fd\u0001\u0000\u0000\u0000\u0303\u02fe\u0001"+
		"\u0000\u0000\u0000\u0303\u02ff\u0001\u0000\u0000\u0000\u0303\u0300\u0001"+
		"\u0000\u0000\u0000\u0303\u0301\u0001\u0000\u0000\u0000\u0303\u0302\u0001"+
		"\u0000\u0000\u0000\u0304E\u0001\u0000\u0000\u0000\u0305\u0306\u0005J\u0000"+
		"\u0000\u0306\u0307\u0005\u0010\u0000\u0000\u0307\u0308\u00058\u0000\u0000"+
		"\u0308\u0309\u0005\u0011\u0000\u0000\u0309\u030a\u0007\u0004\u0000\u0000"+
		"\u030a\u030b\u0005^\u0000\u0000\u030b\u030c\u0005\u0011\u0000\u0000\u030c"+
		"\u030d\u0005\u00ca\u0000\u0000\u030d\u030e\u0005\u000f\u0000\u0000\u030e"+
		"G\u0001\u0000\u0000\u0000\u030f\u0310\u0005I\u0000\u0000\u0310\u0311\u0005"+
		"\u0010\u0000\u0000\u0311\u0312\u00058\u0000\u0000\u0312\u0313\u0005\u0011"+
		"\u0000\u0000\u0313\u0314\u0007\u0004\u0000\u0000\u0314\u0315\u0005^\u0000"+
		"\u0000\u0315\u0316\u0005\u0011\u0000\u0000\u0316\u0317\u0005\u00ca\u0000"+
		"\u0000\u0317\u0318\u0005\u000f\u0000\u0000\u0318I\u0001\u0000\u0000\u0000"+
		"\u0319\u031a\u0005K\u0000\u0000\u031a\u031b\u0005\u0010\u0000\u0000\u031b"+
		"\u031c\u00058\u0000\u0000\u031c\u031d\u0005\u0011\u0000\u0000\u031d\u031e"+
		"\u0007\u0004\u0000\u0000\u031e\u031f\u0005^\u0000\u0000\u031f\u0320\u0005"+
		"\u0011\u0000\u0000\u0320\u0321\u0005\u00ca\u0000\u0000\u0321\u0322\u0005"+
		"\u000f\u0000\u0000\u0322K\u0001\u0000\u0000\u0000\u0323\u0324\u0005L\u0000"+
		"\u0000\u0324\u0325\u0005\u0010\u0000\u0000\u0325\u0326\u00058\u0000\u0000"+
		"\u0326\u0327\u0005\u0011\u0000\u0000\u0327\u0328\u0007\u0004\u0000\u0000"+
		"\u0328\u0329\u0005^\u0000\u0000\u0329\u032a\u0005\u0011\u0000\u0000\u032a"+
		"\u032b\u0005\u00ca\u0000\u0000\u032b\u032c\u0005\u000f\u0000\u0000\u032c"+
		"M\u0001\u0000\u0000\u0000\u032d\u032e\u0005G\u0000\u0000\u032e\u0332\u0005"+
		"\u0010\u0000\u0000\u032f\u0331\u0003D\"\u0000\u0330\u032f\u0001\u0000"+
		"\u0000\u0000\u0331\u0334\u0001\u0000\u0000\u0000\u0332\u0330\u0001\u0000"+
		"\u0000\u0000\u0332\u0333\u0001\u0000\u0000\u0000\u0333\u0335\u0001\u0000"+
		"\u0000\u0000\u0334\u0332\u0001\u0000\u0000\u0000\u0335\u0336\u0005\u000f"+
		"\u0000\u0000\u0336O\u0001\u0000\u0000\u0000\u0337\u0338\u0007\u0005\u0000"+
		"\u0000\u0338\u0339\u0005\u0010\u0000\u0000\u0339\u033a\u0005&\u0000\u0000"+
		"\u033a\u033b\u0005\u0011\u0000\u0000\u033b\u033c\u0007\u0006\u0000\u0000"+
		"\u033c\u033d\u0005\\\u0000\u0000\u033d\u033e\u0005\u0011\u0000\u0000\u033e"+
		"\u033f\u0005\b\u0000\u0000\u033f\u0340\u0005\u000f\u0000\u0000\u0340Q"+
		"\u0001\u0000\u0000\u0000\u0341\u0342\u00054\u0000\u0000\u0342\u0343\u0005"+
		"\u0010\u0000\u0000\u0343\u0344\u00056\u0000\u0000\u0344\u0345\u0005\u0011"+
		"\u0000\u0000\u0345\u034c\u0005\u00ca\u0000\u0000\u0346\u0347\u00056\u0000"+
		"\u0000\u0347\u0348\u0005\u0011\u0000\u0000\u0348\u034d\u0005\u00ca\u0000"+
		"\u0000\u0349\u034a\u00057\u0000\u0000\u034a\u034b\u0005\u0011\u0000\u0000"+
		"\u034b\u034d\u0007\u0001\u0000\u0000\u034c\u0346\u0001\u0000\u0000\u0000"+
		"\u034c\u0349\u0001\u0000\u0000\u0000\u034d\u034e\u0001\u0000\u0000\u0000"+
		"\u034e\u034f\u0005\u000f\u0000\u0000\u034fS\u0001\u0000\u0000\u0000\u0350"+
		"\u0351\u00050\u0000\u0000\u0351\u0352\u0005\u0010\u0000\u0000\u0352\u0353"+
		"\u00056\u0000\u0000\u0353\u0354\u0005\u0011\u0000\u0000\u0354\u035b\u0005"+
		"\u00ca\u0000\u0000\u0355\u0356\u00056\u0000\u0000\u0356\u0357\u0005\u0011"+
		"\u0000\u0000\u0357\u035c\u0005\u00ca\u0000\u0000\u0358\u0359\u00057\u0000"+
		"\u0000\u0359\u035a\u0005\u0011\u0000\u0000\u035a\u035c\u0007\u0001\u0000"+
		"\u0000\u035b\u0355\u0001\u0000\u0000\u0000\u035b\u0358\u0001\u0000\u0000"+
		"\u0000\u035c\u035d\u0001\u0000\u0000\u0000\u035d\u035e\u0005\u000f\u0000"+
		"\u0000\u035eU\u0001\u0000\u0000\u0000\u035f\u0360\u00051\u0000\u0000\u0360"+
		"\u0361\u0005\u0010\u0000\u0000\u0361\u0362\u00056\u0000\u0000\u0362\u0363"+
		"\u0005\u0011\u0000\u0000\u0363\u036a\u0005\u00ca\u0000\u0000\u0364\u0365"+
		"\u00056\u0000\u0000\u0365\u0366\u0005\u0011\u0000\u0000\u0366\u036b\u0005"+
		"\u00ca\u0000\u0000\u0367\u0368\u00057\u0000\u0000\u0368\u0369\u0005\u0011"+
		"\u0000\u0000\u0369\u036b\u0007\u0001\u0000\u0000\u036a\u0364\u0001\u0000"+
		"\u0000\u0000\u036a\u0367\u0001\u0000\u0000\u0000\u036b\u036c\u0001\u0000"+
		"\u0000\u0000\u036c\u036d\u0005\u000f\u0000\u0000\u036dW\u0001\u0000\u0000"+
		"\u0000\u036e\u036f\u00052\u0000\u0000\u036f\u0370\u0005\u0010\u0000\u0000"+
		"\u0370\u0371\u00056\u0000\u0000\u0371\u0372\u0005\u0011\u0000\u0000\u0372"+
		"\u0379\u0005\u00ca\u0000\u0000\u0373\u0374\u00056\u0000\u0000\u0374\u0375"+
		"\u0005\u0011\u0000\u0000\u0375\u037a\u0005\u00ca\u0000\u0000\u0376\u0377"+
		"\u00057\u0000\u0000\u0377\u0378\u0005\u0011\u0000\u0000\u0378\u037a\u0007"+
		"\u0001\u0000\u0000\u0379\u0373\u0001\u0000\u0000\u0000\u0379\u0376\u0001"+
		"\u0000\u0000\u0000\u037a\u037b\u0001\u0000\u0000\u0000\u037b\u037c\u0005"+
		"\u000f\u0000\u0000\u037cY\u0001\u0000\u0000\u0000\u037d\u037e\u00053\u0000"+
		"\u0000\u037e\u037f\u0005\u0010\u0000\u0000\u037f\u0380\u00056\u0000\u0000"+
		"\u0380\u0381\u0005\u0011\u0000\u0000\u0381\u0388\u0005\u00ca\u0000\u0000"+
		"\u0382\u0383\u00056\u0000\u0000\u0383\u0384\u0005\u0011\u0000\u0000\u0384"+
		"\u0389\u0005\u00ca\u0000\u0000\u0385\u0386\u00057\u0000\u0000\u0386\u0387"+
		"\u0005\u0011\u0000\u0000\u0387\u0389\u0007\u0001\u0000\u0000\u0388\u0382"+
		"\u0001\u0000\u0000\u0000\u0388\u0385\u0001\u0000\u0000\u0000\u0389\u038a"+
		"\u0001\u0000\u0000\u0000\u038a\u038b\u0005\u000f\u0000\u0000\u038b[\u0001"+
		"\u0000\u0000\u0000\u038c\u038d\u00055\u0000\u0000\u038d\u038e\u0005\u0010"+
		"\u0000\u0000\u038e\u038f\u00056\u0000\u0000\u038f\u0390\u0005\u0011\u0000"+
		"\u0000\u0390\u0391\u0005\u00ca\u0000\u0000\u0391\u0392\u00057\u0000\u0000"+
		"\u0392\u0393\u0005\u0011\u0000\u0000\u0393\u0397\u0005\u00ca\u0000\u0000"+
		"\u0394\u0395\u00058\u0000\u0000\u0395\u0396\u0005\u0011\u0000\u0000\u0396"+
		"\u0398\u0007\u0004\u0000\u0000\u0397\u0394\u0001\u0000\u0000\u0000\u0397"+
		"\u0398\u0001\u0000\u0000\u0000\u0398\u0399\u0001\u0000\u0000\u0000\u0399"+
		"\u039a\u0005\u000f\u0000\u0000\u039a]\u0001\u0000\u0000\u0000\u039b\u039c"+
		"\u0005W\u0000\u0000\u039c\u039d\u0005\u0010\u0000\u0000\u039d\u039e\u0005"+
		"X\u0000\u0000\u039e\u039f\u0005\u0011\u0000\u0000\u039f\u03a0\u0005\u00ca"+
		"\u0000\u0000\u03a0\u03a1\u0005\u0015\u0000\u0000\u03a1\u03a5\u0007\u0007"+
		"\u0000\u0000\u03a2\u03a3\u0005\r\u0000\u0000\u03a3\u03a4\u0005\u0011\u0000"+
		"\u0000\u03a4\u03a6\u0005\b\u0000\u0000\u03a5\u03a2\u0001\u0000\u0000\u0000"+
		"\u03a5\u03a6\u0001\u0000\u0000\u0000\u03a6\u03a7\u0001\u0000\u0000\u0000"+
		"\u03a7\u03a8\u0005\u000f\u0000\u0000\u03a8_\u0001\u0000\u0000\u0000\u03a9"+
		"\u03aa\u0005\u0006\u0000\u0000\u03aa\u03ab\u0005\u0011\u0000\u0000\u03ab"+
		"\u03ac\u0005\b\u0000\u0000\u03aca\u0001\u0000\u0000\u0000\u03ad\u03ae"+
		"\u0005\u0095\u0000\u0000\u03ae\u03af\u0005\u0011\u0000\u0000\u03af\u03b0"+
		"\u0007\b\u0000\u0000\u03b0c\u0001\u0000\u0000\u0000\u03b1\u03b2\u0005"+
		"\u00ca\u0000\u0000\u03b2\u03b3\u0005\u0011\u0000\u0000\u03b3\u03c6\u0007"+
		"\u0002\u0000\u0000\u03b4\u03c6\u0003r9\u0000\u03b5\u03c6\u0003\u00c6c"+
		"\u0000\u03b6\u03c6\u0003j5\u0000\u03b7\u03c6\u0003\u0086C\u0000\u03b8"+
		"\u03c6\u0003x<\u0000\u03b9\u03c6\u0003`0\u0000\u03ba\u03c6\u0003n7\u0000"+
		"\u03bb\u03c6\u0003p8\u0000\u03bc\u03c6\u00038\u001c\u0000\u03bd\u03c6"+
		"\u0003l6\u0000\u03be\u03c6\u0003h4\u0000\u03bf\u03c6\u0003b1\u0000\u03c0"+
		"\u03c6\u0003f3\u0000\u03c1\u03c6\u0003~?\u0000\u03c2\u03c6\u0003\u0080"+
		"@\u0000\u03c3\u03c6\u0003\u0084B\u0000\u03c4\u03c6\u0003|>\u0000\u03c5"+
		"\u03b1\u0001\u0000\u0000\u0000\u03c5\u03b4\u0001\u0000\u0000\u0000\u03c5"+
		"\u03b5\u0001\u0000\u0000\u0000\u03c5\u03b6\u0001\u0000\u0000\u0000\u03c5"+
		"\u03b7\u0001\u0000\u0000\u0000\u03c5\u03b8\u0001\u0000\u0000\u0000\u03c5"+
		"\u03b9\u0001\u0000\u0000\u0000\u03c5\u03ba\u0001\u0000\u0000\u0000\u03c5"+
		"\u03bb\u0001\u0000\u0000\u0000\u03c5\u03bc\u0001\u0000\u0000\u0000\u03c5"+
		"\u03bd\u0001\u0000\u0000\u0000\u03c5\u03be\u0001\u0000\u0000\u0000\u03c5"+
		"\u03bf\u0001\u0000\u0000\u0000\u03c5\u03c0\u0001\u0000\u0000\u0000\u03c5"+
		"\u03c1\u0001\u0000\u0000\u0000\u03c5\u03c2\u0001\u0000\u0000\u0000\u03c5"+
		"\u03c3\u0001\u0000\u0000\u0000\u03c5\u03c4\u0001\u0000\u0000\u0000\u03c6"+
		"e\u0001\u0000\u0000\u0000\u03c7\u03c8\u0005S\u0000\u0000\u03c8\u03cd\u0005"+
		"\u0010\u0000\u0000\u03c9\u03ca\u00057\u0000\u0000\u03ca\u03cb\u0005\u0011"+
		"\u0000\u0000\u03cb\u03ce\u0005\b\u0000\u0000\u03cc\u03ce\u0003d2\u0000"+
		"\u03cd\u03c9\u0001\u0000\u0000\u0000\u03cd\u03cc\u0001\u0000\u0000\u0000"+
		"\u03ce\u03cf\u0001\u0000\u0000\u0000\u03cf\u03cd\u0001\u0000\u0000\u0000"+
		"\u03cf\u03d0\u0001\u0000\u0000\u0000\u03d0\u03d1\u0001\u0000\u0000\u0000"+
		"\u03d1\u03d2\u0005\u000f\u0000\u0000\u03d2g\u0001\u0000\u0000\u0000\u03d3"+
		"\u03d4\u0005H\u0000\u0000\u03d4\u03e0\u0005\u0010\u0000\u0000\u03d5\u03d6"+
		"\u00058\u0000\u0000\u03d6\u03d7\u0005\u0011\u0000\u0000\u03d7\u03df\u0007"+
		"\u0004\u0000\u0000\u03d8\u03d9\u00057\u0000\u0000\u03d9\u03da\u0005\u0011"+
		"\u0000\u0000\u03da\u03df\u0005\b\u0000\u0000\u03db\u03dc\u0005^\u0000"+
		"\u0000\u03dc\u03dd\u0005\u0011\u0000\u0000\u03dd\u03df\u0005\u00ca\u0000"+
		"\u0000\u03de\u03d5\u0001\u0000\u0000\u0000\u03de\u03d8\u0001\u0000\u0000"+
		"\u0000\u03de\u03db\u0001\u0000\u0000\u0000\u03df\u03e2\u0001\u0000\u0000"+
		"\u0000\u03e0\u03de\u0001\u0000\u0000\u0000\u03e0\u03e1\u0001\u0000\u0000"+
		"\u0000\u03e1\u03e3\u0001\u0000\u0000\u0000\u03e2\u03e0\u0001\u0000\u0000"+
		"\u0000\u03e3\u03e4\u0005\u000f\u0000\u0000\u03e4i\u0001\u0000\u0000\u0000"+
		"\u03e5\u03e6\u0005#\u0000\u0000\u03e6\u03eb\u0005\u0010\u0000\u0000\u03e7"+
		"\u03ea\u0003(\u0014\u0000\u03e8\u03ea\u0003d2\u0000\u03e9\u03e7\u0001"+
		"\u0000\u0000\u0000\u03e9\u03e8\u0001\u0000\u0000\u0000\u03ea\u03ed\u0001"+
		"\u0000\u0000\u0000\u03eb\u03e9\u0001\u0000\u0000\u0000\u03eb\u03ec\u0001"+
		"\u0000\u0000\u0000\u03ec\u03ee\u0001\u0000\u0000\u0000\u03ed\u03eb\u0001"+
		"\u0000\u0000\u0000\u03ee\u03ef\u0005\u000f\u0000\u0000\u03efk\u0001\u0000"+
		"\u0000\u0000\u03f0\u03f1\u0005/\u0000\u0000\u03f1\u03f2\u0005\u0010\u0000"+
		"\u0000\u03f2\u03f3\u00056\u0000\u0000\u03f3\u03f4\u0005\u0011\u0000\u0000"+
		"\u03f4\u03fb\u0005\u00ca\u0000\u0000\u03f5\u03f6\u00056\u0000\u0000\u03f6"+
		"\u03f7\u0005\u0011\u0000\u0000\u03f7\u03fc\u0005\u00ca\u0000\u0000\u03f8"+
		"\u03f9\u00057\u0000\u0000\u03f9\u03fa\u0005\u0011\u0000\u0000\u03fa\u03fc"+
		"\u0007\u0001\u0000\u0000\u03fb\u03f5\u0001\u0000\u0000\u0000\u03fb\u03f8"+
		"\u0001\u0000\u0000\u0000\u03fc\u03fd\u0001\u0000\u0000\u0000\u03fd\u03fe"+
		"\u0005\u000f\u0000\u0000\u03fem\u0001\u0000\u0000\u0000\u03ff\u0400\u0005"+
		"D\u0000\u0000\u0400\u0401\u0005\u0010\u0000\u0000\u0401\u0402\u0005\u00b9"+
		"\u0000\u0000\u0402\u0403\u0005\u0011\u0000\u0000\u0403\u0404\u0007\u0004"+
		"\u0000\u0000\u0404\u0405\u0005F\u0000\u0000\u0405\u0406\u0005\u0011\u0000"+
		"\u0000\u0406\u0407\u0005\b\u0000\u0000\u0407\u0408\u0005\u000f\u0000\u0000"+
		"\u0408o\u0001\u0000\u0000\u0000\u0409\u040a\u0005E\u0000\u0000\u040a\u040b"+
		"\u0005\u0010\u0000\u0000\u040b\u040c\u0005\u00b9\u0000\u0000\u040c\u040d"+
		"\u0005\u0011\u0000\u0000\u040d\u040e\u0007\u0004\u0000\u0000\u040e\u040f"+
		"\u0005F\u0000\u0000\u040f\u0410\u0005\u0011\u0000\u0000\u0410\u0411\u0005"+
		"\b\u0000\u0000\u0411\u0412\u0005\u000f\u0000\u0000\u0412q\u0001\u0000"+
		"\u0000\u0000\u0413\u0414\u0005\u00ca\u0000\u0000\u0414\u0418\u0005\u0010"+
		"\u0000\u0000\u0415\u0417\u0003d2\u0000\u0416\u0415\u0001\u0000\u0000\u0000"+
		"\u0417\u041a\u0001\u0000\u0000\u0000\u0418\u0416\u0001\u0000\u0000\u0000"+
		"\u0418\u0419\u0001\u0000\u0000\u0000\u0419\u041b\u0001\u0000\u0000\u0000"+
		"\u041a\u0418\u0001\u0000\u0000\u0000\u041b\u041c\u0005\u000f\u0000\u0000"+
		"\u041cs\u0001\u0000\u0000\u0000\u041d\u041e\u0005+\u0000\u0000\u041e\u0422"+
		"\u0005\u0010\u0000\u0000\u041f\u0421\u0003d2\u0000\u0420\u041f\u0001\u0000"+
		"\u0000\u0000\u0421\u0424\u0001\u0000\u0000\u0000\u0422\u0420\u0001\u0000"+
		"\u0000\u0000\u0422\u0423\u0001\u0000\u0000\u0000\u0423\u0425\u0001\u0000"+
		"\u0000\u0000\u0424\u0422\u0001\u0000\u0000\u0000\u0425\u0426\u0005\u000f"+
		"\u0000\u0000\u0426u\u0001\u0000\u0000\u0000\u0427\u0428\u0005,\u0000\u0000"+
		"\u0428\u042c\u0005\u0010\u0000\u0000\u0429\u042b\u0003d2\u0000\u042a\u0429"+
		"\u0001\u0000\u0000\u0000\u042b\u042e\u0001\u0000\u0000\u0000\u042c\u042a"+
		"\u0001\u0000\u0000\u0000\u042c\u042d\u0001\u0000\u0000\u0000\u042d\u042f"+
		"\u0001\u0000\u0000\u0000\u042e\u042c\u0001\u0000\u0000\u0000\u042f\u0430"+
		"\u0005\u000f\u0000\u0000\u0430w\u0001\u0000\u0000\u0000\u0431\u0432\u0005"+
		"]\u0000\u0000\u0432\u0433\u0005\u0011\u0000\u0000\u0433\u0434\u0007\u0003"+
		"\u0000\u0000\u0434y\u0001\u0000\u0000\u0000\u0435\u0436\u0005*\u0000\u0000"+
		"\u0436\u0437\u0005\u0011\u0000\u0000\u0437\u0438\u0007\u0003\u0000\u0000"+
		"\u0438{\u0001\u0000\u0000\u0000\u0439\u043a\u0005\u0097\u0000\u0000\u043a"+
		"\u043b\u0005\u0011\u0000\u0000\u043b\u043c\u0005\u00ca\u0000\u0000\u043c"+
		"}\u0001\u0000\u0000\u0000\u043d\u043e\u0005T\u0000\u0000\u043e\u043f\u0005"+
		"\u0010\u0000\u0000\u043f\u0440\u00056\u0000\u0000\u0440\u0441\u0005\u0011"+
		"\u0000\u0000\u0441\u0442\u0005\u00ca\u0000\u0000\u0442\u0443\u00057\u0000"+
		"\u0000\u0443\u0444\u0005\u0011\u0000\u0000\u0444\u0445\u0005\b\u0000\u0000"+
		"\u0445\u0446\u0005\u000f\u0000\u0000\u0446\u007f\u0001\u0000\u0000\u0000"+
		"\u0447\u0448\u0005U\u0000\u0000\u0448\u044c\u0005\u0010\u0000\u0000\u0449"+
		"\u044b\u0003\u0082A\u0000\u044a\u0449\u0001\u0000\u0000\u0000\u044b\u044e"+
		"\u0001\u0000\u0000\u0000\u044c\u044a\u0001\u0000\u0000\u0000\u044c\u044d"+
		"\u0001\u0000\u0000\u0000\u044d\u044f\u0001\u0000\u0000\u0000\u044e\u044c"+
		"\u0001\u0000\u0000\u0000\u044f\u0450\u0005\u000f\u0000\u0000\u0450\u0081"+
		"\u0001\u0000\u0000\u0000\u0451\u0452\u0005e\u0000\u0000\u0452\u0453\u0005"+
		"\u0011\u0000\u0000\u0453\u0470\u0007\b\u0000\u0000\u0454\u0455\u0005f"+
		"\u0000\u0000\u0455\u0456\u0005\u0011\u0000\u0000\u0456\u0470\u0007\b\u0000"+
		"\u0000\u0457\u0458\u0005g\u0000\u0000\u0458\u0459\u0005\u0011\u0000\u0000"+
		"\u0459\u0470\u0005\u00ca\u0000\u0000\u045a\u045b\u0005h\u0000\u0000\u045b"+
		"\u045c\u0005\u0011\u0000\u0000\u045c\u0470\u0005\u0007\u0000\u0000\u045d"+
		"\u045e\u0005i\u0000\u0000\u045e\u045f\u0005\u0011\u0000\u0000\u045f\u0470"+
		"\u0005\u0007\u0000\u0000\u0460\u0461\u0005j\u0000\u0000\u0461\u0462\u0005"+
		"\u0011\u0000\u0000\u0462\u0470\u0005\u0007\u0000\u0000\u0463\u0464\u0005"+
		"k\u0000\u0000\u0464\u0465\u0005\u0011\u0000\u0000\u0465\u0470\u0005\b"+
		"\u0000\u0000\u0466\u0467\u0005l\u0000\u0000\u0467\u0468\u0005\u0011\u0000"+
		"\u0000\u0468\u0470\u0005\u000b\u0000\u0000\u0469\u046a\u0005\\\u0000\u0000"+
		"\u046a\u046b\u0005\u0011\u0000\u0000\u046b\u0470\u0005\b\u0000\u0000\u046c"+
		"\u046d\u0005m\u0000\u0000\u046d\u046e\u0005\u0011\u0000\u0000\u046e\u0470"+
		"\u0005\b\u0000\u0000\u046f\u0451\u0001\u0000\u0000\u0000\u046f\u0454\u0001"+
		"\u0000\u0000\u0000\u046f\u0457\u0001\u0000\u0000\u0000\u046f\u045a\u0001"+
		"\u0000\u0000\u0000\u046f\u045d\u0001\u0000\u0000\u0000\u046f\u0460\u0001"+
		"\u0000\u0000\u0000\u046f\u0463\u0001\u0000\u0000\u0000\u046f\u0466\u0001"+
		"\u0000\u0000\u0000\u046f\u0469\u0001\u0000\u0000\u0000\u046f\u046c\u0001"+
		"\u0000\u0000\u0000\u0470\u0083\u0001\u0000\u0000\u0000\u0471\u0472\u0005"+
		"V\u0000\u0000\u0472\u047e\u0005\u0010\u0000\u0000\u0473\u0474\u00058\u0000"+
		"\u0000\u0474\u0475\u0005\u0011\u0000\u0000\u0475\u047d\u0007\u0004\u0000"+
		"\u0000\u0476\u0477\u00057\u0000\u0000\u0477\u0478\u0005\u0011\u0000\u0000"+
		"\u0478\u047d\u0005\b\u0000\u0000\u0479\u047a\u0005^\u0000\u0000\u047a"+
		"\u047b\u0005\u0011\u0000\u0000\u047b\u047d\u0005\u00ca\u0000\u0000\u047c"+
		"\u0473\u0001\u0000\u0000\u0000\u047c\u0476\u0001\u0000\u0000\u0000\u047c"+
		"\u0479\u0001\u0000\u0000\u0000\u047d\u0480\u0001\u0000\u0000\u0000\u047e"+
		"\u047c\u0001\u0000\u0000\u0000\u047e\u047f\u0001\u0000\u0000\u0000\u047f"+
		"\u0481\u0001\u0000\u0000\u0000\u0480\u047e\u0001\u0000\u0000\u0000\u0481"+
		"\u0482\u0005\u000f\u0000\u0000\u0482\u0085\u0001\u0000\u0000\u0000\u0483"+
		"\u0484\u0007\t\u0000\u0000\u0484\u0488\u0005\u0010\u0000\u0000\u0485\u0487"+
		"\u0003d2\u0000\u0486\u0485\u0001\u0000\u0000\u0000\u0487\u048a\u0001\u0000"+
		"\u0000\u0000\u0488\u0486\u0001\u0000\u0000\u0000\u0488\u0489\u0001\u0000"+
		"\u0000\u0000\u0489\u048b\u0001\u0000\u0000\u0000\u048a\u0488\u0001\u0000"+
		"\u0000\u0000\u048b\u048c\u0005\u000f\u0000\u0000\u048c\u0087\u0001\u0000"+
		"\u0000\u0000\u048d\u048e\u0005o\u0000\u0000\u048e\u0492\u0005\u0010\u0000"+
		"\u0000\u048f\u0491\u0003D\"\u0000\u0490\u048f\u0001\u0000\u0000\u0000"+
		"\u0491\u0494\u0001\u0000\u0000\u0000\u0492\u0490\u0001\u0000\u0000\u0000"+
		"\u0492\u0493\u0001\u0000\u0000\u0000\u0493\u0495\u0001\u0000\u0000\u0000"+
		"\u0494\u0492\u0001\u0000\u0000\u0000\u0495\u0496\u0005\u000f\u0000\u0000"+
		"\u0496\u0089\u0001\u0000\u0000\u0000\u0497\u0498\u0005n\u0000\u0000\u0498"+
		"\u049f\u0005\u0010\u0000\u0000\u0499\u049e\u0003\b\u0004\u0000\u049a\u049e"+
		"\u0003 \u0010\u0000\u049b\u049e\u0003\u00c2a\u0000\u049c\u049e\u0003\u0088"+
		"D\u0000\u049d\u0499\u0001\u0000\u0000\u0000\u049d\u049a\u0001\u0000\u0000"+
		"\u0000\u049d\u049b\u0001\u0000\u0000\u0000\u049d\u049c\u0001\u0000\u0000"+
		"\u0000\u049e\u04a1\u0001\u0000\u0000\u0000\u049f\u049d\u0001\u0000\u0000"+
		"\u0000\u049f\u04a0\u0001\u0000\u0000\u0000\u04a0\u04a2\u0001\u0000\u0000"+
		"\u0000\u04a1\u049f\u0001\u0000\u0000\u0000\u04a2\u04a3\u0005\u000f\u0000"+
		"\u0000\u04a3\u008b\u0001\u0000\u0000\u0000\u04a4\u04a5\u0005\u00ca\u0000"+
		"\u0000\u04a5\u04ab\u0005\u0010\u0000\u0000\u04a6\u04aa\u0003\u008aE\u0000"+
		"\u04a7\u04aa\u0003\n\u0005\u0000\u04a8\u04aa\u0003\u0088D\u0000\u04a9"+
		"\u04a6\u0001\u0000\u0000\u0000\u04a9\u04a7\u0001\u0000\u0000\u0000\u04a9"+
		"\u04a8\u0001\u0000\u0000\u0000\u04aa\u04ad\u0001\u0000\u0000\u0000\u04ab"+
		"\u04a9\u0001\u0000\u0000\u0000\u04ab\u04ac\u0001\u0000\u0000\u0000\u04ac"+
		"\u04ae\u0001\u0000\u0000\u0000\u04ad\u04ab\u0001\u0000\u0000\u0000\u04ae"+
		"\u04af\u0005\u000f\u0000\u0000\u04af\u008d\u0001\u0000\u0000\u0000\u04b0"+
		"\u04b1\u0005\u009b\u0000\u0000\u04b1\u04b2\u0005\u0011\u0000\u0000\u04b2"+
		"\u04ba\u0005\b\u0000\u0000\u04b3\u04b4\u0005q\u0000\u0000\u04b4\u04b5"+
		"\u0005\u0011\u0000\u0000\u04b5\u04ba\u0005\b\u0000\u0000\u04b6\u04b7\u0005"+
		"p\u0000\u0000\u04b7\u04b8\u0005\u0011\u0000\u0000\u04b8\u04ba\u0005\b"+
		"\u0000\u0000\u04b9\u04b0\u0001\u0000\u0000\u0000\u04b9\u04b3\u0001\u0000"+
		"\u0000\u0000\u04b9\u04b6\u0001\u0000\u0000\u0000\u04ba\u008f\u0001\u0000"+
		"\u0000\u0000\u04bb\u04bc\u0005\u00ca\u0000\u0000\u04bc\u04be\u0005\u0010"+
		"\u0000\u0000\u04bd\u04bf\u0003\u008eG\u0000\u04be\u04bd\u0001\u0000\u0000"+
		"\u0000\u04bf\u04c0\u0001\u0000\u0000\u0000\u04c0\u04be\u0001\u0000\u0000"+
		"\u0000\u04c0\u04c1\u0001\u0000\u0000\u0000\u04c1\u04cd\u0001\u0000\u0000"+
		"\u0000\u04c2\u04ce\u0003\u000e\u0007\u0000\u04c3\u04ce\u0003\u0012\t\u0000"+
		"\u04c4\u04c5\u0005N\u0000\u0000\u04c5\u04c9\u0005\u0010\u0000\u0000\u04c6"+
		"\u04c8\u0003@ \u0000\u04c7\u04c6\u0001\u0000\u0000\u0000\u04c8\u04cb\u0001"+
		"\u0000\u0000\u0000\u04c9\u04c7\u0001\u0000\u0000\u0000\u04c9\u04ca\u0001"+
		"\u0000\u0000\u0000\u04ca\u04cc\u0001\u0000\u0000\u0000\u04cb\u04c9\u0001"+
		"\u0000\u0000\u0000\u04cc\u04ce\u0005\u000f\u0000\u0000\u04cd\u04c2\u0001"+
		"\u0000\u0000\u0000\u04cd\u04c3\u0001\u0000\u0000\u0000\u04cd\u04c4\u0001"+
		"\u0000\u0000\u0000\u04ce\u04cf\u0001\u0000\u0000\u0000\u04cf\u04cd\u0001"+
		"\u0000\u0000\u0000\u04cf\u04d0\u0001\u0000\u0000\u0000\u04d0\u04d1\u0001"+
		"\u0000\u0000\u0000\u04d1\u04d2\u0005\u000f\u0000\u0000\u04d2\u0091\u0001"+
		"\u0000\u0000\u0000\u04d3\u04da\u0003\b\u0004\u0000\u04d4\u04da\u0003\u0006"+
		"\u0003\u0000\u04d5\u04da\u0003\u000e\u0007\u0000\u04d6\u04da\u0003\n\u0005"+
		"\u0000\u04d7\u04da\u0003\f\u0006\u0000\u04d8\u04da\u0003\u0012\t\u0000"+
		"\u04d9\u04d3\u0001\u0000\u0000\u0000\u04d9\u04d4\u0001\u0000\u0000\u0000"+
		"\u04d9\u04d5\u0001\u0000\u0000\u0000\u04d9\u04d6\u0001\u0000\u0000\u0000"+
		"\u04d9\u04d7\u0001\u0000\u0000\u0000\u04d9\u04d8\u0001\u0000\u0000\u0000"+
		"\u04da\u0093\u0001\u0000\u0000\u0000\u04db\u04dc\u0005\u00ca\u0000\u0000"+
		"\u04dc\u04e3\u0005\u0010\u0000\u0000\u04dd\u04de\u0005(\u0000\u0000\u04de"+
		"\u04df\u0005\u0011\u0000\u0000\u04df\u04e4\u0005\b\u0000\u0000\u04e0\u04e1"+
		"\u0005\\\u0000\u0000\u04e1\u04e2\u0005\u0011\u0000\u0000\u04e2\u04e4\u0005"+
		"\b\u0000\u0000\u04e3\u04dd\u0001\u0000\u0000\u0000\u04e3\u04e0\u0001\u0000"+
		"\u0000\u0000\u04e4\u04e5\u0001\u0000\u0000\u0000\u04e5\u04e3\u0001\u0000"+
		"\u0000\u0000\u04e5\u04e6\u0001\u0000\u0000\u0000\u04e6\u04e8\u0001\u0000"+
		"\u0000\u0000\u04e7\u04e9\u0003\u0092I\u0000\u04e8\u04e7\u0001\u0000\u0000"+
		"\u0000\u04e9\u04ea\u0001\u0000\u0000\u0000\u04ea\u04e8\u0001\u0000\u0000"+
		"\u0000\u04ea\u04eb\u0001\u0000\u0000\u0000\u04eb\u04ec\u0001\u0000\u0000"+
		"\u0000\u04ec\u04ed\u0005\u000f\u0000\u0000\u04ed\u0095\u0001\u0000\u0000"+
		"\u0000\u04ee\u04ef\u0005\u00ca\u0000\u0000\u04ef\u04f0\u0005\u0010\u0000"+
		"\u0000\u04f0\u04f1\u0005r\u0000\u0000\u04f1\u04f2\u0005\u0011\u0000\u0000"+
		"\u04f2\u04f4\u0005\u0006\u0000\u0000\u04f3\u04f5\u0003\u009cN\u0000\u04f4"+
		"\u04f3\u0001\u0000\u0000\u0000\u04f5\u04f6\u0001\u0000\u0000\u0000\u04f6"+
		"\u04f4\u0001\u0000\u0000\u0000\u04f6\u04f7\u0001\u0000\u0000\u0000\u04f7"+
		"\u04f8\u0001\u0000\u0000\u0000\u04f8\u04f9\u0005\u000f\u0000\u0000\u04f9"+
		"\u0097\u0001\u0000\u0000\u0000\u04fa\u04fb\u0005s\u0000\u0000\u04fb\u04fc"+
		"\u0005\u0011\u0000\u0000\u04fc\u04fd\u0005\b\u0000\u0000\u04fd\u0099\u0001"+
		"\u0000\u0000\u0000\u04fe\u04ff\u0005t\u0000\u0000\u04ff\u0503\u0005\u0010"+
		"\u0000\u0000\u0500\u0502\u0003d2\u0000\u0501\u0500\u0001\u0000\u0000\u0000"+
		"\u0502\u0505\u0001\u0000\u0000\u0000\u0503\u0501\u0001\u0000\u0000\u0000"+
		"\u0503\u0504\u0001\u0000\u0000\u0000\u0504\u0506\u0001\u0000\u0000\u0000"+
		"\u0505\u0503\u0001\u0000\u0000\u0000\u0506\u0507\u0005\u000f\u0000\u0000"+
		"\u0507\u009b\u0001\u0000\u0000\u0000\u0508\u0509\u0005\u00ca\u0000\u0000"+
		"\u0509\u0516\u0005\u0010\u0000\u0000\u050a\u0515\u0003@ \u0000\u050b\u0515"+
		"\u0003\u009aM\u0000\u050c\u0515\u0003\u0098L\u0000\u050d\u050e\u0005\u00b6"+
		"\u0000\u0000\u050e\u050f\u0005\u0011\u0000\u0000\u050f\u0515\u0005\b\u0000"+
		"\u0000\u0510\u0515\u0003\u0010\b\u0000\u0511\u0512\u0005u\u0000\u0000"+
		"\u0512\u0513\u0005\u0011\u0000\u0000\u0513\u0515\u0005\b\u0000\u0000\u0514"+
		"\u050a\u0001\u0000\u0000\u0000\u0514\u050b\u0001\u0000\u0000\u0000\u0514"+
		"\u050c\u0001\u0000\u0000\u0000\u0514\u050d\u0001\u0000\u0000\u0000\u0514"+
		"\u0510\u0001\u0000\u0000\u0000\u0514\u0511\u0001\u0000\u0000\u0000\u0515"+
		"\u0518\u0001\u0000\u0000\u0000\u0516\u0514\u0001\u0000\u0000\u0000\u0516"+
		"\u0517\u0001\u0000\u0000\u0000\u0517\u0519\u0001\u0000\u0000\u0000\u0518"+
		"\u0516\u0001\u0000\u0000\u0000\u0519\u051a\u0005\u000f\u0000\u0000\u051a"+
		"\u009d\u0001\u0000\u0000\u0000\u051b\u051c\u0005w\u0000\u0000\u051c\u051e"+
		"\u0005\u0010\u0000\u0000\u051d\u051f\u0005\b\u0000\u0000\u051e\u051d\u0001"+
		"\u0000\u0000\u0000\u051f\u0520\u0001\u0000\u0000\u0000\u0520\u051e\u0001"+
		"\u0000\u0000\u0000\u0520\u0521\u0001\u0000\u0000\u0000\u0521\u0523\u0001"+
		"\u0000\u0000\u0000\u0522\u0524\u0005\b\u0000\u0000\u0523\u0522\u0001\u0000"+
		"\u0000\u0000\u0524\u0525\u0001\u0000\u0000\u0000\u0525\u0523\u0001\u0000"+
		"\u0000\u0000\u0525\u0526\u0001\u0000\u0000\u0000\u0526\u0528\u0001\u0000"+
		"\u0000\u0000\u0527\u0529\u0005\b\u0000\u0000\u0528\u0527\u0001\u0000\u0000"+
		"\u0000\u0529\u052a\u0001\u0000\u0000\u0000\u052a\u0528\u0001\u0000\u0000"+
		"\u0000\u052a\u052b\u0001\u0000\u0000\u0000\u052b\u052c\u0001\u0000\u0000"+
		"\u0000\u052c\u052d\u0005\u000f\u0000\u0000\u052d\u009f\u0001\u0000\u0000"+
		"\u0000\u052e\u052f\u0005y\u0000\u0000\u052f\u0530\u0005\u0010\u0000\u0000"+
		"\u0530\u0531\u0003\u001c\u000e\u0000\u0531\u0532\u0003\u001e\u000f\u0000"+
		"\u0532\u0533\u0005|\u0000\u0000\u0533\u0534\u0005\u0011\u0000\u0000\u0534"+
		"\u0535\u0005\b\u0000\u0000\u0535\u0536\u0005.\u0000\u0000\u0536\u0537"+
		"\u0005\u0011\u0000\u0000\u0537\u0538\u0005\b\u0000\u0000\u0538\u0539\u0005"+
		"\u000f\u0000\u0000\u0539\u00a1\u0001\u0000\u0000\u0000\u053a\u053b\u0005"+
		"v\u0000\u0000\u053b\u053c\u0005\u0011\u0000\u0000\u053c\u0540\u0005\b"+
		"\u0000\u0000\u053d\u053f\u0003\u0018\f\u0000\u053e\u053d\u0001\u0000\u0000"+
		"\u0000\u053f\u0542\u0001\u0000\u0000\u0000\u0540\u053e\u0001\u0000\u0000"+
		"\u0000\u0540\u0541\u0001\u0000\u0000\u0000\u0541\u0546\u0001\u0000\u0000"+
		"\u0000\u0542\u0540\u0001\u0000\u0000\u0000\u0543\u0545\u0003\u009eO\u0000"+
		"\u0544\u0543\u0001\u0000\u0000\u0000\u0545\u0548\u0001\u0000\u0000\u0000"+
		"\u0546\u0544\u0001\u0000\u0000\u0000\u0546\u0547\u0001\u0000\u0000\u0000"+
		"\u0547\u0549\u0001\u0000\u0000\u0000\u0548\u0546\u0001\u0000\u0000\u0000"+
		"\u0549\u054a\u0005x\u0000\u0000\u054a\u054e\u0005\u0010\u0000\u0000\u054b"+
		"\u054d\u0003\u00a0P\u0000\u054c\u054b\u0001\u0000\u0000\u0000\u054d\u0550"+
		"\u0001\u0000\u0000\u0000\u054e\u054c\u0001\u0000\u0000\u0000\u054e\u054f"+
		"\u0001\u0000\u0000\u0000\u054f\u0551\u0001\u0000\u0000\u0000\u0550\u054e"+
		"\u0001\u0000\u0000\u0000\u0551\u0552\u0005\u000f\u0000\u0000\u0552\u00a3"+
		"\u0001\u0000\u0000\u0000\u0553\u0554\u0007\n\u0000\u0000\u0554\u0558\u0005"+
		"\u0010\u0000\u0000\u0555\u0557\u0003@ \u0000\u0556\u0555\u0001\u0000\u0000"+
		"\u0000\u0557\u055a\u0001\u0000\u0000\u0000\u0558\u0556\u0001\u0000\u0000"+
		"\u0000\u0558\u0559\u0001\u0000\u0000\u0000\u0559\u055b\u0001\u0000\u0000"+
		"\u0000\u055a\u0558\u0001\u0000\u0000\u0000\u055b\u055c\u0005\u000f\u0000"+
		"\u0000\u055c\u00a5\u0001\u0000\u0000\u0000\u055d\u055e\u0007\u000b\u0000"+
		"\u0000\u055e\u0562\u0005\u0010\u0000\u0000\u055f\u0561\u0007\u0006\u0000"+
		"\u0000\u0560\u055f\u0001\u0000\u0000\u0000\u0561\u0564\u0001\u0000\u0000"+
		"\u0000\u0562\u0560\u0001\u0000\u0000\u0000\u0562\u0563\u0001\u0000\u0000"+
		"\u0000\u0563\u0565\u0001\u0000\u0000\u0000\u0564\u0562\u0001\u0000\u0000"+
		"\u0000\u0565\u0566\u0005\u000f\u0000\u0000\u0566\u00a7\u0001\u0000\u0000"+
		"\u0000\u0567\u0568\u0005\u00ca\u0000\u0000\u0568\u056f\u0005\u0010\u0000"+
		"\u0000\u0569\u056a\u0005\u0086\u0000\u0000\u056a\u056b\u0005\u0011\u0000"+
		"\u0000\u056b\u0570\u0005\u00ca\u0000\u0000\u056c\u0570\u0003\u00a4R\u0000"+
		"\u056d\u0570\u0003\u00aaU\u0000\u056e\u0570\u0003\u00a6S\u0000\u056f\u0569"+
		"\u0001\u0000\u0000\u0000\u056f\u056c\u0001\u0000\u0000\u0000\u056f\u056d"+
		"\u0001\u0000\u0000\u0000\u056f\u056e\u0001\u0000\u0000\u0000\u0570\u0571"+
		"\u0001\u0000\u0000\u0000\u0571\u056f\u0001\u0000\u0000\u0000\u0571\u0572"+
		"\u0001\u0000\u0000\u0000\u0572\u0573\u0001\u0000\u0000\u0000\u0573\u0574"+
		"\u0005\u000f\u0000\u0000\u0574\u00a9\u0001\u0000\u0000\u0000\u0575\u0576"+
		"\u0005\u00ca\u0000\u0000\u0576\u057e\u0005\u0010\u0000\u0000\u0577\u0578"+
		"\u0005\u0082\u0000\u0000\u0578\u0579\u0005\u0011\u0000\u0000\u0579\u057d"+
		"\u0005\u0007\u0000\u0000\u057a\u057d\u0003\u00a4R\u0000\u057b\u057d\u0003"+
		"\u00a6S\u0000\u057c\u0577\u0001\u0000\u0000\u0000\u057c\u057a\u0001\u0000"+
		"\u0000\u0000\u057c\u057b\u0001\u0000\u0000\u0000\u057d\u0580\u0001\u0000"+
		"\u0000\u0000\u057e\u057c\u0001\u0000\u0000\u0000\u057e\u057f\u0001\u0000"+
		"\u0000\u0000\u057f\u0581\u0001\u0000\u0000\u0000\u0580\u057e\u0001\u0000"+
		"\u0000\u0000\u0581\u0582\u0005\u000f\u0000\u0000\u0582\u00ab\u0001\u0000"+
		"\u0000\u0000\u0583\u0584\u0005\u0007\u0000\u0000\u0584\u0585\u0005\u0011"+
		"\u0000\u0000\u0585\u0586\u0005\t\u0000\u0000\u0586\u00ad\u0001\u0000\u0000"+
		"\u0000\u0587\u0588\u0005\u0007\u0000\u0000\u0588\u059b\u0005\u0010\u0000"+
		"\u0000\u0589\u058a\u0007\f\u0000\u0000\u058a\u058c\u0005\u0010\u0000\u0000"+
		"\u058b\u058d\u0005\b\u0000\u0000\u058c\u058b\u0001\u0000\u0000\u0000\u058d"+
		"\u058e\u0001\u0000\u0000\u0000\u058e\u058c\u0001\u0000\u0000\u0000\u058e"+
		"\u058f\u0001\u0000\u0000\u0000\u058f\u0591\u0001\u0000\u0000\u0000\u0590"+
		"\u0592\u0005\b\u0000\u0000\u0591\u0590\u0001\u0000\u0000\u0000\u0592\u0593"+
		"\u0001\u0000\u0000\u0000\u0593\u0591\u0001\u0000\u0000\u0000\u0593\u0594"+
		"\u0001\u0000\u0000\u0000\u0594\u0596\u0001\u0000\u0000\u0000\u0595\u0597"+
		"\u0005\b\u0000\u0000\u0596\u0595\u0001\u0000\u0000\u0000\u0597\u0598\u0001"+
		"\u0000\u0000\u0000\u0598\u0596\u0001\u0000\u0000\u0000\u0598\u0599\u0001"+
		"\u0000\u0000\u0000\u0599\u059a\u0001\u0000\u0000\u0000\u059a\u059c\u0005"+
		"\u000f\u0000\u0000\u059b\u0589\u0001\u0000\u0000\u0000\u059c\u059d\u0001"+
		"\u0000\u0000\u0000\u059d\u059b\u0001\u0000\u0000\u0000\u059d\u059e\u0001"+
		"\u0000\u0000\u0000\u059e\u059f\u0001\u0000\u0000\u0000\u059f\u05a0\u0005"+
		"\u000f\u0000\u0000\u05a0\u00af\u0001\u0000\u0000\u0000\u05a1\u05a2\u0007"+
		"\r\u0000\u0000\u05a2\u05a6\u0005\u0010\u0000\u0000\u05a3\u05a5\u0007\u0006"+
		"\u0000\u0000\u05a4\u05a3\u0001\u0000\u0000\u0000\u05a5\u05a8\u0001\u0000"+
		"\u0000\u0000\u05a6\u05a4\u0001\u0000\u0000\u0000\u05a6\u05a7\u0001\u0000"+
		"\u0000\u0000\u05a7\u05a9\u0001\u0000\u0000\u0000\u05a8\u05a6\u0001\u0000"+
		"\u0000\u0000\u05a9\u05aa\u0005\u000f\u0000\u0000\u05aa\u00b1\u0001\u0000"+
		"\u0000\u0000\u05ab\u05ac\u0005\u008a\u0000\u0000\u05ac\u05b2\u0005\u0010"+
		"\u0000\u0000\u05ad\u05ae\u0005\t\u0000\u0000\u05ae\u05af\u0005\u0011\u0000"+
		"\u0000\u05af\u05b1\u0005\b\u0000\u0000\u05b0\u05ad\u0001\u0000\u0000\u0000"+
		"\u05b1\u05b4\u0001\u0000\u0000\u0000\u05b2\u05b0\u0001\u0000\u0000\u0000"+
		"\u05b2\u05b3\u0001\u0000\u0000\u0000\u05b3\u05b5\u0001\u0000\u0000\u0000"+
		"\u05b4\u05b2\u0001\u0000\u0000\u0000\u05b5\u05b6\u0005\u000f\u0000\u0000"+
		"\u05b6\u00b3\u0001\u0000\u0000\u0000\u05b7\u05b8\u0005\u0086\u0000\u0000"+
		"\u05b8\u05b9\u0005\u0011\u0000\u0000\u05b9\u05d0\u0005\u00ca\u0000\u0000"+
		"\u05ba\u05d0\u0003\u0018\f\u0000\u05bb\u05d0\u0003\u00b0X\u0000\u05bc"+
		"\u05d0\u0003\u00b2Y\u0000\u05bd\u05be\u0005\u0087\u0000\u0000\u05be\u05c0"+
		"\u0005\u0010\u0000\u0000\u05bf\u05c1\u0005\b\u0000\u0000\u05c0\u05bf\u0001"+
		"\u0000\u0000\u0000\u05c1\u05c2\u0001\u0000\u0000\u0000\u05c2\u05c0\u0001"+
		"\u0000\u0000\u0000\u05c2\u05c3\u0001\u0000\u0000\u0000\u05c3\u05c5\u0001"+
		"\u0000\u0000\u0000\u05c4\u05c6\u0005\b\u0000\u0000\u05c5\u05c4\u0001\u0000"+
		"\u0000\u0000\u05c6\u05c7\u0001\u0000\u0000\u0000\u05c7\u05c5\u0001\u0000"+
		"\u0000\u0000\u05c7\u05c8\u0001\u0000\u0000\u0000\u05c8\u05ca\u0001\u0000"+
		"\u0000\u0000\u05c9\u05cb\u0005\b\u0000\u0000\u05ca\u05c9\u0001\u0000\u0000"+
		"\u0000\u05cb\u05cc\u0001\u0000\u0000\u0000\u05cc\u05ca\u0001\u0000\u0000"+
		"\u0000\u05cc\u05cd\u0001\u0000\u0000\u0000\u05cd\u05ce\u0001\u0000\u0000"+
		"\u0000\u05ce\u05d0\u0005\u000f\u0000\u0000\u05cf\u05b7\u0001\u0000\u0000"+
		"\u0000\u05cf\u05ba\u0001\u0000\u0000\u0000\u05cf\u05bb\u0001\u0000\u0000"+
		"\u0000\u05cf\u05bc\u0001\u0000\u0000\u0000\u05cf\u05bd\u0001\u0000\u0000"+
		"\u0000\u05d0\u05d1\u0001\u0000\u0000\u0000\u05d1\u05cf\u0001\u0000\u0000"+
		"\u0000\u05d1\u05d2\u0001\u0000\u0000\u0000\u05d2\u00b5\u0001\u0000\u0000"+
		"\u0000\u05d3\u05d4\u0005\u0093\u0000\u0000\u05d4\u05d8\u0005\u0010\u0000"+
		"\u0000\u05d5\u05d6\u0005\u00ca\u0000\u0000\u05d6\u05d7\u0005\u0011\u0000"+
		"\u0000\u05d7\u05d9\u0005\b\u0000\u0000\u05d8\u05d5\u0001\u0000\u0000\u0000"+
		"\u05d9\u05da\u0001\u0000\u0000\u0000\u05da\u05d8\u0001\u0000\u0000\u0000"+
		"\u05da\u05db\u0001\u0000\u0000\u0000\u05db\u05dc\u0001\u0000\u0000\u0000"+
		"\u05dc\u05dd\u0005\u000f\u0000\u0000\u05dd\u00b7\u0001\u0000\u0000\u0000"+
		"\u05de\u05df\u0005\u0094\u0000\u0000\u05df\u05e3\u0005\u0010\u0000\u0000"+
		"\u05e0\u05e1\u0005\u00ca\u0000\u0000\u05e1\u05e2\u0005\u0011\u0000\u0000"+
		"\u05e2\u05e4\u0005\b\u0000\u0000\u05e3\u05e0\u0001\u0000\u0000\u0000\u05e4"+
		"\u05e5\u0001\u0000\u0000\u0000\u05e5\u05e3\u0001\u0000\u0000\u0000\u05e5"+
		"\u05e6\u0001\u0000\u0000\u0000\u05e6\u05e7\u0001\u0000\u0000\u0000\u05e7"+
		"\u05e8\u0005\u000f\u0000\u0000\u05e8\u00b9\u0001\u0000\u0000\u0000\u05e9"+
		"\u05ea\u0005\u0095\u0000\u0000\u05ea\u05ee\u0005\u0010\u0000\u0000\u05eb"+
		"\u05ec\u0005\u00ca\u0000\u0000\u05ec\u05ed\u0005\u0011\u0000\u0000\u05ed"+
		"\u05ef\u0005\b\u0000\u0000\u05ee\u05eb\u0001\u0000\u0000\u0000\u05ef\u05f0"+
		"\u0001\u0000\u0000\u0000\u05f0\u05ee\u0001\u0000\u0000\u0000\u05f0\u05f1"+
		"\u0001\u0000\u0000\u0000\u05f1\u05f2\u0001\u0000\u0000\u0000\u05f2\u05f3"+
		"\u0005\u000f\u0000\u0000\u05f3\u00bb\u0001\u0000\u0000\u0000\u05f4\u05f5"+
		"\u0005\u008f\u0000\u0000\u05f5\u05f6\u0005\u0011\u0000\u0000\u05f6\u0601"+
		"\u0005\b\u0000\u0000\u05f7\u05f8\u0005\u0090\u0000\u0000\u05f8\u05f9\u0005"+
		"\u0011\u0000\u0000\u05f9\u0601\u0005\b\u0000\u0000\u05fa\u05fb\u0005\u0091"+
		"\u0000\u0000\u05fb\u05fc\u0005\u0011\u0000\u0000\u05fc\u0601\u0005\b\u0000"+
		"\u0000\u05fd\u05fe\u0005\u0092\u0000\u0000\u05fe\u05ff\u0005\u0011\u0000"+
		"\u0000\u05ff\u0601\u0005\b\u0000\u0000\u0600\u05f4\u0001\u0000\u0000\u0000"+
		"\u0600\u05f7\u0001\u0000\u0000\u0000\u0600\u05fa\u0001\u0000\u0000\u0000"+
		"\u0600\u05fd\u0001\u0000\u0000\u0000\u0601\u00bd\u0001\u0000\u0000\u0000"+
		"\u0602\u0607\u0003\u001a\r\u0000\u0603\u0607\u0003\u00b6[\u0000\u0604"+
		"\u0607\u0003\u00b8\\\u0000\u0605\u0607\u0003\u00ba]\u0000\u0606\u0602"+
		"\u0001\u0000\u0000\u0000\u0606\u0603\u0001\u0000\u0000\u0000\u0606\u0604"+
		"\u0001\u0000\u0000\u0000\u0606\u0605\u0001\u0000\u0000\u0000\u0607\u00bf"+
		"\u0001\u0000\u0000\u0000\u0608\u0609\u0005\u00ca\u0000\u0000\u0609\u0612"+
		"\u0005\u0010\u0000\u0000\u060a\u0613\u0003\u0018\f\u0000\u060b\u060d\u0003"+
		"\u00bc^\u0000\u060c\u060b\u0001\u0000\u0000\u0000\u060d\u060e\u0001\u0000"+
		"\u0000\u0000\u060e\u060c\u0001\u0000\u0000\u0000\u060e\u060f\u0001\u0000"+
		"\u0000\u0000\u060f\u0613\u0001\u0000\u0000\u0000\u0610\u0613\u0003\u00be"+
		"_\u0000\u0611\u0613\u0003\u0016\u000b\u0000\u0612\u060a\u0001\u0000\u0000"+
		"\u0000\u0612\u060c\u0001\u0000\u0000\u0000\u0612\u0610\u0001\u0000\u0000"+
		"\u0000\u0612\u0611\u0001\u0000\u0000\u0000\u0613\u0614\u0001\u0000\u0000"+
		"\u0000\u0614\u0612\u0001\u0000\u0000\u0000\u0614\u0615\u0001\u0000\u0000"+
		"\u0000\u0615\u0616\u0001\u0000\u0000\u0000\u0616\u0617\u0005\u000f\u0000"+
		"\u0000\u0617\u00c1\u0001\u0000\u0000\u0000\u0618\u0619\u0005O\u0000\u0000"+
		"\u0619\u061a\u0005\u0011\u0000\u0000\u061a\u061b\u0007\u000e\u0000\u0000"+
		"\u061b\u00c3\u0001\u0000\u0000\u0000\u061c\u061d\u0005P\u0000\u0000\u061d"+
		"\u061e\u0005\u0011\u0000\u0000\u061e\u061f\u0007\u000e\u0000\u0000\u061f"+
		"\u00c5\u0001\u0000\u0000\u0000\u0620\u0621\u0005R\u0000\u0000\u0621\u0625"+
		"\u0005\u0010\u0000\u0000\u0622\u0624\u0003\u00c2a\u0000\u0623\u0622\u0001"+
		"\u0000\u0000\u0000\u0624\u0627\u0001\u0000\u0000\u0000\u0625\u0623\u0001"+
		"\u0000\u0000\u0000\u0625\u0626\u0001\u0000\u0000\u0000\u0626\u062b\u0001"+
		"\u0000\u0000\u0000\u0627\u0625\u0001\u0000\u0000\u0000\u0628\u062a\u0003"+
		"d2\u0000\u0629\u0628\u0001\u0000\u0000\u0000\u062a\u062d\u0001\u0000\u0000"+
		"\u0000\u062b\u0629\u0001\u0000\u0000\u0000\u062b\u062c\u0001\u0000\u0000"+
		"\u0000\u062c\u062e\u0001\u0000\u0000\u0000\u062d\u062b\u0001\u0000\u0000"+
		"\u0000\u062e\u062f\u0005\u000f\u0000\u0000\u062f\u00c7\u0001\u0000\u0000"+
		"\u0000\u0630\u0631\u0005Q\u0000\u0000\u0631\u0632\u0005\u0011\u0000\u0000"+
		"\u0632\u0633\u0007\u000f\u0000\u0000\u0633\u00c9\u0001\u0000\u0000\u0000"+
		"\u0634\u0635\u0005\u00ca\u0000\u0000\u0635\u0638\u0005\u0010\u0000\u0000"+
		"\u0636\u0639\u0003\u0016\u000b\u0000\u0637\u0639\u0003|>\u0000\u0638\u0636"+
		"\u0001\u0000\u0000\u0000\u0638\u0637\u0001\u0000\u0000\u0000\u0639\u063a"+
		"\u0001\u0000\u0000\u0000\u063a\u0638\u0001\u0000\u0000\u0000\u063a\u063b"+
		"\u0001\u0000\u0000\u0000\u063b\u063c\u0001\u0000\u0000\u0000\u063c\u063d"+
		"\u0005\u000f\u0000\u0000\u063d\u00cb\u0001\u0000\u0000\u0000\u063e\u063f"+
		"\u0005\u0098\u0000\u0000\u063f\u0640\u0005\u0011\u0000\u0000\u0640\u0641"+
		"\u0007\u0003\u0000\u0000\u0641\u00cd\u0001\u0000\u0000\u0000\u0642\u0643"+
		"\u0005\u0099\u0000\u0000\u0643\u0644\u0005\u0011\u0000\u0000\u0644\u0645"+
		"\u0005\t\u0000\u0000\u0645\u00cf\u0001\u0000\u0000\u0000\u0646\u0647\u0005"+
		"\u00ca\u0000\u0000\u0647\u0652\u0005\u0010\u0000\u0000\u0648\u0651\u0003"+
		"\u00ccf\u0000\u0649\u0651\u0003\u0006\u0003\u0000\u064a\u0651\u0003\u00ce"+
		"g\u0000\u064b\u0651\u0003\u0132\u0099\u0000\u064c\u0651\u0003\u0106\u0083"+
		"\u0000\u064d\u0651\u0003\n\u0005\u0000\u064e\u0651\u0003\u000e\u0007\u0000"+
		"\u064f\u0651\u0003\b\u0004\u0000\u0650\u0648\u0001\u0000\u0000\u0000\u0650"+
		"\u0649\u0001\u0000\u0000\u0000\u0650\u064a\u0001\u0000\u0000\u0000\u0650"+
		"\u064b\u0001\u0000\u0000\u0000\u0650\u064c\u0001\u0000\u0000\u0000\u0650"+
		"\u064d\u0001\u0000\u0000\u0000\u0650\u064e\u0001\u0000\u0000\u0000\u0650"+
		"\u064f\u0001\u0000\u0000\u0000\u0651\u0654\u0001\u0000\u0000\u0000\u0652"+
		"\u0650\u0001\u0000\u0000\u0000\u0652\u0653\u0001\u0000\u0000\u0000\u0653"+
		"\u0656\u0001\u0000\u0000\u0000\u0654\u0652\u0001\u0000\u0000\u0000\u0655"+
		"\u0657\u0003\u0012\t\u0000\u0656\u0655\u0001\u0000\u0000\u0000\u0656\u0657"+
		"\u0001\u0000\u0000\u0000\u0657\u0658\u0001\u0000\u0000\u0000\u0658\u0659"+
		"\u0005\u000f\u0000\u0000\u0659\u00d1\u0001\u0000\u0000\u0000\u065a\u065b"+
		"\u0005\u009b\u0000\u0000\u065b\u065c\u0005\u0011\u0000\u0000\u065c\u065d"+
		"\u0005\b\u0000\u0000\u065d\u00d3\u0001\u0000\u0000\u0000\u065e\u065f\u0005"+
		"\u009c\u0000\u0000\u065f\u0660\u0005\u0011\u0000\u0000\u0660\u0661\u0005"+
		"\b\u0000\u0000\u0661\u00d5\u0001\u0000\u0000\u0000\u0662\u0663\u0005\u009f"+
		"\u0000\u0000\u0663\u0664\u0005\u0011\u0000\u0000\u0664\u0665\u0007\u0010"+
		"\u0000\u0000\u0665\u00d7\u0001\u0000\u0000\u0000\u0666\u066a\u0003\u00d4"+
		"j\u0000\u0667\u066a\u0003\u0106\u0083\u0000\u0668\u066a\u0003\u00d6k\u0000"+
		"\u0669\u0666\u0001\u0000\u0000\u0000\u0669\u0667\u0001\u0000\u0000\u0000"+
		"\u0669\u0668\u0001\u0000\u0000\u0000\u066a\u00d9\u0001\u0000\u0000\u0000"+
		"\u066b\u066c\u0005\u00a0\u0000\u0000\u066c\u0670\u0005\u0010\u0000\u0000"+
		"\u066d\u066f\u0003@ \u0000\u066e\u066d\u0001\u0000\u0000\u0000\u066f\u0672"+
		"\u0001\u0000\u0000\u0000\u0670\u066e\u0001\u0000\u0000\u0000\u0670\u0671"+
		"\u0001\u0000\u0000\u0000\u0671\u0673\u0001\u0000\u0000\u0000\u0672\u0670"+
		"\u0001\u0000\u0000\u0000\u0673\u0674\u0005\u000f\u0000\u0000\u0674\u00db"+
		"\u0001\u0000\u0000\u0000\u0675\u0676\u0005\u00a2\u0000\u0000\u0676\u067a"+
		"\u0005\u0010\u0000\u0000\u0677\u0679\u0003@ \u0000\u0678\u0677\u0001\u0000"+
		"\u0000\u0000\u0679\u067c\u0001\u0000\u0000\u0000\u067a\u0678\u0001\u0000"+
		"\u0000\u0000\u067a\u067b\u0001\u0000\u0000\u0000\u067b\u067d\u0001\u0000"+
		"\u0000\u0000\u067c\u067a\u0001\u0000\u0000\u0000\u067d\u067e\u0005\u000f"+
		"\u0000\u0000\u067e\u00dd\u0001\u0000\u0000\u0000\u067f\u0680\u0005\u00a1"+
		"\u0000\u0000\u0680\u0684\u0005\u0010\u0000\u0000\u0681\u0683\u0003@ \u0000"+
		"\u0682\u0681\u0001\u0000\u0000\u0000\u0683\u0686\u0001\u0000\u0000\u0000"+
		"\u0684\u0682\u0001\u0000\u0000\u0000\u0684\u0685\u0001\u0000\u0000\u0000"+
		"\u0685\u0687\u0001\u0000\u0000\u0000\u0686\u0684\u0001\u0000\u0000\u0000"+
		"\u0687\u0688\u0005\u000f\u0000\u0000\u0688\u00df\u0001\u0000\u0000\u0000"+
		"\u0689\u068a\u0005\u00ca\u0000\u0000\u068a\u068b\u0005\u0010\u0000\u0000"+
		"\u068b\u068d\u0003\u00d2i\u0000\u068c\u068e\u0003\u00d8l\u0000\u068d\u068c"+
		"\u0001\u0000\u0000\u0000\u068e\u068f\u0001\u0000\u0000\u0000\u068f\u068d"+
		"\u0001\u0000\u0000\u0000\u068f\u0690\u0001\u0000\u0000\u0000\u0690\u0692"+
		"\u0001\u0000\u0000\u0000\u0691\u0693\u0003\u00dam\u0000\u0692\u0691\u0001"+
		"\u0000\u0000\u0000\u0692\u0693\u0001\u0000\u0000\u0000\u0693\u0695\u0001"+
		"\u0000\u0000\u0000\u0694\u0696\u0003\u00deo\u0000\u0695\u0694\u0001\u0000"+
		"\u0000\u0000\u0695\u0696\u0001\u0000\u0000\u0000\u0696\u0698\u0001\u0000"+
		"\u0000\u0000\u0697\u0699\u0003\u00dcn\u0000\u0698\u0697\u0001\u0000\u0000"+
		"\u0000\u0698\u0699\u0001\u0000\u0000\u0000\u0699\u069a\u0001\u0000\u0000"+
		"\u0000\u069a\u069b\u0005\u000f\u0000\u0000\u069b\u00e1\u0001\u0000\u0000"+
		"\u0000\u069c\u069d\u0005\u00ac\u0000\u0000\u069d\u069e\u0005\u0011\u0000"+
		"\u0000\u069e\u069f\u0007\u0003\u0000\u0000\u069f\u00e3\u0001\u0000\u0000"+
		"\u0000\u06a0\u06a1\u0005\u00ab\u0000\u0000\u06a1\u06a2\u0005\u0011\u0000"+
		"\u0000\u06a2\u06a3\u0007\u0003\u0000\u0000\u06a3\u00e5\u0001\u0000\u0000"+
		"\u0000\u06a4\u06a5\u0005d\u0000\u0000\u06a5\u06a6\u0005\u0011\u0000\u0000"+
		"\u06a6\u06a7\u0005\b\u0000\u0000\u06a7\u00e7\u0001\u0000\u0000\u0000\u06a8"+
		"\u06a9\u0005\u00aa\u0000\u0000\u06a9\u06aa\u0005\u0011\u0000\u0000\u06aa"+
		"\u06ab\u0007\u0003\u0000\u0000\u06ab\u00e9\u0001\u0000\u0000\u0000\u06ac"+
		"\u06ad\u0005\u00a9\u0000\u0000\u06ad\u06ae\u0005\u0011\u0000\u0000\u06ae"+
		"\u06af\u0007\u0003\u0000\u0000\u06af\u00eb\u0001\u0000\u0000\u0000\u06b0"+
		"\u06b1\u0005\u00a8\u0000\u0000\u06b1\u06b2\u0005\u0011\u0000\u0000\u06b2"+
		"\u06b3\u0007\u0003\u0000\u0000\u06b3\u00ed\u0001\u0000\u0000\u0000\u06b4"+
		"\u06b5\u0005\u00a7\u0000\u0000\u06b5\u06b6\u0005\u0011\u0000\u0000\u06b6"+
		"\u06b7\u0007\u0003\u0000\u0000\u06b7\u00ef\u0001\u0000\u0000\u0000\u06b8"+
		"\u06b9\u0005\u00a6\u0000\u0000\u06b9\u06ba\u0005\u0011\u0000\u0000\u06ba"+
		"\u06bb\u0007\u0003\u0000\u0000\u06bb\u00f1\u0001\u0000\u0000\u0000\u06bc"+
		"\u06bd\u0005\u00a5\u0000\u0000\u06bd\u06c1\u0005\u0010\u0000\u0000\u06be"+
		"\u06c0\u0005\u00ca\u0000\u0000\u06bf\u06be\u0001\u0000\u0000\u0000\u06c0"+
		"\u06c3\u0001\u0000\u0000\u0000\u06c1\u06bf\u0001\u0000\u0000\u0000\u06c1"+
		"\u06c2\u0001\u0000\u0000\u0000\u06c2\u06c4\u0001\u0000\u0000\u0000\u06c3"+
		"\u06c1\u0001\u0000\u0000\u0000\u06c4\u06c5\u0005\u000f\u0000\u0000\u06c5"+
		"\u00f3\u0001\u0000\u0000\u0000\u06c6\u06c7\u0005\u00a4\u0000\u0000\u06c7"+
		"\u06c8\u0005\u0011\u0000\u0000\u06c8\u06c9\u0007\u0003\u0000\u0000\u06c9"+
		"\u00f5\u0001\u0000\u0000\u0000\u06ca\u06cb\u0005\u00a3\u0000\u0000\u06cb"+
		"\u06cc\u0005\u0011\u0000\u0000\u06cc\u06cd\u0005\u00ca\u0000\u0000\u06cd"+
		"\u00f7\u0001\u0000\u0000\u0000\u06ce\u06cf\u0005-\u0000\u0000\u06cf\u06d0"+
		"\u0005\u0011\u0000\u0000\u06d0\u06d1\u0007\u0003\u0000\u0000\u06d1\u00f9"+
		"\u0001\u0000\u0000\u0000\u06d2\u06dc\u0003\u00e4r\u0000\u06d3\u06dc\u0003"+
		"\u00f2y\u0000\u06d4\u06dc\u0003\u00f0x\u0000\u06d5\u06dc\u0003z=\u0000"+
		"\u06d6\u06dc\u00030\u0018\u0000\u06d7\u06dc\u0003\u00f8|\u0000\u06d8\u06dc"+
		"\u0003\u00f6{\u0000\u06d9\u06dc\u0003t:\u0000\u06da\u06dc\u0003v;\u0000"+
		"\u06db\u06d2\u0001\u0000\u0000\u0000\u06db\u06d3\u0001\u0000\u0000\u0000"+
		"\u06db\u06d4\u0001\u0000\u0000\u0000\u06db\u06d5\u0001\u0000\u0000\u0000"+
		"\u06db\u06d6\u0001\u0000\u0000\u0000\u06db\u06d7\u0001\u0000\u0000\u0000"+
		"\u06db\u06d8\u0001\u0000\u0000\u0000\u06db\u06d9\u0001\u0000\u0000\u0000"+
		"\u06db\u06da\u0001\u0000\u0000\u0000\u06dc\u00fb\u0001\u0000\u0000\u0000"+
		"\u06dd\u06de\u0005\u00ca\u0000\u0000\u06de\u06e0\u0005\u0010\u0000\u0000"+
		"\u06df\u06e1\u0003\u00e2q\u0000\u06e0\u06df\u0001\u0000\u0000\u0000\u06e0"+
		"\u06e1\u0001\u0000\u0000\u0000\u06e1\u06e3\u0001\u0000\u0000\u0000\u06e2"+
		"\u06e4\u0003\u00e8t\u0000\u06e3\u06e2\u0001\u0000\u0000\u0000\u06e3\u06e4"+
		"\u0001\u0000\u0000\u0000\u06e4\u06e6\u0001\u0000\u0000\u0000\u06e5\u06e7"+
		"\u0003\u00e6s\u0000\u06e6\u06e5\u0001\u0000\u0000\u0000\u06e6\u06e7\u0001"+
		"\u0000\u0000\u0000\u06e7\u06e9\u0001\u0000\u0000\u0000\u06e8\u06ea\u0003"+
		"\u00f4z\u0000\u06e9\u06e8\u0001\u0000\u0000\u0000\u06e9\u06ea\u0001\u0000"+
		"\u0000\u0000\u06ea\u06ec\u0001\u0000\u0000\u0000\u06eb\u06ed\u0003\u00ee"+
		"w\u0000\u06ec\u06eb\u0001\u0000\u0000\u0000\u06ec\u06ed\u0001\u0000\u0000"+
		"\u0000\u06ed\u06ef\u0001\u0000\u0000\u0000\u06ee\u06f0\u0003\u00ecv\u0000"+
		"\u06ef\u06ee\u0001\u0000\u0000\u0000\u06ef\u06f0\u0001\u0000\u0000\u0000"+
		"\u06f0\u06f2\u0001\u0000\u0000\u0000\u06f1\u06f3\u0003\u00eau\u0000\u06f2"+
		"\u06f1\u0001\u0000\u0000\u0000\u06f2\u06f3\u0001\u0000\u0000\u0000\u06f3"+
		"\u06f7\u0001\u0000\u0000\u0000\u06f4\u06f6\u0003\u00fa}\u0000\u06f5\u06f4"+
		"\u0001\u0000\u0000\u0000\u06f6\u06f9\u0001\u0000\u0000\u0000\u06f7\u06f5"+
		"\u0001\u0000\u0000\u0000\u06f7\u06f8\u0001\u0000\u0000\u0000\u06f8\u06fa"+
		"\u0001\u0000\u0000\u0000\u06f9\u06f7\u0001\u0000\u0000\u0000\u06fa\u06fb"+
		"\u0005\u000f\u0000\u0000\u06fb\u00fd\u0001\u0000\u0000\u0000\u06fc\u06fd"+
		"\u0007\u0011\u0000\u0000\u06fd\u0701\u0005\u0010\u0000\u0000\u06fe\u0700"+
		"\u0003d2\u0000\u06ff\u06fe\u0001\u0000\u0000\u0000\u0700\u0703\u0001\u0000"+
		"\u0000\u0000\u0701\u06ff\u0001\u0000\u0000\u0000\u0701\u0702\u0001\u0000"+
		"\u0000\u0000\u0702\u0704\u0001\u0000\u0000\u0000\u0703\u0701\u0001\u0000"+
		"\u0000\u0000\u0704\u0705\u0005\u000f\u0000\u0000\u0705\u00ff\u0001\u0000"+
		"\u0000\u0000\u0706\u0707\u0007\u0012\u0000\u0000\u0707\u070b\u0005\u0010"+
		"\u0000\u0000\u0708\u070a\u0003D\"\u0000\u0709\u0708\u0001\u0000\u0000"+
		"\u0000\u070a\u070d\u0001\u0000\u0000\u0000\u070b\u0709\u0001\u0000\u0000"+
		"\u0000\u070b\u070c\u0001\u0000\u0000\u0000\u070c\u070e\u0001\u0000\u0000"+
		"\u0000\u070d\u070b\u0001\u0000\u0000\u0000\u070e\u070f\u0005\u000f\u0000"+
		"\u0000\u070f\u0101\u0001\u0000\u0000\u0000\u0710\u0711\u0007\u0013\u0000"+
		"\u0000\u0711\u0713\u0005\u0010\u0000\u0000\u0712\u0714\u0005\u00ca\u0000"+
		"\u0000\u0713\u0712\u0001\u0000\u0000\u0000\u0714\u0715\u0001\u0000\u0000"+
		"\u0000\u0715\u0713\u0001\u0000\u0000\u0000\u0715\u0716\u0001\u0000\u0000"+
		"\u0000\u0716\u0717\u0001\u0000\u0000\u0000\u0717\u0718\u0005\u000f\u0000"+
		"\u0000\u0718\u0103\u0001\u0000\u0000\u0000\u0719\u071a\u0005\u00b3\u0000"+
		"\u0000\u071a\u071b\u0005\u0011\u0000\u0000\u071b\u071c\u0003&\u0013\u0000"+
		"\u071c\u0105\u0001\u0000\u0000\u0000\u071d\u071e\u0005(\u0000\u0000\u071e"+
		"\u071f\u0005\u0011\u0000\u0000\u071f\u0720\u0005\b\u0000\u0000\u0720\u0107"+
		"\u0001\u0000\u0000\u0000\u0721\u0722\u0005)\u0000\u0000\u0722\u0723\u0005"+
		"\u0011\u0000\u0000\u0723\u0724\u0005\b\u0000\u0000\u0724\u0109\u0001\u0000"+
		"\u0000\u0000\u0725\u0726\u0005\u00af\u0000\u0000\u0726\u0727\u0005\u0011"+
		"\u0000\u0000\u0727\u0728\u0007\u0003\u0000\u0000\u0728\u010b\u0001\u0000"+
		"\u0000\u0000\u0729\u072a\u0005\u00b4\u0000\u0000\u072a\u072b\u0005\u0011"+
		"\u0000\u0000\u072b\u072c\u0007\u0003\u0000\u0000\u072c\u010d\u0001\u0000"+
		"\u0000\u0000\u072d\u0735\u0003\u0106\u0083\u0000\u072e\u0735\u0003\u0108"+
		"\u0084\u0000\u072f\u0735\u0003\u010a\u0085\u0000\u0730\u0735\u0003\u010c"+
		"\u0086\u0000\u0731\u0735\u0003\u0114\u008a\u0000\u0732\u0735\u0003\u0110"+
		"\u0088\u0000\u0733\u0735\u0003\u0112\u0089\u0000\u0734\u072d\u0001\u0000"+
		"\u0000\u0000\u0734\u072e\u0001\u0000\u0000\u0000\u0734\u072f\u0001\u0000"+
		"\u0000\u0000\u0734\u0730\u0001\u0000\u0000\u0000\u0734\u0731\u0001\u0000"+
		"\u0000\u0000\u0734\u0732\u0001\u0000\u0000\u0000\u0734\u0733\u0001\u0000"+
		"\u0000\u0000\u0735\u010f\u0001\u0000\u0000\u0000\u0736\u0737\u0005\u00ad"+
		"\u0000\u0000\u0737\u0738\u0005\u0011\u0000\u0000\u0738\u0739\u0007\u0003"+
		"\u0000\u0000\u0739\u0111\u0001\u0000\u0000\u0000\u073a\u073b\u0005\u00b0"+
		"\u0000\u0000\u073b\u073c\u0005\u0011\u0000\u0000\u073c\u073d\u0005\u00ca"+
		"\u0000\u0000\u073d\u0113\u0001\u0000\u0000\u0000\u073e\u073f\u0005\u00ae"+
		"\u0000\u0000\u073f\u0740\u0005\u0011\u0000\u0000\u0740\u0741\u0007\u0003"+
		"\u0000\u0000\u0741\u0115\u0001\u0000\u0000\u0000\u0742\u0743\u0005\u00ca"+
		"\u0000\u0000\u0743\u074d\u0005\u0010\u0000\u0000\u0744\u074c\u0003\u0102"+
		"\u0081\u0000\u0745\u074c\u0003\u010e\u0087\u0000\u0746\u074c\u0003\u0100"+
		"\u0080\u0000\u0747\u074c\u0003\u00fe\u007f\u0000\u0748\u074c\u0003\u0104"+
		"\u0082\u0000\u0749\u074c\u0003\u000e\u0007\u0000\u074a\u074c\u0003\u0012"+
		"\t\u0000\u074b\u0744\u0001\u0000\u0000\u0000\u074b\u0745\u0001\u0000\u0000"+
		"\u0000\u074b\u0746\u0001\u0000\u0000\u0000\u074b\u0747\u0001\u0000\u0000"+
		"\u0000\u074b\u0748\u0001\u0000\u0000\u0000\u074b\u0749\u0001\u0000\u0000"+
		"\u0000\u074b\u074a\u0001\u0000\u0000\u0000\u074c\u074f\u0001\u0000\u0000"+
		"\u0000\u074d\u074b\u0001\u0000\u0000\u0000\u074d\u074e\u0001\u0000\u0000"+
		"\u0000\u074e\u0750\u0001\u0000\u0000\u0000\u074f\u074d\u0001\u0000\u0000"+
		"\u0000\u0750\u0751\u0005\u000f\u0000\u0000\u0751\u0117\u0001\u0000\u0000"+
		"\u0000\u0752\u0753\u0005\u00b5\u0000\u0000\u0753\u0754\u0005\u0010\u0000"+
		"\u0000\u0754\u0755\u0003*\u0015\u0000\u0755\u0756\u0003\u00c8d\u0000\u0756"+
		"\u075c\u0003,\u0016\u0000\u0757\u0758\u0005\u00b7\u0000\u0000\u0758\u0759"+
		"\u0005\u0011\u0000\u0000\u0759\u075b\u0005\b\u0000\u0000\u075a\u0757\u0001"+
		"\u0000\u0000\u0000\u075b\u075e\u0001\u0000\u0000\u0000\u075c\u075a\u0001"+
		"\u0000\u0000\u0000\u075c\u075d\u0001\u0000\u0000\u0000\u075d\u075f\u0001"+
		"\u0000\u0000\u0000\u075e\u075c\u0001\u0000\u0000\u0000\u075f\u0760\u0005"+
		"\u00b6\u0000\u0000\u0760\u0764\u0005\u0011\u0000\u0000\u0761\u0763\u0007"+
		"\u0003\u0000\u0000\u0762\u0761\u0001\u0000\u0000\u0000\u0763\u0766\u0001"+
		"\u0000\u0000\u0000\u0764\u0762\u0001\u0000\u0000\u0000\u0764\u0765\u0001"+
		"\u0000\u0000\u0000\u0765\u076c\u0001\u0000\u0000\u0000\u0766\u0764\u0001"+
		"\u0000\u0000\u0000\u0767\u0768\u0005\u00b9\u0000\u0000\u0768\u0769\u0005"+
		"\u0011\u0000\u0000\u0769\u076b\u0005\u0007\u0000\u0000\u076a\u0767\u0001"+
		"\u0000\u0000\u0000\u076b\u076e\u0001\u0000\u0000\u0000\u076c\u076a\u0001"+
		"\u0000\u0000\u0000\u076c\u076d\u0001\u0000\u0000\u0000\u076d\u0774\u0001"+
		"\u0000\u0000\u0000\u076e\u076c\u0001\u0000\u0000\u0000\u076f\u0770\u0005"+
		"\u00b8\u0000\u0000\u0770\u0771\u0005\u0011\u0000\u0000\u0771\u0773\u0005"+
		"\u0007\u0000\u0000\u0772\u076f\u0001\u0000\u0000\u0000\u0773\u0776\u0001"+
		"\u0000\u0000\u0000\u0774\u0772\u0001\u0000\u0000\u0000\u0774\u0775\u0001"+
		"\u0000\u0000\u0000\u0775\u0777\u0001\u0000\u0000\u0000\u0776\u0774\u0001"+
		"\u0000\u0000\u0000\u0777\u0778\u0005\u000f\u0000\u0000\u0778\u0119\u0001"+
		"\u0000\u0000\u0000\u0779\u077a\u0005\u00ca\u0000\u0000\u077a\u07a3\u0005"+
		"\u0010\u0000\u0000\u077b\u077c\u00059\u0000\u0000\u077c\u0780\u0005\u0010"+
		"\u0000\u0000\u077d\u077f\u0003\u0014\n\u0000\u077e\u077d\u0001\u0000\u0000"+
		"\u0000\u077f\u0782\u0001\u0000\u0000\u0000\u0780\u077e\u0001\u0000\u0000"+
		"\u0000\u0780\u0781\u0001\u0000\u0000\u0000\u0781\u0783\u0001\u0000\u0000"+
		"\u0000\u0782\u0780\u0001\u0000\u0000\u0000\u0783\u0784\u0003\u0010\b\u0000"+
		"\u0784\u0785\u0005\u000f\u0000\u0000\u0785\u07a2\u0001\u0000\u0000\u0000"+
		"\u0786\u0787\u0005:\u0000\u0000\u0787\u078b\u0005\u0010\u0000\u0000\u0788"+
		"\u078a\u0003\u0014\n\u0000\u0789\u0788\u0001\u0000\u0000\u0000\u078a\u078d"+
		"\u0001\u0000\u0000\u0000\u078b\u0789\u0001\u0000\u0000\u0000\u078b\u078c"+
		"\u0001\u0000\u0000\u0000\u078c\u078e\u0001\u0000\u0000\u0000\u078d\u078b"+
		"\u0001\u0000\u0000\u0000\u078e\u078f\u0003\u0010\b\u0000\u078f\u0790\u0005"+
		"\u000f\u0000\u0000\u0790\u07a2\u0001\u0000\u0000\u0000\u0791\u0792\u0005"+
		";\u0000\u0000\u0792\u0796\u0005\u0010\u0000\u0000\u0793\u0795\u0003\u0014"+
		"\n\u0000\u0794\u0793\u0001\u0000\u0000\u0000\u0795\u0798\u0001\u0000\u0000"+
		"\u0000\u0796\u0794\u0001\u0000\u0000\u0000\u0796\u0797\u0001\u0000\u0000"+
		"\u0000\u0797\u0799\u0001\u0000\u0000\u0000\u0798\u0796\u0001\u0000\u0000"+
		"\u0000\u0799\u079a\u0003\u0010\b\u0000\u079a\u079b\u0005\u000f\u0000\u0000"+
		"\u079b\u07a2\u0001\u0000\u0000\u0000\u079c\u07a2\u0003\u0014\n\u0000\u079d"+
		"\u07a2\u0003\u0010\b\u0000\u079e\u07a2\u0003\u011c\u008e\u0000\u079f\u07a2"+
		"\u0003\u011e\u008f\u0000\u07a0\u07a2\u0003@ \u0000\u07a1\u077b\u0001\u0000"+
		"\u0000\u0000\u07a1\u0786\u0001\u0000\u0000\u0000\u07a1\u0791\u0001\u0000"+
		"\u0000\u0000\u07a1\u079c\u0001\u0000\u0000\u0000\u07a1\u079d\u0001\u0000"+
		"\u0000\u0000\u07a1\u079e\u0001\u0000\u0000\u0000\u07a1\u079f\u0001\u0000"+
		"\u0000\u0000\u07a1\u07a0\u0001\u0000\u0000\u0000\u07a2\u07a5\u0001\u0000"+
		"\u0000\u0000\u07a3\u07a1\u0001\u0000\u0000\u0000\u07a3\u07a4\u0001\u0000"+
		"\u0000\u0000\u07a4\u07a6\u0001\u0000\u0000\u0000\u07a5\u07a3\u0001\u0000"+
		"\u0000\u0000\u07a6\u07a7\u0005\u000f\u0000\u0000\u07a7\u011b\u0001\u0000"+
		"\u0000\u0000\u07a8\u07a9\u0005<\u0000\u0000\u07a9\u07aa\u0005\u0010\u0000"+
		"\u0000\u07aa\u07ab\u0003$\u0012\u0000\u07ab\u07ac\u0005\u000f\u0000\u0000"+
		"\u07ac\u011d\u0001\u0000\u0000\u0000\u07ad\u07ae\u0005c\u0000\u0000\u07ae"+
		"\u07af\u0005\u0010\u0000\u0000\u07af\u07b0\u0003\"\u0011\u0000\u07b0\u07b1"+
		"\u0003$\u0012\u0000\u07b1\u07b2\u0005\u000f\u0000\u0000\u07b2\u011f\u0001"+
		"\u0000\u0000\u0000\u07b3\u07b4\u0005\u00ca\u0000\u0000\u07b4\u07b5\u0005"+
		"\u0010\u0000\u0000\u07b5\u07b6\u0003\u0010\b\u0000\u07b6\u07b7\u0005\u00c5"+
		"\u0000\u0000\u07b7\u07b8\u0005\u0011\u0000\u0000\u07b8\u07b9\u0005\b\u0000"+
		"\u0000\u07b9\u07ba\u0005\u000f\u0000\u0000\u07ba\u0121\u0001\u0000\u0000"+
		"\u0000\u07bb\u07bc\u0005\u00bb\u0000\u0000\u07bc\u07bd\u0005\u0011\u0000"+
		"\u0000\u07bd\u07be\u0005\b\u0000\u0000\u07be\u0123\u0001\u0000\u0000\u0000"+
		"\u07bf\u07c0\u0005\u00bc\u0000\u0000\u07c0\u07c4\u0005\u0010\u0000\u0000"+
		"\u07c1\u07c3\u0003d2\u0000\u07c2\u07c1\u0001\u0000\u0000\u0000\u07c3\u07c6"+
		"\u0001\u0000\u0000\u0000\u07c4\u07c2\u0001\u0000\u0000\u0000\u07c4\u07c5"+
		"\u0001\u0000\u0000\u0000\u07c5\u07c7\u0001\u0000\u0000\u0000\u07c6\u07c4"+
		"\u0001\u0000\u0000\u0000\u07c7\u07c8\u0005\u000f\u0000\u0000\u07c8\u0125"+
		"\u0001\u0000\u0000\u0000\u07c9\u07ca\u0005\u00ca\u0000\u0000\u07ca\u07cf"+
		"\u0005\u0010\u0000\u0000\u07cb\u07ce\u0003\u0014\n\u0000\u07cc\u07ce\u0003"+
		"d2\u0000\u07cd\u07cb\u0001\u0000\u0000\u0000\u07cd\u07cc\u0001\u0000\u0000"+
		"\u0000\u07ce\u07d1\u0001\u0000\u0000\u0000\u07cf\u07cd\u0001\u0000\u0000"+
		"\u0000\u07cf\u07d0\u0001\u0000\u0000\u0000\u07d0\u07d2\u0001\u0000\u0000"+
		"\u0000\u07d1\u07cf\u0001\u0000\u0000\u0000\u07d2\u07d3\u0005\u000f\u0000"+
		"\u0000\u07d3\u0127\u0001\u0000\u0000\u0000\u07d4\u07d5\u0005\u00bd\u0000"+
		"\u0000\u07d5\u07d9\u0005\u0010\u0000\u0000\u07d6\u07d8\u0003\u0126\u0093"+
		"\u0000\u07d7\u07d6\u0001\u0000\u0000\u0000\u07d8\u07db\u0001\u0000\u0000"+
		"\u0000\u07d9\u07d7\u0001\u0000\u0000\u0000\u07d9\u07da\u0001\u0000\u0000"+
		"\u0000\u07da\u07dc\u0001\u0000\u0000\u0000\u07db\u07d9\u0001\u0000\u0000"+
		"\u0000\u07dc\u07dd\u0005\u000f\u0000\u0000\u07dd\u0129\u0001\u0000\u0000"+
		"\u0000\u07de\u07df\u0005\u00ca\u0000\u0000\u07df\u07e5\u0005\u0010\u0000"+
		"\u0000\u07e0\u07e4\u0003\u0014\n\u0000\u07e1\u07e4\u0003\n\u0005\u0000"+
		"\u07e2\u07e4\u0003\u000e\u0007\u0000\u07e3\u07e0\u0001\u0000\u0000\u0000"+
		"\u07e3\u07e1\u0001\u0000\u0000\u0000\u07e3\u07e2\u0001\u0000\u0000\u0000"+
		"\u07e4\u07e7\u0001\u0000\u0000\u0000\u07e5\u07e3\u0001\u0000\u0000\u0000"+
		"\u07e5\u07e6\u0001\u0000\u0000\u0000\u07e6\u07e8\u0001\u0000\u0000\u0000"+
		"\u07e7\u07e5\u0001\u0000\u0000\u0000\u07e8\u07e9\u0003\u0012\t\u0000\u07e9"+
		"\u07ea\u0005\u000f\u0000\u0000\u07ea\u012b\u0001\u0000\u0000\u0000\u07eb"+
		"\u07ec\u0005\u00be\u0000\u0000\u07ec\u07f0\u0005\u0010\u0000\u0000\u07ed"+
		"\u07ef\u0003\u012a\u0095\u0000\u07ee\u07ed\u0001\u0000\u0000\u0000\u07ef"+
		"\u07f2\u0001\u0000\u0000\u0000\u07f0\u07ee\u0001\u0000\u0000\u0000\u07f0"+
		"\u07f1\u0001\u0000\u0000\u0000\u07f1\u07f3\u0001\u0000\u0000\u0000\u07f2"+
		"\u07f0\u0001\u0000\u0000\u0000\u07f3\u07f4\u0005\u000f\u0000\u0000\u07f4"+
		"\u012d\u0001\u0000\u0000\u0000\u07f5\u07f6\u0005\u00ca\u0000\u0000\u07f6"+
		"\u07f7\u0005\u0010\u0000\u0000\u07f7\u07f8\u0003\u0122\u0091\u0000\u07f8"+
		"\u0801\u0003\u0124\u0092\u0000\u07f9\u07fa\u0005\u00bf\u0000\u0000\u07fa"+
		"\u07fb\u0005\u0011\u0000\u0000\u07fb\u0800\u0007\u0003\u0000\u0000\u07fc"+
		"\u07fd\u0005\u00c0\u0000\u0000\u07fd\u07fe\u0005\u0011\u0000\u0000\u07fe"+
		"\u0800\u0005\n\u0000\u0000\u07ff\u07f9\u0001\u0000\u0000\u0000\u07ff\u07fc"+
		"\u0001\u0000\u0000\u0000\u0800\u0803\u0001\u0000\u0000\u0000\u0801\u07ff"+
		"\u0001\u0000\u0000\u0000\u0801\u0802\u0001\u0000\u0000\u0000\u0802\u0804"+
		"\u0001\u0000\u0000\u0000\u0803\u0801\u0001\u0000\u0000\u0000\u0804\u0805"+
		"\u0003\u0128\u0094\u0000\u0805\u0806\u0003\u012c\u0096\u0000\u0806\u012f"+
		"\u0001\u0000\u0000\u0000\u0807\u0808\u0005\u00ca\u0000\u0000\u0808\u0809"+
		"\u0005\u0010\u0000\u0000\u0809\u080e\u0003\u0132\u0099\u0000\u080a\u080d"+
		"\u0003@ \u0000\u080b\u080d\u0003B!\u0000\u080c\u080a\u0001\u0000\u0000"+
		"\u0000\u080c\u080b\u0001\u0000\u0000\u0000\u080d\u0810\u0001\u0000\u0000"+
		"\u0000\u080e\u080c\u0001\u0000\u0000\u0000\u080e\u080f\u0001\u0000\u0000"+
		"\u0000\u080f\u0811\u0001\u0000\u0000\u0000\u0810\u080e\u0001\u0000\u0000"+
		"\u0000\u0811\u0812\u0003\u0010\b\u0000\u0812\u0813\u0003\u0012\t\u0000"+
		"\u0813\u0814\u0005\u000f\u0000\u0000\u0814\u0131\u0001\u0000\u0000\u0000"+
		"\u0815\u0816\u0005\u009a\u0000\u0000\u0816\u0817\u0005\u0011\u0000\u0000"+
		"\u0817\u0818\u0005\u0006\u0000\u0000\u0818\u0133\u0001\u0000\u0000\u0000"+
		"\u0819\u081a\u0005\u00ca\u0000\u0000\u081a\u0824\u0005\u0010\u0000\u0000"+
		"\u081b\u0823\u0003\u0136\u009b\u0000\u081c\u0823\u0003\u0138\u009c\u0000"+
		"\u081d\u0823\u0003x<\u0000\u081e\u0823\u0003\u013a\u009d\u0000\u081f\u0823"+
		"\u0003\u013c\u009e\u0000\u0820\u0823\u0003\u013e\u009f\u0000\u0821\u0823"+
		"\u0003\u0140\u00a0\u0000\u0822\u081b\u0001\u0000\u0000\u0000\u0822\u081c"+
		"\u0001\u0000\u0000\u0000\u0822\u081d\u0001\u0000\u0000\u0000\u0822\u081e"+
		"\u0001\u0000\u0000\u0000\u0822\u081f\u0001\u0000\u0000\u0000\u0822\u0820"+
		"\u0001\u0000\u0000\u0000\u0822\u0821\u0001\u0000\u0000\u0000\u0823\u0826"+
		"\u0001\u0000\u0000\u0000\u0824\u0822\u0001\u0000\u0000\u0000\u0824\u0825"+
		"\u0001\u0000\u0000\u0000\u0825\u0827\u0001\u0000\u0000\u0000\u0826\u0824"+
		"\u0001\u0000\u0000\u0000\u0827\u0828\u0005\u000f\u0000\u0000\u0828\u0135"+
		"\u0001\u0000\u0000\u0000\u0829\u082a\u0005\u00c1\u0000\u0000\u082a\u082b"+
		"\u0005\u0011\u0000\u0000\u082b\u082c\u0005\b\u0000\u0000\u082c\u0137\u0001"+
		"\u0000\u0000\u0000\u082d\u082e\u0005\u00c2\u0000\u0000\u082e\u082f\u0005"+
		"\u0011\u0000\u0000\u082f\u0830\u0007\u0003\u0000\u0000\u0830\u0139\u0001"+
		"\u0000\u0000\u0000\u0831\u0832\u0005\u00c3\u0000\u0000\u0832\u0833\u0005"+
		"\u0011\u0000\u0000\u0833\u0834\u0007\u0003\u0000\u0000\u0834\u013b\u0001"+
		"\u0000\u0000\u0000\u0835\u0836\u0005\u00c4\u0000\u0000\u0836\u083a\u0005"+
		"\u0010\u0000\u0000\u0837\u0839\u0003d2\u0000\u0838\u0837\u0001\u0000\u0000"+
		"\u0000\u0839\u083c\u0001\u0000\u0000\u0000\u083a\u0838\u0001\u0000\u0000"+
		"\u0000\u083a\u083b\u0001\u0000\u0000\u0000\u083b\u083d\u0001\u0000\u0000"+
		"\u0000\u083c\u083a\u0001\u0000\u0000\u0000\u083d\u083e\u0005\u000f\u0000"+
		"\u0000\u083e\u013d\u0001\u0000\u0000\u0000\u083f\u0840\u0005\u001f\u0000"+
		"\u0000\u0840\u0844\u0005\u0010\u0000\u0000\u0841\u0843\u0003d2\u0000\u0842"+
		"\u0841\u0001\u0000\u0000\u0000\u0843\u0846\u0001\u0000\u0000\u0000\u0844"+
		"\u0842\u0001\u0000\u0000\u0000\u0844\u0845\u0001\u0000\u0000\u0000\u0845"+
		"\u0847\u0001\u0000\u0000\u0000\u0846\u0844\u0001\u0000\u0000\u0000\u0847"+
		"\u0848\u0005\u000f\u0000\u0000\u0848\u013f\u0001\u0000\u0000\u0000\u0849"+
		"\u084a\u0005\u00ca\u0000\u0000\u084a\u0855\u0005\u0010\u0000\u0000\u084b"+
		"\u0854\u0003\u0142\u00a1\u0000\u084c\u0854\u0003\u0144\u00a2\u0000\u084d"+
		"\u0854\u0003\u0146\u00a3\u0000\u084e\u0854\u0003\u0148\u00a4\u0000\u084f"+
		"\u0854\u0003\u014a\u00a5\u0000\u0850\u0854\u0003\u0006\u0003\u0000\u0851"+
		"\u0854\u0003\n\u0005\u0000\u0852\u0854\u0003\u014c\u00a6\u0000\u0853\u084b"+
		"\u0001\u0000\u0000\u0000\u0853\u084c\u0001\u0000\u0000\u0000\u0853\u084d"+
		"\u0001\u0000\u0000\u0000\u0853\u084e\u0001\u0000\u0000\u0000\u0853\u084f"+
		"\u0001\u0000\u0000\u0000\u0853\u0850\u0001\u0000\u0000\u0000\u0853\u0851"+
		"\u0001\u0000\u0000\u0000\u0853\u0852\u0001\u0000\u0000\u0000\u0854\u0857"+
		"\u0001\u0000\u0000\u0000\u0855\u0853\u0001\u0000\u0000\u0000\u0855\u0856"+
		"\u0001\u0000\u0000\u0000\u0856\u0858\u0001\u0000\u0000\u0000\u0857\u0855"+
		"\u0001\u0000\u0000\u0000\u0858\u0859\u0005\u000f\u0000\u0000\u0859\u0141"+
		"\u0001\u0000\u0000\u0000\u085a\u085b\u0005\u00c5\u0000\u0000\u085b\u085c"+
		"\u0005\u0011\u0000\u0000\u085c\u085d\u0005\u00ca\u0000\u0000\u085d\u0143"+
		"\u0001\u0000\u0000\u0000\u085e\u085f\u0005\u00c6\u0000\u0000\u085f\u0860"+
		"\u0005\u0011\u0000\u0000\u0860\u0861\u0005\b\u0000\u0000\u0861\u0145\u0001"+
		"\u0000\u0000\u0000\u0862\u0863\u0005\u00c7\u0000\u0000\u0863\u0864\u0005"+
		"\u0011\u0000\u0000\u0864\u0865\u0005\t\u0000\u0000\u0865\u0147\u0001\u0000"+
		"\u0000\u0000\u0866\u0867\u0005\u00c8\u0000\u0000\u0867\u086b\u0005\u0010"+
		"\u0000\u0000\u0868\u086a\u0005\u00ca\u0000\u0000\u0869\u0868\u0001\u0000"+
		"\u0000\u0000\u086a\u086d\u0001\u0000\u0000\u0000\u086b\u0869\u0001\u0000"+
		"\u0000\u0000\u086b\u086c\u0001\u0000\u0000\u0000\u086c\u086e\u0001\u0000"+
		"\u0000\u0000\u086d\u086b\u0001\u0000\u0000\u0000\u086e\u086f\u0005\u000f"+
		"\u0000\u0000\u086f\u0149\u0001\u0000\u0000\u0000\u0870\u0871\u0005\u00c9"+
		"\u0000\u0000\u0871\u0875\u0005\u0010\u0000\u0000\u0872\u0874\u0003d2\u0000"+
		"\u0873\u0872\u0001\u0000\u0000\u0000\u0874\u0877\u0001\u0000\u0000\u0000"+
		"\u0875\u0873\u0001\u0000\u0000\u0000\u0875\u0876\u0001\u0000\u0000\u0000"+
		"\u0876\u0878\u0001\u0000\u0000\u0000\u0877\u0875\u0001\u0000\u0000\u0000"+
		"\u0878\u0879\u0005\u000f\u0000\u0000\u0879\u014b\u0001\u0000\u0000\u0000"+
		"\u087a\u087b\u0005b\u0000\u0000\u087b\u087c\u0005\u0010\u0000\u0000\u087c"+
		"\u087d\u0003\"\u0011\u0000\u087d\u087e\u0005\u000f\u0000\u0000\u087e\u014d"+
		"\u0001\u0000\u0000\u0000\u00ba\u0151\u0157\u015d\u0163\u0169\u016f\u0175"+
		"\u017b\u0181\u0187\u018d\u0193\u0199\u019f\u01a5\u01ab\u01b1\u01b7\u01bd"+
		"\u01c0\u01c5\u01c7\u01ce\u01d5\u01df\u01e9\u01f3\u01fd\u0207\u020d\u0218"+
		"\u0222\u022d\u022f\u0238\u023d\u0242\u024b\u024f\u0267\u0274\u0276\u0294"+
		"\u029e\u02a9\u02b4\u02ba\u02bc\u02c5\u02d0\u02d2\u02dd\u02e2\u0303\u0332"+
		"\u034c\u035b\u036a\u0379\u0388\u0397\u03a5\u03c5\u03cd\u03cf\u03de\u03e0"+
		"\u03e9\u03eb\u03fb\u0418\u0422\u042c\u044c\u046f\u047c\u047e\u0488\u0492"+
		"\u049d\u049f\u04a9\u04ab\u04b9\u04c0\u04c9\u04cd\u04cf\u04d9\u04e3\u04e5"+
		"\u04ea\u04f6\u0503\u0514\u0516\u0520\u0525\u052a\u0540\u0546\u054e\u0558"+
		"\u0562\u056f\u0571\u057c\u057e\u058e\u0593\u0598\u059d\u05a6\u05b2\u05c2"+
		"\u05c7\u05cc\u05cf\u05d1\u05da\u05e5\u05f0\u0600\u0606\u060e\u0612\u0614"+
		"\u0625\u062b\u0638\u063a\u0650\u0652\u0656\u0669\u0670\u067a\u0684\u068f"+
		"\u0692\u0695\u0698\u06c1\u06db\u06e0\u06e3\u06e6\u06e9\u06ec\u06ef\u06f2"+
		"\u06f7\u0701\u070b\u0715\u0734\u074b\u074d\u075c\u0764\u076c\u0774\u0780"+
		"\u078b\u0796\u07a1\u07a3\u07c4\u07cd\u07cf\u07d9\u07e3\u07e5\u07f0\u07ff"+
		"\u0801\u080c\u080e\u0822\u0824\u083a\u0844\u0853\u0855\u086b\u0875";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}