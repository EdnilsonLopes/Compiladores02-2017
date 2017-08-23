parser grammar DecafParser;

<<<<<<< HEAD
@header {
package decaf;
}

=======
>>>>>>> 3a3bbef0c9cd090694cf5061dea9d9e857f1cac7
options
{
  language=Java;
  tokenVocab=DecafLexer;
}

program: TK_class ID LCURLY RCURLY EOF;
