package mandatoryHomeWork.week9;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DieterCalories 
{
	/*
	 * understood the prob : Yes
	 * input : int[], int, int, int
	 * output : int
	 * 
	 * Pseuodocode: 
	 * 1) Initialise output = 0
	 * 2) iterate through the for loop
	 * 		iterate through the inner for loop (Calculate the sum of calories for the current window of k days)
	 * 			sum=sum+calories
	 * 			if(sum>upper) --> output+1
	 * 			else if( sum<lower) --> output-1
	 * 3) return output
	 * 
	 */
	
	public int dieterCalories(int[] calories, int k, int lower, int upper)
	{
		int output=0;
		for (int i=0; i<=calories.length-k; i++)
		{
			int sum=0;
			for(int j=i; j<i+k; j++)
			{
				sum = sum+calories[j];
			}
			if (sum>upper)
			{
				output = output+1;
			}
			else if(sum<lower)
			{
				output = output-1;
			}
		}
		return output;
	}
	
	@Test
	public void test()
	{
		int actual = dieterCalories(new int[] {1,2,3,4,5}, 1, 3, 3 );
		Assert.assertEquals(0, actual);
	}
	
	@Test
	public void test1()
	{
		int actual = dieterCalories(new int[] {3,2}, 2, 0, 1 );
		Assert.assertEquals(1, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = dieterCalories(new int[] {6,5,0,0}, 2, 1, 5 );
		Assert.assertEquals(0, actual);
	}
	
	@Test
	public void test3()
	{
		int actual = dieterCalories(new int[] {1,2,3,4,5,6}, 4, 15, 23 );
		Assert.assertEquals(-1, actual);
	}
}
