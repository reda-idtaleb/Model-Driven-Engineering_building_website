/**
 */
package portail_pedagogique;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Semester Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see portail_pedagogique.Portail_pedagogiquePackage#getSemesterKind()
 * @model
 * @generated
 */
public enum SemesterKind implements Enumerator {
	/**
	 * The '<em><b>S1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S1_VALUE
	 * @generated
	 * @ordered
	 */
	S1(0, "S1", "S1"),

	/**
	 * The '<em><b>S2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S2_VALUE
	 * @generated
	 * @ordered
	 */
	S2(1, "S2", "S2"),

	/**
	 * The '<em><b>S3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S3_VALUE
	 * @generated
	 * @ordered
	 */
	S3(2, "S3", "S3"),

	/**
	 * The '<em><b>S4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S4_VALUE
	 * @generated
	 * @ordered
	 */
	S4(3, "S4", "S4"),

	/**
	 * The '<em><b>S5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S5_VALUE
	 * @generated
	 * @ordered
	 */
	S5(4, "S5", "S5"),

	/**
	 * The '<em><b>S6</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S6_VALUE
	 * @generated
	 * @ordered
	 */
	S6(5, "S6", "S6");

	/**
	 * The '<em><b>S1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int S1_VALUE = 0;

	/**
	 * The '<em><b>S2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int S2_VALUE = 1;

	/**
	 * The '<em><b>S3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int S3_VALUE = 2;

	/**
	 * The '<em><b>S4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int S4_VALUE = 3;

	/**
	 * The '<em><b>S5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int S5_VALUE = 4;

	/**
	 * The '<em><b>S6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S6
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int S6_VALUE = 5;

	/**
	 * An array of all the '<em><b>Semester Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SemesterKind[] VALUES_ARRAY = new SemesterKind[] { S1, S2, S3, S4, S5, S6, };

	/**
	 * A public read-only list of all the '<em><b>Semester Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SemesterKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Semester Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SemesterKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SemesterKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Semester Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SemesterKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SemesterKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Semester Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SemesterKind get(int value) {
		switch (value) {
		case S1_VALUE:
			return S1;
		case S2_VALUE:
			return S2;
		case S3_VALUE:
			return S3;
		case S4_VALUE:
			return S4;
		case S5_VALUE:
			return S5;
		case S6_VALUE:
			return S6;
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
	private SemesterKind(int value, String name, String literal) {
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

} //SemesterKind
