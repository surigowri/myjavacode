package basicsofjava_batch39;
class UpCasting_Ex3_Teacher
{
	void add()
	{
		System.out.println("UpCasting_Ex3_Teacher class method - add");
	}
}
class UpCasting_Ex3_Mentor extends UpCasting_Ex3_Teacher
{
	void sub()
	{
		System.out.println("UpCasting_Ex3_Mentor class method - sub");
	}
}
public class UpCasting_Ex3_Child_Student extends UpCasting_Ex3_Mentor {
	void mul()
	{
		System.out.println("UpCasting_Ex3_Child_Student class method - mul");
	}
	public static void main(String[] args) {
		UpCasting_Ex3_Teacher t1 = new UpCasting_Ex3_Child_Student();
         t1.add();
        
	}

}
