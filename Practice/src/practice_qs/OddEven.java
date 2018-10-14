package practice_qs;

import java.util.Scanner;

public class OddEven {
	
	public void OdEv() {
		
		int a;
		
		Scanner jiten = new Scanner(System.in);
		
		System.out.println("Enter a number to find out it is even or odd");
		
		a = jiten.nextInt();
		
		if(a%2 == 0) {
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
		
		jiten.close();
		
	}
	
	
	public static void main(String[] args) {
		
		OddEven jiten = new OddEven();
		jiten.OdEv();
		
		
	}
	
	
	

}
