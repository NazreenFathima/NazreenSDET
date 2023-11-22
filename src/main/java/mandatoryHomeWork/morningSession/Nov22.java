package mandatoryHomeWork.morningSession;

import org.junit.Assert;
import org.junit.Test;

public class Nov22 
{
	/*
	 * https://leetcode.com/problems/number-of-arithmetic-triplets/description/
	 * 
	 * Pseudocode : Brute
	 * Initialise count=0
	 * 1) Iterate through the nested for loops
	 * If (nums[k]-nums[j] == diff && nums[j]-nums[i]== diff) -->count++
	 *  
	 * 
	 * Pseudocode: Optimised : Two pointer
	 * initialise count=0
	 * 1) Iterate through loop til array length-2
	 * 2) Initialse j as next element of i and k as next element j
	 * 3) brking condition (k<nums.length)
	 * 4) if nums[k]-nums[j] == diff && nums[j]-nums[i]== diff -->count ++; j++; k++
	 *    else if nums[k]-nums[j] < diff && nums[j]-nums[i]== diff --> j++
	 *    else k++
	 * 5) Return count
	 * 
	 * 
	 * 
	 */

	@Test
	public void testArithmeticTriplet1()
	{
		int[] nums = {0,1,4,6,7,10};
		int diff = 3; 
		arithmeticTripletBrute(nums, diff);
		arithmeticTripletOptimized(nums, diff);

	}

	@Test
	public void testArithmeticTriplet2()
	{
		int[] nums = {4,5,6,7,8,9};
		int diff = 2; 
		arithmeticTripletBrute(nums, diff);
		arithmeticTripletOptimized(nums, diff);
	}

	@Test
	public void testArithmeticTriplet3()
	{
		int[] nums = {1,2,3,4,5,6};
		int diff = 5; 
		arithmeticTripletBrute(nums, diff);
		arithmeticTripletOptimized(nums, diff);
	}


	private void arithmeticTripletBrute(int[] nums, int diff) 
	{
        int count =0;
		for(int i=0; i<nums.length-2;i++)
		{
			for(int j=i+1; j<nums.length-1; j++)
			{
				for(int k=j+1; k<nums.length; k++)
				{
					if(nums[k]-nums[j] == diff && nums[j]-nums[i]== diff)
					{
						count++;
					}
				}
			}
		}
		System.out.println("Brute count:" +count);
	}
	

	private void arithmeticTripletOptimized(int[] nums, int diff) 
	{
		int n=nums.length;
		int count=0;
		for (int i=0; i<n-2; i++)
		{
			int j=i+1;
			int k=j+1;

			while(k<n)
			{
				int diff1 = nums[j] - nums[i];
				int diff2 = nums[k] - nums[j];

				if (diff1 == diff && diff2 == diff) 
				{
					count++;
					j++; 
					k++; 
				} 
				else if (diff1 < diff2) 
				{
					j++; 
				} 
				else 
				{
					k++;
				}
			}
		}
		System.out.println("Optimised count:" +count);
	}
	
}
