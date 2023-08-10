package mandatoryHomeWork.week5;

import org.junit.Assert;
import org.junit.Test;

public class ThreeDivisors 
{
	/*
	 * DID u understand the prob : YES
	 * 
	 * Input : int
	 * Output : boolean
	 * 
	 * Pseudocode:
	 * 1) Initialise count = 0;
	 * 2) Iterate through the for loop for finding the modulo of given number equals to 0
	 * 3) when its 0 - incease the counter
	 * 4) when count equals 3 return - true; else return false
	 * 
	 * 
	 */
	
	public boolean isThree(int n) 
	{	
		int count = 0;
		for (int i=1; i<n; i++)
		{
			if (n%i==0)
			{
				count++;
			}
		}
		
		if (count ==3)
				{
					return true;
				}
		else 
        return false;
    }
	
	@Test
	public void test1()
	{
		boolean actual = isThree(9);
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test2()
	{
		boolean actual = isThree(2);
		Assert.assertEquals(false, actual);
	}
}
