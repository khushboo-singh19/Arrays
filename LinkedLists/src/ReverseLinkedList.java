
public class ReverseLinkedList {
	static Node head;
	private static class Node
	{
		int data;		
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	Node reverse(Node node)
	{
		Node curr, prev, next;
		prev=node;		
		curr=prev.next;
		node.next=null;
		while(curr.next!=null)
		{
		next=curr.next;
		curr.next=prev;		
		prev=curr;
		curr=next;
		}
		curr.next=prev;
		return curr;
	}

	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
         
        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }

	private void printList(Node node) {
		while(node!=null)
		{
			System.out.print(node.data+ " ");
			node=node.next;
		}
		
	}
}
