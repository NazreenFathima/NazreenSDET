package mandatoryHomeWork.week16.HW;

import org.junit.Assert;
import org.junit.Test;


public class MoveZeroes 
{
	/*
	 * https://leetcode.com/problems/move-zeroes/description/
	 * 
	 * understood : yes
	 * input : int[]
	 * output : int[]
	 * 
	 * Pseudocode:
	 * 1) Initialise left=0; right=1; (unidirectional pointers)
	 * 2) breaking condition(right<nums.length)
	 * 3) if left equals 0 nd right not equals 0 --> swap -> left++;right++
	 * 		else if left equals 0 nd right equals zero --> right++
	 * 			else left++, right++
	 * 4) return nums array
	 * 
	 * by this method we are not using extra space
	 * 
	 */

	public int[] moveZeroes(int[] nums) 
	{
		int left=0;
		int right=1;
		
		while(right<nums.length)
		{
			if(nums[left]==0 && nums[right]!=0)
			{
				int temp = nums[right];
				nums[right] = nums[left];
				nums[left]=temp;
				left++;
				right++;
			}
			else if(nums[left]==0 && nums[right]==0)
			{
				right++;
			}
			else
			{
				left++;
				right++;
			}
		}
		return nums;
	}
	
	@Test
	public void test1()
	{
		int[] actual = moveZeroes(new int[] {0,1,0,3,12});
		int[] expected = {1,3,12,0,0};
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void test2()
	{
		int[] actual = moveZeroes(new int[] {1,2,3,0,0,0});
		int[] expected = {1,2,3,0,0,0};
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void test3()
	{
		int[] actual = moveZeroes(new int[] {0});
		int[] expected = {0};
		Assert.assertArrayEquals(expected, actual);
	}
}
