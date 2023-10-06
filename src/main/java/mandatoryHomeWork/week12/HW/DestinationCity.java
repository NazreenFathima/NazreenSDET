package mandatoryHomeWork.week12.HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class DestinationCity 
{
	/*
	 * understood : yes
	 * input : List<List<String>>
	 * output : String
	 * 
	 * Pseudocode:
	 * 1) Create a HashSet
	 * 2) Iterate through the foreach loop (get the city1 value nd add in the set
	 * 3) Iterate through the for each loop (get the city2 value nd have it in destination
	 * 4) If the set doesnt contain destination --> return destination
	 *  
	 */

	public String destCityhs(List<List<String>> path) 
	{
		Set<String> cities = new HashSet<>();
		 
		for (List<String> string : path) 
		{
			cities.add(string.get(0));
			
		}
		
		for (List<String> string : path) 
		{
			String dest = string.get(1);
			if(!cities.contains(dest))
			{
				return dest;
			}
		}
		return "";
	}
	
	@Test
	public void test1()
	{
		List<List<String>> test = new ArrayList<>();
		test.add(Arrays.asList("London","New York"));
		test.add(Arrays.asList("New York","Lima"));
		test.add(Arrays.asList("Lima","San Jose"));
		Assert.assertEquals("San Jose", destCityhs(test));
	}
	
	@Test
	public void test2()
	{
		List<List<String>> test = new ArrayList<>();
		test.add(Arrays.asList("A","B"));
		test.add(Arrays.asList("C","D"));
		test.add(Arrays.asList("B","C"));
		Assert.assertEquals("D", destCityhs(test));	
	}
}
