/**
 */
package portail_pedagogique;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link portail_pedagogique.Room#getBuilding <em>Building</em>}</li>
 * </ul>
 *
 * @see portail_pedagogique.Portail_pedagogiquePackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends NamedEntity {

	/**
	 * Returns the value of the '<em><b>Building</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building</em>' reference.
	 * @see #setBuilding(Building)
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getRoom_Building()
	 * @model
	 * @generated
	 */
	Building getBuilding();

	/**
	 * Sets the value of the '{@link portail_pedagogique.Room#getBuilding <em>Building</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building</em>' reference.
	 * @see #getBuilding()
	 * @generated
	 */
	void setBuilding(Building value);
} // Room
