package mandatoryHomeWork.week13.HW;

public class SingleLinkedListImp 
{
	public ListNode head;
	public ListNode tail;
	private int size;

	//====================================== AddFirst =============================================

	public void addFirst(int data)
	{
		ListNode newNode = new ListNode();
		newNode.val = data;
		newNode.next = head;
		head= newNode;

		size++;
	}

	//======================================= Add Last =============================================

	public  void addLast(int data) 
	{
		ListNode newNode = new ListNode();
		newNode.val = data;
		newNode.next = null;

		if(head == null)
		{
			head= newNode;
		}
		else
		{
			ListNode lastNode = head;
			while(lastNode.next!=null)
			{
				lastNode = lastNode.next;
			}
			lastNode.next = newNode;
		}
		size++;
	}

	//=======================================Adding the nodes=====================================

	// Add Data with Input array
	public ListNode addNode(int[] datas) 
	{
		for (int data : datas) 
		{
			addLast(data);
		}
		return head;
	}

	//================================Getting size withOut loop====================================

	public int getSize() 
	{
		return size;
	}

	//=========================================Display============================================

	public void displayNodes() 
	{
		ListNode current = head;
		while (current != null) 
		{
			System.out.print(current.val + " ");
			current = current.next;
		}
		System.out.println();
	}

	//================================== Display Nodes===============================================

	public void displayNodes(ListNode node) 
	{
		ListNode current=node;
		while(current!=null) 
		{
			System.out.print(current.val+" ");
			current=current.next;
		}
		System.out.println();
	}

	//======================================== Delete Node==========================================

	public void delete(int dataToRemove)
	{
		if(head.val == dataToRemove )
		{
			head = head.next;
		}
		else
		{
			ListNode temp = head;
			while(temp.next!=null)
			{
				if(temp.next.val == dataToRemove)
				{
					temp.next= temp.next.next;
					break;
				}
				else
					temp=temp.next;

			}
		}
	}

	//======================================== Search ==============================================

	public boolean search(int searchKey)
	{
		ListNode temp= head;
		while(temp.next!=null)
		{
			if(temp.val == searchKey)
			{
				return true;
			}
			temp=temp.next;
		}
		return false;
	}


	//=========================================Main Method==========================================

	public static void main(String[] args)
	{
		SingleLinkedListImp obj1 = new SingleLinkedListImp();

		//1. Adding the Nodes
		obj1.addLast(10);
		obj1.addLast(20);
		obj1.addLast(30);
		obj1.displayNodes();
		int size = obj1.getSize();
		System.out.println("Size of the SLL : " + size);
	}
}
