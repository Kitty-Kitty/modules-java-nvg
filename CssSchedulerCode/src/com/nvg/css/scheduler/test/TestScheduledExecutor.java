/**
 * 
 */
package com.nvg.css.scheduler.test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
  
/**
 * @title : TestScheduledExecutor.java
 * @description : TODO(��һ�仰���������͵�����)
 * @author : fangzhenmu
 * @created : Oct 25, 201611:13:51 AM
 */
public class TestScheduledExecutor implements Runnable {

	private String jobName = "";
	 
    public TestScheduledExecutor(String jobName) {
        super();
        this.jobName = jobName;
    }
 
    @Override
    public void run() {
        System.out.println("execute " + jobName);
    }
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
		 
        long initialDelay1 = 1;
        long period1 = 1;
        // �����ڿ�ʼ1����֮��ÿ��1����ִ��һ��job1
        service.scheduleAtFixedRate(
                new TestScheduledExecutor("job1"), initialDelay1,
                period1, TimeUnit.SECONDS);
 
        long initialDelay2 = 1;
        long delay2 = 1;
        // �����ڿ�ʼ2����֮��ÿ��2����ִ��һ��job2
        service.scheduleWithFixedDelay(
                new TestScheduledExecutor("job2"), initialDelay2,
                delay2, TimeUnit.SECONDS);
	}
}
