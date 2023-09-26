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
		AND=1, OR=2, YES=3, NO=4, NOT=5, MPOWER=6, TAG=7, INT=8, STRING=9, FLOAT=10, 
		LPAR=11, RPAR=12, EQUALS=13, PLUS=14, MINUS=15, WHITESPACE=16, SINGLE_LINE_COMMENT=17, 
		IF=18, ELSE=19, ELSE_IF=20, LIMIT=21, SKILL_SACLED_MOD=22, POTENTIAL=23, 
		TRIGGER=24, EFFECT=25, TOOLTIP=26, CUSTOM_TOOLTIP=27, DESC=28, CUSTOM_TRIGGER_TOOLTIP=29, 
		TRIGGER_NAME=30, MODIFIER_NAME=31, EFFECT_NAME=32, SCOPE=33, MONARCH_POWER=34, 
		AI=35, MODIFIER=36, CHANCE=37, AI_WILL_DO=38, FACTOR=39, AI_WEIGHT=40, 
		SLOT=41, GENERIC=42, HAS_COUNTRY_SHIELD=43, POTENTIAL_ON_LOAD=44, ICON=45, 
		POSITION=46, COMPLETED_BY=47, REQUIRED_MISSIONS=48, PROVINCES_TO_HIGHLIGHT=49, 
		IDENTIFIER=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AND", "OR", "YES", "NO", "NOT", "MPOWER", "TAG", "INT", "STRING", "FLOAT", 
			"LPAR", "RPAR", "EQUALS", "PLUS", "MINUS", "WHITESPACE", "SINGLE_LINE_COMMENT", 
			"IF", "ELSE", "ELSE_IF", "LIMIT", "SKILL_SACLED_MOD", "POTENTIAL", "TRIGGER", 
			"EFFECT", "TOOLTIP", "CUSTOM_TOOLTIP", "DESC", "CUSTOM_TRIGGER_TOOLTIP", 
			"TRIGGER_NAME", "MODIFIER_NAME", "EFFECT_NAME", "SCOPE", "MONARCH_POWER", 
			"AI", "MODIFIER", "CHANCE", "AI_WILL_DO", "FACTOR", "AI_WEIGHT", "SLOT", 
			"GENERIC", "HAS_COUNTRY_SHIELD", "POTENTIAL_ON_LOAD", "ICON", "POSITION", 
			"COMPLETED_BY", "REQUIRED_MISSIONS", "PROVINCES_TO_HIGHLIGHT", "IDENTIFIER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0226\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4u\n\4\3\5\3\5\3\5"+
		"\3\5\5\5{\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0083\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u008e\n\7\3\b\3\b\3\b\3\b\3\t\6\t\u0095\n\t\r\t"+
		"\16\t\u0096\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a3\n\n\7\n"+
		"\u00a5\n\n\f\n\16\n\u00a8\13\n\3\n\3\n\3\13\6\13\u00ad\n\13\r\13\16\13"+
		"\u00ae\3\13\3\13\6\13\u00b3\n\13\r\13\16\13\u00b4\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\6\21\u00c2\n\21\r\21\16\21\u00c3\3\21\3"+
		"\21\3\22\3\22\7\22\u00ca\n\22\f\22\16\22\u00cd\13\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\5\"\u016b\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\7\63\u0222\n\63\f\63\16\63\u0225\13\63\2\2\64\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64\3\2\t\4\2\62;C\\\3\2\62;\3\2$$\5"+
		"\2\13\f\17\17\"\"\4\2\f\f\17\17\5\2C\\aac|\6\2\62;C\\aac|\2\u0237\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5k\3\2\2\2\7t\3\2\2\2\tz\3\2\2\2\13"+
		"\u0082\3\2\2\2\r\u008d\3\2\2\2\17\u008f\3\2\2\2\21\u0094\3\2\2\2\23\u0098"+
		"\3\2\2\2\25\u00ac\3\2\2\2\27\u00b6\3\2\2\2\31\u00b8\3\2\2\2\33\u00ba\3"+
		"\2\2\2\35\u00bc\3\2\2\2\37\u00be\3\2\2\2!\u00c1\3\2\2\2#\u00c7\3\2\2\2"+
		"%\u00d0\3\2\2\2\'\u00d3\3\2\2\2)\u00d8\3\2\2\2+\u00e0\3\2\2\2-\u00e6\3"+
		"\2\2\2/\u00fc\3\2\2\2\61\u0106\3\2\2\2\63\u010e\3\2\2\2\65\u0115\3\2\2"+
		"\2\67\u011d\3\2\2\29\u012c\3\2\2\2;\u0131\3\2\2\2=\u0148\3\2\2\2?\u0150"+
		"\3\2\2\2A\u0159\3\2\2\2C\u016a\3\2\2\2E\u016c\3\2\2\2G\u017a\3\2\2\2I"+
		"\u017d\3\2\2\2K\u0186\3\2\2\2M\u018d\3\2\2\2O\u0198\3\2\2\2Q\u019f\3\2"+
		"\2\2S\u01a9\3\2\2\2U\u01ae\3\2\2\2W\u01b6\3\2\2\2Y\u01c9\3\2\2\2[\u01db"+
		"\3\2\2\2]\u01e0\3\2\2\2_\u01e9\3\2\2\2a\u01f6\3\2\2\2c\u0208\3\2\2\2e"+
		"\u021f\3\2\2\2gh\7C\2\2hi\7P\2\2ij\7F\2\2j\4\3\2\2\2kl\7Q\2\2lm\7T\2\2"+
		"m\6\3\2\2\2no\7{\2\2op\7g\2\2pu\7u\2\2qr\7[\2\2rs\7G\2\2su\7U\2\2tn\3"+
		"\2\2\2tq\3\2\2\2u\b\3\2\2\2vw\7p\2\2w{\7q\2\2xy\7P\2\2y{\7Q\2\2zv\3\2"+
		"\2\2zx\3\2\2\2{\n\3\2\2\2|}\7P\2\2}~\7Q\2\2~\u0083\7V\2\2\177\u0080\7"+
		"p\2\2\u0080\u0081\7q\2\2\u0081\u0083\7v\2\2\u0082|\3\2\2\2\u0082\177\3"+
		"\2\2\2\u0083\f\3\2\2\2\u0084\u0085\7C\2\2\u0085\u0086\7F\2\2\u0086\u008e"+
		"\7O\2\2\u0087\u0088\7O\2\2\u0088\u0089\7K\2\2\u0089\u008e\7N\2\2\u008a"+
		"\u008b\7F\2\2\u008b\u008c\7K\2\2\u008c\u008e\7R\2\2\u008d\u0084\3\2\2"+
		"\2\u008d\u0087\3\2\2\2\u008d\u008a\3\2\2\2\u008e\16\3\2\2\2\u008f\u0090"+
		"\t\2\2\2\u0090\u0091\t\2\2\2\u0091\u0092\t\2\2\2\u0092\20\3\2\2\2\u0093"+
		"\u0095\t\3\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\22\3\2\2\2\u0098\u00a6\7$\2\2\u0099\u00a5"+
		"\n\4\2\2\u009a\u00a3\7\"\2\2\u009b\u009c\7^\2\2\u009c\u00a3\7p\2\2\u009d"+
		"\u009e\7^\2\2\u009e\u00a3\7v\2\2\u009f\u00a0\7^\2\2\u00a0\u00a3\7$\2\2"+
		"\u00a1\u00a3\7^\2\2\u00a2\u009a\3\2\2\2\u00a2\u009b\3\2\2\2\u00a2\u009d"+
		"\3\2\2\2\u00a2\u009f\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4"+
		"\u0099\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00aa\7$\2\2\u00aa\24\3\2\2\2\u00ab\u00ad\t\3\2\2\u00ac\u00ab\3\2\2\2"+
		"\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b2\7\60\2\2\u00b1\u00b3\t\3\2\2\u00b2\u00b1\3\2\2\2"+
		"\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\26"+
		"\3\2\2\2\u00b6\u00b7\7}\2\2\u00b7\30\3\2\2\2\u00b8\u00b9\7\177\2\2\u00b9"+
		"\32\3\2\2\2\u00ba\u00bb\7?\2\2\u00bb\34\3\2\2\2\u00bc\u00bd\7-\2\2\u00bd"+
		"\36\3\2\2\2\u00be\u00bf\7/\2\2\u00bf \3\2\2\2\u00c0\u00c2\t\5\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\b\21\2\2\u00c6\"\3\2\2\2\u00c7\u00cb"+
		"\7%\2\2\u00c8\u00ca\n\6\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00ce\u00cf\b\22\2\2\u00cf$\3\2\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2"+
		"\7h\2\2\u00d2&\3\2\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6"+
		"\7u\2\2\u00d6\u00d7\7g\2\2\u00d7(\3\2\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da"+
		"\7n\2\2\u00da\u00db\7u\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7a\2\2\u00dd"+
		"\u00de\7k\2\2\u00de\u00df\7h\2\2\u00df*\3\2\2\2\u00e0\u00e1\7n\2\2\u00e1"+
		"\u00e2\7k\2\2\u00e2\u00e3\7o\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7v\2\2"+
		"\u00e5,\3\2\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7m\2\2\u00e8\u00e9\7k\2"+
		"\2\u00e9\u00ea\7n\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7a\2\2\u00ec\u00ed"+
		"\7u\2\2\u00ed\u00ee\7e\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7n\2\2\u00f0"+
		"\u00f1\7g\2\2\u00f1\u00f2\7f\2\2\u00f2\u00f3\7a\2\2\u00f3\u00f4\7o\2\2"+
		"\u00f4\u00f5\7q\2\2\u00f5\u00f6\7f\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8"+
		"\7h\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7t\2\2\u00fb"+
		".\3\2\2\2\u00fc\u00fd\7r\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7v\2\2\u00ff"+
		"\u0100\7g\2\2\u0100\u0101\7p\2\2\u0101\u0102\7v\2\2\u0102\u0103\7k\2\2"+
		"\u0103\u0104\7c\2\2\u0104\u0105\7n\2\2\u0105\60\3\2\2\2\u0106\u0107\7"+
		"v\2\2\u0107\u0108\7t\2\2\u0108\u0109\7k\2\2\u0109\u010a\7i\2\2\u010a\u010b"+
		"\7i\2\2\u010b\u010c\7g\2\2\u010c\u010d\7t\2\2\u010d\62\3\2\2\2\u010e\u010f"+
		"\7g\2\2\u010f\u0110\7h\2\2\u0110\u0111\7h\2\2\u0111\u0112\7g\2\2\u0112"+
		"\u0113\7e\2\2\u0113\u0114\7v\2\2\u0114\64\3\2\2\2\u0115\u0116\7v\2\2\u0116"+
		"\u0117\7q\2\2\u0117\u0118\7q\2\2\u0118\u0119\7n\2\2\u0119\u011a\7v\2\2"+
		"\u011a\u011b\7k\2\2\u011b\u011c\7r\2\2\u011c\66\3\2\2\2\u011d\u011e\7"+
		"e\2\2\u011e\u011f\7w\2\2\u011f\u0120\7u\2\2\u0120\u0121\7v\2\2\u0121\u0122"+
		"\7q\2\2\u0122\u0123\7o\2\2\u0123\u0124\7a\2\2\u0124\u0125\7v\2\2\u0125"+
		"\u0126\7q\2\2\u0126\u0127\7q\2\2\u0127\u0128\7n\2\2\u0128\u0129\7v\2\2"+
		"\u0129\u012a\7k\2\2\u012a\u012b\7r\2\2\u012b8\3\2\2\2\u012c\u012d\7f\2"+
		"\2\u012d\u012e\7g\2\2\u012e\u012f\7u\2\2\u012f\u0130\7e\2\2\u0130:\3\2"+
		"\2\2\u0131\u0132\7e\2\2\u0132\u0133\7w\2\2\u0133\u0134\7u\2\2\u0134\u0135"+
		"\7v\2\2\u0135\u0136\7q\2\2\u0136\u0137\7o\2\2\u0137\u0138\7a\2\2\u0138"+
		"\u0139\7v\2\2\u0139\u013a\7t\2\2\u013a\u013b\7k\2\2\u013b\u013c\7i\2\2"+
		"\u013c\u013d\7i\2\2\u013d\u013e\7g\2\2\u013e\u013f\7t\2\2\u013f\u0140"+
		"\7a\2\2\u0140\u0141\7v\2\2\u0141\u0142\7q\2\2\u0142\u0143\7q\2\2\u0143"+
		"\u0144\7n\2\2\u0144\u0145\7v\2\2\u0145\u0146\7k\2\2\u0146\u0147\7r\2\2"+
		"\u0147<\3\2\2\2\u0148\u0149\7k\2\2\u0149\u014a\7u\2\2\u014a\u014b\7a\2"+
		"\2\u014b\u014c\7e\2\2\u014c\u014d\7q\2\2\u014d\u014e\7t\2\2\u014e\u014f"+
		"\7g\2\2\u014f>\3\2\2\2\u0150\u0151\7r\2\2\u0151\u0152\7t\2\2\u0152\u0153"+
		"\7g\2\2\u0153\u0154\7u\2\2\u0154\u0155\7v\2\2\u0155\u0156\7k\2\2\u0156"+
		"\u0157\7i\2\2\u0157\u0158\7g\2\2\u0158@\3\2\2\2\u0159\u015a\7c\2\2\u015a"+
		"\u015b\7f\2\2\u015b\u015c\7f\2\2\u015c\u015d\7a\2\2\u015d\u015e\7e\2\2"+
		"\u015e\u015f\7q\2\2\u015f\u0160\7t\2\2\u0160\u0161\7g\2\2\u0161B\3\2\2"+
		"\2\u0162\u0163\7T\2\2\u0163\u0164\7Q\2\2\u0164\u0165\7Q\2\2\u0165\u016b"+
		"\7V\2\2\u0166\u0167\7t\2\2\u0167\u0168\7q\2\2\u0168\u0169\7q\2\2\u0169"+
		"\u016b\7v\2\2\u016a\u0162\3\2\2\2\u016a\u0166\3\2\2\2\u016bD\3\2\2\2\u016c"+
		"\u016d\7o\2\2\u016d\u016e\7q\2\2\u016e\u016f\7p\2\2\u016f\u0170\7c\2\2"+
		"\u0170\u0171\7t\2\2\u0171\u0172\7e\2\2\u0172\u0173\7j\2\2\u0173\u0174"+
		"\7a\2\2\u0174\u0175\7r\2\2\u0175\u0176\7q\2\2\u0176\u0177\7y\2\2\u0177"+
		"\u0178\7g\2\2\u0178\u0179\7t\2\2\u0179F\3\2\2\2\u017a\u017b\7c\2\2\u017b"+
		"\u017c\7k\2\2\u017cH\3\2\2\2\u017d\u017e\7o\2\2\u017e\u017f\7q\2\2\u017f"+
		"\u0180\7f\2\2\u0180\u0181\7k\2\2\u0181\u0182\7h\2\2\u0182\u0183\7k\2\2"+
		"\u0183\u0184\7g\2\2\u0184\u0185\7t\2\2\u0185J\3\2\2\2\u0186\u0187\7e\2"+
		"\2\u0187\u0188\7j\2\2\u0188\u0189\7c\2\2\u0189\u018a\7p\2\2\u018a\u018b"+
		"\7e\2\2\u018b\u018c\7g\2\2\u018cL\3\2\2\2\u018d\u018e\7c\2\2\u018e\u018f"+
		"\7k\2\2\u018f\u0190\7a\2\2\u0190\u0191\7y\2\2\u0191\u0192\7k\2\2\u0192"+
		"\u0193\7n\2\2\u0193\u0194\7n\2\2\u0194\u0195\7a\2\2\u0195\u0196\7f\2\2"+
		"\u0196\u0197\7q\2\2\u0197N\3\2\2\2\u0198\u0199\7h\2\2\u0199\u019a\7c\2"+
		"\2\u019a\u019b\7e\2\2\u019b\u019c\7v\2\2\u019c\u019d\7q\2\2\u019d\u019e"+
		"\7t\2\2\u019eP\3\2\2\2\u019f\u01a0\7c\2\2\u01a0\u01a1\7k\2\2\u01a1\u01a2"+
		"\7a\2\2\u01a2\u01a3\7y\2\2\u01a3\u01a4\7g\2\2\u01a4\u01a5\7k\2\2\u01a5"+
		"\u01a6\7i\2\2\u01a6\u01a7\7j\2\2\u01a7\u01a8\7v\2\2\u01a8R\3\2\2\2\u01a9"+
		"\u01aa\7u\2\2\u01aa\u01ab\7n\2\2\u01ab\u01ac\7q\2\2\u01ac\u01ad\7v\2\2"+
		"\u01adT\3\2\2\2\u01ae\u01af\7i\2\2\u01af\u01b0\7g\2\2\u01b0\u01b1\7p\2"+
		"\2\u01b1\u01b2\7g\2\2\u01b2\u01b3\7t\2\2\u01b3\u01b4\7k\2\2\u01b4\u01b5"+
		"\7e\2\2\u01b5V\3\2\2\2\u01b6\u01b7\7j\2\2\u01b7\u01b8\7c\2\2\u01b8\u01b9"+
		"\7u\2\2\u01b9\u01ba\7a\2\2\u01ba\u01bb\7e\2\2\u01bb\u01bc\7q\2\2\u01bc"+
		"\u01bd\7w\2\2\u01bd\u01be\7p\2\2\u01be\u01bf\7v\2\2\u01bf\u01c0\7t\2\2"+
		"\u01c0\u01c1\7{\2\2\u01c1\u01c2\7a\2\2\u01c2\u01c3\7u\2\2\u01c3\u01c4"+
		"\7j\2\2\u01c4\u01c5\7k\2\2\u01c5\u01c6\7g\2\2\u01c6\u01c7\7n\2\2\u01c7"+
		"\u01c8\7f\2\2\u01c8X\3\2\2\2\u01c9\u01ca\7r\2\2\u01ca\u01cb\7q\2\2\u01cb"+
		"\u01cc\7v\2\2\u01cc\u01cd\7g\2\2\u01cd\u01ce\7p\2\2\u01ce\u01cf\7v\2\2"+
		"\u01cf\u01d0\7k\2\2\u01d0\u01d1\7c\2\2\u01d1\u01d2\7n\2\2\u01d2\u01d3"+
		"\7a\2\2\u01d3\u01d4\7q\2\2\u01d4\u01d5\7p\2\2\u01d5\u01d6\7a\2\2\u01d6"+
		"\u01d7\7n\2\2\u01d7\u01d8\7q\2\2\u01d8\u01d9\7c\2\2\u01d9\u01da\7f\2\2"+
		"\u01daZ\3\2\2\2\u01db\u01dc\7k\2\2\u01dc\u01dd\7e\2\2\u01dd\u01de\7q\2"+
		"\2\u01de\u01df\7p\2\2\u01df\\\3\2\2\2\u01e0\u01e1\7r\2\2\u01e1\u01e2\7"+
		"q\2\2\u01e2\u01e3\7u\2\2\u01e3\u01e4\7k\2\2\u01e4\u01e5\7v\2\2\u01e5\u01e6"+
		"\7k\2\2\u01e6\u01e7\7q\2\2\u01e7\u01e8\7p\2\2\u01e8^\3\2\2\2\u01e9\u01ea"+
		"\7e\2\2\u01ea\u01eb\7q\2\2\u01eb\u01ec\7o\2\2\u01ec\u01ed\7r\2\2\u01ed"+
		"\u01ee\7n\2\2\u01ee\u01ef\7g\2\2\u01ef\u01f0\7v\2\2\u01f0\u01f1\7g\2\2"+
		"\u01f1\u01f2\7f\2\2\u01f2\u01f3\7a\2\2\u01f3\u01f4\7d\2\2\u01f4\u01f5"+
		"\7{\2\2\u01f5`\3\2\2\2\u01f6\u01f7\7t\2\2\u01f7\u01f8\7g\2\2\u01f8\u01f9"+
		"\7s\2\2\u01f9\u01fa\7w\2\2\u01fa\u01fb\7k\2\2\u01fb\u01fc\7t\2\2\u01fc"+
		"\u01fd\7g\2\2\u01fd\u01fe\7f\2\2\u01fe\u01ff\7a\2\2\u01ff\u0200\7o\2\2"+
		"\u0200\u0201\7k\2\2\u0201\u0202\7u\2\2\u0202\u0203\7u\2\2\u0203\u0204"+
		"\7k\2\2\u0204\u0205\7q\2\2\u0205\u0206\7p\2\2\u0206\u0207\7u\2\2\u0207"+
		"b\3\2\2\2\u0208\u0209\7r\2\2\u0209\u020a\7t\2\2\u020a\u020b\7q\2\2\u020b"+
		"\u020c\7x\2\2\u020c\u020d\7k\2\2\u020d\u020e\7p\2\2\u020e\u020f\7e\2\2"+
		"\u020f\u0210\7g\2\2\u0210\u0211\7u\2\2\u0211\u0212\7a\2\2\u0212\u0213"+
		"\7v\2\2\u0213\u0214\7q\2\2\u0214\u0215\7a\2\2\u0215\u0216\7j\2\2\u0216"+
		"\u0217\7k\2\2\u0217\u0218\7i\2\2\u0218\u0219\7j\2\2\u0219\u021a\7n\2\2"+
		"\u021a\u021b\7k\2\2\u021b\u021c\7i\2\2\u021c\u021d\7j\2\2\u021d\u021e"+
		"\7v\2\2\u021ed\3\2\2\2\u021f\u0223\t\7\2\2\u0220\u0222\t\b\2\2\u0221\u0220"+
		"\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224"+
		"f\3\2\2\2\u0225\u0223\3\2\2\2\21\2tz\u0082\u008d\u0096\u00a2\u00a4\u00a6"+
		"\u00ae\u00b4\u00c3\u00cb\u016a\u0223\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}