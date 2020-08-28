/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgGmpProtocolCodecFactory.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.gmp.decoder 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 9, 2016 9:30:03 AM 
 * @version: V1.0   
 */
package com.nvg.mina.gmp.decoder;

import com.nvg.mina.core.decoder.NvgProtocolCodecFactory;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolEncoder;

/** 
 * <!-- begin-UML-doc -->
 * <p>protocol dodec factory of gmp </p>
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 28, 2016 3:11:23 PM 
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class NvgGmpProtocolCodecFactory extends NvgProtocolCodecFactory {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>get gmp decoder</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ProtocolDecoder getDecoder(IoSession session) throws Exception {
		// begin-user-code
		return new NvgGmpDecoder();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>get gmp endoder</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ProtocolEncoder getEncoder(IoSession session) throws Exception {
		// begin-user-code
		return new NvgGmpEncoder();
		// end-user-code
	}
}