package com.manthan.Collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Q {

	public static void main(String[] args) {
			Vector V = new Vector();
			V.add("AAA");
			V.add('u');
			V.add(77);
			V.add(9.8);
			for(int i=0;i<V.size();i++)
			{
				 Object c= V.get(i);
				System.out.println(c);
			}
			
			
			for(Object y:V)
			{
				System.out.println(y);
			}
			
			Iterator i = V.iterator();
			while(i.hasNext())
			{
				Object u=i.next();
				System.out.println(u);
			}
			
			ListIterator l = V.listIterator(V.size());
			while(l.hasPrevious())
			{
				Object p = l.previous();
				System.out.println(p);
			}
		
	}

}
