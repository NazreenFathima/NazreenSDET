package mandatoryHomeWork.week16.HW;

import org.junit.Test;

import junit.framework.Assert;

public class LongPressedName 
{
	/*
	 * https://leetcode.com/problems/long-pressed-name/description/
	 * 
	 * understood : yes
	 * input : String, String
	 * output : boolean
	 * 
	 * Pseudocode: 
	 * 1) Initialise i and j =0;
	 * 2) Iterate through the while loop til the typed.length
	 * 3) if current character at name equals current character at typed && i <name.length
	 * 			--> i++; j++
	 * 	  else if current character at typed and previoud character at types are equal 
	 *        && j>0 (if j in first position then there is no previous character)
	 *          --> j++
	 *    else return false
	 * 4) return i==name.length
	 * 
	 * 
	 * Last two test cases fail if this condition is not provided : i == name.length()
	 */
	
	public boolean longPressedName(String name, String typed)
	{
		int i=0; 
		int j=0;
		
		while(j<typed.length())
		{
			if(i<name.length() && name.charAt(i)==typed.charAt(j))
			{
				i++;
				j++;
			}
			else if (j>0 && typed.charAt(j)==typed.charAt(j-1))
			{
				j++;
			}
			else
			{
				return false;
			}
		}
		return i==name.length();
	}
	
	@Test
	public void test1()
	{
		boolean actual = longPressedName("alex", "aaleex");
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test2()
	{
		boolean actual = longPressedName("saeed", "ssaaedd");
		Assert.assertEquals(false, actual);
	}
	
	@Test
	public void test3()
	{
		boolean actual = longPressedName("a", "b");
		Assert.assertEquals(false, actual);
	}
	
	@Test
	public void test4()
	{
		boolean actual = longPressedName("pyplrz", "ppyypllr");
		Assert.assertEquals(false, actual);
	}
}
