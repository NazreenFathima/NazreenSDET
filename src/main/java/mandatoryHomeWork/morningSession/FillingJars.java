package mandatoryHomeWork.morningSession;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FillingJars 
{
	/*

	 * Understood : yes
	 * Input : int n, int m, int[] nums {a,b,k}
	 * Output : int output
	 * 
	 * Pseudocode:
	 * 1) emptyJars ->n
	 * m -> noOfOperation
	 * a, b -> indices
	 * k -> numberOfCandy
	 * 2) Iterate the loop from 0 to m(no of operations)
	 *    then in the inner loop iterate from a to b
	 *    totalCandies = totalCandies +k;
	 * 
	 * totalCandies = total/n
	 * 
	 * 
	 */

	
	public int fillingJar (int n, int m, int[][] nums)
	{
		long totalCandies=0;
		for(int i=0; i<m; i++)
		{
			int a = nums[i][0];
	        int b = nums[i][1];
	        int k = nums[i][2];
	        totalCandies =(long) totalCandies+(b-a+1)*k;
		}
		return (int)(totalCandies/n);
	}

	

	@Test
	public void test1()
	{
		int actual = fillingJar(5,3, new int[][] {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}});
		Assert.assertEquals(160, actual);
	}

	

	@Test
	public void test2()
	{
		int actual = fillingJar(5, 2, new int[][]{{1, 2, 10}, {3, 5, 10}});
		Assert.assertEquals(10, actual);
	}
}
