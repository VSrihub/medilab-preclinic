/**
 * 
 */
package com.nareshit;

/**
 * @author nsanda
 *
 */
public class FmsDataSource {

	private String url;
	private String driver;
	
	public String getUrl() {
		return url;
	}
	public String getDriver() {
		return driver;
	}
	public FmsDataSource(String url, String driver) {
		super();
		this.url = url;
		this.driver = driver;
	}
}
