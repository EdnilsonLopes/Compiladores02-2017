lexer grammar DecafLexer;

<<<<<<< HEAD
@header {
package decaf;
}

=======
>>>>>>> 3a3bbef0c9cd090694cf5061dea9d9e857f1cac7
options
{
  language=Java;
}

tokens
{
  TK_class
}

LCURLY : '{';
RCURLY : '}';

ID  :
<<<<<<< HEAD
  ('a'..'z''A'..'Z')+;
=======
  ('a'..'z' | 'A'..'Z')+;
>>>>>>> 3a3bbef0c9cd090694cf5061dea9d9e857f1cac7

WS_ : (' ' | '\n' ) -> skip;

SL_COMMENT : '//' (~'\n')* '\n' -> skip;

CHAR : '\'' (ESC|~'\'') '\'';
STRING : '"' (ESC|~'"')* '"';

fragment
ESC :  '\\' ('n'|'"');
