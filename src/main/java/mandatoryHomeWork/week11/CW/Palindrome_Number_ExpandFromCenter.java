package mandatoryHomeWork.week11.CW;

import org.junit.Test;

import junit.framework.Assert;

public class Palindrome_Number_ExpandFromCenter 
{
	public boolean palindromeNumberPointerFromCenter(int num)
	{
		String str =String.valueOf(num);
		int left=str.length()/2-1, right;
		
		if(str.length()%2==0)
		{
			right = str.length()/2;
		}
		else
		{
			right = str.length()/2+1;
		}
		
		while(right<str.length())
		{
			if(str.charAt(left)!=str.charAt(right))
				return false;
			left--;
			right++;
			
		}
		return true;
	}
	
	@Test
	public void test1()
	{
		boolean actual = palindromeNumberPointerFromCenter (910);
		Assert.assertEquals(false, actual);
	}
	
	@Test
	public void test2()
	{
		boolean actual = palindromeNumberPointerFromCenter (1001);
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test3()
	{
		boolean actual = palindromeNumberPointerFromCenter (5000);
		Assert.assertEquals(false, actual);
	}
}
