package mandatoryHomeWork.week2.CW;

import org.junit.Test;

import junit.framework.Assert;

public class NumberOfSeniorCitizens 
{
	/*
	 * You are given a 0-indexed array of strings details. 
	 * Each element of details provides information about a given passenger compressed into a string of length 15. The system is such that:
	The first ten characters consist of the phone number of passengers.
	The next character denotes the gender of the person.
	The following two characters are used to indicate the age of the person.
	The last two characters determine the seat allotted to that person.
	Return the number of passengers who are strictly more than 60 years old.
	
	Input: details = ["7868190130M7522","5303914400F9211","9273338290F4010"]
	Output: 2
	Explanation: The passengers at indices 0, 1, and 2 have ages 75, 92, and 40. 
	Thus, there are 2 people who are over 60 years old.
	
	Input: details = ["1313579440F2036","2921522980M5644"]
	Output: 0
	Explanation: None of the passengers are older than 60.
	
	Pseudocode : 
	1) Iterate through the array String[] 
	2) int count, age
	3) Get the substring of the element(11,13)
	4) Verify if age>60 
	5) count++
	6) return count
	 */
	
	public int getSeniorNumbers(String[] details)
	{
		int count = 0;
		int age = 0;
		String str = "";
		for (int i=0; i<details.length; i++)
		{
			str = details[i].substring(11,13);
			age = Integer.parseInt(str);
			if(age>60)
				count++;
		}
		return count;
	}
	
	@Test
	public void test1()
	{
		int actual = getSeniorNumbers(new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"});
		Assert.assertEquals(2, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = getSeniorNumbers(new String[] {"1313579440F2036","2921522980M5644"});
		Assert.assertEquals(0, actual);
	}
}
