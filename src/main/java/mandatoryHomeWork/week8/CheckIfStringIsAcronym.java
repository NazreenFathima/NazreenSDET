package mandatoryHomeWork.week8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class CheckIfStringIsAcronym 
{
	/*
	 * understood : yes
	 * input : List<String>, String 
	 * output : boolean
	 * 
	 * Pseudocode : 
	 * 1) create obj for StringBuilder
	 * 2) Iterate through for each llop
	 * 3) append the word(ChatAt(0))
	 * 4) return true if first letter at each word is equal to string provided
	 * 5) else return false
	 */
	
	public boolean stringIsAcronym (List<String> words, String s)
	{
		StringBuilder sb = new StringBuilder();
		for (String string : words)
		{
			sb.append(string.charAt(0));
		}
		if (sb.toString().equals(s))
		{
			return true;
		}
		else
		return false;
	}
	
	@Test
	public void test1()
	{
		List<String> words = Arrays.asList("alice","bob","charlie");
		String s = "abc";
		boolean actual = stringIsAcronym(words,s);
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test2()
	{
		List<String> words = Arrays.asList("an","apple");
		String s = "a";
		boolean actual = stringIsAcronym(words,s);
		Assert.assertEquals(false, actual);
	}
	
	@Test
	public void test3()
	{
		List<String> words = Arrays.asList("never","gonna","give","up","on","you");
		String s = "ngguoy";
		boolean actual = stringIsAcronym(words,s);
		Assert.assertEquals(true, actual);
	}
}
