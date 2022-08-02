/**
 */
package portail_pedagogique;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link portail_pedagogique.Semester#getSubject <em>Subject</em>}</li>
 *   <li>{@link portail_pedagogique.Semester#getSemester <em>Semester</em>}</li>
 *   <li>{@link portail_pedagogique.Semester#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see portail_pedagogique.Portail_pedagogiquePackage#getSemester()
 * @model
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference list.
	 * The list contents are of type {@link portail_pedagogique.Subject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference list.
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getSemester_Subject()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subject> getSubject();

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' attribute.
	 * The literals are from the enumeration {@link portail_pedagogique.SemesterKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' attribute.
	 * @see portail_pedagogique.SemesterKind
	 * @see #setSemester(SemesterKind)
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getSemester_Semester()
	 * @model
	 * @generated
	 */
	SemesterKind getSemester();

	/**
	 * Sets the value of the '{@link portail_pedagogique.Semester#getSemester <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' attribute.
	 * @see portail_pedagogique.SemesterKind
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(SemesterKind value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getSemester_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link portail_pedagogique.Semester#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Semester
