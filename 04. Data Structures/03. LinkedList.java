// Properties on a Linked List

// Variable Size
// Non-contiguous Memory
// Insert in O(1)
// Search in O(n)

class Node {
	String data;
	Node next;
	
	Node(String data) {
		this.data = data;
		this.next = null;
	}
}

class LL {
	Node head;
	private int size;
	
	LL() {
		this.size = 0;
	}
	
	// add - first, last
	public void addFirst(String data) {
		Node newNode = new Node(data);
		this.size++;
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
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
	
	// delete first
	public void deleteFirst() {
		if(head == null) {
			System.out.println("The list is empty");
			return;
		}
		
		head = head.next;
		this.size--;
	}
	
	// delete last
	public void deleteLast() {
		if(head == null) {
			System.out.println("The list is empty");
			return;
		}
		this.size--;
		if(head.next == null) {
			head = null;
			return;
		}
		
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		
		secondLast.next = null;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public static void main (String[] args) {
		LL list = new LL();
		list.addFirst("a");
		list.addFirst("is");
		list.printList(); // is -> a -> NULL
		
		list.addLast("list");
		list.printList(); // is -> a -> list -> NULL
		
		list.addFirst("this");
		list.printList(); // this -> is -> a -> list -> NULL
		
		list.deleteFirst();
		list.printList(); // is -> a -> list -> NULL
		
		list.deleteLast();
		list.printList(); // is -> a -> NULL
		
		System.out.println(list.getSize()); // 2
		
		list.addFirst("this");
		System.out.println(list.getSize()); // 3
	}
}