package mandatoryHomeWork.morningSession;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SelfDividingNumber 
{
	/*
	 * A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
A self-dividing number is not allowed to contain the digit zero.

Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].

 

Example 1:

Input: left = 1, right = 22
Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]
Example 2:

Input: left = 47, right = 85
Output: [48,55,66,77]

	 * Understood the prob : YES
	 * 
	 * Input : int
	 * Output : int[]
	 * 
	 * Constraints : No
	 * 
	 * Pseudocode :
	 * 1) Create an ArrayList
	 * 2) initialise i as left and i<= as right
	 * 3) create a function - ifSelfDividing - true - add to list else ignore
	 * 4) Function : 
	 * 5) Initialise rem, num
	 * 6)  get the remainder by modulo operation
	 * 7) if rem==0 or num%rem!=0 then we hav to return false
	 * 8) n=n/10 - 
	 * 
	 */
	@Test
	public void test1()
	{
		List<Integer> output = selfDividingNumbers (1000, 100000);
		System.out.println(output);
		//Assert.assertArrayEquals([48,55,66,77], output);
	}
	
	public List<Integer> selfDividingNumbers(int left, int right) 
	{
		List<Integer> list = new ArrayList<Integer>();
		for (int i=left; i<=right; i++)
		{
			if(ifSelfDividing(i))
			{
				list.add(i);
			}
		}
		return list;
	}
		
		public static boolean ifSelfDividing(int n)
		{
			
			int rem=0; 
			int num=n;
			while (n!=0)
			{
				rem = n%10;
				if (rem==0 || num%rem !=0)
				{
					return false;
				}
				n=n/10;
			}
			return true;
		}
		
    
}
