/**
 * 
 */
package com.nareshit.medilab.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author nsanda
 *
 */
@ControllerAdvice
public class DepartApiExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(DuplicateDepartmentException.class)
	public ResponseEntity<DepartmentApiError>  handleDuplicateDepartmentError(DuplicateDepartmentException dde){
		DepartmentApiError apiError = new DepartmentApiError(HttpStatus.NOT_ACCEPTABLE,dde);
		return ResponseEntity.ok(apiError);		
	}
	
	@ExceptionHandler(NoDepartmentException.class)
	public ResponseEntity<DepartmentApiError>  handleDepartmentNotFoundError(NoDepartmentException dde){
		DepartmentApiError apiError = new DepartmentApiError(HttpStatus.NOT_FOUND,dde);
		return ResponseEntity.ok(apiError);		
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		List<DepartmentApiError> deptmentApiErrorList = new ArrayList<DepartmentApiError>();		
		ex.getBindingResult().getAllErrors().stream().forEach(error->{
			String errorMessage = error.getDefaultMessage();
			//String code = error.getCode();
			//int errorCode = Integer.valueOf(code);
			DepartmentApiError apiError = new DepartmentApiError(errorMessage,HttpStatus.BAD_REQUEST.value());
			deptmentApiErrorList.add(apiError);
		});		
		
		return ResponseEntity.status(HttpStatus.OK).body(deptmentApiErrorList);
	}
}
