/**
 * 
 */
package com.nareshit.medilab.department.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nareshit.medilab.department.bean.DepartmentBean;

/**
 * @author nsanda
 *
 */
@Controller
public class DepartmentController {

	@RequestMapping("/department")
	public String viewDepartments(Model model) {
		System.out.println("i am in DepartmentController ");
		return "departments";
	}
	
	@RequestMapping("/viewDept")
	public String viewAddDepartments(Model model) {
		System.out.println("i am in DepartmentController ");
		model.addAttribute("dept", new DepartmentBean());
		return "addDeptartment";
	}
	
	@RequestMapping("/saveDept")
	public String saveDepartments(@ModelAttribute("dept")DepartmentBean deptBean) {
		System.out.println("deptartment bean data is:\t "+deptBean.toString());
		
		return "addDeptartment";
	}
}
