package week3.day1CW;

import org.junit.Test;

import junit.framework.Assert;

public class CountOfMatches 
{
	/*
	 * Do I know the problem - YES
	 * 
	 * Input : int
	 * Output : int
	 * 
	 * Constraints : No DataStructure 
	 * 
	 * Test Data Set:
	 * 
	 * Input: n = 7
	   Output: 6
	 * 
	 * Input: n = 14
       Output: 13
     *
     * Pseudocode : 
     * 1. match = 0
     *  while (team>1)
     *  if (team%2 ==0)
     *     match = match + team/2
     *     team = team - team/2
     *     count = 
     *  else
     *     match = match + (team-1)/2
     *     team = team - (team-1)/2
     * 
	 */
	
	public int numOfMatches (int teams )
	{
		int match = 0;
		while (teams>1)
		{
			if (teams%2 == 0)
			{
				match = match + teams/2;
				teams = teams - teams/2;
			}
			else
			{
				match = match + (teams-1)/2;
				teams = teams - (teams-1)/2;
			}
		}
		return match;
	}
	
	@Test
	public void test1 ()
	{
		int actual = numOfMatches(7);
		Assert.assertEquals(6, actual);
	}
	
	@Test
	public void test2 ()
	{
		int actual = numOfMatches(14);
		Assert.assertEquals(13, actual);
	}
}
