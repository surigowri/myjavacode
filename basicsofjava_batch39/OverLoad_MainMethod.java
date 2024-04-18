package basicsofjava_batch39;

public class OverLoad_MainMethod
{
	public static void main(String[] args)
	{
         System.out.println("Main method with String array parameter is called");
	        main(10);
	        main('R');
	        main("Ram");
	     //   main("mango", 99);
	    }
	

	    public static void main(int x) 
	    {
	       
	    	System.out.println("Main method with int parameter called: " + x);
	    }
	    
	    public static void main( char j)
	    {
	    	
	    	System.out.println("Main method with char parameter called: " + j);
	    }
	    
	    public static void main(String name)
	    {
	    	
	    	System.out.println("Main method with char parameter called: " + name);
	    }
	    
//	    public static void main(String fruit, int i)
//	    {
//	    	
//	    	System.out.println("Main method with char parameter called: " + fruit , i);
//	    }
	}


