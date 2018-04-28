// Alternating split of a given singly Linked List.
// Not Working.

public class LinkedList
{
	Node head;
	
	public class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	public void SplitLinkedList()
	{
		
		Node head1 = head;		
		
		Node head2 = head.next;
		
		// First Linked List.
		Node temp = head1;
		while(temp!= null)
		{
			System.out.print(temp.data + " ");
			//temp.next = temp.next.next;
			if(temp.next!=null&& temp.next.next!=null) temp = temp.next.next;
			else temp=null;
			
		}
		System.out.println();
		// Second Linked List;
		temp = head2;
		while(temp != null)
		{
			System.out.print(temp.data + " ");
			//temp.next = temp.next.next;
			if(temp.next!=null&& temp.next.next!=null) temp = temp.next.next;
			else temp=null;
			
		}
		
	}
	
	public void Push(int new_Data)
	{
		Node new_Node = new Node(new_Data);
		new_Node.next = head;
		head = new_Node;
	}
	
	public void PrintList()
	{
		Node temp = head;
		
		while(temp != null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args)
	{
		LinkedList lList = new LinkedList();
		
		lList.Push(5);
		lList.Push(4);
		lList.Push(3);
		lList.Push(2);
		lList.Push(1);
		
		System.out.println("Original Linked List is : ");
		lList.PrintList();
		
		System.out.println("\nNew Linked List are : ");
		lList.SplitLinkedList();
		System.out.println();
		int[] arr={1,1,2,2,1,1,3,3,1,1,1,4,4,5,5,1,1,6,6};
		int size=arr.length;
		System.out.println(lList.findCandidate(arr,size));
	}
	
	int findCandidate(int a[], int size) 
    {
        int maj_index = 0, count = 1;
        int i;
        for (i = 1; i < size; i++) 
        {
            if (a[maj_index] == a[i])
                count++;
            else
                count--;
            if (count == 0)
            {
                maj_index = i;
                count = 1;
            }
        }
        return a[maj_index];
    }
}