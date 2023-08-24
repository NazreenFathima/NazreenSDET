package mandatoryHomeWork.week1.HW;

import org.junit.Test;

import junit.framework.Assert;

public class Palindrome 
{
	/*
	 * Input : int
	 * Output : Boolean
	 * 
	 * Pseudocode : 
	 * 1. initialise the number in temp variable
	 * 2. Reverse the number 
	 *    reminder = n%10;
	 *    sum = (sum*10)+reminder
	 *    n=n/10;
	 * 3. compare temp variable nd reversed number
	 *    --> both are same --true
	 *    --> both are different - false   
	 *
	 */
	
	public boolean PalindromeNum (int n)
	{
		int reminder, sum=0, temp;
		temp = n;
		while (n>0)
		{
			reminder = n%10;
			sum = (sum*10)+reminder;
			n=n/10;
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
		boolean actual = PalindromeNum (121);
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test2()
	{
		boolean actual = PalindromeNum (10);
		Assert.assertEquals(false, actual);
	}
	
	@Test
	public void test3()
	{
		boolean actual = PalindromeNum (-121);
		Assert.assertEquals(false, actual);
	}
}
