/**   
 * Copyright © 2016 Novigo. All rights reserved.
 * 
 * @Title: TestReflection.java 
 * @Prject: GmfPraser
 * @Package: com.gmf.test.reflection 
 * @Description: TODO
 * @author: kitty   
 * @date: 2016年1月14日 上午9:58:28 
 * @version: V0.1.0   
 */
package com.gmf.test.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Date;

/**
 * @ClassName: TestReflection
 * @Description: TODO
 * @author: kitty
 * @date: 2016年1月14日 上午9:58:28
 */
public class TestReflection {
	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 */
	public static void main(String[] args) {
		TestClass stu = new TestClass();
		stu.setId(1L);
		stu.setName("Josean");
		stu.setNo("201403185203344");
		stu.setCreatedate(new Date());
		
		
		
		try {
			Field property1 = stu.getClass().getDeclaredField("name");
			System.out.println(property1);// private java.lang.String com.cx.test.Student.name
			Field property3 = stu.getClass().getField("nickname");
			System.out.println(property3);// public java.lang.String com.cx.test.Student.nickname
			// 错误方法 getField系列方法只能获取公共字段
			// Field property2=stu.getClass().getField("name");
			// System.out.println(property2);
			// 会抛java.lang.NoSuchFieldException
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
		
		
		//获取所有的属性?  
        Field[] fs = stu.getClass().getDeclaredFields();  
   
               //定义可变长的字符串，用来存储属性  
        StringBuffer sb = new StringBuffer();  
        //通过追加的方法，将每个属性拼接到此字符串中  
        //最外边的public定义  
        sb.append(Modifier.toString(stu.getClass().getModifiers()) + " class " + stu.getClass().getSimpleName() +"{\n");  
        //里边的每一个属性  
        for(Field field:fs){  
            sb.append("\t");//空格  
            if (!field.isAccessible()) {
            	field.setAccessible(true);
            }
            sb.append(Modifier.toString(field.getModifiers())+" ");//获得属性的修饰符，例如public，static等等  
            sb.append(field.getType().getSimpleName() + " ");//属性的类型的名字  
            sb.append(field.getName()+" ");//属性的名字
            try {
				sb.append(field.get(stu)+" \n");
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//属性的名字
        }  
  
        sb.append("}");  
  
        System.out.println(sb);
        
        

	}
}
