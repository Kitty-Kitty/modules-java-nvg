/**
 * 
 */
package com.nvg.css.scheduler.quartz.test;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @title : TestJobTwo.java
 * @description : TODO(��һ�仰���������͵�����)
 * @author : fangzhenmu
 * @created : Oct 26, 201612:43:00 PM
 */
public class TestJobTwo implements Job {
	/**
     * ִ������ķ���
     */
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("================ִ�������....");

        //do more...�������ִ��������Ҫִ�е�����  
    }
}
