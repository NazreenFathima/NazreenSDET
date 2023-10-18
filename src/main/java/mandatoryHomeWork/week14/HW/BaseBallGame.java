package mandatoryHomeWork.week14.HW;

import java.util.ArrayList;
import java.util.Stack;

import org.junit.Test;

import junit.framework.Assert;

public class BaseBallGame 
{
	/*
	 * https://leetcode.com/problems/baseball-game/
	 * 
	 * understood : yes
	 * input : String[]
	 * output : int
	 * 
	 * Pseudocode :
	 * 1) Create a Stack
	 * 2) Initialise result equals 0;
	 * 3) Iterate through the for each loop 
	 * 		C -->pop
	 * 		D -->peek*2 -->push
	 * 		+ -->Store the last two int using pop, then push those two int 
	 * 				Add them and push to stack
	 * 		int --> Convert to int using Interger.parseInt and push to Stack
	 * 4) When Stack is not empty --> add to result using pop.
	 * 5) Return result
	 */

	public int calPoints(String[] operations) 
	{
		Stack<Integer> st = new Stack<>();
		int result = 0;
		for(String opr : operations)
		{
			if(opr.equals("C"))
			{
				st.pop();
			}
			else if(opr.equals("D"))
			{
				st.push(st.peek()*2);
			}
			else if(opr.equals("+"))
			{
				int pop1 = st.pop();
				int pop2 = st.pop();
				st.push(pop2);
				st.push(pop1);
				int sum = pop1+pop2;
				st.push(sum);
			}
			else
			{
				st.push(Integer.parseInt(opr))  ;
			}
		}
		
		while(!st.isEmpty())
		{
			result += st.pop();
		}
		return result;
	}
	
	@Test
	public void test1()
	{
		int actual = calPoints(new String[] {"5","2","C","D","+"});
		Assert.assertEquals(30, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = calPoints(new String[] {"5","-2","4","C","D","9","+","+"});
		Assert.assertEquals(27, actual);
	}
	
	@Test
	public void test3()
	{
		int actual = calPoints(new String[] {"1","C"});
		Assert.assertEquals(0, actual);
	}
}
