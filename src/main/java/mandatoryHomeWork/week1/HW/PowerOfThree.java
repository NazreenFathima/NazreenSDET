package mandatoryHomeWork.week1.HW;

import org.junit.Test;

import junit.framework.Assert;

public class PowerOfThree 
{
	/*
	 * Input : int
	 * Output : int
	 * 
	 * Pseudocode : 
	 * 1. While the num%3==0
	 *     then num/3
	 *     if num==1
	 *     return true
	 *     else false
	 *
	 */
	
	public boolean PowerOf3 (int num)
	{
		while(num%3==0)
		{
			num=num/3;
		}
		if(num==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Test
	public void test1()
	{
	boolean actual = PowerOf3 (27);
	Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test2()
	{
	boolean actual = PowerOf3 (0);
	Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test3()
	{
	boolean actual = PowerOf3 (-1);
	Assert.assertEquals(false, actual);
	}

}
