package week4.day2HW;

import org.junit.Test;

import junit.framework.Assert;

public class ColourOfChessboardSquare 
{
	/*
	 * Did u understand the problem : YES
	 * 
	 * Input : String
	 * Output : Boolean
	 * 
	 * DataSet : 
	 * 
	 * Pseudocode:
	 * 1)Convert the String to ASCII value
	 * 2)Add both the values
	 * 3) Return false if modulo2 is 0
	 * else true 
	 */
	
	public boolean squareIsWhite (String coordinates)
	{	
		int coordinate1 = coordinates.charAt(0)-'`';
		int coordinate2 = coordinates.charAt(1)-'0';
		int total = coordinate1 + coordinate2;
		if (total%2 == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	@Test
	public void test1()
	{
		boolean actual = squareIsWhite ("a1");
		Assert.assertEquals(false, actual);
	}
	
	@Test
	public void test2()
	{
		boolean actual = squareIsWhite ("h3");
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test3()
	{
		boolean actual = squareIsWhite ("c7");
		Assert.assertEquals(false, actual);
	}
}
