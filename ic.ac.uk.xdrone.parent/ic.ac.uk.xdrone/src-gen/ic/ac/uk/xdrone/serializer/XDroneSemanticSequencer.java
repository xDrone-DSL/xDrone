/*
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.xdrone.serializer;

import com.google.inject.Inject;
import ic.ac.uk.xdrone.services.XDroneGrammarAccess;
import ic.ac.uk.xdrone.xDrone.Backward;
import ic.ac.uk.xdrone.xDrone.Color;
import ic.ac.uk.xdrone.xDrone.Down;
import ic.ac.uk.xdrone.xDrone.Drone;
import ic.ac.uk.xdrone.xDrone.Environment;
import ic.ac.uk.xdrone.xDrone.Fly;
import ic.ac.uk.xdrone.xDrone.Forward;
import ic.ac.uk.xdrone.xDrone.FunctionName;
import ic.ac.uk.xdrone.xDrone.Left;
import ic.ac.uk.xdrone.xDrone.Main;
import ic.ac.uk.xdrone.xDrone.Move;
import ic.ac.uk.xdrone.xDrone.Origin;
import ic.ac.uk.xdrone.xDrone.Program;
import ic.ac.uk.xdrone.xDrone.Right;
import ic.ac.uk.xdrone.xDrone.Rotate;
import ic.ac.uk.xdrone.xDrone.RotateL;
import ic.ac.uk.xdrone.xDrone.RotateR;
import ic.ac.uk.xdrone.xDrone.Size;
import ic.ac.uk.xdrone.xDrone.Up;
import ic.ac.uk.xdrone.xDrone.UserFunction;
import ic.ac.uk.xdrone.xDrone.Vector;
import ic.ac.uk.xdrone.xDrone.Wait;
import ic.ac.uk.xdrone.xDrone.Walls;
import ic.ac.uk.xdrone.xDrone.XDronePackage;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class XDroneSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XDroneGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == XDronePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XDronePackage.BACKWARD:
				sequence_Backward(context, (Backward) semanticObject); 
				return; 
			case XDronePackage.COLOR:
				sequence_Color(context, (Color) semanticObject); 
				return; 
			case XDronePackage.DOWN:
				sequence_Down(context, (Down) semanticObject); 
				return; 
			case XDronePackage.DRONE:
				sequence_Drone(context, (Drone) semanticObject); 
				return; 
			case XDronePackage.ENVIRONMENT:
				sequence_Environment(context, (Environment) semanticObject); 
				return; 
			case XDronePackage.FLY:
				sequence_Fly(context, (Fly) semanticObject); 
				return; 
			case XDronePackage.FORWARD:
				sequence_Forward(context, (Forward) semanticObject); 
				return; 
			case XDronePackage.FUNCTION_NAME:
				sequence_FunctionName(context, (FunctionName) semanticObject); 
				return; 
			case XDronePackage.LEFT:
				sequence_Left(context, (Left) semanticObject); 
				return; 
			case XDronePackage.MAIN:
				sequence_Main(context, (Main) semanticObject); 
				return; 
			case XDronePackage.MOVE:
				sequence_Move(context, (Move) semanticObject); 
				return; 
			case XDronePackage.OBJECT:
				sequence_Object(context, (ic.ac.uk.xdrone.xDrone.Object) semanticObject); 
				return; 
			case XDronePackage.ORIGIN:
				sequence_Origin(context, (Origin) semanticObject); 
				return; 
			case XDronePackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case XDronePackage.RIGHT:
				sequence_Right(context, (Right) semanticObject); 
				return; 
			case XDronePackage.ROTATE:
				sequence_Rotate(context, (Rotate) semanticObject); 
				return; 
			case XDronePackage.ROTATE_L:
				sequence_RotateL(context, (RotateL) semanticObject); 
				return; 
			case XDronePackage.ROTATE_R:
				sequence_RotateR(context, (RotateR) semanticObject); 
				return; 
			case XDronePackage.SIZE:
				sequence_Size(context, (Size) semanticObject); 
				return; 
			case XDronePackage.UP:
				sequence_Up(context, (Up) semanticObject); 
				return; 
			case XDronePackage.USER_FUNCTION:
				sequence_UserFunction(context, (UserFunction) semanticObject); 
				return; 
			case XDronePackage.VECTOR:
				sequence_Vector(context, (Vector) semanticObject); 
				return; 
			case XDronePackage.WAIT:
				sequence_Wait(context, (Wait) semanticObject); 
				return; 
			case XDronePackage.WALLS:
				sequence_Walls(context, (Walls) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     SuperCommand returns Backward
	 *     Command returns Backward
	 *     Backward returns Backward
	 *
	 * Constraint:
	 *     distance=DOUBLE
	 */
	protected void sequence_Backward(ISerializationContext context, Backward semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.BACKWARD__DISTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.BACKWARD__DISTANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBackwardAccess().getDistanceDOUBLEParserRuleCall_2_0(), semanticObject.getDistance());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Color returns Color
	 *
	 * Constraint:
	 *     color_value=STRING
	 */
	protected void sequence_Color(ISerializationContext context, Color semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.COLOR__COLOR_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.COLOR__COLOR_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getColorAccess().getColor_valueSTRINGTerminalRuleCall_2_0(), semanticObject.getColor_value());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SuperCommand returns Down
	 *     Command returns Down
	 *     Down returns Down
	 *
	 * Constraint:
	 *     distance=DOUBLE
	 */
	protected void sequence_Down(ISerializationContext context, Down semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.DOWN__DISTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.DOWN__DISTANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDownAccess().getDistanceDOUBLEParserRuleCall_2_0(), semanticObject.getDistance());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Drone returns Drone
	 *
	 * Constraint:
	 *     vector=Vector
	 */
	protected void sequence_Drone(ISerializationContext context, Drone semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.DRONE__VECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.DRONE__VECTOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDroneAccess().getVectorVectorParserRuleCall_1_0(), semanticObject.getVector());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Environment returns Environment
	 *
	 * Constraint:
	 *     (drone+=Drone | walls+=Walls | objects+=Object)*
	 */
	protected void sequence_Environment(ISerializationContext context, Environment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Fly returns Fly
	 *
	 * Constraint:
	 *     (takeoff+=Takeoff commands+=SuperCommand* land+=Land)
	 */
	protected void sequence_Fly(ISerializationContext context, Fly semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SuperCommand returns Forward
	 *     Command returns Forward
	 *     Forward returns Forward
	 *
	 * Constraint:
	 *     distance=DOUBLE
	 */
	protected void sequence_Forward(ISerializationContext context, Forward semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.FORWARD__DISTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.FORWARD__DISTANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getForwardAccess().getDistanceDOUBLEParserRuleCall_2_0(), semanticObject.getDistance());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SuperCommand returns FunctionName
	 *     FunctionName returns FunctionName
	 *
	 * Constraint:
	 *     func_name=ID
	 */
	protected void sequence_FunctionName(ISerializationContext context, FunctionName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.FUNCTION_NAME__FUNC_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.FUNCTION_NAME__FUNC_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFunctionNameAccess().getFunc_nameIDTerminalRuleCall_0_0(), semanticObject.getFunc_name());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SuperCommand returns Left
	 *     Command returns Left
	 *     Left returns Left
	 *
	 * Constraint:
	 *     distance=DOUBLE
	 */
	protected void sequence_Left(ISerializationContext context, Left semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.LEFT__DISTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.LEFT__DISTANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLeftAccess().getDistanceDOUBLEParserRuleCall_2_0(), semanticObject.getDistance());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Main returns Main
	 *
	 * Constraint:
	 *     (fly=Fly environment=Environment?)
	 */
	protected void sequence_Main(ISerializationContext context, Main semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SuperCommand returns Move
	 *     Command returns Move
	 *     Move returns Move
	 *
	 * Constraint:
	 *     vector=Vector
	 */
	protected void sequence_Move(ISerializationContext context, Move semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.MOVE__VECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.MOVE__VECTOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMoveAccess().getVectorVectorParserRuleCall_1_0(), semanticObject.getVector());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Object returns Object
	 *
	 * Constraint:
	 *     ((size=Size | color=Color)? (object_name=ID origin=Origin)?)+
	 */
	protected void sequence_Object(ISerializationContext context, ic.ac.uk.xdrone.xDrone.Object semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Origin returns Origin
	 *
	 * Constraint:
	 *     vector=Vector
	 */
	protected void sequence_Origin(ISerializationContext context, Origin semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.ORIGIN__VECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.ORIGIN__VECTOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOriginAccess().getVectorVectorParserRuleCall_2_0(), semanticObject.getVector());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     main=Main
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.PROGRAM__MAIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.PROGRAM__MAIN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProgramAccess().getMainMainParserRuleCall_0(), semanticObject.getMain());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SuperCommand returns Right
	 *     Command returns Right
	 *     Right returns Right
	 *
	 * Constraint:
	 *     distance=DOUBLE
	 */
	protected void sequence_Right(ISerializationContext context, Right semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.RIGHT__DISTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.RIGHT__DISTANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRightAccess().getDistanceDOUBLEParserRuleCall_2_0(), semanticObject.getDistance());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SuperCommand returns RotateL
	 *     Command returns RotateL
	 *     RotateL returns RotateL
	 *
	 * Constraint:
	 *     angle=INT
	 */
	protected void sequence_RotateL(ISerializationContext context, RotateL semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.ROTATE_L__ANGLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.ROTATE_L__ANGLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRotateLAccess().getAngleINTTerminalRuleCall_2_0(), semanticObject.getAngle());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SuperCommand returns RotateR
	 *     Command returns RotateR
	 *     RotateR returns RotateR
	 *
	 * Constraint:
	 *     angle=INT
	 */
	protected void sequence_RotateR(ISerializationContext context, RotateR semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.ROTATE_R__ANGLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.ROTATE_R__ANGLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRotateRAccess().getAngleINTTerminalRuleCall_2_0(), semanticObject.getAngle());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SuperCommand returns Rotate
	 *     Command returns Rotate
	 *     Rotate returns Rotate
	 *
	 * Constraint:
	 *     angle=DOUBLE
	 */
	protected void sequence_Rotate(ISerializationContext context, Rotate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.ROTATE__ANGLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.ROTATE__ANGLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRotateAccess().getAngleDOUBLEParserRuleCall_2_0(), semanticObject.getAngle());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Size returns Size
	 *
	 * Constraint:
	 *     vector=Vector
	 */
	protected void sequence_Size(ISerializationContext context, Size semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.SIZE__VECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.SIZE__VECTOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSizeAccess().getVectorVectorParserRuleCall_2_0(), semanticObject.getVector());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SuperCommand returns Up
	 *     Command returns Up
	 *     Up returns Up
	 *
	 * Constraint:
	 *     distance=DOUBLE
	 */
	protected void sequence_Up(ISerializationContext context, Up semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.UP__DISTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.UP__DISTANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUpAccess().getDistanceDOUBLEParserRuleCall_2_0(), semanticObject.getDistance());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     UserFunction returns UserFunction
	 *
	 * Constraint:
	 *     (name=ID func+=Command*)
	 */
	protected void sequence_UserFunction(ISerializationContext context, UserFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Vector returns Vector
	 *
	 * Constraint:
	 *     (x=DOUBLE y=DOUBLE z=DOUBLE)
	 */
	protected void sequence_Vector(ISerializationContext context, Vector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.VECTOR__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.VECTOR__X));
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.VECTOR__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.VECTOR__Y));
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.VECTOR__Z) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.VECTOR__Z));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVectorAccess().getXDOUBLEParserRuleCall_1_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getVectorAccess().getYDOUBLEParserRuleCall_3_0(), semanticObject.getY());
		feeder.accept(grammarAccess.getVectorAccess().getZDOUBLEParserRuleCall_5_0(), semanticObject.getZ());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SuperCommand returns Wait
	 *     Command returns Wait
	 *     Wait returns Wait
	 *
	 * Constraint:
	 *     seconds=DOUBLE
	 */
	protected void sequence_Wait(ISerializationContext context, Wait semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.WAIT__SECONDS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.WAIT__SECONDS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWaitAccess().getSecondsDOUBLEParserRuleCall_2_0(), semanticObject.getSeconds());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Walls returns Walls
	 *
	 * Constraint:
	 *     (front=POSITIVE_DOUBLE right=POSITIVE_DOUBLE back=POSITIVE_DOUBLE left=POSITIVE_DOUBLE)
	 */
	protected void sequence_Walls(ISerializationContext context, Walls semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.WALLS__FRONT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.WALLS__FRONT));
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.WALLS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.WALLS__RIGHT));
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.WALLS__BACK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.WALLS__BACK));
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.WALLS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.WALLS__LEFT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWallsAccess().getFrontPOSITIVE_DOUBLEParserRuleCall_2_0(), semanticObject.getFront());
		feeder.accept(grammarAccess.getWallsAccess().getRightPOSITIVE_DOUBLEParserRuleCall_4_0(), semanticObject.getRight());
		feeder.accept(grammarAccess.getWallsAccess().getBackPOSITIVE_DOUBLEParserRuleCall_6_0(), semanticObject.getBack());
		feeder.accept(grammarAccess.getWallsAccess().getLeftPOSITIVE_DOUBLEParserRuleCall_8_0(), semanticObject.getLeft());
		feeder.finish();
	}
	
	
}
