
public class str2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Q1
		
     StringBuffer sb=new StringBuffer("String");
     
     sb=sb.append("  is a peer class of string ");
     
     sb.append("that provides much of");
     
     sb.append("the functionality of string");
     
     System.out.println(sb);
     
     
     //Q2
     
     StringBuffer sb2=new StringBuffer("It is used to at the specified index position");
     sb2.insert(14, "Insert text ");
     System.out.println(sb2);
    
     //Q3
     StringBuffer sb3=new StringBuffer("This methos return the reveesed object which was called");
     sb3.reverse();
     System.out.println(sb3);
     
     
     
	}

}
