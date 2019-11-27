package com.manthan.Collection.hash;

import java.util.TreeSet;

public class F {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("aaaa");
		ts.add("cc");
		ts.add("bb");
		ts.add("dd");
		
		System.out.println("using foreach--------");
		
		for(Object s:ts)
		{
			System.out.println(s);
		}
	}

}
