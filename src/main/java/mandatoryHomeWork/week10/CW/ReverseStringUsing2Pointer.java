package mandatoryHomeWork.week10.CW;

import org.junit.Test;
import org.testng.Assert;

public class ReverseStringUsing2Pointer 
{
	/*
	 * Pseudocode:
	 * 1) Assign two pointers, one at the start of the string and one at the end of the string
	 * 2) Swap the values, increment the startIndex and decrement the endIndex
	 * 3) loop until startIndex is less than endIndex
	 */
	
	public String reverseString (String str)
	{
		char[] ch =str.toCharArray();
		int startIndex=0;
		int endIndex = ch.length-1;
		while(startIndex<endIndex)
		{
			char temp = ch[startIndex];
			ch[startIndex] = ch[endIndex];
			ch[endIndex]=temp;
			startIndex++;
			endIndex--;
		}
		return new String(ch);
	}
	
	@Test
	public void test1()
	{
		String actual = reverseString( "Nazreen");
		Assert.assertEquals("neerzaN", actual);
	}
}
