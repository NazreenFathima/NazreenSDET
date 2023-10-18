package mandatoryHomeWork.week14.HW;

import org.junit.Test;
import org.testng.Assert;

public class TimeNeededToBuyTicket 
{
	/*
	 * https://leetcode.com/problems/time-needed-to-buy-tickets/
	 * 
	 * understood : yes 
	 * input: int[], int
	 * output : int
	 * 
	 * 
	 */

	public int timeRequiredToBuy1(int[] tickets, int k) 
	{
		int time=0;
		while(tickets[k]!=0)
		{
			for(int i=0;i<tickets.length;i++)
			{
				tickets[i]--;
				if(tickets[k]==0)break;
				if(tickets[i]<0)continue;
				time++;
			}
		}
		return time+1;
	}

	@Test
	public void test1()
	{
		int actual = timeRequiredToBuy1(new int[] {2,3,2} , 2);
		Assert.assertEquals(6, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = timeRequiredToBuy1(new int[] {5,1,1,1} , 0);
		Assert.assertEquals(8, actual);
	}
}
