package mandatoryHomeWork.morningSession;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SplitStringInBalancedString 
{
	/*
	 * Understood : Yes
	 * Inpit : String 
	 * Output : int
	 * 
	 * Pseudocode : 
	 * 1) Initialize three variables countR, countL, count to 0
	 * 2) Iterate through for loop till the last index of s and if the charAt a particular index equals R, do countR++, else countL++
	 * 3) if the countR == countL, increment count by 1
	 * 4) return count
	 */
	
	public int balancedStringSplit(String s) 
	{
        int count=0;
        int countR=0;
        int countL=0;
        for(int i=0;i<s.length();i++)
        {

                if(s.charAt(i)=='R')
                {
                    countR++;
                }
                else
                {
                    countL++;
                }

               if(countR==countL)
               {
                   count++;
               }
        }
        return count;
    }
	
	@Test
	public void test1()
	{
		int actual = balancedStringSplit ("RLRRLLRLRL");
		Assert.assertEquals(4, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = balancedStringSplit ("RLRRRLLRLL");
		Assert.assertEquals(2, actual);
	}
	
	@Test
	public void test3()
	{
		int actual = balancedStringSplit ("LLLLRRRR");
		Assert.assertEquals(1, actual);
	}
}
