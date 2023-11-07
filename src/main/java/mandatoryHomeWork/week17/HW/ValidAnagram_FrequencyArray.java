package mandatoryHomeWork.week17.HW;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class ValidAnagram_FrequencyArray 
{
	/*
	 * https://leetcode.com/problems/valid-anagram/
	 * 
	 * understood : yes
	 * input : String
	 * output : boolean
	 * 
	 * Pseudocode:
	 * 1) create an int[] of length26
	 * 2) add the frequency of every char in s string nd subract every character in t string
	 * 3) iterate through for loop --> when not equals 0--> return false
	 * 4) finally wen the freq array has all 0 --> then true
	 * 
	 */
	
	public boolean validAnagram(String s, String t)
	{
		if (s.length() != t.length()) 
		{
			return false;
		}
		
		int[] arr = new int[26];
		for(int i=0; i<s.length(); i++)
		{
			arr[s.charAt(i)-'a']++;
			arr[t.charAt(i)-'a']--;
		}
		
	    for(int i=0; i<26; i++)
	    {
	    	if(arr[i]!=0)
	    	{
	    		return false;
	    	}
	    }
		return true;
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
