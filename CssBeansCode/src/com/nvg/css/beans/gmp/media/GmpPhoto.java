/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmpPhoto.java 
 * @Prject: CssBeansCode
 * @Package: com.nvg.css.beans.gmp.media 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 28, 2016 3:46:34 PM 
 * @version: V1.0   
 */
package com.nvg.css.beans.gmp.media;

import com.nvg.css.beans.gmp.other.GmpRectPair;

/** 
 * <!-- begin-UML-doc -->
 * <p>photo information</p>
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GmpPhoto {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>picture type</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private byte type;

	/** 
	 * @return the type
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public byte getType() {
		// begin-user-code
		return type;
		// end-user-code
	}

	/** 
	 * @param type the type to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setType(byte type) {
		// begin-user-code
		this.type = type;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>view picture data length</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private GmpRectPair size;

	/** 
	 * @return the size
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public GmpRectPair getSize() {
		// begin-user-code
		return size;
		// end-user-code
	}

	/** 
	 * @param size the size to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setSize(GmpRectPair size) {
		// begin-user-code
		this.size = size;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>view picture data</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private byte[] picture = null;

	/** 
	 * @return the picture
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public byte[] getPicture() {
		// begin-user-code
		return picture;
		// end-user-code
	}

	/** 
	 * @param picture the picture to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setPicture(byte[] picture) {
		// begin-user-code
		this.picture = picture;
		// end-user-code
	}
}