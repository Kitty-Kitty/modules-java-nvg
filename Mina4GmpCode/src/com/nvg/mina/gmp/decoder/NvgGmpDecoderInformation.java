/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgGmpDecoderInformation.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.gmp.decoder 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 9, 2016 9:30:03 AM 
 * @version: V1.0   
 */
package com.nvg.mina.gmp.decoder;

import com.gmp.gmph.GmpGmph;
import com.nvg.mina.util.NvgGmpBuffer;
import com.gmp.gmph.defined.GmpGmphEmhtDefined;
import com.nvg.mina.defined.NvgMinaDefined;

import org.apache.mina.core.session.IoSession;

/** 
 * <!-- begin-UML-doc -->
 * <p>gmp decoder information</p>
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 28, 2016 3:11:23 PM 
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class NvgGmpDecoderInformation {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>gmp data length</p>
	 * <!-- end-UML-doc -->
	 * @fieldName: length
	 * @fieldType: int
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int length = 0;

	/** 
	 * @return the length to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getLength() {
		// begin-user-code
		return length;
		// end-user-code
	}

	/** 
	 * @param length the length to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setLength(int length) {
		// begin-user-code
		this.length = length;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>gmp Gmph information</p>
	 * <!-- end-UML-doc -->
	 * @fieldName: gmpGmph
	 * @fieldType: GmpGmph
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private GmpGmph gmpGmph;

	/** 
	 * @return the gmpGmph to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public GmpGmph getGmpGmph() {
		// begin-user-code
		return gmpGmph;
		// end-user-code
	}

	/** 
	 * @param gmpGmph the gmpGmph to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setGmpGmph(GmpGmph gmpGmph) {
		// begin-user-code
		this.gmpGmph = gmpGmph;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @fieldName: bmhBuffer
	 * @fieldType: byte
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private byte[] bmhBuffer = new byte[GmpGmphEmhtDefined.GMP_GMPH_EMHT_NEMH
			.getLength()];

	/** 
	 * @return the bmhBuffer to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public byte[] getBmhBuffer() {
		// begin-user-code
		return bmhBuffer;
		// end-user-code
	}

	/** 
	 * @param bmhBuffer the bmhBuffer to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setBmhBuffer(byte[] bmhBuffer) {
		// begin-user-code
		this.bmhBuffer = bmhBuffer;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>receive data</p>
	 * <!-- end-UML-doc -->
	 * @fieldName: gmpBuffer
	 * @fieldType: NvgGmpBuffer
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private NvgGmpBuffer gmpBuffer;

	/** 
	 * @return the gmpBuffer to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public NvgGmpBuffer getGmpBuffer() {
		// begin-user-code
		return gmpBuffer;
		// end-user-code
	}

	/** 
	 * @param gmpBuffer the gmpBuffer to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setGmpBuffer(NvgGmpBuffer gmpBuffer) {
		// begin-user-code
		this.gmpBuffer = gmpBuffer;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @fieldName: rsType
	 * @fieldType: NvgGmpReceiveAndSendType
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private NvgGmpReceiveAndSendType rsType = NvgGmpReceiveAndSendType.NVG_GMP_RECEIVE_AND_SEND_TYPE_SEND;

	/** 
	 * @return the rsType to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public NvgGmpReceiveAndSendType getRsType() {
		// begin-user-code
		return rsType;
		// end-user-code
	}

	/** 
	 * @param rsType the rsType to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setRsType(NvgGmpReceiveAndSendType rsType) {
		// begin-user-code
		this.rsType = rsType;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>get gmp decoder information</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static void set(IoSession session, NvgGmpDecoderInformation ngdi) {
		// begin-user-code
		session.setAttribute(
				NvgMinaDefined.NVG_MINA_DEFINED_DECODER_INFORMATION, ngdi);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>change byte array to hex string</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String toHexString(byte[] src, int pos, int length) {
		// begin-user-code
		String tmpSumHex = " ";
		if (null != src) {
			if (pos >= 0 && pos < length) {
				for (int i = pos; i < src.length && (i - pos) < length; i++) {
					if (i == pos) {
						tmpSumHex += String.format("0x%X", src[i]);
					} else {
						tmpSumHex += String.format(" 0x%X", src[i]);
					}
				}
			}
		}
		return tmpSumHex;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>get gmp decoder information</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static NvgGmpDecoderInformation get(IoSession session) {
		// begin-user-code
		NvgGmpDecoderInformation ngdi = null;
		/**
		 * get decoder information
		 */
		ngdi = (NvgGmpDecoderInformation) session
				.getAttribute(NvgMinaDefined.NVG_MINA_DEFINED_DECODER_INFORMATION);
		if (null == ngdi) {
			//if null,create new decoder information
			ngdi = new NvgGmpDecoderInformation();
			NvgGmpDecoderInformation.set(session, ngdi);
		}
		return ngdi;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>change bmh byte array to hex string</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public final String bmh2HexString() {
		// begin-user-code
		return this.toHexString(this.bmhBuffer, 0, this.bmhBuffer.length);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>change gmp byte array to hex string</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public final String gmp2HexString() {
		// begin-user-code
		//if defined gmph
		if (null == this.gmpGmph || null == this.gmpBuffer) {
			return this.bmh2HexString();
		}
		int tmpLength = gmpGmph.length();
		if (tmpLength > this.gmpBuffer.size()) {
			return this.toHexString(this.gmpBuffer.getBytes(),
					this.gmpBuffer.getPos(), this.gmpBuffer.size());
		}
		return this.toHexString(this.gmpBuffer.getBytes(),
				this.gmpBuffer.getPos(), tmpLength);
		// end-user-code
	}
}