import java.util.ArrayList;
import java.util.Arrays;

public class toArrayfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> arr= new ArrayList<>();
     arr.add("Kavita");
     arr.add("Manoj");
     
     System.out.println(arr);
     
     String[] ls=arr.stream().toArray(size -> new String[size]);
    System.out.println(Arrays.toString(ls));
    
    String[] ls1 =arr.toArray(String[] :: new);
    System.out.println(Arrays.toString(ls1));
	}

}
