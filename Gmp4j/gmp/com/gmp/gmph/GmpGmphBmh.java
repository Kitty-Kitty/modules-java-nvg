/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmpBmh.java 
 * @Prject: GmfPraser
 * @Package: com.gmp.gmph 
 * @Description: Base Message Header
 * @author: kitty   
 * @date: 2016年2月20日 下午9:34:32 
 * @version: V0.1.0   
 */
package com.gmp.gmph;


import com.gmp.gmph.defined.GmpGmphDefined;
import com.gmp.gmph.defined.GmpGmphEmhtDefined;
import com.gmp.gmph.defined.GmpGmphLand;
import com.gmp.gmph.print.GmpGmphErrorDefined;
import com.gmp.gmph.print.GmpGmphWriteLog;
import com.gmp.gmph.util.GmpGmphByteUtil;

/** 
 * @ClassName: GmpBmh 
 * @Description: Base Message Header
 * @author: kitty
 * @date: 2016年2月20日 下午9:34:32  
 */
public abstract class GmpGmphBmh implements GmpGmph {
	/**
	 * @fieldName: gmpv
	 * @fieldType: int
	 * @Description: General Message Protocol Version
	 */
	int			gmpv = GmpGmphDefined.GMP_GMPH_VERSION;
	/**
	 * @fieldName: emht
	 * @fieldType: byte
	 * @Description: Extend Message Header Type
	 */
	byte 		emht = (byte) GmpGmphEmhtDefined.GMP_GMPH_EMHT_NEMH.getEmht();
	
	
	
	/**
	 * @return the gmpv
	 */
	public int getGmpv() {
		return gmpv;
	}
	/**
	 * @param gmpv the gmpv to set
	 */
	public void setGmpv(int gmpv) {
		this.gmpv = gmpv;
	}
	/**
	 * @return the emht
	 */
	public byte getEmht() {
		return emht;
	}
	/**
	 * @param emht the emht to set
	 */
	public void setEmht(byte emht) {
		this.emht = emht;
	}
	
	/**
	 * @Title: println
	 * @Description: print Gmp Gmph log information
	 * @param code log level number
	 * @param format format string
	 * @param args arguments
	 */
	public final void println(int code, String format, Object... args) {
		if (GmpGmphErrorDefined.GMP_GMPH_DEBUG_INFORMATION) {
			String tmpFormat = GmpGmphWriteLog.format("%s.%s() ", 
					this.getClass().getName(), 
					Thread.currentThread().getStackTrace()[2].getMethodName());
			GmpGmphWriteLog.println(code, tmpFormat + format, args);
		}
	}

	@Override
	public boolean check(byte[] data, int pos, int length) {
		int					tmpGmphVersion = 0;
		int					tmpGmphEmht = 0;
		int					tmpEmhtLength = 0;
		
		
		/**
		 * check data length error
		 */
		if (length - pos < GmpGmphEmhtDefined.GMP_GMPH_EMHT_NEMH.getLength()) {
			this.println(GmpGmphErrorDefined.GMP_GMPH_ERROR_CRITICAL, "%s size[%d] < [%d]", 
					GmpGmphErrorDefined.GmpGmphErrorInformation.GMP_GMPH_ERROR_STRING_LENGTH.getErr(),
					length - pos,
					GmpGmphEmhtDefined.GMP_GMPH_EMHT_NEMH.getLength());
			
			return false;
		}
		/**
		 * check version
		 */
		tmpGmphVersion = GmpGmphByteUtil.getInt(data, pos);
		if (GmpGmphDefined.GMP_GMPH_VERSION != tmpGmphVersion) {
			this.println(GmpGmphErrorDefined.GMP_GMPH_ERROR_CRITICAL, "%s unknow version[%d]", 
					GmpGmphErrorDefined.GmpGmphErrorInformation.GMP_GMPH_ERROR_STRING_VERSION.getErr(),
					tmpGmphVersion);
			
			return false;
		}
		/**
		 * check emht
		 */
		tmpGmphEmht = GmpGmphByteUtil.getByteInt(data, pos + GmpGmphLand.GMP_GMPH_STD_INT);
		if (!GmpGmphEmhtDefined.contains(tmpGmphEmht)) {
			this.println(GmpGmphErrorDefined.GMP_GMPH_ERROR_CRITICAL, "%s unknow emth[%d]", 
					GmpGmphErrorDefined.GmpGmphErrorInformation.GMP_GMPH_ERROR_STRING_EMHT.getErr(),
					tmpGmphEmht);
			
			return false;
		}
		/**
		 * check header data length
		 */
		//tmpEmhtLength = GmpGmphEmhtDefined.length(tmpGmphEmht);
		tmpEmhtLength = length();
		if (length - pos < tmpEmhtLength) {
			this.println(GmpGmphErrorDefined.GMP_GMPH_ERROR_CRITICAL, "%s emth[%d] size[%d] < [%d]", 
					GmpGmphErrorDefined.GmpGmphErrorInformation.GMP_GMPH_ERROR_STRING_LENGTH.getErr(),
					tmpGmphEmht,
					length - pos,
					tmpEmhtLength);
			
			return false;
		}
		
		this.gmpv = tmpGmphVersion;
		this.emht = (byte)tmpGmphEmht;
		
		return true;
	}

