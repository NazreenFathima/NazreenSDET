package mandatoryHomeWork.week8;

import org.junit.Assert;
import org.junit.Test;

public class DecodeMessage 
{

	public static String decodeMessage(String key, String message) 
	{
		char[] substitutionTable = new char[26];
        String lowercaseKey = key.toLowerCase();
        int index = 0;

        // Initialize the substitution table with zeros
        for (int i = 0; i < 26; i++) 
        {
            substitutionTable[i] = 0;
        }
        
        // Create the substitution table
        for (int i = 0; i < lowercaseKey.length(); i++) 
        {
            char c = lowercaseKey.charAt(i);
            if (Character.isLetter(c) && substitutionTable[c - 'a'] == 0) 
            {
                // If the letter is not already in the table and is a letter, 
            	//map it to the next letter in the alphabet
                char substitutionChar = (char) ('a' + index);
                substitutionTable[c - 'a'] = substitutionChar;
                index++;
            }
        }
        
        // Decode the message
        StringBuilder decodedMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) 
        {
            char c = message.charAt(i);
            if (c == ' ') 
            {
                decodedMessage.append(' '); // Spaces remain unchanged
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
