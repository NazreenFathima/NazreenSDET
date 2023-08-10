package week1.day2CW;

import org.junit.Assert;
import org.junit.Test;


public class TwoSum 
{
	/*
	 * https://leetcode.com/problems/two-sum/description/
	 * 
	 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
	 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
	 * You can return the answer in any order.

	 * Input : int[], int
	 * Output : int[]
	 * Constraints : 
	 * 
	 * Data Set:
	 * Input: nums = [2,7,11,15], target = 9
		Output: [0,1]
		Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
		
		Input: nums = [3,2,4], target = 6
		Output: [1,2]
		
		Input: nums = [3,3], target = 6
		Output: [0,1]
	 * 
	 * Pseudocode : 
	 * 1. Iterate through the for loop and set the target
	 * 2. Iterate through another for loop
	 * 2. When int[i]+int[j] == target
	 * 3. Get the position if the index
	 * 
	 */
	
	public int[] TwoSumsProg (int[] nums, int target)
	{
		for (int i=0; i<nums.length; i++)
		 {
			 for (int j=i+1; j<nums.length; j++)
			 {
				 if (nums[i]+nums[j]==target)
				 {
					 return new int[] {i,j};
				 }
			 }
		 }
		return new int[] {-1,-1};
	}
	
	@Test
	public void test1()
	{
		 int[] actual = TwoSumsProg (new int[] {2,7,11,15}, 9);
		 Assert.assertArrayEquals(new int[] {0,1}, actual);
	}
	
	@Test
	public void test2()
	{
		 int[] actual = TwoSumsProg (new int[] {3,2,4}, 6);
		 Assert.assertArrayEquals(new int[] {1,2}, actual);
	}
	
	@Test
	public void test3()
	{
		 int[] actual = TwoSumsProg (new int[] {3,3}, 6);
		 Assert.assertArrayEquals(new int[] {0,1}, actual);
	}
}
