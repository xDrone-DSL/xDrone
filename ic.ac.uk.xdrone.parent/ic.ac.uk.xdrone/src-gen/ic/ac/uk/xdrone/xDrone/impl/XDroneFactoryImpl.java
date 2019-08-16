/**
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.xdrone.xDrone.impl;

import ic.ac.uk.xdrone.xDrone.Back;
import ic.ac.uk.xdrone.xDrone.Color;
import ic.ac.uk.xdrone.xDrone.Command;
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
import ic.ac.uk.xdrone.xDrone.SuperCommand;
import ic.ac.uk.xdrone.xDrone.Up;
import ic.ac.uk.xdrone.xDrone.UserFunction;
import ic.ac.uk.xdrone.xDrone.Vector;
import ic.ac.uk.xdrone.xDrone.Wait;
import ic.ac.uk.xdrone.xDrone.Walls;
import ic.ac.uk.xdrone.xDrone.XDroneFactory;
import ic.ac.uk.xdrone.xDrone.XDronePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XDroneFactoryImpl extends EFactoryImpl implements XDroneFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static XDroneFactory init()
  {
    try
    {
      XDroneFactory theXDroneFactory = (XDroneFactory)EPackage.Registry.INSTANCE.getEFactory(XDronePackage.eNS_URI);
      if (theXDroneFactory != null)
      {
        return theXDroneFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new XDroneFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XDroneFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case XDronePackage.PROGRAM: return createProgram();
      case XDronePackage.MAIN: return createMain();
      case XDronePackage.FLY: return createFly();
      case XDronePackage.ENVIRONMENT: return createEnvironment();
      case XDronePackage.USER_FUNCTION: return createUserFunction();
      case XDronePackage.SUPER_COMMAND: return createSuperCommand();
      case XDronePackage.COMMAND: return createCommand();
      case XDronePackage.FLY_TO: return createFlyTo();
      case XDronePackage.MOVE: return createMove();
      case XDronePackage.ROTATE: return createRotate();
      case XDronePackage.WAIT: return createWait();
      case XDronePackage.FUNCTION_NAME: return createFunctionName();
      case XDronePackage.DRONE: return createDrone();
      case XDronePackage.OBJECT: return createObject();
      case XDronePackage.ORIGIN: return createOrigin();
      case XDronePackage.SIZE: return createSize();
      case XDronePackage.VECTOR: return createVector();
      case XDronePackage.COLOR: return createColor();
      case XDronePackage.WALLS: return createWalls();
      case XDronePackage.FRONT: return createFront();
      case XDronePackage.RIGHT: return createRight();
      case XDronePackage.LEFT: return createLeft();
      case XDronePackage.BACK: return createBack();
      case XDronePackage.UP: return createUp();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Main createMain()
  {
    MainImpl main = new MainImpl();
    return main;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fly createFly()
  {
    FlyImpl fly = new FlyImpl();
    return fly;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Environment createEnvironment()
  {
    EnvironmentImpl environment = new EnvironmentImpl();
    return environment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UserFunction createUserFunction()
  {
    UserFunctionImpl userFunction = new UserFunctionImpl();
    return userFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuperCommand createSuperCommand()
  {
    SuperCommandImpl superCommand = new SuperCommandImpl();
    return superCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlyTo createFlyTo()
  {
    FlyToImpl flyTo = new FlyToImpl();
    return flyTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Move createMove()
  {
    MoveImpl move = new MoveImpl();
    return move;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rotate createRotate()
  {
    RotateImpl rotate = new RotateImpl();
    return rotate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Wait createWait()
  {
    WaitImpl wait = new WaitImpl();
    return wait;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionName createFunctionName()
  {
    FunctionNameImpl functionName = new FunctionNameImpl();
    return functionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Drone createDrone()
  {
    DroneImpl drone = new DroneImpl();
    return drone;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ic.ac.uk.xdrone.xDrone.Object createObject()
  {
    ObjectImpl object = new ObjectImpl();
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Origin createOrigin()
  {
    OriginImpl origin = new OriginImpl();
    return origin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Size createSize()
  {
    SizeImpl size = new SizeImpl();
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vector createVector()
  {
    VectorImpl vector = new VectorImpl();
    return vector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color createColor()
  {
    ColorImpl color = new ColorImpl();
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Walls createWalls()
  {
    WallsImpl walls = new WallsImpl();
    return walls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Front createFront()
  {
    FrontImpl front = new FrontImpl();
    return front;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Right createRight()
  {
    RightImpl right = new RightImpl();
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Left createLeft()
  {
    LeftImpl left = new LeftImpl();
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Back createBack()
  {
    BackImpl back = new BackImpl();
    return back;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Up createUp()
  {
    UpImpl up = new UpImpl();
    return up;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XDronePackage getXDronePackage()
  {
    return (XDronePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static XDronePackage getPackage()
  {
    return XDronePackage.eINSTANCE;
  }

} //XDroneFactoryImpl
