package basicsofjava_batch39;

public class Gowri_Assigment_17 {// program for method overloading
	static void m1(int a) {
		System.out.println("method 1");
	}
	static void m1(String m, double d) {
		System.out.println("method 2");
	}
	static void m1(char n, String g, boolean t) {
		System.out.println("method 3");
	}
	static void m1(String b) {
		System.out.println("method 4");
	}
	void m1(char c, int a) {
		System.out.println("method 5");
	}
	void m1(double b, int a) {
		System.out.println("method 6");
	}
	void m1(int s, double b) {
		System.out.println("method 7");
	}
	void m1(char c) {
		System.out.println("method 8");
	}
	public static void main(String[] args) {
		// program for method overloading
      m1(7);
      m1("gowri",5.60);
      m1('a',"static",false);
      m1("string");
      
      Gowri_Assigment_17 ga = new Gowri_Assigment_17();
      ga.m1('G', 10);
		ga.m1(7.99, 99);
		ga.m1(80, 100.1);
		ga.m1('R');
		
		
	}

}
