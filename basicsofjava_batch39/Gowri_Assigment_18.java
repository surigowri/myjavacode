package basicsofjava_batch39;

public class Gowri_Assigment_18 {
		static void add() {
		       System.out.println("This is static add method");
			}
			static void sub() {
				System.out.println("This is static sub method");
			}
			void mul() {
				System.out.println("This is Non-static mul method");
			}
			void div() {
				System.out.println("This is Non-static div method");
			}
			Gowri_Assigment_18(){
				System.out.println("This is Constructor method");
			}
			public static void main(String[] args) {
				//program for 2 static,2 non-static,1 constructor
		add();
		sub();
		Gowri_Assigment_18 g1 = new Gowri_Assigment_18();
		g1.mul();
		g1.div();




		
			
			
			
		
	}

}
