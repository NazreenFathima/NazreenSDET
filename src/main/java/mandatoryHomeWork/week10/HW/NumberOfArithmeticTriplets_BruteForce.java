package mandatoryHomeWork.week10.HW;

import org.junit.Test;
import org.testng.Assert;

public class NumberOfArithmeticTriplets_BruteForce 
{
	/*
	 * understood : yes
	 * input : int[], int
	 * output : int
	 * 
	 * Pseudocode:
	 * 1) Initialise count=0
	 * 2) Iterate through nest for loops
	 * 		i=0; i<nums.length-2: i++
	 *       j=i+1; j<nums.length-1; j++ --> if nums[j]-nums[k]=diff
	 *         k=j+1; k<nums.length; k++ --> if nums[k]-nums[j]=diff
	 * 				count++
	 * 3) Return count	
	 */
	
	public int numberOfArithmeticTriplets(int[] nums, int diff)
	{
		int count=0;
		for (int i=0; i<nums.length-2; i++)
		{
			for (int j=i+1; j<nums.length-1; j++)
			{
				if (nums[j]-nums[i]==diff)
				{
					for (int k=j+1; k<nums.length; k++)
					{
						if(nums[k]-nums[j]==diff)
						{
							count++;
						}
					}
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

