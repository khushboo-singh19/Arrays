
public class ReverseRecursivePrint {
	
	Node head;
	
	class Node
	{
		Node next;
		int data;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}

	private void addElement(int data)
	{
		Node node=new Node(data);
		node.next=head;
		head=node;
	}
	
	void printList(Node head)
	{
		Node node=head;
		while(node!=null)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		ReverseRecursivePrint ll=new ReverseRecursivePrint();
		ll.addElement(4);
		ll.addElement(3);
		ll.addElement(2);
		ll.addElement(1);
		ll.printList(ll.head);
		
		ll.reverse(ll.head);
	}

	private void reverse(Node head2) {
		
		
	}
}
