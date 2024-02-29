package basicsofjava_batch39;
//program-multiplelevel inheritance with 4 parents using interface
interface One_1
{
	void area_Circle();
	void circum_Circle();	
}
interface Two 
{
	void area_Square();
	void circum_Square();
}
interface Three
{
	void area_Rect();
	void circum_Rect();
}
interface Four
{
	void area_Triangle();
	void circum_Triangle();
}
public class Gowri_Assignment_39 implements One_1,Two,Three,Four
{
public static void main(String[] args) {
	Gowri_Assignment_39 g39 = new Gowri_Assignment_39();
	g39.area_Circle();
	g39.circum_Circle();
	g39.area_Square();
	g39.circum_Square();
	g39.area_Rect();
	g39.circum_Rect();
	g39.area_Triangle();
	g39.circum_Triangle();
}	
	public void area_Circle() {
		System.out.println("Interface area_Circle method");
	}
	public void circum_Circle() {
		System.out.println("Interface circum_Circle method");
	}
	public void area_Triangle() {
		System.out.println("Interface area_Triangle method");
	}
	public void circum_Triangle() {
		System.out.println("Interface circum_Triangle method");
	}
	public void area_Rect() {
		System.out.println("Interface area_Rect method");
	}
	public void circum_Rect() {
		System.out.println("Interface circum_Rect method");
	}
	public void area_Square() {
		System.out.println("Interface area_Square method");
	}
	public void circum_Square() {
		System.out.println("Interface circum_Square method");
	}

}
