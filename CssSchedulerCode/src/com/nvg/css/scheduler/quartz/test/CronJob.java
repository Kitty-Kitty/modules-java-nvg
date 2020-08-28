/**
 * 
 */
package com.nvg.css.scheduler.quartz.test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @title : CronJob.java
 * @description : TODO(用一句话描述该类型的作用)
 * @author : fangzhenmu
 * @created : Oct 23, 20161:24:09 PM
 */
public class CronJob {
	public static void main(String[] args) throws SchedulerException, ParseException {

        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

        JobDetail job = JobBuilder.newJob(TestJobTwo.class)
        	.withIdentity("cronJob", "testJob") 
            .build();

        String startDateStr = "2016-10-01 00:00:00.0";
        String endDateStr = "2026-10-23 00:00:00.0";

        Date startDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").parse(startDateStr);
        Date endDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").parse(endDateStr);

        CronTrigger cronTrigger = TriggerBuilder.newTrigger()
          .withIdentity("trigger1", "testJob")
          .startAt(startDate)
          //.withSchedule(CronScheduleBuilder.cronSchedule("0/2 * * * * ?").withMisfireHandlingInstructionDoNothing())
          .withSchedule(CronScheduleBuilder.cronSchedule("0/20 * * * * ?").withMisfireHandlingInstructionIgnoreMisfires())
          .endAt(endDate)
          .build();

        scheduler.scheduleJob(job, cronTrigger);
        scheduler.start();
        
        try {  
            Thread.sleep(300L * 1000L);  
        } catch (Exception e) {  
        }  
  
        scheduler.shutdown(true);  
        System.out.println("------- 调度已关闭 ---------------------");  
    }
}
