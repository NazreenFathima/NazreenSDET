package mandatoryHomeWork.week13.HW;

import org.junit.Test;

import linkedlist.LinkedList;
import mandatoryHomeWork.week13.CW.Reverse.ListNode;

public class RemoveElements 
{
	/*
	 * https://leetcode.com/problems/remove-linked-list-elements/
	 * 
	 * understood : yes
	 * input : LinkedList
	 * output : linkedlist
	 * 
	 * Pseudocode: 
	 * 1) if head equals null - return null
	 * 2) if head not equal to null nd head val equal val --> assign next node to head
	 * 3) Assign head to temp
	 * 	  if temp not equal to null and temp next is not equal to null
	 * 		if(temp.next.val==val)
			{
				temp.next = temp.next.next;
			}
			else
			{
				temp = temp.next;
			}
	 * 4) Return head;
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
	

	public ListNode removeElements(ListNode head, int val)
	{
		ListNode temp = head;
		if (head==null)
		{
			return null;
		}

		if (head!=null && head.val==val)
		{
			head = head.next;
		}

		while (temp!=null & temp.next!=null)
		{
			if(temp.next.val==val)
			{
				temp.next = temp.next.next;
			}
			else
			{
				temp = temp.next;
			}
		}
		return head;
	}
	
}
