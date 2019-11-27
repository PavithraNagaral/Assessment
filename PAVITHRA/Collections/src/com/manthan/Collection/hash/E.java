package com.manthan.Collection.hash;

import java.util.TreeSet;

public class E {
	public static void main(String[] args) {
		TreeSet<Person> hs = new TreeSet<Person>();
		
		Person p1=new Person(77, "ppp", 11);
		Person p2=new Person(88, "qq", 12);
		Person p3=new Person(99, "ii", 13);
		Person p4=new Person(66, "uu", 14);
		
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(p4);
		
		for(Person p:hs)
		{
			System.out.println("name"+p.name);
			System.out.println("height"+p.height);
			System.out.println("id"+p.id);
			
			System.out.println("-------------");
		}
	}
	

}
