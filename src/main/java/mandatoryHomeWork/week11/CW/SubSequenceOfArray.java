package mandatoryHomeWork.week11.CW;

import org.junit.Test;

import junit.framework.Assert;

public class SubSequenceOfArray 
{
	/*Given an array of positive integers, find the smallest subsequence array length whose sum of elements
	 * is greater than a given number k.
	 * 
	 *Input arr={1,2,3,4,5} k=10
	 *Output = 3
	 *
	 *
	 * understood : yes
	 * input : int[]
	 * output : int
	 * 
	 * Pseudocode:
	 * 
	 * 
	 */
	
	public int subSequenceOfArray(int[] input, int k)
	{	
		int left=0;
		int right=0;
		int minSubArrayLength = Integer.MAX_VALUE;
		int currentSum =0;
		
		while(right<input.length)
		{
			currentSum+= input[right];
			
			while(currentSum>k)
			{
				minSubArrayLength = Math.min(minSubArrayLength, right-left+1);
				currentSum-= input[left];
				left++;
			}
			right++;
		}
		return (minSubArrayLength == Integer.MAX_VALUE) ? -1 : minSubArrayLength;
		
	}
	
	@Test
	public void test2()
	{
		int actual = subSequenceOfArray (new int[]{1,2,3,4,5}, 10);
		Assert.assertEquals(3, actual);
	}
	
	@Test
	public void test1()
	{
		int actual = subSequenceOfArray (new int[]{1,2,4,4,1}, 7);
		Assert.assertEquals(2, actual);
	}
	
	@Test
	public void test3()
	{
		int actual = subSequenceOfArray (new int[]{1,2,3,4,5}, 22);
		Assert.assertEquals(-1, actual);
	}
	
	@Test
	public void test4()
	{
		int actual = subSequenceOfArray (new int[]{1,2,3,4,6}, 5);
		Assert.assertEquals(1, actual);
	}
	
}
