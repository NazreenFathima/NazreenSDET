package mandatoryHomeWork.morningSession;

import org.junit.Test;

import junit.framework.Assert;

public class Sept5_LargestElementInArray 
{
	/*
	 * understood : yes
	 * input : int[]
	 * output : int
	 * 
	 * Pseudocode : 
	 * 1) Initialise the max as Integer.MIN_VALUE
	 * 2) iterate through the for loop
	 * 3) compare the first element to the max value
	 * 4) return the max
	 * 
	 */
	
	public int largestElementInArray(int[] arr)
	{
		int n=arr.length;
		int max=Integer.MIN_VALUE;
		for (int i=0; i<n; i++)
		{
			if (arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	
	@Test
	public void test1()
	{
		int actual = largestElementInArray (new int[] {4,7,8,6,7,6});
		Assert.assertEquals(8, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = largestElementInArray (new int[] {5,9,3,4,8,4,3,10});
		Assert.assertEquals(10, actual);
	}
	
	@Test
	public void test3()
	{
		int actual = largestElementInArray (new int[] {-1,-4,-9});
		Assert.assertEquals(-1, actual);
	}
	
}
