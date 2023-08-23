package mandatoryHomeWork.morningSession;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Handshake 
{
	/*

	 * Understood the prob : YES
	 * 
	 * input : int
	 * output : int
	 * 
	 * Pseudocode:
	 * 1) Iterate through the nested for loop (first element accessing the rest of elments, second elments accessing the
	 *    rest of elements except first nd so on...
	 * 2) increment the counter
	 * 3) return count
	 */

	public int handshakes (int n)
	{	
		int count=0;
		for (int i=0; i<n; i++)
		{
			for (int j=i+1; j<n; j++)
			{
				count++;
			}
		}
		return count;
	}
	
	@Test
	public void test1()
	{
		int actual = handshakes (3);
		Assert.assertEquals(3, actual);
	}

	@Test
	public void test2()
	{
		int actual = handshakes (4);
		Assert.assertEquals(6, actual);
	}


	@Test
	public void test3()
	{
		int actual = handshakes (1);
		Assert.assertEquals(0, actual);
	}

	
}
