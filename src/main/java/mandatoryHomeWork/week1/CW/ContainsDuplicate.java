package mandatoryHomeWork.week1.CW;

import org.junit.Test;

import junit.framework.Assert;

public class ContainsDuplicate 
{
	/*
	 * Given an integer array nums, return true if any value appears at least twice in the array, 
	 * and return false if every element is distinct.
	 * 
	 * Input : int[]
	 * Output : Boolean
	 * Constraints : No Constraints
	 * 
	 * Test Data Set : 
	 * Positive : nums = [1,2,3,1]
	 * Negative : nums = [1,2,3,4]
	 * Edge : nums = []
	 * 
	 * Psedocode : 
	 * 1. Iterate through int[]
	 * 2. With a nested for loop for iterating through the remaining elements.
	 * 3. Compare the item in position i with j
	 * 4. If any 2 values are equal -
	 *        then return true
	 *        else return false
	 */

	 public boolean isDuplicate (int[] nums)
	 {		
		 for (int i=0; i<nums.length; i++)
		 {
			 for (int j=i+1; j<nums.length; j++)
			 {
				 if (nums[i]==nums[j])
				 {
					 return true;
				 }
			 }
		 }
		 return false;
	 }
	 
	
	@Test
	 public void test1()
	 {
		 boolean duplicate = isDuplicate(new int[] {1,2,3,1});
		 Assert.assertEquals(true, duplicate);
	 }
	
	@Test
	 public void test2()
	 {
		 boolean duplicate = isDuplicate(new int[] {1,2,3,4});
		 Assert.assertEquals(false, duplicate);
	 }
	
	@Test
	 public void test3()
	 {
		 boolean duplicate = isDuplicate(new int[] {});
		 Assert.assertEquals(false, duplicate);
	 }
	 
}
