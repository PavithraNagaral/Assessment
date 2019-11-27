package com.manthan.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class B {
	public static void main(String[] args) {
		LocalDateTime ld=LocalDateTime
				.now();
		
		DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm a");
		String res=dt.format(ld);
		System.out.println(res);
	}

}
