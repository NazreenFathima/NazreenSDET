package mandatoryHomeWork.week13.HW;

import mandatoryHomeWork.week13.HW.DeleteDuplicate.ListNode;

public class RotateList 
{
	/*
	 * https://leetcode.com/problems/rotate-list/
	 * 
	 * understood : yes
	 * input : LinkedList
	 * output : LinkedList
	 * 
	 * Pseudocode: 
	 * 1) calculate the  size of linked list
	 * 2) pointer curr to head of LL
	 * 3) move curr til k > 0 and make head to curr.next and curr.next = null;
	 * 4) assign head nd null nd return head
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

	public ListNode rotateRight(ListNode head, int k) 
	{
		if(head==null || head.next ==null || k==0 ) return head;

		ListNode curr = head;
  
		int size = 1;
		while(curr.next!=null){
			size++;
			curr=curr.next;	
		}

		curr.next = head;
		k = k % size;
		k = size - k;
  
		while(k>0){
			curr=curr.next;
			k--;
		}

		head=curr.next;
		curr.next = null;

		return head;
	}
}
