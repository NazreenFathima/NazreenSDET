package mandatoryHomeWork.week13.HW;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class MostCommonWord 
{
	/*
	 * https://leetcode.com/problems/most-common-word/description/
	 * 
	 * understood : yes
	 * input : String, String[]
	 * output: String
	 * 
	 * Pseudocode:
	 * 1) Convert the String paragraph to String[] --> to lower case nd remove the punctuations
	 * 2) Create a hashMAp;
	 * 3) Iterate through for each loop nd hav the K-V pair
	 * 4) Remove the banned words from the hashMap
	 * 5) Set max= Integer.MIN
	 * 5) Initialise the result as empty string
	 * 6) Iterate the HashMAp through for each loop
	 * 7) If value>max -->set max nd result
	 * 8) Finally return result;
	 */

	public String mostCommonWord(String paragraph, String[] banned) 
	{
		String[] arr = paragraph.toLowerCase().split("[!?,';.\\s]+");
		HashMap<String, Integer> hm = new HashMap<>();

		for(String s :arr) 
		{
			hm.put(s, hm.getOrDefault(s, 0)+1);
		}

		for(String ban :banned) 
		{
			hm.remove(ban);
		}

		Integer max = Integer.MIN_VALUE;
		String result = "";
		for (Map.Entry<String, Integer> entry : hm.entrySet()) 
		{
			if(entry.getValue()>max) 
			{
				max=entry.getValue();
				result = entry.getKey();
			}
		}
		return result;       
	}
	
	@Test
	public void test1()
	{
		String actual = mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[] {"hit"});
		Assert.assertEquals("ball", actual);
	}
	
	@Test
	public void test2()
	{
		String actual = mostCommonWord("a.", new String[] {});
		Assert.assertEquals("a", actual);
	}

}
