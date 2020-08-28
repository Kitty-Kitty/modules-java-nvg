/**
 * 
 */
package com.nvg.css.system.manager.platform.resource;

import java.util.HashMap;
import java.util.Map;
import com.nvg.css.system.device.CssGateway;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CssGatewayManager extends CssPRManager {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Map<String, CssGateway> gatewayMap = new HashMap<String, CssGateway>();

	/** 
	 * @return the gatewayMap
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Map<String, CssGateway> getGatewayMap() {
		// begin-user-code
		return gatewayMap;
		// end-user-code
	}

	/** 
	 * @param gatewayMap the gatewayMap to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setGatewayMap(Map<String, CssGateway> gatewayMap) {
		// begin-user-code
		this.gatewayMap = gatewayMap;
		// end-user-code
	}
}