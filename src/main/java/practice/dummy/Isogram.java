package practice.dummy;

import org.junit.Assert;
import org.junit.Test;

public class Isogram 
{
	/*
	 * Input : String
	 * Output : Boolean
	 * No Constraints
	 * Data Set : Postive : Stop
	 * 			  Negative : Testleaf
	 * 		      Edge : aaaaa
	 * 
	 * Pseudocode :
	 * 1) Convert the string to char array
	 * 2) Traverse through the string
	 * 3) Compare the first element with the remaining using another for loop
	 * if both char matches - return false
	 * else if it does not match - continue
	 * finally return true
	 * 
	 */
	public boolean isIsogram (String input)
	{
		char[] charArray = input.toCharArray();
		for(int i=0 ; i<charArray.length-1; i++)
		{
			for (int j=i+1; j<charArray.length; j++)
			{
				if(charArray[i]==charArray[j])
				{
					return false;
				}
			}
		}
		
		return true;
		
	}
	
	@Test
	public void test1()
	{
		boolean actual = isIsogram("Stop");
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test2()
	{
		boolean actual = isIsogram("testleaf");
		Assert.assertEquals(false, actual);
	}

}



	
