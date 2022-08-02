/**
 */
package portail_pedagogique.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import portail_pedagogique.Employee;
import portail_pedagogique.Entity;
import portail_pedagogique.NamedEntity;
import portail_pedagogique.Portail_pedagogiquePackage;
import portail_pedagogique.Room;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link portail_pedagogique.impl.EmployeeImpl#getName <em>Name</em>}</li>
 *   <li>{@link portail_pedagogique.impl.EmployeeImpl#getEmailAdress <em>Email Adress</em>}</li>
 *   <li>{@link portail_pedagogique.impl.EmployeeImpl#getOffice <em>Office</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeeImpl extends MinimalEObjectImpl.Container implements Employee {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmailAdress() <em>Email Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailAdress()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_ADRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmailAdress() <em>Email Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailAdress()
	 * @generated
	 * @ordered
	 */
	protected String emailAdress = EMAIL_ADRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOffice() <em>Office</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffice()
	 * @generated
	 * @ordered
	 */
	protected Room office;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Portail_pedagogiquePackage.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Portail_pedagogiquePackage.EMPLOYEE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmailAdress() {
		return emailAdress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmailAdress(String newEmailAdress) {
		String oldEmailAdress = emailAdress;
		emailAdress = newEmailAdress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Portail_pedagogiquePackage.EMPLOYEE__EMAIL_ADRESS,
					oldEmailAdress, emailAdress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getOffice() {
		if (office != null && office.eIsProxy()) {
			InternalEObject oldOffice = (InternalEObject) office;
			office = (Room) eResolveProxy(oldOffice);
			if (office != oldOffice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Portail_pedagogiquePackage.EMPLOYEE__OFFICE, oldOffice, office));
			}
		}
		return office;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetOffice() {
		return office;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffice(Room newOffice) {
		Room oldOffice = office;
		office = newOffice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Portail_pedagogiquePackage.EMPLOYEE__OFFICE,
					oldOffice, office));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Portail_pedagogiquePackage.EMPLOYEE__NAME:
			return getName();
		case Portail_pedagogiquePackage.EMPLOYEE__EMAIL_ADRESS:
			return getEmailAdress();
		case Portail_pedagogiquePackage.EMPLOYEE__OFFICE:
			if (resolve)
				return getOffice();
			return basicGetOffice();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Portail_pedagogiquePackage.EMPLOYEE__NAME:
			setName((String) newValue);
			return;
		case Portail_pedagogiquePackage.EMPLOYEE__EMAIL_ADRESS:
			setEmailAdress((String) newValue);
			return;
		case Portail_pedagogiquePackage.EMPLOYEE__OFFICE:
			setOffice((Room) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Portail_pedagogiquePackage.EMPLOYEE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Portail_pedagogiquePackage.EMPLOYEE__EMAIL_ADRESS:
			setEmailAdress(EMAIL_ADRESS_EDEFAULT);
			return;
		case Portail_pedagogiquePackage.EMPLOYEE__OFFICE:
			setOffice((Room) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Portail_pedagogiquePackage.EMPLOYEE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Portail_pedagogiquePackage.EMPLOYEE__EMAIL_ADRESS:
			return EMAIL_ADRESS_EDEFAULT == null ? emailAdress != null : !EMAIL_ADRESS_EDEFAULT.equals(emailAdress);
		case Portail_pedagogiquePackage.EMPLOYEE__OFFICE:
			return office != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Entity.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == NamedEntity.class) {
			switch (derivedFeatureID) {
			case Portail_pedagogiquePackage.EMPLOYEE__NAME:
				return Portail_pedagogiquePackage.NAMED_ENTITY__NAME;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Entity.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == NamedEntity.class) {
			switch (baseFeatureID) {
			case Portail_pedagogiquePackage.NAMED_ENTITY__NAME:
				return Portail_pedagogiquePackage.EMPLOYEE__NAME;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", emailAdress: ");
		result.append(emailAdress);
		result.append(')');
		return result.toString();
	}

} //EmployeeImpl
