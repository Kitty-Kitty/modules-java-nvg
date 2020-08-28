/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmpMediaServerInformation.java 
 * @Prject: CssBeansCode
 * @Package: com.nvg.css.beans.gmp.devices 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 28, 2016 3:46:34 PM 
 * @version: V1.0   
 */
package com.nvg.css.beans.gmp.devices;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GmpMediaServerInformation extends GmpServerInformation {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>current connection number</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int connect;

	/** 
	 * @return the connect
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getConnect() {
		// begin-user-code
		return connect;
		// end-user-code
	}

	/** 
	 * @param connect the connect to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setConnect(int connect) {
		// begin-user-code
		this.connect = connect;
		// end-user-code
	}
}