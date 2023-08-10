package practice.dummy;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumber 
{
	public boolean isPrime (int n)
	{	
		if (n==0 || n==1)
		{
			return true;
		}
		else
			for (int i=2; i<n; i++)
			{
				if (n%i==0)
				return false;
			}
		return true;
		
	}
	@Test
	public void test1()
	{
		boolean actual = isPrime(5);
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test2()
	{
		boolean actual = isPrime(6);
		Assert.assertEquals(false, actual);
	}
	
	@Test
	public void test3()
	{
		boolean actual = isPrime(1);
		Assert.assertEquals(true, actual);
	}
}
