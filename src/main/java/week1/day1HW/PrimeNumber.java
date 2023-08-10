package week1.day1HW;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumber 
{
	/*
	 * Input : int
	 * Output : boolean
	 * Constraints : no
	 * 
	 * Data Set:
	 * Positive : 5
	 * Negative : 6
	 * Edge: 1
	 * 
	 * Psedocode : 
	 * 1. Get the number
	 * 2. Iterate through the for loop 
	 * 3. When number%i ==0 
	 *    return false
	 *    return true
	 */
	
	public Boolean IsPrime (int num)
	{
		if (num ==0||num==1) 
			return true;
		else
		for (int i=2; i<num; i++)
		{
			if (num%i == 0)
			return false;
		}
		return true;
	}
	
	@Test
	public void test1()
	{
		boolean actual = IsPrime(5);
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test2()
	{
		boolean actual = IsPrime(6);
		Assert.assertEquals(false, actual);
	}
	
	@Test
	public void test3()
	{
		boolean actual = IsPrime(1);
		Assert.assertEquals(true, actual);
	}
}
