/**
 * 
 */
package com.nvg.css.system.manager.group.resource;

import java.util.HashMap;
import java.util.Map;
import com.nvg.css.system.division.CssVideoPlay;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CssVideoPlayManager extends CssGRManager {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Map<String, CssVideoPlay> serverMap = new HashMap<String, CssVideoPlay>();

	/** 
	 * @return the serverMap
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Map<String, CssVideoPlay> getServerMap() {
		// begin-user-code
		return serverMap;
		// end-user-code
	}

	/** 
	 * @param serverMap the serverMap to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setServerMap(Map<String, CssVideoPlay> serverMap) {
		// begin-user-code
		this.serverMap = serverMap;
		// end-user-code
	}
}