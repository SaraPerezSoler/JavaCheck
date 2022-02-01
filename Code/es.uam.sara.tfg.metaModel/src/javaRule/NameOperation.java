/**
 */
package javaRule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaRule.NameOperation#getOperator <em>Operator</em>}</li>
 *   <li>{@link javaRule.NameOperation#getLanguage <em>Language</em>}</li>
 *   <li>{@link javaRule.NameOperation#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see javaRule.JavaRulePackage#getNameOperation()
 * @model
 * @generated
 */
public interface NameOperation extends Attribute, javaRule.Class, Method, javaRule.Package, Interface, Enumeration, File {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The default value is <code>"EQUAL"</code>.
	 * The literals are from the enumeration {@link javaRule.NameOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see javaRule.NameOperator
	 * @see #setOperator(NameOperator)
	 * @see javaRule.JavaRulePackage#getNameOperation_Operator()
	 * @model default="EQUAL" required="true"
	 * @generated
	 */
	NameOperator getOperator();

	/**
	 * Sets the value of the '{@link javaRule.NameOperation#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see javaRule.NameOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(NameOperator value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The default value is <code>"EMPTY"</code>.
	 * The literals are from the enumeration {@link javaRule.Language}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see javaRule.Language
	 * @see #setLanguage(Language)
	 * @see javaRule.JavaRulePackage#getNameOperation_Language()
	 * @model default="EMPTY"
	 * @generated
	 */
	Language getLanguage();

	/**
	 * Sets the value of the '{@link javaRule.NameOperation#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see javaRule.Language
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Language value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringProperty)
	 * @see javaRule.JavaRulePackage#getNameOperation_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StringProperty getName();

	/**
	 * Sets the value of the '{@link javaRule.NameOperation#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(StringProperty value);

} // NameOperation
