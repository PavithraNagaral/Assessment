package com.manthan.Collection;

import java.util.LinkedList;

public class K {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(6);
		ll.add(7.6);
		ll.add('y');
		ll.add("iii");
		
		for(Object r:ll)
		{
			System.out.println(r);
		}
	}

}
