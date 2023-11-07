package mandatoryHomeWork.week17.HW;

import java.util.HashMap;

import org.junit.Test;
import org.testng.Assert;

public class ValidAnagram_HashMap 
{
	/*
	 * https://leetcode.com/problems/valid-anagram/
	 * 
	 * understood : yes
	 * input : String
	 * output : boolean
	 * 
	 * Pseudocode:
	 * 1) Create hashmap for String s and hav the count of each char using getOrDefault
	 * 2) Create hashmap for String t and hav the count of each char using getOrDefault
	 * 3) Return true if both the hashmap are equal
	 * 
	 */
	
	public boolean validAnagram(String s, String t)
	{
		HashMap<Character, Integer> hms = new HashMap<>();
		for(char chs : s.toCharArray())
		{
			hms.put(chs, hms.getOrDefault(chs, 0)+1);
		}
		
		HashMap<Character, Integer> hmt = new HashMap<>();
		for(char cht : t.toCharArray())
		{
			hmt.put(cht, hmt.getOrDefault(cht, 0)+1);
		}
		
		return hms.equals(hmt);
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
