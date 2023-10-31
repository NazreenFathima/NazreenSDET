package mandatoryHomeWork.morningSession;

import org.junit.Test;
import org.testng.Assert;

public class Oct31_RemovePalindromicSubsequences 
{
	/*
	 * https://leetcode.com/problems/remove-palindromic-subsequences/description/
	 * 
	 * understood : yes
	 * input : String
	 * output : int
	 * 
	 * Pseudocode:
	 * 1) check if empty --> return 0;
	 * 2) chk if palindrome --> return 1;
	 * 		else return 2 
	 */

	public int removePalindromeSub(String s) 
	{
		if(s.length()==0)
			return 0;
		
		int left=0;
		int right = s.length()-1;
		while(left<right)
		{
			if(s.charAt(left)==s.charAt(right))
			{
				left++;
				right--;
			}
			else
			{
				return 2;
			}
		}
		return 1;
	}
	
	@Test
	public void test1()
	{
		int actual = removePalindromeSub("ababa");
		Assert.assertEquals(1, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = removePalindromeSub("abb");
		Assert.assertEquals(2, actual);
	}
	
	@Test
	public void test3()
	{
		int actual = removePalindromeSub("baabb");
		Assert.assertEquals(2, actual);
	}
}
