
public class Flattening {
	Node head;
	
	class Node
	{
		Node next, down;
		int data;
		Node(int data)
		{
			this.data=data;
			next=down=null;
		}
	}

	Node push(Node head_ref, int data)
	{
		Node new_node=new Node(data);
		new_node.down=head_ref;
		head_ref=new_node;
		return head_ref;
	}
	
	public Node flatten(Node root)
	{
		if(root==null|| root.next==null) return root;
		
		root.next=flatten(root.next);
		
		root=merge(root,root.next);
			
		return root;
	}
	
	public Node merge(Node a, Node b)
	{
		if(a==null) return b;
		if(b==null) return a;
		
		Node result;
		if(a.data>b.data)
		{
			result=b;
			result.down=merge(a,b.down);
		}
		else
		{
			result=a;
			result.down=merge(a.down, b);
		}
		return result;
	}
	
	public void print(Node node)
	{
		while(node!=null)
		{
			System.out.print(node.data+" ");
			node=node.down;
		}
	}
	public static void main(String args[])
	{
		Flattening f=new Flattening();
		f.head=f.push(f.head, 30);
		f.head=f.push(f.head, 8);
		f.head=f.push(f.head, 7);
		f.head=f.push(f.head, 5);
		
		f.head.next=f.push(f.head.next, 20);
		f.head.next=f.push(f.head.next, 10);
		
		f.head.next.next=f.push(f.head.next.next, 50);
		f.head.next.next=f.push(f.head.next.next, 22);
		f.head.next.next=f.push(f.head.next.next, 19);
		
		f.head.next.next.next=f.push(f.head.next.next.next, 45);
		f.head.next.next.next=f.push(f.head.next.next.next, 40);
		f.head.next.next.next=f.push(f.head.next.next.next, 35);
		f.head.next.next.next=f.push(f.head.next.next.next, 28);
		
		Node res=f.flatten(f.head);
		
		f.print(res);
		
		
		
	}
}
