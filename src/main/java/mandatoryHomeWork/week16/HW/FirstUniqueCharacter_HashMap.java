package mandatoryHomeWork.week16.HW;

import java.util.HashMap;

import org.junit.Test;
import org.testng.Assert;

public class FirstUniqueCharacter_HashMap 
{
	/*
	 * https://leetcode.com/problems/first-unique-character-in-a-string/description/
	 * 
	 * understood : yes
	 * input : String
	 * output : int
	 * 
	 * PSeudocode: 
	 * 1) Initialise a hashMap
	 * 2) Iterate through for each loop and add each character to the hashMap
	 * 3) Iterate through another for loop -- when key contains the current character nd occurance of 
	 *    the current character equals 1 --> return the index
	 * 4) If no unique character is found --> return -1
	 * 
	 * Logic HashMap --hs.containsKey(s.charAt(i)) if this is not used--> will get null pointer exception
	 */
	
	public int firstUniqueCharacter(String s)
	{
		HashMap<Character, Integer> hs = new HashMap<>();
		for(Character ch : s.toCharArray())
		{
			hs.put(ch, hs.getOrDefault(ch, 0)+1);
		}
		
		for(int i=0; i<s.length(); i++)
		{
			if(hs.containsKey(s.charAt(i)) && hs.get(s.charAt(i))==1)
			{
				return i;
			}
		}
;
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
