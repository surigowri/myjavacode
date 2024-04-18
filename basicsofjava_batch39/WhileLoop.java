package basicsofjava_batch39;

public class WhileLoop
{

	public static void main(String[] args) 
	{

		int a = 10;
		while (a>5)
		{
			System.out.println("This is while loop");
			a--;
		}
		
		// infinite loop
		
		int i = 10;
		while (i>5)
		{
			System.out.println("This is while loop");
			i++;
		}
	}

}
