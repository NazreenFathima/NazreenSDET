package mandatoryHomeWork.week2.CW;

import org.junit.Test;

public class FindTheDifference 
{
	/*
	 * You are given two strings s and t.
		String t is generated by random shuffling string s and then add one more letter at a random position.
		Return the letter that was added to t.
		
		Input: s = "abcd", t = "abcde"
		Output: "e"
		Explanation: 'e' is the letter that was added.
		
		Input: s = "", t = "y"
		Output: "y"
		
		Pseudocode:
		1) in the for loop () add ascii values to tSum + sumAscii sSum\
		2) Get the last character Ascii value
		3) 
	 */
	
		public char findTheDifferences(String s, String t) 
		{
			int tSum = 0;
			int sSum = 0;
			for (int i =0; i<s.length(); i++)
			{
				tSum = tSum+t.charAt(i);
				sSum = sSum+t.charAt(i);
			}
			tSum = tSum+t.charAt(t.length()-1);
			char ch = (char)(tSum-sSum);
         return ch;
    }
		
		@Test
		public void test1()
		{
			String s = "abcde";
			String t = "abcd";
			findTheDifferences(s,t);
		}
	
}
