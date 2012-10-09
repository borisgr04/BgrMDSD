/**
 */
package de.vogella.emf.webpage.model.webpage.impl;

import de.vogella.emf.webpage.model.webpage.Article;
import de.vogella.emf.webpage.model.webpage.Category;
import de.vogella.emf.webpage.model.webpage.MyWeb;
import de.vogella.emf.webpage.model.webpage.WebpagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.vogella.emf.webpage.model.webpage.impl.CategoryImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link de.vogella.emf.webpage.model.webpage.impl.CategoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.vogella.emf.webpage.model.webpage.impl.CategoryImpl#getArticles <em>Articles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoryImpl extends EObjectImpl implements Category {
	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected MyWeb pages;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArticles() <em>Articles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticles()
	 * @generated
	 * @ordered
	 */
	protected Article articles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebpagePackage.Literals.CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyWeb getPages() {
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPages(MyWeb newPages, NotificationChain msgs) {
		MyWeb oldPages = pages;
		pages = newPages;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebpagePackage.CATEGORY__PAGES, oldPages, newPages);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPages(MyWeb newPages) {
		if (newPages != pages) {
			NotificationChain msgs = null;
			if (pages != null)
				msgs = ((InternalEObject)pages).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebpagePackage.CATEGORY__PAGES, null, msgs);
			if (newPages != null)
				msgs = ((InternalEObject)newPages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebpagePackage.CATEGORY__PAGES, null, msgs);
			msgs = basicSetPages(newPages, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebpagePackage.CATEGORY__PAGES, newPages, newPages));
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebpagePackage.CATEGORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Article getArticles() {
		return articles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArticles(Article newArticles, NotificationChain msgs) {
		Article oldArticles = articles;
		articles = newArticles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebpagePackage.CATEGORY__ARTICLES, oldArticles, newArticles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArticles(Article newArticles) {
		if (newArticles != articles) {
			NotificationChain msgs = null;
			if (articles != null)
				msgs = ((InternalEObject)articles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebpagePackage.CATEGORY__ARTICLES, null, msgs);
			if (newArticles != null)
				msgs = ((InternalEObject)newArticles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebpagePackage.CATEGORY__ARTICLES, null, msgs);
			msgs = basicSetArticles(newArticles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebpagePackage.CATEGORY__ARTICLES, newArticles, newArticles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebpagePackage.CATEGORY__PAGES:
				return basicSetPages(null, msgs);
			case WebpagePackage.CATEGORY__ARTICLES:
				return basicSetArticles(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebpagePackage.CATEGORY__PAGES:
				return getPages();
			case WebpagePackage.CATEGORY__NAME:
				return getName();
			case WebpagePackage.CATEGORY__ARTICLES:
				return getArticles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebpagePackage.CATEGORY__PAGES:
				setPages((MyWeb)newValue);
				return;
			case WebpagePackage.CATEGORY__NAME:
				setName((String)newValue);
				return;
			case WebpagePackage.CATEGORY__ARTICLES:
				setArticles((Article)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case WebpagePackage.CATEGORY__PAGES:
				setPages((MyWeb)null);
				return;
			case WebpagePackage.CATEGORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WebpagePackage.CATEGORY__ARTICLES:
				setArticles((Article)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WebpagePackage.CATEGORY__PAGES:
				return pages != null;
			case WebpagePackage.CATEGORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WebpagePackage.CATEGORY__ARTICLES:
				return articles != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CategoryImpl
