grammar myInterp;


options {
   language = Java;
}


@header {
import java.math.*;  
import java.io.*;
import java.lang.*;
import java.util.HashMap;
import java.util.Scanner;
}

@members {
 boolean TRACEON =false;
/** Map variable name to Integer object holding value */
HashMap memory = new HashMap();
/** Map variable name to float object holding value */
HashMap fmemory = new HashMap();
}

prog:  VOID MAIN '(' ')'  '{' statements[1]'}' {if (TRACEON) System.out.println("VOID MAIN () {declarations statements}");};
      

statements[int flag]
		:statement[flag] statements[flag]
        | 
		;


	
logic_expression returns [int value]
	: a=arith_expression {if($a.fvalue == 0)$value = 0; else $value = 1;}
        (   '>' b=arith_expression{if($a.fvalue > $b.fvalue)$value = 1; else $value = 0;}
        |   '<' c=arith_expression { if($a.fvalue < $c.fvalue)$value = 1; else $value = 0;}
		|   '>=' d=arith_expression{if($a.fvalue >= $d.fvalue)$value = 1; else $value = 0;}
		|   '<=' e=arith_expression{if($a.fvalue <= $e.fvalue)$value = 1; else $value = 0;}
		|   '==' f=arith_expression{if($a.fvalue == $f.fvalue)$value = 1; else $value = 0;}
		|   '!=' g=arith_expression{if($a.fvalue != $g.fvalue)$value = 1; else $value = 0;}		
        )*
	;		
	
arith_expression returns [int value , float fvalue]
    :   a=multExpr { $fvalue = $a.fvalue;}
        (   '+' b=multExpr { $fvalue += $b.fvalue;}
        |   '-' c=multExpr {  $fvalue -= $c.fvalue;}
        )*
    ;
multExpr returns [int value, float fvalue]
    :   a=atom { $fvalue = $a.fvalue;}
        (   '*' b=atom {$fvalue *= $b.fvalue;} 
        |   '/' c=atom { $fvalue /= $c.fvalue;}
        )*
    ;		
	
statement [int flag]
	:    if_statement 
	|   printf_statement
	|   scanf_statement 
	|   arith_expression  {System.out.println($arith_expression.value);}
    |   (type)* ID ( '=' arith_expression)* ';'  
        {
			 if (TRACEON)System.out.println($arith_expression.value);
			 if (TRACEON)System.out.println($arith_expression.fvalue);
			BigDecimal b = new BigDecimal($arith_expression.fvalue); 
			float f1 = b.setScale(6, BigDecimal.ROUND_HALF_UP).floatValue();
			
			if(flag == 1)fmemory.put($ID.text, f1);
		
		}
    |    WS
    ;

type:INT { if (TRACEON) System.out.println("type: INT"); }
   | FLOAT {if (TRACEON) System.out.println("type: FLOAT"); }
	;

