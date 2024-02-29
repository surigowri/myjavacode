package basicsofjava_batch39;

public class Gowri_Assigment_14 {

	public static void main(String[] args) {
	//OR with NOT
		int age = 19;
		int salary = 10000;	
		
		if(!(age>18 ||salary>7000))
		{
			System.out.println("Be Ready");
		}
		else
		{
			System.out.println("Not Ready");
		}	
	//AND with NOT	
		if(!(age<18 && salary>7000))
		{
			System.out.println("Be Ready");
		}
		else
		{
			System.out.println("Not Ready");
		}
		
		
	}

}
