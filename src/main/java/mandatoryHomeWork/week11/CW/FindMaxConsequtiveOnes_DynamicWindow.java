package mandatoryHomeWork.week11.CW;

import org.junit.Test;
import org.testng.Assert;

public class FindMaxConsequtiveOnes_DynamicWindow 
{
	public int findMaxConsecutiveOnes(int[] nums)
	{	
		int left=0;
		int right=0;
		int maxCount=0;
		while(right<nums.length)
		{
			if(nums[right]==1)
			{
				maxCount = Math.max(maxCount, right-left-1);
			}
			else
			{
				left=right+1;
			}
			right++;
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
