package week2.day1CW;

import org.junit.Test;

import junit.framework.Assert;

public class DetermineIfStringHalvesAreAlike 
{	
	/*
	 * https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
	 */

	public boolean findStringAlike(String s,char[] vowels) {

		int strLen = s.length()/2;
		char[] a = s.substring(0,strLen).toCharArray();
		char[] b = s.substring(strLen).toCharArray();
		//String vowels1=vowels.replaceAll("[^a-zA-Z0-9]", ""); //aeiouAEIOU
		int count = 0,count1 = 0;


		for(int i=0;i<a.length;i++) {
		count=0;
		for(int j=0;j<vowels.length;i++) {
		if(a[i]==vowels[j])
		count++;
		}
		}

		for(int i=0;i<b.length;i++) {
		count1=0;
		for(int j=0;j<vowels.length;i++) {
		if(b[i]==vowels[j])
		count1++;
		}
		}
		return (count==count1);
		}

	@Test
	public void test1()
	{
		boolean actual = findStringAlike ("book", new char[] {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'});
		Assert.assertEquals(true, actual);
	}
}


