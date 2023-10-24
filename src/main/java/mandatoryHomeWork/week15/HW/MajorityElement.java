package mandatoryHomeWork.week15.HW;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class MajorityElement 
{
	/*
	 * https://leetcode.com/problems/majority-element/description/
	 * 
	 * understood : yes
	 * input : int[]
	 * output : int
	 * 
	 * Pseudocode : 
	 * 1) Sort the array
	 * 2) return themiddle elemnt in the array
	 * 
	 * Can be solved using HashMap too :)
	 */

	public int majorityElement(int[] nums) 
	{
		int n=nums.length;
		Arrays.sort(nums);
		return nums[n/2];
	}
	
	@Test
	public void test1()
	{
		int actual = majorityElement(new int[] {3,2,3});
		Assert.assertEquals(actual , 3);
	}
	
	@Test
	public void test2()
	{
		int actual = majorityElement(new int[] {2,2,1,1,1,2,2});
		Assert.assertEquals(actual , 2);
	}
}
