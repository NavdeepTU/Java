// Hierarchial Data Structure
import java.util.Queue;
import java.util.LinkedList;

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

class TreeInfo {
	int ht;
	int diam;
	
	TreeInfo(int ht, int diam) {
		this.ht = ht;
		this.diam = diam;
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
	
	// Postorder Traversal -> O(n)
	public void postorder(Node root) {
		if(root == null) {
			return;
		}
		
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + " ");
	}
	
	// LevelOrder Traveral
	public void levelOrder(Node root) {
		if(root == null) {
			return;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			Node currNode = q.remove();
			if(currNode == null) {
				System.out.println();
				if(q.isEmpty()) {
					break;
				} else {
					q.add(null); // to add new line for next level
				}
			} else {
				System.out.print(currNode.data + " ");
				if(currNode.left != null) {
					q.add(currNode.left);
				}
				if(currNode.right != null) {
					q.add(currNode.right);
				}
			}
		}
	}
	
	// Count of Nodes -> O(n)
	public int countOfNodes(Node root) {
		if(root == null) {
			return 0;
		}
		
		int leftNodes = countOfNodes(root.left);
		int rightNodes = countOfNodes(root.right);
		
		return leftNodes + rightNodes + 1;
	}
	
	// Sum of Nodes -> O(n)
	public int sumOfNodes(Node root) {
		if(root == null) {
			return 0;
		}
		
		int leftSum = sumOfNodes(root.left);
		int rightSum = sumOfNodes(root.right);
		
		return leftSum + rightSum + root.data;
	}
	
	// Height of a Tree -> O(n)
	public int height(Node root) {
		if(root == null) {
			return 0;
		}
		
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		return Math.max(leftHeight, rightHeight) + 1;
	}
	
	// Diameter of a Binary Tree -> O(n^2)
	public int diameter(Node root) {
		if(root == null) {
			return 0;
		}
		int diam1 = diameter(root.left);
		int diam2 = diameter(root.right);
		int diam3 = height(root.left) + height(root.right) + 1;
		
		return Math.max(Math.max(diam1, diam2), diam3);
	}
	
	// Diameter of a Binary Tree -> O(n)
	public TreeInfo diameter2(Node root) {  // need to return height and diameter of a node, so returning them in the form of TreeInfo object
		if(root == null) {
			return new TreeInfo(0, 0);
		}
		
		TreeInfo left = diameter2(root.left);
		TreeInfo right = diameter2(root.right);
		
		int myHeight = Math.max(left.ht, right.ht) + 1;
		
		int diam1 = left.diam;
		int diam2 = right.diam;
		int diam3 = left.ht + right.ht + 1; // Not calculating height again, this makes this function O(n)
		
		int mydiam = Math.max(Math.max(diam1, diam2), diam3);
		
		TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
		return myInfo;
	}
}

class BinaryTreeMain {
	public static void main (String[] args) {
		int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; // stored in preorder fashion
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		System.out.println(root.data); // 1
		tree.preorder(root); // 1 2 4 5 3 6
		System.out.println();
		tree.inorder(root); // 4 2 5 1 3 6
		System.out.println();
		tree.postorder(root); // 4 5 2 6 3 1 
		System.out.println();
		tree.levelOrder(root);
		// 1 
		// 2 3 
		// 4 5 6 
		System.out.println(tree.countOfNodes(root)); // 6
		System.out.println(tree.sumOfNodes(root)); // 21
		System.out.println(tree.height(root)); // 3
		System.out.println(tree.diameter(root)); // 5
		System.out.println(tree.diameter2(root).diam); // 5
	}
}