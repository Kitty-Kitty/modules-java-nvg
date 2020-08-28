/**
 * 
 */
package com.nvg.css.system.manager;

import java.util.HashMap;
import java.util.Map;
import com.nvg.css.system.device.CssController;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CssControllerManager extends CssManager {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Map<String, CssController> controllerMap = new HashMap<String, CssController>();

	/** 
	 * @return the controllerMap
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Map<String, CssController> getControllerMap() {
		// begin-user-code
		return controllerMap;
		// end-user-code
	}

	/** 
	 * @param controllerMap the controllerMap to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setControllerMap(Map<String, CssController> controllerMap) {
		// begin-user-code
		this.controllerMap = controllerMap;
		// end-user-code
	}
}