/*
 * generated by Xtext 2.10.0
 */
package es.uam.sara.tfg.dsl.parser.antlr;

import com.google.inject.Inject;
import es.uam.sara.tfg.dsl.parser.antlr.internal.InternalJRulesParser;
import es.uam.sara.tfg.dsl.services.JRulesGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class JRulesParser extends AbstractAntlrParser {

	@Inject
	private JRulesGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalJRulesParser createParser(XtextTokenStream stream) {
		return new InternalJRulesParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "RuleSet";
	}

	public JRulesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(JRulesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
