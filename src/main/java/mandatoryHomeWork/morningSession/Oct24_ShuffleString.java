package mandatoryHomeWork.morningSession;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Oct24_ShuffleString 
{
	/*
	 * https://leetcode.com/problems/shuffle-string/
	 * 
	 * understood : yes
	 * input : String, int[]
	 * output : String
	 * 
	 * Pseudocode: 
	 * 1)char[] of length of int[]
	 * 2)iterate through the for loop, place the charAt(i) on arr[indices[i]]
	 * 3)String Builder
	 * 4)iterate through for each loop and append
	 * 5)return sb.toString.
	 * 
	 * 
	 */
	
	public String shuffleString(String s, int[] indices)
	{
		char[] arr = new char[indices.length];
		for (int i=0; i<indices.length; i++)
		{
			arr[indices[i]] = s.charAt(i);
		}
		StringBuilder sb = new StringBuilder();
		for (char c : arr) 
		{
			sb.append(c);
		}
		return sb.toString();
	}
	
	@Test
	public void test1()
	{
		String actual = shuffleString ("codeleet", new int[] {4,5,6,7,0,2,1,3});
		Assert.assertEquals("leetcode", actual);
	}
	
	@Test
	public void test2()
	{
		String actual = shuffleString ("abc",new int[] {0,1,2});
		Assert.assertEquals("abc", actual);
	}
}
