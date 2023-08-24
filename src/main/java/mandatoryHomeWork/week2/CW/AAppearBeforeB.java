package mandatoryHomeWork.week2.CW;

import org.junit.Test;

import junit.framework.Assert;

public class AAppearBeforeB 
{
	/* 
	 * https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/description/
	 * 
	 * Given a string s consisting of only the characters 'a' and 'b', return true if every 'a' 
	 * appears before every 'b' in the string. Otherwise, return false.
	 * 
	 * Input : String
	 * Output : Boolean
	 * 
	 * Input: s = "aaabbb"
Output: true
Explanation:
The 'a's are at indices 0, 1, and 2, while the 'b's are at indices 3, 4, and 5.
Hence, every 'a' appears before every 'b' and we return true.

Input: s = "abab"
Output: false
Explanation:
There is an 'a' at index 2 and a 'b' at index 1.
Hence, not every 'a' appears before every 'b' and we return false.

Input: s = "bbb"
Output: true
Explanation:
There are no 'a's, hence, every 'a' appears before every 'b' and we return true.
	 * 
	 */
	
	public boolean checkStringOccurance(String s)
	{
		return s.lastIndexOf('a')  == (s.indexOf('b')-1);
	}
	
	@Test
	public void test1()
	{
		boolean actual = checkStringOccurance("aaabbb");
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test2()
	{
		boolean actual = checkStringOccurance("abab");
		Assert.assertEquals(false, actual);
	}
	
	@Test
	public void test3()
	{
		boolean actual = checkStringOccurance("bbb");
		Assert.assertEquals(true, actual);
	}
}


