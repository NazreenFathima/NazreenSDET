package mandatoryHomeWork.week10.CW;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MoveAllZeroes 
{
	public int[] moveZeroes(int[] nums) 
	{
		for(int i=0;i< nums.length;i++)
		{
			for(int j=i+1;j< nums.length;j++)
			{
				if(nums[i] == 0)
				{
					//int temp = 0;
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return nums;
	}

	@Test
	public void test1()
	{
	int[] actual = moveZeroes(new int[] {0,1,0,3,12});
	int[] expected = {1,3,12,0,0};
	System.out.println(Arrays.toString(actual));
	Assert.assertArrayEquals(expected, actual);
}
}
