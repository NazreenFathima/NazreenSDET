package mandatoryHomeWork.week9;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfLines 
{
	/*
	 * understood : yes
	 * input : int[] , String
	 * output : int[]
	 *
	 * 
	 */
	
	public int[] numberOfLines(int[] widths, String s){
		int sum=0;
		int count=1;
		for (int i=0;i<s.length();i++){
			int c= s.charAt(i)-97;
			sum+=widths[c];
			if(sum==100&&i!=s.length()-1){
				sum=0;
				count++;
			}
			else if(sum>100){
				sum=widths[c];
				count++;
			}
		}
		return new int[] {count,sum};
}
	
	@Test
	public void test1()
	{
		int[] actual=numberOfLines(new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "bbbcccdddaaa");
		int[] expected = {2,4};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void test2()
	{
		int[] actual=numberOfLines(new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "abcdefghijklmnopqrstuvwxyz");
		int[] expected = {3,60};
		Assert.assertArrayEquals(expected, actual);
	}
}
