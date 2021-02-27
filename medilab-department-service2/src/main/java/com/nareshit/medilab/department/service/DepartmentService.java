/**
 * 
 */
package com.nareshit.medilab.department.service;

import java.util.List;

import com.nareshit.medilab.department.bean.DepartmentBean;
import com.nareshit.medilab.exception.DuplicateDepartmentException;
import com.nareshit.medilab.exception.NoDepartmentException;

/**
 * @author nsanda
 *
 */
public interface DepartmentService {

	/**
	 * update and save the data
	 * @param deptBean
	 * @return
	 * @throws DuplicateDepartmentException 
	 */
	public DepartmentBean save(DepartmentBean deptBean) throws DuplicateDepartmentException;
	public List<DepartmentBean> findAll();
	public DepartmentBean findOne(int id) throws NoDepartmentException;
	public List<DepartmentBean> searchAll(String searchCriteria, String key);
	public DepartmentBean findByName(String deptName);
	
	public void delete(int id);
	public boolean delete(DepartmentBean deptBean);
	
	
}
