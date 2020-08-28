/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmpDeviceRegisterProcess.java 
 * @Prject: CssGmpProcessCode
 * @Package: com.nvg.css.process.gmp.recevice.base 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 28, 2016 3:58:00 PM 
 * @version: V1.0   
 */
package com.nvg.css.process.gmp.recevice.base;

import com.nvg.css.beans.gmp.base.GmpHost;
import com.nvg.css.process.gmp.recevice.ReceiveGmpRequestProcess;
import com.nvg.mina.connector.NvgConnector;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kitty
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GmpDeviceRegisterProcess extends ReceiveGmpRequestProcess {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void CcGmpDeviceRegisterProcess() {
		// begin-user-code
		this.setGmpBeanName("com.nvg.css.center.gmp.request.beans.base.CssGmpHost");
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>message caught</p>
	 * <!-- end-UML-doc -->
	 * @param connector
	 * @param message
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void messageReceived(NvgConnector connector, Object message) {
		// begin-user-code
		if (!(message instanceof GmpHost)) {
			return;
		}
		GmpHost cgh = (GmpHost) message;

		connector.write(message);

		System.out.printf("%s \n", cgh);
		connector.close(true);
		// end-user-code
	}
}