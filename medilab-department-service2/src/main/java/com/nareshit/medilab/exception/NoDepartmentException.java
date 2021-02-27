/**
 * 
 */
package com.nareshit.medilab.exception;

import lombok.Getter;

/**
 * @author nsanda
 *
 */
@Getter
public class NoDepartmentException extends Exception {

	private String message;
	
	public NoDepartmentException() {
		// TODO Auto-generated constructor stub
	}
	
	public NoDepartmentException(String message) {
		this.message = message;
	}
	
}
