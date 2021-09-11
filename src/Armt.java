import java.util.Scanner;

public class Armt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a,n,count=0;
        System.out.println("Enter number");
        Scanner scan= new Scanner(System.in);
        a=scan.nextInt();
        n=a;
        while(n>0) {
        	count=count+1;
        	n=n/10;
        	
        }
        
       System.out.println("Total digit is"+count);
        
	}

}
