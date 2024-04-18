package basicsofjava_batch39;
class DownCasting_Ex4_Teacher
{
	void add()
	{
		System.out.println("DownCasting_Ex4_Teacher class method - add");
	}
}
class DownCasting_Ex4_Mentor extends UpCasting_Ex4_Teacher
{
	void sub()
	{
		System.out.println("DownCasting_Ex4_Mentor class method - sub");
	}
}
class DownCasting_Ex4_ExpStudent extends UpCasting_Ex4_Mentor
{
	void mul()
	{
		System.out.println("DownCasting_Ex4_ExpStudent class method - mul");
	}
}
public class DownCasting_Ex4_Child_Student {
	void div()
	{
		System.out.println("DownCasting_Ex4_Child_Student class method - mul");
	}
	public static void main(String[] args) {
		DownCasting_Ex4_Mentor d1 = (DownCasting_Ex4_Mentor)   DownCasting_Ex4_Child_Student();
	}
	private static DownCasting_Ex4_Mentor DownCasting_Ex4_Child_Student() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
