package mandatoryHomeWork.week7;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayPartition 
{
	/*

	 * Understood the prob : YES
	 * 
	 * input : int[]
	 * output : int
	 * 
	 * Pseudocode : 
	 * 1) Sort the array
	 * 2) Initialise the sum=0
	 * 3) Add the numbers in the even indexes using for loop
	 * 4) return the sum
	 */


	public int partitionArray (int [] nums)

	{	
		int sum = 0;
		Arrays.sort(nums);
		for (int i=0; i<nums.length; i=i+2)
		{
			sum = sum + nums[i];
		}
		return sum;
	}

	

	@Test
	public void test1()
	{
		int actual = partitionArray (new int[] {1,4,3,2});
		Assert.assertEquals(4, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = partitionArray (new int[] {6,2,6,5,1,2});
		Assert.assertEquals(9, actual);
	}
	
	@Test
	public void test3()
	{
		int actual = partitionArray (new int[] {5,7,8,1,4,90,2,6}); //1,2,4,5,6,7,8,90
		Assert.assertEquals(19, actual);
	}
}
