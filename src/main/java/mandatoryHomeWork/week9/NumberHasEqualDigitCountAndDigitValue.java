package mandatoryHomeWork.week9;

import org.junit.Assert;
import org.junit.Test;

public class NumberHasEqualDigitCountAndDigitValue 
{
	/*
	 * understood : yes
	 * input : String
	 * output : boolean
	 * 
	 * 
	 */
	
	public boolean numberHasEqualDigitCountAndDigitValue(String str)
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
		boolean actual=numberHasEqualDigitCountAndDigitValue("1210");
		boolean expected =true;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test2() 
	{
		boolean actual=numberHasEqualDigitCountAndDigitValue("030");
		boolean expected =false;
		Assert.assertEquals(expected, actual);
	}
}
