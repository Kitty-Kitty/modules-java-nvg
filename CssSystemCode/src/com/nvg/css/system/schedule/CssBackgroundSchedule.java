/**
 * 
 */
package com.nvg.css.system.schedule;

import com.nvg.css.system.manager.group.resource.CssBackgroundPlayManager;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CssBackgroundSchedule extends CssGroupSchedule {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private CssBackgroundPlayManager backgroundPlayManager;

	/** 
	 * @return the backgroundPlayManager
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public CssBackgroundPlayManager getBackgroundPlayManager() {
		// begin-user-code
		return backgroundPlayManager;
		// end-user-code
	}

	/** 
	 * @param backgroundPlayManager the backgroundPlayManager to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setBackgroundPlayManager(
			CssBackgroundPlayManager backgroundPlayManager) {
		// begin-user-code
		this.backgroundPlayManager = backgroundPlayManager;
		// end-user-code
	}
}