/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar0 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
	   if ((year % 400 == 0) || (year % 4 ==0))
	   {
	   	return true; 
	   }
		return false;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	public static int nDaysInMonth(int month, int year) {
		// Replace the following statement with your code
		boolean leap = isLeapYear(year); 
			if (month == 1) return 31;
			if (month ==2)
			{
				if (leap == true) return 29;
				else return 28;
			}
			if (month == 3) return 31;
			if (month == 4) return 30;
			if (month == 5) return 31;
			if (month == 6) return 30;
			if (month == 7) return 31;
			if (month == 8) return 31;
			if (month == 9) return 30;
			if (month == 10) return 31;
			if (month == 11) return 30;
			if (month == 12) return 31;
			return 0;
			}
		

	public static void main(String args []) {

		int a = Integer.parseInt(args[0]);
	
		if ( isLeapYear(a) == true)
		{
			System.out.println(a+ " is a leap year");
		}
		else 
		{
			System.out.println(a+ " is a common");
		}
		System.out.println("month 1 has 31 days");
		System.out.println("month 2 has "+nDaysInMonth(2,a)+" days");
		System.out.println("month 3 has 31 days");
		System.out.println("month 4 has 30 days");
		System.out.println("month 5 has 31 days");
		System.out.println("month 6 has 30 days");
		System.out.println("month 7 has 31 days");
		System.out.println("month 8 has 31 days");
		System.out.println("month 9 has 30 days");
		System.out.println("month 10 has 31 days");
		System.out.println("month 11 has 30 days");
		System.out.println("month 12 has 31 days");
	}
}




		 
   
	