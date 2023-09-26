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
		LPAR=11, RPAR=12, EQUALS=13, PLUS=14, MINUS=15, WHITESPACE=16, SINGLE_LINE_COMMENT=17, 
		IF=18, ELSE=19, ELSE_IF=20, LIMIT=21, SKILL_SACLED_MOD=22, POTENTIAL=23, 
		TRIGGER=24, EFFECT=25, TOOLTIP=26, CUSTOM_TOOLTIP=27, DESC=28, CUSTOM_TRIGGER_TOOLTIP=29, 
		TRIGGER_NAME=30, MODIFIER_NAME=31, EFFECT_NAME=32, SCOPE=33, MONARCH_POWER=34, 
		AI=35, MODIFIER=36, CHANCE=37, AI_WILL_DO=38, FACTOR=39, AI_WEIGHT=40, 
		SLOT=41, GENERIC=42, HAS_COUNTRY_SHIELD=43, POTENTIAL_ON_LOAD=44, ICON=45, 
		POSITION=46, COMPLETED_BY=47, REQUIRED_MISSIONS=48, PROVINCES_TO_HIGHLIGHT=49, 
		IDENTIFIER=50;
	public static final int
		RULE_file = 0, RULE_block = 1, RULE_simpleBlock = 2, RULE_statement = 3, 
		RULE_triggerBlock = 4, RULE_effectBlock = 5, RULE_modifierBlock = 6, RULE_chanceBlock = 7, 
		RULE_aiWillDoBlock = 8, RULE_value = 9, RULE_limit = 10, RULE_eLSE = 11, 
		RULE_elseIf = 12, RULE_ifStatement = 13, RULE_scriptedEffect = 14, RULE_effect = 15, 
		RULE_modifier = 16, RULE_skill_scaled_modifier = 17, RULE_factor = 18, 
		RULE_chanceMod = 19, RULE_trigger = 20, RULE_scriptedTrigger = 21, RULE_scope = 22, 
		RULE_orBlock = 23, RULE_andBlock = 24, RULE_notBlock = 25, RULE_tooltip = 26, 
		RULE_customTooltip = 27, RULE_customTriggerTooltip = 28, RULE_desc = 29, 
		RULE_advisor = 30, RULE_monarch_power_advisor = 31, RULE_missionSeries = 32, 
		RULE_slot_missionSeries = 33, RULE_generic_missionSeries = 34, RULE_ai_missionSeries = 35, 
		RULE_hasCountryShield_missionSeries = 36, RULE_potentialOnLoad_missionSeries = 37, 
		RULE_potential_missionSeries = 38, RULE_missionBlock = 39, RULE_icon_mission = 40, 
		RULE_position_mission = 41, RULE_completedBy_mission = 42, RULE_requiredMissions_mission = 43, 
		RULE_provincesToHighlight_mission = 44, RULE_aiWeight_mission = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "block", "simpleBlock", "statement", "triggerBlock", "effectBlock", 
			"modifierBlock", "chanceBlock", "aiWillDoBlock", "value", "limit", "eLSE", 
			"elseIf", "ifStatement", "scriptedEffect", "effect", "modifier", "skill_scaled_modifier", 
			"factor", "chanceMod", "trigger", "scriptedTrigger", "scope", "orBlock", 
			"andBlock", "notBlock", "tooltip", "customTooltip", "customTriggerTooltip", 
			"desc", "advisor", "monarch_power_advisor", "missionSeries", "slot_missionSeries", 
			"generic_missionSeries", "ai_missionSeries", "hasCountryShield_missionSeries", 
			"potentialOnLoad_missionSeries", "potential_missionSeries", "missionBlock", 
			"icon_mission", "position_mission", "completedBy_mission", "requiredMissions_mission", 
			"provincesToHighlight_mission", "aiWeight_mission"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'AND'", "'OR'", null, null, null, null, null, null, null, null, 
			"'{'", "'}'", "'='", "'+'", "'-'", null, null, "'if'", "'else'", "'else_if'", 
			"'limit'", "'skill_scaled_modifier'", "'potential'", "'trigger'", "'effect'", 
			"'tooltip'", "'custom_tooltip'", "'desc'", "'custom_trigger_tooltip'", 
			"'is_core'", "'prestige'", "'add_core'", null, "'monarch_power'", "'ai'", 
			"'modifier'", "'chance'", "'ai_will_do'", "'factor'", "'ai_weight'", 
			"'slot'", "'generic'", "'has_country_shield'", "'potential_on_load'", 
			"'icon'", "'position'", "'completed_by'", "'required_missions'", "'provinces_to_highlight'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "YES", "NO", "NOT", "MPOWER", "TAG", "INT", "STRING", 
			"FLOAT", "LPAR", "RPAR", "EQUALS", "PLUS", "MINUS", "WHITESPACE", "SINGLE_LINE_COMMENT", 
			"IF", "ELSE", "ELSE_IF", "LIMIT", "SKILL_SACLED_MOD", "POTENTIAL", "TRIGGER", 
			"EFFECT", "TOOLTIP", "CUSTOM_TOOLTIP", "DESC", "CUSTOM_TRIGGER_TOOLTIP", 
			"TRIGGER_NAME", "MODIFIER_NAME", "EFFECT_NAME", "SCOPE", "MONARCH_POWER", 
			"AI", "MODIFIER", "CHANCE", "AI_WILL_DO", "FACTOR", "AI_WEIGHT", "SLOT", 
			"GENERIC", "HAS_COUNTRY_SHIELD", "POTENTIAL_ON_LOAD", "ICON", "POSITION", 
			"COMPLETED_BY", "REQUIRED_MISSIONS", "PROVINCES_TO_HIGHLIGHT", "IDENTIFIER"
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
		public AdvisorContext advisor() {
			return getRuleContext(AdvisorContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			advisor();
			}
		}
		catch (RecognitionException re) {
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
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
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
			setState(94);
			match(LPAR);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << IF) | (1L << EFFECT_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(95);
					statement();
					}
					break;
				case 2:
					{
					setState(96);
					ifStatement();
					}
					break;
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleBlockContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SimpleBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleBlock; }
	}

	public final SimpleBlockContext simpleBlock() throws RecognitionException {
		SimpleBlockContext _localctx = new SimpleBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simpleBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(LPAR);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << IF) | (1L << EFFECT_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(105);
				statement();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 6, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case EFFECT_NAME:
			case SCOPE:
			case IDENTIFIER:
				{
				setState(113);
				effect();
				}
				break;
			case LPAR:
				{
				setState(114);
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

	public static class TriggerBlockContext extends ParserRuleContext {
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
		public TriggerBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triggerBlock; }
	}

	public final TriggerBlockContext triggerBlock() throws RecognitionException {
		TriggerBlockContext _localctx = new TriggerBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_triggerBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(TRIGGER);
			setState(118);
			match(EQUALS);
			setState(119);
			match(LPAR);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(120);
				trigger();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EffectBlockContext extends ParserRuleContext {
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
		public EffectBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effectBlock; }
	}

	public final EffectBlockContext effectBlock() throws RecognitionException {
		EffectBlockContext _localctx = new EffectBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_effectBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(EFFECT);
			setState(129);
			match(EQUALS);
			setState(130);
			match(LPAR);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << EFFECT_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(131);
				effect();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierBlockContext extends ParserRuleContext {
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
		public ModifierBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierBlock; }
	}

	public final ModifierBlockContext modifierBlock() throws RecognitionException {
		ModifierBlockContext _localctx = new ModifierBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_modifierBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(MODIFIER);
			setState(140);
			match(EQUALS);
			setState(141);
			match(LPAR);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER_NAME) {
				{
				{
				setState(142);
				modifier();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChanceBlockContext extends ParserRuleContext {
		public TerminalNode CHANCE() { return getToken(EU4GrammarParser.CHANCE, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<ChanceModContext> chanceMod() {
			return getRuleContexts(ChanceModContext.class);
		}
		public ChanceModContext chanceMod(int i) {
			return getRuleContext(ChanceModContext.class,i);
		}
		public ChanceBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chanceBlock; }
	}

	public final ChanceBlockContext chanceBlock() throws RecognitionException {
		ChanceBlockContext _localctx = new ChanceBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_chanceBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(CHANCE);
			setState(151);
			match(EQUALS);
			setState(152);
			match(LPAR);
			setState(153);
			factor();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(154);
				chanceMod();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AiWillDoBlockContext extends ParserRuleContext {
		public TerminalNode AI_WILL_DO() { return getToken(EU4GrammarParser.AI_WILL_DO, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public List<ChanceModContext> chanceMod() {
			return getRuleContexts(ChanceModContext.class);
		}
		public ChanceModContext chanceMod(int i) {
			return getRuleContext(ChanceModContext.class,i);
		}
		public AiWillDoBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aiWillDoBlock; }
	}

	public final AiWillDoBlockContext aiWillDoBlock() throws RecognitionException {
		AiWillDoBlockContext _localctx = new AiWillDoBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_aiWillDoBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(AI_WILL_DO);
			setState(163);
			match(EQUALS);
			setState(164);
			match(LPAR);
			setState(165);
			factor();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(166);
				chanceMod();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(EU4GrammarParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
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
			setState(174);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << YES) | (1L << NO) | (1L << TAG) | (1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << IDENTIFIER))) != 0)) ) {
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
			setState(176);
			match(LIMIT);
			setState(177);
			match(EQUALS);
			setState(178);
			match(LPAR);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(179);
				trigger();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
			setState(187);
			match(ELSE);
			setState(188);
			match(EQUALS);
			setState(189);
			match(LPAR);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << EFFECT_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(190);
				effect();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfContext extends ParserRuleContext {
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
		public ElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIf; }
	}

	public final ElseIfContext elseIf() throws RecognitionException {
		ElseIfContext _localctx = new ElseIfContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elseIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(ELSE_IF);
			setState(199);
			match(LPAR);
			setState(200);
			match(EQUALS);
			setState(201);
			limit();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << EFFECT_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(202);
				effect();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
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
		public List<ElseIfContext> elseIf() {
			return getRuleContexts(ElseIfContext.class);
		}
		public ElseIfContext elseIf(int i) {
			return getRuleContext(ElseIfContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(IF);
			setState(211);
			match(EQUALS);
			setState(212);
			match(LPAR);
			setState(213);
			limit();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << EFFECT_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(214);
				effect();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			match(RPAR);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE || _la==ELSE_IF) {
				{
				setState(223);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(221);
					eLSE();
					}
					break;
				case ELSE_IF:
					{
					setState(222);
					elseIf();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(227);
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
		public SimpleBlockContext simpleBlock() {
			return getRuleContext(SimpleBlockContext.class,0);
		}
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public ScriptedEffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptedEffect; }
	}

	public final ScriptedEffectContext scriptedEffect() throws RecognitionException {
		ScriptedEffectContext _localctx = new ScriptedEffectContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_scriptedEffect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(IDENTIFIER);
			setState(229);
			match(EQUALS);
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				setState(230);
				simpleBlock();
				}
				break;
			case YES:
				{
				setState(231);
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
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(EU4GrammarParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public ScriptedEffectContext scriptedEffect() {
			return getRuleContext(ScriptedEffectContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
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
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EFFECT_NAME:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(234);
				match(EFFECT_NAME);
				setState(235);
				match(EQUALS);
				setState(236);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << YES) | (1L << NO) | (1L << TAG) | (1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << IDENTIFIER))) != 0)) ) {
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
				setState(237);
				scriptedEffect();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				ifStatement();
				}
				break;
			case SCOPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
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
		public TerminalNode MODIFIER_NAME() { return getToken(EU4GrammarParser.MODIFIER_NAME, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(EU4GrammarParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
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
			setState(242);
			match(MODIFIER_NAME);
			setState(243);
			match(EQUALS);
			setState(244);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << YES) | (1L << NO) | (1L << TAG) | (1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << IDENTIFIER))) != 0)) ) {
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
		public TriggerBlockContext triggerBlock() {
			return getRuleContext(TriggerBlockContext.class,0);
		}
		public ModifierBlockContext modifierBlock() {
			return getRuleContext(ModifierBlockContext.class,0);
		}
		public ChanceBlockContext chanceBlock() {
			return getRuleContext(ChanceBlockContext.class,0);
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
			setState(246);
			match(SKILL_SACLED_MOD);
			setState(247);
			match(EQUALS);
			setState(248);
			match(LPAR);
			setState(249);
			triggerBlock();
			setState(250);
			modifierBlock();
			setState(251);
			chanceBlock();
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
			setState(254);
			match(FACTOR);
			setState(255);
			match(EQUALS);
			setState(256);
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

	public static class ChanceModContext extends ParserRuleContext {
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
		public ChanceModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chanceMod; }
	}

	public final ChanceModContext chanceMod() throws RecognitionException {
		ChanceModContext _localctx = new ChanceModContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_chanceMod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(MODIFIER);
			setState(259);
			match(EQUALS);
			setState(260);
			match(LPAR);
			setState(261);
			factor();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(262);
				trigger();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		public OrBlockContext orBlock() {
			return getRuleContext(OrBlockContext.class,0);
		}
		public AndBlockContext andBlock() {
			return getRuleContext(AndBlockContext.class,0);
		}
		public NotBlockContext notBlock() {
			return getRuleContext(NotBlockContext.class,0);
		}
		public TerminalNode TRIGGER_NAME() { return getToken(EU4GrammarParser.TRIGGER_NAME, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(EU4GrammarParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public TerminalNode YES() { return getToken(EU4GrammarParser.YES, 0); }
		public TerminalNode NO() { return getToken(EU4GrammarParser.NO, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public ScriptedTriggerContext scriptedTrigger() {
			return getRuleContext(ScriptedTriggerContext.class,0);
		}
		public CustomTriggerTooltipContext customTriggerTooltip() {
			return getRuleContext(CustomTriggerTooltipContext.class,0);
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
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				orBlock();
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				andBlock();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				notBlock();
				}
				break;
			case TRIGGER_NAME:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(273);
				match(TRIGGER_NAME);
				setState(274);
				match(EQUALS);
				setState(275);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << YES) | (1L << NO) | (1L << TAG) | (1L << INT) | (1L << STRING) | (1L << FLOAT) | (1L << IDENTIFIER))) != 0)) ) {
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
				enterOuterAlt(_localctx, 5);
				{
				setState(276);
				scriptedTrigger();
				}
				break;
			case CUSTOM_TRIGGER_TOOLTIP:
				enterOuterAlt(_localctx, 6);
				{
				setState(277);
				customTriggerTooltip();
				}
				break;
			case SCOPE:
				enterOuterAlt(_localctx, 7);
				{
				setState(278);
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

	public static class ScriptedTriggerContext extends ParserRuleContext {
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
		public ScriptedTriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptedTrigger; }
	}

	public final ScriptedTriggerContext scriptedTrigger() throws RecognitionException {
		ScriptedTriggerContext _localctx = new ScriptedTriggerContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_scriptedTrigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(IDENTIFIER);
			setState(282);
			match(EQUALS);
			setState(283);
			match(LPAR);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(284);
				trigger();
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
			setState(292);
			match(SCOPE);
			setState(293);
			match(EQUALS);
			setState(294);
			match(LPAR);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << IF) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << EFFECT_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(295);
					effect();
					}
					break;
				case 2:
					{
					setState(296);
					trigger();
					}
					break;
				case 3:
					{
					setState(297);
					scope();
					}
					break;
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrBlockContext extends ParserRuleContext {
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
		public OrBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orBlock; }
	}

	public final OrBlockContext orBlock() throws RecognitionException {
		OrBlockContext _localctx = new OrBlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_orBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(OR);
			setState(306);
			match(EQUALS);
			setState(307);
			match(LPAR);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(308);
				trigger();
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(314);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndBlockContext extends ParserRuleContext {
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
		public AndBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andBlock; }
	}

	public final AndBlockContext andBlock() throws RecognitionException {
		AndBlockContext _localctx = new AndBlockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_andBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(AND);
			setState(317);
			match(EQUALS);
			setState(318);
			match(LPAR);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(319);
				trigger();
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

	public static class NotBlockContext extends ParserRuleContext {
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
		public NotBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notBlock; }
	}

	public final NotBlockContext notBlock() throws RecognitionException {
		NotBlockContext _localctx = new NotBlockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_notBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(NOT);
			setState(328);
			match(EQUALS);
			setState(329);
			match(LPAR);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(330);
				trigger();
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
			setState(338);
			match(TOOLTIP);
			setState(339);
			match(EQUALS);
			setState(340);
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

	public static class CustomTooltipContext extends ParserRuleContext {
		public TerminalNode CUSTOM_TOOLTIP() { return getToken(EU4GrammarParser.CUSTOM_TOOLTIP, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public CustomTooltipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customTooltip; }
	}

	public final CustomTooltipContext customTooltip() throws RecognitionException {
		CustomTooltipContext _localctx = new CustomTooltipContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_customTooltip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(CUSTOM_TOOLTIP);
			setState(343);
			match(EQUALS);
			setState(344);
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

	public static class CustomTriggerTooltipContext extends ParserRuleContext {
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
		public CustomTriggerTooltipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customTriggerTooltip; }
	}

	public final CustomTriggerTooltipContext customTriggerTooltip() throws RecognitionException {
		CustomTriggerTooltipContext _localctx = new CustomTriggerTooltipContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_customTriggerTooltip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(CUSTOM_TRIGGER_TOOLTIP);
			setState(347);
			match(EQUALS);
			setState(348);
			match(LPAR);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOOLTIP) {
				{
				{
				setState(349);
				tooltip();
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(355);
				trigger();
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
			setState(363);
			match(DESC);
			setState(364);
			match(EQUALS);
			setState(365);
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

	public static class AdvisorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EU4GrammarParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public Monarch_power_advisorContext monarch_power_advisor() {
			return getRuleContext(Monarch_power_advisorContext.class,0);
		}
		public ChanceBlockContext chanceBlock() {
			return getRuleContext(ChanceBlockContext.class,0);
		}
		public AiWillDoBlockContext aiWillDoBlock() {
			return getRuleContext(AiWillDoBlockContext.class,0);
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
		enterRule(_localctx, 60, RULE_advisor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(IDENTIFIER);
			setState(368);
			match(EQUALS);
			setState(369);
			match(LPAR);
			setState(370);
			monarch_power_advisor();
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SKILL_SACLED_MOD || _la==MODIFIER_NAME) {
				{
				setState(373);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODIFIER_NAME:
					{
					setState(371);
					modifier();
					}
					break;
				case SKILL_SACLED_MOD:
					{
					setState(372);
					skill_scaled_modifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(378);
			chanceBlock();
			setState(379);
			aiWillDoBlock();
			setState(380);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 62, RULE_monarch_power_advisor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(MONARCH_POWER);
			setState(383);
			match(EQUALS);
			setState(384);
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
		enterRule(_localctx, 64, RULE_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(IDENTIFIER);
			setState(387);
			match(EQUALS);
			setState(388);
			match(LPAR);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POTENTIAL) | (1L << AI) | (1L << SLOT) | (1L << GENERIC) | (1L << HAS_COUNTRY_SHIELD) | (1L << POTENTIAL_ON_LOAD) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(396);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SLOT:
					{
					setState(389);
					slot_missionSeries();
					}
					break;
				case GENERIC:
					{
					setState(390);
					generic_missionSeries();
					}
					break;
				case AI:
					{
					setState(391);
					ai_missionSeries();
					}
					break;
				case HAS_COUNTRY_SHIELD:
					{
					setState(392);
					hasCountryShield_missionSeries();
					}
					break;
				case POTENTIAL_ON_LOAD:
					{
					setState(393);
					potentialOnLoad_missionSeries();
					}
					break;
				case POTENTIAL:
					{
					setState(394);
					potential_missionSeries();
					}
					break;
				case IDENTIFIER:
					{
					setState(395);
					missionBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(401);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 66, RULE_slot_missionSeries);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(SLOT);
			setState(404);
			match(EQUALS);
			setState(405);
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
		enterRule(_localctx, 68, RULE_generic_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(GENERIC);
			setState(408);
			match(EQUALS);
			setState(409);
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
		enterRule(_localctx, 70, RULE_ai_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(AI);
			setState(412);
			match(EQUALS);
			setState(413);
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
		enterRule(_localctx, 72, RULE_hasCountryShield_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(HAS_COUNTRY_SHIELD);
			setState(416);
			match(EQUALS);
			setState(417);
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
		enterRule(_localctx, 74, RULE_potentialOnLoad_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(POTENTIAL_ON_LOAD);
			setState(420);
			match(EQUALS);
			setState(421);
			match(LPAR);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(422);
				trigger();
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(428);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 76, RULE_potential_missionSeries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(POTENTIAL);
			setState(431);
			match(EQUALS);
			setState(432);
			match(LPAR);
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(433);
				trigger();
				}
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(439);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		public List<TriggerBlockContext> triggerBlock() {
			return getRuleContexts(TriggerBlockContext.class);
		}
		public TriggerBlockContext triggerBlock(int i) {
			return getRuleContext(TriggerBlockContext.class,i);
		}
		public List<EffectBlockContext> effectBlock() {
			return getRuleContexts(EffectBlockContext.class);
		}
		public EffectBlockContext effectBlock(int i) {
			return getRuleContext(EffectBlockContext.class,i);
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
		enterRule(_localctx, 78, RULE_missionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(IDENTIFIER);
			setState(442);
			match(EQUALS);
			setState(443);
			match(LPAR);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRIGGER) | (1L << EFFECT) | (1L << AI_WEIGHT) | (1L << ICON) | (1L << POSITION) | (1L << COMPLETED_BY) | (1L << REQUIRED_MISSIONS) | (1L << PROVINCES_TO_HIGHLIGHT))) != 0)) {
				{
				setState(452);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ICON:
					{
					setState(444);
					icon_mission();
					}
					break;
				case POSITION:
					{
					setState(445);
					position_mission();
					}
					break;
				case COMPLETED_BY:
					{
					setState(446);
					completedBy_mission();
					}
					break;
				case REQUIRED_MISSIONS:
					{
					setState(447);
					requiredMissions_mission();
					}
					break;
				case PROVINCES_TO_HIGHLIGHT:
					{
					setState(448);
					provincesToHighlight_mission();
					}
					break;
				case TRIGGER:
					{
					setState(449);
					triggerBlock();
					}
					break;
				case EFFECT:
					{
					setState(450);
					effectBlock();
					}
					break;
				case AI_WEIGHT:
					{
					setState(451);
					aiWeight_mission();
					}
					break;
				default:
					throw new NoViableAltException(this);
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
		enterRule(_localctx, 80, RULE_icon_mission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(ICON);
			setState(460);
			match(EQUALS);
			setState(461);
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
		enterRule(_localctx, 82, RULE_position_mission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(POSITION);
			setState(464);
			match(EQUALS);
			setState(465);
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
		enterRule(_localctx, 84, RULE_completedBy_mission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(COMPLETED_BY);
			setState(468);
			match(EQUALS);
			setState(469);
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
		enterRule(_localctx, 86, RULE_requiredMissions_mission);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(REQUIRED_MISSIONS);
			setState(472);
			match(EQUALS);
			setState(473);
			match(LPAR);
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(474);
				match(IDENTIFIER);
				}
				}
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(480);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 88, RULE_provincesToHighlight_mission);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(PROVINCES_TO_HIGHLIGHT);
			setState(483);
			match(EQUALS);
			setState(484);
			match(LPAR);
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << SCOPE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(485);
				trigger();
				}
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(491);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 90, RULE_aiWeight_mission);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(AI_WEIGHT);
			setState(494);
			match(EQUALS);
			setState(495);
			match(LPAR);
			setState(496);
			factor();
			setState(497);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u01f6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\3\7\3d\n\3\f\3\16\3g\13\3\3\3"+
		"\3\3\3\4\3\4\7\4m\n\4\f\4\16\4p\13\4\3\4\3\4\3\5\3\5\5\5v\n\5\3\6\3\6"+
		"\3\6\3\6\7\6|\n\6\f\6\16\6\177\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u0087"+
		"\n\7\f\7\16\7\u008a\13\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u0092\n\b\f\b\16"+
		"\b\u0095\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t\u009e\n\t\f\t\16\t\u00a1"+
		"\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u00aa\n\n\f\n\16\n\u00ad\13\n\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u00b7\n\f\f\f\16\f\u00ba\13\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\7\r\u00c2\n\r\f\r\16\r\u00c5\13\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\7\16\u00ce\n\16\f\16\16\16\u00d1\13\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\7\17\u00da\n\17\f\17\16\17\u00dd\13\17\3\17\3"+
		"\17\3\17\7\17\u00e2\n\17\f\17\16\17\u00e5\13\17\3\20\3\20\3\20\3\20\5"+
		"\20\u00eb\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00f3\n\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\7\25\u010a\n\25\f\25\16\25\u010d\13\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u011a\n\26\3\27"+
		"\3\27\3\27\3\27\7\27\u0120\n\27\f\27\16\27\u0123\13\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\7\30\u012d\n\30\f\30\16\30\u0130\13\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\7\31\u0138\n\31\f\31\16\31\u013b\13\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\7\32\u0143\n\32\f\32\16\32\u0146\13\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\7\33\u014e\n\33\f\33\16\33\u0151\13\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36"+
		"\u0161\n\36\f\36\16\36\u0164\13\36\3\36\7\36\u0167\n\36\f\36\16\36\u016a"+
		"\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \7 \u0178\n \f "+
		"\16 \u017b\13 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\7\"\u018f\n\"\f\"\16\"\u0192\13\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\7\'\u01aa\n\'\f\'\16\'\u01ad"+
		"\13\'\3\'\3\'\3(\3(\3(\3(\7(\u01b5\n(\f(\16(\u01b8\13(\3(\3(\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\7)\u01c7\n)\f)\16)\u01ca\13)\3)\3)\3*\3*\3*\3"+
		"*\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\7-\u01de\n-\f-\16-\u01e1\13-\3-"+
		"\3-\3.\3.\3.\3.\7.\u01e9\n.\f.\16.\u01ec\13.\3.\3.\3/\3/\3/\3/\3/\3/\3"+
		"/\2\2\60\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDFHJLNPRTVXZ\\\2\5\5\2\5\6\t\f\64\64\4\2\n\n\f\f\3\2\5\6\2\u01ff"+
		"\2^\3\2\2\2\4`\3\2\2\2\6j\3\2\2\2\bu\3\2\2\2\nw\3\2\2\2\f\u0082\3\2\2"+
		"\2\16\u008d\3\2\2\2\20\u0098\3\2\2\2\22\u00a4\3\2\2\2\24\u00b0\3\2\2\2"+
		"\26\u00b2\3\2\2\2\30\u00bd\3\2\2\2\32\u00c8\3\2\2\2\34\u00d4\3\2\2\2\36"+
		"\u00e6\3\2\2\2 \u00f2\3\2\2\2\"\u00f4\3\2\2\2$\u00f8\3\2\2\2&\u0100\3"+
		"\2\2\2(\u0104\3\2\2\2*\u0119\3\2\2\2,\u011b\3\2\2\2.\u0126\3\2\2\2\60"+
		"\u0133\3\2\2\2\62\u013e\3\2\2\2\64\u0149\3\2\2\2\66\u0154\3\2\2\28\u0158"+
		"\3\2\2\2:\u015c\3\2\2\2<\u016d\3\2\2\2>\u0171\3\2\2\2@\u0180\3\2\2\2B"+
		"\u0184\3\2\2\2D\u0195\3\2\2\2F\u0199\3\2\2\2H\u019d\3\2\2\2J\u01a1\3\2"+
		"\2\2L\u01a5\3\2\2\2N\u01b0\3\2\2\2P\u01bb\3\2\2\2R\u01cd\3\2\2\2T\u01d1"+
		"\3\2\2\2V\u01d5\3\2\2\2X\u01d9\3\2\2\2Z\u01e4\3\2\2\2\\\u01ef\3\2\2\2"+
		"^_\5> \2_\3\3\2\2\2`e\7\r\2\2ad\5\b\5\2bd\5\34\17\2ca\3\2\2\2cb\3\2\2"+
		"\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\16\2\2i\5\3\2"+
		"\2\2jn\7\r\2\2km\5\b\5\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2"+
		"\2\2pn\3\2\2\2qr\7\16\2\2r\7\3\2\2\2sv\5 \21\2tv\5\4\3\2us\3\2\2\2ut\3"+
		"\2\2\2v\t\3\2\2\2wx\7\32\2\2xy\7\17\2\2y}\7\r\2\2z|\5*\26\2{z\3\2\2\2"+
		"|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081"+
		"\7\16\2\2\u0081\13\3\2\2\2\u0082\u0083\7\33\2\2\u0083\u0084\7\17\2\2\u0084"+
		"\u0088\7\r\2\2\u0085\u0087\5 \21\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008c\7\16\2\2\u008c\r\3\2\2\2\u008d\u008e\7&\2\2"+
		"\u008e\u008f\7\17\2\2\u008f\u0093\7\r\2\2\u0090\u0092\5\"\22\2\u0091\u0090"+
		"\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7\16\2\2\u0097\17\3\2\2"+
		"\2\u0098\u0099\7\'\2\2\u0099\u009a\7\17\2\2\u009a\u009b\7\r\2\2\u009b"+
		"\u009f\5&\24\2\u009c\u009e\5(\25\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a3\7\16\2\2\u00a3\21\3\2\2\2\u00a4\u00a5\7(\2"+
		"\2\u00a5\u00a6\7\17\2\2\u00a6\u00a7\7\r\2\2\u00a7\u00ab\5&\24\2\u00a8"+
		"\u00aa\5(\25\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00af\7\16\2\2\u00af\23\3\2\2\2\u00b0\u00b1\t\2\2\2\u00b1\25\3\2\2\2"+
		"\u00b2\u00b3\7\27\2\2\u00b3\u00b4\7\17\2\2\u00b4\u00b8\7\r\2\2\u00b5\u00b7"+
		"\5*\26\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7\16"+
		"\2\2\u00bc\27\3\2\2\2\u00bd\u00be\7\25\2\2\u00be\u00bf\7\17\2\2\u00bf"+
		"\u00c3\7\r\2\2\u00c0\u00c2\5 \21\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c6\u00c7\7\16\2\2\u00c7\31\3\2\2\2\u00c8\u00c9\7\26"+
		"\2\2\u00c9\u00ca\7\r\2\2\u00ca\u00cb\7\17\2\2\u00cb\u00cf\5\26\f\2\u00cc"+
		"\u00ce\5 \21\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00d3\7\16\2\2\u00d3\33\3\2\2\2\u00d4\u00d5\7\24\2\2\u00d5\u00d6\7\17"+
		"\2\2\u00d6\u00d7\7\r\2\2\u00d7\u00db\5\26\f\2\u00d8\u00da\5 \21\2\u00d9"+
		"\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e3\7\16\2\2\u00df"+
		"\u00e2\5\30\r\2\u00e0\u00e2\5\32\16\2\u00e1\u00df\3\2\2\2\u00e1\u00e0"+
		"\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\35\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7\64\2\2\u00e7\u00ea\7\17"+
		"\2\2\u00e8\u00eb\5\6\4\2\u00e9\u00eb\7\5\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00e9\3\2\2\2\u00eb\37\3\2\2\2\u00ec\u00ed\7\"\2\2\u00ed\u00ee\7\17\2"+
		"\2\u00ee\u00f3\t\2\2\2\u00ef\u00f3\5\36\20\2\u00f0\u00f3\5\34\17\2\u00f1"+
		"\u00f3\5.\30\2\u00f2\u00ec\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f2\u00f1\3\2\2\2\u00f3!\3\2\2\2\u00f4\u00f5\7!\2\2\u00f5\u00f6"+
		"\7\17\2\2\u00f6\u00f7\t\2\2\2\u00f7#\3\2\2\2\u00f8\u00f9\7\30\2\2\u00f9"+
		"\u00fa\7\17\2\2\u00fa\u00fb\7\r\2\2\u00fb\u00fc\5\n\6\2\u00fc\u00fd\5"+
		"\16\b\2\u00fd\u00fe\5\20\t\2\u00fe\u00ff\7\16\2\2\u00ff%\3\2\2\2\u0100"+
		"\u0101\7)\2\2\u0101\u0102\7\17\2\2\u0102\u0103\t\3\2\2\u0103\'\3\2\2\2"+
		"\u0104\u0105\7&\2\2\u0105\u0106\7\17\2\2\u0106\u0107\7\r\2\2\u0107\u010b"+
		"\5&\24\2\u0108\u010a\5*\26\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010e\u010f\7\16\2\2\u010f)\3\2\2\2\u0110\u011a\5\60\31\2\u0111\u011a"+
		"\5\62\32\2\u0112\u011a\5\64\33\2\u0113\u0114\7 \2\2\u0114\u0115\7\17\2"+
		"\2\u0115\u011a\t\2\2\2\u0116\u011a\5,\27\2\u0117\u011a\5:\36\2\u0118\u011a"+
		"\5.\30\2\u0119\u0110\3\2\2\2\u0119\u0111\3\2\2\2\u0119\u0112\3\2\2\2\u0119"+
		"\u0113\3\2\2\2\u0119\u0116\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2"+
		"\2\2\u011a+\3\2\2\2\u011b\u011c\7\64\2\2\u011c\u011d\7\17\2\2\u011d\u0121"+
		"\7\r\2\2\u011e\u0120\5*\26\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2"+
		"\2\2\u0124\u0125\7\16\2\2\u0125-\3\2\2\2\u0126\u0127\7#\2\2\u0127\u0128"+
		"\7\17\2\2\u0128\u012e\7\r\2\2\u0129\u012d\5 \21\2\u012a\u012d\5*\26\2"+
		"\u012b\u012d\5.\30\2\u012c\u0129\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012b"+
		"\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\7\16\2\2\u0132/\3\2\2\2"+
		"\u0133\u0134\7\4\2\2\u0134\u0135\7\17\2\2\u0135\u0139\7\r\2\2\u0136\u0138"+
		"\5*\26\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7\16"+
		"\2\2\u013d\61\3\2\2\2\u013e\u013f\7\3\2\2\u013f\u0140\7\17\2\2\u0140\u0144"+
		"\7\r\2\2\u0141\u0143\5*\26\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2"+
		"\2\2\u0147\u0148\7\16\2\2\u0148\63\3\2\2\2\u0149\u014a\7\7\2\2\u014a\u014b"+
		"\7\17\2\2\u014b\u014f\7\r\2\2\u014c\u014e\5*\26\2\u014d\u014c\3\2\2\2"+
		"\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152"+
		"\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7\16\2\2\u0153\65\3\2\2\2\u0154"+
		"\u0155\7\34\2\2\u0155\u0156\7\17\2\2\u0156\u0157\7\13\2\2\u0157\67\3\2"+
		"\2\2\u0158\u0159\7\35\2\2\u0159\u015a\7\17\2\2\u015a\u015b\7\13\2\2\u015b"+
		"9\3\2\2\2\u015c\u015d\7\37\2\2\u015d\u015e\7\17\2\2\u015e\u0162\7\r\2"+
		"\2\u015f\u0161\5\66\34\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0168\3\2\2\2\u0164\u0162\3\2"+
		"\2\2\u0165\u0167\5*\26\2\u0166\u0165\3\2\2\2\u0167\u016a\3\2\2\2\u0168"+
		"\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0168\3\2"+
		"\2\2\u016b\u016c\7\16\2\2\u016c;\3\2\2\2\u016d\u016e\7\36\2\2\u016e\u016f"+
		"\7\17\2\2\u016f\u0170\7\13\2\2\u0170=\3\2\2\2\u0171\u0172\7\64\2\2\u0172"+
		"\u0173\7\17\2\2\u0173\u0174\7\r\2\2\u0174\u0179\5@!\2\u0175\u0178\5\""+
		"\22\2\u0176\u0178\5$\23\2\u0177\u0175\3\2\2\2\u0177\u0176\3\2\2\2\u0178"+
		"\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2"+
		"\2\2\u017b\u0179\3\2\2\2\u017c\u017d\5\20\t\2\u017d\u017e\5\22\n\2\u017e"+
		"\u017f\7\16\2\2\u017f?\3\2\2\2\u0180\u0181\7$\2\2\u0181\u0182\7\17\2\2"+
		"\u0182\u0183\7\b\2\2\u0183A\3\2\2\2\u0184\u0185\7\64\2\2\u0185\u0186\7"+
		"\17\2\2\u0186\u0190\7\r\2\2\u0187\u018f\5D#\2\u0188\u018f\5F$\2\u0189"+
		"\u018f\5H%\2\u018a\u018f\5J&\2\u018b\u018f\5L\'\2\u018c\u018f\5N(\2\u018d"+
		"\u018f\5P)\2\u018e\u0187\3\2\2\2\u018e\u0188\3\2\2\2\u018e\u0189\3\2\2"+
		"\2\u018e\u018a\3\2\2\2\u018e\u018b\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018d"+
		"\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0193\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0194\7\16\2\2\u0194C\3\2\2\2"+
		"\u0195\u0196\7+\2\2\u0196\u0197\7\17\2\2\u0197\u0198\7\n\2\2\u0198E\3"+
		"\2\2\2\u0199\u019a\7,\2\2\u019a\u019b\7\17\2\2\u019b\u019c\t\4\2\2\u019c"+
		"G\3\2\2\2\u019d\u019e\7%\2\2\u019e\u019f\7\17\2\2\u019f\u01a0\t\4\2\2"+
		"\u01a0I\3\2\2\2\u01a1\u01a2\7-\2\2\u01a2\u01a3\7\17\2\2\u01a3\u01a4\t"+
		"\4\2\2\u01a4K\3\2\2\2\u01a5\u01a6\7.\2\2\u01a6\u01a7\7\17\2\2\u01a7\u01ab"+
		"\7\r\2\2\u01a8\u01aa\5*\26\2\u01a9\u01a8\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab"+
		"\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01ab\3\2"+
		"\2\2\u01ae\u01af\7\16\2\2\u01afM\3\2\2\2\u01b0\u01b1\7\31\2\2\u01b1\u01b2"+
		"\7\17\2\2\u01b2\u01b6\7\r\2\2\u01b3\u01b5\5*\26\2\u01b4\u01b3\3\2\2\2"+
		"\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b9"+
		"\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01ba\7\16\2\2\u01baO\3\2\2\2\u01bb"+
		"\u01bc\7\64\2\2\u01bc\u01bd\7\17\2\2\u01bd\u01c8\7\r\2\2\u01be\u01c7\5"+
		"R*\2\u01bf\u01c7\5T+\2\u01c0\u01c7\5V,\2\u01c1\u01c7\5X-\2\u01c2\u01c7"+
		"\5Z.\2\u01c3\u01c7\5\n\6\2\u01c4\u01c7\5\f\7\2\u01c5\u01c7\5\\/\2\u01c6"+
		"\u01be\3\2\2\2\u01c6\u01bf\3\2\2\2\u01c6\u01c0\3\2\2\2\u01c6\u01c1\3\2"+
		"\2\2\u01c6\u01c2\3\2\2\2\u01c6\u01c3\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6"+
		"\u01c5\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2"+
		"\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01cc\7\16\2\2\u01cc"+
		"Q\3\2\2\2\u01cd\u01ce\7/\2\2\u01ce\u01cf\7\17\2\2\u01cf\u01d0\7\64\2\2"+
		"\u01d0S\3\2\2\2\u01d1\u01d2\7\60\2\2\u01d2\u01d3\7\17\2\2\u01d3\u01d4"+
		"\7\n\2\2\u01d4U\3\2\2\2\u01d5\u01d6\7\61\2\2\u01d6\u01d7\7\17\2\2\u01d7"+
		"\u01d8\7\13\2\2\u01d8W\3\2\2\2\u01d9\u01da\7\62\2\2\u01da\u01db\7\17\2"+
		"\2\u01db\u01df\7\r\2\2\u01dc\u01de\7\64\2\2\u01dd\u01dc\3\2\2\2\u01de"+
		"\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e2\3\2"+
		"\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e3\7\16\2\2\u01e3Y\3\2\2\2\u01e4\u01e5"+
		"\7\63\2\2\u01e5\u01e6\7\17\2\2\u01e6\u01ea\7\r\2\2\u01e7\u01e9\5*\26\2"+
		"\u01e8\u01e7\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb"+
		"\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ee\7\16\2\2"+
		"\u01ee[\3\2\2\2\u01ef\u01f0\7*\2\2\u01f0\u01f1\7\17\2\2\u01f1\u01f2\7"+
		"\r\2\2\u01f2\u01f3\5&\24\2\u01f3\u01f4\7\16\2\2\u01f4]\3\2\2\2\'cenu}"+
		"\u0088\u0093\u009f\u00ab\u00b8\u00c3\u00cf\u00db\u00e1\u00e3\u00ea\u00f2"+
		"\u010b\u0119\u0121\u012c\u012e\u0139\u0144\u014f\u0162\u0168\u0177\u0179"+
		"\u018e\u0190\u01ab\u01b6\u01c6\u01c8\u01df\u01ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}