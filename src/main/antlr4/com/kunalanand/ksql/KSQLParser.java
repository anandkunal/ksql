// Generated from KSQL.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, DELETE=2, FROM=3, WHERE=4, AND=5, OR=6, STAR=7, EQ=8, ID=9, 
		INT=10, COMMA=11, SEMICOLON=12, WS=13;
	public static final int
		RULE_expr = 0, RULE_deleteExpr = 1, RULE_selectExpr = 2, RULE_columnList = 3, 
		RULE_columnName = 4, RULE_whereExpr = 5, RULE_dynamicComparison = 6, RULE_staticComparison = 7, 
		RULE_wildcard = 8, RULE_tableName = 9;
	public static final String[] ruleNames = {
		"expr", "deleteExpr", "selectExpr", "columnList", "columnName", "whereExpr", 
		"dynamicComparison", "staticComparison", "wildcard", "tableName"
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

	@Override
	public String getGrammarFileName() { return "KSQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExprContext extends ParserRuleContext {
		public SelectExprContext selectExpr() {
			return getRuleContext(SelectExprContext.class,0);
		}
		public DeleteExprContext deleteExpr() {
			return getRuleContext(DeleteExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSQLListener ) ((KSQLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSQLListener ) ((KSQLListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			setState(22);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				selectExpr();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				deleteExpr();
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

	public static class DeleteExprContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(KSQLParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(KSQLParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public DeleteExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSQLListener ) ((KSQLListener)listener).enterDeleteExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSQLListener ) ((KSQLListener)listener).exitDeleteExpr(this);
		}
	}

	public final DeleteExprContext deleteExpr() throws RecognitionException {
		DeleteExprContext _localctx = new DeleteExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_deleteExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(DELETE);
			setState(25);
			match(FROM);
			setState(26);
			tableName();
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

	public static class SelectExprContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(KSQLParser.SELECT, 0); }
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(KSQLParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(KSQLParser.WHERE, 0); }
		public WhereExprContext whereExpr() {
			return getRuleContext(WhereExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(KSQLParser.SEMICOLON, 0); }
		public SelectExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSQLListener ) ((KSQLListener)listener).enterSelectExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSQLListener ) ((KSQLListener)listener).exitSelectExpr(this);
		}
	}

	public final SelectExprContext selectExpr() throws RecognitionException {
		SelectExprContext _localctx = new SelectExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(SELECT);
			setState(29);
			columnList();
			setState(30);
			match(FROM);
			setState(31);
			tableName();
			setState(34);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(32);
				match(WHERE);
				setState(33);
				whereExpr();
				}
			}

			setState(37);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(36);
				match(SEMICOLON);
				}
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

	public static class ColumnListContext extends ParserRuleContext {
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KSQLParser.COMMA, i);
		}
		public ColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSQLListener ) ((KSQLListener)listener).enterColumnList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSQLListener ) ((KSQLListener)listener).exitColumnList(this);
		}
	}

	public final ColumnListContext columnList() throws RecognitionException {
		ColumnListContext _localctx = new ColumnListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_columnList);
		int _la;
		try {
			setState(48);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				wildcard();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				columnName();
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(41);
					match(COMMA);
					setState(42);
					columnName();
					}
					}
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ColumnNameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(KSQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(KSQLParser.ID, i);
		}
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSQLListener ) ((KSQLListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSQLListener ) ((KSQLListener)listener).exitColumnName(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_columnName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(ID);
			setState(52);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(51);
				match(ID);
				}
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

	public static class WhereExprContext extends ParserRuleContext {
		public DynamicComparisonContext dynamicComparison() {
			return getRuleContext(DynamicComparisonContext.class,0);
		}
		public StaticComparisonContext staticComparison() {
			return getRuleContext(StaticComparisonContext.class,0);
		}
		public WhereExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSQLListener ) ((KSQLListener)listener).enterWhereExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSQLListener ) ((KSQLListener)listener).exitWhereExpr(this);
		}
	}

	public final WhereExprContext whereExpr() throws RecognitionException {
		WhereExprContext _localctx = new WhereExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whereExpr);
		try {
			setState(56);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				dynamicComparison();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				staticComparison();
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

	public static class DynamicComparisonContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KSQLParser.ID, 0); }
		public TerminalNode EQ() { return getToken(KSQLParser.EQ, 0); }
		public TerminalNode INT() { return getToken(KSQLParser.INT, 0); }
		public DynamicComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicComparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSQLListener ) ((KSQLListener)listener).enterDynamicComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSQLListener ) ((KSQLListener)listener).exitDynamicComparison(this);
		}
	}

	public final DynamicComparisonContext dynamicComparison() throws RecognitionException {
		DynamicComparisonContext _localctx = new DynamicComparisonContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dynamicComparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(ID);
			setState(59);
			match(EQ);
			setState(60);
			match(INT);
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

	public static class StaticComparisonContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(KSQLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(KSQLParser.INT, i);
		}
		public TerminalNode EQ() { return getToken(KSQLParser.EQ, 0); }
		public StaticComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticComparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSQLListener ) ((KSQLListener)listener).enterStaticComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSQLListener ) ((KSQLListener)listener).exitStaticComparison(this);
		}
	}

	public final StaticComparisonContext staticComparison() throws RecognitionException {
		StaticComparisonContext _localctx = new StaticComparisonContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_staticComparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(INT);
			setState(63);
			match(EQ);
			setState(64);
			match(INT);
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

	public static class WildcardContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(KSQLParser.STAR, 0); }
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSQLListener ) ((KSQLListener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSQLListener ) ((KSQLListener)listener).exitWildcard(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_wildcard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(STAR);
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

	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KSQLParser.ID, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KSQLListener ) ((KSQLListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KSQLListener ) ((KSQLListener)listener).exitTableName(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ID);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17I\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\5\2\31\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4%\n\4\3\4"+
		"\5\4(\n\4\3\5\3\5\3\5\3\5\7\5.\n\5\f\5\16\5\61\13\5\5\5\63\n\5\3\6\3\6"+
		"\5\6\67\n\6\3\7\3\7\5\7;\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2E\2\30\3\2\2\2\4\32\3\2"+
		"\2\2\6\36\3\2\2\2\b\62\3\2\2\2\n\64\3\2\2\2\f:\3\2\2\2\16<\3\2\2\2\20"+
		"@\3\2\2\2\22D\3\2\2\2\24F\3\2\2\2\26\31\5\6\4\2\27\31\5\4\3\2\30\26\3"+
		"\2\2\2\30\27\3\2\2\2\31\3\3\2\2\2\32\33\7\4\2\2\33\34\7\5\2\2\34\35\5"+
		"\24\13\2\35\5\3\2\2\2\36\37\7\3\2\2\37 \5\b\5\2 !\7\5\2\2!$\5\24\13\2"+
		"\"#\7\6\2\2#%\5\f\7\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&(\7\16\2\2\'&\3"+
		"\2\2\2\'(\3\2\2\2(\7\3\2\2\2)\63\5\22\n\2*/\5\n\6\2+,\7\r\2\2,.\5\n\6"+
		"\2-+\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\63\3\2\2\2\61/\3\2\2"+
		"\2\62)\3\2\2\2\62*\3\2\2\2\63\t\3\2\2\2\64\66\7\13\2\2\65\67\7\13\2\2"+
		"\66\65\3\2\2\2\66\67\3\2\2\2\67\13\3\2\2\28;\5\16\b\29;\5\20\t\2:8\3\2"+
		"\2\2:9\3\2\2\2;\r\3\2\2\2<=\7\13\2\2=>\7\n\2\2>?\7\f\2\2?\17\3\2\2\2@"+
		"A\7\f\2\2AB\7\n\2\2BC\7\f\2\2C\21\3\2\2\2DE\7\t\2\2E\23\3\2\2\2FG\7\13"+
		"\2\2G\25\3\2\2\2\t\30$\'/\62\66:";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}