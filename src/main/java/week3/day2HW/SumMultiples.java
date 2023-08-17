package week3.day2HW;

import org.junit.Test;

import junit.framework.Assert;

public class SumMultiples 
{
	/*
	 * Understod the prob : YEs
	 * 
	 * Input : int
	 * Output : int
	 * 
	 * Pseudocode:
	 * 1) Iterate through the for loop
	 * 2) Check if the number is divisible by 3 or 5 or 7
	 * 3) If the number is divisible add to sum.
	 */
	
	public int SumMultiple(int n)
	{	
		int sum = 0;
		for (int i=1; i<=n; i++)
		{
			if (i%3==0 || i%5==0 || i%7==0)
			{
				sum = sum + i;
			}
		}
		return sum;
	}
	
	@Test
	public void test1()
	{
		int actual = SumMultiple(7);
		Assert.assertEquals(21, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = SumMultiple(10);
		Assert.assertEquals(40, actual);
	}
	
	
	
}
