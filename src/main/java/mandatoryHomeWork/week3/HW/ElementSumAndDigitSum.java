package mandatoryHomeWork.week3.HW;

import org.junit.Test;

import junit.framework.Assert;

public class ElementSumAndDigitSum 
{
	/*
	 * Understood the prob : YES
	 * 
	 * Input : int[]
	 * Output : int
	 * 
	 * DataSet : 
	 * Input: nums = [1,15,6,3]
Output: 9
Explanation: 
The element sum of nums is 1 + 15 + 6 + 3 = 25.
The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
The absolute difference between the element sum and digit sum is |25 - 16| = 9.
Input: nums = [1,2,3,4]
Output: 0
Explanation:
The element sum of nums is 1 + 2 + 3 + 4 = 10.
The digit sum of nums is 1 + 2 + 3 + 4 = 10.
The absolute difference between the element sum and digit sum is |10 - 10| = 0.
`	 *
	 *Pseudocode:
	 *1) [1,15,6,3]
	 */
	
	
	public int differenceOfSum(int[] nums) 
	{	
		int sum = 0;
		for (int i=0; i<nums.length; i++)
		{
			 sum = sum + nums[i];
		}
        
		int sum1=0, sum2 =0;
		for (int j=0; j<nums.length; j++)
		{
			if (nums[j]>9)
			{
				sum1 = nums[j]/10 + nums[j]%10;
				sum2 = sum1 + sum2;

			}
			else
			{
			sum2 = sum2 + nums[j];
			}
			
		}
		
		return Math.abs(sum - sum2);
		
    }
	
	@Test
	public void test2()
	{
		int actual = differenceOfSum(new int[] {1,15,6,3});
		Assert.assertEquals(9, actual);
	}
}
