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
			builder.put(grammarAccess.getEnvironmentAccess().getAlternatives_5(), "rule__Environment__Alternatives_5");
			builder.put(grammarAccess.getCommandAccess().getAlternatives(), "rule__Command__Alternatives");
			builder.put(grammarAccess.getDOUBLEAccess().getAlternatives(), "rule__DOUBLE__Alternatives");
			builder.put(grammarAccess.getPOSITIVE_DOUBLEAccess().getAlternatives(), "rule__POSITIVE_DOUBLE__Alternatives");
			builder.put(grammarAccess.getDroneAccess().getAlternatives_2(), "rule__Drone__Alternatives_2");
			builder.put(grammarAccess.getObjectAccess().getAlternatives_3(), "rule__Object__Alternatives_3");
			builder.put(grammarAccess.getWallsAccess().getAlternatives_2(), "rule__Walls__Alternatives_2");
			builder.put(grammarAccess.getMainAccess().getGroup(), "rule__Main__Group__0");
			builder.put(grammarAccess.getFlyAccess().getGroup(), "rule__Fly__Group__0");
			builder.put(grammarAccess.getFlyAccess().getGroup_4(), "rule__Fly__Group_4__0");
			builder.put(grammarAccess.getEnvironmentAccess().getGroup(), "rule__Environment__Group__0");
			builder.put(grammarAccess.getTakeoffAccess().getGroup(), "rule__Takeoff__Group__0");
			builder.put(grammarAccess.getLandAccess().getGroup(), "rule__Land__Group__0");
			builder.put(grammarAccess.getDOUBLEAccess().getGroup_0(), "rule__DOUBLE__Group_0__0");
			builder.put(grammarAccess.getPOSITIVE_DOUBLEAccess().getGroup_0(), "rule__POSITIVE_DOUBLE__Group_0__0");
			builder.put(grammarAccess.getGoToAccess().getGroup(), "rule__GoTo__Group__0");
			builder.put(grammarAccess.getUpAccess().getGroup(), "rule__Up__Group__0");
			builder.put(grammarAccess.getDownAccess().getGroup(), "rule__Down__Group__0");
			builder.put(grammarAccess.getLeftAccess().getGroup(), "rule__Left__Group__0");
			builder.put(grammarAccess.getRightAccess().getGroup(), "rule__Right__Group__0");
			builder.put(grammarAccess.getForwardAccess().getGroup(), "rule__Forward__Group__0");
			builder.put(grammarAccess.getBackwardAccess().getGroup(), "rule__Backward__Group__0");
			builder.put(grammarAccess.getRotateLAccess().getGroup(), "rule__RotateL__Group__0");
			builder.put(grammarAccess.getRotateRAccess().getGroup(), "rule__RotateR__Group__0");
			builder.put(grammarAccess.getWaitAccess().getGroup(), "rule__Wait__Group__0");
			builder.put(grammarAccess.getDroneAccess().getGroup(), "rule__Drone__Group__0");
			builder.put(grammarAccess.getDroneAccess().getGroup_2_1(), "rule__Drone__Group_2_1__0");
			builder.put(grammarAccess.getObjectAccess().getGroup(), "rule__Object__Group__0");
			builder.put(grammarAccess.getOriginAccess().getGroup(), "rule__Origin__Group__0");
			builder.put(grammarAccess.getSizeAccess().getGroup(), "rule__Size__Group__0");
			builder.put(grammarAccess.getPositionAccess().getGroup(), "rule__Position__Group__0");
			builder.put(grammarAccess.getVectorAccess().getGroup(), "rule__Vector__Group__0");
			builder.put(grammarAccess.getColorAccess().getGroup(), "rule__Color__Group__0");
			builder.put(grammarAccess.getWallsAccess().getGroup(), "rule__Walls__Group__0");
			builder.put(grammarAccess.getFrontWallAccess().getGroup(), "rule__FrontWall__Group__0");
			builder.put(grammarAccess.getRightWallAccess().getGroup(), "rule__RightWall__Group__0");
			builder.put(grammarAccess.getLeftWallAccess().getGroup(), "rule__LeftWall__Group__0");
			builder.put(grammarAccess.getBackWallAccess().getGroup(), "rule__BackWall__Group__0");
			builder.put(grammarAccess.getUpWallAccess().getGroup(), "rule__UpWall__Group__0");
			builder.put(grammarAccess.getProgramAccess().getMainAssignment(), "rule__Program__MainAssignment");
			builder.put(grammarAccess.getMainAccess().getFlyAssignment_0(), "rule__Main__FlyAssignment_0");
			builder.put(grammarAccess.getMainAccess().getEnvironmentAssignment_1(), "rule__Main__EnvironmentAssignment_1");
			builder.put(grammarAccess.getFlyAccess().getTakeoffAssignment_4_0(), "rule__Fly__TakeoffAssignment_4_0");
			builder.put(grammarAccess.getFlyAccess().getCommandsAssignment_4_1(), "rule__Fly__CommandsAssignment_4_1");
			builder.put(grammarAccess.getFlyAccess().getLandAssignment_4_2(), "rule__Fly__LandAssignment_4_2");
			builder.put(grammarAccess.getEnvironmentAccess().getDroneAssignment_5_0(), "rule__Environment__DroneAssignment_5_0");
			builder.put(grammarAccess.getEnvironmentAccess().getWallsAssignment_5_1(), "rule__Environment__WallsAssignment_5_1");
			builder.put(grammarAccess.getEnvironmentAccess().getObjectsAssignment_5_2(), "rule__Environment__ObjectsAssignment_5_2");
			builder.put(grammarAccess.getGoToAccess().getObject_nameAssignment_2(), "rule__GoTo__Object_nameAssignment_2");
			builder.put(grammarAccess.getUpAccess().getDistanceAssignment_2(), "rule__Up__DistanceAssignment_2");
			builder.put(grammarAccess.getDownAccess().getDistanceAssignment_2(), "rule__Down__DistanceAssignment_2");
			builder.put(grammarAccess.getLeftAccess().getDistanceAssignment_2(), "rule__Left__DistanceAssignment_2");
			builder.put(grammarAccess.getRightAccess().getDistanceAssignment_2(), "rule__Right__DistanceAssignment_2");
			builder.put(grammarAccess.getForwardAccess().getDistanceAssignment_2(), "rule__Forward__DistanceAssignment_2");
			builder.put(grammarAccess.getBackwardAccess().getDistanceAssignment_2(), "rule__Backward__DistanceAssignment_2");
			builder.put(grammarAccess.getRotateLAccess().getAngleAssignment_2(), "rule__RotateL__AngleAssignment_2");
			builder.put(grammarAccess.getRotateRAccess().getAngleAssignment_2(), "rule__RotateR__AngleAssignment_2");
			builder.put(grammarAccess.getWaitAccess().getSecondsAssignment_2(), "rule__Wait__SecondsAssignment_2");
			builder.put(grammarAccess.getDroneAccess().getPositionAssignment_2_0(), "rule__Drone__PositionAssignment_2_0");
			builder.put(grammarAccess.getDroneAccess().getRotationAssignment_2_1_2(), "rule__Drone__RotationAssignment_2_1_2");
			builder.put(grammarAccess.getObjectAccess().getObject_nameAssignment_0(), "rule__Object__Object_nameAssignment_0");
			builder.put(grammarAccess.getObjectAccess().getOriginAssignment_3_0(), "rule__Object__OriginAssignment_3_0");
			builder.put(grammarAccess.getObjectAccess().getSizeAssignment_3_1(), "rule__Object__SizeAssignment_3_1");
			builder.put(grammarAccess.getObjectAccess().getColorAssignment_3_2(), "rule__Object__ColorAssignment_3_2");
			builder.put(grammarAccess.getOriginAccess().getVectorAssignment_2(), "rule__Origin__VectorAssignment_2");
			builder.put(grammarAccess.getSizeAccess().getVectorAssignment_2(), "rule__Size__VectorAssignment_2");
			builder.put(grammarAccess.getPositionAccess().getVectorAssignment_2(), "rule__Position__VectorAssignment_2");
			builder.put(grammarAccess.getVectorAccess().getXAssignment_1(), "rule__Vector__XAssignment_1");
			builder.put(grammarAccess.getVectorAccess().getYAssignment_3(), "rule__Vector__YAssignment_3");
			builder.put(grammarAccess.getVectorAccess().getZAssignment_5(), "rule__Vector__ZAssignment_5");
			builder.put(grammarAccess.getColorAccess().getColor_valueAssignment_2(), "rule__Color__Color_valueAssignment_2");
			builder.put(grammarAccess.getWallsAccess().getFrontAssignment_2_0(), "rule__Walls__FrontAssignment_2_0");
			builder.put(grammarAccess.getWallsAccess().getRightAssignment_2_1(), "rule__Walls__RightAssignment_2_1");
			builder.put(grammarAccess.getWallsAccess().getBackAssignment_2_2(), "rule__Walls__BackAssignment_2_2");
			builder.put(grammarAccess.getWallsAccess().getLeftAssignment_2_3(), "rule__Walls__LeftAssignment_2_3");
			builder.put(grammarAccess.getWallsAccess().getUpAssignment_2_4(), "rule__Walls__UpAssignment_2_4");
			builder.put(grammarAccess.getFrontWallAccess().getValueAssignment_2(), "rule__FrontWall__ValueAssignment_2");
			builder.put(grammarAccess.getRightWallAccess().getValueAssignment_2(), "rule__RightWall__ValueAssignment_2");
			builder.put(grammarAccess.getLeftWallAccess().getValueAssignment_2(), "rule__LeftWall__ValueAssignment_2");
			builder.put(grammarAccess.getBackWallAccess().getValueAssignment_2(), "rule__BackWall__ValueAssignment_2");
			builder.put(grammarAccess.getUpWallAccess().getValueAssignment_2(), "rule__UpWall__ValueAssignment_2");
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
