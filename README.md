# KSQL

A minimalist SQL designed for my AppSec USA 2016 talk about LANGSEC. 

Project includes an ANTLR4 grammar and Java code.

## Install

To install this library, do the following:

```bash
git clone https://github.com/anandkunal/ksql
cd ksql
mvn clean install
```

## Example Queries

The following queries are valid KSQL:

### SELECT

```sql
SELECT * FROM users
SELECT username FROM users
SELECT username, password FROM users
SELECT username, password FROM users WHERE id=1
SELECT username, password FROM users WHERE 1=1
SELECT username, password FROM users WHERE 1=2
```

### DELETE

```sql
DELETE FROM users
```

A terminating semicolon (`;`) is optional for all of the example queries.


## Grammar Visualization

ANTLR4 ships with a lexer/parser visualization tool to guide the construction of a grammar. The following is an example command that can be run from the KSQL grammar directory:

```bash
antlr4 KSQL.g4 && javac KSQL*.java; grun KSQL expr -gui
```

As a fun test, you can run the above example queries through this visualization tool. 

## Use Cases

- Look for bad statement types
- Look for access to bad columns
- Look for access to bad tables
- Look for tautologies and contradictions
