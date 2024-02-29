package basicsofjava_batch39;

import java.util.Arrays;
import java.util.Scanner;

//Create an array of length 3 of int datatype and add its value at the runtime
public class Gowri_Assignment_44 {

	public static void main(String[] args) {
		int num[]= new int[3];
		Scanner s1 = new Scanner(System.in);

		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the data :");
		num[i]=s1.nextInt();
		}
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
	}

}
