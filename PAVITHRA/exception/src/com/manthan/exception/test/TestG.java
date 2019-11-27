package com.manthan.exception.test;

import java.io.File;
import java.io.IOException;

public class TestG {

	public static void main(String[] args) {
		System.out.println("main started");
		
		File f=new File("p.txt");
		try {
			f.createNewFile();
			System.out.println("created");
		}
		catch(IOException ie)
		{
			System.out.println("sorry");
		}
		
		System.out.println("ended");
	}

}
