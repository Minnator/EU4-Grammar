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
		IF=18, ELSE=19, ELSE_IF=20, LIMIT=21, SKILL_SACLED_MOD=22, MODIFIER=23, 
		CHANCE=24, AI_WILL_DO=25, FACTOR=26, TOOLTIP=27, CUSTOM_TOOLTIP=28, DESC=29, 
		CUSTOM_TRIGGER_TOOLTIP=30, TRIGGER_NAME=31, MODIFIER_NAME=32, EFFECT_NAME=33, 
		IDENTIFIER=34;
	public static final int
		RULE_block = 0, RULE_simpleBlock = 1, RULE_statement = 2, RULE_bool = 3, 
		RULE_value = 4, RULE_limit = 5, RULE_eLSE = 6, RULE_elseIf = 7, RULE_ifStatement = 8, 
		RULE_scriptedEffect = 9, RULE_effect = 10, RULE_modifier = 11, RULE_scriptedTrigger = 12, 
		RULE_factor = 13, RULE_chanceMod = 14, RULE_chance = 15, RULE_trigger = 16, 
		RULE_booleanTrigger = 17, RULE_orBlock = 18, RULE_andBlock = 19, RULE_notBlock = 20, 
		RULE_tooltip = 21, RULE_customTooltip = 22, RULE_customTriggerTooltip = 23, 
		RULE_desc = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"block", "simpleBlock", "statement", "bool", "value", "limit", "eLSE", 
			"elseIf", "ifStatement", "scriptedEffect", "effect", "modifier", "scriptedTrigger", 
			"factor", "chanceMod", "chance", "trigger", "booleanTrigger", "orBlock", 
			"andBlock", "notBlock", "tooltip", "customTooltip", "customTriggerTooltip", 
			"desc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'AND'", "'OR'", null, null, null, null, null, null, null, null, 
			"'{'", "'}'", "'='", "'+'", "'-'", null, null, "'if'", "'else'", "'else_if'", 
			"'limit'", "'skill_scaled_modifier'", "'modifier'", "'chance'", "'ai_will_do'", 
			"'factor'", "'tooltip'", "'custom_tooltip'", "'desc'", "'custom_trigger_tooltip'", 
			"'is_core'", "'monarch_power'", "'add_core'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "YES", "NO", "NOT", "MPOWER", "TAG", "INT", "STRING", 
			"FLOAT", "LPAR", "RPAR", "EQUALS", "PLUS", "MINUS", "WHITESPACE", "SINGLE_LINE_COMMENT", 
			"IF", "ELSE", "ELSE_IF", "LIMIT", "SKILL_SACLED_MOD", "MODIFIER", "CHANCE", 
			"AI_WILL_DO", "FACTOR", "TOOLTIP", "CUSTOM_TOOLTIP", "DESC", "CUSTOM_TRIGGER_TOOLTIP", 
			"TRIGGER_NAME", "MODIFIER_NAME", "EFFECT_NAME", "IDENTIFIER"
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
		enterRule(_localctx, 0, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(LPAR);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << IF) | (1L << EFFECT_NAME) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(53);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(51);
					statement();
					}
					break;
				case 2:
					{
					setState(52);
					ifStatement();
					}
					break;
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 2, RULE_simpleBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(LPAR);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << IF) | (1L << EFFECT_NAME) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(61);
				statement();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case EFFECT_NAME:
			case IDENTIFIER:
				{
				setState(69);
				effect();
				}
				break;
			case LPAR:
				{
				setState(70);
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
		enterRule(_localctx, 6, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode TAG() { return getToken(EU4GrammarParser.TAG, 0); }
		public TerminalNode INT() { return getToken(EU4GrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(EU4GrammarParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(EU4GrammarParser.STRING, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(TAG);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				match(STRING);
				}
				break;
			case YES:
			case NO:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				bool();
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
		enterRule(_localctx, 10, RULE_limit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(LIMIT);
			setState(83);
			match(EQUALS);
			setState(84);
			match(LPAR);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(85);
				trigger();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 12, RULE_eLSE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(ELSE);
			setState(94);
			match(EQUALS);
			setState(95);
			match(LPAR);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << EFFECT_NAME) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(96);
				effect();
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
		enterRule(_localctx, 14, RULE_elseIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(ELSE_IF);
			setState(105);
			match(LPAR);
			setState(106);
			match(EQUALS);
			setState(107);
			limit();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << EFFECT_NAME) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(108);
				effect();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 16, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(IF);
			setState(117);
			match(EQUALS);
			setState(118);
			match(LPAR);
			setState(119);
			limit();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << EFFECT_NAME) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(120);
				effect();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(RPAR);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE || _la==ELSE_IF) {
				{
				setState(129);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(127);
					eLSE();
					}
					break;
				case ELSE_IF:
					{
					setState(128);
					elseIf();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(133);
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
		enterRule(_localctx, 18, RULE_scriptedEffect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(IDENTIFIER);
			setState(135);
			match(EQUALS);
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				setState(136);
				simpleBlock();
				}
				break;
			case YES:
				{
				setState(137);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ScriptedEffectContext scriptedEffect() {
			return getRuleContext(ScriptedEffectContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public EffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effect; }
	}

	public final EffectContext effect() throws RecognitionException {
		EffectContext _localctx = new EffectContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_effect);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EFFECT_NAME:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(140);
				match(EFFECT_NAME);
				setState(141);
				match(EQUALS);
				setState(142);
				value();
				}
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				scriptedEffect();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				ifStatement();
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(MODIFIER_NAME);
			setState(148);
			match(EQUALS);
			setState(149);
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
		enterRule(_localctx, 24, RULE_scriptedTrigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(IDENTIFIER);
			setState(152);
			match(EQUALS);
			setState(153);
			match(LPAR);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(154);
				trigger();
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
			setState(162);
			match(FACTOR);
			setState(163);
			match(EQUALS);
			setState(164);
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
		enterRule(_localctx, 28, RULE_chanceMod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(MODIFIER);
			setState(167);
			match(EQUALS);
			setState(168);
			match(LPAR);
			setState(169);
			factor();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(170);
				trigger();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChanceContext extends ParserRuleContext {
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
		public ChanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chance; }
	}

	public final ChanceContext chance() throws RecognitionException {
		ChanceContext _localctx = new ChanceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_chance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(CHANCE);
			setState(179);
			match(EQUALS);
			setState(180);
			match(LPAR);
			setState(181);
			factor();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(182);
				chanceMod();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ScriptedTriggerContext scriptedTrigger() {
			return getRuleContext(ScriptedTriggerContext.class,0);
		}
		public CustomTriggerTooltipContext customTriggerTooltip() {
			return getRuleContext(CustomTriggerTooltipContext.class,0);
		}
		public TriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger; }
	}

	public final TriggerContext trigger() throws RecognitionException {
		TriggerContext _localctx = new TriggerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_trigger);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				orBlock();
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				andBlock();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				notBlock();
				}
				break;
			case TRIGGER_NAME:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(193);
				match(TRIGGER_NAME);
				setState(194);
				match(EQUALS);
				setState(195);
				value();
				}
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				scriptedTrigger();
				}
				break;
			case CUSTOM_TRIGGER_TOOLTIP:
				enterOuterAlt(_localctx, 6);
				{
				setState(197);
				customTriggerTooltip();
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

	public static class BooleanTriggerContext extends ParserRuleContext {
		public OrBlockContext orBlock() {
			return getRuleContext(OrBlockContext.class,0);
		}
		public AndBlockContext andBlock() {
			return getRuleContext(AndBlockContext.class,0);
		}
		public NotBlockContext notBlock() {
			return getRuleContext(NotBlockContext.class,0);
		}
		public BooleanTriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanTrigger; }
	}

	public final BooleanTriggerContext booleanTrigger() throws RecognitionException {
		BooleanTriggerContext _localctx = new BooleanTriggerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_booleanTrigger);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				orBlock();
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				andBlock();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				notBlock();
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
		enterRule(_localctx, 36, RULE_orBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(OR);
			setState(206);
			match(EQUALS);
			setState(207);
			match(LPAR);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(208);
				trigger();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 38, RULE_andBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(AND);
			setState(217);
			match(EQUALS);
			setState(218);
			match(LPAR);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(219);
				trigger();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 40, RULE_notBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(NOT);
			setState(228);
			match(EQUALS);
			setState(229);
			match(LPAR);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(230);
				trigger();
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
		enterRule(_localctx, 42, RULE_tooltip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(TOOLTIP);
			setState(239);
			match(EQUALS);
			setState(240);
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
		enterRule(_localctx, 44, RULE_customTooltip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(CUSTOM_TOOLTIP);
			setState(243);
			match(EQUALS);
			setState(244);
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
		enterRule(_localctx, 46, RULE_customTriggerTooltip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(CUSTOM_TRIGGER_TOOLTIP);
			setState(247);
			match(EQUALS);
			setState(248);
			match(LPAR);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOOLTIP) {
				{
				{
				setState(249);
				tooltip();
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(255);
				trigger();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 48, RULE_desc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(DESC);
			setState(264);
			match(EQUALS);
			setState(265);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u010e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\3\3\3\3\7\3A\n"+
		"\3\f\3\16\3D\13\3\3\3\3\3\3\4\3\4\5\4J\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\5\6S\n\6\3\7\3\7\3\7\3\7\7\7Y\n\7\f\7\16\7\\\13\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\7\bd\n\b\f\b\16\bg\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\tp\n\t\f\t"+
		"\16\ts\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n|\n\n\f\n\16\n\177\13\n\3\n"+
		"\3\n\3\n\7\n\u0084\n\n\f\n\16\n\u0087\13\n\3\13\3\13\3\13\3\13\5\13\u008d"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u0094\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\7\16\u009e\n\16\f\16\16\16\u00a1\13\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\7\20\u00ae\n\20\f\20\16\20\u00b1\13\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\7\21\u00ba\n\21\f\21\16\21\u00bd\13"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c9\n\22"+
		"\3\23\3\23\3\23\5\23\u00ce\n\23\3\24\3\24\3\24\3\24\7\24\u00d4\n\24\f"+
		"\24\16\24\u00d7\13\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00df\n\25\f"+
		"\25\16\25\u00e2\13\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00ea\n\26\f"+
		"\26\16\26\u00ed\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\7\31\u00fd\n\31\f\31\16\31\u0100\13\31\3\31\7\31"+
		"\u0103\n\31\f\31\16\31\u0106\13\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\4\3\2"+
		"\5\6\4\2\n\n\f\f\2\u0114\2\64\3\2\2\2\4>\3\2\2\2\6I\3\2\2\2\bK\3\2\2\2"+
		"\nR\3\2\2\2\fT\3\2\2\2\16_\3\2\2\2\20j\3\2\2\2\22v\3\2\2\2\24\u0088\3"+
		"\2\2\2\26\u0093\3\2\2\2\30\u0095\3\2\2\2\32\u0099\3\2\2\2\34\u00a4\3\2"+
		"\2\2\36\u00a8\3\2\2\2 \u00b4\3\2\2\2\"\u00c8\3\2\2\2$\u00cd\3\2\2\2&\u00cf"+
		"\3\2\2\2(\u00da\3\2\2\2*\u00e5\3\2\2\2,\u00f0\3\2\2\2.\u00f4\3\2\2\2\60"+
		"\u00f8\3\2\2\2\62\u0109\3\2\2\2\649\7\r\2\2\658\5\6\4\2\668\5\22\n\2\67"+
		"\65\3\2\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9"+
		"\3\2\2\2<=\7\16\2\2=\3\3\2\2\2>B\7\r\2\2?A\5\6\4\2@?\3\2\2\2AD\3\2\2\2"+
		"B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\16\2\2F\5\3\2\2\2GJ\5\26"+
		"\f\2HJ\5\2\2\2IG\3\2\2\2IH\3\2\2\2J\7\3\2\2\2KL\t\2\2\2L\t\3\2\2\2MS\7"+
		"\t\2\2NS\7\n\2\2OS\7\f\2\2PS\7\13\2\2QS\5\b\5\2RM\3\2\2\2RN\3\2\2\2RO"+
		"\3\2\2\2RP\3\2\2\2RQ\3\2\2\2S\13\3\2\2\2TU\7\27\2\2UV\7\17\2\2VZ\7\r\2"+
		"\2WY\5\"\22\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3"+
		"\2\2\2]^\7\16\2\2^\r\3\2\2\2_`\7\25\2\2`a\7\17\2\2ae\7\r\2\2bd\5\26\f"+
		"\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\16"+
		"\2\2i\17\3\2\2\2jk\7\26\2\2kl\7\r\2\2lm\7\17\2\2mq\5\f\7\2np\5\26\f\2"+
		"on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\7\16\2"+
		"\2u\21\3\2\2\2vw\7\24\2\2wx\7\17\2\2xy\7\r\2\2y}\5\f\7\2z|\5\26\f\2{z"+
		"\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2"+
		"\u0080\u0085\7\16\2\2\u0081\u0084\5\16\b\2\u0082\u0084\5\20\t\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0085\u0086\3\2\2\2\u0086\23\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089"+
		"\7$\2\2\u0089\u008c\7\17\2\2\u008a\u008d\5\4\3\2\u008b\u008d\7\5\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\25\3\2\2\2\u008e\u008f\7#\2\2"+
		"\u008f\u0090\7\17\2\2\u0090\u0094\5\n\6\2\u0091\u0094\5\24\13\2\u0092"+
		"\u0094\5\22\n\2\u0093\u008e\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3"+
		"\2\2\2\u0094\27\3\2\2\2\u0095\u0096\7\"\2\2\u0096\u0097\7\17\2\2\u0097"+
		"\u0098\5\n\6\2\u0098\31\3\2\2\2\u0099\u009a\7$\2\2\u009a\u009b\7\17\2"+
		"\2\u009b\u009f\7\r\2\2\u009c\u009e\5\"\22\2\u009d\u009c\3\2\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\16\2\2\u00a3\33\3\2\2\2\u00a4\u00a5"+
		"\7\34\2\2\u00a5\u00a6\7\17\2\2\u00a6\u00a7\t\3\2\2\u00a7\35\3\2\2\2\u00a8"+
		"\u00a9\7\31\2\2\u00a9\u00aa\7\17\2\2\u00aa\u00ab\7\r\2\2\u00ab\u00af\5"+
		"\34\17\2\u00ac\u00ae\5\"\22\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2"+
		"\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af"+
		"\3\2\2\2\u00b2\u00b3\7\16\2\2\u00b3\37\3\2\2\2\u00b4\u00b5\7\32\2\2\u00b5"+
		"\u00b6\7\17\2\2\u00b6\u00b7\7\r\2\2\u00b7\u00bb\5\34\17\2\u00b8\u00ba"+
		"\5\36\20\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2"+
		"\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf"+
		"\7\16\2\2\u00bf!\3\2\2\2\u00c0\u00c9\5&\24\2\u00c1\u00c9\5(\25\2\u00c2"+
		"\u00c9\5*\26\2\u00c3\u00c4\7!\2\2\u00c4\u00c5\7\17\2\2\u00c5\u00c9\5\n"+
		"\6\2\u00c6\u00c9\5\32\16\2\u00c7\u00c9\5\60\31\2\u00c8\u00c0\3\2\2\2\u00c8"+
		"\u00c1\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c8\u00c7\3\2\2\2\u00c9#\3\2\2\2\u00ca\u00ce\5&\24\2\u00cb\u00ce"+
		"\5(\25\2\u00cc\u00ce\5*\26\2\u00cd\u00ca\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce%\3\2\2\2\u00cf\u00d0\7\4\2\2\u00d0\u00d1\7\17\2\2"+
		"\u00d1\u00d5\7\r\2\2\u00d2\u00d4\5\"\22\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7"+
		"\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00d9\7\16\2\2\u00d9\'\3\2\2\2\u00da\u00db\7\3\2"+
		"\2\u00db\u00dc\7\17\2\2\u00dc\u00e0\7\r\2\2\u00dd\u00df\5\"\22\2\u00de"+
		"\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7\16\2\2\u00e4"+
		")\3\2\2\2\u00e5\u00e6\7\7\2\2\u00e6\u00e7\7\17\2\2\u00e7\u00eb\7\r\2\2"+
		"\u00e8\u00ea\5\"\22\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00ef\7\16\2\2\u00ef+\3\2\2\2\u00f0\u00f1\7\35\2\2\u00f1\u00f2\7\17\2"+
		"\2\u00f2\u00f3\7\13\2\2\u00f3-\3\2\2\2\u00f4\u00f5\7\36\2\2\u00f5\u00f6"+
		"\7\17\2\2\u00f6\u00f7\7\13\2\2\u00f7/\3\2\2\2\u00f8\u00f9\7 \2\2\u00f9"+
		"\u00fa\7\17\2\2\u00fa\u00fe\7\r\2\2\u00fb\u00fd\5,\27\2\u00fc\u00fb\3"+
		"\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0104\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0103\5\"\22\2\u0102\u0101\3"+
		"\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\7\16\2\2\u0108\61\3\2\2"+
		"\2\u0109\u010a\7\37\2\2\u010a\u010b\7\17\2\2\u010b\u010c\7\13\2\2\u010c"+
		"\63\3\2\2\2\31\679BIRZeq}\u0083\u0085\u008c\u0093\u009f\u00af\u00bb\u00c8"+
		"\u00cd\u00d5\u00e0\u00eb\u00fe\u0104";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}