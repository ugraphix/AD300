
// Java program to demonstrate insert operation in binary search tree
public class BinarySearchTree {
	
	/* Class containing left and right child of current node and key value */
	class Node {
		public int key;
		Node left, right;
		

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	// Root of BST
	Node root;
	
	  
	    /* Helper function for getLevel().  It returns level of the data
	    if data is present in tree, otherwise returns 0.*/
	    int getLevelUtil(Node node, int value, int level) 
	    {
	        if (node == null)
	            return 0;
	  
	        if (node.key == value)
	            return level;
	  
	        int downlevel = getLevelUtil(node.left, value, level + 1);
	        if (downlevel != 0)
	            return downlevel;
	  
	        downlevel = getLevelUtil(node.right, value, level + 1);
	        return downlevel;
	    }
	  
	    /* Returns level of given data value */
	    int getLevel(Node node, int data) 
	    {
	        return getLevelUtil(node, data, 1);
	    }

	/*// Constructor
	BinarySearchTree() {
		root = null;
	}*/

	// This method mainly calls insertRec()
	void insert(int key) {
		root = insertRec(root, key);
	}

	/* A recursive function to insert a new key in BST */
	Node insertRec(Node root, int key) {

		/* If the tree is empty, return a new node */
		if (root == null) {
			root = new Node(key);
			return root;
		}

		/* Otherwise, recur down the tree */
		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);

		/* return the (unchanged) node pointer */
		return root;
	}

	// This method mainly calls InorderRec()
	void inorder() {
		inorderRec(root);
	}

	// A utility function to do in order traversal of BST
	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}

	// Driver Program to test above functions
	public static void main(String[] args) {
		
		
		BinarySearchTree tree = new BinarySearchTree();
		
		/*
		 * Let us create following BST 
		 * 
		 * 18, 14, 20, 22, 36, 57, 61, 21, 79, 60, 81, 95, 90.
		 */
		tree.insert(18);
		tree.insert(14);
		tree.insert(20);
		tree.insert(22);
		tree.insert(36);
		tree.insert(57);
		tree.insert(61);
		tree.insert(21);
		tree.insert(79);
		tree.insert(60);
		tree.insert(81);
		tree.insert(95);
		tree.insert(90);
		
		//tree.inorder();
		
		int[] nums = { 14, 95, 90, 35, 17, 63 };
		
		for (int x : nums) 
        {
            int level = tree.getLevel(tree.root, x);
            if (level != 0)
                System.out.println("Level of " + x + " is "
                        + tree.getLevel(tree.root, x));
            else
                System.out.println(x + " is not present in tree");
        }
	}
}
