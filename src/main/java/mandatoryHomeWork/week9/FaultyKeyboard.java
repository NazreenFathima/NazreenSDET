package mandatoryHomeWork.week9;

import org.junit.Test;
import org.testng.Assert;

public class FaultyKeyboard 
{
	/*
	 * understood : yes
	 * input : String
	 * output : String
	 * 
	 * Pseudocode:
	 * 1)StringBuilder
	 * 2)Iterate through the for loop
	 * 3)Have String chatAt(i) in char
	 * 4)when ch=='i' --> reverse
	 *   else --> append(ch)
	 * 5) Return the word(change to string)
	 * 
	 */
	public String faultyKeyboard(String str)
	{
		StringBuilder word = new StringBuilder();
		for (int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if (ch=='i')
			{
				word.reverse();
			}
			else 
			{
				word.append(ch);
			}
				
		}
		return word.toString();
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
	
	
}
