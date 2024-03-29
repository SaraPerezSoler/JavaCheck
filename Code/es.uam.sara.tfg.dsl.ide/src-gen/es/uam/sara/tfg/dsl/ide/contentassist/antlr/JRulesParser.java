/*
 * generated by Xtext 2.10.0
 */
package es.uam.sara.tfg.dsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import es.uam.sara.tfg.dsl.ide.contentassist.antlr.internal.InternalJRulesParser;
import es.uam.sara.tfg.dsl.services.JRulesGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class JRulesParser extends AbstractContentAssistParser {

	@Inject
	private JRulesGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalJRulesParser createParser() {
		InternalJRulesParser result = new InternalJRulesParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getRuleSetAccess().getAlternatives_2(), "rule__RuleSet__Alternatives_2");
					put(grammarAccess.getSentenceAccess().getAlternatives_0(), "rule__Sentence__Alternatives_0");
					put(grammarAccess.getPrimaryOpAccess().getAlternatives(), "rule__PrimaryOp__Alternatives");
					put(grammarAccess.getPropertyAccess().getAlternatives(), "rule__Property__Alternatives");
					put(grammarAccess.getIsImplementedAccess().getAlternatives_0(), "rule__IsImplemented__Alternatives_0");
					put(grammarAccess.getIsSuperInterfaceAccess().getAlternatives_0(), "rule__IsSuperInterface__Alternatives_0");
					put(grammarAccess.getIsSuperClassAccess().getAlternatives_0(), "rule__IsSuperClass__Alternatives_0");
					put(grammarAccess.getIsSubClassAccess().getAlternatives_1(), "rule__IsSubClass__Alternatives_1");
					put(grammarAccess.getImplementsAccess().getAlternatives_0(), "rule__Implements__Alternatives_0");
					put(grammarAccess.getExtendsAccess().getAlternatives_0(), "rule__Extends__Alternatives_0");
					put(grammarAccess.getTamanioAccess().getAlternatives_1(), "rule__Tamanio__Alternatives_1");
					put(grammarAccess.getTamanioAccess().getAlternatives_1_0_0(), "rule__Tamanio__Alternatives_1_0_0");
					put(grammarAccess.getTamanioAccess().getAlternatives_1_1_3(), "rule__Tamanio__Alternatives_1_1_3");
					put(grammarAccess.getParameterAccess().getAlternatives_2(), "rule__Parameter__Alternatives_2");
					put(grammarAccess.getParameterAccess().getAlternatives_2_0_1_0(), "rule__Parameter__Alternatives_2_0_1_0");
					put(grammarAccess.getParameterAccess().getAlternatives_2_1_3(), "rule__Parameter__Alternatives_2_1_3");
					put(grammarAccess.getConstructorAccess().getAlternatives_1(), "rule__Constructor__Alternatives_1");
					put(grammarAccess.getReturnAccess().getAlternatives_2(), "rule__Return__Alternatives_2");
					put(grammarAccess.getAttributeTypeAccess().getAlternatives_1(), "rule__AttributeType__Alternatives_1");
					put(grammarAccess.getInitializeAccess().getAlternatives_1(), "rule__Initialize__Alternatives_1");
					put(grammarAccess.getEmptyAccess().getAlternatives_1(), "rule__Empty__Alternatives_1");
					put(grammarAccess.getIsGenericAccess().getAlternatives_1(), "rule__IsGeneric__Alternatives_1");
					put(grammarAccess.getNameOperationAccess().getAlternatives_1(), "rule__NameOperation__Alternatives_1");
					put(grammarAccess.getNameOperationAccess().getAlternatives_1_1(), "rule__NameOperation__Alternatives_1_1");
					put(grammarAccess.getNameTypeAccess().getAlternatives_2(), "rule__NameType__Alternatives_2");
					put(grammarAccess.getContainsAccess().getAlternatives_1(), "rule__Contains__Alternatives_1");
					put(grammarAccess.getContainsAccess().getAlternatives_1_0_0(), "rule__Contains__Alternatives_1_0_0");
					put(grammarAccess.getModifiersAccess().getAlternatives_0(), "rule__Modifiers__Alternatives_0");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getRangoNamesAccess().getAlternatives_1_3(), "rule__RangoNames__Alternatives_1_3");
					put(grammarAccess.getStringPropertyAccess().getAlternatives(), "rule__StringProperty__Alternatives");
					put(grammarAccess.getTypePropertyAccess().getAlternatives(), "rule__TypeProperty__Alternatives");
					put(grammarAccess.getIsCollectionTypeAccess().getAlternatives_2(), "rule__IsCollectionType__Alternatives_2");
					put(grammarAccess.getBlendModifiersAccess().getAlternatives(), "rule__BlendModifiers__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
					put(grammarAccess.getPrimitiveAccess().getAlternatives(), "rule__Primitive__Alternatives");
					put(grammarAccess.getNameOperatorAccess().getAlternatives(), "rule__NameOperator__Alternatives");
					put(grammarAccess.getElementStringAccess().getAlternatives(), "rule__ElementString__Alternatives");
					put(grammarAccess.getLanguageAccess().getAlternatives(), "rule__Language__Alternatives");
					put(grammarAccess.getNameCheckAccess().getAlternatives(), "rule__NameCheck__Alternatives");
					put(grammarAccess.getAccessModifierAccess().getAlternatives(), "rule__AccessModifier__Alternatives");
					put(grammarAccess.getQuantifierAccess().getAlternatives(), "rule__Quantifier__Alternatives");
					put(grammarAccess.getRuleSetAccess().getGroup(), "rule__RuleSet__Group__0");
					put(grammarAccess.getRuleSetAccess().getGroup_2_0(), "rule__RuleSet__Group_2_0__0");
					put(grammarAccess.getRuleSetAccess().getGroup_2_0_1(), "rule__RuleSet__Group_2_0_1__0");
					put(grammarAccess.getSentenceAccess().getGroup(), "rule__Sentence__Group__0");
					put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
					put(grammarAccess.getVariableAccess().getGroup_3(), "rule__Variable__Group_3__0");
					put(grammarAccess.getVariableAccess().getGroup_4(), "rule__Variable__Group_4__0");
					put(grammarAccess.getVariableAccess().getGroup_4_2(), "rule__Variable__Group_4_2__0");
					put(grammarAccess.getVariableAccess().getGroup_5(), "rule__Variable__Group_5__0");
					put(grammarAccess.getVariableAccess().getGroup_5_2(), "rule__Variable__Group_5_2__0");
					put(grammarAccess.getVariableAccess().getGroup_6(), "rule__Variable__Group_6__0");
					put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
					put(grammarAccess.getRuleAccess().getGroup_3(), "rule__Rule__Group_3__0");
					put(grammarAccess.getRuleAccess().getGroup_4(), "rule__Rule__Group_4__0");
					put(grammarAccess.getRuleAccess().getGroup_4_2(), "rule__Rule__Group_4_2__0");
					put(grammarAccess.getRuleAccess().getGroup_5(), "rule__Rule__Group_5__0");
					put(grammarAccess.getRuleAccess().getGroup_5_2(), "rule__Rule__Group_5_2__0");
					put(grammarAccess.getRuleAccess().getGroup_6(), "rule__Rule__Group_6__0");
					put(grammarAccess.getRuleAccess().getGroup_7(), "rule__Rule__Group_7__0");
					put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
					put(grammarAccess.getOrAccess().getGroup_1(), "rule__Or__Group_1__0");
					put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
					put(grammarAccess.getAndAccess().getGroup_1(), "rule__And__Group_1__0");
					put(grammarAccess.getPrimaryOpAccess().getGroup_0(), "rule__PrimaryOp__Group_0__0");
					put(grammarAccess.getIsImplementedAccess().getGroup(), "rule__IsImplemented__Group__0");
					put(grammarAccess.getIsSuperInterfaceAccess().getGroup(), "rule__IsSuperInterface__Group__0");
					put(grammarAccess.getIsSuperClassAccess().getGroup(), "rule__IsSuperClass__Group__0");
					put(grammarAccess.getIsSubClassAccess().getGroup(), "rule__IsSubClass__Group__0");
					put(grammarAccess.getIsSubClassAccess().getGroup_4(), "rule__IsSubClass__Group_4__0");
					put(grammarAccess.getImplementsAccess().getGroup(), "rule__Implements__Group__0");
					put(grammarAccess.getImplementsAccess().getGroup_0_0(), "rule__Implements__Group_0_0__0");
					put(grammarAccess.getImplementsAccess().getGroup_0_2(), "rule__Implements__Group_0_2__0");
					put(grammarAccess.getExtendsAccess().getGroup(), "rule__Extends__Group__0");
					put(grammarAccess.getExtendsAccess().getGroup_0_0(), "rule__Extends__Group_0_0__0");
					put(grammarAccess.getExtendsAccess().getGroup_0_2(), "rule__Extends__Group_0_2__0");
					put(grammarAccess.getTamanioAccess().getGroup(), "rule__Tamanio__Group__0");
					put(grammarAccess.getTamanioAccess().getGroup_1_0(), "rule__Tamanio__Group_1_0__0");
					put(grammarAccess.getTamanioAccess().getGroup_1_1(), "rule__Tamanio__Group_1_1__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getParameterAccess().getGroup_2_0(), "rule__Parameter__Group_2_0__0");
					put(grammarAccess.getParameterAccess().getGroup_2_0_1(), "rule__Parameter__Group_2_0_1__0");
					put(grammarAccess.getParameterAccess().getGroup_2_1(), "rule__Parameter__Group_2_1__0");
					put(grammarAccess.getParameterAccess().getGroup_3(), "rule__Parameter__Group_3__0");
					put(grammarAccess.getParameterAccess().getGroup_3_4(), "rule__Parameter__Group_3_4__0");
					put(grammarAccess.getConstructorAccess().getGroup(), "rule__Constructor__Group__0");
					put(grammarAccess.getReturnAccess().getGroup(), "rule__Return__Group__0");
					put(grammarAccess.getAttributeTypeAccess().getGroup(), "rule__AttributeType__Group__0");
					put(grammarAccess.getInitializeAccess().getGroup(), "rule__Initialize__Group__0");
					put(grammarAccess.getEmptyAccess().getGroup(), "rule__Empty__Group__0");
					put(grammarAccess.getIsGenericAccess().getGroup(), "rule__IsGeneric__Group__0");
					put(grammarAccess.getNameOperationAccess().getGroup(), "rule__NameOperation__Group__0");
					put(grammarAccess.getNameOperationAccess().getGroup_1_0(), "rule__NameOperation__Group_1_0__0");
					put(grammarAccess.getNameOperationAccess().getGroup_1_0_0(), "rule__NameOperation__Group_1_0_0__0");
					put(grammarAccess.getNameOperationAccess().getGroup_3(), "rule__NameOperation__Group_3__0");
					put(grammarAccess.getNameTypeAccess().getGroup(), "rule__NameType__Group__0");
					put(grammarAccess.getJavaDocAccess().getGroup(), "rule__JavaDoc__Group__0");
					put(grammarAccess.getContainsAccess().getGroup(), "rule__Contains__Group__0");
					put(grammarAccess.getContainsAccess().getGroup_1_0(), "rule__Contains__Group_1_0__0");
					put(grammarAccess.getContainsAccess().getGroup_1_0_0_0(), "rule__Contains__Group_1_0_0_0__0");
					put(grammarAccess.getContainsAccess().getGroup_1_0_0_2(), "rule__Contains__Group_1_0_0_2__0");
					put(grammarAccess.getModifiersAccess().getGroup(), "rule__Modifiers__Group__0");
					put(grammarAccess.getModifiersAccess().getGroup_6(), "rule__Modifiers__Group_6__0");
					put(grammarAccess.getRangoNamesAccess().getGroup(), "rule__RangoNames__Group__0");
					put(grammarAccess.getRangoNamesAccess().getGroup_1(), "rule__RangoNames__Group_1__0");
					put(grammarAccess.getRangoNamesAccess().getGroup_2(), "rule__RangoNames__Group_2__0");
					put(grammarAccess.getRangoNamesAccess().getGroup_2_3(), "rule__RangoNames__Group_2_3__0");
					put(grammarAccess.getStringVariableAccess().getGroup(), "rule__StringVariable__Group__0");
					put(grammarAccess.getVariableSubtypeAccess().getGroup(), "rule__VariableSubtype__Group__0");
					put(grammarAccess.getVariableSubtypeAccess().getGroup_1(), "rule__VariableSubtype__Group_1__0");
					put(grammarAccess.getTypePrimitiveAccess().getGroup(), "rule__TypePrimitive__Group__0");
					put(grammarAccess.getIsPrimitiveFunctionAccess().getGroup(), "rule__IsPrimitiveFunction__Group__0");
					put(grammarAccess.getIsCollectionTypeAccess().getGroup(), "rule__IsCollectionType__Group__0");
					put(grammarAccess.getIsCollectionTypeAccess().getGroup_2_1(), "rule__IsCollectionType__Group_2_1__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getBlendModifiersAccess().getGroup_0(), "rule__BlendModifiers__Group_0__0");
					put(grammarAccess.getBlendModifiersAccess().getGroup_0_1(), "rule__BlendModifiers__Group_0_1__0");
					put(grammarAccess.getBlendModifiersAccess().getGroup_0_2(), "rule__BlendModifiers__Group_0_2__0");
					put(grammarAccess.getBlendModifiersAccess().getGroup_0_3(), "rule__BlendModifiers__Group_0_3__0");
					put(grammarAccess.getBlendModifiersAccess().getGroup_0_4(), "rule__BlendModifiers__Group_0_4__0");
					put(grammarAccess.getBlendModifiersAccess().getGroup_0_5(), "rule__BlendModifiers__Group_0_5__0");
					put(grammarAccess.getBlendModifiersAccess().getGroup_1(), "rule__BlendModifiers__Group_1__0");
					put(grammarAccess.getBlendModifiersAccess().getGroup_1_1(), "rule__BlendModifiers__Group_1_1__0");
					put(grammarAccess.getBlendModifiersAccess().getGroup_1_2(), "rule__BlendModifiers__Group_1_2__0");
					put(grammarAccess.getBlendModifiersAccess().getGroup_1_3(), "rule__BlendModifiers__Group_1_3__0");
					put(grammarAccess.getBlendModifiersAccess().getGroup_1_4(), "rule__BlendModifiers__Group_1_4__0");
					put(grammarAccess.getBlendModifiersAccess().getGroup_2(), "rule__BlendModifiers__Group_2__0");
					put(grammarAccess.getBlendModifiersAccess().getGroup_2_1(), "rule__BlendModifiers__Group_2_1__0");
					put(grammarAccess.getBlendModifiersAccess().getGroup_2_2(), "rule__BlendModifiers__Group_2_2__0");
					put(grammarAccess.getBlendModifiersAccess().getGroup_2_3(), "rule__BlendModifiers__Group_2_3__0");
					put(grammarAccess.getBlendModifiersAccess().getGroup_3(), "rule__BlendModifiers__Group_3__0");
					put(grammarAccess.getBlendModifiersAccess().getGroup_3_1(), "rule__BlendModifiers__Group_3_1__0");
					put(grammarAccess.getBlendModifiersAccess().getGroup_3_2(), "rule__BlendModifiers__Group_3_2__0");
					put(grammarAccess.getBlendModifiersAccess().getGroup_4(), "rule__BlendModifiers__Group_4__0");
					put(grammarAccess.getBlendModifiersAccess().getGroup_4_1(), "rule__BlendModifiers__Group_4_1__0");
					put(grammarAccess.getRuleSetAccess().getProjectNameAssignment_2_0_0(), "rule__RuleSet__ProjectNameAssignment_2_0_0");
					put(grammarAccess.getRuleSetAccess().getProjectNameAssignment_2_0_1_1(), "rule__RuleSet__ProjectNameAssignment_2_0_1_1");
					put(grammarAccess.getRuleSetAccess().getSentencesAssignment_3(), "rule__RuleSet__SentencesAssignment_3");
					put(grammarAccess.getRuleSetAccess().getSentencesAssignment_4(), "rule__RuleSet__SentencesAssignment_4");
					put(grammarAccess.getVariableAccess().getNameAssignment_0(), "rule__Variable__NameAssignment_0");
					put(grammarAccess.getVariableAccess().getElementAssignment_2(), "rule__Variable__ElementAssignment_2");
					put(grammarAccess.getVariableAccess().getFromAssignment_3_1(), "rule__Variable__FromAssignment_3_1");
					put(grammarAccess.getVariableAccess().getInAssignment_4_1(), "rule__Variable__InAssignment_4_1");
					put(grammarAccess.getVariableAccess().getInAssignment_4_2_1(), "rule__Variable__InAssignment_4_2_1");
					put(grammarAccess.getVariableAccess().getUsingAssignment_5_1(), "rule__Variable__UsingAssignment_5_1");
					put(grammarAccess.getVariableAccess().getUsingAssignment_5_2_1(), "rule__Variable__UsingAssignment_5_2_1");
					put(grammarAccess.getVariableAccess().getSatisfyAssignment_6_1(), "rule__Variable__SatisfyAssignment_6_1");
					put(grammarAccess.getRuleAccess().getNoAssignment_0(), "rule__Rule__NoAssignment_0");
					put(grammarAccess.getRuleAccess().getQuantifierAssignment_1(), "rule__Rule__QuantifierAssignment_1");
					put(grammarAccess.getRuleAccess().getElementAssignment_2(), "rule__Rule__ElementAssignment_2");
					put(grammarAccess.getRuleAccess().getFromAssignment_3_1(), "rule__Rule__FromAssignment_3_1");
					put(grammarAccess.getRuleAccess().getInAssignment_4_1(), "rule__Rule__InAssignment_4_1");
					put(grammarAccess.getRuleAccess().getInAssignment_4_2_1(), "rule__Rule__InAssignment_4_2_1");
					put(grammarAccess.getRuleAccess().getUsingAssignment_5_1(), "rule__Rule__UsingAssignment_5_1");
					put(grammarAccess.getRuleAccess().getUsingAssignment_5_2_1(), "rule__Rule__UsingAssignment_5_2_1");
					put(grammarAccess.getRuleAccess().getFilterAssignment_6_1(), "rule__Rule__FilterAssignment_6_1");
					put(grammarAccess.getRuleAccess().getSatisfyAssignment_7_1(), "rule__Rule__SatisfyAssignment_7_1");
					put(grammarAccess.getOrAccess().getOpAssignment_0(), "rule__Or__OpAssignment_0");
					put(grammarAccess.getOrAccess().getOpAssignment_1_1(), "rule__Or__OpAssignment_1_1");
					put(grammarAccess.getAndAccess().getOpAssignment_0(), "rule__And__OpAssignment_0");
					put(grammarAccess.getAndAccess().getOpAssignment_1_1(), "rule__And__OpAssignment_1_1");
					put(grammarAccess.getPropertyLiteralAccess().getPropertyAssignment(), "rule__PropertyLiteral__PropertyAssignment");
					put(grammarAccess.getIsImplementedAccess().getNoAssignment_1(), "rule__IsImplemented__NoAssignment_1");
					put(grammarAccess.getIsImplementedAccess().getValoresAssignment_3(), "rule__IsImplemented__ValoresAssignment_3");
					put(grammarAccess.getIsSuperInterfaceAccess().getNoAssignment_1(), "rule__IsSuperInterface__NoAssignment_1");
					put(grammarAccess.getIsSuperInterfaceAccess().getValoresAssignment_3(), "rule__IsSuperInterface__ValoresAssignment_3");
					put(grammarAccess.getIsSuperClassAccess().getNoAssignment_1(), "rule__IsSuperClass__NoAssignment_1");
					put(grammarAccess.getIsSuperClassAccess().getValoresAssignment_3(), "rule__IsSuperClass__ValoresAssignment_3");
					put(grammarAccess.getIsSubClassAccess().getNoAssignment_2(), "rule__IsSubClass__NoAssignment_2");
					put(grammarAccess.getIsSubClassAccess().getOfAssignment_4_1(), "rule__IsSubClass__OfAssignment_4_1");
					put(grammarAccess.getImplementsAccess().getNoAssignment_0_0_0(), "rule__Implements__NoAssignment_0_0_0");
					put(grammarAccess.getImplementsAccess().getNoAssignment_0_1(), "rule__Implements__NoAssignment_0_1");
					put(grammarAccess.getImplementsAccess().getNoAssignment_0_2_0(), "rule__Implements__NoAssignment_0_2_0");
					put(grammarAccess.getImplementsAccess().getNoAssignment_0_3(), "rule__Implements__NoAssignment_0_3");
					put(grammarAccess.getImplementsAccess().getValoresAssignment_2(), "rule__Implements__ValoresAssignment_2");
					put(grammarAccess.getExtendsAccess().getNoAssignment_0_0_0(), "rule__Extends__NoAssignment_0_0_0");
					put(grammarAccess.getExtendsAccess().getNoAssignment_0_1(), "rule__Extends__NoAssignment_0_1");
					put(grammarAccess.getExtendsAccess().getNoAssignment_0_2_0(), "rule__Extends__NoAssignment_0_2_0");
					put(grammarAccess.getExtendsAccess().getNoAssignment_0_3(), "rule__Extends__NoAssignment_0_3");
					put(grammarAccess.getExtendsAccess().getValoresAssignment_2(), "rule__Extends__ValoresAssignment_2");
					put(grammarAccess.getTamanioAccess().getNoAssignment_1_0_0_1(), "rule__Tamanio__NoAssignment_1_0_0_1");
					put(grammarAccess.getTamanioAccess().getExactAssignment_1_0_1(), "rule__Tamanio__ExactAssignment_1_0_1");
					put(grammarAccess.getTamanioAccess().getMinAssignment_1_1_1(), "rule__Tamanio__MinAssignment_1_1_1");
					put(grammarAccess.getTamanioAccess().getMaxAssignment_1_1_3_0(), "rule__Tamanio__MaxAssignment_1_1_3_0");
					put(grammarAccess.getParameterAccess().getNoAssignment_2_0_1_0_1(), "rule__Parameter__NoAssignment_2_0_1_0_1");
					put(grammarAccess.getParameterAccess().getExactAssignment_2_0_1_1(), "rule__Parameter__ExactAssignment_2_0_1_1");
					put(grammarAccess.getParameterAccess().getMinAssignment_2_1_1(), "rule__Parameter__MinAssignment_2_1_1");
					put(grammarAccess.getParameterAccess().getMaxAssignment_2_1_3_0(), "rule__Parameter__MaxAssignment_2_1_3_0");
					put(grammarAccess.getParameterAccess().getTypesAssignment_3_3(), "rule__Parameter__TypesAssignment_3_3");
					put(grammarAccess.getParameterAccess().getTypesAssignment_3_4_1(), "rule__Parameter__TypesAssignment_3_4_1");
					put(grammarAccess.getConstructorAccess().getNoAssignment_2(), "rule__Constructor__NoAssignment_2");
					put(grammarAccess.getReturnAccess().getNoAssignment_2_1(), "rule__Return__NoAssignment_2_1");
					put(grammarAccess.getReturnAccess().getTypeAssignment_3(), "rule__Return__TypeAssignment_3");
					put(grammarAccess.getAttributeTypeAccess().getNoAssignment_1_1(), "rule__AttributeType__NoAssignment_1_1");
					put(grammarAccess.getAttributeTypeAccess().getTypeAssignment_2(), "rule__AttributeType__TypeAssignment_2");
					put(grammarAccess.getInitializeAccess().getNoAssignment_2(), "rule__Initialize__NoAssignment_2");
					put(grammarAccess.getEmptyAccess().getNoAssignment_2(), "rule__Empty__NoAssignment_2");
					put(grammarAccess.getIsGenericAccess().getNoAssignment_2(), "rule__IsGeneric__NoAssignment_2");
					put(grammarAccess.getNameOperationAccess().getNoAssignment_1_0_0_0(), "rule__NameOperation__NoAssignment_1_0_0_0");
					put(grammarAccess.getNameOperationAccess().getOperatorAssignment_1_0_1(), "rule__NameOperation__OperatorAssignment_1_0_1");
					put(grammarAccess.getNameOperationAccess().getNoAssignment_1_1_1(), "rule__NameOperation__NoAssignment_1_1_1");
					put(grammarAccess.getNameOperationAccess().getNameAssignment_2(), "rule__NameOperation__NameAssignment_2");
					put(grammarAccess.getNameOperationAccess().getLanguageAssignment_3_1(), "rule__NameOperation__LanguageAssignment_3_1");
					put(grammarAccess.getNameTypeAccess().getNoAssignment_2_1(), "rule__NameType__NoAssignment_2_1");
					put(grammarAccess.getNameTypeAccess().getTypeAssignment_3(), "rule__NameType__TypeAssignment_3");
					put(grammarAccess.getJavaDocAccess().getNoAssignment_1(), "rule__JavaDoc__NoAssignment_1");
					put(grammarAccess.getJavaDocAccess().getAuthorAssignment_3(), "rule__JavaDoc__AuthorAssignment_3");
					put(grammarAccess.getJavaDocAccess().getParameterAssignment_4(), "rule__JavaDoc__ParameterAssignment_4");
					put(grammarAccess.getJavaDocAccess().getReturnAssignment_5(), "rule__JavaDoc__ReturnAssignment_5");
					put(grammarAccess.getJavaDocAccess().getVersionAssignment_6(), "rule__JavaDoc__VersionAssignment_6");
					put(grammarAccess.getJavaDocAccess().getThrowsAssignment_7(), "rule__JavaDoc__ThrowsAssignment_7");
					put(grammarAccess.getJavaDocAccess().getSeeAssignment_8(), "rule__JavaDoc__SeeAssignment_8");
					put(grammarAccess.getContainsAccess().getNoAssignment_1_0_0_0_0(), "rule__Contains__NoAssignment_1_0_0_0_0");
					put(grammarAccess.getContainsAccess().getNoAssignment_1_0_0_1(), "rule__Contains__NoAssignment_1_0_0_1");
					put(grammarAccess.getContainsAccess().getNoAssignment_1_0_0_2_0(), "rule__Contains__NoAssignment_1_0_0_2_0");
					put(grammarAccess.getContainsAccess().getNoAssignment_1_0_0_3(), "rule__Contains__NoAssignment_1_0_0_3");
					put(grammarAccess.getContainsAccess().getNoAssignment_1_1(), "rule__Contains__NoAssignment_1_1");
					put(grammarAccess.getContainsAccess().getRuleAssignment_3(), "rule__Contains__RuleAssignment_3");
					put(grammarAccess.getModifiersAccess().getNoAssignment_1(), "rule__Modifiers__NoAssignment_1");
					put(grammarAccess.getModifiersAccess().getBlendAssignment_5(), "rule__Modifiers__BlendAssignment_5");
					put(grammarAccess.getModifiersAccess().getBlendAssignment_6_1(), "rule__Modifiers__BlendAssignment_6_1");
					put(grammarAccess.getRangoNamesAccess().getMinAssignment_1_1(), "rule__RangoNames__MinAssignment_1_1");
					put(grammarAccess.getRangoNamesAccess().getMaxAssignment_1_3_0(), "rule__RangoNames__MaxAssignment_1_3_0");
					put(grammarAccess.getRangoNamesAccess().getTypesAssignment_2_2(), "rule__RangoNames__TypesAssignment_2_2");
					put(grammarAccess.getRangoNamesAccess().getTypesAssignment_2_3_1(), "rule__RangoNames__TypesAssignment_2_3_1");
					put(grammarAccess.getStringValueAccess().getValueAssignment(), "rule__StringValue__ValueAssignment");
					put(grammarAccess.getStringVariableAccess().getVariableAssignment_0(), "rule__StringVariable__VariableAssignment_0");
					put(grammarAccess.getStringVariableAccess().getStringsAssignment_2(), "rule__StringVariable__StringsAssignment_2");
					put(grammarAccess.getVariableSubtypeAccess().getVariableAssignment_0(), "rule__VariableSubtype__VariableAssignment_0");
					put(grammarAccess.getVariableSubtypeAccess().getSubtypeAssignment_1_1(), "rule__VariableSubtype__SubtypeAssignment_1_1");
					put(grammarAccess.getTypePrimitiveAccess().getTypePrimitiveAssignment_1(), "rule__TypePrimitive__TypePrimitiveAssignment_1");
					put(grammarAccess.getIsCollectionTypeAccess().getOfAssignment_2_1_1(), "rule__IsCollectionType__OfAssignment_2_1_1");
					put(grammarAccess.getBlendModifiersAccess().getAccessAssignment_0_0(), "rule__BlendModifiers__AccessAssignment_0_0");
					put(grammarAccess.getBlendModifiersAccess().getStaticAssignment_0_1_1(), "rule__BlendModifiers__StaticAssignment_0_1_1");
					put(grammarAccess.getBlendModifiersAccess().getFinalAssignment_0_2_1(), "rule__BlendModifiers__FinalAssignment_0_2_1");
					put(grammarAccess.getBlendModifiersAccess().getAbstractAssignment_0_3_1(), "rule__BlendModifiers__AbstractAssignment_0_3_1");
					put(grammarAccess.getBlendModifiersAccess().getDefaultAssignment_0_4_1(), "rule__BlendModifiers__DefaultAssignment_0_4_1");
					put(grammarAccess.getBlendModifiersAccess().getSynchronizedAssignment_0_5_1(), "rule__BlendModifiers__SynchronizedAssignment_0_5_1");
					put(grammarAccess.getBlendModifiersAccess().getStaticAssignment_1_0(), "rule__BlendModifiers__StaticAssignment_1_0");
					put(grammarAccess.getBlendModifiersAccess().getFinalAssignment_1_1_1(), "rule__BlendModifiers__FinalAssignment_1_1_1");
					put(grammarAccess.getBlendModifiersAccess().getAbstractAssignment_1_2_1(), "rule__BlendModifiers__AbstractAssignment_1_2_1");
					put(grammarAccess.getBlendModifiersAccess().getDefaultAssignment_1_3_1(), "rule__BlendModifiers__DefaultAssignment_1_3_1");
					put(grammarAccess.getBlendModifiersAccess().getSynchronizedAssignment_1_4_1(), "rule__BlendModifiers__SynchronizedAssignment_1_4_1");
					put(grammarAccess.getBlendModifiersAccess().getFinalAssignment_2_0(), "rule__BlendModifiers__FinalAssignment_2_0");
					put(grammarAccess.getBlendModifiersAccess().getAbstractAssignment_2_1_1(), "rule__BlendModifiers__AbstractAssignment_2_1_1");
					put(grammarAccess.getBlendModifiersAccess().getDefaultAssignment_2_2_1(), "rule__BlendModifiers__DefaultAssignment_2_2_1");
					put(grammarAccess.getBlendModifiersAccess().getSynchronizedAssignment_2_3_1(), "rule__BlendModifiers__SynchronizedAssignment_2_3_1");
					put(grammarAccess.getBlendModifiersAccess().getAbstractAssignment_3_0(), "rule__BlendModifiers__AbstractAssignment_3_0");
					put(grammarAccess.getBlendModifiersAccess().getDefaultAssignment_3_1_1(), "rule__BlendModifiers__DefaultAssignment_3_1_1");
					put(grammarAccess.getBlendModifiersAccess().getSynchronizedAssignment_3_2_1(), "rule__BlendModifiers__SynchronizedAssignment_3_2_1");
					put(grammarAccess.getBlendModifiersAccess().getDefaultAssignment_4_0(), "rule__BlendModifiers__DefaultAssignment_4_0");
					put(grammarAccess.getBlendModifiersAccess().getSynchronizedAssignment_4_1_1(), "rule__BlendModifiers__SynchronizedAssignment_4_1_1");
					put(grammarAccess.getBlendModifiersAccess().getSynchronizedAssignment_5(), "rule__BlendModifiers__SynchronizedAssignment_5");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalJRulesParser typedParser = (InternalJRulesParser) parser;
			typedParser.entryRuleRuleSet();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public JRulesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(JRulesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
