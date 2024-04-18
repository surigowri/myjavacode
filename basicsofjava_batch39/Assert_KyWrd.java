package basicsofjava_batch39;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Assert_KyWrd
{

	public static void main(String[] args)
	{

		int ageofkids[] = new int[3];	
		ageofkids[0] = 8;
		ageofkids[1] = 6;
		ageofkids[2] = 9;
		
		int ageofparents[] = new int[3];
		ageofparents[0] = 30;
		ageofparents[1] = 32;
		ageofparents[2] = 33;
		
		assert Array.getLength(ageofkids)>1;
		
		boolean ans = Arrays.equals(ageofkids, ageofparents);
		
		System.out.println(ans);
	}

}
