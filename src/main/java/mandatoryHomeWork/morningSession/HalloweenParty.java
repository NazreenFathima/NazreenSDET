package mandatoryHomeWork.morningSession;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HalloweenParty 
{
	/*

	 * Understood : YES
	 * Input : int
	 * Output : int
	 * 
	 * Pesudocode : 
	 * 
	 * 1)If even (n%2)--> m*m
	 * odd --> m*(m-1)
	 * 
	 * 4->4
	 * 5->6
	 * 6->9
	 * 7->12
	 * 8->16
	 * 9->20
	 * 10->25
	 * 11->30
	 */

	

	public int halloweenPartyChochy (int chocky)

	{
		int m=chocky/2;
		int output=0;
		if (chocky%2==0)
		{
			output = m*m;
		}
		else
		{
			output = m*(m+1);
		}
		return output;
	}

	

	@Test
	public void test1()
	{
		int actual = halloweenPartyChochy(7);
		Assert.assertEquals(12, actual);
	}

	
	@Test
	public void test2()
	{
		int actual = halloweenPartyChochy(8);
		Assert.assertEquals(16, actual);
	}

	
	@Test
	public void test3()
	{
		int actual = halloweenPartyChochy(11);
		Assert.assertEquals(30, actual);
	}
}
