package mandatoryHomeWork.morningSession;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class NinjaAndMatrix 
{
	/*
	 * https://www.codingninjas.com/studio/problems/ninja-and-matrix_4537652?leftPanelTab=0
	 * 
	 * understood : yes
	 * input : int[][]
	 * output : int []
	 * 
	 * 
	 */
	
	public int[] ninjaAndMatrix (int [][] matrix)
	{
		int n= matrix.length;
		int[] result = new int[n*n];
		int m=0;
		
		for (int i=0; i<n; i++)
		{
			if (i%2 == 0)
			{
				for (int j=0; j<n; j++)
				{
					result[m++]= matrix[i][j];
				}
			}
			else
			{
				for (int j=n-1; j>=0; j--)
				{
					result[m++]= matrix[i][j];
				}
			}
		}
		return result;
	}
	
	@Test
	public void test1() 
	{
		int[][] matrix = {{1,2},{3,4}};
		int[] result = {1,2,4,3};
		Assert.assertEquals(result, ninjaAndMatrix(matrix));
	}
	
	@Test
	public void test2() 
	{
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		int[] result = {1,2,3,6,5,4,7,8,9};
		Assert.assertEquals(result, ninjaAndMatrix(matrix));
	
}
}
