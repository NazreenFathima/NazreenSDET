package mandatoryHomeWork.week10.CW;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MinimumPossibleDifference 
{
	/*
	 * understood : yes
	 * input : int[], int
	 * output : int
	 * 
	 * Pseudocode:
	 * 1)Initialise minDiff =Integer.MAX_VALUE
	 * 2)Sort the array
	 * 3)for loop (i=0; i<=n-k; i++)
	 * 4)currentDiff=num[i+k-1]-num[i]
	 * 5)minDiff=Math.min(minDiff,currentDiff )
	 * 6) return minDiff
	 *
	 */
	
	public int minDifference(int[] nums, int k) {
        if (k >= nums.length) 
        {
            return 0;
        }
        
        Arrays.sort(nums); 
        int n = nums.length;
        int minDifference = Integer.MAX_VALUE;
        
        for (int i = 0; i <= n - k; i++) {
            int windowSize = k - 1;
            int currentDifference = nums[i + windowSize] - nums[i];
            minDifference = Math.min(minDifference, currentDifference);
        }

        return minDifference;
	}
	 @Test
		public void test1()
		{
			int actual=minDifference(new int[]{9,4,1,7},2);
			Assert.assertEquals(actual, 2);
			System.out.println(actual);
		}
	
}
