package mandatoryHomeWork.week5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SlopeStrightLine 
{
	/*
	 * INPUT array[][]
	 * OUTPUT boolean true or false
	 * 
	 * TEST DATA
	 * 1.{{1,2},{1,3},{1,4},{1,5}}
	 * 2.{{2,1},{3,1},{4,1}}
	 * 3.{{1,1},{2,2},{3,3}}
	 */
	
	public boolean isStraightLine(int[][] coordinates)
	{
		boolean flag=false;
		int xtemp =coordinates[1][0]-coordinates[0][0];
		int ytemp= coordinates[1][1]-coordinates[0][1];
		for(int i=1;i<coordinates.length;i++)
		{
			flag=false;
			if(coordinates[i][0]==coordinates[i-1][0])
				flag=true;
			else if(coordinates[i][1]==coordinates[i-1][1])
				flag =true;
			else if(xtemp==coordinates[i][0]-coordinates[i-1][0]&&ytemp==coordinates[i][1]-coordinates[i-1][1])
				flag = true;
			System.out.println(flag);
		}
		return flag;
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true, isStraightLine(new int [][] {{1,-8},{2,-3},{1,2}}));
	}
}
