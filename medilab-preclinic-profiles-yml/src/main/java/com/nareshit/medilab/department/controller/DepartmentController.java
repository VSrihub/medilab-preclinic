/**
 * 
 */
package com.nareshit.medilab.department.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nareshit.medilab.department.bean.DepartmentBean;
import com.nareshit.medilab.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author nsanda
 *
 */
@Controller
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService deptService;
	
	
	@RequestMapping("/department")
	public String viewDepartments(Model model) {
		log.info("i am in DepartmentController ");
		List<DepartmentBean> deptList = deptService.findAll();
		model.addAttribute("deptList", deptList);
		return "departments";
	}
	
	@RequestMapping("/viewDept")
	public String viewAddDepartments(Model model) {
		log.info("i am in DepartmentController ");
		model.addAttribute("dept", new DepartmentBean());
		return "addDeptartment";
	}
	
	@RequestMapping("/saveDept")
	public String saveDepartments(@ModelAttribute("dept")DepartmentBean deptBean,Model model) {
		log.info("deptartment bean data is:\t "+deptBean.toString());
		deptService.save(deptBean);
		List<DepartmentBean> deptList = deptService.findAll();
		model.addAttribute("deptList", deptList);
		return "departments";
	}
	
	@RequestMapping("/editDept/{id}")
	public String editDepartments(@PathParam("id") String deptId,Model model) {
		log.info("editDepartments bean data is:\t "+deptId);
		
		List<DepartmentBean> deptList = deptService.findAll();
		
		model.addAttribute("deptList", deptList);
		return "departments";
	}
	
	@RequestMapping("/deleteDept/{id}")
	public String deleteDepartment(@PathVariable("id") String deptId, Model model) {
		log.info("deleteDepartment bean data is:\t "+deptId);
		
		deptService.delete(Integer.valueOf(deptId));
		List<DepartmentBean> deptList = deptService.findAll();			
		model.addAttribute("deptList", deptList);
		
		return "redirect:/department";
		
	}
}
