package basicsofjava_batch39;

public class Ex_ThrowKeyword 
{

	public static void main(String[] args) 
	{

		try
		{
			throw new ArithmeticException();
		}
		catch(ArithmeticException a)
		{
			System.out.println("Handled exception inside catch block");
		}
	}

}
