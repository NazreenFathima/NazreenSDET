package mandatoryHomeWork.week7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FLowerInsertion 
{
	/*
	 * Understood the prob :Yes
	 * input : int[] and int
	 * output : boolean
	 * 
	 * Pseudocode:
	 * 1) Iterate the array till last element
	 * 2) Check if the element is zero
	 * 3) If yes take the n-1 element in previous and n+1 element in next
	 * 4) To include last and first element use ternary operator to set 0 to the previous element of 1st & next element of last
	 * 5) Check if previous and next equals to 0
	 * 6) if yes, plant 1 in the index and increment count
	 * 7) return count==n
	 */
	
	public boolean flowerInsertion(int[] flowerBed, int n)
	{
		int count=0;
		for (int i=0; i<flowerBed.length && count<n; i++) 
		{
			int next = (i==flowerBed.length-1)?0:flowerBed[i+1];
			int previous = (i==0)?0:flowerBed[i-1];
			if(previous==0&&next==0) 
			{
				flowerBed[i]=1;
				count++;
			}
		}
		return count==n;
	}
	
	@Test
	public void test1() 
	{
		Assert.assertEquals(true, flowerInsertion(new int[] {1,0,0,0,1},1));
	}

	@Test
	public void test2() 
	{
		Assert.assertEquals(true, flowerInsertion(new int[] {1,0,1,0,0},1));
	}
}
