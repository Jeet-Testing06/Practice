// Class 1 cont. Abstract Class

package practice_qs;

public class Class2 extends Class1 {
	
	
	public void add() {
		int a = 11;
		int b = 12;
		int c;
		c = a + b;
		System.out.println(c);
		
		
		
	}
	
	public static void main(String[] args) {
		Class2 obj = new Class2();
		obj.add();
		obj.display();
	}

}
