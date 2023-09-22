package mandatoryHomeWork.morningSession;

import org.junit.Assert;
import org.junit.Test;

public class Sept22_RemoveOuterParentheses 
{
	/* https://leetcode.com/problems/remove-outermost-parentheses/description/
	 * 
	 * understood : yes
	 * input : String
	 * output : String
	 * 
	 * Pseudocode:
	 * 1) StringBuilder
	 * 2) Iterate through for each loop
	 * 3) if (c == '(' && a++ > 0) --> append
	 * 4) if (c == ')' && a-- > 1) --> append
	 * return new String(sb)
	 */ 
	
	public String removeOuterParentheses(String str) 
	{
        StringBuilder sb = new StringBuilder();
        int a = 0;
        for (char c : str.toCharArray()) 
        {
            if (c == '(' && a++ > 0) 
            {
            	sb.append(c);
            }
            if (c == ')' && a-- > 1)
            {
            	sb.append(c);
            }
        }
        return new String(sb);
	}
	
	@Test
	public void test1() 
	{
		String actual=removeOuterParentheses ("(()())(())");
		String expected = "()()()";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test2() 
	{
		String actual=removeOuterParentheses ("(()())(())(()(()))");
		String expected = "()()()()(())";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test3() 
	{
		String actual=removeOuterParentheses ("()()");
		String expected = "";
		Assert.assertEquals(expected, actual);
	}
}
