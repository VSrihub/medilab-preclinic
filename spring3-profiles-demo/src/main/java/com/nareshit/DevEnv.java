/**
 * 
 */
package com.nareshit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author nsanda
 *
 */
@Configuration
@Profile("dev")

public class DevEnv {

	@Bean
	public FmsDataSource  getFmsDataSource() {
		return new FmsDataSource("dev_url", "dev_driver");
	}
	
	
	
	
	
	
	
	
}
