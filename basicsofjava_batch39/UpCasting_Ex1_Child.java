package basicsofjava_batch39;
class UpCasting_Ex1_Parent
{
	void add()
	{
		System.out.println("UpCasting_Ex1_Parent class method - add");
	}
}
public class UpCasting_Ex1_Child extends UpCasting_Ex1_Parent{
	void sub()
	{
		System.out.println("UpCasting_Ex1_Child class method - sub");
	}
	public static void main(String[] args) {

		
		UpCasting_Ex1_Parent p1 = new UpCasting_Ex1_Child();
		p1.add();
	}

}
