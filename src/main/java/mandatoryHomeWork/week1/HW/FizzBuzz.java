package mandatoryHomeWork.week1.HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzz 
{
	/*
	 * understood : yes
	 * input : int
	 * output : List<String>
	 * 
	 * Pseudocode
	 * 1) Initialise List
	 * 2) Iterate through the for loop till n
	 * 3) if mod 3 nd 5 equal to 0 --add Fizzbuzz
	 *  	else if mod 3 equal to 0 --add Fizz
	 *  		else if mod 5 to 0 --add buzz
	 *  			else add StringValue
	 * 5)Return list
	 */
	
	public List<String> fizzBuzz(int n) 
	{
		List<String> list = new ArrayList<String>();
		for (int i=1; i<=n; i++)
		{
			if(i%3==0 && i%5==0)
			{
				list.add("FizzBuzz");
			}
			else if(i%3==0 && i%5!=0)
			{
				list.add("Fizz");
			}
			else if(i%5==0 && i%3!=0)
			{
				list.add("Buzz");
			}
			else
			{
				list.add(String.valueOf(i));
			}
		}
		return list;
	}
	
	@Test
	public void test1() 
	{
		Assert.assertEquals(Arrays.asList("1","2","Fizz"), fizzBuzz(3));
	}
	@Test
	public void test2() 
	{
		Assert.assertEquals(Arrays.asList("1","2","Fizz","4","Buzz"), fizzBuzz(5));
	}
	@Test
	public void test3() 
	{
		Assert.assertEquals(Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"), fizzBuzz(15));
	}

}
