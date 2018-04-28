
public class ReverseRecurse {
	static Node head;
	static class Node
	{
		Node next;		
		int data;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	void reverse(Node node)
	{
		if(node.next==null) head=node;
		if(node.next!=null) reverse(node.next);
		Node node2;
		if(node.next!=null)
		{
		node2=node.next;
		node2.next=node;
		node.next=null;
		}			
	}
	
	void printList(Node node)
	{
		while(node!=null)
		{
			System.out.print(node.data +" ");
			node=node.next;
		}
	}
	
	public static void main(String args[])
	{
		ReverseRecurse rr=new ReverseRecurse();
		head=new Node(1);
		head.next= new Node(2);
		head.next.next= new Node(3);
		head.next.next.next= new Node(4);
		head.next.next.next.next= new Node(5);
		rr.reverse(head);
		rr.printList(head);
	}

}
