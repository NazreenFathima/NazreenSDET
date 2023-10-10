package mandatoryHomeWork.morningSession;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;
import org.testng.Assert;

public class Oct9_SortPeople_HashMap 
{
	public String[] sortPeople(String[] names, int[] heights) 
	{
		HashMap<Integer,String> ms = new HashMap<>();
		String [] ns = new String[names.length];
		int n=names.length;

		for(int i=0;i<n;i++)
		{
			ms.put(heights[i],names[i]);
		}
		int index=0;

		Arrays.sort(heights);
		for(int i=n-1;i>=0;i--)
		{
			ns[index]=ms.get(heights[i]);
			index++;
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
