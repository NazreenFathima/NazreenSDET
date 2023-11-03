package mandatoryHomeWork.week16.HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FindAllAnagram 
{
	/*
	 * https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
	 * 
	 * understood : yes
	 * input : String, String
	 * output : List<Integer>
	 * 
	 * Pseudocode:
	 * 1) COnvert p String to char[]
	 * 2) sort the pChar[]
	 * 3) initialise k=s.length-p.length; n=p.length
	 * 4) Iterate through the for loop til k
	 * 5) get the substring of i to i+n  --> sort
	 * 6) if both are equal (add the index to list)
	 * 7) return the arrayList
	 * 
	 */

	public List<Integer> findAnagrams(String s, String p)
	{
		char[] pchar = p.toCharArray();
		Arrays.sort(pchar);
		
		int k=s.length()-p.length();
		int n=p.length();
		
		List<Integer> result = new ArrayList();
		
		for(int i=0; i<=k; i++)
		{
			String str = s.substring(i, i+n);
			char[] schar = str.toCharArray();
			Arrays.sort(schar);
			if(pchar.equals(schar))
			{
				result.add(i);
			}
		}
		return result;
	}
	
	@Test
	public void test1()
	{
		List<Integer> actual = findAnagrams("cbaebabacd","abc");
		Assert.assertEquals(Arrays.asList(0,6), actual);
	}
	
	@Test
	public void test2()
	{
		List<Integer> actual = findAnagrams("abab","ab");
		Assert.assertEquals(Arrays.asList(0,1,2), actual);
	}
}
