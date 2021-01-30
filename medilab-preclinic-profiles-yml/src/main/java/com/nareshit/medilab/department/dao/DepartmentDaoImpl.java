/**
 * 
 */
package com.nareshit.medilab.department.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nareshit.medilab.department.model.Department;

/**
 * @author nsanda
 *
 */
@Repository
public class DepartmentDaoImpl implements DepartmentDao {
	
	/*@Autowired
	private SessionFactory sessionFactory;*/
	
	@Autowired
	private EntityManagerFactory enityManagerFactory;

	/* (non-Javadoc)
	 * @see com.nareshit.medilab.department.dao.DepartmentDao#save(com.nareshit.medilab.department.model.Department)
	 */
	@Override
	public Department save(Department dept) {
		SessionFactory sessionFactory = enityManagerFactory.unwrap(SessionFactory.class);
		Session session = sessionFactory.openSession();
		session.save(dept);
		session.beginTransaction().commit();
		return dept;
	}

	/* (non-Javadoc)
	 * @see com.nareshit.medilab.department.dao.DepartmentDao#findAll()
	 */
	@Override
	public List<Department> findAll() {
		SessionFactory sessionFactory = enityManagerFactory.unwrap(SessionFactory.class);
		Session session = sessionFactory.openSession();
		Criteria ct = session.createCriteria(Department.class);
		return ct.list();
	}

	/* (non-Javadoc)
	 * @see com.nareshit.medilab.department.dao.DepartmentDao#findOne(int)
	 */
	@Override
	public Department findOne(int deptId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.nareshit.medilab.department.dao.DepartmentDao#delete(int)
	 */
	@Override
	public void deleteById(int deptId) {
		SessionFactory sessionFactory = enityManagerFactory.unwrap(SessionFactory.class);
		Session session = sessionFactory.openSession();
		Department dept = session.get(Department.class, deptId);
		session.delete(dept);
		session.beginTransaction().commit();
	}

	/* (non-Javadoc)
	 * @see com.nareshit.medilab.department.dao.DepartmentDao#delete(com.nareshit.medilab.department.model.Department)
	 */
	@Override
	public void delete(Department dept) {
		

	}

}
