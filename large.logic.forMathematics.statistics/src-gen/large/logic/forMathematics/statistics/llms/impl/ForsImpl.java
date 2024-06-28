/**
 * generated by Xtext 2.35.0
 */
package large.logic.forMathematics.statistics.llms.impl;

import java.util.Collection;

import large.logic.forMathematics.statistics.llms.Bodies;
import large.logic.forMathematics.statistics.llms.Fors;
import large.logic.forMathematics.statistics.llms.GenericVariable;
import large.logic.forMathematics.statistics.llms.LlmsPackage;
import large.logic.forMathematics.statistics.llms.Numbers;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fors</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link large.logic.forMathematics.statistics.llms.impl.ForsImpl#getVar <em>Var</em>}</li>
 *   <li>{@link large.logic.forMathematics.statistics.llms.impl.ForsImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link large.logic.forMathematics.statistics.llms.impl.ForsImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForsImpl extends LoopsImpl implements Fors
{
  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected GenericVariable var;

  /**
   * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected Numbers number;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForsImpl()
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
    return LlmsPackage.Literals.FORS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GenericVariable getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar(GenericVariable newVar, NotificationChain msgs)
  {
    GenericVariable oldVar = var;
    var = newVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlmsPackage.FORS__VAR, oldVar, newVar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVar(GenericVariable newVar)
  {
    if (newVar != var)
    {
      NotificationChain msgs = null;
      if (var != null)
        msgs = ((InternalEObject)var).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlmsPackage.FORS__VAR, null, msgs);
      if (newVar != null)
        msgs = ((InternalEObject)newVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlmsPackage.FORS__VAR, null, msgs);
      msgs = basicSetVar(newVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlmsPackage.FORS__VAR, newVar, newVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Numbers getNumber()
  {
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumber(Numbers newNumber, NotificationChain msgs)
  {
    Numbers oldNumber = number;
    number = newNumber;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlmsPackage.FORS__NUMBER, oldNumber, newNumber);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNumber(Numbers newNumber)
  {
    if (newNumber != number)
    {
      NotificationChain msgs = null;
      if (number != null)
        msgs = ((InternalEObject)number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlmsPackage.FORS__NUMBER, null, msgs);
      if (newNumber != null)
        msgs = ((InternalEObject)newNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlmsPackage.FORS__NUMBER, null, msgs);
      msgs = basicSetNumber(newNumber, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlmsPackage.FORS__NUMBER, newNumber, newNumber));
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
      body = new EObjectContainmentEList<Bodies>(Bodies.class, this, LlmsPackage.FORS__BODY);
    }
    return body;
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
      case LlmsPackage.FORS__VAR:
        return basicSetVar(null, msgs);
      case LlmsPackage.FORS__NUMBER:
        return basicSetNumber(null, msgs);
      case LlmsPackage.FORS__BODY:
        return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
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
      case LlmsPackage.FORS__VAR:
        return getVar();
      case LlmsPackage.FORS__NUMBER:
        return getNumber();
      case LlmsPackage.FORS__BODY:
        return getBody();
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
      case LlmsPackage.FORS__VAR:
        setVar((GenericVariable)newValue);
        return;
      case LlmsPackage.FORS__NUMBER:
        setNumber((Numbers)newValue);
        return;
      case LlmsPackage.FORS__BODY:
        getBody().clear();
        getBody().addAll((Collection<? extends Bodies>)newValue);
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
      case LlmsPackage.FORS__VAR:
        setVar((GenericVariable)null);
        return;
      case LlmsPackage.FORS__NUMBER:
        setNumber((Numbers)null);
        return;
      case LlmsPackage.FORS__BODY:
        getBody().clear();
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
      case LlmsPackage.FORS__VAR:
        return var != null;
      case LlmsPackage.FORS__NUMBER:
        return number != null;
      case LlmsPackage.FORS__BODY:
        return body != null && !body.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ForsImpl
