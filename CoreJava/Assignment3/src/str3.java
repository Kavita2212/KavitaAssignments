
public class str3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StringBuilder buil= new StringBuilder("String");
     
     buil=buil.append("  is a peer class of string ");
     
     buil.append("that provides much of");
     
     buil.append("the functionality of string");
     
     System.out.println(buil);
     
  
//Q2
     
     StringBuilder sb2=new StringBuilder("It is used to at the specified index position");
     sb2.insert(14, "Insert text ");
     System.out.println(sb2);
    
     //Q3
     StringBuilder sb3=new StringBuilder("This methos return the reveesed object which was called");
     sb3.reverse();
     System.out.println(sb3);
     
	}

}
