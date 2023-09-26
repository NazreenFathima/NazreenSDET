package mandatoryHomeWork.week11.CW;

import org.junit.Test;
import org.testng.Assert;

public class ConsecutiveCharacters_SinglePointer 
{
	/* https://leetcode.com/problems/consecutive-characters/description/
	 * 
	 * understood : yes
	 * input : String
	 * output : int
	 * 
	 * Pseudocode:
	 * 1) if length = 0 --> return 0
	 * 2) intitialise max,current, pointer =1
	 * 3) using while loop --> Iterate till the length of the string
	 * 4) if current charater nd previous character are same --> increment current count
	 * 5) else compare the max nd save in max nd reset the current count as 1
	 * 6) incrrement the pointer
	 * 7) return max or current using Math.max function
	 * .
	 */
	
	public int ConsecutiveCharacters(String str)
	{
		if (str.length() ==0)
		{
			return 0;
		}
		int max = 1;
		int current =1;
		int pointer =1;
		
		while (pointer<str.length())
		{
			if (str.charAt(pointer)==str.charAt(pointer-1))
			{
				current++;
			}
			else 
			{
				max = Math.max(max, current);
				current=1;
			}
			pointer++;
		}
		
		return Math.max(max, current);
	}
	
	@Test
	public void test1()
	{
		int actual = ConsecutiveCharacters("leetcode");
		Assert.assertEquals(2, actual);	
	}
	
	@Test
	public void test2()
	{
		int actual = ConsecutiveCharacters("abbcccddddeeeeedcba");
		Assert.assertEquals(5, actual);	
	}
	
	@Test
	public void test3()
	{
		int actual = ConsecutiveCharacters("abcde");
		Assert.assertEquals(1, actual);	
	}
	
	@Test
	public void test4()
	{
		int actual = ConsecutiveCharacters("");
		Assert.assertEquals(0, actual);	
	}
	
	

}
