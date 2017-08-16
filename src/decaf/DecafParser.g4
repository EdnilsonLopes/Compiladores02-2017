parser grammar DecafParser;

options
{
  language=Java;
  tokenVocab=DecafLexer;
}

program: TK_class ID LCURLY RCURLY EOF;
