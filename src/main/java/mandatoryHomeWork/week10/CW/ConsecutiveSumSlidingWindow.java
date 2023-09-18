package mandatoryHomeWork.week10.CW;

import org.junit.Assert;
import org.junit.Test;

public class ConsecutiveSumSlidingWindow 
{
	 public int slidingWindow(int[] nums, int k)
	 {
	        //1. one pointer should work
	        int max = Integer.MIN_VALUE, pointer = 0, currentSum = 0;
	        // not needed second pointer as this is balanced traversal ,right = k-1;
	        //2. Do the required operation till k index
	        while(pointer < k)
	            currentSum += nums[pointer++];
	        //3. continue the operation for rest of the array
	        while( pointer < nums.length)
	        {
	            max = Math.max(currentSum, max);
	            currentSum += nums[pointer] - nums[pointer-k];
	            pointer++;
	        }
	        return Math.max(currentSum, max);
	    }
	 
	 @Test
		public void test1()
		{
			int actual=slidingWindow(new int[]{1,5,2,3,7,1},3);
			Assert.assertEquals(actual, 12);
			System.out.println(actual);
		}
}
