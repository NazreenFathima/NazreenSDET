package mandatoryHomeWork.morningSession;

import org.junit.Test;
import org.testng.Assert;

public class Sept27_SpyNumber 
{
	/*
	 * A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
Return true if the given number is spy number, else false

	 * understood : yes
	 * input : int
	 * output : boolean
	 * 
	 * Pseudocode:
	 * 1)Initialise product=1; sum=0
	 * 2)Iterate through the while loop (num>0)
	 * 3)find the last digit by modulo operator
	 * 4)add the last digit to the sum
	 * 5)multiply the last digit to product
	 * 6)sum=multiply--> true
	 * 		else -->false
	 * 
	 */
	
	public boolean spyNumber(int num)
	{
		int product=1;
		int sum=0;
		while(num>0)
		{
			int lastDigit = num%10;
			sum+=lastDigit;
			product*=lastDigit;
			num=num/10;
		}
		
		return sum==product;
		
	}
	
	@Test
	public void test1()
	{
		boolean actual = spyNumber(123);
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test2()
	{
		boolean actual = spyNumber(222);
		Assert.assertEquals(false, actual);
	}
}
