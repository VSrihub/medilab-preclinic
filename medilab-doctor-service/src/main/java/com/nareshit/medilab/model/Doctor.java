package com.nareshit.medilab.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;




@Entity
//@Table(name = "DOCTOR")
@Data
public class Doctor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "uid")
	private int id;
	@Column(name = "firstname")
	private String fname;
	@Column(name = "lastname")
	private String lname;
	@Column(name = "email")
	private String email;
	@Column(name = "contact")
	private String mobile;
	@Column(name = "pwd")
	private String password;
	@Column(name = "cpwd")
	private String conpassword;
	@Column(name = "status")
	private boolean status;

	private String experience;
	private String specialization;

}
