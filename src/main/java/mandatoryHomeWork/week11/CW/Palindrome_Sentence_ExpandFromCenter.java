package mandatoryHomeWork.week11.CW;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class Palindrome_Sentence_ExpandFromCenter 
{
	/*
	 * Given an input String,return a boolean array by validate each of the word is a palindrome.
Input = "this is a Tst"
output = [false, false, true, true]
	 *
	 *
	 *Input : String
	 *Output: boolean[]
	 *
	 *Pseudocode:
	 *1. Split the string with regex " "
     *2. create a boolean array of same as the split array
     *3. loop each word and validate is it a palindrome
     *  1. from the center calculate left and right by left = len/2-1, right as center or center+1 based on the length
     *  2. validate if both are same, else in output array mark as false
     *  3. end of the loop mark as true
	 *
	 */
	
	public boolean[] palindrome(String input)
	{
		if(input.length() == 0) 
			return new boolean[0];
		
		String[] inputArr = input.split(" ");

        boolean[] output = new boolean[inputArr.length];
        Arrays.fill(output, true);

        int left , right;
        String temp;

        for(int i = 0 ; i < inputArr.length; i++)
        {
            temp = inputArr[i];
            left = temp.length()/2-1;
            if( temp.length()%2==0)
                right = temp.length()/2;
            else
                right = temp.length()/2+1;

            while(right < temp.length())
            {
                if(Character.toLowerCase(temp.charAt(left)) != Character.toLowerCase(temp.charAt(right))) 
                {
                    output[i] = false;
                    break;
                }
                left--;
                right++;
            }
        }

        return output;
    }
	
	@Test
	public void test1()
	{
	boolean[] actual = palindrome("this is a Tet");
	boolean[] expected = {false,false,true, true};
	Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void test2()
	{
	boolean[] actual = palindrome("this is a Test");
	boolean[] expected = {false,false,true, false};
	Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void test3()
	{
	boolean[] actual = palindrome("a");
	boolean[] expected = {true};
	Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void test4()
	{
	boolean[] actual = palindrome("ab");
	boolean[] expected = {false};
	Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void test5()
	{
	boolean[] actual = palindrome("");
	boolean[] expected = {};
	Assert.assertEquals(actual, expected);
	}
	
		
}
	
