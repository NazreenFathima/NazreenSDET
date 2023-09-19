package mandatoryHomeWork.week10.HW;

import org.junit.Test;
import org.testng.Assert;

public class MakeSmallestPalindrome 
{	
	/*
	 * understood : yes
	 * input : String
	 * output : String
	 * 
	 * Pseudocode: 
	 * 
	 */
	
	public String makeSmallestPalindrome(String str)
	{
		char[] arr = str.toCharArray();
		int left =0;
		int right = arr.length-1;
		while(left<right)
		{
			if (arr[left]<arr[right])
			{
				arr[right]=arr[left];
				left++;
				right--;	
			}
			else
			{
				arr[left]=arr[right];
				left++;
				right--;
			}
		}
		return new String(arr);
		//return String.valueOf(chrArr);
	}
	
	@Test
	public void test1()
	{
		String actual = makeSmallestPalindrome("egcfe");
		Assert.assertEquals("efcfe", actual);
	}
	
	@Test
	public void test2()
	{
		String actual = makeSmallestPalindrome("abcd");
		Assert.assertEquals("abba", actual);
	}
	
	@Test
	public void test3()
	{
		String actual = makeSmallestPalindrome("seven");
		Assert.assertEquals("neven", actual);
	}

}
