grammar Drink;

// Parser Rules

barConversation : drinkSentence EOL barTenderReply? ;

drinkSentence : ARTICLE? DRINKING_VESSEL OF drink ;

barTenderReply : REPLY titulation ;

titulation : TEXT ;

drink : TEXT;

// Lexer Rules

EOL : '\n' ;
REPLY : 'yes' | 'no' ;

ARTICLE : 'the' | 'an' | 'a' ;

OF : 'of' ;

DRINKING_VESSEL : 'cup' | 'pint' | 'shot' | 'mug' | 'glass' ;

TEXT : ('a'..'z')+ ;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;