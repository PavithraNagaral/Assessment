package com.manthan.Collection.hash;

import java.util.HashSet;
import java.util.Iterator;

public class B {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("iii");
		hs.add("pppp");
		hs.add("uuu");
		
		hs.add("uuu");
		hs.add(null);
		hs.add(null);
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
