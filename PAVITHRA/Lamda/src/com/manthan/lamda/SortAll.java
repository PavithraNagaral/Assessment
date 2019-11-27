package com.manthan.lamda;

import java.util.Comparator;

public interface SortAll
{
	Comparator<Student> id=(o1,o2)->
	{
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
	Comparator<Student> p=(o1,o2)->
	{
		if(o1.per>o2.per)
		{
			return 1;
		}
		else if(o1.per<o2.per)
		{
			return -1;
		}
		return 0;
	};
	
	Comparator<Student> n=(o1,o2)->{
		return o1.name.compareTo(o2.name);
	};
	
	

}
