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
		DATE=11, MONTHS=12, LPAR=13, RPAR=14, LE=15, EQUALS=16, PLUS=17, MINUS=18, 
		WHITESPACE=19, SINGLE_LINE_COMMENT=20, IF=21, ELSE=22, ELSE_IF=23, LIMIT=24, 
		WHILE=25, SKILL_SACLED_MOD=26, POTENTIAL=27, TRIGGER=28, EFFECT=29, ALLOW=30, 
		CALC_TRUE_IF=31, AMOUNT=32, DATE_KEY=33, NAME=34, NAMES=35, COST=36, TIME=37, 
		IS_TIRGGERED_ONLY=38, PREREQUISITES=39, PREREQUISITES_SELF=40, NO_OPINION_HIT=41, 
		COLOR=42, CHECK_VARIABLE=43, SUBTRACKT_VARIABLE=44, CHANGE_VARIABLE=45, 
		SET_VARIABLE=46, DIVIDE_VARIABLE=47, MULTIPLY_VARIABLE=48, EXPORT_TO_VARIABLE=49, 
		WHICH=50, VALUE=51, WHO=52, RULER_ALLOW=53, HEIR_ALLOW=54, CONSORT_ALLOW=55, 
		WAR_PRIORITY=56, ON_BUILT=57, ON_DESTORYED=58, ON_CONSTRUCTION_STARTED=59, 
		ON_CONSTRUCTION_CANCELED=60, ON_OBSOLETE=61, KEEP_TRIGGER=62, BUILD_TRIGGER=63, 
		TRADE_SHARE=64, PRIVATEER_POWER=65, SHARE=66, HIDDEN_EFFECT=67, HAS_OPINION_MODIFIER=68, 
		REMOVE_OPINION=69, REVERSE_REMOVE_OPINION=70, ADD_OPINION=71, REVERSE_ADD_OPINION=72, 
		TOOLTIP=73, CUSTOM_TOOLTIP=74, DESC=75, CUSTOM_TRIGGER_TOOLTIP=76, TRIGGER_NAME=77, 
		MODIFIER_NAME=78, EFFECT_NAME=79, SCOPE=80, ADD_PROVINCE_MOD=81, ADD_COUNTRY_MOD=82, 
		DURATION=83, AI=84, MODIFIER=85, CHANCE=86, AI_WILL_DO=87, FACTOR=88, 
		AI_WEIGHT=89, AI_PICK_ANCESTOR=90, AI_PEACE_DESIRE=91, MALE_NAMES=92, 
		FEMALE_NAMES=93, DYNASTY_NAMES=94, PRIMARY=95, COLOR1=96, COLOR2=97, COLOR3=98, 
		GRAPHICAL_CULTURE=99, REVOLUTIONARY_COLORS=100, HISTORICAL_IDEA_GROUPS=101, 
		HISTORICAL_UNITS=102, MONARCH_NAMES=103, LEADER_NAMES=104, SHIP_NAMES=105, 
		ARMY_NAMES=106, FLEET_NAMES=107, TAX_INCOME=108, NATIVE_SIZE=109, NATIVE_FEROCITY=110, 
		NATIVE_HOSTILENESS=111, TRADE_GOODS=112, CULTURE=113, RELIGION=114, PROVINCES=115, 
		REGION=116, IS_BLESSING=117, SPRITE=118, MONARCH_POWER=119, LEVEL=120, 
		DEVELOPMENT=121, INLAND=122, COASTAL=123, TYPE=124, PROVINCE_MODIFIER=125, 
		STATE_MODIFIER=126, GLOBAL_MODIFIER=127, WAR_GOAL=128, IS_VALID_FOR_SUBJECT=129, 
		ATTACKER_DISABLED_PO=130, HOLY_WAR=131, EXCLUSIVE=132, INDEPENDENCE=133, 
		COALITION=134, SUPPORT_REBELS=135, CALL_EMPIRE_MEMBERS=136, LEAGUE=137, 
		ALLOWED_IN_GOLD_PROVINCES=138, INFLUENCING_FORT=139, ONMAP=140, MAKE_OBSOLETE=141, 
		MANUFACTORY=142, BONUS_MANUFACTORY=143, BONUS_MODIFIER=144, SHOW_SEPERATE=145, 
		BOOKMARK=146, DEFAULT=147, CENTER=148, EASY_COUNTRY=149, COUNTRY=150, 
		PROVINCE=151, START=152, CAN_START=153, OBJECTIVES=154, ABILITIES=155, 
		RELIGIOUS_CONFLICTS=156, PAPACY=157, SLOT=158, GENERIC=159, HAS_COUNTRY_SHIELD=160, 
		POTENTIAL_ON_LOAD=161, ICON=162, POSITION=163, COMPLETED_BY=164, REQUIRED_MISSIONS=165, 
		PROVINCES_TO_HIGHLIGHT=166, IDENTIFIER=167, STRING_TOOLTIP=168;
	public static final int
		RULE_file = 0, RULE_block = 1, RULE_statement = 2, RULE_trigger_block = 3, 
		RULE_potential_block = 4, RULE_effect_block = 5, RULE_modifier_block = 6, 
		RULE_chance_block = 7, RULE_ai_will_do_block = 8, RULE_allow = 9, RULE_name_block = 10, 
		RULE_color_block = 11, RULE_provinces_block = 12, RULE_factor = 13, RULE_chance_modifier = 14, 
		RULE_value = 15, RULE_amount = 16, RULE_name = 17, RULE_date = 18, RULE_bool = 19, 
		RULE_months = 20, RULE_limit = 21, RULE_eLSE = 22, RULE_else_if = 23, 
		RULE_if_statement = 24, RULE_while = 25, RULE_scope = 26, RULE_scriptedEffect = 27, 
		RULE_modifier = 28, RULE_skill_scaled_modifier = 29, RULE_effect = 30, 
		RULE_reverse_remove_opinion = 31, RULE_remove_opinion = 32, RULE_add_opinion = 33, 
		RULE_reverse_add_opinion = 34, RULE_hidden_effect = 35, RULE_add_modifier = 36, 
		RULE_multiply_variable = 37, RULE_subtrackt_variable = 38, RULE_change_variable = 39, 
		RULE_set_variable = 40, RULE_divide_variable = 41, RULE_export_to_variable = 42, 
		RULE_mana_trigger = 43, RULE_trigger = 44, RULE_has_opinion_modifier = 45, 
		RULE_calc_true_if = 46, RULE_check_variable = 47, RULE_trade_share = 48, 
		RULE_privateer_power = 49, RULE_scripted_trigger = 50, RULE_prerequisites = 51, 
		RULE_prerequisites_self = 52, RULE_ai_trigger = 53, RULE_is_triggered_only = 54, 
		RULE_region_trigger = 55, RULE_trigger_sub_block = 56, RULE_culture_modifier_block = 57, 
		RULE_culture_names = 58, RULE_culture_group = 59, RULE_culture = 60, RULE_country_tags = 61, 
		RULE_country_color = 62, RULE_common_countires_block = 63, RULE_monarch_names = 64, 
		RULE_common_country = 65, RULE_trade_goods_block = 66, RULE_culture_block = 67, 
		RULE_religion_block = 68, RULE_col_simple_attr = 69, RULE_col_region_attr = 70, 
		RULE_colonial_region = 71, RULE_tooltip = 72, RULE_custom_tooltip = 73, 
		RULE_custom_trigger_tooltip = 74, RULE_desc = 75, RULE_client_state = 76, 
		RULE_is_blessing = 77, RULE_sprite = 78, RULE_church_aspect = 79, RULE_level = 80, 
		RULE_development = 81, RULE_cot_type = 82, RULE_cot_optionals = 83, RULE_province_modifier = 84, 
		RULE_global_modifier = 85, RULE_state_modifier = 86, RULE_center_of_trade = 87, 
		RULE_league = 88, RULE_call_empire_members = 89, RULE_ai_peace_desire = 90, 
		RULE_support_rebels = 91, RULE_coalition = 92, RULE_independence = 93, 
		RULE_exclusive = 94, RULE_holy_war = 95, RULE_attacker_disabled_po = 96, 
		RULE_is_valid_for_subject = 97, RULE_war_goal = 98, RULE_no_opinion_hit = 99, 
		RULE_cb_optionals = 100, RULE_cb_type = 101, RULE_buildings_trigger = 102, 
		RULE_buildings_effect = 103, RULE_manufactory_defines = 104, RULE_bonus_modifier = 105, 
		RULE_cost = 106, RULE_time = 107, RULE_onmap = 108, RULE_show_seperate = 109, 
		RULE_building_attribute = 110, RULE_allowed_in_gold_province = 111, RULE_make_obsolete = 112, 
		RULE_influencing_fort = 113, RULE_building = 114, RULE_bookmark = 115, 
		RULE_ancestor_personality = 116, RULE_war_priority = 117, RULE_ai_pick_ancestor = 118, 
		RULE_ai_personality = 119, RULE_start = 120, RULE_can_start_block = 121, 
		RULE_objective = 122, RULE_objectives_block = 123, RULE_ability = 124, 
		RULE_ability_block = 125, RULE_age = 126, RULE_advisor = 127, RULE_monarch_power_advisor = 128, 
		RULE_missionSeries = 129, RULE_slot_missionSeries = 130, RULE_generic_missionSeries = 131, 
		RULE_hasCountryShield_missionSeries = 132, RULE_potentialOnLoad_missionSeries = 133, 
		RULE_potential_missionSeries = 134, RULE_missionBlock = 135, RULE_icon_mission = 136, 
		RULE_position_mission = 137, RULE_completedBy_mission = 138, RULE_requiredMissions_mission = 139, 
		RULE_provincesToHighlight_mission = 140, RULE_aiWeight_mission = 141;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "block", "statement", "trigger_block", "potential_block", "effect_block", 
			"modifier_block", "chance_block", "ai_will_do_block", "allow", "name_block", 
			"color_block", "provinces_block", "factor", "chance_modifier", "value", 
			"amount", "name", "date", "bool", "months", "limit", "eLSE", "else_if", 
			"if_statement", "while", "scope", "scriptedEffect", "modifier", "skill_scaled_modifier", 
			"effect", "reverse_remove_opinion", "remove_opinion", "add_opinion", 
			"reverse_add_opinion", "hidden_effect", "add_modifier", "multiply_variable", 
			"subtrackt_variable", "change_variable", "set_variable", "divide_variable", 
			"export_to_variable", "mana_trigger", "trigger", "has_opinion_modifier", 
			"calc_true_if", "check_variable", "trade_share", "privateer_power", "scripted_trigger", 
			"prerequisites", "prerequisites_self", "ai_trigger", "is_triggered_only", 
			"region_trigger", "trigger_sub_block", "culture_modifier_block", "culture_names", 
			"culture_group", "culture", "country_tags", "country_color", "common_countires_block", 
			"monarch_names", "common_country", "trade_goods_block", "culture_block", 
			"religion_block", "col_simple_attr", "col_region_attr", "colonial_region", 
			"tooltip", "custom_tooltip", "custom_trigger_tooltip", "desc", "client_state", 
			"is_blessing", "sprite", "church_aspect", "level", "development", "cot_type", 
			"cot_optionals", "province_modifier", "global_modifier", "state_modifier", 
			"center_of_trade", "league", "call_empire_members", "ai_peace_desire", 
			"support_rebels", "coalition", "independence", "exclusive", "holy_war", 
			"attacker_disabled_po", "is_valid_for_subject", "war_goal", "no_opinion_hit", 
			"cb_optionals", "cb_type", "buildings_trigger", "buildings_effect", "manufactory_defines", 
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
			null, "'months'", "'{'", "'}'", null, "'='", "'+'", "'-'", null, null, 
			"'if'", "'else'", "'else_if'", "'limit'", "'while'", "'skill_scaled_modifier'", 
			"'potential'", "'trigger'", "'effect'", "'allow'", "'calc_true_if'", 
			"'amount'", "'date'", "'name'", "'names'", "'cost'", "'time'", "'is_triggered_only'", 
			"'prerequisites'", "'prerequisites_self'", "'no_opinion_hit'", "'color'", 
			"'check_variable'", "'subtract_variable'", "'change_variable'", "'set_variable'", 
			"'divide_variable'", "'multiply_variable'", "'export_to_variable'", "'which'", 
			"'value'", "'who'", "'ruler_allow'", "'heir_allow'", "'consort_allow'", 
			"'war_priority'", "'on_built'", "'on_destroyed'", "'on_construction_started'", 
			"'on_construction_canceled'", "'on_obsolete'", "'keep_trigger'", "'build_trigger'", 
			"'trade_share'", "'privateer_power'", "'share'", "'hidden_effect'", "'has_opinion_modifier'", 
			"'remove_opinion'", "'reverse_remove_opinion'", "'add_opinion'", "'reverse_add_opinion'", 
			"'tooltip'", "'custom_tooltip'", "'desc'", "'custom_trigger_tooltip'", 
			null, "'tolerance_heretic'", "'add_core'", null, "'add_province_modifier'", 
			"'add_country_modifier'", "'duration'", "'ai'", "'modifier'", "'chance'", 
			"'ai_will_do'", "'factor'", "'ai_weight'", "'ai_pick_ancestor'", "'ai_peace_desire'", 
			"'male_names'", "'female_names'", "'dynasty_names'", "'primary'", "'color1'", 
			"'color2'", "'color3'", "'graphical_culture'", "'revolutionary_colors'", 
			"'historical_idea_groups'", "'historical_units'", "'monarch_names'", 
			"'leader_names'", "'ship_names'", "'army_names'", "'fleet_names'", "'tax_income'", 
			"'native_size'", "'native_ferocity'", "'native_hostileness'", "'trade_goods'", 
			"'culture'", "'religion'", "'provinces'", "'region'", "'is_blessing'", 
			"'sprite'", "'monarch_power'", "'level'", "'development'", "'inland'", 
			"'coastal'", "'type'", "'province_modifiers'", "'state_modifiers'", "'global_modifiers'", 
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
			"FLOAT", "DATE", "MONTHS", "LPAR", "RPAR", "LE", "EQUALS", "PLUS", "MINUS", 
			"WHITESPACE", "SINGLE_LINE_COMMENT", "IF", "ELSE", "ELSE_IF", "LIMIT", 
			"WHILE", "SKILL_SACLED_MOD", "POTENTIAL", "TRIGGER", "EFFECT", "ALLOW", 
			"CALC_TRUE_IF", "AMOUNT", "DATE_KEY", "NAME", "NAMES", "COST", "TIME", 
			"IS_TIRGGERED_ONLY", "PREREQUISITES", "PREREQUISITES_SELF", "NO_OPINION_HIT", 
			"COLOR", "CHECK_VARIABLE", "SUBTRACKT_VARIABLE", "CHANGE_VARIABLE", "SET_VARIABLE", 
			"DIVIDE_VARIABLE", "MULTIPLY_VARIABLE", "EXPORT_TO_VARIABLE", "WHICH", 
			"VALUE", "WHO", "RULER_ALLOW", "HEIR_ALLOW", "CONSORT_ALLOW", "WAR_PRIORITY", 
			"ON_BUILT", "ON_DESTORYED", "ON_CONSTRUCTION_STARTED", "ON_CONSTRUCTION_CANCELED", 
			"ON_OBSOLETE", "KEEP_TRIGGER", "BUILD_TRIGGER", "TRADE_SHARE", "PRIVATEER_POWER", 
			"SHARE", "HIDDEN_EFFECT", "HAS_OPINION_MODIFIER", "REMOVE_OPINION", "REVERSE_REMOVE_OPINION", 
			"ADD_OPINION", "REVERSE_ADD_OPINION", "TOOLTIP", "CUSTOM_TOOLTIP", "DESC", 
			"CUSTOM_TRIGGER_TOOLTIP", "TRIGGER_NAME", "MODIFIER_NAME", "EFFECT_NAME", 
			"SCOPE", "ADD_PROVINCE_MOD", "ADD_COUNTRY_MOD", "DURATION", "AI", "MODIFIER", 
			"CHANCE", "AI_WILL_DO", "FACTOR", "AI_WEIGHT", "AI_PICK_ANCESTOR", "AI_PEACE_DESIRE", 
			"MALE_NAMES", "FEMALE_NAMES", "DYNASTY_NAMES", "PRIMARY", "COLOR1", "COLOR2", 
			"COLOR3", "GRAPHICAL_CULTURE", "REVOLUTIONARY_COLORS", "HISTORICAL_IDEA_GROUPS", 
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
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(284);
					advisor();
					}
					}
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(290);
					age();
					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(296);
					ai_personality();
					}
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(302);
					ancestor_personality();
					}
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BOOKMARK) {
					{
					{
					setState(308);
					bookmark();
					}
					}
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(314);
					building();
					}
					}
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(320);
					cb_type();
					}
					}
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(326);
					center_of_trade();
					}
					}
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(332);
					church_aspect();
					}
					}
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(338);
					colonial_region();
					}
					}
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLOR || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 511L) != 0)) {
					{
					{
					setState(344);
					common_country();
					}
					}
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG) {
					{
					{
					setState(350);
					country_color();
					}
					}
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG) {
					{
					{
					setState(356);
					country_tags();
					}
					}
					setState(361);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(362);
					culture_group();
					}
					}
					setState(367);
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
			setState(370);
			match(LPAR);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1108307756458112L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 61629L) != 0) || _la==IDENTIFIER) {
				{
				setState(373);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(371);
					statement();
					}
					break;
				case 2:
					{
					setState(372);
					if_statement();
					}
					break;
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(378);
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
			setState(382);
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
			case EFFECT_NAME:
			case SCOPE:
			case ADD_PROVINCE_MOD:
			case ADD_COUNTRY_MOD:
			case IDENTIFIER:
				{
				setState(380);
				effect();
				}
				break;
			case LPAR:
				{
				setState(381);
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
			setState(384);
			match(TRIGGER);
			setState(385);
			match(LE);
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8798242603238L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1126419L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(386);
				trigger();
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(392);
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
			setState(394);
			match(POTENTIAL);
			setState(395);
			match(LE);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8798242603238L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1126419L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(396);
				trigger();
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
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
			setState(404);
			match(EFFECT);
			setState(405);
			match(LE);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1108307756449920L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 61629L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(406);
				effect();
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(412);
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
		enterRule(_localctx, 12, RULE_modifier_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(MODIFIER);
			setState(415);
			match(LE);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER_NAME || _la==IDENTIFIER) {
				{
				{
				setState(416);
				modifier();
				}
				}
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(422);
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
		enterRule(_localctx, 14, RULE_chance_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(CHANCE);
			setState(425);
			match(LE);
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FACTOR) {
				{
				{
				setState(426);
				factor();
				}
				}
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(432);
				chance_modifier();
				}
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(438);
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
		enterRule(_localctx, 16, RULE_ai_will_do_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(AI_WILL_DO);
			setState(441);
			match(LE);
			setState(442);
			factor();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(443);
				chance_modifier();
				}
				}
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(449);
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
		enterRule(_localctx, 18, RULE_allow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(ALLOW);
			setState(452);
			match(LE);
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8798242603238L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1126419L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(453);
				trigger();
				}
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(459);
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
		enterRule(_localctx, 20, RULE_name_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==NAMES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(462);
			match(LE);
			setState(467); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(467);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NAME:
					{
					{
					setState(463);
					match(NAME);
					setState(464);
					match(EQUALS);
					setState(465);
					match(STRING);
					}
					}
					break;
				case TRIGGER:
					{
					setState(466);
					trigger_block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(469); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TRIGGER || _la==NAME );
			setState(471);
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
		enterRule(_localctx, 22, RULE_color_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(COLOR);
			setState(474);
			match(LE);
			setState(476); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(475);
					match(INT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(478); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(481); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(480);
					match(INT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(483); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(486); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(485);
				match(INT);
				}
				}
				setState(488); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT );
			setState(490);
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
		enterRule(_localctx, 24, RULE_provinces_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(PROVINCES);
			setState(493);
			match(LE);
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(495); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(494);
						match(INT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(497); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 26, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(FACTOR);
			setState(507);
			match(EQUALS);
			setState(508);
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
		enterRule(_localctx, 28, RULE_chance_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(MODIFIER);
			setState(511);
			match(LE);
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8798242603238L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 17903635L) != 0) || _la==IDENTIFIER) {
				{
				setState(514);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FACTOR:
					{
					setState(512);
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
				case TRIGGER_NAME:
				case SCOPE:
				case AI:
				case IDENTIFIER:
					{
					setState(513);
					trigger();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(519);
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
		enterRule(_localctx, 30, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
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
		enterRule(_localctx, 32, RULE_amount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(AMOUNT);
			setState(524);
			match(EQUALS);
			setState(525);
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
		enterRule(_localctx, 34, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(NAME);
			setState(528);
			match(EQUALS);
			setState(529);
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
		enterRule(_localctx, 36, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(DATE_KEY);
			setState(532);
			match(EQUALS);
			setState(533);
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
		enterRule(_localctx, 38, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
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
		enterRule(_localctx, 40, RULE_months);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(MONTHS);
			setState(538);
			match(EQUALS);
			setState(539);
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
		enterRule(_localctx, 42, RULE_limit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(LIMIT);
			setState(542);
			match(LE);
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8798242603238L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1126419L) != 0) || _la==IDENTIFIER) {
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
		enterRule(_localctx, 44, RULE_eLSE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(ELSE);
			setState(552);
			match(LE);
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1108307756449920L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 61629L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(553);
				effect();
				}
				}
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(559);
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
		enterRule(_localctx, 46, RULE_else_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(ELSE_IF);
			setState(562);
			match(LE);
			setState(563);
			limit();
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1108307756449920L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 61629L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(564);
				effect();
				}
				}
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(570);
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
		enterRule(_localctx, 48, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(IF);
			setState(573);
			match(LE);
			setState(574);
			limit();
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1108307756449920L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 61629L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(575);
				effect();
				}
				}
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(581);
			match(RPAR);
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE || _la==ELSE_IF) {
				{
				setState(584);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(582);
					eLSE();
					}
					break;
				case ELSE_IF:
					{
					setState(583);
					else_if();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(588);
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
		enterRule(_localctx, 50, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(WHILE);
			setState(590);
			match(LE);
			setState(591);
			limit();
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1108307756449920L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 61629L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(592);
				effect();
				}
				}
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(598);
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
		enterRule(_localctx, 52, RULE_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			_la = _input.LA(1);
			if ( !(_la==TAG || _la==SCOPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(601);
			match(LE);
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1117106013733094L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1553915L) != 0) || _la==IDENTIFIER) {
				{
				setState(606);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(602);
					effect();
					}
					break;
				case 2:
					{
					setState(603);
					trigger();
					}
					break;
				case 3:
					{
					setState(604);
					scope();
					}
					break;
				case 4:
					{
					setState(605);
					limit();
					}
					break;
				}
				}
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(611);
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
		enterRule(_localctx, 54, RULE_scriptedEffect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(IDENTIFIER);
			setState(614);
			match(EQUALS);
			setState(624);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				{
				setState(615);
				match(LPAR);
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1108307756458112L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 61629L) != 0) || _la==IDENTIFIER) {
					{
					{
					setState(616);
					statement();
					}
					}
					setState(621);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(622);
				match(RPAR);
				}
				}
				break;
			case YES:
				{
				setState(623);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode MODIFIER_NAME() { return getToken(EU4GrammarParser.MODIFIER_NAME, 0); }
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
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			_la = _input.LA(1);
			if ( !(_la==MODIFIER_NAME || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(627);
			match(EQUALS);
			setState(628);
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
		enterRule(_localctx, 58, RULE_skill_scaled_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			match(SKILL_SACLED_MOD);
			setState(631);
			match(LE);
			setState(632);
			trigger_block();
			setState(633);
			modifier_block();
			setState(634);
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
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode EFFECT_NAME() { return getToken(EU4GrammarParser.EFFECT_NAME, 0); }
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
		public EffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effect; }
	}

	public final EffectContext effect() throws RecognitionException {
		EffectContext _localctx = new EffectContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_effect);
		int _la;
		try {
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(636);
				_la = _input.LA(1);
				if ( !(_la==EFFECT_NAME || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(637);
				match(EQUALS);
				setState(638);
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
				setState(639);
				scriptedEffect();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(640);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(641);
				scope();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(642);
				custom_tooltip();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(643);
				add_modifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(644);
				while_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(645);
				multiply_variable();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(646);
				subtrackt_variable();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(647);
				change_variable();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(648);
				set_variable();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(649);
				divide_variable();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(650);
				export_to_variable();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(651);
				hidden_effect();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(652);
				reverse_remove_opinion();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(653);
				remove_opinion();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(654);
				add_opinion();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(655);
				reverse_add_opinion();
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
		enterRule(_localctx, 62, RULE_reverse_remove_opinion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(REVERSE_REMOVE_OPINION);
			setState(659);
			match(LE);
			setState(660);
			match(WHO);
			setState(661);
			match(EQUALS);
			setState(662);
			_la = _input.LA(1);
			if ( !(_la==TAG || _la==SCOPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(663);
			match(MODIFIER);
			setState(664);
			match(EQUALS);
			setState(665);
			match(IDENTIFIER);
			setState(666);
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
		enterRule(_localctx, 64, RULE_remove_opinion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(REMOVE_OPINION);
			setState(669);
			match(LE);
			setState(670);
			match(WHO);
			setState(671);
			match(EQUALS);
			setState(672);
			_la = _input.LA(1);
			if ( !(_la==TAG || _la==SCOPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(673);
			match(MODIFIER);
			setState(674);
			match(EQUALS);
			setState(675);
			match(IDENTIFIER);
			setState(676);
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
		enterRule(_localctx, 66, RULE_add_opinion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(ADD_OPINION);
			setState(679);
			match(LE);
			setState(680);
			match(WHO);
			setState(681);
			match(EQUALS);
			setState(682);
			_la = _input.LA(1);
			if ( !(_la==TAG || _la==SCOPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(683);
			match(MODIFIER);
			setState(684);
			match(EQUALS);
			setState(685);
			match(IDENTIFIER);
			setState(686);
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
		enterRule(_localctx, 68, RULE_reverse_add_opinion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(REVERSE_ADD_OPINION);
			setState(689);
			match(LE);
			setState(690);
			match(WHO);
			setState(691);
			match(EQUALS);
			setState(692);
			_la = _input.LA(1);
			if ( !(_la==TAG || _la==SCOPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(693);
			match(MODIFIER);
			setState(694);
			match(EQUALS);
			setState(695);
			match(IDENTIFIER);
			setState(696);
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
		enterRule(_localctx, 70, RULE_hidden_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(HIDDEN_EFFECT);
			setState(699);
			match(LE);
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1108307756449920L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 61629L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(700);
				effect();
				}
				}
				setState(705);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(706);
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
		enterRule(_localctx, 72, RULE_add_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			_la = _input.LA(1);
			if ( !(_la==ADD_PROVINCE_MOD || _la==ADD_COUNTRY_MOD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(709);
			match(LE);
			setState(710);
			match(NAME);
			setState(711);
			match(EQUALS);
			setState(712);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(713);
			match(DURATION);
			setState(714);
			match(EQUALS);
			setState(715);
			match(INT);
			setState(716);
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
		enterRule(_localctx, 74, RULE_multiply_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(MULTIPLY_VARIABLE);
			setState(719);
			match(LE);
			setState(720);
			match(WHICH);
			setState(721);
			match(EQUALS);
			setState(722);
			match(IDENTIFIER);
			setState(729);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHICH:
				{
				{
				setState(723);
				match(WHICH);
				setState(724);
				match(EQUALS);
				setState(725);
				match(IDENTIFIER);
				}
				}
				break;
			case VALUE:
				{
				{
				setState(726);
				match(VALUE);
				setState(727);
				match(EQUALS);
				setState(728);
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
			setState(731);
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
		enterRule(_localctx, 76, RULE_subtrackt_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			match(SUBTRACKT_VARIABLE);
			setState(734);
			match(LE);
			setState(735);
			match(WHICH);
			setState(736);
			match(EQUALS);
			setState(737);
			match(IDENTIFIER);
			setState(744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHICH:
				{
				{
				setState(738);
				match(WHICH);
				setState(739);
				match(EQUALS);
				setState(740);
				match(IDENTIFIER);
				}
				}
				break;
			case VALUE:
				{
				{
				setState(741);
				match(VALUE);
				setState(742);
				match(EQUALS);
				setState(743);
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
			setState(746);
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
		enterRule(_localctx, 78, RULE_change_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			match(CHANGE_VARIABLE);
			setState(749);
			match(LE);
			setState(750);
			match(WHICH);
			setState(751);
			match(EQUALS);
			setState(752);
			match(IDENTIFIER);
			setState(759);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHICH:
				{
				{
				setState(753);
				match(WHICH);
				setState(754);
				match(EQUALS);
				setState(755);
				match(IDENTIFIER);
				}
				}
				break;
			case VALUE:
				{
				{
				setState(756);
				match(VALUE);
				setState(757);
				match(EQUALS);
				setState(758);
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
			setState(761);
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
		enterRule(_localctx, 80, RULE_set_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			match(SET_VARIABLE);
			setState(764);
			match(LE);
			setState(765);
			match(WHICH);
			setState(766);
			match(EQUALS);
			setState(767);
			match(IDENTIFIER);
			setState(774);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHICH:
				{
				{
				setState(768);
				match(WHICH);
				setState(769);
				match(EQUALS);
				setState(770);
				match(IDENTIFIER);
				}
				}
				break;
			case VALUE:
				{
				{
				setState(771);
				match(VALUE);
				setState(772);
				match(EQUALS);
				setState(773);
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
			setState(776);
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
		enterRule(_localctx, 82, RULE_divide_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			match(DIVIDE_VARIABLE);
			setState(779);
			match(LE);
			setState(780);
			match(WHICH);
			setState(781);
			match(EQUALS);
			setState(782);
			match(IDENTIFIER);
			setState(789);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHICH:
				{
				{
				setState(783);
				match(WHICH);
				setState(784);
				match(EQUALS);
				setState(785);
				match(IDENTIFIER);
				}
				}
				break;
			case VALUE:
				{
				{
				setState(786);
				match(VALUE);
				setState(787);
				match(EQUALS);
				setState(788);
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
		enterRule(_localctx, 84, RULE_export_to_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(EXPORT_TO_VARIABLE);
			setState(794);
			match(LE);
			setState(795);
			match(WHICH);
			setState(796);
			match(EQUALS);
			setState(797);
			match(IDENTIFIER);
			setState(798);
			match(VALUE);
			setState(799);
			match(EQUALS);
			setState(800);
			match(IDENTIFIER);
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHO) {
				{
				setState(801);
				match(WHO);
				setState(802);
				match(EQUALS);
				setState(803);
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

			setState(806);
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
		enterRule(_localctx, 86, RULE_mana_trigger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			match(MPOWER);
			setState(809);
			match(EQUALS);
			setState(810);
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
	public static class TriggerContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode TRIGGER_NAME() { return getToken(EU4GrammarParser.TRIGGER_NAME, 0); }
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
		public TriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger; }
	}

	public final TriggerContext trigger() throws RecognitionException {
		TriggerContext _localctx = new TriggerContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_trigger);
		int _la;
		try {
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(812);
				_la = _input.LA(1);
				if ( !(_la==TRIGGER_NAME || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(813);
				match(EQUALS);
				setState(814);
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
				setState(815);
				scripted_trigger();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(816);
				custom_trigger_tooltip();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(817);
				calc_true_if();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(818);
				trigger_sub_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(819);
				ai_trigger();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(820);
				mana_trigger();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(821);
				trade_share();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(822);
				privateer_power();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(823);
				if_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(824);
				check_variable();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(825);
				has_opinion_modifier();
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
	public static class Has_opinion_modifierContext extends ParserRuleContext {
		public TerminalNode HAS_OPINION_MODIFIER() { return getToken(EU4GrammarParser.HAS_OPINION_MODIFIER, 0); }
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
		public Has_opinion_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_has_opinion_modifier; }
	}

	public final Has_opinion_modifierContext has_opinion_modifier() throws RecognitionException {
		Has_opinion_modifierContext _localctx = new Has_opinion_modifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_has_opinion_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(HAS_OPINION_MODIFIER);
			setState(829);
			match(LE);
			setState(830);
			match(WHO);
			setState(831);
			match(EQUALS);
			setState(832);
			_la = _input.LA(1);
			if ( !(_la==TAG || _la==SCOPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(833);
			match(MODIFIER);
			setState(834);
			match(EQUALS);
			setState(835);
			match(IDENTIFIER);
			setState(836);
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
		enterRule(_localctx, 92, RULE_calc_true_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(CALC_TRUE_IF);
			setState(839);
			match(LE);
			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8802537570534L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1126419L) != 0) || _la==IDENTIFIER) {
				{
				setState(842);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AMOUNT:
					{
					setState(840);
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
				case TRIGGER_NAME:
				case SCOPE:
				case AI:
				case IDENTIFIER:
					{
					setState(841);
					trigger();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(847);
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
		enterRule(_localctx, 94, RULE_check_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			match(CHECK_VARIABLE);
			setState(850);
			match(LE);
			setState(851);
			match(WHICH);
			setState(852);
			match(EQUALS);
			setState(853);
			match(IDENTIFIER);
			setState(860);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHICH:
				{
				{
				setState(854);
				match(WHICH);
				setState(855);
				match(EQUALS);
				setState(856);
				match(IDENTIFIER);
				}
				}
				break;
			case VALUE:
				{
				{
				setState(857);
				match(VALUE);
				setState(858);
				match(EQUALS);
				setState(859);
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
			setState(862);
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
		enterRule(_localctx, 96, RULE_trade_share);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			match(TRADE_SHARE);
			setState(865);
			match(LE);
			setState(866);
			match(COUNTRY);
			setState(867);
			match(EQUALS);
			setState(868);
			_la = _input.LA(1);
			if ( !(_la==TAG || _la==SCOPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(869);
			match(SHARE);
			setState(870);
			match(EQUALS);
			setState(871);
			match(INT);
			setState(872);
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
		enterRule(_localctx, 98, RULE_privateer_power);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			match(PRIVATEER_POWER);
			setState(875);
			match(LE);
			setState(876);
			match(COUNTRY);
			setState(877);
			match(EQUALS);
			setState(878);
			_la = _input.LA(1);
			if ( !(_la==TAG || _la==SCOPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(879);
			match(SHARE);
			setState(880);
			match(EQUALS);
			setState(881);
			match(INT);
			setState(882);
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
		enterRule(_localctx, 100, RULE_scripted_trigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			match(IDENTIFIER);
			setState(885);
			match(LE);
			setState(889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8798242603238L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1126419L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(886);
				trigger();
				}
				}
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(892);
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
		enterRule(_localctx, 102, RULE_prerequisites);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			match(PREREQUISITES);
			setState(895);
			match(LE);
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8798242603238L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1126419L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(896);
				trigger();
				}
				}
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(902);
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
		enterRule(_localctx, 104, RULE_prerequisites_self);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			match(PREREQUISITES_SELF);
			setState(905);
			match(LE);
			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8798242603238L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1126419L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(906);
				trigger();
				}
				}
				setState(911);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(912);
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
		enterRule(_localctx, 106, RULE_ai_trigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			match(AI);
			setState(915);
			match(EQUALS);
			setState(916);
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
		enterRule(_localctx, 108, RULE_is_triggered_only);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			match(IS_TIRGGERED_ONLY);
			setState(919);
			match(EQUALS);
			setState(920);
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
		enterRule(_localctx, 110, RULE_region_trigger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			match(REGION);
			setState(923);
			match(EQUALS);
			setState(924);
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
		enterRule(_localctx, 112, RULE_trigger_sub_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 166L) != 0) || _la==SCOPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(927);
			match(LE);
			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8798242603238L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1126419L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(928);
				trigger();
				}
				}
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(934);
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
		enterRule(_localctx, 114, RULE_culture_modifier_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			_la = _input.LA(1);
			if ( !(_la==COUNTRY || _la==PROVINCE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(937);
			match(LE);
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER_NAME || _la==IDENTIFIER) {
				{
				{
				setState(938);
				modifier();
				}
				}
				setState(943);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(944);
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
		enterRule(_localctx, 116, RULE_culture_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			_la = _input.LA(1);
			if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(947);
			match(LE);
			setState(951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING || _la==IDENTIFIER) {
				{
				{
				setState(948);
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
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(954);
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
		enterRule(_localctx, 118, RULE_culture_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			match(IDENTIFIER);
			setState(957);
			match(LE);
			setState(964); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(964);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GRAPHICAL_CULTURE:
					{
					{
					setState(958);
					match(GRAPHICAL_CULTURE);
					setState(959);
					match(EQUALS);
					setState(960);
					match(IDENTIFIER);
					}
					}
					break;
				case COUNTRY:
				case PROVINCE:
					{
					setState(961);
					culture_modifier_block();
					}
					break;
				case IDENTIFIER:
					{
					setState(962);
					culture();
					}
					break;
				case MALE_NAMES:
				case FEMALE_NAMES:
				case DYNASTY_NAMES:
					{
					setState(963);
					culture_names();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(966); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 864691128455135367L) != 0) || _la==IDENTIFIER );
			setState(968);
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
		enterRule(_localctx, 120, RULE_culture);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			match(IDENTIFIER);
			setState(971);
			match(LE);
			setState(979);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 864691128455135247L) != 0)) {
				{
				setState(977);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRIMARY:
					{
					{
					setState(972);
					match(PRIMARY);
					setState(973);
					match(EQUALS);
					setState(974);
					match(TAG);
					}
					}
					break;
				case COUNTRY:
				case PROVINCE:
					{
					setState(975);
					culture_modifier_block();
					}
					break;
				case MALE_NAMES:
				case FEMALE_NAMES:
				case DYNASTY_NAMES:
					{
					setState(976);
					culture_names();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(982);
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
		enterRule(_localctx, 122, RULE_country_tags);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			match(TAG);
			setState(985);
			match(EQUALS);
			setState(986);
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
		enterRule(_localctx, 124, RULE_country_color);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			match(TAG);
			setState(989);
			match(LE);
			setState(1008); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(990);
				_la = _input.LA(1);
				if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(991);
				match(LE);
				setState(993); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(992);
						match(INT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(995); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(998); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(997);
						match(INT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1000); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1003); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1002);
					match(INT);
					}
					}
					setState(1005); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(1007);
				match(RPAR);
				}
				}
				setState(1010); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 7L) != 0) );
			setState(1012);
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
		enterRule(_localctx, 126, RULE_common_countires_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			_la = _input.LA(1);
			if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & 123L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1015);
			match(LE);
			setState(1019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING || _la==IDENTIFIER) {
				{
				{
				setState(1016);
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
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1022);
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
		enterRule(_localctx, 128, RULE_monarch_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			match(MONARCH_NAMES);
			setState(1025);
			match(LE);
			setState(1031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(1026);
				match(STRING);
				setState(1027);
				match(EQUALS);
				setState(1028);
				match(INT);
				}
				}
				setState(1033);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1034);
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
		enterRule(_localctx, 130, RULE_common_country);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1060); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1060);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case GRAPHICAL_CULTURE:
						{
						{
						setState(1036);
						match(GRAPHICAL_CULTURE);
						setState(1037);
						match(EQUALS);
						setState(1038);
						match(IDENTIFIER);
						}
						}
						break;
					case COLOR:
						{
						setState(1039);
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
						setState(1040);
						common_countires_block();
						}
						break;
					case MONARCH_NAMES:
						{
						setState(1041);
						monarch_names();
						}
						break;
					case REVOLUTIONARY_COLORS:
						{
						{
						setState(1042);
						match(REVOLUTIONARY_COLORS);
						setState(1043);
						match(LE);
						setState(1045); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(1044);
								match(INT);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(1047); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(1050); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(1049);
								match(INT);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(1052); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(1055); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(1054);
							match(INT);
							}
							}
							setState(1057); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==INT );
						setState(1059);
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
				setState(1062); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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
		enterRule(_localctx, 132, RULE_trade_goods_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			match(TRADE_GOODS);
			setState(1065);
			match(LE);
			setState(1069); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1066);
				match(IDENTIFIER);
				setState(1067);
				match(EQUALS);
				setState(1068);
				match(INT);
				}
				}
				setState(1071); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(1073);
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
		enterRule(_localctx, 134, RULE_culture_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			match(CULTURE);
			setState(1076);
			match(LE);
			setState(1080); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1077);
				match(IDENTIFIER);
				setState(1078);
				match(EQUALS);
				setState(1079);
				match(INT);
				}
				}
				setState(1082); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(1084);
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
		enterRule(_localctx, 136, RULE_religion_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			match(RELIGION);
			setState(1087);
			match(LE);
			setState(1091); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1088);
				match(IDENTIFIER);
				setState(1089);
				match(EQUALS);
				setState(1090);
				match(INT);
				}
				}
				setState(1093); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(1095);
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
		enterRule(_localctx, 138, RULE_col_simple_attr);
		try {
			setState(1109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAX_INCOME:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1097);
				match(TAX_INCOME);
				setState(1098);
				match(EQUALS);
				setState(1099);
				match(INT);
				}
				}
				break;
			case NATIVE_SIZE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1100);
				match(NATIVE_SIZE);
				setState(1101);
				match(EQUALS);
				setState(1102);
				match(INT);
				}
				}
				break;
			case NATIVE_FEROCITY:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1103);
				match(NATIVE_FEROCITY);
				setState(1104);
				match(EQUALS);
				setState(1105);
				match(INT);
				}
				}
				break;
			case NATIVE_HOSTILENESS:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1106);
				match(NATIVE_HOSTILENESS);
				setState(1107);
				match(EQUALS);
				setState(1108);
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
		enterRule(_localctx, 140, RULE_col_region_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROVINCES:
				{
				setState(1111);
				provinces_block();
				}
				break;
			case TRADE_GOODS:
				{
				setState(1112);
				trade_goods_block();
				}
				break;
			case CULTURE:
				{
				setState(1113);
				culture_block();
				}
				break;
			case RELIGION:
				{
				setState(1114);
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
		enterRule(_localctx, 142, RULE_colonial_region);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			match(IDENTIFIER);
			setState(1118);
			match(LE);
			setState(1127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1127);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COLOR:
					{
					setState(1119);
					color_block();
					}
					break;
				case TAX_INCOME:
				case NATIVE_SIZE:
				case NATIVE_FEROCITY:
				case NATIVE_HOSTILENESS:
					{
					setState(1121); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(1120);
							col_simple_attr();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1123); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case TRADE_GOODS:
				case CULTURE:
				case RELIGION:
				case PROVINCES:
					{
					setState(1125);
					col_region_attr();
					}
					break;
				case NAME:
				case NAMES:
					{
					setState(1126);
					name_block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4449586118656L) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & 255L) != 0) );
			setState(1131);
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
		enterRule(_localctx, 144, RULE_tooltip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			match(TOOLTIP);
			setState(1134);
			match(EQUALS);
			setState(1135);
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
		enterRule(_localctx, 146, RULE_custom_tooltip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			match(CUSTOM_TOOLTIP);
			setState(1138);
			match(EQUALS);
			setState(1139);
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
		enterRule(_localctx, 148, RULE_custom_trigger_tooltip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			match(CUSTOM_TRIGGER_TOOLTIP);
			setState(1142);
			match(LE);
			setState(1146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOOLTIP) {
				{
				{
				setState(1143);
				tooltip();
				}
				}
				setState(1148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8798242603238L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1126419L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(1149);
				trigger();
				}
				}
				setState(1154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1155);
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
		enterRule(_localctx, 150, RULE_desc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1157);
			match(DESC);
			setState(1158);
			match(EQUALS);
			setState(1159);
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
		enterRule(_localctx, 152, RULE_client_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
			match(IDENTIFIER);
			setState(1162);
			match(LE);
			setState(1165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1165);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NAME:
				case NAMES:
					{
					setState(1163);
					name_block();
					}
					break;
				case REGION:
					{
					setState(1164);
					region_trigger();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME || _la==NAMES || _la==REGION );
			setState(1169);
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
		enterRule(_localctx, 154, RULE_is_blessing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171);
			match(IS_BLESSING);
			setState(1172);
			match(EQUALS);
			setState(1173);
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
		enterRule(_localctx, 156, RULE_sprite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175);
			match(SPRITE);
			setState(1176);
			match(EQUALS);
			setState(1177);
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
		enterRule(_localctx, 158, RULE_church_aspect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			match(IDENTIFIER);
			setState(1180);
			match(LE);
			setState(1191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 69659000832L) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 30064771073L) != 0)) {
				{
				setState(1189);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IS_BLESSING:
					{
					setState(1181);
					is_blessing();
					}
					break;
				case TRIGGER:
					{
					setState(1182);
					trigger_block();
					}
					break;
				case SPRITE:
					{
					setState(1183);
					sprite();
					}
					break;
				case MONARCH_POWER:
					{
					setState(1184);
					monarch_power_advisor();
					}
					break;
				case COST:
					{
					setState(1185);
					cost();
					}
					break;
				case EFFECT:
					{
					setState(1186);
					effect_block();
					}
					break;
				case MODIFIER:
					{
					setState(1187);
					modifier_block();
					}
					break;
				case POTENTIAL:
					{
					setState(1188);
					potential_block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AI_WILL_DO) {
				{
				setState(1194);
				ai_will_do_block();
				}
			}

			setState(1197);
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
		enterRule(_localctx, 160, RULE_level);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			match(LEVEL);
			setState(1200);
			match(EQUALS);
			setState(1201);
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
		enterRule(_localctx, 162, RULE_development);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			match(DEVELOPMENT);
			setState(1204);
			match(EQUALS);
			setState(1205);
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
		enterRule(_localctx, 164, RULE_cot_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			match(TYPE);
			setState(1208);
			match(EQUALS);
			setState(1209);
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
		enterRule(_localctx, 166, RULE_cot_optionals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEVELOPMENT:
				{
				setState(1211);
				development();
				}
				break;
			case COST:
				{
				setState(1212);
				cost();
				}
				break;
			case TYPE:
				{
				setState(1213);
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
		enterRule(_localctx, 168, RULE_province_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			match(PROVINCE_MODIFIER);
			setState(1217);
			match(LE);
			setState(1221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER_NAME || _la==IDENTIFIER) {
				{
				{
				setState(1218);
				modifier();
				}
				}
				setState(1223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		enterRule(_localctx, 170, RULE_global_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			match(GLOBAL_MODIFIER);
			setState(1227);
			match(LE);
			setState(1231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER_NAME || _la==IDENTIFIER) {
				{
				{
				setState(1228);
				modifier();
				}
				}
				setState(1233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		enterRule(_localctx, 172, RULE_state_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236);
			match(STATE_MODIFIER);
			setState(1237);
			match(LE);
			setState(1241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER_NAME || _la==IDENTIFIER) {
				{
				{
				setState(1238);
				modifier();
				}
				}
				setState(1243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1244);
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
		enterRule(_localctx, 174, RULE_center_of_trade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
			match(IDENTIFIER);
			setState(1247);
			match(LE);
			setState(1248);
			level();
			setState(1250); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1249);
				cot_optionals();
				}
				}
				setState(1252); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COST || _la==DEVELOPMENT || _la==TYPE );
			setState(1255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROVINCE_MODIFIER) {
				{
				setState(1254);
				province_modifier();
				}
			}

			setState(1258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATE_MODIFIER) {
				{
				setState(1257);
				state_modifier();
				}
			}

			setState(1261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBAL_MODIFIER) {
				{
				setState(1260);
				global_modifier();
				}
			}

			setState(1263);
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
		enterRule(_localctx, 176, RULE_league);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1265);
			match(LEAGUE);
			setState(1266);
			match(EQUALS);
			setState(1267);
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
		enterRule(_localctx, 178, RULE_call_empire_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1269);
			match(CALL_EMPIRE_MEMBERS);
			setState(1270);
			match(EQUALS);
			setState(1271);
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
		enterRule(_localctx, 180, RULE_ai_peace_desire);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			match(AI_PEACE_DESIRE);
			setState(1274);
			match(EQUALS);
			setState(1275);
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
		enterRule(_localctx, 182, RULE_support_rebels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			match(SUPPORT_REBELS);
			setState(1278);
			match(EQUALS);
			setState(1279);
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
		enterRule(_localctx, 184, RULE_coalition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			match(COALITION);
			setState(1282);
			match(EQUALS);
			setState(1283);
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
		enterRule(_localctx, 186, RULE_independence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1285);
			match(INDEPENDENCE);
			setState(1286);
			match(EQUALS);
			setState(1287);
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
		enterRule(_localctx, 188, RULE_exclusive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			match(EXCLUSIVE);
			setState(1290);
			match(EQUALS);
			setState(1291);
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
		enterRule(_localctx, 190, RULE_holy_war);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
			match(HOLY_WAR);
			setState(1294);
			match(EQUALS);
			setState(1295);
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
		enterRule(_localctx, 192, RULE_attacker_disabled_po);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1297);
			match(ATTACKER_DISABLED_PO);
			setState(1298);
			match(LE);
			setState(1302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1299);
				match(IDENTIFIER);
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
		enterRule(_localctx, 194, RULE_is_valid_for_subject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1307);
			match(IS_VALID_FOR_SUBJECT);
			setState(1308);
			match(EQUALS);
			setState(1309);
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
		enterRule(_localctx, 196, RULE_war_goal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
			match(WAR_GOAL);
			setState(1312);
			match(EQUALS);
			setState(1313);
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
		enterRule(_localctx, 198, RULE_no_opinion_hit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1315);
			match(NO_OPINION_HIT);
			setState(1316);
			match(EQUALS);
			setState(1317);
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
		enterRule(_localctx, 200, RULE_cb_optionals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL_EMPIRE_MEMBERS:
				{
				setState(1319);
				call_empire_members();
				}
				break;
			case ATTACKER_DISABLED_PO:
				{
				setState(1320);
				attacker_disabled_po();
				}
				break;
			case HOLY_WAR:
				{
				setState(1321);
				holy_war();
				}
				break;
			case IS_TIRGGERED_ONLY:
				{
				setState(1322);
				is_triggered_only();
				}
				break;
			case MONTHS:
				{
				setState(1323);
				months();
				}
				break;
			case NO_OPINION_HIT:
				{
				setState(1324);
				no_opinion_hit();
				}
				break;
			case WAR_GOAL:
				{
				setState(1325);
				war_goal();
				}
				break;
			case PREREQUISITES:
				{
				setState(1326);
				prerequisites();
				}
				break;
			case PREREQUISITES_SELF:
				{
				setState(1327);
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
		enterRule(_localctx, 202, RULE_cb_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330);
			match(IDENTIFIER);
			setState(1331);
			match(LE);
			setState(1333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEAGUE) {
				{
				setState(1332);
				league();
				}
			}

			setState(1336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUPPORT_REBELS) {
				{
				setState(1335);
				support_rebels();
				}
			}

			setState(1339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AI_PEACE_DESIRE) {
				{
				setState(1338);
				ai_peace_desire();
				}
			}

			setState(1342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS_VALID_FOR_SUBJECT) {
				{
				setState(1341);
				is_valid_for_subject();
				}
			}

			setState(1345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLUSIVE) {
				{
				setState(1344);
				exclusive();
				}
			}

			setState(1348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDEPENDENCE) {
				{
				setState(1347);
				independence();
				}
			}

			setState(1351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COALITION) {
				{
				setState(1350);
				coalition();
				}
			}

			setState(1356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4123168608256L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 269L) != 0)) {
				{
				{
				setState(1353);
				cb_optionals();
				}
				}
				setState(1358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1359);
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
		enterRule(_localctx, 204, RULE_buildings_trigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1361);
			_la = _input.LA(1);
			if ( !(_la==KEEP_TRIGGER || _la==BUILD_TRIGGER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1362);
			match(LE);
			setState(1366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8798242603238L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1126419L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(1363);
				trigger();
				}
				}
				setState(1368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1369);
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
		enterRule(_localctx, 206, RULE_buildings_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4467570830351532032L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1372);
			match(LE);
			setState(1376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1108307756449920L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 61629L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(1373);
				effect();
				}
				}
				setState(1378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1379);
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
		enterRule(_localctx, 208, RULE_manufactory_defines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
			_la = _input.LA(1);
			if ( !(_la==MANUFACTORY || _la==BONUS_MANUFACTORY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1382);
			match(LE);
			setState(1384); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1383);
				match(IDENTIFIER);
				}
				}
				setState(1386); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(1388);
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
		enterRule(_localctx, 210, RULE_bonus_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1390);
			match(BONUS_MODIFIER);
			setState(1391);
			match(EQUALS);
			setState(1392);
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
		enterRule(_localctx, 212, RULE_cost);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1394);
			match(COST);
			setState(1395);
			match(EQUALS);
			setState(1396);
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
		enterRule(_localctx, 214, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1398);
			match(TIME);
			setState(1399);
			match(EQUALS);
			setState(1400);
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
		enterRule(_localctx, 216, RULE_onmap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1402);
			match(ONMAP);
			setState(1403);
			match(EQUALS);
			setState(1404);
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
		enterRule(_localctx, 218, RULE_show_seperate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
			match(SHOW_SEPERATE);
			setState(1407);
			match(EQUALS);
			setState(1408);
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
		enterRule(_localctx, 220, RULE_building_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COST:
				{
				setState(1410);
				cost();
				}
				break;
			case TIME:
				{
				setState(1411);
				time();
				}
				break;
			case ONMAP:
				{
				setState(1412);
				onmap();
				}
				break;
			case SHOW_SEPERATE:
				{
				setState(1413);
				show_seperate();
				}
				break;
			case INFLUENCING_FORT:
				{
				setState(1414);
				influencing_fort();
				}
				break;
			case ALLOWED_IN_GOLD_PROVINCES:
				{
				setState(1415);
				allowed_in_gold_province();
				}
				break;
			case MAKE_OBSOLETE:
				{
				setState(1416);
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
		enterRule(_localctx, 222, RULE_allowed_in_gold_province);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1419);
			match(ALLOWED_IN_GOLD_PROVINCES);
			setState(1420);
			match(EQUALS);
			setState(1421);
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
		enterRule(_localctx, 224, RULE_make_obsolete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423);
			match(MAKE_OBSOLETE);
			setState(1424);
			match(EQUALS);
			setState(1425);
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
		enterRule(_localctx, 226, RULE_influencing_fort);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
			match(INFLUENCING_FORT);
			setState(1428);
			match(EQUALS);
			setState(1429);
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
		enterRule(_localctx, 228, RULE_building);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
			match(IDENTIFIER);
			setState(1432);
			match(LE);
			setState(1442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -144114981917425664L) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 2296835809958952965L) != 0)) {
				{
				setState(1440);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MANUFACTORY:
				case BONUS_MANUFACTORY:
					{
					setState(1433);
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
					setState(1434);
					building_attribute();
					}
					break;
				case ON_BUILT:
				case ON_DESTORYED:
				case ON_CONSTRUCTION_STARTED:
				case ON_CONSTRUCTION_CANCELED:
				case ON_OBSOLETE:
					{
					setState(1435);
					buildings_effect();
					}
					break;
				case KEEP_TRIGGER:
				case BUILD_TRIGGER:
					{
					setState(1436);
					buildings_trigger();
					}
					break;
				case BONUS_MODIFIER:
					{
					setState(1437);
					bonus_modifier();
					}
					break;
				case MODIFIER:
					{
					setState(1438);
					modifier_block();
					}
					break;
				case AI_WILL_DO:
					{
					setState(1439);
					ai_will_do_block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1445);
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
		enterRule(_localctx, 230, RULE_bookmark);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1447);
			match(BOOKMARK);
			setState(1448);
			match(LE);
			setState(1449);
			name();
			setState(1450);
			desc();
			setState(1451);
			date();
			setState(1457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CENTER) {
				{
				{
				setState(1452);
				match(CENTER);
				setState(1453);
				match(EQUALS);
				setState(1454);
				match(INT);
				}
				}
				setState(1459);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(1460);
			match(DEFAULT);
			setState(1461);
			match(EQUALS);
			setState(1465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==YES || _la==NO) {
				{
				{
				setState(1462);
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
				setState(1467);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(1473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COUNTRY) {
				{
				{
				setState(1468);
				match(COUNTRY);
				setState(1469);
				match(EQUALS);
				setState(1470);
				match(TAG);
				}
				}
				setState(1475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EASY_COUNTRY) {
				{
				{
				setState(1476);
				match(EASY_COUNTRY);
				setState(1477);
				match(EQUALS);
				setState(1478);
				match(TAG);
				}
				}
				setState(1483);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1484);
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
		enterRule(_localctx, 232, RULE_ancestor_personality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
			match(IDENTIFIER);
			setState(1487);
			match(LE);
			setState(1528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 1225260573747314689L) != 0) || _la==IDENTIFIER) {
				{
				setState(1526);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RULER_ALLOW:
					{
					{
					setState(1488);
					match(RULER_ALLOW);
					setState(1489);
					match(LE);
					setState(1493);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ALLOW) {
						{
						{
						setState(1490);
						allow();
						}
						}
						setState(1495);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1496);
					chance_block();
					setState(1497);
					match(RPAR);
					}
					}
					break;
				case HEIR_ALLOW:
					{
					{
					setState(1499);
					match(HEIR_ALLOW);
					setState(1500);
					match(LE);
					setState(1504);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ALLOW) {
						{
						{
						setState(1501);
						allow();
						}
						}
						setState(1506);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1507);
					chance_block();
					setState(1508);
					match(RPAR);
					}
					}
					break;
				case CONSORT_ALLOW:
					{
					{
					setState(1510);
					match(CONSORT_ALLOW);
					setState(1511);
					match(LE);
					setState(1515);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ALLOW) {
						{
						{
						setState(1512);
						allow();
						}
						}
						setState(1517);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1518);
					chance_block();
					setState(1519);
					match(RPAR);
					}
					}
					break;
				case ALLOW:
					{
					setState(1521);
					allow();
					}
					break;
				case CHANCE:
					{
					setState(1522);
					chance_block();
					}
					break;
				case WAR_PRIORITY:
					{
					setState(1523);
					war_priority();
					}
					break;
				case AI_PICK_ANCESTOR:
					{
					setState(1524);
					ai_pick_ancestor();
					}
					break;
				case MODIFIER_NAME:
				case IDENTIFIER:
					{
					setState(1525);
					modifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1530);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1531);
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
		enterRule(_localctx, 234, RULE_war_priority);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1533);
			match(WAR_PRIORITY);
			setState(1534);
			match(LE);
			setState(1535);
			chance_modifier();
			setState(1536);
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
		enterRule(_localctx, 236, RULE_ai_pick_ancestor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1538);
			match(AI_PICK_ANCESTOR);
			setState(1539);
			match(LE);
			setState(1540);
			factor();
			setState(1541);
			chance_modifier();
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
		enterRule(_localctx, 238, RULE_ai_personality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1544);
			match(IDENTIFIER);
			setState(1545);
			match(LE);
			setState(1546);
			chance_block();
			setState(1547);
			match(ICON);
			setState(1548);
			match(EQUALS);
			setState(1549);
			match(INT);
			setState(1550);
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
		enterRule(_localctx, 240, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1552);
			match(START);
			setState(1553);
			match(EQUALS);
			setState(1554);
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
		enterRule(_localctx, 242, RULE_can_start_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1556);
			match(CAN_START);
			setState(1557);
			match(LE);
			setState(1561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8798242603238L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1126419L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(1558);
				trigger();
				}
				}
				setState(1563);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1564);
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
		enterRule(_localctx, 244, RULE_objective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1566);
			match(IDENTIFIER);
			setState(1567);
			match(LE);
			setState(1572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8799316345062L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1126419L) != 0) || _la==IDENTIFIER) {
				{
				setState(1570);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALLOW:
					{
					setState(1568);
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
				case TRIGGER_NAME:
				case SCOPE:
				case AI:
				case IDENTIFIER:
					{
					setState(1569);
					trigger();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1574);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1575);
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
		enterRule(_localctx, 246, RULE_objectives_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1577);
			match(OBJECTIVES);
			setState(1578);
			match(LE);
			setState(1582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1579);
				objective();
				}
				}
				setState(1584);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1585);
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
		enterRule(_localctx, 248, RULE_ability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1587);
			match(IDENTIFIER);
			setState(1588);
			match(LE);
			setState(1594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & 72057594037927939L) != 0)) {
				{
				setState(1592);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALLOW:
					{
					setState(1589);
					allow();
					}
					break;
				case EFFECT:
					{
					setState(1590);
					effect_block();
					}
					break;
				case MODIFIER:
					{
					setState(1591);
					modifier_block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1596);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1597);
			ai_will_do_block();
			setState(1598);
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
		enterRule(_localctx, 250, RULE_ability_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1600);
			match(ABILITIES);
			setState(1601);
			match(LE);
			setState(1605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1602);
				ability();
				}
				}
				setState(1607);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1608);
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
		enterRule(_localctx, 252, RULE_age);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1610);
			match(IDENTIFIER);
			setState(1611);
			match(LE);
			setState(1612);
			start();
			setState(1613);
			can_start_block();
			setState(1622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RELIGIOUS_CONFLICTS || _la==PAPACY) {
				{
				setState(1620);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RELIGIOUS_CONFLICTS:
					{
					{
					setState(1614);
					match(RELIGIOUS_CONFLICTS);
					setState(1615);
					match(EQUALS);
					setState(1616);
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
					setState(1617);
					match(PAPACY);
					setState(1618);
					match(EQUALS);
					setState(1619);
					match(FLOAT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1624);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1625);
			objectives_block();
			setState(1626);
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
		enterRule(_localctx, 254, RULE_advisor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
			match(IDENTIFIER);
			setState(1629);
			match(LE);
			setState(1630);
			monarch_power_advisor();
			setState(1635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SKILL_SACLED_MOD || _la==MODIFIER_NAME || _la==IDENTIFIER) {
				{
				setState(1633);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODIFIER_NAME:
				case IDENTIFIER:
					{
					setState(1631);
					modifier();
					}
					break;
				case SKILL_SACLED_MOD:
					{
					setState(1632);
					skill_scaled_modifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1637);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1638);
			chance_block();
			setState(1639);
			ai_will_do_block();
			setState(1640);
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
		enterRule(_localctx, 256, RULE_monarch_power_advisor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1642);
			match(MONARCH_POWER);
			setState(1643);
			match(EQUALS);
			setState(1644);
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
		enterRule(_localctx, 258, RULE_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1646);
			match(IDENTIFIER);
			setState(1647);
			match(LE);
			setState(1657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POTENTIAL || _la==AI || ((((_la - 158)) & ~0x3f) == 0 && ((1L << (_la - 158)) & 527L) != 0)) {
				{
				setState(1655);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SLOT:
					{
					setState(1648);
					slot_missionSeries();
					}
					break;
				case GENERIC:
					{
					setState(1649);
					generic_missionSeries();
					}
					break;
				case AI:
					{
					setState(1650);
					ai_trigger();
					}
					break;
				case HAS_COUNTRY_SHIELD:
					{
					setState(1651);
					hasCountryShield_missionSeries();
					}
					break;
				case POTENTIAL_ON_LOAD:
					{
					setState(1652);
					potentialOnLoad_missionSeries();
					}
					break;
				case POTENTIAL:
					{
					setState(1653);
					potential_missionSeries();
					}
					break;
				case IDENTIFIER:
					{
					setState(1654);
					missionBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1659);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1660);
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
		enterRule(_localctx, 260, RULE_slot_missionSeries);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1662);
			match(SLOT);
			setState(1663);
			match(EQUALS);
			setState(1664);
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
		enterRule(_localctx, 262, RULE_generic_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1666);
			match(GENERIC);
			setState(1667);
			match(EQUALS);
			setState(1668);
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
		enterRule(_localctx, 264, RULE_hasCountryShield_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1670);
			match(HAS_COUNTRY_SHIELD);
			setState(1671);
			match(EQUALS);
			setState(1672);
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
		enterRule(_localctx, 266, RULE_potentialOnLoad_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1674);
			match(POTENTIAL_ON_LOAD);
			setState(1675);
			match(LE);
			setState(1679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8798242603238L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1126419L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(1676);
				trigger();
				}
				}
				setState(1681);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1682);
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
		enterRule(_localctx, 268, RULE_potential_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1684);
			match(POTENTIAL);
			setState(1685);
			match(LE);
			setState(1689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8798242603238L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1126419L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(1686);
				trigger();
				}
				}
				setState(1691);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1692);
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
		enterRule(_localctx, 270, RULE_missionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
			match(IDENTIFIER);
			setState(1695);
			match(LE);
			setState(1706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & 2305843009213693955L) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & 31L) != 0)) {
				{
				setState(1704);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ICON:
					{
					setState(1696);
					icon_mission();
					}
					break;
				case POSITION:
					{
					setState(1697);
					position_mission();
					}
					break;
				case COMPLETED_BY:
					{
					setState(1698);
					completedBy_mission();
					}
					break;
				case REQUIRED_MISSIONS:
					{
					setState(1699);
					requiredMissions_mission();
					}
					break;
				case PROVINCES_TO_HIGHLIGHT:
					{
					setState(1700);
					provincesToHighlight_mission();
					}
					break;
				case TRIGGER:
					{
					setState(1701);
					trigger_block();
					}
					break;
				case EFFECT:
					{
					setState(1702);
					effect_block();
					}
					break;
				case AI_WEIGHT:
					{
					setState(1703);
					aiWeight_mission();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1708);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1709);
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
		enterRule(_localctx, 272, RULE_icon_mission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1711);
			match(ICON);
			setState(1712);
			match(EQUALS);
			setState(1713);
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
		enterRule(_localctx, 274, RULE_position_mission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1715);
			match(POSITION);
			setState(1716);
			match(EQUALS);
			setState(1717);
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
		enterRule(_localctx, 276, RULE_completedBy_mission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1719);
			match(COMPLETED_BY);
			setState(1720);
			match(EQUALS);
			setState(1721);
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
		enterRule(_localctx, 278, RULE_requiredMissions_mission);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1723);
			match(REQUIRED_MISSIONS);
			setState(1724);
			match(LE);
			setState(1728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1725);
				match(IDENTIFIER);
				}
				}
				setState(1730);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1731);
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
		enterRule(_localctx, 280, RULE_provincesToHighlight_mission);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1733);
			match(PROVINCES_TO_HIGHLIGHT);
			setState(1734);
			match(LE);
			setState(1738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8798242603238L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1126419L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(1735);
				trigger();
				}
				}
				setState(1740);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1741);
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
		enterRule(_localctx, 282, RULE_aiWeight_mission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1743);
			match(AI_WEIGHT);
			setState(1744);
			match(LE);
			setState(1745);
			factor();
			setState(1746);
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
		"\u0004\u0001\u00a8\u06d5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\u008c\u0002\u008d\u0007\u008d\u0001\u0000\u0005\u0000\u011e\b\u0000\n"+
		"\u0000\f\u0000\u0121\t\u0000\u0001\u0000\u0005\u0000\u0124\b\u0000\n\u0000"+
		"\f\u0000\u0127\t\u0000\u0001\u0000\u0005\u0000\u012a\b\u0000\n\u0000\f"+
		"\u0000\u012d\t\u0000\u0001\u0000\u0005\u0000\u0130\b\u0000\n\u0000\f\u0000"+
		"\u0133\t\u0000\u0001\u0000\u0005\u0000\u0136\b\u0000\n\u0000\f\u0000\u0139"+
		"\t\u0000\u0001\u0000\u0005\u0000\u013c\b\u0000\n\u0000\f\u0000\u013f\t"+
		"\u0000\u0001\u0000\u0005\u0000\u0142\b\u0000\n\u0000\f\u0000\u0145\t\u0000"+
		"\u0001\u0000\u0005\u0000\u0148\b\u0000\n\u0000\f\u0000\u014b\t\u0000\u0001"+
		"\u0000\u0005\u0000\u014e\b\u0000\n\u0000\f\u0000\u0151\t\u0000\u0001\u0000"+
		"\u0005\u0000\u0154\b\u0000\n\u0000\f\u0000\u0157\t\u0000\u0001\u0000\u0005"+
		"\u0000\u015a\b\u0000\n\u0000\f\u0000\u015d\t\u0000\u0001\u0000\u0005\u0000"+
		"\u0160\b\u0000\n\u0000\f\u0000\u0163\t\u0000\u0001\u0000\u0005\u0000\u0166"+
		"\b\u0000\n\u0000\f\u0000\u0169\t\u0000\u0001\u0000\u0005\u0000\u016c\b"+
		"\u0000\n\u0000\f\u0000\u016f\t\u0000\u0003\u0000\u0171\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u0176\b\u0001\n\u0001\f\u0001\u0179"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002\u017f"+
		"\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0184\b\u0003"+
		"\n\u0003\f\u0003\u0187\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004\u018e\b\u0004\n\u0004\f\u0004\u0191\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u0198\b\u0005\n\u0005\f\u0005\u019b\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u01a2\b\u0006\n\u0006\f\u0006"+
		"\u01a5\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u01ac\b\u0007\n\u0007\f\u0007\u01af\t\u0007\u0001\u0007\u0005"+
		"\u0007\u01b2\b\u0007\n\u0007\f\u0007\u01b5\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u01bd\b\b\n\b\f\b\u01c0\t\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u01c7\b\t\n\t\f\t\u01ca\t\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0004"+
		"\n\u01d4\b\n\u000b\n\f\n\u01d5\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0004\u000b\u01dd\b\u000b\u000b\u000b\f\u000b\u01de\u0001"+
		"\u000b\u0004\u000b\u01e2\b\u000b\u000b\u000b\f\u000b\u01e3\u0001\u000b"+
		"\u0004\u000b\u01e7\b\u000b\u000b\u000b\f\u000b\u01e8\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0004\f\u01f0\b\f\u000b\f\f\f\u01f1\u0005"+
		"\f\u01f4\b\f\n\f\f\f\u01f7\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0203"+
		"\b\u000e\n\u000e\f\u000e\u0206\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0221\b\u0015"+
		"\n\u0015\f\u0015\u0224\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u022b\b\u0016\n\u0016\f\u0016\u022e\t\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u0236\b\u0017\n\u0017\f\u0017\u0239\t\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0241"+
		"\b\u0018\n\u0018\f\u0018\u0244\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u0249\b\u0018\n\u0018\f\u0018\u024c\t\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0252\b\u0019\n\u0019\f\u0019"+
		"\u0255\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u025f\b\u001a\n\u001a"+
		"\f\u001a\u0262\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0005\u001b\u026a\b\u001b\n\u001b\f\u001b\u026d"+
		"\t\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0271\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0291\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0005#\u02be\b#\n#\f#\u02c1\t#\u0001#\u0001#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003"+
		"%\u02da\b%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0003&\u02e9\b&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0003\'\u02f8\b\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0307\b(\u0001(\u0001"+
		"(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u0316\b)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0325\b*\u0001*\u0001"+
		"*\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u033b"+
		"\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001.\u0001.\u0001.\u0001.\u0005.\u034b\b.\n.\f.\u034e\t.\u0001.\u0001"+
		".\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0003/\u035d\b/\u0001/\u0001/\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00012\u00012\u00012\u00052\u0378"+
		"\b2\n2\f2\u037b\t2\u00012\u00012\u00013\u00013\u00013\u00053\u0382\b3"+
		"\n3\f3\u0385\t3\u00013\u00013\u00014\u00014\u00014\u00054\u038c\b4\n4"+
		"\f4\u038f\t4\u00014\u00014\u00015\u00015\u00015\u00015\u00016\u00016\u0001"+
		"6\u00016\u00017\u00017\u00017\u00017\u00018\u00018\u00018\u00058\u03a2"+
		"\b8\n8\f8\u03a5\t8\u00018\u00018\u00019\u00019\u00019\u00059\u03ac\b9"+
		"\n9\f9\u03af\t9\u00019\u00019\u0001:\u0001:\u0001:\u0005:\u03b6\b:\n:"+
		"\f:\u03b9\t:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0004;\u03c5\b;\u000b;\f;\u03c6\u0001;\u0001;\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0005<\u03d2\b<\n<\f<\u03d5\t<\u0001<\u0001"+
		"<\u0001=\u0001=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001>\u0004"+
		">\u03e2\b>\u000b>\f>\u03e3\u0001>\u0004>\u03e7\b>\u000b>\f>\u03e8\u0001"+
		">\u0004>\u03ec\b>\u000b>\f>\u03ed\u0001>\u0004>\u03f1\b>\u000b>\f>\u03f2"+
		"\u0001>\u0001>\u0001?\u0001?\u0001?\u0005?\u03fa\b?\n?\f?\u03fd\t?\u0001"+
		"?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001@\u0005@\u0406\b@\n@\f@\u0409"+
		"\t@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0004A\u0416\bA\u000bA\fA\u0417\u0001A\u0004A\u041b\bA\u000b"+
		"A\fA\u041c\u0001A\u0004A\u0420\bA\u000bA\fA\u0421\u0001A\u0004A\u0425"+
		"\bA\u000bA\fA\u0426\u0001B\u0001B\u0001B\u0001B\u0001B\u0004B\u042e\b"+
		"B\u000bB\fB\u042f\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001C\u0004"+
		"C\u0439\bC\u000bC\fC\u043a\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0004D\u0444\bD\u000bD\fD\u0445\u0001D\u0001D\u0001E\u0001E\u0001E\u0001"+
		"E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0003E\u0456"+
		"\bE\u0001F\u0001F\u0001F\u0001F\u0003F\u045c\bF\u0001G\u0001G\u0001G\u0001"+
		"G\u0004G\u0462\bG\u000bG\fG\u0463\u0001G\u0001G\u0004G\u0468\bG\u000b"+
		"G\fG\u0469\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001I\u0001I\u0001"+
		"I\u0001I\u0001J\u0001J\u0001J\u0005J\u0479\bJ\nJ\fJ\u047c\tJ\u0001J\u0005"+
		"J\u047f\bJ\nJ\fJ\u0482\tJ\u0001J\u0001J\u0001K\u0001K\u0001K\u0001K\u0001"+
		"L\u0001L\u0001L\u0001L\u0004L\u048e\bL\u000bL\fL\u048f\u0001L\u0001L\u0001"+
		"M\u0001M\u0001M\u0001M\u0001N\u0001N\u0001N\u0001N\u0001O\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0005O\u04a6\bO\nO"+
		"\fO\u04a9\tO\u0001O\u0003O\u04ac\bO\u0001O\u0001O\u0001P\u0001P\u0001"+
		"P\u0001P\u0001Q\u0001Q\u0001Q\u0001Q\u0001R\u0001R\u0001R\u0001R\u0001"+
		"S\u0001S\u0001S\u0003S\u04bf\bS\u0001T\u0001T\u0001T\u0005T\u04c4\bT\n"+
		"T\fT\u04c7\tT\u0001T\u0001T\u0001U\u0001U\u0001U\u0005U\u04ce\bU\nU\f"+
		"U\u04d1\tU\u0001U\u0001U\u0001V\u0001V\u0001V\u0005V\u04d8\bV\nV\fV\u04db"+
		"\tV\u0001V\u0001V\u0001W\u0001W\u0001W\u0001W\u0004W\u04e3\bW\u000bW\f"+
		"W\u04e4\u0001W\u0003W\u04e8\bW\u0001W\u0003W\u04eb\bW\u0001W\u0003W\u04ee"+
		"\bW\u0001W\u0001W\u0001X\u0001X\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0001"+
		"Y\u0001Z\u0001Z\u0001Z\u0001Z\u0001[\u0001[\u0001[\u0001[\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001]\u0001]\u0001]\u0001]\u0001^\u0001^\u0001^\u0001"+
		"^\u0001_\u0001_\u0001_\u0001_\u0001`\u0001`\u0001`\u0005`\u0515\b`\n`"+
		"\f`\u0518\t`\u0001`\u0001`\u0001a\u0001a\u0001a\u0001a\u0001b\u0001b\u0001"+
		"b\u0001b\u0001c\u0001c\u0001c\u0001c\u0001d\u0001d\u0001d\u0001d\u0001"+
		"d\u0001d\u0001d\u0001d\u0001d\u0003d\u0531\bd\u0001e\u0001e\u0001e\u0003"+
		"e\u0536\be\u0001e\u0003e\u0539\be\u0001e\u0003e\u053c\be\u0001e\u0003"+
		"e\u053f\be\u0001e\u0003e\u0542\be\u0001e\u0003e\u0545\be\u0001e\u0003"+
		"e\u0548\be\u0001e\u0005e\u054b\be\ne\fe\u054e\te\u0001e\u0001e\u0001f"+
		"\u0001f\u0001f\u0005f\u0555\bf\nf\ff\u0558\tf\u0001f\u0001f\u0001g\u0001"+
		"g\u0001g\u0005g\u055f\bg\ng\fg\u0562\tg\u0001g\u0001g\u0001h\u0001h\u0001"+
		"h\u0004h\u0569\bh\u000bh\fh\u056a\u0001h\u0001h\u0001i\u0001i\u0001i\u0001"+
		"i\u0001j\u0001j\u0001j\u0001j\u0001k\u0001k\u0001k\u0001k\u0001l\u0001"+
		"l\u0001l\u0001l\u0001m\u0001m\u0001m\u0001m\u0001n\u0001n\u0001n\u0001"+
		"n\u0001n\u0001n\u0001n\u0003n\u058a\bn\u0001o\u0001o\u0001o\u0001o\u0001"+
		"p\u0001p\u0001p\u0001p\u0001q\u0001q\u0001q\u0001q\u0001r\u0001r\u0001"+
		"r\u0001r\u0001r\u0001r\u0001r\u0001r\u0001r\u0005r\u05a1\br\nr\fr\u05a4"+
		"\tr\u0001r\u0001r\u0001s\u0001s\u0001s\u0001s\u0001s\u0001s\u0001s\u0001"+
		"s\u0005s\u05b0\bs\ns\fs\u05b3\ts\u0001s\u0001s\u0001s\u0005s\u05b8\bs"+
		"\ns\fs\u05bb\ts\u0001s\u0001s\u0001s\u0005s\u05c0\bs\ns\fs\u05c3\ts\u0001"+
		"s\u0001s\u0001s\u0005s\u05c8\bs\ns\fs\u05cb\ts\u0001s\u0001s\u0001t\u0001"+
		"t\u0001t\u0001t\u0001t\u0005t\u05d4\bt\nt\ft\u05d7\tt\u0001t\u0001t\u0001"+
		"t\u0001t\u0001t\u0001t\u0005t\u05df\bt\nt\ft\u05e2\tt\u0001t\u0001t\u0001"+
		"t\u0001t\u0001t\u0001t\u0005t\u05ea\bt\nt\ft\u05ed\tt\u0001t\u0001t\u0001"+
		"t\u0001t\u0001t\u0001t\u0001t\u0001t\u0005t\u05f7\bt\nt\ft\u05fa\tt\u0001"+
		"t\u0001t\u0001u\u0001u\u0001u\u0001u\u0001u\u0001v\u0001v\u0001v\u0001"+
		"v\u0001v\u0001v\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001"+
		"w\u0001x\u0001x\u0001x\u0001x\u0001y\u0001y\u0001y\u0005y\u0618\by\ny"+
		"\fy\u061b\ty\u0001y\u0001y\u0001z\u0001z\u0001z\u0001z\u0005z\u0623\b"+
		"z\nz\fz\u0626\tz\u0001z\u0001z\u0001{\u0001{\u0001{\u0005{\u062d\b{\n"+
		"{\f{\u0630\t{\u0001{\u0001{\u0001|\u0001|\u0001|\u0001|\u0001|\u0005|"+
		"\u0639\b|\n|\f|\u063c\t|\u0001|\u0001|\u0001|\u0001}\u0001}\u0001}\u0005"+
		"}\u0644\b}\n}\f}\u0647\t}\u0001}\u0001}\u0001~\u0001~\u0001~\u0001~\u0001"+
		"~\u0001~\u0001~\u0001~\u0001~\u0001~\u0005~\u0655\b~\n~\f~\u0658\t~\u0001"+
		"~\u0001~\u0001~\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001"+
		"\u007f\u0005\u007f\u0662\b\u007f\n\u007f\f\u007f\u0665\t\u007f\u0001\u007f"+
		"\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u0080\u0001\u0080\u0001\u0080"+
		"\u0001\u0080\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081"+
		"\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0005\u0081\u0678\b\u0081"+
		"\n\u0081\f\u0081\u067b\t\u0081\u0001\u0081\u0001\u0081\u0001\u0082\u0001"+
		"\u0082\u0001\u0082\u0001\u0082\u0001\u0083\u0001\u0083\u0001\u0083\u0001"+
		"\u0083\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0085\u0001"+
		"\u0085\u0001\u0085\u0005\u0085\u068e\b\u0085\n\u0085\f\u0085\u0691\t\u0085"+
		"\u0001\u0085\u0001\u0085\u0001\u0086\u0001\u0086\u0001\u0086\u0005\u0086"+
		"\u0698\b\u0086\n\u0086\f\u0086\u069b\t\u0086\u0001\u0086\u0001\u0086\u0001"+
		"\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001"+
		"\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0005\u0087\u06a9\b\u0087\n"+
		"\u0087\f\u0087\u06ac\t\u0087\u0001\u0087\u0001\u0087\u0001\u0088\u0001"+
		"\u0088\u0001\u0088\u0001\u0088\u0001\u0089\u0001\u0089\u0001\u0089\u0001"+
		"\u0089\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008b\u0001"+
		"\u008b\u0001\u008b\u0005\u008b\u06bf\b\u008b\n\u008b\f\u008b\u06c2\t\u008b"+
		"\u0001\u008b\u0001\u008b\u0001\u008c\u0001\u008c\u0001\u008c\u0005\u008c"+
		"\u06c9\b\u008c\n\u008c\f\u008c\u06cc\t\u008c\u0001\u008c\u0001\u008c\u0001"+
		"\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0000"+
		"\u0000\u008e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt"+
		"vxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
		"\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u0000\u0015\u0001\u0000\"#"+
		"\u0002\u0000\b\b\n\n\u0004\u0000\u0003\u0004\u0007\nPP\u00a7\u00a7\u0001"+
		"\u0000\u0003\u0004\u0002\u0000\u0007\u0007PP\u0002\u0000NN\u00a7\u00a7"+
		"\u0002\u0000OO\u00a7\u00a7\u0001\u0000QR\u0002\u0000\t\t\u00a7\u00a7\u0002"+
		"\u0000MM\u00a7\u00a7\u0004\u0000\u0001\u0002\u0005\u0005\u0007\u0007P"+
		"P\u0001\u0000\u0096\u0097\u0001\u0000\\^\u0001\u0000`b\u0002\u0000efh"+
		"k\u0001\u0000\u00a7\u00a8\u0002\u0000\t\t\u00a7\u00a8\u0001\u0000z{\u0001"+
		"\u0000>?\u0001\u00009=\u0001\u0000\u008e\u008f\u0736\u0000\u0170\u0001"+
		"\u0000\u0000\u0000\u0002\u0172\u0001\u0000\u0000\u0000\u0004\u017e\u0001"+
		"\u0000\u0000\u0000\u0006\u0180\u0001\u0000\u0000\u0000\b\u018a\u0001\u0000"+
		"\u0000\u0000\n\u0194\u0001\u0000\u0000\u0000\f\u019e\u0001\u0000\u0000"+
		"\u0000\u000e\u01a8\u0001\u0000\u0000\u0000\u0010\u01b8\u0001\u0000\u0000"+
		"\u0000\u0012\u01c3\u0001\u0000\u0000\u0000\u0014\u01cd\u0001\u0000\u0000"+
		"\u0000\u0016\u01d9\u0001\u0000\u0000\u0000\u0018\u01ec\u0001\u0000\u0000"+
		"\u0000\u001a\u01fa\u0001\u0000\u0000\u0000\u001c\u01fe\u0001\u0000\u0000"+
		"\u0000\u001e\u0209\u0001\u0000\u0000\u0000 \u020b\u0001\u0000\u0000\u0000"+
		"\"\u020f\u0001\u0000\u0000\u0000$\u0213\u0001\u0000\u0000\u0000&\u0217"+
		"\u0001\u0000\u0000\u0000(\u0219\u0001\u0000\u0000\u0000*\u021d\u0001\u0000"+
		"\u0000\u0000,\u0227\u0001\u0000\u0000\u0000.\u0231\u0001\u0000\u0000\u0000"+
		"0\u023c\u0001\u0000\u0000\u00002\u024d\u0001\u0000\u0000\u00004\u0258"+
		"\u0001\u0000\u0000\u00006\u0265\u0001\u0000\u0000\u00008\u0272\u0001\u0000"+
		"\u0000\u0000:\u0276\u0001\u0000\u0000\u0000<\u0290\u0001\u0000\u0000\u0000"+
		">\u0292\u0001\u0000\u0000\u0000@\u029c\u0001\u0000\u0000\u0000B\u02a6"+
		"\u0001\u0000\u0000\u0000D\u02b0\u0001\u0000\u0000\u0000F\u02ba\u0001\u0000"+
		"\u0000\u0000H\u02c4\u0001\u0000\u0000\u0000J\u02ce\u0001\u0000\u0000\u0000"+
		"L\u02dd\u0001\u0000\u0000\u0000N\u02ec\u0001\u0000\u0000\u0000P\u02fb"+
		"\u0001\u0000\u0000\u0000R\u030a\u0001\u0000\u0000\u0000T\u0319\u0001\u0000"+
		"\u0000\u0000V\u0328\u0001\u0000\u0000\u0000X\u033a\u0001\u0000\u0000\u0000"+
		"Z\u033c\u0001\u0000\u0000\u0000\\\u0346\u0001\u0000\u0000\u0000^\u0351"+
		"\u0001\u0000\u0000\u0000`\u0360\u0001\u0000\u0000\u0000b\u036a\u0001\u0000"+
		"\u0000\u0000d\u0374\u0001\u0000\u0000\u0000f\u037e\u0001\u0000\u0000\u0000"+
		"h\u0388\u0001\u0000\u0000\u0000j\u0392\u0001\u0000\u0000\u0000l\u0396"+
		"\u0001\u0000\u0000\u0000n\u039a\u0001\u0000\u0000\u0000p\u039e\u0001\u0000"+
		"\u0000\u0000r\u03a8\u0001\u0000\u0000\u0000t\u03b2\u0001\u0000\u0000\u0000"+
		"v\u03bc\u0001\u0000\u0000\u0000x\u03ca\u0001\u0000\u0000\u0000z\u03d8"+
		"\u0001\u0000\u0000\u0000|\u03dc\u0001\u0000\u0000\u0000~\u03f6\u0001\u0000"+
		"\u0000\u0000\u0080\u0400\u0001\u0000\u0000\u0000\u0082\u0424\u0001\u0000"+
		"\u0000\u0000\u0084\u0428\u0001\u0000\u0000\u0000\u0086\u0433\u0001\u0000"+
		"\u0000\u0000\u0088\u043e\u0001\u0000\u0000\u0000\u008a\u0455\u0001\u0000"+
		"\u0000\u0000\u008c\u045b\u0001\u0000\u0000\u0000\u008e\u045d\u0001\u0000"+
		"\u0000\u0000\u0090\u046d\u0001\u0000\u0000\u0000\u0092\u0471\u0001\u0000"+
		"\u0000\u0000\u0094\u0475\u0001\u0000\u0000\u0000\u0096\u0485\u0001\u0000"+
		"\u0000\u0000\u0098\u0489\u0001\u0000\u0000\u0000\u009a\u0493\u0001\u0000"+
		"\u0000\u0000\u009c\u0497\u0001\u0000\u0000\u0000\u009e\u049b\u0001\u0000"+
		"\u0000\u0000\u00a0\u04af\u0001\u0000\u0000\u0000\u00a2\u04b3\u0001\u0000"+
		"\u0000\u0000\u00a4\u04b7\u0001\u0000\u0000\u0000\u00a6\u04be\u0001\u0000"+
		"\u0000\u0000\u00a8\u04c0\u0001\u0000\u0000\u0000\u00aa\u04ca\u0001\u0000"+
		"\u0000\u0000\u00ac\u04d4\u0001\u0000\u0000\u0000\u00ae\u04de\u0001\u0000"+
		"\u0000\u0000\u00b0\u04f1\u0001\u0000\u0000\u0000\u00b2\u04f5\u0001\u0000"+
		"\u0000\u0000\u00b4\u04f9\u0001\u0000\u0000\u0000\u00b6\u04fd\u0001\u0000"+
		"\u0000\u0000\u00b8\u0501\u0001\u0000\u0000\u0000\u00ba\u0505\u0001\u0000"+
		"\u0000\u0000\u00bc\u0509\u0001\u0000\u0000\u0000\u00be\u050d\u0001\u0000"+
		"\u0000\u0000\u00c0\u0511\u0001\u0000\u0000\u0000\u00c2\u051b\u0001\u0000"+
		"\u0000\u0000\u00c4\u051f\u0001\u0000\u0000\u0000\u00c6\u0523\u0001\u0000"+
		"\u0000\u0000\u00c8\u0530\u0001\u0000\u0000\u0000\u00ca\u0532\u0001\u0000"+
		"\u0000\u0000\u00cc\u0551\u0001\u0000\u0000\u0000\u00ce\u055b\u0001\u0000"+
		"\u0000\u0000\u00d0\u0565\u0001\u0000\u0000\u0000\u00d2\u056e\u0001\u0000"+
		"\u0000\u0000\u00d4\u0572\u0001\u0000\u0000\u0000\u00d6\u0576\u0001\u0000"+
		"\u0000\u0000\u00d8\u057a\u0001\u0000\u0000\u0000\u00da\u057e\u0001\u0000"+
		"\u0000\u0000\u00dc\u0589\u0001\u0000\u0000\u0000\u00de\u058b\u0001\u0000"+
		"\u0000\u0000\u00e0\u058f\u0001\u0000\u0000\u0000\u00e2\u0593\u0001\u0000"+
		"\u0000\u0000\u00e4\u0597\u0001\u0000\u0000\u0000\u00e6\u05a7\u0001\u0000"+
		"\u0000\u0000\u00e8\u05ce\u0001\u0000\u0000\u0000\u00ea\u05fd\u0001\u0000"+
		"\u0000\u0000\u00ec\u0602\u0001\u0000\u0000\u0000\u00ee\u0608\u0001\u0000"+
		"\u0000\u0000\u00f0\u0610\u0001\u0000\u0000\u0000\u00f2\u0614\u0001\u0000"+
		"\u0000\u0000\u00f4\u061e\u0001\u0000\u0000\u0000\u00f6\u0629\u0001\u0000"+
		"\u0000\u0000\u00f8\u0633\u0001\u0000\u0000\u0000\u00fa\u0640\u0001\u0000"+
		"\u0000\u0000\u00fc\u064a\u0001\u0000\u0000\u0000\u00fe\u065c\u0001\u0000"+
		"\u0000\u0000\u0100\u066a\u0001\u0000\u0000\u0000\u0102\u066e\u0001\u0000"+
		"\u0000\u0000\u0104\u067e\u0001\u0000\u0000\u0000\u0106\u0682\u0001\u0000"+
		"\u0000\u0000\u0108\u0686\u0001\u0000\u0000\u0000\u010a\u068a\u0001\u0000"+
		"\u0000\u0000\u010c\u0694\u0001\u0000\u0000\u0000\u010e\u069e\u0001\u0000"+
		"\u0000\u0000\u0110\u06af\u0001\u0000\u0000\u0000\u0112\u06b3\u0001\u0000"+
		"\u0000\u0000\u0114\u06b7\u0001\u0000\u0000\u0000\u0116\u06bb\u0001\u0000"+
		"\u0000\u0000\u0118\u06c5\u0001\u0000\u0000\u0000\u011a\u06cf\u0001\u0000"+
		"\u0000\u0000\u011c\u011e\u0003\u00fe\u007f\u0000\u011d\u011c\u0001\u0000"+
		"\u0000\u0000\u011e\u0121\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0171\u0001\u0000"+
		"\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122\u0124\u0003\u00fc"+
		"~\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0124\u0127\u0001\u0000\u0000"+
		"\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000"+
		"\u0000\u0126\u0171\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000"+
		"\u0000\u0128\u012a\u0003\u00eew\u0000\u0129\u0128\u0001\u0000\u0000\u0000"+
		"\u012a\u012d\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000"+
		"\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u0171\u0001\u0000\u0000\u0000"+
		"\u012d\u012b\u0001\u0000\u0000\u0000\u012e\u0130\u0003\u00e8t\u0000\u012f"+
		"\u012e\u0001\u0000\u0000\u0000\u0130\u0133\u0001\u0000\u0000\u0000\u0131"+
		"\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132"+
		"\u0171\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0134"+
		"\u0136\u0003\u00e6s\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0136\u0139"+
		"\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0001\u0000\u0000\u0000\u0138\u0171\u0001\u0000\u0000\u0000\u0139\u0137"+
		"\u0001\u0000\u0000\u0000\u013a\u013c\u0003\u00e4r\u0000\u013b\u013a\u0001"+
		"\u0000\u0000\u0000\u013c\u013f\u0001\u0000\u0000\u0000\u013d\u013b\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0171\u0001"+
		"\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u0140\u0142\u0003"+
		"\u00cae\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0142\u0145\u0001\u0000"+
		"\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000"+
		"\u0000\u0000\u0144\u0171\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000"+
		"\u0000\u0000\u0146\u0148\u0003\u00aeW\u0000\u0147\u0146\u0001\u0000\u0000"+
		"\u0000\u0148\u014b\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000"+
		"\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u0171\u0001\u0000\u0000"+
		"\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014c\u014e\u0003\u009eO\u0000"+
		"\u014d\u014c\u0001\u0000\u0000\u0000\u014e\u0151\u0001\u0000\u0000\u0000"+
		"\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000"+
		"\u0150\u0171\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000"+
		"\u0152\u0154\u0003\u008eG\u0000\u0153\u0152\u0001\u0000\u0000\u0000\u0154"+
		"\u0157\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155"+
		"\u0156\u0001\u0000\u0000\u0000\u0156\u0171\u0001\u0000\u0000\u0000\u0157"+
		"\u0155\u0001\u0000\u0000\u0000\u0158\u015a\u0003\u0082A\u0000\u0159\u0158"+
		"\u0001\u0000\u0000\u0000\u015a\u015d\u0001\u0000\u0000\u0000\u015b\u0159"+
		"\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u0171"+
		"\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u0160"+
		"\u0003|>\u0000\u015f\u015e\u0001\u0000\u0000\u0000\u0160\u0163\u0001\u0000"+
		"\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000"+
		"\u0000\u0000\u0162\u0171\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000"+
		"\u0000\u0000\u0164\u0166\u0003z=\u0000\u0165\u0164\u0001\u0000\u0000\u0000"+
		"\u0166\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000"+
		"\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0171\u0001\u0000\u0000\u0000"+
		"\u0169\u0167\u0001\u0000\u0000\u0000\u016a\u016c\u0003v;\u0000\u016b\u016a"+
		"\u0001\u0000\u0000\u0000\u016c\u016f\u0001\u0000\u0000\u0000\u016d\u016b"+
		"\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u0171"+
		"\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u0170\u011f"+
		"\u0001\u0000\u0000\u0000\u0170\u0125\u0001\u0000\u0000\u0000\u0170\u012b"+
		"\u0001\u0000\u0000\u0000\u0170\u0131\u0001\u0000\u0000\u0000\u0170\u0137"+
		"\u0001\u0000\u0000\u0000\u0170\u013d\u0001\u0000\u0000\u0000\u0170\u0143"+
		"\u0001\u0000\u0000\u0000\u0170\u0149\u0001\u0000\u0000\u0000\u0170\u014f"+
		"\u0001\u0000\u0000\u0000\u0170\u0155\u0001\u0000\u0000\u0000\u0170\u015b"+
		"\u0001\u0000\u0000\u0000\u0170\u0161\u0001\u0000\u0000\u0000\u0170\u0167"+
		"\u0001\u0000\u0000\u0000\u0170\u016d\u0001\u0000\u0000\u0000\u0171\u0001"+
		"\u0001\u0000\u0000\u0000\u0172\u0177\u0005\r\u0000\u0000\u0173\u0176\u0003"+
		"\u0004\u0002\u0000\u0174\u0176\u00030\u0018\u0000\u0175\u0173\u0001\u0000"+
		"\u0000\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0176\u0179\u0001\u0000"+
		"\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000"+
		"\u0000\u0000\u0178\u017a\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000"+
		"\u0000\u0000\u017a\u017b\u0005\u000e\u0000\u0000\u017b\u0003\u0001\u0000"+
		"\u0000\u0000\u017c\u017f\u0003<\u001e\u0000\u017d\u017f\u0003\u0002\u0001"+
		"\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017e\u017d\u0001\u0000\u0000"+
		"\u0000\u017f\u0005\u0001\u0000\u0000\u0000\u0180\u0181\u0005\u001c\u0000"+
		"\u0000\u0181\u0185\u0005\u000f\u0000\u0000\u0182\u0184\u0003X,\u0000\u0183"+
		"\u0182\u0001\u0000\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185"+
		"\u0183\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186"+
		"\u0188\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188"+
		"\u0189\u0005\u000e\u0000\u0000\u0189\u0007\u0001\u0000\u0000\u0000\u018a"+
		"\u018b\u0005\u001b\u0000\u0000\u018b\u018f\u0005\u000f\u0000\u0000\u018c"+
		"\u018e\u0003X,\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018e\u0191\u0001"+
		"\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u018f\u0190\u0001"+
		"\u0000\u0000\u0000\u0190\u0192\u0001\u0000\u0000\u0000\u0191\u018f\u0001"+
		"\u0000\u0000\u0000\u0192\u0193\u0005\u000e\u0000\u0000\u0193\t\u0001\u0000"+
		"\u0000\u0000\u0194\u0195\u0005\u001d\u0000\u0000\u0195\u0199\u0005\u000f"+
		"\u0000\u0000\u0196\u0198\u0003<\u001e\u0000\u0197\u0196\u0001\u0000\u0000"+
		"\u0000\u0198\u019b\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000"+
		"\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019c\u0001\u0000\u0000"+
		"\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u019d\u0005\u000e\u0000"+
		"\u0000\u019d\u000b\u0001\u0000\u0000\u0000\u019e\u019f\u0005U\u0000\u0000"+
		"\u019f\u01a3\u0005\u000f\u0000\u0000\u01a0\u01a2\u00038\u001c\u0000\u01a1"+
		"\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a5\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a6"+
		"\u01a7\u0005\u000e\u0000\u0000\u01a7\r\u0001\u0000\u0000\u0000\u01a8\u01a9"+
		"\u0005V\u0000\u0000\u01a9\u01ad\u0005\u000f\u0000\u0000\u01aa\u01ac\u0003"+
		"\u001a\r\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ac\u01af\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000"+
		"\u0000\u0000\u01ae\u01b3\u0001\u0000\u0000\u0000\u01af\u01ad\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b2\u0003\u001c\u000e\u0000\u01b1\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b5\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b6\u01b7\u0005\u000e"+
		"\u0000\u0000\u01b7\u000f\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005W\u0000"+
		"\u0000\u01b9\u01ba\u0005\u000f\u0000\u0000\u01ba\u01be\u0003\u001a\r\u0000"+
		"\u01bb\u01bd\u0003\u001c\u000e\u0000\u01bc\u01bb\u0001\u0000\u0000\u0000"+
		"\u01bd\u01c0\u0001\u0000\u0000\u0000\u01be\u01bc\u0001\u0000\u0000\u0000"+
		"\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c1\u0001\u0000\u0000\u0000"+
		"\u01c0\u01be\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005\u000e\u0000\u0000"+
		"\u01c2\u0011\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005\u001e\u0000\u0000"+
		"\u01c4\u01c8\u0005\u000f\u0000\u0000\u01c5\u01c7\u0003X,\u0000\u01c6\u01c5"+
		"\u0001\u0000\u0000\u0000\u01c7\u01ca\u0001\u0000\u0000\u0000\u01c8\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01cb"+
		"\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01cb\u01cc"+
		"\u0005\u000e\u0000\u0000\u01cc\u0013\u0001\u0000\u0000\u0000\u01cd\u01ce"+
		"\u0007\u0000\u0000\u0000\u01ce\u01d3\u0005\u000f\u0000\u0000\u01cf\u01d0"+
		"\u0005\"\u0000\u0000\u01d0\u01d1\u0005\u0010\u0000\u0000\u01d1\u01d4\u0005"+
		"\t\u0000\u0000\u01d2\u01d4\u0003\u0006\u0003\u0000\u01d3\u01cf\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005\u000e"+
		"\u0000\u0000\u01d8\u0015\u0001\u0000\u0000\u0000\u01d9\u01da\u0005*\u0000"+
		"\u0000\u01da\u01dc\u0005\u000f\u0000\u0000\u01db\u01dd\u0005\b\u0000\u0000"+
		"\u01dc\u01db\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000"+
		"\u01de\u01dc\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000"+
		"\u01df\u01e1\u0001\u0000\u0000\u0000\u01e0\u01e2\u0005\b\u0000\u0000\u01e1"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e6\u0001\u0000\u0000\u0000\u01e5\u01e7\u0005\b\u0000\u0000\u01e6\u01e5"+
		"\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01e6"+
		"\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u01ea"+
		"\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005\u000e\u0000\u0000\u01eb\u0017"+
		"\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005s\u0000\u0000\u01ed\u01f5\u0005"+
		"\u000f\u0000\u0000\u01ee\u01f0\u0005\b\u0000\u0000\u01ef\u01ee\u0001\u0000"+
		"\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000"+
		"\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f4\u0001\u0000"+
		"\u0000\u0000\u01f3\u01ef\u0001\u0000\u0000\u0000\u01f4\u01f7\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f6\u01f8\u0001\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000"+
		"\u0000\u0000\u01f8\u01f9\u0005\u000e\u0000\u0000\u01f9\u0019\u0001\u0000"+
		"\u0000\u0000\u01fa\u01fb\u0005X\u0000\u0000\u01fb\u01fc\u0005\u0010\u0000"+
		"\u0000\u01fc\u01fd\u0007\u0001\u0000\u0000\u01fd\u001b\u0001\u0000\u0000"+
		"\u0000\u01fe\u01ff\u0005U\u0000\u0000\u01ff\u0204\u0005\u000f\u0000\u0000"+
		"\u0200\u0203\u0003\u001a\r\u0000\u0201\u0203\u0003X,\u0000\u0202\u0200"+
		"\u0001\u0000\u0000\u0000\u0202\u0201\u0001\u0000\u0000\u0000\u0203\u0206"+
		"\u0001\u0000\u0000\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0204\u0205"+
		"\u0001\u0000\u0000\u0000\u0205\u0207\u0001\u0000\u0000\u0000\u0206\u0204"+
		"\u0001\u0000\u0000\u0000\u0207\u0208\u0005\u000e\u0000\u0000\u0208\u001d"+
		"\u0001\u0000\u0000\u0000\u0209\u020a\u0007\u0002\u0000\u0000\u020a\u001f"+
		"\u0001\u0000\u0000\u0000\u020b\u020c\u0005 \u0000\u0000\u020c\u020d\u0005"+
		"\u0010\u0000\u0000\u020d\u020e\u0005\b\u0000\u0000\u020e!\u0001\u0000"+
		"\u0000\u0000\u020f\u0210\u0005\"\u0000\u0000\u0210\u0211\u0005\u0010\u0000"+
		"\u0000\u0211\u0212\u0005\t\u0000\u0000\u0212#\u0001\u0000\u0000\u0000"+
		"\u0213\u0214\u0005!\u0000\u0000\u0214\u0215\u0005\u0010\u0000\u0000\u0215"+
		"\u0216\u0005\u000b\u0000\u0000\u0216%\u0001\u0000\u0000\u0000\u0217\u0218"+
		"\u0007\u0003\u0000\u0000\u0218\'\u0001\u0000\u0000\u0000\u0219\u021a\u0005"+
		"\f\u0000\u0000\u021a\u021b\u0005\u0010\u0000\u0000\u021b\u021c\u0005\b"+
		"\u0000\u0000\u021c)\u0001\u0000\u0000\u0000\u021d\u021e\u0005\u0018\u0000"+
		"\u0000\u021e\u0222\u0005\u000f\u0000\u0000\u021f\u0221\u0003X,\u0000\u0220"+
		"\u021f\u0001\u0000\u0000\u0000\u0221\u0224\u0001\u0000\u0000\u0000\u0222"+
		"\u0220\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000\u0000\u0223"+
		"\u0225\u0001\u0000\u0000\u0000\u0224\u0222\u0001\u0000\u0000\u0000\u0225"+
		"\u0226\u0005\u000e\u0000\u0000\u0226+\u0001\u0000\u0000\u0000\u0227\u0228"+
		"\u0005\u0016\u0000\u0000\u0228\u022c\u0005\u000f\u0000\u0000\u0229\u022b"+
		"\u0003<\u001e\u0000\u022a\u0229\u0001\u0000\u0000\u0000\u022b\u022e\u0001"+
		"\u0000\u0000\u0000\u022c\u022a\u0001\u0000\u0000\u0000\u022c\u022d\u0001"+
		"\u0000\u0000\u0000\u022d\u022f\u0001\u0000\u0000\u0000\u022e\u022c\u0001"+
		"\u0000\u0000\u0000\u022f\u0230\u0005\u000e\u0000\u0000\u0230-\u0001\u0000"+
		"\u0000\u0000\u0231\u0232\u0005\u0017\u0000\u0000\u0232\u0233\u0005\u000f"+
		"\u0000\u0000\u0233\u0237\u0003*\u0015\u0000\u0234\u0236\u0003<\u001e\u0000"+
		"\u0235\u0234\u0001\u0000\u0000\u0000\u0236\u0239\u0001\u0000\u0000\u0000"+
		"\u0237\u0235\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000"+
		"\u0238\u023a\u0001\u0000\u0000\u0000\u0239\u0237\u0001\u0000\u0000\u0000"+
		"\u023a\u023b\u0005\u000e\u0000\u0000\u023b/\u0001\u0000\u0000\u0000\u023c"+
		"\u023d\u0005\u0015\u0000\u0000\u023d\u023e\u0005\u000f\u0000\u0000\u023e"+
		"\u0242\u0003*\u0015\u0000\u023f\u0241\u0003<\u001e\u0000\u0240\u023f\u0001"+
		"\u0000\u0000\u0000\u0241\u0244\u0001\u0000\u0000\u0000\u0242\u0240\u0001"+
		"\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243\u0245\u0001"+
		"\u0000\u0000\u0000\u0244\u0242\u0001\u0000\u0000\u0000\u0245\u024a\u0005"+
		"\u000e\u0000\u0000\u0246\u0249\u0003,\u0016\u0000\u0247\u0249\u0003.\u0017"+
		"\u0000\u0248\u0246\u0001\u0000\u0000\u0000\u0248\u0247\u0001\u0000\u0000"+
		"\u0000\u0249\u024c\u0001\u0000\u0000\u0000\u024a\u0248\u0001\u0000\u0000"+
		"\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b1\u0001\u0000\u0000\u0000"+
		"\u024c\u024a\u0001\u0000\u0000\u0000\u024d\u024e\u0005\u0019\u0000\u0000"+
		"\u024e\u024f\u0005\u000f\u0000\u0000\u024f\u0253\u0003*\u0015\u0000\u0250"+
		"\u0252\u0003<\u001e\u0000\u0251\u0250\u0001\u0000\u0000\u0000\u0252\u0255"+
		"\u0001\u0000\u0000\u0000\u0253\u0251\u0001\u0000\u0000\u0000\u0253\u0254"+
		"\u0001\u0000\u0000\u0000\u0254\u0256\u0001\u0000\u0000\u0000\u0255\u0253"+
		"\u0001\u0000\u0000\u0000\u0256\u0257\u0005\u000e\u0000\u0000\u02573\u0001"+
		"\u0000\u0000\u0000\u0258\u0259\u0007\u0004\u0000\u0000\u0259\u0260\u0005"+
		"\u000f\u0000\u0000\u025a\u025f\u0003<\u001e\u0000\u025b\u025f\u0003X,"+
		"\u0000\u025c\u025f\u00034\u001a\u0000\u025d\u025f\u0003*\u0015\u0000\u025e"+
		"\u025a\u0001\u0000\u0000\u0000\u025e\u025b\u0001\u0000\u0000\u0000\u025e"+
		"\u025c\u0001\u0000\u0000\u0000\u025e\u025d\u0001\u0000\u0000\u0000\u025f"+
		"\u0262\u0001\u0000\u0000\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0260"+
		"\u0261\u0001\u0000\u0000\u0000\u0261\u0263\u0001\u0000\u0000\u0000\u0262"+
		"\u0260\u0001\u0000\u0000\u0000\u0263\u0264\u0005\u000e\u0000\u0000\u0264"+
		"5\u0001\u0000\u0000\u0000\u0265\u0266\u0005\u00a7\u0000\u0000\u0266\u0270"+
		"\u0005\u0010\u0000\u0000\u0267\u026b\u0005\r\u0000\u0000\u0268\u026a\u0003"+
		"\u0004\u0002\u0000\u0269\u0268\u0001\u0000\u0000\u0000\u026a\u026d\u0001"+
		"\u0000\u0000\u0000\u026b\u0269\u0001\u0000\u0000\u0000\u026b\u026c\u0001"+
		"\u0000\u0000\u0000\u026c\u026e\u0001\u0000\u0000\u0000\u026d\u026b\u0001"+
		"\u0000\u0000\u0000\u026e\u0271\u0005\u000e\u0000\u0000\u026f\u0271\u0005"+
		"\u0003\u0000\u0000\u0270\u0267\u0001\u0000\u0000\u0000\u0270\u026f\u0001"+
		"\u0000\u0000\u0000\u02717\u0001\u0000\u0000\u0000\u0272\u0273\u0007\u0005"+
		"\u0000\u0000\u0273\u0274\u0005\u0010\u0000\u0000\u0274\u0275\u0007\u0002"+
		"\u0000\u0000\u02759\u0001\u0000\u0000\u0000\u0276\u0277\u0005\u001a\u0000"+
		"\u0000\u0277\u0278\u0005\u000f\u0000\u0000\u0278\u0279\u0003\u0006\u0003"+
		"\u0000\u0279\u027a\u0003\f\u0006\u0000\u027a\u027b\u0005\u000e\u0000\u0000"+
		"\u027b;\u0001\u0000\u0000\u0000\u027c\u027d\u0007\u0006\u0000\u0000\u027d"+
		"\u027e\u0005\u0010\u0000\u0000\u027e\u0291\u0007\u0002\u0000\u0000\u027f"+
		"\u0291\u00036\u001b\u0000\u0280\u0291\u00030\u0018\u0000\u0281\u0291\u0003"+
		"4\u001a\u0000\u0282\u0291\u0003\u0092I\u0000\u0283\u0291\u0003H$\u0000"+
		"\u0284\u0291\u00032\u0019\u0000\u0285\u0291\u0003J%\u0000\u0286\u0291"+
		"\u0003L&\u0000\u0287\u0291\u0003N\'\u0000\u0288\u0291\u0003P(\u0000\u0289"+
		"\u0291\u0003R)\u0000\u028a\u0291\u0003T*\u0000\u028b\u0291\u0003F#\u0000"+
		"\u028c\u0291\u0003>\u001f\u0000\u028d\u0291\u0003@ \u0000\u028e\u0291"+
		"\u0003B!\u0000\u028f\u0291\u0003D\"\u0000\u0290\u027c\u0001\u0000\u0000"+
		"\u0000\u0290\u027f\u0001\u0000\u0000\u0000\u0290\u0280\u0001\u0000\u0000"+
		"\u0000\u0290\u0281\u0001\u0000\u0000\u0000\u0290\u0282\u0001\u0000\u0000"+
		"\u0000\u0290\u0283\u0001\u0000\u0000\u0000\u0290\u0284\u0001\u0000\u0000"+
		"\u0000\u0290\u0285\u0001\u0000\u0000\u0000\u0290\u0286\u0001\u0000\u0000"+
		"\u0000\u0290\u0287\u0001\u0000\u0000\u0000\u0290\u0288\u0001\u0000\u0000"+
		"\u0000\u0290\u0289\u0001\u0000\u0000\u0000\u0290\u028a\u0001\u0000\u0000"+
		"\u0000\u0290\u028b\u0001\u0000\u0000\u0000\u0290\u028c\u0001\u0000\u0000"+
		"\u0000\u0290\u028d\u0001\u0000\u0000\u0000\u0290\u028e\u0001\u0000\u0000"+
		"\u0000\u0290\u028f\u0001\u0000\u0000\u0000\u0291=\u0001\u0000\u0000\u0000"+
		"\u0292\u0293\u0005F\u0000\u0000\u0293\u0294\u0005\u000f\u0000\u0000\u0294"+
		"\u0295\u00054\u0000\u0000\u0295\u0296\u0005\u0010\u0000\u0000\u0296\u0297"+
		"\u0007\u0004\u0000\u0000\u0297\u0298\u0005U\u0000\u0000\u0298\u0299\u0005"+
		"\u0010\u0000\u0000\u0299\u029a\u0005\u00a7\u0000\u0000\u029a\u029b\u0005"+
		"\u000e\u0000\u0000\u029b?\u0001\u0000\u0000\u0000\u029c\u029d\u0005E\u0000"+
		"\u0000\u029d\u029e\u0005\u000f\u0000\u0000\u029e\u029f\u00054\u0000\u0000"+
		"\u029f\u02a0\u0005\u0010\u0000\u0000\u02a0\u02a1\u0007\u0004\u0000\u0000"+
		"\u02a1\u02a2\u0005U\u0000\u0000\u02a2\u02a3\u0005\u0010\u0000\u0000\u02a3"+
		"\u02a4\u0005\u00a7\u0000\u0000\u02a4\u02a5\u0005\u000e\u0000\u0000\u02a5"+
		"A\u0001\u0000\u0000\u0000\u02a6\u02a7\u0005G\u0000\u0000\u02a7\u02a8\u0005"+
		"\u000f\u0000\u0000\u02a8\u02a9\u00054\u0000\u0000\u02a9\u02aa\u0005\u0010"+
		"\u0000\u0000\u02aa\u02ab\u0007\u0004\u0000\u0000\u02ab\u02ac\u0005U\u0000"+
		"\u0000\u02ac\u02ad\u0005\u0010\u0000\u0000\u02ad\u02ae\u0005\u00a7\u0000"+
		"\u0000\u02ae\u02af\u0005\u000e\u0000\u0000\u02afC\u0001\u0000\u0000\u0000"+
		"\u02b0\u02b1\u0005H\u0000\u0000\u02b1\u02b2\u0005\u000f\u0000\u0000\u02b2"+
		"\u02b3\u00054\u0000\u0000\u02b3\u02b4\u0005\u0010\u0000\u0000\u02b4\u02b5"+
		"\u0007\u0004\u0000\u0000\u02b5\u02b6\u0005U\u0000\u0000\u02b6\u02b7\u0005"+
		"\u0010\u0000\u0000\u02b7\u02b8\u0005\u00a7\u0000\u0000\u02b8\u02b9\u0005"+
		"\u000e\u0000\u0000\u02b9E\u0001\u0000\u0000\u0000\u02ba\u02bb\u0005C\u0000"+
		"\u0000\u02bb\u02bf\u0005\u000f\u0000\u0000\u02bc\u02be\u0003<\u001e\u0000"+
		"\u02bd\u02bc\u0001\u0000\u0000\u0000\u02be\u02c1\u0001\u0000\u0000\u0000"+
		"\u02bf\u02bd\u0001\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000"+
		"\u02c0\u02c2\u0001\u0000\u0000\u0000\u02c1\u02bf\u0001\u0000\u0000\u0000"+
		"\u02c2\u02c3\u0005\u000e\u0000\u0000\u02c3G\u0001\u0000\u0000\u0000\u02c4"+
		"\u02c5\u0007\u0007\u0000\u0000\u02c5\u02c6\u0005\u000f\u0000\u0000\u02c6"+
		"\u02c7\u0005\"\u0000\u0000\u02c7\u02c8\u0005\u0010\u0000\u0000\u02c8\u02c9"+
		"\u0007\b\u0000\u0000\u02c9\u02ca\u0005S\u0000\u0000\u02ca\u02cb\u0005"+
		"\u0010\u0000\u0000\u02cb\u02cc\u0005\b\u0000\u0000\u02cc\u02cd\u0005\u000e"+
		"\u0000\u0000\u02cdI\u0001\u0000\u0000\u0000\u02ce\u02cf\u00050\u0000\u0000"+
		"\u02cf\u02d0\u0005\u000f\u0000\u0000\u02d0\u02d1\u00052\u0000\u0000\u02d1"+
		"\u02d2\u0005\u0010\u0000\u0000\u02d2\u02d9\u0005\u00a7\u0000\u0000\u02d3"+
		"\u02d4\u00052\u0000\u0000\u02d4\u02d5\u0005\u0010\u0000\u0000\u02d5\u02da"+
		"\u0005\u00a7\u0000\u0000\u02d6\u02d7\u00053\u0000\u0000\u02d7\u02d8\u0005"+
		"\u0010\u0000\u0000\u02d8\u02da\u0007\u0001\u0000\u0000\u02d9\u02d3\u0001"+
		"\u0000\u0000\u0000\u02d9\u02d6\u0001\u0000\u0000\u0000\u02da\u02db\u0001"+
		"\u0000\u0000\u0000\u02db\u02dc\u0005\u000e\u0000\u0000\u02dcK\u0001\u0000"+
		"\u0000\u0000\u02dd\u02de\u0005,\u0000\u0000\u02de\u02df\u0005\u000f\u0000"+
		"\u0000\u02df\u02e0\u00052\u0000\u0000\u02e0\u02e1\u0005\u0010\u0000\u0000"+
		"\u02e1\u02e8\u0005\u00a7\u0000\u0000\u02e2\u02e3\u00052\u0000\u0000\u02e3"+
		"\u02e4\u0005\u0010\u0000\u0000\u02e4\u02e9\u0005\u00a7\u0000\u0000\u02e5"+
		"\u02e6\u00053\u0000\u0000\u02e6\u02e7\u0005\u0010\u0000\u0000\u02e7\u02e9"+
		"\u0007\u0001\u0000\u0000\u02e8\u02e2\u0001\u0000\u0000\u0000\u02e8\u02e5"+
		"\u0001\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000\u02ea\u02eb"+
		"\u0005\u000e\u0000\u0000\u02ebM\u0001\u0000\u0000\u0000\u02ec\u02ed\u0005"+
		"-\u0000\u0000\u02ed\u02ee\u0005\u000f\u0000\u0000\u02ee\u02ef\u00052\u0000"+
		"\u0000\u02ef\u02f0\u0005\u0010\u0000\u0000\u02f0\u02f7\u0005\u00a7\u0000"+
		"\u0000\u02f1\u02f2\u00052\u0000\u0000\u02f2\u02f3\u0005\u0010\u0000\u0000"+
		"\u02f3\u02f8\u0005\u00a7\u0000\u0000\u02f4\u02f5\u00053\u0000\u0000\u02f5"+
		"\u02f6\u0005\u0010\u0000\u0000\u02f6\u02f8\u0007\u0001\u0000\u0000\u02f7"+
		"\u02f1\u0001\u0000\u0000\u0000\u02f7\u02f4\u0001\u0000\u0000\u0000\u02f8"+
		"\u02f9\u0001\u0000\u0000\u0000\u02f9\u02fa\u0005\u000e\u0000\u0000\u02fa"+
		"O\u0001\u0000\u0000\u0000\u02fb\u02fc\u0005.\u0000\u0000\u02fc\u02fd\u0005"+
		"\u000f\u0000\u0000\u02fd\u02fe\u00052\u0000\u0000\u02fe\u02ff\u0005\u0010"+
		"\u0000\u0000\u02ff\u0306\u0005\u00a7\u0000\u0000\u0300\u0301\u00052\u0000"+
		"\u0000\u0301\u0302\u0005\u0010\u0000\u0000\u0302\u0307\u0005\u00a7\u0000"+
		"\u0000\u0303\u0304\u00053\u0000\u0000\u0304\u0305\u0005\u0010\u0000\u0000"+
		"\u0305\u0307\u0007\u0001\u0000\u0000\u0306\u0300\u0001\u0000\u0000\u0000"+
		"\u0306\u0303\u0001\u0000\u0000\u0000\u0307\u0308\u0001\u0000\u0000\u0000"+
		"\u0308\u0309\u0005\u000e\u0000\u0000\u0309Q\u0001\u0000\u0000\u0000\u030a"+
		"\u030b\u0005/\u0000\u0000\u030b\u030c\u0005\u000f\u0000\u0000\u030c\u030d"+
		"\u00052\u0000\u0000\u030d\u030e\u0005\u0010\u0000\u0000\u030e\u0315\u0005"+
		"\u00a7\u0000\u0000\u030f\u0310\u00052\u0000\u0000\u0310\u0311\u0005\u0010"+
		"\u0000\u0000\u0311\u0316\u0005\u00a7\u0000\u0000\u0312\u0313\u00053\u0000"+
		"\u0000\u0313\u0314\u0005\u0010\u0000\u0000\u0314\u0316\u0007\u0001\u0000"+
		"\u0000\u0315\u030f\u0001\u0000\u0000\u0000\u0315\u0312\u0001\u0000\u0000"+
		"\u0000\u0316\u0317\u0001\u0000\u0000\u0000\u0317\u0318\u0005\u000e\u0000"+
		"\u0000\u0318S\u0001\u0000\u0000\u0000\u0319\u031a\u00051\u0000\u0000\u031a"+
		"\u031b\u0005\u000f\u0000\u0000\u031b\u031c\u00052\u0000\u0000\u031c\u031d"+
		"\u0005\u0010\u0000\u0000\u031d\u031e\u0005\u00a7\u0000\u0000\u031e\u031f"+
		"\u00053\u0000\u0000\u031f\u0320\u0005\u0010\u0000\u0000\u0320\u0324\u0005"+
		"\u00a7\u0000\u0000\u0321\u0322\u00054\u0000\u0000\u0322\u0323\u0005\u0010"+
		"\u0000\u0000\u0323\u0325\u0007\u0004\u0000\u0000\u0324\u0321\u0001\u0000"+
		"\u0000\u0000\u0324\u0325\u0001\u0000\u0000\u0000\u0325\u0326\u0001\u0000"+
		"\u0000\u0000\u0326\u0327\u0005\u000e\u0000\u0000\u0327U\u0001\u0000\u0000"+
		"\u0000\u0328\u0329\u0005\u0006\u0000\u0000\u0329\u032a\u0005\u0010\u0000"+
		"\u0000\u032a\u032b\u0005\b\u0000\u0000\u032bW\u0001\u0000\u0000\u0000"+
		"\u032c\u032d\u0007\t\u0000\u0000\u032d\u032e\u0005\u0010\u0000\u0000\u032e"+
		"\u033b\u0007\u0002\u0000\u0000\u032f\u033b\u0003d2\u0000\u0330\u033b\u0003"+
		"\u0094J\u0000\u0331\u033b\u0003\\.\u0000\u0332\u033b\u0003p8\u0000\u0333"+
		"\u033b\u0003j5\u0000\u0334\u033b\u0003V+\u0000\u0335\u033b\u0003`0\u0000"+
		"\u0336\u033b\u0003b1\u0000\u0337\u033b\u00030\u0018\u0000\u0338\u033b"+
		"\u0003^/\u0000\u0339\u033b\u0003Z-\u0000\u033a\u032c\u0001\u0000\u0000"+
		"\u0000\u033a\u032f\u0001\u0000\u0000\u0000\u033a\u0330\u0001\u0000\u0000"+
		"\u0000\u033a\u0331\u0001\u0000\u0000\u0000\u033a\u0332\u0001\u0000\u0000"+
		"\u0000\u033a\u0333\u0001\u0000\u0000\u0000\u033a\u0334\u0001\u0000\u0000"+
		"\u0000\u033a\u0335\u0001\u0000\u0000\u0000\u033a\u0336\u0001\u0000\u0000"+
		"\u0000\u033a\u0337\u0001\u0000\u0000\u0000\u033a\u0338\u0001\u0000\u0000"+
		"\u0000\u033a\u0339\u0001\u0000\u0000\u0000\u033bY\u0001\u0000\u0000\u0000"+
		"\u033c\u033d\u0005D\u0000\u0000\u033d\u033e\u0005\u000f\u0000\u0000\u033e"+
		"\u033f\u00054\u0000\u0000\u033f\u0340\u0005\u0010\u0000\u0000\u0340\u0341"+
		"\u0007\u0004\u0000\u0000\u0341\u0342\u0005U\u0000\u0000\u0342\u0343\u0005"+
		"\u0010\u0000\u0000\u0343\u0344\u0005\u00a7\u0000\u0000\u0344\u0345\u0005"+
		"\u000e\u0000\u0000\u0345[\u0001\u0000\u0000\u0000\u0346\u0347\u0005\u001f"+
		"\u0000\u0000\u0347\u034c\u0005\u000f\u0000\u0000\u0348\u034b\u0003 \u0010"+
		"\u0000\u0349\u034b\u0003X,\u0000\u034a\u0348\u0001\u0000\u0000\u0000\u034a"+
		"\u0349\u0001\u0000\u0000\u0000\u034b\u034e\u0001\u0000\u0000\u0000\u034c"+
		"\u034a\u0001\u0000\u0000\u0000\u034c\u034d\u0001\u0000\u0000\u0000\u034d"+
		"\u034f\u0001\u0000\u0000\u0000\u034e\u034c\u0001\u0000\u0000\u0000\u034f"+
		"\u0350\u0005\u000e\u0000\u0000\u0350]\u0001\u0000\u0000\u0000\u0351\u0352"+
		"\u0005+\u0000\u0000\u0352\u0353\u0005\u000f\u0000\u0000\u0353\u0354\u0005"+
		"2\u0000\u0000\u0354\u0355\u0005\u0010\u0000\u0000\u0355\u035c\u0005\u00a7"+
		"\u0000\u0000\u0356\u0357\u00052\u0000\u0000\u0357\u0358\u0005\u0010\u0000"+
		"\u0000\u0358\u035d\u0005\u00a7\u0000\u0000\u0359\u035a\u00053\u0000\u0000"+
		"\u035a\u035b\u0005\u0010\u0000\u0000\u035b\u035d\u0007\u0001\u0000\u0000"+
		"\u035c\u0356\u0001\u0000\u0000\u0000\u035c\u0359\u0001\u0000\u0000\u0000"+
		"\u035d\u035e\u0001\u0000\u0000\u0000\u035e\u035f\u0005\u000e\u0000\u0000"+
		"\u035f_\u0001\u0000\u0000\u0000\u0360\u0361\u0005@\u0000\u0000\u0361\u0362"+
		"\u0005\u000f\u0000\u0000\u0362\u0363\u0005\u0096\u0000\u0000\u0363\u0364"+
		"\u0005\u0010\u0000\u0000\u0364\u0365\u0007\u0004\u0000\u0000\u0365\u0366"+
		"\u0005B\u0000\u0000\u0366\u0367\u0005\u0010\u0000\u0000\u0367\u0368\u0005"+
		"\b\u0000\u0000\u0368\u0369\u0005\u000e\u0000\u0000\u0369a\u0001\u0000"+
		"\u0000\u0000\u036a\u036b\u0005A\u0000\u0000\u036b\u036c\u0005\u000f\u0000"+
		"\u0000\u036c\u036d\u0005\u0096\u0000\u0000\u036d\u036e\u0005\u0010\u0000"+
		"\u0000\u036e\u036f\u0007\u0004\u0000\u0000\u036f\u0370\u0005B\u0000\u0000"+
		"\u0370\u0371\u0005\u0010\u0000\u0000\u0371\u0372\u0005\b\u0000\u0000\u0372"+
		"\u0373\u0005\u000e\u0000\u0000\u0373c\u0001\u0000\u0000\u0000\u0374\u0375"+
		"\u0005\u00a7\u0000\u0000\u0375\u0379\u0005\u000f\u0000\u0000\u0376\u0378"+
		"\u0003X,\u0000\u0377\u0376\u0001\u0000\u0000\u0000\u0378\u037b\u0001\u0000"+
		"\u0000\u0000\u0379\u0377\u0001\u0000\u0000\u0000\u0379\u037a\u0001\u0000"+
		"\u0000\u0000\u037a\u037c\u0001\u0000\u0000\u0000\u037b\u0379\u0001\u0000"+
		"\u0000\u0000\u037c\u037d\u0005\u000e\u0000\u0000\u037de\u0001\u0000\u0000"+
		"\u0000\u037e\u037f\u0005\'\u0000\u0000\u037f\u0383\u0005\u000f\u0000\u0000"+
		"\u0380\u0382\u0003X,\u0000\u0381\u0380\u0001\u0000\u0000\u0000\u0382\u0385"+
		"\u0001\u0000\u0000\u0000\u0383\u0381\u0001\u0000\u0000\u0000\u0383\u0384"+
		"\u0001\u0000\u0000\u0000\u0384\u0386\u0001\u0000\u0000\u0000\u0385\u0383"+
		"\u0001\u0000\u0000\u0000\u0386\u0387\u0005\u000e\u0000\u0000\u0387g\u0001"+
		"\u0000\u0000\u0000\u0388\u0389\u0005(\u0000\u0000\u0389\u038d\u0005\u000f"+
		"\u0000\u0000\u038a\u038c\u0003X,\u0000\u038b\u038a\u0001\u0000\u0000\u0000"+
		"\u038c\u038f\u0001\u0000\u0000\u0000\u038d\u038b\u0001\u0000\u0000\u0000"+
		"\u038d\u038e\u0001\u0000\u0000\u0000\u038e\u0390\u0001\u0000\u0000\u0000"+
		"\u038f\u038d\u0001\u0000\u0000\u0000\u0390\u0391\u0005\u000e\u0000\u0000"+
		"\u0391i\u0001\u0000\u0000\u0000\u0392\u0393\u0005T\u0000\u0000\u0393\u0394"+
		"\u0005\u0010\u0000\u0000\u0394\u0395\u0007\u0003\u0000\u0000\u0395k\u0001"+
		"\u0000\u0000\u0000\u0396\u0397\u0005&\u0000\u0000\u0397\u0398\u0005\u0010"+
		"\u0000\u0000\u0398\u0399\u0007\u0003\u0000\u0000\u0399m\u0001\u0000\u0000"+
		"\u0000\u039a\u039b\u0005t\u0000\u0000\u039b\u039c\u0005\u0010\u0000\u0000"+
		"\u039c\u039d\u0005\u00a7\u0000\u0000\u039do\u0001\u0000\u0000\u0000\u039e"+
		"\u039f\u0007\n\u0000\u0000\u039f\u03a3\u0005\u000f\u0000\u0000\u03a0\u03a2"+
		"\u0003X,\u0000\u03a1\u03a0\u0001\u0000\u0000\u0000\u03a2\u03a5\u0001\u0000"+
		"\u0000\u0000\u03a3\u03a1\u0001\u0000\u0000\u0000\u03a3\u03a4\u0001\u0000"+
		"\u0000\u0000\u03a4\u03a6\u0001\u0000\u0000\u0000\u03a5\u03a3\u0001\u0000"+
		"\u0000\u0000\u03a6\u03a7\u0005\u000e\u0000\u0000\u03a7q\u0001\u0000\u0000"+
		"\u0000\u03a8\u03a9\u0007\u000b\u0000\u0000\u03a9\u03ad\u0005\u000f\u0000"+
		"\u0000\u03aa\u03ac\u00038\u001c\u0000\u03ab\u03aa\u0001\u0000\u0000\u0000"+
		"\u03ac\u03af\u0001\u0000\u0000\u0000\u03ad\u03ab\u0001\u0000\u0000\u0000"+
		"\u03ad\u03ae\u0001\u0000\u0000\u0000\u03ae\u03b0\u0001\u0000\u0000\u0000"+
		"\u03af\u03ad\u0001\u0000\u0000\u0000\u03b0\u03b1\u0005\u000e\u0000\u0000"+
		"\u03b1s\u0001\u0000\u0000\u0000\u03b2\u03b3\u0007\f\u0000\u0000\u03b3"+
		"\u03b7\u0005\u000f\u0000\u0000\u03b4\u03b6\u0007\b\u0000\u0000\u03b5\u03b4"+
		"\u0001\u0000\u0000\u0000\u03b6\u03b9\u0001\u0000\u0000\u0000\u03b7\u03b5"+
		"\u0001\u0000\u0000\u0000\u03b7\u03b8\u0001\u0000\u0000\u0000\u03b8\u03ba"+
		"\u0001\u0000\u0000\u0000\u03b9\u03b7\u0001\u0000\u0000\u0000\u03ba\u03bb"+
		"\u0005\u000e\u0000\u0000\u03bbu\u0001\u0000\u0000\u0000\u03bc\u03bd\u0005"+
		"\u00a7\u0000\u0000\u03bd\u03c4\u0005\u000f\u0000\u0000\u03be\u03bf\u0005"+
		"c\u0000\u0000\u03bf\u03c0\u0005\u0010\u0000\u0000\u03c0\u03c5\u0005\u00a7"+
		"\u0000\u0000\u03c1\u03c5\u0003r9\u0000\u03c2\u03c5\u0003x<\u0000\u03c3"+
		"\u03c5\u0003t:\u0000\u03c4\u03be\u0001\u0000\u0000\u0000\u03c4\u03c1\u0001"+
		"\u0000\u0000\u0000\u03c4\u03c2\u0001\u0000\u0000\u0000\u03c4\u03c3\u0001"+
		"\u0000\u0000\u0000\u03c5\u03c6\u0001\u0000\u0000\u0000\u03c6\u03c4\u0001"+
		"\u0000\u0000\u0000\u03c6\u03c7\u0001\u0000\u0000\u0000\u03c7\u03c8\u0001"+
		"\u0000\u0000\u0000\u03c8\u03c9\u0005\u000e\u0000\u0000\u03c9w\u0001\u0000"+
		"\u0000\u0000\u03ca\u03cb\u0005\u00a7\u0000\u0000\u03cb\u03d3\u0005\u000f"+
		"\u0000\u0000\u03cc\u03cd\u0005_\u0000\u0000\u03cd\u03ce\u0005\u0010\u0000"+
		"\u0000\u03ce\u03d2\u0005\u0007\u0000\u0000\u03cf\u03d2\u0003r9\u0000\u03d0"+
		"\u03d2\u0003t:\u0000\u03d1\u03cc\u0001\u0000\u0000\u0000\u03d1\u03cf\u0001"+
		"\u0000\u0000\u0000\u03d1\u03d0\u0001\u0000\u0000\u0000\u03d2\u03d5\u0001"+
		"\u0000\u0000\u0000\u03d3\u03d1\u0001\u0000\u0000\u0000\u03d3\u03d4\u0001"+
		"\u0000\u0000\u0000\u03d4\u03d6\u0001\u0000\u0000\u0000\u03d5\u03d3\u0001"+
		"\u0000\u0000\u0000\u03d6\u03d7\u0005\u000e\u0000\u0000\u03d7y\u0001\u0000"+
		"\u0000\u0000\u03d8\u03d9\u0005\u0007\u0000\u0000\u03d9\u03da\u0005\u0010"+
		"\u0000\u0000\u03da\u03db\u0005\t\u0000\u0000\u03db{\u0001\u0000\u0000"+
		"\u0000\u03dc\u03dd\u0005\u0007\u0000\u0000\u03dd\u03f0\u0005\u000f\u0000"+
		"\u0000\u03de\u03df\u0007\r\u0000\u0000\u03df\u03e1\u0005\u000f\u0000\u0000"+
		"\u03e0\u03e2\u0005\b\u0000\u0000\u03e1\u03e0\u0001\u0000\u0000\u0000\u03e2"+
		"\u03e3\u0001\u0000\u0000\u0000\u03e3\u03e1\u0001\u0000\u0000\u0000\u03e3"+
		"\u03e4\u0001\u0000\u0000\u0000\u03e4\u03e6\u0001\u0000\u0000\u0000\u03e5"+
		"\u03e7\u0005\b\u0000\u0000\u03e6\u03e5\u0001\u0000\u0000\u0000\u03e7\u03e8"+
		"\u0001\u0000\u0000\u0000\u03e8\u03e6\u0001\u0000\u0000\u0000\u03e8\u03e9"+
		"\u0001\u0000\u0000\u0000\u03e9\u03eb\u0001\u0000\u0000\u0000\u03ea\u03ec"+
		"\u0005\b\u0000\u0000\u03eb\u03ea\u0001\u0000\u0000\u0000\u03ec\u03ed\u0001"+
		"\u0000\u0000\u0000\u03ed\u03eb\u0001\u0000\u0000\u0000\u03ed\u03ee\u0001"+
		"\u0000\u0000\u0000\u03ee\u03ef\u0001\u0000\u0000\u0000\u03ef\u03f1\u0005"+
		"\u000e\u0000\u0000\u03f0\u03de\u0001\u0000\u0000\u0000\u03f1\u03f2\u0001"+
		"\u0000\u0000\u0000\u03f2\u03f0\u0001\u0000\u0000\u0000\u03f2\u03f3\u0001"+
		"\u0000\u0000\u0000\u03f3\u03f4\u0001\u0000\u0000\u0000\u03f4\u03f5\u0005"+
		"\u000e\u0000\u0000\u03f5}\u0001\u0000\u0000\u0000\u03f6\u03f7\u0007\u000e"+
		"\u0000\u0000\u03f7\u03fb\u0005\u000f\u0000\u0000\u03f8\u03fa\u0007\b\u0000"+
		"\u0000\u03f9\u03f8\u0001\u0000\u0000\u0000\u03fa\u03fd\u0001\u0000\u0000"+
		"\u0000\u03fb\u03f9\u0001\u0000\u0000\u0000\u03fb\u03fc\u0001\u0000\u0000"+
		"\u0000\u03fc\u03fe\u0001\u0000\u0000\u0000\u03fd\u03fb\u0001\u0000\u0000"+
		"\u0000\u03fe\u03ff\u0005\u000e\u0000\u0000\u03ff\u007f\u0001\u0000\u0000"+
		"\u0000\u0400\u0401\u0005g\u0000\u0000\u0401\u0407\u0005\u000f\u0000\u0000"+
		"\u0402\u0403\u0005\t\u0000\u0000\u0403\u0404\u0005\u0010\u0000\u0000\u0404"+
		"\u0406\u0005\b\u0000\u0000\u0405\u0402\u0001\u0000\u0000\u0000\u0406\u0409"+
		"\u0001\u0000\u0000\u0000\u0407\u0405\u0001\u0000\u0000\u0000\u0407\u0408"+
		"\u0001\u0000\u0000\u0000\u0408\u040a\u0001\u0000\u0000\u0000\u0409\u0407"+
		"\u0001\u0000\u0000\u0000\u040a\u040b\u0005\u000e\u0000\u0000\u040b\u0081"+
		"\u0001\u0000\u0000\u0000\u040c\u040d\u0005c\u0000\u0000\u040d\u040e\u0005"+
		"\u0010\u0000\u0000\u040e\u0425\u0005\u00a7\u0000\u0000\u040f\u0425\u0003"+
		"\u0016\u000b\u0000\u0410\u0425\u0003~?\u0000\u0411\u0425\u0003\u0080@"+
		"\u0000\u0412\u0413\u0005d\u0000\u0000\u0413\u0415\u0005\u000f\u0000\u0000"+
		"\u0414\u0416\u0005\b\u0000\u0000\u0415\u0414\u0001\u0000\u0000\u0000\u0416"+
		"\u0417\u0001\u0000\u0000\u0000\u0417\u0415\u0001\u0000\u0000\u0000\u0417"+
		"\u0418\u0001\u0000\u0000\u0000\u0418\u041a\u0001\u0000\u0000\u0000\u0419"+
		"\u041b\u0005\b\u0000\u0000\u041a\u0419\u0001\u0000\u0000\u0000\u041b\u041c"+
		"\u0001\u0000\u0000\u0000\u041c\u041a\u0001\u0000\u0000\u0000\u041c\u041d"+
		"\u0001\u0000\u0000\u0000\u041d\u041f\u0001\u0000\u0000\u0000\u041e\u0420"+
		"\u0005\b\u0000\u0000\u041f\u041e\u0001\u0000\u0000\u0000\u0420\u0421\u0001"+
		"\u0000\u0000\u0000\u0421\u041f\u0001\u0000\u0000\u0000\u0421\u0422\u0001"+
		"\u0000\u0000\u0000\u0422\u0423\u0001\u0000\u0000\u0000\u0423\u0425\u0005"+
		"\u000e\u0000\u0000\u0424\u040c\u0001\u0000\u0000\u0000\u0424\u040f\u0001"+
		"\u0000\u0000\u0000\u0424\u0410\u0001\u0000\u0000\u0000\u0424\u0411\u0001"+
		"\u0000\u0000\u0000\u0424\u0412\u0001\u0000\u0000\u0000\u0425\u0426\u0001"+
		"\u0000\u0000\u0000\u0426\u0424\u0001\u0000\u0000\u0000\u0426\u0427\u0001"+
		"\u0000\u0000\u0000\u0427\u0083\u0001\u0000\u0000\u0000\u0428\u0429\u0005"+
		"p\u0000\u0000\u0429\u042d\u0005\u000f\u0000\u0000\u042a\u042b\u0005\u00a7"+
		"\u0000\u0000\u042b\u042c\u0005\u0010\u0000\u0000\u042c\u042e\u0005\b\u0000"+
		"\u0000\u042d\u042a\u0001\u0000\u0000\u0000\u042e\u042f\u0001\u0000\u0000"+
		"\u0000\u042f\u042d\u0001\u0000\u0000\u0000\u042f\u0430\u0001\u0000\u0000"+
		"\u0000\u0430\u0431\u0001\u0000\u0000\u0000\u0431\u0432\u0005\u000e\u0000"+
		"\u0000\u0432\u0085\u0001\u0000\u0000\u0000\u0433\u0434\u0005q\u0000\u0000"+
		"\u0434\u0438\u0005\u000f\u0000\u0000\u0435\u0436\u0005\u00a7\u0000\u0000"+
		"\u0436\u0437\u0005\u0010\u0000\u0000\u0437\u0439\u0005\b\u0000\u0000\u0438"+
		"\u0435\u0001\u0000\u0000\u0000\u0439\u043a\u0001\u0000\u0000\u0000\u043a"+
		"\u0438\u0001\u0000\u0000\u0000\u043a\u043b\u0001\u0000\u0000\u0000\u043b"+
		"\u043c\u0001\u0000\u0000\u0000\u043c\u043d\u0005\u000e\u0000\u0000\u043d"+
		"\u0087\u0001\u0000\u0000\u0000\u043e\u043f\u0005r\u0000\u0000\u043f\u0443"+
		"\u0005\u000f\u0000\u0000\u0440\u0441\u0005\u00a7\u0000\u0000\u0441\u0442"+
		"\u0005\u0010\u0000\u0000\u0442\u0444\u0005\b\u0000\u0000\u0443\u0440\u0001"+
		"\u0000\u0000\u0000\u0444\u0445\u0001\u0000\u0000\u0000\u0445\u0443\u0001"+
		"\u0000\u0000\u0000\u0445\u0446\u0001\u0000\u0000\u0000\u0446\u0447\u0001"+
		"\u0000\u0000\u0000\u0447\u0448\u0005\u000e\u0000\u0000\u0448\u0089\u0001"+
		"\u0000\u0000\u0000\u0449\u044a\u0005l\u0000\u0000\u044a\u044b\u0005\u0010"+
		"\u0000\u0000\u044b\u0456\u0005\b\u0000\u0000\u044c\u044d\u0005m\u0000"+
		"\u0000\u044d\u044e\u0005\u0010\u0000\u0000\u044e\u0456\u0005\b\u0000\u0000"+
		"\u044f\u0450\u0005n\u0000\u0000\u0450\u0451\u0005\u0010\u0000\u0000\u0451"+
		"\u0456\u0005\b\u0000\u0000\u0452\u0453\u0005o\u0000\u0000\u0453\u0454"+
		"\u0005\u0010\u0000\u0000\u0454\u0456\u0005\b\u0000\u0000\u0455\u0449\u0001"+
		"\u0000\u0000\u0000\u0455\u044c\u0001\u0000\u0000\u0000\u0455\u044f\u0001"+
		"\u0000\u0000\u0000\u0455\u0452\u0001\u0000\u0000\u0000\u0456\u008b\u0001"+
		"\u0000\u0000\u0000\u0457\u045c\u0003\u0018\f\u0000\u0458\u045c\u0003\u0084"+
		"B\u0000\u0459\u045c\u0003\u0086C\u0000\u045a\u045c\u0003\u0088D\u0000"+
		"\u045b\u0457\u0001\u0000\u0000\u0000\u045b\u0458\u0001\u0000\u0000\u0000"+
		"\u045b\u0459\u0001\u0000\u0000\u0000\u045b\u045a\u0001\u0000\u0000\u0000"+
		"\u045c\u008d\u0001\u0000\u0000\u0000\u045d\u045e\u0005\u00a7\u0000\u0000"+
		"\u045e\u0467\u0005\u000f\u0000\u0000\u045f\u0468\u0003\u0016\u000b\u0000"+
		"\u0460\u0462\u0003\u008aE\u0000\u0461\u0460\u0001\u0000\u0000\u0000\u0462"+
		"\u0463\u0001\u0000\u0000\u0000\u0463\u0461\u0001\u0000\u0000\u0000\u0463"+
		"\u0464\u0001\u0000\u0000\u0000\u0464\u0468\u0001\u0000\u0000\u0000\u0465"+
		"\u0468\u0003\u008cF\u0000\u0466\u0468\u0003\u0014\n\u0000\u0467\u045f"+
		"\u0001\u0000\u0000\u0000\u0467\u0461\u0001\u0000\u0000\u0000\u0467\u0465"+
		"\u0001\u0000\u0000\u0000\u0467\u0466\u0001\u0000\u0000\u0000\u0468\u0469"+
		"\u0001\u0000\u0000\u0000\u0469\u0467\u0001\u0000\u0000\u0000\u0469\u046a"+
		"\u0001\u0000\u0000\u0000\u046a\u046b\u0001\u0000\u0000\u0000\u046b\u046c"+
		"\u0005\u000e\u0000\u0000\u046c\u008f\u0001\u0000\u0000\u0000\u046d\u046e"+
		"\u0005I\u0000\u0000\u046e\u046f\u0005\u0010\u0000\u0000\u046f\u0470\u0007"+
		"\u000f\u0000\u0000\u0470\u0091\u0001\u0000\u0000\u0000\u0471\u0472\u0005"+
		"J\u0000\u0000\u0472\u0473\u0005\u0010\u0000\u0000\u0473\u0474\u0007\u000f"+
		"\u0000\u0000\u0474\u0093\u0001\u0000\u0000\u0000\u0475\u0476\u0005L\u0000"+
		"\u0000\u0476\u047a\u0005\u000f\u0000\u0000\u0477\u0479\u0003\u0090H\u0000"+
		"\u0478\u0477\u0001\u0000\u0000\u0000\u0479\u047c\u0001\u0000\u0000\u0000"+
		"\u047a\u0478\u0001\u0000\u0000\u0000\u047a\u047b\u0001\u0000\u0000\u0000"+
		"\u047b\u0480\u0001\u0000\u0000\u0000\u047c\u047a\u0001\u0000\u0000\u0000"+
		"\u047d\u047f\u0003X,\u0000\u047e\u047d\u0001\u0000\u0000\u0000\u047f\u0482"+
		"\u0001\u0000\u0000\u0000\u0480\u047e\u0001\u0000\u0000\u0000\u0480\u0481"+
		"\u0001\u0000\u0000\u0000\u0481\u0483\u0001\u0000\u0000\u0000\u0482\u0480"+
		"\u0001\u0000\u0000\u0000\u0483\u0484\u0005\u000e\u0000\u0000\u0484\u0095"+
		"\u0001\u0000\u0000\u0000\u0485\u0486\u0005K\u0000\u0000\u0486\u0487\u0005"+
		"\u0010\u0000\u0000\u0487\u0488\u0007\u0010\u0000\u0000\u0488\u0097\u0001"+
		"\u0000\u0000\u0000\u0489\u048a\u0005\u00a7\u0000\u0000\u048a\u048d\u0005"+
		"\u000f\u0000\u0000\u048b\u048e\u0003\u0014\n\u0000\u048c\u048e\u0003n"+
		"7\u0000\u048d\u048b\u0001\u0000\u0000\u0000\u048d\u048c\u0001\u0000\u0000"+
		"\u0000\u048e\u048f\u0001\u0000\u0000\u0000\u048f\u048d\u0001\u0000\u0000"+
		"\u0000\u048f\u0490\u0001\u0000\u0000\u0000\u0490\u0491\u0001\u0000\u0000"+
		"\u0000\u0491\u0492\u0005\u000e\u0000\u0000\u0492\u0099\u0001\u0000\u0000"+
		"\u0000\u0493\u0494\u0005u\u0000\u0000\u0494\u0495\u0005\u0010\u0000\u0000"+
		"\u0495\u0496\u0007\u0003\u0000\u0000\u0496\u009b\u0001\u0000\u0000\u0000"+
		"\u0497\u0498\u0005v\u0000\u0000\u0498\u0499\u0005\u0010\u0000\u0000\u0499"+
		"\u049a\u0005\t\u0000\u0000\u049a\u009d\u0001\u0000\u0000\u0000\u049b\u049c"+
		"\u0005\u00a7\u0000\u0000\u049c\u04a7\u0005\u000f\u0000\u0000\u049d\u04a6"+
		"\u0003\u009aM\u0000\u049e\u04a6\u0003\u0006\u0003\u0000\u049f\u04a6\u0003"+
		"\u009cN\u0000\u04a0\u04a6\u0003\u0100\u0080\u0000\u04a1\u04a6\u0003\u00d4"+
		"j\u0000\u04a2\u04a6\u0003\n\u0005\u0000\u04a3\u04a6\u0003\f\u0006\u0000"+
		"\u04a4\u04a6\u0003\b\u0004\u0000\u04a5\u049d\u0001\u0000\u0000\u0000\u04a5"+
		"\u049e\u0001\u0000\u0000\u0000\u04a5\u049f\u0001\u0000\u0000\u0000\u04a5"+
		"\u04a0\u0001\u0000\u0000\u0000\u04a5\u04a1\u0001\u0000\u0000\u0000\u04a5"+
		"\u04a2\u0001\u0000\u0000\u0000\u04a5\u04a3\u0001\u0000\u0000\u0000\u04a5"+
		"\u04a4\u0001\u0000\u0000\u0000\u04a6\u04a9\u0001\u0000\u0000\u0000\u04a7"+
		"\u04a5\u0001\u0000\u0000\u0000\u04a7\u04a8\u0001\u0000\u0000\u0000\u04a8"+
		"\u04ab\u0001\u0000\u0000\u0000\u04a9\u04a7\u0001\u0000\u0000\u0000\u04aa"+
		"\u04ac\u0003\u0010\b\u0000\u04ab\u04aa\u0001\u0000\u0000\u0000\u04ab\u04ac"+
		"\u0001\u0000\u0000\u0000\u04ac\u04ad\u0001\u0000\u0000\u0000\u04ad\u04ae"+
		"\u0005\u000e\u0000\u0000\u04ae\u009f\u0001\u0000\u0000\u0000\u04af\u04b0"+
		"\u0005x\u0000\u0000\u04b0\u04b1\u0005\u0010\u0000\u0000\u04b1\u04b2\u0005"+
		"\b\u0000\u0000\u04b2\u00a1\u0001\u0000\u0000\u0000\u04b3\u04b4\u0005y"+
		"\u0000\u0000\u04b4\u04b5\u0005\u0010\u0000\u0000\u04b5\u04b6\u0005\b\u0000"+
		"\u0000\u04b6\u00a3\u0001\u0000\u0000\u0000\u04b7\u04b8\u0005|\u0000\u0000"+
		"\u04b8\u04b9\u0005\u0010\u0000\u0000\u04b9\u04ba\u0007\u0011\u0000\u0000"+
		"\u04ba\u00a5\u0001\u0000\u0000\u0000\u04bb\u04bf\u0003\u00a2Q\u0000\u04bc"+
		"\u04bf\u0003\u00d4j\u0000\u04bd\u04bf\u0003\u00a4R\u0000\u04be\u04bb\u0001"+
		"\u0000\u0000\u0000\u04be\u04bc\u0001\u0000\u0000\u0000\u04be\u04bd\u0001"+
		"\u0000\u0000\u0000\u04bf\u00a7\u0001\u0000\u0000\u0000\u04c0\u04c1\u0005"+
		"}\u0000\u0000\u04c1\u04c5\u0005\u000f\u0000\u0000\u04c2\u04c4\u00038\u001c"+
		"\u0000\u04c3\u04c2\u0001\u0000\u0000\u0000\u04c4\u04c7\u0001\u0000\u0000"+
		"\u0000\u04c5\u04c3\u0001\u0000\u0000\u0000\u04c5\u04c6\u0001\u0000\u0000"+
		"\u0000\u04c6\u04c8\u0001\u0000\u0000\u0000\u04c7\u04c5\u0001\u0000\u0000"+
		"\u0000\u04c8\u04c9\u0005\u000e\u0000\u0000\u04c9\u00a9\u0001\u0000\u0000"+
		"\u0000\u04ca\u04cb\u0005\u007f\u0000\u0000\u04cb\u04cf\u0005\u000f\u0000"+
		"\u0000\u04cc\u04ce\u00038\u001c\u0000\u04cd\u04cc\u0001\u0000\u0000\u0000"+
		"\u04ce\u04d1\u0001\u0000\u0000\u0000\u04cf\u04cd\u0001\u0000\u0000\u0000"+
		"\u04cf\u04d0\u0001\u0000\u0000\u0000\u04d0\u04d2\u0001\u0000\u0000\u0000"+
		"\u04d1\u04cf\u0001\u0000\u0000\u0000\u04d2\u04d3\u0005\u000e\u0000\u0000"+
		"\u04d3\u00ab\u0001\u0000\u0000\u0000\u04d4\u04d5\u0005~\u0000\u0000\u04d5"+
		"\u04d9\u0005\u000f\u0000\u0000\u04d6\u04d8\u00038\u001c\u0000\u04d7\u04d6"+
		"\u0001\u0000\u0000\u0000\u04d8\u04db\u0001\u0000\u0000\u0000\u04d9\u04d7"+
		"\u0001\u0000\u0000\u0000\u04d9\u04da\u0001\u0000\u0000\u0000\u04da\u04dc"+
		"\u0001\u0000\u0000\u0000\u04db\u04d9\u0001\u0000\u0000\u0000\u04dc\u04dd"+
		"\u0005\u000e\u0000\u0000\u04dd\u00ad\u0001\u0000\u0000\u0000\u04de\u04df"+
		"\u0005\u00a7\u0000\u0000\u04df\u04e0\u0005\u000f\u0000\u0000\u04e0\u04e2"+
		"\u0003\u00a0P\u0000\u04e1\u04e3\u0003\u00a6S\u0000\u04e2\u04e1\u0001\u0000"+
		"\u0000\u0000\u04e3\u04e4\u0001\u0000\u0000\u0000\u04e4\u04e2\u0001\u0000"+
		"\u0000\u0000\u04e4\u04e5\u0001\u0000\u0000\u0000\u04e5\u04e7\u0001\u0000"+
		"\u0000\u0000\u04e6\u04e8\u0003\u00a8T\u0000\u04e7\u04e6\u0001\u0000\u0000"+
		"\u0000\u04e7\u04e8\u0001\u0000\u0000\u0000\u04e8\u04ea\u0001\u0000\u0000"+
		"\u0000\u04e9\u04eb\u0003\u00acV\u0000\u04ea\u04e9\u0001\u0000\u0000\u0000"+
		"\u04ea\u04eb\u0001\u0000\u0000\u0000\u04eb\u04ed\u0001\u0000\u0000\u0000"+
		"\u04ec\u04ee\u0003\u00aaU\u0000\u04ed\u04ec\u0001\u0000\u0000\u0000\u04ed"+
		"\u04ee\u0001\u0000\u0000\u0000\u04ee\u04ef\u0001\u0000\u0000\u0000\u04ef"+
		"\u04f0\u0005\u000e\u0000\u0000\u04f0\u00af\u0001\u0000\u0000\u0000\u04f1"+
		"\u04f2\u0005\u0089\u0000\u0000\u04f2\u04f3\u0005\u0010\u0000\u0000\u04f3"+
		"\u04f4\u0007\u0003\u0000\u0000\u04f4\u00b1\u0001\u0000\u0000\u0000\u04f5"+
		"\u04f6\u0005\u0088\u0000\u0000\u04f6\u04f7\u0005\u0010\u0000\u0000\u04f7"+
		"\u04f8\u0007\u0003\u0000\u0000\u04f8\u00b3\u0001\u0000\u0000\u0000\u04f9"+
		"\u04fa\u0005[\u0000\u0000\u04fa\u04fb\u0005\u0010\u0000\u0000\u04fb\u04fc"+
		"\u0005\b\u0000\u0000\u04fc\u00b5\u0001\u0000\u0000\u0000\u04fd\u04fe\u0005"+
		"\u0087\u0000\u0000\u04fe\u04ff\u0005\u0010\u0000\u0000\u04ff\u0500\u0007"+
		"\u0003\u0000\u0000\u0500\u00b7\u0001\u0000\u0000\u0000\u0501\u0502\u0005"+
		"\u0086\u0000\u0000\u0502\u0503\u0005\u0010\u0000\u0000\u0503\u0504\u0007"+
		"\u0003\u0000\u0000\u0504\u00b9\u0001\u0000\u0000\u0000\u0505\u0506\u0005"+
		"\u0085\u0000\u0000\u0506\u0507\u0005\u0010\u0000\u0000\u0507\u0508\u0007"+
		"\u0003\u0000\u0000\u0508\u00bb\u0001\u0000\u0000\u0000\u0509\u050a\u0005"+
		"\u0084\u0000\u0000\u050a\u050b\u0005\u0010\u0000\u0000\u050b\u050c\u0007"+
		"\u0003\u0000\u0000\u050c\u00bd\u0001\u0000\u0000\u0000\u050d\u050e\u0005"+
		"\u0083\u0000\u0000\u050e\u050f\u0005\u0010\u0000\u0000\u050f\u0510\u0007"+
		"\u0003\u0000\u0000\u0510\u00bf\u0001\u0000\u0000\u0000\u0511\u0512\u0005"+
		"\u0082\u0000\u0000\u0512\u0516\u0005\u000f\u0000\u0000\u0513\u0515\u0005"+
		"\u00a7\u0000\u0000\u0514\u0513\u0001\u0000\u0000\u0000\u0515\u0518\u0001"+
		"\u0000\u0000\u0000\u0516\u0514\u0001\u0000\u0000\u0000\u0516\u0517\u0001"+
		"\u0000\u0000\u0000\u0517\u0519\u0001\u0000\u0000\u0000\u0518\u0516\u0001"+
		"\u0000\u0000\u0000\u0519\u051a\u0005\u000e\u0000\u0000\u051a\u00c1\u0001"+
		"\u0000\u0000\u0000\u051b\u051c\u0005\u0081\u0000\u0000\u051c\u051d\u0005"+
		"\u0010\u0000\u0000\u051d\u051e\u0007\u0003\u0000\u0000\u051e\u00c3\u0001"+
		"\u0000\u0000\u0000\u051f\u0520\u0005\u0080\u0000\u0000\u0520\u0521\u0005"+
		"\u0010\u0000\u0000\u0521\u0522\u0005\u00a7\u0000\u0000\u0522\u00c5\u0001"+
		"\u0000\u0000\u0000\u0523\u0524\u0005)\u0000\u0000\u0524\u0525\u0005\u0010"+
		"\u0000\u0000\u0525\u0526\u0007\u0003\u0000\u0000\u0526\u00c7\u0001\u0000"+
		"\u0000\u0000\u0527\u0531\u0003\u00b2Y\u0000\u0528\u0531\u0003\u00c0`\u0000"+
		"\u0529\u0531\u0003\u00be_\u0000\u052a\u0531\u0003l6\u0000\u052b\u0531"+
		"\u0003(\u0014\u0000\u052c\u0531\u0003\u00c6c\u0000\u052d\u0531\u0003\u00c4"+
		"b\u0000\u052e\u0531\u0003f3\u0000\u052f\u0531\u0003h4\u0000\u0530\u0527"+
		"\u0001\u0000\u0000\u0000\u0530\u0528\u0001\u0000\u0000\u0000\u0530\u0529"+
		"\u0001\u0000\u0000\u0000\u0530\u052a\u0001\u0000\u0000\u0000\u0530\u052b"+
		"\u0001\u0000\u0000\u0000\u0530\u052c\u0001\u0000\u0000\u0000\u0530\u052d"+
		"\u0001\u0000\u0000\u0000\u0530\u052e\u0001\u0000\u0000\u0000\u0530\u052f"+
		"\u0001\u0000\u0000\u0000\u0531\u00c9\u0001\u0000\u0000\u0000\u0532\u0533"+
		"\u0005\u00a7\u0000\u0000\u0533\u0535\u0005\u000f\u0000\u0000\u0534\u0536"+
		"\u0003\u00b0X\u0000\u0535\u0534\u0001\u0000\u0000\u0000\u0535\u0536\u0001"+
		"\u0000\u0000\u0000\u0536\u0538\u0001\u0000\u0000\u0000\u0537\u0539\u0003"+
		"\u00b6[\u0000\u0538\u0537\u0001\u0000\u0000\u0000\u0538\u0539\u0001\u0000"+
		"\u0000\u0000\u0539\u053b\u0001\u0000\u0000\u0000\u053a\u053c\u0003\u00b4"+
		"Z\u0000\u053b\u053a\u0001\u0000\u0000\u0000\u053b\u053c\u0001\u0000\u0000"+
		"\u0000\u053c\u053e\u0001\u0000\u0000\u0000\u053d\u053f\u0003\u00c2a\u0000"+
		"\u053e\u053d\u0001\u0000\u0000\u0000\u053e\u053f\u0001\u0000\u0000\u0000"+
		"\u053f\u0541\u0001\u0000\u0000\u0000\u0540\u0542\u0003\u00bc^\u0000\u0541"+
		"\u0540\u0001\u0000\u0000\u0000\u0541\u0542\u0001\u0000\u0000\u0000\u0542"+
		"\u0544\u0001\u0000\u0000\u0000\u0543\u0545\u0003\u00ba]\u0000\u0544\u0543"+
		"\u0001\u0000\u0000\u0000\u0544\u0545\u0001\u0000\u0000\u0000\u0545\u0547"+
		"\u0001\u0000\u0000\u0000\u0546\u0548\u0003\u00b8\\\u0000\u0547\u0546\u0001"+
		"\u0000\u0000\u0000\u0547\u0548\u0001\u0000\u0000\u0000\u0548\u054c\u0001"+
		"\u0000\u0000\u0000\u0549\u054b\u0003\u00c8d\u0000\u054a\u0549\u0001\u0000"+
		"\u0000\u0000\u054b\u054e\u0001\u0000\u0000\u0000\u054c\u054a\u0001\u0000"+
		"\u0000\u0000\u054c\u054d\u0001\u0000\u0000\u0000\u054d\u054f\u0001\u0000"+
		"\u0000\u0000\u054e\u054c\u0001\u0000\u0000\u0000\u054f\u0550\u0005\u000e"+
		"\u0000\u0000\u0550\u00cb\u0001\u0000\u0000\u0000\u0551\u0552\u0007\u0012"+
		"\u0000\u0000\u0552\u0556\u0005\u000f\u0000\u0000\u0553\u0555\u0003X,\u0000"+
		"\u0554\u0553\u0001\u0000\u0000\u0000\u0555\u0558\u0001\u0000\u0000\u0000"+
		"\u0556\u0554\u0001\u0000\u0000\u0000\u0556\u0557\u0001\u0000\u0000\u0000"+
		"\u0557\u0559\u0001\u0000\u0000\u0000\u0558\u0556\u0001\u0000\u0000\u0000"+
		"\u0559\u055a\u0005\u000e\u0000\u0000\u055a\u00cd\u0001\u0000\u0000\u0000"+
		"\u055b\u055c\u0007\u0013\u0000\u0000\u055c\u0560\u0005\u000f\u0000\u0000"+
		"\u055d\u055f\u0003<\u001e\u0000\u055e\u055d\u0001\u0000\u0000\u0000\u055f"+
		"\u0562\u0001\u0000\u0000\u0000\u0560\u055e\u0001\u0000\u0000\u0000\u0560"+
		"\u0561\u0001\u0000\u0000\u0000\u0561\u0563\u0001\u0000\u0000\u0000\u0562"+
		"\u0560\u0001\u0000\u0000\u0000\u0563\u0564\u0005\u000e\u0000\u0000\u0564"+
		"\u00cf\u0001\u0000\u0000\u0000\u0565\u0566\u0007\u0014\u0000\u0000\u0566"+
		"\u0568\u0005\u000f\u0000\u0000\u0567\u0569\u0005\u00a7\u0000\u0000\u0568"+
		"\u0567\u0001\u0000\u0000\u0000\u0569\u056a\u0001\u0000\u0000\u0000\u056a"+
		"\u0568\u0001\u0000\u0000\u0000\u056a\u056b\u0001\u0000\u0000\u0000\u056b"+
		"\u056c\u0001\u0000\u0000\u0000\u056c\u056d\u0005\u000e\u0000\u0000\u056d"+
		"\u00d1\u0001\u0000\u0000\u0000\u056e\u056f\u0005\u0090\u0000\u0000\u056f"+
		"\u0570\u0005\u0010\u0000\u0000\u0570\u0571\u0003\u001e\u000f\u0000\u0571"+
		"\u00d3\u0001\u0000\u0000\u0000\u0572\u0573\u0005$\u0000\u0000\u0573\u0574"+
		"\u0005\u0010\u0000\u0000\u0574\u0575\u0005\b\u0000\u0000\u0575\u00d5\u0001"+
		"\u0000\u0000\u0000\u0576\u0577\u0005%\u0000\u0000\u0577\u0578\u0005\u0010"+
		"\u0000\u0000\u0578\u0579\u0005\b\u0000\u0000\u0579\u00d7\u0001\u0000\u0000"+
		"\u0000\u057a\u057b\u0005\u008c\u0000\u0000\u057b\u057c\u0005\u0010\u0000"+
		"\u0000\u057c\u057d\u0007\u0003\u0000\u0000\u057d\u00d9\u0001\u0000\u0000"+
		"\u0000\u057e\u057f\u0005\u0091\u0000\u0000\u057f\u0580\u0005\u0010\u0000"+
		"\u0000\u0580\u0581\u0007\u0003\u0000\u0000\u0581\u00db\u0001\u0000\u0000"+
		"\u0000\u0582\u058a\u0003\u00d4j\u0000\u0583\u058a\u0003\u00d6k\u0000\u0584"+
		"\u058a\u0003\u00d8l\u0000\u0585\u058a\u0003\u00dam\u0000\u0586\u058a\u0003"+
		"\u00e2q\u0000\u0587\u058a\u0003\u00deo\u0000\u0588\u058a\u0003\u00e0p"+
		"\u0000\u0589\u0582\u0001\u0000\u0000\u0000\u0589\u0583\u0001\u0000\u0000"+
		"\u0000\u0589\u0584\u0001\u0000\u0000\u0000\u0589\u0585\u0001\u0000\u0000"+
		"\u0000\u0589\u0586\u0001\u0000\u0000\u0000\u0589\u0587\u0001\u0000\u0000"+
		"\u0000\u0589\u0588\u0001\u0000\u0000\u0000\u058a\u00dd\u0001\u0000\u0000"+
		"\u0000\u058b\u058c\u0005\u008a\u0000\u0000\u058c\u058d\u0005\u0010\u0000"+
		"\u0000\u058d\u058e\u0007\u0003\u0000\u0000\u058e\u00df\u0001\u0000\u0000"+
		"\u0000\u058f\u0590\u0005\u008d\u0000\u0000\u0590\u0591\u0005\u0010\u0000"+
		"\u0000\u0591\u0592\u0005\u00a7\u0000\u0000\u0592\u00e1\u0001\u0000\u0000"+
		"\u0000\u0593\u0594\u0005\u008b\u0000\u0000\u0594\u0595\u0005\u0010\u0000"+
		"\u0000\u0595\u0596\u0007\u0003\u0000\u0000\u0596\u00e3\u0001\u0000\u0000"+
		"\u0000\u0597\u0598\u0005\u00a7\u0000\u0000\u0598\u05a2\u0005\u000f\u0000"+
		"\u0000\u0599\u05a1\u0003\u00d0h\u0000\u059a\u05a1\u0003\u00dcn\u0000\u059b"+
		"\u05a1\u0003\u00ceg\u0000\u059c\u05a1\u0003\u00ccf\u0000\u059d\u05a1\u0003"+
		"\u00d2i\u0000\u059e\u05a1\u0003\f\u0006\u0000\u059f\u05a1\u0003\u0010"+
		"\b\u0000\u05a0\u0599\u0001\u0000\u0000\u0000\u05a0\u059a\u0001\u0000\u0000"+
		"\u0000\u05a0\u059b\u0001\u0000\u0000\u0000\u05a0\u059c\u0001\u0000\u0000"+
		"\u0000\u05a0\u059d\u0001\u0000\u0000\u0000\u05a0\u059e\u0001\u0000\u0000"+
		"\u0000\u05a0\u059f\u0001\u0000\u0000\u0000\u05a1\u05a4\u0001\u0000\u0000"+
		"\u0000\u05a2\u05a0\u0001\u0000\u0000\u0000\u05a2\u05a3\u0001\u0000\u0000"+
		"\u0000\u05a3\u05a5\u0001\u0000\u0000\u0000\u05a4\u05a2\u0001\u0000\u0000"+
		"\u0000\u05a5\u05a6\u0005\u000e\u0000\u0000\u05a6\u00e5\u0001\u0000\u0000"+
		"\u0000\u05a7\u05a8\u0005\u0092\u0000\u0000\u05a8\u05a9\u0005\u000f\u0000"+
		"\u0000\u05a9\u05aa\u0003\"\u0011\u0000\u05aa\u05ab\u0003\u0096K\u0000"+
		"\u05ab\u05b1\u0003$\u0012\u0000\u05ac\u05ad\u0005\u0094\u0000\u0000\u05ad"+
		"\u05ae\u0005\u0010\u0000\u0000\u05ae\u05b0\u0005\b\u0000\u0000\u05af\u05ac"+
		"\u0001\u0000\u0000\u0000\u05b0\u05b3\u0001\u0000\u0000\u0000\u05b1\u05af"+
		"\u0001\u0000\u0000\u0000\u05b1\u05b2\u0001\u0000\u0000\u0000\u05b2\u05b4"+
		"\u0001\u0000\u0000\u0000\u05b3\u05b1\u0001\u0000\u0000\u0000\u05b4\u05b5"+
		"\u0005\u0093\u0000\u0000\u05b5\u05b9\u0005\u0010\u0000\u0000\u05b6\u05b8"+
		"\u0007\u0003\u0000\u0000\u05b7\u05b6\u0001\u0000\u0000\u0000\u05b8\u05bb"+
		"\u0001\u0000\u0000\u0000\u05b9\u05b7\u0001\u0000\u0000\u0000\u05b9\u05ba"+
		"\u0001\u0000\u0000\u0000\u05ba\u05c1\u0001\u0000\u0000\u0000\u05bb\u05b9"+
		"\u0001\u0000\u0000\u0000\u05bc\u05bd\u0005\u0096\u0000\u0000\u05bd\u05be"+
		"\u0005\u0010\u0000\u0000\u05be\u05c0\u0005\u0007\u0000\u0000\u05bf\u05bc"+
		"\u0001\u0000\u0000\u0000\u05c0\u05c3\u0001\u0000\u0000\u0000\u05c1\u05bf"+
		"\u0001\u0000\u0000\u0000\u05c1\u05c2\u0001\u0000\u0000\u0000\u05c2\u05c9"+
		"\u0001\u0000\u0000\u0000\u05c3\u05c1\u0001\u0000\u0000\u0000\u05c4\u05c5"+
		"\u0005\u0095\u0000\u0000\u05c5\u05c6\u0005\u0010\u0000\u0000\u05c6\u05c8"+
		"\u0005\u0007\u0000\u0000\u05c7\u05c4\u0001\u0000\u0000\u0000\u05c8\u05cb"+
		"\u0001\u0000\u0000\u0000\u05c9\u05c7\u0001\u0000\u0000\u0000\u05c9\u05ca"+
		"\u0001\u0000\u0000\u0000\u05ca\u05cc\u0001\u0000\u0000\u0000\u05cb\u05c9"+
		"\u0001\u0000\u0000\u0000\u05cc\u05cd\u0005\u000e\u0000\u0000\u05cd\u00e7"+
		"\u0001\u0000\u0000\u0000\u05ce\u05cf\u0005\u00a7\u0000\u0000\u05cf\u05f8"+
		"\u0005\u000f\u0000\u0000\u05d0\u05d1\u00055\u0000\u0000\u05d1\u05d5\u0005"+
		"\u000f\u0000\u0000\u05d2\u05d4\u0003\u0012\t\u0000\u05d3\u05d2\u0001\u0000"+
		"\u0000\u0000\u05d4\u05d7\u0001\u0000\u0000\u0000\u05d5\u05d3\u0001\u0000"+
		"\u0000\u0000\u05d5\u05d6\u0001\u0000\u0000\u0000\u05d6\u05d8\u0001\u0000"+
		"\u0000\u0000\u05d7\u05d5\u0001\u0000\u0000\u0000\u05d8\u05d9\u0003\u000e"+
		"\u0007\u0000\u05d9\u05da\u0005\u000e\u0000\u0000\u05da\u05f7\u0001\u0000"+
		"\u0000\u0000\u05db\u05dc\u00056\u0000\u0000\u05dc\u05e0\u0005\u000f\u0000"+
		"\u0000\u05dd\u05df\u0003\u0012\t\u0000\u05de\u05dd\u0001\u0000\u0000\u0000"+
		"\u05df\u05e2\u0001\u0000\u0000\u0000\u05e0\u05de\u0001\u0000\u0000\u0000"+
		"\u05e0\u05e1\u0001\u0000\u0000\u0000\u05e1\u05e3\u0001\u0000\u0000\u0000"+
		"\u05e2\u05e0\u0001\u0000\u0000\u0000\u05e3\u05e4\u0003\u000e\u0007\u0000"+
		"\u05e4\u05e5\u0005\u000e\u0000\u0000\u05e5\u05f7\u0001\u0000\u0000\u0000"+
		"\u05e6\u05e7\u00057\u0000\u0000\u05e7\u05eb\u0005\u000f\u0000\u0000\u05e8"+
		"\u05ea\u0003\u0012\t\u0000\u05e9\u05e8\u0001\u0000\u0000\u0000\u05ea\u05ed"+
		"\u0001\u0000\u0000\u0000\u05eb\u05e9\u0001\u0000\u0000\u0000\u05eb\u05ec"+
		"\u0001\u0000\u0000\u0000\u05ec\u05ee\u0001\u0000\u0000\u0000\u05ed\u05eb"+
		"\u0001\u0000\u0000\u0000\u05ee\u05ef\u0003\u000e\u0007\u0000\u05ef\u05f0"+
		"\u0005\u000e\u0000\u0000\u05f0\u05f7\u0001\u0000\u0000\u0000\u05f1\u05f7"+
		"\u0003\u0012\t\u0000\u05f2\u05f7\u0003\u000e\u0007\u0000\u05f3\u05f7\u0003"+
		"\u00eau\u0000\u05f4\u05f7\u0003\u00ecv\u0000\u05f5\u05f7\u00038\u001c"+
		"\u0000\u05f6\u05d0\u0001\u0000\u0000\u0000\u05f6\u05db\u0001\u0000\u0000"+
		"\u0000\u05f6\u05e6\u0001\u0000\u0000\u0000\u05f6\u05f1\u0001\u0000\u0000"+
		"\u0000\u05f6\u05f2\u0001\u0000\u0000\u0000\u05f6\u05f3\u0001\u0000\u0000"+
		"\u0000\u05f6\u05f4\u0001\u0000\u0000\u0000\u05f6\u05f5\u0001\u0000\u0000"+
		"\u0000\u05f7\u05fa\u0001\u0000\u0000\u0000\u05f8\u05f6\u0001\u0000\u0000"+
		"\u0000\u05f8\u05f9\u0001\u0000\u0000\u0000\u05f9\u05fb\u0001\u0000\u0000"+
		"\u0000\u05fa\u05f8\u0001\u0000\u0000\u0000\u05fb\u05fc\u0005\u000e\u0000"+
		"\u0000\u05fc\u00e9\u0001\u0000\u0000\u0000\u05fd\u05fe\u00058\u0000\u0000"+
		"\u05fe\u05ff\u0005\u000f\u0000\u0000\u05ff\u0600\u0003\u001c\u000e\u0000"+
		"\u0600\u0601\u0005\u000e\u0000\u0000\u0601\u00eb\u0001\u0000\u0000\u0000"+
		"\u0602\u0603\u0005Z\u0000\u0000\u0603\u0604\u0005\u000f\u0000\u0000\u0604"+
		"\u0605\u0003\u001a\r\u0000\u0605\u0606\u0003\u001c\u000e\u0000\u0606\u0607"+
		"\u0005\u000e\u0000\u0000\u0607\u00ed\u0001\u0000\u0000\u0000\u0608\u0609"+
		"\u0005\u00a7\u0000\u0000\u0609\u060a\u0005\u000f\u0000\u0000\u060a\u060b"+
		"\u0003\u000e\u0007\u0000\u060b\u060c\u0005\u00a2\u0000\u0000\u060c\u060d"+
		"\u0005\u0010\u0000\u0000\u060d\u060e\u0005\b\u0000\u0000\u060e\u060f\u0005"+
		"\u000e\u0000\u0000\u060f\u00ef\u0001\u0000\u0000\u0000\u0610\u0611\u0005"+
		"\u0098\u0000\u0000\u0611\u0612\u0005\u0010\u0000\u0000\u0612\u0613\u0005"+
		"\b\u0000\u0000\u0613\u00f1\u0001\u0000\u0000\u0000\u0614\u0615\u0005\u0099"+
		"\u0000\u0000\u0615\u0619\u0005\u000f\u0000\u0000\u0616\u0618\u0003X,\u0000"+
		"\u0617\u0616\u0001\u0000\u0000\u0000\u0618\u061b\u0001\u0000\u0000\u0000"+
		"\u0619\u0617\u0001\u0000\u0000\u0000\u0619\u061a\u0001\u0000\u0000\u0000"+
		"\u061a\u061c\u0001\u0000\u0000\u0000\u061b\u0619\u0001\u0000\u0000\u0000"+
		"\u061c\u061d\u0005\u000e\u0000\u0000\u061d\u00f3\u0001\u0000\u0000\u0000"+
		"\u061e\u061f\u0005\u00a7\u0000\u0000\u061f\u0624\u0005\u000f\u0000\u0000"+
		"\u0620\u0623\u0003\u0012\t\u0000\u0621\u0623\u0003X,\u0000\u0622\u0620"+
		"\u0001\u0000\u0000\u0000\u0622\u0621\u0001\u0000\u0000\u0000\u0623\u0626"+
		"\u0001\u0000\u0000\u0000\u0624\u0622\u0001\u0000\u0000\u0000\u0624\u0625"+
		"\u0001\u0000\u0000\u0000\u0625\u0627\u0001\u0000\u0000\u0000\u0626\u0624"+
		"\u0001\u0000\u0000\u0000\u0627\u0628\u0005\u000e\u0000\u0000\u0628\u00f5"+
		"\u0001\u0000\u0000\u0000\u0629\u062a\u0005\u009a\u0000\u0000\u062a\u062e"+
		"\u0005\u000f\u0000\u0000\u062b\u062d\u0003\u00f4z\u0000\u062c\u062b\u0001"+
		"\u0000\u0000\u0000\u062d\u0630\u0001\u0000\u0000\u0000\u062e\u062c\u0001"+
		"\u0000\u0000\u0000\u062e\u062f\u0001\u0000\u0000\u0000\u062f\u0631\u0001"+
		"\u0000\u0000\u0000\u0630\u062e\u0001\u0000\u0000\u0000\u0631\u0632\u0005"+
		"\u000e\u0000\u0000\u0632\u00f7\u0001\u0000\u0000\u0000\u0633\u0634\u0005"+
		"\u00a7\u0000\u0000\u0634\u063a\u0005\u000f\u0000\u0000\u0635\u0639\u0003"+
		"\u0012\t\u0000\u0636\u0639\u0003\n\u0005\u0000\u0637\u0639\u0003\f\u0006"+
		"\u0000\u0638\u0635\u0001\u0000\u0000\u0000\u0638\u0636\u0001\u0000\u0000"+
		"\u0000\u0638\u0637\u0001\u0000\u0000\u0000\u0639\u063c\u0001\u0000\u0000"+
		"\u0000\u063a\u0638\u0001\u0000\u0000\u0000\u063a\u063b\u0001\u0000\u0000"+
		"\u0000\u063b\u063d\u0001\u0000\u0000\u0000\u063c\u063a\u0001\u0000\u0000"+
		"\u0000\u063d\u063e\u0003\u0010\b\u0000\u063e\u063f\u0005\u000e\u0000\u0000"+
		"\u063f\u00f9\u0001\u0000\u0000\u0000\u0640\u0641\u0005\u009b\u0000\u0000"+
		"\u0641\u0645\u0005\u000f\u0000\u0000\u0642\u0644\u0003\u00f8|\u0000\u0643"+
		"\u0642\u0001\u0000\u0000\u0000\u0644\u0647\u0001\u0000\u0000\u0000\u0645"+
		"\u0643\u0001\u0000\u0000\u0000\u0645\u0646\u0001\u0000\u0000\u0000\u0646"+
		"\u0648\u0001\u0000\u0000\u0000\u0647\u0645\u0001\u0000\u0000\u0000\u0648"+
		"\u0649\u0005\u000e\u0000\u0000\u0649\u00fb\u0001\u0000\u0000\u0000\u064a"+
		"\u064b\u0005\u00a7\u0000\u0000\u064b\u064c\u0005\u000f\u0000\u0000\u064c"+
		"\u064d\u0003\u00f0x\u0000\u064d\u0656\u0003\u00f2y\u0000\u064e\u064f\u0005"+
		"\u009c\u0000\u0000\u064f\u0650\u0005\u0010\u0000\u0000\u0650\u0655\u0007"+
		"\u0003\u0000\u0000\u0651\u0652\u0005\u009d\u0000\u0000\u0652\u0653\u0005"+
		"\u0010\u0000\u0000\u0653\u0655\u0005\n\u0000\u0000\u0654\u064e\u0001\u0000"+
		"\u0000\u0000\u0654\u0651\u0001\u0000\u0000\u0000\u0655\u0658\u0001\u0000"+
		"\u0000\u0000\u0656\u0654\u0001\u0000\u0000\u0000\u0656\u0657\u0001\u0000"+
		"\u0000\u0000\u0657\u0659\u0001\u0000\u0000\u0000\u0658\u0656\u0001\u0000"+
		"\u0000\u0000\u0659\u065a\u0003\u00f6{\u0000\u065a\u065b\u0003\u00fa}\u0000"+
		"\u065b\u00fd\u0001\u0000\u0000\u0000\u065c\u065d\u0005\u00a7\u0000\u0000"+
		"\u065d\u065e\u0005\u000f\u0000\u0000\u065e\u0663\u0003\u0100\u0080\u0000"+
		"\u065f\u0662\u00038\u001c\u0000\u0660\u0662\u0003:\u001d\u0000\u0661\u065f"+
		"\u0001\u0000\u0000\u0000\u0661\u0660\u0001\u0000\u0000\u0000\u0662\u0665"+
		"\u0001\u0000\u0000\u0000\u0663\u0661\u0001\u0000\u0000\u0000\u0663\u0664"+
		"\u0001\u0000\u0000\u0000\u0664\u0666\u0001\u0000\u0000\u0000\u0665\u0663"+
		"\u0001\u0000\u0000\u0000\u0666\u0667\u0003\u000e\u0007\u0000\u0667\u0668"+
		"\u0003\u0010\b\u0000\u0668\u0669\u0005\u000e\u0000\u0000\u0669\u00ff\u0001"+
		"\u0000\u0000\u0000\u066a\u066b\u0005w\u0000\u0000\u066b\u066c\u0005\u0010"+
		"\u0000\u0000\u066c\u066d\u0005\u0006\u0000\u0000\u066d\u0101\u0001\u0000"+
		"\u0000\u0000\u066e\u066f\u0005\u00a7\u0000\u0000\u066f\u0679\u0005\u000f"+
		"\u0000\u0000\u0670\u0678\u0003\u0104\u0082\u0000\u0671\u0678\u0003\u0106"+
		"\u0083\u0000\u0672\u0678\u0003j5\u0000\u0673\u0678\u0003\u0108\u0084\u0000"+
		"\u0674\u0678\u0003\u010a\u0085\u0000\u0675\u0678\u0003\u010c\u0086\u0000"+
		"\u0676\u0678\u0003\u010e\u0087\u0000\u0677\u0670\u0001\u0000\u0000\u0000"+
		"\u0677\u0671\u0001\u0000\u0000\u0000\u0677\u0672\u0001\u0000\u0000\u0000"+
		"\u0677\u0673\u0001\u0000\u0000\u0000\u0677\u0674\u0001\u0000\u0000\u0000"+
		"\u0677\u0675\u0001\u0000\u0000\u0000\u0677\u0676\u0001\u0000\u0000\u0000"+
		"\u0678\u067b\u0001\u0000\u0000\u0000\u0679\u0677\u0001\u0000\u0000\u0000"+
		"\u0679\u067a\u0001\u0000\u0000\u0000\u067a\u067c\u0001\u0000\u0000\u0000"+
		"\u067b\u0679\u0001\u0000\u0000\u0000\u067c\u067d\u0005\u000e\u0000\u0000"+
		"\u067d\u0103\u0001\u0000\u0000\u0000\u067e\u067f\u0005\u009e\u0000\u0000"+
		"\u067f\u0680\u0005\u0010\u0000\u0000\u0680\u0681\u0005\b\u0000\u0000\u0681"+
		"\u0105\u0001\u0000\u0000\u0000\u0682\u0683\u0005\u009f\u0000\u0000\u0683"+
		"\u0684\u0005\u0010\u0000\u0000\u0684\u0685\u0007\u0003\u0000\u0000\u0685"+
		"\u0107\u0001\u0000\u0000\u0000\u0686\u0687\u0005\u00a0\u0000\u0000\u0687"+
		"\u0688\u0005\u0010\u0000\u0000\u0688\u0689\u0007\u0003\u0000\u0000\u0689"+
		"\u0109\u0001\u0000\u0000\u0000\u068a\u068b\u0005\u00a1\u0000\u0000\u068b"+
		"\u068f\u0005\u000f\u0000\u0000\u068c\u068e\u0003X,\u0000\u068d\u068c\u0001"+
		"\u0000\u0000\u0000\u068e\u0691\u0001\u0000\u0000\u0000\u068f\u068d\u0001"+
		"\u0000\u0000\u0000\u068f\u0690\u0001\u0000\u0000\u0000\u0690\u0692\u0001"+
		"\u0000\u0000\u0000\u0691\u068f\u0001\u0000\u0000\u0000\u0692\u0693\u0005"+
		"\u000e\u0000\u0000\u0693\u010b\u0001\u0000\u0000\u0000\u0694\u0695\u0005"+
		"\u001b\u0000\u0000\u0695\u0699\u0005\u000f\u0000\u0000\u0696\u0698\u0003"+
		"X,\u0000\u0697\u0696\u0001\u0000\u0000\u0000\u0698\u069b\u0001\u0000\u0000"+
		"\u0000\u0699\u0697\u0001\u0000\u0000\u0000\u0699\u069a\u0001\u0000\u0000"+
		"\u0000\u069a\u069c\u0001\u0000\u0000\u0000\u069b\u0699\u0001\u0000\u0000"+
		"\u0000\u069c\u069d\u0005\u000e\u0000\u0000\u069d\u010d\u0001\u0000\u0000"+
		"\u0000\u069e\u069f\u0005\u00a7\u0000\u0000\u069f\u06aa\u0005\u000f\u0000"+
		"\u0000\u06a0\u06a9\u0003\u0110\u0088\u0000\u06a1\u06a9\u0003\u0112\u0089"+
		"\u0000\u06a2\u06a9\u0003\u0114\u008a\u0000\u06a3\u06a9\u0003\u0116\u008b"+
		"\u0000\u06a4\u06a9\u0003\u0118\u008c\u0000\u06a5\u06a9\u0003\u0006\u0003"+
		"\u0000\u06a6\u06a9\u0003\n\u0005\u0000\u06a7\u06a9\u0003\u011a\u008d\u0000"+
		"\u06a8\u06a0\u0001\u0000\u0000\u0000\u06a8\u06a1\u0001\u0000\u0000\u0000"+
		"\u06a8\u06a2\u0001\u0000\u0000\u0000\u06a8\u06a3\u0001\u0000\u0000\u0000"+
		"\u06a8\u06a4\u0001\u0000\u0000\u0000\u06a8\u06a5\u0001\u0000\u0000\u0000"+
		"\u06a8\u06a6\u0001\u0000\u0000\u0000\u06a8\u06a7\u0001\u0000\u0000\u0000"+
		"\u06a9\u06ac\u0001\u0000\u0000\u0000\u06aa\u06a8\u0001\u0000\u0000\u0000"+
		"\u06aa\u06ab\u0001\u0000\u0000\u0000\u06ab\u06ad\u0001\u0000\u0000\u0000"+
		"\u06ac\u06aa\u0001\u0000\u0000\u0000\u06ad\u06ae\u0005\u000e\u0000\u0000"+
		"\u06ae\u010f\u0001\u0000\u0000\u0000\u06af\u06b0\u0005\u00a2\u0000\u0000"+
		"\u06b0\u06b1\u0005\u0010\u0000\u0000\u06b1\u06b2\u0005\u00a7\u0000\u0000"+
		"\u06b2\u0111\u0001\u0000\u0000\u0000\u06b3\u06b4\u0005\u00a3\u0000\u0000"+
		"\u06b4\u06b5\u0005\u0010\u0000\u0000\u06b5\u06b6\u0005\b\u0000\u0000\u06b6"+
		"\u0113\u0001\u0000\u0000\u0000\u06b7\u06b8\u0005\u00a4\u0000\u0000\u06b8"+
		"\u06b9\u0005\u0010\u0000\u0000\u06b9\u06ba\u0005\t\u0000\u0000\u06ba\u0115"+
		"\u0001\u0000\u0000\u0000\u06bb\u06bc\u0005\u00a5\u0000\u0000\u06bc\u06c0"+
		"\u0005\u000f\u0000\u0000\u06bd\u06bf\u0005\u00a7\u0000\u0000\u06be\u06bd"+
		"\u0001\u0000\u0000\u0000\u06bf\u06c2\u0001\u0000\u0000\u0000\u06c0\u06be"+
		"\u0001\u0000\u0000\u0000\u06c0\u06c1\u0001\u0000\u0000\u0000\u06c1\u06c3"+
		"\u0001\u0000\u0000\u0000\u06c2\u06c0\u0001\u0000\u0000\u0000\u06c3\u06c4"+
		"\u0005\u000e\u0000\u0000\u06c4\u0117\u0001\u0000\u0000\u0000\u06c5\u06c6"+
		"\u0005\u00a6\u0000\u0000\u06c6\u06ca\u0005\u000f\u0000\u0000\u06c7\u06c9"+
		"\u0003X,\u0000\u06c8\u06c7\u0001\u0000\u0000\u0000\u06c9\u06cc\u0001\u0000"+
		"\u0000\u0000\u06ca\u06c8\u0001\u0000\u0000\u0000\u06ca\u06cb\u0001\u0000"+
		"\u0000\u0000\u06cb\u06cd\u0001\u0000\u0000\u0000\u06cc\u06ca\u0001\u0000"+
		"\u0000\u0000\u06cd\u06ce\u0005\u000e\u0000\u0000\u06ce\u0119\u0001\u0000"+
		"\u0000\u0000\u06cf\u06d0\u0005Y\u0000\u0000\u06d0\u06d1\u0005\u000f\u0000"+
		"\u0000\u06d1\u06d2\u0003\u001a\r\u0000\u06d2\u06d3\u0005\u000e\u0000\u0000"+
		"\u06d3\u011b\u0001\u0000\u0000\u0000\u0092\u011f\u0125\u012b\u0131\u0137"+
		"\u013d\u0143\u0149\u014f\u0155\u015b\u0161\u0167\u016d\u0170\u0175\u0177"+
		"\u017e\u0185\u018f\u0199\u01a3\u01ad\u01b3\u01be\u01c8\u01d3\u01d5\u01de"+
		"\u01e3\u01e8\u01f1\u01f5\u0202\u0204\u0222\u022c\u0237\u0242\u0248\u024a"+
		"\u0253\u025e\u0260\u026b\u0270\u0290\u02bf\u02d9\u02e8\u02f7\u0306\u0315"+
		"\u0324\u033a\u034a\u034c\u035c\u0379\u0383\u038d\u03a3\u03ad\u03b7\u03c4"+
		"\u03c6\u03d1\u03d3\u03e3\u03e8\u03ed\u03f2\u03fb\u0407\u0417\u041c\u0421"+
		"\u0424\u0426\u042f\u043a\u0445\u0455\u045b\u0463\u0467\u0469\u047a\u0480"+
		"\u048d\u048f\u04a5\u04a7\u04ab\u04be\u04c5\u04cf\u04d9\u04e4\u04e7\u04ea"+
		"\u04ed\u0516\u0530\u0535\u0538\u053b\u053e\u0541\u0544\u0547\u054c\u0556"+
		"\u0560\u056a\u0589\u05a0\u05a2\u05b1\u05b9\u05c1\u05c9\u05d5\u05e0\u05eb"+
		"\u05f6\u05f8\u0619\u0622\u0624\u062e\u0638\u063a\u0645\u0654\u0656\u0661"+
		"\u0663\u0677\u0679\u068f\u0699\u06a8\u06aa\u06c0\u06ca";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}