/**
 * 
 */
package com.nvg.css.system.manager;

import java.util.HashMap;
import java.util.Map;
import com.nvg.css.system.division.CssMonitor;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CssMonitorManager extends CssManager {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Map<String, CssMonitor> monitorMap = new HashMap<String, CssMonitor>();

	/** 
	 * @return the monitorMap
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Map<String, CssMonitor> getMonitorMap() {
		// begin-user-code
		return monitorMap;
		// end-user-code
	}

	/** 
	 * @param monitorMap the monitorMap to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setMonitorMap(Map<String, CssMonitor> monitorMap) {
		// begin-user-code
		this.monitorMap = monitorMap;
		// end-user-code
	}
}