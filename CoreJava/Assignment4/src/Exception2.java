import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	    float c = 0;
		try {
			System.out.println("Enter First no.");
			int a=sc.nextInt();
			
			System.out.println("Enter Second no.");
			int b=sc.nextInt();
			
			c = a/b;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			// System.out.println("bye");
			e.addSuppressed(e);
		}
	    
	    System.out.println("Division is"+c);
	}

}
