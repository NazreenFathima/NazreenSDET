package mandatoryHomeWork.week4;

import org.junit.Test;

import junit.framework.Assert;

public class AlternatingDigitSum 
{
	/*
	 * Did u undertand the prob : YES
	 * 
	 * Input : int
	 * Output : int
	 * 
	 * Data Set : 
	 * 
	 * Input: n = 521
Output: 4
Explanation: (+5) + (-2) + (+1) = 4.

	 *Input: n = 886996
Output: 0
Explanation: (+8) + (-8) + (+6) + (-9) + (+9) + (-6) = 0.

	 *
	 *Pseudocode : 
	 *1) Convert int to String
	 *2) Initialise sum = 0
	 *3) for even digit : sum = sum+charAt(i)-'0'
	 *4) for odd digit : sum = sum+charAt(i)-'0'
	 */
	
	public int alternateDigitSum (int n)
	{	
		String s = String.valueOf(n);
		int total = 0;
		for (int i=0; i<s.length(); i++)
		{
			if (i%2==0)
			{
				total = total+ (s.charAt(i)-'0');
			}
			else
			{
				total = total - (s.charAt(i)-'0');
			}
		}
		return total;
	}
	
	@Test
	public void test1()
	{
		int actual = alternateDigitSum (521);
		Assert.assertEquals(4, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = alternateDigitSum (886996);
		Assert.assertEquals(0, actual);
	}
	
	@Test
	public void test3()
	{
		int actual = alternateDigitSum (111);
		Assert.assertEquals(1, actual);
	}
}
