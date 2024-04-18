package basicsofjava_batch39;
//// Assignment 58 - UpCast to Object
public class Gowri
{
	void add()
	{
     System.out.println("Gowri - Child to Object class method");
	}
	public static void main(String[] args)
	{

      Object obj = new Gowri();
      System.out.println(obj.getClass());
	}

}
