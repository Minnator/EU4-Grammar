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
		TOOLTIP_STRING=11, LPAR=12, RPAR=13, EQUALS=14, PLUS=15, MINUS=16, WHITESPACE=17, 
		SINGLE_LINE_COMMENT=18, IF=19, ELSE=20, ELSE_IF=21, LIMIT=22, SKILL_SACLED_MOD=23, 
		POTENTIAL=24, TRIGGER=25, EFFECT=26, ALLOW=27, TOOLTIP=28, CUSTOM_TOOLTIP=29, 
		DESC=30, CUSTOM_TRIGGER_TOOLTIP=31, TRIGGER_NAME=32, MODIFIER_NAME=33, 
		EFFECT_NAME=34, SCOPE=35, MONARCH_POWER=36, START=37, CAN_START=38, OBJECTIVES=39, 
		ABILITIES=40, RELIGIOUS_CONFLICTS=41, PAPACY=42, AI=43, MODIFIER=44, CHANCE=45, 
		AI_WILL_DO=46, FACTOR=47, AI_WEIGHT=48, SLOT=49, GENERIC=50, HAS_COUNTRY_SHIELD=51, 
		POTENTIAL_ON_LOAD=52, ICON=53, POSITION=54, COMPLETED_BY=55, REQUIRED_MISSIONS=56, 
		PROVINCES_TO_HIGHLIGHT=57, IDENTIFIER=58;
	public static final int
		RULE_file = 0, RULE_block = 1, RULE_statement = 2, RULE_trigger_block = 3, 
		RULE_effect_block = 4, RULE_modifier_block = 5, RULE_chance_block = 6, 
		RULE_ai_will_do_block = 7, RULE_allow = 8, RULE_value = 9, RULE_limit = 10, 
		RULE_eLSE = 11, RULE_else_if = 12, RULE_if_statement = 13, RULE_scriptedEffect = 14, 
		RULE_effect = 15, RULE_modifier = 16, RULE_skill_scaled_modifier = 17, 
		RULE_factor = 18, RULE_chance_modifier = 19, RULE_trigger = 20, RULE_scripted_trigger = 21, 
		RULE_scope = 22, RULE_or_block = 23, RULE_and_block = 24, RULE_not_block = 25, 
		RULE_tooltip = 26, RULE_custom_tooltip = 27, RULE_custom_trigger_tooltip = 28, 
		RULE_desc = 29, RULE_start = 30, RULE_can_start_block = 31, RULE_objective = 32, 
		RULE_objectives_block = 33, RULE_ability = 34, RULE_ability_block = 35, 
		RULE_age = 36, RULE_advisor = 37, RULE_monarch_power_advisor = 38, RULE_missionSeries = 39, 
		RULE_slot_missionSeries = 40, RULE_generic_missionSeries = 41, RULE_ai_missionSeries = 42, 
		RULE_hasCountryShield_missionSeries = 43, RULE_potentialOnLoad_missionSeries = 44, 
		RULE_potential_missionSeries = 45, RULE_missionBlock = 46, RULE_icon_mission = 47, 
		RULE_position_mission = 48, RULE_completedBy_mission = 49, RULE_requiredMissions_mission = 50, 
		RULE_provincesToHighlight_mission = 51, RULE_aiWeight_mission = 52;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "block", "statement", "trigger_block", "effect_block", "modifier_block", 
			"chance_block", "ai_will_do_block", "allow", "value", "limit", "eLSE", 
			"else_if", "if_statement", "scriptedEffect", "effect", "modifier", "skill_scaled_modifier", 
			"factor", "chance_modifier", "trigger", "scripted_trigger", "scope", 
			"or_block", "and_block", "not_block", "tooltip", "custom_tooltip", "custom_trigger_tooltip", 
			"desc", "start", "can_start_block", "objective", "objectives_block", 
			"ability", "ability_block", "age", "advisor", "monarch_power_advisor", 
			"missionSeries", "slot_missionSeries", "generic_missionSeries", "ai_missionSeries", 
			"hasCountryShield_missionSeries", "potentialOnLoad_missionSeries", "potential_missionSeries", 
			"missionBlock", "icon_mission", "position_mission", "completedBy_mission", 
			"requiredMissions_mission", "provincesToHighlight_mission", "aiWeight_mission"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'AND'", "'OR'", null, null, null, null, null, null, null, null, 
			null, "'{'", "'}'", "'='", "'+'", "'-'", null, null, "'if'", "'else'", 
			"'else_if'", "'limit'", "'skill_scaled_modifier'", "'potential'", "'trigger'", 
			"'effect'", "'allow'", "'tooltip'", "'custom_tooltip'", "'desc'", "'custom_trigger_tooltip'", 
			null, null, "'add_core'", null, "'monarch_power'", "'start'", "'can_start'", 
			"'objectives'", "'abilities'", "'religious_conflicts'", "'papacy'", "'ai'", 
			"'modifier'", "'chance'", "'ai_will_do'", "'factor'", "'ai_weight'", 
			"'slot'", "'generic'", "'has_country_shield'", "'potential_on_load'", 
			"'icon'", "'position'", "'completed_by'", "'required_missions'", "'provinces_to_highlight'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "YES", "NO", "NOT", "MPOWER", "TAG", "INT", "STRING", 
			"FLOAT", "TOOLTIP_STRING", "LPAR", "RPAR", "EQUALS", "PLUS", "MINUS", 
			"WHITESPACE", "SINGLE_LINE_COMMENT", "IF", "ELSE", "ELSE_IF", "LIMIT", 
			"SKILL_SACLED_MOD", "POTENTIAL", "TRIGGER", "EFFECT", "ALLOW", "TOOLTIP", 
			"CUSTOM_TOOLTIP", "DESC", "CUSTOM_TRIGGER_TOOLTIP", "TRIGGER_NAME", "MODIFIER_NAME", 
			"EFFECT_NAME", "SCOPE", "MONARCH_POWER", "START", "CAN_START", "OBJECTIVES", 
			"ABILITIES", "RELIGIOUS_CONFLICTS", "PAPACY", "AI", "MODIFIER", "CHANCE", 
			"AI_WILL_DO", "FACTOR", "AI_WEIGHT", "SLOT", "GENERIC", "HAS_COUNTRY_SHIELD", 
			"POTENTIAL_ON_LOAD", "ICON", "POSITION", "COMPLETED_BY", "REQUIRED_MISSIONS", 
			"PROVINCES_TO_HIGHLIGHT", "IDENTIFIER"
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
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(106);
					advisor();
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(112);
					age();
					}
					}
					setState(117);
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
			setState(120);
			match(LPAR);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << IF) | (1L << EFFECT_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(121);
					statement();
					}
					break;
				case 2:
					{
					setState(122);
					if_statement();
					}
					break;
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case EFFECT_NAME:
			case SCOPE:
			case IDENTIFIER:
				{
				setState(130);
				effect();
				}
				break;
			case LPAR:
				{
				setState(131);
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
			setState(134);
			match(TRIGGER);
			setState(135);
			match(EQUALS);
			setState(136);
			match(LPAR);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(137);
				trigger();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
			setState(145);
			match(EFFECT);
			setState(146);
			match(EQUALS);
			setState(147);
			match(LPAR);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << EFFECT_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(148);
				effect();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
			setState(156);
			match(MODIFIER);
			setState(157);
			match(EQUALS);
			setState(158);
			match(LPAR);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER_NAME || _la==IDENTIFIER) {
				{
				{
				setState(159);
				modifier();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
			setState(167);
			match(CHANCE);
			setState(168);
			match(EQUALS);
			setState(169);
			match(LPAR);
			setState(170);
			factor();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(171);
				chance_modifier();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
			setState(179);
			match(AI_WILL_DO);
			setState(180);
			match(EQUALS);
			setState(181);
			match(LPAR);
			setState(182);
			factor();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(183);
				chance_modifier();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
			setState(191);
			match(ALLOW);
			setState(192);
			match(EQUALS);
			setState(193);
			match(LPAR);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(194);
				trigger();
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
			setState(202);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << YES) | (1L << NO) | (1L << TAG) | (1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) ) {
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
		enterRule(_localctx, 20, RULE_limit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(LIMIT);
			setState(205);
			match(EQUALS);
			setState(206);
			match(LPAR);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
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
		enterRule(_localctx, 22, RULE_eLSE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(ELSE);
			setState(216);
			match(EQUALS);
			setState(217);
			match(LPAR);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << EFFECT_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
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

	public static class Else_ifContext extends ParserRuleContext {
		public TerminalNode ELSE_IF() { return getToken(EU4GrammarParser.ELSE_IF, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
		enterRule(_localctx, 24, RULE_else_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(ELSE_IF);
			setState(227);
			match(LPAR);
			setState(228);
			match(EQUALS);
			setState(229);
			limit();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << EFFECT_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(230);
				effect();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 26, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(IF);
			setState(239);
			match(EQUALS);
			setState(240);
			match(LPAR);
			setState(241);
			limit();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << EFFECT_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(242);
				effect();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			match(RPAR);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE || _la==ELSE_IF) {
				{
				setState(251);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(249);
					eLSE();
					}
					break;
				case ELSE_IF:
					{
					setState(250);
					else_if();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(255);
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
		enterRule(_localctx, 28, RULE_scriptedEffect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(IDENTIFIER);
			setState(257);
			match(EQUALS);
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				{
				setState(258);
				match(LPAR);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << IF) | (1L << EFFECT_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(259);
					statement();
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(265);
				match(RPAR);
				}
				}
				break;
			case YES:
				{
				setState(266);
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

	public static class EffectContext extends ParserRuleContext {
		public TerminalNode EFFECT_NAME() { return getToken(EU4GrammarParser.EFFECT_NAME, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public TerminalNode SCOPE() { return getToken(EU4GrammarParser.SCOPE, 0); }
		public TerminalNode FLOAT() { return getToken(EU4GrammarParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
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
		public EffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effect; }
	}

	public final EffectContext effect() throws RecognitionException {
		EffectContext _localctx = new EffectContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_effect);
		int _la;
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EFFECT_NAME:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(269);
				match(EFFECT_NAME);
				setState(270);
				match(EQUALS);
				setState(271);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << YES) | (1L << NO) | (1L << TAG) | (1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) ) {
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
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				scriptedEffect();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				if_statement();
				}
				break;
			case SCOPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				scope();
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
		enterRule(_localctx, 32, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !(_la==MODIFIER_NAME || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(278);
			match(EQUALS);
			setState(279);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << YES) | (1L << NO) | (1L << TAG) | (1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) ) {
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
		enterRule(_localctx, 34, RULE_skill_scaled_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(SKILL_SACLED_MOD);
			setState(282);
			match(EQUALS);
			setState(283);
			match(LPAR);
			setState(284);
			trigger_block();
			setState(285);
			modifier_block();
			setState(286);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 36, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(FACTOR);
			setState(289);
			match(EQUALS);
			setState(290);
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
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
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
		enterRule(_localctx, 38, RULE_chance_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(MODIFIER);
			setState(293);
			match(EQUALS);
			setState(294);
			match(LPAR);
			setState(295);
			factor();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
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

	public static class TriggerContext extends ParserRuleContext {
		public Or_blockContext or_block() {
			return getRuleContext(Or_blockContext.class,0);
		}
		public And_blockContext and_block() {
			return getRuleContext(And_blockContext.class,0);
		}
		public Not_blockContext not_block() {
			return getRuleContext(Not_blockContext.class,0);
		}
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
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public TriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger; }
	}

	public final TriggerContext trigger() throws RecognitionException {
		TriggerContext _localctx = new TriggerContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_trigger);
		int _la;
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				or_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				and_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				not_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(307);
				_la = _input.LA(1);
				if ( !(_la==TRIGGER_NAME || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(308);
				match(EQUALS);
				setState(309);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << YES) | (1L << NO) | (1L << TAG) | (1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) ) {
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
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(310);
				scripted_trigger();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(311);
				custom_trigger_tooltip();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(312);
				scope();
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
		enterRule(_localctx, 42, RULE_scripted_trigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(IDENTIFIER);
			setState(316);
			match(EQUALS);
			setState(317);
			match(LPAR);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(318);
				trigger();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 44, RULE_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(SCOPE);
			setState(327);
			match(EQUALS);
			setState(328);
			match(LPAR);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << IF) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << EFFECT_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(329);
					effect();
					}
					break;
				case 2:
					{
					setState(330);
					trigger();
					}
					break;
				case 3:
					{
					setState(331);
					scope();
					}
					break;
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(337);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Or_blockContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(EU4GrammarParser.OR, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TriggerContext> trigger() {
			return getRuleContexts(TriggerContext.class);
		}
		public TriggerContext trigger(int i) {
			return getRuleContext(TriggerContext.class,i);
		}
		public Or_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_block; }
	}

	public final Or_blockContext or_block() throws RecognitionException {
		Or_blockContext _localctx = new Or_blockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_or_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(OR);
			setState(340);
			match(EQUALS);
			setState(341);
			match(LPAR);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(342);
				trigger();
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_blockContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(EU4GrammarParser.AND, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TriggerContext> trigger() {
			return getRuleContexts(TriggerContext.class);
		}
		public TriggerContext trigger(int i) {
			return getRuleContext(TriggerContext.class,i);
		}
		public And_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_block; }
	}

	public final And_blockContext and_block() throws RecognitionException {
		And_blockContext _localctx = new And_blockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_and_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(AND);
			setState(351);
			match(EQUALS);
			setState(352);
			match(LPAR);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(353);
				trigger();
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Not_blockContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(EU4GrammarParser.NOT, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<TriggerContext> trigger() {
			return getRuleContexts(TriggerContext.class);
		}
		public TriggerContext trigger(int i) {
			return getRuleContext(TriggerContext.class,i);
		}
		public Not_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_block; }
	}

	public final Not_blockContext not_block() throws RecognitionException {
		Not_blockContext _localctx = new Not_blockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_not_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(NOT);
			setState(362);
			match(EQUALS);
			setState(363);
			match(LPAR);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(364);
				trigger();
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(370);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public TooltipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tooltip; }
	}

	public final TooltipContext tooltip() throws RecognitionException {
		TooltipContext _localctx = new TooltipContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tooltip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(TOOLTIP);
			setState(373);
			match(EQUALS);
			setState(374);
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

	public static class Custom_tooltipContext extends ParserRuleContext {
		public TerminalNode CUSTOM_TOOLTIP() { return getToken(EU4GrammarParser.CUSTOM_TOOLTIP, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public Custom_tooltipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_custom_tooltip; }
	}

	public final Custom_tooltipContext custom_tooltip() throws RecognitionException {
		Custom_tooltipContext _localctx = new Custom_tooltipContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_custom_tooltip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(CUSTOM_TOOLTIP);
			setState(377);
			match(EQUALS);
			setState(378);
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
		enterRule(_localctx, 56, RULE_custom_trigger_tooltip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(CUSTOM_TRIGGER_TOOLTIP);
			setState(381);
			match(EQUALS);
			setState(382);
			match(LPAR);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOOLTIP) {
				{
				{
				setState(383);
				tooltip();
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(389);
				trigger();
				}
				}
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(395);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public DescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desc; }
	}

	public final DescContext desc() throws RecognitionException {
		DescContext _localctx = new DescContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_desc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(DESC);
			setState(398);
			match(EQUALS);
			setState(399);
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
		enterRule(_localctx, 60, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(START);
			setState(402);
			match(EQUALS);
			setState(403);
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
		enterRule(_localctx, 62, RULE_can_start_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(CAN_START);
			setState(406);
			match(EQUALS);
			setState(407);
			match(LPAR);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(408);
				trigger();
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		public AllowContext allow() {
			return getRuleContext(AllowContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<Custom_trigger_tooltipContext> custom_trigger_tooltip() {
			return getRuleContexts(Custom_trigger_tooltipContext.class);
		}
		public Custom_trigger_tooltipContext custom_trigger_tooltip(int i) {
			return getRuleContext(Custom_trigger_tooltipContext.class,i);
		}
		public ObjectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objective; }
	}

	public final ObjectiveContext objective() throws RecognitionException {
		ObjectiveContext _localctx = new ObjectiveContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_objective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(IDENTIFIER);
			setState(417);
			match(EQUALS);
			setState(418);
			match(LPAR);
			setState(419);
			allow();
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CUSTOM_TRIGGER_TOOLTIP) {
				{
				{
				setState(420);
				custom_trigger_tooltip();
				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(426);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 66, RULE_objectives_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(OBJECTIVES);
			setState(429);
			match(EQUALS);
			setState(430);
			match(LPAR);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(431);
				objective();
				}
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(437);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		public Effect_blockContext effect_block() {
			return getRuleContext(Effect_blockContext.class,0);
		}
		public Ai_will_do_blockContext ai_will_do_block() {
			return getRuleContext(Ai_will_do_blockContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public AbilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ability; }
	}

	public final AbilityContext ability() throws RecognitionException {
		AbilityContext _localctx = new AbilityContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ability);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(IDENTIFIER);
			setState(440);
			match(EQUALS);
			setState(441);
			match(LPAR);
			setState(442);
			effect_block();
			setState(443);
			ai_will_do_block();
			setState(444);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 70, RULE_ability_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(ABILITIES);
			setState(447);
			match(LPAR);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(448);
				ability();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(454);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 72, RULE_age);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(IDENTIFIER);
			setState(457);
			match(EQUALS);
			setState(458);
			match(LPAR);
			setState(459);
			start();
			setState(460);
			can_start_block();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RELIGIOUS_CONFLICTS || _la==PAPACY) {
				{
				setState(467);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RELIGIOUS_CONFLICTS:
					{
					{
					setState(461);
					match(RELIGIOUS_CONFLICTS);
					setState(462);
					match(EQUALS);
					setState(463);
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
					setState(464);
					match(PAPACY);
					setState(465);
					match(EQUALS);
					setState(466);
					match(FLOAT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(472);
			objectives_block();
			setState(473);
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
		enterRule(_localctx, 74, RULE_advisor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(IDENTIFIER);
			setState(476);
			match(EQUALS);
			setState(477);
			match(LPAR);
			setState(478);
			monarch_power_advisor();
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKILL_SACLED_MOD) | (1L << MODIFIER_NAME) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(481);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODIFIER_NAME:
				case IDENTIFIER:
					{
					setState(479);
					modifier();
					}
					break;
				case SKILL_SACLED_MOD:
					{
					setState(480);
					skill_scaled_modifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(486);
			chance_block();
			setState(487);
			ai_will_do_block();
			setState(488);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 76, RULE_monarch_power_advisor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(MONARCH_POWER);
			setState(491);
			match(EQUALS);
			setState(492);
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
		public List<Ai_missionSeriesContext> ai_missionSeries() {
			return getRuleContexts(Ai_missionSeriesContext.class);
		}
		public Ai_missionSeriesContext ai_missionSeries(int i) {
			return getRuleContext(Ai_missionSeriesContext.class,i);
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
		enterRule(_localctx, 78, RULE_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(IDENTIFIER);
			setState(495);
			match(EQUALS);
			setState(496);
			match(LPAR);
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POTENTIAL) | (1L << AI) | (1L << SLOT) | (1L << GENERIC) | (1L << HAS_COUNTRY_SHIELD) | (1L << POTENTIAL_ON_LOAD) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(504);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SLOT:
					{
					setState(497);
					slot_missionSeries();
					}
					break;
				case GENERIC:
					{
					setState(498);
					generic_missionSeries();
					}
					break;
				case AI:
					{
					setState(499);
					ai_missionSeries();
					}
					break;
				case HAS_COUNTRY_SHIELD:
					{
					setState(500);
					hasCountryShield_missionSeries();
					}
					break;
				case POTENTIAL_ON_LOAD:
					{
					setState(501);
					potentialOnLoad_missionSeries();
					}
					break;
				case POTENTIAL:
					{
					setState(502);
					potential_missionSeries();
					}
					break;
				case IDENTIFIER:
					{
					setState(503);
					missionBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(509);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 80, RULE_slot_missionSeries);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(SLOT);
			setState(512);
			match(EQUALS);
			setState(513);
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
		enterRule(_localctx, 82, RULE_generic_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(GENERIC);
			setState(516);
			match(EQUALS);
			setState(517);
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

	public static class Ai_missionSeriesContext extends ParserRuleContext {
		public TerminalNode AI() { return getToken(EU4GrammarParser.AI, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public Ai_missionSeriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ai_missionSeries; }
	}

	public final Ai_missionSeriesContext ai_missionSeries() throws RecognitionException {
		Ai_missionSeriesContext _localctx = new Ai_missionSeriesContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_ai_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(AI);
			setState(520);
			match(EQUALS);
			setState(521);
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
		enterRule(_localctx, 86, RULE_hasCountryShield_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(HAS_COUNTRY_SHIELD);
			setState(524);
			match(EQUALS);
			setState(525);
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
		enterRule(_localctx, 88, RULE_potentialOnLoad_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(POTENTIAL_ON_LOAD);
			setState(528);
			match(EQUALS);
			setState(529);
			match(LPAR);
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(530);
				trigger();
				}
				}
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(536);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 90, RULE_potential_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(POTENTIAL);
			setState(539);
			match(EQUALS);
			setState(540);
			match(LPAR);
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(541);
				trigger();
				}
				}
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(547);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 92, RULE_missionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(IDENTIFIER);
			setState(550);
			match(EQUALS);
			setState(551);
			match(LPAR);
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRIGGER) | (1L << EFFECT) | (1L << AI_WEIGHT) | (1L << ICON) | (1L << POSITION) | (1L << COMPLETED_BY) | (1L << REQUIRED_MISSIONS) | (1L << PROVINCES_TO_HIGHLIGHT))) != 0)) {
				{
				setState(560);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ICON:
					{
					setState(552);
					icon_mission();
					}
					break;
				case POSITION:
					{
					setState(553);
					position_mission();
					}
					break;
				case COMPLETED_BY:
					{
					setState(554);
					completedBy_mission();
					}
					break;
				case REQUIRED_MISSIONS:
					{
					setState(555);
					requiredMissions_mission();
					}
					break;
				case PROVINCES_TO_HIGHLIGHT:
					{
					setState(556);
					provincesToHighlight_mission();
					}
					break;
				case TRIGGER:
					{
					setState(557);
					trigger_block();
					}
					break;
				case EFFECT:
					{
					setState(558);
					effect_block();
					}
					break;
				case AI_WEIGHT:
					{
					setState(559);
					aiWeight_mission();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(565);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 94, RULE_icon_mission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(ICON);
			setState(568);
			match(EQUALS);
			setState(569);
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
		enterRule(_localctx, 96, RULE_position_mission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(POSITION);
			setState(572);
			match(EQUALS);
			setState(573);
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
		enterRule(_localctx, 98, RULE_completedBy_mission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(COMPLETED_BY);
			setState(576);
			match(EQUALS);
			setState(577);
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
		enterRule(_localctx, 100, RULE_requiredMissions_mission);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(REQUIRED_MISSIONS);
			setState(580);
			match(EQUALS);
			setState(581);
			match(LPAR);
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(582);
				match(IDENTIFIER);
				}
				}
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(588);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 102, RULE_provincesToHighlight_mission);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(PROVINCES_TO_HIGHLIGHT);
			setState(591);
			match(EQUALS);
			setState(592);
			match(LPAR);
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(593);
				trigger();
				}
				}
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(599);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 104, RULE_aiWeight_mission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(AI_WEIGHT);
			setState(602);
			match(EQUALS);
			setState(603);
			match(LPAR);
			setState(604);
			factor();
			setState(605);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u0262\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\7\2n\n\2\f\2\16\2q\13\2\3\2\7\2t\n\2\f\2\16"+
		"\2w\13\2\5\2y\n\2\3\3\3\3\3\3\7\3~\n\3\f\3\16\3\u0081\13\3\3\3\3\3\3\4"+
		"\3\4\5\4\u0087\n\4\3\5\3\5\3\5\3\5\7\5\u008d\n\5\f\5\16\5\u0090\13\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\7\6\u0098\n\6\f\6\16\6\u009b\13\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\7\7\u00a3\n\7\f\7\16\7\u00a6\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\7\b\u00af\n\b\f\b\16\b\u00b2\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t\u00bb"+
		"\n\t\f\t\16\t\u00be\13\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u00c6\n\n\f\n\16"+
		"\n\u00c9\13\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u00d3\n\f\f\f\16\f"+
		"\u00d6\13\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u00de\n\r\f\r\16\r\u00e1\13\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\7\16\u00ea\n\16\f\16\16\16\u00ed\13"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7\17\u00f6\n\17\f\17\16\17\u00f9"+
		"\13\17\3\17\3\17\3\17\7\17\u00fe\n\17\f\17\16\17\u0101\13\17\3\20\3\20"+
		"\3\20\3\20\7\20\u0107\n\20\f\20\16\20\u010a\13\20\3\20\3\20\5\20\u010e"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0116\n\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u012c\n\25\f\25\16\25\u012f\13\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u013c\n\26\3\27\3\27\3\27\3\27"+
		"\7\27\u0142\n\27\f\27\16\27\u0145\13\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\7\30\u014f\n\30\f\30\16\30\u0152\13\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\7\31\u015a\n\31\f\31\16\31\u015d\13\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\7\32\u0165\n\32\f\32\16\32\u0168\13\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\7\33\u0170\n\33\f\33\16\33\u0173\13\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u0183\n\36\f\36"+
		"\16\36\u0186\13\36\3\36\7\36\u0189\n\36\f\36\16\36\u018c\13\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\7!\u019c\n!\f!\16!\u019f"+
		"\13!\3!\3!\3\"\3\"\3\"\3\"\3\"\7\"\u01a8\n\"\f\"\16\"\u01ab\13\"\3\"\3"+
		"\"\3#\3#\3#\3#\7#\u01b3\n#\f#\16#\u01b6\13#\3#\3#\3$\3$\3$\3$\3$\3$\3"+
		"$\3%\3%\3%\7%\u01c4\n%\f%\16%\u01c7\13%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\7&\u01d6\n&\f&\16&\u01d9\13&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\7\'\u01e4\n\'\f\'\16\'\u01e7\13\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\7)\u01fb\n)\f)\16)\u01fe\13)\3)\3)\3*\3*\3*"+
		"\3*\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\7.\u0216\n.\f.\16"+
		".\u0219\13.\3.\3.\3/\3/\3/\3/\7/\u0221\n/\f/\16/\u0224\13/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u0233\n\60\f\60"+
		"\16\60\u0236\13\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3"+
		"\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u024a\n\64\f\64\16\64\u024d"+
		"\13\64\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u0255\n\65\f\65\16\65\u0258"+
		"\13\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\2\2\67\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdfhj\2\7\6\2\5\6\t\f%%<<\4\2##<<\4\2\n\n\f\f\4\2\"\"<<\3\2\5\6\2\u026e"+
		"\2x\3\2\2\2\4z\3\2\2\2\6\u0086\3\2\2\2\b\u0088\3\2\2\2\n\u0093\3\2\2\2"+
		"\f\u009e\3\2\2\2\16\u00a9\3\2\2\2\20\u00b5\3\2\2\2\22\u00c1\3\2\2\2\24"+
		"\u00cc\3\2\2\2\26\u00ce\3\2\2\2\30\u00d9\3\2\2\2\32\u00e4\3\2\2\2\34\u00f0"+
		"\3\2\2\2\36\u0102\3\2\2\2 \u0115\3\2\2\2\"\u0117\3\2\2\2$\u011b\3\2\2"+
		"\2&\u0122\3\2\2\2(\u0126\3\2\2\2*\u013b\3\2\2\2,\u013d\3\2\2\2.\u0148"+
		"\3\2\2\2\60\u0155\3\2\2\2\62\u0160\3\2\2\2\64\u016b\3\2\2\2\66\u0176\3"+
		"\2\2\28\u017a\3\2\2\2:\u017e\3\2\2\2<\u018f\3\2\2\2>\u0193\3\2\2\2@\u0197"+
		"\3\2\2\2B\u01a2\3\2\2\2D\u01ae\3\2\2\2F\u01b9\3\2\2\2H\u01c0\3\2\2\2J"+
		"\u01ca\3\2\2\2L\u01dd\3\2\2\2N\u01ec\3\2\2\2P\u01f0\3\2\2\2R\u0201\3\2"+
		"\2\2T\u0205\3\2\2\2V\u0209\3\2\2\2X\u020d\3\2\2\2Z\u0211\3\2\2\2\\\u021c"+
		"\3\2\2\2^\u0227\3\2\2\2`\u0239\3\2\2\2b\u023d\3\2\2\2d\u0241\3\2\2\2f"+
		"\u0245\3\2\2\2h\u0250\3\2\2\2j\u025b\3\2\2\2ln\5L\'\2ml\3\2\2\2nq\3\2"+
		"\2\2om\3\2\2\2op\3\2\2\2py\3\2\2\2qo\3\2\2\2rt\5J&\2sr\3\2\2\2tw\3\2\2"+
		"\2us\3\2\2\2uv\3\2\2\2vy\3\2\2\2wu\3\2\2\2xo\3\2\2\2xu\3\2\2\2y\3\3\2"+
		"\2\2z\177\7\16\2\2{~\5\6\4\2|~\5\34\17\2}{\3\2\2\2}|\3\2\2\2~\u0081\3"+
		"\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3"+
		"\2\2\2\u0082\u0083\7\17\2\2\u0083\5\3\2\2\2\u0084\u0087\5 \21\2\u0085"+
		"\u0087\5\4\3\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\7\3\2\2\2"+
		"\u0088\u0089\7\33\2\2\u0089\u008a\7\20\2\2\u008a\u008e\7\16\2\2\u008b"+
		"\u008d\5*\26\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0092\7\17\2\2\u0092\t\3\2\2\2\u0093\u0094\7\34\2\2\u0094\u0095\7\20"+
		"\2\2\u0095\u0099\7\16\2\2\u0096\u0098\5 \21\2\u0097\u0096\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\17\2\2\u009d\13\3\2\2\2\u009e\u009f"+
		"\7.\2\2\u009f\u00a0\7\20\2\2\u00a0\u00a4\7\16\2\2\u00a1\u00a3\5\"\22\2"+
		"\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7\17\2\2"+
		"\u00a8\r\3\2\2\2\u00a9\u00aa\7/\2\2\u00aa\u00ab\7\20\2\2\u00ab\u00ac\7"+
		"\16\2\2\u00ac\u00b0\5&\24\2\u00ad\u00af\5(\25\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2"+
		"\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\17\2\2\u00b4\17\3\2\2\2\u00b5\u00b6"+
		"\7\60\2\2\u00b6\u00b7\7\20\2\2\u00b7\u00b8\7\16\2\2\u00b8\u00bc\5&\24"+
		"\2\u00b9\u00bb\5(\25\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c0\7\17\2\2\u00c0\21\3\2\2\2\u00c1\u00c2\7\35\2\2\u00c2\u00c3\7\20"+
		"\2\2\u00c3\u00c7\7\16\2\2\u00c4\u00c6\5*\26\2\u00c5\u00c4\3\2\2\2\u00c6"+
		"\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7\17\2\2\u00cb\23\3\2\2\2\u00cc\u00cd"+
		"\t\2\2\2\u00cd\25\3\2\2\2\u00ce\u00cf\7\30\2\2\u00cf\u00d0\7\20\2\2\u00d0"+
		"\u00d4\7\16\2\2\u00d1\u00d3\5*\26\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3"+
		"\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00d8\7\17\2\2\u00d8\27\3\2\2\2\u00d9\u00da\7\26"+
		"\2\2\u00da\u00db\7\20\2\2\u00db\u00df\7\16\2\2\u00dc\u00de\5 \21\2\u00dd"+
		"\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7\17\2\2\u00e3"+
		"\31\3\2\2\2\u00e4\u00e5\7\27\2\2\u00e5\u00e6\7\16\2\2\u00e6\u00e7\7\20"+
		"\2\2\u00e7\u00eb\5\26\f\2\u00e8\u00ea\5 \21\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2"+
		"\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7\17\2\2\u00ef\33\3\2\2\2\u00f0\u00f1"+
		"\7\25\2\2\u00f1\u00f2\7\20\2\2\u00f2\u00f3\7\16\2\2\u00f3\u00f7\5\26\f"+
		"\2\u00f4\u00f6\5 \21\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u00ff\7\17\2\2\u00fb\u00fe\5\30\r\2\u00fc\u00fe\5\32\16\2\u00fd\u00fb"+
		"\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\35\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7<\2\2"+
		"\u0103\u010d\7\20\2\2\u0104\u0108\7\16\2\2\u0105\u0107\5\6\4\2\u0106\u0105"+
		"\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010e\7\17\2\2\u010c\u010e\7"+
		"\5\2\2\u010d\u0104\3\2\2\2\u010d\u010c\3\2\2\2\u010e\37\3\2\2\2\u010f"+
		"\u0110\7$\2\2\u0110\u0111\7\20\2\2\u0111\u0116\t\2\2\2\u0112\u0116\5\36"+
		"\20\2\u0113\u0116\5\34\17\2\u0114\u0116\5.\30\2\u0115\u010f\3\2\2\2\u0115"+
		"\u0112\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116!\3\2\2\2"+
		"\u0117\u0118\t\3\2\2\u0118\u0119\7\20\2\2\u0119\u011a\t\2\2\2\u011a#\3"+
		"\2\2\2\u011b\u011c\7\31\2\2\u011c\u011d\7\20\2\2\u011d\u011e\7\16\2\2"+
		"\u011e\u011f\5\b\5\2\u011f\u0120\5\f\7\2\u0120\u0121\7\17\2\2\u0121%\3"+
		"\2\2\2\u0122\u0123\7\61\2\2\u0123\u0124\7\20\2\2\u0124\u0125\t\4\2\2\u0125"+
		"\'\3\2\2\2\u0126\u0127\7.\2\2\u0127\u0128\7\20\2\2\u0128\u0129\7\16\2"+
		"\2\u0129\u012d\5&\24\2\u012a\u012c\5*\26\2\u012b\u012a\3\2\2\2\u012c\u012f"+
		"\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u0130\u0131\7\17\2\2\u0131)\3\2\2\2\u0132\u013c\5\60\31"+
		"\2\u0133\u013c\5\62\32\2\u0134\u013c\5\64\33\2\u0135\u0136\t\5\2\2\u0136"+
		"\u0137\7\20\2\2\u0137\u013c\t\2\2\2\u0138\u013c\5,\27\2\u0139\u013c\5"+
		":\36\2\u013a\u013c\5.\30\2\u013b\u0132\3\2\2\2\u013b\u0133\3\2\2\2\u013b"+
		"\u0134\3\2\2\2\u013b\u0135\3\2\2\2\u013b\u0138\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013b\u013a\3\2\2\2\u013c+\3\2\2\2\u013d\u013e\7<\2\2\u013e\u013f"+
		"\7\20\2\2\u013f\u0143\7\16\2\2\u0140\u0142\5*\26\2\u0141\u0140\3\2\2\2"+
		"\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146"+
		"\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0147\7\17\2\2\u0147-\3\2\2\2\u0148"+
		"\u0149\7%\2\2\u0149\u014a\7\20\2\2\u014a\u0150\7\16\2\2\u014b\u014f\5"+
		" \21\2\u014c\u014f\5*\26\2\u014d\u014f\5.\30\2\u014e\u014b\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2"+
		"\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153"+
		"\u0154\7\17\2\2\u0154/\3\2\2\2\u0155\u0156\7\4\2\2\u0156\u0157\7\20\2"+
		"\2\u0157\u015b\7\16\2\2\u0158\u015a\5*\26\2\u0159\u0158\3\2\2\2\u015a"+
		"\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2"+
		"\2\2\u015d\u015b\3\2\2\2\u015e\u015f\7\17\2\2\u015f\61\3\2\2\2\u0160\u0161"+
		"\7\3\2\2\u0161\u0162\7\20\2\2\u0162\u0166\7\16\2\2\u0163\u0165\5*\26\2"+
		"\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167"+
		"\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\7\17\2\2"+
		"\u016a\63\3\2\2\2\u016b\u016c\7\7\2\2\u016c\u016d\7\20\2\2\u016d\u0171"+
		"\7\16\2\2\u016e\u0170\5*\26\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2\2\2"+
		"\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0171"+
		"\3\2\2\2\u0174\u0175\7\17\2\2\u0175\65\3\2\2\2\u0176\u0177\7\36\2\2\u0177"+
		"\u0178\7\20\2\2\u0178\u0179\7\13\2\2\u0179\67\3\2\2\2\u017a\u017b\7\37"+
		"\2\2\u017b\u017c\7\20\2\2\u017c\u017d\7\13\2\2\u017d9\3\2\2\2\u017e\u017f"+
		"\7!\2\2\u017f\u0180\7\20\2\2\u0180\u0184\7\16\2\2\u0181\u0183\5\66\34"+
		"\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185"+
		"\3\2\2\2\u0185\u018a\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0189\5*\26\2\u0188"+
		"\u0187\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2"+
		"\2\2\u018b\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018e\7\17\2\2\u018e"+
		";\3\2\2\2\u018f\u0190\7 \2\2\u0190\u0191\7\20\2\2\u0191\u0192\7\13\2\2"+
		"\u0192=\3\2\2\2\u0193\u0194\7\'\2\2\u0194\u0195\7\20\2\2\u0195\u0196\7"+
		"\n\2\2\u0196?\3\2\2\2\u0197\u0198\7(\2\2\u0198\u0199\7\20\2\2\u0199\u019d"+
		"\7\16\2\2\u019a\u019c\5*\26\2\u019b\u019a\3\2\2\2\u019c\u019f\3\2\2\2"+
		"\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u019d"+
		"\3\2\2\2\u01a0\u01a1\7\17\2\2\u01a1A\3\2\2\2\u01a2\u01a3\7<\2\2\u01a3"+
		"\u01a4\7\20\2\2\u01a4\u01a5\7\16\2\2\u01a5\u01a9\5\22\n\2\u01a6\u01a8"+
		"\5:\36\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\7\17"+
		"\2\2\u01adC\3\2\2\2\u01ae\u01af\7)\2\2\u01af\u01b0\7\20\2\2\u01b0\u01b4"+
		"\7\16\2\2\u01b1\u01b3\5B\"\2\u01b2\u01b1\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4"+
		"\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b4\3\2"+
		"\2\2\u01b7\u01b8\7\17\2\2\u01b8E\3\2\2\2\u01b9\u01ba\7<\2\2\u01ba\u01bb"+
		"\7\20\2\2\u01bb\u01bc\7\16\2\2\u01bc\u01bd\5\n\6\2\u01bd\u01be\5\20\t"+
		"\2\u01be\u01bf\7\17\2\2\u01bfG\3\2\2\2\u01c0\u01c1\7*\2\2\u01c1\u01c5"+
		"\7\16\2\2\u01c2\u01c4\5F$\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5"+
		"\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c5\3\2"+
		"\2\2\u01c8\u01c9\7\17\2\2\u01c9I\3\2\2\2\u01ca\u01cb\7<\2\2\u01cb\u01cc"+
		"\7\20\2\2\u01cc\u01cd\7\16\2\2\u01cd\u01ce\5> \2\u01ce\u01d7\5@!\2\u01cf"+
		"\u01d0\7+\2\2\u01d0\u01d1\7\20\2\2\u01d1\u01d6\t\6\2\2\u01d2\u01d3\7,"+
		"\2\2\u01d3\u01d4\7\20\2\2\u01d4\u01d6\7\f\2\2\u01d5\u01cf\3\2\2\2\u01d5"+
		"\u01d2\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2"+
		"\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01db\5D#\2\u01db\u01dc"+
		"\5H%\2\u01dcK\3\2\2\2\u01dd\u01de\7<\2\2\u01de\u01df\7\20\2\2\u01df\u01e0"+
		"\7\16\2\2\u01e0\u01e5\5N(\2\u01e1\u01e4\5\"\22\2\u01e2\u01e4\5$\23\2\u01e3"+
		"\u01e1\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2"+
		"\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8"+
		"\u01e9\5\16\b\2\u01e9\u01ea\5\20\t\2\u01ea\u01eb\7\17\2\2\u01ebM\3\2\2"+
		"\2\u01ec\u01ed\7&\2\2\u01ed\u01ee\7\20\2\2\u01ee\u01ef\7\b\2\2\u01efO"+
		"\3\2\2\2\u01f0\u01f1\7<\2\2\u01f1\u01f2\7\20\2\2\u01f2\u01fc\7\16\2\2"+
		"\u01f3\u01fb\5R*\2\u01f4\u01fb\5T+\2\u01f5\u01fb\5V,\2\u01f6\u01fb\5X"+
		"-\2\u01f7\u01fb\5Z.\2\u01f8\u01fb\5\\/\2\u01f9\u01fb\5^\60\2\u01fa\u01f3"+
		"\3\2\2\2\u01fa\u01f4\3\2\2\2\u01fa\u01f5\3\2\2\2\u01fa\u01f6\3\2\2\2\u01fa"+
		"\u01f7\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01f9\3\2\2\2\u01fb\u01fe\3\2"+
		"\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\3\2\2\2\u01fe"+
		"\u01fc\3\2\2\2\u01ff\u0200\7\17\2\2\u0200Q\3\2\2\2\u0201\u0202\7\63\2"+
		"\2\u0202\u0203\7\20\2\2\u0203\u0204\7\n\2\2\u0204S\3\2\2\2\u0205\u0206"+
		"\7\64\2\2\u0206\u0207\7\20\2\2\u0207\u0208\t\6\2\2\u0208U\3\2\2\2\u0209"+
		"\u020a\7-\2\2\u020a\u020b\7\20\2\2\u020b\u020c\t\6\2\2\u020cW\3\2\2\2"+
		"\u020d\u020e\7\65\2\2\u020e\u020f\7\20\2\2\u020f\u0210\t\6\2\2\u0210Y"+
		"\3\2\2\2\u0211\u0212\7\66\2\2\u0212\u0213\7\20\2\2\u0213\u0217\7\16\2"+
		"\2\u0214\u0216\5*\26\2\u0215\u0214\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215"+
		"\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u0217\3\2\2\2\u021a"+
		"\u021b\7\17\2\2\u021b[\3\2\2\2\u021c\u021d\7\32\2\2\u021d\u021e\7\20\2"+
		"\2\u021e\u0222\7\16\2\2\u021f\u0221\5*\26\2\u0220\u021f\3\2\2\2\u0221"+
		"\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0225\3\2"+
		"\2\2\u0224\u0222\3\2\2\2\u0225\u0226\7\17\2\2\u0226]\3\2\2\2\u0227\u0228"+
		"\7<\2\2\u0228\u0229\7\20\2\2\u0229\u0234\7\16\2\2\u022a\u0233\5`\61\2"+
		"\u022b\u0233\5b\62\2\u022c\u0233\5d\63\2\u022d\u0233\5f\64\2\u022e\u0233"+
		"\5h\65\2\u022f\u0233\5\b\5\2\u0230\u0233\5\n\6\2\u0231\u0233\5j\66\2\u0232"+
		"\u022a\3\2\2\2\u0232\u022b\3\2\2\2\u0232\u022c\3\2\2\2\u0232\u022d\3\2"+
		"\2\2\u0232\u022e\3\2\2\2\u0232\u022f\3\2\2\2\u0232\u0230\3\2\2\2\u0232"+
		"\u0231\3\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2"+
		"\2\2\u0235\u0237\3\2\2\2\u0236\u0234\3\2\2\2\u0237\u0238\7\17\2\2\u0238"+
		"_\3\2\2\2\u0239\u023a\7\67\2\2\u023a\u023b\7\20\2\2\u023b\u023c\7<\2\2"+
		"\u023ca\3\2\2\2\u023d\u023e\78\2\2\u023e\u023f\7\20\2\2\u023f\u0240\7"+
		"\n\2\2\u0240c\3\2\2\2\u0241\u0242\79\2\2\u0242\u0243\7\20\2\2\u0243\u0244"+
		"\7\13\2\2\u0244e\3\2\2\2\u0245\u0246\7:\2\2\u0246\u0247\7\20\2\2\u0247"+
		"\u024b\7\16\2\2\u0248\u024a\7<\2\2\u0249\u0248\3\2\2\2\u024a\u024d\3\2"+
		"\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024e\3\2\2\2\u024d"+
		"\u024b\3\2\2\2\u024e\u024f\7\17\2\2\u024fg\3\2\2\2\u0250\u0251\7;\2\2"+
		"\u0251\u0252\7\20\2\2\u0252\u0256\7\16\2\2\u0253\u0255\5*\26\2\u0254\u0253"+
		"\3\2\2\2\u0255\u0258\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257"+
		"\u0259\3\2\2\2\u0258\u0256\3\2\2\2\u0259\u025a\7\17\2\2\u025ai\3\2\2\2"+
		"\u025b\u025c\7\62\2\2\u025c\u025d\7\20\2\2\u025d\u025e\7\16\2\2\u025e"+
		"\u025f\5&\24\2\u025f\u0260\7\17\2\2\u0260k\3\2\2\2\61oux}\177\u0086\u008e"+
		"\u0099\u00a4\u00b0\u00bc\u00c7\u00d4\u00df\u00eb\u00f7\u00fd\u00ff\u0108"+
		"\u010d\u0115\u012d\u013b\u0143\u014e\u0150\u015b\u0166\u0171\u0184\u018a"+
		"\u019d\u01a9\u01b4\u01c5\u01d5\u01d7\u01e3\u01e5\u01fa\u01fc\u0217\u0222"+
		"\u0232\u0234\u024b\u0256";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}