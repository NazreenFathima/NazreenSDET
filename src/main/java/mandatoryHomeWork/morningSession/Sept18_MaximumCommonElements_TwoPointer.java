package mandatoryHomeWork.morningSession;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class Sept18_MaximumCommonElements_TwoPointer 
{
	/*
	 * understood : yes
	 * input : int[], int[]
	 * output : int
	 * 
	 * Pseuodocode : 
	 * 1)Sort the array
	 * 2)initialise pointer1 and pointer 2, count = 0
	 * 3)iterate til pointer1<arr1.length and pointer2<arr2.length
	 * 4)if pointer1<pointer2 -->pointer1++
	 *    else if pointer2>pointer1 --> pointer2++
	 *    else count++, pointer1++, pointer2++
	 * 5)return count
	 * 
	 */
	
	public int maximumCommonElements(int[] arr1, int[] arr2 )
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int pointer1 =0;
		int pointer2 = 0;
		int count =0;
				
		while(pointer1<arr1.length && pointer2<arr2.length)
		{
			if(arr1[pointer1]<arr2[pointer2])
			{
				pointer1++;
			}
			else if(arr1[pointer1] > arr2[pointer2])
			{
				pointer2++;
			}
			else
			{
				count++;
				pointer1++;
				pointer2++;
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
