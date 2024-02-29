package basicsofjava_batch39;
//program to call parent class constructor using super calling statement

class Gr_Parent_SCS
{
	Gr_Parent_SCS()
	{
		System.out.println("Super calling statement Gr_Parent Cons");
	}
}
class Parent_SCS extends Gr_Parent_SCS
{
	Parent_SCS()
	{
		System.out.println("Super calling statement Parent Cons");	
	}
}
public class Gowri_Assignment_34_Ch_SCS extends Parent_SCS {
	Gowri_Assignment_34_Ch_SCS()
	{
		System.out.println("Super calling statement Child Cons");
	}
public static void main(String[] args) {
	
	new Gowri_Assignment_34_Ch_SCS();
	
}
}
