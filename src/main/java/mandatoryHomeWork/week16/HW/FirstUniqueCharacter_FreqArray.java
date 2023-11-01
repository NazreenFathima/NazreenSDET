package mandatoryHomeWork.week16.HW;

import org.junit.Test;
import org.testng.Assert;

public class FirstUniqueCharacter_FreqArray 
{
	/*
	 * https://leetcode.com/problems/first-unique-character-in-a-string/description/
	 * 
	 * understood : yes
	 * input : String
	 * output : int
	 * 
	 * 
	 * Pseudocode: 
	 * 1) Initialise int[] of length 26
	 * 2) Use freq array iterate through each character using the for loop
	 * 3) Increment the count of the corresponding character in the array
	 * 4) Iterate through each character using another for loop
	 * 5) Check if the count of current character equals 1--> return its index
	 * 6) if no unique character is found return -1.
	 * 
	 * 
	 * Logic : Freq array
	 */
	
	public int firstUniqueCharacter(String s)
	{
		int[] arr = new int[26];
		for(int i=0; i<s.length(); i++)
		{
			arr[s.charAt(i)-'a']++;
		}
		for(int i=0; i<s.length(); i++)
		{
			if(arr[s.charAt(i)-'a']==1)
			{
				return i;
			}
		}
		
		return -1;
	}
	
	@Test
	public void test1()
	{
		int actual = firstUniqueCharacter("leetcode");
		Assert.assertEquals(0, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = firstUniqueCharacter("loveleetcode");
		Assert.assertEquals(2, actual);
	}
	
	@Test
	public void test3()
	{
		int actual = firstUniqueCharacter("aabbcc");
		Assert.assertEquals(-1, actual);
	}
	
	@Test
	public void test4()
	{
		int actual = firstUniqueCharacter("abcde");
		Assert.assertEquals(0, actual);
	}
}
