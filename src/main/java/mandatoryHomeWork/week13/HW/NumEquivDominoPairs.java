package mandatoryHomeWork.week13.HW;

import org.junit.Test;
import org.testng.Assert;

public class NumEquivDominoPairs 
{
	/*
	 * https://leetcode.com/problems/number-of-equivalent-domino-pairs/
	 * 
	 * understood : yes
	 * input : int[][]
	 * output : int
	 * 
	 * Pseudocode: 
	 * 1) Initialise count=0;
	 * 2) Iterate through nested for loop till the dominos length
	 * 3) if same ->count++
	 * 4) return count
	 */

	public int numEquivDominoPairs(int[][] dominoes) 
	{
		int count =0;
        for(int i=0;i<dominoes.length;i++)
        {
            int domino1 = dominoes[i][0];
            int domino2 = dominoes[i][1];
            for(int j=i+1;j<dominoes.length;j++)
            {
                int domino11=dominoes[j][0];
                int domino22=dominoes[j][1];
                if(domino1==domino11 && domino2==domino22 || domino1==domino22 && domino2==domino11 )
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
		Assert.assertEquals(1, numEquivDominoPairs(new int[][] {{1,2},{2,2},{2,1},{3,2}}));
	}
	@Test
	public void test2() 
	{
		Assert.assertEquals(0, numEquivDominoPairs(new int[][] {{2,2},{2,1},{3,2}}));
	}

	@Test
	public void test3() 
	{
		Assert.assertEquals(6, numEquivDominoPairs(new int[][] {{1,2},{1,2},{2,1},{2,1}}));
	}
}
