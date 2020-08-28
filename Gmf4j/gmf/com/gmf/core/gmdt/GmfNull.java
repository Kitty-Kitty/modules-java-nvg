/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmfLong.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.core.gmdt 
 * @Description: gmf null type
 * @author: kitty   
 * @date: 2016年1月16日 下午4:10:18 
 * @version: V0.1.0   
 */
package com.gmf.core.gmdt;

import com.gmf.core.Gmf;
import com.gmf.core.gmdt.base.GmfElement;
import com.gmf.defined.GmfElementPrintFormat;
import com.gmf.defined.GmfGmdtLength;
import com.gmf.print.GmfWriteLog;

/**
 * @ClassName: GmfNull
 * @Description: class of GmfNull
 * @author: kitty
 * @date: 2016年1月28日 下午4:28:04
 */
public class GmfNull extends GmfElement {
	public GmfNull() {
		this.gmdt.setName("N");
		this.gmdt.setMinLength(GmfGmdtLength.GMF_GMDT_LENGTH_N);
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public int size() {
		return this.gmdt.getMinLength();
	}
	@Override
	public int getEncodeLength() {
		return this.gmdt.getMinLength();
	}
	@Override
	public String toString(int format) {
		String retString = "";
		switch (format) {
			case GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_VALUE_ONLY:
			case GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_ONLY: {
				retString = GmfWriteLog.format("Null");
			}
				break;
			case GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_VALUE_PRITTY:
			case GmfElementPrintFormat.GMF_ELEMENT_PRINT_FORMAT_ALL_VALUE_PRITTY: {
				retString = GmfWriteLog.format("(%s)Null", this.gmdt.getName());
			}
				break;
			default: {
				retString = "(N)null";
			}
		}
		return retString;
	}
	@Override
	public int decode(Gmf gmf, byte[] data, int pos, int length) {
		return this.gmdt.getMinLength();
	}
	@Override
	public byte[] encode(Gmf gmf) {
		return null;
	}
	@Override
	public int encode(Gmf gmf, byte[] dest, int pos, int length) {
		int tmpPos = pos;
		dest[tmpPos++] = (byte) this.gmdt.getFlag();
		return (tmpPos - pos);
	}
	@Override
	public boolean format(Object... args) {
		return true;
	}
	@Override
	public Object getObjectValue() {
		return null;
	}
}
