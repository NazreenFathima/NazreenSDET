package mandatoryHomeWork.week14.HW;

import java.util.Stack;

import org.junit.Test;
import org.testng.Assert;

public class BackSpaceStringCompare 
{
	/*
	 * https://leetcode.com/problems/backspace-string-compare/
	 * 
	 * understood : yes
	 * input : String, String
	 * output : boolean
	 * 
	 * Pseudocode: 
	 * 1) Create a stack
	 * 2) Iterate through the for loop til s length
	 * 		if charAt =# --> chk if staack is not empty --> then pop
	 * 			else push ,
	 * 3) continue same for t
	 * 4) if both the stack is same return true else false;
	 */

	public boolean backspaceCompare(String s, String t) 
	{
		Stack<Character> st1 = new Stack<>();
		for (int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='#')
			{
				if(!st1.isEmpty())
				{
					st1.pop();	
				}
			}
			else
			{
				st1.push(s.charAt(i));
			}
		}
		
		Stack<Character> st2 = new Stack<>();
		for (int i=0; i<t.length(); i++)
		{
			if(t.charAt(i)=='#')
			{
				if(!st2.isEmpty())
				{
					st2.pop();
				}
			}
			else
			{
				st2.push(t.charAt(i));
			}
		}
		
		if(st1.equals(st2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Test
	public void test1()
	{
		boolean actual = backspaceCompare("ab#c", "ad#c");
		Assert.assertEquals(true, actual);
		
	}
	
	@Test
	public void test2()
	{
		boolean actual = backspaceCompare("ab##", "c#d#");
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test3()
	{
		boolean actual = backspaceCompare("a#b", "b");
		Assert.assertEquals(true, actual);
	}
}
