package week2.day1HW;

public class FindFirstPalindromicStringInTheArray 
{
	public String checkFirstPalindrome(String[] words){

		String str = "";

		for(int i=0;i< words.length;i++){
		str = words[i];
		String rev = "";

		for(int j=str.length()-1;j>=0;j--){
		rev = rev+str.charAt(j);
		}
		if(str.equals(rev)) return str;
		}
		return "";
		}
	
}
