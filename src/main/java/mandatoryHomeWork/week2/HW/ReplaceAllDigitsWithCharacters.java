package mandatoryHomeWork.week2.HW;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReplaceAllDigitsWithCharacters 
{
	/*
	 * 
	 * Input : String
	 * Output : String
	 * 
	 * PSEUDO CODE
	 * string result=""
	 * for loop i to s.length-1
	 *  if s.charAt(i)-48<=9 and s.charAt(i)-48>=0
	 *   result=result+(s.charAt(i-1)+s.charAt(i)-48);
	 *  else
	 *   result=result+s.charAt(i);
	 *  end if
	 * end for
	 * return result
	 *  
	 */
	
	public String ReplaceAllDigitWithCharacters(String input)
	{
		String result="";
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i)-48<=9 && input.charAt(i)-48>=0)
			  result=result+(char)(input.charAt(i-1)+input.charAt(i)-48);
			else
				 result=result+input.charAt(i);
					 
		}
		return result;
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals("abbccdde", ReplaceAllDigitWithCharacters("a1b1c1d1"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals("abbdcfdhe", ReplaceAllDigitWithCharacters("a1b2c3d4e"));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals("abcdef", ReplaceAllDigitWithCharacters("a1c1e1"));
	}
}
