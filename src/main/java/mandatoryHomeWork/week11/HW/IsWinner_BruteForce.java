package mandatoryHomeWork.week11.HW;

import org.junit.Test;
import org.testng.Assert;

public class IsWinner_BruteForce 
{
	/*
	 * understood : yes
	 * input : int[], int[]
	 * output : int
	 * 
	 *  Pseudocode: 
	 *  1) Initialise sum1=0
	 *  2) Iterate through the for loop(till array length) -- Adds all the elemnts in the array
	 *  3) Iterate through another for loop (till array length)
	 *  	if elements equals 10 && length-2 --> sum+add next two elements
	 *  		else if element equals 10 && length-1 --> sum +add next element  
	 *  4) same for player2
	 *  5) if sum1>sum2 --1
	 *  		sum2>sum1 --2
	 *  			else --0
	 */

	public int isWinner(int[] player1, int[] player2) {
		int sum1=0;
		for (int i=0; i<player1.length; i++)
		{
			sum1+= player1[i];
		}
		for (int i=0; i<player1.length; i++)
		{
			if (player1[i]==10 && i<player1.length-2)
			{
				sum1+=player1[i+1]+player1[i+2];
			}
			else if (player1[i]==10 && i<player1.length-1)
			{
				sum1+=player1[i+1];
			}
			else
			{
				continue;
			}

		}

		int sum2=0;
		for (int i=0; i<player2.length; i++)
		{
			sum2+= player2[i];
		}
		for (int i=0; i<player2.length; i++)
		{
			if (player2[i]==10 && i<player2.length-2)
			{
				sum2+=player2[i+1]+player2[i+2];
			}
			else if (player2[i]==10 && i<player2.length-1)
			{
				sum2+=player2[i+1];
			}
			else
			{
				continue;
			}
		}

		if (sum1>sum2)
		{
			return 1;
		}
		else if (sum2>sum1)
		{
			return 2;
		}
		else return 0;
	}
	
	@Test
	public void test1()
	{
		int actual = isWinner(new int[] {4,10,7,9}, new int[] {6,5,2,3});
		Assert.assertEquals(1, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = isWinner(new int[] {3,5,7,6}, new int[] {8,10,10,2});
		Assert.assertEquals(2, actual);
	}
	
	@Test
	public void test3()
	{
		int actual = isWinner(new int[] {2,3}, new int[] {4,1});
		Assert.assertEquals(0, actual);
	}
	
	@Test
	public void test4()
	{
		int actual = isWinner(new int[] {5,6,1,10}, new int[] {5,1,10,5});
		Assert.assertEquals(2, actual);
	}

}
