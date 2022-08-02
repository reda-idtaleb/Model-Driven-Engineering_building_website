/**
 */
package portail_pedagogique;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link portail_pedagogique.Session#getTeacher <em>Teacher</em>}</li>
 *   <li>{@link portail_pedagogique.Session#getTimeinterval <em>Timeinterval</em>}</li>
 *   <li>{@link portail_pedagogique.Session#getRoom <em>Room</em>}</li>
 *   <li>{@link portail_pedagogique.Session#getGroup <em>Group</em>}</li>
 *   <li>{@link portail_pedagogique.Session#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see portail_pedagogique.Portail_pedagogiquePackage#getSession()
 * @model
 * @generated
 */
public interface Session extends EObject {
	/**
	 * Returns the value of the '<em><b>Teacher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teacher</em>' reference.
	 * @see #setTeacher(Employee)
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getSession_Teacher()
	 * @model
	 * @generated
	 */
	Employee getTeacher();

	/**
	 * Sets the value of the '{@link portail_pedagogique.Session#getTeacher <em>Teacher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teacher</em>' reference.
	 * @see #getTeacher()
	 * @generated
	 */
	void setTeacher(Employee value);

	/**
	 * Returns the value of the '<em><b>Timeinterval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeinterval</em>' reference.
	 * @see #setTimeinterval(TimeInterval)
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getSession_Timeinterval()
	 * @model
	 * @generated
	 */
	TimeInterval getTimeinterval();

	/**
	 * Sets the value of the '{@link portail_pedagogique.Session#getTimeinterval <em>Timeinterval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeinterval</em>' reference.
	 * @see #getTimeinterval()
	 * @generated
	 */
	void setTimeinterval(TimeInterval value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getSession_Room()
	 * @model
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link portail_pedagogique.Session#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(Group)
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getSession_Group()
	 * @model containment="true"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link portail_pedagogique.Session#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"COURS"</code>.
	 * The literals are from the enumeration {@link portail_pedagogique.SessionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see portail_pedagogique.SessionKind
	 * @see #setType(SessionKind)
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getSession_Type()
	 * @model default="COURS"
	 * @generated
	 */
	SessionKind getType();

	/**
	 * Sets the value of the '{@link portail_pedagogique.Session#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see portail_pedagogique.SessionKind
	 * @see #getType()
	 * @generated
	 */
	void setType(SessionKind value);

} // Session
