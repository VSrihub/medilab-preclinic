package com.nareshit.medilab.bean;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class DoctorBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// private List<PatientBean> pinfo;

	private int id;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private String cpassword;
	private String mobile;
	private String status;

	private String userId;

	private String experience;

	private String role;

	private List<String> specialization;
	private String specialist;

}
