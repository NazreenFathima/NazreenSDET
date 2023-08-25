package mandatoryHomeWork.week2.HW;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CountPrime 
{
	public int countTotalPrime(int n) {
		int count=0;
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		return count;
		
	}
	
	public boolean isPrime(int n) {
	        
	      if(n<=1) {
	    	  return false;
	      }
	      
			for (int i = 2; i*i <=n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
	}
	
	@Test
	public void test() {
		Assert.assertEquals(4, countTotalPrime(10));
	}
}
