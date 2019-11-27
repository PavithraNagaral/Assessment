package com.manthan.main;
import java.util.Scanner;
import com.manthan.bean.Musicbean;
import com.manthan.imp.Musicimp;

public class Musicmain {
	public static void main(String[] args) {
		
	
			Musicbean mb=new Musicbean();
			Musicimp mi=new Musicimp();
			
			String a,b;
			Scanner sc=new Scanner(System.in);
			System.out.println("1 to search song");
			System.out.println("2 to play song");
			System.out.println("3 to show all song");
			System.out.println("4 to operate on song");
			System.out.println("Choice");
			
			int i=0;
			i=sc.nextInt();
			
			switch(i){
			     case 1: System.out.println("search the song");
			             System.out.println("enter the song id");
			             long songid1=sc.nextLong();
			             sc.nextLine();
			             mi.search(songid1);
			             break;
				case 2:	System.out.println("A to play song");
					    System.out.println("B to play all");
						System.out.println("Choice");
					    
						a=sc.next();
						sc.nextLine();
						switch(a) {
						case "A": 	System.out.println("enter song title");
						            String songname=sc.next();
						            sc.nextLine();
						            mi.play1(songname);
						            break;
						
						case "B":	mi.playAll();
									break;
										
						default : 	break;
						}
				
				case 3: System.out.println("show all songs");
						mi.showAll();
						break;
						
				case 4:	System.out.println("press A to add songs on repository");
						System.out.println("press B to edit an existing song");
						System.out.println("press C to delete an existing song");
						System.out.println("enter your choice");
						b=sc.next();
						switch(b) {
						case "A": mi.add(mb);
									break;
						case "B": mi.edit(mb);
									break;
						case "C": mi.del(mb);
									break;
						default : break;
						
						}
					
				}
	}
}
	