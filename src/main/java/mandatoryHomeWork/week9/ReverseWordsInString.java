package mandatoryHomeWork.week9;

import org.junit.Test;
import org.testng.Assert;


public class ReverseWordsInString 
{
	/*
	 * understood : yes
	 * input : String
	 * output : String
	 * 
	 * Pseudocode
	 * 1)Split the string using " "
	 * 2)reverse the string (StringBuilder)
	 * 3)Join and return the string 
	 */
	
	public String reverseWordsInString(String sentence)
	{
		String[] arr = sentence.split(" ");
		int i=0;
		for (String string : arr) 
		{
			StringBuilder sb = new StringBuilder(string);
			sb.reverse();
			arr[i++]= sb.toString();
		}
		return String.join(" ", arr);

	}
	
	@Test
	public void test1()
	{
		String actual = reverseWordsInString("Let's take LeetCode contest");
		Assert.assertEquals("s'teL ekat edoCteeL tsetnoc", actual);
				
	}
	
	@Test
	public void test2()
	{
		String actual = reverseWordsInString("God Ding");
		Assert.assertEquals("doG gniD", actual);
				
	}
}
