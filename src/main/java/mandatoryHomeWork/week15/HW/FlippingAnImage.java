package mandatoryHomeWork.week15.HW;

import org.junit.Assert;
import org.junit.Test;



public class FlippingAnImage 
{
	/*
	 * https://leetcode.com/problems/flipping-an-image/description/
	 * 
	 * understood : yes
	 * input : int[][]
	 * output : int[][]
	 * 
	 * Pseudocode:
	 * Logic : when start nd end are different --> increment start nd decrement end
	 * 				when same --> change 0 to 1 nd vice versa
	 * 
	 */

	public int[][] flipAndInvertImage(int[][] image) 
	{
		for(int i=0; i<image.length; i++)
		{
			int start=0; 
			int end = image[i].length-1;
			
			while(start<=end)
			{
				if(image[i][start]==image[i][end])
				{
					image[i][start] = 1-image[i][start];
					image[i][end] = image[i][start];
				}
				start++;
				end--;
			}
		}
		return image;
	}
	
	@Test
	public void test1()
	{
		int[][] actual = flipAndInvertImage(new int[][] {{1,1,0},{1,0,1},{0,0,0}});
		int[][] expected = {{1,0,0}, {0,1,0}, {1,1,1}};
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void test2()
	{
		int[][] actual = flipAndInvertImage(new int[][] {{1,1,0,0},{1,0,0,1},{0,1,1,1}, {1,0,1,0}});
		int[][] expected = {{1,1,0,0}, {0,1,1,0}, {0,0,0,1}, {1,0,1,0}};
		Assert.assertArrayEquals(expected, actual);
	}
}
