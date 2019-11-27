package com.manthan.oct18b;

public class Crush {
	void receive(Phone p) {
		if(p instanceof MI) {
			System.out.println(" brother");
		}
		else if(p instanceof Pixel) {
			System.out.println("dear");
		}
		
		else if(p instanceof IPhone) {
			System.out.println(" iiiiii");
		}
		
		else {
			System.out.println("byeeee");
		}
	}

}
