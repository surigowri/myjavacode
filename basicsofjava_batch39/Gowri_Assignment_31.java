package basicsofjava_batch39;
//Write a program for single level inheritance

class One
{
	static void mul()
	{
		System.out.println("mul");
	}
}
public class Gowri_Assignment_31 extends One{
	
	static void add()
	{
	System.out.println("add");
	}	
	static void sub()
	{
		System.out.println("sub");
	}	
	public static void main(String[] args)
	{		
	add();
	sub();
	mul();
}
}