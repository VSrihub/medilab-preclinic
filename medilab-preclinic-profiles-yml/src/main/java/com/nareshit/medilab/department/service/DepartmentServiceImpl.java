/**
 * 
 */
package com.nareshit.medilab.department.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nareshit.medilab.department.bean.DepartmentBean;
import com.nareshit.medilab.department.common.InmemoryDB;
import com.nareshit.medilab.department.dao.DepartmentDao;
import com.nareshit.medilab.department.model.Department;
import com.nareshit.medilab.department.repo.DepartmentRepo;

/**
 * @author nsanda
 *
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepo deptRepo;
	
	//private DepartmentDao deptRepo;

	/* (non-Javadoc)
	 * @see com.nareshit.medilab.department.service.DepartmentService#save(com.nareshit.medilab.department.bean.DepartmentBean)
	 */
	@Override
	public DepartmentBean save(DepartmentBean deptBean) {
		Department deptModel = new Department();
		
		//convert the bean properties to model properties
		BeanUtils.copyProperties(deptBean, deptModel);
		
		deptModel = deptRepo.save(deptModel);
		
		//convert the bean properties to model properties
		BeanUtils.copyProperties(deptModel, deptBean);		
		
		return deptBean;
	}

	/* (non-Javadoc)
	 * @see com.nareshit.medilab.department.service.DepartmentService#findAll()
	 */
	@Override
	public List<DepartmentBean> findAll() {
		List<DepartmentBean> deptBeansList = new ArrayList<DepartmentBean>();
		List<Department> deptList = deptRepo.findAll();
		if(deptList != null && deptList.size() >0) {
			deptList.stream().forEach(deptModel->{
				DepartmentBean deptBean = new DepartmentBean();
				BeanUtils.copyProperties(deptModel, deptBean);
				deptBeansList.add(deptBean);
			});
		}else {
			System.out.println("No Departments found in DB");
		}
		
		return deptBeansList;
	}

	/* (non-Javadoc)
	 * @see com.nareshit.medilab.department.service.DepartmentService#findOne(int)
	 */
	@Override
	public DepartmentBean findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.nareshit.medilab.department.service.DepartmentService#searchAll(java.lang.String, java.lang.String)
	 */
	@Override
	public List<DepartmentBean> searchAll(String searchCriteria, String key) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.nareshit.medilab.department.service.DepartmentService#findByName(java.lang.String)
	 */
	@Override
	public DepartmentBean findByName(String deptName) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.nareshit.medilab.department.service.DepartmentService#delete(int)
	 */
	@Override
	public void  delete(int id) {
		deptRepo.deleteById(id);
	}

	/* (non-Javadoc)
	 * @see com.nareshit.medilab.department.service.DepartmentService#delete(com.nareshit.medilab.department.bean.DepartmentBean)
	 */
	@Override
	public boolean delete(DepartmentBean deptBean) {
		// TODO Auto-generated method stub
		return false;
	}

}
