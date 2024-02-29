package basicsofjava_batch39;

import java.util.Arrays;

//Create an array with double and Boolean data types
public class Gowri_Assignment_43 {

	public static void main(String[] args) {

		double salary[]= new double[4];
		
		salary[0]= 50000 ;
		salary[1]= 25000 ;
		salary[2]= 40000 ;
		salary[3]= 35000 ;
		Arrays.sort(salary);
		
	String answer =	Arrays.toString(salary);
	System.out.println(answer);
	
	boolean attendance[] = new boolean[4];
	
	attendance[0] = true;
	attendance[1] = false;
	System.out.println(Arrays.toString(attendance));
	
		
	}

}
