lexer grammar BasicLexer;

//operators

SEMICOLON: ';';

COMMA: ',';
WS :  ( ' ' | '\t' | '\r' | '\n') -> channel(HIDDEN);
COMMENT: HASH ~[\r\n]* -> channel(HIDDEN);
fragment HASH: '#';
OPEN_PARENTHESES : '(' ;
CLOSE_PARENTHESES : ')' ;
fragment DIGIT : '0'..'9' ; 
ASSIGN: '=';
BEGIN: 'begin';
END: 'end';
IS: 'is';
SKIP: 'skip';
RETURN : 'return';
READ: 'read';
FREE: 'free';
EXIT: 'exit';
PRINT: 'print';
PRINTLN: 'println';
IF: 'if';
THEN: 'then';
ELSE: 'else';
FI: 'fi';
WHILE: 'while';
DO: 'do';
DONE: 'done';
NEWPAIR: 'newpair';
CALL: 'call';
FST: 'fst';
SND: 'snd';
INT: 'int';
BOOL: 'bool';
CHAR: 'char';
STRING: 'string';
PAIR: 'pair';
LSBRACKET : '[';
RSBRACKET : ']';
fragment UNDERSCORE: '_';
fragment UPPERCASE: 'A'..'Z';
fragment LOWERCASE: 'a'..'z';

CHARLITERAL: '\'' CHARACTER '\'';

 MUL: '*' | '* ';
 DIV: '/'| '/ ';
MOD: '%'| '% ' ;
 PLUS: '+' | '+ ';
 MINUS: '-'| '- ';
GREATER: '>'| '> ';
GREATEREQU: '>='| '>= ';
LESS: '<'| '< ';
LESSEQU: '<='| '<= ';
EQUAL: '=='| '== ';
NOTEQUAL: '!='| '!= ';
AND: '&&'| '&& ';
OR: '||'| '|| ';

fragment CHARACTER: ~[\\\'"]* | '\\' ESCAPECHARACTER;

STRLITERAL:  '"' ( EscapeSequence | ~[\\"]  )* '"';

fragment HexDigit : [0-9a-fA-F] ;

fragment EscapeSequence:   '\\' [btnfr"'\\]
    |   UnicodeEscape
    |   OctalEscape;

fragment OctalEscape:   '\\' [0-3] [0-7] [0-7]
    |   '\\' [0-7] [0-7]
    |   '\\' [0-7];

fragment UnicodeEscape:   '\\' 'u' HexDigit HexDigit HexDigit HexDigit;


POSITIVEINTLITERAL: '+'?DIGIT+;
JUSTINTLITERAL: DIGIT+;
fragment NOT: '!'|'! ';
NOTNEGUNARYOPER: NOT|LENGTH|ORDER|TOCHAR;
fragment LENGTH: 'len' |'len ';
fragment ORDER: 'ord' |'ord ';
fragment TOCHAR: 'chr'|'chr ';

TRUE: 'true';
FALSE: 'false';

NULL: 'null';

IDENT: (UNDERSCORE|UPPERCASE|LOWERCASE)(UNDERSCORE|UPPERCASE|LOWERCASE|DIGIT)*;
ESCAPECHARACTER: '0'|'b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\';