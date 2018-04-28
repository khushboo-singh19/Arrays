
public class Diameter {
	
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
		Diameter.root = new Node(1);
		Diameter.root.left=new Node(2);
		Diameter.root.right=new Node(3);
		Diameter.root.left.left=new Node(4);
		Diameter.root.left.right=new Node(5);
		int d=Diameter.findDiameter(root);
		System.out.println(d);
	}

	private static int findDiameter(Node node) {
		if(node==null) return 0;
		int h_left=0, h_right=0;
		h_left=height(node.left);
		h_right=height(node.right);
		int ldiameter=findDiameter(node.left);
		int rdiameter=findDiameter(node.right);
		return Math.max(h_left+h_right+1, Math.max(ldiameter, rdiameter));
	}

	private static int height(Node node) {
		if(node==null) return 0;
		
		return (1+Math.max(height(node.left), height(node.right)));
	}
}
