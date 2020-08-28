/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmpBeanVersion.java 
 * @Prject: CssBeansCode
 * @Package: com.nvg.css.beans.gmp.base 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 28, 2016 3:49:35 PM 
 * @version: V1.0   
 */
package com.nvg.css.beans.gmp.base;

/** 
 * <!-- begin-UML-doc -->
 * @ClassName:&nbsp;GmpGmphVersion&nbsp;<br>@Description:&nbsp;TODO<br>@author:&nbsp;kitty&nbsp;fangzhenmu@novigo.com.cn<br>@date:&nbsp;Mar&nbsp;15,&nbsp;2016&nbsp;1:20:12&nbsp;PM&nbsp;<br>
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GmpBeanVersion {
	/** 
	 * <!-- begin-UML-doc -->
	 * @fieldName:&nbsp;version<br>@fieldType:&nbsp;int<br>@Description:&nbsp;version&nbsp;number
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static int version = new Integer(1000);

	/** 
	 * @return the version
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static int getVersion() {
		// begin-user-code
		return version;
		// end-user-code
	}

	/** 
	 * @param version the version to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static void setVersion(int version) {
		// begin-user-code
		GmpBeanVersion.version = version;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * @fieldName:&nbsp;versionString<br>@fieldType:&nbsp;String<br>@Description:&nbsp;version&nbsp;string
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static String versionString = "0.1.0";

	/** 
	 * @return the versionString
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static String getVersionString() {
		// begin-user-code
		return versionString;
		// end-user-code
	}

	/** 
	 * @param versionString the versionString to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static void setVersionString(String versionString) {
		// begin-user-code
		GmpBeanVersion.versionString = versionString;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * @fieldName:&nbsp;name<br>@fieldType:&nbsp;String<br>@Description:&nbsp;gmf&nbsp;parser&nbsp;name
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static String name = "Gmp";

	/** 
	 * @return the name
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static String getName() {
		// begin-user-code
		return name;
		// end-user-code
	}

	/** 
	 * @param name the name to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static void setName(String name) {
		// begin-user-code
		GmpBeanVersion.name = name;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * @Title:&nbsp;toString&nbsp;<br>@Description:&nbsp;TODO<br><br>@param&nbsp;format<br>@return&nbsp;String<br><br>@return:&nbsp;String<br>@exception
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static String toPrintString() {
		// begin-user-code
		return String.format("%s/%s(%d)", GmpBeanVersion.name,
				GmpBeanVersion.versionString, GmpBeanVersion.version);
		// end-user-code
	}
}