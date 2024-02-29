package basicsofjava_batch39;

public class Gowri_Assigment_16 {
	public static void main(String[] args) {
		//program to execute Nested if block-syntax2
		int age = 21;
		String gender1 = "Male";
		String gender2 = "Female";
		if (gender1=="Male")
		{
			if(age>18)
			{
				System.out.println("Male Eligible to vote");
			}
			else
			{
				System.out.println("Not Eligible to vote");
			}
		}
		else
		{
			System.out.println("This is Female");
		}


		if (gender2=="Female")
		{
			if(age>18)
			{
				System.out.println("Female Eligible to vote");
			}
			else
			{
				System.out.println("Not Eligible to vote");
			}
		}
		else
		{
			System.out.println("This is Male");
		}
	}

}
