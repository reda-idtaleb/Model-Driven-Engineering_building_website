/**
 */
package portail_pedagogique.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import portail_pedagogique.Employee;
import portail_pedagogique.Group;
import portail_pedagogique.Portail_pedagogiquePackage;
import portail_pedagogique.Room;
import portail_pedagogique.Session;
import portail_pedagogique.SessionKind;
import portail_pedagogique.TimeInterval;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link portail_pedagogique.impl.SessionImpl#getTeacher <em>Teacher</em>}</li>
 *   <li>{@link portail_pedagogique.impl.SessionImpl#getTimeinterval <em>Timeinterval</em>}</li>
 *   <li>{@link portail_pedagogique.impl.SessionImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link portail_pedagogique.impl.SessionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link portail_pedagogique.impl.SessionImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SessionImpl extends MinimalEObjectImpl.Container implements Session {
	/**
	 * The cached value of the '{@link #getTeacher() <em>Teacher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeacher()
	 * @generated
	 * @ordered
	 */
	protected Employee teacher;

	/**
	 * The cached value of the '{@link #getTimeinterval() <em>Timeinterval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeinterval()
	 * @generated
	 * @ordered
	 */
	protected TimeInterval timeinterval;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected Room room;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected Group group;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SessionKind TYPE_EDEFAULT = SessionKind.COURS;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SessionKind type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Portail_pedagogiquePackage.Literals.SESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee getTeacher() {
		if (teacher != null && teacher.eIsProxy()) {
			InternalEObject oldTeacher = (InternalEObject) teacher;
			teacher = (Employee) eResolveProxy(oldTeacher);
			if (teacher != oldTeacher) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Portail_pedagogiquePackage.SESSION__TEACHER, oldTeacher, teacher));
			}
		}
		return teacher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee basicGetTeacher() {
		return teacher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeacher(Employee newTeacher) {
		Employee oldTeacher = teacher;
		teacher = newTeacher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Portail_pedagogiquePackage.SESSION__TEACHER,
					oldTeacher, teacher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval getTimeinterval() {
		if (timeinterval != null && timeinterval.eIsProxy()) {
			InternalEObject oldTimeinterval = (InternalEObject) timeinterval;
			timeinterval = (TimeInterval) eResolveProxy(oldTimeinterval);
			if (timeinterval != oldTimeinterval) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Portail_pedagogiquePackage.SESSION__TIMEINTERVAL, oldTimeinterval, timeinterval));
			}
		}
		return timeinterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval basicGetTimeinterval() {
		return timeinterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeinterval(TimeInterval newTimeinterval) {
		TimeInterval oldTimeinterval = timeinterval;
		timeinterval = newTimeinterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Portail_pedagogiquePackage.SESSION__TIMEINTERVAL,
					oldTimeinterval, timeinterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getRoom() {
		if (room != null && room.eIsProxy()) {
			InternalEObject oldRoom = (InternalEObject) room;
			room = (Room) eResolveProxy(oldRoom);
			if (room != oldRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Portail_pedagogiquePackage.SESSION__ROOM,
							oldRoom, room));
			}
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(Room newRoom) {
		Room oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Portail_pedagogiquePackage.SESSION__ROOM, oldRoom,
					room));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(Group newGroup, NotificationChain msgs) {
		Group oldGroup = group;
		group = newGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Portail_pedagogiquePackage.SESSION__GROUP, oldGroup, newGroup);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(Group newGroup) {
		if (newGroup != group) {
			NotificationChain msgs = null;
			if (group != null)
				msgs = ((InternalEObject) group).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Portail_pedagogiquePackage.SESSION__GROUP, null, msgs);
			if (newGroup != null)
				msgs = ((InternalEObject) newGroup).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Portail_pedagogiquePackage.SESSION__GROUP, null, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Portail_pedagogiquePackage.SESSION__GROUP, newGroup,
					newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionKind getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SessionKind newType) {
		SessionKind oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Portail_pedagogiquePackage.SESSION__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Portail_pedagogiquePackage.SESSION__GROUP:
			return basicSetGroup(null, msgs);
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
		case Portail_pedagogiquePackage.SESSION__TEACHER:
			if (resolve)
				return getTeacher();
			return basicGetTeacher();
		case Portail_pedagogiquePackage.SESSION__TIMEINTERVAL:
			if (resolve)
				return getTimeinterval();
			return basicGetTimeinterval();
		case Portail_pedagogiquePackage.SESSION__ROOM:
			if (resolve)
				return getRoom();
			return basicGetRoom();
		case Portail_pedagogiquePackage.SESSION__GROUP:
			return getGroup();
		case Portail_pedagogiquePackage.SESSION__TYPE:
			return getType();
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
		case Portail_pedagogiquePackage.SESSION__TEACHER:
			setTeacher((Employee) newValue);
			return;
		case Portail_pedagogiquePackage.SESSION__TIMEINTERVAL:
			setTimeinterval((TimeInterval) newValue);
			return;
		case Portail_pedagogiquePackage.SESSION__ROOM:
			setRoom((Room) newValue);
			return;
		case Portail_pedagogiquePackage.SESSION__GROUP:
			setGroup((Group) newValue);
			return;
		case Portail_pedagogiquePackage.SESSION__TYPE:
			setType((SessionKind) newValue);
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
		case Portail_pedagogiquePackage.SESSION__TEACHER:
			setTeacher((Employee) null);
			return;
		case Portail_pedagogiquePackage.SESSION__TIMEINTERVAL:
			setTimeinterval((TimeInterval) null);
			return;
		case Portail_pedagogiquePackage.SESSION__ROOM:
			setRoom((Room) null);
			return;
		case Portail_pedagogiquePackage.SESSION__GROUP:
			setGroup((Group) null);
			return;
		case Portail_pedagogiquePackage.SESSION__TYPE:
			setType(TYPE_EDEFAULT);
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
		case Portail_pedagogiquePackage.SESSION__TEACHER:
			return teacher != null;
		case Portail_pedagogiquePackage.SESSION__TIMEINTERVAL:
			return timeinterval != null;
		case Portail_pedagogiquePackage.SESSION__ROOM:
			return room != null;
		case Portail_pedagogiquePackage.SESSION__GROUP:
			return group != null;
		case Portail_pedagogiquePackage.SESSION__TYPE:
			return type != TYPE_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //SessionImpl
