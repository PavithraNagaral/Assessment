package com.manthan.empwebapp.dao;

import com.manthan.empwebapp.beans.Employeeinfobean;

public interface Employeedao {
	
	public Employeeinfobean searchemployee(int empid) ;
	public boolean addemp(Employeeinfobean employeeinfobean);
	
	public Employeeinfobean authenticate(int empid,String password);
	
	public boolean Update(int empid,int age);
		
	public boolean delete(int empid);
	
}// end of dao
