package mandatoryHomeWork.morningSession;

import org.junit.Assert;
import org.junit.Test;

public class Nov16_SortColours 
{
	/*
	 * https://leetcode.com/problems/sort-colors/
	 * 
	 * understood : yes
	 * input : int[]
	 * output : int[]
	 * 
	 * PSeudocode:
	 * Logic : Bidirectional pointer - dutch flag
	 * 
	 *  1) Initialise three pointers -> left(0), right(lenght-1), current(0)
	 *  2) if current equals 0 --> swap with left, increment current nd left
	 *      else current equals 2 --> swap with right, drcrement right
	 *        else current equals 1 --> increment current
	 * 
	 * 
	 */


	public int[] sortColors(int[] nums) 
	{
		int left=0;
		int right=nums.length-1;
		int current=0;
		
		while(current<=right)
		{
			if(nums[current]==0)
			{
				int temp = nums[current];
	            nums[current] = nums[left];
	            nums[left] = temp;
	            current++;
	            left++;
			}
			else if(nums[current]==2)
			{
				int temp = nums[current];
	            nums[current] = nums[right];
	            nums[right] = temp;
	            right--;
			}
			else
			{
				current++;
			}
		}
		return nums;
	}
	
	@Test
	public void test1()
	{
		int[] actual = sortColors(new int[] {2,0,2,1,1,0});
		int[] expected = {0,0,1,1,2,2};
		Assert.assertArrayEquals(actual, expected);
	}
	
	@Test
	public void test2()
	{
		int[] actual = sortColors(new int[] {2,0,1});
		int[] expected = {0,1,2};
		Assert.assertArrayEquals(actual, expected);
	}

}
