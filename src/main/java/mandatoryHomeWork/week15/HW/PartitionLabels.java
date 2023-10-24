package mandatoryHomeWork.week15.HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class PartitionLabels 
{
	/*
	 * https://leetcode.com/problems/partition-labels/description/
	 * 
	 * understood : yes
	 * input : String
	 * output : List<Integer>
	 * 
	 * Pseudocode: 
	 * 1) create arrayList result
	 * 2) create hashMap and iterate through all the characters in the string and add them as K(Character), Value(position)
	 * 3) initialise start nd end as 0
	 * 4) Iterate through the for loop and update end
	 * 5) if postiion nd end are same --> add to list (end-start+1), start=end+1
	 * 6) return result list
	 * 
	 * 
	 */

	public List<Integer> partitionLabels(String s) 
	{
		List<Integer> result = new ArrayList<>();
		
		Map<Character, Integer> hm = new HashMap<>();
		for(int i=0; i<s.length(); i++)
		{
			hm.put(s.charAt(i), i);
		}
		
		int start=0; 
		int end=0;
		
		for(int i=0; i<s.length(); i++)
		{
			end = Math.max(end, hm.get(s.charAt(i)));
			if(i==end)
			{
				result.add(end-start+1);
				start=end+1;
			}
		}
	
		return result;
	}

	@Test
	public void test()
	{
		Assert.assertEquals(Arrays.asList(9,7,8), partitionLabels( "ababcbacadefegdehijhklij"));
	}
	@Test
	public void test1()
	{
		Assert.assertEquals(Arrays.asList(10), partitionLabels("eccbbbbdec"));
	}
}
