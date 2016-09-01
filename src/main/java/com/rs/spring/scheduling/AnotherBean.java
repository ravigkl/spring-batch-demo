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
@Component("anotherBean")
public class AnotherBean {

	private static final Logger log = Logger.getLogger(AnotherBean.class);
	
	public void printAnotherMessage(){
        log.info("I am called by Quartz jobBean using CronTriggerFactoryBean");
    }

}
