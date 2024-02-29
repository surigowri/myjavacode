package basicsofjava_batch39;

public class Gowri_Assignment_20 {

	static void add()
	{
		int a = 100;
		int b = 200;
		System.out.println(a+b);
	}
	void sub()
	{
		int c = 500;
		int d = 50;
		System.out.println(c-d);
	}
	Gowri_Assignment_20()
	{
		int e = 40;
		int f = 8;
		System.out.println(e*f);
	}
	Gowri_Assignment_20(int g,int h)
	{
		int g1 = 50;
		int h1 = 500;
		System.out.println(g+h);
	}	
	public static void main(String[] args) {
		// Local Variables-Static,Non-Static,Const-Para, Non-Para
		add();
		Gowri_Assignment_20 c1 = new Gowri_Assignment_20();
		c1.sub();
		new Gowri_Assignment_20(50,500);

	}

}
