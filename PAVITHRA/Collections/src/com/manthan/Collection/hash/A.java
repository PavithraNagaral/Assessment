package com.manthan.Collection.hash;

import java.util.HashSet;
import java.util.Iterator;

public class A {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("priya");
		hs.add(14);
		hs.add("divya");
		hs.add('b');
		
		System.out.println("using foreach--------");
		
		for(Object s:hs)
		{
			System.out.println(s);
		}
		
		System.out.println("using iterator---------");
		
		Iterator i = hs.iterator();
		while(i.hasNext())
		{
			Object u=i.next();
			System.out.println(u);
		}
	}
}
