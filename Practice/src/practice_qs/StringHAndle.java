package practice_qs;

import java.util.Scanner;

public class StringHAndle {
	
	
	public static void main(String[] args) {

		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter name");
		
		String s1 = s.next();
		int a=0;
		
		for (int i=0;i<s1.length();i++)
		{
			
			for(int j=i+1; j<s1.length();j++)
			{
				
				if(s1.charAt(i) == s1.charAt(j))
				{
					
					a++;
					
					System.out.println(s1.charAt(j));
					break;
					
				}
				
				
				
				
				
			}
			
			
			
					}
		
		
		
		
		
		System.out.println(a);
		
				
				
				}
	


}
