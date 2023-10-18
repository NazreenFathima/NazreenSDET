package mandatoryHomeWork.morningSession;

import org.junit.Test;
import org.testng.Assert;

public class Oct17_CheckIfPanagram 
{
	/*
	 * https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
	 * 
	 * understood: yes
	 * input : Sting
	 * output : boolean
	 * 
	 * PSeudocode:
	 * 1)Initialise int[]
	 * 2)Replace space with no space
	 * 3)Iterate through for loop
	 * 4)Use frquency array nd increment
	 * 5)Iterate through the for loop til 26 
	 * 6) If the array has 0 --> return false
	 * 7) return true
	 * 
	 * 
	 */

	public boolean checkIfPangram(String str) 
	{
		int[] arr = new int[26];
		String str1= str.replace(" ", "");
		for (int i=0; i<str1.length(); i++)
		{
			arr[str1.charAt(i)-'a']++;
		}
		
		for(int i=0; i<26; i++)
		{
			if(arr[i]==0)
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
