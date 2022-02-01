/**
 */
package javaRule;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Name Check</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see javaRule.JavaRulePackage#getNameCheck()
 * @model
 * @generated
 */
public enum NameCheck implements Enumerator {
	/**
	 * The '<em><b>UPPER CASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPPER_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	UPPER_CASE(1, "UPPER_CASE", "UPPER_CASE"),

	/**
	 * The '<em><b>LOWER CASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWER_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	LOWER_CASE(2, "LOWER_CASE", "LOWER_CASE"),

	/**
	 * The '<em><b>UPPER CAMEL CASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPPER_CAMEL_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	UPPER_CAMEL_CASE(3, "UPPER_CAMEL_CASE", "UPPER_CAMEL_CASE"),

	/**
	 * The '<em><b>LOWER CAMEL CASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWER_CAMEL_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	LOWER_CAMEL_CASE(4, "LOWER_CAMEL_CASE", "LOWER_CAMEL_CASE"),

	/**
	 * The '<em><b>START UPPER CASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_UPPER_CASE_VALUE
	 * @generated
	 * @ordered
	 */
	START_UPPER_CASE(5, "START_UPPER_CASE", "START_UPPER_CASE");

	/**
	 * The '<em><b>UPPER CASE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UPPER CASE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPPER_CASE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UPPER_CASE_VALUE = 1;

	/**
	 * The '<em><b>LOWER CASE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOWER CASE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOWER_CASE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOWER_CASE_VALUE = 2;

	/**
	 * The '<em><b>UPPER CAMEL CASE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UPPER CAMEL CASE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPPER_CAMEL_CASE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UPPER_CAMEL_CASE_VALUE = 3;

	/**
	 * The '<em><b>LOWER CAMEL CASE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOWER CAMEL CASE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOWER_CAMEL_CASE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOWER_CAMEL_CASE_VALUE = 4;

	/**
	 * The '<em><b>START UPPER CASE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>START UPPER CASE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #START_UPPER_CASE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int START_UPPER_CASE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Name Check</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NameCheck[] VALUES_ARRAY =
		new NameCheck[] {
			UPPER_CASE,
			LOWER_CASE,
			UPPER_CAMEL_CASE,
			LOWER_CAMEL_CASE,
			START_UPPER_CASE,
		};

	/**
	 * A public read-only list of all the '<em><b>Name Check</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NameCheck> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Name Check</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NameCheck get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NameCheck result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Name Check</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NameCheck getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NameCheck result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Name Check</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NameCheck get(int value) {
		switch (value) {
			case UPPER_CASE_VALUE: return UPPER_CASE;
			case LOWER_CASE_VALUE: return LOWER_CASE;
			case UPPER_CAMEL_CASE_VALUE: return UPPER_CAMEL_CASE;
			case LOWER_CAMEL_CASE_VALUE: return LOWER_CAMEL_CASE;
			case START_UPPER_CASE_VALUE: return START_UPPER_CASE;
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
	private NameCheck(int value, String name, String literal) {
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
	
} //NameCheck
