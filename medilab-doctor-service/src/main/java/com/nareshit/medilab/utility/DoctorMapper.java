package com.nareshit.medilab.utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONObject;

import com.nareshit.medilab.bean.DoctorBean;
import com.nareshit.medilab.model.Doctor;

public class DoctorMapper {

	public static Doctor mapBeanToDomain(DoctorBean doctBean) {
		Doctor doct = new Doctor();
		if(doctBean.getId() > 0) {
			doct.setId(doctBean.getId());
		}
		
		doct.setPassword(doctBean.getPassword());
		doct.setConpassword(doctBean.getCpassword());
		doct.setEmail(doctBean.getEmail());
		doct.setFname(doctBean.getFname());
		doct.setMobile(doctBean.getMobile());
		doct.setSpecialization(doctBean.getSpecialist());
		doct.setExperience(doctBean.getExperience());
		
		//doct.setStatus(Boolean.parseBoolean(String.valueOf(Status.getCodeByName(doctBean.getStatus()))));
		doct.setStatus(Boolean.parseBoolean(doctBean.getStatus()));
		
		return doct;
		
	
	}
	
	public static DoctorBean mapDomainToBean(Doctor doctDomain) {
		DoctorBean doct = new DoctorBean();
		doct.setId(doctDomain.getId());
		doct.setEmail(doctDomain.getEmail());
		doct.setFname(doctDomain.getFname());
		doct.setMobile(doctDomain.getMobile());
		doct.setExperience(doctDomain.getExperience());
		String jsonString = doctDomain.getSpecialization();
		JSONObject jsonObject = new JSONObject(jsonString);
		if(jsonObject != null && jsonObject.has("name")) {
			String speciality = jsonObject.getString("name");
			doct.setSpecialist(speciality);
		}
		
		
		boolean doctStatus = doctDomain.isStatus();
		doct.setStatus(String.valueOf(doctStatus));
		/*doct.setStatus(String.valueOf(doctStatus));
		List<AddressBean> addBeansList = null;
		List<Address> addrList = doctDomain.getAddrList();
		if(addrList != null && addrList.size() >0) {
			addBeansList = new ArrayList<AddressBean>();
			for(Address ad : addrList) {
				addBeansList.add(AddressMapper.mapDomainToBean(ad));
			}
			doct.setAddrInfo(addBeansList);
		}*/
		
		return doct;
	}
	
	public static List<DoctorBean> mapDomainListToBean(Iterator<Doctor> doctList){
		List<DoctorBean> doctBeansList = null;
		if(doctList != null) {
			doctBeansList = new ArrayList<DoctorBean>();
			while(doctList.hasNext()) {
				doctBeansList.add(mapDomainToBean(doctList.next()));
			}
		}
		return doctBeansList;
	}
		
}
