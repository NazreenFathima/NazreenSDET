package mandatoryHomeWork.morningSession;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReversePrefixOfWord 
{
	/*
	* Understood the prob: YES
	* Input : String, char
	* Output : String
	*
	* TestData :
	* Positive:
	* Input :word = "abcdefd", ch = "d"
	* Output : "dcbaefd"
	*
	* Input : "xyxzxe", ch = "z"
	* Output : word = "zxyxxe"
	*
	* Negative:
	* Input: word = "abcd", ch = "z"
	* Output: "abcd"
	*
	* Edge :
	* Input: word = "aaaaabbbbbb", ch = "b"
	* Output: "baaaaa"
	*
	*
	* Pesudocode :
	* 1) Get the string and the first character (til which the word has to be reversed)
	* 2) Check if the given character is available in the given string
	* 3) If the String is available
	*    substring;
	*    rev;
	*    
	* If not available- return the original string itself
	*
	*  
	*
	*/

	public String reversePrefix (String word, char ch )
	{
	StringBuilder sb = new StringBuilder();
	int index = word.indexOf(ch);
	sb.append(word.substring(0, index+1));
	sb.reverse();
	sb.append(word.substring(index+1));
	   return sb.toString();

	}

	@Test
	public void test1()
	{
	Assert.assertEquals("dcbaefd", reversePrefix("abcdefd",'d'));
	}

	@Test
	public void test2()
	{
	Assert.assertEquals("abcd", reversePrefix("abcd",'z'));
	}

	@Test
	public void test3()
	{
	Assert.assertEquals("baaaaabbbbb", reversePrefix("aaaaabbbbbb",'b'));
	}
}
