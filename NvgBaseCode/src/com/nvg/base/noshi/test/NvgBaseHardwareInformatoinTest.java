   
/**
 * @title : NvgBaseHardwareInformatoinTest.java
 * @package : com.nvg.base.test
 * @discription : TODO在此输入丄1�7句话描述此文件的作用
 * @author : fangzhenmu
 * @created : 2016幄1�7�1�7日下卄1�715:15
 * @version : V1.0  
 * tags
 * see_to_target
 */
    
package com.nvg.base.noshi.test;

import com.nvg.base.noshi.NBNativeHardwareInformation;

/**
 * @title : NvgBaseHardwareInformatoinTest.java
 * @description : TODO(用一句话描述该类型的作用)
 * @author : fangzhenmu
 * @created : 2016幄1�7�1�7日下卄1�715:15
 */

public class NvgBaseHardwareInformatoinTest {

	/**
	 * @discription : TODO在此输入丄1�7句话描述作用
	 * @author : fangzhenmu
	 * @created : 2016幄1�7�1�7日下卄1�715:15
	 * @param args
	 * @throws InterruptedException 
	 */

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		while(true) {
			NBNativeHardwareInformation hi = new NBNativeHardwareInformation();
			
			System.out.printf("OS:%s \r\nCpuLoad: %f \r\nMemoryLoad:%f \r\nDiskLoad:%f \r\n", 
					hi.getOperatingSystemInformation(),
					hi.getNativeCpuUsedLoad(),
					hi.getNativeMemoryUsedLoad(),
					hi.getNativeDiskUsedLoad());
			
			Thread.sleep(5000);
		}
		
	}

}
