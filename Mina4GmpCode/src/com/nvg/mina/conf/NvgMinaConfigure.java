/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgMinaConfigure.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.conf 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Feb 28, 2016 12:39:48 PM 
 * @version: V1.0   
 */
package com.nvg.mina.conf;

/** 
 * <!-- begin-UML-doc -->
 * <p>mina configure<br></p>
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 28, 2016 3:11:23 PM 
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class NvgMinaConfigure {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>listening port</p>
	 * <!-- end-UML-doc -->
	 * @fieldName: port
	 * @fieldType: int
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	int port = new Integer(9123);

	/** 
	 * @return the port to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getPort() {
		// begin-user-code
		return port;
		// end-user-code
	}

	/** 
	 * @param port the port to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setPort(int port) {
		// begin-user-code
		this.port = port;
		// end-user-code
	}
}