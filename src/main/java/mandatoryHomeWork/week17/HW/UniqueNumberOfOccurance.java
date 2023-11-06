package mandatoryHomeWork.week17.HW;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;
import org.testng.Assert;

public class UniqueNumberOfOccurance 
{
	/*
	 * https://leetcode.com/problems/unique-number-of-occurrences/
	 * 
	 * understood: yes
	 * input : int[]
	 * output : boolean
	 * 
	 * Pseudocode: 
	 * 1)CReate a hashmap and get the count of each int in array using getOrDefault
	 * 2) Create hashSet nd pass the map values
	 * 3) return true if both the sizes are same 
	 */
	
	public boolean uniqueNumberOfOccurance(int[] arr)
	{
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int ar: arr )
		{
			hm.put(ar, hm.getOrDefault(ar, 0)+1);
		}
		
		HashSet<Integer> hs = new HashSet<>(hm.values());
		
		return hm.size()==hs.size();
	}
	
	
	@Test
	public void test1()
	{
		boolean actual = uniqueNumberOfOccurance(new int[] {1,2,2,1,1,3});
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test2()
	{
		boolean actual = uniqueNumberOfOccurance(new int[] {1,2});
		Assert.assertEquals(false, actual);
	}
	
	@Test
	public void test3()
	{
		boolean actual = uniqueNumberOfOccurance(new int[] {-3,0,1,-3,1,1,1,-3,10,0});
		Assert.assertEquals(true, actual);
	}
}
