package week3.day2HW;

public class SmallestEvenMultiple 
{
	/*
	 * Understood the prog : YES
	 * 
	 * Input : int
	 * Output : int
	 * 
	 * Data SET: 
	 * Input: n = 5
Output: 10
Explanation: The smallest multiple of both 5 and 2 is 10.
Input: n = 6
Output: 6
Explanation: The smallest multiple of both 6 and 2 is 6. Note that a number is a multiple of itself.
	 *
	 *Pseudocode 
	 *1) Check if the given nunmber is even or odd
	 *2) If Even return the number itself
	 *3) If odd Multiply 2 and number
	 */
	
	public int smallestEvenMultiple(int n) 
	{	
		if (n%2==0)
		{
			return n;
		}
		else
		{
			return 2*n;
		}
   
    }
}
