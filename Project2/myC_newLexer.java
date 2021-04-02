// $ANTLR 3.5.2 myC_new.g 2019-05-09 09:50:01

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myC_newLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public myC_newLexer() {} 
	public myC_newLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myC_newLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "myC_new.g"; }

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:7:7: ( '!=' )
			// myC_new.g:7:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:8:7: ( '&&' )
			// myC_new.g:8:9: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:9:7: ( '&' )
			// myC_new.g:9:9: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:10:7: ( '(' )
			// myC_new.g:10:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:11:7: ( ')' )
			// myC_new.g:11:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:12:7: ( '*' )
			// myC_new.g:12:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:13:7: ( '+' )
			// myC_new.g:13:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:14:7: ( '++' )
			// myC_new.g:14:9: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:15:7: ( ',' )
			// myC_new.g:15:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:16:7: ( '-' )
			// myC_new.g:16:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:17:7: ( '--' )
			// myC_new.g:17:9: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:18:7: ( '/' )
			// myC_new.g:18:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:19:7: ( ':' )
			// myC_new.g:19:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:20:7: ( ';' )
			// myC_new.g:20:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:21:7: ( '<' )
			// myC_new.g:21:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:22:7: ( '<<' )
			// myC_new.g:22:9: '<<'
			{
			match("<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:23:7: ( '<=' )
			// myC_new.g:23:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:24:7: ( '=' )
			// myC_new.g:24:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:25:7: ( '==' )
			// myC_new.g:25:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:26:7: ( '>' )
			// myC_new.g:26:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:27:7: ( '>=' )
			// myC_new.g:27:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:28:7: ( '>>' )
			// myC_new.g:28:9: '>>'
			{
			match(">>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:29:7: ( '^' )
			// myC_new.g:29:9: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:30:7: ( '{' )
			// myC_new.g:30:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:31:7: ( '|' )
			// myC_new.g:31:9: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:32:7: ( '||' )
			// myC_new.g:32:9: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:33:7: ( '}' )
			// myC_new.g:33:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:138:9: ( 'if' )
			// myC_new.g:138:11: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:139:8: ( 'else' )
			// myC_new.g:139:10: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:140:8: ( 'for' )
			// myC_new.g:140:9: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:141:10: ( 'while' )
			// myC_new.g:141:12: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "SWITCH"
	public final void mSWITCH() throws RecognitionException {
		try {
			int _type = SWITCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:142:9: ( 'switch' )
			// myC_new.g:142:10: 'switch'
			{
			match("switch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWITCH"

	// $ANTLR start "CASE"
	public final void mCASE() throws RecognitionException {
		try {
			int _type = CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:143:9: ( 'case' )
			// myC_new.g:143:11: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASE"

	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:144:9: ( 'break' )
			// myC_new.g:144:11: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK"

	// $ANTLR start "DEFAULT"
	public final void mDEFAULT() throws RecognitionException {
		try {
			int _type = DEFAULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:145:10: ( 'default' )
			// myC_new.g:145:12: 'default'
			{
			match("default"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFAULT"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:146:18: ( 'do' )
			// myC_new.g:146:20: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:151:6: ( 'float' )
			// myC_new.g:151:7: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:152:4: ( 'int' )
			// myC_new.g:152:5: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:153:5: ( 'char' )
			// myC_new.g:153:6: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "DOUBLE"
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:154:7: ( 'double' )
			// myC_new.g:154:9: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE"

	// $ANTLR start "MAIN"
	public final void mMAIN() throws RecognitionException {
		try {
			int _type = MAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:155:5: ( 'main' )
			// myC_new.g:155:7: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIN"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:156:5: ( 'void' )
			// myC_new.g:156:7: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "PRINTF"
	public final void mPRINTF() throws RecognitionException {
		try {
			int _type = PRINTF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:158:7: ( 'printf' )
			// myC_new.g:158:9: 'printf'
			{
			match("printf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINTF"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:161:5: ( '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"' )
			// myC_new.g:161:8: '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// myC_new.g:161:12: ( EscapeSequence |~ ( '\\\\' | '\"' ) )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='\\') ) {
					alt1=1;
				}
				else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '[')||(LA1_0 >= ']' && LA1_0 <= '\uFFFF')) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// myC_new.g:161:14: EscapeSequence
					{
					mEscapeSequence(); 

					}
					break;
				case 2 :
					// myC_new.g:161:31: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_LITERAL"

	// $ANTLR start "EscapeSequence"
	public final void mEscapeSequence() throws RecognitionException {
		try {
			// myC_new.g:166:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | OctalEscape )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='\\') ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1=='\"'||LA2_1=='\''||LA2_1=='\\'||LA2_1=='b'||LA2_1=='f'||LA2_1=='n'||LA2_1=='r'||LA2_1=='t') ) {
					alt2=1;
				}
				else if ( ((LA2_1 >= '0' && LA2_1 <= '7')) ) {
					alt2=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// myC_new.g:166:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// myC_new.g:167:9: OctalEscape
					{
					mOctalEscape(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EscapeSequence"

	// $ANTLR start "OctalEscape"
	public final void mOctalEscape() throws RecognitionException {
		try {
			// myC_new.g:172:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt3=3;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\\') ) {
				int LA3_1 = input.LA(2);
				if ( ((LA3_1 >= '0' && LA3_1 <= '3')) ) {
					int LA3_2 = input.LA(3);
					if ( ((LA3_2 >= '0' && LA3_2 <= '7')) ) {
						int LA3_4 = input.LA(4);
						if ( ((LA3_4 >= '0' && LA3_4 <= '7')) ) {
							alt3=1;
						}

						else {
							alt3=2;
						}

					}

					else {
						alt3=3;
					}

				}
				else if ( ((LA3_1 >= '4' && LA3_1 <= '7')) ) {
					int LA3_3 = input.LA(3);
					if ( ((LA3_3 >= '0' && LA3_3 <= '7')) ) {
						alt3=2;
					}

					else {
						alt3=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// myC_new.g:172:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// myC_new.g:173:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// myC_new.g:174:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OctalEscape"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:177:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// myC_new.g:177:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myC_new.g:177:36: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// myC_new.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Identifier"

	// $ANTLR start "Integer_constant"
	public final void mInteger_constant() throws RecognitionException {
		try {
			int _type = Integer_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:178:17: ( ( '0' .. '9' )+ )
			// myC_new.g:178:18: ( '0' .. '9' )+
			{
			// myC_new.g:178:18: ( '0' .. '9' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// myC_new.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Integer_constant"

	// $ANTLR start "Floating_point_constant"
	public final void mFloating_point_constant() throws RecognitionException {
		try {
			int _type = Floating_point_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:179:24: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
			// myC_new.g:179:25: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
			{
			// myC_new.g:179:25: ( '0' .. '9' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// myC_new.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			match('.'); 
			// myC_new.g:179:39: ( '0' .. '9' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// myC_new.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Floating_point_constant"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:181:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// myC_new.g:181:4: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myC_new.g:182:8: ( '/*' ( . )* '*/' )
			// myC_new.g:182:9: '/*' ( . )* '*/'
			{
			match("/*"); 

			// myC_new.g:182:14: ( . )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0=='*') ) {
					int LA8_1 = input.LA(2);
					if ( (LA8_1=='/') ) {
						alt8=2;
					}
					else if ( ((LA8_1 >= '\u0000' && LA8_1 <= '.')||(LA8_1 >= '0' && LA8_1 <= '\uFFFF')) ) {
						alt8=1;
					}

				}
				else if ( ((LA8_0 >= '\u0000' && LA8_0 <= ')')||(LA8_0 >= '+' && LA8_0 <= '\uFFFF')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// myC_new.g:182:14: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop8;
				}
			}

			match("*/"); 

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// myC_new.g:1:8: ( T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | IF | ELSE | FOR | WHILE | SWITCH | CASE | BREAK | DEFAULT | DO | FLOAT | INT | CHAR | DOUBLE | MAIN | VOID | PRINTF | STRING_LITERAL | Identifier | Integer_constant | Floating_point_constant | WS | COMMENT )
		int alt9=49;
		alt9 = dfa9.predict(input);
		switch (alt9) {
			case 1 :
				// myC_new.g:1:10: T__28
				{
				mT__28(); 

				}
				break;
			case 2 :
				// myC_new.g:1:16: T__29
				{
				mT__29(); 

				}
				break;
			case 3 :
				// myC_new.g:1:22: T__30
				{
				mT__30(); 

				}
				break;
			case 4 :
				// myC_new.g:1:28: T__31
				{
				mT__31(); 

				}
				break;
			case 5 :
				// myC_new.g:1:34: T__32
				{
				mT__32(); 

				}
				break;
			case 6 :
				// myC_new.g:1:40: T__33
				{
				mT__33(); 

				}
				break;
			case 7 :
				// myC_new.g:1:46: T__34
				{
				mT__34(); 

				}
				break;
			case 8 :
				// myC_new.g:1:52: T__35
				{
				mT__35(); 

				}
				break;
			case 9 :
				// myC_new.g:1:58: T__36
				{
				mT__36(); 

				}
				break;
			case 10 :
				// myC_new.g:1:64: T__37
				{
				mT__37(); 

				}
				break;
			case 11 :
				// myC_new.g:1:70: T__38
				{
				mT__38(); 

				}
				break;
			case 12 :
				// myC_new.g:1:76: T__39
				{
				mT__39(); 

				}
				break;
			case 13 :
				// myC_new.g:1:82: T__40
				{
				mT__40(); 

				}
				break;
			case 14 :
				// myC_new.g:1:88: T__41
				{
				mT__41(); 

				}
				break;
			case 15 :
				// myC_new.g:1:94: T__42
				{
				mT__42(); 

				}
				break;
			case 16 :
				// myC_new.g:1:100: T__43
				{
				mT__43(); 

				}
				break;
			case 17 :
				// myC_new.g:1:106: T__44
				{
				mT__44(); 

				}
				break;
			case 18 :
				// myC_new.g:1:112: T__45
				{
				mT__45(); 

				}
				break;
			case 19 :
				// myC_new.g:1:118: T__46
				{
				mT__46(); 

				}
				break;
			case 20 :
				// myC_new.g:1:124: T__47
				{
				mT__47(); 

				}
				break;
			case 21 :
				// myC_new.g:1:130: T__48
				{
				mT__48(); 

				}
				break;
			case 22 :
				// myC_new.g:1:136: T__49
				{
				mT__49(); 

				}
				break;
			case 23 :
				// myC_new.g:1:142: T__50
				{
				mT__50(); 

				}
				break;
			case 24 :
				// myC_new.g:1:148: T__51
				{
				mT__51(); 

				}
				break;
			case 25 :
				// myC_new.g:1:154: T__52
				{
				mT__52(); 

				}
				break;
			case 26 :
				// myC_new.g:1:160: T__53
				{
				mT__53(); 

				}
				break;
			case 27 :
				// myC_new.g:1:166: T__54
				{
				mT__54(); 

				}
				break;
			case 28 :
				// myC_new.g:1:172: IF
				{
				mIF(); 

				}
				break;
			case 29 :
				// myC_new.g:1:175: ELSE
				{
				mELSE(); 

				}
				break;
			case 30 :
				// myC_new.g:1:180: FOR
				{
				mFOR(); 

				}
				break;
			case 31 :
				// myC_new.g:1:184: WHILE
				{
				mWHILE(); 

				}
				break;
			case 32 :
				// myC_new.g:1:190: SWITCH
				{
				mSWITCH(); 

				}
				break;
			case 33 :
				// myC_new.g:1:197: CASE
				{
				mCASE(); 

				}
				break;
			case 34 :
				// myC_new.g:1:202: BREAK
				{
				mBREAK(); 

				}
				break;
			case 35 :
				// myC_new.g:1:208: DEFAULT
				{
				mDEFAULT(); 

				}
				break;
			case 36 :
				// myC_new.g:1:216: DO
				{
				mDO(); 

				}
				break;
			case 37 :
				// myC_new.g:1:219: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 38 :
				// myC_new.g:1:225: INT
				{
				mINT(); 

				}
				break;
			case 39 :
				// myC_new.g:1:229: CHAR
				{
				mCHAR(); 

				}
				break;
			case 40 :
				// myC_new.g:1:234: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 41 :
				// myC_new.g:1:241: MAIN
				{
				mMAIN(); 

				}
				break;
			case 42 :
				// myC_new.g:1:246: VOID
				{
				mVOID(); 

				}
				break;
			case 43 :
				// myC_new.g:1:251: PRINTF
				{
				mPRINTF(); 

				}
				break;
			case 44 :
				// myC_new.g:1:258: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;
			case 45 :
				// myC_new.g:1:273: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 46 :
				// myC_new.g:1:284: Integer_constant
				{
				mInteger_constant(); 

				}
				break;
			case 47 :
				// myC_new.g:1:301: Floating_point_constant
				{
				mFloating_point_constant(); 

				}
				break;
			case 48 :
				// myC_new.g:1:325: WS
				{
				mWS(); 

				}
				break;
			case 49 :
				// myC_new.g:1:328: COMMENT
				{
				mCOMMENT(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA9_eotS =
		"\2\uffff\1\43\3\uffff\1\45\1\uffff\1\47\1\51\2\uffff\1\54\1\56\1\61\2"+
		"\uffff\1\63\1\uffff\13\37\2\uffff\1\103\23\uffff\1\105\12\37\1\121\3\37"+
		"\3\uffff\1\125\1\37\1\127\10\37\1\uffff\3\37\1\uffff\1\143\1\uffff\3\37"+
		"\1\147\1\150\3\37\1\154\1\155\1\37\1\uffff\1\157\1\160\1\37\2\uffff\1"+
		"\162\2\37\2\uffff\1\37\2\uffff\1\166\1\uffff\1\37\1\170\1\171\1\uffff"+
		"\1\172\3\uffff";
	static final String DFA9_eofS =
		"\173\uffff";
	static final String DFA9_minS =
		"\1\11\1\uffff\1\46\3\uffff\1\53\1\uffff\1\55\1\52\2\uffff\1\74\2\75\2"+
		"\uffff\1\174\1\uffff\1\146\2\154\1\150\1\167\1\141\1\162\1\145\1\141\1"+
		"\157\1\162\2\uffff\1\56\23\uffff\1\60\1\164\1\163\1\162\1\157\2\151\1"+
		"\163\1\141\1\145\1\146\1\60\3\151\3\uffff\1\60\1\145\1\60\1\141\1\154"+
		"\1\164\1\145\1\162\2\141\1\142\1\uffff\1\156\1\144\1\156\1\uffff\1\60"+
		"\1\uffff\1\164\1\145\1\143\2\60\1\153\1\165\1\154\2\60\1\164\1\uffff\2"+
		"\60\1\150\2\uffff\1\60\1\154\1\145\2\uffff\1\146\2\uffff\1\60\1\uffff"+
		"\1\164\2\60\1\uffff\1\60\3\uffff";
	static final String DFA9_maxS =
		"\1\175\1\uffff\1\46\3\uffff\1\53\1\uffff\1\55\1\52\2\uffff\2\75\1\76\2"+
		"\uffff\1\174\1\uffff\1\156\1\154\1\157\1\150\1\167\1\150\1\162\1\157\1"+
		"\141\1\157\1\162\2\uffff\1\71\23\uffff\1\172\1\164\1\163\1\162\1\157\2"+
		"\151\1\163\1\141\1\145\1\146\1\172\3\151\3\uffff\1\172\1\145\1\172\1\141"+
		"\1\154\1\164\1\145\1\162\2\141\1\142\1\uffff\1\156\1\144\1\156\1\uffff"+
		"\1\172\1\uffff\1\164\1\145\1\143\2\172\1\153\1\165\1\154\2\172\1\164\1"+
		"\uffff\2\172\1\150\2\uffff\1\172\1\154\1\145\2\uffff\1\146\2\uffff\1\172"+
		"\1\uffff\1\164\2\172\1\uffff\1\172\3\uffff";
	static final String DFA9_acceptS =
		"\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\uffff\1\11\2\uffff\1\15\1\16\3\uffff"+
		"\1\27\1\30\1\uffff\1\33\13\uffff\1\54\1\55\1\uffff\1\60\1\2\1\3\1\10\1"+
		"\7\1\13\1\12\1\61\1\14\1\20\1\21\1\17\1\23\1\22\1\25\1\26\1\24\1\32\1"+
		"\31\17\uffff\1\56\1\57\1\34\13\uffff\1\44\3\uffff\1\46\1\uffff\1\36\13"+
		"\uffff\1\35\3\uffff\1\41\1\47\3\uffff\1\51\1\52\1\uffff\1\45\1\37\1\uffff"+
		"\1\42\3\uffff\1\40\1\uffff\1\50\1\53\1\43";
	static final String DFA9_specialS =
		"\173\uffff}>";
	static final String[] DFA9_transitionS = {
			"\2\41\2\uffff\1\41\22\uffff\1\41\1\1\1\36\3\uffff\1\2\1\uffff\1\3\1\4"+
			"\1\5\1\6\1\7\1\10\1\uffff\1\11\12\40\1\12\1\13\1\14\1\15\1\16\2\uffff"+
			"\32\37\3\uffff\1\17\1\37\1\uffff\1\37\1\31\1\30\1\32\1\24\1\25\2\37\1"+
			"\23\3\37\1\33\2\37\1\35\2\37\1\27\2\37\1\34\1\26\3\37\1\20\1\21\1\22",
			"",
			"\1\42",
			"",
			"",
			"",
			"\1\44",
			"",
			"\1\46",
			"\1\50",
			"",
			"",
			"\1\52\1\53",
			"\1\55",
			"\1\57\1\60",
			"",
			"",
			"\1\62",
			"",
			"\1\64\7\uffff\1\65",
			"\1\66",
			"\1\70\2\uffff\1\67",
			"\1\71",
			"\1\72",
			"\1\73\6\uffff\1\74",
			"\1\75",
			"\1\76\11\uffff\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"",
			"",
			"\1\104\1\uffff\12\40",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\24\37\1\120\5\37",
			"\1\122",
			"\1\123",
			"\1\124",
			"",
			"",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\126",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"",
			"\1\140",
			"\1\141",
			"\1\142",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\1\144",
			"\1\145",
			"\1\146",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\151",
			"\1\152",
			"\1\153",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\156",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\161",
			"",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\1\163",
			"\1\164",
			"",
			"",
			"\1\165",
			"",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\1\167",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
			"",
			"",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | IF | ELSE | FOR | WHILE | SWITCH | CASE | BREAK | DEFAULT | DO | FLOAT | INT | CHAR | DOUBLE | MAIN | VOID | PRINTF | STRING_LITERAL | Identifier | Integer_constant | Floating_point_constant | WS | COMMENT );";
		}
	}

}
