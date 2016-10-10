grammar KSQL;

expr : deleteExpr | selectExpr ;

deleteExpr : DELETE FROM tableName ;
selectExpr : SELECT columnList FROM tableName (WHERE whereExpr)? (SEMICOLON)? ;

columnList : wildcard | columnName ( COMMA columnName )* ;
columnName : ID ( ID )? ;
whereExpr : dynamicComparison | staticComparison ;
dynamicComparison : ID EQ INT ;
staticComparison : INT EQ INT ;

wildcard : STAR ;
tableName : ID ;

// Keywords & Reserved
SELECT : 'SELECT' | 'select' ;
DELETE : 'DELETE' | 'delete' ;
FROM : 'FROM' | 'from' ;
WHERE : 'WHERE' | 'where' ;
AND : 'AND' | 'and' ;
OR : 'OR' | 'or' ;
STAR : '*' ;
EQ : '=' ;

// Identifiers
ID : ( 'a'..'z' | 'A'..'Z' )+ ;
INT : [0-9]+ ;

// Punctuation
COMMA : ',' -> skip ;
SEMICOLON : ';' -> skip ;
WS : [ \t\r\n]+ -> skip ;