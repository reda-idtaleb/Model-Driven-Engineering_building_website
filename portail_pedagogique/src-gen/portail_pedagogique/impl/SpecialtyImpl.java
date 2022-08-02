/**
 */
package portail_pedagogique.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import portail_pedagogique.Employee;
import portail_pedagogique.Portail_pedagogiquePackage;
import portail_pedagogique.Semester;
import portail_pedagogique.Specialty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link portail_pedagogique.impl.SpecialtyImpl#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link portail_pedagogique.impl.SpecialtyImpl#getEducationManager <em>Education Manager</em>}</li>
 *   <li>{@link portail_pedagogique.impl.SpecialtyImpl#getSecretaries <em>Secretaries</em>}</li>
 *   <li>{@link portail_pedagogique.impl.SpecialtyImpl#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecialtyImpl extends NamedEntityImpl implements Specialty {
	/**
	 * The default value of the '{@link #getPresentation() <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentation()
	 * @generated
	 * @ordered
	 */
	protected static final String PRESENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPresentation() <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentation()
	 * @generated
	 * @ordered
	 */
	protected String presentation = PRESENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEducationManager() <em>Education Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEducationManager()
	 * @generated
	 * @ordered
	 */
	protected Employee educationManager;

	/**
	 * The cached value of the '{@link #getSecretaries() <em>Secretaries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretaries()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> secretaries;

	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecialtyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Portail_pedagogiquePackage.Literals.SPECIALTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPresentation() {
		return presentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentation(String newPresentation) {
		String oldPresentation = presentation;
		presentation = newPresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Portail_pedagogiquePackage.SPECIALTY__PRESENTATION,
					oldPresentation, presentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee getEducationManager() {
		if (educationManager != null && educationManager.eIsProxy()) {
			InternalEObject oldEducationManager = (InternalEObject) educationManager;
			educationManager = (Employee) eResolveProxy(oldEducationManager);
			if (educationManager != oldEducationManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Portail_pedagogiquePackage.SPECIALTY__EDUCATION_MANAGER, oldEducationManager,
							educationManager));
			}
		}
		return educationManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee basicGetEducationManager() {
		return educationManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEducationManager(Employee newEducationManager) {
		Employee oldEducationManager = educationManager;
		educationManager = newEducationManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Portail_pedagogiquePackage.SPECIALTY__EDUCATION_MANAGER, oldEducationManager, educationManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getSecretaries() {
		if (secretaries == null) {
			secretaries = new EObjectResolvingEList<Employee>(Employee.class, this,
					Portail_pedagogiquePackage.SPECIALTY__SECRETARIES);
		}
		return secretaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentEList<Semester>(Semester.class, this,
					Portail_pedagogiquePackage.SPECIALTY__SEMESTERS);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Portail_pedagogiquePackage.SPECIALTY__SEMESTERS:
			return ((InternalEList<?>) getSemesters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Portail_pedagogiquePackage.SPECIALTY__PRESENTATION:
			return getPresentation();
		case Portail_pedagogiquePackage.SPECIALTY__EDUCATION_MANAGER:
			if (resolve)
				return getEducationManager();
			return basicGetEducationManager();
		case Portail_pedagogiquePackage.SPECIALTY__SECRETARIES:
			return getSecretaries();
		case Portail_pedagogiquePackage.SPECIALTY__SEMESTERS:
			return getSemesters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Portail_pedagogiquePackage.SPECIALTY__PRESENTATION:
			setPresentation((String) newValue);
			return;
		case Portail_pedagogiquePackage.SPECIALTY__EDUCATION_MANAGER:
			setEducationManager((Employee) newValue);
			return;
		case Portail_pedagogiquePackage.SPECIALTY__SECRETARIES:
			getSecretaries().clear();
			getSecretaries().addAll((Collection<? extends Employee>) newValue);
			return;
		case Portail_pedagogiquePackage.SPECIALTY__SEMESTERS:
			getSemesters().clear();
			getSemesters().addAll((Collection<? extends Semester>) newValue);
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
		case Portail_pedagogiquePackage.SPECIALTY__PRESENTATION:
			setPresentation(PRESENTATION_EDEFAULT);
			return;
		case Portail_pedagogiquePackage.SPECIALTY__EDUCATION_MANAGER:
			setEducationManager((Employee) null);
			return;
		case Portail_pedagogiquePackage.SPECIALTY__SECRETARIES:
			getSecretaries().clear();
			return;
		case Portail_pedagogiquePackage.SPECIALTY__SEMESTERS:
			getSemesters().clear();
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
		case Portail_pedagogiquePackage.SPECIALTY__PRESENTATION:
			return PRESENTATION_EDEFAULT == null ? presentation != null : !PRESENTATION_EDEFAULT.equals(presentation);
		case Portail_pedagogiquePackage.SPECIALTY__EDUCATION_MANAGER:
			return educationManager != null;
		case Portail_pedagogiquePackage.SPECIALTY__SECRETARIES:
			return secretaries != null && !secretaries.isEmpty();
		case Portail_pedagogiquePackage.SPECIALTY__SEMESTERS:
			return semesters != null && !semesters.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (presentation: ");
		result.append(presentation);
		result.append(')');
		return result.toString();
	}

} //SpecialtyImpl
