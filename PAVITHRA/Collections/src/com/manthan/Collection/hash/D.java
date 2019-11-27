package com.manthan.Collection.hash;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class D {

	public static void main(String[] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.add("iii");
		hs.add("pppp");
		hs.add("uuu");
		
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
