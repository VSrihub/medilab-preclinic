/**
 * 
 */
package com.nareshit.medilab.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.Getter;

/**
 * @author nsanda
 *
 */
@Getter
public class DepartmentApiError {

	private String message;
	private int code;
	private LocalDateTime time;
	
	public DepartmentApiError() {
		super();
		this.time=LocalDateTime.now();
	}
	
	public DepartmentApiError(HttpStatus httpStatus,Throwable tx) {
		this.message = tx.getMessage();
		this.code=httpStatus.value();
		time = LocalDateTime.now();
	}
	
	public DepartmentApiError(String message,int code) {
		this.message = message;
		this.code=code;
		time = LocalDateTime.now();
	}
	
}
