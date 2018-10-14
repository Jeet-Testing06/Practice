package practice_qs;

import java.util.Scanner;

public class Fibonaci {

	
	public void fibo() {
		
		int a;
		int b = 0;
		int c = 1;
		int sum = 0;
		
		System.out.println("Enter a number till how long you want fibonaci series");
		
		Scanner jiten = new Scanner(System.in);
		
		a = jiten.nextInt();
		
		System.out.println(b);
		System.out.println(c);
		
		for (int i = 1; i <= a-2; i++) {
			
		sum = b + c;
		b = c;
		c = sum;
			System.out.println(sum);
			
		}
		
		
		
		jiten.close();
		
	}
	
	public static void main(String[] args) {
		
		Fibonaci jiten = new Fibonaci();
		jiten.fibo();
		
		
	}
	
	
	
	
}
