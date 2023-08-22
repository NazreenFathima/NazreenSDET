package mandatoryHomeWork.morningSession;

import java.util.Arrays;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Anagram 
{
	/*
	 * Understood the problem : YES
	 * 
	 * Input : String
	 * Output : boolean
	 * 
	 * Pseudocode : 
	 * 1) Convert the string to char[]
	 * 2) Sort the char[]
	 * 3) If both char[] are equal then anagram else not anagram
	 * 
	 *
	 *
	 */
	
	public boolean isAnagram (String a, String b )
	{
		char[] achar = a.toCharArray();
		char[] bchar = b.toCharArray();
		Arrays.sort(achar);
		Arrays.sort(bchar);
		return Arrays.equals(achar, bchar);
		
	}
	
	@Test
	public void test1()
	{
		boolean actual = isAnagram("anagram", "nagaram");
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test2()
	{
		boolean actual = isAnagram("cat", "bat");
		Assert.assertEquals(false, actual);
	}
}
