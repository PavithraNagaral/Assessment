package com.manthan.Collect.list;

public class Student {
	String name;
	int id;
	double per;
	public Student(String name, int id, double per) {
		this.name = name;
		this.id = id;
		this.per = per;
	}
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", per=" + per + "]";
	}

}
