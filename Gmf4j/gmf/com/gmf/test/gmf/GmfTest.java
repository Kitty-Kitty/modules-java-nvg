package com.gmf.test.gmf;

import com.gmf.core.Gmf;

/** 
 * @ClassName: GmfTest 
 * @Description: TODO
 * @author: kitty
 * @date: 2016年1月28日 上午11:59:51  
 */
public class GmfTest {
	
	/** 
	 * @Title: decode 
	 * @Description: TODO
	 * @param data
	 * @param length
	 * @return
	 */
	public boolean decode(byte[] data) {
		Gmf gmf = new Gmf();
		int	len = 0;
		
		
		
    	len = gmf.decode(data);
		if (len < 0) {
			System.out.println(
					String.format("input data length[%d]. gmf parse failed. reason:%s", 
							data.length,
							gmf.getGmfError().getErr()));
		} else {
			System.out.println(
					String.format("input data length[%d]. used length[%d]. gmf parse successed.\n\n\n %s", 
							data.length,
							len, 
							gmf.toPrintAllPrittyString()));
		}
		
        return true;
	}
}
