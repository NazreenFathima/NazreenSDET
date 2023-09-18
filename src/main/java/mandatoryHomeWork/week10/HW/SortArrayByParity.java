package mandatoryHomeWork.week10.HW;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SortArrayByParity 
{
	/*
	 * understood : yes
	 * input : int[]
	 * output : int[]
	 * 
	 * Pseudocode:
	 * 1) Initialise the left and right pointer =0,1
	 *    while(left<nums.length && right<nums.length)
	 * 2) if arr[left]%2!=0 &&arr[right]%2!=0 -->right++;
	 *    else if arr[left]%2!=0 &&arr[right]%2==0 --> swap --> left++, right++
	 *    else right++, left++
	 * 3) Return nums
	 */
	
	public int[] sortArrayByParity(int[] nums)
	{
		int left=0;
		int right =1;
		int temp=0;
		while(left<nums.length&&right<nums.length)
		{
			if ( nums[left]%2!=0 && nums[right]%2!=0 )
			{
				right++;
			}
			else if (nums[left]%2!=0 && nums[right]%2==0)
			{
				temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
				left++;
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
		int[] actual = sortArrayByParity(new int[] {3,1,2,4});
		int[] expected = {2,4,3,1};
		System.out.println(Arrays.toString(actual));
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void test2()
	{
		int[] actual = sortArrayByParity(new int[] {0});
		int[] expected = {0};
		System.out.println(Arrays.toString(actual));
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void test3()
	{
		int[] actual = sortArrayByParity(new int[] {2,4,6,1,5,8});
		int[] expected = {2,4,6,8,5,1};
		System.out.println(Arrays.toString(actual));
		Assert.assertArrayEquals(expected, actual);
	}
	
	
}
