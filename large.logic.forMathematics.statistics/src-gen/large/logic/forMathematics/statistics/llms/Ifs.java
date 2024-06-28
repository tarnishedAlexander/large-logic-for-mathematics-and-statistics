/**
 * generated by Xtext 2.35.0
 */
package large.logic.forMathematics.statistics.llms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link large.logic.forMathematics.statistics.llms.Ifs#getLg <em>Lg</em>}</li>
 *   <li>{@link large.logic.forMathematics.statistics.llms.Ifs#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see large.logic.forMathematics.statistics.llms.LlmsPackage#getIfs()
 * @model
 * @generated
 */
public interface Ifs extends EObject
{
  /**
   * Returns the value of the '<em><b>Lg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lg</em>' containment reference.
   * @see #setLg(LogicalParams)
   * @see large.logic.forMathematics.statistics.llms.LlmsPackage#getIfs_Lg()
   * @model containment="true"
   * @generated
   */
  LogicalParams getLg();

  /**
   * Sets the value of the '{@link large.logic.forMathematics.statistics.llms.Ifs#getLg <em>Lg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lg</em>' containment reference.
   * @see #getLg()
   * @generated
   */
  void setLg(LogicalParams value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference list.
   * The list contents are of type {@link large.logic.forMathematics.statistics.llms.Bodies}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference list.
   * @see large.logic.forMathematics.statistics.llms.LlmsPackage#getIfs_Body()
   * @model containment="true"
   * @generated
   */
  EList<Bodies> getBody();

} // Ifs
