package mandatoryHomeWork.week11.HW;

import org.junit.Test;
import org.testng.Assert;

public class MinimumRecolors 
{
	/*
	 * https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/description/
	 * 
	 * understood : yes
	 * input : String
	 * output : int
	 * 
	 * Pseuodocode:
	 * 1) Initialise min=Max_Value
	 * 2) Initialise pointer=0; and whiteCount=0
	 * 3) Iterate through the while loop till target
	 *    if chatAt=W --> Increment whiteCount
	 *	  increment pointer
	 * 4) Iterate through another while loop til str length
	 *    mins = Max.min(min, whiteCOunt)
	 *    if charAt(pointer)=W --> whiteCount++
	 *    if charAt(pointer-k)=W --> whiteCount--
	 *    pointer++
	 * 5) return min
	 */
	
	public int minimumRecolors(String str, int k)
	{
		int min = Integer.MAX_VALUE;
		int pointer =0;
		int whiteCount = 0;
		
		while(pointer<k)
		{
			if (str.charAt(pointer)=='W')
			{
				whiteCount++;
			}
			pointer++;
		}
		
		while(pointer<str.length())
		{
			min = Math.min(min, whiteCount);
			if (str.charAt(pointer) == 'W') 
			{
	            whiteCount++;
	        }
			if (str.charAt(pointer - k) == 'W') 
			{
	            whiteCount--;
	        }
	        
	        pointer++;
		}
		return min;
	}
	
	@Test
	public void test1()
	{
		int actual = minimumRecolors("WBBWWBBWBW", 7);
		Assert.assertEquals(3, actual);		
	}
	
	@Test
	public void test2()
	{
		int actual = minimumRecolors("WBWBBBW", 2);
		Assert.assertEquals(0, actual);		
	}
}
