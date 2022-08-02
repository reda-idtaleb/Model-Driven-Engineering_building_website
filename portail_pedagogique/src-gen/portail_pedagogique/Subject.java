/**
 */
package portail_pedagogique;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link portail_pedagogique.Subject#getLecturer <em>Lecturer</em>}</li>
 *   <li>{@link portail_pedagogique.Subject#getCredit <em>Credit</em>}</li>
 *   <li>{@link portail_pedagogique.Subject#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link portail_pedagogique.Subject#getSessions <em>Sessions</em>}</li>
 * </ul>
 *
 * @see portail_pedagogique.Portail_pedagogiquePackage#getSubject()
 * @model
 * @generated
 */
public interface Subject extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Lecturer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lecturer</em>' reference.
	 * @see #setLecturer(Employee)
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getSubject_Lecturer()
	 * @model
	 * @generated
	 */
	Employee getLecturer();

	/**
	 * Sets the value of the '{@link portail_pedagogique.Subject#getLecturer <em>Lecturer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lecturer</em>' reference.
	 * @see #getLecturer()
	 * @generated
	 */
	void setLecturer(Employee value);

	/**
	 * Returns the value of the '<em><b>Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit</em>' attribute.
	 * @see #setCredit(int)
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getSubject_Credit()
	 * @model
	 * @generated
	 */
	int getCredit();

	/**
	 * Sets the value of the '{@link portail_pedagogique.Subject#getCredit <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit</em>' attribute.
	 * @see #getCredit()
	 * @generated
	 */
	void setCredit(int value);

	/**
	 * Returns the value of the '<em><b>Presentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation</em>' attribute.
	 * @see #setPresentation(String)
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getSubject_Presentation()
	 * @model
	 * @generated
	 */
	String getPresentation();

	/**
	 * Sets the value of the '{@link portail_pedagogique.Subject#getPresentation <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation</em>' attribute.
	 * @see #getPresentation()
	 * @generated
	 */
	void setPresentation(String value);

	/**
	 * Returns the value of the '<em><b>Sessions</b></em>' containment reference list.
	 * The list contents are of type {@link portail_pedagogique.Session}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sessions</em>' containment reference list.
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getSubject_Sessions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Session> getSessions();

} // Subject
