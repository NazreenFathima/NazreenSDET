package mandatoryHomeWork.morningSession;

import org.junit.Test;
import org.testng.Assert;

public class Sept14_SumOfSquaresOfSplElements 
{
	/*
	 * understood:
	 * input : int[]
	 * output :int
	 * 
	 * Pseudocode:
	 * 1)initialise sum=0;
	 * 2)iterate thorugh the for loop
	 * 3)if arrlength%element == 0 --> (element*element)+sum
	 * 4)return sum
	 * 5)
	 */
	
	public int sumOfSquaresOfSplElements(int[] arr)
	{
		int sum=0;
		int n=arr.length;
		for(int i=1; i<=arr.length; i++)
		{
			if (n%i==0)
			{
				sum = sum + (arr[i-1]*arr[i-1]);
			}
		}
		return sum;
	}
	
	@Test
	public void test1()
	{
	int actual =sumOfSquaresOfSplElements(new int[] {1,2,3,4});
	Assert.assertEquals(21, actual);
	}
	
	@Test
	public void test2()
	{
	int actual =sumOfSquaresOfSplElements(new int[] {2,7,1,19,18,3});
	Assert.assertEquals(63, actual);
	}
}
