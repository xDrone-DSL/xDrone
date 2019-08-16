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
			builder.put(grammarAccess.getEnvironmentAccess().getAlternatives_2(), "rule__Environment__Alternatives_2");
			builder.put(grammarAccess.getSuperCommandAccess().getAlternatives(), "rule__SuperCommand__Alternatives");
			builder.put(grammarAccess.getCommandAccess().getAlternatives(), "rule__Command__Alternatives");
			builder.put(grammarAccess.getDOUBLEAccess().getAlternatives(), "rule__DOUBLE__Alternatives");
			builder.put(grammarAccess.getPOSITIVE_DOUBLEAccess().getAlternatives(), "rule__POSITIVE_DOUBLE__Alternatives");
			builder.put(grammarAccess.getMainAccess().getGroup(), "rule__Main__Group__0");
			builder.put(grammarAccess.getFlyAccess().getGroup(), "rule__Fly__Group__0");
			builder.put(grammarAccess.getFlyAccess().getGroup_1(), "rule__Fly__Group_1__0");
			builder.put(grammarAccess.getEnvironmentAccess().getGroup(), "rule__Environment__Group__0");
			builder.put(grammarAccess.getUserFunctionAccess().getGroup(), "rule__UserFunction__Group__0");
			builder.put(grammarAccess.getDOUBLEAccess().getGroup_0(), "rule__DOUBLE__Group_0__0");
			builder.put(grammarAccess.getPOSITIVE_DOUBLEAccess().getGroup_0(), "rule__POSITIVE_DOUBLE__Group_0__0");
			builder.put(grammarAccess.getFlyToAccess().getGroup(), "rule__FlyTo__Group__0");
			builder.put(grammarAccess.getMoveAccess().getGroup(), "rule__Move__Group__0");
			builder.put(grammarAccess.getRotateAccess().getGroup(), "rule__Rotate__Group__0");
			builder.put(grammarAccess.getWaitAccess().getGroup(), "rule__Wait__Group__0");
			builder.put(grammarAccess.getFunctionNameAccess().getGroup(), "rule__FunctionName__Group__0");
			builder.put(grammarAccess.getDroneAccess().getGroup(), "rule__Drone__Group__0");
			builder.put(grammarAccess.getObjectAccess().getGroup_0(), "rule__Object__Group_0__0");
			builder.put(grammarAccess.getObjectAccess().getGroup_2(), "rule__Object__Group_2__0");
			builder.put(grammarAccess.getOriginAccess().getGroup(), "rule__Origin__Group__0");
			builder.put(grammarAccess.getSizeAccess().getGroup(), "rule__Size__Group__0");
			builder.put(grammarAccess.getVectorAccess().getGroup(), "rule__Vector__Group__0");
			builder.put(grammarAccess.getColorAccess().getGroup(), "rule__Color__Group__0");
			builder.put(grammarAccess.getWallsAccess().getGroup_0(), "rule__Walls__Group_0__0");
			builder.put(grammarAccess.getWallsAccess().getGroup_4(), "rule__Walls__Group_4__0");
			builder.put(grammarAccess.getFrontAccess().getGroup(), "rule__Front__Group__0");
			builder.put(grammarAccess.getRightAccess().getGroup(), "rule__Right__Group__0");
			builder.put(grammarAccess.getLeftAccess().getGroup(), "rule__Left__Group__0");
			builder.put(grammarAccess.getBackAccess().getGroup(), "rule__Back__Group__0");
			builder.put(grammarAccess.getUpAccess().getGroup(), "rule__Up__Group__0");
			builder.put(grammarAccess.getProgramAccess().getMainAssignment(), "rule__Program__MainAssignment");
			builder.put(grammarAccess.getMainAccess().getFlyAssignment_0(), "rule__Main__FlyAssignment_0");
			builder.put(grammarAccess.getMainAccess().getEnvironmentAssignment_1(), "rule__Main__EnvironmentAssignment_1");
			builder.put(grammarAccess.getFlyAccess().getTakeoffAssignment_1_0(), "rule__Fly__TakeoffAssignment_1_0");
			builder.put(grammarAccess.getFlyAccess().getCommandsAssignment_1_1(), "rule__Fly__CommandsAssignment_1_1");
			builder.put(grammarAccess.getFlyAccess().getLandAssignment_1_2(), "rule__Fly__LandAssignment_1_2");
			builder.put(grammarAccess.getEnvironmentAccess().getDroneAssignment_2_0(), "rule__Environment__DroneAssignment_2_0");
			builder.put(grammarAccess.getEnvironmentAccess().getWallsAssignment_2_1(), "rule__Environment__WallsAssignment_2_1");
			builder.put(grammarAccess.getEnvironmentAccess().getObjectsAssignment_2_2(), "rule__Environment__ObjectsAssignment_2_2");
			builder.put(grammarAccess.getUserFunctionAccess().getNameAssignment_0(), "rule__UserFunction__NameAssignment_0");
			builder.put(grammarAccess.getUserFunctionAccess().getFuncAssignment_3(), "rule__UserFunction__FuncAssignment_3");
			builder.put(grammarAccess.getFlyToAccess().getObject_nameAssignment_2(), "rule__FlyTo__Object_nameAssignment_2");
			builder.put(grammarAccess.getMoveAccess().getVectorAssignment_1(), "rule__Move__VectorAssignment_1");
			builder.put(grammarAccess.getRotateAccess().getAngleAssignment_2(), "rule__Rotate__AngleAssignment_2");
			builder.put(grammarAccess.getWaitAccess().getSecondsAssignment_2(), "rule__Wait__SecondsAssignment_2");
			builder.put(grammarAccess.getFunctionNameAccess().getFunc_nameAssignment_0(), "rule__FunctionName__Func_nameAssignment_0");
			builder.put(grammarAccess.getDroneAccess().getVectorAssignment_1(), "rule__Drone__VectorAssignment_1");
			builder.put(grammarAccess.getObjectAccess().getObject_nameAssignment_0_0(), "rule__Object__Object_nameAssignment_0_0");
			builder.put(grammarAccess.getObjectAccess().getOriginAssignment_0_2(), "rule__Object__OriginAssignment_0_2");
			builder.put(grammarAccess.getObjectAccess().getSizeAssignment_1(), "rule__Object__SizeAssignment_1");
			builder.put(grammarAccess.getObjectAccess().getColorAssignment_2_0(), "rule__Object__ColorAssignment_2_0");
			builder.put(grammarAccess.getOriginAccess().getVectorAssignment_2(), "rule__Origin__VectorAssignment_2");
			builder.put(grammarAccess.getSizeAccess().getVectorAssignment_2(), "rule__Size__VectorAssignment_2");
			builder.put(grammarAccess.getVectorAccess().getXAssignment_1(), "rule__Vector__XAssignment_1");
			builder.put(grammarAccess.getVectorAccess().getYAssignment_3(), "rule__Vector__YAssignment_3");
			builder.put(grammarAccess.getVectorAccess().getZAssignment_5(), "rule__Vector__ZAssignment_5");
			builder.put(grammarAccess.getColorAccess().getColor_valueAssignment_2(), "rule__Color__Color_valueAssignment_2");
			builder.put(grammarAccess.getWallsAccess().getFrontAssignment_0_2(), "rule__Walls__FrontAssignment_0_2");
			builder.put(grammarAccess.getWallsAccess().getRightAssignment_1(), "rule__Walls__RightAssignment_1");
			builder.put(grammarAccess.getWallsAccess().getBackAssignment_2(), "rule__Walls__BackAssignment_2");
			builder.put(grammarAccess.getWallsAccess().getLeftAssignment_3(), "rule__Walls__LeftAssignment_3");
			builder.put(grammarAccess.getWallsAccess().getUpAssignment_4_0(), "rule__Walls__UpAssignment_4_0");
			builder.put(grammarAccess.getFrontAccess().getValueAssignment_2(), "rule__Front__ValueAssignment_2");
			builder.put(grammarAccess.getRightAccess().getValueAssignment_2(), "rule__Right__ValueAssignment_2");
			builder.put(grammarAccess.getLeftAccess().getValueAssignment_2(), "rule__Left__ValueAssignment_2");
			builder.put(grammarAccess.getBackAccess().getValueAssignment_2(), "rule__Back__ValueAssignment_2");
			builder.put(grammarAccess.getUpAccess().getValueAssignment_2(), "rule__Up__ValueAssignment_2");
			builder.put(grammarAccess.getObjectAccess().getUnorderedGroup(), "rule__Object__UnorderedGroup");
			builder.put(grammarAccess.getWallsAccess().getUnorderedGroup(), "rule__Walls__UnorderedGroup");
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
