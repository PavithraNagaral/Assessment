package com.manthan.Overloading;

public class Testb {

	public static void main(String[] args) {
		Student s=new Student();
		s.setID(1);
		DB d=new DB();
		d.save(s);
	}

}
