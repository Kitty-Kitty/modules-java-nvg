/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmpPlayerInformation.java 
 * @Prject: CssBeansCode
 * @Package: com.nvg.css.beans.gmp.devices 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 28, 2016 3:46:34 PM 
 * @version: V1.0   
 */
package com.nvg.css.beans.gmp.devices;

import com.nvg.css.beans.gmp.other.GmpResolution;
import com.nvg.css.beans.gmp.other.GmpRectPair;

/** 
 * <!-- begin-UML-doc -->
 * <p>player information</p>
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GmpPlayerInformation extends GmpServerInformation {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>number of group-row-column, example "01-02-03"</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String number;

	/** 
	 * @return the number
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getNumber() {
		// begin-user-code
		return number;
		// end-user-code
	}

	/** 
	 * @param number the number to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setNumber(String number) {
		// begin-user-code
		this.number = number;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private GmpResolution resolution;

	/** 
	 * @return the resolution
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public GmpResolution getResolution() {
		// begin-user-code
		return resolution;
		// end-user-code
	}

	/** 
	 * @param resolution the resolution to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setResolution(GmpResolution resolution) {
		// begin-user-code
		this.resolution = resolution;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
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
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private GmpResolution backSize;

	/** 
	 * @return the backSize
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public GmpResolution getBackSize() {
		// begin-user-code
		return backSize;
		// end-user-code
	}

	/** 
	 * @param backSize the backSize to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setBackSize(GmpResolution backSize) {
		// begin-user-code
		this.backSize = backSize;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private byte backFps;

	/** 
	 * @return the backFps
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public byte getBackFps() {
		// begin-user-code
		return backFps;
		// end-user-code
	}

	/** 
	 * @param backFps the backFps to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setBackFps(byte backFps) {
		// begin-user-code
		this.backFps = backFps;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int size;

	/** 
	 * @return the size
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getSize() {
		// begin-user-code
		return size;
		// end-user-code
	}

	/** 
	 * @param size the size to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setSize(int size) {
		// begin-user-code
		this.size = size;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private GmpRectPair border;

	/** 
	 * @return the border
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public GmpRectPair getBorder() {
		// begin-user-code
		return border;
		// end-user-code
	}

	/** 
	 * @param border the border to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setBorder(GmpRectPair border) {
		// begin-user-code
		this.border = border;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private byte luminance;

	/** 
	 * @return the luminance
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public byte getLuminance() {
		// begin-user-code
		return luminance;
		// end-user-code
	}

	/** 
	 * @param luminance the luminance to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setLuminance(byte luminance) {
		// begin-user-code
		this.luminance = luminance;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private byte contrast;

	/** 
	 * @return the contrast
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public byte getContrast() {
		// begin-user-code
		return contrast;
		// end-user-code
	}

	/** 
	 * @param contrast the contrast to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setContrast(byte contrast) {
		// begin-user-code
		this.contrast = contrast;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private byte colorTemperature;

	/** 
	 * @return the colorTemperature
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public byte getColorTemperature() {
		// begin-user-code
		return colorTemperature;
		// end-user-code
	}

	/** 
	 * @param colorTemperature the colorTemperature to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setColorTemperature(byte colorTemperature) {
		// begin-user-code
		this.colorTemperature = colorTemperature;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private boolean _switch;

	/** 
	 * @return the _switch
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean is_switch() {
		// begin-user-code
		return _switch;
		// end-user-code
	}

	/** 
	 * @param _switch the _switch to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void set_switch(boolean _switch) {
		// begin-user-code
		this._switch = _switch;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String background;

	/** 
	 * @return the background
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getBackground() {
		// begin-user-code
		return background;
		// end-user-code
	}

	/** 
	 * @param background the background to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setBackground(String background) {
		// begin-user-code
		this.background = background;
		// end-user-code
	}
}