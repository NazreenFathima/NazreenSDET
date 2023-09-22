package mandatoryHomeWork.week9;

import org.junit.Assert;
import org.junit.Test;

public class AddMinimum 
{
	/*
	 * understood : yes
	 * input : String
	 * output : int
	 * 
	 * Pseudocode
	 * 1) Initialise the count=0
	 * 2) Iterate through the for loop till length-1
	 * 3) check if current character > next character --> count++
	 * 4) return (3*count) - length 
	 */
	
	public int addMinimum(String str)
	{
		int count=1;
		for(int i=0; i<str.length()-1; i++)
		{
			if(str.charAt(i) >= str.charAt(i+1)) 
			{
				count++;
			}
		}
		return (3*count) - str.length();
	}
	
	
	@Test
	public void test1() 
	{
		int actual=addMinimum("abccc");
		Assert.assertEquals(4, actual);
	}
	
	@Test
	public void test2() 
	{
		int actual=addMinimum("b");
		Assert.assertEquals(2, actual);
	}
	
	@Test
	public void test3() 
	{
		int actual=addMinimum("aaa");
		Assert.assertEquals(6, actual);
	}
	
	@Test
	public void test4() 
	{
		int actual=addMinimum("abc");
		Assert.assertEquals(0, actual);
	}
}
