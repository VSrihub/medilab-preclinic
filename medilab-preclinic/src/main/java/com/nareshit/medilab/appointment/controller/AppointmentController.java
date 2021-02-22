/**
 * 
 */
package com.nareshit.medilab.appointment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author nsanda
 *
 */
@Controller
public class AppointmentController {

	
	@RequestMapping("/appointments")
	public String viewDepartments(Model model) {
		System.out.println("i am in DepartmentController ");
		return "appointments/appointments";
	}
}
