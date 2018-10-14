package practice_qs;

public class Child extends Parent {
	
	public Child() {
		super (1,1);
		System.out.println("child default");
	}
	public Child(int a) {
this();
		System.out.println("child 1 default");
	}
	public Child(int a, int b) {
	this(1);
		System.out.println("child 2 default");
	}
	public Child(int a, int b, int c) {
		this(1, 1);
		System.out.println("child 3 default");

	}
	
	
	public static void main(String[] args) {
		
		Child obj = new Child(1, 1, 1);
		
	}
	
	
	

}
