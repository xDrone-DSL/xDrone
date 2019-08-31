/**
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.xdrone.xDrone;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ic.ac.uk.xdrone.xDrone.Position#getVector <em>Vector</em>}</li>
 * </ul>
 *
 * @see ic.ac.uk.xdrone.xDrone.XDronePackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends EObject
{
  /**
   * Returns the value of the '<em><b>Vector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vector</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vector</em>' containment reference.
   * @see #setVector(Vector)
   * @see ic.ac.uk.xdrone.xDrone.XDronePackage#getPosition_Vector()
   * @model containment="true"
   * @generated
   */
  Vector getVector();

  /**
   * Sets the value of the '{@link ic.ac.uk.xdrone.xDrone.Position#getVector <em>Vector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vector</em>' containment reference.
   * @see #getVector()
   * @generated
   */
  void setVector(Vector value);

} // Position
