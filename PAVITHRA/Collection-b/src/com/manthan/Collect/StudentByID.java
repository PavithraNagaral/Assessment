package com.manthan.Collect;

import java.util.Comparator;

public class StudentByID implements Comparator<Student> {

	
	public int compare(Student o1, Student o2) {
		
		Integer a=o1.id;
		Integer b=o2.id;
		return a.compareTo(b);
		
	}

	/*public int compare(Student a,Student b) {
		if(a.id>b.id)
		{
			return 1;
		}
		else if(a.id<b.id)
		{
			return -1;
			
		}
		else
		{
			return 0;
		}*/
		
	}


	

	

	
	
	
	


