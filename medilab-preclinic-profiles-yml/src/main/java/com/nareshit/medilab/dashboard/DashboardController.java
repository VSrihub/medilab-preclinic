/**
 * 
 */
package com.nareshit.medilab.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author nsanda
 *
 */
@Controller
public class DashboardController {

	@RequestMapping("/dashboard")
	public String viewDashboard(Model model) {
		System.out.println("i am in dashboard controller ");
		return "dashboard";
	}
}
