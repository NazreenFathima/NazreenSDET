package mandatoryHomeWork.morningSession;

import org.junit.Assert;
import org.junit.Test;

public class Sept7_BeautifulString 
{
	/*
	 * understood : yes
	 * input : String
	 * output : int
	 * 
	 * Pseudocode:
	 * 1)Initialise count=0;
	 * 2)Iterate through for loop
	 * 3)if even--> expectedChar =0; else 1
	 * 4)ChatAt(i)!=expectedChar -> count++
	 */
	
	public int beautifulString(String str)
	{
		int count =0;
		for (int i=0; i<str.length(); i++)
		{
			char expectedChar;
			if (i % 2 == 0) 
			{
                expectedChar = '0';
            } else {
                expectedChar = '1';
            }

            if (str.charAt(i) != expectedChar) 
            {
            	count++;
            }
		}
		return count;
	}
	
	 @Test
	 public void test1() 
	 {
	 int actual = beautifulString("0101");
	 Assert.assertEquals(0, actual);
	 }
	 
	 @Test
	 public void test2() 
	 {
	 int actual = beautifulString("0000");
	 Assert.assertEquals(2, actual);
	 }
	 
	 @Test
	 public void test3() 
	 {
	 int actual = beautifulString("01011");
	 Assert.assertEquals(1, actual);
	 }
	 
	 @Test
	 public void test4() 
	 {
	 int actual = beautifulString("10101");
	 Assert.assertEquals(0, actual);
	 }
	 
}
