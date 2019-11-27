package com.manthan.Collect;

import java.util.TreeSet;



public class A {

	public static void main(String[] args) {
		
		StudentByID s=new StudentByID();
		TreeSet<Student> t = new TreeSet<Student>(s);
		
		
		Student s1=new Student("pp", 1, 34.8);
		Student s2=new Student("pp", 5, 34.8);
		Student s3=new Student("pp", 3, 34.8);
		Student s4=new Student("pp", 4, 34.8);
		
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		for(Student p:t)
		{
			System.out.println("name"+p.name);
			System.out.println("per"+p.per);
			System.out.println("id"+p.id);
			
			System.out.println("-------------");
		}
		
		}

}
