/*
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.xdrone.serializer;

import com.google.inject.Inject;
import ic.ac.uk.xdrone.services.XDroneGrammarAccess;
import ic.ac.uk.xdrone.xDrone.Back;
import ic.ac.uk.xdrone.xDrone.Color;
import ic.ac.uk.xdrone.xDrone.Drone;
import ic.ac.uk.xdrone.xDrone.Environment;
import ic.ac.uk.xdrone.xDrone.Fly;
import ic.ac.uk.xdrone.xDrone.FlyTo;
import ic.ac.uk.xdrone.xDrone.Front;
import ic.ac.uk.xdrone.xDrone.FunctionName;
import ic.ac.uk.xdrone.xDrone.Left;
import ic.ac.uk.xdrone.xDrone.Main;
import ic.ac.uk.xdrone.xDrone.Move;
import ic.ac.uk.xdrone.xDrone.Origin;
import ic.ac.uk.xdrone.xDrone.Program;
import ic.ac.uk.xdrone.xDrone.Right;
import ic.ac.uk.xdrone.xDrone.Rotate;
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
			case XDronePackage.BACK:
				sequence_Back(context, (Back) semanticObject); 
				return; 
			case XDronePackage.COLOR:
				sequence_Color(context, (Color) semanticObject); 
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
			case XDronePackage.FLY_TO:
				sequence_FlyTo(context, (FlyTo) semanticObject); 
				return; 
			case XDronePackage.FRONT:
				sequence_Front(context, (Front) semanticObject); 
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
	 *     Back returns Back
	 *
	 * Constraint:
	 *     value=POSITIVE_DOUBLE
	 */
	protected void sequence_Back(ISerializationContext context, Back semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.BACK__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.BACK__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBackAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0(), semanticObject.getValue());
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
	 *     Drone returns Drone
	 *
	 * Constraint:
	 *     (x=DOUBLE | y=DOUBLE | z=DOUBLE | rotation=DOUBLE)*
	 */
	protected void sequence_Drone(ISerializationContext context, Drone semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     SuperCommand returns FlyTo
	 *     Command returns FlyTo
	 *     FlyTo returns FlyTo
	 *
	 * Constraint:
	 *     object_name=STRING
	 */
	protected void sequence_FlyTo(ISerializationContext context, FlyTo semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.FLY_TO__OBJECT_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.FLY_TO__OBJECT_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFlyToAccess().getObject_nameSTRINGTerminalRuleCall_2_0(), semanticObject.getObject_name());
		feeder.finish();
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
	 *     Front returns Front
	 *
	 * Constraint:
	 *     value=POSITIVE_DOUBLE
	 */
	protected void sequence_Front(ISerializationContext context, Front semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.FRONT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.FRONT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFrontAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0(), semanticObject.getValue());
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
	 *     Left returns Left
	 *
	 * Constraint:
	 *     value=POSITIVE_DOUBLE
	 */
	protected void sequence_Left(ISerializationContext context, Left semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.LEFT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.LEFT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLeftAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0(), semanticObject.getValue());
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
	 *     Right returns Right
	 *
	 * Constraint:
	 *     value=POSITIVE_DOUBLE
	 */
	protected void sequence_Right(ISerializationContext context, Right semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.RIGHT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.RIGHT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRightAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0(), semanticObject.getValue());
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
	 *     Up returns Up
	 *
	 * Constraint:
	 *     value=POSITIVE_DOUBLE
	 */
	protected void sequence_Up(ISerializationContext context, Up semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.UP__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.UP__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUpAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0(), semanticObject.getValue());
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
	 *     seconds=POSITIVE_DOUBLE
	 */
	protected void sequence_Wait(ISerializationContext context, Wait semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.WAIT__SECONDS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.WAIT__SECONDS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWaitAccess().getSecondsPOSITIVE_DOUBLEParserRuleCall_2_0(), semanticObject.getSeconds());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Walls returns Walls
	 *
	 * Constraint:
	 *     (front=Front | right=Right | back=Back | left=Left | up=Up)+
	 */
	protected void sequence_Walls(ISerializationContext context, Walls semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
