package mandatoryHomeWork.week10.HW;

import org.junit.Test;
import org.testng.Assert;

public class NumberOfArithmeticTriplets_TwoPointer 
{
	/*
	 * understood : yes
	 * input : int[], int
	 * output : int
	 * 
	 * Pseudocode:
	 * 1) Initialise count=0;
	 * 2) Iterate through the for loop till length-2
	 * 3) initialise j nd k
	 * 4) while(k<n)
	 * 		 diff1 = nums[j] - nums[i];
			 diff2 = nums[k] - nums[j];
			 if (diff1 == diff && diff2 == diff) --> count++, j++, k++
			 else if (diff1 < diff2)  --> j++
			 else k++
	 * 5) Return count	
	 */

	public int numberOfArithmeticTriplets(int[] nums, int diff)
	{
		int n=nums.length;
		int count=0;
		for (int i=0; i<n-2; i++)
		{
			int j=i+1;
			int k=j+1;

			while(k<n)
			{
				int diff1 = nums[j] - nums[i];
				int diff2 = nums[k] - nums[j];

				if (diff1 == diff && diff2 == diff) 
				{
					count++;
					j++; 
					k++; 
				} 
				else if (diff1 < diff2) 
				{
					j++; 
				} 
				else 
				{
					k++;
				}
			}
		}

		return count;
	}

	@Test
	public void test1()
	{
		int actual = numberOfArithmeticTriplets(new int[] {0,1,4,6,7,10}, 3);
		System.out.println(actual);
		Assert.assertEquals(2, actual);
	}

	@Test
	public void test2()
	{
		int actual = numberOfArithmeticTriplets(new int[] {4,5,6,7,8,9}, 2);
		System.out.println(actual);
		Assert.assertEquals(2, actual);
	}

}
