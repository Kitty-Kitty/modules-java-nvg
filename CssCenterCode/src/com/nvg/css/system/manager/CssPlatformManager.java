/**
 * 
 */
package com.nvg.css.system.manager;

import java.util.HashMap;
import java.util.Map;
import com.nvg.css.system.device.CssPlatform;

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
}