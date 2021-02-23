package com.nareshit.medilab.dao;

import java.util.List;

import com.nareshit.medilab.model.Doctor;

public interface DoctorDao {

	public Doctor addDoctor(Doctor hosp);
	public Doctor getDoctorByid(int id);
	public List<Doctor> getAllDoctors();
	public List<Doctor> searchDoctor(String name, String email);
	
}
