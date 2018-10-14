package practice_qs;

public class Parent {
	
	public Parent() {
		this(1,1,1);
		System.out.println("Parent default");
		
	}
	public Parent(int a) {
		this();
		System.out.println("Parent 1 default");
		
	}
	public Parent(int a, int b) {
		this(1);
		System.out.println("Parent 2 default");
		
	}
	public Parent(int a, int b, int c) {
		System.out.println("Parent 3 default");
		
	}
	
	
	

}
