package mandatoryHomeWork.week9;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class HeightChecker 
{
	/*
	 * understood : yes
	 * input : int[]
	 * output : int
	 * 
	 * Pseudocode
	 * 1) Initialise the count=0;
	 * 2) create a empty array for placing the sorted array.
	 * 3) add the original array in sort array
	 * 4) Sort the array
	 * 5) compare both the array elements - when not equal -> count++
	 * 6) return count
	 */
	public int heightChecker (int[] original)
	{
		int count=0;
		int[] sort = new int[original.length];
		for (int i=0; i<original.length; i++)
		{
			sort[i]=original[i];
		}
		
		Arrays.sort(sort);
		
		for (int i=0; i<original.length; i++)
		{
			if (sort[i]!=original[i])
			{
				count++;
			}
		}
		return count;
	}
	
	@Test
	public void test1()
	{
		int actual = heightChecker(new int[] {1,1,4,2,1,3});
		Assert.assertEquals(3, actual);
	}
	
	public void test2()
	{
		int actual = heightChecker(new int[] {5,1,2,3,4});
		Assert.assertEquals(5, actual);
	}
	
	public void test3()
	{
		int actual = heightChecker(new int[] {1,2,3,4,5});
		Assert.assertEquals(0, actual);
	}
}
