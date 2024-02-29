package basicsofjava_batch39;
//checking method overridden with final keyword for class, method
 class Home
{
	void dress()
	{
		System.out.println("As you like it");
	}
}
class Office extends Home
{
	void dress()
	{
		System.out.println("Must follow dress code");
	}
}
public class CheckingFinalkeyword_Class_Methods extends Office{

	public static void main(String[] args) {
		CheckingFinalkeyword_Class_Methods ch = new CheckingFinalkeyword_Class_Methods();
		ch.dress();
	}

}
