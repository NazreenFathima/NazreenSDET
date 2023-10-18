package mandatoryHomeWork.week13.HW;

import mandatoryHomeWork.week13.HW.RemoveElements.ListNode;

public class MergeTwoList 
{
	/*
	 * https://leetcode.com/problems/merge-two-sorted-lists/description/
	 * 
	 * understood : yes
	 * input : linkedList
	 * output : linkedList
	 * 
	 * Pseudocode: 
	 * 1) If both list1 and list2 equals null --> return null
	 * 2) Assign list1->current1, list2->current2
	 * 3) Create a newNode --> nd assign to temp
	 * 4) When current1 nd current2 is not equal to null
	 *      if current1 val is less than equal to current2 val
	 *       ASsign current1 to temp.next
	 *       move to next node (current1=current1.next)
	 * 		else
	 * 		  ASsign current2 to temp.next
	 *        move to next node (current2=current2.next)
	 *      Move to next node (temp=temp.next)
	 * 5) if current1 is not equal to null --> assign current2 to temp.next nd viceversa
	 * 6) Return head.next
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

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
	{
		if(list1==null && list2==null)
		{
			return null;
		}
		
		ListNode current1 = list1;
		ListNode current2 = list2;
		ListNode newHead = new ListNode(0);
		ListNode temp = newHead;
		
		while(current1 != null && current2 !=null)
		{
			if(current1.val <= current2.val)
			{
				temp.next = current1;
				current1 = current1.next;
			}
			else
			{
				temp.next = current2;
				current2 = current2.next;
			}
			temp=temp.next;
		}
		
		if(current1==null)
		{
			temp.next = current2;
		}
		else
		{
			temp.next = current1;
		}
		
		return newHead.next;
	}
}
