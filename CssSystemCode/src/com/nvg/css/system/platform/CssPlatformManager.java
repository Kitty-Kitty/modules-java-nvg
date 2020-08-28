/**
 * 
 */
package com.nvg.css.system.platform;

import com.nvg.css.system.manager.CssManager;

import java.util.HashMap;
import java.util.Map;
import com.nvg.css.system.core.CssSystem;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CssPlatformManager extends CssManager {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Map<String, CssPlatform> platformMap = new HashMap<String, CssPlatform>();

	/** 
	 * @return the platformMap
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Map<String, CssPlatform> getPlatformMap() {
		// begin-user-code
		return platformMap;
		// end-user-code
	}

	/** 
	 * @param platformMap the platformMap to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setPlatformMap(Map<String, CssPlatform> platformMap) {
		// begin-user-code
		this.platformMap = platformMap;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private CssSystem system;

	/** 
	 * @return the system
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public CssSystem getSystem() {
		// begin-user-code
		return system;
		// end-user-code
	}

	/** 
	 * @param system the system to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setSystem(CssSystem system) {
		// begin-user-code
		this.system = system;
		// end-user-code
	}
}