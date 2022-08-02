/**
 */
package portail_pedagogique;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Building</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link portail_pedagogique.Building#getClassroom <em>Classroom</em>}</li>
 * </ul>
 *
 * @see portail_pedagogique.Portail_pedagogiquePackage#getBuilding()
 * @model
 * @generated
 */
public interface Building extends NamedEntity, Ressources {
	/**
	 * Returns the value of the '<em><b>Classroom</b></em>' containment reference list.
	 * The list contents are of type {@link portail_pedagogique.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classroom</em>' containment reference list.
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getBuilding_Classroom()
	 * @model containment="true"
	 * @generated
	 */
	EList<Room> getClassroom();

} // Building
