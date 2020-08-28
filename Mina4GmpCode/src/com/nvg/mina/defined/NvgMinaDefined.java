/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgMinaDefined.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.defined 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 6, 2016 3:45:06 PM 
 * @version: V1.0   
 */
package com.nvg.mina.defined;

/** 
 * <!-- begin-UML-doc -->
 * <p>mina defined </p>
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 28, 2016 3:11:23 PM 
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface NvgMinaDefined {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>key value of session attribute</p><p>value is ascii of "GMPH". </p><p>detail  G:0x67(103)/M:0x6d(109)/P:0x70(112)/H:0x68(104)</p><p>0x676d7068</p>
	 * <!-- end-UML-doc -->
	 * @fieldName: NVG_MINA_DEFINED_DECODER_INFORMATION
	 * @fieldType: int
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	static int NVG_MINA_DEFINED_DECODER_INFORMATION = 0x676d7068;
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>mina connector attribute</p>
	 * <!-- end-UML-doc -->
	 * @fieldName: NVG_MINA_DEFINED_CONNECTOR
	 * @fieldType: String
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	String NVG_MINA_DEFINED_CONNECTOR = "NVG_MINA_DEFINED_CONNECTOR";
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @fieldName: NVG_MINA_DEFINED_CONNECTOR_TIMEOUT
	 * @fieldType: int
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	int NVG_MINA_DEFINED_CONNECTOR_TIMEOUT = new Integer(30000);
}