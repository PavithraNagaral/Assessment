package com.manthan.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class C {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(5);
		al.add(8);
		al.add('f');
		al.add("simra");
		
		Iterator i = al.iterator();
		while(i.hasNext())
		{
			Object v = i.next();
			System.out.println(v);
		}
		
		ListIterator l = al.listIterator();
		while(l.hasNext())
		{
			Object n = l.next();
			System.out.println(n);
		}
		
		System.out.println("--------------");
		
		while(l.hasPrevious())
		{
			Object p = l.previous();
			System.out.println(p);
		}
		
	}

}
