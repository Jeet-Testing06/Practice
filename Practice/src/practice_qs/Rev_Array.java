package practice_qs;

import java.util.Scanner;

public class Rev_Array {
	
	public static void main(String[] args) {
		
		int a[] = new int [5];
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter elements of array A");
		for (int i =0; i<5; i++)
		{
			a[i] = s.nextInt();
			
		}
		
		System.out.println("Array Looks like:");
		
		for (int i =0; i<5; i++)
		{
			System.out.println(a[i]);
		}
		
		int b[] = new int[5];
		
		for (int j=4; j>=0; j--)
		{
			
			b[j] = a[4-j]; 
			
		}
		
		System.out.println("New array B is:");
		
		for (int i=0; i<5; i++)
		{
			System.out.println(b[i]);
		}
		
		System.out.println("Now original array A after reversal is:");
		
		for (int i=0; i<5; i++)
		{
			a[i] = b[i];
		}
		
		for (int i=0; i<5; i++)
		{
			System.out.println(a[i]);
		}
		
		s.close();
		
	}

}
