package practice_qs;

public class Merge_Array {
	
	public static void main(String[] args) {
		
		int a[] = {1, 2, 3};
		int b[] = {4,  5};
		
		int d = a.length + b.length;
		
		int c[] = new int [d];
		
		int z  =0;
		for (int i=0; i<a.length; i++)
		{
			c[i] = a[i];
			z++;
		}
		
		for (int i=0; i<b.length; i++)
		{
			c[z] = b[i];
			z++;
		}
		
		System.out.println("Merge Array: ");
		
		for (int i=0; i<c.length; i++)
		{
			System.out.println(c[i]);
		}
		
	}
	

}
