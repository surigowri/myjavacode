package basicsofjava_batch39;

public class Gowri_Assigment_49 {

	public static void main(String[] args) {
    String s = "Eat food & drink 1 ltr - water";
    char c[] = s.toCharArray();
    
    int count_of_alpha = 0;
    int count_of_numbers = 0;
    int count_of_space = 0;
    int count_of_spchar = 0;
    
    for (int i=0;i<s.length();i++)
    {
    	boolean b = Character.isAlphabetic(c[i]);
    	boolean b1 = Character.isDigit(c[i]);
    	boolean b2 = Character.isSpaceChar(c[i]);
    	if (b == true)
    	{
    		count_of_alpha++;
    	}
    	if (b1 == true)
    	{
    		count_of_numbers++;
    	}
    	if (b2== true)
    	{
    		count_of_space++;
    	}
    }
     	System.out.println("Count of alphabets in the given string"
     			+ " is "+ count_of_alpha);
    	System.out.println("Count of numbers in the given string "
    			+ "is "+ count_of_numbers);
    	System.out.println("Count of space in the given string is "
    			+ ""+ count_of_space);
    	
     	int Count_of_spchar = s.length()-(count_of_alpha+
     			count_of_numbers+count_of_space);

     	System.out.println("Count of spchar in the given string"
     			+ " is " + count_of_spchar);
	}

}
