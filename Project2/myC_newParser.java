// $ANTLR 3.5.2 myC_new.g 2019-05-09 09:50:00

    // import packages here.


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myC_newParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BREAK", "CASE", "CHAR", "COMMENT", 
		"DEFAULT", "DO", "DOUBLE", "ELSE", "EscapeSequence", "FLOAT", "FOR", "Floating_point_constant", 
		"IF", "INT", "Identifier", "Integer_constant", "MAIN", "OctalEscape", 
		"PRINTF", "STRING_LITERAL", "SWITCH", "VOID", "WHILE", "WS", "'!='", "'&&'", 
		"'&'", "'('", "')'", "'*'", "'+'", "'++'", "','", "'-'", "'--'", "'/'", 
		"':'", "';'", "'<'", "'<<'", "'<='", "'='", "'=='", "'>'", "'>='", "'>>'", 
		"'^'", "'{'", "'|'", "'||'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int BREAK=4;
	public static final int CASE=5;
	public static final int CHAR=6;
	public static final int COMMENT=7;
	public static final int DEFAULT=8;
	public static final int DO=9;
	public static final int DOUBLE=10;
	public static final int ELSE=11;
	public static final int EscapeSequence=12;
	public static final int FLOAT=13;
	public static final int FOR=14;
	public static final int Floating_point_constant=15;
	public static final int IF=16;
	public static final int INT=17;
	public static final int Identifier=18;
	public static final int Integer_constant=19;
	public static final int MAIN=20;
	public static final int OctalEscape=21;
	public static final int PRINTF=22;
	public static final int STRING_LITERAL=23;
	public static final int SWITCH=24;
	public static final int VOID=25;
	public static final int WHILE=26;
	public static final int WS=27;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myC_newParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myC_newParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return myC_newParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myC_new.g"; }


	    boolean TRACEON = true;



	// $ANTLR start "program"
	// myC_new.g:15:1: program : VOID MAIN '(' ')' '{' declarations statements '}' ;
	public final void program() throws RecognitionException {
		try {
			// myC_new.g:15:8: ( VOID MAIN '(' ')' '{' declarations statements '}' )
			// myC_new.g:15:9: VOID MAIN '(' ')' '{' declarations statements '}'
			{
			match(input,VOID,FOLLOW_VOID_in_program35); 
			match(input,MAIN,FOLLOW_MAIN_in_program37); 
			match(input,31,FOLLOW_31_in_program39); 
			match(input,32,FOLLOW_32_in_program41); 
			match(input,51,FOLLOW_51_in_program43); 
			pushFollow(FOLLOW_declarations_in_program45);
			declarations();
			state._fsp--;

			pushFollow(FOLLOW_statements_in_program47);
			statements();
			state._fsp--;

			match(input,54,FOLLOW_54_in_program49); 
			if (TRACEON) System.out.println("VOID MAIN () {declarations statements}");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "declarations"
	// myC_new.g:18:1: declarations : ( type Identifier ( '=' arith_expression )* ';' declarations |);
	public final void declarations() throws RecognitionException {
		try {
			// myC_new.g:18:13: ( type Identifier ( '=' arith_expression )* ';' declarations |)
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==CHAR||LA2_0==DOUBLE||LA2_0==FLOAT||LA2_0==INT) ) {
				alt2=1;
			}
			else if ( (LA2_0==DO||LA2_0==ELSE||LA2_0==FOR||LA2_0==IF||LA2_0==Identifier||LA2_0==PRINTF||LA2_0==SWITCH||LA2_0==WHILE||LA2_0==54) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// myC_new.g:18:14: type Identifier ( '=' arith_expression )* ';' declarations
					{
					pushFollow(FOLLOW_type_in_declarations65);
					type();
					state._fsp--;

					match(input,Identifier,FOLLOW_Identifier_in_declarations67); 
					// myC_new.g:18:29: ( '=' arith_expression )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==45) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// myC_new.g:18:30: '=' arith_expression
							{
							match(input,45,FOLLOW_45_in_declarations69); 
							pushFollow(FOLLOW_arith_expression_in_declarations71);
							arith_expression();
							state._fsp--;

							}
							break;

						default :
							break loop1;
						}
					}

					match(input,41,FOLLOW_41_in_declarations75); 
					pushFollow(FOLLOW_declarations_in_declarations77);
					declarations();
					state._fsp--;

					 if (TRACEON) System.out.println("declarations: type Identifier : declarations"); 
					}
					break;
				case 2 :
					// myC_new.g:20:14: 
					{
					 if (TRACEON) System.out.println("declarations: ");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declarations"



	// $ANTLR start "type"
	// myC_new.g:22:1: type : ( INT | FLOAT | CHAR | DOUBLE );
	public final void type() throws RecognitionException {
		try {
			// myC_new.g:22:5: ( INT | FLOAT | CHAR | DOUBLE )
			int alt3=4;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt3=1;
				}
				break;
			case FLOAT:
				{
				alt3=2;
				}
				break;
			case CHAR:
				{
				alt3=3;
				}
				break;
			case DOUBLE:
				{
				alt3=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// myC_new.g:22:6: INT
					{
					match(input,INT,FOLLOW_INT_in_type114); 
					 if (TRACEON) System.out.println("type: INT"); 
					}
					break;
				case 2 :
					// myC_new.g:23:6: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type123); 
					if (TRACEON) System.out.println("type: FLOAT"); 
					}
					break;
				case 3 :
					// myC_new.g:24:6: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_type132); 
					if (TRACEON) System.out.println("type: CHAR"); 
					}
					break;
				case 4 :
					// myC_new.g:25:6: DOUBLE
					{
					match(input,DOUBLE,FOLLOW_DOUBLE_in_type141); 
					if (TRACEON) System.out.println("type: DOUBLE"); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type"



	// $ANTLR start "statements"
	// myC_new.g:29:1: statements : ( statement statements |);
	public final void statements() throws RecognitionException {
		try {
			// myC_new.g:29:11: ( statement statements |)
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==DO||LA4_0==ELSE||LA4_0==FOR||LA4_0==IF||LA4_0==Identifier||LA4_0==PRINTF||LA4_0==SWITCH||LA4_0==WHILE) ) {
				alt4=1;
			}
			else if ( (LA4_0==54) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// myC_new.g:29:12: statement statements
					{
					pushFollow(FOLLOW_statement_in_statements154);
					statement();
					state._fsp--;

					pushFollow(FOLLOW_statements_in_statements156);
					statements();
					state._fsp--;

					}
					break;
				case 2 :
					// myC_new.g:30:10: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statements"



	// $ANTLR start "arith_expression"
	// myC_new.g:32:1: arith_expression : multExpr ( '+' multExpr | '-' multExpr )* ;
	public final void arith_expression() throws RecognitionException {
		try {
			// myC_new.g:32:17: ( multExpr ( '+' multExpr | '-' multExpr )* )
			// myC_new.g:32:19: multExpr ( '+' multExpr | '-' multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_arith_expression173);
			multExpr();
			state._fsp--;

			// myC_new.g:33:19: ( '+' multExpr | '-' multExpr )*
			loop5:
			while (true) {
				int alt5=3;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==34) ) {
					alt5=1;
				}
				else if ( (LA5_0==37) ) {
					alt5=2;
				}

				switch (alt5) {
				case 1 :
					// myC_new.g:33:21: '+' multExpr
					{
					match(input,34,FOLLOW_34_in_arith_expression195); 
					pushFollow(FOLLOW_multExpr_in_arith_expression197);
					multExpr();
					state._fsp--;

					}
					break;
				case 2 :
					// myC_new.g:34:9: '-' multExpr
					{
					match(input,37,FOLLOW_37_in_arith_expression207); 
					pushFollow(FOLLOW_multExpr_in_arith_expression209);
					multExpr();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "arith_expression"



	// $ANTLR start "multExpr"
	// myC_new.g:38:1: multExpr : signExpr ( '*' signExpr | '/' signExpr )* ;
	public final void multExpr() throws RecognitionException {
		try {
			// myC_new.g:38:9: ( signExpr ( '*' signExpr | '/' signExpr )* )
			// myC_new.g:38:11: signExpr ( '*' signExpr | '/' signExpr )*
			{
			pushFollow(FOLLOW_signExpr_in_multExpr244);
			signExpr();
			state._fsp--;

			// myC_new.g:39:11: ( '*' signExpr | '/' signExpr )*
			loop6:
			while (true) {
				int alt6=3;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==33) ) {
					alt6=1;
				}
				else if ( (LA6_0==39) ) {
					alt6=2;
				}

				switch (alt6) {
				case 1 :
					// myC_new.g:39:13: '*' signExpr
					{
					match(input,33,FOLLOW_33_in_multExpr258); 
					pushFollow(FOLLOW_signExpr_in_multExpr260);
					signExpr();
					state._fsp--;

					}
					break;
				case 2 :
					// myC_new.g:40:13: '/' signExpr
					{
					match(input,39,FOLLOW_39_in_multExpr274); 
					pushFollow(FOLLOW_signExpr_in_multExpr276);
					signExpr();
					state._fsp--;

					}
					break;

				default :
					break loop6;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "signExpr"
	// myC_new.g:44:1: signExpr : ( primaryExpr | '-' primaryExpr );
	public final void signExpr() throws RecognitionException {
		try {
			// myC_new.g:44:9: ( primaryExpr | '-' primaryExpr )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==Floating_point_constant||(LA7_0 >= Identifier && LA7_0 <= Integer_constant)||LA7_0==31) ) {
				alt7=1;
			}
			else if ( (LA7_0==37) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// myC_new.g:44:11: primaryExpr
					{
					pushFollow(FOLLOW_primaryExpr_in_signExpr295);
					primaryExpr();
					state._fsp--;

					}
					break;
				case 2 :
					// myC_new.g:45:11: '-' primaryExpr
					{
					match(input,37,FOLLOW_37_in_signExpr307); 
					pushFollow(FOLLOW_primaryExpr_in_signExpr309);
					primaryExpr();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "signExpr"



	// $ANTLR start "primaryExpr"
	// myC_new.g:48:1: primaryExpr : ( Integer_constant | Floating_point_constant | Identifier | '(' arith_expression ')' );
	public final void primaryExpr() throws RecognitionException {
		try {
			// myC_new.g:48:12: ( Integer_constant | Floating_point_constant | Identifier | '(' arith_expression ')' )
			int alt8=4;
			switch ( input.LA(1) ) {
			case Integer_constant:
				{
				alt8=1;
				}
				break;
			case Floating_point_constant:
				{
				alt8=2;
				}
				break;
			case Identifier:
				{
				alt8=3;
				}
				break;
			case 31:
				{
				alt8=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// myC_new.g:48:14: Integer_constant
					{
					match(input,Integer_constant,FOLLOW_Integer_constant_in_primaryExpr323); 
					}
					break;
				case 2 :
					// myC_new.g:49:14: Floating_point_constant
					{
					match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_primaryExpr338); 
					}
					break;
				case 3 :
					// myC_new.g:50:14: Identifier
					{
					match(input,Identifier,FOLLOW_Identifier_in_primaryExpr353); 
					}
					break;
				case 4 :
					// myC_new.g:51:8: '(' arith_expression ')'
					{
					match(input,31,FOLLOW_31_in_primaryExpr362); 
					pushFollow(FOLLOW_arith_expression_in_primaryExpr364);
					arith_expression();
					state._fsp--;

					match(input,32,FOLLOW_32_in_primaryExpr366); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "primaryExpr"



	// $ANTLR start "statement"
	// myC_new.g:56:1: statement : ( Identifier '=' arith_expression ';' | if_statement | for_statement | while_statement | do_while_statement | switch_statement | PRINTF '(' ( STRING_LITERAL )+ ( ',' Identifier )* ')' ';' );
	public final void statement() throws RecognitionException {
		try {
			// myC_new.g:56:10: ( Identifier '=' arith_expression ';' | if_statement | for_statement | while_statement | do_while_statement | switch_statement | PRINTF '(' ( STRING_LITERAL )+ ( ',' Identifier )* ')' ';' )
			int alt11=7;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				alt11=1;
				}
				break;
			case ELSE:
			case IF:
				{
				alt11=2;
				}
				break;
			case FOR:
				{
				alt11=3;
				}
				break;
			case WHILE:
				{
				alt11=4;
				}
				break;
			case DO:
				{
				alt11=5;
				}
				break;
			case SWITCH:
				{
				alt11=6;
				}
				break;
			case PRINTF:
				{
				alt11=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// myC_new.g:56:12: Identifier '=' arith_expression ';'
					{
					match(input,Identifier,FOLLOW_Identifier_in_statement389); 
					match(input,45,FOLLOW_45_in_statement391); 
					pushFollow(FOLLOW_arith_expression_in_statement393);
					arith_expression();
					state._fsp--;

					match(input,41,FOLLOW_41_in_statement395); 
					 if (TRACEON) System.out.println("assign : Identifier = arith_expression "); 
					}
					break;
				case 2 :
					// myC_new.g:57:7: if_statement
					{
					pushFollow(FOLLOW_if_statement_in_statement405);
					if_statement();
					state._fsp--;

					}
					break;
				case 3 :
					// myC_new.g:58:7: for_statement
					{
					pushFollow(FOLLOW_for_statement_in_statement413);
					for_statement();
					state._fsp--;

					}
					break;
				case 4 :
					// myC_new.g:59:7: while_statement
					{
					pushFollow(FOLLOW_while_statement_in_statement421);
					while_statement();
					state._fsp--;

					}
					break;
				case 5 :
					// myC_new.g:60:6: do_while_statement
					{
					pushFollow(FOLLOW_do_while_statement_in_statement428);
					do_while_statement();
					state._fsp--;

					}
					break;
				case 6 :
					// myC_new.g:61:6: switch_statement
					{
					pushFollow(FOLLOW_switch_statement_in_statement435);
					switch_statement();
					state._fsp--;

					}
					break;
				case 7 :
					// myC_new.g:62:6: PRINTF '(' ( STRING_LITERAL )+ ( ',' Identifier )* ')' ';'
					{
					match(input,PRINTF,FOLLOW_PRINTF_in_statement442); 
					match(input,31,FOLLOW_31_in_statement444); 
					// myC_new.g:62:16: ( STRING_LITERAL )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==STRING_LITERAL) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// myC_new.g:62:17: STRING_LITERAL
							{
							match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_statement446); 
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					// myC_new.g:62:34: ( ',' Identifier )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==36) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// myC_new.g:62:35: ',' Identifier
							{
							match(input,36,FOLLOW_36_in_statement451); 
							match(input,Identifier,FOLLOW_Identifier_in_statement453); 
							}
							break;

						default :
							break loop10;
						}
					}

					match(input,32,FOLLOW_32_in_statement457); 
					match(input,41,FOLLOW_41_in_statement459); 
					 if (TRACEON) System.out.println("printf() statement "); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "if_then_statements"
	// myC_new.g:66:1: if_then_statements : ( statement | '{' statements '}' );
	public final void if_then_statements() throws RecognitionException {
		try {
			// myC_new.g:66:19: ( statement | '{' statements '}' )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==DO||LA12_0==ELSE||LA12_0==FOR||LA12_0==IF||LA12_0==Identifier||LA12_0==PRINTF||LA12_0==SWITCH||LA12_0==WHILE) ) {
				alt12=1;
			}
			else if ( (LA12_0==51) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// myC_new.g:66:21: statement
					{
					pushFollow(FOLLOW_statement_in_if_then_statements479);
					statement();
					state._fsp--;

					}
					break;
				case 2 :
					// myC_new.g:67:21: '{' statements '}'
					{
					match(input,51,FOLLOW_51_in_if_then_statements501); 
					pushFollow(FOLLOW_statements_in_if_then_statements503);
					statements();
					state._fsp--;

					match(input,54,FOLLOW_54_in_if_then_statements505); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "if_then_statements"



	// $ANTLR start "if_statement"
	// myC_new.g:71:1: if_statement : ( IF '(' logical_or_expression ')' if_then_statements | ELSE if_then_statements );
	public final void if_statement() throws RecognitionException {
		try {
			// myC_new.g:72:3: ( IF '(' logical_or_expression ')' if_then_statements | ELSE if_then_statements )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==IF) ) {
				alt13=1;
			}
			else if ( (LA13_0==ELSE) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// myC_new.g:72:5: IF '(' logical_or_expression ')' if_then_statements
					{
					match(input,IF,FOLLOW_IF_in_if_statement523); 
					match(input,31,FOLLOW_31_in_if_statement525); 
					pushFollow(FOLLOW_logical_or_expression_in_if_statement527);
					logical_or_expression();
					state._fsp--;

					match(input,32,FOLLOW_32_in_if_statement529); 
					pushFollow(FOLLOW_if_then_statements_in_if_statement531);
					if_then_statements();
					state._fsp--;

					 if (TRACEON) System.out.println("if() statement "); 
					}
					break;
				case 2 :
					// myC_new.g:73:4: ELSE if_then_statements
					{
					match(input,ELSE,FOLLOW_ELSE_in_if_statement538); 
					pushFollow(FOLLOW_if_then_statements_in_if_statement540);
					if_then_statements();
					state._fsp--;

					 if (TRACEON) System.out.println("else() statement "); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "if_statement"



	// $ANTLR start "for_statement"
	// myC_new.g:77:1: for_statement : FOR '(' Identifier '=' Integer_constant ';' logical_or_expression ';' ( for_expression )+ ')' if_then_statements ;
	public final void for_statement() throws RecognitionException {
		try {
			// myC_new.g:78:3: ( FOR '(' Identifier '=' Integer_constant ';' logical_or_expression ';' ( for_expression )+ ')' if_then_statements )
			// myC_new.g:78:5: FOR '(' Identifier '=' Integer_constant ';' logical_or_expression ';' ( for_expression )+ ')' if_then_statements
			{
			match(input,FOR,FOLLOW_FOR_in_for_statement560); 
			match(input,31,FOLLOW_31_in_for_statement562); 
			match(input,Identifier,FOLLOW_Identifier_in_for_statement565); 
			match(input,45,FOLLOW_45_in_for_statement567); 
			match(input,Integer_constant,FOLLOW_Integer_constant_in_for_statement570); 
			match(input,41,FOLLOW_41_in_for_statement572); 
			pushFollow(FOLLOW_logical_or_expression_in_for_statement575);
			logical_or_expression();
			state._fsp--;

			match(input,41,FOLLOW_41_in_for_statement578); 
			// myC_new.g:78:81: ( for_expression )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==Identifier) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// myC_new.g:78:83: for_expression
					{
					pushFollow(FOLLOW_for_expression_in_for_statement584);
					for_expression();
					state._fsp--;

					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			match(input,32,FOLLOW_32_in_for_statement592); 
			pushFollow(FOLLOW_if_then_statements_in_for_statement595);
			if_then_statements();
			state._fsp--;

			 if (TRACEON) System.out.println("for() statement "); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "for_statement"



	// $ANTLR start "for_expression"
	// myC_new.g:81:1: for_expression : ( Identifier '++' | Identifier '--' );
	public final void for_expression() throws RecognitionException {
		try {
			// myC_new.g:82:3: ( Identifier '++' | Identifier '--' )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==Identifier) ) {
				int LA15_1 = input.LA(2);
				if ( (LA15_1==35) ) {
					alt15=1;
				}
				else if ( (LA15_1==38) ) {
					alt15=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// myC_new.g:82:5: Identifier '++'
					{
					match(input,Identifier,FOLLOW_Identifier_in_for_expression611); 
					match(input,35,FOLLOW_35_in_for_expression613); 
					}
					break;
				case 2 :
					// myC_new.g:83:5: Identifier '--'
					{
					match(input,Identifier,FOLLOW_Identifier_in_for_expression619); 
					match(input,38,FOLLOW_38_in_for_expression621); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "for_expression"



	// $ANTLR start "while_statement"
	// myC_new.g:87:1: while_statement : WHILE '(' logical_or_expression ')' if_then_statements ;
	public final void while_statement() throws RecognitionException {
		try {
			// myC_new.g:88:3: ( WHILE '(' logical_or_expression ')' if_then_statements )
			// myC_new.g:88:5: WHILE '(' logical_or_expression ')' if_then_statements
			{
			match(input,WHILE,FOLLOW_WHILE_in_while_statement647); 
			match(input,31,FOLLOW_31_in_while_statement649); 
			pushFollow(FOLLOW_logical_or_expression_in_while_statement651);
			logical_or_expression();
			state._fsp--;

			match(input,32,FOLLOW_32_in_while_statement654); 
			pushFollow(FOLLOW_if_then_statements_in_while_statement656);
			if_then_statements();
			state._fsp--;

			 if (TRACEON) System.out.println("while() statement "); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "while_statement"



	// $ANTLR start "switch_statement"
	// myC_new.g:91:1: switch_statement : SWITCH '(' Identifier ')' '{' ( case_statement )* '}' ;
	public final void switch_statement() throws RecognitionException {
		try {
			// myC_new.g:92:3: ( SWITCH '(' Identifier ')' '{' ( case_statement )* '}' )
			// myC_new.g:92:5: SWITCH '(' Identifier ')' '{' ( case_statement )* '}'
			{
			match(input,SWITCH,FOLLOW_SWITCH_in_switch_statement674); 
			match(input,31,FOLLOW_31_in_switch_statement676); 
			match(input,Identifier,FOLLOW_Identifier_in_switch_statement679); 
			match(input,32,FOLLOW_32_in_switch_statement682); 
			match(input,51,FOLLOW_51_in_switch_statement685); 
			// myC_new.g:92:40: ( case_statement )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==CASE||LA16_0==DEFAULT) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// myC_new.g:92:41: case_statement
					{
					pushFollow(FOLLOW_case_statement_in_switch_statement690);
					case_statement();
					state._fsp--;

					}
					break;

				default :
					break loop16;
				}
			}

			match(input,54,FOLLOW_54_in_switch_statement696); 
			 if (TRACEON) System.out.println("switch() statement "); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "switch_statement"



	// $ANTLR start "case_statement"
	// myC_new.g:94:1: case_statement : ( CASE Identifier ':' if_then_statements BREAK ';' | DEFAULT ':' if_then_statements );
	public final void case_statement() throws RecognitionException {
		try {
			// myC_new.g:95:3: ( CASE Identifier ':' if_then_statements BREAK ';' | DEFAULT ':' if_then_statements )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==CASE) ) {
				alt17=1;
			}
			else if ( (LA17_0==DEFAULT) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// myC_new.g:95:5: CASE Identifier ':' if_then_statements BREAK ';'
					{
					match(input,CASE,FOLLOW_CASE_in_case_statement711); 
					match(input,Identifier,FOLLOW_Identifier_in_case_statement713); 
					match(input,40,FOLLOW_40_in_case_statement715); 
					pushFollow(FOLLOW_if_then_statements_in_case_statement717);
					if_then_statements();
					state._fsp--;

					match(input,BREAK,FOLLOW_BREAK_in_case_statement720); 
					match(input,41,FOLLOW_41_in_case_statement723); 
					 if (TRACEON) System.out.println("switch-case() statement "); 
					}
					break;
				case 2 :
					// myC_new.g:96:5: DEFAULT ':' if_then_statements
					{
					match(input,DEFAULT,FOLLOW_DEFAULT_in_case_statement732); 
					match(input,40,FOLLOW_40_in_case_statement735); 
					pushFollow(FOLLOW_if_then_statements_in_case_statement737);
					if_then_statements();
					state._fsp--;

					 if (TRACEON) System.out.println("switch-default() statement "); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "case_statement"



	// $ANTLR start "do_while_statement"
	// myC_new.g:100:1: do_while_statement : DO if_then_statements WHILE '(' logical_or_expression ')' ';' ;
	public final void do_while_statement() throws RecognitionException {
		try {
			// myC_new.g:101:3: ( DO if_then_statements WHILE '(' logical_or_expression ')' ';' )
			// myC_new.g:101:5: DO if_then_statements WHILE '(' logical_or_expression ')' ';'
			{
			match(input,DO,FOLLOW_DO_in_do_while_statement754); 
			pushFollow(FOLLOW_if_then_statements_in_do_while_statement756);
			if_then_statements();
			state._fsp--;

			match(input,WHILE,FOLLOW_WHILE_in_do_while_statement758); 
			match(input,31,FOLLOW_31_in_do_while_statement760); 
			pushFollow(FOLLOW_logical_or_expression_in_do_while_statement762);
			logical_or_expression();
			state._fsp--;

			match(input,32,FOLLOW_32_in_do_while_statement765); 
			match(input,41,FOLLOW_41_in_do_while_statement767); 
			 if (TRACEON) System.out.println("do-while() statement "); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "do_while_statement"



	// $ANTLR start "logical_or_expression"
	// myC_new.g:103:1: logical_or_expression : logical_and_expression ( '||' logical_and_expression )* ;
	public final void logical_or_expression() throws RecognitionException {
		try {
			// myC_new.g:104:2: ( logical_and_expression ( '||' logical_and_expression )* )
			// myC_new.g:104:4: logical_and_expression ( '||' logical_and_expression )*
			{
			pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression780);
			logical_and_expression();
			state._fsp--;

			// myC_new.g:104:27: ( '||' logical_and_expression )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==53) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// myC_new.g:104:28: '||' logical_and_expression
					{
					match(input,53,FOLLOW_53_in_logical_or_expression783); 
					pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression785);
					logical_and_expression();
					state._fsp--;

					}
					break;

				default :
					break loop18;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "logical_or_expression"



	// $ANTLR start "logical_and_expression"
	// myC_new.g:107:1: logical_and_expression : inclusive_or_expression ( '&&' inclusive_or_expression )* ;
	public final void logical_and_expression() throws RecognitionException {
		try {
			// myC_new.g:108:2: ( inclusive_or_expression ( '&&' inclusive_or_expression )* )
			// myC_new.g:108:4: inclusive_or_expression ( '&&' inclusive_or_expression )*
			{
			pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression798);
			inclusive_or_expression();
			state._fsp--;

			// myC_new.g:108:28: ( '&&' inclusive_or_expression )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==29) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// myC_new.g:108:29: '&&' inclusive_or_expression
					{
					match(input,29,FOLLOW_29_in_logical_and_expression801); 
					pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression803);
					inclusive_or_expression();
					state._fsp--;

					}
					break;

				default :
					break loop19;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "logical_and_expression"



	// $ANTLR start "inclusive_or_expression"
	// myC_new.g:111:1: inclusive_or_expression : exclusive_or_expression ( '|' exclusive_or_expression )* ;
	public final void inclusive_or_expression() throws RecognitionException {
		try {
			// myC_new.g:112:2: ( exclusive_or_expression ( '|' exclusive_or_expression )* )
			// myC_new.g:112:4: exclusive_or_expression ( '|' exclusive_or_expression )*
			{
			pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression816);
			exclusive_or_expression();
			state._fsp--;

			// myC_new.g:112:28: ( '|' exclusive_or_expression )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==52) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// myC_new.g:112:29: '|' exclusive_or_expression
					{
					match(input,52,FOLLOW_52_in_inclusive_or_expression819); 
					pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression821);
					exclusive_or_expression();
					state._fsp--;

					}
					break;

				default :
					break loop20;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "inclusive_or_expression"



	// $ANTLR start "exclusive_or_expression"
	// myC_new.g:115:1: exclusive_or_expression : and_expression ( '^' and_expression )* ;
	public final void exclusive_or_expression() throws RecognitionException {
		try {
			// myC_new.g:116:2: ( and_expression ( '^' and_expression )* )
			// myC_new.g:116:4: and_expression ( '^' and_expression )*
			{
			pushFollow(FOLLOW_and_expression_in_exclusive_or_expression834);
			and_expression();
			state._fsp--;

			// myC_new.g:116:19: ( '^' and_expression )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==50) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// myC_new.g:116:20: '^' and_expression
					{
					match(input,50,FOLLOW_50_in_exclusive_or_expression837); 
					pushFollow(FOLLOW_and_expression_in_exclusive_or_expression839);
					and_expression();
					state._fsp--;

					}
					break;

				default :
					break loop21;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "exclusive_or_expression"



	// $ANTLR start "and_expression"
	// myC_new.g:119:1: and_expression : equality_expression ( '&' equality_expression )* ;
	public final void and_expression() throws RecognitionException {
		try {
			// myC_new.g:120:2: ( equality_expression ( '&' equality_expression )* )
			// myC_new.g:120:4: equality_expression ( '&' equality_expression )*
			{
			pushFollow(FOLLOW_equality_expression_in_and_expression852);
			equality_expression();
			state._fsp--;

			// myC_new.g:120:24: ( '&' equality_expression )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==30) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// myC_new.g:120:25: '&' equality_expression
					{
					match(input,30,FOLLOW_30_in_and_expression855); 
					pushFollow(FOLLOW_equality_expression_in_and_expression857);
					equality_expression();
					state._fsp--;

					}
					break;

				default :
					break loop22;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "and_expression"



	// $ANTLR start "equality_expression"
	// myC_new.g:122:1: equality_expression : relational_expression ( ( '==' | '!=' ) relational_expression )* ;
	public final void equality_expression() throws RecognitionException {
		try {
			// myC_new.g:123:2: ( relational_expression ( ( '==' | '!=' ) relational_expression )* )
			// myC_new.g:123:4: relational_expression ( ( '==' | '!=' ) relational_expression )*
			{
			pushFollow(FOLLOW_relational_expression_in_equality_expression869);
			relational_expression();
			state._fsp--;

			// myC_new.g:123:26: ( ( '==' | '!=' ) relational_expression )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==28||LA23_0==46) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// myC_new.g:123:27: ( '==' | '!=' ) relational_expression
					{
					if ( input.LA(1)==28||input.LA(1)==46 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relational_expression_in_equality_expression878);
					relational_expression();
					state._fsp--;

					}
					break;

				default :
					break loop23;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "equality_expression"



	// $ANTLR start "relational_expression"
	// myC_new.g:126:1: relational_expression : shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )* ;
	public final void relational_expression() throws RecognitionException {
		try {
			// myC_new.g:127:2: ( shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )* )
			// myC_new.g:127:4: shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )*
			{
			pushFollow(FOLLOW_shift_expression_in_relational_expression891);
			shift_expression();
			state._fsp--;

			// myC_new.g:127:21: ( ( '<' | '>' | '<=' | '>=' ) shift_expression )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==42||LA24_0==44||(LA24_0 >= 47 && LA24_0 <= 48)) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// myC_new.g:127:22: ( '<' | '>' | '<=' | '>=' ) shift_expression
					{
					if ( input.LA(1)==42||input.LA(1)==44||(input.LA(1) >= 47 && input.LA(1) <= 48) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_shift_expression_in_relational_expression904);
					shift_expression();
					state._fsp--;

					}
					break;

				default :
					break loop24;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "relational_expression"



	// $ANTLR start "shift_expression"
	// myC_new.g:130:1: shift_expression : arith_expression ( ( '<<' | '>>' ) arith_expression )* ;
	public final void shift_expression() throws RecognitionException {
		try {
			// myC_new.g:131:2: ( arith_expression ( ( '<<' | '>>' ) arith_expression )* )
			// myC_new.g:131:4: arith_expression ( ( '<<' | '>>' ) arith_expression )*
			{
			pushFollow(FOLLOW_arith_expression_in_shift_expression917);
			arith_expression();
			state._fsp--;

			// myC_new.g:131:21: ( ( '<<' | '>>' ) arith_expression )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==43||LA25_0==49) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// myC_new.g:131:22: ( '<<' | '>>' ) arith_expression
					{
					if ( input.LA(1)==43||input.LA(1)==49 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_arith_expression_in_shift_expression926);
					arith_expression();
					state._fsp--;

					}
					break;

				default :
					break loop25;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "shift_expression"

	// Delegated rules



	public static final BitSet FOLLOW_VOID_in_program35 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_MAIN_in_program37 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_program39 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_program41 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_program43 = new BitSet(new long[]{0x0040000005476E40L});
	public static final BitSet FOLLOW_declarations_in_program45 = new BitSet(new long[]{0x0040000005454A00L});
	public static final BitSet FOLLOW_statements_in_program47 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_program49 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declarations65 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_declarations67 = new BitSet(new long[]{0x0000220000000000L});
	public static final BitSet FOLLOW_45_in_declarations69 = new BitSet(new long[]{0x00000020800C8000L});
	public static final BitSet FOLLOW_arith_expression_in_declarations71 = new BitSet(new long[]{0x0000220000000000L});
	public static final BitSet FOLLOW_41_in_declarations75 = new BitSet(new long[]{0x0000000000022440L});
	public static final BitSet FOLLOW_declarations_in_declarations77 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_type141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements154 = new BitSet(new long[]{0x0000000005454A00L});
	public static final BitSet FOLLOW_statements_in_statements156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression173 = new BitSet(new long[]{0x0000002400000002L});
	public static final BitSet FOLLOW_34_in_arith_expression195 = new BitSet(new long[]{0x00000020800C8000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression197 = new BitSet(new long[]{0x0000002400000002L});
	public static final BitSet FOLLOW_37_in_arith_expression207 = new BitSet(new long[]{0x00000020800C8000L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression209 = new BitSet(new long[]{0x0000002400000002L});
	public static final BitSet FOLLOW_signExpr_in_multExpr244 = new BitSet(new long[]{0x0000008200000002L});
	public static final BitSet FOLLOW_33_in_multExpr258 = new BitSet(new long[]{0x00000020800C8000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr260 = new BitSet(new long[]{0x0000008200000002L});
	public static final BitSet FOLLOW_39_in_multExpr274 = new BitSet(new long[]{0x00000020800C8000L});
	public static final BitSet FOLLOW_signExpr_in_multExpr276 = new BitSet(new long[]{0x0000008200000002L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_signExpr307 = new BitSet(new long[]{0x00000000800C8000L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_primaryExpr323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Floating_point_constant_in_primaryExpr338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_primaryExpr362 = new BitSet(new long[]{0x00000020800C8000L});
	public static final BitSet FOLLOW_arith_expression_in_primaryExpr364 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_primaryExpr366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_statement389 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_statement391 = new BitSet(new long[]{0x00000020800C8000L});
	public static final BitSet FOLLOW_arith_expression_in_statement393 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_statement395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_statement_in_statement405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_statement_in_statement413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_statement_in_statement421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_do_while_statement_in_statement428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switch_statement_in_statement435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINTF_in_statement442 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_statement444 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_statement446 = new BitSet(new long[]{0x0000001100800000L});
	public static final BitSet FOLLOW_36_in_statement451 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_statement453 = new BitSet(new long[]{0x0000001100000000L});
	public static final BitSet FOLLOW_32_in_statement457 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_statement459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_if_then_statements479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_if_then_statements501 = new BitSet(new long[]{0x0040000005454A00L});
	public static final BitSet FOLLOW_statements_in_if_then_statements503 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_if_then_statements505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_statement523 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_if_statement525 = new BitSet(new long[]{0x00000020800C8000L});
	public static final BitSet FOLLOW_logical_or_expression_in_if_statement527 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_if_statement529 = new BitSet(new long[]{0x0008000005454A00L});
	public static final BitSet FOLLOW_if_then_statements_in_if_statement531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_if_statement538 = new BitSet(new long[]{0x0008000005454A00L});
	public static final BitSet FOLLOW_if_then_statements_in_if_statement540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_for_statement560 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_for_statement562 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_for_statement565 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_for_statement567 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_Integer_constant_in_for_statement570 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_for_statement572 = new BitSet(new long[]{0x00000020800C8000L});
	public static final BitSet FOLLOW_logical_or_expression_in_for_statement575 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_for_statement578 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_for_expression_in_for_statement584 = new BitSet(new long[]{0x0000000100040000L});
	public static final BitSet FOLLOW_32_in_for_statement592 = new BitSet(new long[]{0x0008000005454A00L});
	public static final BitSet FOLLOW_if_then_statements_in_for_statement595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_for_expression611 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_for_expression613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_for_expression619 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_for_expression621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_statement647 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_while_statement649 = new BitSet(new long[]{0x00000020800C8000L});
	public static final BitSet FOLLOW_logical_or_expression_in_while_statement651 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_while_statement654 = new BitSet(new long[]{0x0008000005454A00L});
	public static final BitSet FOLLOW_if_then_statements_in_while_statement656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWITCH_in_switch_statement674 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_switch_statement676 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_switch_statement679 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_switch_statement682 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_switch_statement685 = new BitSet(new long[]{0x0040000000000120L});
	public static final BitSet FOLLOW_case_statement_in_switch_statement690 = new BitSet(new long[]{0x0040000000000120L});
	public static final BitSet FOLLOW_54_in_switch_statement696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_case_statement711 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Identifier_in_case_statement713 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_case_statement715 = new BitSet(new long[]{0x0008000005454A00L});
	public static final BitSet FOLLOW_if_then_statements_in_case_statement717 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BREAK_in_case_statement720 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_case_statement723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFAULT_in_case_statement732 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_case_statement735 = new BitSet(new long[]{0x0008000005454A00L});
	public static final BitSet FOLLOW_if_then_statements_in_case_statement737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_do_while_statement754 = new BitSet(new long[]{0x0008000005454A00L});
	public static final BitSet FOLLOW_if_then_statements_in_do_while_statement756 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_WHILE_in_do_while_statement758 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_do_while_statement760 = new BitSet(new long[]{0x00000020800C8000L});
	public static final BitSet FOLLOW_logical_or_expression_in_do_while_statement762 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_do_while_statement765 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_do_while_statement767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression780 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_53_in_logical_or_expression783 = new BitSet(new long[]{0x00000020800C8000L});
	public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression785 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression798 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_29_in_logical_and_expression801 = new BitSet(new long[]{0x00000020800C8000L});
	public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression803 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression816 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_52_in_inclusive_or_expression819 = new BitSet(new long[]{0x00000020800C8000L});
	public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression821 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression834 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_50_in_exclusive_or_expression837 = new BitSet(new long[]{0x00000020800C8000L});
	public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression839 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_equality_expression_in_and_expression852 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_30_in_and_expression855 = new BitSet(new long[]{0x00000020800C8000L});
	public static final BitSet FOLLOW_equality_expression_in_and_expression857 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression869 = new BitSet(new long[]{0x0000400010000002L});
	public static final BitSet FOLLOW_set_in_equality_expression872 = new BitSet(new long[]{0x00000020800C8000L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression878 = new BitSet(new long[]{0x0000400010000002L});
	public static final BitSet FOLLOW_shift_expression_in_relational_expression891 = new BitSet(new long[]{0x0001940000000002L});
	public static final BitSet FOLLOW_set_in_relational_expression894 = new BitSet(new long[]{0x00000020800C8000L});
	public static final BitSet FOLLOW_shift_expression_in_relational_expression904 = new BitSet(new long[]{0x0001940000000002L});
	public static final BitSet FOLLOW_arith_expression_in_shift_expression917 = new BitSet(new long[]{0x0002080000000002L});
	public static final BitSet FOLLOW_set_in_shift_expression920 = new BitSet(new long[]{0x00000020800C8000L});
	public static final BitSet FOLLOW_arith_expression_in_shift_expression926 = new BitSet(new long[]{0x0002080000000002L});
}
