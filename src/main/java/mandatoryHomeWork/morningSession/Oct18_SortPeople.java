package mandatoryHomeWork.morningSession;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;
import org.testng.Assert;

public class Oct18_SortPeople 
{
	/*
	 * https://leetcode.com/problems/sort-the-people/description/
	 * 
	 * understood : yes
	 * input : STring[], Strnig[]
	 * output : String []
	 * 
	 * Pseudocode: 
	 * 
	 */

	public String[] sortPeople(String[] names, int[] heights) 
	{
		HashMap<Integer,String> ms = new HashMap<>();
		String [] ns = new String[names.length];
		int n=names.length;

		for(int i=0;i<n;i++)
		{
			ms.put(heights[i],names[i]);
		}
		int k=0;

		Arrays.sort(heights);
		for(int i=n-1;i>=0;i--)
		{
			ns[k++]=ms.get(heights[i]);
		}
		return ns;
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
