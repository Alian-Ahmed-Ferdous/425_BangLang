grammar banglang;

// Parser rules
program : statement+;

statement : assignment
          | ifStatement
          | whileLoop
          ;

assignment : variable ASSIGN expression ';';

variable : dataType ID;

dataType : INT
         | FLOAT
         | BOOL
         | STRING
         ;

expression : constant #constantExpression
           | ID #indentiferExpression
           | '(' expression ')' #bracketExpression
           | expression multipleOperation expression #multipleExpression
           | expression addOperation expression #addExpression
           | expression conditionOperation expression #conditionExpression
           | expression booleanOperation expression #booleanExpression
           ;

constant: INT_LITERAL | FLOAT_LITERAL | BOOL_LITERAL | STRING_LITERAL | NULL;

multipleOperation: MULTIPLY | DIVIDE;

addOperation: PLUS | MINUS;

conditionOperation: EQUAL | NOT_EQUAL | LESS | LESS_EQUAL | GREATER | GREATER_EQUAL;

booleanOperation: AND | OR;

ifStatement : IF expression THEN '{' statement '}' (ELSE ifelseStatement)?;

ifelseStatement : THEN '{' statement '}' | ifStatement;

whileLoop : WHILE expression THEN '{' statement '}';

// Lexer rules
IF : '\u098F\u09AF\u09A6\u09BF';
ELSE : '\u098F\u09AF\u09A6\u09C7';
THEN : '\u09A4\u09BE\u09B9\u09B2\u09C7';
WHILE : '\u09AF\u0995\u09A8';

INT : '\u0987\u09A8\u099F';
FLOAT : '\u09A6\u09B6\u09AE\u09BF\u0995';
BOOL : '\u09AC\u09CB\u09B2';
STRING : '\u09AC\u09BE\u0995';

PLUS : '+';
MINUS : '-';
MULTIPLY : '*';
DIVIDE : '/';

LESS : '<';
GREATER : '>';
EQUAL : '==';
NOT_EQUAL : '!=';
LESS_EQUAL : '<=';
GREATER_EQUAL : '>=';

AND : '\u0983\u0983';
OR : '\u09AC\u09BE';

ASSIGN : '=';

fragment BANGLA_LETTER: [\u0985-\u098C\u098F-\u099D\u099F-\u09B9\u09BE-\u09CC\u09CE\u09DC-\u09E3\u09E6-\u09EF];
fragment BANGLA_DIGIT: [\u09E6-\u09EF];

ID: BANGLA_LETTER (BANGLA_LETTER | BANGLA_DIGIT)*;
INT_LITERAL : [0-9]+;
FLOAT_LITERAL :  [0-9]+ '.' [0-9]+;
BOOL_LITERAL : '\u09B8\u09A4\u09AF' | '\u09AE\u09BF\u09A5\u09CD\u09AF\u09BE';
STRING_LITERAL : '"' ~[\r\n]* '"';
NULL : 'null';
WS : [ \t\r\n]+ -> skip;
