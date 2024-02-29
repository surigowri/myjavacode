package basicsofjava_batch39;
//program-abstractclass,abstract method,concrete class,concrete method

abstract class ABC //exposed
{
	abstract void add();
	abstract void sub();

	void mul()//concrete method
	{
		System.out.println("For Concrete method - Reallogic mul method");
	}
	void div()
	{
		System.out.println("For Concrete method - Reallogic div method");
	}
}
public class Gowri_Assignment_37 extends ABC
{
	void add()//concrete method
	{
		System.out.println("For Concrete method - Reallogic add method");
	}
	
	public static void main(String[] args) //concrete method
	{
		Gowri_Assignment_37 g37 = new Gowri_Assignment_37();
		g37.add();
		g37.sub();
		g37.mul();
		g37.div();
	}

	void sub() {
		System.out.println("For Concrete method - sub method");
	}

}
