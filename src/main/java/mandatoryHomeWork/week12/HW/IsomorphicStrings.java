package mandatoryHomeWork.week12.HW;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class IsomorphicStrings 
{
	/*
	 * https://leetcode.com/problems/isomorphic-strings/description/
	 * 
	 * Understood : yes
	 * input : String, String
	 * output : String
	 * 
	 * Pseudocode: 
	 * 1) if both string length are differetn - >return false
	 * 2) create a hashMap
	 * 3) if hashMap doesnt contain the key nd hashMap doesnot contain the Value --> pair it
	 *   s->key, t-> value
	 * 4) else check with t--> different--> return false
	 * 
	 */
	
	public boolean isIsomorphic(String s, String t) 
	{
		if(s.length()!=t.length()) 
		{
			return false;
		}
			
		Map<Character, Character> hm = new HashMap<>();

		for (int i = 0; i < s.length(); i++) 
		{
			char sChar = s.charAt(i);
			char tChar = t.charAt(i);
			if (!hm.containsKey(sChar)) 
			{
				if (!hm.containsValue(tChar))
				{
					hm.put(sChar, tChar);
				}
				else
				{
					return false;
				}	
			}
			else 
			{
				char ch = hm.get(sChar);
				//System.out.print(ch);
				if (ch != tChar)
				{
					return false;
				}	
			}
		}
		return true;
	}
	
	@Test
	public void test1() 
	{
		Assert.assertEquals(true, isIsomorphic("egg", "add"));
	}

	@Test
	public void test2() 
	{
		Assert.assertEquals(false, isIsomorphic("foo", "bar"));
	}

	@Test
	public void test3() 
	{
		Assert.assertEquals(true, isIsomorphic("paper", "title"));
	}
}
