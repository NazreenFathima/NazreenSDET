package mandatoryHomeWork.morningSession;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MergeStringAlternatively
{
	/*
	* Understood the prob : YES
	* Input : String
	* Output : String
	*
	* TestData :
	*
	* Positive : abcd, rgfh = arbgcfdh
	* Negative : ab, fhgh = afbhgh
	*  erth, ji = ejrith
	*
	* Pseudocode :
	* 1) Initialise the empty string to store result
	* 2) traverse both input string, each char alternatively from both the string and append to the merged string
	* 3) continue till reaching the end of largest string
	* 4) return the merged string
	*/

	public String mergeString(String word1, String word2)
	{
	StringBuilder result = new StringBuilder();
	int i=0;
	while(i<word1.length()||i<word2.length())
	{
	if (i<word1.length())
	{
	result.append(word1.charAt(i));
	}
	if (i<word2.length())
	{
	result.append(word2.charAt(i));
	}
	i++;
	}
	return result.toString();
	}

	@Test
	public void test1()
	{
	Assert.assertEquals("arbgcfdh", mergeString("abcd","rgfh"));
	}

	@Test
	public void test2()
	{
	Assert.assertEquals("afbhgh", mergeString("ab","fhgh"));
	}

	@Test
	public void test3()
	{
	Assert.assertEquals("ejrith", mergeString("erth","ji"));
	}

}
