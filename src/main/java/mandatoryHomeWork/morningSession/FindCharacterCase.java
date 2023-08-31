package mandatoryHomeWork.morningSession;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindCharacterCase 
{
	/*	 
	 * 
	 * * Understood : Yes	 
	 * * Input :char 	 
	 * * Output : int	 
	 * *	 
	 * * Pesudoecode: 	 
	 * * 1) get the character	 
	 * * 2) if isUpperCase() - return 1	 
	 * * else if isLowerCase() - return 0	 
	 * * else return 0	 
	 * * 	 
	 * * 	 
	 * */		
	
	public int findCharacterCasing (char ch)	
	{		
		if (Character.isUpperCase(ch)) 		
		{ 
			return 1; 
		} 
		else if (Character.isLowerCase(ch)) 
		{ 
			return 0; 
		} else 
		{ 
			return -1; 
		} 	
		}		
	
	@Test	
	public void test1()	
	{		
		int actual = findCharacterCasing ('v');		
		Assert.assertEquals(0, actual);	
	}		
	
	@Test	public void test2()	
	{		
		int actual = findCharacterCasing ('V');		
		Assert.assertEquals(1, actual);	
	}		
	
	@Test	
	public void test3()	
	{		
		int actual = findCharacterCasing ('$');		
		Assert.assertEquals(-1, actual);	
	}
}
