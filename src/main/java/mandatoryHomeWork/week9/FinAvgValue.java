package mandatoryHomeWork.week9;

public class FinAvgValue 
{
	public double findMaxAverage(int[] nums, int k) 
	{
		double max = Integer.MIN_VALUE;
		for(int i = 0; i <= nums.length-k; i++)
		{
			int sum = nums[i];
			for(int j = i+1; j < i+k; j++)
			{
				sum = sum + nums[j];
			}
			double avg = (double)sum/k;
			if(avg > max )
			{
				max = avg;
			}
		}
		return max;
	}
}
