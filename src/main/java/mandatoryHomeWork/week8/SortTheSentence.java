package mandatoryHomeWork.week8;

import org.junit.Assert;
import org.junit.Test;

public class SortTheSentence 
{
	/*
	 * understood : yes
	 * input : String
	 * output : string
	 * 
	 * Pseudocode:
	 *1) Split the shuffled sentence into words
	 *2) Create an array to store the original order of words
	 *3) Iterate through the words and extract the word and its index
	 *4) The index is the last character of the word
	 *5)  Extract the original word
	 *6) Extract the word index
	 *7) Place the word in its original position
	 *8) Reconstruct the original sentence
	 */
	 public static String sortSentence(String s)
	 {
	        
	        String[] words = s.split(" ");
	        String[] originalOrder = new String[words.length];
	       
	        for (int i = 0; i < words.length; i++) {
	            String word = words[i];
	            int index = word.length() - 1; 
	            String originalWord = word.substring(0, index); 
	            int wordIndex = Character.getNumericValue(word.charAt(index));
	            originalOrder[wordIndex - 1] = originalWord;
	        }
	        
	        StringBuilder reconstructedSentence = new StringBuilder();
	        for (int i = 0; i < originalOrder.length; i++) 
	        {
	            reconstructedSentence.append(originalOrder[i]);
	            if (i < originalOrder.length - 1) 
	            {
	                reconstructedSentence.append(" ");
	            }
	        }

	        return reconstructedSentence.toString();
	 }
	 
	 @Test
		public void test1() 
	 	{
			String test1 = sortSentence("is2 sentence4 This1 a3");
			Assert.assertEquals("This is a sentence", test1);
		}
		
		
		@Test
		public void test2() 
		{
			String test2 = sortSentence("Hello1 World2");
			Assert.assertEquals("Hello World", test2);
		}
}
