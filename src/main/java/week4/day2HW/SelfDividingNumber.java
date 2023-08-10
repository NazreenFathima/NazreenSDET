package week4.day2HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SelfDividingNumber 
{
	/*
	 * Understood the program : YES
	 * 
	 * Input : int
	 * Output : List<Integer>
	 * 
	 * DataSet:
	 * 
	 * Pseudocode:
	 * 1) Create ArrayList<Integer>
	 * 2) in the for loop check for the numbers
	 * 3) consider a while loop greater than 0
	 * 4) find each digit by modulo operation
	 * 4) when digit is equal to 0 reminder of value by digit is not equal to 0, then break
	 * 5) then find the other digits of the number by division operations...continue till the quotient becomes zero
	 * 6) when the value becomes 0 ..add to the list.
	 * 
	 * 
	 */
	
	public List<Integer> selfDividingNumbers (int left, int right)
	{	
		List<Integer> results = new ArrayList<Integer>();
		for (int i=left; i<=right; i++)
		{
			int val = i;
			while (val>0)
			{
				int digit = val%10;
				if (digit ==0 || i%digit!=0)
				{
					break;
				}
				val = val/10;
				
				if (val==0)
				{
					results.add(i);
				}
			}
		}
		
		return results;	
	}
	
	@Test
	public void test1()
	{
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(48,55,66,77));
        Assert.assertEquals(expected, selfDividingNumbers(47,85));
				
	}
	
}
