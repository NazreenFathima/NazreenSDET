package mandatoryHomeWork.week1.HW;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;


public class MajorityElement 
{
	/*
	 * Input : int[]
	 * Output : int
	 * Constraints : no
	 * 
	 * DataSet
	 * Positive : 
	 * Input: nums = [3,2,3]
	   Output: 3
	   Input: nums = [2,2,1,1,1,2,2]
       Output: 2
	 * Negative : 
	 * Edge : 
	 * 
	 * Pseudocode : 
	 * 1. Iterate through int[], initialize count =0
	 * 2. With a nested for loop for iterating through the remaining elements.
	 * 3. Compare the item in position i with j
	 * 4. If any 2 values are equal - count ++
	 * 5. return count if count > n/2 
	 *
	 */
	
	public int MajorityEle (int[] nums)
	{	
		int count =0;
		for (int i=0; i<nums.length; i++)
		 {
			 for (int j=0; j<nums.length; j++)
			 {
				 if (nums[i]==nums[j])
				 {
					 count ++;
				 }
			 }
			 
				 if (count > nums.length /2)
				 {
					 return nums[i];
				
				 }
				 
				 count = 0;
			 }
		return -1;
		
	}
	
	@Test
	public void test1()
	{
		int actual = MajorityEle (new int[] {3,2,3});
		Assert.assertEquals(3, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = MajorityEle (new int[] {2,2,1,1,1,2,2});
		Assert.assertEquals(2, actual);
	}

}
