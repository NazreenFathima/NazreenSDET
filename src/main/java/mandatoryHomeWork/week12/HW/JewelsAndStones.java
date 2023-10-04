package mandatoryHomeWork.week12.HW;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

import dailyLearnings.ForEachLoop;

public class JewelsAndStones 
{
	/*
	 * understood : yes
	 * input : String, String
	 * output: int
	 * 
	 * Pseudocode : 
	 * 1) Create a hashSet(character)
	 * 2) Initialise count=0;
	 * 3) Iterate through the for loop (for jewels) and add to the set
	 * 4) Again Iterate through the for loop (for stones) if the set contains the char --> Increment the count
	 * 5) return count;
	 * 
	 */

	public int numJewelsInStones(String jewels, String stones) 
	{
		Set<Character> hs = new HashSet<>();
		int count=0;
		for(int i=0; i<jewels.length(); i++)
		{
			hs.add(jewels.charAt(i));
		}
		
		for (int i=0; i<stones.length(); i++)
		{
			if (hs.contains(stones.charAt(i)))
			{
				count++;
			}
		}
		
		return count;
	}
	
	@Test
	public void test1()
	{
		int actual = numJewelsInStones("aA","aAAbbbb");
		Assert.assertEquals(3, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = numJewelsInStones("z","ZZ");
		Assert.assertEquals(3, actual);
	}
	
}
