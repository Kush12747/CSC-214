import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregCalendar 
{
	public static void main(String[] args) 
	{
		//objects
		GregorianCalendar cal = new GregorianCalendar();
		GregorianCalendar kushBirthday = new GregorianCalendar(2002, Calendar.JULY, 6);
		
		int dayOfMonth = cal.get(Calendar.JULY);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int weekday = cal.get(Calendar.DAY_OF_WEEK);
		// 1 is Sunday, 2 is Monday, . . . , 7 is Saturday
		
		//prints the time after 10,000 days of my birthday
		kushBirthday.add(GregorianCalendar.DATE, 10000);
		System.out.println("10,000 days from my birthday is: " + kushBirthday.getTime());
		     
		//prints 100 days from today
		cal.add(GregorianCalendar.DATE, 100);
		System.out.println("\n100 days from today is: " + cal.getTime());
		
		//printing the weekday of my birthday
		System.out.println("\nThe weekday of my birthday is: " + kushBirthday.get(GregorianCalendar.DAY_OF_WEEK));
	}

}
