package basicsofjava_batch39;
//area & circumference-circle,triangle,square,rect&trape using scannerclass
import java.util.Scanner;

public class Gowri_Assignment_30 {

	    static int r ;
	   final static double pi =3.14 ;
	    static int length ;
		static int width;
		static int side;
		static int  A ;
		static int  B ;
		static int  C ;
		static int  D ;
		static int  H;
		static int a ;
		static int b ;
		static int c ;
		static int h ;
		
		
	    static void circle()
	    {
	    	Scanner s1 = new Scanner(System.in);
			r = s1.nextInt();
			double area_Circle = pi*r*r;
			System.out.println(area_Circle);

			double circumference_Circle = 2*pi*r;
			System.out.println(circumference_Circle);
	    }
	    
	    static void rectanangle()
	    {
	    	Scanner s2 = new Scanner(System.in);
			int length = s2.nextInt();
			int width = s2.nextInt();
			int area_Rectangle = length*width;
			System.out.println(area_Rectangle);
			
			int circumference_Rectangle = 2*length+2*width;
			System.out.println(circumference_Rectangle);
	    	
	    }
	    
	    static void square()
	    {
	    	Scanner s3 = new Scanner(System.in);
			int side = s3.nextInt();
			 int area_Square = side*side;
			System.out.println(area_Square);
			
			int circumference_Square = 4*side;
			System.out.println(circumference_Square);
	    }
	    
	    static void triangle()
	    {
	    	Scanner s5 = new Scanner(System.in);
			int a = s5.nextInt();
			int b = s5.nextInt();
			int c = s5.nextInt();
			int h = s5.nextInt();
			 int area_Triangle = (b*h)/2;
			System.out.println(area_Triangle);
			
			int circumference_Triangle = a+b+c;
			System.out.println(circumference_Triangle);
	    	
	    }
	    
	    static void trapezium()
	    {
	    	Scanner s4 = new Scanner(System.in);
			int A = s4.nextInt();
			int B = s4.nextInt();
			int C = s4.nextInt();
			int D = s4.nextInt();
			int H = s4.nextInt();
			 int area_Trapezium = (A+B)*H/2;
			System.out.println(area_Trapezium);
			
			int circumference_Trapezium = A*B+B*C+C*D+A*D;
			System.out.println(circumference_Trapezium);
	    }
	public static void main(String[] args) {

		circle();
		rectanangle();
		square();
		triangle();
		trapezium();
		
	}

}
