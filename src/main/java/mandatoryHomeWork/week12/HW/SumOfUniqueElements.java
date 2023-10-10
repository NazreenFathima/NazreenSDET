package mandatoryHomeWork.week12.HW;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class SumOfUniqueElements 
{
	/*
	 * understood : yes
	 * input : int[]
	 * output : int
	 * 
	 * Pseudocode
	 * 1) Initialise sum=0;
	 * 2) Iterate through the for loop til array length nd find the frequency using hashmap
	 * 3) Iterate throught eh map, when value is 1--> add to sum
	 * 4) return sum
	 */

	public int sumOfUnique(int[] nums) 
	{
		Map<Integer,Integer> hs = new HashMap<>();
		int sum=0;
		for(int i=0;i<nums.length;i++)
		{
			hs.put(nums[i], hs.getOrDefault(nums[i],0)+1);
		}

		for(Map.Entry<Integer,Integer> entry :hs.entrySet())
		{
			if(entry.getValue()==1)
			{
				sum += entry.getKey();
			}
		}
		return sum;
	}
	
	@Test
	public void test1() 
	{
		int actual = sumOfUnique(new int[] {1,2,3,2});
		Assert.assertEquals(4, actual);
	}
	
	@Test
	public void test2() 
	{	
		int actual = sumOfUnique(new int[] {1,1,1,1,1});
		Assert.assertEquals(0,actual );
	}
	
	@Test
	public void test3() 
	{	
		int actual = sumOfUnique(new int[] {1,2,3,4,5});
		Assert.assertEquals(15,actual );
	}
}
