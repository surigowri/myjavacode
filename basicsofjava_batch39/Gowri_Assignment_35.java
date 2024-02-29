package basicsofjava_batch39;
//program for method overriding 
class School_MR
{
	void books()
	{
	System.out.println("We should bring with us");	
	}
}
class college_MR extends School_MR
{
	void books()
	{
		super.books();
	System.out.println("Can be taken from Library");
	}
}
public class Gowri_Assignment_35 extends college_MR{
	public static void main(String[] args) {
		Gowri_Assignment_35 g35 = new Gowri_Assignment_35();
		g35.books();
	}

}
