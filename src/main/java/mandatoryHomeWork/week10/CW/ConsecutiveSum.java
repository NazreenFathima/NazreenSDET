package mandatoryHomeWork.week10.CW;

import org.junit.Assert;
import org.junit.Test;

public class ConsecutiveSum 
{
	/*
	 * understood : yes
	 * input : int[], int target
	 * output : int
	 * 
	 * Pseudocode: 
	 * 1) Initialise the max= INTEGER.MIN
	 * 2) Iterate through the for loop (i=0; i<=arr.length-target; i++)
	 * 3) Iterate through the inner for loop (j=i; j<i+target; j++)
	 * 4) sum=sum+int[j]
	 * 5) if sum>max -->max=sum;
	 * 6) return max;
	 */
	
	public int consecutiveSum(int[] arr, int target)
	{
		//int sum = 0;
		int max=Integer.MIN_VALUE;
		for (int i=0; i<=arr.length-target; i++)
		{
			int sum=0;
			for (int j=i; j<i+target;j++)
			{
				sum=sum+arr[j];
			}
			if (sum>max)
			{
				max=sum;
			}
		}
		return max;
	}
	
	@Test
	public void test()
	{
		int actual=consecutiveSum(new int[]{-1,-5,-7},3);
		Assert.assertEquals(actual, -13);
		System.out.println(actual);
	}
	
	@Test
	public void test1()
	{
		int actual=consecutiveSum(new int[]{1,5,2,3,7,1},3);
		Assert.assertEquals(actual, 12);
		System.out.println(actual);
	}
	
	
}

