package practice_qs;

import java.util.Stack;

public class Stack_Java {

	public static void main(String[] args) {
		
		Stack<Integer> sta = new Stack<>();
		
		for (int i=0; i<5; i++)
		{
			
			sta.push(i);
			
		}
		
		
		System.out.println("Stack: "+sta);
		
		
		sta.pop();
		
		System.out.println("After removing top element: "+sta);
		
		System.out.println(sta.peek());
		
		System.out.println(sta.size());
		
		
	}
	
}
