package mandatoryHomeWork.week16.HW;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class RingsAndRods 
{

	/*
	 * https://leetcode.com/problems/rings-and-rods/description/
	 * 
	 * understood : yes
	 * input : String
	 * output : int
	 * 
	 * Pseudocode: 
	 * 1) create three hashset for each colour
	 * 2) Iterate through the for loop for every alternate char in the String
	 * 3) when R --> add the corresponding number to red
	 * 		   G --> add the corresponding number to green
	 * 		   B --> add the corresponding number to blue
	 * 4) Initialise count =0
	 * 5) Iterate through another for loop when red, green nd blue contains same number --> count++
	 * 6) Return count
	 */

	public int countPoints(String rings) 
	{
		Set<Integer> red = new HashSet();
		Set<Integer> green = new HashSet();
		Set<Integer> blue = new HashSet();
		for(int i = 0; i < rings.length(); i += 2) 
		{
			if(rings.charAt(i) == 'R') 
			{
				red.add(rings.charAt(i + 1) - '0');
			}
			if(rings.charAt(i) == 'G') 
			{
				green.add(rings.charAt(i + 1) - '0');
			}
			if(rings.charAt(i) == 'B') 
			{
				blue.add(rings.charAt(i + 1) - '0');
			}
		}
		int count = 0;
		for(int i = 0; i <= 9; i++) 
		{
			if(red.contains(i) && green.contains(i) && blue.contains(i)) 
			{
				count++;
			}
		}
		return count;
	}

	@Test
	public void test1() 
	{
		int actual = countPoints("B0B6G0R6R0R6G9");
		Assert.assertEquals(1, actual );
	}
	
	@Test
	public void test2() 
	{
		int actual = countPoints("B0R0G0R9R0B0G0");
		Assert.assertEquals(1, actual );
	}
	
	@Test
	public void test3() 
	{
		int actual = countPoints("G4");
		Assert.assertEquals(0, actual );
	}
	
	
}
