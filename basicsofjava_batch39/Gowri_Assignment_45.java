package basicsofjava_batch39;

import java.util.Arrays;
import java.util.Scanner;

//Create Array by getting the size of an array using Scanner class
public class Gowri_Assignment_45 {

	public static void main(String[] args) {

		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size = s1.nextInt();
		int myarray[]= new int[size];
		for(int i=0;i<myarray.length;i++)
		{	System.out.println("Enter the value :");
			myarray[i]= s1.nextInt();	            
		}
		System.out.println("Size of the array is :" + size);


	}

}
