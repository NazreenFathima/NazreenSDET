package week3.day1CW;

import org.junit.Test;

import junit.framework.Assert;

public class ExcelSheetColumnNumber 
{
	/*
	 * Input : String
	 * Output : int
	 * 
	 * Constraints : No DS
	 * 
	 * Pseudocode : 
	 * 1)
	 * 2)
	 * 3)
	 * 4)
	 *
	 */
	
	public int columnNumber (String columnTitle)
	{	
		if(columnTitle.length()==1)
		{
		return (1)+columnTitle.charAt(0)-'A';
		}
		int result=0;
		for(int i=0;i<columnTitle.length();i++)
		{
		result=result*26+(columnTitle.charAt(i)-'A'+1);
		}
		return result;
	}
	
	@Test
	public void test1()
	{
		int actual = columnNumber ("AB");
		Assert.assertEquals(28, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = columnNumber ("A");
		Assert.assertEquals(1, actual);
	}
	
	@Test
	public void test3()
	{
		int actual = columnNumber ("ZY");
		Assert.assertEquals(701, actual);
	}
}
