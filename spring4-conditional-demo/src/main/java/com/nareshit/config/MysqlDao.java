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
public class MysqlDao implements DatabaseDao {

	/* (non-Javadoc)
	 * @see com.nareshit.config.DatabaseDao#findUsers()
	 */
	public List<String> findUsers() {
		System.out.println("****::MYSQL DAO");
		return Arrays.asList("mySqlUser1","mySqlUser2","mySqlUser3");
	}

}
