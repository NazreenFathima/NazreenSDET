package mandatoryHomeWork.week8;

import org.junit.Assert;
import org.junit.Test;

public class TruncateSentence 
{
	/*
	 * understood : yes
	 * input : String, int
	 * output : String
	 * 
	 * PSeudocode:
	 * 
	 */
	
	 public String truncateSentence(String s, int k) 
	    {
	        String[] parts = s.split(" ");
	        String a = "";
	        for (int i = 0; i < k; i++) 
	        {
	            a = a+  " " + parts[i];
	        }
	        return a.substring(1);
	    }
	 
	 @Test
	 public void test1() 
	 {
	 String actual = truncateSentence("Hello how are you Contestant", 4);
	 Assert.assertEquals("Hello how are you", actual);
	 }
	 
	 @Test
	 public void test2() 
	 {
	 String actual = truncateSentence("What is the solution to this problem", 4);
	 Assert.assertEquals("What is the solution", actual);
	 }
	 
	 @Test
	 public void test3() 
	 {
	 String actual = truncateSentence("chopper is not a tanuki", 5);
	 Assert.assertEquals("chopper is not a tanuki", actual);
	 }
}
