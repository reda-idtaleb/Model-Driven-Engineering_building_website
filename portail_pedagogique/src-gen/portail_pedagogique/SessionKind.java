/**
 */
package portail_pedagogique;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Session Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see portail_pedagogique.Portail_pedagogiquePackage#getSessionKind()
 * @model
 * @generated
 */
public enum SessionKind implements Enumerator {
	/**
	 * The '<em><b>COURS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COURS_VALUE
	 * @generated
	 * @ordered
	 */
	COURS(0, "COURS", "LECTURE"),
	/**
	 * The '<em><b>TP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #TP_VALUE
	 * @generated
	 * @ordered
	 */
	TP(1, "TP", "TP"),

	/**
	 * The '<em><b>TD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TD_VALUE
	 * @generated
	 * @ordered
	 */
	TD(2, "TD", "TD");

	/**
	 * The '<em><b>COURS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COURS
	 * @model literal="LECTURE"
	 * @generated
	 * @ordered
	 */
	public static final int COURS_VALUE = 0;

	/**
	 * The '<em><b>TP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TP_VALUE = 1;

	/**
	 * The '<em><b>TD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TD_VALUE = 2;

	/**
	 * An array of all the '<em><b>Session Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SessionKind[] VALUES_ARRAY = new SessionKind[] { COURS, TP, TD, };

	/**
	 * A public read-only list of all the '<em><b>Session Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SessionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Session Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SessionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SessionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Session Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SessionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SessionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Session Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SessionKind get(int value) {
		switch (value) {
		case COURS_VALUE:
			return COURS;
		case TP_VALUE:
			return TP;
		case TD_VALUE:
			return TD;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SessionKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //SessionKind
