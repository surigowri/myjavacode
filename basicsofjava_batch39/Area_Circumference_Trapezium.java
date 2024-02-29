package basicsofjava_batch39;

public class Area_Circumference_Trapezium {

	static int  A = 10;
	static int  B = 20;
	static int  C = 15;
	static int  D = 15;
	static int  h = 10;
	
	public static void main(String[] args) {

		int area_Trapezium = (A+B)*h/2;
		System.out.println(area_Trapezium);
		
		int circumference_Trapezium = A*B+B*C+C*D+A*D;
		System.out.println(circumference_Trapezium);
	}

}
