package basicsofjava_batch39;
//Assignment 59
public class Try_Catch_Finally 
{

	public static void main(String[] args)
	{
		try {
            int[] numbers = {1, 2, 3};
            int index = 4;
            int result = numbers[index];
            System.out.println("Result: " + result);
        } 
		catch (ArrayIndexOutOfBoundsException e) 
		{
            System.out.println("Array index out of bounds exception occurred.");
        } 
		catch (ArithmeticException e) 
		{
            System.out.println("Arithmetic exception occurred.");
        } 
		catch (NullPointerException e)
		{
            System.out.println("Null pointer exception occurred.");
        }
		catch (IllegalArgumentException e) 
		{
            System.out.println("Illegal argument exception occurred.");
        } 
		catch (ClassCastException e) 
		{
            System.out.println("Class Cast exception occurred.");
        }
		finally 
		{
            System.out.println("Finally block executed.");
        }
	}

}
