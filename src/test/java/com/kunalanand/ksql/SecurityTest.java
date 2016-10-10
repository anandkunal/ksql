package com.kunalanand.ksql;

import java.util.HashSet;

import org.junit.Test;

import junit.framework.Assert;

public class SecurityTest {
    @Test
    public void testGoodStatement() {
        String sql = "SELECT * FROM users";
        Assert.assertTrue( Intelligence.build( sql )
                .secure( new HashSet<StatementType>(), new HashSet<String>(), new HashSet<String>(), false ) );
    }

    @Test
    public void testBadStatement() {
        HashSet<StatementType> badStatements = new HashSet<StatementType>();
        badStatements.add( StatementType.DELETE );

        String sql = "DELETE FROM users";
        Assert.assertFalse( Intelligence.build( sql )
                .secure( badStatements, new HashSet<String>(), new HashSet<String>(), false ) );
    }

    @Test
    public void testGoodTable() {
        String sql = "SELECT * FROM users";
        Assert.assertTrue( Intelligence.build( sql )
                .secure( new HashSet<StatementType>(), new HashSet<String>(), new HashSet<String>(), false ) );
    }

    @Test
    public void testBadTable() {
        HashSet<String> badTables = new HashSet<String>();
        badTables.add( "users" );

        String sql = "SELECT * FROM users";
        Assert.assertFalse( Intelligence.build( sql )
                .secure( new HashSet<StatementType>(), badTables, new HashSet<String>(), false ) );
    }

    @Test
    public void testGoodColumns() {
        String sql = "SELECT username, password FROM users";
        Assert.assertTrue( Intelligence.build( sql )
                .secure( new HashSet<StatementType>(), new HashSet<String>(), new HashSet<String>(), false ) );
    }

    @Test
    public void testBadColumns() {
        HashSet<String> badColumns = new HashSet<String>();
        badColumns.add( "password" );

        String sql = "SELECT username, password FROM users";
        Assert.assertFalse( Intelligence.build( sql )
                .secure( new HashSet<StatementType>(), new HashSet<String>(), badColumns, false ) );
    }

    @Test
    public void testTautologiesSafe() {
        String sql = "SELECT * FROM users WHERE 1=1";
        Assert.assertTrue( Intelligence.build( sql )
                .secure( new HashSet<StatementType>(), new HashSet<String>(), new HashSet<String>(), false ) );
    }

    @Test
    public void testTautologiesUnsafe() {
        String sql = "SELECT * FROM users WHERE 1=1";
        Assert.assertFalse( Intelligence.build( sql )
                .secure( new HashSet<StatementType>(), new HashSet<String>(), new HashSet<String>(), true ) );
    }
}
