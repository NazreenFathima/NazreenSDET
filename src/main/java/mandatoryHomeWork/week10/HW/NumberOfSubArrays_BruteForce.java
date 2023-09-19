package mandatoryHomeWork.week10.HW;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfSubArrays_BruteForce 
{
	/*
	 * understood = yes
	 * input : int[] , int, int
	 * output : int
	 * 
	 * Pseudocode : 
	 * 1)Initialise count=0
	 * 2)iterate through the for loop till nums.length-k
	 *    Initialise sum=0
	 *    Iterate through the inner for loop from i - n-k
	 *    keep adding sum
	 *    if sum/k >=threshold -> count++
	 * 3) Return count
	 *      
	 */
	
	public int numberOfSubArrays(int[] nums, int k, int th)
	{
		//int sum=0;
		int count =0;
		int n = nums.length;
		for (int i=0; i<=n-k; i++)
		{
			int sum=0;
			for (int j=i; j<i+k;j++)
			{
				sum+= nums[j];
			}
			if (sum/k>=th)
			{
				count++;
			}
		}
		return count;
	}
	
	@Test
	public void test1()
	{
		int actual = numberOfSubArrays(new int[] {2,2,2,2,5,5,5,8}, 3,4);
		System.out.println(actual);
		Assert.assertEquals(3, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = numberOfSubArrays(new int[] {11,13,17,23,29,31,7,5,2,3}, 3,5);
		System.out.println(actual);
		Assert.assertEquals(6, actual);
	}
}
