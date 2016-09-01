/**
 * 
 */
package com.rs.spring.scheduling;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * @author IBM_ADMIN
 *
 */
@Component("myBean")
public class MyBean {

	private static final Logger log = Logger.getLogger(MyBean.class);
	
	public void printMessage(){
		log.info("I am called by MethodInvokingJobDetailFactoryBean using SimpleTriggerFactoryBean");
	}
}
