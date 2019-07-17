/*
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.xdrone.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import ic.ac.uk.xdrone.ide.contentassist.antlr.internal.InternalXDroneParser;
import ic.ac.uk.xdrone.services.XDroneGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class XDroneParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(XDroneGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, XDroneGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getSuperCommandAccess().getAlternatives(), "rule__SuperCommand__Alternatives");
			builder.put(grammarAccess.getCommandAccess().getAlternatives(), "rule__Command__Alternatives");
			builder.put(grammarAccess.getMainAccess().getGroup(), "rule__Main__Group__0");
			builder.put(grammarAccess.getMainAccess().getGroup_0(), "rule__Main__Group_0__0");
			builder.put(grammarAccess.getMainAccess().getGroup_1(), "rule__Main__Group_1__0");
			builder.put(grammarAccess.getMainAccess().getGroup_1_0(), "rule__Main__Group_1_0__0");
			builder.put(grammarAccess.getMainAccess().getGroup_1_1(), "rule__Main__Group_1_1__0");
			builder.put(grammarAccess.getMainAccess().getGroup_1_2(), "rule__Main__Group_1_2__0");
			builder.put(grammarAccess.getRecordedFlightAccess().getGroup(), "rule__RecordedFlight__Group__0");
			builder.put(grammarAccess.getUserFunctionAccess().getGroup(), "rule__UserFunction__Group__0");
			builder.put(grammarAccess.getUserFunctionAccess().getGroup_3(), "rule__UserFunction__Group_3__0");
			builder.put(grammarAccess.getFeatureMatchAccess().getGroup(), "rule__FeatureMatch__Group__0");
			builder.put(grammarAccess.getDOUBLEAccess().getGroup(), "rule__DOUBLE__Group__0");
			builder.put(grammarAccess.getSnapshotAccess().getGroup(), "rule__Snapshot__Group__0");
			builder.put(grammarAccess.getUpAccess().getGroup(), "rule__Up__Group__0");
			builder.put(grammarAccess.getDownAccess().getGroup(), "rule__Down__Group__0");
			builder.put(grammarAccess.getLeftAccess().getGroup(), "rule__Left__Group__0");
			builder.put(grammarAccess.getRightAccess().getGroup(), "rule__Right__Group__0");
			builder.put(grammarAccess.getForwardAccess().getGroup(), "rule__Forward__Group__0");
			builder.put(grammarAccess.getBackwardAccess().getGroup(), "rule__Backward__Group__0");
			builder.put(grammarAccess.getRotateLAccess().getGroup(), "rule__RotateL__Group__0");
			builder.put(grammarAccess.getRotateRAccess().getGroup(), "rule__RotateR__Group__0");
			builder.put(grammarAccess.getWaitAccess().getGroup(), "rule__Wait__Group__0");
			builder.put(grammarAccess.getFunctionNameAccess().getGroup(), "rule__FunctionName__Group__0");
			builder.put(grammarAccess.getProgramAccess().getMainAssignment(), "rule__Program__MainAssignment");
			builder.put(grammarAccess.getMainAccess().getCommandsAssignment_0_0(), "rule__Main__CommandsAssignment_0_0");
			builder.put(grammarAccess.getMainAccess().getTakeoffAssignment_1_0_0(), "rule__Main__TakeoffAssignment_1_0_0");
			builder.put(grammarAccess.getMainAccess().getCommandsAssignment_1_1_0(), "rule__Main__CommandsAssignment_1_1_0");
			builder.put(grammarAccess.getMainAccess().getLandAssignment_1_2_0(), "rule__Main__LandAssignment_1_2_0");
			builder.put(grammarAccess.getRecordedFlightAccess().getVideo_nameAssignment_2(), "rule__RecordedFlight__Video_nameAssignment_2");
			builder.put(grammarAccess.getUserFunctionAccess().getNameAssignment_0(), "rule__UserFunction__NameAssignment_0");
			builder.put(grammarAccess.getUserFunctionAccess().getFuncAssignment_3_0(), "rule__UserFunction__FuncAssignment_3_0");
			builder.put(grammarAccess.getFeatureMatchAccess().getImage_nameAssignment_2(), "rule__FeatureMatch__Image_nameAssignment_2");
			builder.put(grammarAccess.getSnapshotAccess().getImage_nameAssignment_2(), "rule__Snapshot__Image_nameAssignment_2");
			builder.put(grammarAccess.getUpAccess().getDistanceAssignment_2(), "rule__Up__DistanceAssignment_2");
			builder.put(grammarAccess.getDownAccess().getDistanceAssignment_2(), "rule__Down__DistanceAssignment_2");
			builder.put(grammarAccess.getLeftAccess().getDistanceAssignment_2(), "rule__Left__DistanceAssignment_2");
			builder.put(grammarAccess.getRightAccess().getDistanceAssignment_2(), "rule__Right__DistanceAssignment_2");
			builder.put(grammarAccess.getForwardAccess().getDistanceAssignment_2(), "rule__Forward__DistanceAssignment_2");
			builder.put(grammarAccess.getBackwardAccess().getDistanceAssignment_2(), "rule__Backward__DistanceAssignment_2");
			builder.put(grammarAccess.getRotateLAccess().getAngleAssignment_2(), "rule__RotateL__AngleAssignment_2");
			builder.put(grammarAccess.getRotateRAccess().getAngleAssignment_2(), "rule__RotateR__AngleAssignment_2");
			builder.put(grammarAccess.getWaitAccess().getSecondsAssignment_2(), "rule__Wait__SecondsAssignment_2");
			builder.put(grammarAccess.getFunctionNameAccess().getFunc_nameAssignment_0(), "rule__FunctionName__Func_nameAssignment_0");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private XDroneGrammarAccess grammarAccess;

	@Override
	protected InternalXDroneParser createParser() {
		InternalXDroneParser result = new InternalXDroneParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public XDroneGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(XDroneGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
