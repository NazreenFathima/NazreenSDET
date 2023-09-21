package mandatoryHomeWork.week10.HW;

import org.junit.Test;
import org.testng.Assert;

public class NumberOfSubstrings_BruteForce 
{
	/*
	 * understood : yes
	 * input : String
	 * output : int
	 * 
	 * Pseudocode: 
	 * 1) Initialise count=0
	 * 2) Iterate through two for loops
	 * 3) get the substring of i,j
	 * 4) if .contains a && b && c --> count ++
	 * 5) return count
	 */
	
	public int numberOfSubstrings(String str)
	{	
		int n = str.length();
	    int count = 0;

	    for (int i = 0; i < n; i++) 
	    {
	        for (int j = i + 1; j <= n; j++) 
	        {
	            String substring = str.substring(i, j);
	            if (substring.contains("a") && substring.contains("b") && substring.contains("c")) 
	            {
	                count++;
	            }
	        }
	    }
	    return count;
	}
	
	@Test
	public void test1()
	{
		int actual = numberOfSubstrings("abcabc");
		Assert.assertEquals(10, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = numberOfSubstrings("aaacb");
		Assert.assertEquals(3, actual);
	}
	
	@Test
	public void test3()
	{
		int actual = numberOfSubstrings("abc");
		Assert.assertEquals(1, actual);
	}
}
