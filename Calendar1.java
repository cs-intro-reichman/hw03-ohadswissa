/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;;
	static int dayOfWeek = 1;    
	static int nDaysInMonth = 31; 
	//function that gets an unt argument and a year argument and gives back the number of the days in this month
	public static int nDaysInMonth(int month, int year) {

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
//function that prints a date in the right order
	private static void printDate() {
            System.out.println(dayOfMonth + "/" + month + "/" + year);
    }
		
//gets back if a year is a loop year
	public static boolean isLeapYear(int year) {
	   if ((year % 400 == 0) || (year % 4 ==0))
	   {
	   	return true; 
	   }
		return false;
	}
//advane parameters at each end of month 
	private static void advance() {
		
		if (month == 12) 
		{
		  dayOfMonth = 1;   
	      month = 1;
	      year += 1;
	      dayOfWeek += 1;     
	      nDaysInMonth = 31; 
	      return;
		}
		if (month == 1)
		{
		  dayOfMonth = 1;   
	      month = 2;
	      dayOfWeek += 1;     
	      nDaysInMonth = nDaysInMonth(2,year); 
	       return;
		}
		if (month == 2)
		{
          dayOfMonth = 1;   
	      month += 1;
	      dayOfWeek +=1;     
	      nDaysInMonth = 31; 
	       return;
		}

	   if ((nDaysInMonth(month,year) == 30) || (month==7))
		{
		  dayOfMonth = 1;   
	      month += 1;
	      dayOfWeek += 1;     
	      nDaysInMonth = 31; 
	       return;
	    }
        if (nDaysInMonth(month,year) == 31)
		{
	      dayOfMonth = 1;   
	      month += 1;
	      dayOfWeek +=1;     
	      nDaysInMonth = 30;
	       return; 
		}
	}
	public static void main(String args []) {

		int a = Integer.parseInt(args[0]);
		year = a;
		while (year < a+1)
	{
		if (nDaysInMonth(month,year) == 31) 
		{
			printDate();
			dayOfWeek ++;
			dayOfMonth ++;
			if (dayOfWeek == 8)
			  {
				dayOfWeek = 1;
			  }
			if (dayOfMonth == 32)
			  {
				advance();
			  }
		}
		if (nDaysInMonth(month,year) == 30) 
		{
			printDate();
			dayOfWeek ++;
			dayOfMonth ++;

			if (dayOfWeek == 8)
			{
				dayOfWeek = 1;
			}
			if (dayOfMonth == 31)
			{
				advance();
			}
		}
		if (month == 2)
		{
			printDate();
			dayOfWeek ++;
			dayOfMonth ++;
			if (dayOfWeek == 8)
			{
				dayOfWeek = 1;
			}
			if ((isLeapYear(year) == false) && (dayOfMonth == 29))
			{
				advance();
			}
			if ((isLeapYear(year) == true) && (dayOfMonth == 30)) 
			{
				advance();
			}
			
		
	}
}
}
}




		
	



	 
		
	
	
	 