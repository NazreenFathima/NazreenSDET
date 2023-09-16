package mandatoryHomeWork.week10.CW;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MoveAllZeroesUsingTwoPointer1 
{
	/*
	 *   Pseudocode
    1. assign left and right as 0
    2. loop till either of index is breaching the array length
    3. if left value is 0 and right value is not 0, replace the value if left as right
    4. if left is not equal to 0, increment the left (and right should always be greater than left),
        so increment right as well
    5. if right is equal to zero, increment right
	 */
	public int [] moveZeroes(int[] nums) 
	{
		//      int left = 0, right = 0;
		//      while(left < nums.length && right < nums.length){
		for(int left = 0, right = 0 ; left < nums.length && right < nums.length ;)
		{
			if(nums[left] == 0 && nums[right] !=0)
			{
				nums[left] = nums[right];
				nums[right] = 0;
			}
			else
			{
				if(nums[left] != 0) 
				{
					left++;
					right++;
				}
				else if(nums[right] == 0) 
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
		System.out.println(Arrays.toString(actual));
		Assert.assertArrayEquals(expected, actual);

	}

	@Test
	public void test2()
	{
		int[] actual = moveZeroes(new int[] {0,0,0,1,2,3});
		int[] expected = {1,2,3,0,0,0};
		System.out.println(Arrays.toString(actual));
		Assert.assertArrayEquals(expected, actual);

	}

	@Test
	public void test3()
	{
		int[] actual = moveZeroes(new int[] {1,2,3,0,0,0});
		int[] expected = {1,2,3,0,0,0};
		System.out.println(Arrays.toString(actual));
		Assert.assertArrayEquals(expected, actual);
	}
}
