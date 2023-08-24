package mandatoryHomeWork.week1.CW;

import org.junit.Test;

import junit.framework.Assert;

public class PowerOfTwo 
{
	/*
	 * https://leetcode.com/problems/power-of-two/description/
	 * 
	 * Given an integer n, return true if it is a power of two. Otherwise, return false.
	 * An integer n is a power of two, if there exists an integer x such that n == 2x.
	 * 
	 * Input: n = 1
	 * Output: true
	 * Explanation: 20 = 1
	 * 
	 * Input: n = 16
	 * Output: true
	 * Explanation: 24 = 16
	 * 
	 * Input: n = 3
	 * Output: false
	 * 
	 * Input : int
	 * Output : boolean
	 * Constraints : no
	 * 
	 * Pseudocode : 
	 * 1. While the num%2==0
	 *     then num/2
	 *     if num==1
	 *     return true
	 *     else false
	 */
	
	public boolean Powerof2 (int num)
	{
		while (num%2==0) 
				{
				 num=num/2;
				}
		if (num==1)
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
	boolean actual = Powerof2 (1);
	Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test2()
	{
	boolean actual = Powerof2 (16);
	Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test3()
	{
	boolean actual = Powerof2 (3);
	Assert.assertEquals(false, actual);
	}
	
}
