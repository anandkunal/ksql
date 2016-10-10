// Generated from KSQL.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KSQLParser}.
 */
public interface KSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(KSQLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(KSQLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSQLParser#deleteExpr}.
	 * @param ctx the parse tree
	 */
	void enterDeleteExpr(KSQLParser.DeleteExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSQLParser#deleteExpr}.
	 * @param ctx the parse tree
	 */
	void exitDeleteExpr(KSQLParser.DeleteExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSQLParser#selectExpr}.
	 * @param ctx the parse tree
	 */
	void enterSelectExpr(KSQLParser.SelectExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSQLParser#selectExpr}.
	 * @param ctx the parse tree
	 */
	void exitSelectExpr(KSQLParser.SelectExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSQLParser#columnList}.
	 * @param ctx the parse tree
	 */
	void enterColumnList(KSQLParser.ColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSQLParser#columnList}.
	 * @param ctx the parse tree
	 */
	void exitColumnList(KSQLParser.ColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSQLParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(KSQLParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSQLParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(KSQLParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSQLParser#whereExpr}.
	 * @param ctx the parse tree
	 */
	void enterWhereExpr(KSQLParser.WhereExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSQLParser#whereExpr}.
	 * @param ctx the parse tree
	 */
	void exitWhereExpr(KSQLParser.WhereExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSQLParser#dynamicComparison}.
	 * @param ctx the parse tree
	 */
	void enterDynamicComparison(KSQLParser.DynamicComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSQLParser#dynamicComparison}.
	 * @param ctx the parse tree
	 */
	void exitDynamicComparison(KSQLParser.DynamicComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSQLParser#staticComparison}.
	 * @param ctx the parse tree
	 */
	void enterStaticComparison(KSQLParser.StaticComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSQLParser#staticComparison}.
	 * @param ctx the parse tree
	 */
	void exitStaticComparison(KSQLParser.StaticComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSQLParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(KSQLParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSQLParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(KSQLParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(KSQLParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(KSQLParser.TableNameContext ctx);
}