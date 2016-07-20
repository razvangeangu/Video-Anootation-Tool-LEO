/**
 * generated by Xtext 2.10.0
 */
package kcl.ac.uk.xtext.videoAnnotationsDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getFromTime <em>From Time</em>}</li>
 *   <li>{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getToTime <em>To Time</em>}</li>
 *   <li>{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getId <em>Id</em>}</li>
 *   <li>{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getSender <em>Sender</em>}</li>
 *   <li>{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getType <em>Type</em>}</li>
 *   <li>{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getScope <em>Scope</em>}</li>
 *   <li>{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getFocus <em>Focus</em>}</li>
 *   <li>{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getContent <em>Content</em>}</li>
 *   <li>{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see kcl.ac.uk.xtext.videoAnnotationsDSL.VideoAnnotationsDSLPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends EObject
{
  /**
   * Returns the value of the '<em><b>From Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From Time</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From Time</em>' containment reference.
   * @see #setFromTime(Time)
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.VideoAnnotationsDSLPackage#getAnnotation_FromTime()
   * @model containment="true"
   * @generated
   */
  Time getFromTime();

  /**
   * Sets the value of the '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getFromTime <em>From Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From Time</em>' containment reference.
   * @see #getFromTime()
   * @generated
   */
  void setFromTime(Time value);

  /**
   * Returns the value of the '<em><b>To Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Time</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Time</em>' containment reference.
   * @see #setToTime(Time)
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.VideoAnnotationsDSLPackage#getAnnotation_ToTime()
   * @model containment="true"
   * @generated
   */
  Time getToTime();

  /**
   * Sets the value of the '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getToTime <em>To Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Time</em>' containment reference.
   * @see #getToTime()
   * @generated
   */
  void setToTime(Time value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.VideoAnnotationsDSLPackage#getAnnotation_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Sender</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sender</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sender</em>' attribute.
   * @see #setSender(String)
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.VideoAnnotationsDSLPackage#getAnnotation_Sender()
   * @model
   * @generated
   */
  String getSender();

  /**
   * Sets the value of the '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getSender <em>Sender</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sender</em>' attribute.
   * @see #getSender()
   * @generated
   */
  void setSender(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Move)
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.VideoAnnotationsDSLPackage#getAnnotation_Type()
   * @model containment="true"
   * @generated
   */
  Move getType();

  /**
   * Sets the value of the '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Move value);

  /**
   * Returns the value of the '<em><b>Scope</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scope</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scope</em>' containment reference.
   * @see #setScope(Scope)
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.VideoAnnotationsDSLPackage#getAnnotation_Scope()
   * @model containment="true"
   * @generated
   */
  Scope getScope();

  /**
   * Sets the value of the '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getScope <em>Scope</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scope</em>' containment reference.
   * @see #getScope()
   * @generated
   */
  void setScope(Scope value);

  /**
   * Returns the value of the '<em><b>Focus</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Focus</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Focus</em>' containment reference.
   * @see #setFocus(Focus)
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.VideoAnnotationsDSLPackage#getAnnotation_Focus()
   * @model containment="true"
   * @generated
   */
  Focus getFocus();

  /**
   * Sets the value of the '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getFocus <em>Focus</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Focus</em>' containment reference.
   * @see #getFocus()
   * @generated
   */
  void setFocus(Focus value);

  /**
   * Returns the value of the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' attribute.
   * @see #setContent(String)
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.VideoAnnotationsDSLPackage#getAnnotation_Content()
   * @model
   * @generated
   */
  String getContent();

  /**
   * Sets the value of the '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getContent <em>Content</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' attribute.
   * @see #getContent()
   * @generated
   */
  void setContent(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Annotation)
   * @see kcl.ac.uk.xtext.videoAnnotationsDSL.VideoAnnotationsDSLPackage#getAnnotation_Target()
   * @model
   * @generated
   */
  Annotation getTarget();

  /**
   * Sets the value of the '{@link kcl.ac.uk.xtext.videoAnnotationsDSL.Annotation#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Annotation value);

} // Annotation
