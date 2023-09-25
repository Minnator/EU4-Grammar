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
		T__0=1, BOOL=2, INT=3, STRING=4, FLOAT=5, ID=6, IF=7, ELSE=8, ELSE_IF=9, 
		PLUS=10, MINUS=11, WHITESPACE=12, SINGLE_LINE_COMMENT=13, MODIFIER=14, 
		MODIFIER_INT=15, MODIFIER_FLOAT=16, MODIFIER_STRING=17, MODIFIER_INT_NAME=18, 
		MODIFIER_FLOAT_NAME=19, MODIFIER_STRING_NAME=20, EFFECT=21, EFFECT_INT=22, 
		EFFECT_FLOAT=23, EFFECT_STRING=24, EFFECT_BOOL=25, EFFECT_INT_NAME=26, 
		EFFECT_FLOAT_NAME=27, EFFECT_STRING_NAME=28, EFFECT_BOOL_NAME=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "BOOL", "INT", "STRING", "FLOAT", "ID", "IF", "ELSE", "ELSE_IF", 
			"PLUS", "MINUS", "WHITESPACE", "SINGLE_LINE_COMMENT", "MODIFIER", "MODIFIER_INT", 
			"MODIFIER_FLOAT", "MODIFIER_STRING", "MODIFIER_INT_NAME", "MODIFIER_FLOAT_NAME", 
			"MODIFIER_STRING_NAME", "EFFECT", "EFFECT_INT", "EFFECT_FLOAT", "EFFECT_STRING", 
			"EFFECT_BOOL", "EFFECT_INT_NAME", "EFFECT_FLOAT_NAME", "EFFECT_STRING_NAME", 
			"EFFECT_BOOL_NAME"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'example_keyword'", null, null, null, null, null, "'if'", "'else'", 
			"'else_if'", "'+'", "'-'", null, null, null, null, null, null, "'free_leader_pool'", 
			null, "'PLACEHOLDER'", null, null, null, null, null, "'add_adm_power'", 
			"'add_years_of_income'", "'exile_ruler_as'", "'restore_country_name'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "BOOL", "INT", "STRING", "FLOAT", "ID", "IF", "ELSE", "ELSE_IF", 
			"PLUS", "MINUS", "WHITESPACE", "SINGLE_LINE_COMMENT", "MODIFIER", "MODIFIER_INT", 
			"MODIFIER_FLOAT", "MODIFIER_STRING", "MODIFIER_INT_NAME", "MODIFIER_FLOAT_NAME", 
			"MODIFIER_STRING_NAME", "EFFECT", "EFFECT_INT", "EFFECT_FLOAT", "EFFECT_STRING", 
			"EFFECT_BOOL", "EFFECT_INT_NAME", "EFFECT_FLOAT_NAME", "EFFECT_STRING_NAME", 
			"EFFECT_BOOL_NAME"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u015c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\5\3S\n\3\3\4\6\4V\n\4\r\4\16\4W\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5d\n\5\7\5f\n\5\f\5\16\5i\13\5\3\5\3\5\3\6\6\6n\n\6\r\6\16\6o\3\6"+
		"\3\6\6\6t\n\6\r\6\16\6u\3\7\3\7\7\7z\n\7\f\7\16\7}\13\7\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\6\r\u0094\n\r\r\r\16\r\u0095\3\r\3\r\3\16\3\16\7\16\u009c\n\16\f\16"+
		"\16\16\u009f\13\16\3\16\3\16\3\17\3\17\3\17\5\17\u00a6\n\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u00f3\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0105\n\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\2\2"+
		"\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37\3\2\b\3\2\62;\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\""+
		"\4\2\f\f\17\17\2\u016e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5R\3\2\2\2\7U\3\2\2\2\tY\3\2\2"+
		"\2\13m\3\2\2\2\rw\3\2\2\2\17~\3\2\2\2\21\u0081\3\2\2\2\23\u0086\3\2\2"+
		"\2\25\u008e\3\2\2\2\27\u0090\3\2\2\2\31\u0093\3\2\2\2\33\u0099\3\2\2\2"+
		"\35\u00a5\3\2\2\2\37\u00a7\3\2\2\2!\u00ab\3\2\2\2#\u00af\3\2\2\2%\u00b3"+
		"\3\2\2\2\'\u00f2\3\2\2\2)\u00f4\3\2\2\2+\u0104\3\2\2\2-\u0106\3\2\2\2"+
		"/\u010a\3\2\2\2\61\u010e\3\2\2\2\63\u0112\3\2\2\2\65\u0116\3\2\2\2\67"+
		"\u0124\3\2\2\29\u0138\3\2\2\2;\u0147\3\2\2\2=>\7g\2\2>?\7z\2\2?@\7c\2"+
		"\2@A\7o\2\2AB\7r\2\2BC\7n\2\2CD\7g\2\2DE\7a\2\2EF\7m\2\2FG\7g\2\2GH\7"+
		"{\2\2HI\7y\2\2IJ\7q\2\2JK\7t\2\2KL\7f\2\2L\4\3\2\2\2MN\7{\2\2NO\7g\2\2"+
		"OS\7u\2\2PQ\7p\2\2QS\7q\2\2RM\3\2\2\2RP\3\2\2\2S\6\3\2\2\2TV\t\2\2\2U"+
		"T\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\b\3\2\2\2Yg\7$\2\2Zf\n\3\2\2"+
		"[d\7\"\2\2\\]\7^\2\2]d\7p\2\2^_\7^\2\2_d\7v\2\2`a\7^\2\2ad\7$\2\2bd\7"+
		"^\2\2c[\3\2\2\2c\\\3\2\2\2c^\3\2\2\2c`\3\2\2\2cb\3\2\2\2df\3\2\2\2eZ\3"+
		"\2\2\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7"+
		"$\2\2k\n\3\2\2\2ln\t\2\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3"+
		"\2\2\2qs\7\60\2\2rt\t\2\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v\f"+
		"\3\2\2\2w{\t\4\2\2xz\t\5\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|"+
		"\16\3\2\2\2}{\3\2\2\2~\177\7k\2\2\177\u0080\7h\2\2\u0080\20\3\2\2\2\u0081"+
		"\u0082\7g\2\2\u0082\u0083\7n\2\2\u0083\u0084\7u\2\2\u0084\u0085\7g\2\2"+
		"\u0085\22\3\2\2\2\u0086\u0087\7g\2\2\u0087\u0088\7n\2\2\u0088\u0089\7"+
		"u\2\2\u0089\u008a\7g\2\2\u008a\u008b\7a\2\2\u008b\u008c\7k\2\2\u008c\u008d"+
		"\7h\2\2\u008d\24\3\2\2\2\u008e\u008f\7-\2\2\u008f\26\3\2\2\2\u0090\u0091"+
		"\7/\2\2\u0091\30\3\2\2\2\u0092\u0094\t\6\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0098\b\r\2\2\u0098\32\3\2\2\2\u0099\u009d\7%\2\2\u009a\u009c"+
		"\n\7\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\b\16"+
		"\2\2\u00a1\34\3\2\2\2\u00a2\u00a6\5\37\20\2\u00a3\u00a6\5!\21\2\u00a4"+
		"\u00a6\5#\22\2\u00a5\u00a2\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2"+
		"\2\2\u00a6\36\3\2\2\2\u00a7\u00a8\5%\23\2\u00a8\u00a9\7?\2\2\u00a9\u00aa"+
		"\5\7\4\2\u00aa \3\2\2\2\u00ab\u00ac\5\'\24\2\u00ac\u00ad\7?\2\2\u00ad"+
		"\u00ae\5\13\6\2\u00ae\"\3\2\2\2\u00af\u00b0\5)\25\2\u00b0\u00b1\7?\2\2"+
		"\u00b1\u00b2\5\t\5\2\u00b2$\3\2\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\7t"+
		"\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7a\2\2\u00b8\u00b9"+
		"\7n\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7f\2\2\u00bc"+
		"\u00bd\7g\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7a\2\2\u00bf\u00c0\7r\2\2"+
		"\u00c0\u00c1\7q\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7n\2\2\u00c3&\3\2\2"+
		"\2\u00c4\u00c5\7i\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7x\2\2\u00c7\u00c8"+
		"\7g\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7k\2\2\u00cb"+
		"\u00cc\7p\2\2\u00cc\u00cd\7i\2\2\u00cd\u00ce\7a\2\2\u00ce\u00cf\7e\2\2"+
		"\u00cf\u00d0\7c\2\2\u00d0\u00d1\7r\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3"+
		"\7e\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7{\2\2\u00d6"+
		"\u00d7\7a\2\2\u00d7\u00d8\7o\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7f\2\2"+
		"\u00da\u00db\7k\2\2\u00db\u00dc\7h\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de"+
		"\7g\2\2\u00de\u00f3\7t\2\2\u00df\u00e0\7i\2\2\u00e0\u00e1\7n\2\2\u00e1"+
		"\u00e2\7q\2\2\u00e2\u00e3\7d\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7n\2\2"+
		"\u00e5\u00e6\7a\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9"+
		"\7z\2\2\u00e9\u00ea\7a\2\2\u00ea\u00eb\7o\2\2\u00eb\u00ec\7q\2\2\u00ec"+
		"\u00ed\7f\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7h\2\2\u00ef\u00f0\7k\2\2"+
		"\u00f0\u00f1\7g\2\2\u00f1\u00f3\7t\2\2\u00f2\u00c4\3\2\2\2\u00f2\u00df"+
		"\3\2\2\2\u00f3(\3\2\2\2\u00f4\u00f5\7R\2\2\u00f5\u00f6\7N\2\2\u00f6\u00f7"+
		"\7C\2\2\u00f7\u00f8\7E\2\2\u00f8\u00f9\7G\2\2\u00f9\u00fa\7J\2\2\u00fa"+
		"\u00fb\7Q\2\2\u00fb\u00fc\7N\2\2\u00fc\u00fd\7F\2\2\u00fd\u00fe\7G\2\2"+
		"\u00fe\u00ff\7T\2\2\u00ff*\3\2\2\2\u0100\u0105\5-\27\2\u0101\u0105\5/"+
		"\30\2\u0102\u0105\5\61\31\2\u0103\u0105\5\63\32\2\u0104\u0100\3\2\2\2"+
		"\u0104\u0101\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105,\3"+
		"\2\2\2\u0106\u0107\5\65\33\2\u0107\u0108\7?\2\2\u0108\u0109\5\7\4\2\u0109"+
		".\3\2\2\2\u010a\u010b\5\67\34\2\u010b\u010c\7?\2\2\u010c\u010d\5\13\6"+
		"\2\u010d\60\3\2\2\2\u010e\u010f\59\35\2\u010f\u0110\7?\2\2\u0110\u0111"+
		"\5\t\5\2\u0111\62\3\2\2\2\u0112\u0113\5;\36\2\u0113\u0114\7?\2\2\u0114"+
		"\u0115\5\5\3\2\u0115\64\3\2\2\2\u0116\u0117\7c\2\2\u0117\u0118\7f\2\2"+
		"\u0118\u0119\7f\2\2\u0119\u011a\7a\2\2\u011a\u011b\7c\2\2\u011b\u011c"+
		"\7f\2\2\u011c\u011d\7o\2\2\u011d\u011e\7a\2\2\u011e\u011f\7r\2\2\u011f"+
		"\u0120\7q\2\2\u0120\u0121\7y\2\2\u0121\u0122\7g\2\2\u0122\u0123\7t\2\2"+
		"\u0123\66\3\2\2\2\u0124\u0125\7c\2\2\u0125\u0126\7f\2\2\u0126\u0127\7"+
		"f\2\2\u0127\u0128\7a\2\2\u0128\u0129\7{\2\2\u0129\u012a\7g\2\2\u012a\u012b"+
		"\7c\2\2\u012b\u012c\7t\2\2\u012c\u012d\7u\2\2\u012d\u012e\7a\2\2\u012e"+
		"\u012f\7q\2\2\u012f\u0130\7h\2\2\u0130\u0131\7a\2\2\u0131\u0132\7k\2\2"+
		"\u0132\u0133\7p\2\2\u0133\u0134\7e\2\2\u0134\u0135\7q\2\2\u0135\u0136"+
		"\7o\2\2\u0136\u0137\7g\2\2\u01378\3\2\2\2\u0138\u0139\7g\2\2\u0139\u013a"+
		"\7z\2\2\u013a\u013b\7k\2\2\u013b\u013c\7n\2\2\u013c\u013d\7g\2\2\u013d"+
		"\u013e\7a\2\2\u013e\u013f\7t\2\2\u013f\u0140\7w\2\2\u0140\u0141\7n\2\2"+
		"\u0141\u0142\7g\2\2\u0142\u0143\7t\2\2\u0143\u0144\7a\2\2\u0144\u0145"+
		"\7c\2\2\u0145\u0146\7u\2\2\u0146:\3\2\2\2\u0147\u0148\7t\2\2\u0148\u0149"+
		"\7g\2\2\u0149\u014a\7u\2\2\u014a\u014b\7v\2\2\u014b\u014c\7q\2\2\u014c"+
		"\u014d\7t\2\2\u014d\u014e\7g\2\2\u014e\u014f\7a\2\2\u014f\u0150\7e\2\2"+
		"\u0150\u0151\7q\2\2\u0151\u0152\7w\2\2\u0152\u0153\7p\2\2\u0153\u0154"+
		"\7v\2\2\u0154\u0155\7t\2\2\u0155\u0156\7{\2\2\u0156\u0157\7a\2\2\u0157"+
		"\u0158\7p\2\2\u0158\u0159\7c\2\2\u0159\u015a\7o\2\2\u015a\u015b\7g\2\2"+
		"\u015b<\3\2\2\2\20\2RWcegou{\u0095\u009d\u00a5\u00f2\u0104\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}