package mandatoryHomeWork.week4;

import org.junit.Assert;
import org.junit.Test;

public class SignOfProductArray 
{
	/*
	 * Understood the problem  : YES
	 * 
	 * Input : int[]
	 * Output : int
	 * 
	 * DataSet:
	 * Input: nums = [-1,-2,-3,-4,3,2,1]
Output: 1
Explanation: The product of all values in the array is 144, and signFunc(144) = 1

Input: nums = [1,5,0,2,-3]
Output: 0
Explanation: The product of all values in the array is 0, and signFunc(0) = 0

Input: nums = [-1,1,-1,1,-1]
Output: -1
Explanation: The product of all values in the array is -1, and signFunc(-1) = -1
	 *
	 *
	 *
	 *Pseudocode : 
	 *1) Initialize the positive number as 0.
	 *2) Iterate thorugh the array
	 *3) If the number is less than 0 , increase the number count
	 *4) else if the number is zero return 0
	 *5) if the number modulo 2 is equal to 0 then return 1 else return -1
	 */
	
	public int arraySign (int[] nums)
	{
		int Num = 0;
		for (int i=0; i<nums.length; i++)
		{
			if (nums[i]<0)
			{
				Num++;
			}
			else if (nums[i]==0)
			{
				return 0;
			}
		}
		
		if (Num %2 ==0)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}
	@Test
	public void test1()
	{
		int actual = arraySign (new int[] {-1,-2,-3,-4,3,2,1});
		Assert.assertEquals(1, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = arraySign (new int[] {1,5,0,2,-3});
		Assert.assertEquals(0, actual);
	}
	
	@Test
	public void test3()
	{
		int actual = arraySign (new int[] {-1,1,-1,1,-1});
		Assert.assertEquals(-1, actual);
	}
}
