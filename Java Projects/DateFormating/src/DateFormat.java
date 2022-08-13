import java.util.Scanner;

//this class prints out invalid month when called
class MonthException extends Exception {
	public MonthException(String message) {
		super(message);
	}
	public MonthException() {
		super("Invalid month number!");
	}
}

//this class prints out invalid day when called
class DayException extends Exception {
	public DayException(String message) {
		super(message);
	}
	public DayException() {
		super("Invalid day number!");
	}
}

public class DateFormat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String monthName = ""; //sets the name of the month
		System.out.print("Enter date in the format mm/dd: ");
		String date = input.nextLine();
		
		//take input as a string and substring to take the and then
		//use parseInt method to make them integers
		String monthNum = date.substring(0, 2);
		int month = Integer.parseInt(monthNum);
		
		String dayNum = date.substring(3, date.length());
		int day = Integer.parseInt(dayNum);
		
		//exceptions of whatever date has been entered by the user for month
		try {
			if (month < 1 || month > 12) {
				throw new MonthException();
			}
		} catch (Exception e) {
			System.out.println(e);
			System.exit(0);
		}
		
		//exceptions of whatever date has been entered by the user for days
		try {
			if (month == 2 && (day < 1 || day > 28)) {
				
				throw new DayException();
				
			} else if ((month == 1 || month == 3 || month == 5 || month == 6 || month == 8 
					    || month == 10 || month == 12) && (day < 1 || day > 31)) {
				
				throw new DayException();
				
			} else if ((month == 4 || month == 7 || month == 9 || month == 11) && 
					  (day < 1 || day > 30)) {
				
				throw new DayException();
			}
		} catch (Exception e) {
			System.out.println(e);
			System.exit(0);
		}
		
		//takes the day number from parseInt to set the month names
		switch (month) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
			break;
		}
		//print out the final result if everything passes
		System.out.println(monthName + " " + day);
	}
}