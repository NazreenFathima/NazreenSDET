package mandatoryHomeWork.week14.HW;

import java.util.Stack;

import org.junit.Test;
import org.testng.Assert;

public class RemoveOuterParenthesis 
{
	/*
	 * understood: yes
	 * input: String
	 * output : String
	 * 
	 * PSeudocode: 
	 * 1) Create a stack
	 * 2) Initialise String builder
	 * 3) Iterate through the for loop till string length
	 * 		if ( symbol is found -->
	 * 			if size of staack is greater than 0 --> append to string builder
	 * 			push the symbol
	 * 		else 
	 * 			pop 
	 * 			if size of staack is greater than 0 --> append to string builder
	 * 4) Return the string builder.ToString
	 * 	
	 */

	public String removeOuterParentheses(String s) 
	{
		Stack<Character> st = new Stack<>();
		StringBuilder sb = new StringBuilder("");
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
			{
				if(st.size()>0)
				{
					sb.append(s.charAt(i));
				}
				st.push(s.charAt(i));
			}
			else
			{
				st.pop();
				if(st.size()>0)
				{
					sb.append(s.charAt(i));
				}
			}
		}
		return sb.toString();
	}
	
	@Test
	public void test1()
	{
		String actual = removeOuterParentheses("(()())(())(()(()))");
		Assert.assertEquals("()()()()(())", actual);
	}
	
	@Test
	public void test2()
	{
		String actual = removeOuterParentheses("()()");
		Assert.assertEquals("", actual);
	}
	
	@Test
	public void test3()
	{
		String actual = removeOuterParentheses("(()())(())");
		Assert.assertEquals("()()()", actual);
	}
}
