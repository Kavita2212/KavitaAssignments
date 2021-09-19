import java.util.Scanner;

public class AVG_Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int A,B,C,i;
       Scanner sc=new Scanner(System.in);
       for(i=0;i<3;i++) {
    	   A=sc.nextInt();
    	   B=sc.nextInt();
    	   C=sc.nextInt();
    	   
    	   int total=A+B+C;
    	   int avarage=total/3;
    	   
    	   System.out.println("Total is:" +total);
    	   System.out.println("Avarage is:" +avarage);
       }
	}

}
