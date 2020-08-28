   
/**
 * @title : NvgBaseHardwareInformatoinTest.java
 * @package : com.nvg.base.test
 * @discription : TODO鍦ㄦ杈撳叆涓�鍙ヨ瘽鎻忚堪姝ゆ枃浠剁殑浣滅敤
 * @author : fangzhenmu
 * @created : 2016骞��鏃ヤ笅鍗�15:15
 * @version : V1.0  
 * tags
 * see_to_target
 */
    
package com.nvg.base.noshi.test;

import com.nvg.base.noshi.NBNativeHardwareInformation;

/**
 * @title : NvgBaseHardwareInformatoinTest.java
 * @description : TODO(鐢ㄤ竴鍙ヨ瘽鎻忚堪璇ョ被鍨嬬殑浣滅敤)
 * @author : fangzhenmu
 * @created : 2016骞��鏃ヤ笅鍗�15:15
 */

public class NvgBaseHardwareInformatoinTest {

	/**
	 * @discription : TODO鍦ㄦ杈撳叆涓�鍙ヨ瘽鎻忚堪浣滅敤
	 * @author : fangzhenmu
	 * @created : 2016骞��鏃ヤ笅鍗�15:15
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
