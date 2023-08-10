package week1.day1HW;

import org.junit.Assert;
import org.junit.Test;

public class BuyAndSellStock 
{
	/*
	 * Input : int[]
	 * Output : int
	 * 
	 * Data Set:
	 * Input: prices = [7,1,5,3,6,4]
		Output: 5
		Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
		Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
		
	 * Input: prices = [7,6,4,3,1]
		Output: 0
		Explanation: In this case, no transactions are done and the max profit = 0.
		
	 * Pseudocode:
	 * 1) Initialize a var MaxProfit as 0 CurrentProfit as 0 .
	 * 2) Initialize a buy variable with Max int value.
	 * 3) Iterate through the prices array.
	 * 4) If the current stock price is less than buy value 
	 * 			assign it to buy
	 * 5) Substract the buy price from the current stock price to get the current profit
	 * 6) Compare max profit and current profit,
	 * 		if max profit is less than current profit,
	 * 			assign current to max profit
	 * 7) Return Max profit.
	 */
	
	public int maxProfit (int[] prices)
	{
		int maxProfit = 0;
		int currentProfit = 0;
		int buyPrice = Integer.MAX_VALUE;
		for (int i=0 ; i<prices.length; i++)
		{
			if (prices[i]<buyPrice)
			{
				buyPrice = prices[i];
			}
			currentProfit = prices[i] - buyPrice;
			if (maxProfit < currentProfit)
			{
				maxProfit = currentProfit;
			}
		}
		return maxProfit;
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
