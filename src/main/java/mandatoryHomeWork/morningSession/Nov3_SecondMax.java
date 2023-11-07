package mandatoryHomeWork.morningSession;

import org.junit.Test;
import org.testng.Assert;

public class Nov3_SecondMax 
{
	/*
	 * Given n integers - find second max- solve using O(n) and only one pass (one for loop only)

Numbers can be repeated and starts from 0 nd there wil be atleast one second max - don’t use internal sorting

	 *
	 *understood : yes
	 *input : int[]
	 *output : int
	 *
	 *PSeudocode:
	 *1) initialise max nd secondMax to Integer.MIN_VALUE
	 *2) Iterate through for loop 
	 *3) check if current value is greater than max--> assign max to secondMax nd current value to max
	 *    else current is greater than secondMax nd current value is not equal to max --> assign current value to max
	 *4) return secondMax
	 *
	 *normal approach - sort nd then find second element in the array (but any sort wil take O(n2))
	 */
	
	public int secondMax (int[] nums)
	{
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		
		for (int i = 0; i < nums.length; i++) 
		{
            if (nums[i] > max) 
            {
                secondMax = max;
                max = nums[i];
            } 
            else if (nums[i] > secondMax && nums[i] != max) 
            {
                secondMax = nums[i];
            }
        }

        return secondMax;
	}
	
	@Test
	public void test1()
	{
		int actual = secondMax(new int[] {6,9,10,100,35,1,2,99});
		Assert.assertEquals(99, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = secondMax(new int[] {1,2,3,4,5,6});
		Assert.assertEquals(5, actual);
	}
	
	@Test
	public void test3()
	{
		int actual = secondMax(new int[] {8,7,6,5,4,3,2,1});
		Assert.assertEquals(7, actual);
	} 
	
	@Test
	public void test4()
	{
		int actual = secondMax(new int[] {8,7,7,5,4,3,2,1});
		Assert.assertEquals(7, actual);
	}
	
	@Test
	public void test5()
	{
		int actual = secondMax(new int[] {4,2,3,4,7,5,2});
		Assert.assertEquals(5, actual);
	}

}
