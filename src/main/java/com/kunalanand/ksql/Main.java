package com.kunalanand.ksql;

public class Main {
    public static void main( String[] args ) throws Exception {
        String sql = "SELECT hello FROM world";
        System.out.println( Intelligence.build( sql ) );
    }
}
