package week1.day1CW;

import org.junit.Assert;
import org.junit.Test;

public class OccuranceOfX
{
	/*
	 * Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[].
	 * 
	 * Input : int[]
	 * Output : int
	 * Constraints : No constraints
	 * 
	 * Data Set 
	 * Positive : 
	 * {1,1,2,2,2,2,3}, x=2, O/p = 4
	 * Negative : 
	 * Edge : 
	 * 
	 * Psedocode:
	 * 1. Get the target element to be the count of number 
	 * 2. Iterate the given int[]
	 * 3. If TargetElement==nums[i]
	 *    count+1
	 * 4. Return count
	 */
	
	public int FindOccuranceOfX (int[] nums, int num)
	{
		int count = 0;
		for (int i=0; i<nums.length; i++)
		{
			if (nums[i] == num)
					{
						count++;
					}
		}
		return count;
		
	}
	
	@Test
	public void test1()
	{
		int actual = FindOccuranceOfX(new int[] {1,1,2,2,2,2,3}, 2 );
		Assert.assertEquals(4, actual);
	}
}
