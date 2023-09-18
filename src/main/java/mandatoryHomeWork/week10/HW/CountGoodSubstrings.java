package mandatoryHomeWork.week10.HW;

import org.junit.Test;
import org.testng.Assert;

public class CountGoodSubstrings 
{	
	/*
	 * understood : yes
	 * input : String
	 * output : int
	 * 
	 * Pseudocode:
	 * 1) initialise count=0
	 * 2) iterate through the for loop till length-3
	 * 3) if (str.charAt(i)!=str.charAt(i+1)&&
					str.charAt(i)!=str.charAt(i+2)&&
					str.charAt(i+1)!=str.charAt(i+2)) --> count++
	 * 4) return count
	 */

	public int countGoodSubstrings(String str)
	{
		int count=0;
		for (int i=0; i<=str.length()-3; i++)
		{
			if (str.charAt(i)!=str.charAt(i+1)&&
					str.charAt(i)!=str.charAt(i+2)&&
					str.charAt(i+1)!=str.charAt(i+2))
			{
				count++;
			}
		}
		return count;
	}
	
	@Test
	public void test1()
	{
		int actual = countGoodSubstrings("xyzzaz");
		Assert.assertEquals(1, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = countGoodSubstrings("aababcabc");
		Assert.assertEquals(4, actual);
	}
}
