package mandatoryHomeWork.week17.HW;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBuyAndSell 
{
	/*
	 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
	 * 
	 * understood: yes
	 * input :int[]
	 * output: int
	 * 
	 * Pseudocode:
	 * 1) Initialise the buyPricce as the first value in array
	 * 2) initialise profit =0;
	 * 3) Iterate through the for loop til end of the array
	 * 4) if current price<buyPrice --> update buyPrice as current price
	 *     else initialise currentPRofit equals currentPrice-buyPrice
	 *     update profit using math.max
	 * 5) return profit
	 */

	public int maxProfit(int[] prices) 
	{
		int buyPrice = prices[0];
		int profit = 0;
		
		for(int i=1; i<prices.length; i++)
		{
			if(prices[i]<buyPrice)
			{
				buyPrice = prices[i];
			}
			else
			{
				int currentProfit = prices[i]-buyPrice;
				profit = Math.max(currentProfit, profit);
			}
		}
		return profit;
	}
	
	@Test
	public void test1()
	{
		int actual = maxProfit(new int[] {7,1,5,3,6,4} );
		Assert.assertEquals(5, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = maxProfit(new int[] {7,6,4,3,1} );
		Assert.assertEquals(0, actual);
	}
}
