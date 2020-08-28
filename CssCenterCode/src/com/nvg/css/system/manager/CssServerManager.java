/**
 * 
 */
package com.nvg.css.system.manager;

import java.util.HashMap;
import java.util.Map;
import com.nvg.css.system.device.CssServer;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CssServerManager extends CssManager {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Map<String, CssServer> serverMap = new HashMap<String, CssServer>();

	/** 
	 * @return the serverMap
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Map<String, CssServer> getServerMap() {
		// begin-user-code
		return serverMap;
		// end-user-code
	}

	/** 
	 * @param serverMap the serverMap to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setServerMap(Map<String, CssServer> serverMap) {
		// begin-user-code
		this.serverMap = serverMap;
		// end-user-code
	}
}