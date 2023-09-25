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
		BOOL=1, INT=2, STRING=3, FLOAT=4, VALUE_FORMAT=5, ID=6, PLUS=7, MINUS=8, 
		WHITESPACE=9, SINGLE_LINE_COMMENT=10, IF=11, ELSE_IF=12, TRIGGER=13, TRIGGER_NAME=14, 
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
			"BOOL", "INT", "STRING", "FLOAT", "VALUE_FORMAT", "ID", "PLUS", "MINUS", 
			"WHITESPACE", "SINGLE_LINE_COMMENT", "IF", "ELSE_IF", "TRIGGER", "TRIGGER_NAME", 
			"MODIFIER", "MODIFIER_INT", "MODIFIER_FLOAT", "MODIFIER_STRING", "MODIFIER_INT_NAME", 
			"MODIFIER_FLOAT_NAME", "MODIFIER_STRING_NAME", "EFFECT", "EFFECT_INT", 
			"EFFECT_FLOAT", "EFFECT_STRING", "EFFECT_BOOL", "EFFECT_INT_NAME", "EFFECT_FLOAT_NAME", 
			"EFFECT_STRING_NAME", "EFFECT_BOOL_NAME"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'+'", "'-'", null, null, null, 
			null, null, "'is_core'", null, null, null, null, "'free_leader_pool'", 
			null, "'PLACEHOLDER'", null, null, null, null, null, "'add_adm_power'", 
			"'add_years_of_income'", "'exile_ruler_as'", "'restore_country_name'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOL", "INT", "STRING", "FLOAT", "VALUE_FORMAT", "ID", "PLUS", 
			"MINUS", "WHITESPACE", "SINGLE_LINE_COMMENT", "IF", "ELSE_IF", "TRIGGER", 
			"TRIGGER_NAME", "MODIFIER", "MODIFIER_INT", "MODIFIER_FLOAT", "MODIFIER_STRING", 
			"MODIFIER_INT_NAME", "MODIFIER_FLOAT_NAME", "MODIFIER_STRING_NAME", "EFFECT", 
			"EFFECT_INT", "EFFECT_FLOAT", "EFFECT_STRING", "EFFECT_BOOL", "EFFECT_INT_NAME", 
			"EFFECT_FLOAT_NAME", "EFFECT_STRING_NAME", "EFFECT_BOOL_NAME"
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u017d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\5\2E\n\2\3\3\6\3H\n\3\r\3\16\3I\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4V\n\4\7\4X\n\4\f\4\16\4[\13\4\3\4\3\4\3\5\6\5`\n\5\r\5"+
		"\16\5a\3\5\3\5\6\5f\n\5\r\5\16\5g\3\6\3\6\3\6\3\6\5\6n\n\6\3\7\3\7\7\7"+
		"r\n\7\f\7\16\7u\13\7\3\b\3\b\3\t\3\t\3\n\6\n|\n\n\r\n\16\n}\3\n\3\n\3"+
		"\13\3\13\7\13\u0084\n\13\f\13\16\13\u0087\13\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ba\n\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u00c7\n\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u0114\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u0126\n\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\2\2"+
		" \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= \3\2\b\3\2\62;\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4"+
		"\2\f\f\17\17\2\u0194\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3D\3\2\2\2\5G\3\2\2\2\7K\3\2\2\2"+
		"\t_\3\2\2\2\13m\3\2\2\2\ro\3\2\2\2\17v\3\2\2\2\21x\3\2\2\2\23{\3\2\2\2"+
		"\25\u0081\3\2\2\2\27\u008a\3\2\2\2\31\u009c\3\2\2\2\33\u00b9\3\2\2\2\35"+
		"\u00bb\3\2\2\2\37\u00c6\3\2\2\2!\u00c8\3\2\2\2#\u00cc\3\2\2\2%\u00d0\3"+
		"\2\2\2\'\u00d4\3\2\2\2)\u0113\3\2\2\2+\u0115\3\2\2\2-\u0125\3\2\2\2/\u0127"+
		"\3\2\2\2\61\u012b\3\2\2\2\63\u012f\3\2\2\2\65\u0133\3\2\2\2\67\u0137\3"+
		"\2\2\29\u0145\3\2\2\2;\u0159\3\2\2\2=\u0168\3\2\2\2?@\7{\2\2@A\7g\2\2"+
		"AE\7u\2\2BC\7p\2\2CE\7q\2\2D?\3\2\2\2DB\3\2\2\2E\4\3\2\2\2FH\t\2\2\2G"+
		"F\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\6\3\2\2\2KY\7$\2\2LX\n\3\2\2"+
		"MV\7\"\2\2NO\7^\2\2OV\7p\2\2PQ\7^\2\2QV\7v\2\2RS\7^\2\2SV\7$\2\2TV\7^"+
		"\2\2UM\3\2\2\2UN\3\2\2\2UP\3\2\2\2UR\3\2\2\2UT\3\2\2\2VX\3\2\2\2WL\3\2"+
		"\2\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7"+
		"$\2\2]\b\3\2\2\2^`\t\2\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3"+
		"\2\2\2ce\7\60\2\2df\t\2\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\n"+
		"\3\2\2\2in\5\3\2\2jn\5\5\3\2kn\5\7\4\2ln\5\t\5\2mi\3\2\2\2mj\3\2\2\2m"+
		"k\3\2\2\2ml\3\2\2\2n\f\3\2\2\2os\t\4\2\2pr\t\5\2\2qp\3\2\2\2ru\3\2\2\2"+
		"sq\3\2\2\2st\3\2\2\2t\16\3\2\2\2us\3\2\2\2vw\7-\2\2w\20\3\2\2\2xy\7/\2"+
		"\2y\22\3\2\2\2z|\t\6\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177"+
		"\3\2\2\2\177\u0080\b\n\2\2\u0080\24\3\2\2\2\u0081\u0085\7%\2\2\u0082\u0084"+
		"\n\7\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\b\13"+
		"\2\2\u0089\26\3\2\2\2\u008a\u008b\7k\2\2\u008b\u008c\7h\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u008e\7?\2\2\u008e\u008f\7}\2\2\u008f\u0090\7n\2\2\u0090"+
		"\u0091\7k\2\2\u0091\u0092\7o\2\2\u0092\u0093\7k\2\2\u0093\u0094\7v\2\2"+
		"\u0094\u0095\3\2\2\2\u0095\u0096\7?\2\2\u0096\u0097\7}\2\2\u0097\u0098"+
		"\5\33\16\2\u0098\u0099\7\177\2\2\u0099\u009a\5-\27\2\u009a\u009b\7\177"+
		"\2\2\u009b\30\3\2\2\2\u009c\u009d\7g\2\2\u009d\u009e\7n\2\2\u009e\u009f"+
		"\7u\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7a\2\2\u00a1\u00a2\7k\2\2\u00a2"+
		"\u00a3\7h\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7?\2\2\u00a5\u00a6\7}\2"+
		"\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7o\2\2\u00a9\u00aa"+
		"\7k\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7?\2\2\u00ad"+
		"\u00ae\7}\2\2\u00ae\u00af\5\33\16\2\u00af\u00b0\7\177\2\2\u00b0\u00b1"+
		"\5-\27\2\u00b1\u00b2\7\177\2\2\u00b2\32\3\2\2\2\u00b3\u00b4\5\35\17\2"+
		"\u00b4\u00b5\7?\2\2\u00b5\u00b6\5\13\6\2\u00b6\u00ba\3\2\2\2\u00b7\u00ba"+
		"\5\27\f\2\u00b8\u00ba\5\31\r\2\u00b9\u00b3\3\2\2\2\u00b9\u00b7\3\2\2\2"+
		"\u00b9\u00b8\3\2\2\2\u00ba\34\3\2\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7"+
		"u\2\2\u00bd\u00be\7a\2\2\u00be\u00bf\7e\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1"+
		"\7t\2\2\u00c1\u00c2\7g\2\2\u00c2\36\3\2\2\2\u00c3\u00c7\5!\21\2\u00c4"+
		"\u00c7\5#\22\2\u00c5\u00c7\5%\23\2\u00c6\u00c3\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c6\u00c5\3\2\2\2\u00c7 \3\2\2\2\u00c8\u00c9\5\'\24\2\u00c9\u00ca"+
		"\7?\2\2\u00ca\u00cb\5\5\3\2\u00cb\"\3\2\2\2\u00cc\u00cd\5)\25\2\u00cd"+
		"\u00ce\7?\2\2\u00ce\u00cf\5\t\5\2\u00cf$\3\2\2\2\u00d0\u00d1\5+\26\2\u00d1"+
		"\u00d2\7?\2\2\u00d2\u00d3\5\7\4\2\u00d3&\3\2\2\2\u00d4\u00d5\7h\2\2\u00d5"+
		"\u00d6\7t\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7a\2\2"+
		"\u00d9\u00da\7n\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd"+
		"\7f\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7a\2\2\u00e0"+
		"\u00e1\7r\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7n\2\2"+
		"\u00e4(\3\2\2\2\u00e5\u00e6\7i\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7x\2"+
		"\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec"+
		"\7k\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7i\2\2\u00ee\u00ef\7a\2\2\u00ef"+
		"\u00f0\7e\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7r\2\2\u00f2\u00f3\7c\2\2"+
		"\u00f3\u00f4\7e\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7"+
		"\7{\2\2\u00f7\u00f8\7a\2\2\u00f8\u00f9\7o\2\2\u00f9\u00fa\7q\2\2\u00fa"+
		"\u00fb\7f\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7h\2\2\u00fd\u00fe\7k\2\2"+
		"\u00fe\u00ff\7g\2\2\u00ff\u0114\7t\2\2\u0100\u0101\7i\2\2\u0101\u0102"+
		"\7n\2\2\u0102\u0103\7q\2\2\u0103\u0104\7d\2\2\u0104\u0105\7c\2\2\u0105"+
		"\u0106\7n\2\2\u0106\u0107\7a\2\2\u0107\u0108\7v\2\2\u0108\u0109\7c\2\2"+
		"\u0109\u010a\7z\2\2\u010a\u010b\7a\2\2\u010b\u010c\7o\2\2\u010c\u010d"+
		"\7q\2\2\u010d\u010e\7f\2\2\u010e\u010f\7k\2\2\u010f\u0110\7h\2\2\u0110"+
		"\u0111\7k\2\2\u0111\u0112\7g\2\2\u0112\u0114\7t\2\2\u0113\u00e5\3\2\2"+
		"\2\u0113\u0100\3\2\2\2\u0114*\3\2\2\2\u0115\u0116\7R\2\2\u0116\u0117\7"+
		"N\2\2\u0117\u0118\7C\2\2\u0118\u0119\7E\2\2\u0119\u011a\7G\2\2\u011a\u011b"+
		"\7J\2\2\u011b\u011c\7Q\2\2\u011c\u011d\7N\2\2\u011d\u011e\7F\2\2\u011e"+
		"\u011f\7G\2\2\u011f\u0120\7T\2\2\u0120,\3\2\2\2\u0121\u0126\5/\30\2\u0122"+
		"\u0126\5\61\31\2\u0123\u0126\5\63\32\2\u0124\u0126\5\65\33\2\u0125\u0121"+
		"\3\2\2\2\u0125\u0122\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126"+
		".\3\2\2\2\u0127\u0128\5\67\34\2\u0128\u0129\7?\2\2\u0129\u012a\5\5\3\2"+
		"\u012a\60\3\2\2\2\u012b\u012c\59\35\2\u012c\u012d\7?\2\2\u012d\u012e\5"+
		"\t\5\2\u012e\62\3\2\2\2\u012f\u0130\5;\36\2\u0130\u0131\7?\2\2\u0131\u0132"+
		"\5\7\4\2\u0132\64\3\2\2\2\u0133\u0134\5=\37\2\u0134\u0135\7?\2\2\u0135"+
		"\u0136\5\3\2\2\u0136\66\3\2\2\2\u0137\u0138\7c\2\2\u0138\u0139\7f\2\2"+
		"\u0139\u013a\7f\2\2\u013a\u013b\7a\2\2\u013b\u013c\7c\2\2\u013c\u013d"+
		"\7f\2\2\u013d\u013e\7o\2\2\u013e\u013f\7a\2\2\u013f\u0140\7r\2\2\u0140"+
		"\u0141\7q\2\2\u0141\u0142\7y\2\2\u0142\u0143\7g\2\2\u0143\u0144\7t\2\2"+
		"\u01448\3\2\2\2\u0145\u0146\7c\2\2\u0146\u0147\7f\2\2\u0147\u0148\7f\2"+
		"\2\u0148\u0149\7a\2\2\u0149\u014a\7{\2\2\u014a\u014b\7g\2\2\u014b\u014c"+
		"\7c\2\2\u014c\u014d\7t\2\2\u014d\u014e\7u\2\2\u014e\u014f\7a\2\2\u014f"+
		"\u0150\7q\2\2\u0150\u0151\7h\2\2\u0151\u0152\7a\2\2\u0152\u0153\7k\2\2"+
		"\u0153\u0154\7p\2\2\u0154\u0155\7e\2\2\u0155\u0156\7q\2\2\u0156\u0157"+
		"\7o\2\2\u0157\u0158\7g\2\2\u0158:\3\2\2\2\u0159\u015a\7g\2\2\u015a\u015b"+
		"\7z\2\2\u015b\u015c\7k\2\2\u015c\u015d\7n\2\2\u015d\u015e\7g\2\2\u015e"+
		"\u015f\7a\2\2\u015f\u0160\7t\2\2\u0160\u0161\7w\2\2\u0161\u0162\7n\2\2"+
		"\u0162\u0163\7g\2\2\u0163\u0164\7t\2\2\u0164\u0165\7a\2\2\u0165\u0166"+
		"\7c\2\2\u0166\u0167\7u\2\2\u0167<\3\2\2\2\u0168\u0169\7t\2\2\u0169\u016a"+
		"\7g\2\2\u016a\u016b\7u\2\2\u016b\u016c\7v\2\2\u016c\u016d\7q\2\2\u016d"+
		"\u016e\7t\2\2\u016e\u016f\7g\2\2\u016f\u0170\7a\2\2\u0170\u0171\7e\2\2"+
		"\u0171\u0172\7q\2\2\u0172\u0173\7w\2\2\u0173\u0174\7p\2\2\u0174\u0175"+
		"\7v\2\2\u0175\u0176\7t\2\2\u0176\u0177\7{\2\2\u0177\u0178\7a\2\2\u0178"+
		"\u0179\7p\2\2\u0179\u017a\7c\2\2\u017a\u017b\7o\2\2\u017b\u017c\7g\2\2"+
		"\u017c>\3\2\2\2\22\2DIUWYagms}\u0085\u00b9\u00c6\u0113\u0125\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}