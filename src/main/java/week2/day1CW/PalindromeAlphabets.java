package week2.day1CW;

import org.junit.Test;

import junit.framework.Assert;

public class PalindromeAlphabets 
{
	/*
	 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
	 * it reads the same forward and backward. Alphanumeric characters include letters and numbers.
	 * Given a string s, return true if it is a palindrome, or false otherwise.
	 * 
	 * Input: s = "A man, a plan, a canal: Panama"
		Output: true
		Explanation: "amanaplanacanalpanama" is a palindrome.
		
		Input: s = "race a car"
			Output: false
			Explanation: "raceacar" is not a palindrome.
			
		Input: s = " "
			Output: true
			Explanation: s is an empty string "" after removing non-alphanumeric characters.
			Since an empty string reads the same forward and backward, it is a palindrome.
	 * 
	 * Pseudocode:
	 * 1. Get string to convert to lowercase 
	 * 2. Use regrex to replaceAll alphanumeric (not A-Z or 0-9, replace other than
	 * 3. Use StringRev(strrev()) to reverse the output string
	 * 4. If input string equals output string, return true
	 * 		else false
	 */
	
	public boolean validPalindrome (String s)
	{
		String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		String ori = str;
		String rev = "";
		char[] charArray = str.toCharArray();
		for (int i=str.length()-1; i>=0; i--)
		{
			rev = rev + charArray[i];
		}
		
		return ori.equals(rev);
	}
	
	@Test
	public void test1()
	{
		boolean actual = validPalindrome("A man, a plan, a canal: Panama");
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test2()
	{
		boolean actual = validPalindrome("race a car");
		Assert.assertEquals(false, actual);
	}
	
	@Test
	public void test3()
	{
		boolean actual = validPalindrome(" ");
		Assert.assertEquals(true, actual);
	}
}
