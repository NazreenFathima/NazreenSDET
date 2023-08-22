package mandatoryHomeWork.week7;

import org.junit.Assert;
import org.testng.annotations.Test;

public class SetMismatch 
{
	/*
	 * Understood the prob : YES
	 * Input : int[]
	 * Output : int[] 
	 * 
	 * Pseudocode: 
	 * 1) Compare every single element in the array with the numbers from one to n.
	 * 2) Return duplicate when count = 2
	 * 			 missing when count =0
	 * 
	 */
	
	public int[] Mismatch (int[] nums)
	{	
		int duplicate=0, missing=0;
		for (int i=1 ; i<=nums.length; i++)
		{
			int count = 0;
			for (int j=0; j<nums.length; j++)
			{
				if (nums[j]==i)
				{
					count++;
				}
			}
			if (count==2)
			{
				duplicate = i;
			}
			if (count==0)
			{
				missing =i;
			}	
		}
		return new int[] {duplicate, missing};
			
	}
	
	@Test
	public void test1()
	{
		int[] nums = {1,2,2,4};
		int[] result = {2,3};
		Assert.assertArrayEquals(result, Mismatch(nums));
		
	}
	
	@Test
	public void test2()
	{
		int[] nums = {1,3,3};
		int[] result = {3,2};
		Assert.assertArrayEquals(result, Mismatch(nums));
		
	}
	
	@Test
	public void test3()
	{
		int[] nums = {2,2};
		int[] result = {2,1};
		Assert.assertArrayEquals(result, Mismatch(nums));
		
	}
	
	
	
}
