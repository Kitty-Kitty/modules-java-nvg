/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgGmpDecoder.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.gmp.decoder 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 9, 2016 9:30:04 AM 
 * @version: V1.0   
 */
package com.nvg.mina.gmp.decoder;

import com.nvg.mina.core.decoder.NvgDecoder;
import com.nvg.mina.core.NvgMinaServerLogger;
import com.nvg.mina.core.NvgMinaServerLoggerFactory;
import com.nvg.mina.util.NvgGmpBuffer;

import com.gmp.gmph.GmpGmph;
import com.gmp.gmph.GmpGmphManager;
import com.gmp.gmph.defined.GmpGmphEmhtDefined;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;

/** 
 * <!-- begin-UML-doc -->
 * <p>gmp decoder </p>
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 28, 2016 3:11:23 PM 
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class NvgGmpDecoder extends NvgDecoder {
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
			.getLogger(NvgGmpDecoder.class);

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
		NvgGmpDecoder.logger = logger;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean doDecode(IoSession session, IoBuffer in,
			ProtocolDecoderOutput output) throws Exception {
		// begin-user-code
		NvgGmpDecoderInformation ngdi = null;
		boolean retBoolean = false;
		/**
		 * get decoder information
		 */
		ngdi = NvgGmpDecoderInformation.get(session);
		if (null == ngdi) {
			session.close(true);
			logger.error(session, null, "get gmp decoder information error");
			return false;
		} else {
			//if null,create new decoder information
			ngdi.setRsType(NvgGmpReceiveAndSendType.NVG_GMP_RECEIVE_AND_SEND_TYPE_RECEIVE);
		}
		/**
		 * cycle process gmp data
		 */
		retBoolean = cycleProcessGmpData(session, in, output, ngdi);
		if (!retBoolean) {
			in.position(in.limit());
			session.close(true);
			logger.error(session, null, "cycleProcessGmpData() error");
		}
		return false;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static boolean getGmphInformation(IoSession session, IoBuffer in,
			ProtocolDecoderOutput output, NvgGmpDecoderInformation ngdi) {
		// begin-user-code
		int length = 0;
		/**
		 * process gmph data
		 */
		if (ngdi.getLength() <= 0) {
			if (in.remaining() < GmpGmphEmhtDefined.GMP_GMPH_EMHT_NEMH
					.getLength()) {
				//receive data not long
				return false;
			}
			in.mark();
			in.get(ngdi.getBmhBuffer(), 0,
					GmpGmphEmhtDefined.GMP_GMPH_EMHT_NEMH.getLength());
			try {
				length = GmpGmphManager.getGmphLength(ngdi.getBmhBuffer(), 0);
			} catch (IllegalArgumentException e) {
				//receive gmph length exception
				logger.error(session, e,
						"get gmp length[%d] exception. data[%s]", length,
						ngdi.bmh2HexString());
				return false;
			}
			if (length <= 0) {
				//receive not gmp data
				logger.error(session, null,
						"get gmp length[%d] error. data[%s]", length,
						ngdi.bmh2HexString());
				return false;
			}

			if (in.remaining() >= length) {
				byte[] gmpData = new byte[length];
				GmpGmph gmpGmph = null;
				//get data
				in.reset();
				in.get(gmpData, 0, length);
				//decode data
				try {
					gmpGmph = GmpGmphManager.decode(gmpData, 0);
				} catch (IllegalArgumentException e) {
					logger.error(session, null,
							"decode gmp data exception. length[%d] data[%s]",
							length, ngdi.toHexString(gmpData, 0, length));
					return false;
				}
				//decode gmp gmph error
				if (null == gmpGmph) {
					//decode data error
					logger.error(
							session,
							null,
							"decode gmp data error. gmph is null error. length[%d] data[%s]",
							length, ngdi.toHexString(gmpData, 0, length));
					return false;
				}
				//set gmph
				ngdi.setGmpGmph(gmpGmph);
				//set gmp data
				ngdi.setLength(length + gmpGmph.size());
				//create gmp buffer
				ngdi.setGmpBuffer(new NvgGmpBuffer(ngdi.getLength()));
				//input gmph data
				ngdi.getGmpBuffer().cat(gmpData);
				return true;
			}
		}
		return false;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static boolean cycleProcessGmpData(IoSession session, IoBuffer in,
			ProtocolDecoderOutput output, NvgGmpDecoderInformation ngdi) {
		// begin-user-code
		int length = 0;
		boolean retBoolean = false;
		/**
		 * process gmp data
		 */
		length = ngdi.getLength();
		if (length <= 0) {
			retBoolean = getGmphInformation(session, in, output, ngdi);
			if (!retBoolean) {
				//if get gmph information error
				return false;
			}
			//data missing
			if (ngdi.getLength() <= 0) {
				return true;
			}
		}
		/**
		 * get gmp body size
		 */
		length = ngdi.getLength();
		NvgGmpBuffer tmpNgb = ngdi.getGmpBuffer();
		if (length > 0 && in.remaining() > 0 && null != tmpNgb) {
			//clac last data length
			int tmpLastLength = length - tmpNgb.size();
			//clac readLength
			int tmpReadLength = tmpLastLength > in.remaining() ? in.remaining()
					: tmpLastLength;
			//get data
			in.get(tmpNgb.getData(), tmpNgb.getTail(), tmpReadLength);
			//write gmpData
			output.write(tmpNgb.getData());
			//in.compact();
			return true;
		}
		return false;
		// end-user-code
	}
}