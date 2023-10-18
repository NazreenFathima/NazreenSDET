package mandatoryHomeWork.week13.HW;

import mandatoryHomeWork.week13.HW.MiddleNode.ListNode;

public class DeleteDuplicate 
{
	/*
	 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
	 * 
	 * understood: yes
	 * input : LinkedList
	 * output : LinkedList
	 * 
	 * Pseudocode:
	 * 1) Assign head to current
	 * 2) when current nd current.next is not equal to null
	 * 		current.val==current.next.val -->current.next=current.next.next
	 *      current= current.next
	 * 3) Return head
	 * 
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

	public ListNode deleteDuplicates(ListNode head) 
	{
		ListNode current = head;
		while(current!=null && current.next!=null)
		{
			if(current.val==current.next.val)
			{
				current.next=current.next.next;
			}
			else
			{
				current= current.next;
			}
		}
		return head;
	}
}
