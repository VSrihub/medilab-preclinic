package com.nareshit.medilab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nareshit.medilab.bean.DoctorBean;
import com.nareshit.medilab.dao.DoctorDao;
import com.nareshit.medilab.model.Doctor;
import com.nareshit.medilab.utility.DoctorMapper;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorDao hospDao;

	@Override
	public DoctorBean saveDoctor(DoctorBean hosp) {
		Doctor doc = mapBeanToDomain(hosp);
		Doctor hospDoamin = hospDao.addDoctor(doc);
		return DoctorMapper.mapDomainToBean(hospDoamin);
	}

	@Override
	public List<DoctorBean> getAllDoctors() {
		List<Doctor> doctList = hospDao.getAllDoctors();
		List<DoctorBean> doctBeanList = DoctorMapper.mapDomainListToBean(doctList.iterator());
		return doctBeanList;
	}

	public Doctor mapBeanToDomain(DoctorBean doctBean) {
		Doctor doct = new Doctor();
		if (doctBean.getId() > 0) {
			doct.setId(doctBean.getId());
		}

		// String pwdSathHash = pwdEncoder.encode(doctBean.getPassword());
		// String cpwdSaltHash = pwdEncoder.encode(doctBean.getCpassword());

		doct.setPassword(doctBean.getPassword());
		doct.setConpassword(doctBean.getCpassword());
		/*
		 * doct.setPassword(pwdSathHash); doct.setConpassword(cpwdSaltHash);
		 */
		doct.setEmail(doctBean.getEmail());
		doct.setFname(doctBean.getFname());
		doct.setMobile(doctBean.getMobile());
		doct.setSpecialization(doctBean.getSpecialist());
		doct.setExperience(doctBean.getExperience());

		// doct.setRole(roleDao.getRoleByName(doctBean.getRole()));

		// doct.setStatus(Boolean.parseBoolean(String.valueOf(Status.getCodeByName(doctBean.getStatus()))));
		doct.setStatus(Boolean.parseBoolean(doctBean.getStatus()));

		return doct;

	}

}
