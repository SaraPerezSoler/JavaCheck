/**
 */
package javaRule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.Return#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getReturn()
 * @model
 * @generated
 */
public interface Return extends Method {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeProperty)
	 * @see javaRule.JavaRulePackage#getReturn_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeProperty getType();

	/**
	 * Sets the value of the '{@link javaRule.Return#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeProperty value);

} // Return
