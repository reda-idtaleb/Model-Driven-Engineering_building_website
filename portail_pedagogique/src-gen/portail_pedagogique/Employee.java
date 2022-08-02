/**
 */
package portail_pedagogique;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link portail_pedagogique.Employee#getEmailAdress <em>Email Adress</em>}</li>
 *   <li>{@link portail_pedagogique.Employee#getOffice <em>Office</em>}</li>
 * </ul>
 *
 * @see portail_pedagogique.Portail_pedagogiquePackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends Ressources, NamedEntity {
	/**
	 * Returns the value of the '<em><b>Email Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Adress</em>' attribute.
	 * @see #setEmailAdress(String)
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getEmployee_EmailAdress()
	 * @model
	 * @generated
	 */
	String getEmailAdress();

	/**
	 * Sets the value of the '{@link portail_pedagogique.Employee#getEmailAdress <em>Email Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Adress</em>' attribute.
	 * @see #getEmailAdress()
	 * @generated
	 */
	void setEmailAdress(String value);

	/**
	 * Returns the value of the '<em><b>Office</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Office</em>' reference.
	 * @see #setOffice(Room)
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getEmployee_Office()
	 * @model
	 * @generated
	 */
	Room getOffice();

	/**
	 * Sets the value of the '{@link portail_pedagogique.Employee#getOffice <em>Office</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Office</em>' reference.
	 * @see #getOffice()
	 * @generated
	 */
	void setOffice(Room value);

} // Employee
