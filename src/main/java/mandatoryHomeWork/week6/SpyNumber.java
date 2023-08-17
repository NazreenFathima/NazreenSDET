package mandatoryHomeWork.week6;

import org.junit.Assert;
import org.junit.Test;

public class SpyNumber 
{
	/*
	 * Understood the prob : YES
	 * 
	 * Input : int
	 * Output : boolean
	 * 
	 * Data Set : 
	 * Positive : 123
	 * Negative : 125
	 * 
	 * Pseudocode : 
	 * 1)Initialise product=1 and sum=0
	 * 2) Iterate through the while loop when n>0
	 * 3) find the last digit by modulo operation
	 * 4) add the lastdigit to the sum and 
	 * 5) multiply the last digit to product
	 * 6) remove the last digit by division operation
	 */
	
	public boolean SpyNumbers(int n)
	{
		int product=1, sum=0, lastDigit;
		while(n>0)
		{
			lastDigit = n%10;
			sum = sum + lastDigit;
			product = product*lastDigit;
			n=n/10;
		}
		if (sum==product)
		{
		return true;
		}
		else return false;
		
	}
	
	@Test
	public void test1()
	{
		boolean actual = SpyNumbers(123);
		Assert.assertEquals(true, actual);
	}

}
