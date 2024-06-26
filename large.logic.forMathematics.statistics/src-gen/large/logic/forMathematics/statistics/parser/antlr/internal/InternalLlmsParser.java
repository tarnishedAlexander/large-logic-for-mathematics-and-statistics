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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Class'", "'{'", "'}'", "'print'", "'('", "','", "')'", "'Function'", "'<='", "'=>'", "';'", "'for'", "':'", "'if'", "'else-if'", "'else{'", "'['", "']'", "'<'", "'>'", "'='", "'!='", "'>='", "'&&'", "'||'", "'!'", "'nor'", "'nand'", "'+'", "'-'", "'/'", "'*'", "'int'", "'bool'", "'doubles'", "'string'", "'true'", "'false'"
    };
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
    // InternalLlms.g:71:1: ruleOperations returns [EObject current=null] : ( () otherlv_1= 'Class' otherlv_2= '{' ( ( (lv_func_3_0= ruleFunctions ) ) | ( (lv_var_4_0= ruleVariables ) ) | ( (lv_conditional_5_0= ruleConditionals ) ) | ( (lv_loops_6_0= ruleLoops ) ) | ( (lv_print_7_0= rulePrints ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleOperations() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_8=null;
        EObject lv_func_3_0 = null;

        EObject lv_var_4_0 = null;

        EObject lv_conditional_5_0 = null;

        EObject lv_loops_6_0 = null;

        EObject lv_print_7_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:77:2: ( ( () otherlv_1= 'Class' otherlv_2= '{' ( ( (lv_func_3_0= ruleFunctions ) ) | ( (lv_var_4_0= ruleVariables ) ) | ( (lv_conditional_5_0= ruleConditionals ) ) | ( (lv_loops_6_0= ruleLoops ) ) | ( (lv_print_7_0= rulePrints ) ) )* otherlv_8= '}' ) )
            // InternalLlms.g:78:2: ( () otherlv_1= 'Class' otherlv_2= '{' ( ( (lv_func_3_0= ruleFunctions ) ) | ( (lv_var_4_0= ruleVariables ) ) | ( (lv_conditional_5_0= ruleConditionals ) ) | ( (lv_loops_6_0= ruleLoops ) ) | ( (lv_print_7_0= rulePrints ) ) )* otherlv_8= '}' )
            {
            // InternalLlms.g:78:2: ( () otherlv_1= 'Class' otherlv_2= '{' ( ( (lv_func_3_0= ruleFunctions ) ) | ( (lv_var_4_0= ruleVariables ) ) | ( (lv_conditional_5_0= ruleConditionals ) ) | ( (lv_loops_6_0= ruleLoops ) ) | ( (lv_print_7_0= rulePrints ) ) )* otherlv_8= '}' )
            // InternalLlms.g:79:3: () otherlv_1= 'Class' otherlv_2= '{' ( ( (lv_func_3_0= ruleFunctions ) ) | ( (lv_var_4_0= ruleVariables ) ) | ( (lv_conditional_5_0= ruleConditionals ) ) | ( (lv_loops_6_0= ruleLoops ) ) | ( (lv_print_7_0= rulePrints ) ) )* otherlv_8= '}'
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
            		
            otherlv_2=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getOperationsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLlms.g:94:3: ( ( (lv_func_3_0= ruleFunctions ) ) | ( (lv_var_4_0= ruleVariables ) ) | ( (lv_conditional_5_0= ruleConditionals ) ) | ( (lv_loops_6_0= ruleLoops ) ) | ( (lv_print_7_0= rulePrints ) ) )*
            loop1:
            do {
                int alt1=6;
                switch ( input.LA(1) ) {
                case 19:
                    {
                    alt1=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt1=2;
                    }
                    break;
                case 25:
                    {
                    alt1=3;
                    }
                    break;
                case 23:
                    {
                    alt1=4;
                    }
                    break;
                case 15:
                    {
                    alt1=5;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalLlms.g:95:4: ( (lv_func_3_0= ruleFunctions ) )
            	    {
            	    // InternalLlms.g:95:4: ( (lv_func_3_0= ruleFunctions ) )
            	    // InternalLlms.g:96:5: (lv_func_3_0= ruleFunctions )
            	    {
            	    // InternalLlms.g:96:5: (lv_func_3_0= ruleFunctions )
            	    // InternalLlms.g:97:6: lv_func_3_0= ruleFunctions
            	    {

            	    						newCompositeNode(grammarAccess.getOperationsAccess().getFuncFunctionsParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_func_3_0=ruleFunctions();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOperationsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"func",
            	    							lv_func_3_0,
            	    							"large.logic.forMathematics.statistics.Llms.Functions");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLlms.g:115:4: ( (lv_var_4_0= ruleVariables ) )
            	    {
            	    // InternalLlms.g:115:4: ( (lv_var_4_0= ruleVariables ) )
            	    // InternalLlms.g:116:5: (lv_var_4_0= ruleVariables )
            	    {
            	    // InternalLlms.g:116:5: (lv_var_4_0= ruleVariables )
            	    // InternalLlms.g:117:6: lv_var_4_0= ruleVariables
            	    {

            	    						newCompositeNode(grammarAccess.getOperationsAccess().getVarVariablesParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_var_4_0=ruleVariables();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOperationsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"var",
            	    							lv_var_4_0,
            	    							"large.logic.forMathematics.statistics.Llms.Variables");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLlms.g:135:4: ( (lv_conditional_5_0= ruleConditionals ) )
            	    {
            	    // InternalLlms.g:135:4: ( (lv_conditional_5_0= ruleConditionals ) )
            	    // InternalLlms.g:136:5: (lv_conditional_5_0= ruleConditionals )
            	    {
            	    // InternalLlms.g:136:5: (lv_conditional_5_0= ruleConditionals )
            	    // InternalLlms.g:137:6: lv_conditional_5_0= ruleConditionals
            	    {

            	    						newCompositeNode(grammarAccess.getOperationsAccess().getConditionalConditionalsParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_conditional_5_0=ruleConditionals();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOperationsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"conditional",
            	    							lv_conditional_5_0,
            	    							"large.logic.forMathematics.statistics.Llms.Conditionals");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLlms.g:155:4: ( (lv_loops_6_0= ruleLoops ) )
            	    {
            	    // InternalLlms.g:155:4: ( (lv_loops_6_0= ruleLoops ) )
            	    // InternalLlms.g:156:5: (lv_loops_6_0= ruleLoops )
            	    {
            	    // InternalLlms.g:156:5: (lv_loops_6_0= ruleLoops )
            	    // InternalLlms.g:157:6: lv_loops_6_0= ruleLoops
            	    {

            	    						newCompositeNode(grammarAccess.getOperationsAccess().getLoopsLoopsParserRuleCall_3_3_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_loops_6_0=ruleLoops();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOperationsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"loops",
            	    							lv_loops_6_0,
            	    							"large.logic.forMathematics.statistics.Llms.Loops");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalLlms.g:175:4: ( (lv_print_7_0= rulePrints ) )
            	    {
            	    // InternalLlms.g:175:4: ( (lv_print_7_0= rulePrints ) )
            	    // InternalLlms.g:176:5: (lv_print_7_0= rulePrints )
            	    {
            	    // InternalLlms.g:176:5: (lv_print_7_0= rulePrints )
            	    // InternalLlms.g:177:6: lv_print_7_0= rulePrints
            	    {

            	    						newCompositeNode(grammarAccess.getOperationsAccess().getPrintPrintsParserRuleCall_3_4_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_print_7_0=rulePrints();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOperationsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"print",
            	    							lv_print_7_0,
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

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getOperationsAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRulePrints"
    // InternalLlms.g:203:1: entryRulePrints returns [EObject current=null] : iv_rulePrints= rulePrints EOF ;
    public final EObject entryRulePrints() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrints = null;


        try {
            // InternalLlms.g:203:47: (iv_rulePrints= rulePrints EOF )
            // InternalLlms.g:204:2: iv_rulePrints= rulePrints EOF
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
    // InternalLlms.g:210:1: rulePrints returns [EObject current=null] : ( () otherlv_1= 'print' otherlv_2= '(' ( ( (lv_print_3_0= ruleParmsPrint ) ) (otherlv_4= ',' ( (lv_print_5_0= ruleParmsPrint ) ) )* )? otherlv_6= ')' ) ;
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
            // InternalLlms.g:216:2: ( ( () otherlv_1= 'print' otherlv_2= '(' ( ( (lv_print_3_0= ruleParmsPrint ) ) (otherlv_4= ',' ( (lv_print_5_0= ruleParmsPrint ) ) )* )? otherlv_6= ')' ) )
            // InternalLlms.g:217:2: ( () otherlv_1= 'print' otherlv_2= '(' ( ( (lv_print_3_0= ruleParmsPrint ) ) (otherlv_4= ',' ( (lv_print_5_0= ruleParmsPrint ) ) )* )? otherlv_6= ')' )
            {
            // InternalLlms.g:217:2: ( () otherlv_1= 'print' otherlv_2= '(' ( ( (lv_print_3_0= ruleParmsPrint ) ) (otherlv_4= ',' ( (lv_print_5_0= ruleParmsPrint ) ) )* )? otherlv_6= ')' )
            // InternalLlms.g:218:3: () otherlv_1= 'print' otherlv_2= '(' ( ( (lv_print_3_0= ruleParmsPrint ) ) (otherlv_4= ',' ( (lv_print_5_0= ruleParmsPrint ) ) )* )? otherlv_6= ')'
            {
            // InternalLlms.g:218:3: ()
            // InternalLlms.g:219:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrintsAccess().getPrintsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPrintsAccess().getPrintKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPrintsAccess().getLeftParenthesisKeyword_2());
            		
            // InternalLlms.g:233:3: ( ( (lv_print_3_0= ruleParmsPrint ) ) (otherlv_4= ',' ( (lv_print_5_0= ruleParmsPrint ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_DOUBLE)||(LA3_0>=48 && LA3_0<=49)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLlms.g:234:4: ( (lv_print_3_0= ruleParmsPrint ) ) (otherlv_4= ',' ( (lv_print_5_0= ruleParmsPrint ) ) )*
                    {
                    // InternalLlms.g:234:4: ( (lv_print_3_0= ruleParmsPrint ) )
                    // InternalLlms.g:235:5: (lv_print_3_0= ruleParmsPrint )
                    {
                    // InternalLlms.g:235:5: (lv_print_3_0= ruleParmsPrint )
                    // InternalLlms.g:236:6: lv_print_3_0= ruleParmsPrint
                    {

                    						newCompositeNode(grammarAccess.getPrintsAccess().getPrintParmsPrintParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalLlms.g:253:4: (otherlv_4= ',' ( (lv_print_5_0= ruleParmsPrint ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==17) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalLlms.g:254:5: otherlv_4= ',' ( (lv_print_5_0= ruleParmsPrint ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_8); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getPrintsAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalLlms.g:258:5: ( (lv_print_5_0= ruleParmsPrint ) )
                    	    // InternalLlms.g:259:6: (lv_print_5_0= ruleParmsPrint )
                    	    {
                    	    // InternalLlms.g:259:6: (lv_print_5_0= ruleParmsPrint )
                    	    // InternalLlms.g:260:7: lv_print_5_0= ruleParmsPrint
                    	    {

                    	    							newCompositeNode(grammarAccess.getPrintsAccess().getPrintParmsPrintParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

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


    // $ANTLR start "entryRuleParmsPrint"
    // InternalLlms.g:287:1: entryRuleParmsPrint returns [EObject current=null] : iv_ruleParmsPrint= ruleParmsPrint EOF ;
    public final EObject entryRuleParmsPrint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParmsPrint = null;


        try {
            // InternalLlms.g:287:51: (iv_ruleParmsPrint= ruleParmsPrint EOF )
            // InternalLlms.g:288:2: iv_ruleParmsPrint= ruleParmsPrint EOF
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
    // InternalLlms.g:294:1: ruleParmsPrint returns [EObject current=null] : (this_Data_0= ruleData | this_CallVariable_1= ruleCallVariable | this_callFunction_2= rulecallFunction ) ;
    public final EObject ruleParmsPrint() throws RecognitionException {
        EObject current = null;

        EObject this_Data_0 = null;

        EObject this_CallVariable_1 = null;

        EObject this_callFunction_2 = null;



        	enterRule();

        try {
            // InternalLlms.g:300:2: ( (this_Data_0= ruleData | this_CallVariable_1= ruleCallVariable | this_callFunction_2= rulecallFunction ) )
            // InternalLlms.g:301:2: (this_Data_0= ruleData | this_CallVariable_1= ruleCallVariable | this_callFunction_2= rulecallFunction )
            {
            // InternalLlms.g:301:2: (this_Data_0= ruleData | this_CallVariable_1= ruleCallVariable | this_callFunction_2= rulecallFunction )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_INT && LA4_0<=RULE_DOUBLE)||(LA4_0>=48 && LA4_0<=49)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==EOF||(LA4_2>=17 && LA4_2<=18)) ) {
                    alt4=2;
                }
                else if ( (LA4_2==16) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLlms.g:302:3: this_Data_0= ruleData
                    {

                    			newCompositeNode(grammarAccess.getParmsPrintAccess().getDataParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Data_0=ruleData();

                    state._fsp--;


                    			current = this_Data_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLlms.g:311:3: this_CallVariable_1= ruleCallVariable
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
                    // InternalLlms.g:320:3: this_callFunction_2= rulecallFunction
                    {

                    			newCompositeNode(grammarAccess.getParmsPrintAccess().getCallFunctionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_callFunction_2=rulecallFunction();

                    state._fsp--;


                    			current = this_callFunction_2;
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


    // $ANTLR start "entryRuleNames"
    // InternalLlms.g:332:1: entryRuleNames returns [EObject current=null] : iv_ruleNames= ruleNames EOF ;
    public final EObject entryRuleNames() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNames = null;


        try {
            // InternalLlms.g:332:46: (iv_ruleNames= ruleNames EOF )
            // InternalLlms.g:333:2: iv_ruleNames= ruleNames EOF
            {
             newCompositeNode(grammarAccess.getNamesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNames=ruleNames();

            state._fsp--;

             current =iv_ruleNames; 
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
    // $ANTLR end "entryRuleNames"


    // $ANTLR start "ruleNames"
    // InternalLlms.g:339:1: ruleNames returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleNames() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalLlms.g:345:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalLlms.g:346:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalLlms.g:346:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalLlms.g:347:3: (lv_name_0_0= RULE_ID )
            {
            // InternalLlms.g:347:3: (lv_name_0_0= RULE_ID )
            // InternalLlms.g:348:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getNamesAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNamesRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleNames"


    // $ANTLR start "entryRuleFunctions"
    // InternalLlms.g:367:1: entryRuleFunctions returns [EObject current=null] : iv_ruleFunctions= ruleFunctions EOF ;
    public final EObject entryRuleFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctions = null;


        try {
            // InternalLlms.g:367:50: (iv_ruleFunctions= ruleFunctions EOF )
            // InternalLlms.g:368:2: iv_ruleFunctions= ruleFunctions EOF
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
    // InternalLlms.g:374:1: ruleFunctions returns [EObject current=null] : (otherlv_0= 'Function' ( (lv_output_1_0= ruleParametersOutptut ) ) otherlv_2= '<=' ( (lv_name_3_0= ruleNames ) ) ( (lv_params_4_0= ruleParametersfunc ) ) otherlv_5= '=>' otherlv_6= '{' ( (lv_body_7_0= ruleBodies ) ) otherlv_8= '}' ) ;
    public final EObject ruleFunctions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_output_1_0 = null;

        EObject lv_name_3_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_body_7_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:380:2: ( (otherlv_0= 'Function' ( (lv_output_1_0= ruleParametersOutptut ) ) otherlv_2= '<=' ( (lv_name_3_0= ruleNames ) ) ( (lv_params_4_0= ruleParametersfunc ) ) otherlv_5= '=>' otherlv_6= '{' ( (lv_body_7_0= ruleBodies ) ) otherlv_8= '}' ) )
            // InternalLlms.g:381:2: (otherlv_0= 'Function' ( (lv_output_1_0= ruleParametersOutptut ) ) otherlv_2= '<=' ( (lv_name_3_0= ruleNames ) ) ( (lv_params_4_0= ruleParametersfunc ) ) otherlv_5= '=>' otherlv_6= '{' ( (lv_body_7_0= ruleBodies ) ) otherlv_8= '}' )
            {
            // InternalLlms.g:381:2: (otherlv_0= 'Function' ( (lv_output_1_0= ruleParametersOutptut ) ) otherlv_2= '<=' ( (lv_name_3_0= ruleNames ) ) ( (lv_params_4_0= ruleParametersfunc ) ) otherlv_5= '=>' otherlv_6= '{' ( (lv_body_7_0= ruleBodies ) ) otherlv_8= '}' )
            // InternalLlms.g:382:3: otherlv_0= 'Function' ( (lv_output_1_0= ruleParametersOutptut ) ) otherlv_2= '<=' ( (lv_name_3_0= ruleNames ) ) ( (lv_params_4_0= ruleParametersfunc ) ) otherlv_5= '=>' otherlv_6= '{' ( (lv_body_7_0= ruleBodies ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionsAccess().getFunctionKeyword_0());
            		
            // InternalLlms.g:386:3: ( (lv_output_1_0= ruleParametersOutptut ) )
            // InternalLlms.g:387:4: (lv_output_1_0= ruleParametersOutptut )
            {
            // InternalLlms.g:387:4: (lv_output_1_0= ruleParametersOutptut )
            // InternalLlms.g:388:5: lv_output_1_0= ruleParametersOutptut
            {

            					newCompositeNode(grammarAccess.getFunctionsAccess().getOutputParametersOutptutParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_2=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionsAccess().getLessThanSignEqualsSignKeyword_2());
            		
            // InternalLlms.g:409:3: ( (lv_name_3_0= ruleNames ) )
            // InternalLlms.g:410:4: (lv_name_3_0= ruleNames )
            {
            // InternalLlms.g:410:4: (lv_name_3_0= ruleNames )
            // InternalLlms.g:411:5: lv_name_3_0= ruleNames
            {

            					newCompositeNode(grammarAccess.getFunctionsAccess().getNameNamesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_3_0=ruleNames();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionsRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"large.logic.forMathematics.statistics.Llms.Names");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLlms.g:428:3: ( (lv_params_4_0= ruleParametersfunc ) )
            // InternalLlms.g:429:4: (lv_params_4_0= ruleParametersfunc )
            {
            // InternalLlms.g:429:4: (lv_params_4_0= ruleParametersfunc )
            // InternalLlms.g:430:5: lv_params_4_0= ruleParametersfunc
            {

            					newCompositeNode(grammarAccess.getFunctionsAccess().getParamsParametersfuncParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_5=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionsAccess().getEqualsSignGreaterThanSignKeyword_5());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getFunctionsAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalLlms.g:455:3: ( (lv_body_7_0= ruleBodies ) )
            // InternalLlms.g:456:4: (lv_body_7_0= ruleBodies )
            {
            // InternalLlms.g:456:4: (lv_body_7_0= ruleBodies )
            // InternalLlms.g:457:5: lv_body_7_0= ruleBodies
            {

            					newCompositeNode(grammarAccess.getFunctionsAccess().getBodyBodiesParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_14);
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


    // $ANTLR start "entryRuleBodies"
    // InternalLlms.g:482:1: entryRuleBodies returns [EObject current=null] : iv_ruleBodies= ruleBodies EOF ;
    public final EObject entryRuleBodies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodies = null;


        try {
            // InternalLlms.g:482:47: (iv_ruleBodies= ruleBodies EOF )
            // InternalLlms.g:483:2: iv_ruleBodies= ruleBodies EOF
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
    // InternalLlms.g:489:1: ruleBodies returns [EObject current=null] : ( () ( (lv_var_1_0= ruleVariables ) )* otherlv_2= ';' ) ;
    public final EObject ruleBodies() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_var_1_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:495:2: ( ( () ( (lv_var_1_0= ruleVariables ) )* otherlv_2= ';' ) )
            // InternalLlms.g:496:2: ( () ( (lv_var_1_0= ruleVariables ) )* otherlv_2= ';' )
            {
            // InternalLlms.g:496:2: ( () ( (lv_var_1_0= ruleVariables ) )* otherlv_2= ';' )
            // InternalLlms.g:497:3: () ( (lv_var_1_0= ruleVariables ) )* otherlv_2= ';'
            {
            // InternalLlms.g:497:3: ()
            // InternalLlms.g:498:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBodiesAccess().getBodiesAction_0(),
            					current);
            			

            }

            // InternalLlms.g:504:3: ( (lv_var_1_0= ruleVariables ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLlms.g:505:4: (lv_var_1_0= ruleVariables )
            	    {
            	    // InternalLlms.g:505:4: (lv_var_1_0= ruleVariables )
            	    // InternalLlms.g:506:5: lv_var_1_0= ruleVariables
            	    {

            	    					newCompositeNode(grammarAccess.getBodiesAccess().getVarVariablesParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_var_1_0=ruleVariables();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBodiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"var",
            	    						lv_var_1_0,
            	    						"large.logic.forMathematics.statistics.Llms.Variables");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getBodiesAccess().getSemicolonKeyword_2());
            		

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


    // $ANTLR start "entryRuleLoops"
    // InternalLlms.g:531:1: entryRuleLoops returns [EObject current=null] : iv_ruleLoops= ruleLoops EOF ;
    public final EObject entryRuleLoops() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoops = null;


        try {
            // InternalLlms.g:531:46: (iv_ruleLoops= ruleLoops EOF )
            // InternalLlms.g:532:2: iv_ruleLoops= ruleLoops EOF
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
    // InternalLlms.g:538:1: ruleLoops returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' (this_Variables_2= ruleVariables | this_Numbers_3= ruleNumbers ) otherlv_4= ':' ( (lv_number_5_0= ruleNumbers ) ) otherlv_6= ')' otherlv_7= '=>' otherlv_8= '{' ( (lv_body_9_0= ruleBodies ) )+ otherlv_10= '}' ) ;
    public final EObject ruleLoops() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject this_Variables_2 = null;

        EObject this_Numbers_3 = null;

        EObject lv_number_5_0 = null;

        EObject lv_body_9_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:544:2: ( (otherlv_0= 'for' otherlv_1= '(' (this_Variables_2= ruleVariables | this_Numbers_3= ruleNumbers ) otherlv_4= ':' ( (lv_number_5_0= ruleNumbers ) ) otherlv_6= ')' otherlv_7= '=>' otherlv_8= '{' ( (lv_body_9_0= ruleBodies ) )+ otherlv_10= '}' ) )
            // InternalLlms.g:545:2: (otherlv_0= 'for' otherlv_1= '(' (this_Variables_2= ruleVariables | this_Numbers_3= ruleNumbers ) otherlv_4= ':' ( (lv_number_5_0= ruleNumbers ) ) otherlv_6= ')' otherlv_7= '=>' otherlv_8= '{' ( (lv_body_9_0= ruleBodies ) )+ otherlv_10= '}' )
            {
            // InternalLlms.g:545:2: (otherlv_0= 'for' otherlv_1= '(' (this_Variables_2= ruleVariables | this_Numbers_3= ruleNumbers ) otherlv_4= ':' ( (lv_number_5_0= ruleNumbers ) ) otherlv_6= ')' otherlv_7= '=>' otherlv_8= '{' ( (lv_body_9_0= ruleBodies ) )+ otherlv_10= '}' )
            // InternalLlms.g:546:3: otherlv_0= 'for' otherlv_1= '(' (this_Variables_2= ruleVariables | this_Numbers_3= ruleNumbers ) otherlv_4= ':' ( (lv_number_5_0= ruleNumbers ) ) otherlv_6= ')' otherlv_7= '=>' otherlv_8= '{' ( (lv_body_9_0= ruleBodies ) )+ otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopsAccess().getForKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLlms.g:554:3: (this_Variables_2= ruleVariables | this_Numbers_3= ruleNumbers )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalLlms.g:555:4: this_Variables_2= ruleVariables
                    {

                    				newCompositeNode(grammarAccess.getLoopsAccess().getVariablesParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_16);
                    this_Variables_2=ruleVariables();

                    state._fsp--;


                    				current = this_Variables_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalLlms.g:564:4: this_Numbers_3= ruleNumbers
                    {

                    				newCompositeNode(grammarAccess.getLoopsAccess().getNumbersParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_16);
                    this_Numbers_3=ruleNumbers();

                    state._fsp--;


                    				current = this_Numbers_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getLoopsAccess().getColonKeyword_3());
            		
            // InternalLlms.g:577:3: ( (lv_number_5_0= ruleNumbers ) )
            // InternalLlms.g:578:4: (lv_number_5_0= ruleNumbers )
            {
            // InternalLlms.g:578:4: (lv_number_5_0= ruleNumbers )
            // InternalLlms.g:579:5: lv_number_5_0= ruleNumbers
            {

            					newCompositeNode(grammarAccess.getLoopsAccess().getNumberNumbersParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_number_5_0=ruleNumbers();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopsRule());
            					}
            					set(
            						current,
            						"number",
            						lv_number_5_0,
            						"large.logic.forMathematics.statistics.Llms.Numbers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getLoopsAccess().getRightParenthesisKeyword_5());
            		
            otherlv_7=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getLoopsAccess().getEqualsSignGreaterThanSignKeyword_6());
            		
            otherlv_8=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getLoopsAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalLlms.g:608:3: ( (lv_body_9_0= ruleBodies ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLlms.g:609:4: (lv_body_9_0= ruleBodies )
            	    {
            	    // InternalLlms.g:609:4: (lv_body_9_0= ruleBodies )
            	    // InternalLlms.g:610:5: lv_body_9_0= ruleBodies
            	    {

            	    					newCompositeNode(grammarAccess.getLoopsAccess().getBodyBodiesParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_body_9_0=ruleBodies();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLoopsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"body",
            	    						lv_body_9_0,
            	    						"large.logic.forMathematics.statistics.Llms.Bodies");
            	    					afterParserOrEnumRuleCall();
            	    				

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

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getLoopsAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleConditionals"
    // InternalLlms.g:635:1: entryRuleConditionals returns [EObject current=null] : iv_ruleConditionals= ruleConditionals EOF ;
    public final EObject entryRuleConditionals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionals = null;


        try {
            // InternalLlms.g:635:53: (iv_ruleConditionals= ruleConditionals EOF )
            // InternalLlms.g:636:2: iv_ruleConditionals= ruleConditionals EOF
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
    // InternalLlms.g:642:1: ruleConditionals returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' this_LogicalParams_2= ruleLogicalParams otherlv_3= ')' otherlv_4= '=>' otherlv_5= '{' ( (lv_body_6_0= ruleBodies ) )+ otherlv_7= '}' (otherlv_8= 'else-if' otherlv_9= '(' ( (lv_logicParms_10_0= ruleLogicalParams ) ) otherlv_11= ')' otherlv_12= '=>' otherlv_13= '{' ( (lv_body_14_0= ruleBodies ) )+ otherlv_15= '}' )* otherlv_16= 'else{' ( (lv_body_17_0= ruleBodies ) )+ otherlv_18= '}' ) ;
    public final EObject ruleConditionals() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject this_LogicalParams_2 = null;

        EObject lv_body_6_0 = null;

        EObject lv_logicParms_10_0 = null;

        EObject lv_body_14_0 = null;

        EObject lv_body_17_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:648:2: ( (otherlv_0= 'if' otherlv_1= '(' this_LogicalParams_2= ruleLogicalParams otherlv_3= ')' otherlv_4= '=>' otherlv_5= '{' ( (lv_body_6_0= ruleBodies ) )+ otherlv_7= '}' (otherlv_8= 'else-if' otherlv_9= '(' ( (lv_logicParms_10_0= ruleLogicalParams ) ) otherlv_11= ')' otherlv_12= '=>' otherlv_13= '{' ( (lv_body_14_0= ruleBodies ) )+ otherlv_15= '}' )* otherlv_16= 'else{' ( (lv_body_17_0= ruleBodies ) )+ otherlv_18= '}' ) )
            // InternalLlms.g:649:2: (otherlv_0= 'if' otherlv_1= '(' this_LogicalParams_2= ruleLogicalParams otherlv_3= ')' otherlv_4= '=>' otherlv_5= '{' ( (lv_body_6_0= ruleBodies ) )+ otherlv_7= '}' (otherlv_8= 'else-if' otherlv_9= '(' ( (lv_logicParms_10_0= ruleLogicalParams ) ) otherlv_11= ')' otherlv_12= '=>' otherlv_13= '{' ( (lv_body_14_0= ruleBodies ) )+ otherlv_15= '}' )* otherlv_16= 'else{' ( (lv_body_17_0= ruleBodies ) )+ otherlv_18= '}' )
            {
            // InternalLlms.g:649:2: (otherlv_0= 'if' otherlv_1= '(' this_LogicalParams_2= ruleLogicalParams otherlv_3= ')' otherlv_4= '=>' otherlv_5= '{' ( (lv_body_6_0= ruleBodies ) )+ otherlv_7= '}' (otherlv_8= 'else-if' otherlv_9= '(' ( (lv_logicParms_10_0= ruleLogicalParams ) ) otherlv_11= ')' otherlv_12= '=>' otherlv_13= '{' ( (lv_body_14_0= ruleBodies ) )+ otherlv_15= '}' )* otherlv_16= 'else{' ( (lv_body_17_0= ruleBodies ) )+ otherlv_18= '}' )
            // InternalLlms.g:650:3: otherlv_0= 'if' otherlv_1= '(' this_LogicalParams_2= ruleLogicalParams otherlv_3= ')' otherlv_4= '=>' otherlv_5= '{' ( (lv_body_6_0= ruleBodies ) )+ otherlv_7= '}' (otherlv_8= 'else-if' otherlv_9= '(' ( (lv_logicParms_10_0= ruleLogicalParams ) ) otherlv_11= ')' otherlv_12= '=>' otherlv_13= '{' ( (lv_body_14_0= ruleBodies ) )+ otherlv_15= '}' )* otherlv_16= 'else{' ( (lv_body_17_0= ruleBodies ) )+ otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalsAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionalsAccess().getLeftParenthesisKeyword_1());
            		

            			newCompositeNode(grammarAccess.getConditionalsAccess().getLogicalParamsParserRuleCall_2());
            		
            pushFollow(FOLLOW_18);
            this_LogicalParams_2=ruleLogicalParams();

            state._fsp--;


            			current = this_LogicalParams_2;
            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionalsAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionalsAccess().getEqualsSignGreaterThanSignKeyword_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getConditionalsAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalLlms.g:678:3: ( (lv_body_6_0= ruleBodies ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLlms.g:679:4: (lv_body_6_0= ruleBodies )
            	    {
            	    // InternalLlms.g:679:4: (lv_body_6_0= ruleBodies )
            	    // InternalLlms.g:680:5: lv_body_6_0= ruleBodies
            	    {

            	    					newCompositeNode(grammarAccess.getConditionalsAccess().getBodyBodiesParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_body_6_0=ruleBodies();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConditionalsRule());
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_7, grammarAccess.getConditionalsAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalLlms.g:701:3: (otherlv_8= 'else-if' otherlv_9= '(' ( (lv_logicParms_10_0= ruleLogicalParams ) ) otherlv_11= ')' otherlv_12= '=>' otherlv_13= '{' ( (lv_body_14_0= ruleBodies ) )+ otherlv_15= '}' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLlms.g:702:4: otherlv_8= 'else-if' otherlv_9= '(' ( (lv_logicParms_10_0= ruleLogicalParams ) ) otherlv_11= ')' otherlv_12= '=>' otherlv_13= '{' ( (lv_body_14_0= ruleBodies ) )+ otherlv_15= '}'
            	    {
            	    otherlv_8=(Token)match(input,26,FOLLOW_5); 

            	    				newLeafNode(otherlv_8, grammarAccess.getConditionalsAccess().getElseIfKeyword_8_0());
            	    			
            	    otherlv_9=(Token)match(input,16,FOLLOW_20); 

            	    				newLeafNode(otherlv_9, grammarAccess.getConditionalsAccess().getLeftParenthesisKeyword_8_1());
            	    			
            	    // InternalLlms.g:710:4: ( (lv_logicParms_10_0= ruleLogicalParams ) )
            	    // InternalLlms.g:711:5: (lv_logicParms_10_0= ruleLogicalParams )
            	    {
            	    // InternalLlms.g:711:5: (lv_logicParms_10_0= ruleLogicalParams )
            	    // InternalLlms.g:712:6: lv_logicParms_10_0= ruleLogicalParams
            	    {

            	    						newCompositeNode(grammarAccess.getConditionalsAccess().getLogicParmsLogicalParamsParserRuleCall_8_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_logicParms_10_0=ruleLogicalParams();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConditionalsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"logicParms",
            	    							lv_logicParms_10_0,
            	    							"large.logic.forMathematics.statistics.Llms.LogicalParams");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_11=(Token)match(input,18,FOLLOW_12); 

            	    				newLeafNode(otherlv_11, grammarAccess.getConditionalsAccess().getRightParenthesisKeyword_8_3());
            	    			
            	    otherlv_12=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_12, grammarAccess.getConditionalsAccess().getEqualsSignGreaterThanSignKeyword_8_4());
            	    			
            	    otherlv_13=(Token)match(input,13,FOLLOW_13); 

            	    				newLeafNode(otherlv_13, grammarAccess.getConditionalsAccess().getLeftCurlyBracketKeyword_8_5());
            	    			
            	    // InternalLlms.g:741:4: ( (lv_body_14_0= ruleBodies ) )+
            	    int cnt9=0;
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==RULE_ID||LA9_0==22) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalLlms.g:742:5: (lv_body_14_0= ruleBodies )
            	    	    {
            	    	    // InternalLlms.g:742:5: (lv_body_14_0= ruleBodies )
            	    	    // InternalLlms.g:743:6: lv_body_14_0= ruleBodies
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getConditionalsAccess().getBodyBodiesParserRuleCall_8_6_0());
            	    	    					
            	    	    pushFollow(FOLLOW_19);
            	    	    lv_body_14_0=ruleBodies();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getConditionalsRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"body",
            	    	    							lv_body_14_0,
            	    	    							"large.logic.forMathematics.statistics.Llms.Bodies");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt9 >= 1 ) break loop9;
            	                EarlyExitException eee =
            	                    new EarlyExitException(9, input);
            	                throw eee;
            	        }
            	        cnt9++;
            	    } while (true);

            	    otherlv_15=(Token)match(input,14,FOLLOW_21); 

            	    				newLeafNode(otherlv_15, grammarAccess.getConditionalsAccess().getRightCurlyBracketKeyword_8_7());
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_16=(Token)match(input,27,FOLLOW_13); 

            			newLeafNode(otherlv_16, grammarAccess.getConditionalsAccess().getElseKeyword_9());
            		
            // InternalLlms.g:769:3: ( (lv_body_17_0= ruleBodies ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLlms.g:770:4: (lv_body_17_0= ruleBodies )
            	    {
            	    // InternalLlms.g:770:4: (lv_body_17_0= ruleBodies )
            	    // InternalLlms.g:771:5: lv_body_17_0= ruleBodies
            	    {

            	    					newCompositeNode(grammarAccess.getConditionalsAccess().getBodyBodiesParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_body_17_0=ruleBodies();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConditionalsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"body",
            	    						lv_body_17_0,
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

            otherlv_18=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getConditionalsAccess().getRightCurlyBracketKeyword_11());
            		

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


    // $ANTLR start "entryRuleLogicalParams"
    // InternalLlms.g:796:1: entryRuleLogicalParams returns [EObject current=null] : iv_ruleLogicalParams= ruleLogicalParams EOF ;
    public final EObject entryRuleLogicalParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalParams = null;


        try {
            // InternalLlms.g:796:54: (iv_ruleLogicalParams= ruleLogicalParams EOF )
            // InternalLlms.g:797:2: iv_ruleLogicalParams= ruleLogicalParams EOF
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
    // InternalLlms.g:803:1: ruleLogicalParams returns [EObject current=null] : (this_LogicalOperation_0= ruleLogicalOperation ( ( (lv_boolFunc_1_0= ruleBooleanFunction ) ) ( (lv_lgicOp_2_0= ruleLogicalOperation ) ) )* ) ;
    public final EObject ruleLogicalParams() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOperation_0 = null;

        EObject lv_boolFunc_1_0 = null;

        EObject lv_lgicOp_2_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:809:2: ( (this_LogicalOperation_0= ruleLogicalOperation ( ( (lv_boolFunc_1_0= ruleBooleanFunction ) ) ( (lv_lgicOp_2_0= ruleLogicalOperation ) ) )* ) )
            // InternalLlms.g:810:2: (this_LogicalOperation_0= ruleLogicalOperation ( ( (lv_boolFunc_1_0= ruleBooleanFunction ) ) ( (lv_lgicOp_2_0= ruleLogicalOperation ) ) )* )
            {
            // InternalLlms.g:810:2: (this_LogicalOperation_0= ruleLogicalOperation ( ( (lv_boolFunc_1_0= ruleBooleanFunction ) ) ( (lv_lgicOp_2_0= ruleLogicalOperation ) ) )* )
            // InternalLlms.g:811:3: this_LogicalOperation_0= ruleLogicalOperation ( ( (lv_boolFunc_1_0= ruleBooleanFunction ) ) ( (lv_lgicOp_2_0= ruleLogicalOperation ) ) )*
            {

            			newCompositeNode(grammarAccess.getLogicalParamsAccess().getLogicalOperationParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_LogicalOperation_0=ruleLogicalOperation();

            state._fsp--;


            			current = this_LogicalOperation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLlms.g:819:3: ( ( (lv_boolFunc_1_0= ruleBooleanFunction ) ) ( (lv_lgicOp_2_0= ruleLogicalOperation ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=35 && LA12_0<=39)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLlms.g:820:4: ( (lv_boolFunc_1_0= ruleBooleanFunction ) ) ( (lv_lgicOp_2_0= ruleLogicalOperation ) )
            	    {
            	    // InternalLlms.g:820:4: ( (lv_boolFunc_1_0= ruleBooleanFunction ) )
            	    // InternalLlms.g:821:5: (lv_boolFunc_1_0= ruleBooleanFunction )
            	    {
            	    // InternalLlms.g:821:5: (lv_boolFunc_1_0= ruleBooleanFunction )
            	    // InternalLlms.g:822:6: lv_boolFunc_1_0= ruleBooleanFunction
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalParamsAccess().getBoolFuncBooleanFunctionParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_20);
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

            	    // InternalLlms.g:839:4: ( (lv_lgicOp_2_0= ruleLogicalOperation ) )
            	    // InternalLlms.g:840:5: (lv_lgicOp_2_0= ruleLogicalOperation )
            	    {
            	    // InternalLlms.g:840:5: (lv_lgicOp_2_0= ruleLogicalOperation )
            	    // InternalLlms.g:841:6: lv_lgicOp_2_0= ruleLogicalOperation
            	    {

            	    						newCompositeNode(grammarAccess.getLogicalParamsAccess().getLgicOpLogicalOperationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
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
            	    break loop12;
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


    // $ANTLR start "entryRuleParametersOutptut"
    // InternalLlms.g:863:1: entryRuleParametersOutptut returns [EObject current=null] : iv_ruleParametersOutptut= ruleParametersOutptut EOF ;
    public final EObject entryRuleParametersOutptut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametersOutptut = null;


        try {
            // InternalLlms.g:863:58: (iv_ruleParametersOutptut= ruleParametersOutptut EOF )
            // InternalLlms.g:864:2: iv_ruleParametersOutptut= ruleParametersOutptut EOF
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
    // InternalLlms.g:870:1: ruleParametersOutptut returns [EObject current=null] : ( ( (lv_param_0_0= rulevarParmArgs ) ) | (otherlv_1= '[' () ( ( (lv_params_3_0= rulevarParmArgs ) ) (otherlv_4= ',' ( (lv_params_5_0= rulevarParmArgs ) ) )* )? otherlv_6= ']' ) ) ;
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
            // InternalLlms.g:876:2: ( ( ( (lv_param_0_0= rulevarParmArgs ) ) | (otherlv_1= '[' () ( ( (lv_params_3_0= rulevarParmArgs ) ) (otherlv_4= ',' ( (lv_params_5_0= rulevarParmArgs ) ) )* )? otherlv_6= ']' ) ) )
            // InternalLlms.g:877:2: ( ( (lv_param_0_0= rulevarParmArgs ) ) | (otherlv_1= '[' () ( ( (lv_params_3_0= rulevarParmArgs ) ) (otherlv_4= ',' ( (lv_params_5_0= rulevarParmArgs ) ) )* )? otherlv_6= ']' ) )
            {
            // InternalLlms.g:877:2: ( ( (lv_param_0_0= rulevarParmArgs ) ) | (otherlv_1= '[' () ( ( (lv_params_3_0= rulevarParmArgs ) ) (otherlv_4= ',' ( (lv_params_5_0= rulevarParmArgs ) ) )* )? otherlv_6= ']' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==28) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalLlms.g:878:3: ( (lv_param_0_0= rulevarParmArgs ) )
                    {
                    // InternalLlms.g:878:3: ( (lv_param_0_0= rulevarParmArgs ) )
                    // InternalLlms.g:879:4: (lv_param_0_0= rulevarParmArgs )
                    {
                    // InternalLlms.g:879:4: (lv_param_0_0= rulevarParmArgs )
                    // InternalLlms.g:880:5: lv_param_0_0= rulevarParmArgs
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
                    // InternalLlms.g:898:3: (otherlv_1= '[' () ( ( (lv_params_3_0= rulevarParmArgs ) ) (otherlv_4= ',' ( (lv_params_5_0= rulevarParmArgs ) ) )* )? otherlv_6= ']' )
                    {
                    // InternalLlms.g:898:3: (otherlv_1= '[' () ( ( (lv_params_3_0= rulevarParmArgs ) ) (otherlv_4= ',' ( (lv_params_5_0= rulevarParmArgs ) ) )* )? otherlv_6= ']' )
                    // InternalLlms.g:899:4: otherlv_1= '[' () ( ( (lv_params_3_0= rulevarParmArgs ) ) (otherlv_4= ',' ( (lv_params_5_0= rulevarParmArgs ) ) )* )? otherlv_6= ']'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getParametersOutptutAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalLlms.g:903:4: ()
                    // InternalLlms.g:904:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getParametersOutptutAccess().getParametersOutptutAction_1_1(),
                    						current);
                    				

                    }

                    // InternalLlms.g:910:4: ( ( (lv_params_3_0= rulevarParmArgs ) ) (otherlv_4= ',' ( (lv_params_5_0= rulevarParmArgs ) ) )* )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_ID) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalLlms.g:911:5: ( (lv_params_3_0= rulevarParmArgs ) ) (otherlv_4= ',' ( (lv_params_5_0= rulevarParmArgs ) ) )*
                            {
                            // InternalLlms.g:911:5: ( (lv_params_3_0= rulevarParmArgs ) )
                            // InternalLlms.g:912:6: (lv_params_3_0= rulevarParmArgs )
                            {
                            // InternalLlms.g:912:6: (lv_params_3_0= rulevarParmArgs )
                            // InternalLlms.g:913:7: lv_params_3_0= rulevarParmArgs
                            {

                            							newCompositeNode(grammarAccess.getParametersOutptutAccess().getParamsVarParmArgsParserRuleCall_1_2_0_0());
                            						
                            pushFollow(FOLLOW_24);
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

                            // InternalLlms.g:930:5: (otherlv_4= ',' ( (lv_params_5_0= rulevarParmArgs ) ) )*
                            loop13:
                            do {
                                int alt13=2;
                                int LA13_0 = input.LA(1);

                                if ( (LA13_0==17) ) {
                                    alt13=1;
                                }


                                switch (alt13) {
                            	case 1 :
                            	    // InternalLlms.g:931:6: otherlv_4= ',' ( (lv_params_5_0= rulevarParmArgs ) )
                            	    {
                            	    otherlv_4=(Token)match(input,17,FOLLOW_11); 

                            	    						newLeafNode(otherlv_4, grammarAccess.getParametersOutptutAccess().getCommaKeyword_1_2_1_0());
                            	    					
                            	    // InternalLlms.g:935:6: ( (lv_params_5_0= rulevarParmArgs ) )
                            	    // InternalLlms.g:936:7: (lv_params_5_0= rulevarParmArgs )
                            	    {
                            	    // InternalLlms.g:936:7: (lv_params_5_0= rulevarParmArgs )
                            	    // InternalLlms.g:937:8: lv_params_5_0= rulevarParmArgs
                            	    {

                            	    								newCompositeNode(grammarAccess.getParametersOutptutAccess().getParamsVarParmArgsParserRuleCall_1_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_24);
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
                            	    break loop13;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,29,FOLLOW_2); 

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
    // InternalLlms.g:965:1: entryRuleParametersfunc returns [EObject current=null] : iv_ruleParametersfunc= ruleParametersfunc EOF ;
    public final EObject entryRuleParametersfunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametersfunc = null;


        try {
            // InternalLlms.g:965:55: (iv_ruleParametersfunc= ruleParametersfunc EOF )
            // InternalLlms.g:966:2: iv_ruleParametersfunc= ruleParametersfunc EOF
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
    // InternalLlms.g:972:1: ruleParametersfunc returns [EObject current=null] : (otherlv_0= '(' () ( ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleParametersfunc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:978:2: ( (otherlv_0= '(' () ( ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalLlms.g:979:2: (otherlv_0= '(' () ( ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalLlms.g:979:2: (otherlv_0= '(' () ( ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalLlms.g:980:3: otherlv_0= '(' () ( ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getParametersfuncAccess().getLeftParenthesisKeyword_0());
            		
            // InternalLlms.g:984:3: ()
            // InternalLlms.g:985:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParametersfuncAccess().getFunOutputsAction_1(),
            					current);
            			

            }

            // InternalLlms.g:991:3: ( ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_DOUBLE)||LA17_0==20||(LA17_0>=30 && LA17_0<=39)||(LA17_0>=48 && LA17_0<=49)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalLlms.g:992:4: ( (lv_params_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )*
                    {
                    // InternalLlms.g:992:4: ( (lv_params_2_0= ruleExpression ) )
                    // InternalLlms.g:993:5: (lv_params_2_0= ruleExpression )
                    {
                    // InternalLlms.g:993:5: (lv_params_2_0= ruleExpression )
                    // InternalLlms.g:994:6: lv_params_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getParametersfuncAccess().getParamsExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalLlms.g:1011:4: (otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==17) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalLlms.g:1012:5: otherlv_3= ',' ( (lv_params_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_26); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getParametersfuncAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalLlms.g:1016:5: ( (lv_params_4_0= ruleExpression ) )
                    	    // InternalLlms.g:1017:6: (lv_params_4_0= ruleExpression )
                    	    {
                    	    // InternalLlms.g:1017:6: (lv_params_4_0= ruleExpression )
                    	    // InternalLlms.g:1018:7: lv_params_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getParametersfuncAccess().getParamsExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

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


    // $ANTLR start "entryRuleExpression"
    // InternalLlms.g:1045:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalLlms.g:1045:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalLlms.g:1046:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalLlms.g:1052:1: ruleExpression returns [EObject current=null] : ( (lv_op_0_0= ruleOperation ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_op_0_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:1058:2: ( ( (lv_op_0_0= ruleOperation ) ) )
            // InternalLlms.g:1059:2: ( (lv_op_0_0= ruleOperation ) )
            {
            // InternalLlms.g:1059:2: ( (lv_op_0_0= ruleOperation ) )
            // InternalLlms.g:1060:3: (lv_op_0_0= ruleOperation )
            {
            // InternalLlms.g:1060:3: (lv_op_0_0= ruleOperation )
            // InternalLlms.g:1061:4: lv_op_0_0= ruleOperation
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


    // $ANTLR start "entryRuleOperation"
    // InternalLlms.g:1081:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalLlms.g:1081:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalLlms.g:1082:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalLlms.g:1088:1: ruleOperation returns [EObject current=null] : (this_AritmeticOperation_0= ruleAritmeticOperation | this_LogicalOperation_1= ruleLogicalOperation | this_BooleanFunction_2= ruleBooleanFunction ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_AritmeticOperation_0 = null;

        EObject this_LogicalOperation_1 = null;

        EObject this_BooleanFunction_2 = null;



        	enterRule();

        try {
            // InternalLlms.g:1094:2: ( (this_AritmeticOperation_0= ruleAritmeticOperation | this_LogicalOperation_1= ruleLogicalOperation | this_BooleanFunction_2= ruleBooleanFunction ) )
            // InternalLlms.g:1095:2: (this_AritmeticOperation_0= ruleAritmeticOperation | this_LogicalOperation_1= ruleLogicalOperation | this_BooleanFunction_2= ruleBooleanFunction )
            {
            // InternalLlms.g:1095:2: (this_AritmeticOperation_0= ruleAritmeticOperation | this_LogicalOperation_1= ruleLogicalOperation | this_BooleanFunction_2= ruleBooleanFunction )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case RULE_DOUBLE:
            case 48:
            case 49:
                {
                alt18=1;
                }
                break;
            case 20:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
                {
                alt18=2;
                }
                break;
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalLlms.g:1096:3: this_AritmeticOperation_0= ruleAritmeticOperation
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
                    // InternalLlms.g:1105:3: this_LogicalOperation_1= ruleLogicalOperation
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
                    // InternalLlms.g:1114:3: this_BooleanFunction_2= ruleBooleanFunction
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
    // InternalLlms.g:1126:1: entryRuleLogicalOperation returns [EObject current=null] : iv_ruleLogicalOperation= ruleLogicalOperation EOF ;
    public final EObject entryRuleLogicalOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOperation = null;


        try {
            // InternalLlms.g:1126:57: (iv_ruleLogicalOperation= ruleLogicalOperation EOF )
            // InternalLlms.g:1127:2: iv_ruleLogicalOperation= ruleLogicalOperation EOF
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
    // InternalLlms.g:1133:1: ruleLogicalOperation returns [EObject current=null] : (this_LessThan_0= ruleLessThan | this_GreaterThan_1= ruleGreaterThan | this_Equal_2= ruleEqual | this_NotEqual_3= ruleNotEqual | this_LessOrEqual_4= ruleLessOrEqual | this_GreaterOrEqual_5= ruleGreaterOrEqual ) ;
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
            // InternalLlms.g:1139:2: ( (this_LessThan_0= ruleLessThan | this_GreaterThan_1= ruleGreaterThan | this_Equal_2= ruleEqual | this_NotEqual_3= ruleNotEqual | this_LessOrEqual_4= ruleLessOrEqual | this_GreaterOrEqual_5= ruleGreaterOrEqual ) )
            // InternalLlms.g:1140:2: (this_LessThan_0= ruleLessThan | this_GreaterThan_1= ruleGreaterThan | this_Equal_2= ruleEqual | this_NotEqual_3= ruleNotEqual | this_LessOrEqual_4= ruleLessOrEqual | this_GreaterOrEqual_5= ruleGreaterOrEqual )
            {
            // InternalLlms.g:1140:2: (this_LessThan_0= ruleLessThan | this_GreaterThan_1= ruleGreaterThan | this_Equal_2= ruleEqual | this_NotEqual_3= ruleNotEqual | this_LessOrEqual_4= ruleLessOrEqual | this_GreaterOrEqual_5= ruleGreaterOrEqual )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt19=1;
                }
                break;
            case 31:
                {
                alt19=2;
                }
                break;
            case 32:
                {
                alt19=3;
                }
                break;
            case 33:
                {
                alt19=4;
                }
                break;
            case 20:
                {
                alt19=5;
                }
                break;
            case 34:
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalLlms.g:1141:3: this_LessThan_0= ruleLessThan
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
                    // InternalLlms.g:1150:3: this_GreaterThan_1= ruleGreaterThan
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
                    // InternalLlms.g:1159:3: this_Equal_2= ruleEqual
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
                    // InternalLlms.g:1168:3: this_NotEqual_3= ruleNotEqual
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
                    // InternalLlms.g:1177:3: this_LessOrEqual_4= ruleLessOrEqual
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
                    // InternalLlms.g:1186:3: this_GreaterOrEqual_5= ruleGreaterOrEqual
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
    // InternalLlms.g:1198:1: entryRuleLessThan returns [EObject current=null] : iv_ruleLessThan= ruleLessThan EOF ;
    public final EObject entryRuleLessThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessThan = null;


        try {
            // InternalLlms.g:1198:49: (iv_ruleLessThan= ruleLessThan EOF )
            // InternalLlms.g:1199:2: iv_ruleLessThan= ruleLessThan EOF
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
    // InternalLlms.g:1205:1: ruleLessThan returns [EObject current=null] : (otherlv_0= '<' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) ) ;
    public final EObject ruleLessThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:1211:2: ( (otherlv_0= '<' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) ) )
            // InternalLlms.g:1212:2: (otherlv_0= '<' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) )
            {
            // InternalLlms.g:1212:2: (otherlv_0= '<' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) )
            // InternalLlms.g:1213:3: otherlv_0= '<' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getLessThanAccess().getLessThanSignKeyword_0());
            		
            // InternalLlms.g:1217:3: ( (lv_left_1_0= rulePrimary ) )
            // InternalLlms.g:1218:4: (lv_left_1_0= rulePrimary )
            {
            // InternalLlms.g:1218:4: (lv_left_1_0= rulePrimary )
            // InternalLlms.g:1219:5: lv_left_1_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getLessThanAccess().getLeftPrimaryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalLlms.g:1236:3: ( (lv_right_2_0= rulePrimary ) )
            // InternalLlms.g:1237:4: (lv_right_2_0= rulePrimary )
            {
            // InternalLlms.g:1237:4: (lv_right_2_0= rulePrimary )
            // InternalLlms.g:1238:5: lv_right_2_0= rulePrimary
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
    // InternalLlms.g:1259:1: entryRuleGreaterThan returns [EObject current=null] : iv_ruleGreaterThan= ruleGreaterThan EOF ;
    public final EObject entryRuleGreaterThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterThan = null;


        try {
            // InternalLlms.g:1259:52: (iv_ruleGreaterThan= ruleGreaterThan EOF )
            // InternalLlms.g:1260:2: iv_ruleGreaterThan= ruleGreaterThan EOF
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
    // InternalLlms.g:1266:1: ruleGreaterThan returns [EObject current=null] : (otherlv_0= '>' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) ) ;
    public final EObject ruleGreaterThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:1272:2: ( (otherlv_0= '>' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) ) )
            // InternalLlms.g:1273:2: (otherlv_0= '>' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) )
            {
            // InternalLlms.g:1273:2: (otherlv_0= '>' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) )
            // InternalLlms.g:1274:3: otherlv_0= '>' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getGreaterThanAccess().getGreaterThanSignKeyword_0());
            		
            // InternalLlms.g:1278:3: ( (lv_left_1_0= rulePrimary ) )
            // InternalLlms.g:1279:4: (lv_left_1_0= rulePrimary )
            {
            // InternalLlms.g:1279:4: (lv_left_1_0= rulePrimary )
            // InternalLlms.g:1280:5: lv_left_1_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getGreaterThanAccess().getLeftPrimaryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalLlms.g:1297:3: ( (lv_right_2_0= rulePrimary ) )
            // InternalLlms.g:1298:4: (lv_right_2_0= rulePrimary )
            {
            // InternalLlms.g:1298:4: (lv_right_2_0= rulePrimary )
            // InternalLlms.g:1299:5: lv_right_2_0= rulePrimary
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
    // InternalLlms.g:1320:1: entryRuleEqual returns [EObject current=null] : iv_ruleEqual= ruleEqual EOF ;
    public final EObject entryRuleEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqual = null;


        try {
            // InternalLlms.g:1320:46: (iv_ruleEqual= ruleEqual EOF )
            // InternalLlms.g:1321:2: iv_ruleEqual= ruleEqual EOF
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
    // InternalLlms.g:1327:1: ruleEqual returns [EObject current=null] : (otherlv_0= '=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) ) ;
    public final EObject ruleEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:1333:2: ( (otherlv_0= '=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) ) )
            // InternalLlms.g:1334:2: (otherlv_0= '=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) )
            {
            // InternalLlms.g:1334:2: (otherlv_0= '=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) )
            // InternalLlms.g:1335:3: otherlv_0= '=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getEqualAccess().getEqualsSignKeyword_0());
            		
            // InternalLlms.g:1339:3: ( (lv_left_1_0= rulePrimary ) )
            // InternalLlms.g:1340:4: (lv_left_1_0= rulePrimary )
            {
            // InternalLlms.g:1340:4: (lv_left_1_0= rulePrimary )
            // InternalLlms.g:1341:5: lv_left_1_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getEqualAccess().getLeftPrimaryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalLlms.g:1358:3: ( (lv_right_2_0= rulePrimary ) )
            // InternalLlms.g:1359:4: (lv_right_2_0= rulePrimary )
            {
            // InternalLlms.g:1359:4: (lv_right_2_0= rulePrimary )
            // InternalLlms.g:1360:5: lv_right_2_0= rulePrimary
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
    // InternalLlms.g:1381:1: entryRuleNotEqual returns [EObject current=null] : iv_ruleNotEqual= ruleNotEqual EOF ;
    public final EObject entryRuleNotEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEqual = null;


        try {
            // InternalLlms.g:1381:49: (iv_ruleNotEqual= ruleNotEqual EOF )
            // InternalLlms.g:1382:2: iv_ruleNotEqual= ruleNotEqual EOF
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
    // InternalLlms.g:1388:1: ruleNotEqual returns [EObject current=null] : (otherlv_0= '!=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) ) ;
    public final EObject ruleNotEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:1394:2: ( (otherlv_0= '!=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) ) )
            // InternalLlms.g:1395:2: (otherlv_0= '!=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) )
            {
            // InternalLlms.g:1395:2: (otherlv_0= '!=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) )
            // InternalLlms.g:1396:3: otherlv_0= '!=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getNotEqualAccess().getExclamationMarkEqualsSignKeyword_0());
            		
            // InternalLlms.g:1400:3: ( (lv_left_1_0= rulePrimary ) )
            // InternalLlms.g:1401:4: (lv_left_1_0= rulePrimary )
            {
            // InternalLlms.g:1401:4: (lv_left_1_0= rulePrimary )
            // InternalLlms.g:1402:5: lv_left_1_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getNotEqualAccess().getLeftPrimaryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalLlms.g:1419:3: ( (lv_right_2_0= rulePrimary ) )
            // InternalLlms.g:1420:4: (lv_right_2_0= rulePrimary )
            {
            // InternalLlms.g:1420:4: (lv_right_2_0= rulePrimary )
            // InternalLlms.g:1421:5: lv_right_2_0= rulePrimary
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
    // InternalLlms.g:1442:1: entryRuleLessOrEqual returns [EObject current=null] : iv_ruleLessOrEqual= ruleLessOrEqual EOF ;
    public final EObject entryRuleLessOrEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessOrEqual = null;


        try {
            // InternalLlms.g:1442:52: (iv_ruleLessOrEqual= ruleLessOrEqual EOF )
            // InternalLlms.g:1443:2: iv_ruleLessOrEqual= ruleLessOrEqual EOF
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
    // InternalLlms.g:1449:1: ruleLessOrEqual returns [EObject current=null] : (otherlv_0= '<=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) ) ;
    public final EObject ruleLessOrEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:1455:2: ( (otherlv_0= '<=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) ) )
            // InternalLlms.g:1456:2: (otherlv_0= '<=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) )
            {
            // InternalLlms.g:1456:2: (otherlv_0= '<=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) )
            // InternalLlms.g:1457:3: otherlv_0= '<=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getLessOrEqualAccess().getLessThanSignEqualsSignKeyword_0());
            		
            // InternalLlms.g:1461:3: ( (lv_left_1_0= rulePrimary ) )
            // InternalLlms.g:1462:4: (lv_left_1_0= rulePrimary )
            {
            // InternalLlms.g:1462:4: (lv_left_1_0= rulePrimary )
            // InternalLlms.g:1463:5: lv_left_1_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getLessOrEqualAccess().getLeftPrimaryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalLlms.g:1480:3: ( (lv_right_2_0= rulePrimary ) )
            // InternalLlms.g:1481:4: (lv_right_2_0= rulePrimary )
            {
            // InternalLlms.g:1481:4: (lv_right_2_0= rulePrimary )
            // InternalLlms.g:1482:5: lv_right_2_0= rulePrimary
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
    // InternalLlms.g:1503:1: entryRuleGreaterOrEqual returns [EObject current=null] : iv_ruleGreaterOrEqual= ruleGreaterOrEqual EOF ;
    public final EObject entryRuleGreaterOrEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterOrEqual = null;


        try {
            // InternalLlms.g:1503:55: (iv_ruleGreaterOrEqual= ruleGreaterOrEqual EOF )
            // InternalLlms.g:1504:2: iv_ruleGreaterOrEqual= ruleGreaterOrEqual EOF
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
    // InternalLlms.g:1510:1: ruleGreaterOrEqual returns [EObject current=null] : (otherlv_0= '>=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) ) ;
    public final EObject ruleGreaterOrEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:1516:2: ( (otherlv_0= '>=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) ) )
            // InternalLlms.g:1517:2: (otherlv_0= '>=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) )
            {
            // InternalLlms.g:1517:2: (otherlv_0= '>=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) ) )
            // InternalLlms.g:1518:3: otherlv_0= '>=' ( (lv_left_1_0= rulePrimary ) ) ( (lv_right_2_0= rulePrimary ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getGreaterOrEqualAccess().getGreaterThanSignEqualsSignKeyword_0());
            		
            // InternalLlms.g:1522:3: ( (lv_left_1_0= rulePrimary ) )
            // InternalLlms.g:1523:4: (lv_left_1_0= rulePrimary )
            {
            // InternalLlms.g:1523:4: (lv_left_1_0= rulePrimary )
            // InternalLlms.g:1524:5: lv_left_1_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getGreaterOrEqualAccess().getLeftPrimaryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalLlms.g:1541:3: ( (lv_right_2_0= rulePrimary ) )
            // InternalLlms.g:1542:4: (lv_right_2_0= rulePrimary )
            {
            // InternalLlms.g:1542:4: (lv_right_2_0= rulePrimary )
            // InternalLlms.g:1543:5: lv_right_2_0= rulePrimary
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
    // InternalLlms.g:1564:1: entryRuleBooleanFunction returns [EObject current=null] : iv_ruleBooleanFunction= ruleBooleanFunction EOF ;
    public final EObject entryRuleBooleanFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanFunction = null;


        try {
            // InternalLlms.g:1564:56: (iv_ruleBooleanFunction= ruleBooleanFunction EOF )
            // InternalLlms.g:1565:2: iv_ruleBooleanFunction= ruleBooleanFunction EOF
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
    // InternalLlms.g:1571:1: ruleBooleanFunction returns [EObject current=null] : (this_Ands_0= ruleAnds | this_Ors_1= ruleOrs | this_Nots_2= ruleNots | this_Nors_3= ruleNors | this_Nands_4= ruleNands ) ;
    public final EObject ruleBooleanFunction() throws RecognitionException {
        EObject current = null;

        EObject this_Ands_0 = null;

        EObject this_Ors_1 = null;

        EObject this_Nots_2 = null;

        EObject this_Nors_3 = null;

        EObject this_Nands_4 = null;



        	enterRule();

        try {
            // InternalLlms.g:1577:2: ( (this_Ands_0= ruleAnds | this_Ors_1= ruleOrs | this_Nots_2= ruleNots | this_Nors_3= ruleNors | this_Nands_4= ruleNands ) )
            // InternalLlms.g:1578:2: (this_Ands_0= ruleAnds | this_Ors_1= ruleOrs | this_Nots_2= ruleNots | this_Nors_3= ruleNors | this_Nands_4= ruleNands )
            {
            // InternalLlms.g:1578:2: (this_Ands_0= ruleAnds | this_Ors_1= ruleOrs | this_Nots_2= ruleNots | this_Nors_3= ruleNors | this_Nands_4= ruleNands )
            int alt20=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt20=1;
                }
                break;
            case 36:
                {
                alt20=2;
                }
                break;
            case 37:
                {
                alt20=3;
                }
                break;
            case 38:
                {
                alt20=4;
                }
                break;
            case 39:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalLlms.g:1579:3: this_Ands_0= ruleAnds
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
                    // InternalLlms.g:1588:3: this_Ors_1= ruleOrs
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
                    // InternalLlms.g:1597:3: this_Nots_2= ruleNots
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
                    // InternalLlms.g:1606:3: this_Nors_3= ruleNors
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
                    // InternalLlms.g:1615:3: this_Nands_4= ruleNands
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
    // InternalLlms.g:1627:1: entryRuleAnds returns [EObject current=null] : iv_ruleAnds= ruleAnds EOF ;
    public final EObject entryRuleAnds() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnds = null;


        try {
            // InternalLlms.g:1627:45: (iv_ruleAnds= ruleAnds EOF )
            // InternalLlms.g:1628:2: iv_ruleAnds= ruleAnds EOF
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
    // InternalLlms.g:1634:1: ruleAnds returns [EObject current=null] : (otherlv_0= '&&' ( (lv_primary_1_0= rulePrimary ) )+ ) ;
    public final EObject ruleAnds() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_primary_1_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:1640:2: ( (otherlv_0= '&&' ( (lv_primary_1_0= rulePrimary ) )+ ) )
            // InternalLlms.g:1641:2: (otherlv_0= '&&' ( (lv_primary_1_0= rulePrimary ) )+ )
            {
            // InternalLlms.g:1641:2: (otherlv_0= '&&' ( (lv_primary_1_0= rulePrimary ) )+ )
            // InternalLlms.g:1642:3: otherlv_0= '&&' ( (lv_primary_1_0= rulePrimary ) )+
            {
            otherlv_0=(Token)match(input,35,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAndsAccess().getAmpersandAmpersandKeyword_0());
            		
            // InternalLlms.g:1646:3: ( (lv_primary_1_0= rulePrimary ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_DOUBLE)||(LA21_0>=48 && LA21_0<=49)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalLlms.g:1647:4: (lv_primary_1_0= rulePrimary )
            	    {
            	    // InternalLlms.g:1647:4: (lv_primary_1_0= rulePrimary )
            	    // InternalLlms.g:1648:5: lv_primary_1_0= rulePrimary
            	    {

            	    					newCompositeNode(grammarAccess.getAndsAccess().getPrimaryPrimaryParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_27);
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
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
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
    // InternalLlms.g:1669:1: entryRuleOrs returns [EObject current=null] : iv_ruleOrs= ruleOrs EOF ;
    public final EObject entryRuleOrs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrs = null;


        try {
            // InternalLlms.g:1669:44: (iv_ruleOrs= ruleOrs EOF )
            // InternalLlms.g:1670:2: iv_ruleOrs= ruleOrs EOF
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
    // InternalLlms.g:1676:1: ruleOrs returns [EObject current=null] : (otherlv_0= '||' ( (lv_primary_1_0= rulePrimary ) )+ ) ;
    public final EObject ruleOrs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_primary_1_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:1682:2: ( (otherlv_0= '||' ( (lv_primary_1_0= rulePrimary ) )+ ) )
            // InternalLlms.g:1683:2: (otherlv_0= '||' ( (lv_primary_1_0= rulePrimary ) )+ )
            {
            // InternalLlms.g:1683:2: (otherlv_0= '||' ( (lv_primary_1_0= rulePrimary ) )+ )
            // InternalLlms.g:1684:3: otherlv_0= '||' ( (lv_primary_1_0= rulePrimary ) )+
            {
            otherlv_0=(Token)match(input,36,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getOrsAccess().getVerticalLineVerticalLineKeyword_0());
            		
            // InternalLlms.g:1688:3: ( (lv_primary_1_0= rulePrimary ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_DOUBLE)||(LA22_0>=48 && LA22_0<=49)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalLlms.g:1689:4: (lv_primary_1_0= rulePrimary )
            	    {
            	    // InternalLlms.g:1689:4: (lv_primary_1_0= rulePrimary )
            	    // InternalLlms.g:1690:5: lv_primary_1_0= rulePrimary
            	    {

            	    					newCompositeNode(grammarAccess.getOrsAccess().getPrimaryPrimaryParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_27);
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
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
    // InternalLlms.g:1711:1: entryRuleNots returns [EObject current=null] : iv_ruleNots= ruleNots EOF ;
    public final EObject entryRuleNots() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNots = null;


        try {
            // InternalLlms.g:1711:45: (iv_ruleNots= ruleNots EOF )
            // InternalLlms.g:1712:2: iv_ruleNots= ruleNots EOF
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
    // InternalLlms.g:1718:1: ruleNots returns [EObject current=null] : (otherlv_0= '!' ( (lv_primary_1_0= rulePrimary ) )+ ) ;
    public final EObject ruleNots() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_primary_1_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:1724:2: ( (otherlv_0= '!' ( (lv_primary_1_0= rulePrimary ) )+ ) )
            // InternalLlms.g:1725:2: (otherlv_0= '!' ( (lv_primary_1_0= rulePrimary ) )+ )
            {
            // InternalLlms.g:1725:2: (otherlv_0= '!' ( (lv_primary_1_0= rulePrimary ) )+ )
            // InternalLlms.g:1726:3: otherlv_0= '!' ( (lv_primary_1_0= rulePrimary ) )+
            {
            otherlv_0=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getNotsAccess().getExclamationMarkKeyword_0());
            		
            // InternalLlms.g:1730:3: ( (lv_primary_1_0= rulePrimary ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_DOUBLE)||(LA23_0>=48 && LA23_0<=49)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalLlms.g:1731:4: (lv_primary_1_0= rulePrimary )
            	    {
            	    // InternalLlms.g:1731:4: (lv_primary_1_0= rulePrimary )
            	    // InternalLlms.g:1732:5: lv_primary_1_0= rulePrimary
            	    {

            	    					newCompositeNode(grammarAccess.getNotsAccess().getPrimaryPrimaryParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_27);
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
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
    // InternalLlms.g:1753:1: entryRuleNors returns [EObject current=null] : iv_ruleNors= ruleNors EOF ;
    public final EObject entryRuleNors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNors = null;


        try {
            // InternalLlms.g:1753:45: (iv_ruleNors= ruleNors EOF )
            // InternalLlms.g:1754:2: iv_ruleNors= ruleNors EOF
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
    // InternalLlms.g:1760:1: ruleNors returns [EObject current=null] : (otherlv_0= 'nor' ( (lv_primary_1_0= rulePrimary ) )+ ) ;
    public final EObject ruleNors() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_primary_1_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:1766:2: ( (otherlv_0= 'nor' ( (lv_primary_1_0= rulePrimary ) )+ ) )
            // InternalLlms.g:1767:2: (otherlv_0= 'nor' ( (lv_primary_1_0= rulePrimary ) )+ )
            {
            // InternalLlms.g:1767:2: (otherlv_0= 'nor' ( (lv_primary_1_0= rulePrimary ) )+ )
            // InternalLlms.g:1768:3: otherlv_0= 'nor' ( (lv_primary_1_0= rulePrimary ) )+
            {
            otherlv_0=(Token)match(input,38,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getNorsAccess().getNorKeyword_0());
            		
            // InternalLlms.g:1772:3: ( (lv_primary_1_0= rulePrimary ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_DOUBLE)||(LA24_0>=48 && LA24_0<=49)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalLlms.g:1773:4: (lv_primary_1_0= rulePrimary )
            	    {
            	    // InternalLlms.g:1773:4: (lv_primary_1_0= rulePrimary )
            	    // InternalLlms.g:1774:5: lv_primary_1_0= rulePrimary
            	    {

            	    					newCompositeNode(grammarAccess.getNorsAccess().getPrimaryPrimaryParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_27);
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
    // $ANTLR end "ruleNors"


    // $ANTLR start "entryRuleNands"
    // InternalLlms.g:1795:1: entryRuleNands returns [EObject current=null] : iv_ruleNands= ruleNands EOF ;
    public final EObject entryRuleNands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNands = null;


        try {
            // InternalLlms.g:1795:46: (iv_ruleNands= ruleNands EOF )
            // InternalLlms.g:1796:2: iv_ruleNands= ruleNands EOF
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
    // InternalLlms.g:1802:1: ruleNands returns [EObject current=null] : (otherlv_0= 'nand' ( (lv_primary_1_0= rulePrimary ) )+ ) ;
    public final EObject ruleNands() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_primary_1_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:1808:2: ( (otherlv_0= 'nand' ( (lv_primary_1_0= rulePrimary ) )+ ) )
            // InternalLlms.g:1809:2: (otherlv_0= 'nand' ( (lv_primary_1_0= rulePrimary ) )+ )
            {
            // InternalLlms.g:1809:2: (otherlv_0= 'nand' ( (lv_primary_1_0= rulePrimary ) )+ )
            // InternalLlms.g:1810:3: otherlv_0= 'nand' ( (lv_primary_1_0= rulePrimary ) )+
            {
            otherlv_0=(Token)match(input,39,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getNandsAccess().getNandKeyword_0());
            		
            // InternalLlms.g:1814:3: ( (lv_primary_1_0= rulePrimary ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_DOUBLE)||(LA25_0>=48 && LA25_0<=49)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalLlms.g:1815:4: (lv_primary_1_0= rulePrimary )
            	    {
            	    // InternalLlms.g:1815:4: (lv_primary_1_0= rulePrimary )
            	    // InternalLlms.g:1816:5: lv_primary_1_0= rulePrimary
            	    {

            	    					newCompositeNode(grammarAccess.getNandsAccess().getPrimaryPrimaryParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_27);
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
    // $ANTLR end "ruleNands"


    // $ANTLR start "entryRuleAritmeticOperation"
    // InternalLlms.g:1837:1: entryRuleAritmeticOperation returns [EObject current=null] : iv_ruleAritmeticOperation= ruleAritmeticOperation EOF ;
    public final EObject entryRuleAritmeticOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAritmeticOperation = null;


        try {
            // InternalLlms.g:1837:59: (iv_ruleAritmeticOperation= ruleAritmeticOperation EOF )
            // InternalLlms.g:1838:2: iv_ruleAritmeticOperation= ruleAritmeticOperation EOF
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
    // InternalLlms.g:1844:1: ruleAritmeticOperation returns [EObject current=null] : ( (lv_sum_0_0= ruleSum ) ) ;
    public final EObject ruleAritmeticOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_sum_0_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:1850:2: ( ( (lv_sum_0_0= ruleSum ) ) )
            // InternalLlms.g:1851:2: ( (lv_sum_0_0= ruleSum ) )
            {
            // InternalLlms.g:1851:2: ( (lv_sum_0_0= ruleSum ) )
            // InternalLlms.g:1852:3: (lv_sum_0_0= ruleSum )
            {
            // InternalLlms.g:1852:3: (lv_sum_0_0= ruleSum )
            // InternalLlms.g:1853:4: lv_sum_0_0= ruleSum
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
    // InternalLlms.g:1873:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalLlms.g:1873:44: (iv_ruleSum= ruleSum EOF )
            // InternalLlms.g:1874:2: iv_ruleSum= ruleSum EOF
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
    // InternalLlms.g:1880:1: ruleSum returns [EObject current=null] : (this_Subs_0= ruleSubs ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubs ) ) )* ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Subs_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:1886:2: ( (this_Subs_0= ruleSubs ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubs ) ) )* ) )
            // InternalLlms.g:1887:2: (this_Subs_0= ruleSubs ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubs ) ) )* )
            {
            // InternalLlms.g:1887:2: (this_Subs_0= ruleSubs ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubs ) ) )* )
            // InternalLlms.g:1888:3: this_Subs_0= ruleSubs ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubs ) ) )*
            {

            			newCompositeNode(grammarAccess.getSumAccess().getSubsParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_Subs_0=ruleSubs();

            state._fsp--;


            			current = this_Subs_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLlms.g:1896:3: ( () otherlv_2= '+' ( (lv_right_3_0= ruleSubs ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==40) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalLlms.g:1897:4: () otherlv_2= '+' ( (lv_right_3_0= ruleSubs ) )
            	    {
            	    // InternalLlms.g:1897:4: ()
            	    // InternalLlms.g:1898:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getSumAccess().getSumLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,40,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSumAccess().getPlusSignKeyword_1_1());
            	    			
            	    // InternalLlms.g:1908:4: ( (lv_right_3_0= ruleSubs ) )
            	    // InternalLlms.g:1909:5: (lv_right_3_0= ruleSubs )
            	    {
            	    // InternalLlms.g:1909:5: (lv_right_3_0= ruleSubs )
            	    // InternalLlms.g:1910:6: lv_right_3_0= ruleSubs
            	    {

            	    						newCompositeNode(grammarAccess.getSumAccess().getRightSubsParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
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
            	    break loop26;
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
    // InternalLlms.g:1932:1: entryRuleSubs returns [EObject current=null] : iv_ruleSubs= ruleSubs EOF ;
    public final EObject entryRuleSubs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubs = null;


        try {
            // InternalLlms.g:1932:45: (iv_ruleSubs= ruleSubs EOF )
            // InternalLlms.g:1933:2: iv_ruleSubs= ruleSubs EOF
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
    // InternalLlms.g:1939:1: ruleSubs returns [EObject current=null] : (this_Divition_0= ruleDivition ( () otherlv_2= '-' ( (lv_right_3_0= ruleDivition ) ) )* ) ;
    public final EObject ruleSubs() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Divition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:1945:2: ( (this_Divition_0= ruleDivition ( () otherlv_2= '-' ( (lv_right_3_0= ruleDivition ) ) )* ) )
            // InternalLlms.g:1946:2: (this_Divition_0= ruleDivition ( () otherlv_2= '-' ( (lv_right_3_0= ruleDivition ) ) )* )
            {
            // InternalLlms.g:1946:2: (this_Divition_0= ruleDivition ( () otherlv_2= '-' ( (lv_right_3_0= ruleDivition ) ) )* )
            // InternalLlms.g:1947:3: this_Divition_0= ruleDivition ( () otherlv_2= '-' ( (lv_right_3_0= ruleDivition ) ) )*
            {

            			newCompositeNode(grammarAccess.getSubsAccess().getDivitionParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_Divition_0=ruleDivition();

            state._fsp--;


            			current = this_Divition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLlms.g:1955:3: ( () otherlv_2= '-' ( (lv_right_3_0= ruleDivition ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==41) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalLlms.g:1956:4: () otherlv_2= '-' ( (lv_right_3_0= ruleDivition ) )
            	    {
            	    // InternalLlms.g:1956:4: ()
            	    // InternalLlms.g:1957:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getSubsAccess().getSubsLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,41,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSubsAccess().getHyphenMinusKeyword_1_1());
            	    			
            	    // InternalLlms.g:1967:4: ( (lv_right_3_0= ruleDivition ) )
            	    // InternalLlms.g:1968:5: (lv_right_3_0= ruleDivition )
            	    {
            	    // InternalLlms.g:1968:5: (lv_right_3_0= ruleDivition )
            	    // InternalLlms.g:1969:6: lv_right_3_0= ruleDivition
            	    {

            	    						newCompositeNode(grammarAccess.getSubsAccess().getRightDivitionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
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
            	    break loop27;
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
    // InternalLlms.g:1991:1: entryRuleDivition returns [EObject current=null] : iv_ruleDivition= ruleDivition EOF ;
    public final EObject entryRuleDivition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivition = null;


        try {
            // InternalLlms.g:1991:49: (iv_ruleDivition= ruleDivition EOF )
            // InternalLlms.g:1992:2: iv_ruleDivition= ruleDivition EOF
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
    // InternalLlms.g:1998:1: ruleDivition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '/' ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleDivition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:2004:2: ( (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '/' ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalLlms.g:2005:2: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '/' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalLlms.g:2005:2: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '/' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalLlms.g:2006:3: this_Multiplication_0= ruleMultiplication ( () otherlv_2= '/' ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getDivitionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLlms.g:2014:3: ( () otherlv_2= '/' ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==42) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalLlms.g:2015:4: () otherlv_2= '/' ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalLlms.g:2015:4: ()
            	    // InternalLlms.g:2016:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getDivitionAccess().getDivitionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,42,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDivitionAccess().getSolidusKeyword_1_1());
            	    			
            	    // InternalLlms.g:2026:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalLlms.g:2027:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalLlms.g:2027:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalLlms.g:2028:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getDivitionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
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
            	    break loop28;
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
    // InternalLlms.g:2050:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalLlms.g:2050:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalLlms.g:2051:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalLlms.g:2057:1: ruleMultiplication returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:2063:2: ( (this_Primary_0= rulePrimary ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalLlms.g:2064:2: (this_Primary_0= rulePrimary ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalLlms.g:2064:2: (this_Primary_0= rulePrimary ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalLlms.g:2065:3: this_Primary_0= rulePrimary ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalLlms.g:2073:3: ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==43) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalLlms.g:2074:4: () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalLlms.g:2074:4: ()
            	    // InternalLlms.g:2075:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,43,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1());
            	    			
            	    // InternalLlms.g:2085:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalLlms.g:2086:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalLlms.g:2086:5: (lv_right_3_0= rulePrimary )
            	    // InternalLlms.g:2087:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_31);
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimary"
    // InternalLlms.g:2109:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalLlms.g:2109:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalLlms.g:2110:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalLlms.g:2116:1: rulePrimary returns [EObject current=null] : (this_varParmArgs_0= rulevarParmArgs | ( (otherlv_1= RULE_ID ) ) | this_callFunction_2= rulecallFunction | this_Data_3= ruleData ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_varParmArgs_0 = null;

        EObject this_callFunction_2 = null;

        EObject this_Data_3 = null;



        	enterRule();

        try {
            // InternalLlms.g:2122:2: ( (this_varParmArgs_0= rulevarParmArgs | ( (otherlv_1= RULE_ID ) ) | this_callFunction_2= rulecallFunction | this_Data_3= ruleData ) )
            // InternalLlms.g:2123:2: (this_varParmArgs_0= rulevarParmArgs | ( (otherlv_1= RULE_ID ) ) | this_callFunction_2= rulecallFunction | this_Data_3= ruleData )
            {
            // InternalLlms.g:2123:2: (this_varParmArgs_0= rulevarParmArgs | ( (otherlv_1= RULE_ID ) ) | this_callFunction_2= rulecallFunction | this_Data_3= ruleData )
            int alt30=4;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 24:
                    {
                    alt30=1;
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_INT:
                case RULE_STRING:
                case RULE_DOUBLE:
                case 17:
                case 18:
                case 20:
                case 22:
                case 30:
                case 31:
                case 32:
                case 33:
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
                case 48:
                case 49:
                    {
                    alt30=2;
                    }
                    break;
                case 16:
                    {
                    alt30=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA30_0>=RULE_INT && LA30_0<=RULE_DOUBLE)||(LA30_0>=48 && LA30_0<=49)) ) {
                alt30=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalLlms.g:2124:3: this_varParmArgs_0= rulevarParmArgs
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
                    // InternalLlms.g:2133:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalLlms.g:2133:3: ( (otherlv_1= RULE_ID ) )
                    // InternalLlms.g:2134:4: (otherlv_1= RULE_ID )
                    {
                    // InternalLlms.g:2134:4: (otherlv_1= RULE_ID )
                    // InternalLlms.g:2135:5: otherlv_1= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimaryRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getVarVariablesCrossReference_1_0());
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLlms.g:2147:3: this_callFunction_2= rulecallFunction
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getCallFunctionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_callFunction_2=rulecallFunction();

                    state._fsp--;


                    			current = this_callFunction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLlms.g:2156:3: this_Data_3= ruleData
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getDataParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Data_3=ruleData();

                    state._fsp--;


                    			current = this_Data_3;
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


    // $ANTLR start "entryRulecallFunction"
    // InternalLlms.g:2168:1: entryRulecallFunction returns [EObject current=null] : iv_rulecallFunction= rulecallFunction EOF ;
    public final EObject entryRulecallFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecallFunction = null;


        try {
            // InternalLlms.g:2168:53: (iv_rulecallFunction= rulecallFunction EOF )
            // InternalLlms.g:2169:2: iv_rulecallFunction= rulecallFunction EOF
            {
             newCompositeNode(grammarAccess.getCallFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecallFunction=rulecallFunction();

            state._fsp--;

             current =iv_rulecallFunction; 
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
    // $ANTLR end "entryRulecallFunction"


    // $ANTLR start "rulecallFunction"
    // InternalLlms.g:2175:1: rulecallFunction returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exp_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject rulecallFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exp_2_0 = null;

        EObject lv_exp_4_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:2181:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exp_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalLlms.g:2182:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exp_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalLlms.g:2182:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exp_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalLlms.g:2183:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exp_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalLlms.g:2183:3: ( (otherlv_0= RULE_ID ) )
            // InternalLlms.g:2184:4: (otherlv_0= RULE_ID )
            {
            // InternalLlms.g:2184:4: (otherlv_0= RULE_ID )
            // InternalLlms.g:2185:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallFunctionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_0, grammarAccess.getCallFunctionAccess().getFuncFunctionsCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getCallFunctionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLlms.g:2200:3: ( ( (lv_exp_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_DOUBLE)||LA32_0==20||(LA32_0>=30 && LA32_0<=39)||(LA32_0>=48 && LA32_0<=49)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalLlms.g:2201:4: ( (lv_exp_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) )*
                    {
                    // InternalLlms.g:2201:4: ( (lv_exp_2_0= ruleExpression ) )
                    // InternalLlms.g:2202:5: (lv_exp_2_0= ruleExpression )
                    {
                    // InternalLlms.g:2202:5: (lv_exp_2_0= ruleExpression )
                    // InternalLlms.g:2203:6: lv_exp_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getCallFunctionAccess().getExpExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    // InternalLlms.g:2220:4: (otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==17) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalLlms.g:2221:5: otherlv_3= ',' ( (lv_exp_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_26); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getCallFunctionAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalLlms.g:2225:5: ( (lv_exp_4_0= ruleExpression ) )
                    	    // InternalLlms.g:2226:6: (lv_exp_4_0= ruleExpression )
                    	    {
                    	    // InternalLlms.g:2226:6: (lv_exp_4_0= ruleExpression )
                    	    // InternalLlms.g:2227:7: lv_exp_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getCallFunctionAccess().getExpExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

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
    // $ANTLR end "rulecallFunction"


    // $ANTLR start "entryRuleVariables"
    // InternalLlms.g:2254:1: entryRuleVariables returns [EObject current=null] : iv_ruleVariables= ruleVariables EOF ;
    public final EObject entryRuleVariables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariables = null;


        try {
            // InternalLlms.g:2254:50: (iv_ruleVariables= ruleVariables EOF )
            // InternalLlms.g:2255:2: iv_ruleVariables= ruleVariables EOF
            {
             newCompositeNode(grammarAccess.getVariablesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariables=ruleVariables();

            state._fsp--;

             current =iv_ruleVariables; 
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
    // $ANTLR end "entryRuleVariables"


    // $ANTLR start "ruleVariables"
    // InternalLlms.g:2261:1: ruleVariables returns [EObject current=null] : ( (this_varParmArgs_0= rulevarParmArgs | this_CallVariable_1= ruleCallVariable ) otherlv_2= '<=' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleVariables() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_varParmArgs_0 = null;

        EObject this_CallVariable_1 = null;

        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:2267:2: ( ( (this_varParmArgs_0= rulevarParmArgs | this_CallVariable_1= ruleCallVariable ) otherlv_2= '<=' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ';' ) )
            // InternalLlms.g:2268:2: ( (this_varParmArgs_0= rulevarParmArgs | this_CallVariable_1= ruleCallVariable ) otherlv_2= '<=' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ';' )
            {
            // InternalLlms.g:2268:2: ( (this_varParmArgs_0= rulevarParmArgs | this_CallVariable_1= ruleCallVariable ) otherlv_2= '<=' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ';' )
            // InternalLlms.g:2269:3: (this_varParmArgs_0= rulevarParmArgs | this_CallVariable_1= ruleCallVariable ) otherlv_2= '<=' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ';'
            {
            // InternalLlms.g:2269:3: (this_varParmArgs_0= rulevarParmArgs | this_CallVariable_1= ruleCallVariable )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==20) ) {
                    alt33=2;
                }
                else if ( (LA33_1==24) ) {
                    alt33=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalLlms.g:2270:4: this_varParmArgs_0= rulevarParmArgs
                    {

                    				newCompositeNode(grammarAccess.getVariablesAccess().getVarParmArgsParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_10);
                    this_varParmArgs_0=rulevarParmArgs();

                    state._fsp--;


                    				current = this_varParmArgs_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalLlms.g:2279:4: this_CallVariable_1= ruleCallVariable
                    {

                    				newCompositeNode(grammarAccess.getVariablesAccess().getCallVariableParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_10);
                    this_CallVariable_1=ruleCallVariable();

                    state._fsp--;


                    				current = this_CallVariable_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getVariablesAccess().getLessThanSignEqualsSignKeyword_1());
            		
            // InternalLlms.g:2292:3: ( (lv_exp_3_0= ruleExpression ) )
            // InternalLlms.g:2293:4: (lv_exp_3_0= ruleExpression )
            {
            // InternalLlms.g:2293:4: (lv_exp_3_0= ruleExpression )
            // InternalLlms.g:2294:5: lv_exp_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getVariablesAccess().getExpExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
            lv_exp_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariablesRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"large.logic.forMathematics.statistics.Llms.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVariablesAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleVariables"


    // $ANTLR start "entryRuleCallVariable"
    // InternalLlms.g:2319:1: entryRuleCallVariable returns [EObject current=null] : iv_ruleCallVariable= ruleCallVariable EOF ;
    public final EObject entryRuleCallVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallVariable = null;


        try {
            // InternalLlms.g:2319:53: (iv_ruleCallVariable= ruleCallVariable EOF )
            // InternalLlms.g:2320:2: iv_ruleCallVariable= ruleCallVariable EOF
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
    // InternalLlms.g:2326:1: ruleCallVariable returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleCallVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalLlms.g:2332:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalLlms.g:2333:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalLlms.g:2333:2: ( (otherlv_0= RULE_ID ) )
            // InternalLlms.g:2334:3: (otherlv_0= RULE_ID )
            {
            // InternalLlms.g:2334:3: (otherlv_0= RULE_ID )
            // InternalLlms.g:2335:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCallVariableRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getCallVariableAccess().getVarsVariablesCrossReference_0());
            			

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


    // $ANTLR start "entryRulevarParmArgs"
    // InternalLlms.g:2349:1: entryRulevarParmArgs returns [EObject current=null] : iv_rulevarParmArgs= rulevarParmArgs EOF ;
    public final EObject entryRulevarParmArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevarParmArgs = null;


        try {
            // InternalLlms.g:2349:52: (iv_rulevarParmArgs= rulevarParmArgs EOF )
            // InternalLlms.g:2350:2: iv_rulevarParmArgs= rulevarParmArgs EOF
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
    // InternalLlms.g:2356:1: rulevarParmArgs returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_dataType_2_0= ruleDataTypes ) ) ) ;
    public final EObject rulevarParmArgs() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_dataType_2_0 = null;



        	enterRule();

        try {
            // InternalLlms.g:2362:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_dataType_2_0= ruleDataTypes ) ) ) )
            // InternalLlms.g:2363:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_dataType_2_0= ruleDataTypes ) ) )
            {
            // InternalLlms.g:2363:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_dataType_2_0= ruleDataTypes ) ) )
            // InternalLlms.g:2364:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_dataType_2_0= ruleDataTypes ) )
            {
            // InternalLlms.g:2364:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalLlms.g:2365:4: (lv_name_0_0= RULE_ID )
            {
            // InternalLlms.g:2365:4: (lv_name_0_0= RULE_ID )
            // InternalLlms.g:2366:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            otherlv_1=(Token)match(input,24,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getVarParmArgsAccess().getColonKeyword_1());
            		
            // InternalLlms.g:2386:3: ( (lv_dataType_2_0= ruleDataTypes ) )
            // InternalLlms.g:2387:4: (lv_dataType_2_0= ruleDataTypes )
            {
            // InternalLlms.g:2387:4: (lv_dataType_2_0= ruleDataTypes )
            // InternalLlms.g:2388:5: lv_dataType_2_0= ruleDataTypes
            {

            					newCompositeNode(grammarAccess.getVarParmArgsAccess().getDataTypeDataTypesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleDataTypes"
    // InternalLlms.g:2409:1: entryRuleDataTypes returns [String current=null] : iv_ruleDataTypes= ruleDataTypes EOF ;
    public final String entryRuleDataTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataTypes = null;


        try {
            // InternalLlms.g:2409:49: (iv_ruleDataTypes= ruleDataTypes EOF )
            // InternalLlms.g:2410:2: iv_ruleDataTypes= ruleDataTypes EOF
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
    // InternalLlms.g:2416:1: ruleDataTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'bool' | kw= 'doubles' | kw= 'string' ) ;
    public final AntlrDatatypeRuleToken ruleDataTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLlms.g:2422:2: ( (kw= 'int' | kw= 'bool' | kw= 'doubles' | kw= 'string' ) )
            // InternalLlms.g:2423:2: (kw= 'int' | kw= 'bool' | kw= 'doubles' | kw= 'string' )
            {
            // InternalLlms.g:2423:2: (kw= 'int' | kw= 'bool' | kw= 'doubles' | kw= 'string' )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt34=1;
                }
                break;
            case 45:
                {
                alt34=2;
                }
                break;
            case 46:
                {
                alt34=3;
                }
                break;
            case 47:
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
                    // InternalLlms.g:2424:3: kw= 'int'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypesAccess().getIntKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLlms.g:2430:3: kw= 'bool'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypesAccess().getBoolKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalLlms.g:2436:3: kw= 'doubles'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypesAccess().getDoublesKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalLlms.g:2442:3: kw= 'string'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

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


    // $ANTLR start "entryRuleData"
    // InternalLlms.g:2451:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalLlms.g:2451:45: (iv_ruleData= ruleData EOF )
            // InternalLlms.g:2452:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalLlms.g:2458:1: ruleData returns [EObject current=null] : (this_Numbers_0= ruleNumbers | this_Strings_1= ruleStrings | this_Booleans_2= ruleBooleans | this_Doubles_3= ruleDoubles ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        EObject this_Numbers_0 = null;

        EObject this_Strings_1 = null;

        EObject this_Booleans_2 = null;

        EObject this_Doubles_3 = null;



        	enterRule();

        try {
            // InternalLlms.g:2464:2: ( (this_Numbers_0= ruleNumbers | this_Strings_1= ruleStrings | this_Booleans_2= ruleBooleans | this_Doubles_3= ruleDoubles ) )
            // InternalLlms.g:2465:2: (this_Numbers_0= ruleNumbers | this_Strings_1= ruleStrings | this_Booleans_2= ruleBooleans | this_Doubles_3= ruleDoubles )
            {
            // InternalLlms.g:2465:2: (this_Numbers_0= ruleNumbers | this_Strings_1= ruleStrings | this_Booleans_2= ruleBooleans | this_Doubles_3= ruleDoubles )
            int alt35=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt35=1;
                }
                break;
            case RULE_STRING:
                {
                alt35=2;
                }
                break;
            case 48:
            case 49:
                {
                alt35=3;
                }
                break;
            case RULE_DOUBLE:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalLlms.g:2466:3: this_Numbers_0= ruleNumbers
                    {

                    			newCompositeNode(grammarAccess.getDataAccess().getNumbersParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Numbers_0=ruleNumbers();

                    state._fsp--;


                    			current = this_Numbers_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLlms.g:2475:3: this_Strings_1= ruleStrings
                    {

                    			newCompositeNode(grammarAccess.getDataAccess().getStringsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Strings_1=ruleStrings();

                    state._fsp--;


                    			current = this_Strings_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLlms.g:2484:3: this_Booleans_2= ruleBooleans
                    {

                    			newCompositeNode(grammarAccess.getDataAccess().getBooleansParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Booleans_2=ruleBooleans();

                    state._fsp--;


                    			current = this_Booleans_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLlms.g:2493:3: this_Doubles_3= ruleDoubles
                    {

                    			newCompositeNode(grammarAccess.getDataAccess().getDoublesParserRuleCall_3());
                    		
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
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleNumbers"
    // InternalLlms.g:2505:1: entryRuleNumbers returns [EObject current=null] : iv_ruleNumbers= ruleNumbers EOF ;
    public final EObject entryRuleNumbers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumbers = null;


        try {
            // InternalLlms.g:2505:48: (iv_ruleNumbers= ruleNumbers EOF )
            // InternalLlms.g:2506:2: iv_ruleNumbers= ruleNumbers EOF
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
    // InternalLlms.g:2512:1: ruleNumbers returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumbers() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalLlms.g:2518:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalLlms.g:2519:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalLlms.g:2519:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalLlms.g:2520:3: (lv_value_0_0= RULE_INT )
            {
            // InternalLlms.g:2520:3: (lv_value_0_0= RULE_INT )
            // InternalLlms.g:2521:4: lv_value_0_0= RULE_INT
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
    // InternalLlms.g:2540:1: entryRuleStrings returns [EObject current=null] : iv_ruleStrings= ruleStrings EOF ;
    public final EObject entryRuleStrings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrings = null;


        try {
            // InternalLlms.g:2540:48: (iv_ruleStrings= ruleStrings EOF )
            // InternalLlms.g:2541:2: iv_ruleStrings= ruleStrings EOF
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
    // InternalLlms.g:2547:1: ruleStrings returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStrings() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalLlms.g:2553:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalLlms.g:2554:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalLlms.g:2554:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalLlms.g:2555:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalLlms.g:2555:3: (lv_value_0_0= RULE_STRING )
            // InternalLlms.g:2556:4: lv_value_0_0= RULE_STRING
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
    // InternalLlms.g:2575:1: entryRuleBooleans returns [EObject current=null] : iv_ruleBooleans= ruleBooleans EOF ;
    public final EObject entryRuleBooleans() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleans = null;


        try {
            // InternalLlms.g:2575:49: (iv_ruleBooleans= ruleBooleans EOF )
            // InternalLlms.g:2576:2: iv_ruleBooleans= ruleBooleans EOF
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
    // InternalLlms.g:2582:1: ruleBooleans returns [EObject current=null] : ( ( (lv_value_0_0= 'true' ) ) | ( () otherlv_2= 'false' ) ) ;
    public final EObject ruleBooleans() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalLlms.g:2588:2: ( ( ( (lv_value_0_0= 'true' ) ) | ( () otherlv_2= 'false' ) ) )
            // InternalLlms.g:2589:2: ( ( (lv_value_0_0= 'true' ) ) | ( () otherlv_2= 'false' ) )
            {
            // InternalLlms.g:2589:2: ( ( (lv_value_0_0= 'true' ) ) | ( () otherlv_2= 'false' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==48) ) {
                alt36=1;
            }
            else if ( (LA36_0==49) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalLlms.g:2590:3: ( (lv_value_0_0= 'true' ) )
                    {
                    // InternalLlms.g:2590:3: ( (lv_value_0_0= 'true' ) )
                    // InternalLlms.g:2591:4: (lv_value_0_0= 'true' )
                    {
                    // InternalLlms.g:2591:4: (lv_value_0_0= 'true' )
                    // InternalLlms.g:2592:5: lv_value_0_0= 'true'
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
                    // InternalLlms.g:2605:3: ( () otherlv_2= 'false' )
                    {
                    // InternalLlms.g:2605:3: ( () otherlv_2= 'false' )
                    // InternalLlms.g:2606:4: () otherlv_2= 'false'
                    {
                    // InternalLlms.g:2606:4: ()
                    // InternalLlms.g:2607:5: 
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
    // InternalLlms.g:2622:1: entryRuleDoubles returns [EObject current=null] : iv_ruleDoubles= ruleDoubles EOF ;
    public final EObject entryRuleDoubles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubles = null;


        try {
            // InternalLlms.g:2622:48: (iv_ruleDoubles= ruleDoubles EOF )
            // InternalLlms.g:2623:2: iv_ruleDoubles= ruleDoubles EOF
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
    // InternalLlms.g:2629:1: ruleDoubles returns [EObject current=null] : ( (lv_value_0_0= RULE_DOUBLE ) ) ;
    public final EObject ruleDoubles() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalLlms.g:2635:2: ( ( (lv_value_0_0= RULE_DOUBLE ) ) )
            // InternalLlms.g:2636:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            {
            // InternalLlms.g:2636:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            // InternalLlms.g:2637:3: (lv_value_0_0= RULE_DOUBLE )
            {
            // InternalLlms.g:2637:3: (lv_value_0_0= RULE_DOUBLE )
            // InternalLlms.g:2638:4: lv_value_0_0= RULE_DOUBLE
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000288C010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00030000000400F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00030000000000F0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000404010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000007C0100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000F800000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000300FFC01400F0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000300FFC01000F0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00030000000000F2L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000F00000000000L});

}