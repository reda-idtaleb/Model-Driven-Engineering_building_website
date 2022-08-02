/**
 */
package portail_pedagogique.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import portail_pedagogique.Building;
import portail_pedagogique.Portail_pedagogiquePackage;
import portail_pedagogique.Room;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link portail_pedagogique.impl.RoomImpl#getBuilding <em>Building</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends NamedEntityImpl implements Room {
	/**
	 * The cached value of the '{@link #getBuilding() <em>Building</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuilding()
	 * @generated
	 * @ordered
	 */
	protected Building building;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Portail_pedagogiquePackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Building getBuilding() {
		if (building != null && building.eIsProxy()) {
			InternalEObject oldBuilding = (InternalEObject) building;
			building = (Building) eResolveProxy(oldBuilding);
			if (building != oldBuilding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Portail_pedagogiquePackage.ROOM__BUILDING,
							oldBuilding, building));
			}
		}
		return building;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Building basicGetBuilding() {
		return building;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuilding(Building newBuilding) {
		Building oldBuilding = building;
		building = newBuilding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Portail_pedagogiquePackage.ROOM__BUILDING,
					oldBuilding, building));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Portail_pedagogiquePackage.ROOM__BUILDING:
			if (resolve)
				return getBuilding();
			return basicGetBuilding();
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
		case Portail_pedagogiquePackage.ROOM__BUILDING:
			setBuilding((Building) newValue);
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
		case Portail_pedagogiquePackage.ROOM__BUILDING:
			setBuilding((Building) null);
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
		case Portail_pedagogiquePackage.ROOM__BUILDING:
			return building != null;
		}
		return super.eIsSet(featureID);
	}

} //RoomImpl
