
class Node
{
	char key;
	Node left, right;
	
	public Node(char item)
	{
	key = item;
	left = right = null;	
	}
}


public class TreeFromInOrderPreOrder {

	static int preIndex =0;
	
	Node buildTree(char[] pre, char[] in, int inStart, int inEnd)
	{
		if(inStart>inEnd)
		{
			return null;
		}
		Node head = new Node(pre[preIndex++]);
		if(inStart==inEnd)
		{
			return head;
		}
		int inIndex = searchIndex(inStart, inEnd, in, head.key);
		head.left = buildTree(pre,in,inStart, inIndex-1);
		head.right = buildTree(pre, in, inIndex+1, inEnd);
		return head;
	}
	
	int searchIndex(int inStart, int inEnd, char[] in, char key) {
		int i;
		for(i=inStart; i<inEnd; i++)
		{
			if(key==in[i])
				return i;
		}
		return i;
	}

	public static void main(String[] arg)
	{
		TreeFromInOrderPreOrder tree = new TreeFromInOrderPreOrder();
        char in[] = new char[]{'D', 'B', 'E', 'A', 'F', 'C'};
        char pre[] = new char[]{'A', 'B', 'D', 'E', 'C', 'F'};
        int len = in.length;
        Node n =tree.buildTree(pre, in, 0, len-1);
        tree.printInOrder(n);
	}

	private void printInOrder(Node n) {
		if(n==null)
			return;
		printInOrder(n.left);
		System.out.print(n.key+" ");
		printInOrder(n.right);
		
	}
}
