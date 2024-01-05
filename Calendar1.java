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
	  	boolean isleap;
	 isleap =  ((year % 400) == 0);
	 isleap = isleap || (((year % 4 ==0) && ((year % 100)!=0)));
	 return isleap;
	}
//advane parameters at each end of month 
	private static void advance() {
		
		  dayOfMonth = 1;   
	      if (month == 12)
	      {
	      	nDaysInMonth = 31;
	      	month = 1;
	      	year ++;
	      } 
	     // if  (dayOfWeek !=1) dayOfWeek += 1;     
	     else 
	     {
	     	nDaysInMonth = nDaysInMonth(month+1,year);
	     	month ++;
	     }
	     	 
	      return;
		}
	public static void main(String args []) {
		while (year < 2000)
	{
		if (nDaysInMonth(month,year) == 31) 
		{
			
			 printDate();
			if (dayOfWeek == 7)
			  {
				dayOfWeek = 1;
			  }
			 else dayOfWeek ++;
			 dayOfMonth ++;
			
			if (dayOfMonth == 32)
			  {
				advance();
			  }
		}
		if (nDaysInMonth(month,year) == 30) 
		{
			 printDate();
			if (dayOfWeek == 7)
			  {
				dayOfWeek = 1;
			  }
			 else dayOfWeek ++;
			
			dayOfMonth ++;

			if (dayOfMonth == 31)
			{
				advance();
			}
		}

		if (month == 2)
		{
			 printDate();
			if (dayOfWeek == 7)
			  {
				dayOfWeek = 1;
			  }
			 else dayOfWeek ++;
			
			dayOfMonth ++;
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



		
	



	 
		
	
	
	 