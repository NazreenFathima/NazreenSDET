package mandatoryHomeWork.morningSession;

import org.junit.Assert;
import org.junit.Test;

public class Sept20_DigitCount_BruteForce 
{
	/*
	 * understood : yes
	 * input : String
	 * output : boolean
	 * 
	 * Pseudocode:
	 * 1) Iterate through the for loop till str.length
	 * 2) Initialise the count=0;
	 * 3) Initialise chatAt to ch
	 * 4) change to int value
	 * 5) Iterate through another for loop 
	 * 6) if charAt(j)==ch --> count++
	 * 7) if count!=0 -->false
	 * 8) return true
	 * 
	 */
	
	public boolean digitCount(String str)
    {
        for (int i=0; i<str.length(); i++)
		{
			int count=0;
			char ch = str.charAt(i);
			int digit = ch-'0';
			for (int j=0; j<str.length(); j++)
			{
				if(str.charAt(j)==ch)
				{
					count++;
				}
			}
			if(count!=0)
			{
				return false;
			}
		}
		return true;
    }
	
	@Test
	public void test1() 
	{
		boolean actual=digitCount("1210");
		boolean expected =true;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test2() 
	{
		boolean actual=digitCount("030");
		boolean expected =false;
		Assert.assertEquals(expected, actual);
	}
}
