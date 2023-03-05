class Node {
	int data;
	Node next;
	
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class Queue {
	Node head = null;
	Node tail = null;
	
	Queue() {
		this.head = this.tail = null;
	}
	
	public boolean isEmpty() {
		return this.head == null && this.tail == null;
	}
	
	// enqueue
	public void add(int data) {
		Node newNode = new Node(data);
		if(this.tail == null) {
			tail = head = newNode;
			return;
		}
		
		tail.next = newNode;
		tail = newNode;
	}
	
	// dequeue
	public int remove() {
		if(isEmpty()) {
			System.out.println("empty queue");
			return -1;
		}
		
		int front = head.data;
		if(head == tail) {
			tail = null;
		}
		
		this.head = this.head.next;
		return front;
	}
	
	// peek
	public int peek() {
		if(isEmpty()) {
			System.out.println("empty queue");
			return -1;
		}
		
		return head.data;
	}
}

class QueueLL {
	public static void main (String[] args) {
		Queue q = new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek()); // 1 2 3 4 5
			q.remove();
		}
	}
}