package mandatoryHomeWork.week10.CW;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MoveAllZeroesUsingTwoPointer 
{
	/*
	 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
	 *
	 *understood : yes
	 *input : int[]
	 *output : int[]
	 *
	 *second index>first Index
	 *
	 *Pseudocode:
	 *1)
	 *2)
	 *3)
	 *4)
	 */

	public int[] moveAllZeroes(int[] arr)
	{
		int left=0;
		int right= 1;
		while(right<arr.length)
		{
			if (arr[left]==0 && arr[right]!=0)
			{
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
			if (arr[left]!=0)
			{
				left++;
			}
			if(arr[right]==0)
			{
				right++;
			}
			if(left ==right )
			{
				right++;
			}
		}
		return arr;
	}

	@Test
	public void test1()
	{
		int[] actual = moveAllZeroes(new int[] {0,1,0,3,12});
		int[] expected = {1,3,12,0,0};
		System.out.println(Arrays.toString(actual));
		Assert.assertArrayEquals(expected, actual);

	}

	@Test
	public void test2()
	{
		int[] actual = moveAllZeroes(new int[] {0,0,0,1,2,3});
		int[] expected = {1,2,3,0,0,0};
		System.out.println(Arrays.toString(actual));
		Assert.assertArrayEquals(expected, actual);

	}

	@Test
	public void test3()
	{
		int[] actual = moveAllZeroes(new int[] {1,2,3,0,0,0});
		int[] expected = {1,2,3,0,0,0};
		System.out.println(Arrays.toString(actual));
		Assert.assertArrayEquals(expected, actual);
	}


}
