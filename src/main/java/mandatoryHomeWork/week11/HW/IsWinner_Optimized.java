package mandatoryHomeWork.week11.HW;

import org.junit.Test;
import org.testng.Assert;

public class IsWinner_Optimized 
{	
	/*
	 * https://leetcode.com/problems/determine-the-winner-of-a-bowling-game/description/
	 * 
	 * understood : yes
	 * input : int[], int[]
	 * output : int
	 * 
	 * Pseudocode:
	 * 1) Initialise sum1 nd sum2=0
	 * 2) Iterate through the for loop(till the array length)
	 * 3) if (i==1 && (player1[i-1]==10) || (i>1 && ((player1[i-1]==10) || (player1[i-2]==10)))) --sum1+=2*(player1[i]);
	 * 		else sum1+= player1[i];
	 * 4) same for player2
	 * 5) if sum1>sum2 -- 1
	 * 		else sum2>sum1 -- 2
	 * 			else 0
	 */
	
	
	public int isWinner(int[] player1, int[] player2)
	{
		int sum1=0;
		int sum2=0;
		for (int i=0; i<player1.length; i++)
		{
			if (i==1 && (player1[i-1]==10) || (i>1 && ((player1[i-1]==10) || (player1[i-2]==10)))) 
			{
				sum1+=2*(player1[i]);
				
			}
			else
			{
				sum1+= player1[i];
			}
			
			if (i==1 && (player2[i-1]==10) || (i>1 && ((player2[i-1]==10) || (player2[i-2]==10))))
			{
				sum2+=2*(player2[i]);
				
			}
			else
			{
				sum2+= player2[i];
			}
		}
		
		return sum1>sum2 ? 1 : sum2>sum1 ? 2 : 0;
			
		
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
