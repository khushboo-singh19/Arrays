

public class DeleteNode {

	Node head;
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
	
	public void push(int d)
	{
		Node new_node = new Node(d);
		new_node.next=head;
		head=new_node;
	}
	
	public void delNode(int key)
	{
		if(head==null)
			return;
		
		Node temp=head;
		if(key==0)
			head=temp.next;
		
		for(int i=0; i<key-1 && temp.next!= null; i++)
		{
			temp=temp.next;
		}
		if(temp==null || temp.next==null)
			return;
		
		temp.next=temp.next.next;		
	}
	
	void print()
	{
		Node temp=head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public static void main(String args[])
	{
		DeleteNode obj=new DeleteNode();
		obj.push(7);
		obj.push(1);
		obj.push(3);
		obj.push(2);
		obj.push(8);
		obj.delNode(4);
		obj.print();
	}
	
}
