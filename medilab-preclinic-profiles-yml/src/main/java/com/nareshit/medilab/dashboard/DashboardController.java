/**
 * 
 */
package com.nareshit.medilab.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

/**
 * @author nsanda
 *
 */
@Controller
@Slf4j
public class DashboardController {

	@RequestMapping("/dashboard")
	public String viewDashboard(Model model) {
		
		log.info("i am in dashboard controller ");
		return "dashboard";
	}
}
