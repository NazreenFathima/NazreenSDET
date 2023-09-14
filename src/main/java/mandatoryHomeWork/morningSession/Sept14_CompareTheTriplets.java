package mandatoryHomeWork.morningSession;

import org.junit.Assert;
import org.junit.Test;

public class Sept14_CompareTheTriplets 
{
	/*
	 * understood : yes
	 * input : int[], int[]
	 * output : int[]
	 * 
	 * Pseudocode: 
	 * 1)Initialise Alice and Bob =0;
	 * 2)compare arr1 and arr2;
	 * 3)if arr1>arr2 --> Alice++;
	 * 		elseif arr2<arr1 -->Bob++
	 * 4) Return int[] {Alice, Bob}
	 *
	 */
	
	public int[] compareTheTriplets(int[] arr1, int[] arr2)
	{
		int Alice = 0;
		int Bob = 0;
		for (int i=0; i<arr1.length; i++)
		{
				if (arr1[i]>arr2[i])
				{
					Alice++;
				}
				else if(arr1[i]<arr2[i])
				{
					Bob++;
				}
		}
		return new int[] {Alice, Bob};
	}

	
	@Test
	public void test1()
	{
	int[] actual = compareTheTriplets(new int[] {1,2,3}, new int[] {3,2,1});
	int[] expected = {1,1};
	Assert.assertArrayEquals(actual, expected);
	}
	
	@Test
	public void test2()
	{
	int[] actual = compareTheTriplets(new int[] {3,2,1}, new int[] {3,2,1});
	int[] expected = {0,0};
	Assert.assertArrayEquals(actual, expected);
	}
	
}
