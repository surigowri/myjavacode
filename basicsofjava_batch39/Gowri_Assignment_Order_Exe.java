package basicsofjava_batch39;

public class Gowri_Assignment_Order_Exe {

	
	static
	{
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");
	}
	Gowri_Assignment_Order_Exe(){
		System.out.println("Constructor");
	}
	Gowri_Assignment_Order_Exe(int a){
		System.out.println("Constructor parameterised");
	}
	public static void main(String[] args) {
		System.out.println("Main Method");
		new Gowri_Assignment_Order_Exe();
		new Gowri_Assignment_Order_Exe(6);
		
	}
}
