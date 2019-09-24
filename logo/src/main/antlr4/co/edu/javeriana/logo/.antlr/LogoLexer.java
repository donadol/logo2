// Generated from /Users/lauradonado/Documents/eclipse-workspace-mars-2/logo2/logo/src/main/antlr4/co/edu/javeriana/logo/Logo.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LET=1, PRINTLN=2, READ=3, MOVE_FORW=4, MOVE_BACK=5, ROT_L=6, ROT_R=7, 
		SET_COLOR=8, INI_IF=9, THEN=10, ELSE=11, END_IF=12, INI_WHILE=13, DO=14, 
		END_WHILE=15, INI_FUNC=16, END_FUNC=17, PLUS=18, MINUS=19, MULT=20, DIV=21, 
		AND=22, OR=23, NOT=24, GT=25, LT=26, GEQ=27, LEQ=28, EQ=29, NEQ=30, ASSIGN=31, 
		BRACKET_OPEN=32, BRACKET_CLOSE=33, PAR_OPEN=34, PAR_CLOSE=35, COLON=36, 
		SEMICOLON=37, TWO_DOTS=38, NUMBER=39, BOOLEAN=40, STRING=41, ID=42, WS=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LET", "PRINTLN", "READ", "MOVE_FORW", "MOVE_BACK", "ROT_L", "ROT_R", 
		"SET_COLOR", "INI_IF", "THEN", "ELSE", "END_IF", "INI_WHILE", "DO", "END_WHILE", 
		"INI_FUNC", "END_FUNC", "PLUS", "MINUS", "MULT", "DIV", "AND", "OR", "NOT", 
		"GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ASSIGN", "BRACKET_OPEN", "BRACKET_CLOSE", 
		"PAR_OPEN", "PAR_CLOSE", "COLON", "SEMICOLON", "TWO_DOTS", "NUMBER", "BOOLEAN", 
		"STRING", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'let'", "'println'", "'read'", "'move_forw'", "'move_back'", "'rot_l'", 
		"'rot_r'", "'set_color'", "'if'", "'then'", "'else'", "'end_if'", "'while'", 
		"'do'", "'end_while'", "'def'", "'end_def'", "'+'", "'-'", "'*'", "'/'", 
		"'&&'", "'||'", "'!'", "'>'", "'<'", "'>='", "'<='", "'=='", "'<>'", "'='", 
		"'{'", "'}'", "'('", "')'", "','", "';'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LET", "PRINTLN", "READ", "MOVE_FORW", "MOVE_BACK", "ROT_L", "ROT_R", 
		"SET_COLOR", "INI_IF", "THEN", "ELSE", "END_IF", "INI_WHILE", "DO", "END_WHILE", 
		"INI_FUNC", "END_FUNC", "PLUS", "MINUS", "MULT", "DIV", "AND", "OR", "NOT", 
		"GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ASSIGN", "BRACKET_OPEN", "BRACKET_CLOSE", 
		"PAR_OPEN", "PAR_CLOSE", "COLON", "SEMICOLON", "TWO_DOTS", "NUMBER", "BOOLEAN", 
		"STRING", "ID", "WS"
	};
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


	public LogoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Logo.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0128\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\6(\u00f9"+
		"\n(\r(\16(\u00fa\3(\3(\6(\u00ff\n(\r(\16(\u0100\5(\u0103\n(\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\5)\u010e\n)\3*\3*\3*\3*\7*\u0114\n*\f*\16*\u0117\13*"+
		"\3*\3*\3+\3+\7+\u011d\n+\f+\16+\u0120\13+\3,\6,\u0123\n,\r,\16,\u0124"+
		"\3,\3,\3\u0115\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-\3\2\6\3\2\62;\5\2C\\a"+
		"ac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u012f\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y"+
		"\3\2\2\2\5]\3\2\2\2\7e\3\2\2\2\tj\3\2\2\2\13t\3\2\2\2\r~\3\2\2\2\17\u0084"+
		"\3\2\2\2\21\u008a\3\2\2\2\23\u0094\3\2\2\2\25\u0097\3\2\2\2\27\u009c\3"+
		"\2\2\2\31\u00a1\3\2\2\2\33\u00a8\3\2\2\2\35\u00ae\3\2\2\2\37\u00b1\3\2"+
		"\2\2!\u00bb\3\2\2\2#\u00bf\3\2\2\2%\u00c7\3\2\2\2\'\u00c9\3\2\2\2)\u00cb"+
		"\3\2\2\2+\u00cd\3\2\2\2-\u00cf\3\2\2\2/\u00d2\3\2\2\2\61\u00d5\3\2\2\2"+
		"\63\u00d7\3\2\2\2\65\u00d9\3\2\2\2\67\u00db\3\2\2\29\u00de\3\2\2\2;\u00e1"+
		"\3\2\2\2=\u00e4\3\2\2\2?\u00e7\3\2\2\2A\u00e9\3\2\2\2C\u00eb\3\2\2\2E"+
		"\u00ed\3\2\2\2G\u00ef\3\2\2\2I\u00f1\3\2\2\2K\u00f3\3\2\2\2M\u00f5\3\2"+
		"\2\2O\u00f8\3\2\2\2Q\u010d\3\2\2\2S\u010f\3\2\2\2U\u011a\3\2\2\2W\u0122"+
		"\3\2\2\2YZ\7n\2\2Z[\7g\2\2[\\\7v\2\2\\\4\3\2\2\2]^\7r\2\2^_\7t\2\2_`\7"+
		"k\2\2`a\7p\2\2ab\7v\2\2bc\7n\2\2cd\7p\2\2d\6\3\2\2\2ef\7t\2\2fg\7g\2\2"+
		"gh\7c\2\2hi\7f\2\2i\b\3\2\2\2jk\7o\2\2kl\7q\2\2lm\7x\2\2mn\7g\2\2no\7"+
		"a\2\2op\7h\2\2pq\7q\2\2qr\7t\2\2rs\7y\2\2s\n\3\2\2\2tu\7o\2\2uv\7q\2\2"+
		"vw\7x\2\2wx\7g\2\2xy\7a\2\2yz\7d\2\2z{\7c\2\2{|\7e\2\2|}\7m\2\2}\f\3\2"+
		"\2\2~\177\7t\2\2\177\u0080\7q\2\2\u0080\u0081\7v\2\2\u0081\u0082\7a\2"+
		"\2\u0082\u0083\7n\2\2\u0083\16\3\2\2\2\u0084\u0085\7t\2\2\u0085\u0086"+
		"\7q\2\2\u0086\u0087\7v\2\2\u0087\u0088\7a\2\2\u0088\u0089\7t\2\2\u0089"+
		"\20\3\2\2\2\u008a\u008b\7u\2\2\u008b\u008c\7g\2\2\u008c\u008d\7v\2\2\u008d"+
		"\u008e\7a\2\2\u008e\u008f\7e\2\2\u008f\u0090\7q\2\2\u0090\u0091\7n\2\2"+
		"\u0091\u0092\7q\2\2\u0092\u0093\7t\2\2\u0093\22\3\2\2\2\u0094\u0095\7"+
		"k\2\2\u0095\u0096\7h\2\2\u0096\24\3\2\2\2\u0097\u0098\7v\2\2\u0098\u0099"+
		"\7j\2\2\u0099\u009a\7g\2\2\u009a\u009b\7p\2\2\u009b\26\3\2\2\2\u009c\u009d"+
		"\7g\2\2\u009d\u009e\7n\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7g\2\2\u00a0"+
		"\30\3\2\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7f\2\2\u00a4"+
		"\u00a5\7a\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7h\2\2\u00a7\32\3\2\2\2\u00a8"+
		"\u00a9\7y\2\2\u00a9\u00aa\7j\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7n\2\2"+
		"\u00ac\u00ad\7g\2\2\u00ad\34\3\2\2\2\u00ae\u00af\7f\2\2\u00af\u00b0\7"+
		"q\2\2\u00b0\36\3\2\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4"+
		"\7f\2\2\u00b4\u00b5\7a\2\2\u00b5\u00b6\7y\2\2\u00b6\u00b7\7j\2\2\u00b7"+
		"\u00b8\7k\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7g\2\2\u00ba \3\2\2\2\u00bb"+
		"\u00bc\7f\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7h\2\2\u00be\"\3\2\2\2\u00bf"+
		"\u00c0\7g\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7f\2\2\u00c2\u00c3\7a\2\2"+
		"\u00c3\u00c4\7f\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7h\2\2\u00c6$\3\2\2"+
		"\2\u00c7\u00c8\7-\2\2\u00c8&\3\2\2\2\u00c9\u00ca\7/\2\2\u00ca(\3\2\2\2"+
		"\u00cb\u00cc\7,\2\2\u00cc*\3\2\2\2\u00cd\u00ce\7\61\2\2\u00ce,\3\2\2\2"+
		"\u00cf\u00d0\7(\2\2\u00d0\u00d1\7(\2\2\u00d1.\3\2\2\2\u00d2\u00d3\7~\2"+
		"\2\u00d3\u00d4\7~\2\2\u00d4\60\3\2\2\2\u00d5\u00d6\7#\2\2\u00d6\62\3\2"+
		"\2\2\u00d7\u00d8\7@\2\2\u00d8\64\3\2\2\2\u00d9\u00da\7>\2\2\u00da\66\3"+
		"\2\2\2\u00db\u00dc\7@\2\2\u00dc\u00dd\7?\2\2\u00dd8\3\2\2\2\u00de\u00df"+
		"\7>\2\2\u00df\u00e0\7?\2\2\u00e0:\3\2\2\2\u00e1\u00e2\7?\2\2\u00e2\u00e3"+
		"\7?\2\2\u00e3<\3\2\2\2\u00e4\u00e5\7>\2\2\u00e5\u00e6\7@\2\2\u00e6>\3"+
		"\2\2\2\u00e7\u00e8\7?\2\2\u00e8@\3\2\2\2\u00e9\u00ea\7}\2\2\u00eaB\3\2"+
		"\2\2\u00eb\u00ec\7\177\2\2\u00ecD\3\2\2\2\u00ed\u00ee\7*\2\2\u00eeF\3"+
		"\2\2\2\u00ef\u00f0\7+\2\2\u00f0H\3\2\2\2\u00f1\u00f2\7.\2\2\u00f2J\3\2"+
		"\2\2\u00f3\u00f4\7=\2\2\u00f4L\3\2\2\2\u00f5\u00f6\7<\2\2\u00f6N\3\2\2"+
		"\2\u00f7\u00f9\t\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u0102\3\2\2\2\u00fc\u00fe\7\60\2\2"+
		"\u00fd\u00ff\t\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe"+
		"\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u00fc\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103P\3\2\2\2\u0104\u0105\7v\2\2\u0105\u0106\7t\2\2\u0106"+
		"\u0107\7w\2\2\u0107\u010e\7g\2\2\u0108\u0109\7h\2\2\u0109\u010a\7c\2\2"+
		"\u010a\u010b\7n\2\2\u010b\u010c\7u\2\2\u010c\u010e\7g\2\2\u010d\u0104"+
		"\3\2\2\2\u010d\u0108\3\2\2\2\u010eR\3\2\2\2\u010f\u0115\7$\2\2\u0110\u0111"+
		"\7^\2\2\u0111\u0114\7$\2\2\u0112\u0114\13\2\2\2\u0113\u0110\3\2\2\2\u0113"+
		"\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0116\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7$\2\2\u0119"+
		"T\3\2\2\2\u011a\u011e\t\3\2\2\u011b\u011d\t\4\2\2\u011c\u011b\3\2\2\2"+
		"\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011fV\3"+
		"\2\2\2\u0120\u011e\3\2\2\2\u0121\u0123\t\5\2\2\u0122\u0121\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126\u0127\b,\2\2\u0127X\3\2\2\2\13\2\u00fa\u0100\u0102\u010d\u0113"+
		"\u0115\u011e\u0124\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}