//Static variable and static method and their calling

package practice_qs;

public class Class6 {
	
	static int a = 11;
	
	public static void add() {
		
		System.out.println("This is static method");
			
	}
	
	public static void main(String[] args) {
		
		Class6 obj = new Class6();
		obj.add();
		System.out.println(Class6.a);
		
		Class6.add();
		
		add();
			
	}
	
}