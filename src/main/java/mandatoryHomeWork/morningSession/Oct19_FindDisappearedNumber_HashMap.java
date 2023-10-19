package mandatoryHomeWork.morningSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class Oct19_FindDisappearedNumber_HashMap 
{
	/*
	 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
	 * 
	 * understood : yes
	 * input : int[]
	 * output : List<Integer>
	 * 
	 * PSeudocode: 
	 * 1) CReate a hashmap nd ArrayLsit
	 * 2) Add the int array in hashmap key-number, value-true/false
	 * 3) Iterate through the for loop from 1 till array length
	 * 4) if hashMap doesnt contain the num -- > add to arrayList
	 * 5) return arrayList;
	 */

	public List<Integer> findDisappearedNumbers(int[] nums) 
	{
		Map<Integer, Boolean> hm = new HashMap<>();
		ArrayList<Integer> al = new ArrayList<>();

		for(int i=0; i<nums.length; i++)
		{
			int num = nums[i];
			hm.put(num, true);
		}

		for(int i=1; i<=nums.length; i++)
		{
			if(!hm.containsKey(i))
			{
				al.add(i);
			}
		}

		return al;
	}


	@Test
	public void test1()
	{
		Assert.assertEquals(Arrays.asList(5,6), findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1}));
	}

	@Test
	public void test2()
	{
		Assert.assertEquals(Arrays.asList(2), findDisappearedNumbers(new int[] {1,1}));
	}
}
