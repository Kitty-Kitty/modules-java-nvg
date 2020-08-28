/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgIdleStatus.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.connector 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 9, 2016 4:42:14 PM 
 * @version: V1.0   
 */
package com.nvg.mina.connector;

import org.apache.mina.core.session.IdleStatus;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 28, 2016 3:11:23 PM 
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class NvgIdleStatus {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>idle status of mina</p>
	 * <!-- end-UML-doc -->
	 * @fieldName: idleStatus
	 * @fieldType: IdleStatus
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private IdleStatus idleStatus;

	/** 
	 * @return the idleStatus to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public IdleStatus getIdleStatus() {
		// begin-user-code
		return idleStatus;
		// end-user-code
	}

	/** 
	 * @param idleStatus the idleStatus to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setIdleStatus(IdleStatus idleStatus) {
		// begin-user-code
		this.idleStatus = idleStatus;
		// end-user-code
	}
}