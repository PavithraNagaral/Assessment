package com.manthan.Collection.hash;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class C {

	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet();
		hs.add("iii");
		hs.add("pppp");
		hs.add("uuu");
		hs.add(null);
		hs.add(null);
		
		hs.add("uuu");
		
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
