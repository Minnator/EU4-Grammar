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
		FLOAT=11, LPAR=12, RPAR=13, EQUALS=14, PLUS=15, MINUS=16, WHITESPACE=17, 
		SINGLE_LINE_COMMENT=18, IF=19, ELSE=20, ELSE_IF=21, LIMIT=22, SKILL_SACLED_MOD=23, 
		MODIFIER=24, CHANCE=25, AI_WILL_DO=26, FACTOR=27, TOOLTIP=28, CUSTOM_TOOLTIP=29, 
		DESC=30, CUSTOM_TRIGGER_TOOLTIP=31, TRIGGER_NAME=32, MODIFIER_NAME=33, 
		EFFECT_NAME=34, IDENTIFIER=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AND", "OR", "YES", "NO", "NOT", "MPOWER", "TAG", "BOOL", "INT", "STRING", 
			"FLOAT", "LPAR", "RPAR", "EQUALS", "PLUS", "MINUS", "WHITESPACE", "SINGLE_LINE_COMMENT", 
			"IF", "ELSE", "ELSE_IF", "LIMIT", "SKILL_SACLED_MOD", "MODIFIER", "CHANCE", 
			"AI_WILL_DO", "FACTOR", "TOOLTIP", "CUSTOM_TOOLTIP", "DESC", "CUSTOM_TRIGGER_TOOLTIP", 
			"TRIGGER_NAME", "MODIFIER_NAME", "EFFECT_NAME", "IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'AND'", "'OR'", null, null, null, null, null, null, null, null, 
			null, "'{'", "'}'", "'='", "'+'", "'-'", null, null, "'if'", "'else'", 
			"'else_if'", "'limit'", "'skill_scaled_modifier'", "'modifier'", "'chance'", 
			"'ai_will_do'", "'factor'", "'tooltip'", "'custom_tooltip'", "'desc'", 
			"'custom_trigger_tooltip'", "'is_core'", "'monarch_power'", "'add_core'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "YES", "NO", "NOT", "MPOWER", "TAG", "BOOL", "INT", 
			"STRING", "FLOAT", "LPAR", "RPAR", "EQUALS", "PLUS", "MINUS", "WHITESPACE", 
			"SINGLE_LINE_COMMENT", "IF", "ELSE", "ELSE_IF", "LIMIT", "SKILL_SACLED_MOD", 
			"MODIFIER", "CHANCE", "AI_WILL_DO", "FACTOR", "TOOLTIP", "CUSTOM_TOOLTIP", 
			"DESC", "CUSTOM_TRIGGER_TOOLTIP", "TRIGGER_NAME", "MODIFIER_NAME", "EFFECT_NAME", 
			"IDENTIFIER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u015c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4W\n\4\3\5\3\5\3\5\3\5\5\5]\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6e"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7p\n\7\3\b\3\b\3\b\3\t\3\t"+
		"\5\tw\n\t\3\n\6\nz\n\n\r\n\16\n{\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u0088\n\13\7\13\u008a\n\13\f\13\16\13\u008d\13\13\3"+
		"\13\3\13\3\f\6\f\u0092\n\f\r\f\16\f\u0093\3\f\3\f\6\f\u0098\n\f\r\f\16"+
		"\f\u0099\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\6\22\u00a7"+
		"\n\22\r\22\16\22\u00a8\3\22\3\22\3\23\3\23\7\23\u00af\n\23\f\23\16\23"+
		"\u00b2\13\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\7$\u0158\n$\f$\16$\u015b\13$\2\2"+
		"%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%\3\2\t\4\2\62;C\\\3\2\62;\3\2$$\5\2\13\f\17\17\"\"\4\2\f"+
		"\f\17\17\5\2C\\aac|\6\2\62;C\\aac|\2\u016d\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5M\3\2\2\2\7V"+
		"\3\2\2\2\t\\\3\2\2\2\13d\3\2\2\2\ro\3\2\2\2\17q\3\2\2\2\21v\3\2\2\2\23"+
		"y\3\2\2\2\25}\3\2\2\2\27\u0091\3\2\2\2\31\u009b\3\2\2\2\33\u009d\3\2\2"+
		"\2\35\u009f\3\2\2\2\37\u00a1\3\2\2\2!\u00a3\3\2\2\2#\u00a6\3\2\2\2%\u00ac"+
		"\3\2\2\2\'\u00b5\3\2\2\2)\u00b8\3\2\2\2+\u00bd\3\2\2\2-\u00c5\3\2\2\2"+
		"/\u00cb\3\2\2\2\61\u00e1\3\2\2\2\63\u00ea\3\2\2\2\65\u00f1\3\2\2\2\67"+
		"\u00fc\3\2\2\29\u0103\3\2\2\2;\u010b\3\2\2\2=\u011a\3\2\2\2?\u011f\3\2"+
		"\2\2A\u0136\3\2\2\2C\u013e\3\2\2\2E\u014c\3\2\2\2G\u0155\3\2\2\2IJ\7C"+
		"\2\2JK\7P\2\2KL\7F\2\2L\4\3\2\2\2MN\7Q\2\2NO\7T\2\2O\6\3\2\2\2PQ\7{\2"+
		"\2QR\7g\2\2RW\7u\2\2ST\7[\2\2TU\7G\2\2UW\7U\2\2VP\3\2\2\2VS\3\2\2\2W\b"+
		"\3\2\2\2XY\7p\2\2Y]\7q\2\2Z[\7P\2\2[]\7Q\2\2\\X\3\2\2\2\\Z\3\2\2\2]\n"+
		"\3\2\2\2^_\7P\2\2_`\7Q\2\2`e\7V\2\2ab\7p\2\2bc\7q\2\2ce\7v\2\2d^\3\2\2"+
		"\2da\3\2\2\2e\f\3\2\2\2fg\7C\2\2gh\7F\2\2hp\7O\2\2ij\7O\2\2jk\7K\2\2k"+
		"p\7N\2\2lm\7F\2\2mn\7K\2\2np\7R\2\2of\3\2\2\2oi\3\2\2\2ol\3\2\2\2p\16"+
		"\3\2\2\2qr\t\2\2\2rs\b\b\2\2s\20\3\2\2\2tw\5\7\4\2uw\5\t\5\2vt\3\2\2\2"+
		"vu\3\2\2\2w\22\3\2\2\2xz\t\3\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2"+
		"\2|\24\3\2\2\2}\u008b\7$\2\2~\u008a\n\4\2\2\177\u0088\7\"\2\2\u0080\u0081"+
		"\7^\2\2\u0081\u0088\7p\2\2\u0082\u0083\7^\2\2\u0083\u0088\7v\2\2\u0084"+
		"\u0085\7^\2\2\u0085\u0088\7$\2\2\u0086\u0088\7^\2\2\u0087\177\3\2\2\2"+
		"\u0087\u0080\3\2\2\2\u0087\u0082\3\2\2\2\u0087\u0084\3\2\2\2\u0087\u0086"+
		"\3\2\2\2\u0088\u008a\3\2\2\2\u0089~\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7$\2\2\u008f\26\3\2\2\2\u0090\u0092"+
		"\t\3\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\7\60\2\2\u0096\u0098\t"+
		"\3\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\30\3\2\2\2\u009b\u009c\7}\2\2\u009c\32\3\2\2\2\u009d"+
		"\u009e\7\177\2\2\u009e\34\3\2\2\2\u009f\u00a0\7?\2\2\u00a0\36\3\2\2\2"+
		"\u00a1\u00a2\7-\2\2\u00a2 \3\2\2\2\u00a3\u00a4\7/\2\2\u00a4\"\3\2\2\2"+
		"\u00a5\u00a7\t\5\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\b\22\3\2"+
		"\u00ab$\3\2\2\2\u00ac\u00b0\7%\2\2\u00ad\u00af\n\6\2\2\u00ae\u00ad\3\2"+
		"\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\b\23\3\2\u00b4&\3\2\2\2"+
		"\u00b5\u00b6\7k\2\2\u00b6\u00b7\7h\2\2\u00b7(\3\2\2\2\u00b8\u00b9\7g\2"+
		"\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7g\2\2\u00bc*\3\2"+
		"\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1"+
		"\7g\2\2\u00c1\u00c2\7a\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7h\2\2\u00c4"+
		",\3\2\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7o\2\2\u00c8"+
		"\u00c9\7k\2\2\u00c9\u00ca\7v\2\2\u00ca.\3\2\2\2\u00cb\u00cc\7u\2\2\u00cc"+
		"\u00cd\7m\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7n\2\2"+
		"\u00d0\u00d1\7a\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7e\2\2\u00d3\u00d4"+
		"\7c\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7f\2\2\u00d7"+
		"\u00d8\7a\2\2\u00d8\u00d9\7o\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7f\2\2"+
		"\u00db\u00dc\7k\2\2\u00dc\u00dd\7h\2\2\u00dd\u00de\7k\2\2\u00de\u00df"+
		"\7g\2\2\u00df\u00e0\7t\2\2\u00e0\60\3\2\2\2\u00e1\u00e2\7o\2\2\u00e2\u00e3"+
		"\7q\2\2\u00e3\u00e4\7f\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7h\2\2\u00e6"+
		"\u00e7\7k\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7t\2\2\u00e9\62\3\2\2\2\u00ea"+
		"\u00eb\7e\2\2\u00eb\u00ec\7j\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7p\2\2"+
		"\u00ee\u00ef\7e\2\2\u00ef\u00f0\7g\2\2\u00f0\64\3\2\2\2\u00f1\u00f2\7"+
		"c\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7a\2\2\u00f4\u00f5\7y\2\2\u00f5\u00f6"+
		"\7k\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9\7a\2\2\u00f9"+
		"\u00fa\7f\2\2\u00fa\u00fb\7q\2\2\u00fb\66\3\2\2\2\u00fc\u00fd\7h\2\2\u00fd"+
		"\u00fe\7c\2\2\u00fe\u00ff\7e\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7q\2\2"+
		"\u0101\u0102\7t\2\2\u01028\3\2\2\2\u0103\u0104\7v\2\2\u0104\u0105\7q\2"+
		"\2\u0105\u0106\7q\2\2\u0106\u0107\7n\2\2\u0107\u0108\7v\2\2\u0108\u0109"+
		"\7k\2\2\u0109\u010a\7r\2\2\u010a:\3\2\2\2\u010b\u010c\7e\2\2\u010c\u010d"+
		"\7w\2\2\u010d\u010e\7u\2\2\u010e\u010f\7v\2\2\u010f\u0110\7q\2\2\u0110"+
		"\u0111\7o\2\2\u0111\u0112\7a\2\2\u0112\u0113\7v\2\2\u0113\u0114\7q\2\2"+
		"\u0114\u0115\7q\2\2\u0115\u0116\7n\2\2\u0116\u0117\7v\2\2\u0117\u0118"+
		"\7k\2\2\u0118\u0119\7r\2\2\u0119<\3\2\2\2\u011a\u011b\7f\2\2\u011b\u011c"+
		"\7g\2\2\u011c\u011d\7u\2\2\u011d\u011e\7e\2\2\u011e>\3\2\2\2\u011f\u0120"+
		"\7e\2\2\u0120\u0121\7w\2\2\u0121\u0122\7u\2\2\u0122\u0123\7v\2\2\u0123"+
		"\u0124\7q\2\2\u0124\u0125\7o\2\2\u0125\u0126\7a\2\2\u0126\u0127\7v\2\2"+
		"\u0127\u0128\7t\2\2\u0128\u0129\7k\2\2\u0129\u012a\7i\2\2\u012a\u012b"+
		"\7i\2\2\u012b\u012c\7g\2\2\u012c\u012d\7t\2\2\u012d\u012e\7a\2\2\u012e"+
		"\u012f\7v\2\2\u012f\u0130\7q\2\2\u0130\u0131\7q\2\2\u0131\u0132\7n\2\2"+
		"\u0132\u0133\7v\2\2\u0133\u0134\7k\2\2\u0134\u0135\7r\2\2\u0135@\3\2\2"+
		"\2\u0136\u0137\7k\2\2\u0137\u0138\7u\2\2\u0138\u0139\7a\2\2\u0139\u013a"+
		"\7e\2\2\u013a\u013b\7q\2\2\u013b\u013c\7t\2\2\u013c\u013d\7g\2\2\u013d"+
		"B\3\2\2\2\u013e\u013f\7o\2\2\u013f\u0140\7q\2\2\u0140\u0141\7p\2\2\u0141"+
		"\u0142\7c\2\2\u0142\u0143\7t\2\2\u0143\u0144\7e\2\2\u0144\u0145\7j\2\2"+
		"\u0145\u0146\7a\2\2\u0146\u0147\7r\2\2\u0147\u0148\7q\2\2\u0148\u0149"+
		"\7y\2\2\u0149\u014a\7g\2\2\u014a\u014b\7t\2\2\u014bD\3\2\2\2\u014c\u014d"+
		"\7c\2\2\u014d\u014e\7f\2\2\u014e\u014f\7f\2\2\u014f\u0150\7a\2\2\u0150"+
		"\u0151\7e\2\2\u0151\u0152\7q\2\2\u0152\u0153\7t\2\2\u0153\u0154\7g\2\2"+
		"\u0154F\3\2\2\2\u0155\u0159\t\7\2\2\u0156\u0158\t\b\2\2\u0157\u0156\3"+
		"\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"H\3\2\2\2\u015b\u0159\3\2\2\2\21\2V\\dov{\u0087\u0089\u008b\u0093\u0099"+
		"\u00a8\u00b0\u0159\4\3\b\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}