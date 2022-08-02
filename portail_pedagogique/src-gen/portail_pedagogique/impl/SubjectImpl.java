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

import portail_pedagogique.Employee;
import portail_pedagogique.Portail_pedagogiquePackage;
import portail_pedagogique.Session;
import portail_pedagogique.Subject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link portail_pedagogique.impl.SubjectImpl#getLecturer <em>Lecturer</em>}</li>
 *   <li>{@link portail_pedagogique.impl.SubjectImpl#getCredit <em>Credit</em>}</li>
 *   <li>{@link portail_pedagogique.impl.SubjectImpl#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link portail_pedagogique.impl.SubjectImpl#getSessions <em>Sessions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubjectImpl extends NamedEntityImpl implements Subject {
	/**
	 * The cached value of the '{@link #getLecturer() <em>Lecturer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLecturer()
	 * @generated
	 * @ordered
	 */
	protected Employee lecturer;

	/**
	 * The default value of the '{@link #getCredit() <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit()
	 * @generated
	 * @ordered
	 */
	protected static final int CREDIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCredit() <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit()
	 * @generated
	 * @ordered
	 */
	protected int credit = CREDIT_EDEFAULT;

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
	 * The cached value of the '{@link #getSessions() <em>Sessions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessions()
	 * @generated
	 * @ordered
	 */
	protected EList<Session> sessions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Portail_pedagogiquePackage.Literals.SUBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee getLecturer() {
		if (lecturer != null && lecturer.eIsProxy()) {
			InternalEObject oldLecturer = (InternalEObject) lecturer;
			lecturer = (Employee) eResolveProxy(oldLecturer);
			if (lecturer != oldLecturer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Portail_pedagogiquePackage.SUBJECT__LECTURER, oldLecturer, lecturer));
			}
		}
		return lecturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee basicGetLecturer() {
		return lecturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLecturer(Employee newLecturer) {
		Employee oldLecturer = lecturer;
		lecturer = newLecturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Portail_pedagogiquePackage.SUBJECT__LECTURER,
					oldLecturer, lecturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCredit() {
		return credit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredit(int newCredit) {
		int oldCredit = credit;
		credit = newCredit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Portail_pedagogiquePackage.SUBJECT__CREDIT, oldCredit,
					credit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Portail_pedagogiquePackage.SUBJECT__PRESENTATION,
					oldPresentation, presentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Session> getSessions() {
		if (sessions == null) {
			sessions = new EObjectContainmentEList<Session>(Session.class, this,
					Portail_pedagogiquePackage.SUBJECT__SESSIONS);
		}
		return sessions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Portail_pedagogiquePackage.SUBJECT__SESSIONS:
			return ((InternalEList<?>) getSessions()).basicRemove(otherEnd, msgs);
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
		case Portail_pedagogiquePackage.SUBJECT__LECTURER:
			if (resolve)
				return getLecturer();
			return basicGetLecturer();
		case Portail_pedagogiquePackage.SUBJECT__CREDIT:
			return getCredit();
		case Portail_pedagogiquePackage.SUBJECT__PRESENTATION:
			return getPresentation();
		case Portail_pedagogiquePackage.SUBJECT__SESSIONS:
			return getSessions();
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
		case Portail_pedagogiquePackage.SUBJECT__LECTURER:
			setLecturer((Employee) newValue);
			return;
		case Portail_pedagogiquePackage.SUBJECT__CREDIT:
			setCredit((Integer) newValue);
			return;
		case Portail_pedagogiquePackage.SUBJECT__PRESENTATION:
			setPresentation((String) newValue);
			return;
		case Portail_pedagogiquePackage.SUBJECT__SESSIONS:
			getSessions().clear();
			getSessions().addAll((Collection<? extends Session>) newValue);
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
		case Portail_pedagogiquePackage.SUBJECT__LECTURER:
			setLecturer((Employee) null);
			return;
		case Portail_pedagogiquePackage.SUBJECT__CREDIT:
			setCredit(CREDIT_EDEFAULT);
			return;
		case Portail_pedagogiquePackage.SUBJECT__PRESENTATION:
			setPresentation(PRESENTATION_EDEFAULT);
			return;
		case Portail_pedagogiquePackage.SUBJECT__SESSIONS:
			getSessions().clear();
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
		case Portail_pedagogiquePackage.SUBJECT__LECTURER:
			return lecturer != null;
		case Portail_pedagogiquePackage.SUBJECT__CREDIT:
			return credit != CREDIT_EDEFAULT;
		case Portail_pedagogiquePackage.SUBJECT__PRESENTATION:
			return PRESENTATION_EDEFAULT == null ? presentation != null : !PRESENTATION_EDEFAULT.equals(presentation);
		case Portail_pedagogiquePackage.SUBJECT__SESSIONS:
			return sessions != null && !sessions.isEmpty();
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
		result.append(" (credit: ");
		result.append(credit);
		result.append(", presentation: ");
		result.append(presentation);
		result.append(')');
		return result.toString();
	}

} //SubjectImpl
