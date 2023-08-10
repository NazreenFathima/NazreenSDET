package week1.day2HW;

import org.junit.Test;

import junit.framework.Assert;

public class CandyProblem 
{
	/*
	 * Input : int[]
	 * Output : int
	 * 
	 * Constraints : NO DS
	 * 
	 * Psedocode : 
	 * 1)
	 * 2)
	 * 3)
	 * 4)
	 * 
	 */
	
	int flag =0;
    int counter = 0;
	public int distributeCandies(int[] candyType) 
	{
        for (int i = 0; i < candyType.length; i++) 
         { //i=0 1
            flag=0;
            for (int j = i+1; j < candyType.length; j++) 
            { //j=1 1
                if(candyType[i]==candyType[j])
                {
                    flag=1;
                    break;
                }
            }
            if(flag!=1) {
                counter++;
            }
        }
        if(candyType.length/2 > counter)
        return counter;
        else
        return candyType.length/2;
    }
	
	@Test
	public void test1()
	{
		int actual = distributeCandies (new int[] {1,1,2,2,3,3});
		Assert.assertEquals(3, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = distributeCandies (new int[] {1,1,2,3});
		Assert.assertEquals(2, actual);
	}
	
	@Test
	public void test3()
	{
		int actual = distributeCandies (new int[] {6,6,6,6});
		Assert.assertEquals(1, actual);
	}
	
	
}
