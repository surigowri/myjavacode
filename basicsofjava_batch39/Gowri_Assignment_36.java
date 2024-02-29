package basicsofjava_batch39;


//program using this keyword to assign the value of a 
//LV(local variable) to GV(global variable)
public class Gowri_Assignment_36 {
	int id;
	String name;
	double salary;
	void emp(int id,String name,double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public static void main(String[] args) 
	{
		Gowri_Assignment_36 g1 = new Gowri_Assignment_36();
		g1.emp(21, "Jio", 999.00);
		System.out.println(g1.id);
		System.out.println(g1.name);
		System.out.println(g1.salary);
	}
}
