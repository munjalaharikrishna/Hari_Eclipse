package Selenium_1;

import java.util.Scanner;

public class modulus {
	
	void name() {
		
	
	Scanner s = new Scanner(System.in);
	
	long a = s.nextLong();
	
	
	
	if(a/2*2==a) {
		
		System.out.println("even number");
	}
	else {
		System.out.println("not a even number");
	}
	}
	
	public static void main(String args[]) {


		modulus m = new modulus();
		m.name();
		
		
		
		

	}

}
