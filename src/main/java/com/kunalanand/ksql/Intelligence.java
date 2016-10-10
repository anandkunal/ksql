package com.kunalanand.ksql;

import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Intelligence {
    private StatementType statementType;
    private String table;
    private Set<String> columns;
    private String dynamicColumn;
    private TerminalNode dynamicValue;
    private TerminalNode staticValue1;
    private TerminalNode staticValue2;

    public Intelligence() {
    }

    public static Intelligence build( String sql ) {
        // Create a lexer and parser for the input
        KSQLLexer lexer = new KSQLLexer( new ANTLRInputStream( sql ) );
        KSQLParser parser = new KSQLParser( new CommonTokenStream( lexer ) );

        // Start at the highest level: expression (expr)
        KSQLParser.ExprContext context = parser.expr();

        Intelligence intelligence = new Intelligence();

        if( context.selectExpr() != null ) {
            intelligence.setStatementType( StatementType.SELECT );
            intelligence.setTable( context.selectExpr().tableName().getText() );
            // Build up columns
            HashSet<String> columns = new HashSet<String>();
            if( context.selectExpr().columnList().wildcard() != null ) {
                columns.add( "*" );
            } else {
                for( TerminalNode columnName : context.selectExpr().columnList().columnName( 0 ).ID() ) {
                    columns.add( columnName.getText() );
                }
            }
            intelligence.setColumns( columns );
            // Where
            if( context.selectExpr().whereExpr() != null ) {
                // Static
                if( context.selectExpr().whereExpr().staticComparison() != null ) {
                    intelligence.setStaticValue1( context.selectExpr().whereExpr().staticComparison().INT( 0 ) );
                    intelligence.setStaticValue2( context.selectExpr().whereExpr().staticComparison().INT( 1 ) );
                }
                // Dynamic
                if( context.selectExpr().whereExpr().dynamicComparison() != null ) {
                    intelligence
                            .setDynamicColumn( context.selectExpr().whereExpr().dynamicComparison().ID().getText() );
                    intelligence.setDynamicValue( context.selectExpr().whereExpr().dynamicComparison().INT() );
                }
            }
        } else if( context.deleteExpr() != null ) {
            intelligence.setStatementType( StatementType.DELETE );
            intelligence.setTable( context.deleteExpr().tableName().getText() );
        }

        return intelligence;
    }

    public StatementType getStatementType() {
        return statementType;
    }

    public void setStatementType( StatementType statementType ) {
        this.statementType = statementType;
    }

    public String getTable() {
        return table;
    }

    public void setTable( String table ) {
        this.table = table;
    }

    public Set<String> getColumns() {
        return columns;
    }

    public void setColumns( Set<String> columns ) {
        this.columns = columns;
    }

    public String getDynamicColumn() {
        return dynamicColumn;
    }

    public void setDynamicColumn( String dynamicColumn ) {
        this.dynamicColumn = dynamicColumn;
    }

    public TerminalNode getDynamicValue() {
        return dynamicValue;
    }

    public void setDynamicValue( TerminalNode dynamicValue ) {
        this.dynamicValue = dynamicValue;
    }

    public TerminalNode getStaticValue1() {
        return staticValue1;
    }

    public void setStaticValue1( TerminalNode staticValue1 ) {
        this.staticValue1 = staticValue1;
    }

    public TerminalNode getStaticValue2() {
        return staticValue2;
    }

    public void setStaticValue2( TerminalNode staticValue2 ) {
        this.staticValue2 = staticValue2;
    }

    public boolean secure( Set<StatementType> badStatements, Set<String> badTables, Set<String> badColumns,
            boolean blockStaticTautologies ) {
        // Statement type
        if( badStatements.contains( statementType ) ) {
            return false;
        }
        // Table
        if( badTables.contains( table ) ) {
            return false;
        }
        // Columns
        for( String column : columns ) {
            if( badColumns.contains( column ) ) {
                return false;
            }
        }
        // Static Tautologies
        if( blockStaticTautologies && staticValue1.getText().equals( staticValue2.getText() ) ) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Intelligence{" +
                "statementType=" + statementType +
                ", table='" + table + '\'' +
                ", columns=" + columns +
                ", dynamicColumn='" + dynamicColumn + '\'' +
                ", dynamicValue=" + dynamicValue +
                ", staticValue1=" + staticValue1 +
                ", staticValue2=" + staticValue2 +
                '}';
    }
}
