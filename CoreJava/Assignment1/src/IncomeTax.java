import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double tax=0,CTC;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Annual income");
        
        CTC=sc.nextDouble();
        
        if(CTC<=180000) 
        	tax=0;
       
        else if(CTC>180000 && CTC<300000) 
        	tax=0.1*CTC;
        
        
        else if(CTC>300000 && CTC<500000) 
        	tax=0.2*CTC;
       
        
        else if(CTC>500000 && CTC<1000000)
        	tax=0.3*CTC;
    
        System.out.println("Annual Tax is"+tax);
  
	}
	}
