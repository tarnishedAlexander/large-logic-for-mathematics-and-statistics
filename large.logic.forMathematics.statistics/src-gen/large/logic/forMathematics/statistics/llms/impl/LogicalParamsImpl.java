/**
 * generated by Xtext 2.35.0
 */
package large.logic.forMathematics.statistics.llms.impl;

import java.util.Collection;

import large.logic.forMathematics.statistics.llms.Bodies;
import large.logic.forMathematics.statistics.llms.LlmsPackage;
import large.logic.forMathematics.statistics.llms.LogicalParams;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Params</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link large.logic.forMathematics.statistics.llms.impl.LogicalParamsImpl#getBody <em>Body</em>}</li>
 *   <li>{@link large.logic.forMathematics.statistics.llms.impl.LogicalParamsImpl#getLogicParms <em>Logic Parms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalParamsImpl extends ConditionalsImpl implements LogicalParams
{
  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected EList<Bodies> body;

  /**
   * The cached value of the '{@link #getLogicParms() <em>Logic Parms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogicParms()
   * @generated
   * @ordered
   */
  protected EList<LogicalParams> logicParms;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicalParamsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LlmsPackage.Literals.LOGICAL_PARAMS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Bodies> getBody()
  {
    if (body == null)
    {
      body = new EObjectContainmentEList<Bodies>(Bodies.class, this, LlmsPackage.LOGICAL_PARAMS__BODY);
    }
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<LogicalParams> getLogicParms()
  {
    if (logicParms == null)
    {
      logicParms = new EObjectContainmentEList<LogicalParams>(LogicalParams.class, this, LlmsPackage.LOGICAL_PARAMS__LOGIC_PARMS);
    }
    return logicParms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LlmsPackage.LOGICAL_PARAMS__BODY:
        return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
      case LlmsPackage.LOGICAL_PARAMS__LOGIC_PARMS:
        return ((InternalEList<?>)getLogicParms()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LlmsPackage.LOGICAL_PARAMS__BODY:
        return getBody();
      case LlmsPackage.LOGICAL_PARAMS__LOGIC_PARMS:
        return getLogicParms();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LlmsPackage.LOGICAL_PARAMS__BODY:
        getBody().clear();
        getBody().addAll((Collection<? extends Bodies>)newValue);
        return;
      case LlmsPackage.LOGICAL_PARAMS__LOGIC_PARMS:
        getLogicParms().clear();
        getLogicParms().addAll((Collection<? extends LogicalParams>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LlmsPackage.LOGICAL_PARAMS__BODY:
        getBody().clear();
        return;
      case LlmsPackage.LOGICAL_PARAMS__LOGIC_PARMS:
        getLogicParms().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LlmsPackage.LOGICAL_PARAMS__BODY:
        return body != null && !body.isEmpty();
      case LlmsPackage.LOGICAL_PARAMS__LOGIC_PARMS:
        return logicParms != null && !logicParms.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LogicalParamsImpl
