package basicsofjava_batch39;
//In a string "mango" calculate how many are alpha & how many are numeric
public class Gowri_Assigment_48 {

	public static void main(String[] args) {
		String name = "mango";
		char c1[] = name.toCharArray();
		
		boolean ans = Character.isAlphabetic(c1[0]);
		System.out.println(ans);
		for (int i=0; i<=name.length()-1;i++)
		{
			boolean ans1 = Character.isAlphabetic(c1[i]);
		
		if (ans1==true)
		{
			System.out.println("IndexPosition of "+i+ " is"+" Alphabet");
		}
		else 
		{
			System.out.println("IndexPosition of "+i+ " is"+" Numeric");
		}
		
	}
	}
	}


