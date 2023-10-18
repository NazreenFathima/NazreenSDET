package mandatoryHomeWork.morningSession;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class Sept6_MinimizeTheDifference 
{
	/*
	 * understood : yes 
	 * input : int[], int
	 * output :int
	 * 
	 *  Pseudocode:
	 *  1) when the element is less than or equal to k --> elemnt+k
	 *   else element-k
	 *  2) sort the array
	 *  3) return the last elemnt-first element in the array
	 */

	public int minimizeTheDifference(int[] arr, int k)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i]<=k) 
			{
				arr[i]=arr[i]+k;
			}
			else if (arr[i]>k)
			{
				arr[i]=arr[i]-k;
			}
		}
		
		Arrays.sort(arr);
		int result=arr[(arr.length-1)]-arr[0];

		return result;	
	}

	@Test
	public void test1()
	{
		int actual = minimizeTheDifference (new int[] {1,5,8,10}, 2);
		Assert.assertEquals(5, actual);
		System.out.println(actual);
	}
	
	@Test
	public void test2()
	{
		int actual = minimizeTheDifference (new int[] {1,2,3,4,5}, 2);
		Assert.assertEquals(3, actual);
		System.out.println(actual);
	}
	
	@Test
	public void test3()
	{
		int actual = minimizeTheDifference (new int[] {8}, 2);
		Assert.assertEquals(0, actual);
		System.out.println(actual);
	}
}
