package basicsofjava_batch39;

public class This_Keyword
{

	int age = 10;
	String name = "Sachin";
	
	void newDemo(int age, String name)
	{
		this.age = age;
		this.name = name;
		System.out.println("To check this keyword");
	}
	public static void main(String[] args)
	{
		This_Keyword t1 = new This_Keyword();
		t1.newDemo(18,"Tendulkar");
		System.out.println(t1.age);
		System.out.println(t1.name);
		
	}

}
