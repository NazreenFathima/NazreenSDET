package mandatoryHomeWork.week9;

import org.junit.Test;
import org.testng.Assert;

public class FindMaximumNumberOfStringPairs 
{
	/*
	 * understood :yes
	 * input : String[]
	 * output : int
	 * 
	 * Pseudocode:
	 * 1)Initialise count=0
	 * 2)Iterate through the neted for loop
	 * 3)if if(words[i].charAt(0) == words[j].charAt(1) && words[i].charAt(1) == words[j].charAt(0))--> count++
	 * 4)Return count;
	 * 
	 */
	
	public int findMaximumNumberOfStringPairs(String [] words)
	{
		int count=0;
		for (int i=0; i<words.length; i++)
		{
			for (int j=i+1; j<words.length; j++)
			{
				 if(words[i].charAt(0) == words[j].charAt(1) && words[i].charAt(1) == words[j].charAt(0))
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
		int actual = findMaximumNumberOfStringPairs(new String [] {"cd","ac","dc","ca","zz"});
		Assert.assertEquals(2, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = findMaximumNumberOfStringPairs(new String [] {"ab","ba","cc"});
		Assert.assertEquals(1, actual);
	}
	
	@Test
	public void test3()
	{
		int actual = findMaximumNumberOfStringPairs(new String [] {"ab","ba","cc"});
		Assert.assertEquals(1, actual);
	}
	
}
