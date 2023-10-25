package mandatoryHomeWork.morningSession;

import org.junit.Test;
import org.testng.Assert;

public class Oct25_GoatLatin 
{
	/*
	 * https://leetcode.com/problems/goat-latin/description/
	 * 
	 * understood : yes
	 * input : String
	 * output : String
	 * 
	 * PSeudocode: 
	 * 1) remove the space nd add to array
	 * 3) iterate through for each loop
	 * 4) if first alp contains vowel --> add word to SB , add ma
	 *     else --> add substring(1)--> add first alphabet, --> add ma
	 *      
	 *       iterate through the for loop with count
	 *       add a 
	 *       then incremnet count and add space
	 *       
	 * 5) return sb.toString
	 */

	
	public String toGoatLatin(String sentence) 
	{
		String[] arr = sentence.split(" ");
		StringBuffer sb = new StringBuffer();
		int count=1; 
		
		for (String string : arr) 
		{
			char ch = string.charAt(0);
			if(ch=='a' || ch== 'e' || ch=='i' || ch=='o' || ch=='u' ||
					ch=='A' || ch== 'E' || ch=='I' || ch=='O' || ch=='U')
			{
				sb.append(string).append("ma");
			}
			else
			{
				sb.append(string.substring(1)).append(string.substring(0, 1)).append("ma");
			}
			
			for(int i=0; i<count; i++)
			{
				sb.append("a");
			}
			count++;
			sb.append(" ");
		}
		
		sb.deleteCharAt(sb.length()-1);
		return sb.toString();
	}
	
	@Test
	public void test1()
	{
		String actual = toGoatLatin("I speak Goat Latin");
		Assert.assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", actual);
	}
	
	@Test
	public void test2()
	{
		String actual = toGoatLatin("The quick brown fox jumped over the lazy dog");
		Assert.assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa", actual);
	}
}
