package mandatoryHomeWork.morningSession;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;


public class Sept19_MultipleDuplicate_BruteForce 
{
	/*
	 * Given an array and a positive number k, check whether the array contains 
	 * any duplicate elements within the range k. 
	 * If k is more than the array’s size, the solution should check for duplicates in the complete array.
Example: 
Input:
 
nums[] = { 5, 6, 8, 2, 4, 6, 9 }
k = 4
 
Output: Duplicates found - return the duplicate element
 
(element 6 repeats at distance 4 which is <= k)
	 *
	 *understood : yes
	 *input : int [], int
	 *output : int []
	 *
	 *Peudocode: 
	 *Initialise an empty array of length nums and count=0
	 *1) if (k>=nums.length) 
	 *    Iterate through the for loop till the array length
	 *    In the nested for loop - iterate from 2nd elemtn till the array length
	 *    when match found - add the num in empty array
	 *2) if (k<nums.length)
	 *    Iterate through the for loop till the array length
	 *    In the nested for loop - iterate from 2nd elemtn till the kth+1 element
	 *    when match found - add the num in empty array
	 *
	 */
	
	public int [] duplicateElements(int[] nums, int k)
	{
		int [] dup=new int[nums.length];
		int count=0;
		if (k>=nums.length) 
		{
		  for (int i=0; i<nums.length; i++)
		  {
			  for (int j=i+1; j<nums.length;j++)
			  {
				  if (nums[i]==nums[j])
				  {
					  dup[count]=nums[i];
					  count++;
				  }
			  }
		  }
		}
		else if (k<nums.length)
		{
			for (int i=0; i<nums.length; i++)
			{
				for (int j=i+1; j<=k+1; j++)
				{
					if (nums[i]==nums[j])
					  {
						dup[count]=nums[i];
						count++;
					  }
				}
			}
		}
		return Arrays.copyOf(dup, count);
	}
	
	@Test
	public void test1()
	{
		int[] actual = duplicateElements(new int[] {5,6,8,2,4,6,9}, 4);
		int[] expected = {6};
		System.out.println(Arrays.toString(actual));
		Assert.assertArrayEquals(expected, actual);
		
	}
	
	@Test
	public void test2()
	{
		int[] actual = duplicateElements(new int[] {1,2,3,4,5,1,7}, 3);
		int[] expected = {0};
		System.out.println(Arrays.toString(actual));
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void test3()
	{
		int[] actual = duplicateElements(new int[] {1,2,3,4,4,5}, 7);
		int[] expected = {4};
		System.out.println(Arrays.toString(actual));
		Assert.assertArrayEquals(expected, actual);
		
	}
	
	@Test
	public void test4()
	{
		int[] actual = duplicateElements(new int[] {1,2,3,4,5,6,7}, 5);
		int[] expected = {0};
		System.out.println(Arrays.toString(actual));
		Assert.assertArrayEquals(expected, actual);
		
	}
	
	@Test
	public void test5()
	{
		int[] actual = duplicateElements(new int[] {1,1,2,2,3,3,6,7,8}, 5);
		int[] expected = {1,2,3};
		System.out.println(Arrays.toString(actual));
		Assert.assertArrayEquals(expected, actual);
		
	}

	
}
