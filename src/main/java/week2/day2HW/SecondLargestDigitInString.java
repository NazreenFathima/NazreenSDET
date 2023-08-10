package week2.day2HW;

import org.junit.Assert;
import org.junit.Test;

public class SecondLargestDigitInString 
{
	public int sLargest(String s)
	{
		s=s.replaceAll("[a-zA-Z]", "");
		int max=Integer.MIN_VALUE;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)-'0'>=max){
				max=s.charAt(i)-'0';
			}
		}
		int sMax=Integer.MIN_VALUE;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)-'0'>sMax)&&(s.charAt(i)-'0'!=max))
			{
				sMax=s.charAt(i)-'0';
			}
		}
		if(sMax!=Integer.MIN_VALUE)
		{
			return sMax;
		}
		return -1;
	}
	
	@Test
	public void test1()
	{
		String s="dfa12321afd";
		Assert.assertEquals(2, sLargest(s));
	}
	
	@Test
	public void test2()
	{
		String s= "abc1111";
		Assert.assertEquals(-1, sLargest(s));
	}
}
