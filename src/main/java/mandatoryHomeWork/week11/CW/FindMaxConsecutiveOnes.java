package mandatoryHomeWork.week11.CW;

import org.junit.Test;
import org.testng.Assert;

public class FindMaxConsecutiveOnes 
{
	/* https://leetcode.com/problems/max-consecutive-ones/description/
	 * 
	 * understood : 
	 */
	
	public int findMaxConsecutiveOnes(int[] nums)
	{	
		int maxCount=0;
		int currentCount =0;
		int left=0;
		int right=0;
		
		while(right<nums.length)
		{
			if (nums[right] ==1)
			{
				currentCount++;
				right++;
			}
			else 
			{
				currentCount =0;
				left=right+1;
				right++;
			}
			maxCount = Math.max(maxCount, currentCount);
		}
		return maxCount;
	}
	
	@Test
	public void test1()
	{
		int actual = findMaxConsecutiveOnes(new int[] {1,1,0,1,1,1});
		Assert.assertEquals(3, actual);
	}
}
