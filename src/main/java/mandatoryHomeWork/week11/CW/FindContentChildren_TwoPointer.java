package mandatoryHomeWork.week11.CW;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class FindContentChildren_TwoPointer 
{
	/* https://leetcode.com/problems/assign-cookies/submissions/
	 * 
	 * understood : yes
	 * input : int[], int[]
	 * output : int
	 * 
	 * Pseudocode:
	 * 1) Sort both the arrays -g, s
	 * 2) intilise the pointers 1,j and max=0;
	 * 3) Iterate through the while loop (i<g.length && j<s.length)
	 * 4) if s[j]>=g[i] --> increment max and i
	 * 5) increment j outside if loop
	 * 6) return max
	 * 
	 */
	
	public int findContentChildren (int[] g, int[] s)
	{
		Arrays.sort(g);
		Arrays.sort(s);
		int max=0;
		int i=0;
		int j=0;
		
		while(i<g.length && j<s.length)
		{
			if (s[j]>=g[i])
			{
				max++;
			}
			i++;
			j++;
		}
		
		return max;
	}
	
	@Test
	public void test1()
	{
		int actual = findContentChildren(new int[] {1,2,3}, new int[] {1,1});
		Assert.assertEquals(1, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = findContentChildren(new int[] {1,2}, new int[] {1,2,3});
		Assert.assertEquals(2, actual);
	}
	
	@Test
	public void test3()
	{
		int actual = findContentChildren(new int[] {1,2,3,4}, new int[] {4,2,2,2});
		Assert.assertEquals(3, actual);
	}
}
