package com.manthan.test.array.tst;

public class TestF {

	public static void main(String[] args) {
		
		Student[] s=new Student[4];
		Student s1=new Student("ppp", 6, 78);
		Student s2=new Student("poo", 7, 76);
		Student s3=new Student("prr", 8, 77);
		Student s4=new Student("jaa", 9, 74);
		
		s[0]=s1;
		s[1]=s2;
		s[2]=s3;
		s[3]=s4;
		
		for(Student r:s)
		{
			System.out.println(r.name);
			System.out.println(r.id);
			System.out.println(r.per);
		}
	}

}
