/**
 * 
 */
package com.nareshit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author nsanda
 *
 */
@Configuration
public class AppConfig {

	@Bean
	@Conditional(MysqlDaoCondition.class)
	public DatabaseDao getMysqDao() {
		return new MysqlDao();
	}
	
	@Bean
	@Conditional(PostgresDaoCondition.class)
	public DatabaseDao getPostgresDao() {
		return new PostgresDao();
	}
}