	@Override
	public int begin(byte[] data, int pos, int length) {
		return GmpGmphEmhtDefined.GMP_GMPH_EMHT_NEMH.getLength();
	}

	@Override
	public int decode(byte[] data) {
		return decode(data, 0, data.length);
	}

	@Override
	public int decode(byte[] data, int pos) {
		int				retInt = 0;
		int				tmpPos = 0;

		
		/**
		 * check data
		 */
		if (!this.check(data, pos, data.length)) {
			return -1;
		}
		/**
		 * begin decode data
 		 */
		retInt = this.begin(data, pos, data.length);
		if (retInt < 0) {
			return retInt;
		}
		tmpPos += retInt;
		
		retInt = decode(data, tmpPos, data.length);
		if (retInt < 0) {
			return retInt;
		}
		tmpPos += retInt;
		/**
		 * end decode data
 		 */
		retInt = this.end(data, tmpPos, data.length);
		if (retInt < 0) {
			return retInt;
		}
		tmpPos += retInt;
		
		return (tmpPos - pos);
	}
	
	@Override
	public int end(byte[] data, int pos, int length) {
		return 0;
	}

	@Override
	public byte[] encode() {
		int 			retInt = 0;
		int				tmpPos = 0;
		int				tmpLength = 0;
		
		
		/**
		 * check length
		 */
		tmpLength = length();
		if (tmpLength <= GmpGmphEmhtDefined.GMP_GMPH_EMHT_NEMH.getLength()) {
			this.println(GmpGmphErrorDefined.GMP_GMPH_ERROR_CRITICAL, "%s length[%d]", 
					GmpGmphErrorDefined.GmpGmphErrorInformation.GMP_GMPH_ERROR_STRING_LENGTH.getErr(),
					length());
			
			return null;
		}
		/**
		 * create byte[]
		 */
		byte[]			dest = new byte[tmpLength];
		/**
		 * encode gmph version
		 */
		retInt = GmpGmphByteUtil.getBytes(this.gmpv, dest, tmpPos, dest.length);
		if (retInt < 0) {
			this.println(GmpGmphErrorDefined.GMP_GMPH_ERROR_CRITICAL, "%s .encode gmpv error", 
					GmpGmphErrorDefined.GmpGmphErrorInformation.GMP_GMPH_ERROR_STRING_ENCODE.getErr());
			
			return null;
		}
		tmpPos += GmpGmphLand.GMP_GMPH_STD_INT;
		/**
		 * encode gmph emht
		 */
		dest[tmpPos++] = this.emht;
		/**
		 * encode emh data
		 */
		retInt = encode(dest, tmpPos, tmpLength);
		if (retInt < 0) {
			this.println(GmpGmphErrorDefined.GMP_GMPH_ERROR_CRITICAL, "%s .encode emh error", 
					GmpGmphErrorDefined.GmpGmphErrorInformation.GMP_GMPH_ERROR_STRING_ENCODE.getErr());
			
			return null;
		}	
		return dest;
	}
}
