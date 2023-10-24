package mandatoryHomeWork.week15.HW;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CanPlaceFlower 
{
	/*
	 * https://leetcode.com/problems/can-place-flowers/description/
	 * 
	 * understood : yes
	 * input : int[], int
	 * output : boolean
	 * 
	 * Pseudocode:
	 * 1) Iterate the array till last element
	 * 2) Check if the element is zero
	 * 3) If yes take the n-1 element in previous and n+1 element in next
	 * 4) To include last and first element --> set 0 to the previous element of 1st & next element of last
	 * 5) Check if previous and next equals to 0
	 * 6) if yes, plant 1 in the index and increment count
	 * 7) return count==n
	 */

	public boolean canPlaceFlowers(int[] flowerbed, int n) 
	{
		int count=0;
		for (int i=0; i<flowerbed.length && count<n; i++)
		{
			int previous, next;
			if(flowerbed[i]==0)
			{
				if(i==0)
				{
					previous=0;
				}
				else
				{
					previous=flowerbed[i-1];
				}
				
				if(i==flowerbed.length-1)
				{
					next=0;
				}
				else
				{
					next=flowerbed[i+1];
				}
				if(previous==0 && next==0)
				{
					flowerbed[i]=1;
					count++;
				}
			}
		}
		return count==n;
	}
	
	@Test
	public void test1() 
	{
		Assert.assertEquals(true, canPlaceFlowers(new int[] {1,0,0,0,1},1));
	}

	@Test
	public void test2() 
	{
		Assert.assertEquals(true, canPlaceFlowers(new int[] {1,0,1,0,0},1));
	}
	
	@Test
	public void test3() 
	{
		Assert.assertEquals(true, canPlaceFlowers(new int[] {0,0,0,1},1));
	}
	
}
