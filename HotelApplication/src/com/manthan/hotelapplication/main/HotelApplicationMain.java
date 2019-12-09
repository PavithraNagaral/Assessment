package com.manthan.hotelapplication.main;

import java.util.Scanner;

import com.manthan.hotelapllication.bean.HotelApplicationBean;
import com.manthan.hotelapplication.dao.HotelApplicationImp;

public class HotelApplicationMain {

	public static void main(String[] args) {
		
		HotelApplicationBean hb = new HotelApplicationBean();
		HotelApplicationImp hi = new HotelApplicationImp();
		
		String a;
		System.out.println("press 1 to show all food items");
		System.out.println("press 2 to take order from customers");
		System.out.println("press 3 to operate on food items");
		System.out.println("press 4 to total bill of the day");
		
		Scanner sc = new Scanner(System.in);
		int i=0;
		i= sc.nextInt();
		
		switch(i) {
		case 1: hi.seeAllitems();
		        break;
		        
		case 2:System.out.println("enter the food item code");
			   int ic3=sc.nextInt();
			   sc.nextLine();
			   System.out.println("enter the food name");
               String fn1 = sc.nextLine();
               System.out.println("enter the price");
			   int ic4=sc.nextInt();
			   sc.nextLine();
		       break;
			
		case 3:	System.out.println("press A to add food items");
	            System.out.println("press B to remove food items");
		        System.out.println("press C to modify food item");
	    
		        a=sc.next();
		        sc.nextLine();
		     switch(a) {
		          case "A": hi.additem(hb);
	            	        break;
			
			      case "B": System.out.println("enter the food item code");
			                int ic2 = sc.nextInt();
			                hi.deleteitem(ic2);
			                break;
		
			     case "C": System.out.println("enter the food item code");
			               int ic1 = sc.nextInt();
			               sc.nextLine();
			               System.out.println("enter the food name");
			               String fn = sc.nextLine();
			    	       hi.updateitem(ic1,fn);
			               break;
			  default : break;
		     }
		     break;   
		     
	   case 4:hi.totalbill();
	          break;
		     
	   default:break;      
		
	     }//end of switch
		
	}//end of main method

}//end of class
