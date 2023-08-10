package week3.day2HW;

import org.junit.Test;

import junit.framework.Assert;

public class MultipleStrings 
{
	/*
	 * Understood the prob : YES
	 * 
	 * Input : string
	 * Output : string
	 * 
	 * Constraints : You must not use any built-in BigInteger library or convert the inputs to integer directly.
	 * 1 <= num1.length, num2.length <= 200
	 * 
	 * Psuedocode : 
	 * 
	 * 1) Get the string 
	 * 2) convert to char[]
	 * 3) 
	 * 
	 */
	public String multiply(String num1, String num2) {
	    int m = num1.length(), n = num2.length();
	    int[] pos = new int[m + n];
	   
	    for(int i = m - 1; i >= 0; i--) {
	        for(int j = n - 1; j >= 0; j--) {
	            int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); 
	            int p1 = i + j, p2 = i + j + 1;
	            int sum = mul + pos[p2];

	            pos[p1] += sum / 10;
	            pos[p2] = (sum) % 10;
	        }
	    }  
	    
	    StringBuilder sb = new StringBuilder();
	    for(int p : pos) if(!(sb.length() == 0 && p == 0)) sb.append(p);
	    return sb.length() == 0 ? "0" : sb.toString();
	}
	
	@Test
	public void test1()
	{
		String actual = multiply("123", "25");
		Assert.assertEquals("3075", actual);
	}
}
