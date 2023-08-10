package week3.day1CW;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class Anagram 
{
	/*
	 * Input : String
	 * Output : Boolean
	 * 
	 * Constraints : No DS
	 * 
	 * Psedocode : 
	 * 1) Convert the string to char[]
	 * 2) Sort the char[]
	 * 3) If both char[] are equal the anagram else its not anagram
	 * 
	 */
	
	public boolean isAnagram (String s, String t)
	{
		char[] schar = s.toCharArray();
		char[] tchar = t.toCharArray();
		Arrays.sort(schar);
		Arrays.sort(tchar);
		
		return Arrays.equals(schar, tchar );
		
	}
	
	@Test
	public void test1()
	{
		boolean actual = isAnagram ("anagram", "nagaram");
		Assert.assertEquals(true, actual);
		
	}
	
	@Test
	public void test2()
	{
		boolean actual = isAnagram ("rat", "car");
		Assert.assertEquals(false, actual);
		
	}
	
	
}
