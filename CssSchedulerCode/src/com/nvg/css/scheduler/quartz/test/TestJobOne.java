/**
 * 
 */
package com.nvg.css.scheduler.quartz.test;


import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;


/**
 * @title : TestJobOne.java
 * @description : TODO(��һ�仰���������͵�����)
 * @author : fangzhenmu
 * @created : Oct 26, 201612:42:42 PM
 */
public class TestJobOne implements Job {
	 /**
     * ִ������ķ���
     */
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("================ִ������һ....");

        //do more...�������ִ��������Ҫִ�е�����  
    }
}
