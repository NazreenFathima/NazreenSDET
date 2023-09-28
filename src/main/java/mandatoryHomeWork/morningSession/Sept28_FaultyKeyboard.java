package mandatoryHomeWork.morningSession;

import org.junit.Test;
import org.testng.Assert;

public class Sept28_FaultyKeyboard 
{
	/*
	 * understood : yes
	 * input : String
	 * output : String
	 * 
	 * Pseudocode:
	 * 1) USing StringBuilder
	 * 2) Iterate through the for loop till string length
	 * 3) when character=i --> reverse 
	 * 		else append
	 * 4) return the word (Changed to string)
	 * 
	 */
	
	public String faultyKeyboard(String str)
	{
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<str.length(); i++)
		{
			if (str.charAt(i)=='i')
			{
				sb.reverse();
			}
			else 
			{
				sb.append(str.charAt(i));
			}
			
		}
		return sb.toString();
	}
	
	@Test
	public void test1()
	{
		String actual = faultyKeyboard("string");
		Assert.assertEquals("rtsng", actual);
	}
	
	@Test
	public void test2()
	{
		String actual = faultyKeyboard("poiinter");
		Assert.assertEquals("ponter", actual);
	}
	
	@Test
	public void test3()
	{
		String actual = faultyKeyboard("abciiiaba");
		Assert.assertEquals("cbaaba", actual);		
	}
	
	@Test
	public void test4()
	{
		String actual = faultyKeyboard("aabbccnabiaibii");
		Assert.assertEquals("aaabbccnabb", actual);		
	}
	
	
}
