package mandatoryHomeWork.week17.HW;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class MajorityElement_HAshMap 
{
	/*
	 * https://leetcode.com/problems/majority-element/
	 * 
	 * understoood : yes 
	 * input : int[]
	 * output : int
	 * 
	 * Pseudocode:
	 * 1) Create hashmap and count the number of c=occurances using getOrDefault method
	 * 2) Iterate through the hashmap --> if the value>nums.length/2-->return the key
	 * 3) if condition doesnt satisfy return 0
	 * 
	 * 
	 */

	public int majorityElement(int[] nums)
	{
		int n =nums.length/2;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i : nums)
		{
			hm.put(i, hm.getOrDefault(i, 0)+1);
		}

		for(Map.Entry<Integer, Integer> entry: hm.entrySet())
        {
			if(entry.getValue()>n)
			{
				return entry.getKey();
			}
        }
		
		return 0;
	}

	@Test
	public void test1()
	{
		int actual = majorityElement(new int[] {3,2,3});
		Assert.assertEquals(3, actual);
	}

	@Test
	public void test2()
	{
		int actual = majorityElement(new int[] {2,2,1,1,1,2,2});
		Assert.assertEquals(2, actual);
	}
}
