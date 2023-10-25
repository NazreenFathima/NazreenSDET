package mandatoryHomeWork.morningSession;

import org.junit.Test;
import org.testng.Assert;

public class Oct24_RearrangeArray 
{
	/*
	 * https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
	 * 
	 * understood : yes
	 * input : int[]
	 * output : int[]
	 * 
	 * PSeudocode: 
	 * 1) Initialise int[]
	 * 2) initialise p=0 nd n=1;
	 * 3) Iterate thorugh the for loop (til array lenght)
	 * 4) if positive num -->place the number in arr[p] -->> increment by 2places
	 *     else --> place the number in arr[n] --> increment by 2places
	 * 5) return arr
	 */

	public int[] rearrangeArray(int[] nums) 
	{
		int[] arr = new int[nums.length];
        int p = 0;
        int n = 1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                arr[p] = nums[i];
                p += 2;
            }
            else {
                arr[n] = nums[i];
                n += 2;
            }
        }
        return arr;
	}
	
	@Test
	public void test1()
	{
		int[] actual = rearrangeArray(new int[] {3,1,-2,-5,2,-4});
		int[] expected = {3,-2,1,-5,2,-4};
		Assert.assertEquals(actual , expected);
	}
	
	@Test
	public void test2()
	{
		int[] actual = rearrangeArray(new int[] {-1,1});
		int[] expected = {1,-1};
		Assert.assertEquals(actual , expected);
	}
}
