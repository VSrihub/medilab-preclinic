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
public class DuplicateDepartmentException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	
	public DuplicateDepartmentException() {
		// TODO Auto-generated constructor stub
	}
	
	public DuplicateDepartmentException(String message) {
		this.message = message;
	}
	
}
