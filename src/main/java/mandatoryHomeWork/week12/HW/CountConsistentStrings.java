package mandatoryHomeWork.week12.HW;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class CountConsistentStrings 
{
	/*
	 * understood : yes
	 * input : String, String[]
	 * output : int
	 * 
	 * Pseudocode:
	 * 1) Create HashSet
	 * 2) Initialise total equals to String[] length
	 * 3) Iterate through the for loop and add in the set
	 * 4) Iterate through another for loop nd if it contains in the set --> total decrement--> break;
	 * 5) return total
	 * 
	 */

	public int countConsistentStrings(String allowed, String[] words) 
	{
		Set<Character> hset = new HashSet<>();
		int total =words.length;

		for(int i=0; i<allowed.length(); i++)
		{
			hset.add(allowed.charAt(i));
		}
		
		for (int i=0; i<words.length; i++)
		{
			String str = words[i];
			for (int j=0; j<str.length(); j++)
			{
				if (!hset.contains(str.charAt(j)))
				{
					total--;
					break;
				}
			}
			
		}
		return total;
		
	}


		@Test
		public void test1()
		{
			int actual = countConsistentStrings("ab", new String[] {"ad","bd","aaab","baa","badab"});
			Assert.assertEquals(2, actual);
		}
		
		@Test
		public void test2()
		{
			int actual = countConsistentStrings("abc", new String[] {"a","b","c","ab","ac","bc","abc"});
			Assert.assertEquals(2, actual);
		}
		
		@Test
		public void test3()
		{
			int actual = countConsistentStrings("cad", new String[] {"cc","acd","b","ba","bac","bad","ac","d"});
			Assert.assertEquals(2, actual);
		}
	}
