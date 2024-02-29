package basicsofjava_batch39;

public class Gowri_Assigment_11 {

	public static void main(String[] args) {
		// program to execute Nested if block-syntax1

		int a = 100;
		int b = 200;
		int c = 300;
		if (c>b)
		{
			if(a<c)
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("2");
			}
		}
		else
		{
			System.out.println("3");
		}
		
		if (c>b)
		{
			if(a>b)
			{
				System.out.println("a1");
			}
			else
			{
				System.out.println("a2");
			}
		}
		else
		{
			System.out.println("a3");
		}
		
		
		if(a==b)
		{
			if(a==c) 
			{
				System.out.println("b1");
			}
			else
			{
				System.out.println("b2");
			}
		}
		else
		{
			System.out.println("b3");
		}
	}
}
