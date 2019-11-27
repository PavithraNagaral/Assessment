package com.manthan.Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class P {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("uuu");
		ll.add("oo");
		ll.add("yyy");
		
		Iterator i = ll.iterator();
		while(i.hasNext())
		{
			Object n = i.next();
			System.out.println(n);
		}
		
		ListIterator l = ll.listIterator(ll.size());
		while(l.hasPrevious())
		{
			Object p = l.previous();
			System.out.println(p);
		}
	}

}
