package mandatoryHomeWork.week2.HW;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JewelStone 
{
/*
 * Understood the prob : YES
 * input :String
 * output : int
 * 
 * Pseudocode : 
 * 1)traverse each stone in stones string
 * 2)check if the stone is present in jewel and increment counter
 * 3)retrun counter
 *
 */
	public int numJewelsInStones(String jewels, String stones) {
        int counter=0;
        for(int i=0;i<stones.length();i++)
        {
            if(jewels.contains(stones.charAt(i)+""))
             counter++;
        }
        return counter;
    }
	
	@Test
	public void test1()
	{
		Assert.assertEquals(3, numJewelsInStones("aA", "aAAbbbBB"));
	}

	@Test
	public void test2()
	{
		Assert.assertEquals(0, numJewelsInStones("z", "ZZ"));
	}
}
