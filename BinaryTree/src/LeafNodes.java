

public class LeafNodes {
	static Node root;
	static class Node
	{
		int data;
		Node left, right;
		Node(int data)
		{
			this.data=data;
			left=right=null;			
		}
	}
	
	public static void main(String args[])
	{
		LeafNodes.root = new Node(1);
		LeafNodes.root.left=new Node(2);
		LeafNodes.root.right=new Node(3);
		LeafNodes.root.left.left=new Node(4);
		LeafNodes.root.left.right=new Node(5);
		LeafNodes.root.right.left=new Node(8);
		LeafNodes.root.right.right=new Node(9);
		int d=LeafNodes.leafNodes(root);
		System.out.println(d);
	}

	private static int leafNodes(Node node) {
		if(node==null) return 0;
		if(node.left==null&&node.right==null) return 1;
		return leafNodes(node.left)+leafNodes(node.right);
	}
}
