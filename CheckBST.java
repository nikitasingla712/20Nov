public class CheckBST
{ 
	 static class Node 
	{ 
		int data; 
		Node left, right; 

		public Node(int item) 
		{ 
			data = item; 
			left = right = null; 
		} 
	} 
	Node root; 
	boolean isBST() { 
		return isBST(root, Integer.MIN_VALUE, 
							Integer.MAX_VALUE); 
	} 
	boolean isBST(Node node, int min, int max) 
	{ 
		if (node == null) 
			return true; 
		if (node.data < min || node.data > max) 
			return false; 
		return (isBST(node.left, min, node.data-1) && isBST(node.right, node.data+1, max)); 
	} 
	public static void main(String args[]) 
	{ 
		CheckBST BST = new CheckBST(); 
		BST.root = new Node(3); 
		BST.root.left = new Node(1); 
		BST.root.right = new Node(7); 
		BST.root.left.left = new Node(5); 
		BST.root.left.right = new Node(9); 
		if (BST.isBST()) 
			System.out.println("The Given Binary Tree is BST"); 
		else
			System.out.println("The Given Binary Tree is not a BST"); 
	} 
} 