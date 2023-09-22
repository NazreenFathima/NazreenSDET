package mandatoryHomeWork.week10.HW;

import org.junit.Assert;
import org.junit.Test;

public class SortArrayByParityII 
{
	/*
	 * understood : yes
	 * input : int[]
	 * output : int[]
	 * 
	 * Pseudocode: 
	 * 1) Initialise even and odd pointer as 0 nd 1
	 * 2  Create a new array of length - given array
	 * 3) iterate through the for loop
	 * 4) if even -> place the number in even position in the new array nd incrreament the evenPointer by2
	 * 5) else --> place the number in odd position in the new array nd increament the oddPointer by2
	 * 6) return result
	 */
	
	public int[] sortArrayByParityII(int[] nums)
	{
        int evenPointer=0;
        int oddPointer=1;
        int[] result = new int[nums.length];
        
        for (int i=0; i<nums.length; i++)
        {
        	if (nums[i]%2==0)
        	{
        		result[evenPointer] = nums[i];
        		evenPointer+=2;
        	}
        	else
        	{
        		result[oddPointer] = nums[i];
        		oddPointer+=2;
        	}
        }
        return result;
    }
	@Test
	public void test1() 
	{
		int[] actual=sortArrayByParityII (new int[]{4,2,5,7});
		int[] expected = {4,5,2,7};
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void test2() 
	{
		int[] actual=sortArrayByParityII (new int[]{0});
		int[] expected = {0};
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void test3() 
	{
		int[] actual=sortArrayByParityII (new int[]{2,3});
		int[] expected = {2,3};
		Assert.assertArrayEquals(expected, actual);
	}
	
}
