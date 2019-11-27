package com.manthan.lamda;

import java.util.Comparator;
import java.util.TreeSet;

public class Tree {

	public static void main(String[] args) {
		/*Comparator<Student> id=(o1,o2)->
		{
			if(o1.id>o2.id)
			{
				return 1;
			}
			else if(o1.id<o2.id)
			{
				return -1;
			}
			return 0;
		};
		Comparator<Student> p=(o1,o2)->
		{
			if(o1.per>o2.per)
			{
				return 1;
			}
			else if(o1.per<o2.per)
			{
				return -1;
			}
			return 0;
		};
		
		Comparator<Student> n=(o1,o2)->{
			return o1.name.compareTo(o2.name);
		};*/
		
		
		
		
		
		TreeSet<Student> s=new TreeSet<Student>(SortAll.n);
		Student s1=new Student("prath", 32, 67.0);
		Student s2=new Student("aba", 2, 77.0);
		Student s3=new Student("jaa", 24, 97.0);
		s.add(s1);
		s.add(s2);
		s.add(s3);
		
		for(Student t:s)
		{
			System.out.println(t.id);
			System.out.println(t.name);
			System.out.println(t.per);
		}
		
		
		
		/*System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.per);
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.per);
		System.out.println(s3.id);
		System.out.println(s3.name);
		System.out.println(s3.per);*/
		
		
		
	
	}

}
