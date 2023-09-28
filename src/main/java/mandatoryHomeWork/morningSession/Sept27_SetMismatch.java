package mandatoryHomeWork.morningSession;

import org.junit.Assert;
import org.junit.Test;


public class Sept27_SetMismatch 
{
	/*
	 * understood : yes
	 * input : int[]
	 * output : int[]
	 * 
	 * PPseudocode:
	 * 1) Compare every single element in the array with the numbers from one to n.
	 * 2) Return duplicate when count = 2
	 * 			 missing when count =0
	 * 
	 * 
	 */
	
	public int[] setMismatch(int[] nums)
	{
		int duplicate=0, missing=0;
		for (int i=1 ; i<=nums.length; i++)
		{
			int count = 0;
			for (int j=0; j<nums.length; j++)
			{
				if (nums[j]==i)
				{
					count++;
				}
			}
			if (count==2)
			{
				duplicate = i;
			}
			if (count==0)
			{
				missing =i;
			}	
		}
		return new int[] {duplicate, missing};
	}
	
	@Test
	public void test1()
	{
		int[] actual = setMismatch(new int[] {1,2,2,4});
		int[] expected = {2,3};
		Assert.assertArrayEquals(actual, expected);
	}
	
	@Test
	public void test2()
	{
		int[] actual = setMismatch(new int[] {1,1});
		int[] expected = {1,2};
		Assert.assertArrayEquals(actual, expected);
	}
	
	@Test
	public void test3()
	{
		int[] actual = setMismatch(new int[] {2,2});
		int[] expected = {2,1};
		Assert.assertArrayEquals(actual, expected);
	}
}

