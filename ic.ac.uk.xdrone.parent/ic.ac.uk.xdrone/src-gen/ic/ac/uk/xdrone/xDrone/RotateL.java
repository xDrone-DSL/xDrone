/**
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.xdrone.xDrone;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotate L</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ic.ac.uk.xdrone.xDrone.RotateL#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @see ic.ac.uk.xdrone.xDrone.XDronePackage#getRotateL()
 * @model
 * @generated
 */
public interface RotateL extends Command
{
  /**
   * Returns the value of the '<em><b>Angle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Angle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Angle</em>' attribute.
   * @see #setAngle(int)
   * @see ic.ac.uk.xdrone.xDrone.XDronePackage#getRotateL_Angle()
   * @model
   * @generated
   */
  int getAngle();

  /**
   * Sets the value of the '{@link ic.ac.uk.xdrone.xDrone.RotateL#getAngle <em>Angle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Angle</em>' attribute.
   * @see #getAngle()
   * @generated
   */
  void setAngle(int value);

} // RotateL
