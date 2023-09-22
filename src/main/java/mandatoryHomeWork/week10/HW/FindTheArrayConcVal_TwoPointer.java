package mandatoryHomeWork.week10.HW;

import org.junit.Assert;
import org.junit.Test;

public class FindTheArrayConcVal_TwoPointer 
{
	/*
	 * understood : yes
	 * input : int[]
	 * output : long
	 * 
	 * Pseudocode : 
	 * 1) Initialise two pointers - one at left and another at right
	 * 2) Initialise result=0
	 * 3) iterate through while loop (left<right)
	 * 4) inside while loop concatenate both i and j and have it in s
	 * 5) convert string to int using parseInt and add to result
	 * 6) left++, right--
	 * 7) when the length of array is odd --> lenght/2 --> add to result
	 * 8) return result
	 */
	
	public long findTheArrayConcVal(int[] nums)
	{
		int left=0;
		int right=nums.length-1;
		long result =0;
		String s = "";
		while(left<right)
		{
			s=String.valueOf(nums[left])+String.valueOf(nums[right]);
			result+=Integer.parseInt(s);
			left++;
			right--;
		}
		if(nums.length%2!=0)
		{
			result+= nums[nums.length/2];
		}

		return result;
	}
	
	@Test
	public void test1() 
	{
		long actual=findTheArrayConcVal (new int[] {7,52,2,4});
		Assert.assertEquals(596, actual);
	}
	@Test
	public void test2() 
	{
		long actual=findTheArrayConcVal (new int[] {5,14,13,8,12});
		Assert.assertEquals(673, actual);
	}
}