printf_statement
		: PRINTF '('(STRING_LITERAL)+ (',' ID)* ')' ';'  
		{
			if (TRACEON) System.out.println("printf() statement "); 
			String text = $STRING_LITERAL.text;
			char c = text.charAt(3);
			int newline = text.indexOf("\\n");
			int newint= text.indexOf("\%d");
			int newfloat = text.indexOf("\%f");
			//System.out.print(newfloat);
			if(newfloat > -1){
				//System.out.println("float");
				if(newline == -1){
					for(int i = 1; i < text.length() -1; i++) {
						c = text.charAt(i);
						System.out.print(c);
					}
				}
				else{
					for(int i = 1; i < newfloat  ; i++) {
						c = text.charAt(i);
						System.out.print(c);
					}
					float f = (float)fmemory.get($ID.text);
					BigDecimal b = new BigDecimal(f); 
					float f1 = b.setScale(6, BigDecimal.ROUND_HALF_UP).floatValue();
					System.out.print(f1);	
					String num = Float.toString(f1);
					int dot= num.indexOf(".");
					//System.out.print(num.length()-dot-1);	
					if((num.length()-dot-1) == 0)System.out.print("000000");	
					if((num.length()-dot-1) == 1)System.out.print("00000");	
					if((num.length()-dot-1) == 2)System.out.print("0000");	
					if((num.length()-dot-1) == 3)System.out.print("000");	
					if((num.length()-dot-1) == 4)System.out.print("00");	
					if((num.length()-dot-1) == 5)System.out.print("0");	
					if((num.length()-dot-1) == 6)System.out.print("");	

					for(int i = newfloat +2; i < newline ; i++) {
						c = text.charAt(i);
						System.out.print(c);				
					}
					System.out.print("\n");	
					for(int i = newline+2; i < text.length() -1 ; i++) {
						c = text.charAt(i);
						System.out.print(c);				
					}
					
				}
			}
			else if(newint > -1){
				//System.out.println("int");
				if(newline == -1){
					for(int i = 1; i < text.length() -1; i++) {
						c = text.charAt(i);
						System.out.print(c);
					}
				}
				else{
					for(int i = 1; i < newint  ; i++) {
						c = text.charAt(i);
						System.out.print(c);
					}
					float f = (float)fmemory.get($ID.text);
					BigDecimal b = new BigDecimal(f); 
					float f1 = b.setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
					int v = (int)f1;
					System.out.print(v);
					for(int i = newint +2; i < newline ; i++) {
						c = text.charAt(i);
						System.out.print(c);				
					}
					System.out.print("\n");	
					for(int i = newline+2; i < text.length() -1 ; i++) {
						c = text.charAt(i);
						System.out.print(c);				
					}
					
				}
			}
			else{
				if(newline == -1){
					for(int i = 1; i < text.length() -1; i++) {
						c = text.charAt(i);
						System.out.print(c);
					}
				}
				else{
					for(int i = 1; i < newline ; i++) {
						c = text.charAt(i);
						System.out.print(c);
					}
					
					for(int i = newline+2; i < text.length() -1 ; i++) {
						c = text.charAt(i);
						System.out.print(c);				
						
					}
					System.out.print("\n");	
				}
			}
		}	
		;
scanf_statement
		: SCANF '('(STRING_LITERAL)+ (',' (a=ID|'&'b=ID))*     ')' ';' 
		{ 
		  if (TRACEON) System.out.println("scanf() statement "); 	
		  if (TRACEON)System.out.println($STRING_LITERAL.text);
		  Scanner scanner = new Scanner(System.in);
		  float f = scanner.nextFloat();
		  fmemory.put($b.text, f);

	    }	
		;
		

				  
if_statement
		: if_then_statements  if_else_statements [$if_then_statements.exec_flag] 
		;
		
		
if_then_statements returns  [int exec_flag]
		:  IF '(' logic_expression ')' block_statement [$logic_expression.value]  
		{
			if($logic_expression.value == 1){
				$exec_flag = 0; 	
			}
			else if($logic_expression.value == 0) {
				$exec_flag = 1;  	
			}
			
		}
		;
if_else_statements [int flag]
		: ELSE block_statement [flag] 
		| 
		;
		
block_statement [int flag]
		:  '{' statements[flag] '}'  
		;
		
		





atom returns [int value, float fvalue]
    :   Integer_constant {$fvalue = Float.parseFloat($Integer_constant.text);}
	|	Floating_point_constant   {$fvalue = Float.parseFloat($Floating_point_constant.text);}
    |   ID
        {
		float f = (float)fmemory.get($ID.text);
		if (fmemory.get($ID.text) != null) $fvalue = f;
        }
    |   '(' arith_expression')' {$fvalue = $arith_expression.fvalue;}
    ;
	

	

	
/* description of the tokens */	


IF: 'if';
ELSE: 'else';
INT:'int';
FLOAT:'float';
MAIN: 'main';
VOID: 'void';
PRINTF: 'printf';
SCANF: 'scanf';

STRING_LITERAL
    :   '"' ( EscapeSequence | ~('\\'|'"') )* '"'
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
	

ID  :   ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

Integer_constant:'0'..'9'+;
Floating_point_constant:'0'..'9'+ '.' '0'..'9'+;
WS  :   (' '|'\r'|'\t'|'\u000C'|'\n')+ {skip();} ;
