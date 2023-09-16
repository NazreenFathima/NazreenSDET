package mandatoryHomeWork.week10.CW;

import org.junit.Test;
import org.testng.Assert;

public class ReverseString 
{
	public String reverseString (String str)
	{
		String reverse="";
		for (int i=str.length()-1; i>=0; i--)
		{
			reverse = reverse+str.charAt(i);
		}
		return reverse;
	}
	
	@Test
	public void test1()
	{
		String actual = reverseString( "Nazreen");
		Assert.assertEquals("neerzaN", actual);
	}
}
