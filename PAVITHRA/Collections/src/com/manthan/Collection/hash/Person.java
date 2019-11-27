package com.manthan.Collection.hash;

public class Person implements Comparable<Person>  {
	int id;
	String name;
	int height;
	public Person(int id, String name, int height) {
		this.id = id;
		this.name = name;
		this.height = height;
	}
	@Override
	/*public int compareTo(Person x) {
		if(this.id>x.id)
		{
			return 1;

		}
		else if(this.id<x.id)
		{
			return -1;
		}
		else {
			return 0;
		}*/
//	public int compareTo(Person x) {
//		if(this.height>x.height)
//		{
//			return 1;
//
//		}
//		else if(this.height<x.height)
//		{
//			return -1;
//		}
//		else {
//			return 0;
//		}
	
		public int compareTo(Person x)
		{
		return this.name.compareTo(x.name);



	}



}
