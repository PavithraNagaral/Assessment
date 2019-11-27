package com.manthan.Overloading;

public class Testc {

	public static void main(String[] args) {
		Person p=new Person();
		p.age=75;
		p.walk();
		p.m.cost=90000;
		p.m.call();
		
		System.out.println(p.age);
		System.out.println(p.m.cost);
	}

}
