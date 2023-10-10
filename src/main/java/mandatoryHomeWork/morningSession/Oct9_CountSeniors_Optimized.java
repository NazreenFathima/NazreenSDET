package mandatoryHomeWork.morningSession;

import org.junit.Test;
import org.testng.Assert;

public class Oct9_CountSeniors_Optimized 
{
	public int countSeniors(String[] details) 
	{
		int count = 0;
		for (String s : details) 
		{
			if (s.length() >= 13) 
			{
				char char1 = s.charAt(11);
				char char2 = s.charAt(12);

				if (char1 == '6' && char2 > '0') 
				{
					count++;
				}
				else if(char1>'6'&&char2>='0') 
				{
					count++;
				}
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
