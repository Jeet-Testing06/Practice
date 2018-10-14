//// Class 3 cont. Interface Class

package practice_qs;

public class Class4 implements Class3 {

	public void add() {
		int a = 10;
		int b = 10;
		int c = a + b;
		System.out.println(c);
		
	}	
	
	public void sub() {
		int a = 20;
		int b = 10;
		int c = a - b;
	System.out.println(c);
		
	}
	
	
	public static void main(String[] args) {
		
	Class4 obj = new Class4();
	obj.add();
	obj.sub();
		
	}
	
}
