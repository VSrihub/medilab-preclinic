/**
 * 
 */
package com.nareshit.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author nsanda
 *
 */
public class PostgresDaoCondition implements Condition {

	/* (non-Javadoc)
	 * @see org.springframework.context.annotation.Condition#matches(org.springframework.context.annotation.ConditionContext, org.springframework.core.type.AnnotatedTypeMetadata)
	 */
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		/*String dbType = System.getProperty("dbType");
		return dbType != null && dbType.equals("Postgres");*/
		/*try {
			Class.forName("org.postgresql.Driver");
			return true;
		}catch (Exception e) {
			return false;
		}*/
		
		return context.getBeanFactory().containsBean("postgresDao");
		
		
	}

}
