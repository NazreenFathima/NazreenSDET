package mandatoryHomeWork.week10.CW;

import org.junit.Assert;
import org.junit.Test;

public class AddUptoTargetUsingTwoPointer 
{
	/*
	 * Given a sorted array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
Input: nums = [2,3,5,7], target = 9
Output: [0,3]
Output: Because nums[0] + nums[3] == 9, we return [0, 3].
	 *
	 *Pseudocode:
	 *1) Assign two pointers, one at start and other at end
	 *2) add both the pointer elements
	 *3) if equal to target, return the indices.
	 *4) increment the startIndex and decrement the endIndex
	 */
	
	public int[] addUptoTarget(int[] intArray, int target)
	{
		int startIndex=0;
		int endIndex=intArray.length-1;
		while(startIndex<endIndex)
		{
			int sum = intArray[startIndex] + intArray[endIndex];
			if (sum == target)
			{
				return new int[] {startIndex, endIndex};
			}
			else if(sum >target)
			{
			 endIndex--;
			}
			else 
			{
		     startIndex++;
			}
		}
		return null;
	}
	
	@Test
	public void test1()
	{
		int[] actual=addUptoTarget(new int[]{2,3,5,7},9);
        int[] expected = {0,3};
        Assert.assertArrayEquals(actual, expected);
	}
	
	@Test
	public void test2()
	{
		int[] actual = addUptoTarget(new int[] {1,1,1,1}, 2);
		int[] expected = {0,3};
		 Assert.assertArrayEquals(actual, expected);
	}

	
}
