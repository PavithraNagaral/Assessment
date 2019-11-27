package com.manthan.Collection;

import java.util.LinkedList;

public class N {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("uuu");
		ll.add("oo");
		ll.add("yyy");
		
		for(int i=0;i<ll.size();i++)
		{
			String r = ll.get(i);
			System.out.println(r);
		}
		
	}

}
