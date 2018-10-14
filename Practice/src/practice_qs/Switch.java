package practice_qs;

public class Switch {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		int z;
		
		char c = '*';
		
		
		switch (c) {
		case '+':
			z=a+b;
			System.out.println("Addition is: "+z);
			break;

		case '-':
			z=a-b;
			System.out.println("Subtraction is: "+z);
			break;
			
		case '*':
			z=a*b;
			System.out.println("Multiplication is: "+z);
			break;
			
		case '/':
			z=a/b;
			System.out.println("Division is: "+z);
			break;
			
		default:
			System.out.println("Invalid Opeartor");
			break;
		}	
		
	}

}