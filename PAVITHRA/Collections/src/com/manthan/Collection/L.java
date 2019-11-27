package com.manthan.Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class L {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(6);
		ll.add(7.6);
		ll.add('y');
		ll.add("iii");
		
		Iterator i = ll.iterator();
		while(i.hasNext())
		{
			Object n = i.next();
			System.out.println(n);
		}
	}

}
