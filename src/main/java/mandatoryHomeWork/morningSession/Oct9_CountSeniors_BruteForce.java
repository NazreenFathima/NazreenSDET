package mandatoryHomeWork.morningSession;

import org.junit.Test;
import org.testng.Assert;

public class Oct9_CountSeniors_BruteForce 
{
	/*
	 * understood : yes
	 * input : String[]
	 * output : int
	 * 
	 * Pseudocode: 
	 * 1)Initialise count
	 * 2)Iterate through the for loop till String length
	 * 3)Get the substring and convert to int
	 * 4)if >60 --> count increment
	 * 5)return count
	 */

	public int countSeniors(String[] details) 
	{
		int count=0;
		for (int i=0; i<details.length; i++)
		{
			String age = details[i].substring(11,13);
			int age1 = Integer.parseInt(age);
			if(age1>60)
			{
				count++;
			}
		}
		return count;
	}
	
	@Test
	public void test1()
	{
		int actual = countSeniors(new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"});
		Assert.assertEquals(2, actual);
		
	}
	
	@Test
	public void test2()
	{
		int actual = countSeniors(new String[] {"1313579440F2036","2921522980M5644"});
		Assert.assertEquals(0, actual);
		
	}
}
