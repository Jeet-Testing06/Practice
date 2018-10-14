package practice_qs;

import java.util.Scanner;

public class Factorial {
	
	public void fact() {
		int a;
		
		Scanner jiten = new Scanner(System.in);
		
		System.out.println("Enter a number to find factorial");
	
		a = jiten.nextInt();
		
		int result = 1;
		for (int i = a; i>= 1; i--) {
			
			result = result * i;
			
			
		}
		System.out.println("Answer is: "+result);
		
		jiten.close();
	}
	
	public static void main(String[] args) {
		
		Factorial jitender = new Factorial();
		
		jitender.fact();
		
	}
	

}
