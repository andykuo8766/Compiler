lexer grammar mylexer;

options {
  language = Java;
}

/*----------------------*/
/*   Reserved Keywords  */
/*----------------------*/
INCLUDE_STDIO	: '#include';
HEADER_FILE : '<'(LETTER)+'.h>';
DEFINE : '#define';
INT_TYPE  : 'int';
CHAR_TYPE : 'char';
POINTER_F : '*'(LETTER)(LETTER | DIGIT)+;
POINTER_B : (LETTER)(LETTER | DIGIT)+'*';
VOID_TYPE : 'void';
FLOAT_TYPE: 'float'; 
/*----------------------*/
/*         Struct       */
/*----------------------*/
STRUCT : 'struct';



/*----------------------*/
/*         Loop         */
/*----------------------*/
WHILE_    			: 'while';
FOR_	  			: 'for';

/*----------------------*/
/*       If_Switch     */
/*----------------------*/
SWITCH_				: 'switch';
CASE_				: 'case';
DEFAULT_			: 'default';
BREAK_				: 'break';
IF_ :'if';
ELSE_: 'else';

/*----------------------*/
/*  Compound Operators  */
/*----------------------*/
INPUT : '&';
ASSIGN : '=';
POINT_TO : '->';
ADD_OP	: '+';
SUB_OP	: '-';
MUL_OP  : '*';
DIV_OP	: '/';
PERCENTAGE : '%';
BIG_OP : '>';
SMALL_OP : '<';
EQ_OP : '==';
LE_OP : '<=';
GE_OP : '>=';
NE_OP : '!=';
PP_OP : '++';
MM_OP : '--'; 
RSHIFT_OP : '<<';
LSHIFT_OP : '>>';
COMMA : ',';
SEMICOLON : ';';
COLON : ':';
L_S_SHAVING : '(';
R_S_SHAVING : ')';
L_M_SHAVING : '[';
R_M_SHAVING : ']';
L_B_SHAVING : '{';
R_B_SHAVING : '}';

/* Comments */
COMMENT1 : '//'(.)*'\n';
COMMENT2 : '/*' (options{greedy=false;}: .)* '*/';

END_OF_STRING : '\'\\0\'';

DEC_NUM : ('0' | ('1'..'9')(DIGIT)*);

ID : (LETTER)(LETTER | DIGIT)*;

FLOAT_NUM: FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3;
fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;
fragment FLOAT_NUM3: (DIGIT)+;
 




NEW_LINE: '\n';

fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';


WS  : (' '|'\r'|'\t')+
    ;

CHAR:  '\'' ( . ) '\''
    ;


STRING
    :  '\"' ( .)+ '\"'
    ;
