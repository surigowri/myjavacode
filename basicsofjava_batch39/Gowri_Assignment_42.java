package basicsofjava_batch39;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//program to get 10 days before the current time,
//10 days after the current time using Date Class
public class Gowri_Assignment_42 {

	public static void main(String[] args) {

		Date d1 = new Date();
		System.out.println(d1.getTime());//epoch time

		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
		

		Date d3 = new Date(d2.getTime() - (1000 * 60 * 60 * 24 * 10)); 
		System.out.println( d3.toString());
		
		//Another method
		Date myDate = new Date();
		System.out.println( myDate.toString());

		Date afterTendays = new Date(d1.getTime()+1000 * 60 * 60 * 24 * 10);
		System.out.println(afterTendays);

		Date tenDaysBefore = new Date(myDate.getTime() - (1000 * 60 * 60 * 24 * 10)); 
		System.out.println( tenDaysBefore.toString());
	}


}
