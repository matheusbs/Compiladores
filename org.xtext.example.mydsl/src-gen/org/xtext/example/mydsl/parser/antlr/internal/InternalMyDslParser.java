package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENTIFICADOR", "RULE_CARACTERE", "RULE_NUMERO", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Program'", "';'"
    };
    public static final int RULE_ID=7;
    public static final int RULE_STRING=9;
    public static final int T__15=15;
    public static final int T__14=14;
    public static final int RULE_IDENTIFICADOR=4;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_NUMERO=6;
    public static final int RULE_INT=8;
    public static final int RULE_CARACTERE=5;
    public static final int RULE_WS=12;
    public static final int RULE_SL_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=10;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PascalProgram";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePascalProgram"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:67:1: entryRulePascalProgram returns [EObject current=null] : iv_rulePascalProgram= rulePascalProgram EOF ;
    public final EObject entryRulePascalProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePascalProgram = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_rulePascalProgram= rulePascalProgram EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: iv_rulePascalProgram= rulePascalProgram EOF
            {
             newCompositeNode(grammarAccess.getPascalProgramRule()); 
            pushFollow(FOLLOW_rulePascalProgram_in_entryRulePascalProgram75);
            iv_rulePascalProgram=rulePascalProgram();

            state._fsp--;

             current =iv_rulePascalProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePascalProgram85); 

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
    // $ANTLR end "entryRulePascalProgram"


    // $ANTLR start "rulePascalProgram"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:76:1: rulePascalProgram returns [EObject current=null] : (otherlv_0= 'Program' ( (lv_name_1_0= RULE_IDENTIFICADOR ) ) otherlv_2= ';' ) ;
    public final EObject rulePascalProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:79:28: ( (otherlv_0= 'Program' ( (lv_name_1_0= RULE_IDENTIFICADOR ) ) otherlv_2= ';' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'Program' ( (lv_name_1_0= RULE_IDENTIFICADOR ) ) otherlv_2= ';' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:1: (otherlv_0= 'Program' ( (lv_name_1_0= RULE_IDENTIFICADOR ) ) otherlv_2= ';' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:3: otherlv_0= 'Program' ( (lv_name_1_0= RULE_IDENTIFICADOR ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulePascalProgram122); 

                	newLeafNode(otherlv_0, grammarAccess.getPascalProgramAccess().getProgramKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:84:1: ( (lv_name_1_0= RULE_IDENTIFICADOR ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:85:1: (lv_name_1_0= RULE_IDENTIFICADOR )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:85:1: (lv_name_1_0= RULE_IDENTIFICADOR )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:86:3: lv_name_1_0= RULE_IDENTIFICADOR
            {
            lv_name_1_0=(Token)match(input,RULE_IDENTIFICADOR,FOLLOW_RULE_IDENTIFICADOR_in_rulePascalProgram139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPascalProgramAccess().getNameIDENTIFICADORTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPascalProgramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"IDENTIFICADOR");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePascalProgram156); 

                	newLeafNode(otherlv_2, grammarAccess.getPascalProgramAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "rulePascalProgram"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePascalProgram_in_entryRulePascalProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePascalProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePascalProgram122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFICADOR_in_rulePascalProgram139 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePascalProgram156 = new BitSet(new long[]{0x0000000000000002L});

}