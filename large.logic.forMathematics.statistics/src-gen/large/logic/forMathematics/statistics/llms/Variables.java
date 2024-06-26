/**
 * generated by Xtext 2.35.0
 */
package large.logic.forMathematics.statistics.llms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variables</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link large.logic.forMathematics.statistics.llms.Variables#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see large.logic.forMathematics.statistics.llms.LlmsPackage#getVariables()
 * @model
 * @generated
 */
public interface Variables extends Loops
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Expression)
   * @see large.logic.forMathematics.statistics.llms.LlmsPackage#getVariables_Exp()
   * @model containment="true"
   * @generated
   */
  Expression getExp();

  /**
   * Sets the value of the '{@link large.logic.forMathematics.statistics.llms.Variables#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expression value);

} // Variables
