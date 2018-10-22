package practice_qs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_Java {
	
	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 5 elements of Queue");
		
		for (int i=0; i<5; i++)
		{
			q.add(s.nextInt());
		}
		
		System.out.println("Display Queue: "+q);
		
		int remov = q.remove();
		System.out.println("Removed Head: "+remov);
		
		System.out.println("New Queue after removing Head: "+q);
		
		int new_head = q.peek();
		System.out.println("New Head of the Queue is: "+new_head);
		
		System.out.println("New size of Queue: "+q.size());
		
		s.close();
		
	}

}
