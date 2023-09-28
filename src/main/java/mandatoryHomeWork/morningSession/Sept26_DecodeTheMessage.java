package mandatoryHomeWork.morningSession;

import org.junit.Assert;
import org.junit.Test;

public class Sept26_DecodeTheMessage 
{
	/* 
	 * https://leetcode.com/problems/decode-the-message/description/
	 * 
	 * understood : yes
	 * input : String
	 * output : String
	 * 
	 * Pseudocode:
	 * 1) Create empty char[] of length26
	 * 2) Convert the string to lower case
	 * 3) Initialise the index=0
	 * 4) Initialise the char[] of length 26 with 0 --> for loop (i=0; i<26; i++)
	 * 5) Create the substitution table --> for loop (i=0; i<length; i++)
	 * 		Hav every charAt(i) in char ch
	 * 		If the letter is not already in the table and is a letter, 
            map it to the next letter in the alphabet
       6) decode the msg
     *      StringBuilder
     *      Iterate through for loop (i=0; i<message.length; i++)
     *      if space --> append " "
     *      else compare with substitution table nd append
     * 7) Return StringBuilder converted to String  		
	 * 
	 * 
	 */
	
	public String decodeMessage(String key, String message) 
	{
		char[] substitutionTable = new char[26];
        String lowercaseKey = key.toLowerCase();
        int index = 0;
        for (int i=0; i<26; i++)
        {
        	substitutionTable[i]=0;
        }
        
        for(int i=0; i<lowercaseKey.length(); i++)
        {
         char ch = lowercaseKey.charAt(i);
         if (Character.isLetter(ch) && substitutionTable[ch-'a']==0)
         {
        	 char substitutionChar = (char) ('a' + index);
             substitutionTable[ch - 'a'] = substitutionChar;
             index++;
         }
        }
        
        StringBuilder decodedMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) 
        {
            char c = message.charAt(i);
            if (c == ' ') 
            {
                decodedMessage.append(' '); 
            }
            else 
            {
                char decodedChar = substitutionTable[c - 'a'];
                decodedMessage.append(decodedChar);
            }
        }

        return decodedMessage.toString();
	}
	
	@Test
	public void test1() 
	{
		String actual = decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv");
		String expected = "this is a secret";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test2() 
	{
		String actual = decodeMessage("aowrzlqeyicbnbdyvfsmbrgkthupdfxj", "aowrz ");
		String expected ="abcde ";
		Assert.assertEquals(expected, actual);
	}

}
