import javax.xml.soap.Node;

//This class tells whether a linked list is a palindrome or not using recursion 
//and using function stack information
public class PalindromeRecurse {
	Node head;
	Node left;
	boolean isPalin=true;
	class Node
	{
		char data;
		Node next;
		Node(char data)
		{
			this.data=data;
			next=null;
		}
	}
	
	void push(char data)
	{		
		Node node= new Node(data);
		node.next=head;
		head=node;
	}
	
	boolean isPalindrome(Node head)
	{		
		return isPalindromeUtil(head);
	}
	
	boolean isPalindromeUtil(Node right)
	{
		left=head;
		if(right.next!=null)
		{
		isPalindromeUtil(right.next);			
		}
		if(left.data!=right.data) isPalin= false;
		else {
			left=left.next;	
		}
		return isPalin;
	}
	
	public static void main(String args[])
	{
		PalindromeRecurse palin=new PalindromeRecurse();
		char str[] = {'a', 'b', 'a', 'c', 'a', 'b', 'a'};
		for(int i=0; i<str.length; i++)
		{
			palin.push(str[i]);
			palin.isPalin=true;
			if(palin.isPalindrome(palin.head))
			{
				System.out.println("Is a palindrome");
			}
			else
			{
				System.out.println("Not a palindrome");
			}
			
		}
	}
}
