package mandatoryHomeWork.morningSession;

import org.junit.Assert;
import org.junit.Test;

public class Sept14_CamelCase 
{
	/*
	 * understood : yes
	 * input : String
	 * output : int
	 * 
	 * Pseudocode : 
	 * 1)initialise the count = 0; Convert the string to char[]
	 * 2)chk if the ch is uppper case then add count
	 * 3) return count+1;
	 */
	
	public int camelCase(String str)
	{
		int count=0;
		char[] ch = str.toCharArray();
		for (int i=0; i<ch.length; i++)
		{
			if(Character.isUpperCase(ch[i]))
			{
				count++;
			}
		}
		return count+1;
	}
	
	@Test
	public void test1()
	{
		int actual = camelCase("saveChangesInTheEditor");
		Assert.assertEquals(5, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = camelCase("oneTwoThree");
		Assert.assertEquals(3, actual);
	}
	
	@Test
	public void test3()
	{
		int actual = camelCase("nazreenFathima");
		Assert.assertEquals(2, actual);
	}
	
	@Test
	public void test4()
	{
		int actual = camelCase("nafa");
		Assert.assertEquals(1, actual);
	}
}
