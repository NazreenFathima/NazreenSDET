package mandatoryHomeWork.morningSession;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseInt 
{
	/*

	 * PROBLEM: 

Reversing an integer means to reverse all its digits.
For example, reversing 2021 gives 1202. Reversing 12300 gives 321 as the leading zeros are not retained.
Given an integer num, reverse num to get reversed1, then reverse reversed1 to get reversed2. 
Return true if reversed2 equals num. Otherwise return false.
	 *Understood the prob : YES
	 *
	 * Input : int
	 * Output : Boolean
	 * 
	 * Pseudocode : 
	 * 1. Initialise the number in temp variable
	 * 2. Reverse the number 
	 *    reminder = num%10;
	 *    sum = (sum*10)+reminder
	 *    num=num/10;
	 * 3) Reverse the sum using above steps..
	 * 4) Compare both the nums - if its same return true else return false
	 */
	
	public boolean reverseInt (int num)

	{
		int reminder, sum=0, sum1=0, reminder1;
		int temp=num;
		while (num>0)
		{
			reminder = num%10;
			sum = (sum*10)+reminder;
			num=num/10;
		}
		while (sum>0)
		{
			reminder1 = sum%10;
			sum1 = (sum1*10)+reminder1;
			sum=sum/10; 
		}

		if (temp == sum1)
			return true;
		else return false;	
	}

	

	@Test
	public void test1()
	{
		boolean actual = reverseInt (2021);
		Assert.assertEquals(true, actual);
	}

	

	@Test
	public void test2()

	{
		boolean actual = reverseInt (12300);
		Assert.assertEquals(false, actual);
	}

	
}
