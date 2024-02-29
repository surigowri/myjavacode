package basicsofjava_batch39;

import java.util.Arrays;

public class Gowri_Assigment_46 {

	public static void main(String[] args) {

		String name1 = "listen";
		String name2 = "silent";

		if (name1.length()!=name2.length())
		{
			System.out.println(" Not anagrams");
		}
		else
		{
			char n1[] = name1.toCharArray();
			char n2[] = name2.toCharArray();
			Arrays.sort(n1);
			Arrays.sort(n2);

			System.out.println(Arrays.toString(n1));
			System.out.println(Arrays.toString(n2));
			boolean n3 = Arrays.equals(n1, n2);

			System.out.println(n3);
			if(n3)
			{
				System.out.println("Its Anagram");
			}
			else
			{
				System.out.println("not anagram");
			}
		}
	}

}
