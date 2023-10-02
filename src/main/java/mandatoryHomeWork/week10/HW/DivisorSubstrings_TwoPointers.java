package mandatoryHomeWork.week10.HW;

import org.junit.Assert;
import org.junit.Test;

public class DivisorSubstrings_TwoPointers 
{
	/*
	 * understood : yes
	 * Input : int, int
	 * output : int
	 * 
	 * Pseudocode: 
	 * 1)Convert int to string
	 * 2) Initialise two pinters i=0 nd j=k, count=0
	 * 3) Iterate through the while loop - length -k
	 * 4) get the substring
	 * 5) Convert to number
	 * 6) If num not equal to 0 nd mod=0 --> count++
	 * 7) Increment i nd j
	 * 8) return count;
	 */

	public int divisorSubstrings(int num, int k) 
	{
		String str = String.valueOf(num);
        int i=0;
        int j=k;
        int count=0;
        while(i<=str.length()-k)
        {
            String s=str.substring(i,j);
            int n=Integer.parseInt(s);
            if(n!=0 && num%n==0)
            {
            	count++;
            }
            i++;
            j++;
        }
        return count;
	}
	
	@Test
	public void test1() 
	{
		int actual=divisorSubstrings (240,2);
		Assert.assertEquals(2, actual);
	}
	
	@Test
	public void test2() 
	{
		int actual=divisorSubstrings (430043,2);
		Assert.assertEquals(2, actual);
	}
}
