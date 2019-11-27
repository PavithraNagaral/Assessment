package com.manthan.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class D {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(5);
		al.add(8);
		al.add('f');
		al.add("simra");
		
		ListIterator l = al.listIterator(al.size());
		while(l.hasPrevious())
		{
			Object p = l.previous();
			System.out.println(p);
		}
	}

}
