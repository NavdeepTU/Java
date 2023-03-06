// Hierarchial Data Structure

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

class BinaryTree {
	int idx = -1;
	public Node buildTree(int[] nodes) {
		idx++;
		if(nodes[idx] == -1) {
			return null;
		}
		
		Node newNode = new Node(nodes[idx]);
		newNode.left = buildTree(nodes);
		newNode.right = buildTree(nodes);
		
		return newNode;
	}
	
	// Preorder Traversal -> O(n)
	public void preorder(Node root) {
		if(root == null) {
			return;
		}
		
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}
	
	// Inorder Traversal -> O(n)
	public void inorder(Node root) {
		if(root == null) {
			return;
		}
		
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
}

class BinaryTreeMain {
	public static void main (String[] args) {
		int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; // stored in preorder fashion
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		System.out.println(root.data); // 1
		tree.preorder(root); // 1 2 4 5 3 6
		tree.inorder(root); // 4 2 5 1 3 6
	}
}