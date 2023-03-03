// No extra memory should be used to reverse a linked list

class Node {
	String data;
	Node next;
	
	public Node(String val) {
		this.data = val;
		this.next = null;
	}
}

class LL {
	Node head;
	private int size;
	
	LL() {
		this.size = 0;
	}
	
	public void addLast(String data) {
		Node newNode = new Node(data);
		this.size++;
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		
		currNode.next = newNode;
	}
	
	// Reversing Iteratively
	public void reverseIteratively() {
		Node curr, prev = null;
		while(this.head != null) {
			curr = this.head;
			this.head = this.head.next;
			curr.next = prev;
			prev = curr;
		}
		this.head = prev;
	}
	
	// Reversing Recursively
	public Node reverseRecursively(Node curr) {
		if(curr == null || curr.next == null) {
			this.head = curr;
			return curr;
		}
		Node nextNode = reverseRecursively(curr.next);
		nextNode.next = curr;
		curr.next = null;
		return curr;
	}
	
	// print
	public void printList() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		
		System.out.println("NULL");
	}
	
	public int getSize() {
		return this.size;
	}
	
	public static void main (String[] args) {
		LL list = new LL();
		list.addLast("This");
		list.addLast("is");
		list.addLast("a");
		list.addLast("list");
		list.printList();
		list.reverseIteratively();
		list.printList();
		list.reverseRecursively(list.head);
		list.printList();
	}
}