/**
 * generated by Xtext 2.10.0
 */
package kcl.ac.uk.xtext.videoAnnotationsDSL.impl;

import kcl.ac.uk.xtext.videoAnnotationsDSL.Time;
import kcl.ac.uk.xtext.videoAnnotationsDSL.VideoAnnotationsDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kcl.ac.uk.xtext.videoAnnotationsDSL.impl.TimeImpl#getSec <em>Sec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeImpl extends MinimalEObjectImpl.Container implements Time
{
  /**
   * The default value of the '{@link #getSec() <em>Sec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSec()
   * @generated
   * @ordered
   */
  protected static final int SEC_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSec() <em>Sec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSec()
   * @generated
   * @ordered
   */
  protected int sec = SEC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimeImpl()
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
    return VideoAnnotationsDSLPackage.Literals.TIME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSec()
  {
    return sec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSec(int newSec)
  {
    int oldSec = sec;
    sec = newSec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideoAnnotationsDSLPackage.TIME__SEC, oldSec, sec));
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
      case VideoAnnotationsDSLPackage.TIME__SEC:
        return getSec();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case VideoAnnotationsDSLPackage.TIME__SEC:
        setSec((Integer)newValue);
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
      case VideoAnnotationsDSLPackage.TIME__SEC:
        setSec(SEC_EDEFAULT);
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
      case VideoAnnotationsDSLPackage.TIME__SEC:
        return sec != SEC_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (sec: ");
    result.append(sec);
    result.append(')');
    return result.toString();
  }

} //TimeImpl
