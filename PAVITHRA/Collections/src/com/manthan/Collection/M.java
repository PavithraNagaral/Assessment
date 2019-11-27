package com.manthan.Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class M {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(6);
		ll.add(7.6);
		ll.add('y');
		ll.add("iii");
		Iterator li = ll.iterator();
		
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
