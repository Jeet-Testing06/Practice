package practice_qs;

import java.util.Scanner;

public class StringHandling {
	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
				
		System.out.println("Enter a string");
				
		
		String s1 = s.next();
		
		char[] inp  = s1.toCharArray();
		
		int a =0;
		for (int i = 0; i < s1.length(); i++) {
			   for (int j = i + 1; j < s1.length(); j++) {
			    if (inp[i] == inp[j]) {
			     System.out.println(inp[j]);
			     a++;
			     break;
		}
		
	}	
		}
		System.out.println(a);
		
		
	}
}
