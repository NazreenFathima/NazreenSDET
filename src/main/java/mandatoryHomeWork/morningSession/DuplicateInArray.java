package mandatoryHomeWork.morningSession;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DuplicateInArray 
{
	/*
	 * https://www.codingninjas.com/studio/problems/find-duplicate-in-array_8289592
	 * 
	 * understood : yes
	 * Input : ArrayList<Integer> ..int[]
	 * output : int
	 * 
	 * Pseudocode : 
	 * 1) Iterate through the nested for loops
	 * 2) wen the nums are same increase the count
	 * 3) wen count>1 return the num from the array
	 */
	
	public int duplicateInArray(int[] nums)
	{	
		int count=0;
		for (int i=0; i<nums.length; i++)
		{
			for (int j=0; j<nums.length; j++)
			{
				if (nums[i]==nums[j])
				{
					count++;
				}
			}
			if (count >1)
			{
				return nums[i];
			}
		}
		return -1;
	}

	
	@Test
	public void test1()
	{
		int actual = duplicateInArray (new int[] {1,1,2});
		Assert.assertEquals(1, actual);
	}
	
	
}
