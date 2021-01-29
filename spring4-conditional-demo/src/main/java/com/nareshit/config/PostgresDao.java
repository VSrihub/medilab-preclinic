/**
 * 
 */
package com.nareshit.config;

import java.util.Arrays;
import java.util.List;

/**
 * @author nsanda
 *
 */
public class PostgresDao implements DatabaseDao {

	/* (non-Javadoc)
	 * @see com.nareshit.config.DatabaseDao#findUsers()
	 */
	public List<String> findUsers() {
		System.out.println("****::PostgresDao DAO");
		return Arrays.asList("PostgresUser1","PostgresUser2","PostgresUser3");
	}

}
