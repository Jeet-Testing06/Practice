package practice_qs;

import java.util.Scanner;

public class Swapping {
	
	public static void main(String[] args) {
		
		System.out.println("Enter value of a");
			
			Scanner s = new Scanner (System.in);
				int a = s.nextInt();
			
			System.out.println("Enter value of b");
				int b = s.nextInt();
				
				int c;
				c=a;
				a=b;
				b=c;
				
			System.out.println("Change value of a is: "+a);
			System.out.println("Change value of b is: "+b);
		
	}
	
	
}
