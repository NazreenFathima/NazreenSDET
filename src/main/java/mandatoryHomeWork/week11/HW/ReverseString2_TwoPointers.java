package mandatoryHomeWork.week11.HW;

import org.junit.Assert;
import org.junit.Test;

public class ReverseString2_TwoPointers 
{
	/*
	 * understood : yes
	 * input : String, int
	 * output : String
	 * 
	 * PSeudocode:
	 * 1) Convert string to char[]
	 * 2) Iterate through the for loop tiil array length nd jump every 2k
	 * 3) initialise nd set min condition
	 * 4) iterate through the while loop nd reverse
	 * 4) Return the arr convertd to String
	 */

	public String reverseStr(String s, int k) 
	{
		char[] arr = s.toCharArray();
        for(int i= 0; i<arr.length; i += 2*k)
        {
            int l = i;
            int r = Math.min(i+k-1,arr.length-1);
            while(l<r)
            {
                char temp = arr[l];
                arr[l++] = arr[r];
                arr[r--] = temp;
            }
        }
        return new String(arr);
	}
	
	@Test
	public void test1() 
	{
		String actual=reverseStr("abcdefg", 2);
		Assert.assertEquals("bacdfeg", actual);
	}
	@Test
	public void test2() 
	{
		String actual=reverseStr("abcd", 2);
		Assert.assertEquals("bacd", actual);
	}
}
