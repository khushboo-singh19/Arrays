
public class LastSword {
private class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data=d;
		next=null;
	}
}
Node createSwords(int n)
{
	Node head = new Node(1);
	//Node node = head;
	//node.next = new Node(2);	
	//node=head.next;
	//node.next = new Node(3);
	Node node1=head;
	for(int i=2; i<=n; i++)
	{
	  node1.next = new Node(i);	  
	  node1=node1.next;
	}
	node1.next=head;
	return head;
}

Node getLastSword(Node head)
{
	Node node = head;
	Node next2;
	while(node.next!=node)
	{
// commented lines and uncommented lines are two approaches
//		next2=node.next.next;
//		node.next= next2;
//		node=next2;
		node.next=node.next.next;
		node=node.next;
	}
	return node;
}
void printList(Node head)
{	
	System.out.print(head.data+ " ");
	Node node = head.next;
	while(node!=head)
	{
		System.out.print(node.data+ " ");
		node=node.next;
	}
}

public static void main(String args[])
{
	LastSword sword=new LastSword();
	Node head =sword.createSwords(100);
	sword.printList(head);
	Node res= sword.getLastSword(head);
	System.out.println();
	System.out.println(res.data);
	
	
}
}
