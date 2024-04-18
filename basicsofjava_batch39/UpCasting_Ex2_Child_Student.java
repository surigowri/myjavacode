package basicsofjava_batch39;
class UpCasting_Ex2_Teacher
{
	void add()
	{
		System.out.println("UpCasting_Ex2_Teacher class method - add");
	}
}
class UpCasting_Ex2_Mentor extends UpCasting_Ex2_Teacher
{
	void sub()
	{
		System.out.println("UpCasting_Ex2_Mentor class method - sub");
	}
}
public class UpCasting_Ex2_Child_Student extends UpCasting_Ex2_Mentor{
	void mul()
	{
		System.out.println("UpCasting_Ex2_Child_Student class method - mul");
	}
	public static void main(String[] args) {
		UpCasting_Ex2_Mentor m1 = new UpCasting_Ex2_Child_Student();
		m1.add();
		m1.sub();
	}

}
