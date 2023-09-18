package mandatoryHomeWork.morningSession;

import org.junit.Test;
import org.testng.Assert;

public class Sept18_MaximumCommonElements 
{
	/*
	 * understood : yes
	 * input : int[], int[]
	 * output: int
	 * 
	 * Pseudocode :
	 * 1) Iterate thorugh the for loop (for (int i=0; i<arr1.length; i++) 
	 * 2) Iterate through the inner for loop ( for (int j=0; j<arr2.length; j++)
	 * 3) if bothe elements are same --> count++
	 * 4) Return count
	 */
	
	public int maximumCommonElements(int[] arr1, int[] arr2 )
	{	
		int count=0;
		for (int i=0; i<arr1.length; i++)
		{
			for (int j=0; j<arr2.length; j++)
			{
				if (arr1[i]==arr2[j])
				{
					count++;
				}
			}
		}
		return count;
	}
	
	@Test
	public void test1()
	{
		int actual = maximumCommonElements (new int[] {1,2,3,4}, new int[] {1,3,4,5});
		Assert.assertEquals(3, actual);
	}
}
