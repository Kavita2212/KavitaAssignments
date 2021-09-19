class Animal{
	int age;
	char name;
	
	void show()
	{
		System.out.println("All Animal Display");
	}
}

class dog extends Animal{
	void bark()
	{
		System.out.println("Dogs are barking");
	}
}
 class cat extends 


public class OppsDemo {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      dog d=new dog();
      Animal a=new Animal();
      
      d.show();
      a.show();
	}


}