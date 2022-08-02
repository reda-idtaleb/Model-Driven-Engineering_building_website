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
import portail_pedagogique.Specialty;
import portail_pedagogique.Training;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Training</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link portail_pedagogique.impl.TrainingImpl#getSpecialty <em>Specialty</em>}</li>
 *   <li>{@link portail_pedagogique.impl.TrainingImpl#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link portail_pedagogique.impl.TrainingImpl#getEducationManager <em>Education Manager</em>}</li>
 *   <li>{@link portail_pedagogique.impl.TrainingImpl#getSecretaries <em>Secretaries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrainingImpl extends NamedEntityImpl implements Training {
	/**
	 * The cached value of the '{@link #getSpecialty() <em>Specialty</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialty()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialty> specialty;

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
	 * The cached value of the '{@link #getEducationManager() <em>Education Manager</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEducationManager()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> educationManager;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Portail_pedagogiquePackage.Literals.TRAINING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialty> getSpecialty() {
		if (specialty == null) {
			specialty = new EObjectContainmentEList<Specialty>(Specialty.class, this,
					Portail_pedagogiquePackage.TRAINING__SPECIALTY);
		}
		return specialty;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Portail_pedagogiquePackage.TRAINING__PRESENTATION,
					oldPresentation, presentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getEducationManager() {
		if (educationManager == null) {
			educationManager = new EObjectResolvingEList<Employee>(Employee.class, this,
					Portail_pedagogiquePackage.TRAINING__EDUCATION_MANAGER);
		}
		return educationManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getSecretaries() {
		if (secretaries == null) {
			secretaries = new EObjectResolvingEList<Employee>(Employee.class, this,
					Portail_pedagogiquePackage.TRAINING__SECRETARIES);
		}
		return secretaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Portail_pedagogiquePackage.TRAINING__SPECIALTY:
			return ((InternalEList<?>) getSpecialty()).basicRemove(otherEnd, msgs);
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
		case Portail_pedagogiquePackage.TRAINING__SPECIALTY:
			return getSpecialty();
		case Portail_pedagogiquePackage.TRAINING__PRESENTATION:
			return getPresentation();
		case Portail_pedagogiquePackage.TRAINING__EDUCATION_MANAGER:
			return getEducationManager();
		case Portail_pedagogiquePackage.TRAINING__SECRETARIES:
			return getSecretaries();
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
		case Portail_pedagogiquePackage.TRAINING__SPECIALTY:
			getSpecialty().clear();
			getSpecialty().addAll((Collection<? extends Specialty>) newValue);
			return;
		case Portail_pedagogiquePackage.TRAINING__PRESENTATION:
			setPresentation((String) newValue);
			return;
		case Portail_pedagogiquePackage.TRAINING__EDUCATION_MANAGER:
			getEducationManager().clear();
			getEducationManager().addAll((Collection<? extends Employee>) newValue);
			return;
		case Portail_pedagogiquePackage.TRAINING__SECRETARIES:
			getSecretaries().clear();
			getSecretaries().addAll((Collection<? extends Employee>) newValue);
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
		case Portail_pedagogiquePackage.TRAINING__SPECIALTY:
			getSpecialty().clear();
			return;
		case Portail_pedagogiquePackage.TRAINING__PRESENTATION:
			setPresentation(PRESENTATION_EDEFAULT);
			return;
		case Portail_pedagogiquePackage.TRAINING__EDUCATION_MANAGER:
			getEducationManager().clear();
			return;
		case Portail_pedagogiquePackage.TRAINING__SECRETARIES:
			getSecretaries().clear();
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
		case Portail_pedagogiquePackage.TRAINING__SPECIALTY:
			return specialty != null && !specialty.isEmpty();
		case Portail_pedagogiquePackage.TRAINING__PRESENTATION:
			return PRESENTATION_EDEFAULT == null ? presentation != null : !PRESENTATION_EDEFAULT.equals(presentation);
		case Portail_pedagogiquePackage.TRAINING__EDUCATION_MANAGER:
			return educationManager != null && !educationManager.isEmpty();
		case Portail_pedagogiquePackage.TRAINING__SECRETARIES:
			return secretaries != null && !secretaries.isEmpty();
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

} //TrainingImpl
