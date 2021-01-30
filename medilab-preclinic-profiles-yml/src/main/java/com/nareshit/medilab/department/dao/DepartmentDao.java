/**
 * 
 */
package com.nareshit.medilab.department.dao;

import java.util.List;

import com.nareshit.medilab.department.model.Department;

/**
 * @author nsanda
 *
 */
public interface DepartmentDao {

	public Department save(Department dept);
	public List<Department> findAll();
	public Department findOne(int deptId);
	public void deleteById(int deptId);
	public void delete(Department dept);
	
}
