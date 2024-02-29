package basicsofjava_batch39;

import java.util.Scanner;

public class Gowri_Assigment_52 {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		int number = s1.nextInt();
		
		int factorial_num = 1;
		
		for(int i=6;i>=1;i--)
		{
			System.out.println(i);
		factorial_num = factorial_num*i;
	
		}
			System.out.println(factorial_num);
	}


}
