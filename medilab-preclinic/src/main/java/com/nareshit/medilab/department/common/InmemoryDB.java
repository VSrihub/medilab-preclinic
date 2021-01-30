/**
 * 
 */
package com.nareshit.medilab.department.common;

import java.util.ArrayList;
import java.util.List;

import com.nareshit.medilab.department.bean.DepartmentBean;

/**
 * @author nsanda
 *
 */
public interface InmemoryDB {

	static List<DepartmentBean> DEPT_LOCAL_DB = new ArrayList<DepartmentBean>();
}
