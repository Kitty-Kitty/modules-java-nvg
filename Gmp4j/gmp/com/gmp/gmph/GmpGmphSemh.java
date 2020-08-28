/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: GmpGmphEmhtSemh.java 
 * @Prject: GmfPraser
 * @Package: com.gmp.gmph.emht 
 * @Description: Session Extend Message Header File
 * @author: kitty   
 * @date: 2016年2月20日 下午9:38:17 
 * @version: V0.1.0   
 */
package com.gmp.gmph;

import com.gmp.gmph.defined.GmpGmphDefined;
import com.gmp.gmph.defined.GmpGmphEmhtDefined;
import com.gmp.gmph.defined.GmpGmphLand;
import com.gmp.gmph.print.GmpGmphErrorDefined;
import com.gmp.gmph.util.GmpGmphByteUtil;


/** 
 * @ClassName: GmpGmphEmhtSemh 
 * @Description: Session Extend Message Header
 * @author: kitty
 * @date: 2016年2月20日 下午9:38:17  
 */
public class GmpGmphSemh extends GmpGmphBmh {
	/**
	 * @fieldName: command
	 * @fieldType: int
	 * @Description: command of Session Extend Message Header
	 */
	int			command = 0;
	/**
	 * @fieldName: length
	 * @fieldType: int
	 * @Description: data length of Session Extend Message Header
	 */
	int			length = 0;
	/**
	 * @fieldName: packetNO
	 * @fieldType: int
	 * @Description: data packet number of Session Extend Message Header
	 */
	int			packetNO = 0;
	/**
	 * @fieldName: status
	 * @fieldType: int
	 * @Description: command status of Session Extend Message Header
	 */
	int			status = 0;
	/**
	 * @fieldName: sessionID
	 * @fieldType: String
	 * @Description: command session id of Session Extend Message Header
	 */
	String		sessionID = "";
	
	
	GmpGmphSemh() {
		emht = (byte) GmpGmphEmhtDefined.GMP_GMPH_EMHT_SEMH.getEmht();
	}
	
	
	/**
	 * @return the command
	 */
	public int getCommand() {
		return command;
	}
	/**
	 * @param command the command to set
	 */
	public void setCommand(int command) {
		this.command = command;
	}
	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
	/**
	 * @return the packetNO
	 */
	public int getPacketNO() {
		return packetNO;
	}
	/**
	 * @param packetNO the packetNO to set
	 */
	public void setPacketNO(int packetNO) {
		this.packetNO = packetNO;
	}
	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	/**
	 * @return the sessionID
	 */
	public String getSessionID() {
		return sessionID;
	}
	/**
	 * @param sessionID the sessionID to set
	 */
	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}


	@Override
	public int length() {
		return GmpGmphEmhtDefined.GMP_GMPH_EMHT_SEMH.getLength();
	}

	
	@Override
	public int size() {
		return this.getLength();
	}


	@Override
	public int decode(byte[] data, int pos, int length) {
		int				tmpPos = pos;

		

		this.command = GmpGmphByteUtil.getInt(data, tmpPos);
		tmpPos += GmpGmphLand.GMP_GMPH_STD_INT;
		this.length = GmpGmphByteUtil.getInt(data, tmpPos);
		tmpPos += GmpGmphLand.GMP_GMPH_STD_INT;
		this.packetNO = GmpGmphByteUtil.getInt(data, tmpPos);
		tmpPos += GmpGmphLand.GMP_GMPH_STD_INT;
		this.status = GmpGmphByteUtil.getInt(data, tmpPos);
		tmpPos += GmpGmphLand.GMP_GMPH_STD_INT;
		
		byte[] session = new byte[GmpGmphDefined.GMP_GMPH_SEMH_SESSION_LENGTH];
		System.arraycopy(data, tmpPos, session, 0, GmpGmphDefined.GMP_GMPH_SEMH_SESSION_LENGTH);
		this.sessionID = new String(session);
		tmpPos += GmpGmphDefined.GMP_GMPH_SEMH_SESSION_LENGTH;
		
		return (tmpPos - pos);
	}


	@Override
	public int encode(byte[] dest, int pos, int length) {
		int 			retInt = 0;
		int				tmpPos = pos;
		
		
		
		/**
		 * encode semh command
		 */
		retInt = GmpGmphByteUtil.getBytes(this.command, dest, tmpPos, length);
		if (retInt < 0) {
			this.println(GmpGmphErrorDefined.GMP_GMPH_ERROR_CRITICAL, "%s .encode command error", 
					GmpGmphErrorDefined.GmpGmphErrorInformation.GMP_GMPH_ERROR_STRING_ENCODE.getErr());
			
			return -1;
		}
		tmpPos += GmpGmphLand.GMP_GMPH_STD_INT;
		/**
		 * encode semh length
		 */
		retInt = GmpGmphByteUtil.getBytes(this.length, dest, tmpPos, length);
		if (retInt < 0) {
			this.println(GmpGmphErrorDefined.GMP_GMPH_ERROR_CRITICAL, "%s .encode length error", 
					GmpGmphErrorDefined.GmpGmphErrorInformation.GMP_GMPH_ERROR_STRING_ENCODE.getErr());
			
			return -1;
		}
		tmpPos += GmpGmphLand.GMP_GMPH_STD_INT;
		/**
		 * encode semh packetNO
		 */
		retInt = GmpGmphByteUtil.getBytes(this.packetNO, dest, tmpPos, length);
		if (retInt < 0) {
			this.println(GmpGmphErrorDefined.GMP_GMPH_ERROR_CRITICAL, "%s .encode packetNO error", 
					GmpGmphErrorDefined.GmpGmphErrorInformation.GMP_GMPH_ERROR_STRING_ENCODE.getErr());
			
			return -1;
		}
		tmpPos += GmpGmphLand.GMP_GMPH_STD_INT;
		/**
		 * encode semh status
		 */
		retInt = GmpGmphByteUtil.getBytes(this.status, dest, tmpPos, length);
		if (retInt < 0) {
			this.println(GmpGmphErrorDefined.GMP_GMPH_ERROR_CRITICAL, "%s .encode status error", 
					GmpGmphErrorDefined.GmpGmphErrorInformation.GMP_GMPH_ERROR_STRING_ENCODE.getErr());
			
			return -1;
		}
		tmpPos += GmpGmphLand.GMP_GMPH_STD_INT;
		/**
		 * encode semh session id
		 */
		byte[] tmpString = this.sessionID.getBytes();
		System.arraycopy(tmpString, 0, dest, tmpPos, this.sessionID.length());
		tmpPos += this.sessionID.length();
		
		return (tmpPos - pos);
	}
}
