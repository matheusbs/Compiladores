package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRulePascalProgram"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRulePascalProgram : rulePascalProgram EOF ;
    public final void entryRulePascalProgram() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( rulePascalProgram EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: rulePascalProgram EOF
            {
             before(grammarAccess.getPascalProgramRule()); 
            pushFollow(FOLLOW_rulePascalProgram_in_entryRulePascalProgram61);
            rulePascalProgram();

            state._fsp--;

             after(grammarAccess.getPascalProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePascalProgram68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePascalProgram"


    // $ANTLR start "rulePascalProgram"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: rulePascalProgram : ( ( rule__PascalProgram__Group__0 ) ) ;
    public final void rulePascalProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__PascalProgram__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__PascalProgram__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__PascalProgram__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__PascalProgram__Group__0 )
            {
             before(grammarAccess.getPascalProgramAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__PascalProgram__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__PascalProgram__Group__0
            {
            pushFollow(FOLLOW_rule__PascalProgram__Group__0_in_rulePascalProgram94);
            rule__PascalProgram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPascalProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePascalProgram"


    // $ANTLR start "rule__PascalProgram__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: rule__PascalProgram__Group__0 : rule__PascalProgram__Group__0__Impl rule__PascalProgram__Group__1 ;
    public final void rule__PascalProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:94:1: ( rule__PascalProgram__Group__0__Impl rule__PascalProgram__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:95:2: rule__PascalProgram__Group__0__Impl rule__PascalProgram__Group__1
            {
            pushFollow(FOLLOW_rule__PascalProgram__Group__0__Impl_in_rule__PascalProgram__Group__0128);
            rule__PascalProgram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PascalProgram__Group__1_in_rule__PascalProgram__Group__0131);
            rule__PascalProgram__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PascalProgram__Group__0"


    // $ANTLR start "rule__PascalProgram__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: rule__PascalProgram__Group__0__Impl : ( 'Program' ) ;
    public final void rule__PascalProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:106:1: ( ( 'Program' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:107:1: ( 'Program' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:107:1: ( 'Program' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:108:1: 'Program'
            {
             before(grammarAccess.getPascalProgramAccess().getProgramKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__PascalProgram__Group__0__Impl159); 
             after(grammarAccess.getPascalProgramAccess().getProgramKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PascalProgram__Group__0__Impl"


    // $ANTLR start "rule__PascalProgram__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:121:1: rule__PascalProgram__Group__1 : rule__PascalProgram__Group__1__Impl rule__PascalProgram__Group__2 ;
    public final void rule__PascalProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ( rule__PascalProgram__Group__1__Impl rule__PascalProgram__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:126:2: rule__PascalProgram__Group__1__Impl rule__PascalProgram__Group__2
            {
            pushFollow(FOLLOW_rule__PascalProgram__Group__1__Impl_in_rule__PascalProgram__Group__1190);
            rule__PascalProgram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PascalProgram__Group__2_in_rule__PascalProgram__Group__1193);
            rule__PascalProgram__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PascalProgram__Group__1"


    // $ANTLR start "rule__PascalProgram__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:133:1: rule__PascalProgram__Group__1__Impl : ( ( rule__PascalProgram__NameAssignment_1 ) ) ;
    public final void rule__PascalProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:137:1: ( ( ( rule__PascalProgram__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:138:1: ( ( rule__PascalProgram__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:138:1: ( ( rule__PascalProgram__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:139:1: ( rule__PascalProgram__NameAssignment_1 )
            {
             before(grammarAccess.getPascalProgramAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:140:1: ( rule__PascalProgram__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:140:2: rule__PascalProgram__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PascalProgram__NameAssignment_1_in_rule__PascalProgram__Group__1__Impl220);
            rule__PascalProgram__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPascalProgramAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PascalProgram__Group__1__Impl"


    // $ANTLR start "rule__PascalProgram__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:150:1: rule__PascalProgram__Group__2 : rule__PascalProgram__Group__2__Impl ;
    public final void rule__PascalProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:154:1: ( rule__PascalProgram__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:155:2: rule__PascalProgram__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PascalProgram__Group__2__Impl_in_rule__PascalProgram__Group__2250);
            rule__PascalProgram__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PascalProgram__Group__2"


    // $ANTLR start "rule__PascalProgram__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:161:1: rule__PascalProgram__Group__2__Impl : ( ';' ) ;
    public final void rule__PascalProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:165:1: ( ( ';' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:166:1: ( ';' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:166:1: ( ';' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:167:1: ';'
            {
             before(grammarAccess.getPascalProgramAccess().getSemicolonKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__PascalProgram__Group__2__Impl278); 
             after(grammarAccess.getPascalProgramAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PascalProgram__Group__2__Impl"


    // $ANTLR start "rule__PascalProgram__NameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: rule__PascalProgram__NameAssignment_1 : ( RULE_IDENTIFICADOR ) ;
    public final void rule__PascalProgram__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:191:1: ( ( RULE_IDENTIFICADOR ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:192:1: ( RULE_IDENTIFICADOR )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:192:1: ( RULE_IDENTIFICADOR )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:193:1: RULE_IDENTIFICADOR
            {
             before(grammarAccess.getPascalProgramAccess().getNameIDENTIFICADORTerminalRuleCall_1_0()); 
            match(input,RULE_IDENTIFICADOR,FOLLOW_RULE_IDENTIFICADOR_in_rule__PascalProgram__NameAssignment_1320); 
             after(grammarAccess.getPascalProgramAccess().getNameIDENTIFICADORTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PascalProgram__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePascalProgram_in_entryRulePascalProgram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePascalProgram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PascalProgram__Group__0_in_rulePascalProgram94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PascalProgram__Group__0__Impl_in_rule__PascalProgram__Group__0128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PascalProgram__Group__1_in_rule__PascalProgram__Group__0131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PascalProgram__Group__0__Impl159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PascalProgram__Group__1__Impl_in_rule__PascalProgram__Group__1190 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__PascalProgram__Group__2_in_rule__PascalProgram__Group__1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PascalProgram__NameAssignment_1_in_rule__PascalProgram__Group__1__Impl220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PascalProgram__Group__2__Impl_in_rule__PascalProgram__Group__2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PascalProgram__Group__2__Impl278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFICADOR_in_rule__PascalProgram__NameAssignment_1320 = new BitSet(new long[]{0x0000000000000002L});

}