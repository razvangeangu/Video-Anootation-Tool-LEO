/*
 * generated by Xtext 2.10.0
 */
package kcl.ac.uk.xtext.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import kcl.ac.uk.xtext.ide.contentassist.antlr.internal.InternalAnnotationsStoresParser;
import kcl.ac.uk.xtext.services.AnnotationsStoresGrammarAccess;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class AnnotationsStoresParser extends AbstractContentAssistParser {

	@Inject
	private AnnotationsStoresGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalAnnotationsStoresParser createParser() {
		InternalAnnotationsStoresParser result = new InternalAnnotationsStoresParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getScopeAccess().getScopeAlternatives_0(), "rule__Scope__ScopeAlternatives_0");
					put(grammarAccess.getFocusAccess().getFocusAlternatives_0(), "rule__Focus__FocusAlternatives_0");
					put(grammarAccess.getAnnotationStoresAccess().getGroup(), "rule__AnnotationStores__Group__0");
					put(grammarAccess.getProposalStoreAccess().getGroup(), "rule__ProposalStore__Group__0");
					put(grammarAccess.getQuestionStoreAccess().getGroup(), "rule__QuestionStore__Group__0");
					put(grammarAccess.getChallengeStoreAccess().getGroup(), "rule__ChallengeStore__Group__0");
					put(grammarAccess.getChallengeStoreAccess().getGroup_5(), "rule__ChallengeStore__Group_5__0");
					put(grammarAccess.getCommitmentStoreAccess().getGroup(), "rule__CommitmentStore__Group__0");
					put(grammarAccess.getArgumentStoreAccess().getGroup(), "rule__ArgumentStore__Group__0");
					put(grammarAccess.getArgumentStoreAccess().getGroup_9(), "rule__ArgumentStore__Group_9__0");
					put(grammarAccess.getAnnotationStoresAccess().getProposalElementsAssignment_0(), "rule__AnnotationStores__ProposalElementsAssignment_0");
					put(grammarAccess.getAnnotationStoresAccess().getQuestionElementsAssignment_1(), "rule__AnnotationStores__QuestionElementsAssignment_1");
					put(grammarAccess.getAnnotationStoresAccess().getChallengeElementsAssignment_2(), "rule__AnnotationStores__ChallengeElementsAssignment_2");
					put(grammarAccess.getAnnotationStoresAccess().getCommitmentElementsAssignment_3(), "rule__AnnotationStores__CommitmentElementsAssignment_3");
					put(grammarAccess.getAnnotationStoresAccess().getArgumentElementsAssignment_4(), "rule__AnnotationStores__ArgumentElementsAssignment_4");
					put(grammarAccess.getProposalStoreAccess().getNameAssignment_2(), "rule__ProposalStore__NameAssignment_2");
					put(grammarAccess.getProposalStoreAccess().getScopeAssignment_4(), "rule__ProposalStore__ScopeAssignment_4");
					put(grammarAccess.getProposalStoreAccess().getFocusAssignment_6(), "rule__ProposalStore__FocusAssignment_6");
					put(grammarAccess.getProposalStoreAccess().getContentAssignment_8(), "rule__ProposalStore__ContentAssignment_8");
					put(grammarAccess.getProposalStoreAccess().getEffectAssignment_10(), "rule__ProposalStore__EffectAssignment_10");
					put(grammarAccess.getQuestionStoreAccess().getNameAssignment_2(), "rule__QuestionStore__NameAssignment_2");
					put(grammarAccess.getQuestionStoreAccess().getSenderAssignment_4(), "rule__QuestionStore__SenderAssignment_4");
					put(grammarAccess.getQuestionStoreAccess().getScopeAssignment_6(), "rule__QuestionStore__ScopeAssignment_6");
					put(grammarAccess.getQuestionStoreAccess().getFocusAssignment_8(), "rule__QuestionStore__FocusAssignment_8");
					put(grammarAccess.getQuestionStoreAccess().getContentAssignment_10(), "rule__QuestionStore__ContentAssignment_10");
					put(grammarAccess.getQuestionStoreAccess().getEffectAssignment_12(), "rule__QuestionStore__EffectAssignment_12");
					put(grammarAccess.getChallengeStoreAccess().getNameAssignment_2(), "rule__ChallengeStore__NameAssignment_2");
					put(grammarAccess.getChallengeStoreAccess().getSenderAssignment_4(), "rule__ChallengeStore__SenderAssignment_4");
					put(grammarAccess.getChallengeStoreAccess().getTargetAssignment_5_1(), "rule__ChallengeStore__TargetAssignment_5_1");
					put(grammarAccess.getChallengeStoreAccess().getEffectAssignment_7(), "rule__ChallengeStore__EffectAssignment_7");
					put(grammarAccess.getCommitmentStoreAccess().getNameAssignment_2(), "rule__CommitmentStore__NameAssignment_2");
					put(grammarAccess.getCommitmentStoreAccess().getScopeAssignment_4(), "rule__CommitmentStore__ScopeAssignment_4");
					put(grammarAccess.getCommitmentStoreAccess().getFocusAssignment_6(), "rule__CommitmentStore__FocusAssignment_6");
					put(grammarAccess.getCommitmentStoreAccess().getContentAssignment_8(), "rule__CommitmentStore__ContentAssignment_8");
					put(grammarAccess.getCommitmentStoreAccess().getEffectAssignment_10(), "rule__CommitmentStore__EffectAssignment_10");
					put(grammarAccess.getArgumentStoreAccess().getNameAssignment_2(), "rule__ArgumentStore__NameAssignment_2");
					put(grammarAccess.getArgumentStoreAccess().getScopeAssignment_4(), "rule__ArgumentStore__ScopeAssignment_4");
					put(grammarAccess.getArgumentStoreAccess().getFocusAssignment_6(), "rule__ArgumentStore__FocusAssignment_6");
					put(grammarAccess.getArgumentStoreAccess().getContentAssignment_8(), "rule__ArgumentStore__ContentAssignment_8");
					put(grammarAccess.getArgumentStoreAccess().getTargetAssignment_9_1(), "rule__ArgumentStore__TargetAssignment_9_1");
					put(grammarAccess.getArgumentStoreAccess().getEffectAssignment_11(), "rule__ArgumentStore__EffectAssignment_11");
					put(grammarAccess.getScopeAccess().getScopeAssignment(), "rule__Scope__ScopeAssignment");
					put(grammarAccess.getFocusAccess().getFocusAssignment(), "rule__Focus__FocusAssignment");
					put(grammarAccess.getEffectAccess().getAffectedByAssignment(), "rule__Effect__AffectedByAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalAnnotationsStoresParser typedParser = (InternalAnnotationsStoresParser) parser;
			typedParser.entryRuleAnnotationStores();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AnnotationsStoresGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AnnotationsStoresGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
