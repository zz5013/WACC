parser grammar BasicParser;

options {
  tokenVocab=BasicLexer;
}

// EOF indicates that the program must consume to the end of the input.
prog: BEGIN (function*) statement END EOF;

function: type IDENT OPEN_PARENTHESES (parameterList)? CLOSE_PARENTHESES IS statement END;

parameterList: parameter (COMMA parameter)*;

parameter: type IDENT;

type: baseType #basetype
       |arrayType #arraytype
       |pairType #pairtype
       ;

baseType: INT
       | BOOL
       | CHAR
       | STRING
       ;

arrayType: baseType LSBRACKET RSBRACKET #baseTypeArray
          |arrayType LSBRACKET RSBRACKET #nestedArray
          |pairType LSBRACKET RSBRACKET #pairTypeArray
          ;

pairType: PAIR OPEN_PARENTHESES pairElemType COMMA pairElemType CLOSE_PARENTHESES;

pairElemType: baseType #pairbaseType
             | arrayType #pairArrayType
             | PAIR #pair
             ;

statement: SKIP #skip
       | type IDENT ASSIGN assignrhs # declare
       | assignlhs ASSIGN assignrhs # assign
       | READ assignlhs # read
       | FREE expression # free
       | EXIT expression # exit
       | PRINT expression # print
     | RETURN expression #return
       | PRINTLN expression # println
       | IF expression THEN statement ELSE statement FI # ifthenelse
       | WHILE expression DO statement DONE # whiledo
       | BEGIN statement END # statementparens
       | statement SEMICOLON statement # semicolon
       ;



assignrhs: expression #assignrhsexpression
          | arrayLiteral #assignRhsArrayLiteral
          | NEWPAIR OPEN_PARENTHESES expression COMMA expression CLOSE_PARENTHESES #assignRhsNewPair
          | pairelement #assignRhsPairElem
          | CALL IDENT OPEN_PARENTHESES argumentList? CLOSE_PARENTHESES #assignRhsCall
          ;

assignlhs: IDENT #assignlhsIdent
       | arrayelement #assignLhsArrayElement
       | pairelement #assignlhsPairElement
       ;

expression:  beginNeg #expressBeginNeg
| arrayelement #expressArrayElement
          | IDENT #expressIdent
          | boolLiteral  #expressBoolLiteral
          | CHARLITERAL  #expressCharliteral
          | STRLITERAL  #expressStrliteral
          | pairLiteral  #expressPaitLiteral
          | POSITIVEINTLITERAL  #expressPositiveIntliteral
          | OPEN_PARENTHESES expression CLOSE_PARENTHESES  #expressParentheses
          | NOTNEGUNARYOPER expression #expressNotNegUnary
          | expression binaryoper1 expression #expressBinary1
          | expression binaryoper2 expression #expressBinary2      
          | expression binaryoper3 expression #expressBinary3      
          | expression binaryoper4 expression #expressBinary4      
          | expression binaryoper5 expression #expressBinary5      
          | expression binaryoper6 expression #expressBinary6      
          ;

binaryoper1 : MUL # mul
          |DIV # div
          |MOD # mod;
          
    binaryoper2 :     PLUS # plus
          |MINUS # minus;
          
    binaryoper3 :     GREATER # greater
          |GREATEREQU # ge
          |LESS # less
          |LESSEQU # le;
          
    binaryoper4 :EQUAL # equ
          |NOTEQUAL # noteq;
          
    binaryoper5 :    AND # and;
          
       binaryoper6:OR # or;

beginNeg: MINUS expression # minusexpre
          | MINUS JUSTINTLITERAL # minusjustlit
          ;

boolLiteral: TRUE
          | FALSE
          ;

pairLiteral: NULL;

argumentList: expression (COMMA expression)*;

arrayelement: IDENT (LSBRACKET expression RSBRACKET)+;

arrayLiteral: LSBRACKET (expression (COMMA expression)*)? RSBRACKET;

pairelement: FST expression # fst
          | SND expression # snd
          ;