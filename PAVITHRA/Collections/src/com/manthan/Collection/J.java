package com.manthan.Collection;

import java.util.LinkedList;

public class J {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(6);
		ll.add(7.6);
		ll.add('y');
		ll.add("iii");
		
		for(int i=0;i<ll.size();i++)
		{
			Object r = ll.get(i);
			System.out.println(r);
		}
	}

}
