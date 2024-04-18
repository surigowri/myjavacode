package basicsofjava_batch39;
class UpCasting_Ex4_Teacher
{
	void add()
	{
		System.out.println("UpCasting_Ex4_Teacher class method - add");
	}
}
class UpCasting_Ex4_Mentor extends UpCasting_Ex4_Teacher
{
	void sub()
	{
		System.out.println("UpCasting_Ex4_Mentor class method - sub");
	}
}
class UpCasting_Ex4_ExpStudent extends UpCasting_Ex4_Mentor
{
	void mul()
	{
		System.out.println("UpCasting_Ex4_ExpStudent class method - mul");
	}
}
public class UpCasting_Ex4_Child_Student extends UpCasting_Ex4_ExpStudent {
	void div()
	{
		System.out.println("UpCasting_Ex4_Child_Student class method - div");
	}
	public static void main(String[] args) {

		UpCasting_Ex4_Mentor m1 = new UpCasting_Ex4_Child_Student();
		m1.add();
		m1.sub();
	}

}
