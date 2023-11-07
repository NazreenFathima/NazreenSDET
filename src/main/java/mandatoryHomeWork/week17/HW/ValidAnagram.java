package mandatoryHomeWork.week17.HW;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;
import org.testng.Assert;

public class ValidAnagram 
{
	/*
	 * https://leetcode.com/problems/valid-anagram/
	 * 
	 * understood : yes
	 * input : String
	 * output : boolean
	 * 
	 * Pseudocode:
	 * 1) Convert the String to char[]
	 * 2) Sort the arrays
	 * 3) return true of both arrays are equal
	 * 
	 */
	
	public boolean validAnagram(String s, String t)
	{
		char[] sch = s.toCharArray();
		char[] tch = t.toCharArray();
		Arrays.sort(sch);
		Arrays.sort(tch);
		return Arrays.equals(sch, tch);
	}
	
	@Test
	public void test1()
	{
		boolean actual = validAnagram("anagram", "nagaram");
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test2()
	{
		boolean actual = validAnagram("rat", "car");
		Assert.assertEquals(false, actual);
	}
}
