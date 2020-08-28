/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: NvgGmpBuffer.java 
 * @Prject: Mina4GmpCode
 * @Package: com.nvg.mina.util 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn     
 * @date: Mar 19, 2016 10:17:17 AM 
 * @version: V1.0   
 */
package com.nvg.mina.util;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @ClassName: java 
 * @Description: TODO
 * @author: kitty fangzhenmu@novigo.com.cn
 * @date: Mar 28, 2016 3:11:23 PM 
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class NvgGmpBuffer {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @fieldName: data
	 * @fieldType: byte
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private byte[] data = null;

	/** 
	 * @return the data to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public byte[] getData() {
		// begin-user-code
		return data;
		// end-user-code
	}

	/** 
	 * @param data the data to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setData(byte[] data) {
		// begin-user-code
		this.data = data;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @fieldName: start
	 * @fieldType: int
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int start;

	/** 
	 * @return the start to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getStart() {
		// begin-user-code
		return start;
		// end-user-code
	}

	/** 
	 * @param start the start to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setStart(int start) {
		// begin-user-code
		this.start = start;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @fieldName: pos
	 * @fieldType: int
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int pos;

	/** 
	 * @return the pos to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getPos() {
		// begin-user-code
		return pos;
		// end-user-code
	}

	/** 
	 * @param pos the pos to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setPos(int pos) {
		// begin-user-code
		this.pos = pos;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @fieldName: tail
	 * @fieldType: int
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int tail;

	/** 
	 * @return the tail to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getTail() {
		// begin-user-code
		return tail;
		// end-user-code
	}

	/** 
	 * @param tail the tail to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setTail(int tail) {
		// begin-user-code
		this.tail = tail;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @fieldName: end
	 * @fieldType: int
	 * @Description: TODO
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int end;

	/** 
	 * @return the end to get
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getEnd() {
		// begin-user-code
		return end;
		// end-user-code
	}

	/** 
	 * @param end the end to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setEnd(int end) {
		// begin-user-code
		this.end = end;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @Title :NvgGmpBuffer
	 * @Description :TODO 
	 * @param length 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public NvgGmpBuffer(int length) {
		// begin-user-code
		data = new byte[length];
		start = 0;
		pos = start;
		tail = pos;
		end = start + length;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int cat(byte[] data) {
		// begin-user-code
		int tmpLength = 0;

		if (data.length > (end - tail)) {
			tmpLength = (end - tail);
		} else {
			tmpLength = data.length;
		}

		System.arraycopy(data, 0, this.data, tail, tmpLength);
		tail += tmpLength;

		return tmpLength;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int cat(byte[] data, int pos, int length) {
		// begin-user-code
		int tmpLength = 0;

		if (length > data.length - pos) {
			length = data.length - pos;
		}

		if (length > (end - tail)) {
			tmpLength = (end - tail);
		} else {
			tmpLength = length;
		}

		System.arraycopy(data, pos, this.data, tail, tmpLength);
		tail += tmpLength;

		return tmpLength;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public byte[] getBytes() {
		// begin-user-code
		if (length() <= 0) {
			return null;
		} else {
			byte[] bytes = new byte[length()];

			System.arraycopy(data, pos, bytes, 0, length());
			return bytes;
		}
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int length() {
		// begin-user-code
		return this.data.length;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int size() {
		// begin-user-code
		return (tail - pos);
		// end-user-code
	}
}