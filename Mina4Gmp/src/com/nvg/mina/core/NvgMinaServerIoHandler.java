/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgMinaServerIoHandler.java 
 * @Prject: Mina4Gmp
 * @Package: com.nvg.mina.core 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Feb 27, 2016 5:02:47 PM 
 * @version: V1.0   
 */
package com.nvg.mina.core;

/** 
 * <!-- begin-UML-doc -->
 * <p>Mina的网络IO接口</p>
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Feb 28, 2016 11:43:33 AM 
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class NvgMinaServerIoHandler {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>IoSession Exception Information</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void exceptionCaught(Object session, Object throwable)
			throws Exception {
		// begin-user-code
		///

		///

		///

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void messageReceived(Object session, Object message)
			throws Exception {
		// begin-user-code
		/*
		String str = message.toString();

		System.out.println("鎺ュ彈鍒扮殑娑堟伅:" + str);

		if (str.trim().equalsIgnoreCase("quit")) {
		    session.close(true);
		    return;
		}
		Date date = new Date();
		session.write(date.toString());
		System.out.println("Message written...");
		
		byte[] buf = (byte[])message;
		Gmf gmf = new Gmf();
		gmf.decode(buf, buf.length);
		 */

		/*
		String messageStr = message.toString();
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		String dateStr = format.format(new Date());
		
		logger.info(messageStr + "\t" + dateStr);
		
		Collection<IoSession> sessions = session.getService().getManagedSessions().values();
		for(IoSession tempSession : sessions){
		    tempSession.write(messageStr + "\t" + dateStr);
		}
		 */

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void messageSent(Object session, Object message) throws Exception {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void sessionClosed(Object session) throws Exception {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void sessionCreated(Object session) throws Exception {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void sessionIdle(Object session, Object status) throws Exception {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void sessionOpened(Object session) throws Exception {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}