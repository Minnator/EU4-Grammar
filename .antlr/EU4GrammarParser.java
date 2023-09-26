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
		AND=1, OR=2, YES=3, NO=4, NOT=5, MPOWER=6, TAG=7, BOOL=8, INT=9, STRING=10, 
		FLOAT=11, VALUE=12, IDENTIFIER=13, LPAR=14, RPAR=15, EQUALS=16, PLUS=17, 
		MINUS=18, WHITESPACE=19, SINGLE_LINE_COMMENT=20, IF=21, ELSE=22, ELSE_IF=23, 
		LIMIT=24, SKILL_SACLED_MOD=25, MODIFIER=26, CHANCE=27, AI_WILL_DO=28, 
		FACTOR=29, TOOLTIP=30, CUSTOM_TOOLTIP=31, DESC=32, CUSTOM_TRIGGER_TOOLTIP=33, 
		TRIGGER_NAME=34, MODIFIER_NAME=35, EFFECT_NAME=36;
	public static final int
		RULE_block = 0, RULE_simpleBlock = 1, RULE_statement = 2, RULE_limit = 3, 
		RULE_eLSE = 4, RULE_elseIf = 5, RULE_ifStatement = 6, RULE_scriptedEffect = 7, 
		RULE_effect = 8, RULE_modifier = 9, RULE_scriptedTrigger = 10, RULE_trigger = 11, 
		RULE_factor = 12, RULE_chanceMod = 13, RULE_chance = 14, RULE_tooltip = 15, 
		RULE_customTooltip = 16, RULE_customTriggerTooltip = 17, RULE_desc = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"block", "simpleBlock", "statement", "limit", "eLSE", "elseIf", "ifStatement", 
			"scriptedEffect", "effect", "modifier", "scriptedTrigger", "trigger", 
			"factor", "chanceMod", "chance", "tooltip", "customTooltip", "customTriggerTooltip", 
			"desc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'AND'", "'OR'", null, null, null, null, null, null, null, null, 
			null, null, null, "'{'", "'}'", "'='", "'+'", "'-'", null, null, "'if'", 
			"'else'", "'else_if'", "'limit'", "'skill_scaled_modifier'", "'modifier'", 
			"'chance'", "'ai_will_do'", "'factor'", "'tooltip'", "'custom_tooltip'", 
			"'desc'", "'custom_trigger_tooltip'", "'is_core'", "'monarch_power'", 
			"'add_core'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "YES", "NO", "NOT", "MPOWER", "TAG", "BOOL", "INT", 
			"STRING", "FLOAT", "VALUE", "IDENTIFIER", "LPAR", "RPAR", "EQUALS", "PLUS", 
			"MINUS", "WHITESPACE", "SINGLE_LINE_COMMENT", "IF", "ELSE", "ELSE_IF", 
			"LIMIT", "SKILL_SACLED_MOD", "MODIFIER", "CHANCE", "AI_WILL_DO", "FACTOR", 
			"TOOLTIP", "CUSTOM_TOOLTIP", "DESC", "CUSTOM_TRIGGER_TOOLTIP", "TRIGGER_NAME", 
			"MODIFIER_NAME", "EFFECT_NAME"
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
			setState(38);
			match(LPAR);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << LPAR) | (1L << IF) | (1L << EFFECT_NAME))) != 0)) {
				{
				setState(41);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(39);
					statement();
					}
					break;
				case 2:
					{
					setState(40);
					ifStatement();
					}
					break;
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
			setState(48);
			match(LPAR);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << LPAR) | (1L << IF) | (1L << EFFECT_NAME))) != 0)) {
				{
				{
				setState(49);
				statement();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case IF:
			case EFFECT_NAME:
				{
				setState(57);
				effect();
				}
				break;
			case LPAR:
				{
				setState(58);
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

	public static class LimitContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(EU4GrammarParser.LIMIT, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TriggerContext trigger() {
			return getRuleContext(TriggerContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
		public LimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit; }
	}

	public final LimitContext limit() throws RecognitionException {
		LimitContext _localctx = new LimitContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(LIMIT);
			setState(62);
			match(EQUALS);
			setState(63);
			match(LPAR);
			setState(64);
			trigger();
			setState(65);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LPAR() { return getToken(EU4GrammarParser.LPAR, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
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
		enterRule(_localctx, 8, RULE_eLSE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(ELSE);
			setState(68);
			match(LPAR);
			setState(69);
			match(EQUALS);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << IF) | (1L << EFFECT_NAME))) != 0)) {
				{
				{
				setState(70);
				effect();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 10, RULE_elseIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ELSE_IF);
			setState(79);
			match(LPAR);
			setState(80);
			match(EQUALS);
			setState(81);
			limit();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << IF) | (1L << EFFECT_NAME))) != 0)) {
				{
				{
				setState(82);
				effect();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 12, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(IF);
			setState(91);
			match(EQUALS);
			setState(92);
			match(LPAR);
			setState(93);
			limit();
			setState(94);
			match(RPAR);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE || _la==ELSE_IF) {
				{
				setState(97);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELSE:
					{
					setState(95);
					eLSE();
					}
					break;
				case ELSE_IF:
					{
					setState(96);
					elseIf();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(101);
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
		enterRule(_localctx, 14, RULE_scriptedEffect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(IDENTIFIER);
			setState(103);
			match(EQUALS);
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				setState(104);
				simpleBlock();
				}
				break;
			case YES:
				{
				setState(105);
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
		public TerminalNode VALUE() { return getToken(EU4GrammarParser.VALUE, 0); }
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
		enterRule(_localctx, 16, RULE_effect);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EFFECT_NAME:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(108);
				match(EFFECT_NAME);
				setState(109);
				match(EQUALS);
				setState(110);
				match(VALUE);
				}
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				scriptedEffect();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
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
		public TerminalNode VALUE() { return getToken(EU4GrammarParser.VALUE, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(MODIFIER_NAME);
			setState(116);
			match(EQUALS);
			setState(117);
			match(VALUE);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 20, RULE_scriptedTrigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(IDENTIFIER);
			setState(120);
			match(EQUALS);
			setState(121);
			match(LPAR);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME))) != 0)) {
				{
				{
				setState(122);
				trigger();
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

	public static class TriggerContext extends ParserRuleContext {
		public TerminalNode TRIGGER_NAME() { return getToken(EU4GrammarParser.TRIGGER_NAME, 0); }
		public TerminalNode EQUALS() { return getToken(EU4GrammarParser.EQUALS, 0); }
		public TerminalNode VALUE() { return getToken(EU4GrammarParser.VALUE, 0); }
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
		enterRule(_localctx, 22, RULE_trigger);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRIGGER_NAME:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(130);
				match(TRIGGER_NAME);
				setState(131);
				match(EQUALS);
				setState(132);
				match(VALUE);
				}
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				scriptedTrigger();
				}
				break;
			case CUSTOM_TRIGGER_TOOLTIP:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
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
		enterRule(_localctx, 24, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(FACTOR);
			setState(138);
			match(EQUALS);
			setState(139);
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
		enterRule(_localctx, 26, RULE_chanceMod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(MODIFIER);
			setState(142);
			match(EQUALS);
			setState(143);
			match(LPAR);
			setState(144);
			factor();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME))) != 0)) {
				{
				{
				setState(145);
				trigger();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 28, RULE_chance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(CHANCE);
			setState(154);
			match(EQUALS);
			setState(155);
			match(LPAR);
			setState(156);
			factor();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER) {
				{
				{
				setState(157);
				chanceMod();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 30, RULE_tooltip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(TOOLTIP);
			setState(166);
			match(EQUALS);
			setState(167);
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
		enterRule(_localctx, 32, RULE_customTooltip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(CUSTOM_TOOLTIP);
			setState(170);
			match(EQUALS);
			setState(171);
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
		public TooltipContext tooltip() {
			return getRuleContext(TooltipContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(EU4GrammarParser.RPAR, 0); }
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
		enterRule(_localctx, 34, RULE_customTriggerTooltip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(CUSTOM_TRIGGER_TOOLTIP);
			setState(174);
			match(EQUALS);
			setState(175);
			match(LPAR);
			setState(176);
			tooltip();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << CUSTOM_TRIGGER_TOOLTIP) | (1L << TRIGGER_NAME))) != 0)) {
				{
				{
				setState(177);
				trigger();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 36, RULE_desc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(DESC);
			setState(186);
			match(EQUALS);
			setState(187);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00c0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\3\3"+
		"\3\7\3\65\n\3\f\3\16\38\13\3\3\3\3\3\3\4\3\4\5\4>\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\7\6J\n\6\f\6\16\6M\13\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\7\7V\n\7\f\7\16\7Y\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b"+
		"d\n\b\f\b\16\bg\13\b\3\t\3\t\3\t\3\t\5\tm\n\t\3\n\3\n\3\n\3\n\3\n\5\n"+
		"t\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f~\n\f\f\f\16\f\u0081\13\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u008a\n\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\7\17\u0095\n\17\f\17\16\17\u0098\13\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\7\20\u00a1\n\20\f\20\16\20\u00a4\13\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7"+
		"\23\u00b5\n\23\f\23\16\23\u00b8\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\3\4\2\13\13\r"+
		"\r\2\u00bd\2(\3\2\2\2\4\62\3\2\2\2\6=\3\2\2\2\b?\3\2\2\2\nE\3\2\2\2\f"+
		"P\3\2\2\2\16\\\3\2\2\2\20h\3\2\2\2\22s\3\2\2\2\24u\3\2\2\2\26y\3\2\2\2"+
		"\30\u0089\3\2\2\2\32\u008b\3\2\2\2\34\u008f\3\2\2\2\36\u009b\3\2\2\2 "+
		"\u00a7\3\2\2\2\"\u00ab\3\2\2\2$\u00af\3\2\2\2&\u00bb\3\2\2\2(-\7\20\2"+
		"\2),\5\6\4\2*,\5\16\b\2+)\3\2\2\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2"+
		"\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\7\21\2\2\61\3\3\2\2\2\62\66\7\20\2\2"+
		"\63\65\5\6\4\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67"+
		"9\3\2\2\28\66\3\2\2\29:\7\21\2\2:\5\3\2\2\2;>\5\22\n\2<>\5\2\2\2=;\3\2"+
		"\2\2=<\3\2\2\2>\7\3\2\2\2?@\7\32\2\2@A\7\22\2\2AB\7\20\2\2BC\5\30\r\2"+
		"CD\7\21\2\2D\t\3\2\2\2EF\7\30\2\2FG\7\20\2\2GK\7\22\2\2HJ\5\22\n\2IH\3"+
		"\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7\21\2\2O\13"+
		"\3\2\2\2PQ\7\31\2\2QR\7\20\2\2RS\7\22\2\2SW\5\b\5\2TV\5\22\n\2UT\3\2\2"+
		"\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7\21\2\2[\r\3\2"+
		"\2\2\\]\7\27\2\2]^\7\22\2\2^_\7\20\2\2_`\5\b\5\2`e\7\21\2\2ad\5\n\6\2"+
		"bd\5\f\7\2ca\3\2\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\17\3\2\2"+
		"\2ge\3\2\2\2hi\7\17\2\2il\7\22\2\2jm\5\4\3\2km\7\5\2\2lj\3\2\2\2lk\3\2"+
		"\2\2m\21\3\2\2\2no\7&\2\2op\7\22\2\2pt\7\16\2\2qt\5\20\t\2rt\5\16\b\2"+
		"sn\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\23\3\2\2\2uv\7%\2\2vw\7\22\2\2wx\7\16"+
		"\2\2x\25\3\2\2\2yz\7\17\2\2z{\7\22\2\2{\177\7\20\2\2|~\5\30\r\2}|\3\2"+
		"\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2"+
		"\u0081\177\3\2\2\2\u0082\u0083\7\21\2\2\u0083\27\3\2\2\2\u0084\u0085\7"+
		"$\2\2\u0085\u0086\7\22\2\2\u0086\u008a\7\16\2\2\u0087\u008a\5\26\f\2\u0088"+
		"\u008a\5$\23\2\u0089\u0084\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2"+
		"\2\2\u008a\31\3\2\2\2\u008b\u008c\7\37\2\2\u008c\u008d\7\22\2\2\u008d"+
		"\u008e\t\2\2\2\u008e\33\3\2\2\2\u008f\u0090\7\34\2\2\u0090\u0091\7\22"+
		"\2\2\u0091\u0092\7\20\2\2\u0092\u0096\5\32\16\2\u0093\u0095\5\30\r\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\21\2\2\u009a"+
		"\35\3\2\2\2\u009b\u009c\7\35\2\2\u009c\u009d\7\22\2\2\u009d\u009e\7\20"+
		"\2\2\u009e\u00a2\5\32\16\2\u009f\u00a1\5\34\17\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\21\2\2\u00a6\37\3\2\2\2\u00a7\u00a8"+
		"\7 \2\2\u00a8\u00a9\7\22\2\2\u00a9\u00aa\7\f\2\2\u00aa!\3\2\2\2\u00ab"+
		"\u00ac\7!\2\2\u00ac\u00ad\7\22\2\2\u00ad\u00ae\7\f\2\2\u00ae#\3\2\2\2"+
		"\u00af\u00b0\7#\2\2\u00b0\u00b1\7\22\2\2\u00b1\u00b2\7\20\2\2\u00b2\u00b6"+
		"\5 \21\2\u00b3\u00b5\5\30\r\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2"+
		"\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b9\u00ba\7\21\2\2\u00ba%\3\2\2\2\u00bb\u00bc\7\"\2\2\u00bc"+
		"\u00bd\7\22\2\2\u00bd\u00be\7\f\2\2\u00be\'\3\2\2\2\21+-\66=KWcels\177"+
		"\u0089\u0096\u00a2\u00b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}