package mandatoryHomeWork.morningSession;

import org.junit.Assert;
import org.junit.Test;

public class Sept7_BeautifuString_New 
{
	/*
	 * understood : yes
	 * input : String
	 * output : int
	 * 
	 * Pseudocode:
	 * 1)Initialise count=0
	 * 2)interate through the for loop
	 * 3)compare the first nd second elemt
	 * 4)same -> count++
	 * then for checking next number i++
	 * 
	 */
	public int beautifulString(String str)
	{
		int count =0;
		for (int i=0; i<str.length()-1; i++)
		{
			if (str.charAt(i)==str.charAt(i+1))
			{
				count++;
				i++;
			}
		}
		return count;
	}
	
	
	 @Test
	 public void test1() 
	 {
	 int actual = beautifulString("0000");
	 Assert.assertEquals(2, actual);
	 }
	 
	 @Test
	 public void test2() 
	 {
	 int actual = beautifulString("0101");
	 Assert.assertEquals(0, actual);
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
	 
	 @Test
	 public void test5() 
	 {
	 int actual = beautifulString("01010010101");
	 Assert.assertEquals(5, actual);
	 }
	 
	 @Test
	 public void test6() 
	 {
	 int actual = beautifulString("110100000101");
	 Assert.assertEquals(9, actual);
	 }
}
