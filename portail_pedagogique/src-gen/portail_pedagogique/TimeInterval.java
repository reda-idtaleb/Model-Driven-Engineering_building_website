/**
 */
package portail_pedagogique;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link portail_pedagogique.TimeInterval#getBeginDate <em>Begin Date</em>}</li>
 *   <li>{@link portail_pedagogique.TimeInterval#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @see portail_pedagogique.Portail_pedagogiquePackage#getTimeInterval()
 * @model
 * @generated
 */
public interface TimeInterval extends TemporalResource {
	/**
	 * Returns the value of the '<em><b>Begin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin Date</em>' attribute.
	 * @see #setBeginDate(String)
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getTimeInterval_BeginDate()
	 * @model
	 * @generated
	 */
	String getBeginDate();

	/**
	 * Sets the value of the '{@link portail_pedagogique.TimeInterval#getBeginDate <em>Begin Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin Date</em>' attribute.
	 * @see #getBeginDate()
	 * @generated
	 */
	void setBeginDate(String value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(String)
	 * @see portail_pedagogique.Portail_pedagogiquePackage#getTimeInterval_EndDate()
	 * @model
	 * @generated
	 */
	String getEndDate();

	/**
	 * Sets the value of the '{@link portail_pedagogique.TimeInterval#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(String value);

} // TimeInterval
