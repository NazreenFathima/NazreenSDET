package mandatoryHomeWork.week1.HW;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class CharOccurance 
{
	/*
	 * understood : yes
	 * input : String
	 * output : String
	 * 
	 */
	
	public String eachOccur(String str) 
	{
		HashMap<Character,Integer> hm = new HashMap<>();

		for(int i=0;i<str.length();i++) 
		{
			hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0)+1);
		}
		return hm.toString();

	}

	@Test
	public void test1() 
	{
		Assert.assertEquals("{a=2, s=2, c=1, e=2, v=1, g=1, h=1, n=1}", eachOccur("savechanges"));
	}

}
