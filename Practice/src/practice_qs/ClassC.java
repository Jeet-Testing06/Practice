package practice_qs;

public class ClassC extends ClassA {

	public void arithmetic() {
		
		System.out.println("I am method");
		
	}
	
	public static void main(String[] args) {
		ClassC obj = new ClassC();
		obj.arithmetic();
		obj.display();
	}
}
