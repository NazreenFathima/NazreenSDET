package mandatoryHomeWork.week12.HW;

import org.junit.Assert;
import org.testng.annotations.Test;

public class CheckIfPanagram 
{
	/*
	 * understood : yes
	 * input : String
	 * output : boolean
	 * 
	 * Pseudocode:
	 * 1)Initialise int[]
	 * 2)Replace space with no space
	 * 3)Iterate through for loop
	 * 4)Use frquency array nd increment
	 * 5)Iterate through the for loop til 26 
	 * 6) If the array has 0 --> return false
	 * 7) return true
	 */

	public boolean checkIfPangram(String sentence) 
	{
		int[] arr = new int[26];
		String str1 = sentence.replace(" ", "");
		for (int i=0; i<str1.length(); i++)
		{
			arr[str1.charAt(i)-'a']++;
		}
		
		for (int i=0; i<26; i++)
		{
			if (arr[i]==0)
			{
				return false;
			}
		}
		return true;
	}
	
	@Test
	public void test1()
	{
		boolean actual = checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
		Assert.assertEquals(true, actual);
	}

	@Test
	public void test2()
	{
		boolean actual = checkIfPangram("leetcode");
		Assert.assertEquals(false, actual);
	}
}
