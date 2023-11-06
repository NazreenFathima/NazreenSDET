package mandatoryHomeWork.week17.HW;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class MajorityElement 
{
	/*
	 * https://leetcode.com/problems/majority-element/
	 * 
	 * understoood : yes 
	 * input : int[]
	 * output : int
	 * 
	 * Pseudocode: 
	 * 1) Sort the array
	 * 2) return the middle element in the array
	 * 
	 */
	
	public int majorityElement(int[] nums)
	{
		int n =nums.length;
		Arrays.sort(nums);
		return nums[n/2];
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
