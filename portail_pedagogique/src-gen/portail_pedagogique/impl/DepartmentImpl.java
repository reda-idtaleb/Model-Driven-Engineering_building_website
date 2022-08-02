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
import org.eclipse.emf.ecore.util.InternalEList;

import portail_pedagogique.Building;
import portail_pedagogique.Department;
import portail_pedagogique.Employee;
import portail_pedagogique.Portail_pedagogiquePackage;
import portail_pedagogique.TemporalResource;
import portail_pedagogique.Training;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link portail_pedagogique.impl.DepartmentImpl#getBuilding <em>Building</em>}</li>
 *   <li>{@link portail_pedagogique.impl.DepartmentImpl#getEmployees <em>Employees</em>}</li>
 *   <li>{@link portail_pedagogique.impl.DepartmentImpl#getTrainings <em>Trainings</em>}</li>
 *   <li>{@link portail_pedagogique.impl.DepartmentImpl#getTemporalresource <em>Temporalresource</em>}</li>
 *   <li>{@link portail_pedagogique.impl.DepartmentImpl#getPresentation <em>Presentation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartmentImpl extends NamedEntityImpl implements Department {
	/**
	 * The cached value of the '{@link #getBuilding() <em>Building</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuilding()
	 * @generated
	 * @ordered
	 */
	protected EList<Building> building;

	/**
	 * The cached value of the '{@link #getEmployees() <em>Employees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployees()
	 * @generated
	 * @ordered
	 */
	protected EList<Employee> employees;

	/**
	 * The cached value of the '{@link #getTrainings() <em>Trainings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainings()
	 * @generated
	 * @ordered
	 */
	protected EList<Training> trainings;

	/**
	 * The cached value of the '{@link #getTemporalresource() <em>Temporalresource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalresource()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporalResource> temporalresource;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Portail_pedagogiquePackage.Literals.DEPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Building> getBuilding() {
		if (building == null) {
			building = new EObjectContainmentEList<Building>(Building.class, this,
					Portail_pedagogiquePackage.DEPARTMENT__BUILDING);
		}
		return building;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getEmployees() {
		if (employees == null) {
			employees = new EObjectContainmentEList<Employee>(Employee.class, this,
					Portail_pedagogiquePackage.DEPARTMENT__EMPLOYEES);
		}
		return employees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Training> getTrainings() {
		if (trainings == null) {
			trainings = new EObjectContainmentEList<Training>(Training.class, this,
					Portail_pedagogiquePackage.DEPARTMENT__TRAININGS);
		}
		return trainings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemporalResource> getTemporalresource() {
		if (temporalresource == null) {
			temporalresource = new EObjectContainmentEList<TemporalResource>(TemporalResource.class, this,
					Portail_pedagogiquePackage.DEPARTMENT__TEMPORALRESOURCE);
		}
		return temporalresource;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Portail_pedagogiquePackage.DEPARTMENT__PRESENTATION,
					oldPresentation, presentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Portail_pedagogiquePackage.DEPARTMENT__BUILDING:
			return ((InternalEList<?>) getBuilding()).basicRemove(otherEnd, msgs);
		case Portail_pedagogiquePackage.DEPARTMENT__EMPLOYEES:
			return ((InternalEList<?>) getEmployees()).basicRemove(otherEnd, msgs);
		case Portail_pedagogiquePackage.DEPARTMENT__TRAININGS:
			return ((InternalEList<?>) getTrainings()).basicRemove(otherEnd, msgs);
		case Portail_pedagogiquePackage.DEPARTMENT__TEMPORALRESOURCE:
			return ((InternalEList<?>) getTemporalresource()).basicRemove(otherEnd, msgs);
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
		case Portail_pedagogiquePackage.DEPARTMENT__BUILDING:
			return getBuilding();
		case Portail_pedagogiquePackage.DEPARTMENT__EMPLOYEES:
			return getEmployees();
		case Portail_pedagogiquePackage.DEPARTMENT__TRAININGS:
			return getTrainings();
		case Portail_pedagogiquePackage.DEPARTMENT__TEMPORALRESOURCE:
			return getTemporalresource();
		case Portail_pedagogiquePackage.DEPARTMENT__PRESENTATION:
			return getPresentation();
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
		case Portail_pedagogiquePackage.DEPARTMENT__BUILDING:
			getBuilding().clear();
			getBuilding().addAll((Collection<? extends Building>) newValue);
			return;
		case Portail_pedagogiquePackage.DEPARTMENT__EMPLOYEES:
			getEmployees().clear();
			getEmployees().addAll((Collection<? extends Employee>) newValue);
			return;
		case Portail_pedagogiquePackage.DEPARTMENT__TRAININGS:
			getTrainings().clear();
			getTrainings().addAll((Collection<? extends Training>) newValue);
			return;
		case Portail_pedagogiquePackage.DEPARTMENT__TEMPORALRESOURCE:
			getTemporalresource().clear();
			getTemporalresource().addAll((Collection<? extends TemporalResource>) newValue);
			return;
		case Portail_pedagogiquePackage.DEPARTMENT__PRESENTATION:
			setPresentation((String) newValue);
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
		case Portail_pedagogiquePackage.DEPARTMENT__BUILDING:
			getBuilding().clear();
			return;
		case Portail_pedagogiquePackage.DEPARTMENT__EMPLOYEES:
			getEmployees().clear();
			return;
		case Portail_pedagogiquePackage.DEPARTMENT__TRAININGS:
			getTrainings().clear();
			return;
		case Portail_pedagogiquePackage.DEPARTMENT__TEMPORALRESOURCE:
			getTemporalresource().clear();
			return;
		case Portail_pedagogiquePackage.DEPARTMENT__PRESENTATION:
			setPresentation(PRESENTATION_EDEFAULT);
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
		case Portail_pedagogiquePackage.DEPARTMENT__BUILDING:
			return building != null && !building.isEmpty();
		case Portail_pedagogiquePackage.DEPARTMENT__EMPLOYEES:
			return employees != null && !employees.isEmpty();
		case Portail_pedagogiquePackage.DEPARTMENT__TRAININGS:
			return trainings != null && !trainings.isEmpty();
		case Portail_pedagogiquePackage.DEPARTMENT__TEMPORALRESOURCE:
			return temporalresource != null && !temporalresource.isEmpty();
		case Portail_pedagogiquePackage.DEPARTMENT__PRESENTATION:
			return PRESENTATION_EDEFAULT == null ? presentation != null : !PRESENTATION_EDEFAULT.equals(presentation);
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

} //DepartmentImpl
