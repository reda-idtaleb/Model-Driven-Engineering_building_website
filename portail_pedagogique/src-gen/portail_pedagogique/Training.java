/**
 */
package portail_pedagogique;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Training</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link portail_pedagogique.Training#getSpecialty <em>Specialty</em>}</li>
 *   <li>{@link portail_pedagogique.Training#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link portail_pedagogique.Training#getEducationManager <em>Education Manager</em>}</li>
 *   <li>{@link portail_pedagogique.Training#getSecretaries <em>Secretaries</em>}</li>
 * </ul>
 *
 * @see portail_pedagogique.Portail_pedagogiquePackage#getTraining()
 * @model
 * @generated
 */
public interface Training extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Specialty</b></em>' containment reference list.
	 * The list contents are of type {@link portail_pedagogique.Specialty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialty</em>' containment reference list.
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getTraining_Specialty()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialty> getSpecialty();

	/**
	 * Returns the value of the '<em><b>Presentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation</em>' attribute.
	 * @see #setPresentation(String)
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getTraining_Presentation()
	 * @model
	 * @generated
	 */
	String getPresentation();

	/**
	 * Sets the value of the '{@link portail_pedagogique.Training#getPresentation <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation</em>' attribute.
	 * @see #getPresentation()
	 * @generated
	 */
	void setPresentation(String value);

	/**
	 * Returns the value of the '<em><b>Education Manager</b></em>' reference list.
	 * The list contents are of type {@link portail_pedagogique.Employee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Education Manager</em>' reference list.
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getTraining_EducationManager()
	 * @model required="true"
	 * @generated
	 */
	EList<Employee> getEducationManager();

	/**
	 * Returns the value of the '<em><b>Secretaries</b></em>' reference list.
	 * The list contents are of type {@link portail_pedagogique.Employee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secretaries</em>' reference list.
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getTraining_Secretaries()
	 * @model
	 * @generated
	 */
	EList<Employee> getSecretaries();

} // Training
