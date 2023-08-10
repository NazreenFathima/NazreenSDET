package redo;

import org.junit.Assert;
import org.junit.Test;

public class TwoSum 
{
	/*
	 * 
	 */
	
	public int[] Sum (int[] nums, int target)
	{	
		for (int i=0; i<nums.length; i++)
		{
			for (int j=i+1; j<nums.length; j++)
			{
				if (nums[i]+nums[j]==target)
				{
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
	}
	@Test
	public void test1()
	{
		 int[] actual = Sum (new int[] {2,7,11,15}, 9);
		 Assert.assertArrayEquals(new int[] {0,1}, actual);
	}
	
	@Test
	public void test2()
	{
		 int[] actual = Sum (new int[] {3,2,4}, 6);
		 Assert.assertArrayEquals(new int[] {1,2}, actual);
	}
	
	@Test
	public void test3()
	{
		 int[] actual = Sum (new int[] {3,3}, 6);
		 Assert.assertArrayEquals(new int[] {0,1}, actual);
	}
}
