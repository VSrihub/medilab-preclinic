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
@Profile("qa")

public class QAEnv {

	@Bean
	public FmsDataSource  getFmsDataSource() {
		return new FmsDataSource("qa_url", "qa_driver");
	}
}
