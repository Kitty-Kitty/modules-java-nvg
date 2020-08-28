/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmpBackgroundInformation.java 
 * @Prject: CssBeansCode
 * @Package: com.nvg.css.beans.gmp.devices 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 28, 2016 3:46:34 PM 
 * @version: V1.0   
 */
package com.nvg.css.beans.gmp.devices;

import com.nvg.css.beans.gmp.media.GmpFont;

/** 
 * <!-- begin-UML-doc -->
 * <p>background server information</p>
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GmpBackgroundInformation extends GmpServerInformation {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>font list information</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private GmpFont medias;

	/** 
	 * @return the medias
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public GmpFont getMedias() {
		// begin-user-code
		return medias;
		// end-user-code
	}

	/** 
	 * @param medias the medias to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setMedias(GmpFont medias) {
		// begin-user-code
		this.medias = medias;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>back color</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String backColor;

	/** 
	 * @return the backColor
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getBackColor() {
		// begin-user-code
		return backColor;
		// end-user-code
	}

	/** 
	 * @param backColor the backColor to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setBackColor(String backColor) {
		// begin-user-code
		this.backColor = backColor;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>picture quality</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private byte pictureQuality;

	/** 
	 * @return the pictureQuality
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public byte getPictureQuality() {
		// begin-user-code
		return pictureQuality;
		// end-user-code
	}

	/** 
	 * @param pictureQuality the pictureQuality to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setPictureQuality(byte pictureQuality) {
		// begin-user-code
		this.pictureQuality = pictureQuality;
		// end-user-code
	}
}