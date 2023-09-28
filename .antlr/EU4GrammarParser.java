// Generated from f:\EU4 Grammar\EU4GrammarParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EU4GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, YES=3, NO=4, NOT=5, MPOWER=6, TAG=7, INT=8, STRING=9, FLOAT=10, 
		DATE=11, LPAR=12, RPAR=13, EQUALS=14, PLUS=15, MINUS=16, WHITESPACE=17, 
		SINGLE_LINE_COMMENT=18, IF=19, ELSE=20, ELSE_IF=21, LIMIT=22, SKILL_SACLED_MOD=23, 
		POTENTIAL=24, TRIGGER=25, EFFECT=26, ALLOW=27, CALC_TRUE_IF=28, AMOUNT=29, 
		DATE_KEY=30, NAME=31, COST=32, TIME=33, RULER_ALLOW=34, HEIR_ALLOW=35, 
		CONSORT_ALLOW=36, WAR_PRIORITY=37, ON_BUILT=38, ON_DESTORYED=39, ON_CONSTRUCTION_STARTED=40, 
		ON_CONSTRUCTION_CANCELED=41, ON_OBSOLETE=42, KEEP_TRIGGER=43, BUILD_TRIGGER=44, 
		TOOLTIP=45, CUSTOM_TOOLTIP=46, DESC=47, CUSTOM_TRIGGER_TOOLTIP=48, TRIGGER_NAME=49, 
		MODIFIER_NAME=50, EFFECT_NAME=51, SCOPE=52, ADD_PROVINCE_MOD=53, ADD_COUNTRY_MOD=54, 
		DURATION=55, AI=56, MODIFIER=57, CHANCE=58, AI_WILL_DO=59, FACTOR=60, 
		AI_WEIGHT=61, AI_PICK_ANCESTOR=62, ALLOWED_IN_GOLD_PROVINCES=63, INFLUENCING_FORT=64, 
		ONMAP=65, MAKE_OBSOLETE=66, MANUFACTORY=67, BONUS_MANUFACTORY=68, BONUS_MODIFIER=69, 
		SHOW_SEPERATE=70, BOOKMARK=71, DEFAULT=72, CENTER=73, EASY_COUNTRY=74, 
		COUNTRY=75, MONARCH_POWER=76, START=77, CAN_START=78, OBJECTIVES=79, ABILITIES=80, 
		RELIGIOUS_CONFLICTS=81, PAPACY=82, SLOT=83, GENERIC=84, HAS_COUNTRY_SHIELD=85, 
		POTENTIAL_ON_LOAD=86, ICON=87, POSITION=88, COMPLETED_BY=89, REQUIRED_MISSIONS=90, 
		PROVINCES_TO_HIGHLIGHT=91, IDENTIFIER=92, STRING_TOOLTIP=93;
	public static final int
		RULE_file = 0, RULE_block = 1, RULE_statement = 2, RULE_trigger_block = 3, 
		RULE_effect_block = 4, RULE_modifier_block = 5, RULE_chance_block = 6, 
		RULE_ai_will_do_block = 7, RULE_allow = 8, RULE_value = 9, RULE_amount = 10, 
		RULE_name = 11, RULE_date = 12, RULE_bool = 13, RULE_limit = 14, RULE_eLSE = 15, 
		RULE_else_if = 16, RULE_if_statement = 17, RULE_scriptedEffect = 18, RULE_modifier = 19, 
		RULE_skill_scaled_modifier = 20, RULE_effect = 21, RULE_add_modifier = 22, 
		RULE_factor = 23, RULE_chance_modifier = 24, RULE_mana_trigger = 25, RULE_trigger = 26, 
		RULE_calc_true_if = 27, RULE_scripted_trigger = 28, RULE_ai_trigger = 29, 
		RULE_trigger_sub_block = 30, RULE_scope = 31, RULE_tooltip = 32, RULE_custom_tooltip = 33, 
		RULE_custom_trigger_tooltip = 34, RULE_desc = 35, RULE_buildings_trigger = 36, 
		RULE_buildings_effect = 37, RULE_manufactory_defines = 38, RULE_bonus_modifier = 39, 
		RULE_cost = 40, RULE_time = 41, RULE_onmap = 42, RULE_show_seperate = 43, 
		RULE_building_attribute = 44, RULE_allowed_in_gold_province = 45, RULE_make_obsolete = 46, 
		RULE_influencing_fort = 47, RULE_building = 48, RULE_bookmark = 49, RULE_ancestor_personality = 50, 
		RULE_war_priority = 51, RULE_ai_pick_ancestor = 52, RULE_ai_personality = 53, 
		RULE_start = 54, RULE_can_start_block = 55, RULE_objective = 56, RULE_objectives_block = 57, 
		RULE_ability = 58, RULE_ability_block = 59, RULE_age = 60, RULE_advisor = 61, 
		RULE_monarch_power_advisor = 62, RULE_missionSeries = 63, RULE_slot_missionSeries = 64, 
		RULE_generic_missionSeries = 65, RULE_hasCountryShield_missionSeries = 66, 
		RULE_potentialOnLoad_missionSeries = 67, RULE_potential_missionSeries = 68, 
		RULE_missionBlock = 69, RULE_icon_mission = 70, RULE_position_mission = 71, 
		RULE_completedBy_mission = 72, RULE_requiredMissions_mission = 73, RULE_provincesToHighlight_mission = 74, 
		RULE_aiWeight_mission = 75;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "block", "statement", "trigger_block", "effect_block", "modifier_block", 
			"chance_block", "ai_will_do_block", "allow", "value", "amount", "name", 
			"date", "bool", "limit", "eLSE", "else_if", "if_statement", "scriptedEffect", 
			"modifier", "skill_scaled_modifier", "effect", "add_modifier", "factor", 
			"chance_modifier", "mana_trigger", "trigger", "calc_true_if", "scripted_trigger", 
			"ai_trigger", "trigger_sub_block", "scope", "tooltip", "custom_tooltip", 
			"custom_trigger_tooltip", "desc", "buildings_trigger", "buildings_effect", 
			"manufactory_defines", "bonus_modifier", "cost", "time", "onmap", "show_seperate", 
			"building_attribute", "allowed_in_gold_province", "make_obsolete", "influencing_fort", 
			"building", "bookmark", "ancestor_personality", "war_priority", "ai_pick_ancestor", 
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
			null, "'{'", "'}'", "'='", "'+'", "'-'", null, null, "'if'", "'else'", 
			"'else_if'", "'limit'", "'skill_scaled_modifier'", "'potential'", "'trigger'", 
			"'effect'", "'allow'", "'calc_true_if'", "'amount'", "'date'", "'name'", 
			"'cost'", "'time'", "'ruler_allow'", "'heir_allow'", "'consort_allow'", 
			"'war_priority'", "'on_built'", "'on_destroyed'", "'on_construction_started'", 
			"'on_construction_canceled'", "'on_obsolete'", "'keep_trigger'", "'build_trigger'", 
			"'tooltip'", "'custom_tooltip'", "'desc'", "'custom_trigger_tooltip'", 
			null, null, "'add_core'", null, "'add_province_modifier'", "'add_country_modifier'", 
			"'druation'", "'ai'", "'modifier'", "'chance'", "'ai_will_do'", "'factor'", 
			"'ai_weight'", "'ai_pick_ancestor'", "'allow_in_gold_provinces'", "'influencing_fort'", 
			"'onmap'", "'make_obsolete'", "'manufactory'", "'bonus_manufactory'", 
			"'bonus_modifier'", "'show_separate'", "'bookmark'", "'default'", "'center'", 
			"'easy_country'", "'country'", "'monarch_power'", "'start'", "'can_start'", 
			"'objectives'", "'abilities'", "'religious_conflicts'", "'papacy'", "'slot'", 
			"'generic'", "'has_country_shield'", "'potential_on_load'", "'icon'", 
			"'position'", "'completed_by'", "'required_missions'", "'provinces_to_highlight'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "YES", "NO", "NOT", "MPOWER", "TAG", "INT", "STRING", 
			"FLOAT", "DATE", "LPAR", "RPAR", "EQUALS", "PLUS", "MINUS", "WHITESPACE", 
			"SINGLE_LINE_COMMENT", "IF", "ELSE", "ELSE_IF", "LIMIT", "SKILL_SACLED_MOD", 
			"POTENTIAL", "TRIGGER", "EFFECT", "ALLOW", "CALC_TRUE_IF", "AMOUNT", 
			"DATE_KEY", "NAME", "COST", "TIME", "RULER_ALLOW", "HEIR_ALLOW", "CONSORT_ALLOW", 
			"WAR_PRIORITY", "ON_BUILT", "ON_DESTORYED", "ON_CONSTRUCTION_STARTED", 
			"ON_CONSTRUCTION_CANCELED", "ON_OBSOLETE", "KEEP_TRIGGER", "BUILD_TRIGGER", 
			"TOOLTIP", "CUSTOM_TOOLTIP", "DESC", "CUSTOM_TRIGGER_TOOLTIP", "TRIGGER_NAME", 
			"MODIFIER_NAME", "EFFECT_NAME", "SCOPE", "ADD_PROVINCE_MOD", "ADD_COUNTRY_MOD", 
			"DURATION", "AI", "MODIFIER", "CHANCE", "AI_WILL_DO", "FACTOR", "AI_WEIGHT", 
			"AI_PICK_ANCESTOR", "ALLOWED_IN_GOLD_PROVINCES", "INFLUENCING_FORT", 
			"ONMAP", "MAKE_OBSOLETE", "MANUFACTORY", "BONUS_MANUFACTORY", "BONUS_MODIFIER", 
			"SHOW_SEPERATE", "BOOKMARK", "DEFAULT", "CENTER", "EASY_COUNTRY", "COUNTRY", 
			"MONARCH_POWER", "START", "CAN_START", "OBJECTIVES", "ABILITIES", "RELIGIOUS_CONFLICTS", 
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
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(152);
					advisor();
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(158);
					age();
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(164);
					ai_personality();
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(170);
					ancestor_personality();
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BOOKMARK) {
					{
					{
					setState(176);
					bookmark();
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(182);
					building();
					}
					}
					setState(187);
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
			setState(190);
			match(LPAR);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << IF) | (1L << CUSTOM_TOOLTIP) | (1L << EFFECT_NAME) | (1L << SCOPE) | (1L << ADD_PROVINCE_MOD) | (1L << ADD_COUNTRY_MOD))) != 0) || _la==IDENTIFIER) {
				{
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(191);
					statement();
					}
					break;
				case 2:
					{
					setState(192);
					if_statement();
					}
					break;
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

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
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case CUSTOM_TOOLTIP:
			case EFFECT_NAME:
			case SCOPE:
			case ADD_PROVINCE_MOD:
			case ADD_COUNTRY_MOD:
			case IDENTIFIER:
				{
				setState(200);
				effect();
				}
				break;
			case LPAR:
				{
				setState(201);
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

	public static class Trigger_blockContext extends ParserRuleContext {
		public TerminalNode TRIGGER() { return getToken(EU4GrammarParser.TRIGGER, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final Trigger_blockContext trigger_block() throws RecognitionException {
		Trigger_blockContext _localctx = new Trigger_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_trigger_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(TRIGGER);
			setState(205);
			match(EQUALS);
			setState(206);
			match(LPAR);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << MPOWER) | (1L << CALC_TRUE_IF) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << AI))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(207);
				trigger();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Effect_blockContext extends ParserRuleContext {
		public TerminalNode EFFECT() { return getToken(EU4GrammarParser.EFFECT, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final Effect_blockContext effect_block() throws RecognitionException {
		Effect_blockContext _localctx = new Effect_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_effect_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(EFFECT);
			setState(216);
			match(EQUALS);
			setState(217);
			match(LPAR);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << CUSTOM_TOOLTIP) | (1L << EFFECT_NAME) | (1L << SCOPE) | (1L << ADD_PROVINCE_MOD) | (1L << ADD_COUNTRY_MOD))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(218);
				effect();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Modifier_blockContext extends ParserRuleContext {
		public TerminalNode MODIFIER() { return getToken(EU4GrammarParser.MODIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final Modifier_blockContext modifier_block() throws RecognitionException {
		Modifier_blockContext _localctx = new Modifier_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_modifier_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(MODIFIER);
			setState(227);
			match(EQUALS);
			setState(228);
			match(LPAR);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER_NAME || _la==IDENTIFIER) {
				{
				{
				setState(229);
				modifier();
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Chance_blockContext extends ParserRuleContext {
		public TerminalNode CHANCE() { return getToken(EU4GrammarParser.CHANCE, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final Chance_blockContext chance_block() throws RecognitionException {
		Chance_blockContext _localctx = new Chance_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_chance_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(CHANCE);
			setState(238);
			match(EQUALS);
			setState(239);
			match(LPAR);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FACTOR) {
				{
				{
				setState(240);
				factor();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(246);
				chance_modifier();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ai_will_do_blockContext extends ParserRuleContext {
		public TerminalNode AI_WILL_DO() { return getToken(EU4GrammarParser.AI_WILL_DO, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final Ai_will_do_blockContext ai_will_do_block() throws RecognitionException {
		Ai_will_do_blockContext _localctx = new Ai_will_do_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ai_will_do_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(AI_WILL_DO);
			setState(255);
			match(EQUALS);
			setState(256);
			match(LPAR);
			setState(257);
			factor();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(258);
				chance_modifier();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllowContext extends ParserRuleContext {
		public TerminalNode ALLOW() { return getToken(EU4GrammarParser.ALLOW, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final AllowContext allow() throws RecognitionException {
		AllowContext _localctx = new AllowContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_allow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(ALLOW);
			setState(267);
			match(EQUALS);
			setState(268);
			match(LPAR);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << MPOWER) | (1L << CALC_TRUE_IF) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << AI))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(269);
				trigger();
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

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
		enterRule(_localctx, 18, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << YES) | (1L << NO) | (1L << TAG) | (1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << SCOPE))) != 0) || _la==IDENTIFIER) ) {
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
		enterRule(_localctx, 20, RULE_amount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(AMOUNT);
			setState(280);
			match(EQUALS);
			setState(281);
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
		enterRule(_localctx, 22, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(NAME);
			setState(284);
			match(EQUALS);
			setState(285);
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
		enterRule(_localctx, 24, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(DATE_KEY);
			setState(288);
			match(EQUALS);
			setState(289);
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
		enterRule(_localctx, 26, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
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

	public static class LimitContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(EU4GrammarParser.LIMIT, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final LimitContext limit() throws RecognitionException {
		LimitContext _localctx = new LimitContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_limit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(LIMIT);
			setState(294);
			match(EQUALS);
			setState(295);
			match(LPAR);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << MPOWER) | (1L << CALC_TRUE_IF) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << AI))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(296);
				trigger();
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(302);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ELSEContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(EU4GrammarParser.ELSE, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final ELSEContext eLSE() throws RecognitionException {
		ELSEContext _localctx = new ELSEContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_eLSE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(ELSE);
			setState(305);
			match(EQUALS);
			setState(306);
			match(LPAR);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << CUSTOM_TOOLTIP) | (1L << EFFECT_NAME) | (1L << SCOPE) | (1L << ADD_PROVINCE_MOD) | (1L << ADD_COUNTRY_MOD))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(307);
				effect();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_ifContext extends ParserRuleContext {
		public TerminalNode ELSE_IF() { return getToken(EU4GrammarParser.ELSE_IF, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final Else_ifContext else_if() throws RecognitionException {
		Else_ifContext _localctx = new Else_ifContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_else_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(ELSE_IF);
			setState(316);
			match(EQUALS);
			setState(317);
			match(LPAR);
			setState(318);
			limit();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << CUSTOM_TOOLTIP) | (1L << EFFECT_NAME) | (1L << SCOPE) | (1L << ADD_PROVINCE_MOD) | (1L << ADD_COUNTRY_MOD))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(319);
				effect();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(EU4GrammarParser.IF, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(IF);
			setState(328);
			match(EQUALS);
			setState(329);
			match(LPAR);
			setState(330);
			limit();
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << CUSTOM_TOOLTIP) | (1L << EFFECT_NAME) | (1L << SCOPE) | (1L << ADD_PROVINCE_MOD) | (1L << ADD_COUNTRY_MOD))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(331);
				effect();
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(337);
			match(RPAR);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE || _la==ELSE_IF) {
				{
				setState(340);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(338);
					eLSE();
					}
					break;
				case ELSE_IF:
					{
					setState(339);
					else_if();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(344);
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
		enterRule(_localctx, 36, RULE_scriptedEffect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(IDENTIFIER);
			setState(346);
			match(EQUALS);
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				{
				setState(347);
				match(LPAR);
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << IF) | (1L << CUSTOM_TOOLTIP) | (1L << EFFECT_NAME) | (1L << SCOPE) | (1L << ADD_PROVINCE_MOD) | (1L << ADD_COUNTRY_MOD))) != 0) || _la==IDENTIFIER) {
					{
					{
					setState(348);
					statement();
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(354);
				match(RPAR);
				}
				}
				break;
			case YES:
				{
				setState(355);
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
		enterRule(_localctx, 38, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_la = _input.LA(1);
			if ( !(_la==MODIFIER_NAME || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(359);
			match(EQUALS);
			setState(360);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << YES) | (1L << NO) | (1L << TAG) | (1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << SCOPE))) != 0) || _la==IDENTIFIER) ) {
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

	public static class Skill_scaled_modifierContext extends ParserRuleContext {
		public TerminalNode SKILL_SACLED_MOD() { return getToken(EU4GrammarParser.SKILL_SACLED_MOD, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final Skill_scaled_modifierContext skill_scaled_modifier() throws RecognitionException {
		Skill_scaled_modifierContext _localctx = new Skill_scaled_modifierContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_skill_scaled_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(SKILL_SACLED_MOD);
			setState(363);
			match(EQUALS);
			setState(364);
			match(LPAR);
			setState(365);
			trigger_block();
			setState(366);
			modifier_block();
			setState(367);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

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
		public EffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effect; }
	}

	public final EffectContext effect() throws RecognitionException {
		EffectContext _localctx = new EffectContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_effect);
		int _la;
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(369);
				_la = _input.LA(1);
				if ( !(_la==EFFECT_NAME || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(370);
				match(EQUALS);
				setState(371);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << YES) | (1L << NO) | (1L << TAG) | (1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << SCOPE))) != 0) || _la==IDENTIFIER) ) {
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
				setState(372);
				scriptedEffect();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(373);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(374);
				scope();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(375);
				custom_tooltip();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(376);
				add_modifier();
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

	public static class Add_modifierContext extends ParserRuleContext {
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
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
	}

	public final Add_modifierContext add_modifier() throws RecognitionException {
		Add_modifierContext _localctx = new Add_modifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_add_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_la = _input.LA(1);
			if ( !(_la==ADD_PROVINCE_MOD || _la==ADD_COUNTRY_MOD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(380);
			match(EQUALS);
			setState(381);
			match(LPAR);
			setState(382);
			match(NAME);
			setState(383);
			match(EQUALS);
			setState(384);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(385);
			match(DURATION);
			setState(386);
			match(EQUALS);
			setState(387);
			match(INT);
			setState(388);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

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
		enterRule(_localctx, 46, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(FACTOR);
			setState(391);
			match(EQUALS);
			setState(392);
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

	public static class Chance_modifierContext extends ParserRuleContext {
		public TerminalNode MODIFIER() { return getToken(EU4GrammarParser.MODIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final Chance_modifierContext chance_modifier() throws RecognitionException {
		Chance_modifierContext _localctx = new Chance_modifierContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_chance_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(MODIFIER);
			setState(395);
			match(EQUALS);
			setState(396);
			match(LPAR);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << MPOWER) | (1L << CALC_TRUE_IF) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << AI) | (1L << FACTOR))) != 0) || _la==IDENTIFIER) {
				{
				setState(399);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FACTOR:
					{
					setState(397);
					factor();
					}
					break;
				case AND:
				case OR:
				case NOT:
				case MPOWER:
				case CALC_TRUE_IF:
				case CUSTOM_TRIGGER_TOOLTIP:
				case TRIGGER_NAME:
				case SCOPE:
				case AI:
				case IDENTIFIER:
					{
					setState(398);
					trigger();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(404);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

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
		enterRule(_localctx, 50, RULE_mana_trigger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(MPOWER);
			setState(407);
			match(EQUALS);
			setState(408);
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
		public TriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger; }
	}

	public final TriggerContext trigger() throws RecognitionException {
		TriggerContext _localctx = new TriggerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_trigger);
		int _la;
		try {
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(410);
				_la = _input.LA(1);
				if ( !(_la==TRIGGER_NAME || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(411);
				match(EQUALS);
				setState(412);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << YES) | (1L << NO) | (1L << TAG) | (1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << SCOPE))) != 0) || _la==IDENTIFIER) ) {
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
				setState(413);
				scripted_trigger();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				custom_trigger_tooltip();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(415);
				calc_true_if();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(416);
				trigger_sub_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(417);
				ai_trigger();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(418);
				mana_trigger();
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

	public static class Calc_true_ifContext extends ParserRuleContext {
		public TerminalNode CALC_TRUE_IF() { return getToken(EU4GrammarParser.CALC_TRUE_IF, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final Calc_true_ifContext calc_true_if() throws RecognitionException {
		Calc_true_ifContext _localctx = new Calc_true_ifContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_calc_true_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(CALC_TRUE_IF);
			setState(422);
			match(EQUALS);
			setState(423);
			match(LPAR);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << MPOWER) | (1L << CALC_TRUE_IF) | (1L << AMOUNT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << AI))) != 0) || _la==IDENTIFIER) {
				{
				setState(426);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AMOUNT:
					{
					setState(424);
					amount();
					}
					break;
				case AND:
				case OR:
				case NOT:
				case MPOWER:
				case CALC_TRUE_IF:
				case CUSTOM_TRIGGER_TOOLTIP:
				case TRIGGER_NAME:
				case SCOPE:
				case AI:
				case IDENTIFIER:
					{
					setState(425);
					trigger();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(431);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scripted_triggerContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final Scripted_triggerContext scripted_trigger() throws RecognitionException {
		Scripted_triggerContext _localctx = new Scripted_triggerContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_scripted_trigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(IDENTIFIER);
			setState(434);
			match(EQUALS);
			setState(435);
			match(LPAR);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << MPOWER) | (1L << CALC_TRUE_IF) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << AI))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(436);
				trigger();
				}
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(442);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

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
		enterRule(_localctx, 58, RULE_ai_trigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(AI);
			setState(445);
			match(EQUALS);
			setState(446);
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

	public static class Trigger_sub_blockContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public TerminalNode OR() { return getToken(EU4GrammarParser.OR, 0); }
		public TerminalNode AND() { return getToken(EU4GrammarParser.AND, 0); }
		public TerminalNode NOT() { return getToken(EU4GrammarParser.NOT, 0); }
		public TerminalNode SCOPE() { return getToken(EU4GrammarParser.SCOPE, 0); }
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
		enterRule(_localctx, 60, RULE_trigger_sub_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << SCOPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(449);
			match(EQUALS);
			setState(450);
			match(LPAR);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << MPOWER) | (1L << CALC_TRUE_IF) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << AI))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(451);
				trigger();
				}
				}
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(457);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScopeContext extends ParserRuleContext {
		public TerminalNode SCOPE() { return getToken(EU4GrammarParser.SCOPE, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
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
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(SCOPE);
			setState(460);
			match(EQUALS);
			setState(461);
			match(LPAR);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << MPOWER) | (1L << IF) | (1L << CALC_TRUE_IF) | (1L << CUSTOM_TOOLTIP) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << EFFECT_NAME) | (1L << SCOPE) | (1L << ADD_PROVINCE_MOD) | (1L << ADD_COUNTRY_MOD) | (1L << AI))) != 0) || _la==IDENTIFIER) {
				{
				setState(465);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(462);
					effect();
					}
					break;
				case 2:
					{
					setState(463);
					trigger();
					}
					break;
				case 3:
					{
					setState(464);
					scope();
					}
					break;
				}
				}
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(470);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

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
		enterRule(_localctx, 64, RULE_tooltip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(TOOLTIP);
			setState(473);
			match(EQUALS);
			setState(474);
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
		enterRule(_localctx, 66, RULE_custom_tooltip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(CUSTOM_TOOLTIP);
			setState(477);
			match(EQUALS);
			setState(478);
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

	public static class Custom_trigger_tooltipContext extends ParserRuleContext {
		public TerminalNode CUSTOM_TRIGGER_TOOLTIP() { return getToken(EU4GrammarParser.CUSTOM_TRIGGER_TOOLTIP, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final Custom_trigger_tooltipContext custom_trigger_tooltip() throws RecognitionException {
		Custom_trigger_tooltipContext _localctx = new Custom_trigger_tooltipContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_custom_trigger_tooltip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(CUSTOM_TRIGGER_TOOLTIP);
			setState(481);
			match(EQUALS);
			setState(482);
			match(LPAR);
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOOLTIP) {
				{
				{
				setState(483);
				tooltip();
				}
				}
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << MPOWER) | (1L << CALC_TRUE_IF) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << AI))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(489);
				trigger();
				}
				}
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(495);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

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
		enterRule(_localctx, 70, RULE_desc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(DESC);
			setState(498);
			match(EQUALS);
			setState(499);
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

	public static class Buildings_triggerContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final Buildings_triggerContext buildings_trigger() throws RecognitionException {
		Buildings_triggerContext _localctx = new Buildings_triggerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_buildings_trigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_la = _input.LA(1);
			if ( !(_la==KEEP_TRIGGER || _la==BUILD_TRIGGER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(502);
			match(EQUALS);
			setState(503);
			match(LPAR);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << MPOWER) | (1L << CALC_TRUE_IF) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << AI))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(504);
				trigger();
				}
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(510);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Buildings_effectContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final Buildings_effectContext buildings_effect() throws RecognitionException {
		Buildings_effectContext _localctx = new Buildings_effectContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_buildings_effect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ON_BUILT) | (1L << ON_DESTORYED) | (1L << ON_CONSTRUCTION_STARTED) | (1L << ON_CONSTRUCTION_CANCELED) | (1L << ON_OBSOLETE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(513);
			match(EQUALS);
			setState(514);
			match(LPAR);
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << CUSTOM_TOOLTIP) | (1L << EFFECT_NAME) | (1L << SCOPE) | (1L << ADD_PROVINCE_MOD) | (1L << ADD_COUNTRY_MOD))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(515);
				effect();
				}
				}
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(521);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Manufactory_definesContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final Manufactory_definesContext manufactory_defines() throws RecognitionException {
		Manufactory_definesContext _localctx = new Manufactory_definesContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_manufactory_defines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			_la = _input.LA(1);
			if ( !(_la==MANUFACTORY || _la==BONUS_MANUFACTORY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(524);
			match(EQUALS);
			setState(525);
			match(LPAR);
			setState(527); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(526);
				match(IDENTIFIER);
				}
				}
				setState(529); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
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
		enterRule(_localctx, 78, RULE_bonus_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(BONUS_MODIFIER);
			setState(534);
			match(EQUALS);
			setState(535);
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
		enterRule(_localctx, 80, RULE_cost);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(COST);
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
		enterRule(_localctx, 82, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(TIME);
			setState(542);
			match(EQUALS);
			setState(543);
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

	public static class OnmapContext extends ParserRuleContext {
		public TerminalNode ONMAP() { return getToken(EU4GrammarParser.ONMAP, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public OnmapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onmap; }
	}

	public final OnmapContext onmap() throws RecognitionException {
		OnmapContext _localctx = new OnmapContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_onmap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(ONMAP);
			setState(546);
			match(EQUALS);
			setState(547);
			bool();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Show_seperateContext extends ParserRuleContext {
		public TerminalNode SHOW_SEPERATE() { return getToken(EU4GrammarParser.SHOW_SEPERATE, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public Show_seperateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_seperate; }
	}

	public final Show_seperateContext show_seperate() throws RecognitionException {
		Show_seperateContext _localctx = new Show_seperateContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_show_seperate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(SHOW_SEPERATE);
			setState(550);
			match(EQUALS);
			setState(551);
			bool();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

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
		enterRule(_localctx, 88, RULE_building_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COST:
				{
				setState(553);
				cost();
				}
				break;
			case TIME:
				{
				setState(554);
				time();
				}
				break;
			case ONMAP:
				{
				setState(555);
				onmap();
				}
				break;
			case SHOW_SEPERATE:
				{
				setState(556);
				show_seperate();
				}
				break;
			case INFLUENCING_FORT:
				{
				setState(557);
				influencing_fort();
				}
				break;
			case ALLOWED_IN_GOLD_PROVINCES:
				{
				setState(558);
				allowed_in_gold_province();
				}
				break;
			case MAKE_OBSOLETE:
				{
				setState(559);
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

	public static class Allowed_in_gold_provinceContext extends ParserRuleContext {
		public TerminalNode ALLOWED_IN_GOLD_PROVINCES() { return getToken(EU4GrammarParser.ALLOWED_IN_GOLD_PROVINCES, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public Allowed_in_gold_provinceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allowed_in_gold_province; }
	}

	public final Allowed_in_gold_provinceContext allowed_in_gold_province() throws RecognitionException {
		Allowed_in_gold_provinceContext _localctx = new Allowed_in_gold_provinceContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_allowed_in_gold_province);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(ALLOWED_IN_GOLD_PROVINCES);
			setState(563);
			match(EQUALS);
			setState(564);
			bool();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

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
		enterRule(_localctx, 92, RULE_make_obsolete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(MAKE_OBSOLETE);
			setState(567);
			match(EQUALS);
			setState(568);
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

	public static class Influencing_fortContext extends ParserRuleContext {
		public TerminalNode INFLUENCING_FORT() { return getToken(EU4GrammarParser.INFLUENCING_FORT, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public Influencing_fortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_influencing_fort; }
	}

	public final Influencing_fortContext influencing_fort() throws RecognitionException {
		Influencing_fortContext _localctx = new Influencing_fortContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_influencing_fort);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(INFLUENCING_FORT);
			setState(571);
			match(EQUALS);
			setState(572);
			bool();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuildingContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final BuildingContext building() throws RecognitionException {
		BuildingContext _localctx = new BuildingContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_building);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(IDENTIFIER);
			setState(575);
			match(EQUALS);
			setState(576);
			match(LPAR);
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (COST - 32)) | (1L << (TIME - 32)) | (1L << (ON_BUILT - 32)) | (1L << (ON_DESTORYED - 32)) | (1L << (ON_CONSTRUCTION_STARTED - 32)) | (1L << (ON_CONSTRUCTION_CANCELED - 32)) | (1L << (ON_OBSOLETE - 32)) | (1L << (KEEP_TRIGGER - 32)) | (1L << (BUILD_TRIGGER - 32)) | (1L << (MODIFIER - 32)) | (1L << (AI_WILL_DO - 32)) | (1L << (ALLOWED_IN_GOLD_PROVINCES - 32)) | (1L << (INFLUENCING_FORT - 32)) | (1L << (ONMAP - 32)) | (1L << (MAKE_OBSOLETE - 32)) | (1L << (MANUFACTORY - 32)) | (1L << (BONUS_MANUFACTORY - 32)) | (1L << (BONUS_MODIFIER - 32)) | (1L << (SHOW_SEPERATE - 32)))) != 0)) {
				{
				setState(584);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MANUFACTORY:
				case BONUS_MANUFACTORY:
					{
					setState(577);
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
					setState(578);
					building_attribute();
					}
					break;
				case ON_BUILT:
				case ON_DESTORYED:
				case ON_CONSTRUCTION_STARTED:
				case ON_CONSTRUCTION_CANCELED:
				case ON_OBSOLETE:
					{
					setState(579);
					buildings_effect();
					}
					break;
				case KEEP_TRIGGER:
				case BUILD_TRIGGER:
					{
					setState(580);
					buildings_trigger();
					}
					break;
				case BONUS_MODIFIER:
					{
					setState(581);
					bonus_modifier();
					}
					break;
				case MODIFIER:
					{
					setState(582);
					modifier_block();
					}
					break;
				case AI_WILL_DO:
					{
					setState(583);
					ai_will_do_block();
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
			setState(589);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BookmarkContext extends ParserRuleContext {
		public TerminalNode BOOKMARK() { return getToken(EU4GrammarParser.BOOKMARK, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
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
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public BookmarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bookmark; }
	}

	public final BookmarkContext bookmark() throws RecognitionException {
		BookmarkContext _localctx = new BookmarkContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_bookmark);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(BOOKMARK);
			setState(592);
			match(EQUALS);
			setState(593);
			match(LPAR);
			setState(594);
			name();
			setState(595);
			desc();
			setState(596);
			date();
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CENTER) {
				{
				{
				setState(597);
				match(CENTER);
				setState(598);
				match(EQUALS);
				setState(599);
				match(INT);
				}
				}
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(605);
			match(DEFAULT);
			setState(606);
			match(EQUALS);
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==YES || _la==NO) {
				{
				{
				setState(607);
				bool();
				}
				}
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COUNTRY) {
				{
				{
				setState(613);
				match(COUNTRY);
				setState(614);
				match(EQUALS);
				setState(615);
				match(TAG);
				}
				}
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EASY_COUNTRY) {
				{
				{
				setState(621);
				match(EASY_COUNTRY);
				setState(622);
				match(EQUALS);
				setState(623);
				match(TAG);
				}
				}
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(629);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ancestor_personalityContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
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
	}

	public final Ancestor_personalityContext ancestor_personality() throws RecognitionException {
		Ancestor_personalityContext _localctx = new Ancestor_personalityContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_ancestor_personality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(IDENTIFIER);
			setState(632);
			match(EQUALS);
			setState(633);
			match(LPAR);
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALLOW) | (1L << RULER_ALLOW) | (1L << HEIR_ALLOW) | (1L << CONSORT_ALLOW) | (1L << WAR_PRIORITY) | (1L << MODIFIER_NAME) | (1L << CHANCE) | (1L << AI_PICK_ANCESTOR))) != 0) || _la==IDENTIFIER) {
				{
				setState(675);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RULER_ALLOW:
					{
					{
					setState(634);
					match(RULER_ALLOW);
					setState(635);
					match(EQUALS);
					setState(636);
					match(LPAR);
					setState(640);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ALLOW) {
						{
						{
						setState(637);
						allow();
						}
						}
						setState(642);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(643);
					chance_block();
					setState(644);
					match(RPAR);
					}
					}
					break;
				case HEIR_ALLOW:
					{
					{
					setState(646);
					match(HEIR_ALLOW);
					setState(647);
					match(EQUALS);
					setState(648);
					match(LPAR);
					setState(652);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ALLOW) {
						{
						{
						setState(649);
						allow();
						}
						}
						setState(654);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(655);
					chance_block();
					setState(656);
					match(RPAR);
					}
					}
					break;
				case CONSORT_ALLOW:
					{
					{
					setState(658);
					match(CONSORT_ALLOW);
					setState(659);
					match(EQUALS);
					setState(660);
					match(LPAR);
					setState(664);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ALLOW) {
						{
						{
						setState(661);
						allow();
						}
						}
						setState(666);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(667);
					chance_block();
					setState(668);
					match(RPAR);
					}
					}
					break;
				case ALLOW:
					{
					setState(670);
					allow();
					}
					break;
				case CHANCE:
					{
					setState(671);
					chance_block();
					}
					break;
				case WAR_PRIORITY:
					{
					setState(672);
					war_priority();
					}
					break;
				case AI_PICK_ANCESTOR:
					{
					setState(673);
					ai_pick_ancestor();
					}
					break;
				case MODIFIER_NAME:
				case IDENTIFIER:
					{
					setState(674);
					modifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(680);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class War_priorityContext extends ParserRuleContext {
		public TerminalNode WAR_PRIORITY() { return getToken(EU4GrammarParser.WAR_PRIORITY, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
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
		enterRule(_localctx, 102, RULE_war_priority);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(WAR_PRIORITY);
			setState(683);
			match(EQUALS);
			setState(684);
			match(LPAR);
			setState(685);
			chance_modifier();
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

	public static class Ai_pick_ancestorContext extends ParserRuleContext {
		public TerminalNode AI_PICK_ANCESTOR() { return getToken(EU4GrammarParser.AI_PICK_ANCESTOR, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final Ai_pick_ancestorContext ai_pick_ancestor() throws RecognitionException {
		Ai_pick_ancestorContext _localctx = new Ai_pick_ancestorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_ai_pick_ancestor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(AI_PICK_ANCESTOR);
			setState(689);
			match(EQUALS);
			setState(690);
			match(LPAR);
			setState(691);
			factor();
			setState(692);
			chance_modifier();
			setState(693);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ai_personalityContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
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
	}

	public final Ai_personalityContext ai_personality() throws RecognitionException {
		Ai_personalityContext _localctx = new Ai_personalityContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_ai_personality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(IDENTIFIER);
			setState(696);
			match(EQUALS);
			setState(697);
			match(LPAR);
			setState(698);
			chance_block();
			setState(699);
			match(ICON);
			setState(700);
			match(EQUALS);
			setState(701);
			match(INT);
			setState(702);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

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
		enterRule(_localctx, 108, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(START);
			setState(705);
			match(EQUALS);
			setState(706);
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

	public static class Can_start_blockContext extends ParserRuleContext {
		public TerminalNode CAN_START() { return getToken(EU4GrammarParser.CAN_START, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final Can_start_blockContext can_start_block() throws RecognitionException {
		Can_start_blockContext _localctx = new Can_start_blockContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_can_start_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(CAN_START);
			setState(709);
			match(EQUALS);
			setState(710);
			match(LPAR);
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << MPOWER) | (1L << CALC_TRUE_IF) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << AI))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(711);
				trigger();
				}
				}
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(717);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectiveContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final ObjectiveContext objective() throws RecognitionException {
		ObjectiveContext _localctx = new ObjectiveContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_objective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(IDENTIFIER);
			setState(720);
			match(EQUALS);
			setState(721);
			match(LPAR);
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << MPOWER) | (1L << ALLOW) | (1L << CALC_TRUE_IF) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << AI))) != 0) || _la==IDENTIFIER) {
				{
				setState(724);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALLOW:
					{
					setState(722);
					allow();
					}
					break;
				case AND:
				case OR:
				case NOT:
				case MPOWER:
				case CALC_TRUE_IF:
				case CUSTOM_TRIGGER_TOOLTIP:
				case TRIGGER_NAME:
				case SCOPE:
				case AI:
				case IDENTIFIER:
					{
					setState(723);
					trigger();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Objectives_blockContext extends ParserRuleContext {
		public TerminalNode OBJECTIVES() { return getToken(EU4GrammarParser.OBJECTIVES, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final Objectives_blockContext objectives_block() throws RecognitionException {
		Objectives_blockContext _localctx = new Objectives_blockContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_objectives_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(OBJECTIVES);
			setState(732);
			match(EQUALS);
			setState(733);
			match(LPAR);
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(734);
				objective();
				}
				}
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(740);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbilityContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final AbilityContext ability() throws RecognitionException {
		AbilityContext _localctx = new AbilityContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_ability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			match(IDENTIFIER);
			setState(743);
			match(EQUALS);
			setState(744);
			match(LPAR);
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EFFECT) | (1L << ALLOW) | (1L << MODIFIER))) != 0)) {
				{
				setState(748);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALLOW:
					{
					setState(745);
					allow();
					}
					break;
				case EFFECT:
					{
					setState(746);
					effect_block();
					}
					break;
				case MODIFIER:
					{
					setState(747);
					modifier_block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(752);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(753);
			ai_will_do_block();
			setState(754);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ability_blockContext extends ParserRuleContext {
		public TerminalNode ABILITIES() { return getToken(EU4GrammarParser.ABILITIES, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final Ability_blockContext ability_block() throws RecognitionException {
		Ability_blockContext _localctx = new Ability_blockContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_ability_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(ABILITIES);
			setState(757);
			match(EQUALS);
			setState(758);
			match(LPAR);
			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(759);
				ability();
				}
				}
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(765);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AgeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(EU4GrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(EU4GrammarParser.EQUALS, i);
		}
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
	}

	public final AgeContext age() throws RecognitionException {
		AgeContext _localctx = new AgeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_age);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(IDENTIFIER);
			setState(768);
			match(EQUALS);
			setState(769);
			match(LPAR);
			setState(770);
			start();
			setState(771);
			can_start_block();
			setState(780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RELIGIOUS_CONFLICTS || _la==PAPACY) {
				{
				setState(778);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RELIGIOUS_CONFLICTS:
					{
					{
					setState(772);
					match(RELIGIOUS_CONFLICTS);
					setState(773);
					match(EQUALS);
					setState(774);
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
					setState(775);
					match(PAPACY);
					setState(776);
					match(EQUALS);
					setState(777);
					match(FLOAT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(783);
			objectives_block();
			setState(784);
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

	public static class AdvisorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final AdvisorContext advisor() throws RecognitionException {
		AdvisorContext _localctx = new AdvisorContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_advisor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			match(IDENTIFIER);
			setState(787);
			match(EQUALS);
			setState(788);
			match(LPAR);
			setState(789);
			monarch_power_advisor();
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SKILL_SACLED_MOD || _la==MODIFIER_NAME || _la==IDENTIFIER) {
				{
				setState(792);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODIFIER_NAME:
				case IDENTIFIER:
					{
					setState(790);
					modifier();
					}
					break;
				case SKILL_SACLED_MOD:
					{
					setState(791);
					skill_scaled_modifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(797);
			chance_block();
			setState(798);
			ai_will_do_block();
			setState(799);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

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
		enterRule(_localctx, 124, RULE_monarch_power_advisor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			match(MONARCH_POWER);
			setState(802);
			match(EQUALS);
			setState(803);
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

	public static class MissionSeriesContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final MissionSeriesContext missionSeries() throws RecognitionException {
		MissionSeriesContext _localctx = new MissionSeriesContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(IDENTIFIER);
			setState(806);
			match(EQUALS);
			setState(807);
			match(LPAR);
			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POTENTIAL || _la==AI || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (SLOT - 83)) | (1L << (GENERIC - 83)) | (1L << (HAS_COUNTRY_SHIELD - 83)) | (1L << (POTENTIAL_ON_LOAD - 83)) | (1L << (IDENTIFIER - 83)))) != 0)) {
				{
				setState(815);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SLOT:
					{
					setState(808);
					slot_missionSeries();
					}
					break;
				case GENERIC:
					{
					setState(809);
					generic_missionSeries();
					}
					break;
				case AI:
					{
					setState(810);
					ai_trigger();
					}
					break;
				case HAS_COUNTRY_SHIELD:
					{
					setState(811);
					hasCountryShield_missionSeries();
					}
					break;
				case POTENTIAL_ON_LOAD:
					{
					setState(812);
					potentialOnLoad_missionSeries();
					}
					break;
				case POTENTIAL:
					{
					setState(813);
					potential_missionSeries();
					}
					break;
				case IDENTIFIER:
					{
					setState(814);
					missionBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(820);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

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
		enterRule(_localctx, 128, RULE_slot_missionSeries);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			match(SLOT);
			setState(823);
			match(EQUALS);
			setState(824);
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
		enterRule(_localctx, 130, RULE_generic_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(GENERIC);
			setState(827);
			match(EQUALS);
			setState(828);
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
		enterRule(_localctx, 132, RULE_hasCountryShield_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			match(HAS_COUNTRY_SHIELD);
			setState(831);
			match(EQUALS);
			setState(832);
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

	public static class PotentialOnLoad_missionSeriesContext extends ParserRuleContext {
		public TerminalNode POTENTIAL_ON_LOAD() { return getToken(EU4GrammarParser.POTENTIAL_ON_LOAD, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final PotentialOnLoad_missionSeriesContext potentialOnLoad_missionSeries() throws RecognitionException {
		PotentialOnLoad_missionSeriesContext _localctx = new PotentialOnLoad_missionSeriesContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_potentialOnLoad_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			match(POTENTIAL_ON_LOAD);
			setState(835);
			match(EQUALS);
			setState(836);
			match(LPAR);
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << MPOWER) | (1L << CALC_TRUE_IF) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << AI))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(837);
				trigger();
				}
				}
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(843);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Potential_missionSeriesContext extends ParserRuleContext {
		public TerminalNode POTENTIAL() { return getToken(EU4GrammarParser.POTENTIAL, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final Potential_missionSeriesContext potential_missionSeries() throws RecognitionException {
		Potential_missionSeriesContext _localctx = new Potential_missionSeriesContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_potential_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			match(POTENTIAL);
			setState(846);
			match(EQUALS);
			setState(847);
			match(LPAR);
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << MPOWER) | (1L << CALC_TRUE_IF) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << AI))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(848);
				trigger();
				}
				}
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(854);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MissionBlockContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final MissionBlockContext missionBlock() throws RecognitionException {
		MissionBlockContext _localctx = new MissionBlockContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_missionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			match(IDENTIFIER);
			setState(857);
			match(EQUALS);
			setState(858);
			match(LPAR);
			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRIGGER) | (1L << EFFECT) | (1L << AI_WEIGHT))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (ICON - 87)) | (1L << (POSITION - 87)) | (1L << (COMPLETED_BY - 87)) | (1L << (REQUIRED_MISSIONS - 87)) | (1L << (PROVINCES_TO_HIGHLIGHT - 87)))) != 0)) {
				{
				setState(867);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ICON:
					{
					setState(859);
					icon_mission();
					}
					break;
				case POSITION:
					{
					setState(860);
					position_mission();
					}
					break;
				case COMPLETED_BY:
					{
					setState(861);
					completedBy_mission();
					}
					break;
				case REQUIRED_MISSIONS:
					{
					setState(862);
					requiredMissions_mission();
					}
					break;
				case PROVINCES_TO_HIGHLIGHT:
					{
					setState(863);
					provincesToHighlight_mission();
					}
					break;
				case TRIGGER:
					{
					setState(864);
					trigger_block();
					}
					break;
				case EFFECT:
					{
					setState(865);
					effect_block();
					}
					break;
				case AI_WEIGHT:
					{
					setState(866);
					aiWeight_mission();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		enterRule(_localctx, 140, RULE_icon_mission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			match(ICON);
			setState(875);
			match(EQUALS);
			setState(876);
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
		enterRule(_localctx, 142, RULE_position_mission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(POSITION);
			setState(879);
			match(EQUALS);
			setState(880);
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
		enterRule(_localctx, 144, RULE_completedBy_mission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			match(COMPLETED_BY);
			setState(883);
			match(EQUALS);
			setState(884);
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

	public static class RequiredMissions_missionContext extends ParserRuleContext {
		public TerminalNode REQUIRED_MISSIONS() { return getToken(EU4GrammarParser.REQUIRED_MISSIONS, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final RequiredMissions_missionContext requiredMissions_mission() throws RecognitionException {
		RequiredMissions_missionContext _localctx = new RequiredMissions_missionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_requiredMissions_mission);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			match(REQUIRED_MISSIONS);
			setState(887);
			match(EQUALS);
			setState(888);
			match(LPAR);
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(889);
				match(IDENTIFIER);
				}
				}
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(895);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProvincesToHighlight_missionContext extends ParserRuleContext {
		public TerminalNode PROVINCES_TO_HIGHLIGHT() { return getToken(EU4GrammarParser.PROVINCES_TO_HIGHLIGHT, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
	}

	public final ProvincesToHighlight_missionContext provincesToHighlight_mission() throws RecognitionException {
		ProvincesToHighlight_missionContext _localctx = new ProvincesToHighlight_missionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_provincesToHighlight_mission);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			match(PROVINCES_TO_HIGHLIGHT);
			setState(898);
			match(EQUALS);
			setState(899);
			match(LPAR);
			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << MPOWER) | (1L << CALC_TRUE_IF) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << AI))) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(900);
				trigger();
				}
				}
				setState(905);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AiWeight_missionContext extends ParserRuleContext {
		public TerminalNode AI_WEIGHT() { return getToken(EU4GrammarParser.AI_WEIGHT, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
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
		enterRule(_localctx, 150, RULE_aiWeight_mission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			match(AI_WEIGHT);
			setState(909);
			match(EQUALS);
			setState(910);
			match(LPAR);
			setState(911);
			factor();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3_\u0395\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\7\2\u009c\n\2\f\2\16\2\u009f\13\2\3\2"+
		"\7\2\u00a2\n\2\f\2\16\2\u00a5\13\2\3\2\7\2\u00a8\n\2\f\2\16\2\u00ab\13"+
		"\2\3\2\7\2\u00ae\n\2\f\2\16\2\u00b1\13\2\3\2\7\2\u00b4\n\2\f\2\16\2\u00b7"+
		"\13\2\3\2\7\2\u00ba\n\2\f\2\16\2\u00bd\13\2\5\2\u00bf\n\2\3\3\3\3\3\3"+
		"\7\3\u00c4\n\3\f\3\16\3\u00c7\13\3\3\3\3\3\3\4\3\4\5\4\u00cd\n\4\3\5\3"+
		"\5\3\5\3\5\7\5\u00d3\n\5\f\5\16\5\u00d6\13\5\3\5\3\5\3\6\3\6\3\6\3\6\7"+
		"\6\u00de\n\6\f\6\16\6\u00e1\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u00e9\n\7"+
		"\f\7\16\7\u00ec\13\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u00f4\n\b\f\b\16\b\u00f7"+
		"\13\b\3\b\7\b\u00fa\n\b\f\b\16\b\u00fd\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\7\t\u0106\n\t\f\t\16\t\u0109\13\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0111"+
		"\n\n\f\n\16\n\u0114\13\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u012c\n\20"+
		"\f\20\16\20\u012f\13\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u0137\n\21"+
		"\f\21\16\21\u013a\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u0143"+
		"\n\22\f\22\16\22\u0146\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u014f"+
		"\n\23\f\23\16\23\u0152\13\23\3\23\3\23\3\23\7\23\u0157\n\23\f\23\16\23"+
		"\u015a\13\23\3\24\3\24\3\24\3\24\7\24\u0160\n\24\f\24\16\24\u0163\13\24"+
		"\3\24\3\24\5\24\u0167\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u017c\n\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\7\32\u0192\n\32\f\32\16\32\u0195\13\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u01a6\n\34\3\35\3\35\3\35\3\35\3\35\7\35\u01ad\n\35\f\35\16\35\u01b0"+
		"\13\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u01b8\n\36\f\36\16\36\u01bb"+
		"\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \7 \u01c7\n \f \16 \u01ca"+
		"\13 \3 \3 \3!\3!\3!\3!\3!\3!\7!\u01d4\n!\f!\16!\u01d7\13!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\7$\u01e7\n$\f$\16$\u01ea\13$\3$\7$"+
		"\u01ed\n$\f$\16$\u01f0\13$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\7&\u01fc\n&\f"+
		"&\16&\u01ff\13&\3&\3&\3\'\3\'\3\'\3\'\7\'\u0207\n\'\f\'\16\'\u020a\13"+
		"\'\3\'\3\'\3(\3(\3(\3(\6(\u0212\n(\r(\16(\u0213\3(\3(\3)\3)\3)\3)\3*\3"+
		"*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\5.\u0233"+
		"\n.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u024b\n\62\f\62\16\62\u024e\13"+
		"\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u025b"+
		"\n\63\f\63\16\63\u025e\13\63\3\63\3\63\3\63\7\63\u0263\n\63\f\63\16\63"+
		"\u0266\13\63\3\63\3\63\3\63\7\63\u026b\n\63\f\63\16\63\u026e\13\63\3\63"+
		"\3\63\3\63\7\63\u0273\n\63\f\63\16\63\u0276\13\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\7\64\u0281\n\64\f\64\16\64\u0284\13\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u028d\n\64\f\64\16\64\u0290\13\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u0299\n\64\f\64\16\64\u029c\13"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u02a6\n\64\f\64\16\64"+
		"\u02a9\13\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38"+
		"\38\38\39\39\39\39\79\u02cb\n9\f9\169\u02ce\139\39\39\3:\3:\3:\3:\3:\7"+
		":\u02d7\n:\f:\16:\u02da\13:\3:\3:\3;\3;\3;\3;\7;\u02e2\n;\f;\16;\u02e5"+
		"\13;\3;\3;\3<\3<\3<\3<\3<\3<\7<\u02ef\n<\f<\16<\u02f2\13<\3<\3<\3<\3="+
		"\3=\3=\3=\7=\u02fb\n=\f=\16=\u02fe\13=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3"+
		">\3>\3>\7>\u030d\n>\f>\16>\u0310\13>\3>\3>\3>\3?\3?\3?\3?\3?\3?\7?\u031b"+
		"\n?\f?\16?\u031e\13?\3?\3?\3?\3?\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\7A\u0332\nA\fA\16A\u0335\13A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3D\3D"+
		"\3D\3D\3E\3E\3E\3E\7E\u0349\nE\fE\16E\u034c\13E\3E\3E\3F\3F\3F\3F\7F\u0354"+
		"\nF\fF\16F\u0357\13F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\7G\u0366\n"+
		"G\fG\16G\u0369\13G\3G\3G\3H\3H\3H\3H\3I\3I\3I\3I\3J\3J\3J\3J\3K\3K\3K"+
		"\3K\7K\u037d\nK\fK\16K\u0380\13K\3K\3K\3L\3L\3L\3L\7L\u0388\nL\fL\16L"+
		"\u038b\13L\3L\3L\3M\3M\3M\3M\3M\3M\3M\2\2N\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\2\20\6\2\5\6\t\f\66\66^^\3\2\5\6\4\2\64\64^^\4\2\65\65^^\3\2\67"+
		"8\4\2\13\13^^\4\2\n\n\f\f\4\2\63\63^^\5\2\3\4\7\7\66\66\3\2^_\4\2\13\13"+
		"^_\3\2-.\3\2(,\3\2EF\2\u03b9\2\u00be\3\2\2\2\4\u00c0\3\2\2\2\6\u00cc\3"+
		"\2\2\2\b\u00ce\3\2\2\2\n\u00d9\3\2\2\2\f\u00e4\3\2\2\2\16\u00ef\3\2\2"+
		"\2\20\u0100\3\2\2\2\22\u010c\3\2\2\2\24\u0117\3\2\2\2\26\u0119\3\2\2\2"+
		"\30\u011d\3\2\2\2\32\u0121\3\2\2\2\34\u0125\3\2\2\2\36\u0127\3\2\2\2 "+
		"\u0132\3\2\2\2\"\u013d\3\2\2\2$\u0149\3\2\2\2&\u015b\3\2\2\2(\u0168\3"+
		"\2\2\2*\u016c\3\2\2\2,\u017b\3\2\2\2.\u017d\3\2\2\2\60\u0188\3\2\2\2\62"+
		"\u018c\3\2\2\2\64\u0198\3\2\2\2\66\u01a5\3\2\2\28\u01a7\3\2\2\2:\u01b3"+
		"\3\2\2\2<\u01be\3\2\2\2>\u01c2\3\2\2\2@\u01cd\3\2\2\2B\u01da\3\2\2\2D"+
		"\u01de\3\2\2\2F\u01e2\3\2\2\2H\u01f3\3\2\2\2J\u01f7\3\2\2\2L\u0202\3\2"+
		"\2\2N\u020d\3\2\2\2P\u0217\3\2\2\2R\u021b\3\2\2\2T\u021f\3\2\2\2V\u0223"+
		"\3\2\2\2X\u0227\3\2\2\2Z\u0232\3\2\2\2\\\u0234\3\2\2\2^\u0238\3\2\2\2"+
		"`\u023c\3\2\2\2b\u0240\3\2\2\2d\u0251\3\2\2\2f\u0279\3\2\2\2h\u02ac\3"+
		"\2\2\2j\u02b2\3\2\2\2l\u02b9\3\2\2\2n\u02c2\3\2\2\2p\u02c6\3\2\2\2r\u02d1"+
		"\3\2\2\2t\u02dd\3\2\2\2v\u02e8\3\2\2\2x\u02f6\3\2\2\2z\u0301\3\2\2\2|"+
		"\u0314\3\2\2\2~\u0323\3\2\2\2\u0080\u0327\3\2\2\2\u0082\u0338\3\2\2\2"+
		"\u0084\u033c\3\2\2\2\u0086\u0340\3\2\2\2\u0088\u0344\3\2\2\2\u008a\u034f"+
		"\3\2\2\2\u008c\u035a\3\2\2\2\u008e\u036c\3\2\2\2\u0090\u0370\3\2\2\2\u0092"+
		"\u0374\3\2\2\2\u0094\u0378\3\2\2\2\u0096\u0383\3\2\2\2\u0098\u038e\3\2"+
		"\2\2\u009a\u009c\5|?\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00bf\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\u00a2\5z>\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2"+
		"\2\u00a3\u00a4\3\2\2\2\u00a4\u00bf\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8"+
		"\5l\67\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00bf\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ae\5f"+
		"\64\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00bf\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\5d"+
		"\63\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00bf\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00ba\5b"+
		"\62\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u009d\3\2"+
		"\2\2\u00be\u00a3\3\2\2\2\u00be\u00a9\3\2\2\2\u00be\u00af\3\2\2\2\u00be"+
		"\u00b5\3\2\2\2\u00be\u00bb\3\2\2\2\u00bf\3\3\2\2\2\u00c0\u00c5\7\16\2"+
		"\2\u00c1\u00c4\5\6\4\2\u00c2\u00c4\5$\23\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2"+
		"\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7\17\2\2\u00c9\5\3\2\2"+
		"\2\u00ca\u00cd\5,\27\2\u00cb\u00cd\5\4\3\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb"+
		"\3\2\2\2\u00cd\7\3\2\2\2\u00ce\u00cf\7\33\2\2\u00cf\u00d0\7\20\2\2\u00d0"+
		"\u00d4\7\16\2\2\u00d1\u00d3\5\66\34\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6"+
		"\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00d8\7\17\2\2\u00d8\t\3\2\2\2\u00d9\u00da\7\34\2"+
		"\2\u00da\u00db\7\20\2\2\u00db\u00df\7\16\2\2\u00dc\u00de\5,\27\2\u00dd"+
		"\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7\17\2\2\u00e3"+
		"\13\3\2\2\2\u00e4\u00e5\7;\2\2\u00e5\u00e6\7\20\2\2\u00e6\u00ea\7\16\2"+
		"\2\u00e7\u00e9\5(\25\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8"+
		"\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed"+
		"\u00ee\7\17\2\2\u00ee\r\3\2\2\2\u00ef\u00f0\7<\2\2\u00f0\u00f1\7\20\2"+
		"\2\u00f1\u00f5\7\16\2\2\u00f2\u00f4\5\60\31\2\u00f3\u00f2\3\2\2\2\u00f4"+
		"\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fb\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fa\5\62\32\2\u00f9\u00f8\3\2\2\2\u00fa"+
		"\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2"+
		"\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\7\17\2\2\u00ff\17\3\2\2\2\u0100\u0101"+
		"\7=\2\2\u0101\u0102\7\20\2\2\u0102\u0103\7\16\2\2\u0103\u0107\5\60\31"+
		"\2\u0104\u0106\5\62\32\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u010a\u010b\7\17\2\2\u010b\21\3\2\2\2\u010c\u010d\7\35\2\2\u010d"+
		"\u010e\7\20\2\2\u010e\u0112\7\16\2\2\u010f\u0111\5\66\34\2\u0110\u010f"+
		"\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\7\17\2\2\u0116\23\3\2\2"+
		"\2\u0117\u0118\t\2\2\2\u0118\25\3\2\2\2\u0119\u011a\7\37\2\2\u011a\u011b"+
		"\7\20\2\2\u011b\u011c\7\n\2\2\u011c\27\3\2\2\2\u011d\u011e\7!\2\2\u011e"+
		"\u011f\7\20\2\2\u011f\u0120\7\13\2\2\u0120\31\3\2\2\2\u0121\u0122\7 \2"+
		"\2\u0122\u0123\7\20\2\2\u0123\u0124\7\r\2\2\u0124\33\3\2\2\2\u0125\u0126"+
		"\t\3\2\2\u0126\35\3\2\2\2\u0127\u0128\7\30\2\2\u0128\u0129\7\20\2\2\u0129"+
		"\u012d\7\16\2\2\u012a\u012c\5\66\34\2\u012b\u012a\3\2\2\2\u012c\u012f"+
		"\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u0130\u0131\7\17\2\2\u0131\37\3\2\2\2\u0132\u0133\7\26"+
		"\2\2\u0133\u0134\7\20\2\2\u0134\u0138\7\16\2\2\u0135\u0137\5,\27\2\u0136"+
		"\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7\17\2\2\u013c"+
		"!\3\2\2\2\u013d\u013e\7\27\2\2\u013e\u013f\7\20\2\2\u013f\u0140\7\16\2"+
		"\2\u0140\u0144\5\36\20\2\u0141\u0143\5,\27\2\u0142\u0141\3\2\2\2\u0143"+
		"\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2"+
		"\2\2\u0146\u0144\3\2\2\2\u0147\u0148\7\17\2\2\u0148#\3\2\2\2\u0149\u014a"+
		"\7\25\2\2\u014a\u014b\7\20\2\2\u014b\u014c\7\16\2\2\u014c\u0150\5\36\20"+
		"\2\u014d\u014f\5,\27\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e"+
		"\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153"+
		"\u0158\7\17\2\2\u0154\u0157\5 \21\2\u0155\u0157\5\"\22\2\u0156\u0154\3"+
		"\2\2\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159%\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c\7^\2\2\u015c"+
		"\u0166\7\20\2\2\u015d\u0161\7\16\2\2\u015e\u0160\5\6\4\2\u015f\u015e\3"+
		"\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0167\7\17\2\2\u0165\u0167\7"+
		"\5\2\2\u0166\u015d\3\2\2\2\u0166\u0165\3\2\2\2\u0167\'\3\2\2\2\u0168\u0169"+
		"\t\4\2\2\u0169\u016a\7\20\2\2\u016a\u016b\t\2\2\2\u016b)\3\2\2\2\u016c"+
		"\u016d\7\31\2\2\u016d\u016e\7\20\2\2\u016e\u016f\7\16\2\2\u016f\u0170"+
		"\5\b\5\2\u0170\u0171\5\f\7\2\u0171\u0172\7\17\2\2\u0172+\3\2\2\2\u0173"+
		"\u0174\t\5\2\2\u0174\u0175\7\20\2\2\u0175\u017c\t\2\2\2\u0176\u017c\5"+
		"&\24\2\u0177\u017c\5$\23\2\u0178\u017c\5@!\2\u0179\u017c\5D#\2\u017a\u017c"+
		"\5.\30\2\u017b\u0173\3\2\2\2\u017b\u0176\3\2\2\2\u017b\u0177\3\2\2\2\u017b"+
		"\u0178\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017a\3\2\2\2\u017c-\3\2\2\2"+
		"\u017d\u017e\t\6\2\2\u017e\u017f\7\20\2\2\u017f\u0180\7\16\2\2\u0180\u0181"+
		"\7!\2\2\u0181\u0182\7\20\2\2\u0182\u0183\t\7\2\2\u0183\u0184\79\2\2\u0184"+
		"\u0185\7\20\2\2\u0185\u0186\7\n\2\2\u0186\u0187\7\17\2\2\u0187/\3\2\2"+
		"\2\u0188\u0189\7>\2\2\u0189\u018a\7\20\2\2\u018a\u018b\t\b\2\2\u018b\61"+
		"\3\2\2\2\u018c\u018d\7;\2\2\u018d\u018e\7\20\2\2\u018e\u0193\7\16\2\2"+
		"\u018f\u0192\5\60\31\2\u0190\u0192\5\66\34\2\u0191\u018f\3\2\2\2\u0191"+
		"\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2"+
		"\2\2\u0194\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\7\17\2\2\u0197"+
		"\63\3\2\2\2\u0198\u0199\7\b\2\2\u0199\u019a\7\20\2\2\u019a\u019b\7\n\2"+
		"\2\u019b\65\3\2\2\2\u019c\u019d\t\t\2\2\u019d\u019e\7\20\2\2\u019e\u01a6"+
		"\t\2\2\2\u019f\u01a6\5:\36\2\u01a0\u01a6\5F$\2\u01a1\u01a6\58\35\2\u01a2"+
		"\u01a6\5> \2\u01a3\u01a6\5<\37\2\u01a4\u01a6\5\64\33\2\u01a5\u019c\3\2"+
		"\2\2\u01a5\u019f\3\2\2\2\u01a5\u01a0\3\2\2\2\u01a5\u01a1\3\2\2\2\u01a5"+
		"\u01a2\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6\67\3\2\2"+
		"\2\u01a7\u01a8\7\36\2\2\u01a8\u01a9\7\20\2\2\u01a9\u01ae\7\16\2\2\u01aa"+
		"\u01ad\5\26\f\2\u01ab\u01ad\5\66\34\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab"+
		"\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01b1\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2\7\17\2\2\u01b29\3\2\2\2"+
		"\u01b3\u01b4\7^\2\2\u01b4\u01b5\7\20\2\2\u01b5\u01b9\7\16\2\2\u01b6\u01b8"+
		"\5\66\34\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2"+
		"\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bd"+
		"\7\17\2\2\u01bd;\3\2\2\2\u01be\u01bf\7:\2\2\u01bf\u01c0\7\20\2\2\u01c0"+
		"\u01c1\t\3\2\2\u01c1=\3\2\2\2\u01c2\u01c3\t\n\2\2\u01c3\u01c4\7\20\2\2"+
		"\u01c4\u01c8\7\16\2\2\u01c5\u01c7\5\66\34\2\u01c6\u01c5\3\2\2\2\u01c7"+
		"\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\3\2"+
		"\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01cc\7\17\2\2\u01cc?\3\2\2\2\u01cd\u01ce"+
		"\7\66\2\2\u01ce\u01cf\7\20\2\2\u01cf\u01d5\7\16\2\2\u01d0\u01d4\5,\27"+
		"\2\u01d1\u01d4\5\66\34\2\u01d2\u01d4\5@!\2\u01d3\u01d0\3\2\2\2\u01d3\u01d1"+
		"\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9\7\17"+
		"\2\2\u01d9A\3\2\2\2\u01da\u01db\7/\2\2\u01db\u01dc\7\20\2\2\u01dc\u01dd"+
		"\t\13\2\2\u01ddC\3\2\2\2\u01de\u01df\7\60\2\2\u01df\u01e0\7\20\2\2\u01e0"+
		"\u01e1\t\13\2\2\u01e1E\3\2\2\2\u01e2\u01e3\7\62\2\2\u01e3\u01e4\7\20\2"+
		"\2\u01e4\u01e8\7\16\2\2\u01e5\u01e7\5B\"\2\u01e6\u01e5\3\2\2\2\u01e7\u01ea"+
		"\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ee\3\2\2\2\u01ea"+
		"\u01e8\3\2\2\2\u01eb\u01ed\5\66\34\2\u01ec\u01eb\3\2\2\2\u01ed\u01f0\3"+
		"\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0"+
		"\u01ee\3\2\2\2\u01f1\u01f2\7\17\2\2\u01f2G\3\2\2\2\u01f3\u01f4\7\61\2"+
		"\2\u01f4\u01f5\7\20\2\2\u01f5\u01f6\t\f\2\2\u01f6I\3\2\2\2\u01f7\u01f8"+
		"\t\r\2\2\u01f8\u01f9\7\20\2\2\u01f9\u01fd\7\16\2\2\u01fa\u01fc\5\66\34"+
		"\2\u01fb\u01fa\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe"+
		"\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0201\7\17\2\2"+
		"\u0201K\3\2\2\2\u0202\u0203\t\16\2\2\u0203\u0204\7\20\2\2\u0204\u0208"+
		"\7\16\2\2\u0205\u0207\5,\27\2\u0206\u0205\3\2\2\2\u0207\u020a\3\2\2\2"+
		"\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b\3\2\2\2\u020a\u0208"+
		"\3\2\2\2\u020b\u020c\7\17\2\2\u020cM\3\2\2\2\u020d\u020e\t\17\2\2\u020e"+
		"\u020f\7\20\2\2\u020f\u0211\7\16\2\2\u0210\u0212\7^\2\2\u0211\u0210\3"+
		"\2\2\2\u0212\u0213\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214"+
		"\u0215\3\2\2\2\u0215\u0216\7\17\2\2\u0216O\3\2\2\2\u0217\u0218\7G\2\2"+
		"\u0218\u0219\7\20\2\2\u0219\u021a\5\24\13\2\u021aQ\3\2\2\2\u021b\u021c"+
		"\7\"\2\2\u021c\u021d\7\20\2\2\u021d\u021e\7\n\2\2\u021eS\3\2\2\2\u021f"+
		"\u0220\7#\2\2\u0220\u0221\7\20\2\2\u0221\u0222\7\n\2\2\u0222U\3\2\2\2"+
		"\u0223\u0224\7C\2\2\u0224\u0225\7\20\2\2\u0225\u0226\5\34\17\2\u0226W"+
		"\3\2\2\2\u0227\u0228\7H\2\2\u0228\u0229\7\20\2\2\u0229\u022a\5\34\17\2"+
		"\u022aY\3\2\2\2\u022b\u0233\5R*\2\u022c\u0233\5T+\2\u022d\u0233\5V,\2"+
		"\u022e\u0233\5X-\2\u022f\u0233\5`\61\2\u0230\u0233\5\\/\2\u0231\u0233"+
		"\5^\60\2\u0232\u022b\3\2\2\2\u0232\u022c\3\2\2\2\u0232\u022d\3\2\2\2\u0232"+
		"\u022e\3\2\2\2\u0232\u022f\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0231\3\2"+
		"\2\2\u0233[\3\2\2\2\u0234\u0235\7A\2\2\u0235\u0236\7\20\2\2\u0236\u0237"+
		"\5\34\17\2\u0237]\3\2\2\2\u0238\u0239\7D\2\2\u0239\u023a\7\20\2\2\u023a"+
		"\u023b\7^\2\2\u023b_\3\2\2\2\u023c\u023d\7B\2\2\u023d\u023e\7\20\2\2\u023e"+
		"\u023f\5\34\17\2\u023fa\3\2\2\2\u0240\u0241\7^\2\2\u0241\u0242\7\20\2"+
		"\2\u0242\u024c\7\16\2\2\u0243\u024b\5N(\2\u0244\u024b\5Z.\2\u0245\u024b"+
		"\5L\'\2\u0246\u024b\5J&\2\u0247\u024b\5P)\2\u0248\u024b\5\f\7\2\u0249"+
		"\u024b\5\20\t\2\u024a\u0243\3\2\2\2\u024a\u0244\3\2\2\2\u024a\u0245\3"+
		"\2\2\2\u024a\u0246\3\2\2\2\u024a\u0247\3\2\2\2\u024a\u0248\3\2\2\2\u024a"+
		"\u0249\3\2\2\2\u024b\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2"+
		"\2\2\u024d\u024f\3\2\2\2\u024e\u024c\3\2\2\2\u024f\u0250\7\17\2\2\u0250"+
		"c\3\2\2\2\u0251\u0252\7I\2\2\u0252\u0253\7\20\2\2\u0253\u0254\7\16\2\2"+
		"\u0254\u0255\5\30\r\2\u0255\u0256\5H%\2\u0256\u025c\5\32\16\2\u0257\u0258"+
		"\7K\2\2\u0258\u0259\7\20\2\2\u0259\u025b\7\n\2\2\u025a\u0257\3\2\2\2\u025b"+
		"\u025e\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025f\3\2"+
		"\2\2\u025e\u025c\3\2\2\2\u025f\u0260\7J\2\2\u0260\u0264\7\20\2\2\u0261"+
		"\u0263\5\34\17\2\u0262\u0261\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3"+
		"\2\2\2\u0264\u0265\3\2\2\2\u0265\u026c\3\2\2\2\u0266\u0264\3\2\2\2\u0267"+
		"\u0268\7M\2\2\u0268\u0269\7\20\2\2\u0269\u026b\7\t\2\2\u026a\u0267\3\2"+
		"\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d"+
		"\u0274\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0270\7L\2\2\u0270\u0271\7\20"+
		"\2\2\u0271\u0273\7\t\2\2\u0272\u026f\3\2\2\2\u0273\u0276\3\2\2\2\u0274"+
		"\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0277\3\2\2\2\u0276\u0274\3\2"+
		"\2\2\u0277\u0278\7\17\2\2\u0278e\3\2\2\2\u0279\u027a\7^\2\2\u027a\u027b"+
		"\7\20\2\2\u027b\u02a7\7\16\2\2\u027c\u027d\7$\2\2\u027d\u027e\7\20\2\2"+
		"\u027e\u0282\7\16\2\2\u027f\u0281\5\22\n\2\u0280\u027f\3\2\2\2\u0281\u0284"+
		"\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0285\3\2\2\2\u0284"+
		"\u0282\3\2\2\2\u0285\u0286\5\16\b\2\u0286\u0287\7\17\2\2\u0287\u02a6\3"+
		"\2\2\2\u0288\u0289\7%\2\2\u0289\u028a\7\20\2\2\u028a\u028e\7\16\2\2\u028b"+
		"\u028d\5\22\n\2\u028c\u028b\3\2\2\2\u028d\u0290\3\2\2\2\u028e\u028c\3"+
		"\2\2\2\u028e\u028f\3\2\2\2\u028f\u0291\3\2\2\2\u0290\u028e\3\2\2\2\u0291"+
		"\u0292\5\16\b\2\u0292\u0293\7\17\2\2\u0293\u02a6\3\2\2\2\u0294\u0295\7"+
		"&\2\2\u0295\u0296\7\20\2\2\u0296\u029a\7\16\2\2\u0297\u0299\5\22\n\2\u0298"+
		"\u0297\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2"+
		"\2\2\u029b\u029d\3\2\2\2\u029c\u029a\3\2\2\2\u029d\u029e\5\16\b\2\u029e"+
		"\u029f\7\17\2\2\u029f\u02a6\3\2\2\2\u02a0\u02a6\5\22\n\2\u02a1\u02a6\5"+
		"\16\b\2\u02a2\u02a6\5h\65\2\u02a3\u02a6\5j\66\2\u02a4\u02a6\5(\25\2\u02a5"+
		"\u027c\3\2\2\2\u02a5\u0288\3\2\2\2\u02a5\u0294\3\2\2\2\u02a5\u02a0\3\2"+
		"\2\2\u02a5\u02a1\3\2\2\2\u02a5\u02a2\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5"+
		"\u02a4\3\2\2\2\u02a6\u02a9\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2"+
		"\2\2\u02a8\u02aa\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aa\u02ab\7\17\2\2\u02ab"+
		"g\3\2\2\2\u02ac\u02ad\7\'\2\2\u02ad\u02ae\7\20\2\2\u02ae\u02af\7\16\2"+
		"\2\u02af\u02b0\5\62\32\2\u02b0\u02b1\7\17\2\2\u02b1i\3\2\2\2\u02b2\u02b3"+
		"\7@\2\2\u02b3\u02b4\7\20\2\2\u02b4\u02b5\7\16\2\2\u02b5\u02b6\5\60\31"+
		"\2\u02b6\u02b7\5\62\32\2\u02b7\u02b8\7\17\2\2\u02b8k\3\2\2\2\u02b9\u02ba"+
		"\7^\2\2\u02ba\u02bb\7\20\2\2\u02bb\u02bc\7\16\2\2\u02bc\u02bd\5\16\b\2"+
		"\u02bd\u02be\7Y\2\2\u02be\u02bf\7\20\2\2\u02bf\u02c0\7\n\2\2\u02c0\u02c1"+
		"\7\17\2\2\u02c1m\3\2\2\2\u02c2\u02c3\7O\2\2\u02c3\u02c4\7\20\2\2\u02c4"+
		"\u02c5\7\n\2\2\u02c5o\3\2\2\2\u02c6\u02c7\7P\2\2\u02c7\u02c8\7\20\2\2"+
		"\u02c8\u02cc\7\16\2\2\u02c9\u02cb\5\66\34\2\u02ca\u02c9\3\2\2\2\u02cb"+
		"\u02ce\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02cf\3\2"+
		"\2\2\u02ce\u02cc\3\2\2\2\u02cf\u02d0\7\17\2\2\u02d0q\3\2\2\2\u02d1\u02d2"+
		"\7^\2\2\u02d2\u02d3\7\20\2\2\u02d3\u02d8\7\16\2\2\u02d4\u02d7\5\22\n\2"+
		"\u02d5\u02d7\5\66\34\2\u02d6\u02d4\3\2\2\2\u02d6\u02d5\3\2\2\2\u02d7\u02da"+
		"\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02db\3\2\2\2\u02da"+
		"\u02d8\3\2\2\2\u02db\u02dc\7\17\2\2\u02dcs\3\2\2\2\u02dd\u02de\7Q\2\2"+
		"\u02de\u02df\7\20\2\2\u02df\u02e3\7\16\2\2\u02e0\u02e2\5r:\2\u02e1\u02e0"+
		"\3\2\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4"+
		"\u02e6\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e6\u02e7\7\17\2\2\u02e7u\3\2\2\2"+
		"\u02e8\u02e9\7^\2\2\u02e9\u02ea\7\20\2\2\u02ea\u02f0\7\16\2\2\u02eb\u02ef"+
		"\5\22\n\2\u02ec\u02ef\5\n\6\2\u02ed\u02ef\5\f\7\2\u02ee\u02eb\3\2\2\2"+
		"\u02ee\u02ec\3\2\2\2\u02ee\u02ed\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0\u02ee"+
		"\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f3\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f3"+
		"\u02f4\5\20\t\2\u02f4\u02f5\7\17\2\2\u02f5w\3\2\2\2\u02f6\u02f7\7R\2\2"+
		"\u02f7\u02f8\7\20\2\2\u02f8\u02fc\7\16\2\2\u02f9\u02fb\5v<\2\u02fa\u02f9"+
		"\3\2\2\2\u02fb\u02fe\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd"+
		"\u02ff\3\2\2\2\u02fe\u02fc\3\2\2\2\u02ff\u0300\7\17\2\2\u0300y\3\2\2\2"+
		"\u0301\u0302\7^\2\2\u0302\u0303\7\20\2\2\u0303\u0304\7\16\2\2\u0304\u0305"+
		"\5n8\2\u0305\u030e\5p9\2\u0306\u0307\7S\2\2\u0307\u0308\7\20\2\2\u0308"+
		"\u030d\t\3\2\2\u0309\u030a\7T\2\2\u030a\u030b\7\20\2\2\u030b\u030d\7\f"+
		"\2\2\u030c\u0306\3\2\2\2\u030c\u0309\3\2\2\2\u030d\u0310\3\2\2\2\u030e"+
		"\u030c\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0311\3\2\2\2\u0310\u030e\3\2"+
		"\2\2\u0311\u0312\5t;\2\u0312\u0313\5x=\2\u0313{\3\2\2\2\u0314\u0315\7"+
		"^\2\2\u0315\u0316\7\20\2\2\u0316\u0317\7\16\2\2\u0317\u031c\5~@\2\u0318"+
		"\u031b\5(\25\2\u0319\u031b\5*\26\2\u031a\u0318\3\2\2\2\u031a\u0319\3\2"+
		"\2\2\u031b\u031e\3\2\2\2\u031c\u031a\3\2\2\2\u031c\u031d\3\2\2\2\u031d"+
		"\u031f\3\2\2\2\u031e\u031c\3\2\2\2\u031f\u0320\5\16\b\2\u0320\u0321\5"+
		"\20\t\2\u0321\u0322\7\17\2\2\u0322}\3\2\2\2\u0323\u0324\7N\2\2\u0324\u0325"+
		"\7\20\2\2\u0325\u0326\7\b\2\2\u0326\177\3\2\2\2\u0327\u0328\7^\2\2\u0328"+
		"\u0329\7\20\2\2\u0329\u0333\7\16\2\2\u032a\u0332\5\u0082B\2\u032b\u0332"+
		"\5\u0084C\2\u032c\u0332\5<\37\2\u032d\u0332\5\u0086D\2\u032e\u0332\5\u0088"+
		"E\2\u032f\u0332\5\u008aF\2\u0330\u0332\5\u008cG\2\u0331\u032a\3\2\2\2"+
		"\u0331\u032b\3\2\2\2\u0331\u032c\3\2\2\2\u0331\u032d\3\2\2\2\u0331\u032e"+
		"\3\2\2\2\u0331\u032f\3\2\2\2\u0331\u0330\3\2\2\2\u0332\u0335\3\2\2\2\u0333"+
		"\u0331\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0336\3\2\2\2\u0335\u0333\3\2"+
		"\2\2\u0336\u0337\7\17\2\2\u0337\u0081\3\2\2\2\u0338\u0339\7U\2\2\u0339"+
		"\u033a\7\20\2\2\u033a\u033b\7\n\2\2\u033b\u0083\3\2\2\2\u033c\u033d\7"+
		"V\2\2\u033d\u033e\7\20\2\2\u033e\u033f\t\3\2\2\u033f\u0085\3\2\2\2\u0340"+
		"\u0341\7W\2\2\u0341\u0342\7\20\2\2\u0342\u0343\t\3\2\2\u0343\u0087\3\2"+
		"\2\2\u0344\u0345\7X\2\2\u0345\u0346\7\20\2\2\u0346\u034a\7\16\2\2\u0347"+
		"\u0349\5\66\34\2\u0348\u0347\3\2\2\2\u0349\u034c\3\2\2\2\u034a\u0348\3"+
		"\2\2\2\u034a\u034b\3\2\2\2\u034b\u034d\3\2\2\2\u034c\u034a\3\2\2\2\u034d"+
		"\u034e\7\17\2\2\u034e\u0089\3\2\2\2\u034f\u0350\7\32\2\2\u0350\u0351\7"+
		"\20\2\2\u0351\u0355\7\16\2\2\u0352\u0354\5\66\34\2\u0353\u0352\3\2\2\2"+
		"\u0354\u0357\3\2\2\2\u0355\u0353\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0358"+
		"\3\2\2\2\u0357\u0355\3\2\2\2\u0358\u0359\7\17\2\2\u0359\u008b\3\2\2\2"+
		"\u035a\u035b\7^\2\2\u035b\u035c\7\20\2\2\u035c\u0367\7\16\2\2\u035d\u0366"+
		"\5\u008eH\2\u035e\u0366\5\u0090I\2\u035f\u0366\5\u0092J\2\u0360\u0366"+
		"\5\u0094K\2\u0361\u0366\5\u0096L\2\u0362\u0366\5\b\5\2\u0363\u0366\5\n"+
		"\6\2\u0364\u0366\5\u0098M\2\u0365\u035d\3\2\2\2\u0365\u035e\3\2\2\2\u0365"+
		"\u035f\3\2\2\2\u0365\u0360\3\2\2\2\u0365\u0361\3\2\2\2\u0365\u0362\3\2"+
		"\2\2\u0365\u0363\3\2\2\2\u0365\u0364\3\2\2\2\u0366\u0369\3\2\2\2\u0367"+
		"\u0365\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u036a\3\2\2\2\u0369\u0367\3\2"+
		"\2\2\u036a\u036b\7\17\2\2\u036b\u008d\3\2\2\2\u036c\u036d\7Y\2\2\u036d"+
		"\u036e\7\20\2\2\u036e\u036f\7^\2\2\u036f\u008f\3\2\2\2\u0370\u0371\7Z"+
		"\2\2\u0371\u0372\7\20\2\2\u0372\u0373\7\n\2\2\u0373\u0091\3\2\2\2\u0374"+
		"\u0375\7[\2\2\u0375\u0376\7\20\2\2\u0376\u0377\7\13\2\2\u0377\u0093\3"+
		"\2\2\2\u0378\u0379\7\\\2\2\u0379\u037a\7\20\2\2\u037a\u037e\7\16\2\2\u037b"+
		"\u037d\7^\2\2\u037c\u037b\3\2\2\2\u037d\u0380\3\2\2\2\u037e\u037c\3\2"+
		"\2\2\u037e\u037f\3\2\2\2\u037f\u0381\3\2\2\2\u0380\u037e\3\2\2\2\u0381"+
		"\u0382\7\17\2\2\u0382\u0095\3\2\2\2\u0383\u0384\7]\2\2\u0384\u0385\7\20"+
		"\2\2\u0385\u0389\7\16\2\2\u0386\u0388\5\66\34\2\u0387\u0386\3\2\2\2\u0388"+
		"\u038b\3\2\2\2\u0389\u0387\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038c\3\2"+
		"\2\2\u038b\u0389\3\2\2\2\u038c\u038d\7\17\2\2\u038d\u0097\3\2\2\2\u038e"+
		"\u038f\7?\2\2\u038f\u0390\7\20\2\2\u0390\u0391\7\16\2\2\u0391\u0392\5"+
		"\60\31\2\u0392\u0393\7\17\2\2\u0393\u0099\3\2\2\2I\u009d\u00a3\u00a9\u00af"+
		"\u00b5\u00bb\u00be\u00c3\u00c5\u00cc\u00d4\u00df\u00ea\u00f5\u00fb\u0107"+
		"\u0112\u012d\u0138\u0144\u0150\u0156\u0158\u0161\u0166\u017b\u0191\u0193"+
		"\u01a5\u01ac\u01ae\u01b9\u01c8\u01d3\u01d5\u01e8\u01ee\u01fd\u0208\u0213"+
		"\u0232\u024a\u024c\u025c\u0264\u026c\u0274\u0282\u028e\u029a\u02a5\u02a7"+
		"\u02cc\u02d6\u02d8\u02e3\u02ee\u02f0\u02fc\u030c\u030e\u031a\u031c\u0331"+
		"\u0333\u034a\u0355\u0365\u0367\u037e\u0389";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}