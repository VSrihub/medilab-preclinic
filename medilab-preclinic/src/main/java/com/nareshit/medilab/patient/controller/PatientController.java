package com.nareshit.medilab.patient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PatientController {

	@RequestMapping("/patient")
	public String getDocorBoard() {
		return "patient/patients";

	}

}
