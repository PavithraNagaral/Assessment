package com.manthan.Collect;

public class Student {
	String name;
	int id;
	double per;
	public Student(String name, int id, double per) {
		this.name = name;
		this.id = id;
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", per=" + per + "]";
	}
	
	

}
