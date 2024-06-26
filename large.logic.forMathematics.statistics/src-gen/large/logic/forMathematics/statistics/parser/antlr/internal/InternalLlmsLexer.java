package large.logic.forMathematics.statistics.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLlmsLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=7;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalLlmsLexer() {;} 
    public InternalLlmsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLlmsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalLlms.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:11:7: ( 'Class' )
            // InternalLlms.g:11:9: 'Class'
            {
            match("Class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:12:7: ( '{' )
            // InternalLlms.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:13:7: ( '}' )
            // InternalLlms.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:14:7: ( 'print' )
            // InternalLlms.g:14:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:15:7: ( '(' )
            // InternalLlms.g:15:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:16:7: ( ',' )
            // InternalLlms.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:17:7: ( ')' )
            // InternalLlms.g:17:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:18:7: ( 'Function' )
            // InternalLlms.g:18:9: 'Function'
            {
            match("Function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:19:7: ( '<=' )
            // InternalLlms.g:19:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:20:7: ( '=>' )
            // InternalLlms.g:20:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:21:7: ( ';' )
            // InternalLlms.g:21:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:22:7: ( 'for' )
            // InternalLlms.g:22:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:23:7: ( ':' )
            // InternalLlms.g:23:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:24:7: ( 'if' )
            // InternalLlms.g:24:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:25:7: ( 'else-if' )
            // InternalLlms.g:25:9: 'else-if'
            {
            match("else-if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:26:7: ( 'else{' )
            // InternalLlms.g:26:9: 'else{'
            {
            match("else{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:27:7: ( '[' )
            // InternalLlms.g:27:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:28:7: ( ']' )
            // InternalLlms.g:28:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:29:7: ( '<' )
            // InternalLlms.g:29:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:30:7: ( '>' )
            // InternalLlms.g:30:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:31:7: ( '=' )
            // InternalLlms.g:31:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:32:7: ( '!=' )
            // InternalLlms.g:32:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:33:7: ( '>=' )
            // InternalLlms.g:33:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:34:7: ( '&&' )
            // InternalLlms.g:34:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:35:7: ( '||' )
            // InternalLlms.g:35:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:36:7: ( '!' )
            // InternalLlms.g:36:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:37:7: ( 'nor' )
            // InternalLlms.g:37:9: 'nor'
            {
            match("nor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:38:7: ( 'nand' )
            // InternalLlms.g:38:9: 'nand'
            {
            match("nand"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:39:7: ( '+' )
            // InternalLlms.g:39:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:40:7: ( '-' )
            // InternalLlms.g:40:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:41:7: ( '/' )
            // InternalLlms.g:41:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:42:7: ( '*' )
            // InternalLlms.g:42:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:43:7: ( 'int' )
            // InternalLlms.g:43:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:44:7: ( 'bool' )
            // InternalLlms.g:44:9: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:45:7: ( 'doubles' )
            // InternalLlms.g:45:9: 'doubles'
            {
            match("doubles"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:46:7: ( 'string' )
            // InternalLlms.g:46:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:47:7: ( 'true' )
            // InternalLlms.g:47:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:48:7: ( 'false' )
            // InternalLlms.g:48:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:2656:13: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* )
            // InternalLlms.g:2656:15: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
            {
            // InternalLlms.g:2656:15: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLlms.g:2656:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            match('.'); 
            // InternalLlms.g:2656:31: ( '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLlms.g:2656:32: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:2658:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalLlms.g:2658:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalLlms.g:2658:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLlms.g:2658:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalLlms.g:2658:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLlms.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:2660:10: ( ( '0' .. '9' )+ )
            // InternalLlms.g:2660:12: ( '0' .. '9' )+
            {
            // InternalLlms.g:2660:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLlms.g:2660:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:2662:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalLlms.g:2662:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalLlms.g:2662:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalLlms.g:2662:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalLlms.g:2662:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalLlms.g:2662:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLlms.g:2662:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalLlms.g:2662:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalLlms.g:2662:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalLlms.g:2662:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLlms.g:2662:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:2664:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalLlms.g:2664:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalLlms.g:2664:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLlms.g:2664:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:2666:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalLlms.g:2666:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalLlms.g:2666:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLlms.g:2666:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalLlms.g:2666:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalLlms.g:2666:41: ( '\\r' )? '\\n'
                    {
                    // InternalLlms.g:2666:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalLlms.g:2666:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:2668:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalLlms.g:2668:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalLlms.g:2668:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLlms.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLlms.g:2670:16: ( . )
            // InternalLlms.g:2670:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalLlms.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=46;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalLlms.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalLlms.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalLlms.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalLlms.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalLlms.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalLlms.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalLlms.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalLlms.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalLlms.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalLlms.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalLlms.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalLlms.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalLlms.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalLlms.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalLlms.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalLlms.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalLlms.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalLlms.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalLlms.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalLlms.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalLlms.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalLlms.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalLlms.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalLlms.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalLlms.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalLlms.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalLlms.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalLlms.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalLlms.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalLlms.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalLlms.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalLlms.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalLlms.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalLlms.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalLlms.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalLlms.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalLlms.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalLlms.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalLlms.g:1:238: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 40 :
                // InternalLlms.g:1:250: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 41 :
                // InternalLlms.g:1:258: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 42 :
                // InternalLlms.g:1:267: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 43 :
                // InternalLlms.g:1:279: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 44 :
                // InternalLlms.g:1:295: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 45 :
                // InternalLlms.g:1:311: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 46 :
                // InternalLlms.g:1:319: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\47\2\uffff\1\47\3\uffff\1\47\1\60\1\62\1\uffff\1\47\1\uffff\2\47\2\uffff\1\75\1\77\2\45\1\47\2\uffff\1\110\1\uffff\4\47\1\116\1\45\1\uffff\2\45\2\uffff\1\47\3\uffff\1\47\3\uffff\1\47\5\uffff\2\47\1\uffff\1\130\2\47\10\uffff\2\47\6\uffff\4\47\2\uffff\1\116\2\uffff\3\47\1\144\1\47\1\uffff\1\146\1\47\1\150\10\47\1\uffff\1\47\1\uffff\1\47\1\uffff\1\164\1\165\2\47\1\170\1\171\1\172\1\47\1\174\4\uffff\2\47\3\uffff\1\47\1\uffff\1\47\1\u0081\1\47\1\u0083\1\uffff\1\u0084\2\uffff";
    static final String DFA14_eofS =
        "\u0085\uffff";
    static final String DFA14_minS =
        "\1\0\1\154\2\uffff\1\162\3\uffff\1\165\1\75\1\76\1\uffff\1\141\1\uffff\1\146\1\154\2\uffff\2\75\1\46\1\174\1\141\2\uffff\1\52\1\uffff\2\157\1\164\1\162\1\56\1\101\1\uffff\2\0\2\uffff\1\141\3\uffff\1\151\3\uffff\1\156\5\uffff\1\162\1\154\1\uffff\1\60\1\164\1\163\10\uffff\1\162\1\156\6\uffff\1\157\1\165\1\162\1\165\2\uffff\1\56\2\uffff\1\163\1\156\1\143\1\60\1\163\1\uffff\1\60\1\145\1\60\1\144\1\154\1\142\1\151\1\145\1\163\2\164\1\uffff\1\145\1\uffff\1\55\1\uffff\2\60\1\154\1\156\3\60\1\151\1\60\4\uffff\1\145\1\147\3\uffff\1\157\1\uffff\1\163\1\60\1\156\1\60\1\uffff\1\60\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\154\2\uffff\1\162\3\uffff\1\165\1\75\1\76\1\uffff\1\157\1\uffff\1\156\1\154\2\uffff\2\75\1\46\1\174\1\157\2\uffff\1\57\1\uffff\2\157\1\164\1\162\1\71\1\172\1\uffff\2\uffff\2\uffff\1\141\3\uffff\1\151\3\uffff\1\156\5\uffff\1\162\1\154\1\uffff\1\172\1\164\1\163\10\uffff\1\162\1\156\6\uffff\1\157\1\165\1\162\1\165\2\uffff\1\71\2\uffff\1\163\1\156\1\143\1\172\1\163\1\uffff\1\172\1\145\1\172\1\144\1\154\1\142\1\151\1\145\1\163\2\164\1\uffff\1\145\1\uffff\1\173\1\uffff\2\172\1\154\1\156\3\172\1\151\1\172\4\uffff\1\145\1\147\3\uffff\1\157\1\uffff\1\163\1\172\1\156\1\172\1\uffff\1\172\2\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\5\1\6\1\7\3\uffff\1\13\1\uffff\1\15\2\uffff\1\21\1\22\5\uffff\1\35\1\36\1\uffff\1\40\6\uffff\1\50\2\uffff\1\55\1\56\1\uffff\1\50\1\2\1\3\1\uffff\1\5\1\6\1\7\1\uffff\1\11\1\23\1\12\1\25\1\13\2\uffff\1\15\3\uffff\1\21\1\22\1\27\1\24\1\26\1\32\1\30\1\31\2\uffff\1\35\1\36\1\53\1\54\1\37\1\40\4\uffff\1\51\1\47\1\uffff\1\52\1\55\5\uffff\1\16\13\uffff\1\14\1\uffff\1\41\1\uffff\1\33\11\uffff\1\17\1\20\1\34\1\42\2\uffff\1\45\1\1\1\4\1\uffff\1\46\4\uffff\1\44\1\uffff\1\43\1\10";
    static final String DFA14_specialS =
        "\1\1\41\uffff\1\0\1\2\141\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\45\2\44\2\45\1\44\22\45\1\44\1\23\1\42\3\45\1\24\1\43\1\5\1\7\1\32\1\27\1\6\1\30\1\45\1\31\12\37\1\15\1\13\1\11\1\12\1\22\2\45\2\41\1\1\2\41\1\10\24\41\1\20\1\45\1\21\1\40\1\41\1\45\1\41\1\33\1\41\1\34\1\17\1\14\2\41\1\16\4\41\1\26\1\41\1\4\2\41\1\35\1\36\6\41\1\2\1\25\1\3\uff82\45",
            "\1\46",
            "",
            "",
            "\1\52",
            "",
            "",
            "",
            "\1\56",
            "\1\57",
            "\1\61",
            "",
            "\1\65\15\uffff\1\64",
            "",
            "\1\67\7\uffff\1\70",
            "\1\71",
            "",
            "",
            "\1\74",
            "\1\76",
            "\1\100",
            "\1\101",
            "\1\103\15\uffff\1\102",
            "",
            "",
            "\1\106\4\uffff\1\107",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\117\1\uffff\12\120",
            "\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\0\121",
            "\0\121",
            "",
            "",
            "\1\123",
            "",
            "",
            "",
            "\1\124",
            "",
            "",
            "",
            "\1\125",
            "",
            "",
            "",
            "",
            "",
            "\1\126",
            "\1\127",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\131",
            "\1\132",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\133",
            "\1\134",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "",
            "\1\117\1\uffff\12\120",
            "",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\145",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\147",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "\1\161",
            "",
            "\1\162\115\uffff\1\163",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\166",
            "\1\167",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\173",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "",
            "\1\175",
            "\1\176",
            "",
            "",
            "",
            "\1\177",
            "",
            "\1\u0080",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0082",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_34 = input.LA(1);

                        s = -1;
                        if ( ((LA14_34>='\u0000' && LA14_34<='\uFFFF')) ) {s = 81;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='C') ) {s = 1;}

                        else if ( (LA14_0=='{') ) {s = 2;}

                        else if ( (LA14_0=='}') ) {s = 3;}

                        else if ( (LA14_0=='p') ) {s = 4;}

                        else if ( (LA14_0=='(') ) {s = 5;}

                        else if ( (LA14_0==',') ) {s = 6;}

                        else if ( (LA14_0==')') ) {s = 7;}

                        else if ( (LA14_0=='F') ) {s = 8;}

                        else if ( (LA14_0=='<') ) {s = 9;}

                        else if ( (LA14_0=='=') ) {s = 10;}

                        else if ( (LA14_0==';') ) {s = 11;}

                        else if ( (LA14_0=='f') ) {s = 12;}

                        else if ( (LA14_0==':') ) {s = 13;}

                        else if ( (LA14_0=='i') ) {s = 14;}

                        else if ( (LA14_0=='e') ) {s = 15;}

                        else if ( (LA14_0=='[') ) {s = 16;}

                        else if ( (LA14_0==']') ) {s = 17;}

                        else if ( (LA14_0=='>') ) {s = 18;}

                        else if ( (LA14_0=='!') ) {s = 19;}

                        else if ( (LA14_0=='&') ) {s = 20;}

                        else if ( (LA14_0=='|') ) {s = 21;}

                        else if ( (LA14_0=='n') ) {s = 22;}

                        else if ( (LA14_0=='+') ) {s = 23;}

                        else if ( (LA14_0=='-') ) {s = 24;}

                        else if ( (LA14_0=='/') ) {s = 25;}

                        else if ( (LA14_0=='*') ) {s = 26;}

                        else if ( (LA14_0=='b') ) {s = 27;}

                        else if ( (LA14_0=='d') ) {s = 28;}

                        else if ( (LA14_0=='s') ) {s = 29;}

                        else if ( (LA14_0=='t') ) {s = 30;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 31;}

                        else if ( (LA14_0=='^') ) {s = 32;}

                        else if ( ((LA14_0>='A' && LA14_0<='B')||(LA14_0>='D' && LA14_0<='E')||(LA14_0>='G' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='a'||LA14_0=='c'||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='m')||LA14_0=='o'||(LA14_0>='q' && LA14_0<='r')||(LA14_0>='u' && LA14_0<='z')) ) {s = 33;}

                        else if ( (LA14_0=='\"') ) {s = 34;}

                        else if ( (LA14_0=='\'') ) {s = 35;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 36;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='#' && LA14_0<='%')||LA14_0=='.'||(LA14_0>='?' && LA14_0<='@')||LA14_0=='\\'||LA14_0=='`'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 37;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_35 = input.LA(1);

                        s = -1;
                        if ( ((LA14_35>='\u0000' && LA14_35<='\uFFFF')) ) {s = 81;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}