package week1.day2HW;

import org.junit.Test;

import junit.framework.Assert;

public class SingleNumber 
{
	/*
	 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
	 * 
	 * Input : int[]
	 * Output : int
	 * 
	 * Pseudocode : 
	 * 
	 * 1. Iterate thorugh the int []
	 * 2. Outer for loop - element
	 * 	  initialise count = 0
	 *    Inner for loop - count
	 *    if Arr[i] == Arr[j]  --> count ++
	 * 		if count ==1 --> return Arr[i]
	 */
	
	public int SingleNum (int[] Arr)
	{
		for (int i=0; i<Arr.length; i++)
		{
			int count = 0;
				for (int j=0; j<Arr.length; j++)
				{
					if(Arr[i]==Arr[j])
					{
						count ++;
					}
				}
				if (count==1)
				{
					return Arr[i];
				}
			
		}
		return 0;
	}
	
	@Test
	public void test1()
	{
		int actual = SingleNum (new int[] {2,2,1});
		Assert.assertEquals(1, actual);
				
	}
	
	@Test
	public void test2()
	{
		int actual = SingleNum (new int[] {4,1,2,1,2});
		Assert.assertEquals(4, actual);
				
	}
	
	@Test
	public void test3()
	{
		int actual = SingleNum (new int[] {1});
		Assert.assertEquals(1, actual);
				
	}
}
