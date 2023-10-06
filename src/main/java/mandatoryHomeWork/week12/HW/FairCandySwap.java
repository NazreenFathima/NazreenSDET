package mandatoryHomeWork.week12.HW;

import org.junit.Test;
import org.testng.Assert;

public class FairCandySwap 
{
	/*
	 * understood : yes
	 * input : int[], int[]
	 * output : int[]
	 * 
	 * Pseudocode:
	 * 1) Iterate through the for each loop and add the sum of aliceSizes
	 * 2) Iterate through the for each loop and add the sum of bobSizes
	 * 3) Iterate thorugh the for loop till aliceSizes.length
	 * 		Iterate through another nested for loop till bobSizes.length
	 * 			aTotal = aSum - aliceSizes[i]+bobSizes[j];
	 * 			bTotal = bSum +aliceSizes[i]-bobSizes[j];
	 * 4) if both aTotal nd bTotal are same --> return the value 
	 */

	public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) 
	{
		int aSum =0;
		int bSum =0;
		int a=aliceSizes.length;
		int b=bobSizes.length;
		
		for (int x : aliceSizes) 
		{
			aSum+=x;
		}
		
		for (int x : bobSizes) 
		{
			bSum+=x;
		}
		
		for (int i=0; i<a; i++)
		{
			for (int j=0; j<b; j++)
			{
				int aTotal = aSum-aliceSizes[i]+bobSizes[j];
				int bTotal = bSum+aliceSizes[i]-bobSizes[j];
				if(aTotal==bTotal)
				{
					return new int[] {aliceSizes[i], bobSizes[j] };
				}
			}
		}
		return new int[] {0,0};
	}
	
	@Test
	public void test1() 
	{
		int[] actual = fairCandySwap(new int[] {1,1}, new int[] {2,2});
		int[] expected = {1,2};
		Assert.assertEquals(actual, expected);
		
	}
	@Test
	public void test2() 
	{
		int[] actual = fairCandySwap(new int[] {1,2}, new int[] {2,3});
		int[] expected = {1,2};
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void test3() 
	{
		int[] actual = fairCandySwap(new int[] {2}, new int[] {1,3});
		int[] expected = {2,3};
		Assert.assertEquals(actual, expected);
	}

}
