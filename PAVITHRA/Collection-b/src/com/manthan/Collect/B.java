package com.manthan.Collect;

import java.util.PriorityQueue;

public class B {

	public static void main(String[] args) {
		PriorityQueue<Double> p = new PriorityQueue<Double>();
		
		p.add(78.9);
		p.add(67.9);
		p.add(89.6);
		p.add(23.7);
		
		System.out.println(p);
		
		for(Double r:p)
		{
			System.out.println(r);
		}
		
		System.out.println( p.size());
		System.out.println(p.poll());
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p);
	}

}
