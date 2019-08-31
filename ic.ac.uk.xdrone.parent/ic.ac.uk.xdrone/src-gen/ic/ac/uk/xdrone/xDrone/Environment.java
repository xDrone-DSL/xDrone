/**
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.xdrone.xDrone;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ic.ac.uk.xdrone.xDrone.Environment#getDrone <em>Drone</em>}</li>
 *   <li>{@link ic.ac.uk.xdrone.xDrone.Environment#getWalls <em>Walls</em>}</li>
 *   <li>{@link ic.ac.uk.xdrone.xDrone.Environment#getObjects <em>Objects</em>}</li>
 * </ul>
 *
 * @see ic.ac.uk.xdrone.xDrone.XDronePackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends EObject
{
  /**
   * Returns the value of the '<em><b>Drone</b></em>' containment reference list.
   * The list contents are of type {@link ic.ac.uk.xdrone.xDrone.Drone}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Drone</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Drone</em>' containment reference list.
   * @see ic.ac.uk.xdrone.xDrone.XDronePackage#getEnvironment_Drone()
   * @model containment="true"
   * @generated
   */
  EList<Drone> getDrone();

  /**
   * Returns the value of the '<em><b>Walls</b></em>' containment reference list.
   * The list contents are of type {@link ic.ac.uk.xdrone.xDrone.Walls}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Walls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Walls</em>' containment reference list.
   * @see ic.ac.uk.xdrone.xDrone.XDronePackage#getEnvironment_Walls()
   * @model containment="true"
   * @generated
   */
  EList<Walls> getWalls();

  /**
   * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
   * The list contents are of type {@link ic.ac.uk.xdrone.xDrone.Object}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objects</em>' containment reference list.
   * @see ic.ac.uk.xdrone.xDrone.XDronePackage#getEnvironment_Objects()
   * @model containment="true"
   * @generated
   */
  EList<ic.ac.uk.xdrone.xDrone.Object> getObjects();

} // Environment
