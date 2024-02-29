package basicsofjava_batch39;

import java.util.Arrays;

public class Gowri_Assigment_50 {

	public static void main(String[] args) {

		
		int array1[]= new int[3];
		
		array1[0] = 2;
		array1[1] = 6;
		array1[2] = 9;
		
		int array2[] = new int[array1.length];
		
		for(int i=0;i<3;i++)
		{
			array2[i] = array1[i];	
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));

	}

}
