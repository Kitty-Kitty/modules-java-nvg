/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgGmpEncoder.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.gmp.decoder 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 9, 2016 9:30:04 AM 
 * @version: V1.0   
 */
package com.nvg.mina.gmp.decoder;

import com.nvg.mina.core.decoder.NvgEncoder;
import com.nvg.mina.core.NvgMinaServerLogger;
import com.nvg.mina.core.NvgMinaServerLoggerFactory;

import com.gmf.core.serializer.base.GmfSerializerConfigure;
import com.gmp.gmph.GmpGmph;
import com.gmp.gmph.GmpGmphSemh;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;

/** 
 * <!-- begin-UML-doc -->
 * <p>gmp encoder</p>
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 28, 2016 3:11:23 PM 
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class NvgGmpEncoder extends NvgEncoder {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>the logger of this class</p>
	 * <!-- end-UML-doc -->
	 * @fieldName: logger
	 * @fieldType: NvgMinaServerLogger
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private static NvgMinaServerLogger logger = NvgMinaServerLoggerFactory
			.getLogger(NvgGmpEncoder.class);

	/** 
	 * @return the logger to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static NvgMinaServerLogger getLogger() {
		// begin-user-code
		return logger;
		// end-user-code
	}

	/** 
	 * @param logger the logger to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static void setLogger(NvgMinaServerLogger logger) {
		// begin-user-code
		NvgGmpEncoder.logger = logger;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void dispose(IoSession arg0) throws Exception {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void encode(IoSession session, Object message,
			ProtocolEncoderOutput output) throws Exception {
		// begin-user-code
		/**
		 * encode gmph
		 */
		//get gmph
		NvgGmpDecoderInformation ngdi = NvgGmpDecoderInformation.get(session);
		GmpGmph gmpGmph = ngdi.getGmpGmph();
		if (null == gmpGmph) {
			//gmp gmph is null error
			NvgGmpEncoder.logger.error(session, null,
					"encode send data error. get gmpGmph error");
			return;
		}
		/**
		 * serializer gmf
		 */
		GmfSerializerConfigure gsc = new GmfSerializerConfigure();
		byte[] gmfBytes = gsc.getGmfBytes(message);
		if (null == gmfBytes) {
			//serializer gmf error
			NvgGmpEncoder.logger.error(session, null,
					"encode send data error. encode gmf data error.");
			return;
		}
		//update semh command and data length
		if (gmpGmph instanceof GmpGmphSemh) {
			GmpGmphSemh ggs = (GmpGmphSemh) gmpGmph;
			if (NvgGmpReceiveAndSendType.NVG_GMP_RECEIVE_AND_SEND_TYPE_RECEIVE == ngdi
					.getRsType()) {
				int tmpCommand = ggs.getCommand();
				if (0 == tmpCommand % 2) {
					ggs.setCommand(++tmpCommand);
				}
			}
			ggs.setLength(gmfBytes.length);
		} else {
			NvgGmpEncoder.logger.warn(session, null,
					"encode send data warning. gmpGmph not Semh.");
		}
		//encode gmph
		byte[] gmpGmphBytes = gmpGmph.encode();
		if (null == gmpGmphBytes) {
			//gmp gmph encode error
			NvgGmpEncoder.logger.error(session, null,
					"encode send data error. encode gmpGmph data error.");
			return;
		}

		/**
		 * make send data
		 */
		int tmpLength = gmpGmphBytes.length + gmfBytes.length;
		IoBuffer buffer = IoBuffer.allocate(tmpLength);
		buffer.capacity(tmpLength);
		buffer.put(gmpGmphBytes);
		buffer.put(gmfBytes);
		/**
		 * send bytes
		 */
		buffer.flip();
		output.write(buffer);

		NvgGmpEncoder.logger.info(session, null, "send gmp data.\r\n%s\r\n%s",
				gmpGmph.toPrintString(), gsc.getGmf().toPrintAllPrittyString());
		// end-user-code
	}
}