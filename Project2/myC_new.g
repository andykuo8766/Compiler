grammar myC_new;

options {
   language = Java;
}

@header {
    // import packages here.
}

@members {
    boolean TRACEON = true;
}

program:VOID MAIN '(' ')' '{' declarations statements '}'
        {if (TRACEON) System.out.println("VOID MAIN () {declarations statements}");};

declarations:type Identifier('=' arith_expression)* ';' declarations
             { if (TRACEON) System.out.println("declarations: type Identifier : declarations"); }
           | { if (TRACEON) System.out.println("declarations: ");} ;

type:INT { if (TRACEON) System.out.println("type: INT"); }
   | FLOAT {if (TRACEON) System.out.println("type: FLOAT"); }
   | CHAR {if (TRACEON) System.out.println("type: CHAR"); }
   | DOUBLE {if (TRACEON) System.out.println("type: DOUBLE"); };
   


statements:statement statements
        |;

arith_expression: multExpr
                  ( '+' multExpr
				  | '-' multExpr
				  )*
                  ;

multExpr: signExpr
          ( '*' signExpr
          | '/' signExpr
		  )*
		  ;

signExpr: primaryExpr
        | '-' primaryExpr
		;
		  
primaryExpr: Integer_constant
           | Floating_point_constant
           | Identifier
		   | '(' arith_expression ')'
           ;

 
 
statement: Identifier '=' arith_expression ';' { if (TRACEON) System.out.println("assign : Identifier = arith_expression "); }
		 |  if_statement
		 |  for_statement
		 |  while_statement
		 | do_while_statement
		 | switch_statement
		 | PRINTF '('(STRING_LITERAL)+ (',' Identifier)* ')' ';' { if (TRACEON) System.out.println("printf() statement "); }		 
		 ;
		 

if_then_statements: statement
                  | '{' statements '}'
				  ;


if_statement
		: IF '(' logical_or_expression ')' if_then_statements { if (TRACEON) System.out.println("if() statement "); }
		|ELSE if_then_statements { if (TRACEON) System.out.println("else() statement "); }
		;
		
		
for_statement
		: FOR '('  Identifier '='  Integer_constant ';'  logical_or_expression  ';'   ( for_expression  )+   ')'  if_then_statements  { if (TRACEON) System.out.println("for() statement "); }
		;

for_expression
		: Identifier '++'
		| Identifier '--'
		;
				  
				  
while_statement
		: WHILE '(' logical_or_expression  ')' if_then_statements  { if (TRACEON) System.out.println("while() statement "); }
		;	

switch_statement 
		: SWITCH '('  Identifier  ')'  '{'   (case_statement)*   '}' { if (TRACEON) System.out.println("switch() statement "); }
		;
case_statement 
		: CASE Identifier ':' if_then_statements  BREAK  ';'  { if (TRACEON) System.out.println("switch-case() statement "); }
		| DEFAULT  ':' if_then_statements{ if (TRACEON) System.out.println("switch-default() statement "); }
		;

		
do_while_statement
		: DO if_then_statements WHILE '(' logical_or_expression  ')' ';' { if (TRACEON) System.out.println("do-while() statement "); }
		;
logical_or_expression
	: logical_and_expression ('||' logical_and_expression)*
	;

logical_and_expression
	: inclusive_or_expression ('&&' inclusive_or_expression)*
	;

inclusive_or_expression
	: exclusive_or_expression ('|' exclusive_or_expression)*
	;

exclusive_or_expression
	: and_expression ('^' and_expression)*
	;

and_expression
	: equality_expression ('&' equality_expression)*
	;
equality_expression
	: relational_expression (('=='|'!=') relational_expression)*
	;

relational_expression
	: shift_expression (('<'|'>'|'<='|'>=') shift_expression)*
	;

shift_expression
	: arith_expression (('<<'|'>>') arith_expression)*
	;
	
	
/* description of the tokens */


IF			 		: 'if';
ELSE			: 'else';
FOR				:'for';
WHILE 			: 'while';
SWITCH		:'switch';
CASE 			: 'case';
BREAK			: 'break';
DEFAULT		: 'default';
DO               : 'do';




FLOAT:'float';
INT:'int';
CHAR:'char';
DOUBLE: 'double';
MAIN: 'main';
VOID: 'void';

PRINTF: 'printf';

STRING_LITERAL
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;
fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   OctalEscape
    ;

fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;


Identifier:('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
Integer_constant:'0'..'9'+;
Floating_point_constant:'0'..'9'+ '.' '0'..'9'+;

WS:( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};
COMMENT:'/*' .* '*/' {$channel=HIDDEN;};

