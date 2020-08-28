/**
 * 
 */
package com.nvg.css.system.manager.platform.resource;

import com.nvg.css.system.manager.CssManager;
import com.nvg.css.system.platform.CssPlatform;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CssPRManager extends CssManager {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private CssPlatform platform;

	/** 
	 * @return the platform
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public CssPlatform getPlatform() {
		// begin-user-code
		return platform;
		// end-user-code
	}

	/** 
	 * @param platform the platform to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setPlatform(CssPlatform platform) {
		// begin-user-code
		this.platform = platform;
		// end-user-code
	}
}