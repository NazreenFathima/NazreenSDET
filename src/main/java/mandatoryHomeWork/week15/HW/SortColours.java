package mandatoryHomeWork.week15.HW;

import org.junit.Test;
import org.testng.Assert;

public class SortColours 
{
	/*
	 * https://leetcode.com/problems/sort-colors/description/
	 * 
	 * understood: yes
	 * input : int[]
	 * output : int[]
	 * 
	 * PSeudocode: 
	 * 1) set left=0(pointer for 0) nd right=length-1(pointer for 2) and current=0
	 * 2) iterate through while loop (current<=right)
	 * 3) if current equals 0 --> swap current nd left--> increment current nd left
	 * 4) else if current equals 2--> swap current nd right--> decrement right
	 * 5) else increment current-->if 1
	 * 6) return nums array.
	 */

	
	public int[] sortColors(int[] nums) 
	{
		int left = 0;        
		int right = nums.length - 1;  
		int current = 0;    

		while (current <= right) 
		{
			if (nums[current] == 0) 
			{
				int temp = nums[current];
				nums[current] = nums[left];
				nums[left] = temp;
				current++;
				left++;
			} 
			else if (nums[current] == 2) 
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
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void test2()
	{
		int[] actual = sortColors(new int[] {2,0,1});
		int[] expected = {0,1,2};
		Assert.assertEquals(actual, expected);
	}
}
