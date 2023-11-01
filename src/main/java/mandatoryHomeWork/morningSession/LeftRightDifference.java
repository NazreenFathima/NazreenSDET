package mandatoryHomeWork.morningSession;

import org.junit.Assert;
import org.junit.Test;

public class LeftRightDifference 
{
	/*
	 * https://leetcode.com/problems/left-and-right-sum-differences/
	 * 
	 * understood : yes
	 * input : int[]
	 * output : int[]
	 * 
	 * Pseudocode:
	 * 1) Initialise leftSum[], rightSum[], answer[]
	 * 2) Initialise lSum nd rSum equals to 0;
	 * 3) Iterate through the for loop for leftSum nd rightSum
	 * 4) get the answer[] by math.abs
	 * 5) return abs;
	 * 
	 */

	public int[] leftRightDifference(int[] nums) 
	{
		int leftSum[] = new int[nums.length];
		int rightSum[] = new int[nums.length];
		int answer[] = new int[nums.length];
		
		int lSum = 0;
		for(int i=0; i<nums.length; i++)
		{
			leftSum[i]=lSum;
			lSum+=nums[i];
		}
		
		int rSum=0;
		for (int i=nums.length-1; i>=0; i--)
		{
			rightSum[i]=rSum;
			rSum+=nums[i];
		}
		
		for(int i=0; i<nums.length; i++)
		{
			answer[i] = Math.abs(leftSum[i]-rightSum[i]);
		}
		
		return answer;
	}
	
	@Test
	public void test1()
	{
		int[] actual = leftRightDifference(new int[] {10,4,8,3});
		int[] expected = {15,1,11,22};
		Assert.assertArrayEquals(actual, expected);
	}
	
	@Test
	public void test2()
	{
		int[] actual = leftRightDifference(new int[] {1});
		int[] expected = {0};
		Assert.assertArrayEquals(actual, expected);
	}
}
