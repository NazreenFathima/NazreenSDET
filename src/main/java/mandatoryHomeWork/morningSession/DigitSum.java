package mandatoryHomeWork.morningSession;

import org.junit.Test;

import junit.framework.Assert;

public class DigitSum 
{
	/*
	 * Given a positive integer num, return the number of positive integers less than or equal to num whose digit sums are even.

The digit sum of a positive integer is the sum of all its digits.



Example 1:

Input: num = 4
Output: 2
Explanation:
The only integers less than or equal to 4 whose digit sums are even are 2 and 4.
Example 2:

Input: num = 30
Output: 14
Explanation:
The 14 integers less than or equal to 30 whose digit sums are even are
2, 4, 6, 8, 11, 13, 15, 17, 19, 20, 22, 24, 26, and 28.

	 * Understood the prob : YES
	 * 
	 * Input :int
	 * Output : int
	 * 
	 * Pseudocode:
	 *
	 * 1) Initialise count = 0
	 * 2) Initialise for loop starting from 1 to the given number
	 * 3) To find the sum of digits : USe modulo and divide operation
	 * 4) if sum modulo 2 (even) then increment the counter.
	 * 5) Return count
	 */
	
	public int DigitsSum (int num)
	{ 	
		int count = 0;
		for (int i=1; i<=num; i++)
		{
			int n=i; int sum=0, rem;
			while (n>0)
			{	
				rem=n%10;
				sum=sum+rem;
				n=n/10;
			}
			if(sum%2==0)
			{
				count ++;
			}
		}
		
		return count;
	}
	
	@Test
	public void test1()
	{
		int actual = DigitsSum(30);
		Assert.assertEquals(14, actual);
		
	}
	
	@Test
	public void test2()
	{
		int actual = DigitsSum(4);
		Assert.assertEquals(2, actual);
		
	}
}
