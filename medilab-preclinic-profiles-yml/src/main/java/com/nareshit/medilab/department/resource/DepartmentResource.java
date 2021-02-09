/**
 * 
 */
package com.nareshit.medilab.department.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nareshit.medilab.department.bean.DepartmentBean;
import com.nareshit.medilab.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author nsanda
 *
 */
@RestController
//@Controller
@RequestMapping("/api")
@Slf4j
public class DepartmentResource {

	@Autowired
	private DepartmentService deptService;
	
	//@RequestMapping(value="/department",method=RequestMethod.GET)
	@GetMapping("/department")
	public List<DepartmentBean> viewDepartments() {
		log.info("i am in DepartmentController ");
		List<DepartmentBean> deptList = deptService.findAll();
		
		return deptList;
	}
	
	@PostMapping("/department")
	public List<DepartmentBean> saveDepartments(@RequestBody DepartmentBean deptBean) {
		log.info("deptartment bean data is:\t "+deptBean.toString());
		deptService.save(deptBean);
		List<DepartmentBean> deptList = deptService.findAll();
		return deptList;
	}
	
	@PutMapping("/department")
	public List<DepartmentBean> updateDepartments(@RequestBody DepartmentBean deptBean) {
		log.info("deptartment bean data is:\t "+deptBean.toString());
		deptService.save(deptBean);
		List<DepartmentBean> deptList = deptService.findAll();
		return deptList;
	}
	
	@DeleteMapping("/department/{id}")
	public List<DepartmentBean> deleteDepartment(@PathVariable("id") String deptId) {
		log.info("deleteDepartment bean data is:\t "+deptId);
		
		deptService.delete(Integer.valueOf(deptId));
		List<DepartmentBean> deptList = deptService.findAll();	
		
		return deptList;
		
	}
	
	@DeleteMapping("/department")
	public List<DepartmentBean> deleteDepartments(@RequestBody List<String> deptIds) {
		log.info("deleteDepartment bean data is:\t "+deptIds);
		if(deptIds != null && deptIds.size() >0) {
			deptIds.stream().forEach(deptId->deptService.delete(Integer.valueOf(deptId)));
		}
		
		List<DepartmentBean> deptList = deptService.findAll();	
		
		return deptList;
		
	}
	
	@GetMapping("/department/{id}")
	public DepartmentBean getDepartment(@PathVariable("id") String deptId) {
		log.info("deleteDepartment bean data is:\t "+deptId);
		
		DepartmentBean deptBean = deptService.findOne(Integer.valueOf(deptId));
	
		return deptBean;
		
	}
}
