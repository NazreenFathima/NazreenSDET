package mandatoryHomeWork.morningSession;

import org.junit.Test;
import org.testng.Assert;

public class Sept5_RotateArray 
{
	/*
	 * understood = yes
	 * input : int[], int
	 * output : int[]
	 * 
	 * Pseudocode:
	 * 1) chk if k is greater than the length of array --> k=k%length of array
	 * 2) create temp array to store the first k elements
	 * 3) copy the first k elements to temp array
	 * 4) shift the remaining to left
	 * 5) copy the temp array to end of array
	 * 
	 * 
	 */
	
	public int[] rotataArray(int[] arr, int k)
	{
		int n=arr.length;
		int index=0;
		
		int[] arr1=new int[arr.length];
		for (int i=k; i<n; i++)
		{
			arr1[index++]=arr[i];
		}
		for (int i=0; i<k; i++)
		{
			arr1[index++]=arr[i];
		}
		return arr1;	
	}
	
	@Test
	public void test1() 
	{
		int[] actual=rotataArray(new int[]{7 ,5 ,2 ,11 ,2 ,43 ,1 ,1}, 2);
		int[] expected = {2, 11, 2 ,43, 1 ,1 ,7 ,5};
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void test2() 
	{
		int[] actual=rotataArray(new int[]{5,6,7,8}, 3);
		int[] expected = {8,5,6,7};
		Assert.assertEquals(actual, expected);
	}
	
	
}
