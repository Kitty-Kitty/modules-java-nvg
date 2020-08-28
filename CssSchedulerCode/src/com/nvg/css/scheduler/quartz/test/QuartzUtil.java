/**
 * 
 */
package com.nvg.css.scheduler.quartz.test;

import org.quartz.Job;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nvg.css.scheduler.quartz.test.TestJobOne;
import com.nvg.css.scheduler.quartz.test.TestJobTwo;

/**
 * @title : QuartzUtil.java
 * @description : TODO(��һ�仰���������͵�����)
 * @author : fangzhenmu
 * @created : Oct 26, 201612:42:09 PM
 */
public class QuartzUtil {

	private final static String JOB_GROUP_NAME = "QUARTZ_JOBGROUP_NAME";//������
    private final static String TRIGGER_GROUP_NAME = "QUARTZ_TRIGGERGROUP_NAME";//��������
    private static Logger log = LoggerFactory.getLogger(QuartzUtil.class);//��־

    /**
     * �������ķ���
     * @param jobName  ������
     * @param triggerName  ��������
     * @param jobClass  ִ���������
     * @param seconds  ���ʱ��
     * @throws SchedulerException
     */
    public static void addJob(String jobName,String triggerName,Class<? extends Job> jobClass,int seconds) throws SchedulerException{
        log.info("==================initialization=================");

        //����һ��SchedulerFactory����ʵ��
        SchedulerFactory sf = new StdSchedulerFactory();

        //ͨ��SchedulerFactory����Scheduler���� 
        Scheduler sche = sf.getScheduler();

        log.info("===================initialize finshed===================");

        log.info("==============add the Job to Scheduler==================");  

        //��������Jobʵ���༰������һЩ��̬��Ϣ������һ����ҵʵ��
        JobDetail jobDetail = JobBuilder.newJob(jobClass)
                                .withIdentity(jobName, JOB_GROUP_NAME)
                                .build();
        
         //����һ�����������涨�����Ĺ���
        Trigger trigger = TriggerBuilder.newTrigger()//����һ���µ�TriggerBuilder���淶һ��������
                            .withIdentity(triggerName, TRIGGER_GROUP_NAME)//����������һ�����ֺ�����
                            .startNow()//����ִ��
                            .withSchedule(
                                SimpleScheduleBuilder.simpleSchedule()
                                .withIntervalInSeconds(seconds)//ʱ����  ��λ����
                                .repeatForever()//һֱִ��
                            )
                            .build();//����������
        
        //��Scheduler�����job�����trigger������
        sche.scheduleJob(jobDetail, trigger);
        //����
        sche.start();
    }

    /**
     * ����
     * @param args
     */
    public static void main(String[] args) {
        try {
            //��ӵ�һ������  ÿ��10��ִ��һ��
            QuartzUtil.addJob("job1", "trigger1", TestJobOne.class, 2);

            //��ӵڶ�������  ÿ��20��ִ��һ��
            QuartzUtil.addJob("Job2", "trigger2", TestJobTwo.class, 5);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

}
