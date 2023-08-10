package practice.dummy;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzz 
{
	/*
	 * Input : Number - integer
	 * Output : String Array
	 * Constraints : 1 <= n <= 10 power 4 (1-10,000)
	 * Data Set : 
	   Example 1:
	    Input: n = 3
		Output: ["1","2","Fizz"]
	   Example 2:
	    Input: n = 5
		Output: ["1","2","Fizz","4","Buzz"]
	   Example 3:
	    Input: n = 15
		Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"
	  * Pseudocode : 
	  * 1) Iterate from 1 till n-1
	  * 2) if i%3 ==0 && i%5==0 --> String array FizzBuzz
	  * 3) else if i%3 ==0 --> String array Fizz
	  * 4) else if i%5==0 --> String array Buzz
	  * 5) else string array --> i
	  */
		
		public String[] Check (int n)
		{
			if (n>=1 && n<=10000)
			{
				String[] result = new String[n];
				for (int i=1; i<=n; i++)
				{
					if(i%3==0 && i%5==0)
					{
						result[i-1] = "FIZZBUZZ";
					}
					else if (i%3==0)
					{
						result[i-1] = "FIZZ";
					}
					else if (i%5==0)
					{
						result[i-1] = "BUZZ";
					}
					else 
					{
						result[i-1] = i+"";
					}
				}
				return result;
			}
			return null;
		}
		
		@Test
		public void test1()
		{
			String[] actual = Check('3');
			Assert.assertEquals("[\"1\",\"2\",\"Fizz\"]", "actual[]");
		}
		
		@Test
		public void test2()
		{
			String[] actual = Check('5');
			Assert.assertEquals("[\"1\",\"2\",\"Fizz\",\"4\",\"Buzz\"]", "actual[]");
		}
		
		@Test
		public void test3()
		{
			String[] actual = Check('5');
			Assert.assertEquals("[\"1\",\"2\",\"Fizz\",\"4\",\"Buzz\",\"Fizz\",\"7\",\"8\",\"Fizz\",\"Buzz\",\"11\",\"Fizz\",\"13\",\"14\",\"FizzBuzz\"]", "actual[]");
		}
	
}

/*
 *  if(s.length()!=t.length())return false;
        int[] n=new int[26];
        for(int i=0;i<s.length();i++)
        {
            n[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++)
        {
            n[t.charAt(i)-'a']--;
        }
        for(int i=0;i<n.length;i++)
        {
            if(n[i]!=0)return false;
        }
        return true;
 */
