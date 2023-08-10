package week2.day1CW;

import org.junit.Assert;
import org.junit.Test;

public class ShuffleString 
{
	/*
	 * You are given a string s and an integer array indices of the same length. 
	 * The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
	 * Return the shuffled string.
	 *  	
	 *  	Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
			Output: "leetcode"
			Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.	
			
			Input: s = "abc", indices = [0,1,2]
			Output: "abc"
			Explanation: After shuffling, each character remains in its position.
	 * 
	 */
	
	public String checkShuffle (String s, int[] indices)
	{
		String str = "";
		char[] charArray = new char[indices.length];
		for(int i=0;i< indices.length;i++){
		charArray[indices[i]] = s.charAt(i);
		}
		str = String.valueOf(charArray);
		System.out.println(str);
		return str;
	}
	
	@Test
	public void test1()
	{
		String actual = checkShuffle ("codeleet", new int[] {4,5,6,7,0,2,1,3});
		Assert.assertEquals("leetcode", actual);
	}
	
	@Test
	public void test2()
	{
		String actual = checkShuffle ("abc", new int[] {0,1,2});
		Assert.assertEquals("abc", actual);
	}
}
