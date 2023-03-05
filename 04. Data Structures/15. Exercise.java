import java.util.Stack;

// Implement Queue using Stacks
class QueueUsingStacks {
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();
	
	public boolean isEmpty() {
		return s2.isEmpty();
	}
	
	public void add(int val) {
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		
		s1.push(val);
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
	}
	
	public int remove() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		return s2.pop();
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		return s2.peek();
	}
}

class QueueExercise {
	public static void main (String[] args) {
		QueueUsingStacks q = new QueueUsingStacks();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.remove();
		
		while(!q.isEmpty()) {
			System.out.println(q.peek()); // 2 3 4
			q.remove();
		}
	}
}