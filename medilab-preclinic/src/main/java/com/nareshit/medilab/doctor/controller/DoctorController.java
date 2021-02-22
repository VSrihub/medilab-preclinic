package com.nareshit.medilab.doctor.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//@RestController
@Controller
public class DoctorController {

	
	@RequestMapping("/doctor")
	public String getDocorBoard(HttpServletRequest request) {
		System.out.println("logged in session id is:\t"+request.getSession().getId());
		return "doctor/doctors";
				
	}
	
	@RequestMapping("/addDoctor")
	public String addDoctorView(HttpServletRequest request) {
		System.out.println("logged in session id is:\t"+request.getSession().getId());
		return "doctor/addDoctor";
				
	}	
}
