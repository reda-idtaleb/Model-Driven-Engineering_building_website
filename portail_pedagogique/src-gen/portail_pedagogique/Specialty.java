/**
 */
package portail_pedagogique;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link portail_pedagogique.Specialty#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link portail_pedagogique.Specialty#getEducationManager <em>Education Manager</em>}</li>
 *   <li>{@link portail_pedagogique.Specialty#getSecretaries <em>Secretaries</em>}</li>
 *   <li>{@link portail_pedagogique.Specialty#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @see portail_pedagogique.Portail_pedagogiquePackage#getSpecialty()
 * @model
 * @generated
 */
public interface Specialty extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Presentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation</em>' attribute.
	 * @see #setPresentation(String)
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getSpecialty_Presentation()
	 * @model
	 * @generated
	 */
	String getPresentation();

	/**
	 * Sets the value of the '{@link portail_pedagogique.Specialty#getPresentation <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation</em>' attribute.
	 * @see #getPresentation()
	 * @generated
	 */
	void setPresentation(String value);

	/**
	 * Returns the value of the '<em><b>Education Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Education Manager</em>' reference.
	 * @see #setEducationManager(Employee)
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getSpecialty_EducationManager()
	 * @model
	 * @generated
	 */
	Employee getEducationManager();

	/**
	 * Sets the value of the '{@link portail_pedagogique.Specialty#getEducationManager <em>Education Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Education Manager</em>' reference.
	 * @see #getEducationManager()
	 * @generated
	 */
	void setEducationManager(Employee value);

	/**
	 * Returns the value of the '<em><b>Secretaries</b></em>' reference list.
	 * The list contents are of type {@link portail_pedagogique.Employee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secretaries</em>' reference list.
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getSpecialty_Secretaries()
	 * @model
	 * @generated
	 */
	EList<Employee> getSecretaries();

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link portail_pedagogique.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getSpecialty_Semesters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

} // Specialty
