package mandatoryHomeWork.week8;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberOfWordsFoundInSentence 
{
	/*
	 * understood = yes
	 * input : String[] 
	 * output : int
	 * 
	 * Pseudocode:
	 * 1)Initialise the max as Integer.MIN_VALUE;
	 * 2)iterate through the for loop
	 * 3)separate each word using split nd store in String[]
	 * 4)compare max nd the array lenght
	 * 5)return max array lenght
	 * 
	 */
	
	public int maxNumWord(String [] str)
	{
		int max = Integer.MIN_VALUE;
		for (int i=0; i<str.length; i++)
		{
			String[] arr= str[i].split(" ");
			if(max<arr.length)
			{
				max=arr.length;
			}
		}
		return max;
	}
	
	@Test
	public void test1()
	{
		int actual = maxNumWord(new String[] {"alice and bob love leetcode", "i think so too", "this is great thanks very much"});
		Assert.assertEquals(6, actual);
		System.out.println(actual);
	}
	
	@Test
	public void test2()
	{
		int actual = maxNumWord(new String[] {"please wait", "continue to fight", "continue to win"});
		Assert.assertEquals(3, actual);
		System.out.println(actual);
	}
	
}
