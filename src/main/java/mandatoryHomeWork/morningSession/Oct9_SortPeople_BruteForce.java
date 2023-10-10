package mandatoryHomeWork.morningSession;

import org.junit.Test;
import org.testng.Assert;

public class Oct9_SortPeople_BruteForce 
{
	/*
	 * https://leetcode.com/problems/sort-the-people/description/
	 * 
	 * understand : yes
	 * input : String[], int[]
	 * output : String[]
	 * 
	 * Pseudocode: Brute force:
	 * 1) Iterate through nested for loops 
	 * 2) one with length-1 and another with length-i-1
	 * 3) if (heights[j] < heights[j + 1]) -> swap both heights nad names
	 * 4) return names 
	 */


	public String[] sortPeople(String[] names, int[] heights) 
	{
		for (int i=0; i<heights.length-1; i++)
		{
			for (int j=0; j<heights.length-i-1; j++)
			{

				if (heights[j] < heights[j + 1]) 
				{
					int temp = heights[j];
					heights[j] = heights[j + 1];
					heights[j + 1] = temp;

					String temp1 = names[j];
					names[j] = names[j + 1];
					names[j + 1] = temp1;
				}
			}
		}
		return names;
	}


	@Test
	public void test1()
	{
		String[] actual = sortPeople(new String[] {"Mary","John","Emma"}, new int[] {180,165,170});
		String[] expected = {"Mary","Emma","John"};
		Assert.assertEquals(actual , expected);

	}
	
	@Test
	public void test2()
	{
		String[] actual = sortPeople(new String[] {"Alice","Bob","Bob"}, new int[] {155,185,150});
		String[] expected = {"Bob","Alice","Bob"};
		Assert.assertEquals(actual , expected);

	}
}
