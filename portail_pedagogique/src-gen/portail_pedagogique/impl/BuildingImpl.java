/**
 */
package portail_pedagogique.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import portail_pedagogique.Building;
import portail_pedagogique.Portail_pedagogiquePackage;
import portail_pedagogique.Room;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Building</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link portail_pedagogique.impl.BuildingImpl#getClassroom <em>Classroom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuildingImpl extends NamedEntityImpl implements Building {
	/**
	 * The cached value of the '{@link #getClassroom() <em>Classroom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassroom()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> classroom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Portail_pedagogiquePackage.Literals.BUILDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getClassroom() {
		if (classroom == null) {
			classroom = new EObjectContainmentEList<Room>(Room.class, this,
					Portail_pedagogiquePackage.BUILDING__CLASSROOM);
		}
		return classroom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Portail_pedagogiquePackage.BUILDING__CLASSROOM:
			return ((InternalEList<?>) getClassroom()).basicRemove(otherEnd, msgs);
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
		case Portail_pedagogiquePackage.BUILDING__CLASSROOM:
			return getClassroom();
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
		case Portail_pedagogiquePackage.BUILDING__CLASSROOM:
			getClassroom().clear();
			getClassroom().addAll((Collection<? extends Room>) newValue);
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
		case Portail_pedagogiquePackage.BUILDING__CLASSROOM:
			getClassroom().clear();
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
		case Portail_pedagogiquePackage.BUILDING__CLASSROOM:
			return classroom != null && !classroom.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BuildingImpl
