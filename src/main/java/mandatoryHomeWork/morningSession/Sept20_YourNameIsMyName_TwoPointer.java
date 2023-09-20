package mandatoryHomeWork.morningSession;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Sept20_YourNameIsMyName_TwoPointer 
{
	/*
	 * https://www.codechef.com/problems/NAME2
	 * 
	 * understood : yes
	 * input : String, String
	 * output : boolean
	 * 
	 * Pseudocode: 
	 * 1) Convert to chArray
	 * 2) Sort both the String
	 * 3) Initialise both the pointers at start of each index;
	 * 4) While loop (mPointer<mch.length && wPointer<wch.length )
	 *     check if both the strings first letter are same --> mPointer++
	 *     wPointer++
	 * 5) return mPointer==m.length or mPointer==w.lenght   
	 *     
	 * 
	 */
	
	public boolean yourNameIsMyName (String m, String w)
	{	
		char[] mch = m.toCharArray();
		char[] wch = w.toCharArray();
		
		Arrays.sort(mch);
		Arrays.sort(wch);
		
		int mPointer=0;
		int wPointer=0;
		
		while(mPointer<mch.length && wPointer<wch.length )
		{
			if (mch[mPointer]==wch[wPointer])
			{
				mPointer++;
			}
			wPointer++;
		}
		return mPointer == mch.length || mPointer == wch.length;
	}
	
	@Test
	public void test1()
	{
		boolean actual = yourNameIsMyName("john", "johanna");
		System.out.println(actual);
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test2()
	{
		boolean actual = yourNameIsMyName("ira", "ira");
		System.out.println(actual);
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test3()
	{
		boolean actual = yourNameIsMyName("kayla ", "jayla ");
		System.out.println(actual);
		Assert.assertEquals(false, actual);
	}
	
	@Test
	public void test4()
	{
		boolean actual = yourNameIsMyName("naz ", "nazreen");
		System.out.println(actual);
		Assert.assertEquals(true, actual);
	}
}
