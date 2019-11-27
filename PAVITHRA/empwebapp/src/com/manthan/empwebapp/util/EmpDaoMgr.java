package com.manthan.empwebapp.util;

import com.manthan.empwebapp.dao.EmployeeDAOImpl;
import com.manthan.empwebapp.dao.Employeedao;

public class EmpDaoMgr {
	private EmpDaoMgr()
	{
		
	}
	public static Employeedao getDaoIns()
	{
		return new EmployeeDAOImpl();
		
	}
}
