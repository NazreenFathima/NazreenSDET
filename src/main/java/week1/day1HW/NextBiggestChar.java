package week1.day1HW;

import org.junit.Test;

import junit.framework.Assert;

public class NextBiggestChar 
{
	/*
	 * Input : char[], char
	 * Output : char
	 * 
	 * Given a sorted character array and a target character,
		find the next biggest character in the array.

		Example:
		char[] cha = {‘b’, ‘d’ , ‘h’}; char k = ‘e’
		Output -> h
	 */
	
	public char nextBigChar (char[] input, char target)
	{
		for (int i=0; i<input.length; i++)
		{
			if (input[i]>target)
			{
				return input[i];
			}
		}
		return '\0';
	}
	
	@Test
	public void test1()
	{
		char[] input1= {'a','e','i','o','u'};
		Assert.assertEquals('o',nextBigChar(input1,'m'));
	}

	@Test
	public void test2()
	{
		char[] input1= {'b','e','n'};
		Assert.assertEquals('\0',nextBigChar(input1,'x'));
	}
}
