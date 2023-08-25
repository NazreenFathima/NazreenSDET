package mandatoryHomeWork.week2.HW;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Maximum69Number 
{
	public int returnMaximumNumber(int num) {
		//9669
		String str=num+"";
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='6') {
				ch[i]='9';
				break;
			}
		}
		
		return Integer.parseInt(String.copyValueOf(ch));
		
	}
	
	
	
	  public int maximum69Number (int num) {
	        StringBuilder s = new StringBuilder(Integer.toString(num));
	        for(int i=0; i<s.length(); i++){
	            if(s.charAt(i) == '6'){
	                s.setCharAt(i,'9');
	                break;
	            }
	        }
	        return Integer.parseInt(s.toString());
	    }
	  
	  @Test
		public void test() {
			System.out.println(returnMaximumNumber(9669));
			Assert.assertEquals(9969, returnMaximumNumber(9669));
		}
		
		@Test
		public void test1() {
			System.out.println(returnMaximumNumber(9996));
			Assert.assertEquals(9999, returnMaximumNumber(9996));
		}
		
		@Test
		public void test2() {
			System.out.println(returnMaximumNumber(9999));
			Assert.assertEquals(9999, returnMaximumNumber(9999));
		}
		
}
