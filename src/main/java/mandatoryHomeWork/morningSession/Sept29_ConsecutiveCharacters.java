package mandatoryHomeWork.morningSession;

import org.junit.Test;

import junit.framework.Assert;

public class Sept29_ConsecutiveCharacters 
{
	/*
	 * understood : yes
	 * input : String
	 * output : int
	 * 
	 * Pseudocode:
	 * Initialise max,pointer current=1;
	 * 2) Iterate thorugh the while loop
	 * 3) compare the current nd previous character --> same --> Increment the current count
	 * 		else compare the current count nd max count using math function nd reset current counter=1;
	 *    Increment pointer
	 * 4) return max using max function
	 * 
	 */
	
	public int consecutiveCharacters (String str)
	{
		int max=1;
		int pointer=1;
		int current=1;
		while(pointer<str.length())
		{
			if(str.charAt(pointer)==str.charAt(pointer-1))
			{
				current++;
			}
			else
			{
				max=Math.max(max, current);
				current=1;
			}
			pointer++;
		}
		
		return Math.max(max, current);
	}
	
	@Test
	public void test1()
	{
		int actual = consecutiveCharacters("leetcode");
		Assert.assertEquals(2, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = consecutiveCharacters("abbcccddddeeeeedcba");
		Assert.assertEquals(5, actual);
	}
	
	@Test
	public void test3()
	{
		int actual = consecutiveCharacters("nn");
		Assert.assertEquals(2, actual);
	}
	
	@Test
	public void test4()
	{
		int actual = consecutiveCharacters("xyz");
		Assert.assertEquals(1, actual);
	}
}
