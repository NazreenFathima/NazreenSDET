package mandatoryHomeWork.week11.CW;

import org.junit.Test;

import junit.framework.Assert;

public class Palindrome_Number_Math 
{
	/*
	 * understood : yes
	 * input : int
	 * output : boolean
	 * 
	 * Pseudocode:
	 * 1. initialise the number in temp variable
	 * 2. Reverse the number 
	 *    reminder = n%10;
	 *    sum = (sum*10)+reminder
	 *    n=n/10;
	 * 3. compare temp variable nd reversed number
	 *    --> same --true
	 *    --> different - false   
	 */
	
	public boolean Palindrome_Number_Math (int num) 
	{
		int temp = num;
		int remainder, sum =0;
		while(num>0)
		{
			remainder = num%10;
			sum = (sum*10)+remainder;
			num=num/10;
		}
		if (temp==sum)
		{
			return true;
		}
		return false;
	}
	@Test
	public void test1()
	{
		boolean actual = Palindrome_Number_Math (121);
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test2()
	{
		boolean actual = Palindrome_Number_Math (10);
		Assert.assertEquals(false, actual);
	}
	
	@Test
	public void test3()
	{
		boolean actual = Palindrome_Number_Math (-121);
		Assert.assertEquals(false, actual);
	}
}
