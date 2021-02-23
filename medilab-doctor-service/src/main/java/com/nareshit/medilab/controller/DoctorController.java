package com.nareshit.medilab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nareshit.medilab.bean.DoctorBean;
import com.nareshit.medilab.service.DoctorService;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/api")
@RefreshScope
@Slf4j
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private Environment env;
	
		@PostMapping(value = "/doctor")
	public ResponseEntity<DoctorBean> addDoctor(@RequestBody DoctorBean doctBean) {
		doctBean = doctorService.saveDoctor(doctBean);
		return ResponseEntity.status(HttpStatus.OK).body(doctBean);
	}

	@GetMapping(value = "/doctor")
	public ResponseEntity<List<DoctorBean>> getDoctor() {
		log.info("today doctor fee is {}",env.getProperty("doctor.fee"));
		List<DoctorBean> docBeanList = doctorService.getAllDoctors();
		return ResponseEntity.status(HttpStatus.OK).body(docBeanList);
	}

}
