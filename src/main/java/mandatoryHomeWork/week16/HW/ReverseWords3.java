package mandatoryHomeWork.week16.HW;

import org.junit.Test;
import org.testng.Assert;

public class ReverseWords3 
{
	/*
	 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
	 * 
	 * understood : yes
	 * input : String
	 * output : String
	 * 
	 * Pseudocode: 
	 * 1) Split the sentence by space and have it in String[]
	 * 2) Initialise a StringBuider to store the reversed words
	 * 3) Iterate through the for loop 
	 * 4) Initialise another SB and pass each word
	 * 5) reverse
	 * 5) append to the reversed SB
	 * 6) if (i not equals length-1) --> append space
	 * 7) return the reversedSB (toString)
	 * 
	 * 
	 * 
	 */
	
	public String reverseWords (String sentence)
	{
		String[] arr = sentence.split(" ");
		StringBuilder reversedSentence = new StringBuilder();
		
		for(int i=0; i<arr.length; i++)
		{
			StringBuilder sb = new StringBuilder(arr[i]);
			sb.reverse();
			reversedSentence.append(sb);
			
			if(i!=arr.length-1)
			{
				reversedSentence.append(" ");
			}
		}
		return reversedSentence.toString();
	}
	
	@Test()
	public void test1()
	{
		String actual = reverseWords("Let's take LeetCode contest");
		Assert.assertEquals("s'teL ekat edoCteeL tsetnoc", actual);
	}
	
	@Test()
	public void test2()
	{
		String actual = reverseWords("God Ding");
		Assert.assertEquals("doG gniD", actual);
	}
}
