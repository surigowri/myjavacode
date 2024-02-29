package basicsofjava_batch39;

public class Gowri_Assigment_51 {

	public static void main(String[] args) {
    String name = "Gowri Neelu";
    char c1[] = name.toCharArray();
    int count_of_alpha = 0;
    int count_of_space = 0;
    
    for(int i=0; i<name.length();i++)
    {
    boolean ans1 = Character.isAlphabetic(c1[i]);
    boolean ans2 = Character.isSpaceChar(c1[i]);
    if (ans1 == true)
    {
    	count_of_alpha++;
    }
    if (ans2 == true)
    {
    	count_of_space++;
    }
    }
    	System.out.println("Count of alphabets in the given string is "+ count_of_alpha);
    	System.out.println("Count of space in the given string is "+ count_of_space);

    
    
		
		
		
		
		
	}

}
