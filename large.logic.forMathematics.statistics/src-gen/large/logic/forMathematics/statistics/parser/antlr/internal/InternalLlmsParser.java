package large.logic.forMathematics.statistics.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import large.logic.forMathematics.statistics.services.LlmsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLlmsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Class'", "'{'", "'}'", "'Function'", "'<='", "'=>'", "'['", "','", "']'", "'('", "')'", "';'", "':'", "'for'", "'while'", "'if'", "'else-if'", "'else{'", "'int'", "'bool'", "'doubles'", "'string'", "'<'", "'>'", "'='", "'!='", "'>='", "'&&'", "'||'", "'!'", "'nor'", "'nand'", "'+'", "'-'", "'/'", "'*'", "'true'", "'false'", "'print'"
    };
    public static final int T__50=50;
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


        public InternalLlmsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLlmsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLlmsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLlms.g"; }



     	private LlmsGrammarAccess grammarAccess;

        public InternalLlmsParser(TokenStream input, LlmsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Operations";
       	}

       	@Override
       	protected LlmsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleOperations"
    // InternalLlms.g:64:1: entryRuleOperations returns [EObject current=null] : iv_ruleOperations= ruleOperations EOF ;
    public final EObject entryRuleOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperations = null;


        try {
            // InternalLlms.g:64:51: (iv_ruleOperations= ruleOperations EOF )
            // InternalLlms.g:65:2: iv_ruleOperations= ruleOperations EOF
            {
             newCompositeNode(grammarAccess.getOperationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperations=ruleOperations();

            state._fsp--;

             current =iv_ruleOperations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperations"


    // $ANTLR start "ruleOperations"
    // InternalLlms.g:71:1: ruleOperations returns [EObject current=null] : ( () otherlv_1= 'Class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_func_4_0= ruleFunctions ) ) | ( (lv_vars_5_0= rulevarParmArgs ) ) | ( (lv_conditional_6_0= ruleConditionals ) ) | ( (lv_loops_7_0= ruleLoops ) ) | ( (lv_print_8_0= rulePrints ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleOperations() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_9=null;
        EObject lv_func_4_0 = null;

        EObject lv_vars_5_0 = null;

        EObject lv_conditional_6_0 = null;

        EObject lv_loops_7_0 = null;

        EObject lv_print_8_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:77:2: ( ( () otherlv_1= 'Class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_func_4_0= ruleFunctions ) ) | ( (lv_vars_5_0= rulevarParmArgs ) ) | ( (lv_conditional_6_0= ruleConditionals ) ) | ( (lv_loops_7_0= ruleLoops ) ) | ( (lv_print_8_0= rulePrints ) ) )* otherlv_9= '}' ) )
            // InternalLlms.g:78:2: ( () otherlv_1= 'Class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_func_4_0= ruleFunctions ) ) | ( (lv_vars_5_0= rulevarParmArgs ) ) | ( (lv_conditional_6_0= ruleConditionals ) ) | ( (lv_loops_7_0= ruleLoops ) ) | ( (lv_print_8_0= rulePrints ) ) )* otherlv_9= '}' )
            {
            // InternalLlms.g:78:2: ( () otherlv_1= 'Class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_func_4_0= ruleFunctions ) ) | ( (lv_vars_5_0= rulevarParmArgs ) ) | ( (lv_conditional_6_0= ruleConditionals ) ) | ( (lv_loops_7_0= ruleLoops ) ) | ( (lv_print_8_0= rulePrints ) ) )* otherlv_9= '}' )
            // InternalLlms.g:79:3: () otherlv_1= 'Class' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_func_4_0= ruleFunctions ) ) | ( (lv_vars_5_0= rulevarParmArgs ) ) | ( (lv_conditional_6_0= ruleConditionals ) ) | ( (lv_loops_7_0= ruleLoops ) ) | ( (lv_print_8_0= rulePrints ) ) )* otherlv_9= '}'
            {
            // InternalLlms.g:79:3: ()
            // InternalLlms.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOperationsAccess().getOperationsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationsAccess().getClassKeyword_1());
            		
            // InternalLlms.g:90:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalLlms.g:91:4: (lv_name_2_0= RULE_ID )
            {
            // InternalLlms.g:91:4: (lv_name_2_0= RULE_ID )
            // InternalLlms.g:92:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getOperationsAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationsAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalLlms.g:112:3: ( ( (lv_func_4_0= ruleFunctions ) ) | ( (lv_vars_5_0= rulevarParmArgs ) ) | ( (lv_conditional_6_0= ruleConditionals ) ) | ( (lv_loops_7_0= ruleLoops ) ) | ( (lv_print_8_0= rulePrints ) ) )*
            loop1:
            do {
                int alt1=6;
                switch ( input.LA(1) ) {
                case 15:
                    {
                    alt1=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt1=2;
                    }
                    break;
                case 27:
                    {
                    alt1=3;
                    }
                    break;
                case 25:
                case 26:
                    {
                    alt1=4;
                    }
                    break;
                case 50:
                    {
                    alt1=5;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalLlms.g:113:4: ( (lv_func_4_0= ruleFunctions ) )
            	    {
            	    // InternalLlms.g:113:4: ( (lv_func_4_0= ruleFunctions ) )
            	    // InternalLlms.g:114:5: (lv_func_4_0= ruleFunctions )
            	    {
            	    // InternalLlms.g:114:5: (lv_func_4_0= ruleFunctions )
            	    // InternalLlms.g:115:6: lv_func_4_0= ruleFunctions
            	    {

            	    						newCompositeNode(grammarAccess.getOperationsAccess().getFuncFunctionsParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_func_4_0=ruleFunctions();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOperationsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"func",
            	    							lv_func_4_0,
            	    							"large.logic.forMathematics.statistics.Llms.Functions");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLlms.g:133:4: ( (lv_vars_5_0= rulevarParmArgs ) )
            	    {
            	    // InternalLlms.g:133:4: ( (lv_vars_5_0= rulevarParmArgs ) )
            	    // InternalLlms.g:134:5: (lv_vars_5_0= rulevarParmArgs )
            	    {
            	    // InternalLlms.g:134:5: (lv_vars_5_0= rulevarParmArgs )
            	    // InternalLlms.g:135:6: lv_vars_5_0= rulevarParmArgs
            	    {

            	    						newCompositeNode(grammarAccess.getOperationsAccess().getVarsVarParmArgsParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_vars_5_0=rulevarParmArgs();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOperationsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vars",
            	    							lv_vars_5_0,
            	    							"large.logic.forMathematics.statistics.Llms.varParmArgs");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLlms.g:153:4: ( (lv_conditional_6_0= ruleConditionals ) )
            	    {
            	    // InternalLlms.g:153:4: ( (lv_conditional_6_0= ruleConditionals ) )
            	    // InternalLlms.g:154:5: (lv_conditional_6_0= ruleConditionals )
            	    {
            	    // InternalLlms.g:154:5: (lv_conditional_6_0= ruleConditionals )
            	    // InternalLlms.g:155:6: lv_conditional_6_0= ruleConditionals
            	    {

            	    						newCompositeNode(grammarAccess.getOperationsAccess().getConditionalConditionalsParserRuleCall_4_2_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_conditional_6_0=ruleConditionals();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOperationsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"conditional",
            	    							lv_conditional_6_0,
            	    							"large.logic.forMathematics.statistics.Llms.Conditionals");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLlms.g:173:4: ( (lv_loops_7_0= ruleLoops ) )
            	    {
            	    // InternalLlms.g:173:4: ( (lv_loops_7_0= ruleLoops ) )
            	    // InternalLlms.g:174:5: (lv_loops_7_0= ruleLoops )
            	    {
            	    // InternalLlms.g:174:5: (lv_loops_7_0= ruleLoops )
            	    // InternalLlms.g:175:6: lv_loops_7_0= ruleLoops
            	    {

            	    						newCompositeNode(grammarAccess.getOperationsAccess().getLoopsLoopsParserRuleCall_4_3_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_loops_7_0=ruleLoops();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOperationsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"loops",
            	    							lv_loops_7_0,
            	    							"large.logic.forMathematics.statistics.Llms.Loops");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalLlms.g:193:4: ( (lv_print_8_0= rulePrints ) )
            	    {
            	    // InternalLlms.g:193:4: ( (lv_print_8_0= rulePrints ) )
            	    // InternalLlms.g:194:5: (lv_print_8_0= rulePrints )
            	    {
            	    // InternalLlms.g:194:5: (lv_print_8_0= rulePrints )
            	    // InternalLlms.g:195:6: lv_print_8_0= rulePrints
            	    {

            	    						newCompositeNode(grammarAccess.getOperationsAccess().getPrintPrintsParserRuleCall_4_4_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_print_8_0=rulePrints();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOperationsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"print",
            	    							lv_print_8_0,
            	    							"large.logic.forMathematics.statistics.Llms.Prints");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getOperationsAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperations"


    // $ANTLR start "entryRuleFunctions"
    // InternalLlms.g:221:1: entryRuleFunctions returns [EObject current=null] : iv_ruleFunctions= ruleFunctions EOF ;
    public final EObject entryRuleFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctions = null;


        try {
            // InternalLlms.g:221:50: (iv_ruleFunctions= ruleFunctions EOF )
            // InternalLlms.g:222:2: iv_ruleFunctions= ruleFunctions EOF
            {
             newCompositeNode(grammarAccess.getFunctionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctions=ruleFunctions();

            state._fsp--;

             current =iv_ruleFunctions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctions"


    // $ANTLR start "ruleFunctions"
    // InternalLlms.g:228:1: ruleFunctions returns [EObject current=null] : (otherlv_0= 'Function' ( (lv_output_1_0= ruleParametersOutptut ) ) otherlv_2= '<=' ( (lv_name_3_0= RULE_ID ) ) ( (lv_params_4_0= ruleParametersfunc ) ) otherlv_5= '=>' otherlv_6= '{' ( (lv_body_7_0= ruleBodies ) ) otherlv_8= '}' ) ;
    public final EObject ruleFunctions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_output_1_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_body_7_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:234:2: ( (otherlv_0= 'Function' ( (lv_output_1_0= ruleParametersOutptut ) ) otherlv_2= '<=' ( (lv_name_3_0= RULE_ID ) ) ( (lv_params_4_0= ruleParametersfunc ) ) otherlv_5= '=>' otherlv_6= '{' ( (lv_body_7_0= ruleBodies ) ) otherlv_8= '}' ) )
            // InternalLlms.g:235:2: (otherlv_0= 'Function' ( (lv_output_1_0= ruleParametersOutptut ) ) otherlv_2= '<=' ( (lv_name_3_0= RULE_ID ) ) ( (lv_params_4_0= ruleParametersfunc ) ) otherlv_5= '=>' otherlv_6= '{' ( (lv_body_7_0= ruleBodies ) ) otherlv_8= '}' )
            {
            // InternalLlms.g:235:2: (otherlv_0= 'Function' ( (lv_output_1_0= ruleParametersOutptut ) ) otherlv_2= '<=' ( (lv_name_3_0= RULE_ID ) ) ( (lv_params_4_0= ruleParametersfunc ) ) otherlv_5= '=>' otherlv_6= '{' ( (lv_body_7_0= ruleBodies ) ) otherlv_8= '}' )
            // InternalLlms.g:236:3: otherlv_0= 'Function' ( (lv_output_1_0= ruleParametersOutptut ) ) otherlv_2= '<=' ( (lv_name_3_0= RULE_ID ) ) ( (lv_params_4_0= ruleParametersfunc ) ) otherlv_5= '=>' otherlv_6= '{' ( (lv_body_7_0= ruleBodies ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionsAccess().getFunctionKeyword_0());
            		
            // InternalLlms.g:240:3: ( (lv_output_1_0= ruleParametersOutptut ) )
            // InternalLlms.g:241:4: (lv_output_1_0= ruleParametersOutptut )
            {
            // InternalLlms.g:241:4: (lv_output_1_0= ruleParametersOutptut )
            // InternalLlms.g:242:5: lv_output_1_0= ruleParametersOutptut
            {

            					newCompositeNode(grammarAccess.getFunctionsAccess().getOutputParametersOutptutParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_output_1_0=ruleParametersOutptut();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionsRule());
            					}
            					set(
            						current,
            						"output",
            						lv_output_1_0,
            						"large.logic.forMathematics.statistics.Llms.ParametersOutptut");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionsAccess().getLessThanSignEqualsSignKeyword_2());
            		
            // InternalLlms.g:263:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalLlms.g:264:4: (lv_name_3_0= RULE_ID )
            {
            // InternalLlms.g:264:4: (lv_name_3_0= RULE_ID )
            // InternalLlms.g:265:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_3_0, grammarAccess.getFunctionsAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalLlms.g:281:3: ( (lv_params_4_0= ruleParametersfunc ) )
            // InternalLlms.g:282:4: (lv_params_4_0= ruleParametersfunc )
            {
            // InternalLlms.g:282:4: (lv_params_4_0= ruleParametersfunc )
            // InternalLlms.g:283:5: lv_params_4_0= ruleParametersfunc
            {

            					newCompositeNode(grammarAccess.getFunctionsAccess().getParamsParametersfuncParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_params_4_0=ruleParametersfunc();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionsRule());
            					}
            					set(
            						current,
            						"params",
            						lv_params_4_0,
            						"large.logic.forMathematics.statistics.Llms.Parametersfunc");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionsAccess().getEqualsSignGreaterThanSignKeyword_5());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getFunctionsAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalLlms.g:308:3: ( (lv_body_7_0= ruleBodies ) )
            // InternalLlms.g:309:4: (lv_body_7_0= ruleBodies )
            {
            // InternalLlms.g:309:4: (lv_body_7_0= ruleBodies )
            // InternalLlms.g:310:5: lv_body_7_0= ruleBodies
            {

            					newCompositeNode(grammarAccess.getFunctionsAccess().getBodyBodiesParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_11);
            lv_body_7_0=ruleBodies();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionsRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_7_0,
            						"large.logic.forMathematics.statistics.Llms.Bodies");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getFunctionsAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctions"


    // $ANTLR start "entryRuleParametersOutptut"
    // InternalLlms.g:335:1: entryRuleParametersOutptut returns [EObject current=null] : iv_ruleParametersOutptut= ruleParametersOutptut EOF ;
    public final EObject entryRuleParametersOutptut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametersOutptut = null;


        try {
            // InternalLlms.g:335:58: (iv_ruleParametersOutptut= ruleParametersOutptut EOF )
            // InternalLlms.g:336:2: iv_ruleParametersOutptut= ruleParametersOutptut EOF
            {
             newCompositeNode(grammarAccess.getParametersOutptutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParametersOutptut=ruleParametersOutptut();

            state._fsp--;

             current =iv_ruleParametersOutptut; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParametersOutptut"


    // $ANTLR start "ruleParametersOutptut"
    // InternalLlms.g:342:1: ruleParametersOutptut returns [EObject current=null] : ( ( (lv_param_0_0= rulevarParmArgs ) ) | (otherlv_1= '[' () ( ( (lv_params_3_0= rulevarParmArgs ) ) (otherlv_4= ',' ( (lv_params_5_0= rulevarParmArgs ) ) )* )? otherlv_6= ']' ) ) ;
    public final EObject ruleParametersOutptut() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_param_0_0 = null;

        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:348:2: ( ( ( (lv_param_0_0= rulevarParmArgs ) ) | (otherlv_1= '[' () ( ( (lv_params_3_0= rulevarParmArgs ) ) (otherlv_4= ',' ( (lv_params_5_0= rulevarParmArgs ) ) )* )? otherlv_6= ']' ) ) )
            // InternalLlms.g:349:2: ( ( (lv_param_0_0= rulevarParmArgs ) ) | (otherlv_1= '[' () ( ( (lv_params_3_0= rulevarParmArgs ) ) (otherlv_4= ',' ( (lv_params_5_0= rulevarParmArgs ) ) )* )? otherlv_6= ']' ) )
            {
            // InternalLlms.g:349:2: ( ( (lv_param_0_0= rulevarParmArgs ) ) | (otherlv_1= '[' () ( ( (lv_params_3_0= rulevarParmArgs ) ) (otherlv_4= ',' ( (lv_params_5_0= rulevarParmArgs ) ) )* )? otherlv_6= ']' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLlms.g:350:3: ( (lv_param_0_0= rulevarParmArgs ) )
                    {
                    // InternalLlms.g:350:3: ( (lv_param_0_0= rulevarParmArgs ) )
                    // InternalLlms.g:351:4: (lv_param_0_0= rulevarParmArgs )
                    {
                    // InternalLlms.g:351:4: (lv_param_0_0= rulevarParmArgs )
                    // InternalLlms.g:352:5: lv_param_0_0= rulevarParmArgs
                    {

                    					newCompositeNode(grammarAccess.getParametersOutptutAccess().getParamVarParmArgsParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_param_0_0=rulevarParmArgs();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParametersOutptutRule());
                    					}
                    					set(
                    						current,
                    						"param",
                    						lv_param_0_0,
                    						"large.logic.forMathematics.statistics.Llms.varParmArgs");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLlms.g:370:3: (otherlv_1= '[' () ( ( (lv_params_3_0= rulevarParmArgs ) ) (otherlv_4= ',' ( (lv_params_5_0= rulevarParmArgs ) ) )* )? otherlv_6= ']' )
                    {
                    // InternalLlms.g:370:3: (otherlv_1= '[' () ( ( (lv_params_3_0= rulevarParmArgs ) ) (otherlv_4= ',' ( (lv_params_5_0= rulevarParmArgs ) ) )* )? otherlv_6= ']' )
                    // InternalLlms.g:371:4: otherlv_1= '[' () ( ( (lv_params_3_0= rulevarParmArgs ) ) (otherlv_4= ',' ( (lv_params_5_0= rulevarParmArgs ) ) )* )? otherlv_6= ']'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getParametersOutptutAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalLlms.g:375:4: ()
                    // InternalLlms.g:376:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getParametersOutptutAccess().getParametersOutptutAction_1_1(),
                    						current);
                    				

                    }

                    // InternalLlms.g:382:4: ( ( (lv_params_3_0= rulevarParmArgs ) ) (otherlv_4= ',' ( (lv_params_5_0= rulevarParmArgs ) ) )* )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_ID) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalLlms.g:383:5: ( (lv_params_3_0= rulevarParmArgs ) ) (otherlv_4= ',' ( (lv_params_5_0= rulevarParmArgs ) ) )*
                            {
                            // InternalLlms.g:383:5: ( (lv_params_3_0= rulevarParmArgs ) )
                            // InternalLlms.g:384:6: (lv_params_3_0= rulevarParmArgs )
                            {
                            // InternalLlms.g:384:6: (lv_params_3_0= rulevarParmArgs )
                            // InternalLlms.g:385:7: lv_params_3_0= rulevarParmArgs
                            {

                            							newCompositeNode(grammarAccess.getParametersOutptutAccess().getParamsVarParmArgsParserRuleCall_1_2_0_0());
                            						
                            pushFollow(FOLLOW_13);
                            lv_params_3_0=rulevarParmArgs();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getParametersOutptutRule());
                            							}
                            							add(
                            								current,
                            								"params",
                            								lv_params_3_0,
                            								"large.logic.forMathematics.statistics.Llms.varParmArgs");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalLlms.g:402:5: (otherlv_4= ',' ( (lv_params_5_0= rulevarParmArgs ) ) )*
                            loop2:
                            do {
                                int alt2=2;
                                int LA2_0 = input.LA(1);

                                if ( (LA2_0==19) ) {
                                    alt2=1;
                                }


                                switch (alt2) {
                            	case 1 :
                            	    // InternalLlms.g:403:6: otherlv_4= ',' ( (lv_params_5_0= rulevarParmArgs ) )
                            	    {
                            	    otherlv_4=(Token)match(input,19,FOLLOW_3); 

                            	    						newLeafNode(otherlv_4, grammarAccess.getParametersOutptutAccess().getCommaKeyword_1_2_1_0());
                            	    					
                            	    // InternalLlms.g:407:6: ( (lv_params_5_0= rulevarParmArgs ) )
                            	    // InternalLlms.g:408:7: (lv_params_5_0= rulevarParmArgs )
                            	    {
                            	    // InternalLlms.g:408:7: (lv_params_5_0= rulevarParmArgs )
                            	    // InternalLlms.g:409:8: lv_params_5_0= rulevarParmArgs
                            	    {

                            	    								newCompositeNode(grammarAccess.getParametersOutptutAccess().getParamsVarParmArgsParserRuleCall_1_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_13);
                            	    lv_params_5_0=rulevarParmArgs();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getParametersOutptutRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"params",
                            	    									lv_params_5_0,
                            	    									"large.logic.forMathematics.statistics.Llms.varParmArgs");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop2;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getParametersOutptutAccess().getRightSquareBracketKeyword_1_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParametersOutptut"


    // $ANTLR start "entryRuleParametersfunc"
    // InternalLlms.g:437:1: entryRuleParametersfunc returns [EObject current=null] : iv_ruleParametersfunc= ruleParametersfunc EOF ;
    public final EObject entryRuleParametersfunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametersfunc = null;


        try {
            // InternalLlms.g:437:55: (iv_ruleParametersfunc= ruleParametersfunc EOF )
            // InternalLlms.g:438:2: iv_ruleParametersfunc= ruleParametersfunc EOF
            {
             newCompositeNode(grammarAccess.getParametersfuncRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParametersfunc=ruleParametersfunc();

            state._fsp--;

             current =iv_ruleParametersfunc; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParametersfunc"


    // $ANTLR start "ruleParametersfunc"
    // InternalLlms.g:444:1: ruleParametersfunc returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleParametersfunc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:450:2: ( (otherlv_0= '(' () ( ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalLlms.g:451:2: (otherlv_0= '(' () ( ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalLlms.g:451:2: (otherlv_0= '(' () ( ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalLlms.g:452:3: otherlv_0= '(' () ( ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getParametersfuncAccess().getLeftParenthesisKeyword_0());
            		
            // InternalLlms.g:456:3: ()
            // InternalLlms.g:457:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParametersfuncAccess().getFunOutputsAction_1(),
            					current);
            			

            }

            // InternalLlms.g:463:3: ( ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_DOUBLE)||LA6_0==16||(LA6_0>=34 && LA6_0<=43)||(LA6_0>=48 && LA6_0<=49)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalLlms.g:464:4: ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )*
                    {
                    // InternalLlms.g:464:4: ( (lv_params_2_0= ruleExpression ) )
                    // InternalLlms.g:465:5: (lv_params_2_0= ruleExpression )
                    {
                    // InternalLlms.g:465:5: (lv_params_2_0= ruleExpression )
                    // InternalLlms.g:466:6: lv_params_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getParametersfuncAccess().getParamsExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_params_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParametersfuncRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_2_0,
                    							"large.logic.forMathematics.statistics.Llms.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLlms.g:483:4: (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==19) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalLlms.g:484:5: otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_16); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getParametersfuncAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalLlms.g:488:5: ( (lv_params_4_0= ruleExpression ) )
                    	    // InternalLlms.g:489:6: (lv_params_4_0= ruleExpression )
                    	    {
                    	    // InternalLlms.g:489:6: (lv_params_4_0= ruleExpression )
                    	    // InternalLlms.g:490:7: lv_params_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getParametersfuncAccess().getParamsExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_params_4_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParametersfuncRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_4_0,
                    	    								"large.logic.forMathematics.statistics.Llms.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParametersfuncAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParametersfunc"


    // $ANTLR start "entryRuleBodies"
    // InternalLlms.g:517:1: entryRuleBodies returns [EObject current=null] : iv_ruleBodies= ruleBodies EOF ;
    public final EObject entryRuleBodies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodies = null;


        try {
            // InternalLlms.g:517:47: (iv_ruleBodies= ruleBodies EOF )
            // InternalLlms.g:518:2: iv_ruleBodies= ruleBodies EOF
            {
             newCompositeNode(grammarAccess.getBodiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBodies=ruleBodies();

            state._fsp--;

             current =iv_ruleBodies; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBodies"


    // $ANTLR start "ruleBodies"
    // InternalLlms.g:524:1: ruleBodies returns [EObject current=null] : ( () ( ( (lv_var_1_0= ruleGenericVariable ) ) | ( (lv_loops_2_0= ruleLoops ) ) | ( (lv_cond_3_0= ruleConditionals ) ) )+ otherlv_4= ';' ) ;
    public final EObject ruleBodies() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_var_1_0 = null;

        EObject lv_loops_2_0 = null;

        EObject lv_cond_3_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:530:2: ( ( () ( ( (lv_var_1_0= ruleGenericVariable ) ) | ( (lv_loops_2_0= ruleLoops ) ) | ( (lv_cond_3_0= ruleConditionals ) ) )+ otherlv_4= ';' ) )
            // InternalLlms.g:531:2: ( () ( ( (lv_var_1_0= ruleGenericVariable ) ) | ( (lv_loops_2_0= ruleLoops ) ) | ( (lv_cond_3_0= ruleConditionals ) ) )+ otherlv_4= ';' )
            {
            // InternalLlms.g:531:2: ( () ( ( (lv_var_1_0= ruleGenericVariable ) ) | ( (lv_loops_2_0= ruleLoops ) ) | ( (lv_cond_3_0= ruleConditionals ) ) )+ otherlv_4= ';' )
            // InternalLlms.g:532:3: () ( ( (lv_var_1_0= ruleGenericVariable ) ) | ( (lv_loops_2_0= ruleLoops ) ) | ( (lv_cond_3_0= ruleConditionals ) ) )+ otherlv_4= ';'
            {
            // InternalLlms.g:532:3: ()
            // InternalLlms.g:533:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBodiesAccess().getBodiesAction_0(),
            					current);
            			

            }

            // InternalLlms.g:539:3: ( ( (lv_var_1_0= ruleGenericVariable ) ) | ( (lv_loops_2_0= ruleLoops ) ) | ( (lv_cond_3_0= ruleConditionals ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=4;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt7=1;
                    }
                    break;
                case 25:
                case 26:
                    {
                    alt7=2;
                    }
                    break;
                case 27:
                    {
                    alt7=3;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // InternalLlms.g:540:4: ( (lv_var_1_0= ruleGenericVariable ) )
            	    {
            	    // InternalLlms.g:540:4: ( (lv_var_1_0= ruleGenericVariable ) )
            	    // InternalLlms.g:541:5: (lv_var_1_0= ruleGenericVariable )
            	    {
            	    // InternalLlms.g:541:5: (lv_var_1_0= ruleGenericVariable )
            	    // InternalLlms.g:542:6: lv_var_1_0= ruleGenericVariable
            	    {

            	    						newCompositeNode(grammarAccess.getBodiesAccess().getVarGenericVariableParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_var_1_0=ruleGenericVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBodiesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"var",
            	    							lv_var_1_0,
            	    							"large.logic.forMathematics.statistics.Llms.GenericVariable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLlms.g:560:4: ( (lv_loops_2_0= ruleLoops ) )
            	    {
            	    // InternalLlms.g:560:4: ( (lv_loops_2_0= ruleLoops ) )
            	    // InternalLlms.g:561:5: (lv_loops_2_0= ruleLoops )
            	    {
            	    // InternalLlms.g:561:5: (lv_loops_2_0= ruleLoops )
            	    // InternalLlms.g:562:6: lv_loops_2_0= ruleLoops
            	    {

            	    						newCompositeNode(grammarAccess.getBodiesAccess().getLoopsLoopsParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_loops_2_0=ruleLoops();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBodiesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"loops",
            	    							lv_loops_2_0,
            	    							"large.logic.forMathematics.statistics.Llms.Loops");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLlms.g:580:4: ( (lv_cond_3_0= ruleConditionals ) )
            	    {
            	    // InternalLlms.g:580:4: ( (lv_cond_3_0= ruleConditionals ) )
            	    // InternalLlms.g:581:5: (lv_cond_3_0= ruleConditionals )
            	    {
            	    // InternalLlms.g:581:5: (lv_cond_3_0= ruleConditionals )
            	    // InternalLlms.g:582:6: lv_cond_3_0= ruleConditionals
            	    {

            	    						newCompositeNode(grammarAccess.getBodiesAccess().getCondConditionalsParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_cond_3_0=ruleConditionals();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBodiesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"cond",
            	    							lv_cond_3_0,
            	    							"large.logic.forMathematics.statistics.Llms.Conditionals");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getBodiesAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBodies"


    // $ANTLR start "entryRulevarParmArgs"
    // InternalLlms.g:608:1: entryRulevarParmArgs returns [EObject current=null] : iv_rulevarParmArgs= rulevarParmArgs EOF ;
    public final EObject entryRulevarParmArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevarParmArgs = null;


        try {
            // InternalLlms.g:608:52: (iv_rulevarParmArgs= rulevarParmArgs EOF )
            // InternalLlms.g:609:2: iv_rulevarParmArgs= rulevarParmArgs EOF
            {
             newCompositeNode(grammarAccess.getVarParmArgsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevarParmArgs=rulevarParmArgs();

            state._fsp--;

             current =iv_rulevarParmArgs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevarParmArgs"


    // $ANTLR start "rulevarParmArgs"
    // InternalLlms.g:615:1: rulevarParmArgs returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_dataType_2_0= ruleDataTypes ) ) (otherlv_3= '<=' ( (lv_exp_4_0= ruleExpression ) ) ) ) ;
    public final EObject rulevarParmArgs() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_dataType_2_0 = null;

        EObject lv_exp_4_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:621:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_dataType_2_0= ruleDataTypes ) ) (otherlv_3= '<=' ( (lv_exp_4_0= ruleExpression ) ) ) ) )
            // InternalLlms.g:622:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_dataType_2_0= ruleDataTypes ) ) (otherlv_3= '<=' ( (lv_exp_4_0= ruleExpression ) ) ) )
            {
            // InternalLlms.g:622:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_dataType_2_0= ruleDataTypes ) ) (otherlv_3= '<=' ( (lv_exp_4_0= ruleExpression ) ) ) )
            // InternalLlms.g:623:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_dataType_2_0= ruleDataTypes ) ) (otherlv_3= '<=' ( (lv_exp_4_0= ruleExpression ) ) )
            {
            // InternalLlms.g:623:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalLlms.g:624:4: (lv_name_0_0= RULE_ID )
            {
            // InternalLlms.g:624:4: (lv_name_0_0= RULE_ID )
            // InternalLlms.g:625:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVarParmArgsAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarParmArgsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getVarParmArgsAccess().getColonKeyword_1());
            		
            // InternalLlms.g:645:3: ( (lv_dataType_2_0= ruleDataTypes ) )
            // InternalLlms.g:646:4: (lv_dataType_2_0= ruleDataTypes )
            {
            // InternalLlms.g:646:4: (lv_dataType_2_0= ruleDataTypes )
            // InternalLlms.g:647:5: lv_dataType_2_0= ruleDataTypes
            {

            					newCompositeNode(grammarAccess.getVarParmArgsAccess().getDataTypeDataTypesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_dataType_2_0=ruleDataTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarParmArgsRule());
            					}
            					set(
            						current,
            						"dataType",
            						lv_dataType_2_0,
            						"large.logic.forMathematics.statistics.Llms.DataTypes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLlms.g:664:3: (otherlv_3= '<=' ( (lv_exp_4_0= ruleExpression ) ) )
            // InternalLlms.g:665:4: otherlv_3= '<=' ( (lv_exp_4_0= ruleExpression ) )
            {
            otherlv_3=(Token)match(input,16,FOLLOW_16); 

            				newLeafNode(otherlv_3, grammarAccess.getVarParmArgsAccess().getLessThanSignEqualsSignKeyword_3_0());
            			
            // InternalLlms.g:669:4: ( (lv_exp_4_0= ruleExpression ) )
            // InternalLlms.g:670:5: (lv_exp_4_0= ruleExpression )
            {
            // InternalLlms.g:670:5: (lv_exp_4_0= ruleExpression )
            // InternalLlms.g:671:6: lv_exp_4_0= ruleExpression
            {

            						newCompositeNode(grammarAccess.getVarParmArgsAccess().getExpExpressionParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_2);
            lv_exp_4_0=ruleExpression();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getVarParmArgsRule());
            						}
            						set(
            							current,
            							"exp",
            							lv_exp_4_0,
            							"large.logic.forMathematics.statistics.Llms.Expression");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevarParmArgs"


    // $ANTLR start "entryRuleExpression"
    // InternalLlms.g:693:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalLlms.g:693:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalLlms.g:694:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalLlms.g:700:1: ruleExpression returns [EObject current=null] : ( (lv_op_0_0= ruleOperation ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_op_0_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:706:2: ( ( (lv_op_0_0= ruleOperation ) ) )
            // InternalLlms.g:707:2: ( (lv_op_0_0= ruleOperation ) )
            {
            // InternalLlms.g:707:2: ( (lv_op_0_0= ruleOperation ) )
            // InternalLlms.g:708:3: (lv_op_0_0= ruleOperation )
            {
            // InternalLlms.g:708:3: (lv_op_0_0= ruleOperation )
            // InternalLlms.g:709:4: lv_op_0_0= ruleOperation
            {

            				newCompositeNode(grammarAccess.getExpressionAccess().getOpOperationParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_op_0_0=ruleOperation();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getExpressionRule());
            				}
            				set(
            					current,
            					"op",
            					lv_op_0_0,
            					"large.logic.forMathematics.statistics.Llms.Operation");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleGenericVariable"
    // InternalLlms.g:729:1: entryRuleGenericVariable returns [EObject current=null] : iv_ruleGenericVariable= ruleGenericVariable EOF ;
    public final EObject entryRuleGenericVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericVariable = null;


        try {
            // InternalLlms.g:729:56: (iv_ruleGenericVariable= ruleGenericVariable EOF )
            // InternalLlms.g:730:2: iv_ruleGenericVariable= ruleGenericVariable EOF
            {
             newCompositeNode(grammarAccess.getGenericVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenericVariable=ruleGenericVariable();

            state._fsp--;

             current =iv_ruleGenericVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenericVariable"


    // $ANTLR start "ruleGenericVariable"
    // InternalLlms.g:736:1: ruleGenericVariable returns [EObject current=null] : (this_CallVariable_0= ruleCallVariable | this_varParmArgs_1= rulevarParmArgs | this_Assignment_2= ruleAssignment | this_OnlyVar_3= ruleOnlyVar ) ;
    public final EObject ruleGenericVariable() throws RecognitionException {
        EObject current = null;

        EObject this_CallVariable_0 = null;

        EObject this_varParmArgs_1 = null;

        EObject this_Assignment_2 = null;

        EObject this_OnlyVar_3 = null;



        	enterRule();

        try {
            // InternalLlms.g:742:2: ( (this_CallVariable_0= ruleCallVariable | this_varParmArgs_1= rulevarParmArgs | this_Assignment_2= ruleAssignment | this_OnlyVar_3= ruleOnlyVar ) )
            // InternalLlms.g:743:2: (this_CallVariable_0= ruleCallVariable | this_varParmArgs_1= rulevarParmArgs | this_Assignment_2= ruleAssignment | this_OnlyVar_3= ruleOnlyVar )
            {
            // InternalLlms.g:743:2: (this_CallVariable_0= ruleCallVariable | this_varParmArgs_1= rulevarParmArgs | this_Assignment_2= ruleAssignment | this_OnlyVar_3= ruleOnlyVar )
            int alt8=4;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalLlms.g:744:3: this_CallVariable_0= ruleCallVariable
                    {

                    			newCompositeNode(grammarAccess.getGenericVariableAccess().getCallVariableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CallVariable_0=ruleCallVariable();

                    state._fsp--;


                    			current = this_CallVariable_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLlms.g:753:3: this_varParmArgs_1= rulevarParmArgs
                    {

                    			newCompositeNode(grammarAccess.getGenericVariableAccess().getVarParmArgsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_varParmArgs_1=rulevarParmArgs();

                    state._fsp--;


                    			current = this_varParmArgs_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLlms.g:762:3: this_Assignment_2= ruleAssignment
                    {

                    			newCompositeNode(grammarAccess.getGenericVariableAccess().getAssignmentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Assignment_2=ruleAssignment();

                    state._fsp--;


                    			current = this_Assignment_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLlms.g:771:3: this_OnlyVar_3= ruleOnlyVar
                    {

                    			newCompositeNode(grammarAccess.getGenericVariableAccess().getOnlyVarParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_OnlyVar_3=ruleOnlyVar();

                    state._fsp--;


                    			current = this_OnlyVar_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenericVariable"


    // $ANTLR start "entryRuleLoops"
    // InternalLlms.g:783:1: entryRuleLoops returns [EObject current=null] : iv_ruleLoops= ruleLoops EOF ;
    public final EObject entryRuleLoops() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoops = null;


        try {
            // InternalLlms.g:783:46: (iv_ruleLoops= ruleLoops EOF )
            // InternalLlms.g:784:2: iv_ruleLoops= ruleLoops EOF
            {
             newCompositeNode(grammarAccess.getLoopsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoops=ruleLoops();

            state._fsp--;

             current =iv_ruleLoops; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoops"


    // $ANTLR start "ruleLoops"
    // InternalLlms.g:790:1: ruleLoops returns [EObject current=null] : (this_Fors_0= ruleFors | this_Whiles_1= ruleWhiles ) ;
    public final EObject ruleLoops() throws RecognitionException {
        EObject current = null;

        EObject this_Fors_0 = null;

        EObject this_Whiles_1 = null;



        	enterRule();

        try {
            // InternalLlms.g:796:2: ( (this_Fors_0= ruleFors | this_Whiles_1= ruleWhiles ) )
            // InternalLlms.g:797:2: (this_Fors_0= ruleFors | this_Whiles_1= ruleWhiles )
            {
            // InternalLlms.g:797:2: (this_Fors_0= ruleFors | this_Whiles_1= ruleWhiles )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalLlms.g:798:3: this_Fors_0= ruleFors
                    {

                    			newCompositeNode(grammarAccess.getLoopsAccess().getForsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fors_0=ruleFors();

                    state._fsp--;


                    			current = this_Fors_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLlms.g:807:3: this_Whiles_1= ruleWhiles
                    {

                    			newCompositeNode(grammarAccess.getLoopsAccess().getWhilesParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Whiles_1=ruleWhiles();

                    state._fsp--;


                    			current = this_Whiles_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoops"


    // $ANTLR start "entryRuleFors"
    // InternalLlms.g:819:1: entryRuleFors returns [EObject current=null] : iv_ruleFors= ruleFors EOF ;
    public final EObject entryRuleFors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFors = null;


        try {
            // InternalLlms.g:819:45: (iv_ruleFors= ruleFors EOF )
            // InternalLlms.g:820:2: iv_ruleFors= ruleFors EOF
            {
             newCompositeNode(grammarAccess.getForsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFors=ruleFors();

            state._fsp--;

             current =iv_ruleFors; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFors"


    // $ANTLR start "ruleFors"
    // InternalLlms.g:826:1: ruleFors returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleGenericVariable ) ) otherlv_3= ':' ( (lv_number_4_0= ruleNumbers ) ) otherlv_5= ')' otherlv_6= '=>' otherlv_7= '{' ( (lv_body_8_0= ruleBodies ) )+ otherlv_9= '}' ) ;
    public final EObject ruleFors() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_var_2_0 = null;

        EObject lv_number_4_0 = null;

        EObject lv_body_8_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:832:2: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleGenericVariable ) ) otherlv_3= ':' ( (lv_number_4_0= ruleNumbers ) ) otherlv_5= ')' otherlv_6= '=>' otherlv_7= '{' ( (lv_body_8_0= ruleBodies ) )+ otherlv_9= '}' ) )
            // InternalLlms.g:833:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleGenericVariable ) ) otherlv_3= ':' ( (lv_number_4_0= ruleNumbers ) ) otherlv_5= ')' otherlv_6= '=>' otherlv_7= '{' ( (lv_body_8_0= ruleBodies ) )+ otherlv_9= '}' )
            {
            // InternalLlms.g:833:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleGenericVariable ) ) otherlv_3= ':' ( (lv_number_4_0= ruleNumbers ) ) otherlv_5= ')' otherlv_6= '=>' otherlv_7= '{' ( (lv_body_8_0= ruleBodies ) )+ otherlv_9= '}' )
            // InternalLlms.g:834:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleGenericVariable ) ) otherlv_3= ':' ( (lv_number_4_0= ruleNumbers ) ) otherlv_5= ')' otherlv_6= '=>' otherlv_7= '{' ( (lv_body_8_0= ruleBodies ) )+ otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getForsAccess().getForKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getForsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLlms.g:842:3: ( (lv_var_2_0= ruleGenericVariable ) )
            // InternalLlms.g:843:4: (lv_var_2_0= ruleGenericVariable )
            {
            // InternalLlms.g:843:4: (lv_var_2_0= ruleGenericVariable )
            // InternalLlms.g:844:5: lv_var_2_0= ruleGenericVariable
            {

            					newCompositeNode(grammarAccess.getForsAccess().getVarGenericVariableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_var_2_0=ruleGenericVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForsRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_2_0,
            						"large.logic.forMathematics.statistics.Llms.GenericVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getForsAccess().getColonKeyword_3());
            		
            // InternalLlms.g:865:3: ( (lv_number_4_0= ruleNumbers ) )
            // InternalLlms.g:866:4: (lv_number_4_0= ruleNumbers )
            {
            // InternalLlms.g:866:4: (lv_number_4_0= ruleNumbers )
            // InternalLlms.g:867:5: lv_number_4_0= ruleNumbers
            {

            					newCompositeNode(grammarAccess.getForsAccess().getNumberNumbersParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
            lv_number_4_0=ruleNumbers();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForsRule());
            					}
            					set(
            						current,
            						"number",
            						lv_number_4_0,
            						"large.logic.forMathematics.statistics.Llms.Numbers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getForsAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getForsAccess().getEqualsSignGreaterThanSignKeyword_6());
            		
            otherlv_7=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getForsAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalLlms.g:896:3: ( (lv_body_8_0= ruleBodies ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=25 && LA10_0<=27)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLlms.g:897:4: (lv_body_8_0= ruleBodies )
            	    {
            	    // InternalLlms.g:897:4: (lv_body_8_0= ruleBodies )
            	    // InternalLlms.g:898:5: lv_body_8_0= ruleBodies
            	    {

            	    					newCompositeNode(grammarAccess.getForsAccess().getBodyBodiesParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_body_8_0=ruleBodies();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getForsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"body",
            	    						lv_body_8_0,
            	    						"large.logic.forMathematics.statistics.Llms.Bodies");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getForsAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFors"


    // $ANTLR start "entryRuleWhiles"
    // InternalLlms.g:923:1: entryRuleWhiles returns [EObject current=null] : iv_ruleWhiles= ruleWhiles EOF ;
    public final EObject entryRuleWhiles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhiles = null;


        try {
            // InternalLlms.g:923:47: (iv_ruleWhiles= ruleWhiles EOF )
            // InternalLlms.g:924:2: iv_ruleWhiles= ruleWhiles EOF
            {
             newCompositeNode(grammarAccess.getWhilesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhiles=ruleWhiles();

            state._fsp--;

             current =iv_ruleWhiles; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhiles"


    // $ANTLR start "ruleWhiles"
    // InternalLlms.g:930:1: ruleWhiles returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_logical_2_0= ruleLogicalParams ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_bodie_5_0= ruleBodies ) )+ otherlv_6= '}' ) ;
    public final EObject ruleWhiles() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_logical_2_0 = null;

        EObject lv_bodie_5_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:936:2: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_logical_2_0= ruleLogicalParams ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_bodie_5_0= ruleBodies ) )+ otherlv_6= '}' ) )
            // InternalLlms.g:937:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_logical_2_0= ruleLogicalParams ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_bodie_5_0= ruleBodies ) )+ otherlv_6= '}' )
            {
            // InternalLlms.g:937:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_logical_2_0= ruleLogicalParams ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_bodie_5_0= ruleBodies ) )+ otherlv_6= '}' )
            // InternalLlms.g:938:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_logical_2_0= ruleLogicalParams ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_bodie_5_0= ruleBodies ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getWhilesAccess().getWhileKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getWhilesAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLlms.g:946:3: ( (lv_logical_2_0= ruleLogicalParams ) )
            // InternalLlms.g:947:4: (lv_logical_2_0= ruleLogicalParams )
            {
            // InternalLlms.g:947:4: (lv_logical_2_0= ruleLogicalParams )
            // InternalLlms.g:948:5: lv_logical_2_0= ruleLogicalParams
            {

            					newCompositeNode(grammarAccess.getWhilesAccess().getLogicalLogicalParamsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_logical_2_0=ruleLogicalParams();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhilesRule());
            					}
            					set(
            						current,
            						"logical",
            						lv_logical_2_0,
            						"large.logic.forMathematics.statistics.Llms.LogicalParams");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getWhilesAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getWhilesAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalLlms.g:973:3: ( (lv_bodie_5_0= ruleBodies ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||(LA11_0>=25 && LA11_0<=27)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLlms.g:974:4: (lv_bodie_5_0= ruleBodies )
            	    {
            	    // InternalLlms.g:974:4: (lv_bodie_5_0= ruleBodies )
            	    // InternalLlms.g:975:5: lv_bodie_5_0= ruleBodies
            	    {

            	    					newCompositeNode(grammarAccess.getWhilesAccess().getBodieBodiesParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_bodie_5_0=ruleBodies();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWhilesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bodie",
            	    						lv_bodie_5_0,
            	    						"large.logic.forMathematics.statistics.Llms.Bodies");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getWhilesAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhiles"


    // $ANTLR start "entryRuleConditionals"
    // InternalLlms.g:1000:1: entryRuleConditionals returns [EObject current=null] : iv_ruleConditionals= ruleConditionals EOF ;
    public final EObject entryRuleConditionals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionals = null;


        try {
            // InternalLlms.g:1000:53: (iv_ruleConditionals= ruleConditionals EOF )
            // InternalLlms.g:1001:2: iv_ruleConditionals= ruleConditionals EOF
            {
             newCompositeNode(grammarAccess.getConditionalsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionals=ruleConditionals();

            state._fsp--;

             current =iv_ruleConditionals; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionals"


    // $ANTLR start "ruleConditionals"
    // InternalLlms.g:1007:1: ruleConditionals returns [EObject current=null] : ( ( (lv_ifs_0_0= ruleIfs ) ) ( (lv_elseif_1_0= ruleElseIfs ) )* ( (lv_elses_2_0= ruleElses ) ) ) ;
    public final EObject ruleConditionals() throws RecognitionException {
        EObject current = null;

        EObject lv_ifs_0_0 = null;

        EObject lv_elseif_1_0 = null;

        EObject lv_elses_2_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:1013:2: ( ( ( (lv_ifs_0_0= ruleIfs ) ) ( (lv_elseif_1_0= ruleElseIfs ) )* ( (lv_elses_2_0= ruleElses ) ) ) )
            // InternalLlms.g:1014:2: ( ( (lv_ifs_0_0= ruleIfs ) ) ( (lv_elseif_1_0= ruleElseIfs ) )* ( (lv_elses_2_0= ruleElses ) ) )
            {
            // InternalLlms.g:1014:2: ( ( (lv_ifs_0_0= ruleIfs ) ) ( (lv_elseif_1_0= ruleElseIfs ) )* ( (lv_elses_2_0= ruleElses ) ) )
            // InternalLlms.g:1015:3: ( (lv_ifs_0_0= ruleIfs ) ) ( (lv_elseif_1_0= ruleElseIfs ) )* ( (lv_elses_2_0= ruleElses ) )
            {
            // InternalLlms.g:1015:3: ( (lv_ifs_0_0= ruleIfs ) )
            // InternalLlms.g:1016:4: (lv_ifs_0_0= ruleIfs )
            {
            // InternalLlms.g:1016:4: (lv_ifs_0_0= ruleIfs )
            // InternalLlms.g:1017:5: lv_ifs_0_0= ruleIfs
            {

            					newCompositeNode(grammarAccess.getConditionalsAccess().getIfsIfsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
            lv_ifs_0_0=ruleIfs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalsRule());
            					}
            					set(
            						current,
            						"ifs",
            						lv_ifs_0_0,
            						"large.logic.forMathematics.statistics.Llms.Ifs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLlms.g:1034:3: ( (lv_elseif_1_0= ruleElseIfs ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLlms.g:1035:4: (lv_elseif_1_0= ruleElseIfs )
            	    {
            	    // InternalLlms.g:1035:4: (lv_elseif_1_0= ruleElseIfs )
            	    // InternalLlms.g:1036:5: lv_elseif_1_0= ruleElseIfs
            	    {

            	    					newCompositeNode(grammarAccess.getConditionalsAccess().getElseifElseIfsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_elseif_1_0=ruleElseIfs();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConditionalsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elseif",
            	    						lv_elseif_1_0,
            	    						"large.logic.forMathematics.statistics.Llms.ElseIfs");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalLlms.g:1053:3: ( (lv_elses_2_0= ruleElses ) )
            // InternalLlms.g:1054:4: (lv_elses_2_0= ruleElses )
            {
            // InternalLlms.g:1054:4: (lv_elses_2_0= ruleElses )
            // InternalLlms.g:1055:5: lv_elses_2_0= ruleElses
            {

            					newCompositeNode(grammarAccess.getConditionalsAccess().getElsesElsesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_elses_2_0=ruleElses();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalsRule());
            					}
            					set(
            						current,
            						"elses",
            						lv_elses_2_0,
            						"large.logic.forMathematics.statistics.Llms.Elses");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionals"


    // $ANTLR start "entryRuleIfs"
    // InternalLlms.g:1076:1: entryRuleIfs returns [EObject current=null] : iv_ruleIfs= ruleIfs EOF ;
    public final EObject entryRuleIfs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfs = null;


        try {
            // InternalLlms.g:1076:44: (iv_ruleIfs= ruleIfs EOF )
            // InternalLlms.g:1077:2: iv_ruleIfs= ruleIfs EOF
            {
             newCompositeNode(grammarAccess.getIfsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfs=ruleIfs();

            state._fsp--;

             current =iv_ruleIfs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfs"


    // $ANTLR start "ruleIfs"
    // InternalLlms.g:1083:1: ruleIfs returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_lg_2_0= ruleLogicalParams ) ) otherlv_3= ')' otherlv_4= '=>' otherlv_5= '{' ( (lv_body_6_0= ruleBodies ) )+ otherlv_7= '}' ) ;
    public final EObject ruleIfs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_lg_2_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:1089:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_lg_2_0= ruleLogicalParams ) ) otherlv_3= ')' otherlv_4= '=>' otherlv_5= '{' ( (lv_body_6_0= ruleBodies ) )+ otherlv_7= '}' ) )
            // InternalLlms.g:1090:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_lg_2_0= ruleLogicalParams ) ) otherlv_3= ')' otherlv_4= '=>' otherlv_5= '{' ( (lv_body_6_0= ruleBodies ) )+ otherlv_7= '}' )
            {
            // InternalLlms.g:1090:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_lg_2_0= ruleLogicalParams ) ) otherlv_3= ')' otherlv_4= '=>' otherlv_5= '{' ( (lv_body_6_0= ruleBodies ) )+ otherlv_7= '}' )
            // InternalLlms.g:1091:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_lg_2_0= ruleLogicalParams ) ) otherlv_3= ')' otherlv_4= '=>' otherlv_5= '{' ( (lv_body_6_0= ruleBodies ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getIfsAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getIfsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLlms.g:1099:3: ( (lv_lg_2_0= ruleLogicalParams ) )
            // InternalLlms.g:1100:4: (lv_lg_2_0= ruleLogicalParams )
            {
            // InternalLlms.g:1100:4: (lv_lg_2_0= ruleLogicalParams )
            // InternalLlms.g:1101:5: lv_lg_2_0= ruleLogicalParams
            {

            					newCompositeNode(grammarAccess.getIfsAccess().getLgLogicalParamsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_lg_2_0=ruleLogicalParams();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfsRule());
            					}
            					set(
            						current,
            						"lg",
            						lv_lg_2_0,
            						"large.logic.forMathematics.statistics.Llms.LogicalParams");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getIfsAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getIfsAccess().getEqualsSignGreaterThanSignKeyword_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getIfsAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalLlms.g:1130:3: ( (lv_body_6_0= ruleBodies ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||(LA13_0>=25 && LA13_0<=27)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLlms.g:1131:4: (lv_body_6_0= ruleBodies )
            	    {
            	    // InternalLlms.g:1131:4: (lv_body_6_0= ruleBodies )
            	    // InternalLlms.g:1132:5: lv_body_6_0= ruleBodies
            	    {

            	    					newCompositeNode(grammarAccess.getIfsAccess().getBodyBodiesParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_body_6_0=ruleBodies();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"body",
            	    						lv_body_6_0,
            	    						"large.logic.forMathematics.statistics.Llms.Bodies");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getIfsAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfs"


    // $ANTLR start "entryRuleElseIfs"
    // InternalLlms.g:1157:1: entryRuleElseIfs returns [EObject current=null] : iv_ruleElseIfs= ruleElseIfs EOF ;
    public final EObject entryRuleElseIfs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfs = null;


        try {
            // InternalLlms.g:1157:48: (iv_ruleElseIfs= ruleElseIfs EOF )
            // InternalLlms.g:1158:2: iv_ruleElseIfs= ruleElseIfs EOF
            {
             newCompositeNode(grammarAccess.getElseIfsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElseIfs=ruleElseIfs();

            state._fsp--;

             current =iv_ruleElseIfs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElseIfs"


    // $ANTLR start "ruleElseIfs"
    // InternalLlms.g:1164:1: ruleElseIfs returns [EObject current=null] : (otherlv_0= 'else-if' otherlv_1= '(' ( (lv_logicParms_2_0= ruleLogicalParams ) ) otherlv_3= ')' otherlv_4= '=>' otherlv_5= '{' ( (lv_body_6_0= ruleBodies ) )+ otherlv_7= '}' ) ;
    public final EObject ruleElseIfs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_logicParms_2_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:1170:2: ( (otherlv_0= 'else-if' otherlv_1= '(' ( (lv_logicParms_2_0= ruleLogicalParams ) ) otherlv_3= ')' otherlv_4= '=>' otherlv_5= '{' ( (lv_body_6_0= ruleBodies ) )+ otherlv_7= '}' ) )
            // InternalLlms.g:1171:2: (otherlv_0= 'else-if' otherlv_1= '(' ( (lv_logicParms_2_0= ruleLogicalParams ) ) otherlv_3= ')' otherlv_4= '=>' otherlv_5= '{' ( (lv_body_6_0= ruleBodies ) )+ otherlv_7= '}' )
            {
            // InternalLlms.g:1171:2: (otherlv_0= 'else-if' otherlv_1= '(' ( (lv_logicParms_2_0= ruleLogicalParams ) ) otherlv_3= ')' otherlv_4= '=>' otherlv_5= '{' ( (lv_body_6_0= ruleBodies ) )+ otherlv_7= '}' )
            // InternalLlms.g:1172:3: otherlv_0= 'else-if' otherlv_1= '(' ( (lv_logicParms_2_0= ruleLogicalParams ) ) otherlv_3= ')' otherlv_4= '=>' otherlv_5= '{' ( (lv_body_6_0= ruleBodies ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getElseIfsAccess().getElseIfKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getElseIfsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLlms.g:1180:3: ( (lv_logicParms_2_0= ruleLogicalParams ) )
            // InternalLlms.g:1181:4: (lv_logicParms_2_0= ruleLogicalParams )
            {
            // InternalLlms.g:1181:4: (lv_logicParms_2_0= ruleLogicalParams )
            // InternalLlms.g:1182:5: lv_logicParms_2_0= ruleLogicalParams
            {

            					newCompositeNode(grammarAccess.getElseIfsAccess().getLogicParmsLogicalParamsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_logicParms_2_0=ruleLogicalParams();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElseIfsRule());
            					}
            					add(
            						current,
            						"logicParms",
            						lv_logicParms_2_0,
            						"large.logic.forMathematics.statistics.Llms.LogicalParams");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getElseIfsAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getElseIfsAccess().getEqualsSignGreaterThanSignKeyword_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getElseIfsAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalLlms.g:1211:3: ( (lv_body_6_0= ruleBodies ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=25 && LA14_0<=27)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalLlms.g:1212:4: (lv_body_6_0= ruleBodies )
            	    {
            	    // InternalLlms.g:1212:4: (lv_body_6_0= ruleBodies )
            	    // InternalLlms.g:1213:5: lv_body_6_0= ruleBodies
            	    {

            	    					newCompositeNode(grammarAccess.getElseIfsAccess().getBodyBodiesParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_body_6_0=ruleBodies();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getElseIfsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"body",
            	    						lv_body_6_0,
            	    						"large.logic.forMathematics.statistics.Llms.Bodies");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getElseIfsAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElseIfs"


    // $ANTLR start "entryRuleElses"
    // InternalLlms.g:1238:1: entryRuleElses returns [EObject current=null] : iv_ruleElses= ruleElses EOF ;
    public final EObject entryRuleElses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElses = null;


        try {
            // InternalLlms.g:1238:46: (iv_ruleElses= ruleElses EOF )
            // InternalLlms.g:1239:2: iv_ruleElses= ruleElses EOF
            {
             newCompositeNode(grammarAccess.getElsesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElses=ruleElses();

            state._fsp--;

             current =iv_ruleElses; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElses"


    // $ANTLR start "ruleElses"
    // InternalLlms.g:1245:1: ruleElses returns [EObject current=null] : (otherlv_0= 'else{' ( (lv_body_1_0= ruleBodies ) )+ otherlv_2= '}' ) ;
    public final EObject ruleElses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:1251:2: ( (otherlv_0= 'else{' ( (lv_body_1_0= ruleBodies ) )+ otherlv_2= '}' ) )
            // InternalLlms.g:1252:2: (otherlv_0= 'else{' ( (lv_body_1_0= ruleBodies ) )+ otherlv_2= '}' )
            {
            // InternalLlms.g:1252:2: (otherlv_0= 'else{' ( (lv_body_1_0= ruleBodies ) )+ otherlv_2= '}' )
            // InternalLlms.g:1253:3: otherlv_0= 'else{' ( (lv_body_1_0= ruleBodies ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getElsesAccess().getElseKeyword_0());
            		
            // InternalLlms.g:1257:3: ( (lv_body_1_0= ruleBodies ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=25 && LA15_0<=27)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLlms.g:1258:4: (lv_body_1_0= ruleBodies )
            	    {
            	    // InternalLlms.g:1258:4: (lv_body_1_0= ruleBodies )
            	    // InternalLlms.g:1259:5: lv_body_1_0= ruleBodies
            	    {

            	    					newCompositeNode(grammarAccess.getElsesAccess().getBodyBodiesParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_body_1_0=ruleBodies();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getElsesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"body",
            	    						lv_body_1_0,
            	    						"large.logic.forMathematics.statistics.Llms.Bodies");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getElsesAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElses"


    // $ANTLR start "entryRuleDataTypes"
    // InternalLlms.g:1284:1: entryRuleDataTypes returns [String current=null] : iv_ruleDataTypes= ruleDataTypes EOF ;
    public final String entryRuleDataTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataTypes = null;


        try {
            // InternalLlms.g:1284:49: (iv_ruleDataTypes= ruleDataTypes EOF )
            // InternalLlms.g:1285:2: iv_ruleDataTypes= ruleDataTypes EOF
            {
             newCompositeNode(grammarAccess.getDataTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataTypes=ruleDataTypes();

            state._fsp--;

             current =iv_ruleDataTypes.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataTypes"


    // $ANTLR start "ruleDataTypes"
    // InternalLlms.g:1291:1: ruleDataTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'bool' | kw= 'doubles' | kw= 'string' ) ;
    public final AntlrDatatypeRuleToken ruleDataTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLlms.g:1297:2: ( (kw= 'int' | kw= 'bool' | kw= 'doubles' | kw= 'string' ) )
            // InternalLlms.g:1298:2: (kw= 'int' | kw= 'bool' | kw= 'doubles' | kw= 'string' )
            {
            // InternalLlms.g:1298:2: (kw= 'int' | kw= 'bool' | kw= 'doubles' | kw= 'string' )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt16=1;
                }
                break;
            case 31:
                {
                alt16=2;
                }
                break;
            case 32:
                {
                alt16=3;
                }
                break;
            case 33:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalLlms.g:1299:3: kw= 'int'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypesAccess().getIntKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLlms.g:1305:3: kw= 'bool'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypesAccess().getBoolKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalLlms.g:1311:3: kw= 'doubles'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypesAccess().getDoublesKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalLlms.g:1317:3: kw= 'string'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypesAccess().getStringKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataTypes"


    // $ANTLR start "entryRuleParmsPrint"
    // InternalLlms.g:1326:1: entryRuleParmsPrint returns [EObject current=null] : iv_ruleParmsPrint= ruleParmsPrint EOF ;
    public final EObject entryRuleParmsPrint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParmsPrint = null;


        try {
            // InternalLlms.g:1326:51: (iv_ruleParmsPrint= ruleParmsPrint EOF )
            // InternalLlms.g:1327:2: iv_ruleParmsPrint= ruleParmsPrint EOF
            {
             newCompositeNode(grammarAccess.getParmsPrintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParmsPrint=ruleParmsPrint();

            state._fsp--;

             current =iv_ruleParmsPrint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParmsPrint"


    // $ANTLR start "ruleParmsPrint"
    // InternalLlms.g:1333:1: ruleParmsPrint returns [EObject current=null] : (this_Datas_0= ruleDatas | this_CallVariable_1= ruleCallVariable | this_CallFunction_2= ruleCallFunction ) ;
    public final EObject ruleParmsPrint() throws RecognitionException {
        EObject current = null;

        EObject this_Datas_0 = null;

        EObject this_CallVariable_1 = null;

        EObject this_CallFunction_2 = null;



        	enterRule();

        try {
            // InternalLlms.g:1339:2: ( (this_Datas_0= ruleDatas | this_CallVariable_1= ruleCallVariable | this_CallFunction_2= ruleCallFunction ) )
            // InternalLlms.g:1340:2: (this_Datas_0= ruleDatas | this_CallVariable_1= ruleCallVariable | this_CallFunction_2= ruleCallFunction )
            {
            // InternalLlms.g:1340:2: (this_Datas_0= ruleDatas | this_CallVariable_1= ruleCallVariable | this_CallFunction_2= ruleCallFunction )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_INT && LA17_0<=RULE_DOUBLE)||(LA17_0>=48 && LA17_0<=49)) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==21) ) {
                    alt17=3;
                }
                else if ( (LA17_2==EOF||LA17_2==19||LA17_2==22) ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalLlms.g:1341:3: this_Datas_0= ruleDatas
                    {

                    			newCompositeNode(grammarAccess.getParmsPrintAccess().getDatasParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Datas_0=ruleDatas();

                    state._fsp--;


                    			current = this_Datas_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLlms.g:1350:3: this_CallVariable_1= ruleCallVariable
                    {

                    			newCompositeNode(grammarAccess.getParmsPrintAccess().getCallVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CallVariable_1=ruleCallVariable();

                    state._fsp--;


                    			current = this_CallVariable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLlms.g:1359:3: this_CallFunction_2= ruleCallFunction
                    {

                    			newCompositeNode(grammarAccess.getParmsPrintAccess().getCallFunctionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CallFunction_2=ruleCallFunction();

                    state._fsp--;


                    			current = this_CallFunction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParmsPrint"


    // $ANTLR start "entryRuleCallFunction"
    // InternalLlms.g:1371:1: entryRuleCallFunction returns [EObject current=null] : iv_ruleCallFunction= ruleCallFunction EOF ;
    public final EObject entryRuleCallFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallFunction = null;


        try {
            // InternalLlms.g:1371:53: (iv_ruleCallFunction= ruleCallFunction EOF )
            // InternalLlms.g:1372:2: iv_ruleCallFunction= ruleCallFunction EOF
            {
             newCompositeNode(grammarAccess.getCallFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCallFunction=ruleCallFunction();

            state._fsp--;

             current =iv_ruleCallFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCallFunction"


    // $ANTLR start "ruleCallFunction"
    // InternalLlms.g:1378:1: ruleCallFunction returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exp_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleCallFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exp_2_0 = null;

        EObject lv_exp_4_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:1384:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exp_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalLlms.g:1385:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exp_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalLlms.g:1385:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exp_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalLlms.g:1386:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exp_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalLlms.g:1386:3: ( (otherlv_0= RULE_ID ) )
            // InternalLlms.g:1387:4: (otherlv_0= RULE_ID )
            {
            // InternalLlms.g:1387:4: (otherlv_0= RULE_ID )
            // InternalLlms.g:1388:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallFunctionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getCallFunctionAccess().getFuncFunctionsCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getCallFunctionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLlms.g:1403:3: ( ( (lv_exp_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_DOUBLE)||LA19_0==16||(LA19_0>=34 && LA19_0<=43)||(LA19_0>=48 && LA19_0<=49)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalLlms.g:1404:4: ( (lv_exp_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) )*
                    {
                    // InternalLlms.g:1404:4: ( (lv_exp_2_0= ruleExpression ) )
                    // InternalLlms.g:1405:5: (lv_exp_2_0= ruleExpression )
                    {
                    // InternalLlms.g:1405:5: (lv_exp_2_0= ruleExpression )
                    // InternalLlms.g:1406:6: lv_exp_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getCallFunctionAccess().getExpExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_exp_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCallFunctionRule());
                    						}
                    						add(
                    							current,
                    							"exp",
                    							lv_exp_2_0,
                    							"large.logic.forMathematics.statistics.Llms.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLlms.g:1423:4: (otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==19) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalLlms.g:1424:5: otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_16); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getCallFunctionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalLlms.g:1428:5: ( (lv_exp_4_0= ruleExpression ) )
                    	    // InternalLlms.g:1429:6: (lv_exp_4_0= ruleExpression )
                    	    {
                    	    // InternalLlms.g:1429:6: (lv_exp_4_0= ruleExpression )
                    	    // InternalLlms.g:1430:7: lv_exp_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getCallFunctionAccess().getExpExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_exp_4_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCallFunctionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"exp",
                    	    								lv_exp_4_0,
                    	    								"large.logic.forMathematics.statistics.Llms.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCallFunctionAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCallFunction"


    // $ANTLR start "entryRuleCallVariable"
    // InternalLlms.g:1457:1: entryRuleCallVariable returns [EObject current=null] : iv_ruleCallVariable= ruleCallVariable EOF ;
    public final EObject entryRuleCallVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallVariable = null;


        try {
            // InternalLlms.g:1457:53: (iv_ruleCallVariable= ruleCallVariable EOF )
            // InternalLlms.g:1458:2: iv_ruleCallVariable= ruleCallVariable EOF
            {
             newCompositeNode(grammarAccess.getCallVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCallVariable=ruleCallVariable();

            state._fsp--;

             current =iv_ruleCallVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCallVariable"


    // $ANTLR start "ruleCallVariable"
    // InternalLlms.g:1464:1: ruleCallVariable returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleCallVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalLlms.g:1470:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalLlms.g:1471:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalLlms.g:1471:2: ( (otherlv_0= RULE_ID ) )
            // InternalLlms.g:1472:3: (otherlv_0= RULE_ID )
            {
            // InternalLlms.g:1472:3: (otherlv_0= RULE_ID )
            // InternalLlms.g:1473:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCallVariableRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getCallVariableAccess().getVarsVarParmArgsCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCallVariable"


    // $ANTLR start "entryRuleOnlyVar"
    // InternalLlms.g:1487:1: entryRuleOnlyVar returns [EObject current=null] : iv_ruleOnlyVar= ruleOnlyVar EOF ;
    public final EObject entryRuleOnlyVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnlyVar = null;


        try {
            // InternalLlms.g:1487:48: (iv_ruleOnlyVar= ruleOnlyVar EOF )
            // InternalLlms.g:1488:2: iv_ruleOnlyVar= ruleOnlyVar EOF
            {
             newCompositeNode(grammarAccess.getOnlyVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOnlyVar=ruleOnlyVar();

            state._fsp--;

             current =iv_ruleOnlyVar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnlyVar"


    // $ANTLR start "ruleOnlyVar"
    // InternalLlms.g:1494:1: ruleOnlyVar returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_dataType_2_0= ruleDataTypes ) ) ) ;
    public final EObject ruleOnlyVar() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_dataType_2_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:1500:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_dataType_2_0= ruleDataTypes ) ) ) )
            // InternalLlms.g:1501:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_dataType_2_0= ruleDataTypes ) ) )
            {
            // InternalLlms.g:1501:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_dataType_2_0= ruleDataTypes ) ) )
            // InternalLlms.g:1502:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_dataType_2_0= ruleDataTypes ) )
            {
            // InternalLlms.g:1502:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalLlms.g:1503:4: (lv_name_0_0= RULE_ID )
            {
            // InternalLlms.g:1503:4: (lv_name_0_0= RULE_ID )
            // InternalLlms.g:1504:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_0_0, grammarAccess.getOnlyVarAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOnlyVarRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getOnlyVarAccess().getColonKeyword_1());
            		
            // InternalLlms.g:1524:3: ( (lv_dataType_2_0= ruleDataTypes ) )
            // InternalLlms.g:1525:4: (lv_dataType_2_0= ruleDataTypes )
            {
            // InternalLlms.g:1525:4: (lv_dataType_2_0= ruleDataTypes )
            // InternalLlms.g:1526:5: lv_dataType_2_0= ruleDataTypes
            {

            					newCompositeNode(grammarAccess.getOnlyVarAccess().getDataTypeDataTypesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_dataType_2_0=ruleDataTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOnlyVarRule());
            					}
            					set(
            						current,
            						"dataType",
            						lv_dataType_2_0,
            						"large.logic.forMathematics.statistics.Llms.DataTypes");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnlyVar"


    // $ANTLR start "entryRuleAssignment"
    // InternalLlms.g:1547:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalLlms.g:1547:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalLlms.g:1548:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalLlms.g:1554:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:1560:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // InternalLlms.g:1561:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // InternalLlms.g:1561:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '<=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';' )
            // InternalLlms.g:1562:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '<=' ( (lv_exp_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // InternalLlms.g:1562:3: ( (otherlv_0= RULE_ID ) )
            // InternalLlms.g:1563:4: (otherlv_0= RULE_ID )
            {
            // InternalLlms.g:1563:4: (otherlv_0= RULE_ID )
            // InternalLlms.g:1564:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getVarsVarParmArgsCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getLessThanSignEqualsSignKeyword_1());
            		
            // InternalLlms.g:1579:3: ( (lv_exp_2_0= ruleExpression ) )
            // InternalLlms.g:1580:4: (lv_exp_2_0= ruleExpression )
            {
            // InternalLlms.g:1580:4: (lv_exp_2_0= ruleExpression )
            // InternalLlms.g:1581:5: lv_exp_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getExpExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_exp_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"large.logic.forMathematics.statistics.Llms.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAssignmentAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleLogicalParams"
    // InternalLlms.g:1606:1: entryRuleLogicalParams returns [EObject current=null] : iv_ruleLogicalParams= ruleLogicalParams EOF ;
    public final EObject entryRuleLogicalParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalParams = null;


        try {
            // InternalLlms.g:1606:54: (iv_ruleLogicalParams= ruleLogicalParams EOF )
            // InternalLlms.g:1607:2: iv_ruleLogicalParams= ruleLogicalParams EOF
            {
             newCompositeNode(grammarAccess.getLogicalParamsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalParams=ruleLogicalParams();

            state._fsp--;

             current =iv_ruleLogicalParams; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalParams"


    // $ANTLR start "ruleLogicalParams"
    // InternalLlms.g:1613:1: ruleLogicalParams returns [EObject current=null] : (this_LogicalOperation_0= ruleLogicalOperation ( ( (lv_boolFunc_1_0= ruleBooleanFunction ) ) ( (lv_lgicOp_2_0= ruleLogicalOperation ) ) )* ) ;
    public final EObject ruleLogicalParams() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOperation_0 = null;

        EObject lv_boolFunc_1_0 = null;

        EObject lv_lgicOp_2_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:1619:2: ( (this_LogicalOperation_0= ruleLogicalOperation ( ( (lv_boolFunc_1_0= ruleBooleanFunction ) ) ( (lv_lgicOp_2_0= ruleLogicalOperation ) ) )* ) )
            // InternalLlms.g:1620:2: (this_LogicalOperation_0= ruleLogicalOperation ( ( (lv_boolFunc_1_0= ruleBooleanFunction ) ) ( (lv_lgicOp_2_0= ruleLogicalOperation ) ) )* )
            {
            // InternalLlms.g:1620:2: (this_LogicalOperation_0= ruleLogicalOperation ( ( (lv_boolFunc_1_0= ruleBooleanFunction ) ) ( (lv_lgicOp_2_0= ruleLogicalOperation ) ) )* )
            // InternalLlms.g:1621:3: this_LogicalOperation_0= ruleLogicalOperation ( ( (lv_boolFunc_1_0= ruleBooleanFunction ) ) ( (lv_lgicOp_2_0= ruleLogicalOperation ) ) )*
            {

            			newCompositeNode(grammarAccess.getLogicalParamsAccess().getLogicalOperationParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_LogicalOperation_0=ruleLogicalOperation();

            state._fsp--;


            			current = this_LogicalOperation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLlms.g:1629:3: ( ( (lv_boolFunc_1_0= ruleBooleanFunction ) ) ( (lv_lgicOp_2_0= ruleLogicalOperation ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=39 && LA20_0<=43)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalLlms.g:1630:4: ( (lv_boolFunc_1_0= ruleBooleanFunction ) ) ( (lv_lgicOp_2_0= ruleLogicalOperation ) )
            	    {
            	    // InternalLlms.g:1630:4: ( (lv_boolFunc_1_0= ruleBooleanFunction ) )
            	    // InternalLlms.g:1631:5: (lv_boolFunc_1_0= ruleBooleanFunction )
            	    {
            	    // InternalLlms.g:1631:5: (lv_boolFunc_1_0= ruleBooleanFunction )
            	    // InternalLlms.g:1632:6: lv_boolFunc_1_0= ruleBooleanFunction
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalParamsAccess().getBoolFuncBooleanFunctionParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_boolFunc_1_0=ruleBooleanFunction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLogicalParamsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"boolFunc",
            	    							lv_boolFunc_1_0,
            	    							"large.logic.forMathematics.statistics.Llms.BooleanFunction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalLlms.g:1649:4: ( (lv_lgicOp_2_0= ruleLogicalOperation ) )
            	    // InternalLlms.g:1650:5: (lv_lgicOp_2_0= ruleLogicalOperation )
            	    {
            	    // InternalLlms.g:1650:5: (lv_lgicOp_2_0= ruleLogicalOperation )
            	    // InternalLlms.g:1651:6: lv_lgicOp_2_0= ruleLogicalOperation
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalParamsAccess().getLgicOpLogicalOperationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_lgicOp_2_0=ruleLogicalOperation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLogicalParamsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"lgicOp",
            	    							lv_lgicOp_2_0,
            	    							"large.logic.forMathematics.statistics.Llms.LogicalOperation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalParams"


    // $ANTLR start "entryRuleOperation"
    // InternalLlms.g:1673:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalLlms.g:1673:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalLlms.g:1674:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalLlms.g:1680:1: ruleOperation returns [EObject current=null] : (this_AritmeticOperation_0= ruleAritmeticOperation | this_LogicalOperation_1= ruleLogicalOperation | this_BooleanFunction_2= ruleBooleanFunction ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_AritmeticOperation_0 = null;

        EObject this_LogicalOperation_1 = null;

        EObject this_BooleanFunction_2 = null;



        	enterRule();

        try {
            // InternalLlms.g:1686:2: ( (this_AritmeticOperation_0= ruleAritmeticOperation | this_LogicalOperation_1= ruleLogicalOperation | this_BooleanFunction_2= ruleBooleanFunction ) )
            // InternalLlms.g:1687:2: (this_AritmeticOperation_0= ruleAritmeticOperation | this_LogicalOperation_1= ruleLogicalOperation | this_BooleanFunction_2= ruleBooleanFunction )
            {
            // InternalLlms.g:1687:2: (this_AritmeticOperation_0= ruleAritmeticOperation | this_LogicalOperation_1= ruleLogicalOperation | this_BooleanFunction_2= ruleBooleanFunction )
            int alt21=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case RULE_DOUBLE:
            case 48:
            case 49:
                {
                alt21=1;
                }
                break;
            case 16:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                {
                alt21=2;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalLlms.g:1688:3: this_AritmeticOperation_0= ruleAritmeticOperation
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getAritmeticOperationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AritmeticOperation_0=ruleAritmeticOperation();

                    state._fsp--;


                    			current = this_AritmeticOperation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLlms.g:1697:3: this_LogicalOperation_1= ruleLogicalOperation
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getLogicalOperationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogicalOperation_1=ruleLogicalOperation();

                    state._fsp--;


                    			current = this_LogicalOperation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLlms.g:1706:3: this_BooleanFunction_2= ruleBooleanFunction
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getBooleanFunctionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanFunction_2=ruleBooleanFunction();

                    state._fsp--;


                    			current = this_BooleanFunction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleLogicalOperation"
    // InternalLlms.g:1718:1: entryRuleLogicalOperation returns [EObject current=null] : iv_ruleLogicalOperation= ruleLogicalOperation EOF ;
    public final EObject entryRuleLogicalOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOperation = null;


        try {
            // InternalLlms.g:1718:57: (iv_ruleLogicalOperation= ruleLogicalOperation EOF )
            // InternalLlms.g:1719:2: iv_ruleLogicalOperation= ruleLogicalOperation EOF
            {
             newCompositeNode(grammarAccess.getLogicalOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalOperation=ruleLogicalOperation();

            state._fsp--;

             current =iv_ruleLogicalOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalOperation"


    // $ANTLR start "ruleLogicalOperation"
    // InternalLlms.g:1725:1: ruleLogicalOperation returns [EObject current=null] : (this_LessThan_0= ruleLessThan | this_GreaterThan_1= ruleGreaterThan | this_Equal_2= ruleEqual | this_NotEqual_3= ruleNotEqual | this_LessOrEqual_4= ruleLessOrEqual | this_GreaterOrEqual_5= ruleGreaterOrEqual ) ;
    public final EObject ruleLogicalOperation() throws RecognitionException {
        EObject current = null;

        EObject this_LessThan_0 = null;

        EObject this_GreaterThan_1 = null;

        EObject this_Equal_2 = null;

        EObject this_NotEqual_3 = null;

        EObject this_LessOrEqual_4 = null;

        EObject this_GreaterOrEqual_5 = null;



        	enterRule();

        try {
            // InternalLlms.g:1731:2: ( (this_LessThan_0= ruleLessThan | this_GreaterThan_1= ruleGreaterThan | this_Equal_2= ruleEqual | this_NotEqual_3= ruleNotEqual | this_LessOrEqual_4= ruleLessOrEqual | this_GreaterOrEqual_5= ruleGreaterOrEqual ) )
            // InternalLlms.g:1732:2: (this_LessThan_0= ruleLessThan | this_GreaterThan_1= ruleGreaterThan | this_Equal_2= ruleEqual | this_NotEqual_3= ruleNotEqual | this_LessOrEqual_4= ruleLessOrEqual | this_GreaterOrEqual_5= ruleGreaterOrEqual )
            {
            // InternalLlms.g:1732:2: (this_LessThan_0= ruleLessThan | this_GreaterThan_1= ruleGreaterThan | this_Equal_2= ruleEqual | this_NotEqual_3= ruleNotEqual | this_LessOrEqual_4= ruleLessOrEqual | this_GreaterOrEqual_5= ruleGreaterOrEqual )
            int alt22=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt22=1;
                }
                break;
            case 35:
                {
                alt22=2;
                }
                break;
            case 36:
                {
                alt22=3;
                }
                break;
            case 37:
                {
                alt22=4;
                }
                break;
            case 16:
                {
                alt22=5;
                }
                break;
            case 38:
                {
                alt22=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalLlms.g:1733:3: this_LessThan_0= ruleLessThan
                    {

                    			newCompositeNode(grammarAccess.getLogicalOperationAccess().getLessThanParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LessThan_0=ruleLessThan();

                    state._fsp--;


                    			current = this_LessThan_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLlms.g:1742:3: this_GreaterThan_1= ruleGreaterThan
                    {

                    			newCompositeNode(grammarAccess.getLogicalOperationAccess().getGreaterThanParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GreaterThan_1=ruleGreaterThan();

                    state._fsp--;


                    			current = this_GreaterThan_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLlms.g:1751:3: this_Equal_2= ruleEqual
                    {

                    			newCompositeNode(grammarAccess.getLogicalOperationAccess().getEqualParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Equal_2=ruleEqual();

                    state._fsp--;


                    			current = this_Equal_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLlms.g:1760:3: this_NotEqual_3= ruleNotEqual
                    {

                    			newCompositeNode(grammarAccess.getLogicalOperationAccess().getNotEqualParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_NotEqual_3=ruleNotEqual();

                    state._fsp--;


                    			current = this_NotEqual_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalLlms.g:1769:3: this_LessOrEqual_4= ruleLessOrEqual
                    {

                    			newCompositeNode(grammarAccess.getLogicalOperationAccess().getLessOrEqualParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_LessOrEqual_4=ruleLessOrEqual();

                    state._fsp--;


                    			current = this_LessOrEqual_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalLlms.g:1778:3: this_GreaterOrEqual_5= ruleGreaterOrEqual
                    {

                    			newCompositeNode(grammarAccess.getLogicalOperationAccess().getGreaterOrEqualParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_GreaterOrEqual_5=ruleGreaterOrEqual();

                    state._fsp--;


                    			current = this_GreaterOrEqual_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOperation"


    // $ANTLR start "entryRuleLessThan"
    // InternalLlms.g:1790:1: entryRuleLessThan returns [EObject current=null] : iv_ruleLessThan= ruleLessThan EOF ;
    public final EObject entryRuleLessThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessThan = null;


        try {
            // InternalLlms.g:1790:49: (iv_ruleLessThan= ruleLessThan EOF )
            // InternalLlms.g:1791:2: iv_ruleLessThan= ruleLessThan EOF
            {
             newCompositeNode(grammarAccess.getLessThanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLessThan=ruleLessThan();

            state._fsp--;

             current =iv_ruleLessThan; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLessThan"


    // $ANTLR start "ruleLessThan"
    // InternalLlms.g:1797:1: ruleLessThan returns [EObject current=null] : (otherlv_0= '<' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) ) ;
    public final EObject ruleLessThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:1803:2: ( (otherlv_0= '<' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) ) )
            // InternalLlms.g:1804:2: (otherlv_0= '<' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) )
            {
            // InternalLlms.g:1804:2: (otherlv_0= '<' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) )
            // InternalLlms.g:1805:3: otherlv_0= '<' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getLessThanAccess().getLessThanSignKeyword_0());
            		
            // InternalLlms.g:1809:3: ( (lv_left_1_0= rulePrimary ) )
            // InternalLlms.g:1810:4: (lv_left_1_0= rulePrimary )
            {
            // InternalLlms.g:1810:4: (lv_left_1_0= rulePrimary )
            // InternalLlms.g:1811:5: lv_left_1_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getLessThanAccess().getLeftPrimaryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_left_1_0=rulePrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLessThanRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_1_0,
            						"large.logic.forMathematics.statistics.Llms.Primary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLlms.g:1828:3: ( (lv_right_2_0= rulePrimary ) )
            // InternalLlms.g:1829:4: (lv_right_2_0= rulePrimary )
            {
            // InternalLlms.g:1829:4: (lv_right_2_0= rulePrimary )
            // InternalLlms.g:1830:5: lv_right_2_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getLessThanAccess().getRightPrimaryParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=rulePrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLessThanRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"large.logic.forMathematics.statistics.Llms.Primary");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLessThan"


    // $ANTLR start "entryRuleGreaterThan"
    // InternalLlms.g:1851:1: entryRuleGreaterThan returns [EObject current=null] : iv_ruleGreaterThan= ruleGreaterThan EOF ;
    public final EObject entryRuleGreaterThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterThan = null;


        try {
            // InternalLlms.g:1851:52: (iv_ruleGreaterThan= ruleGreaterThan EOF )
            // InternalLlms.g:1852:2: iv_ruleGreaterThan= ruleGreaterThan EOF
            {
             newCompositeNode(grammarAccess.getGreaterThanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreaterThan=ruleGreaterThan();

            state._fsp--;

             current =iv_ruleGreaterThan; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreaterThan"


    // $ANTLR start "ruleGreaterThan"
    // InternalLlms.g:1858:1: ruleGreaterThan returns [EObject current=null] : (otherlv_0= '>' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) ) ;
    public final EObject ruleGreaterThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:1864:2: ( (otherlv_0= '>' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) ) )
            // InternalLlms.g:1865:2: (otherlv_0= '>' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) )
            {
            // InternalLlms.g:1865:2: (otherlv_0= '>' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) )
            // InternalLlms.g:1866:3: otherlv_0= '>' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getGreaterThanAccess().getGreaterThanSignKeyword_0());
            		
            // InternalLlms.g:1870:3: ( (lv_left_1_0= rulePrimary ) )
            // InternalLlms.g:1871:4: (lv_left_1_0= rulePrimary )
            {
            // InternalLlms.g:1871:4: (lv_left_1_0= rulePrimary )
            // InternalLlms.g:1872:5: lv_left_1_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getGreaterThanAccess().getLeftPrimaryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_left_1_0=rulePrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGreaterThanRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_1_0,
            						"large.logic.forMathematics.statistics.Llms.Primary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLlms.g:1889:3: ( (lv_right_2_0= rulePrimary ) )
            // InternalLlms.g:1890:4: (lv_right_2_0= rulePrimary )
            {
            // InternalLlms.g:1890:4: (lv_right_2_0= rulePrimary )
            // InternalLlms.g:1891:5: lv_right_2_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getGreaterThanAccess().getRightPrimaryParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=rulePrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGreaterThanRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"large.logic.forMathematics.statistics.Llms.Primary");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreaterThan"


    // $ANTLR start "entryRuleEqual"
    // InternalLlms.g:1912:1: entryRuleEqual returns [EObject current=null] : iv_ruleEqual= ruleEqual EOF ;
    public final EObject entryRuleEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqual = null;


        try {
            // InternalLlms.g:1912:46: (iv_ruleEqual= ruleEqual EOF )
            // InternalLlms.g:1913:2: iv_ruleEqual= ruleEqual EOF
            {
             newCompositeNode(grammarAccess.getEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqual=ruleEqual();

            state._fsp--;

             current =iv_ruleEqual; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqual"


    // $ANTLR start "ruleEqual"
    // InternalLlms.g:1919:1: ruleEqual returns [EObject current=null] : (otherlv_0= '=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) ) ;
    public final EObject ruleEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:1925:2: ( (otherlv_0= '=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) ) )
            // InternalLlms.g:1926:2: (otherlv_0= '=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) )
            {
            // InternalLlms.g:1926:2: (otherlv_0= '=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) )
            // InternalLlms.g:1927:3: otherlv_0= '=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getEqualAccess().getEqualsSignKeyword_0());
            		
            // InternalLlms.g:1931:3: ( (lv_left_1_0= rulePrimary ) )
            // InternalLlms.g:1932:4: (lv_left_1_0= rulePrimary )
            {
            // InternalLlms.g:1932:4: (lv_left_1_0= rulePrimary )
            // InternalLlms.g:1933:5: lv_left_1_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getEqualAccess().getLeftPrimaryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_left_1_0=rulePrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEqualRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_1_0,
            						"large.logic.forMathematics.statistics.Llms.Primary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLlms.g:1950:3: ( (lv_right_2_0= rulePrimary ) )
            // InternalLlms.g:1951:4: (lv_right_2_0= rulePrimary )
            {
            // InternalLlms.g:1951:4: (lv_right_2_0= rulePrimary )
            // InternalLlms.g:1952:5: lv_right_2_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getEqualAccess().getRightPrimaryParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=rulePrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEqualRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"large.logic.forMathematics.statistics.Llms.Primary");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqual"


    // $ANTLR start "entryRuleNotEqual"
    // InternalLlms.g:1973:1: entryRuleNotEqual returns [EObject current=null] : iv_ruleNotEqual= ruleNotEqual EOF ;
    public final EObject entryRuleNotEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEqual = null;


        try {
            // InternalLlms.g:1973:49: (iv_ruleNotEqual= ruleNotEqual EOF )
            // InternalLlms.g:1974:2: iv_ruleNotEqual= ruleNotEqual EOF
            {
             newCompositeNode(grammarAccess.getNotEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotEqual=ruleNotEqual();

            state._fsp--;

             current =iv_ruleNotEqual; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotEqual"


    // $ANTLR start "ruleNotEqual"
    // InternalLlms.g:1980:1: ruleNotEqual returns [EObject current=null] : (otherlv_0= '!=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) ) ;
    public final EObject ruleNotEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:1986:2: ( (otherlv_0= '!=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) ) )
            // InternalLlms.g:1987:2: (otherlv_0= '!=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) )
            {
            // InternalLlms.g:1987:2: (otherlv_0= '!=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) )
            // InternalLlms.g:1988:3: otherlv_0= '!=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getNotEqualAccess().getExclamationMarkEqualsSignKeyword_0());
            		
            // InternalLlms.g:1992:3: ( (lv_left_1_0= rulePrimary ) )
            // InternalLlms.g:1993:4: (lv_left_1_0= rulePrimary )
            {
            // InternalLlms.g:1993:4: (lv_left_1_0= rulePrimary )
            // InternalLlms.g:1994:5: lv_left_1_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getNotEqualAccess().getLeftPrimaryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_left_1_0=rulePrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNotEqualRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_1_0,
            						"large.logic.forMathematics.statistics.Llms.Primary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLlms.g:2011:3: ( (lv_right_2_0= rulePrimary ) )
            // InternalLlms.g:2012:4: (lv_right_2_0= rulePrimary )
            {
            // InternalLlms.g:2012:4: (lv_right_2_0= rulePrimary )
            // InternalLlms.g:2013:5: lv_right_2_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getNotEqualAccess().getRightPrimaryParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=rulePrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNotEqualRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"large.logic.forMathematics.statistics.Llms.Primary");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotEqual"


    // $ANTLR start "entryRuleLessOrEqual"
    // InternalLlms.g:2034:1: entryRuleLessOrEqual returns [EObject current=null] : iv_ruleLessOrEqual= ruleLessOrEqual EOF ;
    public final EObject entryRuleLessOrEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessOrEqual = null;


        try {
            // InternalLlms.g:2034:52: (iv_ruleLessOrEqual= ruleLessOrEqual EOF )
            // InternalLlms.g:2035:2: iv_ruleLessOrEqual= ruleLessOrEqual EOF
            {
             newCompositeNode(grammarAccess.getLessOrEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLessOrEqual=ruleLessOrEqual();

            state._fsp--;

             current =iv_ruleLessOrEqual; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLessOrEqual"


    // $ANTLR start "ruleLessOrEqual"
    // InternalLlms.g:2041:1: ruleLessOrEqual returns [EObject current=null] : (otherlv_0= '<=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) ) ;
    public final EObject ruleLessOrEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:2047:2: ( (otherlv_0= '<=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) ) )
            // InternalLlms.g:2048:2: (otherlv_0= '<=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) )
            {
            // InternalLlms.g:2048:2: (otherlv_0= '<=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) )
            // InternalLlms.g:2049:3: otherlv_0= '<=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getLessOrEqualAccess().getLessThanSignEqualsSignKeyword_0());
            		
            // InternalLlms.g:2053:3: ( (lv_left_1_0= rulePrimary ) )
            // InternalLlms.g:2054:4: (lv_left_1_0= rulePrimary )
            {
            // InternalLlms.g:2054:4: (lv_left_1_0= rulePrimary )
            // InternalLlms.g:2055:5: lv_left_1_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getLessOrEqualAccess().getLeftPrimaryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_left_1_0=rulePrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLessOrEqualRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_1_0,
            						"large.logic.forMathematics.statistics.Llms.Primary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLlms.g:2072:3: ( (lv_right_2_0= rulePrimary ) )
            // InternalLlms.g:2073:4: (lv_right_2_0= rulePrimary )
            {
            // InternalLlms.g:2073:4: (lv_right_2_0= rulePrimary )
            // InternalLlms.g:2074:5: lv_right_2_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getLessOrEqualAccess().getRightPrimaryParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=rulePrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLessOrEqualRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"large.logic.forMathematics.statistics.Llms.Primary");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLessOrEqual"


    // $ANTLR start "entryRuleGreaterOrEqual"
    // InternalLlms.g:2095:1: entryRuleGreaterOrEqual returns [EObject current=null] : iv_ruleGreaterOrEqual= ruleGreaterOrEqual EOF ;
    public final EObject entryRuleGreaterOrEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterOrEqual = null;


        try {
            // InternalLlms.g:2095:55: (iv_ruleGreaterOrEqual= ruleGreaterOrEqual EOF )
            // InternalLlms.g:2096:2: iv_ruleGreaterOrEqual= ruleGreaterOrEqual EOF
            {
             newCompositeNode(grammarAccess.getGreaterOrEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreaterOrEqual=ruleGreaterOrEqual();

            state._fsp--;

             current =iv_ruleGreaterOrEqual; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreaterOrEqual"


    // $ANTLR start "ruleGreaterOrEqual"
    // InternalLlms.g:2102:1: ruleGreaterOrEqual returns [EObject current=null] : (otherlv_0= '>=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) ) ;
    public final EObject ruleGreaterOrEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:2108:2: ( (otherlv_0= '>=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) ) )
            // InternalLlms.g:2109:2: (otherlv_0= '>=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) )
            {
            // InternalLlms.g:2109:2: (otherlv_0= '>=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) )
            // InternalLlms.g:2110:3: otherlv_0= '>=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getGreaterOrEqualAccess().getGreaterThanSignEqualsSignKeyword_0());
            		
            // InternalLlms.g:2114:3: ( (lv_left_1_0= rulePrimary ) )
            // InternalLlms.g:2115:4: (lv_left_1_0= rulePrimary )
            {
            // InternalLlms.g:2115:4: (lv_left_1_0= rulePrimary )
            // InternalLlms.g:2116:5: lv_left_1_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getGreaterOrEqualAccess().getLeftPrimaryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_left_1_0=rulePrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGreaterOrEqualRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_1_0,
            						"large.logic.forMathematics.statistics.Llms.Primary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLlms.g:2133:3: ( (lv_right_2_0= rulePrimary ) )
            // InternalLlms.g:2134:4: (lv_right_2_0= rulePrimary )
            {
            // InternalLlms.g:2134:4: (lv_right_2_0= rulePrimary )
            // InternalLlms.g:2135:5: lv_right_2_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getGreaterOrEqualAccess().getRightPrimaryParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=rulePrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGreaterOrEqualRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"large.logic.forMathematics.statistics.Llms.Primary");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreaterOrEqual"


    // $ANTLR start "entryRuleBooleanFunction"
    // InternalLlms.g:2156:1: entryRuleBooleanFunction returns [EObject current=null] : iv_ruleBooleanFunction= ruleBooleanFunction EOF ;
    public final EObject entryRuleBooleanFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanFunction = null;


        try {
            // InternalLlms.g:2156:56: (iv_ruleBooleanFunction= ruleBooleanFunction EOF )
            // InternalLlms.g:2157:2: iv_ruleBooleanFunction= ruleBooleanFunction EOF
            {
             newCompositeNode(grammarAccess.getBooleanFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanFunction=ruleBooleanFunction();

            state._fsp--;

             current =iv_ruleBooleanFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanFunction"


    // $ANTLR start "ruleBooleanFunction"
    // InternalLlms.g:2163:1: ruleBooleanFunction returns [EObject current=null] : (this_Ands_0= ruleAnds | this_Ors_1= ruleOrs | this_Nots_2= ruleNots | this_Nors_3= ruleNors | this_Nands_4= ruleNands ) ;
    public final EObject ruleBooleanFunction() throws RecognitionException {
        EObject current = null;

        EObject this_Ands_0 = null;

        EObject this_Ors_1 = null;

        EObject this_Nots_2 = null;

        EObject this_Nors_3 = null;

        EObject this_Nands_4 = null;



        	enterRule();

        try {
            // InternalLlms.g:2169:2: ( (this_Ands_0= ruleAnds | this_Ors_1= ruleOrs | this_Nots_2= ruleNots | this_Nors_3= ruleNors | this_Nands_4= ruleNands ) )
            // InternalLlms.g:2170:2: (this_Ands_0= ruleAnds | this_Ors_1= ruleOrs | this_Nots_2= ruleNots | this_Nors_3= ruleNors | this_Nands_4= ruleNands )
            {
            // InternalLlms.g:2170:2: (this_Ands_0= ruleAnds | this_Ors_1= ruleOrs | this_Nots_2= ruleNots | this_Nors_3= ruleNors | this_Nands_4= ruleNands )
            int alt23=5;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt23=1;
                }
                break;
            case 40:
                {
                alt23=2;
                }
                break;
            case 41:
                {
                alt23=3;
                }
                break;
            case 42:
                {
                alt23=4;
                }
                break;
            case 43:
                {
                alt23=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalLlms.g:2171:3: this_Ands_0= ruleAnds
                    {

                    			newCompositeNode(grammarAccess.getBooleanFunctionAccess().getAndsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ands_0=ruleAnds();

                    state._fsp--;


                    			current = this_Ands_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLlms.g:2180:3: this_Ors_1= ruleOrs
                    {

                    			newCompositeNode(grammarAccess.getBooleanFunctionAccess().getOrsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ors_1=ruleOrs();

                    state._fsp--;


                    			current = this_Ors_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLlms.g:2189:3: this_Nots_2= ruleNots
                    {

                    			newCompositeNode(grammarAccess.getBooleanFunctionAccess().getNotsParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Nots_2=ruleNots();

                    state._fsp--;


                    			current = this_Nots_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLlms.g:2198:3: this_Nors_3= ruleNors
                    {

                    			newCompositeNode(grammarAccess.getBooleanFunctionAccess().getNorsParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Nors_3=ruleNors();

                    state._fsp--;


                    			current = this_Nors_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalLlms.g:2207:3: this_Nands_4= ruleNands
                    {

                    			newCompositeNode(grammarAccess.getBooleanFunctionAccess().getNandsParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Nands_4=ruleNands();

                    state._fsp--;


                    			current = this_Nands_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanFunction"


    // $ANTLR start "entryRuleAnds"
    // InternalLlms.g:2219:1: entryRuleAnds returns [EObject current=null] : iv_ruleAnds= ruleAnds EOF ;
    public final EObject entryRuleAnds() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnds = null;


        try {
            // InternalLlms.g:2219:45: (iv_ruleAnds= ruleAnds EOF )
            // InternalLlms.g:2220:2: iv_ruleAnds= ruleAnds EOF
            {
             newCompositeNode(grammarAccess.getAndsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnds=ruleAnds();

            state._fsp--;

             current =iv_ruleAnds; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnds"


    // $ANTLR start "ruleAnds"
    // InternalLlms.g:2226:1: ruleAnds returns [EObject current=null] : (otherlv_0= '&&' ( (lv_primary_1_0= rulePrimary ) )+ ) ;
    public final EObject ruleAnds() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_primary_1_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:2232:2: ( (otherlv_0= '&&' ( (lv_primary_1_0= rulePrimary ) )+ ) )
            // InternalLlms.g:2233:2: (otherlv_0= '&&' ( (lv_primary_1_0= rulePrimary ) )+ )
            {
            // InternalLlms.g:2233:2: (otherlv_0= '&&' ( (lv_primary_1_0= rulePrimary ) )+ )
            // InternalLlms.g:2234:3: otherlv_0= '&&' ( (lv_primary_1_0= rulePrimary ) )+
            {
            otherlv_0=(Token)match(input,39,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getAndsAccess().getAmpersandAmpersandKeyword_0());
            		
            // InternalLlms.g:2238:3: ( (lv_primary_1_0= rulePrimary ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt24=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt24=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt24=1;
                    }
                    break;
                case 48:
                    {
                    alt24=1;
                    }
                    break;
                case 49:
                    {
                    alt24=1;
                    }
                    break;
                case RULE_DOUBLE:
                    {
                    alt24=1;
                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // InternalLlms.g:2239:4: (lv_primary_1_0= rulePrimary )
            	    {
            	    // InternalLlms.g:2239:4: (lv_primary_1_0= rulePrimary )
            	    // InternalLlms.g:2240:5: lv_primary_1_0= rulePrimary
            	    {

            	    					newCompositeNode(grammarAccess.getAndsAccess().getPrimaryPrimaryParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_primary_1_0=rulePrimary();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAndsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"primary",
            	    						lv_primary_1_0,
            	    						"large.logic.forMathematics.statistics.Llms.Primary");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnds"


    // $ANTLR start "entryRuleOrs"
    // InternalLlms.g:2261:1: entryRuleOrs returns [EObject current=null] : iv_ruleOrs= ruleOrs EOF ;
    public final EObject entryRuleOrs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrs = null;


        try {
            // InternalLlms.g:2261:44: (iv_ruleOrs= ruleOrs EOF )
            // InternalLlms.g:2262:2: iv_ruleOrs= ruleOrs EOF
            {
             newCompositeNode(grammarAccess.getOrsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrs=ruleOrs();

            state._fsp--;

             current =iv_ruleOrs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrs"


    // $ANTLR start "ruleOrs"
    // InternalLlms.g:2268:1: ruleOrs returns [EObject current=null] : (otherlv_0= '||' ( (lv_primary_1_0= rulePrimary ) )+ ) ;
    public final EObject ruleOrs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_primary_1_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:2274:2: ( (otherlv_0= '||' ( (lv_primary_1_0= rulePrimary ) )+ ) )
            // InternalLlms.g:2275:2: (otherlv_0= '||' ( (lv_primary_1_0= rulePrimary ) )+ )
            {
            // InternalLlms.g:2275:2: (otherlv_0= '||' ( (lv_primary_1_0= rulePrimary ) )+ )
            // InternalLlms.g:2276:3: otherlv_0= '||' ( (lv_primary_1_0= rulePrimary ) )+
            {
            otherlv_0=(Token)match(input,40,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getOrsAccess().getVerticalLineVerticalLineKeyword_0());
            		
            // InternalLlms.g:2280:3: ( (lv_primary_1_0= rulePrimary ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt25=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt25=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt25=1;
                    }
                    break;
                case 48:
                    {
                    alt25=1;
                    }
                    break;
                case 49:
                    {
                    alt25=1;
                    }
                    break;
                case RULE_DOUBLE:
                    {
                    alt25=1;
                    }
                    break;

                }

                switch (alt25) {
            	case 1 :
            	    // InternalLlms.g:2281:4: (lv_primary_1_0= rulePrimary )
            	    {
            	    // InternalLlms.g:2281:4: (lv_primary_1_0= rulePrimary )
            	    // InternalLlms.g:2282:5: lv_primary_1_0= rulePrimary
            	    {

            	    					newCompositeNode(grammarAccess.getOrsAccess().getPrimaryPrimaryParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_primary_1_0=rulePrimary();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOrsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"primary",
            	    						lv_primary_1_0,
            	    						"large.logic.forMathematics.statistics.Llms.Primary");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrs"


    // $ANTLR start "entryRuleNots"
    // InternalLlms.g:2303:1: entryRuleNots returns [EObject current=null] : iv_ruleNots= ruleNots EOF ;
    public final EObject entryRuleNots() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNots = null;


        try {
            // InternalLlms.g:2303:45: (iv_ruleNots= ruleNots EOF )
            // InternalLlms.g:2304:2: iv_ruleNots= ruleNots EOF
            {
             newCompositeNode(grammarAccess.getNotsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNots=ruleNots();

            state._fsp--;

             current =iv_ruleNots; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNots"


    // $ANTLR start "ruleNots"
    // InternalLlms.g:2310:1: ruleNots returns [EObject current=null] : (otherlv_0= '!' ( (lv_primary_1_0= rulePrimary ) )+ ) ;
    public final EObject ruleNots() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_primary_1_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:2316:2: ( (otherlv_0= '!' ( (lv_primary_1_0= rulePrimary ) )+ ) )
            // InternalLlms.g:2317:2: (otherlv_0= '!' ( (lv_primary_1_0= rulePrimary ) )+ )
            {
            // InternalLlms.g:2317:2: (otherlv_0= '!' ( (lv_primary_1_0= rulePrimary ) )+ )
            // InternalLlms.g:2318:3: otherlv_0= '!' ( (lv_primary_1_0= rulePrimary ) )+
            {
            otherlv_0=(Token)match(input,41,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getNotsAccess().getExclamationMarkKeyword_0());
            		
            // InternalLlms.g:2322:3: ( (lv_primary_1_0= rulePrimary ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt26=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt26=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt26=1;
                    }
                    break;
                case 48:
                    {
                    alt26=1;
                    }
                    break;
                case 49:
                    {
                    alt26=1;
                    }
                    break;
                case RULE_DOUBLE:
                    {
                    alt26=1;
                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // InternalLlms.g:2323:4: (lv_primary_1_0= rulePrimary )
            	    {
            	    // InternalLlms.g:2323:4: (lv_primary_1_0= rulePrimary )
            	    // InternalLlms.g:2324:5: lv_primary_1_0= rulePrimary
            	    {

            	    					newCompositeNode(grammarAccess.getNotsAccess().getPrimaryPrimaryParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_primary_1_0=rulePrimary();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNotsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"primary",
            	    						lv_primary_1_0,
            	    						"large.logic.forMathematics.statistics.Llms.Primary");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNots"


    // $ANTLR start "entryRuleNors"
    // InternalLlms.g:2345:1: entryRuleNors returns [EObject current=null] : iv_ruleNors= ruleNors EOF ;
    public final EObject entryRuleNors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNors = null;


        try {
            // InternalLlms.g:2345:45: (iv_ruleNors= ruleNors EOF )
            // InternalLlms.g:2346:2: iv_ruleNors= ruleNors EOF
            {
             newCompositeNode(grammarAccess.getNorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNors=ruleNors();

            state._fsp--;

             current =iv_ruleNors; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNors"


    // $ANTLR start "ruleNors"
    // InternalLlms.g:2352:1: ruleNors returns [EObject current=null] : (otherlv_0= 'nor' ( (lv_primary_1_0= rulePrimary ) )+ ) ;
    public final EObject ruleNors() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_primary_1_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:2358:2: ( (otherlv_0= 'nor' ( (lv_primary_1_0= rulePrimary ) )+ ) )
            // InternalLlms.g:2359:2: (otherlv_0= 'nor' ( (lv_primary_1_0= rulePrimary ) )+ )
            {
            // InternalLlms.g:2359:2: (otherlv_0= 'nor' ( (lv_primary_1_0= rulePrimary ) )+ )
            // InternalLlms.g:2360:3: otherlv_0= 'nor' ( (lv_primary_1_0= rulePrimary ) )+
            {
            otherlv_0=(Token)match(input,42,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getNorsAccess().getNorKeyword_0());
            		
            // InternalLlms.g:2364:3: ( (lv_primary_1_0= rulePrimary ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt27=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt27=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt27=1;
                    }
                    break;
                case 48:
                    {
                    alt27=1;
                    }
                    break;
                case 49:
                    {
                    alt27=1;
                    }
                    break;
                case RULE_DOUBLE:
                    {
                    alt27=1;
                    }
                    break;

                }

                switch (alt27) {
            	case 1 :
            	    // InternalLlms.g:2365:4: (lv_primary_1_0= rulePrimary )
            	    {
            	    // InternalLlms.g:2365:4: (lv_primary_1_0= rulePrimary )
            	    // InternalLlms.g:2366:5: lv_primary_1_0= rulePrimary
            	    {

            	    					newCompositeNode(grammarAccess.getNorsAccess().getPrimaryPrimaryParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_primary_1_0=rulePrimary();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNorsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"primary",
            	    						lv_primary_1_0,
            	    						"large.logic.forMathematics.statistics.Llms.Primary");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNors"


    // $ANTLR start "entryRuleNands"
    // InternalLlms.g:2387:1: entryRuleNands returns [EObject current=null] : iv_ruleNands= ruleNands EOF ;
    public final EObject entryRuleNands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNands = null;


        try {
            // InternalLlms.g:2387:46: (iv_ruleNands= ruleNands EOF )
            // InternalLlms.g:2388:2: iv_ruleNands= ruleNands EOF
            {
             newCompositeNode(grammarAccess.getNandsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNands=ruleNands();

            state._fsp--;

             current =iv_ruleNands; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNands"


    // $ANTLR start "ruleNands"
    // InternalLlms.g:2394:1: ruleNands returns [EObject current=null] : (otherlv_0= 'nand' ( (lv_primary_1_0= rulePrimary ) )+ ) ;
    public final EObject ruleNands() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_primary_1_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:2400:2: ( (otherlv_0= 'nand' ( (lv_primary_1_0= rulePrimary ) )+ ) )
            // InternalLlms.g:2401:2: (otherlv_0= 'nand' ( (lv_primary_1_0= rulePrimary ) )+ )
            {
            // InternalLlms.g:2401:2: (otherlv_0= 'nand' ( (lv_primary_1_0= rulePrimary ) )+ )
            // InternalLlms.g:2402:3: otherlv_0= 'nand' ( (lv_primary_1_0= rulePrimary ) )+
            {
            otherlv_0=(Token)match(input,43,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getNandsAccess().getNandKeyword_0());
            		
            // InternalLlms.g:2406:3: ( (lv_primary_1_0= rulePrimary ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt28=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt28=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt28=1;
                    }
                    break;
                case 48:
                    {
                    alt28=1;
                    }
                    break;
                case 49:
                    {
                    alt28=1;
                    }
                    break;
                case RULE_DOUBLE:
                    {
                    alt28=1;
                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // InternalLlms.g:2407:4: (lv_primary_1_0= rulePrimary )
            	    {
            	    // InternalLlms.g:2407:4: (lv_primary_1_0= rulePrimary )
            	    // InternalLlms.g:2408:5: lv_primary_1_0= rulePrimary
            	    {

            	    					newCompositeNode(grammarAccess.getNandsAccess().getPrimaryPrimaryParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_primary_1_0=rulePrimary();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNandsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"primary",
            	    						lv_primary_1_0,
            	    						"large.logic.forMathematics.statistics.Llms.Primary");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNands"


    // $ANTLR start "entryRuleAritmeticOperation"
    // InternalLlms.g:2429:1: entryRuleAritmeticOperation returns [EObject current=null] : iv_ruleAritmeticOperation= ruleAritmeticOperation EOF ;
    public final EObject entryRuleAritmeticOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAritmeticOperation = null;


        try {
            // InternalLlms.g:2429:59: (iv_ruleAritmeticOperation= ruleAritmeticOperation EOF )
            // InternalLlms.g:2430:2: iv_ruleAritmeticOperation= ruleAritmeticOperation EOF
            {
             newCompositeNode(grammarAccess.getAritmeticOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAritmeticOperation=ruleAritmeticOperation();

            state._fsp--;

             current =iv_ruleAritmeticOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAritmeticOperation"


    // $ANTLR start "ruleAritmeticOperation"
    // InternalLlms.g:2436:1: ruleAritmeticOperation returns [EObject current=null] : ( (lv_sum_0_0= ruleSum ) ) ;
    public final EObject ruleAritmeticOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_sum_0_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:2442:2: ( ( (lv_sum_0_0= ruleSum ) ) )
            // InternalLlms.g:2443:2: ( (lv_sum_0_0= ruleSum ) )
            {
            // InternalLlms.g:2443:2: ( (lv_sum_0_0= ruleSum ) )
            // InternalLlms.g:2444:3: (lv_sum_0_0= ruleSum )
            {
            // InternalLlms.g:2444:3: (lv_sum_0_0= ruleSum )
            // InternalLlms.g:2445:4: lv_sum_0_0= ruleSum
            {

            				newCompositeNode(grammarAccess.getAritmeticOperationAccess().getSumSumParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_sum_0_0=ruleSum();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getAritmeticOperationRule());
            				}
            				set(
            					current,
            					"sum",
            					lv_sum_0_0,
            					"large.logic.forMathematics.statistics.Llms.Sum");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAritmeticOperation"


    // $ANTLR start "entryRuleSum"
    // InternalLlms.g:2465:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalLlms.g:2465:44: (iv_ruleSum= ruleSum EOF )
            // InternalLlms.g:2466:2: iv_ruleSum= ruleSum EOF
            {
             newCompositeNode(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSum=ruleSum();

            state._fsp--;

             current =iv_ruleSum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // InternalLlms.g:2472:1: ruleSum returns [EObject current=null] : (this_Subs_0= ruleSubs ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubs ) ) )* ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Subs_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:2478:2: ( (this_Subs_0= ruleSubs ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubs ) ) )* ) )
            // InternalLlms.g:2479:2: (this_Subs_0= ruleSubs ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubs ) ) )* )
            {
            // InternalLlms.g:2479:2: (this_Subs_0= ruleSubs ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubs ) ) )* )
            // InternalLlms.g:2480:3: this_Subs_0= ruleSubs ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubs ) ) )*
            {

            			newCompositeNode(grammarAccess.getSumAccess().getSubsParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_Subs_0=ruleSubs();

            state._fsp--;


            			current = this_Subs_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLlms.g:2488:3: ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubs ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==44) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalLlms.g:2489:4: () otherlv_2= '+' ( (lv_right_3_0= ruleSubs ) )
            	    {
            	    // InternalLlms.g:2489:4: ()
            	    // InternalLlms.g:2490:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getSumAccess().getSumLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,44,FOLLOW_27); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSumAccess().getPlusSignKeyword_1_1());
            	    			
            	    // InternalLlms.g:2500:4: ( (lv_right_3_0= ruleSubs ) )
            	    // InternalLlms.g:2501:5: (lv_right_3_0= ruleSubs )
            	    {
            	    // InternalLlms.g:2501:5: (lv_right_3_0= ruleSubs )
            	    // InternalLlms.g:2502:6: lv_right_3_0= ruleSubs
            	    {

            	    						newCompositeNode(grammarAccess.getSumAccess().getRightSubsParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_right_3_0=ruleSubs();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSumRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"large.logic.forMathematics.statistics.Llms.Subs");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleSubs"
    // InternalLlms.g:2524:1: entryRuleSubs returns [EObject current=null] : iv_ruleSubs= ruleSubs EOF ;
    public final EObject entryRuleSubs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubs = null;


        try {
            // InternalLlms.g:2524:45: (iv_ruleSubs= ruleSubs EOF )
            // InternalLlms.g:2525:2: iv_ruleSubs= ruleSubs EOF
            {
             newCompositeNode(grammarAccess.getSubsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubs=ruleSubs();

            state._fsp--;

             current =iv_ruleSubs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubs"


    // $ANTLR start "ruleSubs"
    // InternalLlms.g:2531:1: ruleSubs returns [EObject current=null] : (this_Divition_0= ruleDivition ( () otherlv_2= '-' ( (lv_right_3_0= ruleDivition ) ) )* ) ;
    public final EObject ruleSubs() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Divition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:2537:2: ( (this_Divition_0= ruleDivition ( () otherlv_2= '-' ( (lv_right_3_0= ruleDivition ) ) )* ) )
            // InternalLlms.g:2538:2: (this_Divition_0= ruleDivition ( () otherlv_2= '-' ( (lv_right_3_0= ruleDivition ) ) )* )
            {
            // InternalLlms.g:2538:2: (this_Divition_0= ruleDivition ( () otherlv_2= '-' ( (lv_right_3_0= ruleDivition ) ) )* )
            // InternalLlms.g:2539:3: this_Divition_0= ruleDivition ( () otherlv_2= '-' ( (lv_right_3_0= ruleDivition ) ) )*
            {

            			newCompositeNode(grammarAccess.getSubsAccess().getDivitionParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_Divition_0=ruleDivition();

            state._fsp--;


            			current = this_Divition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLlms.g:2547:3: ( () otherlv_2= '-' ( (lv_right_3_0= ruleDivition ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==45) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalLlms.g:2548:4: () otherlv_2= '-' ( (lv_right_3_0= ruleDivition ) )
            	    {
            	    // InternalLlms.g:2548:4: ()
            	    // InternalLlms.g:2549:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getSubsAccess().getSubsLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,45,FOLLOW_27); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSubsAccess().getHyphenMinusKeyword_1_1());
            	    			
            	    // InternalLlms.g:2559:4: ( (lv_right_3_0= ruleDivition ) )
            	    // InternalLlms.g:2560:5: (lv_right_3_0= ruleDivition )
            	    {
            	    // InternalLlms.g:2560:5: (lv_right_3_0= ruleDivition )
            	    // InternalLlms.g:2561:6: lv_right_3_0= ruleDivition
            	    {

            	    						newCompositeNode(grammarAccess.getSubsAccess().getRightDivitionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_right_3_0=ruleDivition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubsRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"large.logic.forMathematics.statistics.Llms.Divition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubs"


    // $ANTLR start "entryRuleDivition"
    // InternalLlms.g:2583:1: entryRuleDivition returns [EObject current=null] : iv_ruleDivition= ruleDivition EOF ;
    public final EObject entryRuleDivition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivition = null;


        try {
            // InternalLlms.g:2583:49: (iv_ruleDivition= ruleDivition EOF )
            // InternalLlms.g:2584:2: iv_ruleDivition= ruleDivition EOF
            {
             newCompositeNode(grammarAccess.getDivitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDivition=ruleDivition();

            state._fsp--;

             current =iv_ruleDivition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivition"


    // $ANTLR start "ruleDivition"
    // InternalLlms.g:2590:1: ruleDivition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '/' ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleDivition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:2596:2: ( (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '/' ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalLlms.g:2597:2: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '/' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalLlms.g:2597:2: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '/' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalLlms.g:2598:3: this_Multiplication_0= ruleMultiplication ( () otherlv_2= '/' ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getDivitionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLlms.g:2606:3: ( () otherlv_2= '/' ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==46) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalLlms.g:2607:4: () otherlv_2= '/' ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalLlms.g:2607:4: ()
            	    // InternalLlms.g:2608:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getDivitionAccess().getDivitionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,46,FOLLOW_27); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDivitionAccess().getSolidusKeyword_1_1());
            	    			
            	    // InternalLlms.g:2618:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalLlms.g:2619:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalLlms.g:2619:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalLlms.g:2620:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getDivitionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_right_3_0=ruleMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDivitionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"large.logic.forMathematics.statistics.Llms.Multiplication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDivition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalLlms.g:2642:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalLlms.g:2642:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalLlms.g:2643:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalLlms.g:2649:1: ruleMultiplication returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:2655:2: ( (this_Primary_0= rulePrimary ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalLlms.g:2656:2: (this_Primary_0= rulePrimary ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalLlms.g:2656:2: (this_Primary_0= rulePrimary ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalLlms.g:2657:3: this_Primary_0= rulePrimary ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLlms.g:2665:3: ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==47) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalLlms.g:2666:4: () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalLlms.g:2666:4: ()
            	    // InternalLlms.g:2667:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,47,FOLLOW_27); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1());
            	    			
            	    // InternalLlms.g:2677:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalLlms.g:2678:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalLlms.g:2678:5: (lv_right_3_0= rulePrimary )
            	    // InternalLlms.g:2679:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"large.logic.forMathematics.statistics.Llms.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimary"
    // InternalLlms.g:2701:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalLlms.g:2701:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalLlms.g:2702:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalLlms.g:2708:1: rulePrimary returns [EObject current=null] : (this_varParmArgs_0= rulevarParmArgs | this_CallVariable_1= ruleCallVariable | this_CallFunction_2= ruleCallFunction | this_Datas_3= ruleDatas ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_varParmArgs_0 = null;

        EObject this_CallVariable_1 = null;

        EObject this_CallFunction_2 = null;

        EObject this_Datas_3 = null;



        	enterRule();

        try {
            // InternalLlms.g:2714:2: ( (this_varParmArgs_0= rulevarParmArgs | this_CallVariable_1= ruleCallVariable | this_CallFunction_2= ruleCallFunction | this_Datas_3= ruleDatas ) )
            // InternalLlms.g:2715:2: (this_varParmArgs_0= rulevarParmArgs | this_CallVariable_1= ruleCallVariable | this_CallFunction_2= ruleCallFunction | this_Datas_3= ruleDatas )
            {
            // InternalLlms.g:2715:2: (this_varParmArgs_0= rulevarParmArgs | this_CallVariable_1= ruleCallVariable | this_CallFunction_2= ruleCallFunction | this_Datas_3= ruleDatas )
            int alt33=4;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 24:
                    {
                    int LA33_3 = input.LA(3);

                    if ( ((LA33_3>=30 && LA33_3<=33)) ) {
                        alt33=1;
                    }
                    else if ( (LA33_3==RULE_INT) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 21:
                    {
                    alt33=3;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_INT:
                case RULE_STRING:
                case RULE_DOUBLE:
                case 14:
                case 15:
                case 16:
                case 19:
                case 20:
                case 22:
                case 23:
                case 25:
                case 26:
                case 27:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    {
                    alt33=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA33_0>=RULE_INT && LA33_0<=RULE_DOUBLE)||(LA33_0>=48 && LA33_0<=49)) ) {
                alt33=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalLlms.g:2716:3: this_varParmArgs_0= rulevarParmArgs
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVarParmArgsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_varParmArgs_0=rulevarParmArgs();

                    state._fsp--;


                    			current = this_varParmArgs_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLlms.g:2725:3: this_CallVariable_1= ruleCallVariable
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getCallVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CallVariable_1=ruleCallVariable();

                    state._fsp--;


                    			current = this_CallVariable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLlms.g:2734:3: this_CallFunction_2= ruleCallFunction
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getCallFunctionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CallFunction_2=ruleCallFunction();

                    state._fsp--;


                    			current = this_CallFunction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLlms.g:2743:3: this_Datas_3= ruleDatas
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getDatasParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Datas_3=ruleDatas();

                    state._fsp--;


                    			current = this_Datas_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleDatas"
    // InternalLlms.g:2755:1: entryRuleDatas returns [EObject current=null] : iv_ruleDatas= ruleDatas EOF ;
    public final EObject entryRuleDatas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatas = null;


        try {
            // InternalLlms.g:2755:46: (iv_ruleDatas= ruleDatas EOF )
            // InternalLlms.g:2756:2: iv_ruleDatas= ruleDatas EOF
            {
             newCompositeNode(grammarAccess.getDatasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatas=ruleDatas();

            state._fsp--;

             current =iv_ruleDatas; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatas"


    // $ANTLR start "ruleDatas"
    // InternalLlms.g:2762:1: ruleDatas returns [EObject current=null] : (this_Numbers_0= ruleNumbers | this_Strings_1= ruleStrings | this_Booleans_2= ruleBooleans | this_Doubles_3= ruleDoubles ) ;
    public final EObject ruleDatas() throws RecognitionException {
        EObject current = null;

        EObject this_Numbers_0 = null;

        EObject this_Strings_1 = null;

        EObject this_Booleans_2 = null;

        EObject this_Doubles_3 = null;



        	enterRule();

        try {
            // InternalLlms.g:2768:2: ( (this_Numbers_0= ruleNumbers | this_Strings_1= ruleStrings | this_Booleans_2= ruleBooleans | this_Doubles_3= ruleDoubles ) )
            // InternalLlms.g:2769:2: (this_Numbers_0= ruleNumbers | this_Strings_1= ruleStrings | this_Booleans_2= ruleBooleans | this_Doubles_3= ruleDoubles )
            {
            // InternalLlms.g:2769:2: (this_Numbers_0= ruleNumbers | this_Strings_1= ruleStrings | this_Booleans_2= ruleBooleans | this_Doubles_3= ruleDoubles )
            int alt34=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt34=1;
                }
                break;
            case RULE_STRING:
                {
                alt34=2;
                }
                break;
            case 48:
            case 49:
                {
                alt34=3;
                }
                break;
            case RULE_DOUBLE:
                {
                alt34=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalLlms.g:2770:3: this_Numbers_0= ruleNumbers
                    {

                    			newCompositeNode(grammarAccess.getDatasAccess().getNumbersParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Numbers_0=ruleNumbers();

                    state._fsp--;


                    			current = this_Numbers_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLlms.g:2779:3: this_Strings_1= ruleStrings
                    {

                    			newCompositeNode(grammarAccess.getDatasAccess().getStringsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Strings_1=ruleStrings();

                    state._fsp--;


                    			current = this_Strings_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLlms.g:2788:3: this_Booleans_2= ruleBooleans
                    {

                    			newCompositeNode(grammarAccess.getDatasAccess().getBooleansParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Booleans_2=ruleBooleans();

                    state._fsp--;


                    			current = this_Booleans_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLlms.g:2797:3: this_Doubles_3= ruleDoubles
                    {

                    			newCompositeNode(grammarAccess.getDatasAccess().getDoublesParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Doubles_3=ruleDoubles();

                    state._fsp--;


                    			current = this_Doubles_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatas"


    // $ANTLR start "entryRuleNumbers"
    // InternalLlms.g:2809:1: entryRuleNumbers returns [EObject current=null] : iv_ruleNumbers= ruleNumbers EOF ;
    public final EObject entryRuleNumbers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumbers = null;


        try {
            // InternalLlms.g:2809:48: (iv_ruleNumbers= ruleNumbers EOF )
            // InternalLlms.g:2810:2: iv_ruleNumbers= ruleNumbers EOF
            {
             newCompositeNode(grammarAccess.getNumbersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumbers=ruleNumbers();

            state._fsp--;

             current =iv_ruleNumbers; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumbers"


    // $ANTLR start "ruleNumbers"
    // InternalLlms.g:2816:1: ruleNumbers returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumbers() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalLlms.g:2822:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalLlms.g:2823:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalLlms.g:2823:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalLlms.g:2824:3: (lv_value_0_0= RULE_INT )
            {
            // InternalLlms.g:2824:3: (lv_value_0_0= RULE_INT )
            // InternalLlms.g:2825:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNumbersAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumbersRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumbers"


    // $ANTLR start "entryRuleStrings"
    // InternalLlms.g:2844:1: entryRuleStrings returns [EObject current=null] : iv_ruleStrings= ruleStrings EOF ;
    public final EObject entryRuleStrings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrings = null;


        try {
            // InternalLlms.g:2844:48: (iv_ruleStrings= ruleStrings EOF )
            // InternalLlms.g:2845:2: iv_ruleStrings= ruleStrings EOF
            {
             newCompositeNode(grammarAccess.getStringsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStrings=ruleStrings();

            state._fsp--;

             current =iv_ruleStrings; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStrings"


    // $ANTLR start "ruleStrings"
    // InternalLlms.g:2851:1: ruleStrings returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStrings() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalLlms.g:2857:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalLlms.g:2858:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalLlms.g:2858:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalLlms.g:2859:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalLlms.g:2859:3: (lv_value_0_0= RULE_STRING )
            // InternalLlms.g:2860:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringsAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringsRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStrings"


    // $ANTLR start "entryRuleBooleans"
    // InternalLlms.g:2879:1: entryRuleBooleans returns [EObject current=null] : iv_ruleBooleans= ruleBooleans EOF ;
    public final EObject entryRuleBooleans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleans = null;


        try {
            // InternalLlms.g:2879:49: (iv_ruleBooleans= ruleBooleans EOF )
            // InternalLlms.g:2880:2: iv_ruleBooleans= ruleBooleans EOF
            {
             newCompositeNode(grammarAccess.getBooleansRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleans=ruleBooleans();

            state._fsp--;

             current =iv_ruleBooleans; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleans"


    // $ANTLR start "ruleBooleans"
    // InternalLlms.g:2886:1: ruleBooleans returns [EObject current=null] : ( ( (lv_value_0_0= 'true' ) ) | ( () otherlv_2= 'false' ) ) ;
    public final EObject ruleBooleans() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalLlms.g:2892:2: ( ( ( (lv_value_0_0= 'true' ) ) | ( () otherlv_2= 'false' ) ) )
            // InternalLlms.g:2893:2: ( ( (lv_value_0_0= 'true' ) ) | ( () otherlv_2= 'false' ) )
            {
            // InternalLlms.g:2893:2: ( ( (lv_value_0_0= 'true' ) ) | ( () otherlv_2= 'false' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==48) ) {
                alt35=1;
            }
            else if ( (LA35_0==49) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalLlms.g:2894:3: ( (lv_value_0_0= 'true' ) )
                    {
                    // InternalLlms.g:2894:3: ( (lv_value_0_0= 'true' ) )
                    // InternalLlms.g:2895:4: (lv_value_0_0= 'true' )
                    {
                    // InternalLlms.g:2895:4: (lv_value_0_0= 'true' )
                    // InternalLlms.g:2896:5: lv_value_0_0= 'true'
                    {
                    lv_value_0_0=(Token)match(input,48,FOLLOW_2); 

                    					newLeafNode(lv_value_0_0, grammarAccess.getBooleansAccess().getValueTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleansRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_0 != null, "true");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLlms.g:2909:3: ( () otherlv_2= 'false' )
                    {
                    // InternalLlms.g:2909:3: ( () otherlv_2= 'false' )
                    // InternalLlms.g:2910:4: () otherlv_2= 'false'
                    {
                    // InternalLlms.g:2910:4: ()
                    // InternalLlms.g:2911:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBooleansAccess().getBooleansAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,49,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getBooleansAccess().getFalseKeyword_1_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleans"


    // $ANTLR start "entryRuleDoubles"
    // InternalLlms.g:2926:1: entryRuleDoubles returns [EObject current=null] : iv_ruleDoubles= ruleDoubles EOF ;
    public final EObject entryRuleDoubles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubles = null;


        try {
            // InternalLlms.g:2926:48: (iv_ruleDoubles= ruleDoubles EOF )
            // InternalLlms.g:2927:2: iv_ruleDoubles= ruleDoubles EOF
            {
             newCompositeNode(grammarAccess.getDoublesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoubles=ruleDoubles();

            state._fsp--;

             current =iv_ruleDoubles; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoubles"


    // $ANTLR start "ruleDoubles"
    // InternalLlms.g:2933:1: ruleDoubles returns [EObject current=null] : ( (lv_value_0_0= RULE_DOUBLE ) ) ;
    public final EObject ruleDoubles() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalLlms.g:2939:2: ( ( (lv_value_0_0= RULE_DOUBLE ) ) )
            // InternalLlms.g:2940:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            {
            // InternalLlms.g:2940:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            // InternalLlms.g:2941:3: (lv_value_0_0= RULE_DOUBLE )
            {
            // InternalLlms.g:2941:3: (lv_value_0_0= RULE_DOUBLE )
            // InternalLlms.g:2942:4: lv_value_0_0= RULE_DOUBLE
            {
            lv_value_0_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getDoublesAccess().getValueDOUBLETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDoublesRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"large.logic.forMathematics.statistics.Llms.DOUBLE");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoubles"


    // $ANTLR start "entryRulePrints"
    // InternalLlms.g:2961:1: entryRulePrints returns [EObject current=null] : iv_rulePrints= rulePrints EOF ;
    public final EObject entryRulePrints() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrints = null;


        try {
            // InternalLlms.g:2961:47: (iv_rulePrints= rulePrints EOF )
            // InternalLlms.g:2962:2: iv_rulePrints= rulePrints EOF
            {
             newCompositeNode(grammarAccess.getPrintsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrints=rulePrints();

            state._fsp--;

             current =iv_rulePrints; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrints"


    // $ANTLR start "rulePrints"
    // InternalLlms.g:2968:1: rulePrints returns [EObject current=null] : ( () otherlv_1= 'print' otherlv_2= '(' ( ( (lv_print_3_0= ruleParmsPrint ) ) (otherlv_4= ',' ( (lv_print_5_0= ruleParmsPrint ) ) )* )? otherlv_6= ')' ) ;
    public final EObject rulePrints() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_print_3_0 = null;

        EObject lv_print_5_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:2974:2: ( ( () otherlv_1= 'print' otherlv_2= '(' ( ( (lv_print_3_0= ruleParmsPrint ) ) (otherlv_4= ',' ( (lv_print_5_0= ruleParmsPrint ) ) )* )? otherlv_6= ')' ) )
            // InternalLlms.g:2975:2: ( () otherlv_1= 'print' otherlv_2= '(' ( ( (lv_print_3_0= ruleParmsPrint ) ) (otherlv_4= ',' ( (lv_print_5_0= ruleParmsPrint ) ) )* )? otherlv_6= ')' )
            {
            // InternalLlms.g:2975:2: ( () otherlv_1= 'print' otherlv_2= '(' ( ( (lv_print_3_0= ruleParmsPrint ) ) (otherlv_4= ',' ( (lv_print_5_0= ruleParmsPrint ) ) )* )? otherlv_6= ')' )
            // InternalLlms.g:2976:3: () otherlv_1= 'print' otherlv_2= '(' ( ( (lv_print_3_0= ruleParmsPrint ) ) (otherlv_4= ',' ( (lv_print_5_0= ruleParmsPrint ) ) )* )? otherlv_6= ')'
            {
            // InternalLlms.g:2976:3: ()
            // InternalLlms.g:2977:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrintsAccess().getPrintsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getPrintsAccess().getPrintKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getPrintsAccess().getLeftParenthesisKeyword_2());
            		
            // InternalLlms.g:2991:3: ( ( (lv_print_3_0= ruleParmsPrint ) ) (otherlv_4= ',' ( (lv_print_5_0= ruleParmsPrint ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_DOUBLE)||(LA37_0>=48 && LA37_0<=49)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalLlms.g:2992:4: ( (lv_print_3_0= ruleParmsPrint ) ) (otherlv_4= ',' ( (lv_print_5_0= ruleParmsPrint ) ) )*
                    {
                    // InternalLlms.g:2992:4: ( (lv_print_3_0= ruleParmsPrint ) )
                    // InternalLlms.g:2993:5: (lv_print_3_0= ruleParmsPrint )
                    {
                    // InternalLlms.g:2993:5: (lv_print_3_0= ruleParmsPrint )
                    // InternalLlms.g:2994:6: lv_print_3_0= ruleParmsPrint
                    {

                    						newCompositeNode(grammarAccess.getPrintsAccess().getPrintParmsPrintParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_print_3_0=ruleParmsPrint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrintsRule());
                    						}
                    						add(
                    							current,
                    							"print",
                    							lv_print_3_0,
                    							"large.logic.forMathematics.statistics.Llms.ParmsPrint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLlms.g:3011:4: (otherlv_4= ',' ( (lv_print_5_0= ruleParmsPrint ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==19) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalLlms.g:3012:5: otherlv_4= ',' ( (lv_print_5_0= ruleParmsPrint ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_27); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getPrintsAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalLlms.g:3016:5: ( (lv_print_5_0= ruleParmsPrint ) )
                    	    // InternalLlms.g:3017:6: (lv_print_5_0= ruleParmsPrint )
                    	    {
                    	    // InternalLlms.g:3017:6: (lv_print_5_0= ruleParmsPrint )
                    	    // InternalLlms.g:3018:7: lv_print_5_0= ruleParmsPrint
                    	    {

                    	    							newCompositeNode(grammarAccess.getPrintsAccess().getPrintParmsPrintParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_print_5_0=ruleParmsPrint();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPrintsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"print",
                    	    								lv_print_5_0,
                    	    								"large.logic.forMathematics.statistics.Llms.ParmsPrint");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPrintsAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrints"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\uffff\1\3\3\uffff\4\12\2\uffff";
    static final String dfa_3s = "\2\4\1\5\2\uffff\4\4\2\uffff";
    static final String dfa_4s = "\1\4\1\33\1\41\2\uffff\4\33\2\uffff";
    static final String dfa_5s = "\3\uffff\1\1\1\3\4\uffff\1\2\1\4";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\3\13\uffff\1\4\6\uffff\1\3\1\2\3\3",
            "\1\3\30\uffff\1\5\1\6\1\7\1\10",
            "",
            "",
            "\1\12\13\uffff\1\11\6\uffff\5\12",
            "\1\12\13\uffff\1\11\6\uffff\5\12",
            "\1\12\13\uffff\1\11\6\uffff\5\12",
            "\1\12\13\uffff\1\11\6\uffff\5\12",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "743:2: (this_CallVariable_0= ruleCallVariable | this_varParmArgs_1= rulevarParmArgs | this_Assignment_2= ruleAssignment | this_OnlyVar_3= ruleOnlyVar )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000400000E00C010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000E000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00030FFC004100F0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00030FFC000100F0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000E800010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000E004010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000007C00010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00030FFC000100F2L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00030000000000F0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00030000000000F2L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00030000004000F0L});

}