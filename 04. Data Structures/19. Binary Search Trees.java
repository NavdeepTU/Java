/* What is a BST ?
 * 
 * a. Binary Tree
 * b. Left Subtree Nodes < Root
 * c. Right Subtree Nodes > Root
 * d. Left and Right Subtrees are also BST with no duplicates
 *
 * Special Property
 *
 * Inorder Traversal of BST gives a sorted sequence
 *
 * BST makes search efficient -> O(h)
 *
 * Difference between Binary Trees and Binary Search Trees is same as difference between Linear Search and Binary Search.
 *
 * Strategy
 * 
 * Most problems will be solved using recursion i.e. by dividing into subproblems & making recursive calls on subtrees.
 *
 */
 
 class Node {
 	int data;
 	Node left;
 	Node right;
 	
 	Node(int data) {
 		this.data = data;
 		this.left = null;
 		this.right = null;
 	}
 }
 
 class BST {
 	
 	// Insert in a BST -> O(h)
 	public static Node insert(Node root, int val) {
 		if(root == null) {
 			root = new Node(val);
 			return root;
 		}
 		
 		if(root.data > val) {
 			// left subtree
 			root.left = insert(root.left, val);
 		} else {
 			// right subtree
 			root.right = insert(root.right, val);
 		}
 		
 		return root;
 	}
 	
 	public static void inorder(Node root) {
 		if(root == null) {
 			return;
 		}
 		
 		inorder(root.left);
 		System.out.print(root.data + " ");
 		inorder(root.right);
 	}
 	
 	// Search in a BST -> O(h)
 	public static boolean search(Node root, int key) {
 		
 		if(root == null) {
 			return false;
 		}
 		
 		if(root.data > key) { // left subtree
 			return search(root.left, key);
 		} else if(root.data == key) {
 			return true;
 		} else {
 			return search(root.right, key);
 		}
 	}
 	
 	// Delete a node from given BST -> Imp interview question
 	public static Node delete(Node root, int val) {
 		if(root.data > val) {
 			root.left = delete(root.left, val);
 		} else if(root.data < val) {
 			root.right = delete(root.right, val);
 		} else { // root.data == val
 			// case 1 : root is leaf node
 			if(root.left == null && root.right == null) {
 				return null;
 			}
 			
 			// case 2 : if root has one child
 			if(root.left == null) {
 				return root.right;
 			} else if(root.right == null) {
 				return root.left;
 			}
 			
 			// case 3 : root has 2 child
 			Node IS = inorderSuccessor(root.right); // Inorder successor always has 0 or 1 child
 			root.data = IS.data;
 			root.right = delete(root.right, IS.data);
 		}
 		
 		return root;
 	}
 	
 	public static Node inorderSuccessor(Node root) {
 		while(root.left != null) {
 			root = root.left;
 		}
 		return root;
 	}
 	
 	public static void main (String[] args) {
		int[] values = {8, 5, 3, 1, 4, 6, 10, 11, 14};
		Node root = null;
		
		for(int i=0; i<values.length; i++) {
			root = insert(root, values[i]);
		}
		
		inorder(root); // 1 3 4 5 6 8 10 11 14
		
		if(search(root, 7)) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
		
		delete(root, 5);
		inorder(root); // 1 3 4 6 8 10 11 14 
	}
 }