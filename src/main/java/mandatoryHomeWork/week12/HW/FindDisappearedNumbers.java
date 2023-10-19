package mandatoryHomeWork.week12.HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class FindDisappearedNumbers 
{
	/*
	 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
	 * 
	 * understood : yes
	 * input : int[]
	 * output : List<Integer>
	 * 
	 * PSeudocode: 
	 * 1) CReate a hashset nd ArrayLsit
	 * 2) Add the int array in hashset
	 * 3) Iterate through the for loop from 1 till array length
	 * 4) if hashSet doesnt contain the num -- > add to arrayList
	 * 5) return arrayList;
	 * 
	 */
	
	public List<Integer> findDisappearedNumbers(int[] nums) 
	{
		HashSet<Integer> hs = new HashSet<>();
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0; i<nums.length; i++)
		{
			int num = nums[i];
			hs.add(num);
		}
		
		for(int i=1; i<=nums.length; i++)
		{
			if(!hs.contains(i))
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
