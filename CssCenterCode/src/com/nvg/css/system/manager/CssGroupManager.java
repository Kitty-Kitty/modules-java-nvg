/**
 * 
 */
package com.nvg.css.system.manager;

import java.util.HashMap;
import java.util.Map;
import com.nvg.css.system.division.CssGroup;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CssGroupManager extends CssManager {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Map<String, CssGroup> groupMap = new HashMap<String, CssGroup>();

	/** 
	 * @return the groupMap
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Map<String, CssGroup> getGroupMap() {
		// begin-user-code
		return groupMap;
		// end-user-code
	}

	/** 
	 * @param groupMap the groupMap to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setGroupMap(Map<String, CssGroup> groupMap) {
		// begin-user-code
		this.groupMap = groupMap;
		// end-user-code
	}
}