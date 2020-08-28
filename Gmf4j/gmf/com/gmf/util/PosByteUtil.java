/**
 * 
 */
package com.gmf.util;

import java.io.UnsupportedEncodingException;

/**
 * @author kitty
 *
 */
public class PosByteUtil {
	public static byte[] getBytes(char data) {
		byte[] bytes = new byte[2];
		bytes[0] = (byte) (data);
		bytes[1] = (byte) (data >> 8);
		return bytes;
	}

	public static byte[] getBytes(short data) {
		byte[] bytes = new byte[2];
		bytes[0] = (byte) (data & 0xff);
		bytes[1] = (byte) ((data & 0xff00) >> 8);
		return bytes;
	}

	public static byte[] getBytes(int data) {
		byte[] bytes = new byte[4];
		bytes[0] = (byte) (data & 0xff);
		bytes[1] = (byte) ((data & 0xff00) >> 8);
		bytes[2] = (byte) ((data & 0xff0000) >> 16);
		bytes[3] = (byte) ((data & 0xff000000) >> 24);
		return bytes;
	}

	public static byte[] getBytes(long data) {
		byte[] bytes = new byte[8];
		bytes[0] = (byte) (data & 0xff);
		bytes[1] = (byte) ((data >> 8) & 0xff);
		bytes[2] = (byte) ((data >> 16) & 0xff);
		bytes[3] = (byte) ((data >> 24) & 0xff);
		bytes[4] = (byte) ((data >> 32) & 0xff);
		bytes[5] = (byte) ((data >> 40) & 0xff);
		bytes[6] = (byte) ((data >> 48) & 0xff);
		bytes[7] = (byte) ((data >> 56) & 0xff);
		return bytes;
	}

	public static byte[] getBytes(float data) {
		int intBits = Float.floatToIntBits(data);
		return getBytes(intBits);
	}

	public static byte[] getBytes(double data) {
		long intBits = Double.doubleToLongBits(data);
		return getBytes(intBits);
	}

	public static char getChar(byte[] bytes, int pos, int length) {
		if (length - pos < 2) {
			return 0;
		}
		
		return (char) ((0xff & bytes[pos]) | (0xff00 & (bytes[pos + 1] << 8)));
	}

	public static short getShort(byte[] bytes, int pos, int length) {
		if (length - pos < 2) {
			return 0;
		}
		
		return (short) ((0xff & bytes[pos]) | (0xff00 & (bytes[pos + 1] << 8)));
	}

	public static int getByteInt(byte[] bytes, int pos, int length) {
		if (length - pos < 1) {
			return 0;
		}
		return (0x000000ff & bytes[pos]);
	}
	
	public static int getByteInt(byte b) {
		return (0x000000ff & b);
	}
	
	public static int getInt(byte[] bytes, int pos, int length) {
		if (length - pos < 4) {
			return 0;
		}
		
		return (0xff & bytes[pos]) | (0xff00 & (bytes[pos + 1] << 8))
				| (0xff0000 & (bytes[pos + 2] << 16))
				| (0xff000000 & (bytes[pos + 3] << 24));
	}

	public static long getLong(byte[] bytes, int pos, int length) {
		if (length - pos < 8) {
			return 0;
		}
		return (0xffL & (long) bytes[pos]) | (0xff00L & ((long) bytes[pos + 1] << 8))
				| (0xff0000L & ((long) bytes[pos + 2] << 16))
				| (0xff000000L & ((long) bytes[pos + 3] << 24))
				| (0xff00000000L & ((long) bytes[pos + 4] << 32))
				| (0xff0000000000L & ((long) bytes[pos + 5] << 40))
				| (0xff000000000000L & ((long) bytes[pos + 6] << 48))
				| (0xff00000000000000L & ((long) bytes[pos + 7] << 56));
	}

	public static float getFloat(byte[] bytes, int pos, int length) {
		return Float.intBitsToFloat(getInt(bytes, pos, length));
	}

	public static double getDouble(byte[] bytes, int pos, int length) {
		long l = getLong(bytes, pos, length);
		//System.out.println(l);
		return Double.longBitsToDouble(l);
	}

	public static byte[] subBytes(byte[] src, int pos, int index, int count) {
		int		tmpPos = pos + index;
		byte[] b = new byte[count];
		
		
		for (int i = tmpPos; i < tmpPos + count; i++) {
			b[i - tmpPos] = src[i];
		}
			
		return b;
	}
	
	public static String subBytesToString(byte[] src, int pos, int index, int count, String encode) {
		int		tmpPos = pos + index;
		byte[] 	b = new byte[count];
		String	retString = null;
		
		
		for (int i = tmpPos; i < tmpPos + count; i++) {
			b[i - tmpPos] = src[i];
		}
			
		//return String.valueOf(b);
		try {
			retString = new String(b, encode);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return retString;
	}
	
	/** 
	 * @Title: printHexString 
	 * @Description: TODO
	 * @param src
	 */
	public static void printHex(byte[] src) {
		for (int i = 0; i < src.length; i++)
        {
            String hex = Integer.toHexString(src[i] & 0xFF);
            if (hex.length() == 1)
            {
                hex = '0' + hex;
            }
            System.out.print(hex.toUpperCase() + " ");
        }
		
        System.out.println("");
	}
	
	/** 
	 * @Title: printHexString 
	 * @Description: TODO
	 * @param src
	 */
	public static void printHexln(byte[] src) {
		for (int i = 0; i < src.length; i++)
        {
            String hex = Integer.toHexString(src[i] & 0xFF);
            if (hex.length() == 1)
            {
                hex = '0' + hex;
            }
            System.out.print(hex.toUpperCase() + "\n");
        }
	}
}
