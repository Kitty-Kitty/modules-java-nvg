/**
 * 
 */
package com.nvg.css.scheduler.quartz.test;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @title : TestJobTwo.java
 * @description : TODO(用一句话描述该类型的作用)
 * @author : fangzhenmu
 * @created : Oct 26, 201612:43:00 PM
 */
public class TestJobTwo implements Job {
	/**
     * 执行任务的方法
     */
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("================执行任务二....");

        //do more...这里可以执行其他需要执行的任务  
    }
}
