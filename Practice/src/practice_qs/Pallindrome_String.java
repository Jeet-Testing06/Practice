package practice_qs;

import java.util.Scanner;

public class Pallindrome_String {
	
	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1 = s.next();
		System.out.println("String is: "+s1);
		
		StringBuilder s2 = new StringBuilder(s1);
		
		StringBuilder s3 = s2.reverse();
		
		String s4 = s3.toString();
		
		if (s1.equalsIgnoreCase(s4))
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not Pallindrome");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		s.close();
	}

}
