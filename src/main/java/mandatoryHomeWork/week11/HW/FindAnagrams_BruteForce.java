package mandatoryHomeWork.week11.HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FindAnagrams_BruteForce 
{
	/*
	 * understood : yes
	 * input : String, String
	 * output : List<Integer>
	 * 
	 * Pseudocode:
	 * 
	 */
	
	public List<Integer> findAnagrams(String s, String p)
	{	
		//char[] sch = s.toCharArray();
		char[] pch = p.toCharArray();
		Arrays.sort(pch);
		int k = s.length()-p.length();
		int n = p.length();
		//int index=0;
		
		List<Integer> result = new ArrayList();
		for (int i=0; i<=k; i++)
		{
			String str = s.substring(i, i+n);
			char[] sch = str.toCharArray();
			Arrays.sort(sch);
			if (Arrays.equals(sch, pch))
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
