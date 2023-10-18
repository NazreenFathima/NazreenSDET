package mandatoryHomeWork.week14.HW;

import org.junit.Test;
import org.testng.Assert;

public class FirstUniqueCharacter 
{
	/*
	 * https://leetcode.com/problems/first-unique-character-in-a-string/
	 * 
	 * understood : yes
	 * input : String
	 * output : int
	 * 
	 * Pseudocode:
	 * 1) Initialise int[] of length 26
	 * 2) Use freq array iterate through the for loop
	 * 3) return the index when occurance is 1
	 * 4) else return -1;
	 * 
	 */

	public int firstUniqChar(String s) 
	{
		int[] arr = new int[26];
		for (int i=0; i<s.length(); i++)
		{
			arr[s.charAt(i)-'a']++;
		}
		for (int i=0; i<s.length(); i++)
		{
			if (arr[s.charAt(i)-'a']==1)
			{
				return i;
			}
		}
		return -1;
	}

	@Test
	public void test1()
	{
		int actual = firstUniqChar("leetcode");
		Assert.assertEquals(actual, 0);
	}
	
	@Test
	public void test2()
	{
		int actual = firstUniqChar("loveleetcode");
		Assert.assertEquals(actual, 2);
	}
	
	@Test
	public void test3()
	{
		int actual = firstUniqChar("aabb");
		Assert.assertEquals(actual, -1);
	}

}
