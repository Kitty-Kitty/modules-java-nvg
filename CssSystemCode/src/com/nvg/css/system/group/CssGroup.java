/**
 * 
 */
package com.nvg.css.system.group;

import com.nvg.css.system.division.CssDivision;
import com.nvg.css.system.platform.CssPlatform;
import com.nvg.css.system.manager.group.resource.CssCanvasManager;
import com.nvg.css.system.manager.platform.resource.CssMonitorManager;
import com.nvg.css.system.manager.group.resource.CssVideoPlayManager;
import com.nvg.css.system.manager.group.resource.CssTemplateManager;

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
	private CssPlatform platform;

	/** 
	 * @return the platform
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public CssPlatform getPlatform() {
		// begin-user-code
		return platform;
		// end-user-code
	}

	/** 
	 * @param platform the platform to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setPlatform(CssPlatform platform) {
		// begin-user-code
		this.platform = platform;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private CssCanvasManager canvasManager;

	/** 
	 * @return the canvasManager
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public CssCanvasManager getCanvasManager() {
		// begin-user-code
		return canvasManager;
		// end-user-code
	}

	/** 
	 * @param canvasManager the canvasManager to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setCanvasManager(CssCanvasManager canvasManager) {
		// begin-user-code
		this.canvasManager = canvasManager;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private CssMonitorManager monitorManager;

	/** 
	 * @return the monitorManager
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public CssMonitorManager getMonitorManager() {
		// begin-user-code
		return monitorManager;
		// end-user-code
	}

	/** 
	 * @param monitorManager the monitorManager to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setMonitorManager(CssMonitorManager monitorManager) {
		// begin-user-code
		this.monitorManager = monitorManager;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private CssVideoPlayManager videoPlayManager;

	/** 
	 * @return the videoPlayManager
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public CssVideoPlayManager getVideoPlayManager() {
		// begin-user-code
		return videoPlayManager;
		// end-user-code
	}

	/** 
	 * @param videoPlayManager the videoPlayManager to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setVideoPlayManager(CssVideoPlayManager videoPlayManager) {
		// begin-user-code
		this.videoPlayManager = videoPlayManager;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private CssTemplateManager templateManager;

	/** 
	 * @return the templateManager
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public CssTemplateManager getTemplateManager() {
		// begin-user-code
		return templateManager;
		// end-user-code
	}

	/** 
	 * @param templateManager the templateManager to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setTemplateManager(CssTemplateManager templateManager) {
		// begin-user-code
		this.templateManager = templateManager;
		// end-user-code
	}
}