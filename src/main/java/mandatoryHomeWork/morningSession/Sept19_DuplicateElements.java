package mandatoryHomeWork.morningSession;

import org.junit.Test;
import org.testng.Assert;

public class Sept19_DuplicateElements 
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
	 *output : int 
	 *
	 *Peudocode: 
	 *1) if (k>=nums.length) 
	 *    Iterate through the for loop till the array length
	 *    In the nested for loop - iterate from 2nd elemtn till the array length
	 *    when match found - return the match
	 *2) if (k<nums.length)
	 *    Iterate through the for loop till the array length
	 *    In the nested for loop - iterate from 2nd elemtn till the kth+1 element
	 *    when match found - return the match
	 *
	 */
	
	public int duplicateElements(int[] nums, int k)
	{
		if (k>=nums.length) 
		{
		  for (int i=0; i<nums.length; i++)
		  {
			  for (int j=i+1; j<nums.length;j++)
			  {
				  if (nums[i]==nums[j])
				  {
					  return nums[i];
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
						  return nums[i];
					  }
				}
			}
		}
		return 0;
	}
	
	@Test
	public void test1()
	{
		int actual = duplicateElements(new int[] {5,6,8,2,4,6,9}, 4);
		System.out.println(actual);
		Assert.assertEquals(6, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = duplicateElements(new int[] {1,2,3,4,5,1,7}, 3);
		Assert.assertEquals(0, actual);
	}
	
	@Test
	public void test3()
	{
		int actual = duplicateElements(new int[] {1,2,3,4,4,5}, 7);
		Assert.assertEquals(4, actual);
	}
	
	@Test
	public void test4()
	{
		int actual = duplicateElements(new int[] {1,2,3,4,5,6,7}, 5);
		Assert.assertEquals(0, actual);
	}
	
	
	
	
}
