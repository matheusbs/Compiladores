/*
* generated by Xtext
*/
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.xtext.example.mydsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}

@parser::members {
 
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

}




// Entry rule entryRulePascalProgram
entryRulePascalProgram 
:
{ before(grammarAccess.getPascalProgramRule()); }
	 rulePascalProgram
{ after(grammarAccess.getPascalProgramRule()); } 
	 EOF 
;

// Rule PascalProgram
rulePascalProgram
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPascalProgramAccess().getGroup()); }
(rule__PascalProgram__Group__0)
{ after(grammarAccess.getPascalProgramAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__PascalProgram__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PascalProgram__Group__0__Impl
	rule__PascalProgram__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PascalProgram__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPascalProgramAccess().getProgramKeyword_0()); }

	'Program' 

{ after(grammarAccess.getPascalProgramAccess().getProgramKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PascalProgram__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PascalProgram__Group__1__Impl
	rule__PascalProgram__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PascalProgram__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPascalProgramAccess().getNameAssignment_1()); }
(rule__PascalProgram__NameAssignment_1)
{ after(grammarAccess.getPascalProgramAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PascalProgram__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PascalProgram__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PascalProgram__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPascalProgramAccess().getSemicolonKeyword_2()); }

	';' 

{ after(grammarAccess.getPascalProgramAccess().getSemicolonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}









rule__PascalProgram__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPascalProgramAccess().getNameIDENTIFICADORTerminalRuleCall_1_0()); }
	RULE_IDENTIFICADOR{ after(grammarAccess.getPascalProgramAccess().getNameIDENTIFICADORTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_IDENTIFICADOR : RULE_CARACTERE (RULE_CARACTERE|RULE_NUMERO|'_')*;

fragment RULE_CARACTERE : ('a'..'z'|'A'..'Z');

fragment RULE_NUMERO : '0'..'9';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


