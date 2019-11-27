package com.manthan.abstraction;

public class TestB {
public static void main(String[] args) {
	String p="raju";
	String k="raju";
	String t="priya";
	System.out.println(t.equals(k));
	System.out.println(p.equals(t));
	
	String m=new String("priya");
	System.out.println(t.equals(p));
}
}
