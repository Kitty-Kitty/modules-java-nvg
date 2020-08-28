/**
 * 
 */
package com.nvg.css.system.division;

import com.nvg.css.system.manager.CssCanvasManager;
import com.nvg.css.system.manager.CssMonitorManager;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CssGroup extends CssDivision {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private CssCanvasManager canvasCollector;

	/** 
	 * @return the canvasCollector
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public CssCanvasManager getCanvasCollector() {
		// begin-user-code
		return canvasCollector;
		// end-user-code
	}

	/** 
	 * @param canvasCollector the canvasCollector to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setCanvasCollector(CssCanvasManager canvasCollector) {
		// begin-user-code
		this.canvasCollector = canvasCollector;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private CssMonitorManager monitorCollector;

	/** 
	 * @return the monitorCollector
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public CssMonitorManager getMonitorCollector() {
		// begin-user-code
		return monitorCollector;
		// end-user-code
	}

	/** 
	 * @param monitorCollector the monitorCollector to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setMonitorCollector(CssMonitorManager monitorCollector) {
		// begin-user-code
		this.monitorCollector = monitorCollector;
		// end-user-code
	}
}