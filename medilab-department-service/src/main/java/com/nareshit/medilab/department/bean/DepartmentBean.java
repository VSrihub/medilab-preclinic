/**
 * 
 */
package com.nareshit.medilab.department.bean;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

/**
 * @author nsanda
 *
 */
@Data
public class DepartmentBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DepartmentBean() {
		super();
	}
	
	private int id;
	@NotEmpty(message="Department Name shouldnt be empty or null")
	private String name;
	private String description;
	
	@NotEmpty(message="Status shouldnt be empty or null")
	private String status;

	
}
