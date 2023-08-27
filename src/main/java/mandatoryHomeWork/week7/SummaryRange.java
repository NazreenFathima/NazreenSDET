package mandatoryHomeWork.week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SummaryRange 
{
	/*
	 * Understood the prob : YES
	 * input: List<String>
	 * output : int[]
	 * 
	 * Pseudocode:
	 * 1. Iterate a while loop in a for loop to check arr[i]+1 equals arr[i+1],if yes increment i by 1
	 * 2. Assign start =arr[i] in the for loop above while
	 * 3. chekc if start and current value are !=, if yes, add the start and end to list 
	 * 4. if not add the start to list
	 * 5. Return the value
	 */
	
	public List<String> summaryRange(int[] nums){
		List<String> list = new ArrayList<>();

		for(int i=0;i<nums.length;i++){
			int start =nums[i];

			while(i+1<nums.length&&nums[i]+1==nums[i+1]){
				i++;
			}

			if(start!=nums[i]){
				list.add(""+start+"->"+nums[i]);
			}

			else{
				list.add(""+start);
			}
		}
		return list;
	}
	
	@Test
	public void test1() {
		List<String> nums1 = Arrays.asList("0->2","4->5","7");
		Assert.assertEquals(nums1, summaryRange(new int[] {0,1,2,4,5,7}));
	}

	@Test
	public void test2() {
		List<String> nums2 = Arrays.asList("0","2->4","6","8->9");
		Assert.assertEquals(nums2, summaryRange(new int[] {0,2,3,4,6,8,9}));
	}
}
