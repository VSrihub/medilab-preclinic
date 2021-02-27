package com.nareshit.medilab.department.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nareshit.medilab.department.model.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer>{
	
}
