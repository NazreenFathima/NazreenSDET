package mandatoryHomeWork.week13.HW;

import mandatoryHomeWork.week13.HW.MergeTwoList.ListNode;

public class MiddleNode 
{
	/*
	 * https://leetcode.com/problems/middle-of-the-linked-list/description/
	 * 
	 * understood : yes
	 * input : LinkedList
	 * output : LinkedList
	 * 
	 * Pseudocode: 
	 * 1) If head equals null -> return null
	 * 2) Assign head to current and count=0
	 * 3) Iterate in while loop (current!=null) 
	 *  	Increment count
	 *  	move to next node (current=current.next)
	 * 4) Again Assign head to current
	 * 5) middle=count/2
	 * 6) Iterate through for loop till the middle -->move to next node (current=current.next)
	 * 7) Return current
	 */

	public class ListNode
	{
		int val;
		ListNode next;

		ListNode(int val)
		{
			this.val=val;
		}

		ListNode(int val, ListNode next)
		{
			this.val=val;
			this.next=next;
		}
	}

	public ListNode middleNode(ListNode head) 
	{
		if(head==null)
		{
			return null;
		}
		
		ListNode current = head;
		int count = 0;
		
		while(current!=null)
		{
			count++;
			current = current.next;
		}
		
		current = head;
		int middle = count/2;
		
		for(int i=0; i<middle; i++)
		{
			current = current.next;
		}
		
		return current;
	}
}
