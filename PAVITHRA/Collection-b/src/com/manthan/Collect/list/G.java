package com.manthan.Collect.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class G {

	public static void main(String[] args) {
		
		
		TreeMap<String, ArrayList<Student>> t=new TreeMap<String, ArrayList<Student>>();
		ArrayList<Student> al1=new ArrayList<Student>();
		Student s1=new Student("amit", 1, 67.9);
		Student s2=new Student("zzz", 2, 77.9);
		Student s3=new Student("pp", 3, 89.9);
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		
		ArrayList<Student> al2=new ArrayList<Student>();
		Student s4=new Student("amit", 1, 67.9);
		Student s5=new Student("zzz", 2, 77.9);
		Student s6=new Student("pp", 3, 89.9);
		al2.add(s4);
		al2.add(s5);
		al2.add(s6);
		
		ArrayList<Student> al3=new ArrayList<Student>();
		Student s7=new Student("amit", 1, 67.9);
		Student s8=new Student("zzz", 2, 77.9);
		al3.add(s7);
		al3.add(s8);
		
		t.put("first", al1);
		t.put("second", al2);
		t.put("third", al3);
		
		Set<Map.Entry<String,ArrayList<Student>>> ts=t.entrySet();
		for(Map.Entry<String,ArrayList<Student>> e: ts)
		{
			String d=e.getKey();
			ArrayList<Student> al=e.getValue();
			
			System.out.println("class"+d);
			
			Iterator< Student> it=al.iterator();
			while(it.hasNext())
			{
				Student t1=it.next();
				System.out.println(t1.id);
				System.out.println(t1.name);
				System.out.println(t1.per);
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
