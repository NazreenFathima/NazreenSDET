package mandatoryHomeWork.week11.CW;

import org.junit.Test;

import junit.framework.Assert;

public class Palindrome_String_ExpandFromCenter 
{
	/*
	 * understood : yes
	 * input : String 
	 * output : boolean
	 * 
	 * Pseudocode:
	 * 1) initialise the pointer => left is length/2 -1; and right will be length/2+1 if odd or length/2 if even
	 * 2) loop till end of the string and validate left and right index value are equal
	 * 3) return true if all characters are equal and false if any one mismatch
	 * 
	 */
	
	public boolean palindrome(String str)
	{
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
		boolean actual = palindrome ("RADAR");
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test2()
	{
		boolean actual = palindrome ("RADDAR");
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test3()
	{
		boolean actual = palindrome ("NAFA");
		Assert.assertEquals(false, actual);
	}
	
}
