/**
 */
package portail_pedagogique;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link portail_pedagogique.Department#getBuilding <em>Building</em>}</li>
 *   <li>{@link portail_pedagogique.Department#getEmployees <em>Employees</em>}</li>
 *   <li>{@link portail_pedagogique.Department#getTrainings <em>Trainings</em>}</li>
 *   <li>{@link portail_pedagogique.Department#getTemporalresource <em>Temporalresource</em>}</li>
 *   <li>{@link portail_pedagogique.Department#getPresentation <em>Presentation</em>}</li>
 * </ul>
 *
 * @see portail_pedagogique.Portail_pedagogiquePackage#getDepartment()
 * @model
 * @generated
 */
public interface Department extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Building</b></em>' containment reference list.
	 * The list contents are of type {@link portail_pedagogique.Building}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building</em>' containment reference list.
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getDepartment_Building()
	 * @model containment="true"
	 * @generated
	 */
	EList<Building> getBuilding();

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' containment reference list.
	 * The list contents are of type {@link portail_pedagogique.Employee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' containment reference list.
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getDepartment_Employees()
	 * @model containment="true"
	 * @generated
	 */
	EList<Employee> getEmployees();

	/**
	 * Returns the value of the '<em><b>Trainings</b></em>' containment reference list.
	 * The list contents are of type {@link portail_pedagogique.Training}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trainings</em>' containment reference list.
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getDepartment_Trainings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Training> getTrainings();

	/**
	 * Returns the value of the '<em><b>Temporalresource</b></em>' containment reference list.
	 * The list contents are of type {@link portail_pedagogique.TemporalResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporalresource</em>' containment reference list.
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getDepartment_Temporalresource()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemporalResource> getTemporalresource();

	/**
	 * Returns the value of the '<em><b>Presentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation</em>' attribute.
	 * @see #setPresentation(String)
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getDepartment_Presentation()
	 * @model
	 * @generated
	 */
	String getPresentation();

	/**
	 * Sets the value of the '{@link portail_pedagogique.Department#getPresentation <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation</em>' attribute.
	 * @see #getPresentation()
	 * @generated
	 */
	void setPresentation(String value);

} // Department
