package com.manthan.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class H {

	public static void main(String[] args) {
		ArrayList<Double> a = new ArrayList<Double>();
		a.add(2.4);
		a.add(5.8);
		a.add(3.6);
		a.add(4.1);
		ListIterator<Double> li = a.listIterator();
		while(li.hasPrevious())
		{
			Double d=li.previous();
			System.out.println(d);
		}
		Iterator<Double> i = a.iterator();
		while(i.hasNext())
		{
			Double n = i.next();
			System.out.println(n);
		}
	}

}
