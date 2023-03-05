// FIFO -> First In First Out

// Eg - Queue of childran

// Enqueue -> Add O(1)
// Dequeue -> Remove O(1)
// Front -> Peek (similar to top in stack) O(1)

// Implementation -> Using Array (Circular Queue), 

// Using Array (Circulr Queue)

class Queue {
	int[] arr;
	int size;
	int front = -1;
	int rear = -1;
	
	Queue(int n) {
		arr = new int[n];
		this.size = n;
	}
	
	public boolean isEmpty() {
		return this.front == -1 && this.rear == -1;
	}
	
	public boolean isFull() {
		return (this.rear + 1) % size == this.front;
	}
	
	// enqueue
	public void add(int data) {
		if(this.isFull()) {
			System.out.println("full queue");
			return;
		}
		
		// 1st element add
		if(this.front == -1) {
			this.front = 0;
		}
		
		this.rear = (this.rear + 1) % size;
		arr[rear] = data;
	}
	
	// dequeue
	public int remove() {
		if(this.isEmpty()) {
			System.out.println("empty queue");
			return -1;
		}
		
		int result = arr[this.front];
		
		// single element condition
		if(this.rear == this.front) {
			this.rear = this.front = -1;
		} else {
			this.front = (this.front + 1) % size;
		}
		
		return result;
	}
	
	// peek
	public int peek() {
		if(this.isEmpty()) {
			System.out.println("empty queue");
			return -1;
		}
		
		return arr[this.front];
	}
}

class QueueClass {
	public static void main (String[] args) {
		Queue q = new Queue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(q.remove()); // 1
		q.add(6);
		System.out.println(q.remove()); // 2
		q.add(7);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek()); // 3 4 5 6 7
			q.remove();
		}
	}
}