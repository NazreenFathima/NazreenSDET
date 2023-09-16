package mandatoryHomeWork.week10.CW;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class AddUptoTarget 
{
	/*
	 * Given a sorted array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
Input: nums = [2,3,5,7], target = 9
Output: [0,3]
Output: Because nums[0] + nums[3] == 9, we return [0, 3].
	 *
	 */
	
	public int[] addUptoTarget(int[] intArray, int target)
	{
		for (int i=0; i<intArray.length; i++)
		{
			for (int j=i+1; j<intArray.length; j++ )
			{
				if(intArray[i] + intArray[j] == target)
				{
	                return new int[] {i,j};
				}
			}
		}
		return null;
	} 
	
	@Test
	public void test1()
	{
		int[] actual=addUptoTarget(new int[]{2,3,5,7},9);
        int[] expected = {0,3};
        System.out.println(Arrays.toString(actual));
        Assert.assertArrayEquals(actual, expected);
	}
	
	@Test
	public void test2()
	{
		int[] actual = addUptoTarget(new int[] {1,1,1,1}, 2);
		int[] expected = {0,1};
		System.out.println(Arrays.toString(actual));
		 Assert.assertArrayEquals(actual, expected);
	}

}
