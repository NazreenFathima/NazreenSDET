package mandatoryHomeWork.week11.CW;

import org.junit.Test;
import org.testng.Assert;

public class ConsecutiveCharacters_DynamicWindow 
{
	public int ConsecutiveCharacters(String str)
	{
		if (str.length() ==0)
		{
			return 0;
		}
		
		int left=0,right=1;
        int MaxCount=1;
        while(right<str.length())
        {
            if (str.charAt(left)==str.charAt(right)) 
            {
                MaxCount=Math.max(MaxCount, right-left+1);
                right++;
            }
            else
            {
                right++;
                left=right-1;
            }
        }
        return MaxCount;
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
