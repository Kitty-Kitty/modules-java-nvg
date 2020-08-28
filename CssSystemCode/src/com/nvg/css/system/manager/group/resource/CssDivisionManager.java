/**
 * 
 */
package com.nvg.css.system.manager.group.resource;

import java.util.HashMap;
import java.util.Map;
import com.nvg.css.system.division.CssDivision;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CssDivisionManager extends CssGRManager {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Map<String, CssDivision> divisionMap = new HashMap<String, CssDivision>();

	/** 
	 * @return the divisionMap
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Map<String, CssDivision> getDivisionMap() {
		// begin-user-code
		return divisionMap;
		// end-user-code
	}

	/** 
	 * @param divisionMap the divisionMap to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setDivisionMap(Map<String, CssDivision> divisionMap) {
		// begin-user-code
		this.divisionMap = divisionMap;
		// end-user-code
	}
}