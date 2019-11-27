package com.manthan.lamda;

import java.util.Comparator;

public class C {

	public static void main(String[] args) {
		Comparator<Student> s=(o1,o2)->{
			if(o1.id>o2.id)
			{
				return 1;
			}
			else if(o1.id<o2.id)
			{
				return -1;
			}
			return 0;
		};
	}

}
