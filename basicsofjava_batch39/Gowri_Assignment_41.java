package basicsofjava_batch39;
//program to check whether the given string is palindrome or not
public class Gowri_Assignment_41 {

	public static void main(String[] args) {
    
		String name = "refer";
		String reverse = "";
		
		for(int i=name.length()-1;i>=0; i--)
		
			reverse = reverse+name.charAt(i);
			System.out.println(reverse);
			
			if (name.equals(reverse))
			{
				System.out.println("The given string is palindrome");
			}
			else
			{
				System.out.println("OOPS,Its not a palindrome string");
			}
		
	}

}
