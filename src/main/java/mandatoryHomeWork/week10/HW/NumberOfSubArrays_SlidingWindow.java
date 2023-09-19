package mandatoryHomeWork.week10.HW;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfSubArrays_SlidingWindow 
{
	/*
	 * understood : yes
	 * input : int[], int, int
	 * output : int
	 * 
	 * Pseudocode:
	 * 1) Initialise count, sum nd pointer=0
	 * 2) Add the elements in the first k window using while loop
	 * 3) In another while loop till nums.length
	 *  	if (sum/k>=th) --> count++;
	 *  	if (pointer<nums.length) 
	 *  		sum += nums[pointer]-nums[pointer-k] (Sliding through the next window by adding 
	 *  next element nd subtracting previous element.
	 *      Increment pointer
	 *      
	 *4) finally return count
	 * 
	 */
	
	public int numberOfSubArrays(int[] nums, int k, int th)
	{
		int count = 0;
	    int sum = 0;
	    int pointer =0;
	    
	    while(pointer<k)
	    {
	    	sum+=nums[pointer];
	    	pointer++;
	    }
	    
	    while(pointer<=nums.length)
	    {
	    	if (sum/k >= th)
	    	{
	    		count++;
	    	}
	    	if (pointer<nums.length)
	    	{
	    		sum+= nums[pointer]-nums[pointer-k];
	    	}
	    	pointer++;
	    }
	   
	    return count;
	}
	
	@Test
	public void test1()
	{
		int actual = numberOfSubArrays(new int[] {2,2,2,2,5,5,5,8}, 3,4);
		System.out.println(actual);
		Assert.assertEquals(3, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = numberOfSubArrays(new int[] {11,13,17,23,29,31,7,5,2,3}, 3,5);
		System.out.println(actual);
		Assert.assertEquals(6, actual);
	}
	

}
