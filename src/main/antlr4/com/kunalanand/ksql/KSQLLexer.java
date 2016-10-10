// Generated from KSQL.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KSQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, DELETE=2, FROM=3, WHERE=4, AND=5, OR=6, STAR=7, EQ=8, ID=9, 
		INT=10, COMMA=11, SEMICOLON=12, WS=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SELECT", "DELETE", "FROM", "WHERE", "AND", "OR", "STAR", "EQ", "ID", 
		"INT", "COMMA", "SEMICOLON", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'*'", "'='", null, null, "','", 
		"';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "DELETE", "FROM", "WHERE", "AND", "OR", "STAR", "EQ", 
		"ID", "INT", "COMMA", "SEMICOLON", "WS"
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


	public KSQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "KSQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2*\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"8\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4B\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5N\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6V\n\6\3\7\3\7\3\7"+
		"\3\7\5\7\\\n\7\3\b\3\b\3\t\3\t\3\n\6\nc\n\n\r\n\16\nd\3\13\6\13h\n\13"+
		"\r\13\16\13i\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\6\16u\n\16\r\16\16\16"+
		"v\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\u0082\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\3)\3\2\2\2\5\67\3\2\2\2\7A\3\2\2\2\tM\3\2\2\2\13U\3\2"+
		"\2\2\r[\3\2\2\2\17]\3\2\2\2\21_\3\2\2\2\23b\3\2\2\2\25g\3\2\2\2\27k\3"+
		"\2\2\2\31o\3\2\2\2\33t\3\2\2\2\35\36\7U\2\2\36\37\7G\2\2\37 \7N\2\2 !"+
		"\7G\2\2!\"\7E\2\2\"*\7V\2\2#$\7u\2\2$%\7g\2\2%&\7n\2\2&\'\7g\2\2\'(\7"+
		"e\2\2(*\7v\2\2)\35\3\2\2\2)#\3\2\2\2*\4\3\2\2\2+,\7F\2\2,-\7G\2\2-.\7"+
		"N\2\2./\7G\2\2/\60\7V\2\2\608\7G\2\2\61\62\7f\2\2\62\63\7g\2\2\63\64\7"+
		"n\2\2\64\65\7g\2\2\65\66\7v\2\2\668\7g\2\2\67+\3\2\2\2\67\61\3\2\2\28"+
		"\6\3\2\2\29:\7H\2\2:;\7T\2\2;<\7Q\2\2<B\7O\2\2=>\7h\2\2>?\7t\2\2?@\7q"+
		"\2\2@B\7o\2\2A9\3\2\2\2A=\3\2\2\2B\b\3\2\2\2CD\7Y\2\2DE\7J\2\2EF\7G\2"+
		"\2FG\7T\2\2GN\7G\2\2HI\7y\2\2IJ\7j\2\2JK\7g\2\2KL\7t\2\2LN\7g\2\2MC\3"+
		"\2\2\2MH\3\2\2\2N\n\3\2\2\2OP\7C\2\2PQ\7P\2\2QV\7F\2\2RS\7c\2\2ST\7p\2"+
		"\2TV\7f\2\2UO\3\2\2\2UR\3\2\2\2V\f\3\2\2\2WX\7Q\2\2X\\\7T\2\2YZ\7q\2\2"+
		"Z\\\7t\2\2[W\3\2\2\2[Y\3\2\2\2\\\16\3\2\2\2]^\7,\2\2^\20\3\2\2\2_`\7?"+
		"\2\2`\22\3\2\2\2ac\t\2\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2e\24"+
		"\3\2\2\2fh\t\3\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\26\3\2\2\2"+
		"kl\7.\2\2lm\3\2\2\2mn\b\f\2\2n\30\3\2\2\2op\7=\2\2pq\3\2\2\2qr\b\r\2\2"+
		"r\32\3\2\2\2su\t\4\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2"+
		"\2xy\b\16\2\2y\34\3\2\2\2\f\2)\67AMU[div\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}