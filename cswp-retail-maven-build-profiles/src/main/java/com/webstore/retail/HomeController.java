package com.webstore.retail;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String viewHomePage() {
		System.out.println("i am in viewHomePage Controller");
		return "welcome";
	}
}
