//Static Variable -- value changes at class level
//Non Static Variable -- value changes at object level

package practice_qs;

public class Class5 {

	static int a;
	public void increment() {
		
		a = a + 1;
		
		
		
	}
	
	public static void main(String[] args) {
		
		Class5 obj = new Class5();
		obj.increment();
		System.out.println(obj.a);
		obj.increment();
		System.out.println(obj.a);
			
		Class5 obj1 = new Class5();
		obj1.increment();
		System.out.println(obj.a);
		
	}
	
	
}
