package mandatoryHomeWork.week4;

import org.junit.Assert;
import org.junit.Test;

public class AverageValueOfEvenNumberDivisibleBy3 
{
	/*
	 * Understood the problem : YES
	 * 
	 * Input : int[]
	 * Output : int
	 * 
	 * DataSet:
	 * Input: nums = [1,3,6,10,12,15]
Output: 9
Explanation: 6 and 12 are even numbers that are divisible by 3. (6 + 12) / 2 = 9.

Input: nums = [1,2,4,7,10]
Output: 0
Explanation: There is no single number that satisfies the requirement, so return 0.
	 *
	 *
	 *Pseudocode:
	 *1) Initialise sum and count as 0
	 *2) Iterate through the for loop
	 *3) Check if the number is divisible by 6, if its divible then add to sum and increase the count
	 *4) When count equals 0 return 0 else return sum/count
	 *
	 */
	
	public int averageValue(int[] nums)
	{	
		int sum = 0, count = 0;
		for (int i=0; i<nums.length; i++)
		{
			if (nums[i]%6==0)
			{
				sum = sum + nums[i];
				count ++;
			}
		}
		
		if (count==0)
		{
			return 0;
		}
		else 
		{
		return sum/count;
		}
	}
	
	@Test
	public void test1()
	{
		int actual = averageValue (new int[] {1,3,6,10,12,15});
		Assert.assertEquals(9, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = averageValue (new int[] {1,2,4,7,10});
		Assert.assertEquals(0, actual);
	}
	
}
