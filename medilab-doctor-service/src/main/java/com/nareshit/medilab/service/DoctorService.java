package com.nareshit.medilab.service;

import java.util.List;

import com.nareshit.medilab.bean.DoctorBean;


public interface DoctorService {

	public DoctorBean saveDoctor(DoctorBean hosp);
	public List<DoctorBean> getAllDoctors();
}
