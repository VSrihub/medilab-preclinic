/**
 * 
 */
package com.nareshit.medilab.department.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nareshit.medilab.department.bean.DepartmentBean;
import com.nareshit.medilab.department.service.DepartmentService;
import com.nareshit.medilab.exception.DuplicateDepartmentException;
import com.nareshit.medilab.exception.NoDepartmentException;

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
	public ResponseEntity<List<DepartmentBean>> viewDepartments() {
		log.info("i am in DepartmentController ");
		List<DepartmentBean> deptList = deptService.findAll();
		
		return ResponseEntity.status(HttpStatus.OK).body(deptList);
	}
	
	@PostMapping("/department")
	public ResponseEntity<List<DepartmentBean>> saveDepartments(@Valid @RequestBody DepartmentBean deptBean) throws DuplicateDepartmentException {
		log.info("deptartment bean data is:\t "+deptBean.toString());
		
		deptService.save(deptBean);
		List<DepartmentBean> deptList = deptService.findAll();
		
		return ResponseEntity.status(HttpStatus.CREATED).body(deptList);
		
	}
	
	@PutMapping("/department")
	public ResponseEntity<List<DepartmentBean>> updateDepartments(@RequestBody DepartmentBean deptBean) throws DuplicateDepartmentException {
		log.info("deptartment bean data is:\t "+deptBean.toString());
		deptService.save(deptBean);
		List<DepartmentBean> deptList = deptService.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(deptList);
	}
	
	@DeleteMapping("/department/{id}")
	public ResponseEntity<List<DepartmentBean>> deleteDepartment(@PathVariable("id") String deptId) {
		log.info("deleteDepartment bean data is:\t "+deptId);
		
		deptService.delete(Integer.valueOf(deptId));
		List<DepartmentBean> deptList = deptService.findAll();	
		
		return ResponseEntity.status(HttpStatus.OK).body(deptList);
		
	}
	
	@DeleteMapping("/department")
	public ResponseEntity<List<DepartmentBean>> deleteDepartments(@RequestBody List<String> deptIds) {
		log.info("deleteDepartment bean data is:\t "+deptIds);
		if(deptIds != null && deptIds.size() >0) {
			deptIds.stream().forEach(deptId->deptService.delete(Integer.valueOf(deptId)));
		}
		
		List<DepartmentBean> deptList = deptService.findAll();	
		
		return ResponseEntity.status(HttpStatus.OK).body(deptList);
		
	}
	
	@GetMapping("/department/{id}")
	public ResponseEntity<DepartmentBean> getDepartment(@PathVariable("id") String deptId) throws NumberFormatException, NoDepartmentException {
		log.info("deleteDepartment bean data is:\t "+deptId);
		
		DepartmentBean deptBean = deptService.findOne(Integer.valueOf(deptId));
	    if(deptBean != null) {
	    	return ResponseEntity.status(HttpStatus.FOUND).body(deptBean);
	    }else {
	    	return ResponseEntity.status(HttpStatus.NOT_FOUND).body(deptBean);
	    }
		
		
	}
}
