/**
 * 
 */
package com.rs.spring.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.rs.spring.scheduling.AnotherBean;

/**
 * @author IBM_ADMIN
 *
 */
public class ScheduledJob extends QuartzJobBean {

	// references to the beans to be scheduled for the execution
	private AnotherBean anotherBean;

	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		// call the methods of the scheduled beans for executions inside this
		// method
		anotherBean.printAnotherMessage();

	}

	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}

}
