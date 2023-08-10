package mandatoryHomeWork.week4;

import org.junit.Assert;
import org.junit.Test;

public class CalculateMoney 
{
	/*
	 * Undertood the prob : YES
	 * 
	 * Input : int
	 * Output : int
	 * 
	 * DataSet :
	 * 
	 * Input: n = 4
Output: 10
Explanation: After the 4th day, the total is 1 + 2 + 3 + 4 = 10.

Input: n = 10
Output: 37
Explanation: After the 10th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37. 
Notice that on the 2nd Monday, Hercy only puts in $2

Input: n = 20
Output: 96
Explanation: After the 20th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4 + 5 + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96.

	 *
	 *Pseudocode:
	 *1) Initialize sum as 0
	 *2) Iterate through the for loop
	 *3) value = i/7 and rem = i%7 
	 *4) sum = sum + rem+value+1
	 *
	 */
			
	public int totalMoney(int n) 
	{
		int sum=0;
        for(int i=0;i<n;i++)
        {
            int value=i/7;
            int rem=i%7;
            sum = sum+rem+value+1;
        }
        return sum;
        
	 }
	
	
	@Test
	public void test1()
	{
		int actual = totalMoney (10);
		Assert.assertEquals(37, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = totalMoney (4);
		Assert.assertEquals(10, actual);
	}
	
	@Test
	public void test3()
	{
		int actual = totalMoney (20);
		Assert.assertEquals(96, actual);
	}
	
}
