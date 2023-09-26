// Generated from f:\EU4 Grammar\EU4Grammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EU4Grammar extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AND", "OR", "YES", "NO", "NOT", "MPOWER", "TAG", "BOOL", "INT", "STRING", 
			"FLOAT", "VALUE", "IDENTIFIER", "LPAR", "RPAR", "EQUALS", "PLUS", "MINUS", 
			"WHITESPACE", "SINGLE_LINE_COMMENT", "IF", "ELSE", "ELSE_IF", "LIMIT", 
			"SKILL_SACLED_MOD", "MODIFIER", "CHANCE", "AI_WILL_DO", "FACTOR", "TOOLTIP", 
			"CUSTOM_TOOLTIP", "DESC", "CUSTOM_TRIGGER_TOOLTIP", "TRIGGER_NAME", "MODIFIER_NAME", 
			"EFFECT_NAME"
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


	public EU4Grammar(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EU4Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 6:
			TAG_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void TAG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			3
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u016d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4Y\n\4\3\5\3\5\3\5\3\5\5\5_\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6g\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7r\n\7\3\b\3\b\5\bv\n"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b}\n\b\3\t\3\t\5\t\u0081\n\t\3\n\6\n\u0084\n"+
		"\n\r\n\16\n\u0085\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u0092\n\13\7\13\u0094\n\13\f\13\16\13\u0097\13\13\3\13\3\13\3\f\6"+
		"\f\u009c\n\f\r\f\16\f\u009d\3\f\3\f\6\f\u00a2\n\f\r\f\16\f\u00a3\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u00ab\n\r\3\16\3\16\7\16\u00af\n\16\f\16\16\16\u00b2"+
		"\13\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\6\24\u00bf"+
		"\n\24\r\24\16\24\u00c0\3\24\3\24\3\25\3\25\7\25\u00c7\n\25\f\25\16\25"+
		"\u00ca\13\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&\3\2\t\4\2\62;C\\\3\2\62;\3\2$$\5\2C\\aac|\6\2"+
		"\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u0185\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3"+
		"\2\2\2\5O\3\2\2\2\7X\3\2\2\2\t^\3\2\2\2\13f\3\2\2\2\rq\3\2\2\2\17u\3\2"+
		"\2\2\21\u0080\3\2\2\2\23\u0083\3\2\2\2\25\u0087\3\2\2\2\27\u009b\3\2\2"+
		"\2\31\u00aa\3\2\2\2\33\u00ac\3\2\2\2\35\u00b3\3\2\2\2\37\u00b5\3\2\2\2"+
		"!\u00b7\3\2\2\2#\u00b9\3\2\2\2%\u00bb\3\2\2\2\'\u00be\3\2\2\2)\u00c4\3"+
		"\2\2\2+\u00cd\3\2\2\2-\u00d0\3\2\2\2/\u00d5\3\2\2\2\61\u00dd\3\2\2\2\63"+
		"\u00e3\3\2\2\2\65\u00f9\3\2\2\2\67\u0102\3\2\2\29\u0109\3\2\2\2;\u0114"+
		"\3\2\2\2=\u011b\3\2\2\2?\u0123\3\2\2\2A\u0132\3\2\2\2C\u0137\3\2\2\2E"+
		"\u014e\3\2\2\2G\u0156\3\2\2\2I\u0164\3\2\2\2KL\7C\2\2LM\7P\2\2MN\7F\2"+
		"\2N\4\3\2\2\2OP\7Q\2\2PQ\7T\2\2Q\6\3\2\2\2RS\7{\2\2ST\7g\2\2TY\7u\2\2"+
		"UV\7[\2\2VW\7G\2\2WY\7U\2\2XR\3\2\2\2XU\3\2\2\2Y\b\3\2\2\2Z[\7p\2\2[_"+
		"\7q\2\2\\]\7P\2\2]_\7Q\2\2^Z\3\2\2\2^\\\3\2\2\2_\n\3\2\2\2`a\7P\2\2ab"+
		"\7Q\2\2bg\7V\2\2cd\7p\2\2de\7q\2\2eg\7v\2\2f`\3\2\2\2fc\3\2\2\2g\f\3\2"+
		"\2\2hi\7C\2\2ij\7F\2\2jr\7O\2\2kl\7O\2\2lm\7K\2\2mr\7N\2\2no\7F\2\2op"+
		"\7K\2\2pr\7R\2\2qh\3\2\2\2qk\3\2\2\2qn\3\2\2\2r\16\3\2\2\2sv\5!\21\2t"+
		"v\5\'\24\2us\3\2\2\2ut\3\2\2\2vw\3\2\2\2wx\t\2\2\2x|\b\b\2\2y}\5\'\24"+
		"\2z}\5\37\20\2{}\5!\21\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\20\3\2\2\2~\u0081"+
		"\5\7\4\2\177\u0081\5\t\5\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\22\3"+
		"\2\2\2\u0082\u0084\t\3\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\24\3\2\2\2\u0087\u0095\7$\2\2"+
		"\u0088\u0094\n\4\2\2\u0089\u0092\7\"\2\2\u008a\u008b\7^\2\2\u008b\u0092"+
		"\7p\2\2\u008c\u008d\7^\2\2\u008d\u0092\7v\2\2\u008e\u008f\7^\2\2\u008f"+
		"\u0092\7$\2\2\u0090\u0092\7^\2\2\u0091\u0089\3\2\2\2\u0091\u008a\3\2\2"+
		"\2\u0091\u008c\3\2\2\2\u0091\u008e\3\2\2\2\u0091\u0090\3\2\2\2\u0092\u0094"+
		"\3\2\2\2\u0093\u0088\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0098\u0099\7$\2\2\u0099\26\3\2\2\2\u009a\u009c\t\3\2\2\u009b\u009a"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a1\7\60\2\2\u00a0\u00a2\t\3\2\2\u00a1\u00a0\3"+
		"\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\30\3\2\2\2\u00a5\u00ab\5\21\t\2\u00a6\u00ab\5\17\b\2\u00a7\u00ab\5\23"+
		"\n\2\u00a8\u00ab\5\25\13\2\u00a9\u00ab\5\27\f\2\u00aa\u00a5\3\2\2\2\u00aa"+
		"\u00a6\3\2\2\2\u00aa\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2"+
		"\2\2\u00ab\32\3\2\2\2\u00ac\u00b0\t\5\2\2\u00ad\u00af\t\6\2\2\u00ae\u00ad"+
		"\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\34\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7}\2\2\u00b4\36\3\2\2\2\u00b5"+
		"\u00b6\7\177\2\2\u00b6 \3\2\2\2\u00b7\u00b8\7?\2\2\u00b8\"\3\2\2\2\u00b9"+
		"\u00ba\7-\2\2\u00ba$\3\2\2\2\u00bb\u00bc\7/\2\2\u00bc&\3\2\2\2\u00bd\u00bf"+
		"\t\7\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\b\24\3\2\u00c3(\3\2\2\2"+
		"\u00c4\u00c8\7%\2\2\u00c5\u00c7\n\b\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca"+
		"\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00cb\u00cc\b\25\3\2\u00cc*\3\2\2\2\u00cd\u00ce\7k\2\2"+
		"\u00ce\u00cf\7h\2\2\u00cf,\3\2\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7n\2"+
		"\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7g\2\2\u00d4.\3\2\2\2\u00d5\u00d6\7"+
		"g\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da"+
		"\7a\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7h\2\2\u00dc\60\3\2\2\2\u00dd\u00de"+
		"\7n\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7o\2\2\u00e0\u00e1\7k\2\2\u00e1"+
		"\u00e2\7v\2\2\u00e2\62\3\2\2\2\u00e3\u00e4\7u\2\2\u00e4\u00e5\7m\2\2\u00e5"+
		"\u00e6\7k\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9\7a\2\2"+
		"\u00e9\u00ea\7u\2\2\u00ea\u00eb\7e\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed"+
		"\7n\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7f\2\2\u00ef\u00f0\7a\2\2\u00f0"+
		"\u00f1\7o\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7f\2\2\u00f3\u00f4\7k\2\2"+
		"\u00f4\u00f5\7h\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8"+
		"\7t\2\2\u00f8\64\3\2\2\2\u00f9\u00fa\7o\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc"+
		"\7f\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7h\2\2\u00fe\u00ff\7k\2\2\u00ff"+
		"\u0100\7g\2\2\u0100\u0101\7t\2\2\u0101\66\3\2\2\2\u0102\u0103\7e\2\2\u0103"+
		"\u0104\7j\2\2\u0104\u0105\7c\2\2\u0105\u0106\7p\2\2\u0106\u0107\7e\2\2"+
		"\u0107\u0108\7g\2\2\u01088\3\2\2\2\u0109\u010a\7c\2\2\u010a\u010b\7k\2"+
		"\2\u010b\u010c\7a\2\2\u010c\u010d\7y\2\2\u010d\u010e\7k\2\2\u010e\u010f"+
		"\7n\2\2\u010f\u0110\7n\2\2\u0110\u0111\7a\2\2\u0111\u0112\7f\2\2\u0112"+
		"\u0113\7q\2\2\u0113:\3\2\2\2\u0114\u0115\7h\2\2\u0115\u0116\7c\2\2\u0116"+
		"\u0117\7e\2\2\u0117\u0118\7v\2\2\u0118\u0119\7q\2\2\u0119\u011a\7t\2\2"+
		"\u011a<\3\2\2\2\u011b\u011c\7v\2\2\u011c\u011d\7q\2\2\u011d\u011e\7q\2"+
		"\2\u011e\u011f\7n\2\2\u011f\u0120\7v\2\2\u0120\u0121\7k\2\2\u0121\u0122"+
		"\7r\2\2\u0122>\3\2\2\2\u0123\u0124\7e\2\2\u0124\u0125\7w\2\2\u0125\u0126"+
		"\7u\2\2\u0126\u0127\7v\2\2\u0127\u0128\7q\2\2\u0128\u0129\7o\2\2\u0129"+
		"\u012a\7a\2\2\u012a\u012b\7v\2\2\u012b\u012c\7q\2\2\u012c\u012d\7q\2\2"+
		"\u012d\u012e\7n\2\2\u012e\u012f\7v\2\2\u012f\u0130\7k\2\2\u0130\u0131"+
		"\7r\2\2\u0131@\3\2\2\2\u0132\u0133\7f\2\2\u0133\u0134\7g\2\2\u0134\u0135"+
		"\7u\2\2\u0135\u0136\7e\2\2\u0136B\3\2\2\2\u0137\u0138\7e\2\2\u0138\u0139"+
		"\7w\2\2\u0139\u013a\7u\2\2\u013a\u013b\7v\2\2\u013b\u013c\7q\2\2\u013c"+
		"\u013d\7o\2\2\u013d\u013e\7a\2\2\u013e\u013f\7v\2\2\u013f\u0140\7t\2\2"+
		"\u0140\u0141\7k\2\2\u0141\u0142\7i\2\2\u0142\u0143\7i\2\2\u0143\u0144"+
		"\7g\2\2\u0144\u0145\7t\2\2\u0145\u0146\7a\2\2\u0146\u0147\7v\2\2\u0147"+
		"\u0148\7q\2\2\u0148\u0149\7q\2\2\u0149\u014a\7n\2\2\u014a\u014b\7v\2\2"+
		"\u014b\u014c\7k\2\2\u014c\u014d\7r\2\2\u014dD\3\2\2\2\u014e\u014f\7k\2"+
		"\2\u014f\u0150\7u\2\2\u0150\u0151\7a\2\2\u0151\u0152\7e\2\2\u0152\u0153"+
		"\7q\2\2\u0153\u0154\7t\2\2\u0154\u0155\7g\2\2\u0155F\3\2\2\2\u0156\u0157"+
		"\7o\2\2\u0157\u0158\7q\2\2\u0158\u0159\7p\2\2\u0159\u015a\7c\2\2\u015a"+
		"\u015b\7t\2\2\u015b\u015c\7e\2\2\u015c\u015d\7j\2\2\u015d\u015e\7a\2\2"+
		"\u015e\u015f\7r\2\2\u015f\u0160\7q\2\2\u0160\u0161\7y\2\2\u0161\u0162"+
		"\7g\2\2\u0162\u0163\7t\2\2\u0163H\3\2\2\2\u0164\u0165\7c\2\2\u0165\u0166"+
		"\7f\2\2\u0166\u0167\7f\2\2\u0167\u0168\7a\2\2\u0168\u0169\7e\2\2\u0169"+
		"\u016a\7q\2\2\u016a\u016b\7t\2\2\u016b\u016c\7g\2\2\u016cJ\3\2\2\2\24"+
		"\2X^fqu|\u0080\u0085\u0091\u0093\u0095\u009d\u00a3\u00aa\u00b0\u00c0\u00c8"+
		"\4\3\b\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}