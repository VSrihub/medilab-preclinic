/**
 * 
 */
package com.nareshit.medilab.department.service;

import java.util.List;

import com.nareshit.medilab.department.bean.DepartmentBean;

/**
 * @author nsanda
 *
 */
public interface DepartmentService {

	/**
	 * update and save the data
	 * @param deptBean
	 * @return
	 */
	public DepartmentBean save(DepartmentBean deptBean);
	public List<DepartmentBean> findAll();
	public DepartmentBean findOne(int id);
	public List<DepartmentBean> searchAll(String searchCriteria, String key);
	public DepartmentBean findByName(String deptName);
	
	public void delete(int id);
	public boolean delete(DepartmentBean deptBean);
	
	
}
