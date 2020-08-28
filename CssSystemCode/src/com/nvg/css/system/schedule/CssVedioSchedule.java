/**
 * 
 */
package com.nvg.css.system.schedule;

import com.nvg.css.system.manager.group.resource.CssVideoPlayManager;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CssVedioSchedule extends CssGroupSchedule {

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
}