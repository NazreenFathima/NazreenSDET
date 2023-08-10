package week5.day2HW;

import org.junit.Assert;
import org.junit.Test;

public class DayOfTheYear 
{
	/*
	 * Undersoot the prob : YES
	 * 
	 * Input : String
	 * Output : int
	 * 
	 * Pseudocode : 
	 * - find whether the year is a leap year or nor
- if it is a leap year, turn on  a flag
- check the month, if 02 then add 28/29
- else add 30/31
	- if odd or if 08 then add 31
	
	
	 * ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0))
	 */
	
	public int dayOfTheYear (String GivenDate)
	{	
		int[] numOfDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int year = Integer.parseInt(GivenDate.substring(0, 4));
		int month = Integer.parseInt(GivenDate.substring(5, 7));
		int date = Integer.parseInt(GivenDate.substring(8, 10));
		
		int days = 0;
		for (int n=0; n<month-1; n++)
		{
			days = days+numOfDays[n];
						
		}
		
		if ((month>2) && (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0))
		{
			return days+date+1;
		}
		else 
			return days+date;
	}
	
	
	@Test
	public void test1()
	{
		int actual = dayOfTheYear("2019-02-10");
		Assert.assertEquals(41, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = dayOfTheYear("2019-01-09");
		Assert.assertEquals(9, actual);
	}
	
}
