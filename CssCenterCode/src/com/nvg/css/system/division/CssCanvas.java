/**
 * 
 */
package com.nvg.css.system.division;

import com.nvg.css.system.manager.CssDivisionManager;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CssCanvas extends CssDivision {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private CssDivisionManager divisionCollector = null;

	/** 
	 * @return the divisionCollector
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public CssDivisionManager getDivisionCollector() {
		// begin-user-code
		return divisionCollector;
		// end-user-code
	}

	/** 
	 * @param divisionCollector the divisionCollector to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setDivisionCollector(CssDivisionManager divisionCollector) {
		// begin-user-code
		this.divisionCollector = divisionCollector;
		// end-user-code
	}
}