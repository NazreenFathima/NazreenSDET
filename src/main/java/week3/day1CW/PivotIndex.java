package week3.day1CW;

import org.junit.Test;

import junit.framework.Assert;

public class PivotIndex 
{
	/*
	 * Understood the prob - YES
	 * 
	 * Input : int[]
	 * Output : int
	 * 
	 * Constraints : No DSA
	 * 
	 * Data Set : 
	 * Input: nums = [1,7,3,6,5,6]
	   Output: 3
	   Input: nums = [1,2,3]
       Output: -1
       Input: nums = [2,1,-1]
       Output: 0
     *
     *Pseudocode :
     *1) Create a outter for loop for pivot elemnt 
     *2) Initialise sumLeft, sumRight = 0
     *3) Create another inner for loop for iterating the sum (left and right)
     *4) if(j<i) - sumLeft
     *   else if (j>i) - sumRight
     *   
     *   finally if sumLeft == sumRight --> return i
     *  
     *
	 */
	
	public int findPivotIndex (int[] nums)
	{  	
		for (int i=0; i<nums.length; i++)
		{
			int sumLeft = 0;
			int sumRight = 0;
			
			for (int j=0; j<nums.length; j++)
			{
				if(j<i)
				{
					sumLeft = nums[j] + sumLeft;
				}
				else if (j>i)
				{
					sumRight = nums[j] + sumRight;
				}
			}
			if (sumRight == sumLeft)
			{
				return i;
			}
		}
		return -1;
	}
	
	@Test
	public void test1()
	{
		int actual = findPivotIndex ( new int[] {1,2,3});
		Assert.assertEquals(-1, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = findPivotIndex ( new int[] {1,7,3,6,5,6});
		Assert.assertEquals(3, actual);
	}
	
	@Test
	public void test3()
	{
		int actual = findPivotIndex ( new int[] {2,1,-1});
		Assert.assertEquals(0, actual);
	}
}
