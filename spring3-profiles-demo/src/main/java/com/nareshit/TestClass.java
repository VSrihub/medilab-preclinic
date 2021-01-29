/**
 * 
 */
package com.nareshit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author nsanda
 *
 */
public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext   context = new AnnotationConfigApplicationContext();
		
		context.getEnvironment().setActiveProfiles("dev");
		context.scan("com.nareshit");
		
		
		
		context.refresh();
		

		
		
		
		FmsDataSource fds = (FmsDataSource)context.getBean(FmsDataSource.class);
		System.out.println(fds.getDriver());
		System.out.println(fds.getUrl());

		context.close();
	}

}
