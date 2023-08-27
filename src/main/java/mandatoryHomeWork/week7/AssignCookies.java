package mandatoryHomeWork.week7;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssignCookies 
{
	/*
	 * Understood the prob : YES
	 * Input : int[]
	 * Output :int
	 * 
	 * Pseudocode
	 * 1)Initialize var to store satisfied children, index for greedy int[]
	 * 2)In a for loop, run the loop till the length of both the arrays 
	 * 3)check if the available cookie size is grater than or equal to greed of the child in place
	 * 4)if yes, increment the satisfied child and increment the greed counter by 1
	 * 5)return satsified child
	 * 
	 */
	
	public int assignCookies(int[] g,int[] s) 
	{
		Arrays.sort(g); 
		Arrays.sort(s); 

		int satisfied = 0;
		int i=0;

		for (int j = 0; i < g.length&& j < s.length; j++) 
		{
			if(s[j]>=g[i]) 
			{
				satisfied++;
				i++;
			}
		}
		return satisfied;
	}
	
	@Test
	public void test1() {
		Assert.assertEquals(1, assignCookies(new int[] {1,2,3},new int[] {1,1}));
	}

	@Test
	public void test2() {
		Assert.assertEquals(2, assignCookies(new int[] {1,2},new int[] {1,2,3}));
	}


}
