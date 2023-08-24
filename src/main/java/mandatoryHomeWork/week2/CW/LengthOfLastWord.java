package mandatoryHomeWork.week2.CW;

import org.junit.Test;

import junit.framework.Assert;

public class LengthOfLastWord 
{
	/*
	 * Given a string s consisting of words and spaces, return the length of the last word in the string.
		A word is a maximal substring
 		consisting of non-space characters only.
 		
 		Input: s = "Hello World"
		Output: 5
		Explanation: The last word is "World" with length 5.
 		
 		Pseudocode 
 		1) Apply trim for the given input - to remove the extra spaces
 		2) find length of string.length(); //11 
 		2) While  string.chatAt() != " "
 		     count ++
	 */
	
	public int LengthOfLast(String input)
	{	
		input = input.trim();
		int counter=0;
		for (int i=input.length()-1; i>=0; i--)
		{
			if (input.charAt(i)==' ')
			{
				return counter;
			}
			counter = counter + 1;
		}
		return counter;
	}
	

	@Test
	public void test1 ()
	{
		int actual = LengthOfLast("Hello World");
		Assert.assertEquals(5, actual);
	}
	
	@Test
	public void test2 ()
	{
		int actual = LengthOfLast("Hello World");
		Assert.assertEquals(5, actual);
	}
	
}
