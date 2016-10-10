package com.kunalanand.ksql;

import org.junit.Assert;
import org.junit.Test;

public class IntelligenceTest {
    @Test
    public void testWildcardQuery() {
        String sql = "SELECT * FROM users";
        Intelligence intelligence = Intelligence.build( sql );
        Assert.assertEquals( StatementType.SELECT, intelligence.getStatementType() );
        Assert.assertEquals( 1, intelligence.getColumns().size() );
        Assert.assertTrue( intelligence.getColumns().contains( "*" ) );
        Assert.assertEquals( "users", intelligence.getTable() );
    }

    @Test
    public void testSingleColumnQuery() {
        String sql = "SELECT username FROM users";
        Intelligence intelligence = Intelligence.build( sql );
        Assert.assertEquals( StatementType.SELECT, intelligence.getStatementType() );
        Assert.assertEquals( 1, intelligence.getColumns().size() );
        Assert.assertTrue( intelligence.getColumns().contains( "username" ) );
        Assert.assertEquals( "users", intelligence.getTable() );
    }

    @Test
    public void testMultiColumnQuery() {
        String sql = "SELECT username, password FROM users";
        Intelligence intelligence = Intelligence.build( sql );
        Assert.assertEquals( StatementType.SELECT, intelligence.getStatementType() );
        Assert.assertEquals( 2, intelligence.getColumns().size() );
        Assert.assertTrue( intelligence.getColumns().contains( "username" ) );
        Assert.assertTrue( intelligence.getColumns().contains( "password" ) );
        Assert.assertEquals( "users", intelligence.getTable() );
    }

    @Test
    public void testDynamicComparison() {
        String sql = "SELECT username, password FROM users WHERE id=1";
        Intelligence intelligence = Intelligence.build( sql );
        Assert.assertEquals( StatementType.SELECT, intelligence.getStatementType() );
        Assert.assertEquals( 2, intelligence.getColumns().size() );
        Assert.assertTrue( intelligence.getColumns().contains( "username" ) );
        Assert.assertTrue( intelligence.getColumns().contains( "password" ) );
        Assert.assertEquals( "users", intelligence.getTable() );
        Assert.assertEquals( "id", intelligence.getDynamicColumn() );
        Assert.assertEquals( "1", intelligence.getDynamicValue().getText() );
    }

    @Test
    public void testStaticComparison() {
        String sql = "SELECT username, password FROM users WHERE 1=1";
        Intelligence intelligence = Intelligence.build( sql );
        Assert.assertEquals( StatementType.SELECT, intelligence.getStatementType() );
        Assert.assertEquals( 2, intelligence.getColumns().size() );
        Assert.assertTrue( intelligence.getColumns().contains( "username" ) );
        Assert.assertTrue( intelligence.getColumns().contains( "password" ) );
        Assert.assertEquals( "users", intelligence.getTable() );
        Assert.assertEquals( "1", intelligence.getStaticValue1().getText() );
        Assert.assertEquals( "1", intelligence.getStaticValue2().getText() );
    }

    @Test
    public void testDelete() {
        String sql = "DELETE FROM users";
        Intelligence intelligence = Intelligence.build( sql );
        Assert.assertEquals( StatementType.DELETE, intelligence.getStatementType() );
        Assert.assertEquals( "users", intelligence.getTable() );
    }
}
