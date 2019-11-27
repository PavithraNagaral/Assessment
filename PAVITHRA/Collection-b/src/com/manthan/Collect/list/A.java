package com.manthan.Collect.list;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection
;
import java.util.Iterator;

public class A {

	public static void main(String[] args) {
		Collection<Double> al = new ArrayList <Double>();
		al.add(98.8);
		al.add(78.5);
		al.add(34.7);
		al.add(99.8);
		
		
		
		 Iterator<Double> i = al.iterator();
		 while(i.hasNext())
		 {
			 Double r=i.next();
			 System.out.println(r);
		 }
	}

}
