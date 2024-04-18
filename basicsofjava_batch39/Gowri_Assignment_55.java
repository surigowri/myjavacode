package basicsofjava_batch39;

//print 1 to 1000 if no%3 print sun of no%5 print moon if by both print sun,moon

public class Gowri_Assignment_55 
{

	public static void main(String[] args)
	{

		for(int i=1;i<=1000;i++)
		{
			if (i%3 ==0)
			{
				System.out.println(i+" Sun");
			}
		}
		
		for(int i=1;i<=1000;i++)
		{
			if (i%5 ==0)
			{
				System.out.println("Moon");
			}
		}
		for(int i=1;i<=1000;i++)
		{
			if ((i%3&5) ==0)
			{
				System.out.println("Sun,Moon");
			}
		}
	}

}
