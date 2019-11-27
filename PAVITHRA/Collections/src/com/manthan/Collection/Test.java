package com.manthan.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		
		
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1=new Student(1, "p", 70.4);
		Student s2=new Student(2, "ppp", 70);
		Student s3=new Student(3, "ttt", 70.2);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		/*for(int i=0;i<al.size();i++)
		{
			Student s=al.get(i);
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.per);
			
			System.out.println("---------------");
		}
		
		for(Student s:al)
		{
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.per);
			System.out.println("----------------");
		}*/
		
		
		Iterator<Student> i=al.iterator();
		while(i.hasNext())
		{
			Student y=i.next();
			System.out.println(y.id);
			System.out.println(y.name);
			System.out.println(y.per);
			System.out.println("-------------------");
		}
		
		
		
		
	}

}
