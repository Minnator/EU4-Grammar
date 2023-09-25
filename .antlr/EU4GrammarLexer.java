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
public class EU4GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, BOOL=2, INT=3, STRING=4, FLOAT=5, VALUE_FORMAT=6, ID=7, PLUS=8, 
		MINUS=9, WHITESPACE=10, SINGLE_LINE_COMMENT=11, IF=12, TRIGGER=13, TRIGGER_NAME=14, 
		MODIFIER=15, MODIFIER_INT=16, MODIFIER_FLOAT=17, MODIFIER_STRING=18, MODIFIER_INT_NAME=19, 
		MODIFIER_FLOAT_NAME=20, MODIFIER_STRING_NAME=21, EFFECT=22, EFFECT_INT=23, 
		EFFECT_FLOAT=24, EFFECT_STRING=25, EFFECT_BOOL=26, EFFECT_INT_NAME=27, 
		EFFECT_FLOAT_NAME=28, EFFECT_STRING_NAME=29, EFFECT_BOOL_NAME=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "BOOL", "INT", "STRING", "FLOAT", "VALUE_FORMAT", "ID", "PLUS", 
			"MINUS", "WHITESPACE", "SINGLE_LINE_COMMENT", "IF", "TRIGGER", "TRIGGER_NAME", 
			"MODIFIER", "MODIFIER_INT", "MODIFIER_FLOAT", "MODIFIER_STRING", "MODIFIER_INT_NAME", 
			"MODIFIER_FLOAT_NAME", "MODIFIER_STRING_NAME", "EFFECT", "EFFECT_INT", 
			"EFFECT_FLOAT", "EFFECT_STRING", "EFFECT_BOOL", "EFFECT_INT_NAME", "EFFECT_FLOAT_NAME", 
			"EFFECT_STRING_NAME", "EFFECT_BOOL_NAME"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'example_keyword'", null, null, null, null, null, null, "'+'", 
			"'-'", null, null, null, null, "'is_core'", null, null, null, null, "'free_leader_pool'", 
			null, "'PLACEHOLDER'", null, null, null, null, null, "'add_adm_power'", 
			"'add_years_of_income'", "'exile_ruler_as'", "'restore_country_name'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "BOOL", "INT", "STRING", "FLOAT", "VALUE_FORMAT", "ID", "PLUS", 
			"MINUS", "WHITESPACE", "SINGLE_LINE_COMMENT", "IF", "TRIGGER", "TRIGGER_NAME", 
			"MODIFIER", "MODIFIER_INT", "MODIFIER_FLOAT", "MODIFIER_STRING", "MODIFIER_INT_NAME", 
			"MODIFIER_FLOAT_NAME", "MODIFIER_STRING_NAME", "EFFECT", "EFFECT_INT", 
			"EFFECT_FLOAT", "EFFECT_STRING", "EFFECT_BOOL", "EFFECT_INT_NAME", "EFFECT_FLOAT_NAME", 
			"EFFECT_STRING_NAME", "EFFECT_BOOL_NAME"
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


	public EU4GrammarLexer(CharStream input) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u0172\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\5\3U\n\3\3\4\6\4X\n\4\r\4\16\4Y\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5f\n\5\7\5h\n\5\f\5\16\5k\13\5\3\5\3\5\3\6\6\6p\n\6\r\6\16\6"+
		"q\3\6\3\6\6\6v\n\6\r\6\16\6w\3\7\3\7\3\7\3\7\5\7~\n\7\3\b\3\b\7\b\u0082"+
		"\n\b\f\b\16\b\u0085\13\b\3\t\3\t\3\n\3\n\3\13\6\13\u008c\n\13\r\13\16"+
		"\13\u008d\3\13\3\13\3\f\3\f\7\f\u0094\n\f\f\f\16\f\u0097\13\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\5\20\u00bc\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0109\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\5\27\u011b\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= \3\2\b\3\2\62;\3\2$$\5\2C\\aac|"+
		"\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u0187\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\3?\3\2\2\2\5T\3\2\2\2\7W\3\2\2\2\t[\3\2\2\2\13o\3\2\2\2\r}\3\2\2\2"+
		"\17\177\3\2\2\2\21\u0086\3\2\2\2\23\u0088\3\2\2\2\25\u008b\3\2\2\2\27"+
		"\u0091\3\2\2\2\31\u009a\3\2\2\2\33\u00ac\3\2\2\2\35\u00b0\3\2\2\2\37\u00bb"+
		"\3\2\2\2!\u00bd\3\2\2\2#\u00c1\3\2\2\2%\u00c5\3\2\2\2\'\u00c9\3\2\2\2"+
		")\u0108\3\2\2\2+\u010a\3\2\2\2-\u011a\3\2\2\2/\u011c\3\2\2\2\61\u0120"+
		"\3\2\2\2\63\u0124\3\2\2\2\65\u0128\3\2\2\2\67\u012c\3\2\2\29\u013a\3\2"+
		"\2\2;\u014e\3\2\2\2=\u015d\3\2\2\2?@\7g\2\2@A\7z\2\2AB\7c\2\2BC\7o\2\2"+
		"CD\7r\2\2DE\7n\2\2EF\7g\2\2FG\7a\2\2GH\7m\2\2HI\7g\2\2IJ\7{\2\2JK\7y\2"+
		"\2KL\7q\2\2LM\7t\2\2MN\7f\2\2N\4\3\2\2\2OP\7{\2\2PQ\7g\2\2QU\7u\2\2RS"+
		"\7p\2\2SU\7q\2\2TO\3\2\2\2TR\3\2\2\2U\6\3\2\2\2VX\t\2\2\2WV\3\2\2\2XY"+
		"\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\b\3\2\2\2[i\7$\2\2\\h\n\3\2\2]f\7\"\2\2"+
		"^_\7^\2\2_f\7p\2\2`a\7^\2\2af\7v\2\2bc\7^\2\2cf\7$\2\2df\7^\2\2e]\3\2"+
		"\2\2e^\3\2\2\2e`\3\2\2\2eb\3\2\2\2ed\3\2\2\2fh\3\2\2\2g\\\3\2\2\2ge\3"+
		"\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7$\2\2m\n\3"+
		"\2\2\2np\t\2\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2su\7"+
		"\60\2\2tv\t\2\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\f\3\2\2\2y"+
		"~\5\5\3\2z~\5\7\4\2{~\5\t\5\2|~\5\13\6\2}y\3\2\2\2}z\3\2\2\2}{\3\2\2\2"+
		"}|\3\2\2\2~\16\3\2\2\2\177\u0083\t\4\2\2\u0080\u0082\t\5\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\20\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7-\2\2\u0087\22\3\2\2\2\u0088"+
		"\u0089\7/\2\2\u0089\24\3\2\2\2\u008a\u008c\t\6\2\2\u008b\u008a\3\2\2\2"+
		"\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u0090\b\13\2\2\u0090\26\3\2\2\2\u0091\u0095\7%\2\2\u0092"+
		"\u0094\n\7\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u0099\b\f\2\2\u0099\30\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7h\2\2"+
		"\u009c\u009d\3\2\2\2\u009d\u009e\7?\2\2\u009e\u009f\7}\2\2\u009f\u00a0"+
		"\7n\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7o\2\2\u00a2\u00a3\7k\2\2\u00a3"+
		"\u00a4\7v\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7?\2\2\u00a6\u00a7\7}\2"+
		"\2\u00a7\u00a8\5\33\16\2\u00a8\u00a9\7\177\2\2\u00a9\u00aa\5-\27\2\u00aa"+
		"\u00ab\7\177\2\2\u00ab\32\3\2\2\2\u00ac\u00ad\5\35\17\2\u00ad\u00ae\7"+
		"?\2\2\u00ae\u00af\5\r\7\2\u00af\34\3\2\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2"+
		"\7u\2\2\u00b2\u00b3\7a\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5\7q\2\2\u00b5"+
		"\u00b6\7t\2\2\u00b6\u00b7\7g\2\2\u00b7\36\3\2\2\2\u00b8\u00bc\5!\21\2"+
		"\u00b9\u00bc\5#\22\2\u00ba\u00bc\5%\23\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc \3\2\2\2\u00bd\u00be\5\'\24\2\u00be"+
		"\u00bf\7?\2\2\u00bf\u00c0\5\7\4\2\u00c0\"\3\2\2\2\u00c1\u00c2\5)\25\2"+
		"\u00c2\u00c3\7?\2\2\u00c3\u00c4\5\13\6\2\u00c4$\3\2\2\2\u00c5\u00c6\5"+
		"+\26\2\u00c6\u00c7\7?\2\2\u00c7\u00c8\5\t\5\2\u00c8&\3\2\2\2\u00c9\u00ca"+
		"\7h\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7g\2\2\u00cd"+
		"\u00ce\7a\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7c\2\2"+
		"\u00d1\u00d2\7f\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5"+
		"\7a\2\2\u00d5\u00d6\7r\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7q\2\2\u00d8"+
		"\u00d9\7n\2\2\u00d9(\3\2\2\2\u00da\u00db\7i\2\2\u00db\u00dc\7q\2\2\u00dc"+
		"\u00dd\7x\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7p\2\2"+
		"\u00e0\u00e1\7k\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7i\2\2\u00e3\u00e4"+
		"\7a\2\2\u00e4\u00e5\7e\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7r\2\2\u00e7"+
		"\u00e8\7c\2\2\u00e8\u00e9\7e\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7v\2\2"+
		"\u00eb\u00ec\7{\2\2\u00ec\u00ed\7a\2\2\u00ed\u00ee\7o\2\2\u00ee\u00ef"+
		"\7q\2\2\u00ef\u00f0\7f\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7h\2\2\u00f2"+
		"\u00f3\7k\2\2\u00f3\u00f4\7g\2\2\u00f4\u0109\7t\2\2\u00f5\u00f6\7i\2\2"+
		"\u00f6\u00f7\7n\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7d\2\2\u00f9\u00fa"+
		"\7c\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc\7a\2\2\u00fc\u00fd\7v\2\2\u00fd"+
		"\u00fe\7c\2\2\u00fe\u00ff\7z\2\2\u00ff\u0100\7a\2\2\u0100\u0101\7o\2\2"+
		"\u0101\u0102\7q\2\2\u0102\u0103\7f\2\2\u0103\u0104\7k\2\2\u0104\u0105"+
		"\7h\2\2\u0105\u0106\7k\2\2\u0106\u0107\7g\2\2\u0107\u0109\7t\2\2\u0108"+
		"\u00da\3\2\2\2\u0108\u00f5\3\2\2\2\u0109*\3\2\2\2\u010a\u010b\7R\2\2\u010b"+
		"\u010c\7N\2\2\u010c\u010d\7C\2\2\u010d\u010e\7E\2\2\u010e\u010f\7G\2\2"+
		"\u010f\u0110\7J\2\2\u0110\u0111\7Q\2\2\u0111\u0112\7N\2\2\u0112\u0113"+
		"\7F\2\2\u0113\u0114\7G\2\2\u0114\u0115\7T\2\2\u0115,\3\2\2\2\u0116\u011b"+
		"\5/\30\2\u0117\u011b\5\61\31\2\u0118\u011b\5\63\32\2\u0119\u011b\5\65"+
		"\33\2\u011a\u0116\3\2\2\2\u011a\u0117\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u0119\3\2\2\2\u011b.\3\2\2\2\u011c\u011d\5\67\34\2\u011d\u011e\7?\2\2"+
		"\u011e\u011f\5\7\4\2\u011f\60\3\2\2\2\u0120\u0121\59\35\2\u0121\u0122"+
		"\7?\2\2\u0122\u0123\5\13\6\2\u0123\62\3\2\2\2\u0124\u0125\5;\36\2\u0125"+
		"\u0126\7?\2\2\u0126\u0127\5\t\5\2\u0127\64\3\2\2\2\u0128\u0129\5=\37\2"+
		"\u0129\u012a\7?\2\2\u012a\u012b\5\5\3\2\u012b\66\3\2\2\2\u012c\u012d\7"+
		"c\2\2\u012d\u012e\7f\2\2\u012e\u012f\7f\2\2\u012f\u0130\7a\2\2\u0130\u0131"+
		"\7c\2\2\u0131\u0132\7f\2\2\u0132\u0133\7o\2\2\u0133\u0134\7a\2\2\u0134"+
		"\u0135\7r\2\2\u0135\u0136\7q\2\2\u0136\u0137\7y\2\2\u0137\u0138\7g\2\2"+
		"\u0138\u0139\7t\2\2\u01398\3\2\2\2\u013a\u013b\7c\2\2\u013b\u013c\7f\2"+
		"\2\u013c\u013d\7f\2\2\u013d\u013e\7a\2\2\u013e\u013f\7{\2\2\u013f\u0140"+
		"\7g\2\2\u0140\u0141\7c\2\2\u0141\u0142\7t\2\2\u0142\u0143\7u\2\2\u0143"+
		"\u0144\7a\2\2\u0144\u0145\7q\2\2\u0145\u0146\7h\2\2\u0146\u0147\7a\2\2"+
		"\u0147\u0148\7k\2\2\u0148\u0149\7p\2\2\u0149\u014a\7e\2\2\u014a\u014b"+
		"\7q\2\2\u014b\u014c\7o\2\2\u014c\u014d\7g\2\2\u014d:\3\2\2\2\u014e\u014f"+
		"\7g\2\2\u014f\u0150\7z\2\2\u0150\u0151\7k\2\2\u0151\u0152\7n\2\2\u0152"+
		"\u0153\7g\2\2\u0153\u0154\7a\2\2\u0154\u0155\7t\2\2\u0155\u0156\7w\2\2"+
		"\u0156\u0157\7n\2\2\u0157\u0158\7g\2\2\u0158\u0159\7t\2\2\u0159\u015a"+
		"\7a\2\2\u015a\u015b\7c\2\2\u015b\u015c\7u\2\2\u015c<\3\2\2\2\u015d\u015e"+
		"\7t\2\2\u015e\u015f\7g\2\2\u015f\u0160\7u\2\2\u0160\u0161\7v\2\2\u0161"+
		"\u0162\7q\2\2\u0162\u0163\7t\2\2\u0163\u0164\7g\2\2\u0164\u0165\7a\2\2"+
		"\u0165\u0166\7e\2\2\u0166\u0167\7q\2\2\u0167\u0168\7w\2\2\u0168\u0169"+
		"\7p\2\2\u0169\u016a\7v\2\2\u016a\u016b\7t\2\2\u016b\u016c\7{\2\2\u016c"+
		"\u016d\7a\2\2\u016d\u016e\7p\2\2\u016e\u016f\7c\2\2\u016f\u0170\7o\2\2"+
		"\u0170\u0171\7g\2\2\u0171>\3\2\2\2\21\2TYegiqw}\u0083\u008d\u0095\u00bb"+
		"\u0108\u011a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}