/**
 * generated by Xtext 2.35.0
 */
package large.logic.forMathematics.statistics.llms.impl;

import java.util.Collection;

import large.logic.forMathematics.statistics.llms.Bodies;
import large.logic.forMathematics.statistics.llms.Conditionals;
import large.logic.forMathematics.statistics.llms.GenericVariable;
import large.logic.forMathematics.statistics.llms.LlmsPackage;
import large.logic.forMathematics.statistics.llms.Loops;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bodies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link large.logic.forMathematics.statistics.llms.impl.BodiesImpl#getVar <em>Var</em>}</li>
 *   <li>{@link large.logic.forMathematics.statistics.llms.impl.BodiesImpl#getLoops <em>Loops</em>}</li>
 *   <li>{@link large.logic.forMathematics.statistics.llms.impl.BodiesImpl#getCond <em>Cond</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BodiesImpl extends MinimalEObjectImpl.Container implements Bodies
{
  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected EList<GenericVariable> var;

  /**
   * The cached value of the '{@link #getLoops() <em>Loops</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoops()
   * @generated
   * @ordered
   */
  protected EList<Loops> loops;

  /**
   * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected EList<Conditionals> cond;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BodiesImpl()
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
    return LlmsPackage.Literals.BODIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<GenericVariable> getVar()
  {
    if (var == null)
    {
      var = new EObjectContainmentEList<GenericVariable>(GenericVariable.class, this, LlmsPackage.BODIES__VAR);
    }
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Loops> getLoops()
  {
    if (loops == null)
    {
      loops = new EObjectContainmentEList<Loops>(Loops.class, this, LlmsPackage.BODIES__LOOPS);
    }
    return loops;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Conditionals> getCond()
  {
    if (cond == null)
    {
      cond = new EObjectContainmentEList<Conditionals>(Conditionals.class, this, LlmsPackage.BODIES__COND);
    }
    return cond;
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
      case LlmsPackage.BODIES__VAR:
        return ((InternalEList<?>)getVar()).basicRemove(otherEnd, msgs);
      case LlmsPackage.BODIES__LOOPS:
        return ((InternalEList<?>)getLoops()).basicRemove(otherEnd, msgs);
      case LlmsPackage.BODIES__COND:
        return ((InternalEList<?>)getCond()).basicRemove(otherEnd, msgs);
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
      case LlmsPackage.BODIES__VAR:
        return getVar();
      case LlmsPackage.BODIES__LOOPS:
        return getLoops();
      case LlmsPackage.BODIES__COND:
        return getCond();
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
      case LlmsPackage.BODIES__VAR:
        getVar().clear();
        getVar().addAll((Collection<? extends GenericVariable>)newValue);
        return;
      case LlmsPackage.BODIES__LOOPS:
        getLoops().clear();
        getLoops().addAll((Collection<? extends Loops>)newValue);
        return;
      case LlmsPackage.BODIES__COND:
        getCond().clear();
        getCond().addAll((Collection<? extends Conditionals>)newValue);
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
      case LlmsPackage.BODIES__VAR:
        getVar().clear();
        return;
      case LlmsPackage.BODIES__LOOPS:
        getLoops().clear();
        return;
      case LlmsPackage.BODIES__COND:
        getCond().clear();
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
      case LlmsPackage.BODIES__VAR:
        return var != null && !var.isEmpty();
      case LlmsPackage.BODIES__LOOPS:
        return loops != null && !loops.isEmpty();
      case LlmsPackage.BODIES__COND:
        return cond != null && !cond.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BodiesImpl
