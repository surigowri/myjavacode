package basicsofjava_batch39;

public class Check_Alpha_Num_Space {

	public static void main(String[] args) {
     String n = "James Bond 007";
     char c[] = n.toCharArray();
     
     int count_of_alpha = 0;
     int count_of_numbers = 0;
     int count_of_space = 0;
     
     for(int i=0;i<n.length();i++)
     {  
     boolean b1 = Character.isAlphabetic(c[i]);
     boolean b2 = Character.isDigit(c[i]);
     boolean b3 = Character.isSpaceChar(c[i]);
     if (b1 == true)
     {
    	 count_of_alpha++;
     }
   if(b2 == true)
   {
	   count_of_numbers++;
   }
   if(b3 == true)
   {
	   count_of_space++;
   }
     }
 	System.out.println("Count of alphabets in the given string is "+ count_of_alpha);
	System.out.println("Count of numbers in the given string is "+ count_of_numbers);
	System.out.println("Count of space in the given string is "+ count_of_space);

	}

}
