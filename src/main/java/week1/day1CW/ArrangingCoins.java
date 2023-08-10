package week1.day1CW;

import org.junit.Assert;
import org.junit.Test;

public class ArrangingCoins 
{
	/*
	 * You have n coins and you want to build a staircase with these coins. 
	 * The staircase consists of k rows where the ith row has exactly i coins. 
	 * The last row of the staircase may be incomplete.Given the integer n, 
	 * return the number of complete rows of the staircase you will build.
	 * 
	 * Input : int
	 * Output : int
	 * Constraints : no
	 * 
	 *  Data Set : 
	 *  Positive : i/p=10 ; o/p=4
	 *  Negative
	 *  Edge 
	 *  
	 *  Pseudocode:
	 *  
	 *  
	 *
	 * 
	 */
	
	public int ArrangeCoins (int coins)
	{
		int steps = 0;
		for (int i=1; i<=coins; i++)
		{
			steps++;
			coins = coins-steps;
			
		}
		
		return steps;
		
	}
	
	@Test
	public void test1()
	{
		int actual = ArrangeCoins(10);
		Assert.assertEquals(4, actual);
	}
	

}
