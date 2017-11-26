import java.util.Stack;

public class Project8 {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree(); 
		BinaryTree.TreeNode root = new BinaryTree.TreeNode("68"); 
		bt.root = root; bt.root.left = new BinaryTree.TreeNode("4"); 
		bt.root.left.left = new BinaryTree.TreeNode("3"); 
		bt.root.left.right = new BinaryTree.TreeNode("235"); 
		bt.root.right = new BinaryTree.TreeNode("567"); 
		bt.root.right.right = new BinaryTree.TreeNode("0"); 
		
		// printing nodes in recursive preOrder traversal algorithm 
		bt.preOrder(); System.out.println(); 
		
		// traversing binary tree in PreOrder without using recursion 
		bt.preOrderWithoutRecursion(); } 

		
			
			
	}

class BinaryTree { public TreeNode root;

static class TreeNode { String data; TreeNode left, right; TreeNode(String value) { 
	this.data = value; left = right = null; 
	} 
boolean isLeaf() { 
	return left == null ? right == null : false; 
	} 
}




//root of binary tree TreeNode root--Java method to print tree nodes in PreOrder traversal
public void preOrder() { preOrder(root); 
} 

// traverse the binary tree in preOrder 
private void preOrder(TreeNode node) { 
	if (node == null) { 
		return; 
		} 
	System.out.printf("%s ", node.data); 
	preOrder(node.left); 
	preOrder(node.right); 
	} 

//Java method to visit tree nodes in preOrder

public void preOrderWithoutRecursion() { 
	Stack<TreeNode> nodes = new Stack<>(); 
	nodes.push(root); 
	while (!nodes.isEmpty()) { 
		TreeNode current = nodes.pop(); 
		System.out.printf("%s ", current.data); 
		if (current.right != null) { nodes.push(current.right); 
		} 
		if (current.left != null) { 
			nodes.push(current.left); 
			} 
		} 
	}




}
