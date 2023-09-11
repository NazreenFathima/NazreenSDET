package mandatoryHomeWork.morningSession;

import org.junit.Assert;
import org.junit.Test;

public class Sept11_ArraySort
{
	/*
	 * Given an array A[] consisting of only 0s, 1s, and 2s. 
	 * The task is to write a function that sorts the given array. 
	 * The functions should put all 0s first, then all 1s and all 2s in last.
	 * 
	 * understood:yes
	 * input : int[]
	 * output : int[]
	 * 
	 * Pseudocode:
	 * 1)
	 */
	
	public int[] arraySort(int[] arr)
	{
		int n = arr.length;
		int[] sortedArr = new int[n];
		int count0=0, count1=0, count2=0;
		
		for (int i=0; i<n; i++)
		{
			if (arr[i]==0)
			{
				count0++;
			}
			else if (arr[i]==1)
			{
				count1++;
			}
			else if (arr[i]==2)
			{
				count2++;
			}
		}
		int index=0;
		for (int i=0; i<count0; i++)
		{
			sortedArr[index++]=0;
			
		}
		for (int i=0; i<count1; i++)
		{
			sortedArr[index++]=1;
			
		}
		
		for (int i=0; i<count2; i++)
		{
			sortedArr[index++]=2;
		}
		
		return sortedArr;
	}
	
	@Test
	public void test1()
	{
		int[] actual = arraySort(new int[] {2,2,2,0,0,0,1,1});
		int[] expected = {0,0,0,1,1,2,2,2};
		Assert.assertArrayEquals(expected ,actual);
	}
	
	
	@Test
	public void test2()
	{
		int[] actual = arraySort(new int[] {0,0,0,0,1,1,2,2});
		int[] expected = {0,0,0,0,1,1,2,2};
		Assert.assertArrayEquals(expected ,actual);
	}
	
	@Test
	public void test3()
	{
		int[] actual = arraySort(new int[] {0,1,2,2,1,0});
		int[] expected = {0,0,1,1,2,2};
		Assert.assertArrayEquals(expected ,actual);
	}
}
