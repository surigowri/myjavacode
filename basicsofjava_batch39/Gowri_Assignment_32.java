package basicsofjava_batch39;
//program-multilevel inheritance by creating different class
public class Gowri_Assignment_32  extends Gowri_Assignment_32_Parent{
 
	void mod()
	{
		System.out.println("Multilevel Inheritance child class mod method");
	}
	public static void main(String[] args) {

		Gowri_Assignment_32 g32 = new Gowri_Assignment_32();
		g32.add();
		g32.sub();
		g32.mul();
		g32.div();
		g32.mod();
		
	}

}
