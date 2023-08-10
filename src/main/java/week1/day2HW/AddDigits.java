package week1.day2HW;

import org.junit.Test;

import junit.framework.Assert;

public class AddDigits 
{
	/*
	 * Input : int
	 * Output : int 
	 * 
	 * Constraints : No DS
	 * 
	 * Data Set : 
	 * 6, 120, 1809
	 * 
	 * Pseudocode : 
	 *  while n>9
	 *   n = n/10 + n%10;
	 *  
	 */
	
	public int addDigit (int n)
	{	
		while (n>9)
		{
			n=n/10 +n%10;
		}
		return n;
	}
	
	@Test
	public void test1()
	{
		int actual = addDigit(120);
		Assert.assertEquals(3, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = addDigit(6);
		Assert.assertEquals(6, actual);
	}
	
	@Test
	public void test3()
	{
		int actual = addDigit(1809);
		Assert.assertEquals(9, actual);
	}
}
